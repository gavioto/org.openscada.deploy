package org.openscada.deploy.iolist.utils.column;

import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.Cell;

public interface ColumnReader
{
    public void readItem ( Item item, Cell cell );
}
