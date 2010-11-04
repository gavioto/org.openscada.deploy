package org.openscada.atlantis.configurator.summary;

import java.io.File;

import org.openscada.atlantis.configurator.Configuration;
import org.openscada.atlantis.configurator.common.DataLoader;
import org.openscada.deploy.iolist.utils.SpreadSheetHelper;


public class ScriptLoader
{

    public static String loadScripts ( final Configuration cfg, final File file, final File generatedFile ) throws Exception
    {
        final File scriptBase = file.getParentFile ();

        final DataLoader loader = new DataLoader ( file, true );
        final ScriptLoadHandler handler = new ScriptLoadHandler ( cfg, scriptBase );
        loader.load ( 0, handler );

        SpreadSheetHelper.writeSpreadsheet ( generatedFile.getAbsolutePath (), handler.getItems () );

        return generatedFile.getAbsolutePath ();
    }

}
