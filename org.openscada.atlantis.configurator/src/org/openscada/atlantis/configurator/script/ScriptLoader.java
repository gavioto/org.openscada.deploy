package org.openscada.atlantis.configurator.script;

import java.io.File;

import org.openscada.configurator.data.DataLoader;

public class ScriptLoader
{

    public static void loadScripts ( final File file, final File outputDir ) throws Exception
    {
        if ( !file.exists () )
        {
            return;
        }

        final File scriptBase = file.getParentFile ();

        final DataLoader loader = new DataLoader ( file, true );
        final ScriptLoadHandler handler = new ScriptLoadHandler ( scriptBase );
        loader.load ( 0, handler );

        ScriptModule.create ( new File ( outputDir, "generated-scripts.xmi" ), handler.getItems () );
    }

}
