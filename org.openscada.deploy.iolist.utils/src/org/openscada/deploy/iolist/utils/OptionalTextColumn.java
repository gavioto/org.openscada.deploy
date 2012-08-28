package org.openscada.deploy.iolist.utils;

import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;

public abstract class OptionalTextColumn extends AbstractColumn
{

    public OptionalTextColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfTableCell cell, final Item item )
    {
        final String value = getValue ( item );
        final boolean available = isAvailale ( item );

        if ( available && value != null )
        {
            cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
            cell.setStringValue ( value );
        }
        else if ( available )
        {
            cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
            cell.setStringValue ( "X" );
        }
    };

    protected abstract String getValue ( Item item );

    protected abstract boolean isAvailale ( Item item );

}
