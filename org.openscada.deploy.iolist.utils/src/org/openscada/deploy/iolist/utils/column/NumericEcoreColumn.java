package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.openscada.deploy.iolist.model.Item;

public class NumericEcoreColumn extends NumericColumn
{

    private final EStructuralFeature feature;

    public NumericEcoreColumn ( final String name, final EStructuralFeature feature )
    {
        super ( name );
        this.feature = feature;
    }

    @Override
    protected Double getValue ( final Item item )
    {
        final Number n = (Number)item.eGet ( this.feature );
        if ( n == null )
        {
            return null;
        }
        else
        {
            return n.doubleValue ();
        }
    }

}
