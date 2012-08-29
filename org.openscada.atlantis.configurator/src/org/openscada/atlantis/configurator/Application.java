package org.openscada.atlantis.configurator;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.openscada.configuration.model.Module;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.impl.ConfiguratorPackageImpl;
import org.openscada.configurator.Configuration;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.impl.ModelPackageImpl;
import org.openscada.deploy.iolist.utils.DuplicateItemsException;

public class Application implements IApplication
{

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
        final Configuration cfg = new Configuration ();

        log.println ( "** 0 - Loading base json files" );
        for ( final String uri : project.getJsonBase () )
        {
            log.println ( "*** 0 - Loading base json file: " + uri );
            cfg.loadData ( uri );
        }

        log.println ( "** 0 - Running modules" );
        for ( final Module module : project.getModules () )
        {
            log.println ( " ** Running module: " + module );
            module.process ( cfg, project );
        }

        log.println ( "** 3 - Process" );

        cfg.generateItems ();
        cfg.generateGlobalSummaries ();

        log.println ( "** 4a - Validating" );
        cfg.validate ();

        log.println ( "** 5 - Output" );
        log.println ( " **  Base Dir: " + project.getOutputBase () );
        cfg.write ( new File ( FileLocator.toFileURL ( new URL ( project.getOutputBase () ) ).getFile () ) );

        log.println ( "** 5 - Output finished" );
        cfg.close ();
    }

    private static void process ( final PrintStream log, final String[] args ) throws Exception
    {
        final LinkedList<String> arguments = new LinkedList<String> ( Arrays.asList ( args ) );

        if ( arguments.peekFirst ().endsWith ( ".oscm" ) )
        {
            final Project project;
            final String file = arguments.pollFirst ();
            log.println ( String.format ( "** 0 - Using %s as project file", file ) );
            project = ProjectLoader.load ( new File ( file ) );
            processNew ( log, project );
        }
        else
        {
            throw new IllegalArgumentException ( "First parameters must be the name of the .oscm file" );
        }

    }

}
