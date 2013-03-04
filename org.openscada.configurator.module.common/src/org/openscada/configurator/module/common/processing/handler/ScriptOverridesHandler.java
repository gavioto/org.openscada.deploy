package org.openscada.configurator.module.common.processing.handler;

import java.io.File;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.handler.AbstractFileHandler;
import org.openscada.configurator.module.common.processing.ScriptOverrides;

public class ScriptOverridesHandler extends AbstractFileHandler<ScriptOverrides>
{

    @Override
    protected void loadFile ( final Configuration configuration, final ScriptOverrides module, final File file ) throws Exception
    {
        configuration.applyScriptOverride ( file );
    }
}
