package org.openscada.deploy.iolist.utils;

import org.eclipse.emf.ecore.EAttribute;
import org.openscada.deploy.iolist.model.Item;

public class TextEcoreColumn extends TextColumn
{

    private final EAttribute attribute;

    public TextEcoreColumn ( final String name, final EAttribute attribute )
    {
        super ( name );
        this.attribute = attribute;
    }

    @Override
    protected String getValue ( final Item item )
    {
        return (String)item.eGet ( this.attribute );
    }

}
