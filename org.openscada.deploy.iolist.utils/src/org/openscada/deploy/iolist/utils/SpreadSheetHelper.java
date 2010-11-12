package org.openscada.deploy.iolist.utils;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jxl.Cell;
import jxl.CellView;
import jxl.HeaderFooter;
import jxl.Sheet;
import jxl.SheetSettings;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Colour;
import jxl.format.PageOrientation;
import jxl.format.PaperSize;
import jxl.read.biff.BiffException;
import jxl.write.Blank;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.utils.str.StringHelper;

public class SpreadSheetHelper
{

    public static void writeSpreadsheet ( final String filename, final Collection<Item> items ) throws Exception
    {
        final File file = new File ( filename );

        final WorkbookSettings settings = new WorkbookSettings ();
        settings.setAutoFilterDisabled ( false );
        final WritableWorkbook workbook = Workbook.createWorkbook ( file, settings );
        final WritableSheet sheet = workbook.createSheet ( "IO-List", 0 );
        final SheetSettings sheetSettings = sheet.getSettings ();
        sheetSettings.setVerticalFreeze ( 1 );
        sheetSettings.setPrintTitlesRow ( 1, 1 );
        sheetSettings.setOrientation ( PageOrientation.LANDSCAPE );
        sheetSettings.setPaperSize ( PaperSize.A4 );
        sheetSettings.setFitWidth ( 1 );

        // set print margin
        sheetSettings.setLeftMargin ( 0.25 );
        sheetSettings.setRightMargin ( 0.25 );
        sheetSettings.setTopMargin ( 0.25 );
        sheetSettings.setBottomMargin ( 0.25 );

        // footer
        final HeaderFooter footer = new HeaderFooter ();
        footer.getRight ().append ( "Page: " );
        footer.getRight ().appendPageNumber ();
        footer.getRight ().append ( " of " );
        footer.getRight ().appendTotalPages ();

        sheetSettings.setFooterMargin ( 0.5 );
        sheetSettings.setFooter ( footer );

        for ( final Header header : Header.values () )
        {
            addHeaderCell ( sheet, header.toString (), header.ordinal () );
        }

        int row = 1;
        for ( final Item item : items )
        {
            addData ( sheet, row, Header.HIVE.ordinal (), item.getDevice () );
            addData ( sheet, row, Header.SOURCE_NAME.ordinal (), item.getName () );
            addData ( sheet, row, Header.DATA_TYPE.ordinal (), item.getDataType ().toString () );
            addData ( sheet, row, Header.UNIT.ordinal (), item.getUnit () );

            addData ( sheet, row, Header.DESCRIPTION.ordinal (), item.getDescription () );
            addData ( sheet, row, Header.SYSTEM.ordinal (), item.getSystem () );
            addData ( sheet, row, Header.LOCATION.ordinal (), item.getLocation () );
            addData ( sheet, row, Header.COMPONENT.ordinal (), item.getComponent () );
            addData ( sheet, row, Header.ALIAS.ordinal (), item.getAlias () );

            addFlag ( sheet, row, Header.DEFAULT_CHAIN.ordinal (), item.isDefaultChain (), false );

            addData ( sheet, row, Header.MIN.ordinal (), item.getLocalMin (), item.isLocalMinAck () );
            addData ( sheet, row, Header.MAX.ordinal (), item.getLocalMax (), item.isLocalMaxAck () );
            addSelectiveDataAck ( sheet, row, Header.LIMIT_HH.ordinal (), item.isLocalHighHighAvailable (), item.getLocalHighHighPreset (), item.isLocalHighHighAck () );
            addSelectiveDataAck ( sheet, row, Header.LIMIT_H.ordinal (), item.isLocalHighAvailable (), item.getLocalHighPreset (), item.isLocalHighAck () );
            addSelectiveDataAck ( sheet, row, Header.LIMIT_L.ordinal (), item.isLocalLowAvailable (), item.getLocalLowPreset (), item.isLocalLowAck () );
            addSelectiveDataAck ( sheet, row, Header.LIMIT_LL.ordinal (), item.isLocalLowLowAvailable (), item.getLocalLowLowPreset (), item.isLocalLowLowAck () );

            addFlag ( sheet, row, Header.EVENT_WRITE.ordinal (), item.isEventCommand (), false );
            addFlag ( sheet, row, Header.MANUAL.ordinal (), item.isLocalManual (), false );
            addSelectiveOptionalFlag ( sheet, row, Header.MONITOR_BOOL.ordinal (), item.isLocalBoolAvailable (), item.getLocalBool (), item.isLocalBoolAck () );

            addSelectiveData ( sheet, row, Header.LIST_MONITOR.ordinal (), item.isListMonitorPreset (), makeListData ( item ), item.isListMonitorAckRequired () );

            addFlag ( sheet, row, Header.REMOTE_MIN.ordinal (), item.isRemoteMin (), false );
            addFlag ( sheet, row, Header.REMOTE_MAX.ordinal (), item.isRemoteMax (), false );

            addFlag ( sheet, row, Header.REMOTE_HH.ordinal (), item.isRemoteHighHigh (), false );
            addFlag ( sheet, row, Header.REMOTE_H.ordinal (), item.isRemoteHigh (), false );
            addFlag ( sheet, row, Header.REMOTE_L.ordinal (), item.isRemoteLow (), false );
            addFlag ( sheet, row, Header.REMOTE_LL.ordinal (), item.isRemoteLowLow (), false );

            addFlag ( sheet, row, Header.REMOTE_BOOL.ordinal (), item.isRemoteBool (), false );
            addFlag ( sheet, row, Header.REMOTE_MANUAL.ordinal (), item.isRemoteManual (), false );
            addFlag ( sheet, row, Header.EXCLUDE_SUMMARY.ordinal (), item.isIgnoreSummary (), false );

            addSelectiveData ( sheet, row, Header.LOCAL_SCALE_FACTOR.ordinal (), item.isLocalScaleAvailable (), item.getLocalScaleFactor () );
            addSelectiveData ( sheet, row, Header.LOCAL_SCALE_OFFSET.ordinal (), item.isLocalScaleAvailable (), item.getLocalScaleOffset () );

            row++;
        }

        workbook.write ();
        workbook.close ();
    }

