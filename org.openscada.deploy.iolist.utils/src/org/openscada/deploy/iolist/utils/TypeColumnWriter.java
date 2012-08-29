package org.openscada.deploy.iolist.utils;

import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.column.AbstractColumn;

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
