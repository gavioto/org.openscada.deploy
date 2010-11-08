package org.openscada.deploy.iolist.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HeaderFooter;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PrintSetup;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.utils.str.StringHelper;

public class SpreadSheetPoiHelper
{
    private final Workbook workbook;

    private final Sheet sheet;

    private final CellStyle ackRequiredStyle;

    private final CellStyle headerStyle;

    protected SpreadSheetPoiHelper ()
    {
        this.workbook = new HSSFWorkbook ();
        this.sheet = this.workbook.createSheet ( "IO-List" );

        this.ackRequiredStyle = this.workbook.createCellStyle ();
        this.ackRequiredStyle.setFillForegroundColor ( IndexedColors.RED.getIndex () );
        this.ackRequiredStyle.setFillPattern ( CellStyle.SOLID_FOREGROUND );

        final Font headerFont = this.workbook.createFont ();
        headerFont.setBoldweight ( Font.BOLDWEIGHT_BOLD );

        this.headerStyle = this.workbook.createCellStyle ();
        this.headerStyle.setFont ( headerFont );

        // enable auto filter
        this.sheet.setAutoFilter ( new CellRangeAddress ( 0, 0, 0, Header.values ().length - 1 ) );

        // fit to one page width
        this.sheet.setAutobreaks ( true );
        final PrintSetup ps = this.sheet.getPrintSetup ();
        ps.setLandscape ( true );
        ps.setPaperSize ( PrintSetup.A4_PAPERSIZE );
        ps.setFitWidth ( (short)1 );
        ps.setFitHeight ( (short)0 );
        ps.setFooterMargin ( 0.25 );

        this.sheet.setMargin ( Sheet.LeftMargin, 0.25 );
        this.sheet.setMargin ( Sheet.RightMargin, 0.25 );
        this.sheet.setMargin ( Sheet.TopMargin, 0.25 );
        this.sheet.setMargin ( Sheet.BottomMargin, 0.5 );

        final Footer footer = this.sheet.getFooter ();
        footer.setRight ( "Page " + HeaderFooter.page () + " of " + HeaderFooter.numPages () );

        // freeze area
        this.sheet.createFreezePane ( 0, 1, 0, 1 );

        // repeat headers
        this.workbook.setRepeatingRowsAndColumns ( 0, -1, -1, 0, 1 );
    }

    public static void writeSpreadsheet ( final String filename, final Collection<Item> items ) throws Exception
    {
        final SpreadSheetPoiHelper helper = new SpreadSheetPoiHelper ();
        helper.process ( items );
        helper.write ( filename );
    }

    private void write ( final String filename ) throws Exception
    {
        final FileOutputStream fileOut = new FileOutputStream ( filename );
        this.workbook.write ( fileOut );
        fileOut.close ();
    }