    private static void addData ( final WritableSheet sheet, final int row, final int column, final String data ) throws RowsExceededException, WriteException
    {
        addData ( sheet, row, column, data, false );
    }

    private static String makeListData ( final Item item )
    {
        final StringBuilder sb = new StringBuilder ();

        if ( item.isListMonitorListIsAlarm () )
        {
            sb.append ( "ALARM:" );
        }

        sb.append ( StringHelper.join ( item.getListMonitorItems (), "," ) );

        return sb.toString ();
    }

    private static void addHeaderCell ( final WritableSheet sheet, final String string, final int index ) throws WriteException, RowsExceededException
    {
        final WritableCellFormat cf = new WritableCellFormat ();
        cf.setFont ( new WritableFont ( WritableFont.ARIAL, 10, WritableFont.BOLD ) );

        final WritableCell cell;
        cell = new Label ( index, 0, string );
        cell.setCellFormat ( cf );

        sheet.addCell ( cell );

        final CellView cv = new CellView ();
        cv.setAutosize ( true );
        sheet.setColumnView ( index, cv );
    }

    private static void addData ( final WritableSheet sheet, final int row, final int column, final Double data, final boolean ack ) throws RowsExceededException, WriteException
    {
        final WritableCell cell;
        if ( data != null )
        {
            cell = new Number ( column, row, data );
            if ( ack )
            {
                final WritableCellFormat cf = new WritableCellFormat ( cell.getCellFormat () );
                cf.setBackground ( Colour.RED );
                cell.setCellFormat ( cf );
            }
        }
        else
        {
            cell = new Blank ( column, row );
        }

        sheet.addCell ( cell );
    }

    private static void addData ( final WritableSheet sheet, final int row, final int column, final String data, final boolean ack ) throws WriteException, RowsExceededException
    {
        final WritableCell cell;
        if ( data != null )
        {
            cell = new Label ( column, row, data );
            if ( ack )
            {
                final WritableCellFormat cf = new WritableCellFormat ( cell.getCellFormat () );
                cf.setBackground ( Colour.RED );
                cell.setCellFormat ( cf );
            }
        }
        else
        {
            cell = new Blank ( column, row );
        }
        sheet.addCell ( cell );
    }

    private static void addFlag ( final WritableSheet sheet, final int row, final int column, final boolean flag, final boolean ack ) throws RowsExceededException, WriteException
    {
        addData ( sheet, row, column, flag ? "X" : null, ack );
    }

    private static void addSelectiveOptionalFlag ( final WritableSheet sheet, final int row, final int column, final boolean available, final Boolean flag, final boolean ack ) throws RowsExceededException, WriteException
    {
        if ( available )
        {
            if ( flag == null )
            {
                addData ( sheet, row, column, "X", ack );
            }
            else
            {
                addData ( sheet, row, column, flag ? "+" : "-", ack );
            }
        }
        else
        {
            addData ( sheet, row, column, (String)null, ack );
        }
    }

    private static void addSelectiveData ( final WritableSheet sheet, final int row, final int column, final boolean available, final Double value ) throws RowsExceededException, WriteException
    {
        addSelectiveDataAck ( sheet, row, column, available, value, false );
    }

