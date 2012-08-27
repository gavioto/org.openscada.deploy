package org.openscada.atlantis.configurator.script;

import java.io.File;

import org.openscada.configurator.data.DataLoaderOdfDom;

public class ScriptLoader
{

    public static void loadScripts ( final File file, final File outputDir ) throws Exception
    {
        if ( !file.exists () )
        {
            return;
        }

        final File scriptBase = file.getParentFile ();

        final DataLoaderOdfDom loader = new DataLoaderOdfDom ( file, true );
        final ScriptLoadHandler handler = new ScriptLoadHandler ( scriptBase );
        loader.load ( 0, handler );

        ScriptModule.create ( new File ( outputDir, "generated-scripts.xmi" ), handler.getItems () );
    }

}