    private void process ( final Collection<Item> items ) throws Exception
    {

        for ( final Header header : Header.values () )
        {
            addHeaderCell ( this.sheet, header.toString (), header.ordinal () );
        }

        int row = 1;
        for ( final Item item : items )
        {
            addData ( this.sheet, row, Header.HIVE.ordinal (), item.getDevice () );
            addData ( this.sheet, row, Header.SOURCE_NAME.ordinal (), item.getName () );
            addData ( this.sheet, row, Header.DATA_TYPE.ordinal (), item.getDataType ().toString () );
            addData ( this.sheet, row, Header.UNIT.ordinal (), item.getUnit () );

            addData ( this.sheet, row, Header.DESCRIPTION.ordinal (), item.getDescription () );
            addData ( this.sheet, row, Header.SYSTEM.ordinal (), item.getSystem () );
            addData ( this.sheet, row, Header.LOCATION.ordinal (), item.getLocation () );
            addData ( this.sheet, row, Header.COMPONENT.ordinal (), item.getComponent () );
            addData ( this.sheet, row, Header.ALIAS.ordinal (), item.getAlias () );

            addFlag ( this.sheet, row, Header.DEFAULT_CHAIN.ordinal (), item.isDefaultChain (), false );

            addData ( this.sheet, row, Header.MIN.ordinal (), item.getLocalMin (), item.isLocalMinAck () );
            addData ( this.sheet, row, Header.MAX.ordinal (), item.getLocalMax (), item.isLocalMaxAck () );
            addSelectiveDataAck ( this.sheet, row, Header.LIMIT_HH.ordinal (), item.isLocalHighHighAvailable (), item.getLocalHighHighPreset (), item.isLocalHighHighAck () );
            addSelectiveDataAck ( this.sheet, row, Header.LIMIT_H.ordinal (), item.isLocalHighAvailable (), item.getLocalHighPreset (), item.isLocalHighAck () );
            addSelectiveDataAck ( this.sheet, row, Header.LIMIT_L.ordinal (), item.isLocalLowAvailable (), item.getLocalLowPreset (), item.isLocalLowAck () );
            addSelectiveDataAck ( this.sheet, row, Header.LIMIT_LL.ordinal (), item.isLocalLowLowAvailable (), item.getLocalLowLowPreset (), item.isLocalLowLowAck () );

            addFlag ( this.sheet, row, Header.EVENT_WRITE.ordinal (), item.isEventCommand (), false );
            addFlag ( this.sheet, row, Header.MANUAL.ordinal (), item.isLocalManual (), false );
            addSelectiveOptionalFlag ( this.sheet, row, Header.MONITOR_BOOL.ordinal (), item.isLocalBoolAvailable (), item.getLocalBool (), item.isLocalBoolAck () );

            addSelectiveData ( this.sheet, row, Header.LIST_MONITOR.ordinal (), item.isListMonitorPreset (), makeListData ( item ), item.isListMonitorAckRequired () );

            addFlag ( this.sheet, row, Header.REMOTE_MIN.ordinal (), item.isRemoteMin (), false );
            addFlag ( this.sheet, row, Header.REMOTE_MAX.ordinal (), item.isRemoteMax (), false );

            addFlag ( this.sheet, row, Header.REMOTE_HH.ordinal (), item.isRemoteHighHigh (), false );
            addFlag ( this.sheet, row, Header.REMOTE_H.ordinal (), item.isRemoteHigh (), false );
            addFlag ( this.sheet, row, Header.REMOTE_L.ordinal (), item.isRemoteLow (), false );
            addFlag ( this.sheet, row, Header.REMOTE_LL.ordinal (), item.isRemoteLowLow (), false );

            addFlag ( this.sheet, row, Header.REMOTE_BOOL.ordinal (), item.isRemoteBool (), false );
            addFlag ( this.sheet, row, Header.REMOTE_MANUAL.ordinal (), item.isRemoteManual (), false );
            addFlag ( this.sheet, row, Header.EXCLUDE_SUMMARY.ordinal (), item.isIgnoreSummary (), false );

            addSelectiveData ( this.sheet, row, Header.LOCAL_SCALE_FACTOR.ordinal (), item.isLocalScaleAvailable (), item.getLocalScaleFactor () );
            addSelectiveData ( this.sheet, row, Header.LOCAL_SCALE_OFFSET.ordinal (), item.isLocalScaleAvailable (), item.getLocalScaleOffset () );

            row++;
        }

        autoAdjust ( this.sheet );
    }

    private void autoAdjust ( final Sheet sheet )
    {
        for ( int i = 0; i < Header.values ().length; i++ )
        {
            sheet.autoSizeColumn ( i );
        }
    }

    private void addData ( final Sheet sheet, final int row, final int column, final String data ) throws RowsExceededException, WriteException
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

    private Cell createCell ( final Sheet sheet, final int row, final int column )
    {
        Row rowData = sheet.getRow ( row );
        if ( rowData == null )
        {
            rowData = sheet.createRow ( row );
        }
        return rowData.createCell ( column );
    }

    private void addHeaderCell ( final Sheet sheet, final String string, final int index ) throws WriteException, RowsExceededException
    {
        final Cell cell = createCell ( sheet, 0, index );

        cell.setCellValue ( string );
        cell.setCellStyle ( this.headerStyle );
    }

    private void addData ( final Sheet sheet, final int row, final int column, final Double data, final boolean ack ) throws RowsExceededException, WriteException
    {
        final Cell cell = createCell ( sheet, row, column );

        if ( data != null )
        {
            cell.setCellValue ( data );
            if ( ack )
            {
                cell.setCellStyle ( this.ackRequiredStyle );
            }
        }
        else
        {
            cell.setCellType ( Cell.CELL_TYPE_BLANK );
        }
    }

    private void addData ( final Sheet sheet, final int row, final int column, final String data, final boolean ack ) throws WriteException, RowsExceededException
    {
        final Cell cell = createCell ( sheet, row, column );

        if ( data != null )
        {
            cell.setCellValue ( data );
            if ( ack )
            {
                cell.setCellStyle ( this.ackRequiredStyle );
            }
        }
        else
        {
            cell.setCellType ( Cell.CELL_TYPE_BLANK );
        }
    }

