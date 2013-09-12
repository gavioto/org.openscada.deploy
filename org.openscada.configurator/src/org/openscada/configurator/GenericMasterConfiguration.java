/*
 * This file is part of the openSCADA project
 * Copyright (C) 2006-2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.scada.utils.str.StringHelper;
import org.openscada.configuration.security.Rule;
import org.openscada.configuration.security.Rules;
import org.openscada.configurator.data.rule.RuleEncoder;

import com.google.common.collect.Lists;

public class GenericMasterConfiguration extends GenericConfiguration
{

    private static final String FACTORY_DA_MASTER_HANDLER_SUM = "da.master.handler.sum";

    private static class PriorityEntry
    {
        private final String factoryId;

        private final Pattern configurationFilter;

        private final int defaultPriority;

        public PriorityEntry ( final String factoryId, final Pattern configurationFilter, final int defaultPriority )
        {
            super ();
            this.factoryId = factoryId;
            this.configurationFilter = configurationFilter;
            this.defaultPriority = defaultPriority;
        }

        public Pattern getConfigurationFilter ()
        {
            return this.configurationFilter;
        }

        public int getDefaultPriority ()
        {
            return this.defaultPriority;
        }

        public String getFactoryId ()
        {
            return this.factoryId;
        }
    }

    private final List<PriorityEntry> priorities = new LinkedList<GenericMasterConfiguration.PriorityEntry> ();

    public void addMaster ( final String id, final String dataSourceId )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "datasource.id", dataSourceId ); //$NON-NLS-1$

        addData ( "master.item", id, data ); //$NON-NLS-1$
    }

    public void addConnection ( final String id, final String connectionUri )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "connection.uri", connectionUri ); //$NON-NLS-1$

        addData ( "da.connection", id, data ); //$NON-NLS-1$
    }

    public void addConnection ( final String id, final String type, final String connectionUri )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "connection.uri", connectionUri ); //$NON-NLS-1$

        addData ( type + ".connection", id, data ); //$NON-NLS-1$
    }

    public void addAlias ( final String id, final String itemId, final String dataSourceId, final String description )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "datasource.id", dataSourceId ); //$NON-NLS-1$
        data.put ( "item.id", itemId ); //$NON-NLS-1$
        if ( description != null )
        {
            data.put ( "description", description ); //$NON-NLS-1$
        }

        addData ( "da.dataitem.datasource", id, data ); //$NON-NLS-1$
    }

    protected void addAttributeSummaries ( final String masterId, final int level )
    {
        final int num = ( level - 1 ) * 2 + 1;

        // we set the prefix but not the id, since that won't collide

        addSum ( masterId + ".sum.phase1", masterId, new String[] { "error" }, String.format ( "phase%d", num ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        addSum ( masterId + ".sum.phase2", masterId, new String[] { "manual", "error", "alarm", "warning", "info", "error.ackRequired", "alarm.ackRequired", "warning.ackRequired", "blocked" }, String.format ( "phase%d", num + 1 ) ); //$NON-NLS-1$ //$NON-NLS-2$
    }

    protected void addSum ( final String id, final String masterId, final String[] tags, final String prefix )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "master.id", masterId ); //$NON-NLS-1$
        fillMasterHandlerPriority ( FACTORY_DA_MASTER_HANDLER_SUM, id, data, null );

        data.put ( "tag", StringHelper.join ( tags, ", " ) ); //$NON-NLS-1$

        for ( final String tag : tags )
        {
            if ( prefix != null )
            {
                data.put ( "tag." + tag + ".prefix", prefix ); //$NON-NLS-1$
            }
        }
        addData ( FACTORY_DA_MASTER_HANDLER_SUM, id, data );
    }

    public void addSource ( final String id, final String itemId, final String connectionId )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "item.id", itemId ); //$NON-NLS-1$
        data.put ( "connection.id", connectionId ); //$NON-NLS-1$

        addData ( "da.datasource.dataitem", id, data ); //$NON-NLS-1$
    }

    public void addProxy ( final String id, final String... sources )
    {
        addProxy ( id, new HashSet<String> ( Arrays.asList ( sources ) ) );
    }

    public void addProxy ( final String id, final Set<String> sources )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        final List<String> sourceList = new ArrayList<String> ( sources );
        Collections.sort ( sourceList );

        data.put ( "sources", StringHelper.join ( sourceList, ", " ) );

        addData ( "da.datasource.proxy", id, data ); //$NON-NLS-1$
    }

    protected void addMapperHandler ( final String masterId, final String id, final String mapperId, final String fromAttribute, final String toAttribute )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "master.id", masterId );
        data.put ( "mapper.id", mapperId );
        if ( fromAttribute != null && !fromAttribute.isEmpty () )
        {
            data.put ( "sourceAttributeName", fromAttribute );
        }
        if ( toAttribute != null && !toAttribute.isEmpty () )
        {
            data.put ( "targetAttributeName", toAttribute );
        }

        addData ( "org.openscada.da.master.mapper", id, data );
    }

    protected void fillMasterHandlerPriority ( final String factoryId, final String configurationId, final Map<String, String> data, final Integer handlerPriority )
    {
        if ( handlerPriority != null )
        {
            data.put ( "handlerPriority", "" + handlerPriority ); //$NON-NLS-1$
        }
        else
        {
            final Integer priority = getDefaultPriority ( factoryId, configurationId, null );
            if ( priority != null )
            {
                data.put ( "handlerPriority", "" + priority );
            }
        }
    }

    public void addPriority ( final String factoryId, final Pattern configurationFilter, final int defaultPriority )
    {
        this.priorities.add ( new PriorityEntry ( factoryId, configurationFilter, defaultPriority ) );
    }

    protected Integer getDefaultPriority ( final String factoryId, final String configurationId, final Integer defaultPriority )
    {
        for ( final PriorityEntry entry : this.priorities )
        {
            if ( entry.getFactoryId () != null && !entry.getFactoryId ().equals ( factoryId ) )
            {
                continue;
            }
            if ( entry.getConfigurationFilter () != null && !entry.getConfigurationFilter ().matcher ( configurationId ).matches () )
            {
                continue;
            }
            return entry.getDefaultPriority ();
        }
        System.out.println ( String.format ( "WARN: no defaultPriority for %s / %s", factoryId, configurationId ) );
        return defaultPriority;
    }

    public void addAuthorizationScript ( final String id, final String script, final int priority, final String idFilter, final String typeFilter, final String actionFilter )
    {
        final Map<String, String> data = new HashMap<String, String> ();
        data.put ( "script", script ); //$NON-NLS-1$
        data.put ( "priority", "" + priority ); //$NON-NLS-1$ //$NON-NLS-2$
        data.put ( "for.id", idFilter ); //$NON-NLS-1$
        data.put ( "for.type", typeFilter ); //$NON-NLS-1$
        data.put ( "for.action", actionFilter ); //$NON-NLS-1$
        addData ( "org.openscada.sec.provider.script.factory", id, data ); //$NON-NLS-1$
    }

    public void addSecurityRules ( final Rules rules )
    {
        int priority = 1000;

        for ( final Rule rule : Lists.reverse ( rules.getRules () ) )
        {
            final RuleEncoder encoder = RuleEncoder.findEncoder ( rule );
            if ( encoder != null )
            {
                encoder.encodeRule ( this, priority += 100 );
            }
        }
    }

}