    private static void addSelectiveDataAck ( final WritableSheet sheet, final int row, final int column, final boolean available, final Double value, final boolean ack ) throws RowsExceededException, WriteException
    {
        final WritableCell cell;
        if ( available && value == null )
        {
            cell = new Label ( column, row, "X" );
            if ( ack )
            {
                final WritableCellFormat cf = new WritableCellFormat ( cell.getCellFormat () );
                cf.setBackground ( Colour.RED );
                cell.setCellFormat ( cf );
            }
        }
        else if ( available && value != null )
        {
            cell = new Number ( column, row, value );
            if ( ack )
            {
                final WritableCellFormat cf = new WritableCellFormat ( cell.getCellFormat () );
                cf.setBackground ( Colour.RED );
                cell.setCellFormat ( cf );
            }
        }
        else
        {
            cell = new Blank ( column, row );
        }
        sheet.addCell ( cell );
    }

    private static void addSelectiveData ( final WritableSheet sheet, final int row, final int column, final boolean available, final String value, final boolean ackRequired ) throws RowsExceededException, WriteException
    {
        final WritableCell cell;
        if ( available && value == null )
        {
            cell = new Label ( column, row, "X" );
        }
        else if ( available && value != null )
        {
            cell = new Label ( column, row, value );
        }
        else
        {
            cell = new Blank ( column, row );
        }

        if ( ackRequired )
        {
            final WritableCellFormat cf = new WritableCellFormat ( cell.getCellFormat () );
            cf.setBackground ( Colour.RED );
            cell.setCellFormat ( cf );
        }

        sheet.addCell ( cell );
    }

    public static List<Item> loadExcel ( final String fileName ) throws BiffException, IOException
    {
        final List<Item> result = new LinkedList<Item> ();

        final WorkbookSettings settings = new WorkbookSettings ();
        settings.setEncoding ( "ISO-8859-1" );
        final Workbook book = jxl.Workbook.getWorkbook ( new File ( fileName ), settings );

        final Sheet sheet = book.getSheet ( 0 );

        final Map<Integer, Header> header = loadHeader ( sheet );

        for ( int row = 1; row < sheet.getRows (); row++ )
        {
            final Item item = convertToItem ( header, sheet.getRow ( row ), String.format ( "%s@%s", fileName, row ) );
            if ( item != null )
            {
                result.add ( item );
            }
        }

        return result;
    }

    private static Item convertToItem ( final Map<Integer, Header> header, final Cell[] row, final String debugInformation )
    {
        if ( row.length < 2 )
        {
            return null;
        }

        // ignore empty lines
        if ( row.length < 3 || row[2] == null || row[2].getContents () == null || row[2].getContents ().length () == 0 )
        {
            return null;
        }

        final Item item = ModelFactory.eINSTANCE.createItem ();
        item.setDebugInformation ( debugInformation );

        final Map<Header, Value> mapped = makeRow ( header, row );

        for ( final Map.Entry<Header, Value> entry : mapped.entrySet () )
        {
            entry.getKey ().apply ( item, entry.getValue () );
        }

        return item;
    }

    private static Map<Header, Value> makeRow ( final Map<Integer, Header> headers, final Cell[] row )
    {
        final Map<Header, Value> result = new HashMap<Header, Value> ();

        for ( int i = 0; i < row.length; i++ )
        {
            final Header header = headers.get ( i );
            if ( header != null )
            {
                final Cell cell = row[i];

                final Value value = new Value ();
                value.setValue ( cell.getContents () );

                value.setBackgroundColor ( new RGB ( 255, 255, 255 ) );

                if ( cell.getCellFormat () != null )
                {
                    final Colour color = cell.getCellFormat ().getBackgroundColour ();
                    if ( color != null )
                    {
                        value.setBackgroundColor ( makeRgb ( color.getDefaultRGB () ) );
                    }
                }

                result.put ( header, value );
            }
        }
        return result;
    }

    private static RGB makeRgb ( final jxl.format.RGB defaultRGB )
    {
        return new RGB ( defaultRGB.getRed (), defaultRGB.getGreen (), defaultRGB.getBlue () );
    }

    private static Map<Integer, Header> loadHeader ( final Sheet sheet )
    {
        final Map<Integer, Header> headerMap = new HashMap<Integer, Header> ();

        final Cell[] cells = sheet.getRow ( 0 );

        for ( int i = 0; i < cells.length; i++ )
        {
            final Header header = Header.valueOf ( cells[i].getContents () );
            if ( header != null )
            {
                headerMap.put ( i, header );
            }
        }
        return headerMap;
    }

}
