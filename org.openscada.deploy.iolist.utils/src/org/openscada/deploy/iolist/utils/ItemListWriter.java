package org.openscada.deploy.iolist.utils;

import java.io.File;
import java.io.OutputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.common.util.EList;
import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.odftoolkit.odfdom.dom.element.style.StyleMasterPageElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.style.props.OdfPageLayoutProperties;
import org.odftoolkit.odfdom.dom.style.props.OdfTableCellProperties;
import org.odftoolkit.odfdom.dom.style.props.OdfTableColumnProperties;
import org.odftoolkit.odfdom.dom.style.props.OdfTableRowProperties;
import org.odftoolkit.odfdom.incubator.doc.office.OdfOfficeStyles;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStyle;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStylePageLayout;
import org.openscada.ae.monitor.datasource.common.ListSeverity;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.utils.column.BooleanEcoreColumn;
import org.openscada.deploy.iolist.utils.column.BooleanMonitorColumn;
import org.openscada.deploy.iolist.utils.column.ColumnWriter;
import org.openscada.deploy.iolist.utils.column.LevelMonitorColumn;
import org.openscada.deploy.iolist.utils.column.ListMonitorAckColumn;
import org.openscada.deploy.iolist.utils.column.ListMonitorSeverityColumn;
import org.openscada.deploy.iolist.utils.column.NumericEcoreColumn;
import org.openscada.deploy.iolist.utils.column.OptionalNumericColumn;
import org.openscada.deploy.iolist.utils.column.OptionalTextColumn;
import org.openscada.deploy.iolist.utils.column.TextColumn;
import org.openscada.deploy.iolist.utils.column.TextEcoreColumn;
import org.openscada.deploy.iolist.utils.column.TypeColumnWriter;
import org.w3c.dom.Node;

// TODO: add auto filter
// TODO: add header & footer
// TODO: add print zoom factor
// TODO: add disabled style
public class ItemListWriter
{
    private final List<Item> items = new LinkedList<Item> ();

    private final List<ColumnWriter> columns = new LinkedList<ColumnWriter> ();

