package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.openscada.deploy.iolist.model.Item;

public class TypeColumnWriter extends AbstractColumn
{

    public TypeColumnWriter ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfTableCell cell, final Item item )
    {
        cell.setStringValue ( item.eClass ().getName () );
    }

}
