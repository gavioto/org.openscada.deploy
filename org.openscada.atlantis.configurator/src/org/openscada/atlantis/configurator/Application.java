package org.openscada.atlantis.configurator;

import java.io.File;
import java.io.PrintStream;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.impl.ConfiguratorPackageImpl;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.impl.ModelPackageImpl;
import org.openscada.deploy.iolist.utils.DuplicateItemsException;

public class Application implements IApplication
{

    public static final String APPLICATION_ID = "org.openscada.atlantis.configurator.id1";

    @Override
    public Object start ( final IApplicationContext context ) throws Exception
    {
        final String[] args = (String[])context.getArguments ().get ( IApplicationContext.APPLICATION_ARGS );

        ModelPackageImpl.init ();
        ConfiguratorPackageImpl.init ();

        try
        {
            process ( System.out, args );
        }
        catch ( final DuplicateItemsException e )
        {
            System.err.println ( "Duplicate items:" );
            for ( final Item item : e.getItems () )
            {
                System.err.println ( String.format ( " -> '%s' (%s)", item.getAlias (), item.getDebugInformation () ) );
            }
        }

        return null;
    }

    @Override
    public void stop ()
    {
    }

    private static void processNew ( final PrintStream log, final Project project ) throws Exception
    {
        log.println ( "** 0 - Loading base json files" );

        log.println ( "** 0 - Running processors" );

        for ( final Processor processor : project.getProcessors () )
        {
            log.println ( " * Running processor: " + processor );
            processor.process ( project );
        }
    }

    private static void process ( final PrintStream log, final String[] args ) throws Exception
    {
        for ( final String file : args )
        {
            log.println ( String.format ( "** 0 - Using %s as project file", file ) );
            processNew ( log, ProjectLoader.load ( new File ( file ) ) );
        }
    }
}
