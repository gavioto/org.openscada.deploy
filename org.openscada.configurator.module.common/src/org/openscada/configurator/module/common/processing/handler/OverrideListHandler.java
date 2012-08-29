package org.openscada.configurator.module.common.processing.handler;

import java.io.File;
import java.util.List;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.handler.AbstractFileHandler;
import org.openscada.configurator.module.common.processing.OverrideListModule;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.ItemListReader;

public class OverrideListHandler extends AbstractFileHandler<OverrideListModule>
{

    @Override
    protected void loadFile ( final Configuration configuration, final OverrideListModule module, final File file ) throws Exception
    {
        final List<Item> items = new ItemListReader ( file ).getItems ();
        configuration.applyOverrides ( items );
        System.out.println ( String.format ( " ** Apply %s overtride items from %s", items.size (), file ) );
    }
}
