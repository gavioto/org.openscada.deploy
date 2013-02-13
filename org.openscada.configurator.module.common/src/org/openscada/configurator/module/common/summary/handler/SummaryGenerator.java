/*
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
 * Copyright (C) 2013 Jens Reimann (ctron@dentrassi.de)
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

package org.openscada.configurator.module.common.summary.handler;

import java.util.List;

import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.GenericMasterConfiguration;
import org.openscada.configurator.module.common.summary.GenerateSummaries;
import org.openscada.deploy.iolist.model.HierarchySummaryGroup;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.WeakSummaryReference;
import org.openscada.deploy.iolist.utils.SummaryGroups;

public class SummaryGenerator
{

    private final Configuration cfg;

    private final GenerateSummaries module;

    public SummaryGenerator ( final Project project, final Configuration cfg, final GenerateSummaries module )
    {
        this.cfg = cfg;
        this.module = module;
    }

    public void generateSummaryAlarms ()
    {
        final List<Item> items = this.cfg.getItems ();

        final HierarchySummaryGroup rootGroup = this.cfg.getRootSummaryGroup ();

        for ( final Item item : items )
        {
            if ( item.isIgnoreSummary () )
            {
                continue;
            }

            addItem ( rootGroup, item.getHierarchy (), item );
        }
    }

    private void addItem ( final HierarchySummaryGroup rootGroup, final List<String> location, final Item item )
    {
        final HierarchySummaryGroup locationItems = SummaryGroups.getGroup ( rootGroup, location, 0 );

        if ( isSubSummary ( item ) )
        {
            addSubItemToGroup ( this.cfg, this.cfg.makeMasterId ( item ), locationItems );
        }
        else
        {
            addItemToGroup ( this.cfg, this.cfg.makeMasterId ( item ), locationItems );
        }
    }

    private boolean isSubSummary ( final Item item )
    {
        if ( this.module.getSubItemPattern () != null )
        {
            return this.module.getSubItemPattern ().matcher ( item.getAlias () ).matches ();
        }
        return false;
    }

    private static void addItemToGroup ( final GenericMasterConfiguration cfg, final String itemId, final HierarchySummaryGroup locationItems )
    {
        locationItems.getDataSourceIds ().add ( itemId );
    }

    private static void addSubItemToGroup ( final GenericMasterConfiguration cfg, final String itemId, final HierarchySummaryGroup locationItems )
    {
        final WeakSummaryReference ref = ModelFactory.eINSTANCE.createWeakSummaryReference ();
        ref.setDataSourceId ( itemId );
        locationItems.getWeakReferences ().add ( ref );
    }
    /*
    private static SummaryGroup getGroupX ( final Configuration cfg, final Project project, final GenerateSummaries module, final Map<List<String>, SummaryGroup> locations, final List<String> location )
    {
        SummaryGroup locationItems = locations.get ( location );
        if ( locationItems == null )
        {
            locationItems = ModelFactory.eINSTANCE.createSummaryGroup ();
            locationItems.getHierarchy ().clear ();
            locationItems.getHierarchy ().addAll ( location );
            locationItems.setId ( makeGroupId ( project, location, module ) );
            locations.put ( location, locationItems );

            final LinkedList<String> parentLocation = new LinkedList<String> ( location );
            if ( !parentLocation.isEmpty () )
            {
                parentLocation.removeLast ();
                final SummaryGroup parentGroup = getGroupX ( cfg, project, module, locations, parentLocation );

                addSubItemToGroup ( cfg, locationItems.getId () + ".master", parentGroup );
            }
        }
        return locationItems;
    }
    */

    /*
    private static String makeGroupId ( final Project project, final List<String> location, final GenerateSummaries module )
    {
        final StringBuilder sb = new StringBuilder ();

        if ( module.getPrefix () != null )
        {
            sb.append ( module.getPrefix () );
        }

        for ( final String level : location )
        {
            if ( sb.length () > 0 )
            {
                sb.append ( "." );
            }
            if ( level != null )
            {
                sb.append ( level );
            }
        }

        if ( module.getSuffix () != null )
        {
            sb.append ( module.getSuffix () );
        }

        return sb.toString ();
    }
    */
}
