/*
 * This file is part of the openSCADA project
 * Copyright (C) 2006-2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
 *
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 *
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 */

package org.openscada.configurator.data;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableHeaderRowsElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowElement;
import org.odftoolkit.odfdom.incubator.doc.text.OdfWhitespaceProcessor;
import org.odftoolkit.odfdom.pkg.OdfElement;
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

        final Map<Integer, String> header = new HashMap<Integer, String> ();
        processRows ( 0, rowHandler, header, sheet.getOdfElement () );
    }

    private int processRows ( int row, final RowHandler rowHandler, Map<Integer, String> header, final OdfElement element )
    {
        for ( int i = 0; i < element.getChildNodes ().getLength (); i++ )
        {
            final Node node = element.getChildNodes ().item ( i );
            if ( node instanceof TableTableHeaderRowsElement )
            {
                if ( DEBUG )
                {
                    System.out.println ( "Header row at: " + row );
                }

                row = processRows ( row, rowHandler, header, (TableTableHeaderRowsElement)node );
            }
            else if ( node instanceof TableTableRowElement )
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
        return row;
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
