package org.openscada.deploy.iolist.utils;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowElement;
import org.odftoolkit.odfdom.incubator.doc.text.OdfWhitespaceProcessor;
import org.openscada.ae.monitor.datasource.common.ListSeverity;
import org.openscada.deploy.iolist.model.BooleanMonitor;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.Monitor;
import org.openscada.deploy.iolist.model.Rounding;
import org.openscada.deploy.iolist.utils.column.BooleanColumnReader;
import org.openscada.deploy.iolist.utils.column.BooleanEcoreColumnReader;
import org.openscada.deploy.iolist.utils.column.ColumnReader;
import org.openscada.deploy.iolist.utils.column.IntEcoreColumnReader;
import org.openscada.deploy.iolist.utils.column.LevelColumnReader;
import org.openscada.deploy.iolist.utils.column.LevelMonitorColumnReader;
import org.openscada.deploy.iolist.utils.column.ListMonitorAckColumnReader;
import org.openscada.deploy.iolist.utils.column.ListMonitorSeverityColumnReader;
import org.openscada.deploy.iolist.utils.column.MonitorColumnReader;
import org.openscada.deploy.iolist.utils.column.NumericColumnReader;
import org.openscada.deploy.iolist.utils.column.TextColumnReader;
import org.openscada.deploy.iolist.utils.column.TextEcoreColumnReader;
import org.w3c.dom.Node;

public class ItemListReader
{
    private static final boolean DEBUG = false;

    private final OdfSpreadsheetDocument input;

    private final List<Item> items = new LinkedList<Item> ();

    private final Map<String, ColumnReader> readers = new HashMap<String, ColumnReader> ();

    private final String sourceName;

    public ItemListReader ( final File file ) throws Exception
    {
        this.input = OdfSpreadsheetDocument.loadDocument ( file );
        this.sourceName = file.getAbsolutePath ();

        process ();
    }

    public ItemListReader ( final InputStream inputStream, final String sourceName ) throws Exception
    {
        this.input = OdfSpreadsheetDocument.loadDocument ( inputStream );
        this.sourceName = sourceName;

        process ();
    }

