package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;

public abstract class TextColumn extends AbstractColumn
{

    public TextColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfTableCell cell, final Item item )
    {
        final String value = getValue ( item );
        if ( value != null )
        {
            cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
            cell.setStringValue ( value );
        }
    };

    protected abstract String getValue ( Item item );

}
