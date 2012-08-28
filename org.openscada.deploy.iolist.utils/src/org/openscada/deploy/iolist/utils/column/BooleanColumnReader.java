package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.Cell;

public abstract class BooleanColumnReader implements ColumnReader
{

    @Override
    public void readItem ( final Item item, final Cell cell )
    {
        final String valueType = cell.getCell ().getOfficeValueTypeAttribute ();
        if ( OfficeValueTypeAttribute.Value.STRING.equals ( valueType ) )
        {
            setValue ( item, cell.getCell ().getOfficeBooleanValueAttribute () );
        }
        else
        {
            setValue ( item, makeBoolean ( cell, null ) );
        }
    }

    public static Boolean makeBoolean ( final Cell cell, final Boolean defaultValue )
    {
        try
        {
            final String text = cell.getText ();
            if ( text == null )
            {
                return false;
            }
            if ( text.isEmpty () )
            {
                return false;
            }
            if ( text.equalsIgnoreCase ( "X" ) )
            {
                return true;
            }
            if ( text.equals ( "-" ) )
            {
                return false;
            }
            if ( text.equals ( "+" ) )
            {
                return true;
            }
            return Boolean.parseBoolean ( text );
        }
        catch ( final Exception e )
        {
            return defaultValue;
        }
    }

    public abstract void setValue ( final Item item, final Boolean value );

}
