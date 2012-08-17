package org.openscada.configurator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;

public class DataLoader
{

    private final SpreadSheet spreadSheet;

    private final boolean useHeader;

    public DataLoader ( final File file ) throws IOException
    {
        this ( file, true );
    }

    public DataLoader ( final File file, final boolean useHeader ) throws IOException
    {
        this.spreadSheet = SpreadSheet.createFromFile ( file );
        this.useHeader = useHeader;
    }

    public void load ( final int sheetIdx, final RowHandler rowHandler )
    {
        final Sheet sheet = this.spreadSheet.getSheet ( sheetIdx );

        final Map<Integer, String> header;
        if ( this.useHeader )
        {
            header = loadRow ( sheet, 0 );
        }
        else
        {
            header = new HashMap<Integer, String> ();
        }

        final int rows = sheet.getRowCount ();

        for ( int i = 1; i < rows; i++ )
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
                value = sheet.getValueAt ( i, row );
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
