package org.openscada.atlantis.configurator.script;

import java.io.File;

import org.openscada.atlantis.configurator.Configuration;
import org.openscada.atlantis.configurator.common.DataLoader;

public class ScriptLoader
{

    public static String loadScripts ( final Configuration cfg, final File file, final File generatedFile, final File outputDir ) throws Exception
    {
        final File scriptBase = file.getParentFile ();

        final DataLoader loader = new DataLoader ( file, true );
        final ScriptLoadHandler handler = new ScriptLoadHandler ( cfg, scriptBase );
        loader.load ( 0, handler );

        // SpreadSheetPoiHelper.writeSpreadsheet ( generatedFile.getAbsolutePath (), handler.getItems () );

        ScriptModule.create ( new File ( outputDir, "generated-scripts.xmi" ), handler.getItems () );

        return generatedFile.getAbsolutePath ();
    }

}