    private void setupColumns ( final int maxLevel )
    {
        this.columns.add ( new TypeColumnWriter ( "TYPE" ) );
        this.columns.add ( new TextEcoreColumn ( "CONNECTION", ModelPackage.Literals.ITEM__DEVICE ) );
        this.columns.add ( new TextEcoreColumn ( "SOURCE_NAME", ModelPackage.Literals.ITEM__NAME ) );

        this.columns.add ( new TextColumn ( "DATA_TYPE" ) {
            @Override
            protected String getValue ( final Item item )
            {
                return item.getDataType () == null ? null : item.getDataType ().toString ();
            }
        } );
        this.columns.add ( new TextEcoreColumn ( "UNIT", ModelPackage.Literals.ITEM__UNIT ) );
        this.columns.add ( new TextEcoreColumn ( "DESCRIPTION", ModelPackage.Literals.ITEM__DESCRIPTION ) );
        this.columns.add ( new NumericEcoreColumn ( "ATTR_SUM_LEVEL", ModelPackage.Literals.ITEM__ATTRIBUTE_SUMMARY_LEVEL ) );

        this.columns.add ( new TextEcoreColumn ( "SYSTEM", ModelPackage.Literals.ITEM__SYSTEM ) );
        this.columns.add ( new TextEcoreColumn ( "ALIAS", ModelPackage.Literals.ITEM__ALIAS ) );

        for ( int i = 0; i < maxLevel; i++ )
        {
            final int level = i;
            this.columns.add ( new TextColumn ( "LEVEL_" + i ) {

                @Override
                protected String getValue ( final Item item )
                {
                    if ( level >= item.getHierarchy ().size () )
                    {
                        return null;
                    }
                    return item.getHierarchy ().get ( level );
                }

            } );
        }

        this.columns.add ( new LevelMonitorColumn ( "MIN", ModelPackage.Literals.ITEM__LOCAL_MIN ) );
        this.columns.add ( new LevelMonitorColumn ( "MAX", ModelPackage.Literals.ITEM__LOCAL_MAX ) );
        this.columns.add ( new LevelMonitorColumn ( "LIMIT_LL", ModelPackage.Literals.ITEM__LOCAL_LOW_LOW ) );
        this.columns.add ( new LevelMonitorColumn ( "LIMIT_L", ModelPackage.Literals.ITEM__LOCAL_LOW ) );
        this.columns.add ( new LevelMonitorColumn ( "LIMIT_H", ModelPackage.Literals.ITEM__LOCAL_HIGH ) );
        this.columns.add ( new LevelMonitorColumn ( "LIMIT_HH", ModelPackage.Literals.ITEM__LOCAL_HIGH_HIGH ) );

        this.columns.add ( new BooleanMonitorColumn ( "MONITOR_BOOL", ModelPackage.Literals.ITEM__LOCAL_BOOLEAN_MONITOR ) );
        // this.columns.add ( new ListMonitorColumn ( "LIST_MONITOR" ) );
        for ( final ListSeverity severity : ListSeverity.values () )
        {
            this.columns.add ( new ListMonitorSeverityColumn ( "LIST_MONITOR_" + severity, severity ) );
        }
        this.columns.add ( new ListMonitorAckColumn ( "LIST_MONITOR_ACK", true ) );
        this.columns.add ( new ListMonitorAckColumn ( "LIST_MONITOR_NAK", false ) );

        this.columns.add ( new BooleanEcoreColumn ( "REMOTE_MIN", ModelPackage.Literals.ITEM__REMOTE_MIN ) );
        this.columns.add ( new BooleanEcoreColumn ( "REMOTE_MAX", ModelPackage.Literals.ITEM__REMOTE_MAX ) );

        this.columns.add ( new BooleanEcoreColumn ( "REMOTE_LL", ModelPackage.Literals.ITEM__REMOTE_LOW_LOW ) );
        this.columns.add ( new BooleanEcoreColumn ( "REMOTE_L", ModelPackage.Literals.ITEM__REMOTE_LOW ) );
        this.columns.add ( new BooleanEcoreColumn ( "REMOTE_H", ModelPackage.Literals.ITEM__REMOTE_HIGH ) );
        this.columns.add ( new BooleanEcoreColumn ( "REMOTE_HH", ModelPackage.Literals.ITEM__REMOTE_HIGH_HIGH ) );

        this.columns.add ( new BooleanEcoreColumn ( "REMOTE_BOOL", ModelPackage.Literals.ITEM__REMOTE_BOOL ) );
        this.columns.add ( new TextColumn ( "REMOTE_BOOL_ACK_VALUE" ) {
            @Override
            protected String getValue ( final Item item )
            {
                final Boolean ackValue = item.getRemoteBoolAckValue ();
                if ( ackValue != null )
                {
                    return ackValue ? "+" : "-";
                }
                return null;
            }
        } );

        this.columns.add ( new BooleanEcoreColumn ( "REMOTE_MANUAL", ModelPackage.Literals.ITEM__REMOTE_MANUAL ) );

        this.columns.add ( new BooleanEcoreColumn ( "EVENT_WRITE", ModelPackage.Literals.ITEM__EVENT_COMMAND ) );
        this.columns.add ( new BooleanEcoreColumn ( "MANUAL", ModelPackage.Literals.ITEM__REMOTE_MANUAL ) );
        this.columns.add ( new OptionalNumericColumn ( "LOCAL_SCALE_FACTOR" ) {

            @Override
            protected boolean isAvailale ( final Item item )
            {
                return item.isLocalScaleAvailable ();
            }

            @Override
            protected Double getValue ( final Item item )
            {
                return item.getLocalScaleFactor ();
            }
        } );
        this.columns.add ( new OptionalNumericColumn ( "LOCAL_SCALE_OFFSET" ) {

            @Override
            protected boolean isAvailale ( final Item item )
            {
                return item.isLocalScaleAvailable ();
            }

            @Override
            protected Double getValue ( final Item item )
            {
                return item.getLocalScaleOffset ();
            }
        } );

        this.columns.add ( new OptionalTextColumn ( "ROUNDING" ) {

            @Override
            protected boolean isAvailale ( final Item item )
            {
                return item.isRoundingAvailable ();
            }

            @Override
            protected String getValue ( final Item item )
            {
                return item.getRoundingValue () == null ? null : item.getRoundingValue ().toString ();
            }
        } );

        this.columns.add ( new BooleanEcoreColumn ( "EXCLUDE_SUMMARY", ModelPackage.Literals.ITEM__IGNORE_SUMMARY ) );
        this.columns.add ( new BooleanEcoreColumn ( "BLOCK", ModelPackage.Literals.ITEM__BLOCK ) );

        this.columns.add ( new TextEcoreColumn ( "HD_STORAGE", ModelPackage.Literals.ITEM__HD_STORAGE ) );

        this.columns.add ( new TextColumn ( "DATA_MAPPER" ) {
            @Override
            protected String getValue ( final Item item )
            {
                final EList<Mapper> mapper = item.getMapper ();
                if ( mapper == null )
                {
                    return null;
                }
                if ( mapper.isEmpty () )
                {
                    return null;
                }
                if ( mapper.size () > 1 )
                {
                    throw new IllegalStateException ( "Mapper contains more than one entry. This can not be serialzed into spreadsheets" );
                }

                final Mapper m = mapper.get ( 0 );
                if ( m.getFromAttribute () == null )
                {
                    m.setFromAttribute ( "" );
                }
                if ( m.getToAttribute () == null )
                {
                    m.setToAttribute ( "" );
                }

                return String.format ( "%s:%s/%s", m.getMapperId (), m.getFromAttribute (), m.getToAttribute () );

            }
        } );

        this.columns.add ( new TextEcoreColumn ( "SIMULATION_VALUE", ModelPackage.Literals.ITEM__SIMULATION_VALUE ) );
        this.columns.add ( new TextEcoreColumn ( "DEFAULT_DEMOTE", ModelPackage.Literals.ITEM__DEFAULT_MONITOR_DEMOTE ) );
    }

