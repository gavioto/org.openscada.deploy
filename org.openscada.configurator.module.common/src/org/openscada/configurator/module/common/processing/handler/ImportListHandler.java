package org.openscada.configurator.module.common.processing.handler;

import java.io.File;
import java.util.List;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.handler.AbstractFileHandler;
import org.openscada.configurator.module.common.processing.ImportListModule;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.ItemListReader;

public class ImportListHandler extends AbstractFileHandler<ImportListModule>
{

    @Override
    protected void loadFile ( final Configuration configuration, final ImportListModule module, final File file ) throws Exception
    {
        final List<Item> items = new ItemListReader ( file ).getItems ();
        configuration.addItems ( items );
        System.out.println ( String.format ( " ** Loaded %s items from %s", items.size (), file ) );
    }
}
