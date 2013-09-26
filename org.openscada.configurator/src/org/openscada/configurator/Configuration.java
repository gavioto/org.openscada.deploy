/*
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2006-2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
 * Copyright (C) 2013 Jens Reimann (ctron@dentrassi.de)
 * Copyright (C) 2013 Jürgen Rose (cptmauli@googlemail.com)
 *
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 *
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 */

package org.openscada.configurator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.scada.ae.data.Severity;
import org.eclipse.scada.core.Variant;
import org.eclipse.scada.core.VariantType;
import org.eclipse.scada.utils.str.StringHelper;
import org.openscada.configurator.loop.LoopValidator;
import org.openscada.configurator.report.DataItemSource;
import org.openscada.configurator.report.FormulaSource;
import org.openscada.configurator.report.LocalBooleanMonitor;
import org.openscada.configurator.report.LocalLevelMonitor;
import org.openscada.configurator.report.Report;
import org.openscada.configurator.report.ReportDataItem;
import org.openscada.configurator.report.ScriptSource;
import org.openscada.configurator.report.Source;
import org.openscada.configurator.report.SummarySource;
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.AverageItem;
import org.openscada.deploy.iolist.model.ConstantItem;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.FormulaInput;
import org.openscada.deploy.iolist.model.FormulaItem;
import org.openscada.deploy.iolist.model.HierarchySummaryGroup;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.MovingAverage;
import org.openscada.deploy.iolist.model.MovingAverageItem;
import org.openscada.deploy.iolist.model.PlainSummaryGroup;
import org.openscada.deploy.iolist.model.Rounding;
import org.openscada.deploy.iolist.model.ScriptItem;
import org.openscada.deploy.iolist.model.ScriptModule;
import org.openscada.deploy.iolist.model.ScriptOutput;
import org.openscada.deploy.iolist.model.WeakSummaryReference;
import org.openscada.deploy.iolist.utils.DuplicateItemsException;
import org.openscada.deploy.iolist.utils.ItemListWriter;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Configuration extends GenericMasterConfiguration
{

    private static final String FACTORY_MASTER_HANDLER_MARKER = "org.openscada.da.master.common.marker"; //$NON-NLS-1$

    private static final String FACTORY_MASTER_HANDLER_BLOCK = "org.openscada.da.master.common.block"; //$NON-NLS-1$

    private static final String FACTORY_AE_MONITOR_REMOTE_ATTR = "ae.monitor.da.remote.booleanAttributeAlarm"; //$NON-NLS-1$

    private static final String FACTORY_AE_MONITOR_REMOTE_BOOLEAN = "ae.monitor.da.remote.booleanValueAlarm"; //$NON-NLS-1$

    private static final String FACTORY_AE_MONITOR_BIT = "org.openscada.ae.monitor.bit"; //$NON-NLS-1$

    private static final String FACTORY_MASTER_HANDLER_LOGGER = "org.openscada.ae.event.logger"; //$NON-NLS-1$

    private static final String FACTORY_MASTER_HANDLER_NEGATE = "org.openscada.da.negate.input"; //$NON-NLS-1$

    private static final String FACTORY_MASTER_HANDLER_ROUND = "org.openscada.da.round"; //$NON-NLS-1$

    private static final String FACTORY_MASTER_HANDLER_SCALE = "org.openscada.da.scale.input"; //$NON-NLS-1$

    private static final String FACTORY_MASTER_HANDLER_MANUAL = "org.openscada.da.manual"; //$NON-NLS-1$

    private static final String FACTORY_AE_MONITOR_LEVEL = "org.openscada.ae.monitor.level"; //$NON-NLS-1$

    private static final String FACTORY_AE_MONITOR_LIST = "org.openscada.ae.monitor.list"; //$NON-NLS-1$

    private static final String FACTORY_AE_MONITOR_SCRIPT = "org.openscada.ae.monitor.script"; //$NON-NLS-1$

    private static final String FACTORY_AE_MONITOR_PROXY_QUERY = "org.openscada.ae.server.monitor.proxy"; //$NON-NLS-1$

    private static final String FACTORY_AE_EVENT_PROXY_QUERY = "org.openscada.ae.server.event.proxy"; //$NON-NLS-1$

    private final List<Item> items = new ArrayList<Item> ();

    private final List<Average> averages = new ArrayList<Average> ();

    private final List<MovingAverage> movingAverages = new ArrayList<MovingAverage> ();

    private final PrintStream logStream;

    private final Report report;

    public Configuration ( final PrintStream logStream )
    {
        this.logStream = logStream;

        this.report = new Report ();

        // add ignore fields

        addIgnoreFields ( FACTORY_MASTER_HANDLER_MANUAL, "value", "user", "reason", "timestamp" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 

        addIgnoreFields ( FACTORY_MASTER_HANDLER_BLOCK, "note", "active", "user", "timestamp" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 

        addIgnoreFields ( FACTORY_AE_MONITOR_LEVEL, "preset", "active" ); //$NON-NLS-1$ //$NON-NLS-2$ 

        addIgnoreFields ( FACTORY_AE_MONITOR_LIST, "active" ); //$NON-NLS-1$ 

        addIgnoreFields ( FACTORY_AE_MONITOR_BIT, "active", "reference" ); //$NON-NLS-1$ //$NON-NLS-2$

        addIgnoreFields ( FACTORY_MASTER_HANDLER_MARKER, "active" ); //$NON-NLS-1$

        addIgnoreFields ( FACTORY_MASTER_HANDLER_SCALE, "active", "factor" ); //$NON-NLS-1$ //$NON-NLS-2$ 

        addAEInfo ();
    }

    private void addAEInfo ()
    {
        final Map<String, String> data = new HashMap<String, String> ();
        data.put ( "prefix", "ae.server.info" ); //$NON-NLS-1$ //$NON-NLS-2$
        addData ( "ae.server.info", "ae.server.info.all", data ); //$NON-NLS-1$ //$NON-NLS-2$
    }

    private void addSummary ( final String string, final Set<String> blacklist )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "attribute", string ); //$NON-NLS-1$
        data.put ( "onlyMaster", "true" ); //$NON-NLS-1$ //$NON-NLS-2$

        int i = 0;
        for ( final String entry : blacklist )
        {
            data.put ( "blacklist." + i++, entry ); //$NON-NLS-1$
        }

        addData ( "org.openscada.da.server.osgi.summary.attribute", "summary." + string, data ); //$NON-NLS-1$ //$NON-NLS-2$
    }

    public void addItem ( final Item item )
    {
        this.items.add ( item );
    }

    public void addItems ( final List<? extends Item> items )
    {
        if ( items == null )
        {
            return;
        }
        this.items.addAll ( items );
    }

    public void addMonitorQuery ( final String id, final String filter )
    {
        final Map<String, String> data = new HashMap<String, String> ();
        data.put ( "filter", filter ); //$NON-NLS-1$
        addData ( "ae.monitor.query", id, data ); //$NON-NLS-1$
    }

    public void addEventQuery ( final String id, final String filter, final int size )
    {
        final Map<String, String> data = new HashMap<String, String> ();
        data.put ( "filter", filter ); //$NON-NLS-1$
        data.put ( "size", "" + size ); //$NON-NLS-1$ //$NON-NLS-2$
        addData ( "org.openscada.ae.server.common.event.pool", id, data ); //$NON-NLS-1$
    }

    public void addScriptComponent ( final String id, final String scriptEngine, final String script, final Map<String, String> properties )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        if ( scriptEngine != null )
        {
            data.put ( "scriptEngine", scriptEngine );//$NON-NLS-1$
        }
        data.put ( "script", script );//$NON-NLS-1$
        injectAttributes ( properties, "property.", data );//$NON-NLS-1$

        addData ( "org.openscada.da.component.script", id, data );//$NON-NLS-1$
    }

    /** Generate global summaries */
    public void outputGlobalSummaries ()
    {
        final Set<String> blacklist = new HashSet<String> ();

        final Set<String> summaries = new HashSet<String> ();
        summaries.add ( "error" ); //$NON-NLS-1$
        summaries.add ( "alarm" ); //$NON-NLS-1$
        summaries.add ( "warning" ); //$NON-NLS-1$
        summaries.add ( "info" ); //$NON-NLS-1$
        summaries.add ( "manual" ); //$NON-NLS-1$
        summaries.add ( "ackRequired" ); //$NON-NLS-1$
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

    /** Generated blocks based on location and component */
    public void generateSummeryBlocks ()
    {
        final Multimap<List<String>, String> locMap = HashMultimap.create ();

        for ( final Item item : this.items )
        {
            locMap.put ( item.getHierarchy (), makeMasterId ( item ) );
        }

        for ( final List<String> key : locMap.keySet () )
        {
            final Collection<String> values = locMap.get ( key );

            final Map<String, String> attributes = new HashMap<String, String> ();

            convertHierarchyToInfoAttributes ( key, attributes );

            addBlock ( key + ".block", new ArrayList<String> ( values ), attributes ); //$NON-NLS-1$
        }
    }

    private void addBlock ( final String blockId, final String masterId, final Map<String, String> attributes )
    {
        addBlock ( blockId, Arrays.asList ( masterId ), attributes );
    }

    public void addBlock ( final String blockId, final List<String> masterIds, final Map<String, String> attributes )
    {
        if ( masterIds.isEmpty () )
        {
            return;
        }

        Collections.sort ( masterIds );

        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandlerPriority ( FACTORY_MASTER_HANDLER_BLOCK, blockId, data, null );

        data.put ( "master.id", StringHelper.join ( masterIds, "," ) ); //$NON-NLS-1$ //$NON-NLS-2$

        injectAttributes ( attributes, "info.", data ); //$NON-NLS-1$

        addData ( FACTORY_MASTER_HANDLER_BLOCK, blockId, data );
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

    public ReportDataItem getReportItem ( final String id )
    {
        return this.report.getItem ( id );
    }

    public void outputAverages ()
    {
        for ( final Average average : this.averages )
        {
            addAverage ( average );
        }
        for ( final MovingAverage average : this.movingAverages )
        {
            addMovingAverage ( average );
        }
    }

    private static final Set<String> groupsSum = new HashSet<String> ( Arrays.asList ( "manual", "error", "alarm", "ackRequired", "blocked", "info", "warning" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$

    public void outputSummaries ( final String prefix, final String suffix )
    {
        outputPlainGroups ( this.plainSummaryGroups );
        outputSummaryGroup ( prefix, suffix, null, this.rootSummaryGroup );
    }

    private void outputPlainGroups ( final List<PlainSummaryGroup> plainSummaryGroups )
    {
        for ( final PlainSummaryGroup group : plainSummaryGroups )
        {
            outputSummaryGroup ( group.getId (), group.getDataSourceIds (), Collections.<String> emptyList (), group.getHierarchy () );
        }
    }

    private String makeGroupId ( final String prefix, final String parentId, final HierarchySummaryGroup group )
    {
        if ( parentId == null )
        {
            return group.getName () == null ? prefix : group.getName ();
        }
        else
        {
            return parentId + "." + group.getName ();
        }
    }

    private String makeGroupItemId ( final String prefix, final String suffix, final String parentId, final HierarchySummaryGroup group )
    {
        return makeGroupId ( prefix, parentId, group ) + suffix;
    }

    private void outputSummaryGroup ( final String prefix, final String suffix, final String parentId, final HierarchySummaryGroup group )
    {
        final String id = makeGroupId ( prefix, parentId, group );
        final String itemId = makeGroupItemId ( prefix, suffix, parentId, group );

        outputSummaryGroup ( itemId, group.getDataSourceIds (), makeSubSummariesId ( prefix, suffix, id, group.getChildren (), group.getWeakReferences () ), group.getHierarchy () );

        for ( final HierarchySummaryGroup child : group.getChildren () )
        {
            outputSummaryGroup ( prefix, suffix, id, child );
        }
    }

    private void outputSummaryGroup ( final String id, final List<String> dataSourceIds, final List<String> subSummaryIds, final List<String> hierarchy )
    {
        final Item item = ModelFactory.eINSTANCE.createItem ();

        item.setDebugInformation ( "Summary creation for " + id ); //$NON-NLS-1$
        item.setDescription ( Messages.getString ( "Configuration.SummaryItemDescription" ) + id ); //$NON-NLS-1$
        item.setName ( id + ".sum" ); //$NON-NLS-1$
        item.setAlias ( id );
        item.setSystem ( "SCADA" ); //$NON-NLS-1$
        item.setDataType ( DataType.INTEGER );
        item.setLocalManual ( false );
        item.setAttributeSummaryLevel ( 0 );

        item.getHierarchy ().addAll ( hierarchy );

        this.items.add ( item );
        addSum ( id + ".sum", dataSourceIds, subSummaryIds, groupsSum ); //$NON-NLS-1$

        final ReportDataItem reportItem = getReportItem ( item.getAlias () );
        reportItem.setValueSource ( new SummarySource ( this, dataSourceIds ) );
    }

    private List<String> makeSubSummariesId ( final String prefix, final String suffix, final String parentId, final List<HierarchySummaryGroup> children, final List<WeakSummaryReference> weakReferences )
    {
        final List<String> result = new LinkedList<String> ();

        for ( final HierarchySummaryGroup group : children )
        {
            result.add ( makeGroupItemId ( prefix, suffix, parentId, group ) + ".master" );
        }

        for ( final WeakSummaryReference ref : weakReferences )
        {
            result.add ( ref.getDataSourceId () );
        }

        return result;
    }

    /** Generate configuration for currently known items */

    public void outputItems ()
    {
        try
        {
            doOutputItems ();
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }

    protected void doOutputItems () throws Exception
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

            final ReportDataItem reportItem = this.report.getItem ( internalItemId );

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
            else if ( item instanceof AverageItem )
            {
                final String averageId = ( (AverageItem)item ).getAverage ().getId ();
                sourceId = averageId + "." + ( (AverageItem)item ).getType ().getLiteral (); //$NON-NLS-1$
            }
            else if ( item instanceof MovingAverageItem )
            {
                final String averageId = ( (MovingAverageItem)item ).getAverage ().getId ();
                sourceId = averageId + "." + ( (MovingAverageItem)item ).getType ().getLiteral (); //$NON-NLS-1$
            }
            else if ( item instanceof ConstantItem )
            {
                sourceId = internalItemId + ".const"; //$NON-NLS-1$
                addConstantSource ( sourceId, item.getName () );
            }
            else if ( "ds".equalsIgnoreCase ( item.getDevice () ) ) //$NON-NLS-1$
            {
                sourceId = item.getName () + ".ds"; //$NON-NLS-1$
                addDSDataSource ( sourceId );
            }
            else if ( item.getDevice () != null && !"".equals ( item.getDevice () ) ) //$NON-NLS-1$
            {
                sourceId = internalItemId + ".source"; //$NON-NLS-1$

                addSource ( sourceId, itemId, item.getDevice () );

                reportItem.setValueSource ( new DataItemSource ( itemId, item.getDevice ().toLowerCase () ) );
            }
            else
            {
                sourceId = item.getName ();
            }

            reportItem.setInternalId ( masterId );

            addMaster ( masterId, sourceId );
            addAlias ( internalItemId + ".alias", internalItemId, masterId, item.getDescription () ); //$NON-NLS-1$
            if ( item.getAttributeSummaryLevel () > 0 )
            {
                addAttributeSummaries ( masterId, item.getAttributeSummaryLevel () );
            }

            final Map<String, String> attributes = new HashMap<String, String> ();

            convertHierarchyToInfoAttributes ( item.getHierarchy (), attributes );

            if ( item.getDevice () != null )
            {
                attributes.put ( "hive", item.getDevice ().toUpperCase () ); //$NON-NLS-1$
            }
            if ( item.getSystem () != null )
            {
                attributes.put ( "system", item.getSystem ().toUpperCase () ); //$NON-NLS-1$
            }
            attributes.put ( "itemDescription", item.getDescription () ); //$NON-NLS-1$
            attributes.put ( "item", internalItemId ); //$NON-NLS-1$

            reportItem.setBasicInformation ( attributes.get ( "hive" ), attributes.get ( "system" ), attributes.get ( "location" ), attributes.get ( "component" ), attributes.get ( "itemDescription" ), item.isEventCommand () ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

            if ( item.isRemoteBool () )
            {
                addRemoteValueMonitor ( masterId + ".remote.monitor", masterId, "remote.ackRequired", "remote.ackRequired.timestamp", "ALM", attributes, item.getRemoteBoolAckValue () ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
            }
            if ( item.getLocalBooleanMonitor () != null )
            {
                final String reference = item.getLocalBooleanMonitor ().isOkValue () ? "true" : "false"; //$NON-NLS-1$ //$NON-NLS-2$

                final String message = Messages.getString ( "Configuration.LocalBooleanAlarmMessage" ); //$NON-NLS-1$

                addLocalBitMonitor ( masterId + ".local.monitor", masterId, reference, item.getLocalBooleanMonitor ().getSeverity (), item.getLocalBooleanMonitor ().isAck (), item.getLocalBooleanMonitor ().isSuppressEvents (), message, item.getDefaultMonitorDemote (), attributes ); //$NON-NLS-1$
                reportItem.addMonitor ( new LocalBooleanMonitor ( reference, item.getLocalBooleanMonitor ().isAck (), item.getLocalBooleanMonitor ().isSuppressEvents () ) );
            }
            makeRemoteLevels ( item, reportItem, masterId, attributes );
            makeLocalLevels ( item, reportItem, masterId, attributes );

            if ( item.isEventCommand () )
            {
                addWriteLogger ( internalItemId + ".logger", masterId, attributes ); //$NON-NLS-1$
            }

            // FIXME: add negate flag
            if ( item.getAttributeSummaryLevel () > 0 )
            {
                addNegate ( masterId + ".negate", masterId, false ); //$NON-NLS-1$
                reportItem.addFeature ( Messages.getString ( "Configuration.report.feature.negate" ) ); //$NON-NLS-1$
            }

            if ( item.isLocalManual () )
            {
                addLocalManual ( masterId + ".manual", masterId, item.getLocalManualPreset (), attributes ); //$NON-NLS-1$
                reportItem.addFeature ( Messages.getString ( "Configuration.report.feature.manual" ) ); //$NON-NLS-1$
            }

            if ( item.isLocalScaleAvailable () )
            {
                addLocalScale ( masterId + ".scale", masterId, item.getLocalScaleFactor (), item.getLocalScaleOffset (), attributes ); //$NON-NLS-1$
                addLocalScaleFeature ( item, reportItem );
            }

            if ( item.isRoundingAvailable () )
            {
                addRounding ( masterId + ".round", masterId, item.getRoundingValue (), attributes ); //$NON-NLS-1$
            }

            if ( item.getLocalListMonitor () != null )
            {
                final ListMonitor m = item.getLocalListMonitor ();
                final String message = Messages.getString ( "Configuration.LocalListMonitorAlarmMessage" ); //$NON-NLS-1$
                addListMonitor ( masterId + ".listMonitor", masterId, m.isDefaultAck (), m.getDefaultSeverity (), makeSeverityMap ( m ), makeAckMap ( m ), message, item.getDefaultMonitorDemote (), m.getMessageAttribute (), attributes ); //$NON-NLS-1$
            }

            if ( item.isBlock () )
            {
                addBlock ( masterId + ".block", masterId, attributes ); //$NON-NLS-1$
                reportItem.addFeature ( Messages.getString ( "Configuration.report.feature.block" ) ); //$NON-NLS-1$
            }

            if ( item.getMapper () != null )
            {
                for ( final Mapper mapper : item.getMapper () )
                {
                    addMapperHandler ( masterId, makeMapperHandlerName ( masterId, mapper ), mapper.getMapperId (), mapper.getFromAttribute (), mapper.getToAttribute () );
                }
            }
        }

        validateConnections ( connections );
    }

    private Map<Variant, Boolean> makeAckMap ( final ListMonitor m )
    {
        final Map<Variant, Boolean> result = new HashMap<Variant, Boolean> ();

        for ( final ListMonitorEntry entry : m.getEntries () )
        {
            if ( entry.getRequireAck () != null )
            {
                result.put ( entry.getValue (), entry.getRequireAck () );
            }
        }

        return result;
    }

    private Map<Variant, String> makeSeverityMap ( final ListMonitor m )
    {
        final Map<Variant, String> result = new HashMap<Variant, String> ();

        for ( final ListMonitorEntry entry : m.getEntries () )
        {
            if ( entry.getSeverity () != null )
            {
                result.put ( entry.getValue (), entry.getSeverity () );
            }
        }

        return result;
    }

    private void addConstantSource ( final String id, final String valueString )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "value", valueString ); //$NON-NLS-1$

        addData ( "org.openscada.da.datasource.constant", id, data ); //$NON-NLS-1$
    }

    private static final boolean skipNewHierarchy = Boolean.getBoolean ( "skipNewHierarchy" ); //$NON-NLS-1$

    private static final boolean skipOldHierarchy = Boolean.getBoolean ( "skipOldHierarchy" ); //$NON-NLS-1$

    public static void convertHierarchyToInfoAttributes ( final List<String> levels, final Map<String, String> attributes )
    {
        // instead of location and component
        int i = 0;
        for ( final String level : levels )
        {
            if ( !skipNewHierarchy )
            {
                attributes.put ( "level." + i, level ); //$NON-NLS-1$
            }
            if ( !skipOldHierarchy )
            {
                if ( i == 0 )
                {
                    // a legacy
                    attributes.put ( "location", level ); //$NON-NLS-1$
                }
                if ( i == 1 )
                {
                    // a legacy
                    attributes.put ( "component", level ); //$NON-NLS-1$
                }
            }
            i++;
        }
    }

    private String makeMapperHandlerName ( final String masterId, final Mapper mapper )
    {
        if ( mapper.getFromAttribute () == null )
        {
            mapper.setFromAttribute ( "" ); //$NON-NLS-1$
        }
        if ( mapper.getToAttribute () == null )
        {
            mapper.setToAttribute ( "" ); //$NON-NLS-1$
        }

        return String.format ( "%s.mapper.%s.%s/%s", masterId, mapper.getMapperId (), mapper.getFromAttribute (), mapper.getToAttribute () ); //$NON-NLS-1$
    }

    private void addLocalScaleFeature ( final Item item, final ReportDataItem reportItem )
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
        final Map<String, String> data = new HashMap<String, String> ();

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
                data.put ( "init." + i, loadFromFile ( new InputStreamReader ( new URL ( module.getData () ).openStream () ) ) ); //$NON-NLS-1$
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
        final Map<String, Map<String, String>> connnectionData = this.data.get ( "da.connection" ); //$NON-NLS-1$
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
        final Map<String, String> data = new HashMap<String, String> ();

        addData ( "org.openscada.da.datasource.ds", id, data ); //$NON-NLS-1$
    }

    private void addLocalManual ( final String id, final String masterId, final Variant localManualPreset, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_MASTER_HANDLER_MANUAL, id, data, masterId, null );

        if ( localManualPreset != null && !localManualPreset.isNull () )
        {
            data.put ( "active", "true" );
            data.put ( "value", localManualPreset.toString () );
        }

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_MASTER_HANDLER_MANUAL, id, data );
    }

    public void addScript ( final String id, final String engine, final Map<String, String> dataSources, final Map<String, String> outputs, final String init, final String update, final String timerCommand, final Long timer, final String write )
    {
        final Map<String, String> data = new HashMap<String, String> ();

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
            data.put ( "timer", "" + timer ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( timerCommand != null )
        {
            data.put ( "timerCommand", timerCommand ); //$NON-NLS-1$
        }
        data.put ( "writeCommand", write ); //$NON-NLS-1$

        addData ( "org.openscada.da.datasource.script", id, data ); //$NON-NLS-1$
    }

    static final String NL = System.getProperty ( "line.separator" ); //$NON-NLS-1$

    /**
     * Loads text data from a file
     * 
     * @param file
     * @return
     * @throws Exception
     */
    public static String loadFromFile ( final Reader sourceReader ) throws Exception
    {
        final BufferedReader reader = new BufferedReader ( sourceReader );
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

    public static String loadFromFile ( final File file ) throws Exception
    {
        return loadFromFile ( new FileReader ( file ) );
    }

    private void addLocalScale ( final String id, final String masterId, final Double localScaleFactor, final Double localScaleOffset, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_MASTER_HANDLER_SCALE, id, data, masterId, null );

        data.put ( "active", "" + ( localScaleFactor != null || localScaleOffset != null ) ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "factor", "" + localScaleFactor != null ? "" + localScaleFactor : "1.0" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        data.put ( "offset", "" + localScaleOffset != null ? "" + localScaleOffset : "0.0" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_MASTER_HANDLER_SCALE, id, data );
    }

    private void addRounding ( final String id, final String masterId, final Rounding rounding, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_MASTER_HANDLER_ROUND, id, data, masterId, null );

        data.put ( "type", "" + rounding.getName () ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "active", "" + ( rounding != Rounding.NONE ) ); //$NON-NLS-1$ //$NON-NLS-2$

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_MASTER_HANDLER_ROUND, id, data );
    }

    private void addNegate ( final String id, final String masterId, final boolean active )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_MASTER_HANDLER_NEGATE, id, data, masterId, null );

        data.put ( "active", "" + active ); //$NON-NLS-1$ //$NON-NLS-2$

        addData ( FACTORY_MASTER_HANDLER_NEGATE, id, data );
    }

    private void addWriteLogger ( final String id, final String masterId, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_MASTER_HANDLER_LOGGER, id, data, masterId, null );

        data.put ( "source", masterId ); //$NON-NLS-1$
        data.put ( "logValue", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "logAttributes", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "logSubscription", "true" ); //$NON-NLS-1$  //$NON-NLS-2$

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_MASTER_HANDLER_LOGGER, id, data );
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
        final Map<String, Item> alias = new HashMap<String, Item> ();
        final Map<String, Item> tempAdd = new HashMap<String, Item> ();
        final Collection<Item> duplicates = new LinkedList<Item> ();

        for ( final Item item : this.items )
        {
            if ( alias.containsKey ( item.getAlias () ) )
            {
                duplicates.add ( item );
                final Item prevItem = tempAdd.remove ( item.getAlias () );
                if ( prevItem != null )
                {
                    duplicates.add ( prevItem );
                }
            }
            else
            {
                alias.put ( item.getAlias (), item );
                tempAdd.put ( item.getAlias (), item );
            }
        }
        if ( !duplicates.isEmpty () )
        {
            throw new DuplicateItemsException ( duplicates );
        }
    }

    private void makeLocalLevels ( final Item item, final ReportDataItem reportItem, final String masterId, final Map<String, String> attributes )
    {
        final String demotePrefix = item.getDefaultMonitorDemote ();

        if ( item.getLocalMax () != null )
        {
            makeLocalLevel ( reportItem, masterId, "max", Severity.ERROR, "MAX", true, true, true, item.getLocalMax (), demotePrefix, attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.getLocalHighHigh () != null )
        {
            makeLocalLevel ( reportItem, masterId, "highhigh", Severity.ALARM, "HH", false, true, false, item.getLocalHighHigh (), demotePrefix, attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.getLocalHigh () != null )
        {
            makeLocalLevel ( reportItem, masterId, "high", Severity.ALARM, "H", false, true, false, item.getLocalHigh (), demotePrefix, attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.getLocalLow () != null )
        {
            makeLocalLevel ( reportItem, masterId, "low", Severity.ALARM, "L", false, false, false, item.getLocalLow (), demotePrefix, attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.getLocalLowLow () != null )
        {
            makeLocalLevel ( reportItem, masterId, "lowlow", Severity.ALARM, "LL", false, false, false, item.getLocalLowLow (), demotePrefix, attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        if ( item.getLocalMin () != null )
        {
            makeLocalLevel ( reportItem, masterId, "min", Severity.ERROR, "MIN", true, false, true, item.getLocalMin (), demotePrefix, attributes ); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

    private void makeRemoteLevels ( final Item item, final ReportDataItem reportItem, final String masterId, final Map<String, String> attributes )
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

    private void addLocalBitMonitor ( final String id, final String masterId, final String reference, final Severity severity, final boolean ack, final boolean suppressEvents, final String message, final String demotePrefix, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_AE_MONITOR_BIT, id, data, masterId, null );

        if ( reference != null )
        {
            data.put ( "reference", reference ); //$NON-NLS-1$
            data.put ( "active", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        else
        {
            data.put ( "active", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        data.put ( "requireAck", "" + ack ); //$NON-NLS-1$ //$NON-NLS-2$
        if ( suppressEvents )
        {
            data.put ( "suppressEvents", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        data.put ( "severity", "" + severity ); //$NON-NLS-1$ //$NON-NLS-2$
        if ( message != null )
        {
            data.put ( "message", message ); //$NON-NLS-1$
        }
        if ( demotePrefix != null )
        {
            data.put ( "demote.prefix", demotePrefix ); //$NON-NLS-1$
        }

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_AE_MONITOR_BIT, id, data );
    }

    private void fillMasterHandler ( final String factoryId, final String configurationId, final Map<String, String> data, final String masterId, final Integer handlerPriority )
    {
        data.put ( "master.id", masterId ); //$NON-NLS-1$

        fillMasterHandlerPriority ( factoryId, configurationId, data, handlerPriority );
    }

    private void addListMonitor ( final String id, final String masterId, final boolean ack, final String severity, final Map<Variant, String> severityMap, final Map<Variant, Boolean> ackMap, final String message, final String demotePrefix, final String messageAttribute, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_AE_MONITOR_LIST, id, data, masterId, 1000 );
        data.put ( "monitorType", "BOOL" ); //$NON-NLS-1$ //$NON-NLS-2$

        if ( demotePrefix != null )
        {
            data.put ( "demote.prefix", demotePrefix ); //$NON-NLS-1$
        }

        data.put ( "defaultAck", "" + ack ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "defaultSeverity", "" + severity ); //$NON-NLS-1$ //$NON-NLS-2$
        if ( messageAttribute != null )
        {
            data.put ( "messageAttribute", messageAttribute ); //$NON-NLS-1$
        }

        // values.WARNING.0=XX
        // values.ack.0=XX
        // values.nak.0=XX

        {
            int i = 0;
            for ( final Map.Entry<Variant, String> entry : severityMap.entrySet () )
            {
                data.put ( "values." + entry.getValue () + "." + i, "" + entry.getKey () ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
                i++;
            }
        }
        {
            int i = 0;
            for ( final Map.Entry<Variant, Boolean> entry : ackMap.entrySet () )
            {
                if ( entry.getValue () )
                {
                    data.put ( "values.ack." + i, "" + entry.getValue () ); //$NON-NLS-1$ //$NON-NLS-2$
                }
                else
                {
                    data.put ( "values.nak." + i, "" + entry.getValue () ); //$NON-NLS-1$ //$NON-NLS-2$
                }
                i++;
            }
        }

        if ( message != null )
        {
            data.put ( "message", message ); //$NON-NLS-1$
        }

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_AE_MONITOR_LIST, id, data );
    }

    private void addRemoteValueMonitor ( final String id, final String masterId, final String attributeAck, final String attributeAckTimestamp, final String monitorType, Map<String, String> attributes, final Boolean ackValue )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        if ( attributes == null )
        {
            attributes = Collections.emptyMap ();
        }

        attributes = new HashMap<String, String> ( attributes );

        attributes.put ( "monitorType", monitorType ); //$NON-NLS-1$
        applyInfoAttributes ( attributes, data );

        fillMasterHandler ( FACTORY_AE_MONITOR_REMOTE_BOOLEAN, id, data, masterId, null );

        data.put ( "attribute.ack.name", attributeAck ); //$NON-NLS-1$
        data.put ( "attribute.ack.timestamp.name", attributeAckTimestamp ); //$NON-NLS-1$
        if ( ackValue != null )
        {
            data.put ( "attribute.ack.value", String.format ( "BOOL#%s", ackValue ) ); //$NON-NLS-1$ //$NON-NLS-2$
        }

        addData ( FACTORY_AE_MONITOR_REMOTE_BOOLEAN, id, data );
    }

    private void makeLocalLevel ( final ReportDataItem reportItem, final String masterId, final String type, final Severity severity, final String monitorType, final boolean cap, final boolean lowerOk, final boolean includedOk, final LevelMonitor levelMonitor, final String demotePrefix, Map<String, String> attributes )
    {
        final boolean requireAck = levelMonitor.isAck ();
        final boolean suppressEvents = levelMonitor.isSuppressEvents ();
        final Double preset = levelMonitor.getPreset ();
        Severity localSeverity;
        if ( levelMonitor.getSeverity () != null )
        {
            localSeverity = levelMonitor.getSeverity ();
        }
        else
        {
            localSeverity = severity;
        }

        attributes = new HashMap<String, String> ( attributes );
        attributes.put ( "message", String.format ( Messages.getString ( "Configuration.localLevel.message" ), type ) ); //$NON-NLS-1$ //$NON-NLS-2$

        addLocalLevelMonitor ( masterId + ".local.level." + type, cap, requireAck, suppressEvents, masterId, localSeverity, type, monitorType, lowerOk, includedOk, preset, demotePrefix, attributes ); //$NON-NLS-1$

        reportItem.addMonitor ( new LocalLevelMonitor ( type, cap, requireAck, suppressEvents, preset ) );
    }

    private void addLocalLevelMonitor ( final String id, final boolean cap, final boolean requireAck, final boolean suppressEvents, final String masterId, final Severity severity, final String type, final String monitorType, final boolean lowerOk, final boolean includedOk, final Double preset, final String demotePrefix, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_AE_MONITOR_LEVEL, id, data, masterId, null );

        data.put ( "active", "false" ); //$NON-NLS-1$ //$NON-NLS-2$
        if ( preset != null )
        {
            data.put ( "preset", "" + preset ); //$NON-NLS-1$ //$NON-NLS-2$
            data.put ( "active", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        }

        data.put ( "cap", "" + cap ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "requireAck", "" + requireAck ); //$NON-NLS-1$ //$NON-NLS-2$
        if ( suppressEvents )
        {
            data.put ( "suppressEvents", "" + suppressEvents ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        data.put ( "severity", "" + severity ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "prefix", type ); //$NON-NLS-1$
        data.put ( "monitorType", monitorType ); //$NON-NLS-1$

        data.put ( "lowerOk", "" + lowerOk ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "includedOk", "" + includedOk ); //$NON-NLS-1$ //$NON-NLS-2$

        if ( demotePrefix != null )
        {
            data.put ( "demote.prefix", demotePrefix ); //$NON-NLS-1$
        }

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_AE_MONITOR_LEVEL, id, data );
    }

    private void makeRemoteLevel ( final ReportDataItem reportItem, final String masterId, final String type, final String monitorType, Map<String, String> attributes )
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
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandler ( FACTORY_AE_MONITOR_REMOTE_ATTR, id, data, masterId, null );

        data.put ( "attribute.value.name", attributeValue ); //$NON-NLS-1$
        data.put ( "attribute.ack.name", attributeAck ); //$NON-NLS-1$
        data.put ( "attribute.active.name", attributeActive ); //$NON-NLS-1$
        data.put ( "attribute.active.timestamp.name", attributeTimestamp ); //$NON-NLS-1$
        data.put ( "attribute.ack.timestamp.name", attributeAckTimestamp ); //$NON-NLS-1$

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_AE_MONITOR_REMOTE_ATTR, id, data );
    }

    private void injectAttributes ( final Map<String, String> attributes, final String prefix, final Map<String, String> data )
    {
        if ( attributes == null )
        {
            return;
        }

        for ( final Map.Entry<String, String> entry : attributes.entrySet () )
        {
            if ( entry.getKey () == null || entry.getKey ().isEmpty () )
            {
                //ignore empty keys
                continue;
            }

            data.put ( prefix + entry.getKey (), entry.getValue () );
        }
    }

    private void applyInfoAttributes ( final Map<String, String> attributes, final Map<String, String> data )
    {
        injectAttributes ( attributes, "info.", data ); //$NON-NLS-1$
    }

    private final List<PlainSummaryGroup> plainSummaryGroups = new LinkedList<PlainSummaryGroup> ();

    public List<PlainSummaryGroup> getPlainSummaryGroups ()
    {
        return this.plainSummaryGroups;
    }

    private HierarchySummaryGroup rootSummaryGroup = createRootSummary ();

    public void setRootSummaryGroup ( final HierarchySummaryGroup rootSummaryGroup )
    {
        this.rootSummaryGroup = rootSummaryGroup;
    }

    private HierarchySummaryGroup createRootSummary ()
    {
        final HierarchySummaryGroup result = ModelFactory.eINSTANCE.createHierarchySummaryGroup ();

        return result;
    }

    public HierarchySummaryGroup getRootSummaryGroup ()
    {
        return this.rootSummaryGroup;
    }

    private void addSum ( final String id, List<String> sources, List<String> subSources, final Set<String> groups )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        // convert lists to plain java lists in order to be able to sort them

        sources = new ArrayList<String> ( sources );
        subSources = new ArrayList<String> ( subSources );

        Collections.sort ( sources );
        Collections.sort ( subSources );

        {
            int i = 0;
            for ( final String item : sources )
            {
                // this.logStream.println ( String.format ( "\tAdd item: %s as %s", item.getDataSourceId (), item.getType () ) );
                data.put ( "datasource." + i, item ); //$NON-NLS-1$
                i++;
            }
        }

        {
            int i = 0;
            for ( final String item : subSources )
            {
                // this.logStream.println ( String.format ( "\tAdd item: %s as %s", item.getDataSourceId (), item.getType () ) );
                data.put ( "subDatasource." + i, item ); //$NON-NLS-1$
                i++;
            }
        }

        data.put ( "groups", StringHelper.join ( groups, "," ) ); //$NON-NLS-1$ //$NON-NLS-2$

        addData ( "org.openscada.da.datasource.sum", id, data ); //$NON-NLS-1$
    }

    @Override
    public void write ( final File baseDir ) throws Exception
    {
        if ( !Boolean.getBoolean ( "skipIoList" ) ) //$NON-NLS-1$
        {
            System.out.println ( "Start writing ODS" ); //$NON-NLS-1$
            final long start = System.currentTimeMillis ();
            new ItemListWriter ().addAll ( this.items ).write ( new File ( baseDir, "IOList-generated.ods" ) ); //$NON-NLS-1$
            System.out.println ( String.format ( "Writing ODS took %s ms", System.currentTimeMillis () - start ) ); //$NON-NLS-1$
        }

        System.out.println ( "Writing items model..." ); //$NON-NLS-1$
        writeModel ( new File ( baseDir, "configuration.iolist" ) ); //$NON-NLS-1$
        System.out.println ( "Writing items model... done!" ); //$NON-NLS-1$

        System.out.println ( "Write OSCAR..." ); //$NON-NLS-1$
        super.write ( baseDir );
        System.out.println ( "Write OSCAR... done!" ); //$NON-NLS-1$

        if ( !Boolean.getBoolean ( "skipReport" ) ) //$NON-NLS-1$
        {
            this.logStream.println ( "   ** Writing report" ); //$NON-NLS-1$
            final long start = System.currentTimeMillis ();
            this.report.write ( new File ( baseDir, "report.odt" ), new File ( baseDir, "input" ) ); //$NON-NLS-1$ //$NON-NLS-2$
            this.logStream.println ( String.format ( "   ** Writing took %s ms", System.currentTimeMillis () - start ) ); //$NON-NLS-1$
        }

        if ( Boolean.getBoolean ( "enableDot" ) ) //$NON-NLS-1$
        {
            this.logStream.println ( "   * Writing dot..." ); //$NON-NLS-1$
            exportToDot ( new File ( baseDir, "configuration.dot" ) ); //$NON-NLS-1$
            this.logStream.println ( "   * Writing dot... done!" ); //$NON-NLS-1$
        }
    }

    private void writeModel ( final File modelFile ) throws IOException
    {
        final Model model = ModelFactory.eINSTANCE.createModel ();
        model.getItems ().addAll ( this.items );
        model.getAverages ().addAll ( this.averages );
        model.getMovingAverages ().addAll ( this.movingAverages );

        model.setRootSummary ( this.rootSummaryGroup );

        final ResourceSet resourceSet = new ResourceSetImpl ();

        final URI fileURI = URI.createFileURI ( modelFile.getAbsolutePath () );

        final Resource resource = resourceSet.createResource ( fileURI );
        resource.getContents ().add ( model );

        // Save the contents of the resource to the file system.
        //
        final Map<Object, Object> options = new HashMap<Object, Object> ();
        options.put ( XMLResource.OPTION_ENCODING, "UTF-8" ); //$NON-NLS-1$
        resource.save ( options );
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
        context.setAttribute ( "baseDir", file.getParent (), ScriptContext.ENGINE_SCOPE );//$NON-NLS-1$

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
        for ( final EStructuralFeature feature : item.eClass ().getEAllStructuralFeatures () )
        {
            final Object value = item.eGet ( feature );
            origItem.eSet ( feature, value );
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
        final Map<String, String> data = new HashMap<String, String> ();

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

    public void addEventFilter ( final String id, final long priority, final String type, final Map<String, String> properties )
    {
        final Map<String, String> data = new HashMap<String, String> ();
        data.putAll ( properties );
        data.put ( "priority", "" + priority ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "type", type ); //$NON-NLS-1$
        data.put ( "id", id ); // for now ... //$NON-NLS-1$
        addData ( "org.openscada.ae.server.http.eventFilter", id, data ); //$NON-NLS-1$
    }

    public void addAverage ( final Average average )
    {
        final String id = average.getId ();

        final Map<String, String> data = new HashMap<String, String> ();

        if ( average.getPercentRequired () >= 0 )
        {
            data.put ( "validSourcesRequired", String.format ( "%d%%", Math.round ( average.getPercentRequired () * 100.0 ) ) ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        else if ( average.getNumRequired () >= 0 )
        {
            data.put ( "validSourcesRequired", String.format ( "%d", average.getNumRequired () ) ); //$NON-NLS-1$ //$NON-NLS-2$
        }
        else
        {
            data.put ( "validSourcesRequired", "0" ); //$NON-NLS-1$ //$NON-NLS-2$
        }

        final List<String> sources = new ArrayList<String> ( average.getSources () );
        Collections.sort ( sources );

        data.put ( "sources", StringHelper.join ( sources, ", " ) ); //$NON-NLS-1$ //$NON-NLS-2$

        addData ( "org.openscada.da.datasource.average", id, data ); //$NON-NLS-1$
    }

    public void addMovingAverage ( final MovingAverage average )
    {
        final String id = average.getId ();

        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "datasource.id", average.getSource () ); //$NON-NLS-1$
        data.put ( "trigger", "" + average.getTrigger () ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "triggerOnly", "" + average.isTriggerOnly () ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "nullRange", "" + average.getNullRange () ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "range", "" + average.getRange () ); //$NON-NLS-1$ //$NON-NLS-2$

        addData ( "org.openscada.da.datasource.movingaverage", id, data ); //$NON-NLS-1$
    }

    public void addAverages ( final List<Average> averages )
    {
        if ( averages == null )
        {
            return;
        }
        this.averages.addAll ( averages );
    }

    public void addMovingAverages ( final List<MovingAverage> averages )
    {
        if ( averages == null )
        {
            return;
        }
        this.movingAverages.addAll ( averages );
    }

    /*
    public void addSummaries ( final Collection<SummaryGroup> summaries )
    {
        if ( summaries == null )
        {
            return;
        }

        for ( final SummaryGroup group : summaries )
        {
            if ( this.summaryGroups.containsKey ( group.getId () ) )
            {
                // complain
                System.err.println ( "Old group: " + this.summaryGroups.get ( group.getId () ) ); //$NON-NLS-1$
                System.err.println ( "New group: " + group ); //$NON-NLS-1$
                throw new IllegalStateException ( "Duplicate summary group: " + group.getId () ); //$NON-NLS-1$
            }
            else
            {
                this.summaryGroups.put ( group.getId (), group );
            }
        }
    }
    */

    /*
    public void removeSummary ( final SummaryGroup summaryGroup )
    {
        this.summaryGroups.remove ( summaryGroup.getId () );
    }

    public Collection<SummaryGroup> getSummaryGroups ()
    {
        return Collections.unmodifiableCollection ( this.summaryGroups.values () );
    }
    */

    public void addMarker ( final String id, final Set<Item> items, final Map<String, String> markers, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        fillMasterHandlerPriority ( FACTORY_MASTER_HANDLER_MARKER, id, data, null );

        final Set<String> masterIds = new TreeSet<String> ();
        for ( final Item item : items )
        {
            masterIds.add ( makeMasterId ( item ) );
        }

        data.put ( "master.id", StringHelper.join ( masterIds, ", " ) ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "exportAttribute", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "alwaysExport", "true" ); //$NON-NLS-1$ //$NON-NLS-2$

        for ( final Map.Entry<String, String> entry : markers.entrySet () )
        {
            data.put ( "marker." + entry.getKey (), entry.getValue () == null ? "" : entry.getValue () ); //$NON-NLS-1$ //$NON-NLS-2$
        }

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_MASTER_HANDLER_MARKER, id, data );
    }

    public void addScriptMonitor ( final String id, final int priority, final boolean suppressEvents, final String scriptEngine, final String updateScript, final Map<String, String> inputs, final Set<String> outputs, final Map<String, String> attributes )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "handlerPriority", "" + priority ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "master.id", StringHelper.join ( outputs, ", " ) ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "updateCommand", updateScript ); //$NON-NLS-1$
        data.put ( "scriptEngine", scriptEngine ); //$NON-NLS-1$
        if ( suppressEvents )
        {
            data.put ( "suppressEvents", "true" ); //$NON-NLS-1$ //$NON-NLS-2$
        }

        for ( final Map.Entry<String, String> entry : inputs.entrySet () )
        {
            data.put ( "datasource." + entry.getKey (), entry.getValue () ); //$NON-NLS-1$
        }

        applyInfoAttributes ( attributes, data );

        addData ( FACTORY_AE_MONITOR_SCRIPT, id, data );
    }

    public void addMonitorQueryProxy ( final String id, final Set<String> remoteQueries, final Set<String> localQueries )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        {
            int i = 0;
            for ( final String remoteQuery : remoteQueries )
            {
                data.put ( "remote.queries." + i, remoteQuery ); //$NON-NLS-1$
                i++;
            }
        }
        {
            int i = 0;
            for ( final String localQuery : localQueries )
            {
                data.put ( "local.queries." + i, localQuery ); //$NON-NLS-1$
                i++;
            }
        }

        addData ( FACTORY_AE_MONITOR_PROXY_QUERY, id, data );
    }

    public void addEventQueryProxy ( final String id, final Set<String> remoteQueries, final Set<String> localQueries, final int poolSize )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "poolSize", "" + poolSize ); //$NON-NLS-1$ //$NON-NLS-2$

        {
            int i = 0;
            for ( final String remoteQuery : remoteQueries )
            {
                data.put ( "remote.queries." + i, remoteQuery ); //$NON-NLS-1$
                i++;
            }
        }
        {
            int i = 0;
            for ( final String localQuery : localQueries )
            {
                data.put ( "local.queries." + i, localQuery ); //$NON-NLS-1$
                i++;
            }
        }

        addData ( FACTORY_AE_EVENT_PROXY_QUERY, id, data );
    }
}
