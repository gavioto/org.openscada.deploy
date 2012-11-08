package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.openscada.deploy.iolist.model.Item;

public class IntEcoreColumnReader extends NumericColumnReader
{

    private final EStructuralFeature feature;

    public IntEcoreColumnReader ( final EStructuralFeature feature )
    {
        this.feature = feature;
    }

    @Override
    public void setValue ( final Item item, final Double value )
    {
        if ( value != null )
        {
            item.eSet ( this.feature, value.intValue () );
        }
        else
        {
            item.eUnset ( this.feature );
        }
    }

}
