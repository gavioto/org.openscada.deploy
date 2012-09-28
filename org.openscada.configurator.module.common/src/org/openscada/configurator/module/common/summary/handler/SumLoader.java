package org.openscada.configurator.module.common.summary.handler;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.data.DataLoaderOdfDom;
import org.openscada.configurator.module.common.handler.AbstractFileHandler;
import org.openscada.configurator.module.common.summary.SummaryFileLoader;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.SummaryGroup;

public class SumLoader extends AbstractFileHandler<SummaryFileLoader>
{
    public static Collection<SummaryGroup> loadGroups ( final String prefix, final File file ) throws Exception
    {
        final DataLoaderOdfDom loader = new DataLoaderOdfDom ( file, false );
        final SumLoadHandler handler = new SumLoadHandler ( prefix );
        loader.load ( 0, handler );
        return handler.getGroups ();
    }

    public static void convertGroups ( final String prefix, final Configuration cfg, final File file, final int requiredSize ) throws Exception
    {
        final List<Item> items = new LinkedList<Item> ();
        Helper.configureGroups ( cfg, loadGroups ( prefix, file ), items, requiredSize );
        cfg.addItems ( items );
    }

    @Override
    protected void loadFile ( final Configuration configuration, final SummaryFileLoader module, final File file ) throws Exception
    {
        SumLoader.convertGroups ( module.getPrefix (), configuration, file, module.getRequiredItems () );
    }

}