    private void setup ( final int maxLevels )
    {
        // HIVE and CONNECTION are the same. We simply read HIVE for legacy purposes
        this.readers.put ( "CONNECTION", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__DEVICE ) );
        this.readers.put ( "HIVE", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__DEVICE ) );

        this.readers.put ( "SOURCE_NAME", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__NAME ) );

        this.readers.put ( "DATA_TYPE", new TextColumnReader () {

            @Override
            public void setValue ( final Item item, final String value )
            {
                if ( value != null && !value.isEmpty () )
                {
                    item.setDataType ( DataType.getByName ( value ) );
                }
            }

        } );

        this.readers.put ( "UNIT", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__UNIT ) );
        this.readers.put ( "DESCRIPTION", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__DESCRIPTION ) );
        this.readers.put ( "ATTR_SUM_LEVEL", new IntEcoreColumnReader ( ModelPackage.Literals.ITEM__ATTRIBUTE_SUMMARY_LEVEL, 0 ) );
        this.readers.put ( "SYSTEM", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__SYSTEM ) );
        this.readers.put ( "ALIAS", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__ALIAS ) );

        // the next two are for compatibility and will be mapped to "LEVEL_0" and "LEVEL_1"
        this.readers.put ( "LOCATION", new LevelColumnReader ( 0 ) );
        this.readers.put ( "COMPONENT", new LevelColumnReader ( 1 ) );

        for ( int i = 0; i <= maxLevels; i++ )
        {
            this.readers.put ( "LEVEL_" + i, new LevelColumnReader ( i ) );
        }

        this.readers.put ( "MIN", new LevelMonitorColumnReader ( ModelPackage.Literals.ITEM__LOCAL_MIN ) );
        this.readers.put ( "MAX", new LevelMonitorColumnReader ( ModelPackage.Literals.ITEM__LOCAL_MAX ) );

        this.readers.put ( "LIMIT_HH", new LevelMonitorColumnReader ( ModelPackage.Literals.ITEM__LOCAL_HIGH_HIGH ) );
        this.readers.put ( "LIMIT_H", new LevelMonitorColumnReader ( ModelPackage.Literals.ITEM__LOCAL_HIGH ) );
        this.readers.put ( "LIMIT_L", new LevelMonitorColumnReader ( ModelPackage.Literals.ITEM__LOCAL_LOW ) );
        this.readers.put ( "LIMIT_LL", new LevelMonitorColumnReader ( ModelPackage.Literals.ITEM__LOCAL_LOW_LOW ) );

        this.readers.put ( "MONITOR_BOOL", new MonitorColumnReader ( ModelPackage.Literals.ITEM__LOCAL_BOOLEAN_MONITOR, ModelPackage.Literals.BOOLEAN_MONITOR ) {
            @Override
            protected void readMonitor ( final Item item, final Monitor monitor, final Cell cell )
            {
                cell.getText ();
                ( (BooleanMonitor)monitor ).setOkValue ( BooleanColumnReader.makeBoolean ( cell, true ) );
            }
        } );

        for ( final ListSeverity severity : ListSeverity.values () )
        {
            this.readers.put ( "LIST_MONITOR_" + severity, new ListMonitorSeverityColumnReader ( severity ) );
        }
        this.readers.put ( "LIST_MONITOR_ACK", new ListMonitorAckColumnReader ( true ) );
        this.readers.put ( "LIST_MONITOR_NAK", new ListMonitorAckColumnReader ( false ) );

        this.readers.put ( "REMOTE_MIN", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_MIN ) );
        this.readers.put ( "REMOTE_MAX", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_MAX ) );

        this.readers.put ( "REMOTE_LL", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_LOW_LOW ) );
        this.readers.put ( "REMOTE_L", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_LOW ) );
        this.readers.put ( "REMOTE_H", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_HIGH ) );
        this.readers.put ( "REMOTE_HH", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_HIGH_HIGH ) );

        this.readers.put ( "REMOTE_BOOL", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_BOOL ) );
        this.readers.put ( "REMOTE_BOOL_ACK_VALUE", new BooleanColumnReader () {
            @Override
            public void setValue ( final Item item, final Boolean value )
            {
                item.setRemoteBoolAckValue ( value );
            }
        } );

        this.readers.put ( "REMOTE_MANUAL", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_MANUAL ) );

        this.readers.put ( "EVENT_WRITE", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__EVENT_COMMAND ) );
        this.readers.put ( "MANUAL", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__REMOTE_MANUAL ) );

        this.readers.put ( "LOCAL_SCALE_FACTOR", new NumericColumnReader () {

            @Override
            public void setValue ( final Item item, final Double value )
            {
                item.setLocalScaleAvailable ( true );
                item.setLocalScaleFactor ( value );
            }

            @Override
            public void handleError ( final Item item, final Cell cell )
            {
                if ( "X".equals ( cell.getText () ) )
                {
                    item.setLocalScaleAvailable ( true );
                }
            };
        } );

        this.readers.put ( "LOCAL_SCALE_OFFSET", new NumericColumnReader () {

            @Override
            public void setValue ( final Item item, final Double value )
            {
                item.setLocalScaleAvailable ( true );
                item.setLocalScaleOffset ( value );
            }

            @Override
            public void handleError ( final Item item, final Cell cell )
            {
                if ( "X".equals ( cell.getText () ) )
                {
                    item.setLocalScaleAvailable ( true );
                }
            };
        } );

        this.readers.put ( "ROUNDING", new TextColumnReader () {
            @Override
            public void setValue ( final Item item, final String value )
            {
                if ( value == null || value.isEmpty () )
                {
                    item.setRoundingAvailable ( false );
                }
                else
                {
                    item.setRoundingAvailable ( true );
                    item.setRoundingValue ( Rounding.getByName ( value ) );
                }
            }
        } );
        this.readers.put ( "EXCLUDE_SUMMARY", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__IGNORE_SUMMARY ) );
        this.readers.put ( "BLOCK", new BooleanEcoreColumnReader ( ModelPackage.Literals.ITEM__BLOCK ) );
        this.readers.put ( "HD_STORAGE", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__HD_STORAGE ) );

        final Pattern dataMapperPattern = Pattern.compile ( "(.*?):(.*?)/(.*?)" );

        this.readers.put ( "DATA_MAPPER", new TextColumnReader () {

            @Override
            public void setValue ( final Item item, final String stringValue )
            {
                if ( stringValue == null || stringValue.isEmpty () )
                {
                    return;
                }

                final Matcher m = dataMapperPattern.matcher ( stringValue );

                if ( m.matches () )
                {
                    final Mapper mapper = ModelFactory.eINSTANCE.createMapper ();

                    mapper.setMapperId ( m.group ( 1 ) );
                    mapper.setFromAttribute ( m.group ( 2 ) );
                    mapper.setToAttribute ( m.group ( 3 ) );

                    item.getMapper ().add ( mapper );
                }
            }
        } );

        this.readers.put ( "SIMULATION_VALUE", new TextEcoreColumnReader ( ModelPackage.Literals.ITEM__SIMULATION_VALUE ) );
    }

    private void process ()
    {
        for ( final OdfTable table : this.input.getTableList () )
        {
            loadTable ( this.sourceName, table );
        }
    }

    public void loadTable ( final String sourceName, final OdfTable table )
    {
        Map<Integer, String> header = new HashMap<Integer, String> ();

        int rowIndex = 0;

        for ( int i = 0; i < table.getOdfElement ().getChildNodes ().getLength (); i++ )
        {
            final Node node = table.getOdfElement ().getChildNodes ().item ( i );
            if ( node instanceof TableTableRowElement )
            {
                if ( DEBUG )
                {
                    System.out.println ( "Row: " + rowIndex );
                }

                if ( rowIndex == 0 )
                {
                    header = makeHeader ( loadRow ( (TableTableRowElement)node ) );
                    setup ( findMaxLevels ( header ) );
                }
                else
                {
                    handleRow ( sourceName, rowIndex, mapRow ( header, loadRow ( (TableTableRowElement)node ) ) );
                }
                rowIndex++;
            }
        }
    }

    private int findMaxLevels ( final Map<Integer, String> header )
    {
        int max = 0;

        for ( final String name : header.values () )
        {
            if ( !name.startsWith ( "LEVEL_" ) )
            {
                continue;
            }
            final int value = Integer.parseInt ( name.substring ( "LEVEL_".length () ) );
            max = Math.max ( max, value );
        }

        return max;
    }

    private void handleRow ( final String sourceName, final int rowIndex, final Map<String, Cell> row )
    {

        final EClass itemClass = makeItemClass ( row.get ( "TYPE" ) );

        final Item item = (Item)ModelFactory.eINSTANCE.create ( itemClass );

        item.setDebugInformation ( String.format ( "%s@%s", sourceName, rowIndex ) );

        for ( final Map.Entry<String, Cell> entry : row.entrySet () )
        {
            final ColumnReader reader = this.readers.get ( entry.getKey () );
            if ( reader != null )
            {
                reader.readItem ( item, entry.getValue () );
            }
        }

        if ( item.isEnabled () && item.getAlias () != null && !item.getAlias ().isEmpty () )
        {
            this.items.add ( item );
        }
    }

    private EClass makeItemClass ( final Cell cell )
    {
        if ( cell == null )
        {
            return ModelPackage.Literals.ITEM;
        }
        final String type = cell.getText ();
        if ( type == null || type.isEmpty () )
        {
            return ModelPackage.Literals.ITEM;
        }

        final EClass itemClass = (EClass)ModelPackage.eINSTANCE.getEClassifier ( type );
        if ( itemClass != null )
        {
            return itemClass;
        }

        throw new IllegalArgumentException ( String.format ( "Item type '%s' is unknown", type ) );
    }

    private Map<Integer, String> makeHeader ( final Map<Integer, Cell> headerRow )
    {
        final Map<Integer, String> result = new HashMap<Integer, String> ( headerRow.size () );

        for ( final Map.Entry<Integer, Cell> entry : headerRow.entrySet () )
        {
            result.put ( entry.getKey (), entry.getValue ().getText () );
        }

        return result;
    }

    public List<Item> getItems ()
    {
        return this.items;
    }

    private Map<Integer, Cell> loadRow ( final TableTableRowElement tableTableRowElement )
    {
        final Map<Integer, Cell> data = new HashMap<Integer, Cell> ();

        int col = 0;
        for ( int i = 0; i < tableTableRowElement.getChildNodes ().getLength (); i++ )
        {
            final Node node = tableTableRowElement.getChildNodes ().item ( i );
            if ( node instanceof TableTableCellElement )
            {
                if ( ( (TableTableCellElement)node ).getTableNumberColumnsRepeatedAttribute () != null )
                {
                    final int count = ( (TableTableCellElement)node ).getTableNumberColumnsRepeatedAttribute ();
                    for ( int j = 0; j < count; j++ )
                    {
                        data.put ( col + j, new Cell ( (TableTableCellElement)node, tableTableRowElement, null ) );
                        if ( DEBUG )
                        {
                            System.out.println ( col + j + " Value : " + new OdfWhitespaceProcessor ().getText ( node ) );
                        }
                    }
                    col += count;
                }
                else
                {
                    data.put ( col, new Cell ( (TableTableCellElement)node, tableTableRowElement, null ) );
                    if ( DEBUG )
                    {
                        System.out.println ( col + " Value : " + new OdfWhitespaceProcessor ().getText ( node ) );
                    }
                }
            }
        }

        return data;
    }

    private static Map<String, Cell> mapRow ( final Map<Integer, String> header, final Map<Integer, Cell> data )
    {
        final Map<String, Cell> row = new HashMap<String, Cell> ();

        for ( final Map.Entry<Integer, Cell> cell : data.entrySet () )
        {
            final String key = header.get ( cell.getKey () );
            if ( key != null )
            {
                row.put ( key, cell.getValue () );
            }
            else
            {
                row.put ( cell.getKey () + "", cell.getValue () );
            }
        }

        return row;
    }
}