    private void addFlag ( final Sheet sheet, final int row, final int column, final boolean flag, final boolean ack ) throws RowsExceededException, WriteException
    {
        addData ( sheet, row, column, flag ? "X" : null, ack );
    }

    private void addSelectiveOptionalFlag ( final Sheet sheet, final int row, final int column, final boolean available, final Boolean flag, final boolean ack ) throws RowsExceededException, WriteException
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

    private void addSelectiveData ( final Sheet sheet, final int row, final int column, final boolean available, final Double value ) throws RowsExceededException, WriteException
    {
        addSelectiveDataAck ( sheet, row, column, available, value, false );
    }

    private void addSelectiveDataAck ( final Sheet sheet, final int row, final int column, final boolean available, final Double value, final boolean ack ) throws RowsExceededException, WriteException
    {
        final Cell cell = createCell ( sheet, row, column );

        if ( available && value == null )
        {
            cell.setCellValue ( "X" );
            if ( ack )
            {
                cell.setCellStyle ( this.ackRequiredStyle );
            }
        }
        else if ( available && value != null )
        {
            cell.setCellValue ( value );
            if ( ack )
            {
                cell.setCellStyle ( this.ackRequiredStyle );
            }
        }
        else
        {
            cell.setCellType ( Cell.CELL_TYPE_BLANK );
        }
    }

    private void addSelectiveData ( final Sheet sheet, final int row, final int column, final boolean available, final String value, final boolean ackRequired ) throws RowsExceededException, WriteException
    {
        final Cell cell = createCell ( sheet, row, column );

        if ( available && value == null )
        {
            cell.setCellValue ( "X" );
            if ( ackRequired )
            {
                cell.setCellStyle ( this.ackRequiredStyle );
            }
        }
        else if ( available && value != null )
        {
            cell.setCellValue ( value );
            if ( ackRequired )
            {
                cell.setCellStyle ( this.ackRequiredStyle );
            }
        }
        else
        {
            cell.setCellType ( Cell.CELL_TYPE_BLANK );
        }
    }

    public static List<Item> loadExcel ( final String fileName ) throws BiffException, IOException
    {
        final List<Item> result = new LinkedList<Item> ();

        final Workbook workbook = new HSSFWorkbook ( new FileInputStream ( fileName ) );

        final Sheet sheet = workbook.getSheetAt ( 0 );

        final Map<Integer, Header> header = loadHeader ( sheet );

        for ( int row = 1; row < sheet.getLastRowNum (); row++ )
        {
            final Item item = convertToItem ( header, sheet.getRow ( row ), String.format ( "%s@%s", fileName, row ) );
            if ( item != null )
            {
                result.add ( item );
            }
        }

        return result;
    }

    private static Item convertToItem ( final Map<Integer, Header> header, final Row row, final String debugInformation )
    {
        if ( row == null || row.getLastCellNum () < 2 )
        {
            return null;
        }

        // ignore empty lines
        if ( row.getLastCellNum () < 3 || row.getCell ( 2 ) == null || row.getCell ( 2 ).getStringCellValue () == null || row.getCell ( 2 ).getStringCellValue ().length () == 0 )
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

    private static Map<Header, Value> makeRow ( final Map<Integer, Header> headers, final Row row )
    {
        final Map<Header, Value> result = new HashMap<Header, Value> ();

        for ( int i = 0; i < row.getLastCellNum (); i++ )
        {
            final Header header = headers.get ( i );
            if ( header != null && row.getCell ( i ) != null )
            {
                final Cell cell = row.getCell ( i );

                final Value value = new Value ();
                value.setValue ( cell.toString () );

                value.setBackgroundColor ( new RGB ( 255, 255, 255 ) );

                if ( cell.getCellStyle () != null )
                {
                    final short color = cell.getCellStyle ().getFillForegroundColor ();
                    if ( color == HSSFColor.RED.index )
                    {
                        value.setBackgroundColor ( new RGB ( 255, 0, 0 ) );
                    }
                }

                result.put ( header, value );
            }
        }
        return result;
    }

    private static Map<Integer, Header> loadHeader ( final Sheet sheet )
    {
        final Map<Integer, Header> headerMap = new HashMap<Integer, Header> ();

        final Row row = sheet.getRow ( 0 );

        for ( int i = 0; i < row.getLastCellNum (); i++ )
        {
            final Header header = Header.valueOf ( row.getCell ( i ).getStringCellValue () );
            if ( header != null )
            {
                headerMap.put ( i, header );
            }
        }
        return headerMap;
    }

}
