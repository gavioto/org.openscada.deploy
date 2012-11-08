package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.openscada.deploy.iolist.model.Item;

public class NumericEcoreColumnReader extends NumericColumnReader
{

    private final EStructuralFeature feature;

    public NumericEcoreColumnReader ( final EStructuralFeature feature )
    {
        this.feature = feature;
    }

    @Override
    public void setValue ( final Item item, final Double value )
    {
        item.eSet ( this.feature, value );
    }

}
