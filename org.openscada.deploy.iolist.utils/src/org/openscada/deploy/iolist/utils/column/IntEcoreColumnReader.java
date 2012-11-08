package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.openscada.deploy.iolist.model.Item;

public class IntEcoreColumnReader extends NumericColumnReader
{

    private final EStructuralFeature feature;

    private final Integer defaultValue;

    public IntEcoreColumnReader ( final EStructuralFeature feature, final Integer defaultValue )
    {
        this.feature = feature;
        this.defaultValue = defaultValue;
    }

    @Override
    public void setValue ( final Item item, final Double value )
    {
        if ( value != null )
        {
            item.eSet ( this.feature, value.intValue () );
        }
        else if ( this.defaultValue != null )
        {
            item.eSet ( this.feature, this.defaultValue );
        }
        else
        {
            item.eUnset ( this.feature );
        }
    }

}
