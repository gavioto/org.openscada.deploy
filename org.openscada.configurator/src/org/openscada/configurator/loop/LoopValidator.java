package org.openscada.configurator.loop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.openscada.configurator.loop.handler.FormulaHandler;
import org.openscada.configurator.loop.handler.LoopHandler;
import org.openscada.configurator.loop.handler.MultiSourceAttributeHandler;
import org.openscada.configurator.loop.handler.NoOpHandler;
import org.openscada.configurator.loop.handler.SimpleAttributeHandler;
import org.openscada.configurator.loop.handler.SummaryHandler;
import org.openscada.utils.str.StringHelper;

public class LoopValidator
{

    private final Map<String, LoopHandler> handlers = new HashMap<String, LoopHandler> ();

    private final Map<String, Map<String, Map<String, String>>> data;

    private final PrintStream logStream;

    private final Set<DataSourceDescriptor> descriptorPool = new HashSet<DataSourceDescriptor> ();

    public LoopValidator ( final Map<String, Map<String, Map<String, String>>> data, final PrintStream logStream )
    {
        this.data = data;
        this.logStream = logStream;
        initLoopHandler ();
        initFixedSources ();
    }

    private void initFixedSources ()
    {
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.NOT_AKN" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.OK" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.INIT" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.ALERT_ACTIVE" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.ALERT_DISABLED" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.NOT_OK_NOT_AKN" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.UNSAFE" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.INACTIVE" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.NOT_OK_AKN" ) );
        this.descriptorPool.add ( new DataSourceDescriptor ( "datasource", "ae.server.info.NOT_OK" ) );
    }

