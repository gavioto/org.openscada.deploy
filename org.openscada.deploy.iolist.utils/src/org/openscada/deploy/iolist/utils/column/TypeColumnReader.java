package org.openscada.deploy.iolist.utils.column;

import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.Cell;

public class TypeColumnReader implements ColumnReader
{

    @Override
    public void readItem ( final Item item, final Cell cell )
    {
        final String type = cell.getText ();
        if ( type == null || type.isEmpty () || "Item".equals ( type ) )
        {
            return;
        }

        throw new IllegalArgumentException ( String.format ( "Item type '%s' is not allowed in spreadsheet format", type ) );
    }

}
