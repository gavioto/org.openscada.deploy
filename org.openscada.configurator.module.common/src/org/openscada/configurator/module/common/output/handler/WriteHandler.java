package org.openscada.configurator.module.common.output.handler;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.output.WriteOutput;

public class WriteHandler
{
    public void process ( final Configuration configuration, final WriteOutput module )
    {
        try
        {
            configuration.write ( new File ( FileLocator.toFileURL ( new URL ( module.getBaseDirectory () ) ).getFile () ) );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }
}
