package org.openscada.configurator.data;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowElement;
import org.odftoolkit.odfdom.incubator.doc.text.OdfWhitespaceProcessor;
import org.w3c.dom.Node;

public class DataLoaderOdfDom
{

    private static boolean DEBUG = Boolean.getBoolean ( "DataLoaderOdfDom.debug" );

    private final OdfSpreadsheetDocument spreadSheet;

    private final boolean useHeader;

    public DataLoaderOdfDom ( final File file ) throws Exception
    {
        this ( file, true );
    }

    public DataLoaderOdfDom ( final File file, final boolean useHeader ) throws Exception
    {
        this.spreadSheet = OdfSpreadsheetDocument.loadDocument ( file );
        this.useHeader = useHeader;
    }

    public void load ( final int sheetIdx, final RowHandler rowHandler )
    {
        final OdfTable sheet = this.spreadSheet.getTableList ().get ( sheetIdx );

        Map<Integer, String> header = new HashMap<Integer, String> ();

        int row = 0;

        for ( int i = 0; i < sheet.getOdfElement ().getChildNodes ().getLength (); i++ )
        {
            final Node node = sheet.getOdfElement ().getChildNodes ().item ( i );
            if ( node instanceof TableTableRowElement )
            {
                if ( DEBUG )
                {
                    System.out.println ( "Row: " + row );
                }

                if ( this.useHeader && row == 0 )
                {
                    header = loadRow ( (TableTableRowElement)node );
                }
                else
                {
                    rowHandler.handleRow ( row, mapRow ( header, loadRow ( (TableTableRowElement)node ) ) );
                }
                row++;
            }
        }
    }

    private Map<Integer, String> loadRow ( final TableTableRowElement tableTableRowElement )
    {
        final Map<Integer, String> data = new HashMap<Integer, String> ();

        int col = 0;
        for ( int i = 0; i < tableTableRowElement.getChildNodes ().getLength (); i++ )
        {
            final Node node = tableTableRowElement.getChildNodes ().item ( i );
            if ( node instanceof TableTableCellElement )
            {
                final String value = new OdfWhitespaceProcessor ().getText ( node );

                if ( ( (TableTableCellElement)node ).getTableNumberColumnsRepeatedAttribute () != null )
                {
                    final int count = ( (TableTableCellElement)node ).getTableNumberColumnsRepeatedAttribute ();
                    for ( int j = 0; j < count; j++ )
                    {
                        data.put ( col + j, value );
                        if ( DEBUG )
                        {
                            System.out.println ( col + j + " Value : " + value );
                        }
                    }
                    col += count;
                }
                else
                {
                    data.put ( col, value );
                    if ( DEBUG )
                    {
                        System.out.println ( col + " Value : " + value );
                    }
                }
            }
        }

        return data;
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

}
