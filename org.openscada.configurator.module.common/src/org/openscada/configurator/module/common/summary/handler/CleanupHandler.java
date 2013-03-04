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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.summary.CleanupSummaries;
import org.openscada.deploy.iolist.model.HierarchySummaryGroup;

public class CleanupHandler
{

    public static void process ( final Configuration configuration, final Project project, final CleanupSummaries module )
    {
        final HierarchySummaryGroup root = configuration.getRootSummaryGroup ();

        final int removed = processChild ( root, module );
        System.out.println ( String.format ( " ** Removed %s entries", removed ) );
    }

    private static int processChild ( final HierarchySummaryGroup group, final CleanupSummaries module )
    {
        if ( group == null )
        {
            return 0;
        }

        int removed = 0;

        for ( final HierarchySummaryGroup child : new ArrayList<HierarchySummaryGroup> ( group.getChildren () ) )
        {
            removed += processChild ( child, module );
        }

        if ( group.getParent () != null && group.getDataSourceIds ().size () < module.getRequiredItems () && group.getWeakReferences ().isEmpty () && group.getChildren ().isEmpty () )
        {
            removed++;

            // gather combined summary list
            final Set<String> ids = new HashSet<String> ( group.getParent ().getDataSourceIds () );
            ids.addAll ( group.getDataSourceIds () );

            // set combined summary list
            group.getParent ().getDataSourceIds ().clear ();
            group.getParent ().getDataSourceIds ().addAll ( ids );

            // remove us from the parent
            group.getParent ().getChildren ().remove ( group );
            group.setParent ( null );

        }

        return removed;
    }
    /*
    public static void process ( final Configuration configuration, final Project project, final CleanupSummaries module )
    {
        int totalRemoved = 0;
        int removed;
        while ( ( removed = perform ( configuration, module ) ) > 0 )
        {
            System.out.println ( "** Removed " + removed );
            totalRemoved += removed;
        }
        System.out.println ( String.format ( "** Total removed: %s, remaining: %s", totalRemoved, configuration.getSummaryGroups ().size () ) );
    }

    protected static int perform ( final Configuration configuration, final CleanupSummaries module )
    {
        int hasRemoved = 0;

        final Set<String> removed = new HashSet<String> ();

        // iterate over all groups and remove the ones that have "too less" items
        for ( final SummaryGroup group : new ArrayList<SummaryGroup> ( configuration.getSummaryGroups () ) )
        {
            if ( !group.getSubSummaryIds ().isEmpty () )
            {
                // we have sub summary ids ... so never remove
                continue;
            }

            if ( group.getDataSourceIds ().size () < module.getRequiredItems () && !group.isRetain () )
            {
                // System.out.println ( "Removing summary group: " + group.getId () );
                configuration.removeSummary ( group );
                removed.add ( group.getId () );

                hasRemoved++;
            }
        }

        // remove the removed sub-summary-group-items from the parent groups
        for ( final SummaryGroup group : configuration.getSummaryGroups () )
        {
            final Iterator<String> i = group.getSubSummaryIds ().iterator ();
            while ( i.hasNext () )
            {
                final String id = i.next ();
                for ( final String groupId : removed )
                {
                    if ( id.equals ( groupId + ".master" ) )
                    {
                        // System.out.println ( String.format ( " - Removing summary group %s from parent group %s", groupId, group.getId () ) );
                        i.remove ();
                    }
                }
            }
        }

        return hasRemoved;
    }
    */

}
