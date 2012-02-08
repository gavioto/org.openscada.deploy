package org.openscada.atlantis.configurator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.openscada.atlantis.configurator.loop.LoopValidator;
import org.openscada.atlantis.configurator.report.DataItem;
import org.openscada.atlantis.configurator.report.DataItemSource;
import org.openscada.atlantis.configurator.report.FormulaSource;
import org.openscada.atlantis.configurator.report.LocalBooleanMonitor;
import org.openscada.atlantis.configurator.report.LocalLevelMonitor;
import org.openscada.atlantis.configurator.report.Report;
import org.openscada.atlantis.configurator.report.ScriptSource;
import org.openscada.atlantis.configurator.report.Source;
import org.openscada.atlantis.configurator.summary.SummaryGenerator;
import org.openscada.core.VariantType;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.FormulaInput;
import org.openscada.deploy.iolist.model.FormulaItem;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ScriptItem;
import org.openscada.deploy.iolist.model.ScriptModule;
import org.openscada.deploy.iolist.model.ScriptOutput;
import org.openscada.deploy.iolist.model.SummaryItem;
import org.openscada.deploy.iolist.utils.DuplicateItemsException;
import org.openscada.deploy.iolist.utils.SpreadSheetPoiHelper;
import org.openscada.utils.lang.Pair;
import org.openscada.utils.str.StringHelper;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Configuration extends GenericMasterConfiguration
{

    private final List<Item> items = new ArrayList<Item> ();

    private final PrintStream logStream;

    private final File base;

    private final Report report;

    private static Integer maxItemLimit = Integer.getInteger ( "maxItemLimit", null ); //$NON-NLS-1$

    public Configuration ( final File base ) throws Exception
    {
        this.base = base;
        this.logStream = System.out;

        this.report = new Report ();

        // add ignore fields

        addIgnoreFields ( "org.openscada.da.manual", "value", "user", "reason", "timestamp" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        addIgnoreFields ( "org.openscada.da.master.common.block", "note", "active", "user", "timestamp" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

        addIgnoreFields ( "org.openscada.da.level.high", "preset", "active" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        addIgnoreFields ( "org.openscada.da.level.highhigh", "preset", "active" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        addIgnoreFields ( "org.openscada.da.level.low", "preset", "active" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        addIgnoreFields ( "org.openscada.da.level.lowlow", "preset", "active" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        addIgnoreFields ( "org.openscada.da.level.ceil", "preset", "active" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        addIgnoreFields ( "org.openscada.da.level.floor", "preset", "active" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

        addIgnoreFields ( "org.openscada.da.scale.input", "active", "factor" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

        addAEInfo ();
    }

    private void addAEInfo ()
    {
        final Map<String, Object> data = new HashMap<String, Object> ();
        data.put ( "prefix", "ae.server.info" ); //$NON-NLS-1$ //$NON-NLS-2$
        addData ( "ae.server.info", "ae.server.info.all", data ); //$NON-NLS-1$ //$NON-NLS-2$
    }

    private void addSummary ( final String string, final Set<String> blacklist )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "attribute", string ); //$NON-NLS-1$
        data.put ( "onlyMaster", true ); //$NON-NLS-1$

        int i = 0;
        for ( final String entry : blacklist )
        {
            data.put ( "blacklist." + i++, entry ); //$NON-NLS-1$
        }

        addData ( "org.openscada.da.server.osgi.summary.attribute", "summary." + string, data ); //$NON-NLS-1$ //$NON-NLS-2$
    }

    public void addItems ( final List<? extends Item> items )
    {
        if ( maxItemLimit == null )
        {
            this.items.addAll ( items );
        }
        else
        {
            for ( final Item item : items )
            {
                if ( this.items.size () > maxItemLimit )
                {
                    break;
                }
                this.items.add ( item );
            }
        }
    }

    public void addMonitorQuery ( final String id, final String filter )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();
        data.put ( "filter", filter ); //$NON-NLS-1$
        addData ( "ae.monitor.query", id, data ); //$NON-NLS-1$
    }

    public void addEventQuery ( final String id, final String filter, final int size )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();
        data.put ( "filter", filter ); //$NON-NLS-1$
        data.put ( "size", size ); //$NON-NLS-1$
        addData ( "org.openscada.ae.server.common.event.pool", id, data ); //$NON-NLS-1$
    }

    public void addAuthorizationScript ( final String id, final String script, final int priority, final String idFilter, final String typeFilter, final String actionFilter )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();
        data.put ( "script", script ); //$NON-NLS-1$
        data.put ( "priority", priority ); //$NON-NLS-1$
        data.put ( "for.id", idFilter ); //$NON-NLS-1$
        data.put ( "for.type", typeFilter ); //$NON-NLS-1$
        data.put ( "for.action", actionFilter ); //$NON-NLS-1$
        addData ( "org.openscada.sec.provider.script.factory", id, data ); //$NON-NLS-1$
    }

    public void addScriptComponent ( final String id, final String scriptEngine, final String script, final Map<String, String> properties )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        if ( scriptEngine != null )
        {
            data.put ( "scriptEngine", scriptEngine );//$NON-NLS-1$
        }
        data.put ( "script", script );//$NON-NLS-1$
        injectAttributes ( properties, "property.", data );//$NON-NLS-1$

        addData ( "org.openscada.da.component.script", id, data );//$NON-NLS-1$
    }

    /**
     * Generate global summaries
     */
    public void generateGlobalSummaries ()
    {
        final Set<String> blacklist = new HashSet<String> ();

        final Set<String> summaries = new HashSet<String> ();
        summaries.add ( "error" ); //$NON-NLS-1$
        summaries.add ( "alarm" ); //$NON-NLS-1$
        summaries.add ( "manual" ); //$NON-NLS-1$
        summaries.add ( "blocked" ); //$NON-NLS-1$

        // summaries
        for ( final Item item : this.items )
        {
            for ( final String summary : summaries )
            {
                if ( item.getName () == null )
                {
                    continue;
                }

                if ( item.getName ().equals ( "summary." + summary ) ) //$NON-NLS-1$
                {
                    final String masterId = item.getAlias () + ".master"; //$NON-NLS-1$
                    blacklist.add ( masterId );
                    this.logStream.println ( String.format ( "Adding %s as blacklist for summaries", masterId ) ); //$NON-NLS-1$
                }
            }
        }

        for ( final String summary : summaries )
        {
            addSummary ( summary, blacklist );
        }
    }

    /**
     * Generated blocks based on location and component
     */
    public void generateSummeryBlocks ()
    {
        final Multimap<Pair<String, String>, String> locMap = HashMultimap.create ();

        for ( final Item item : this.items )
        {
            if ( item.getLocation () == null || item.getComponent () == null || item.getLocation ().length () == 0 || item.getComponent ().length () == 0 )
            {
                continue;
            }

            final Pair<String, String> loc = new Pair<String, String> ( item.getLocation (), item.getComponent () );

            locMap.put ( loc, makeMasterId ( item ) );
        }

        for ( final Pair<String, String> key : locMap.keySet () )
        {
            final Collection<String> values = locMap.get ( key );

            final Map<String, String> attributes = new HashMap<String, String> ();

            attributes.put ( "location", key.first );
            attributes.put ( "component", key.second );

            addBlock ( key + ".block", new ArrayList<String> ( values ), attributes ); //$NON-NLS-1$
        }
    }

    private void addBlock ( final String blockId, final String masterId, final Map<String, String> attributes )
    {
        addBlock ( blockId, Arrays.asList ( masterId ), attributes );
    }

    private void addBlock ( final String blockId, final List<String> masterIds, final Map<String, String> attributes )
    {
        if ( masterIds.isEmpty () )
        {
            return;
        }

        Collections.sort ( masterIds );

        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "master.id", StringHelper.join ( masterIds, "," ) ); //$NON-NLS-1$ //$NON-NLS-2$

        injectAttributes ( attributes, "info.", data );

        addData ( "org.openscada.da.master.common.block", blockId, data ); //$NON-NLS-1$
    }

    /**
     * Generate summary alarms based on location and component
     */
    public void generateSummaryAlarms ( final int requiredSize )
    {
        SummaryGenerator.generateSummaryAlarms ( this, this.items, requiredSize );
    }

    public String makeInternalItemId ( final Item item )
    {
        if ( item.getAlias () == null )
        {
            return item.getName ();
        }
        else
        {
            return item.getAlias ();
        }
    }

    public String makeMasterId ( final Item item )
    {
        return makeInternalItemId ( item ) + ".master"; //$NON-NLS-1$
    }

    public DataItem getReportItem ( final String id )
    {
        return this.report.getItem ( id );
    }

    /**
     * Generate configuration for currently known items
     * @throws Exception
     */
    public void generateItems () throws Exception
    {
        final Set<String> connections = new HashSet<String> ();

        for ( final Item item : this.items )
        {
            if ( item.getDevice () != null && !item.getDevice ().isEmpty () )
            {
                connections.add ( item.getDevice () );
            }

            final String itemId = item.getName ();

            final String internalItemId = makeInternalItemId ( item );
            final String masterId = makeMasterId ( item );

            final DataItem reportItem = this.report.getItem ( internalItemId );

            String sourceId;

            if ( item instanceof FormulaItem )
            {
                sourceId = internalItemId + ".formula"; //$NON-NLS-1$
                processFormulaItem ( sourceId, (FormulaItem)item );

                reportItem.setValueSource ( createFormulaSource ( (FormulaItem)item ) );
            }
            else if ( item instanceof ScriptItem )
            {
                sourceId = internalItemId + ".script"; //$NON-NLS-1$
                processScriptItem ( sourceId, (ScriptItem)item );

                reportItem.setValueSource ( createScriptSource ( (ScriptItem)item ) );
            }
            else if ( "ds".equalsIgnoreCase ( item.getDevice () ) ) //$NON-NLS-1$
            {
                sourceId = item.getName () + ".ds"; //$NON-NLS-1$
                addDSDataSource ( sourceId );
            }
            else if ( item.getDevice () != null && !"".equals ( item.getDevice () ) ) //$NON-NLS-1$
            {
                sourceId = internalItemId + ".source"; //$NON-NLS-1$

                addSource ( sourceId, itemId, item.getDevice ().toLowerCase () );

                reportItem.setValueSource ( new DataItemSource ( itemId, item.getDevice ().toLowerCase () ) );
            }
            else
            {
                sourceId = item.getName ();
            }

            reportItem.setInternalId ( masterId );

            addMaster ( masterId, sourceId );
            addAlias ( internalItemId + ".alias", internalItemId, masterId, item.getDescription () ); //$NON-NLS-1$
            if ( item.isDefaultChain () )
            {
                addDefaultChain ( masterId );
            }

            final Map<String, String> attributes = new HashMap<String, String> ();
            attributes.put ( "location", item.getLocation () ); //$NON-NLS-1$
            attributes.put ( "component", item.getComponent () ); //$NON-NLS-1$
            if ( item.getDevice () != null )
            {
                attributes.put ( "hive", item.getDevice ().toUpperCase () ); //$NON-NLS-1$
            }
            if ( item.getSystem () != null )
            {
                attributes.put ( "system", item.getSystem ().toUpperCase () ); //$NON-NLS-1$
            }
            attributes.put ( "message", item.getDescription () ); //$NON-NLS-1$
            attributes.put ( "item", internalItemId ); //$NON-NLS-1$

            reportItem.setBasicInformation ( attributes.get ( "hive" ), attributes.get ( "system" ), attributes.get ( "location" ), attributes.get ( "component" ), attributes.get ( "message" ), item.isEventCommand () ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

            if ( item.isRemoteBool () )
            {
                addRemoteValueMonitor ( masterId + ".remote.monitor", masterId, "remote.ackRequired", "remote.ackRequired.timestamp", "ALM", attributes, item.getRemoteBoolAckValue () ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
            }
            if ( item.isLocalBoolAvailable () )
            {
                String reference;
                if ( item.getLocalBool () == null )
                {
                    reference = null;
                }
                else
                {
                    reference = item.getLocalBool () ? "true" : "false"; //$NON-NLS-1$ //$NON-NLS-2$
                }

                addLocalMonitor ( masterId + ".local.monitor", masterId, reference, item.isLocalBoolAck (), item.getDescription (), attributes ); //$NON-NLS-1$
                reportItem.addMonitor ( new LocalBooleanMonitor ( reference, item.isLocalBoolAck () ) );
            }
            makeRemoteLevels ( item, reportItem, masterId, attributes );
            makeLocalLevels ( item, reportItem, masterId, attributes );

            if ( item.isEventCommand () )
            {
                addWriteLogger ( internalItemId + ".logger", masterId, attributes ); //$NON-NLS-1$
            }
            addNegate ( masterId + ".negate", masterId, false ); //$NON-NLS-1$
            reportItem.addFeature ( Messages.getString ( "Configuration.report.feature.negate" ) ); //$NON-NLS-1$

            if ( item.isLocalManual () )
            {
                addLocalManual ( masterId + ".manual", masterId, attributes ); //$NON-NLS-1$
                reportItem.addFeature ( Messages.getString ( "Configuration.report.feature.manual" ) ); //$NON-NLS-1$
            }

            if ( item.isLocalScaleAvailable () )
            {
                addLocalScale ( masterId + ".scale", masterId, item.getLocalScaleFactor (), item.getLocalScaleOffset (), attributes ); //$NON-NLS-1$
                addLocalScaleFeature ( item, reportItem );
            }

            if ( item.isListMonitorPreset () )
            {
                addListMonitor ( masterId + ".listMonitor", masterId, item.isListMonitorListIsAlarm (), item.getListMonitorItems (), item.isListMonitorAckRequired (), item.getDescription (), attributes ); //$NON-NLS-1$
            }

            if ( item.isBlock () )
            {
                addBlock ( masterId + ".block", masterId, attributes ); //$NON-NLS-1$
                reportItem.addFeature ( Messages.getString ( "Configuration.report.feature.block" ) ); //$NON-NLS-1$
            }
        }

        validateConnections ( connections );
    }

    private void addLocalScaleFeature ( final Item item, final DataItem reportItem )
    {
        final StringBuilder sb = new StringBuilder ( Messages.getString ( "Configuration.report.feature.scale.1" ) ); //$NON-NLS-1$
        if ( item.getLocalScaleFactor () != null )
        {
            sb.append ( String.format ( Messages.getString ( "Configuration.report.feature.scale.2" ), item.getLocalScaleFactor () ) ); //$NON-NLS-1$
        }
        else
        {
            sb.append ( Messages.getString ( "Configuration.report.feature.scale.3" ) ); //$NON-NLS-1$
        }
        if ( item.getLocalScaleOffset () != null )
        {
            sb.append ( String.format ( Messages.getString ( "Configuration.report.feature.scale.4" ), item.getLocalScaleOffset () ) ); //$NON-NLS-1$
        }
        else
        {
            sb.append ( Messages.getString ( "Configuration.report.feature.scale.5" ) ); //$NON-NLS-1$
        }

        reportItem.addFeature ( sb.toString () );
    }

    private Source createScriptSource ( final ScriptItem item )
    {
        return new ScriptSource ( item );
    }

    private Source createFormulaSource ( final FormulaItem item )
    {
        return new FormulaSource ( item );
    }

    private void processFormulaItem ( final String id, final FormulaItem item ) throws Exception
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        if ( item.getWriteValueName () != null && !item.getWriteValueName ().isEmpty () )
        {
            data.put ( "writeValueName", item.getWriteValueName () ); //$NON-NLS-1$
        }
        if ( item.getOutputDatasourceId () != null && !item.getOutputDatasourceId ().isEmpty () )
        {
            data.put ( "outputDatasource.id", item.getOutputDatasourceId () ); //$NON-NLS-1$
        }
        if ( item.getOutputFormula () != null && !item.getOutputFormula ().isEmpty () )
        {
            data.put ( "outputFormula", item.getOutputFormula () ); //$NON-NLS-1$
        }
        if ( item.getOutputDatasourceType () != null )
        {
            data.put ( "outputDatasource.type", convert ( item.getOutputDatasourceType () ) ); //$NON-NLS-1$
        }

        if ( item.getInputFormula () != null && !item.getInputFormula ().isEmpty () )
        {
            data.put ( "inputFormula", item.getInputFormula () ); //$NON-NLS-1$
        }

        for ( final FormulaInput input : item.getInputs () )
        {
            data.put ( "datasource." + input.getName (), input.getDatasourceId () ); //$NON-NLS-1$
            if ( input.getType () != null )
            {
                data.put ( "datasourceType." + input.getName (), convert ( input.getType () ) ); //$NON-NLS-1$
            }
        }

        if ( item.getInitScript () != null && !item.getInitScript ().isEmpty () )
        {
            data.put ( "init.0", item.getInitScript () ); //$NON-NLS-1$
        }

        int i = 1;
        for ( final ScriptModule module : item.getScriptModules () )
        {
            if ( module.isResource () )
            {
                data.put ( "init." + i, loadFromFile ( new File ( this.base, module.getData () ) ) ); //$NON-NLS-1$
            }
            else
            {
                data.put ( "init." + i, module.getData () ); //$NON-NLS-1$
            }
            i++;
        }

        addData ( "org.openscada.da.datasource.formula", id, data ); //$NON-NLS-1$
    }

    private void processScriptItem ( final String id, final ScriptItem item ) throws Exception
    {
        addScript ( id, item.getScriptEngine (), makeMapInputs ( item.getInputs () ), makeMapOutputs ( item.getOutputs () ), item.getInitScript (), item.getUpdateScript (), item.getTimerScript (), item.getTimerPeriod (), item.getWriteCommand () );
    }

    private Map<String, String> makeMapOutputs ( final EList<ScriptOutput> outputs )
    {
        final Map<String, String> result = new HashMap<String, String> ();

        for ( final ScriptOutput output : outputs )
        {
            result.put ( output.getName (), output.getDatasourceId () );
        }

        return result;
    }

    private Map<String, String> makeMapInputs ( final EList<FormulaInput> inputs )
    {
        final Map<String, String> result = new HashMap<String, String> ();

        for ( final FormulaInput input : inputs )
        {
            result.put ( input.getName (), input.getDatasourceId () );
        }

        return result;
    }

    private String convert ( final DataType type )
    {
        switch ( type )
        {
        case BOOLEAN:
            return VariantType.BOOLEAN.name ();
        case INTEGER:
            return VariantType.INT32.name ();
        case LONG_INTEGER:
            return VariantType.INT64.name ();
        case STRING:
            return VariantType.STRING.name ();
        case FLOAT:
            return VariantType.DOUBLE.name ();
        case VARIANT:
            return null;
        }
        return null;
    }

    private void validateConnections ( final Set<String> connections )
    {
        System.out.flush ();
        final Map<String, Map<String, Object>> connnectionData = this.data.get ( "da.connection" ); //$NON-NLS-1$
        for ( final String device : connections )
        {
            if ( !connnectionData.containsKey ( device ) )
            {
                System.err.println ( String.format ( "Connection '%s' is undefined!", device ) ); //$NON-NLS-1$
            }
        }
        System.err.flush ();
    }

    private void addDSDataSource ( final String id )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        addData ( "org.openscada.da.datasource.ds", id, data ); //$NON-NLS-1$
    }

    private void addLocalManual ( final String id, final String masterId, final Map<String, String> attributes )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "master.id", masterId ); //$NON-NLS-1$

        applyInfoAttributes ( attributes, data );

        addData ( "org.openscada.da.manual", id, data ); //$NON-NLS-1$
    }

    public void addScript ( final String id, final String engine, final Map<String, String> dataSources, final Map<String, String> outputs, final String init, final String update, final String timerCommand, final Long timer, final String write )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        if ( engine != null && !engine.isEmpty () )
        {
            data.put ( "engine", engine ); //$NON-NLS-1$
        }

        for ( final Map.Entry<String, String> entry : dataSources.entrySet () )
        {
            data.put ( "datasource." + entry.getKey (), entry.getValue () ); //$NON-NLS-1$
        }

        if ( init != null )
        {
            data.put ( "init", init ); //$NON-NLS-1$
        }
        if ( update != null )
        {
            data.put ( "updateCommand", update ); //$NON-NLS-1$
        }
        if ( outputs != null && !outputs.isEmpty () )
        {
            final Set<String> oldSources = new HashSet<String> ();
            for ( final Map.Entry<String, String> entry : outputs.entrySet () )
            {
                if ( entry.getKey () == null )
                {
                    oldSources.add ( entry.getValue () );
                }
                else
                {
                    data.put ( "writeSource." + entry.getKey (), entry.getValue () ); //$NON-NLS-1$
                }
            }
            if ( !oldSources.isEmpty () )
            {
                data.put ( "writeSources", StringHelper.join ( oldSources, "," ) ); //$NON-NLS-1$ //$NON-NLS-2$
            }
        }
        if ( timer != null )
        {
            data.put ( "timer", timer ); //$NON-NLS-1$
        }
        if ( timerCommand != null )
        {
            data.put ( "timerCommand", timerCommand ); //$NON-NLS-1$
        }
        data.put ( "writeCommand", write ); //$NON-NLS-1$

        addData ( "org.openscada.da.datasource.script", id, data ); //$NON-NLS-1$
    }

    public void addScript ( final String id, final String engine, final Map<String, String> dataSources, final File initFile, final File updateFile ) throws Exception
    {
        addScript ( id, engine, dataSources, null, loadFromFile ( initFile ), loadFromFile ( updateFile ), null, null, null );
    }

    static final String NL = System.getProperty ( "line.separator" ); //$NON-NLS-1$

    private static final String BOOLEAN_ALARM_MONITOR_FACTORY_ID = "ae.monitor.da.booleanAlarm"; //$NON-NLS-1$

    private static final String LIST_ALARM_MONITOR_FACTORY_ID = "ae.monitor.da.listAlarm"; //$NON-NLS-1$

    /**
     * Loads text data from a file
     * @param file
     * @return
     * @throws Exception
     */
    public static String loadFromFile ( final File file ) throws Exception
    {
        if ( file == null )
        {
            return null;
        }

        final BufferedReader reader = new BufferedReader ( new FileReader ( file ) );
        try
        {
            final StringBuilder sb = new StringBuilder ();
            String line;
            while ( ( line = reader.readLine () ) != null )
            {
                sb.append ( line );
                sb.append ( NL );
            }

            return sb.toString ();
        }
        finally
        {
            reader.close ();
        }
    }

    private void addLocalScale ( final String id, final String masterId, final Double localScaleFactor, final Double localScaleOffset, final Map<String, String> attributes )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "active", "" + ( localScaleFactor != null || localScaleOffset != null ) ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "factor", "" + localScaleFactor != null ? localScaleFactor : "1.0" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        data.put ( "offset", "" + localScaleOffset != null ? localScaleOffset : "0.0" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

        applyInfoAttributes ( attributes, data );

        addData ( "org.openscada.da.scale.input", id, data ); //$NON-NLS-1$
    }

    private void addNegate ( final String id, final String masterId, final boolean active )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "active", "" + active ); //$NON-NLS-1$ //$NON-NLS-2$

        addData ( "org.openscada.da.negate.input", id, data ); //$NON-NLS-1$
    }

    private void addWriteLogger ( final String id, final String masterId, final Map<String, String> attributes )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "source", masterId ); //$NON-NLS-1$
        data.put ( "logValue", true ); //$NON-NLS-1$
        data.put ( "logAttributes", false ); //$NON-NLS-1$
        data.put ( "logSubscription", true ); //$NON-NLS-1$

        applyInfoAttributes ( attributes, data );

        addData ( "org.openscada.ae.event.logger", id, data ); //$NON-NLS-1$
    }

    public void validate ()
    {
        checkForDuplicates ();
        checkForLoops ();
    }

    public void exportToDot ( final File dotFile ) throws IOException
    {
        new LoopValidator ( this.data, this.logStream ).writeDot ( dotFile );
    }

    private void checkForLoops ()
    {
        new LoopValidator ( this.data, this.logStream ).validate ();
    }

    private void checkForDuplicates ()
    {
        final Set<String> alias = new HashSet<String> ();
        final Collection<Item> duplicates = new LinkedList<Item> ();
        for ( final Item item : this.items )
        {
            if ( alias.contains ( item.getAlias () ) )
            {
                duplicates.add ( item );
            }
            else
            {
                alias.add ( item.getAlias () );
            }
        }
        if ( !duplicates.isEmpty () )
        {
            throw new DuplicateItemsException ( duplicates );
        }
    }

    private void makeLocalLevels ( final Item item, final DataItem reportItem, final String masterId, final Map<String, String> attributes )
    {
        if ( item.getLocalMin () != null )
        {
            makeLocalLevel ( reportItem, masterId, "floor", true, item.isLocalMinAck (), item.getLocalMin (), attributes ); //$NON-NLS-1$
        }
        if ( item.getLocalMax () != null )
        {
            makeLocalLevel ( reportItem, masterId, "ceil", true, item.isLocalMaxAck (), item.getLocalMax (), attributes ); //$NON-NLS-1$
        }
        if ( item.isLocalHighHighAvailable () )
        {
            makeLocalLevel ( reportItem, masterId, "highhigh", false, item.isLocalHighHighAck (), item.getLocalHighHighPreset (), attributes ); //$NON-NLS-1$
        }
        if ( item.isLocalHighAvailable () )
        {
            makeLocalLevel ( reportItem, masterId, "high", false, item.isLocalHighAck (), item.getLocalHighPreset (), attributes ); //$NON-NLS-1$
        }
        if ( item.isLocalLowAvailable () )
        {
            makeLocalLevel ( reportItem, masterId, "low", false, item.isLocalLowAck (), item.getLocalLowPreset (), attributes ); //$NON-NLS-1$
        }
        if ( item.isLocalLowLowAvailable () )
        {
            makeLocalLevel ( reportItem, masterId, "lowlow", false, item.isLocalLowLowAck (), item.getLocalLowLowPreset (), attributes ); //$NON-NLS-1$
        }
    }

    private void makeRemoteLevels ( final Item item, final DataItem reportItem, final String masterId, final Map<String, String> attributes )
    {
        if ( item.isRemoteMax () )
        {
            makeRemoteLevel ( reportItem, masterId, "ceil", "R-MAX", attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.isRemoteHighHigh () )
        {
            makeRemoteLevel ( reportItem, masterId, "highhigh", "R-HH", attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.isRemoteHigh () )
        {
            makeRemoteLevel ( reportItem, masterId, "high", "R-H", attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.isRemoteLow () )
        {
            makeRemoteLevel ( reportItem, masterId, "low", "R-L", attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.isRemoteLowLow () )
        {
            makeRemoteLevel ( reportItem, masterId, "lowlow", "R-LL", attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.isRemoteMin () )
        {
            makeRemoteLevel ( reportItem, masterId, "floor", "R-MIN", attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    private void addLocalMonitor ( final String id, final String masterId, final String reference, final boolean ack, final String message, final Map<String, String> attributes )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        if ( reference != null )
        {
            data.put ( "reference", reference ); //$NON-NLS-1$
            data.put ( "active", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        else
        {
            data.put ( "active", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "requireAck", "" + ack ); //$NON-NLS-1$ //$NON-NLS-2$
        if ( message != null )
        {
            data.put ( "message", message ); //$NON-NLS-1$
        }

        applyInfoAttributes ( attributes, data );

        addData ( BOOLEAN_ALARM_MONITOR_FACTORY_ID, id, data );
    }

    private void addListMonitor ( final String id, final String masterId, final boolean listIsAlarm, final Collection<String> referenceList, final boolean ack, final String message, final Map<String, String> attributes )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "referenceList", StringHelper.join ( referenceList, "," ) ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "listIsAlarm", listIsAlarm ); //$NON-NLS-1$
        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "requireAck", "" + ack ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "splitPattern", "," );//$NON-NLS-1$ //$NON-NLS-2$

        if ( message != null )
        {
            data.put ( "message", message ); //$NON-NLS-1$
        }

        applyInfoAttributes ( attributes, data );

        addData ( LIST_ALARM_MONITOR_FACTORY_ID, id, data );
    }

    private void addRemoteValueMonitor ( final String id, final String masterId, final String attributeAck, final String attributeAckTimestamp, final String monitorType, Map<String, String> attributes, final Boolean ackValue )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        if ( attributes == null )
        {
            attributes = Collections.emptyMap ();
        }

        attributes = new HashMap<String, String> ( attributes );

        attributes.put ( "monitorType", monitorType ); //$NON-NLS-1$
        applyInfoAttributes ( attributes, data );

        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "attribute.ack.name", attributeAck ); //$NON-NLS-1$
        data.put ( "attribute.ack.timestamp.name", attributeAckTimestamp ); //$NON-NLS-1$
        if ( ackValue != null )
        {
            data.put ( "attribute.ack.value", String.format ( "BOOL#%s", ackValue ) ); //$NON-NLS-1$ //$NON-NLS-2$
        }

        addData ( "ae.monitor.da.remote.booleanValueAlarm", id, data ); //$NON-NLS-1$
    }

    private void makeLocalLevel ( final DataItem reportItem, final String masterId, final String type, final boolean error, final boolean requireAck, final Double preset, Map<String, String> attributes )
    {
        attributes = new HashMap<String, String> ( attributes );
        attributes.put ( "message", String.format ( Messages.getString ( "Configuration.localLevel.message" ), type ) ); //$NON-NLS-1$ //$NON-NLS-2$ 
        addLocalLevelMonitor ( masterId + ".local.level." + type, error, requireAck, masterId, type, preset, attributes ); //$NON-NLS-1$

        reportItem.addMonitor ( new LocalLevelMonitor ( type, error, requireAck, preset ) );
    }

    private void addLocalLevelMonitor ( final String id, final boolean error, final boolean requireAck, final String masterId, final String type, final Double preset, final Map<String, String> attributes )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "master.id", masterId ); //$NON-NLS-1$

        if ( preset != null )
        {
            data.put ( "preset", preset ); //$NON-NLS-1$
            data.put ( "active", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        else
        {
            data.put ( "active", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        }

        data.put ( "error", "" + error ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "requireAck", "" + requireAck ); //$NON-NLS-1$ //$NON-NLS-2$

        applyInfoAttributes ( attributes, data );

        addData ( "org.openscada.da.level." + type, id, data ); //$NON-NLS-1$
    }

    private void makeRemoteLevel ( final DataItem reportItem, final String masterId, final String type, final String monitorType, Map<String, String> attributes )
    {
        attributes = new HashMap<String, String> ( attributes );

        attributes.put ( "message", String.format ( "Level reached %s in PLC", type ) ); //$NON-NLS-1$ //$NON-NLS-2$
        attributes.put ( "monitorType", monitorType ); //$NON-NLS-1$
        addRemoteAttributeMonitor ( // 
        String.format ( "%s.remote.limit.%s", masterId, type ), masterId, //  //$NON-NLS-1$
                String.format ( "remote.level.%s.alarm", type ), //   //$NON-NLS-1$
                String.format ( "remote.level.%s.ackRequired", type ), // //$NON-NLS-1$
                String.format ( "remote.level.%s.active", type ), // //$NON-NLS-1$
                String.format ( "remote.level.%s.active.timestamp", type ), // //$NON-NLS-1$
                String.format ( "remote.level.%s.ackRequired.timestamp", type ), // //$NON-NLS-1$
                attributes );
    }

    private void addRemoteAttributeMonitor ( final String id, final String masterId, final String attributeValue, final String attributeAck, final String attributeActive, final String attributeTimestamp, final String attributeAckTimestamp, final Map<String, String> attributes )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "attribute.value.name", attributeValue ); //$NON-NLS-1$
        data.put ( "attribute.ack.name", attributeAck ); //$NON-NLS-1$
        data.put ( "attribute.active.name", attributeActive ); //$NON-NLS-1$
        data.put ( "attribute.active.timestamp.name", attributeTimestamp ); //$NON-NLS-1$
        data.put ( "attribute.ack.timestamp.name", attributeAckTimestamp ); //$NON-NLS-1$

        applyInfoAttributes ( attributes, data );

        addData ( "ae.monitor.da.remote.booleanAttributeAlarm", id, data ); //$NON-NLS-1$
    }

    private void injectAttributes ( final Map<String, String> attributes, final String prefix, final Map<String, Object> data )
    {
        if ( attributes == null )
        {
            return;
        }

        for ( final Map.Entry<String, String> entry : attributes.entrySet () )
        {
            data.put ( prefix + entry.getKey (), entry.getValue () );
        }
    }

    private void applyInfoAttributes ( final Map<String, String> attributes, final Map<String, Object> data )
    {
        injectAttributes ( attributes, "info.", data );
    }

    public void addSum ( final String id, List<SummaryItem> sources, final Set<String> groups )
    {
        // this.logStream.println ( String.format ( "Add summary group: %s for groups: '%s'", id, StringHelper.join ( groups, "," ) ) );

        final Map<String, Object> data = new HashMap<String, Object> ();

        sources = new ArrayList<SummaryItem> ( sources );

        Collections.sort ( sources, new Comparator<SummaryItem> () {
            @Override
            public int compare ( final SummaryItem object1, final SummaryItem object2 )
            {
                return object1.getDataSourceId ().compareTo ( object2.getDataSourceId () );
            }
        } );

        int i = 0;
        for ( final SummaryItem item : sources )
        {
            // this.logStream.println ( String.format ( "\tAdd item: %s as %s", item.getDataSourceId (), item.getType () ) );

            String value = item.getDataSourceId ();
            if ( item.getType () != null )
            {
                value += "#" + item.getType (); //$NON-NLS-1$
            }
            data.put ( "datasource." + i, value ); //$NON-NLS-1$
            i++;
        }

        data.put ( "groups", StringHelper.join ( groups, "," ) ); //$NON-NLS-1$ //$NON-NLS-2$

        addData ( "org.openscada.da.datasource.sum", id, data ); //$NON-NLS-1$
    }

    public void close ()
    {
        this.logStream.close ();
    }

    @Override
    public void write ( final File baseDir, final File inputDir ) throws Exception
    {
        SpreadSheetPoiHelper.writeSpreadsheet ( new File ( baseDir, "IOList-generated.xls" ), this.items ); //$NON-NLS-1$
        super.write ( baseDir, inputDir );

        System.out.println ( "   ** Writing report" );
        this.report.write ( new File ( baseDir, "report.odt" ), inputDir ); //$NON-NLS-1$
    }

    public String getExtension ( final File file )
    {
        final String[] toks = file.getName ().split ( "\\." ); //$NON-NLS-1$
        return toks[toks.length - 1];
    }

    public void applyScriptOverride ( final File file ) throws FileNotFoundException, ScriptException
    {
        if ( file.isDirectory () )
        {
            return;
        }

        this.logStream.println ( "Running script: " + file ); //$NON-NLS-1$

        final ScriptEngineManager manager = new ScriptEngineManager ();

        final ScriptEngine engine = manager.getEngineByExtension ( getExtension ( file ) );
        final ScriptContext context = engine.getContext ();
        context.setAttribute ( "items", this.items.toArray (), ScriptContext.ENGINE_SCOPE ); //$NON-NLS-1$

        engine.eval ( new FileReader ( file ) );
    }

    public void applyOverrides ( final List<Item> overrides )
    {
        for ( final Item item : overrides )
        {
            if ( !item.isEnabled () )
            {
                this.logStream.println ( "Override is inactive: " + item ); //$NON-NLS-1$
                continue;
            }
            this.logStream.println ( "Trying override: " + item ); //$NON-NLS-1$

            final Item origItem = findItemByAlias ( item );
            if ( origItem != null )
            {
                this.logStream.println ( "Overriding item: " + origItem ); //$NON-NLS-1$

                if ( item.getName () == null || "".equals ( item.getName () ) ) //$NON-NLS-1$
                {
                    this.logStream.println ( "Use original source name: " + origItem.getName () ); //$NON-NLS-1$
                    item.setName ( origItem.getName () );
                }

                applyOverrides ( origItem, item );
            }
        }
    }

    private void applyOverrides ( final Item origItem, final Item item )
    {
        for ( final EAttribute attr : item.eClass ().getEAllAttributes () )
        {
            final Object value = item.eGet ( attr );
            origItem.eSet ( attr, value );
        }
    }

    private Item findItemByAlias ( final Item item )
    {
        for ( final Item origItem : this.items )
        {
            if ( origItem.getAlias () == null )
            {
                continue;
            }

            if ( origItem.getAlias ().equals ( item.getAlias () ) )
            {
                return origItem;
            }
        }
        return null;
    }

    public void addJmsMonitor ( final String id, final String filter, final Map<String, String> attributes )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "filter", filter ); //$NON-NLS-1$
        applyInfoAttributes ( attributes, data );

        addData ( "ae.monitor.ae.event.external", id, data ); //$NON-NLS-1$
    }

    public void removeInactive ()
    {
        final Iterator<Item> i = this.items.iterator ();
        while ( i.hasNext () )
        {
            final Item item = i.next ();
            if ( !item.isEnabled () )
            {
                System.out.println ( String.format ( "   Removing item %s since it is disabled", item.getAlias () ) ); //$NON-NLS-1$
                i.remove ();
            }
        }
    }

    public List<Item> getItems ()
    {
        return this.items;
    }

    public void addEventFilter ( final String id, final long priority, final String type, final Map<String, Object> properties )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();
        data.putAll ( properties );
        data.put ( "priority", priority );
        data.put ( "type", type );
        data.put ( "id", id ); // for now ...
        addData ( "org.openscada.ae.server.http.eventFilter", id, data );
    }
}
