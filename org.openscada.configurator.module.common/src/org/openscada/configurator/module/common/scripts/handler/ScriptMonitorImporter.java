package org.openscada.configurator.module.common.scripts.handler;

import java.io.File;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.data.DataLoaderOdfDom;
import org.openscada.configurator.module.common.handler.AbstractFileHandler;
import org.openscada.configurator.module.common.scripts.ScriptsMonitorModule;

public class ScriptMonitorImporter extends AbstractFileHandler<ScriptsMonitorModule>
{

    @Override
    protected void loadFile ( final Configuration configuration, final ScriptsMonitorModule module, final File file ) throws Exception
    {
        new DataLoaderOdfDom ( file, true ).load ( 0, new ScriptMonitorRowHandler ( configuration ) );
    }

}
