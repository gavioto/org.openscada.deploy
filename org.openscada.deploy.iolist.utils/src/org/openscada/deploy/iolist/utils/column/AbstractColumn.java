package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;

public abstract class AbstractColumn implements ColumnWriter
{

    private final String name;

    protected abstract void update ( final OdfTableCell cell, final Item item );

    public AbstractColumn ( final String name )
    {
        this.name = name;
    }

    @Override
    public void writeHeader ( final OdfTable table, final int colIndex )
    {
        final OdfTableCell cell = table.getCellByPosition ( colIndex, 0 );

        // cell.getTableRow ().getOdfElement ().setStyleName ( "Default" );
        // cell.getTableColumn ().getOdfElement ().setStyleName ( "Default" );

        cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
        cell.setStringValue ( this.name );
    }

    @Override
    public void writeItem ( final OdfTable table, final int rowIndex, final int colIndex, final Item item )
    {
        final OdfTableCell cell = table.getCellByPosition ( colIndex, rowIndex );
        update ( cell, item );
    }

}