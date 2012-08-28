package org.openscada.deploy.iolist.utils.column;

import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.Cell;

public abstract class TextColumnReader implements ColumnReader
{

    @Override
    public void readItem ( final Item item, final Cell cell )
    {
        setValue ( item, cell.getText () );
    }

    public abstract void setValue ( Item item, String value );

}
