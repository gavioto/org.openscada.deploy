package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.openscada.deploy.iolist.model.Item;

public class TextEcoreColumnReader extends TextColumnReader
{

    private final EStructuralFeature feature;

    public TextEcoreColumnReader ( final EStructuralFeature feature )
    {
        this.feature = feature;
    }

    @Override
    public void setValue ( final Item item, final String value )
    {
        item.eSet ( this.feature, value );
    }

}
