package org.openscada.atlantis.configurator.script;

import java.io.File;

import org.openscada.atlantis.configurator.GenericMasterConfiguration;
import org.openscada.configurator.DataLoader;

public class ScriptLoader
{

    public static void loadScripts ( final GenericMasterConfiguration cfg, final File file, final File generatedFile, final File outputDir ) throws Exception
    {
        if ( !file.exists () )
        {
            return;
        }

        final File scriptBase = file.getParentFile ();

        final DataLoader loader = new DataLoader ( file, true );
        final ScriptLoadHandler handler = new ScriptLoadHandler ( cfg, scriptBase );
        loader.load ( 0, handler );

        // SpreadSheetPoiHelper.writeSpreadsheet ( generatedFile.getAbsolutePath (), handler.getItems () );

        ScriptModule.create ( new File ( outputDir, "generated-scripts.xmi" ), handler.getItems () );
    }

}
