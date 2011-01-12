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

public class SpreadSheetHelper extends GenericSpreadSheetHelper
{

    private WritableSheet sheet;

    protected SpreadSheetHelper ()
    {
    }

    public void write ( final String filename, final Collection<Item> items ) throws Exception
    {
        final File file = new File ( filename );

        final WorkbookSettings settings = new WorkbookSettings ();
        settings.setAutoFilterDisabled ( false );
        final WritableWorkbook workbook = Workbook.createWorkbook ( file, settings );
        this.sheet = workbook.createSheet ( "IO-List", 0 );
        final SheetSettings sheetSettings = this.sheet.getSettings ();
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

        writeHeader ();
        writeItems ( items );

        workbook.write ();
        workbook.close ();
    }

    public static void writeSpreadsheet ( final String filename, final Collection<Item> items ) throws Exception
    {
        new SpreadSheetHelper ().write ( filename, items );
    }

    @Override
    protected void addData ( final int row, final int column, final String data ) throws RowsExceededException, WriteException
    {
        addData ( row, column, data, false );
    }

    @Override
    protected void addHeaderCell ( final String string, final int index ) throws WriteException, RowsExceededException
    {
        final WritableCellFormat cf = new WritableCellFormat ();
        cf.setFont ( new WritableFont ( WritableFont.ARIAL, 10, WritableFont.BOLD ) );

        final WritableCell cell;
        cell = new Label ( index, 0, string );
        cell.setCellFormat ( cf );

        this.sheet.addCell ( cell );

        final CellView cv = new CellView ();
        cv.setAutosize ( true );
        this.sheet.setColumnView ( index, cv );
    }

    @Override
    protected void addData ( final int row, final int column, final Double data, final boolean ack ) throws RowsExceededException, WriteException
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

        this.sheet.addCell ( cell );
    }

    @Override
    protected void addData ( final int row, final int column, final String data, final boolean ack ) throws WriteException, RowsExceededException
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
        this.sheet.addCell ( cell );
    }

    @Override
    protected void addSelectiveDataAck ( final int row, final int column, final boolean available, final Double value, final boolean ack ) throws RowsExceededException, WriteException
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
        this.sheet.addCell ( cell );
    }

    @Override
    protected void addSelectiveData ( final int row, final int column, final boolean available, final String value, final boolean ackRequired ) throws RowsExceededException, WriteException
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

        this.sheet.addCell ( cell );
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
