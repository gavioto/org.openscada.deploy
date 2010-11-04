package org.openscada.atlantis.configurator.common;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;

public class DataLoaderXls
{

    private final jxl.Workbook workbook;

    private final boolean useHeader;

    private final int skipHeaders;

    public DataLoaderXls ( final File file ) throws Exception
    {
        this ( file, true, 0, null );
    }

    public DataLoaderXls ( final File file, final boolean useHeader, final int skipHeaders, final String encoding ) throws Exception
    {
        final WorkbookSettings s = new WorkbookSettings ();
        if ( encoding != null )
        {
            s.setEncoding ( encoding );
        }
        this.workbook = Workbook.getWorkbook ( file, s );
        this.useHeader = useHeader;
        this.skipHeaders = skipHeaders;
    }

    public void load ( final int sheetIdx, final RowHandler rowHandler )
    {
        final Sheet sheet = this.workbook.getSheet ( sheetIdx );

        final Map<Integer, String> header;

        for ( int i = 0; i < this.skipHeaders; i++ )
        {
            loadRow ( sheet, i );
        }

        if ( this.useHeader )
        {
            header = loadRow ( sheet, this.skipHeaders );
        }
        else
        {
            header = new HashMap<Integer, String> ();
        }

        final int rows = sheet.getRows ();

        for ( int i = this.skipHeaders + 1; i < rows; i++ )
        {
            rowHandler.handleRow ( i, mapRow ( header, loadRow ( sheet, i ) ) );
        }
    }

    private static Map<String, String> mapRow ( final Map<Integer, String> header, final Map<Integer, String> data )
    {
        final Map<String, String> row = new HashMap<String, String> ();

        for ( final Map.Entry<Integer, String> cell : data.entrySet () )
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

    private static Map<Integer, String> loadRow ( final Sheet sheet, final int row )
    {
        final Map<Integer, String> header = new HashMap<Integer, String> ();

        int i = 0;
        Object value;
        while ( true )
        {
            try
            {
                value = sheet.getCell ( i, row ).getContents ();
            }
            catch ( final IndexOutOfBoundsException e )
            {
                break;
            }

            if ( value != null )
            {
                header.put ( i, value.toString () );
            }
            i++;
        }

        return header;
    }
}