    public ItemListWriter add ( final Item item )
    {
        this.items.add ( item );
        return this;
    }

    public ItemListWriter addAll ( final Collection<Item> items )
    {
        this.items.addAll ( items );
        return this;
    }

    public void write ( final File file ) throws Exception
    {
        final OdfSpreadsheetDocument output = process ();
        output.save ( file );
    }

    public void write ( final OutputStream stream ) throws Exception
    {
        final OdfSpreadsheetDocument output = process ();
        output.save ( stream );
    }

    /**
     * Convert to Spreadsheet
     * 
     * @throws Exception
     */
    private OdfSpreadsheetDocument process () throws Exception
    {
        setupColumns ( findMaxLevel () );

        final OdfSpreadsheetDocument output = OdfSpreadsheetDocument.newSpreadsheetDocument ();

        cleanDocument ( output );
        setupDocument ( output );

        final OdfTable sheet = OdfTable.newTable ( output );
        sheet.setTableName ( "Items" );

        cleanSheet ( sheet );

        processHeader ( output, sheet );

        int row = 1;
        for ( final Item item : this.items )
        {
            processItem ( output, sheet, item, row );

            row++;
        }

        return output;
    }

    private void cleanSheet ( final OdfTable sheet )
    {
        removeChilds ( sheet.getOdfElement () );
    }

    private int findMaxLevel ()
    {
        int max = 0;
        for ( final Item item : this.items )
        {
            max = Math.max ( max, item.getHierarchy ().size () );
        }
        return max;
    }

    private void setupDocument ( final OdfSpreadsheetDocument output )
    {
        final OdfOfficeStyles styles = output.getOrCreateDocumentStyles ();

        final OdfStyle alarmStyle = styles.newStyle ( "Alarm", OdfStyleFamily.TableCell );
        alarmStyle.setProperty ( OdfTableCellProperties.BackgroundColor, "#FF0000" );

        final OdfStyle columnStyle = styles.newStyle ( "Default", OdfStyleFamily.TableColumn );
        columnStyle.setProperty ( OdfTableColumnProperties.UseOptimalColumnWidth, "true" );

        final OdfStyle rowStyle = styles.newStyle ( "Default", OdfStyleFamily.TableRow );
        rowStyle.setProperty ( OdfTableRowProperties.UseOptimalRowHeight, "true" );

        // set page style
        final StyleMasterPageElement defaultPage = output.getOfficeMasterStyles ().getMasterPage ( "Default" );
        final OdfStylePageLayout pageLayout = defaultPage.getAutomaticStyles ().getPageLayout ( defaultPage.getStylePageLayoutNameAttribute () );
        pageLayout.setProperty ( OdfPageLayoutProperties.PrintOrientation, "landscape" );
        pageLayout.setProperty ( OdfPageLayoutProperties.PageHeight, "210mm" );
        pageLayout.setProperty ( OdfPageLayoutProperties.PageWidth, "297mm" );
        pageLayout.setProperty ( OdfPageLayoutProperties.NumFormat, "1" );

        // set locale
        output.setLocale ( Locale.ENGLISH );

        // set metadata
        output.getOfficeMetadata ().setCreator ( "openSCADA Configurator" );
        output.getOfficeMetadata ().setGenerator ( "openSCADA Configurator" );
        output.getOfficeMetadata ().setTitle ( "IO List" );

    }

    private void processItem ( final OdfSpreadsheetDocument output, final OdfTable sheet, final Item item, final int rowIndex ) throws Exception
    {
        final TableTableElement sheetElement = sheet.getOdfElement ();

        final TableTableRowElement row = new TableTableRowElement ( output.getContentDom () );
        sheetElement.appendChild ( row );

        row.setProperty ( OdfTableRowProperties.UseOptimalRowHeight, String.valueOf ( true ) );

        int i = 0;

        for ( final ColumnWriter column : this.columns )
        {
            column.writeItem ( output, row, rowIndex, i, item );
            i++;
        }
    }

    private void processHeader ( final OdfSpreadsheetDocument output, final OdfTable sheet ) throws Exception
    {
        final TableTableElement sheetElement = sheet.getOdfElement ();

        final TableTableRowElement row = new TableTableRowElement ( output.getContentDom () );
        sheetElement.appendChild ( row );

        row.setProperty ( OdfTableRowProperties.UseOptimalRowHeight, String.valueOf ( true ) );

        int i = 0;

        for ( final ColumnWriter column : this.columns )
        {
            column.writeHeader ( output, row, i );
            i++;
        }
    }

    private void removeChilds ( final Node node )
    {
        Node childNode = node.getFirstChild ();
        while ( childNode != null )
        {
            node.removeChild ( childNode );
            childNode = node.getFirstChild ();
        }
    }

    private void cleanDocument ( final OdfSpreadsheetDocument officeSpreadsheet ) throws Exception
    {
        removeChilds ( officeSpreadsheet.getContentRoot () );
    }
}
