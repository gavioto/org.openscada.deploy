package org.openscada.configurator.module.common.scripts.handler;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.data.DataLoaderOdfDom;
import org.openscada.configurator.module.common.scripts.ScriptsModule;

public class ScriptLoader
{

    public static void loadScripts ( final Configuration configuration, final Project project, final ScriptsModule module )
    {
        try
        {
            final File file = new File ( FileLocator.toFileURL ( new URL ( module.getScriptsFile () ) ).getFile () );

            final File scriptBase = file.getParentFile ();

            final DataLoaderOdfDom loader = new DataLoaderOdfDom ( file, true );
            final ScriptLoadHandler handler = new ScriptLoadHandler ( scriptBase );
            loader.load ( 0, handler );

            configuration.addItems ( handler.getItems () );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }

}
