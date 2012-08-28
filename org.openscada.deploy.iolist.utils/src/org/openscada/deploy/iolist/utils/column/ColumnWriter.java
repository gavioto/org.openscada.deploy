package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.openscada.deploy.iolist.model.Item;

public interface ColumnWriter
{
    public void writeHeader ( OdfTable table, int colIndex );

    public void writeItem ( final OdfTable table, int rowIndex, int colIndex, final Item item );
}
