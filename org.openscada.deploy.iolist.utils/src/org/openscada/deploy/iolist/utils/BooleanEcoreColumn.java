package org.openscada.deploy.iolist.utils;

import org.eclipse.emf.ecore.EAttribute;
import org.openscada.deploy.iolist.model.Item;

public class BooleanEcoreColumn extends BooleanColumn
{

    private final EAttribute attribute;

    public BooleanEcoreColumn ( final String name, final EAttribute attribute )
    {
        super ( name );
        this.attribute = attribute;
    }

    @Override
    protected Boolean getValue ( final Item item )
    {
        return (Boolean)item.eGet ( this.attribute );
    };

}
