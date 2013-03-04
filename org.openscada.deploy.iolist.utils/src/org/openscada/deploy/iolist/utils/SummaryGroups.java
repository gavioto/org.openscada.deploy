/*
 * This file is part of the openSCADA project
 * 
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

package org.openscada.deploy.iolist.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openscada.deploy.iolist.model.HierarchySummaryGroup;
import org.openscada.deploy.iolist.model.ModelFactory;

public final class SummaryGroups
{
    private SummaryGroups ()
    {
    }

    public static HierarchySummaryGroup mergeRoots ( final HierarchySummaryGroup root1, final HierarchySummaryGroup root2 )
    {
        if ( root1 == null )
        {
            return root2;
        }
        if ( root2 == null )
        {
            return root1;
        }

        final HierarchySummaryGroup group = ModelFactory.eINSTANCE.createHierarchySummaryGroup ();

        mergeFrom ( group, root1, 0 );
        mergeFrom ( group, root2, 0 );

        return group;
    }

    private static void mergeFrom ( final HierarchySummaryGroup ours, final HierarchySummaryGroup theirs, final int pos )
    {
        final Set<String> merger = new HashSet<String> ( ours.getDataSourceIds () );
        merger.addAll ( theirs.getDataSourceIds () );

        ours.getDataSourceIds ().clear ();
        ours.getDataSourceIds ().addAll ( merger );

        for ( final HierarchySummaryGroup child : theirs.getChildren () )
        {
            final HierarchySummaryGroup ourChild = getGroup ( ours, child.getHierarchy (), pos );
            mergeFrom ( ourChild, child, pos + 1 );
        }
    }

    public static HierarchySummaryGroup getGroup ( final HierarchySummaryGroup root, final List<String> hierarchy )
    {
        return getGroup ( root, hierarchy, 0 );
    }

    public static HierarchySummaryGroup getGroup ( final HierarchySummaryGroup parent, final List<String> hierarchy, final int pos )
    {
        return getGroup ( parent, hierarchy, pos, false );
    }

    public static HierarchySummaryGroup getGroup ( final HierarchySummaryGroup parent, final List<String> hierarchy, final int pos, final boolean dontCreate )
    {
        if ( pos >= hierarchy.size () )
        {
            return parent;
        }

        final String key = hierarchy.get ( pos );
        for ( final HierarchySummaryGroup group : parent.getChildren () )
        {
            if ( group.getName ().equals ( key ) )
            {
                // we found a matching child
                return getGroup ( group, hierarchy, pos + 1 );
            }
        }

        if ( dontCreate )
        {
            return null;
        }

        return createGroup ( parent, hierarchy, pos );
    }

    private static HierarchySummaryGroup createGroup ( final HierarchySummaryGroup parent, final List<String> hierarchy, final int pos )
    {
        if ( pos >= hierarchy.size () )
        {
            return parent;
        }

        final HierarchySummaryGroup group = ModelFactory.eINSTANCE.createHierarchySummaryGroup ();

        parent.getChildren ().add ( group );
        group.setParent ( parent );

        group.setName ( hierarchy.get ( pos ) );

        // fill hierarchy
        group.getHierarchy ().clear ();
        for ( int i = 0; i <= pos; i++ )
        {
            group.getHierarchy ().add ( hierarchy.get ( i ) );
        }

        return createGroup ( group, hierarchy, pos + 1 );
    }

}
