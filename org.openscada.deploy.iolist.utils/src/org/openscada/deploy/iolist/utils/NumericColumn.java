package org.openscada.deploy.iolist.utils;

import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;

public abstract class NumericColumn extends AbstractColumn
{

    public NumericColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfTableCell cell, final Item item )
    {
        final Double value = getValue ( item );
        if ( value != null )
        {
            cell.setValueType ( OfficeValueTypeAttribute.Value.FLOAT.toString () );
            cell.setDoubleValue ( value );
        }
    };

    protected abstract Double getValue ( Item item );

}
