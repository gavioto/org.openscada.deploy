package org.openscada.atlantis.configurator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.script.ScriptException;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.openscada.atlantis.configurator.summary.SumLoader;
import org.openscada.atlantis.configurator.summary.SummaryGenerator;
import org.openscada.configuration.model.Module;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.impl.ConfiguratorPackageImpl;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.data.DataLoaderOdfDom;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.impl.ModelPackageImpl;
import org.openscada.deploy.iolist.utils.DuplicateItemsException;
import org.openscada.deploy.iolist.utils.ItemListReader;
import org.openscada.deploy.iolist.utils.SpreadSheetPoiHelper;

public class Application implements IApplication
{

    private static final Integer SUMMARY_REQUIRED_SIZE = Integer.getInteger ( "summary.requiredSize", 1 );

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

        final LinkedList<String> ioFiles = new LinkedList<String> ();

        final File base = new File ( FileLocator.toFileURL ( new URL ( project.getLegacyBaseDirectory () ) ).getFile () );
        final File generatedBase = new File ( base, "generated" );

        final Configuration cfg = new Configuration ( base );

        log.println ( "** 0 - Loading base json files" );
        for ( final String uri : project.getJsonBase () )
        {
            log.println ( "*** 0 - Loading base json file: " + uri );
            cfg.loadData ( uri );
        }

        final String basicsFile = project.getMainConfiguration ();

        log.println ( "** 0 - Loading scripts" );
        log.println ( "*** 0c - Summary groups" );
        ioFiles.push ( SumLoader.convertGroups ( cfg, new File ( base, "input/summary.ods" ), new File ( generatedBase, "IOList-generated-sum.xls" ), SUMMARY_REQUIRED_SIZE ) );

        for ( final Module module : project.getModules () )
        {
            log.println ( " ** Running module: " + module );
            module.process ( cfg, project );
        }

        final Collection<String> overrides = new LinkedList<String> ();

        log.println ( "** 1 - Loading data" );
        log.println ( "*** 1a - Loading basic configuration" );

        loadBasics ( log, cfg, new File ( FileLocator.toFileURL ( new URL ( basicsFile ) ).getFile () ) );

        ioFiles.addAll ( project.getIoListFile () );

        log.println ( "*** 1b - Loading data files" );
        for ( final String url : ioFiles )
        {
            if ( url == null )
            {
                continue;
            }

            log.println ( " * Processing " + url );

            final String file;
            if ( new File ( url ).exists () )
            {
                // check needed since the "old way" uses plain file names
                // and the check for "starting with /" does not work on "win32" platforms
                file = url;
            }
            else
            {
                file = FileLocator.toFileURL ( new URL ( url ) ).getFile ();
            }

            if ( !file.contains ( "override" ) )
            {
                log.println ( " ** Loading: " + file );
                final List<Item> loadedItems;
                if ( file.endsWith ( ".ods" ) )
                {
                    loadedItems = new ItemListReader ( new File ( file ) ).getItems ();
                }
                else
                {
                    loadedItems = SpreadSheetPoiHelper.loadExcel ( file );
                }
                cfg.addItems ( loadedItems );
                log.println ( String.format ( " ** Loaded %s items from %s", loadedItems.size (), file ) );
            }
            else
            {
                overrides.add ( file );
            }
        }

        log.println ( "*** 1e - Apply overrides" );
        for ( final String file : overrides )
        {
            if ( file.endsWith ( ".ods" ) )
            {
                cfg.applyOverrides ( new ItemListReader ( new File ( file ) ).getItems () );
            }
            else
            {
                cfg.applyOverrides ( SpreadSheetPoiHelper.loadExcel ( file ) );
            }
        }

        if ( project.getScriptOverrideDirectory () != null )
        {
            log.println ( "*** 1f - Apply script overrides - " + project.getScriptOverrideDirectory () );
            applyScriptOverrides ( new File ( FileLocator.toFileURL ( new URL ( project.getScriptOverrideDirectory () ) ).getFile () ), cfg );
        }

        log.println ( "** 3 - Process" );
        cfg.removeInactive ();
        SummaryGenerator.generateSummaryAlarms ( project, cfg, cfg.getItems (), SUMMARY_REQUIRED_SIZE );
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
            project = ConfigurationLoader.load ( new File ( file ) );
            processNew ( log, project );
        }
        else
        {
            // error
        }

    }

    private static void loadBasics ( final PrintStream log, final Configuration cfg, final File file ) throws Exception
    {
        log.println ( "Loading basics from: " + file );
        final DataLoaderOdfDom loader = new DataLoaderOdfDom ( file );

        log.println ( "**** 1aa - Loading basic configuration - Connections" );
        loader.load ( 0, new ConnectionHandler ( cfg ) );

        log.println ( "**** 1ab - Loading basic configuration - Authorizations" );
        loader.load ( 1, new AuthorizationHandler ( cfg ) );

        log.println ( "**** 1ac - Loading basic configuration - JMS Monitors" );
        loader.load ( 2, new JmsHandler ( cfg ) );

        log.println ( "**** 1ad - Loading basic configuration - AE" );
        loader.load ( 3, new AeHandler ( cfg ) );

        log.println ( "**** 1ae - Loading basic configuration - AE Filter" );
        loader.load ( 4, new EventFilterHandler ( cfg ) );
    }

    private static void applyScriptOverrides ( final File base, final Configuration cfg ) throws FileNotFoundException, ScriptException
    {
        for ( final File file : base.listFiles () )
        {
            cfg.applyScriptOverride ( file, base );
        }
    }
}
