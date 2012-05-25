package org.openscada.atlantis.configurator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.script.ScriptException;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.openscada.atlantis.configurator.common.DataLoader;
import org.openscada.atlantis.configurator.formula.FormulaModule;
import org.openscada.atlantis.configurator.script.ScriptModule;
import org.openscada.atlantis.configurator.summary.SumLoader;
import org.openscada.configuration.model.ConfiguratorFactory;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.impl.ConfiguratorPackageImpl;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.impl.ModelPackageImpl;
import org.openscada.deploy.iolist.utils.DuplicateItemsException;
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
            process ( args );
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

    private static void process ( final String[] args ) throws Exception
    {
        final LinkedList<String> arguments = new LinkedList<String> ( Arrays.asList ( args ) );

        final Project project;

        if ( arguments.peekFirst ().endsWith ( ".oscm" ) )
        {
            final String file = arguments.pollFirst ();
            System.out.println ( String.format ( "** 0 - Using %s as project file", file ) );
            project = ConfigurationLoader.load ( new File ( file ) );
        }
        else
        {
            project = ConfiguratorFactory.eINSTANCE.createProject ();
        }

        final File scriptDBase = new File ( arguments.pop () );
        final File base = new File ( arguments.pop () );
        final File scriptBase = new File ( base, "script/js" );
        final File generatedBase = new File ( base, "generated" );

        final Configuration cfg = new Configuration ( base );

        System.out.println ( "** 0 - Loading base json files" );
        for ( final String uri : project.getJsonBase () )
        {
            System.out.println ( "*** 0 - Loading base json file: " + uri );
            cfg.loadData ( uri );
        }

        final String outFile = arguments.pop ();
        final String basicsFile = arguments.pop ();

        System.out.println ( "** 0 - Loading scripts" );
        System.out.println ( "*** 0a - Script Loader" );
        org.openscada.atlantis.configurator.script.ScriptLoader.loadScripts ( cfg, new File ( base, "input/scripts.ods" ), new File ( generatedBase, "IOList-generated-script.xls" ), new File ( base, "input/scripts" ) );
        System.out.println ( "*** 0b - Formulas Loader" );
        arguments.push ( ScriptLoader.loadScript ( cfg, new File ( base, "input/PARSERformulas" ), scriptBase, new File ( generatedBase, "IOList-generated-formulas-script.xls" ) ) );
        System.out.println ( "*** 0c - Summary groups" );
        arguments.push ( SumLoader.convertGroups ( cfg, new File ( base, "input/summary.ods" ), new File ( generatedBase, "IOList-generated-sum.xls" ), SUMMARY_REQUIRED_SIZE ) );

        arguments.push ( processNetwork ( System.getProperty ( "prefix", "XXX" ), base, generatedBase ) );

        final Collection<String> overrides = new LinkedList<String> ();

        System.out.println ( "** 1 - Loading data" );
        System.out.println ( "*** 1a - Loading basic configuration" );
        loadBasics ( cfg, new File ( basicsFile ) );

        System.out.println ( "*** 1b - Loading data files" );
        for ( final String file : arguments )
        {
            if ( !file.contains ( "override" ) )
            {
                System.out.println ( " ** Loading: " + file );
                final List<Item> loadedItems = SpreadSheetPoiHelper.loadExcel ( file );
                cfg.addItems ( loadedItems );
                System.out.println ( String.format ( " ** Loaded %s items from %s", loadedItems.size (), file ) );
            }
            else
            {
                overrides.add ( file );
            }
        }

        System.out.println ( "*** 1c - Process Formulas" );
        FormulaModule.process ( new File ( base, "input/formulas" ), cfg );

        System.out.println ( "*** 1d - Process Scripts" );
        ScriptModule.process ( new File ( base, "input/scripts" ), cfg );

        System.out.println ( "*** 1e - Apply overrides" );
        for ( final String file : overrides )
        {
            cfg.applyOverrides ( SpreadSheetPoiHelper.loadExcel ( file ) );
        }

        System.out.println ( "*** 1f - Apply script overrides" );
        applyScriptOverrides ( scriptDBase, cfg );

        System.out.println ( "** 3 - Process" );
        cfg.removeInactive ();
        cfg.generateSummaryAlarms ( SUMMARY_REQUIRED_SIZE );
        cfg.generateItems ();
        cfg.generateGlobalSummaries ();

        System.out.println ( "** 4a - Validating" );
        cfg.validate ();

        System.out.println ( "** 5 - Output" );
        System.out.println ( " **  Base Dir: " + outFile );
        cfg.write ( new File ( outFile ), new File ( base, "input" ) );

        System.out.println ( "** 5 - Output finished" );
        cfg.close ();
    }

    private static void loadBasics ( final Configuration cfg, final File file ) throws IOException
    {
        System.out.println ( "Loading basics from: " + file );
        final DataLoader loader = new DataLoader ( file );

        System.out.println ( "**** 1aa - Loading basic configuration - Connections" );
        loader.load ( 0, new ConnectionHandler ( cfg ) );

        System.out.println ( "**** 1ab - Loading basic configuration - Authorizations" );
        loader.load ( 1, new AuthorizationHandler ( cfg ) );

        System.out.println ( "**** 1ac - Loading basic configuration - JMS Monitors" );
        loader.load ( 2, new JmsHandler ( cfg ) );

        System.out.println ( "**** 1ad - Loading basic configuration - AE" );
        loader.load ( 3, new AeHandler ( cfg ) );

        System.out.println ( "**** 1ae - Loading basic configuration - AE Filter" );
        loader.load ( 4, new EventFilterHandler ( cfg ) );
    }

    private static String processNetwork ( final String prefix, final File base, final File generatedBase ) throws Exception
    {
        System.out.println ( "*** 0d - Processing network" );
        final File outListFile = new File ( generatedBase, "IOList-generated-exec.xls" );
        final File sourceFile = new File ( base, "input/network.ods" );
        final File xmlOutFile = new File ( generatedBase, "network.xml" );
        org.openscada.atlantis.configurator.exec.Application.process ( prefix, outListFile.getAbsolutePath (), sourceFile.getAbsolutePath (), xmlOutFile.getAbsolutePath () );

        return outListFile.getAbsolutePath ();
    }

    private static void applyScriptOverrides ( final File base, final Configuration cfg ) throws FileNotFoundException, ScriptException
    {
        for ( final File file : base.listFiles () )
        {
            cfg.applyScriptOverride ( file, base );
        }
    }
}
