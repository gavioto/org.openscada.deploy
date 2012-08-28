package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.openscada.deploy.iolist.model.Item;

public class BooleanEcoreColumnReader extends BooleanColumnReader
{

    private final EStructuralFeature feature;

    public BooleanEcoreColumnReader ( final EStructuralFeature feature )
    {
        this.feature = feature;
    }

    @Override
    public void setValue ( final Item item, final Boolean value )
    {
        item.eSet ( this.feature, value );
    }

}