    private void initLoopHandler ()
    {
        this.handlers.put ( "org.openscada.ae.event.logger", new NoOpHandler () );
        this.handlers.put ( "org.openscada.ae.server.http.eventFilter", new NoOpHandler () );
        this.handlers.put ( "org.openscada.sec.provider.jdbc.authenticator", new NoOpHandler () );
        this.handlers.put ( "ae.monitor.query", new NoOpHandler () );

        this.handlers.put ( "da.connection", new SimpleHandler ( "connection" ) );

        this.handlers.put ( "da.dataitem.datasource", new SimpleAttributeHandler ( "datasource", "connection", "connection.id" ) );

        this.handlers.put ( "master.item", new SimpleAttributeHandler ( "datasource", "datasource", "datasource.id" ) );
        this.handlers.put ( "da.datasource.dataitem", new SimpleHandler ( "datasource" ) );
        this.handlers.put ( "org.openscada.da.datasource.script", new MultiSourceAttributeHandler ( "datasource." ) );
        this.handlers.put ( "org.openscada.da.datasource.sum", new MultiSourceAttributeHandler ( "datasource." ) );

        this.handlers.put ( "org.openscada.da.datasource.ds", new SimpleHandler ( "datasource" ) );

        this.handlers.put ( "org.openscada.da.server.osgi.summary.attribute", new SummaryHandler () );
        this.handlers.put ( "org.openscada.da.datasource.formula", new FormulaHandler () );

        this.handlers.put ( "ae.monitor.da.booleanAlarm", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );

        this.handlers.put ( "org.openscada.da.level.floor", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.level.ceil", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.level.highhigh", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.level.high", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.level.low", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.level.lowlow", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "da.master.handler.sum", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.negate.input", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.manual", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.master.common.block", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.round", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );

        this.handlers.put ( "org.openscada.da.mapper.osgi.configuredMapper", new SimpleHandler ( "mapper" ) );
        this.handlers.put ( "org.openscada.da.master.mapper", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );
        this.handlers.put ( "org.openscada.da.master.mapper", new SimpleAttributeHandler ( "masterHandler", "mapper", "mapper.id" ) );

        this.handlers.put ( "org.openscada.da.scale.input", new SimpleAttributeHandler ( "masterHandler", "datasource", "master.id" ) );

    }

    public void validate ()
    {
        final Set<DataSourceNode> nodes = load ();
        searchForLoops ( nodes );
    }

    public void writeDot ( final File dotFile ) throws FileNotFoundException
    {
        final Set<DataSourceNode> nodes = load ();

        System.out.println ( "Writing to: " + dotFile );

        final PrintWriter writer = new PrintWriter ( dotFile );

        writer.println ( "digraph {" );

        writer.println ( "  rankdir=LR" );

        for ( final DataSourceNode node : nodes )
        {
            if ( "datasource".equals ( node.getType () ) )
            {
                writer.println ( String.format ( "\"%s\"", node.getId () ) );
                writer.println ();
            }
        }

        for ( final DataSourceNode node : nodes )
        {
            if ( "datasource".equals ( node.getType () ) )
            {
                for ( final DataSourceNode refNode : node.getReferences () )
                {
                    writer.println ( String.format ( "\"%s\" -> \"%s\"", node.getId (), refNode.getId () ) );
                }
                writer.println ();
            }
        }

        writer.println ( "}" );

        writer.close ();
    }

    private Set<DataSourceNode> load ()
    {
        for ( final Map.Entry<String, Map<String, Map<String, String>>> factory : this.data.entrySet () )
        {
            processFactory ( factory.getKey (), factory.getValue () );
        }

        for ( final LoopHandler handler : this.handlers.values () )
        {
            if ( handler.providesPostProcessing () )
            {
                handler.postProcess ( this.descriptorPool );
            }
        }

        this.logStream.println ( String.format ( "%s datasources in pool", this.descriptorPool.size () ) );

        final Set<DataSourceNode> nodes = buildGraph ();
        return nodes;
    }

    private void searchForLoops ( final Set<DataSourceNode> nodes )
    {
        for ( final DataSourceNode node : nodes )
        {
            final Stack<DataSourceNode> stack = new Stack<DataSourceNode> ();
            walk ( stack, node );
        }
    }

    private void walk ( final Stack<DataSourceNode> stack, final DataSourceNode node )
    {
        if ( stack.contains ( node ) )
        {
            this.logStream.println ( "Loop found: " + StringHelper.join ( stack, " -> " ) );
            // loop found
            return;
        }

        stack.push ( node );
        for ( final DataSourceNode ref : node.getReferences () )
        {
            walk ( stack, ref );
        }
        stack.pop ();
    }

    private Set<DataSourceNode> buildGraph ()
    {
        final Map<DataSourceReference, DataSourceNode> nodes = new HashMap<DataSourceReference, DataSourceNode> ();

        // create nodes
        for ( final DataSourceDescriptor desc : this.descriptorPool )
        {
            final DataSourceNode node = new DataSourceNode ( desc.getType (), desc.getId () );
            nodes.put ( desc, node );
        }
        // connect nodes
        for ( final DataSourceDescriptor desc : this.descriptorPool )
        {
            final DataSourceNode node = nodes.get ( desc );
            for ( final DataSourceReference reference : desc.getReferences () )
            {
                final DataSourceNode ref = nodes.get ( reference );
                if ( ref == null )
                {
                    this.logStream.println ( String.format ( "Reference from %s to %s not found", desc, reference ) );
                }
                else
                {
                    node.addReference ( ref );
                }
            }
        }

        return new HashSet<DataSourceNode> ( nodes.values () );
    }

    private void processFactory ( final String factoryId, final Map<String, Map<String, String>> value )
    {
        final LoopHandler handler = this.handlers.get ( factoryId );
        if ( handler == null )
        {
            this.logStream.println ( "Ignoring factory: " + factoryId );
            // ignore
            return;
        }

        if ( !handler.providesDescriptors () )
        {
            return;
        }

        for ( final Map.Entry<String, Map<String, String>> configuration : value.entrySet () )
        {
            processConfiguration ( handler, factoryId, configuration.getKey (), configuration.getValue () );
        }
    }

    private void processConfiguration ( final LoopHandler handler, final String factoryId, final String configurationId, final Map<String, String> parameters )
    {
        final Set<DataSourceDescriptor> descriptors = handler.getNode ( configurationId, parameters );
        for ( final DataSourceDescriptor desc : descriptors )
        {
            if ( !this.descriptorPool.add ( desc ) )
            {
                this.logStream.println ( "Duplicate data source: " + desc.getId () );
            }
        }
    }
}
