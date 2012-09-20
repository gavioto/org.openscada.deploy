package org.openscada.configurator.module.common.handler;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.FileModule;

public abstract class AbstractFileHandler<M extends FileModule>
{
    public void process ( final Configuration configuration, final Project project, final M module ) throws Exception
    {
        try
        {
            for ( final String path : module.getPath () )
            {
                System.out.println ( " * Processing path : " + path );
                final File dir = new File ( FileLocator.toFileURL ( new URL ( path ) ).getFile () );
                if ( dir.isFile () && dir.canRead () && !isHidden(dir) )
                {
                    loadFile ( configuration, module, dir );
                }
                else
                {
                    System.out.println ( " * Loading directory : " + dir );
                    for ( final File file : dir.listFiles () )
                    {
                        if ( file.isFile () && file.canRead () && !isHidden ( file ) )
                        {
                            loadFile ( configuration, module, file );
                        }
                    }
                }
            }
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }

    private boolean isHidden ( File file )
    {
        return file.getName ().startsWith ( "." );
    }

    protected abstract void loadFile ( final Configuration configuration, M module, final File file ) throws Exception;
}
