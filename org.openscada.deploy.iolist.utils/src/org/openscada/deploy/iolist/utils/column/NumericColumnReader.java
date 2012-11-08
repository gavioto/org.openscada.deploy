package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.Cell;

public abstract class NumericColumnReader implements ColumnReader
{

    @Override
    public void readItem ( final Item item, final Cell cell )
    {
        final String valueType = cell.getCell ().getOfficeValueTypeAttribute ();
        if ( OfficeValueTypeAttribute.Value.FLOAT.equals ( valueType ) )
        {
            setValue ( item, cell.getCell ().getOfficeValueAttribute () );
        }
        else
        {
            setValue ( item, makeDouble ( item, cell ) );
        }
    }

    protected Double getDefaultValue ()
    {
        return null;
    }

    private Double makeDouble ( final Item item, final Cell cell )
    {
        try
        {
            final String text = cell.getText ();
            if ( text == null || text.isEmpty () )
            {
                return getDefaultValue ();
            }

            return Double.parseDouble ( text );
        }
        catch ( final Exception e )
        {
            handleError ( item, cell );
            return null;
        }
    }

    public void handleError ( final Item item, final Cell cell )
    {
    }

    public abstract void setValue ( final Item item, final Double value );

}
