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
import org.odftoolkit.odfdom.doc.table.OdfTableRow;
import org.odftoolkit.odfdom.dom.element.style.StyleMasterPageElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.style.props.OdfPageLayoutProperties;
import org.odftoolkit.odfdom.dom.style.props.OdfTableCellProperties;
import org.odftoolkit.odfdom.dom.style.props.OdfTableColumnProperties;
import org.odftoolkit.odfdom.dom.style.props.OdfTableRowProperties;
import org.odftoolkit.odfdom.incubator.doc.office.OdfOfficeStyles;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStyle;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStylePageLayout;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.utils.column.BooleanEcoreColumn;
import org.openscada.deploy.iolist.utils.column.BooleanMonitorColumn;
import org.openscada.deploy.iolist.utils.column.ColumnWriter;
import org.openscada.deploy.iolist.utils.column.LevelMonitorColumn;
import org.openscada.deploy.iolist.utils.column.ListMonitorColumn;
import org.openscada.deploy.iolist.utils.column.OptionalNumericColumn;
import org.openscada.deploy.iolist.utils.column.OptionalTextColumn;
import org.openscada.deploy.iolist.utils.column.TextColumn;
import org.openscada.deploy.iolist.utils.column.TextEcoreColumn;
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
        this.columns.add ( new BooleanEcoreColumn ( "DEFAULT_CHAIN", ModelPackage.Literals.ITEM__DEFAULT_CHAIN ) );

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
        this.columns.add ( new ListMonitorColumn ( "LIST_MONITOR" ) );

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
        processHeader ( sheet );

        int row = 1;
        for ( final Item item : this.items )
        {
            processItem ( sheet, item, row );

            row++;
        }

        return output;
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

        final StyleMasterPageElement defaultPage = output.getOfficeMasterStyles ().getMasterPage ( "Default" );

        final OdfStylePageLayout pageLayout = defaultPage.getAutomaticStyles ().getPageLayout ( defaultPage.getStylePageLayoutNameAttribute () );
        pageLayout.setProperty ( OdfPageLayoutProperties.PrintOrientation, "landscape" );
        pageLayout.setProperty ( OdfPageLayoutProperties.PageHeight, "210mm" );
        pageLayout.setProperty ( OdfPageLayoutProperties.PageWidth, "297mm" );
        pageLayout.setProperty ( OdfPageLayoutProperties.NumFormat, "1" );

        output.setLocale ( Locale.ENGLISH );
        output.getOfficeMetadata ().setCreator ( "openSCADA Configurator" );
        output.getOfficeMetadata ().setGenerator ( "openSCADA Configurator" );
        output.getOfficeMetadata ().setTitle ( "IO List" );

    }

    private void processItem ( final OdfTable sheet, final Item item, final int rowIndex )
    {
        final OdfTableRow row = sheet.getRowByIndex ( 0 );
        row.setUseOptimalHeight ( true );

        int i = 0;

        for ( final ColumnWriter column : this.columns )
        {
            column.writeItem ( sheet, rowIndex, i, item );
            i++;
        }
    }

    private void processHeader ( final OdfTable sheet )
    {
        final OdfTableRow row = sheet.getRowByIndex ( 0 );
        row.setUseOptimalHeight ( true );

        int i = 0;

        for ( final ColumnWriter column : this.columns )
        {
            column.writeHeader ( sheet, i );
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
