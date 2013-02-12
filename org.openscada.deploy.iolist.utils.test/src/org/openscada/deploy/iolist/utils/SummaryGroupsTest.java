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

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openscada.deploy.iolist.model.HierarchySummaryGroup;
import org.openscada.deploy.iolist.model.ModelFactory;

public class SummaryGroupsTest
{
    @Test
    public void merge1 ()
    {
        final HierarchySummaryGroup root1 = ModelFactory.eINSTANCE.createHierarchySummaryGroup ();
        SummaryGroups.getGroup ( root1, Arrays.asList ( "1", "1.1", "1.1.1" ) ).getDataSourceIds ().add ( "A" );

        final HierarchySummaryGroup root2 = ModelFactory.eINSTANCE.createHierarchySummaryGroup ();
        SummaryGroups.getGroup ( root2, Arrays.asList ( "1", "1.1", "1.1.1" ) ).getDataSourceIds ().add ( "B" );

        final HierarchySummaryGroup merged = SummaryGroups.mergeRoots ( root1, root2 );

        assertGroup ( merged, Arrays.asList ( "1", "1.1", "1.1.1" ), "A" );
        assertGroup ( merged, Arrays.asList ( "1", "1.1", "1.1.1" ), "B" );
    }

    private void assertGroup ( final HierarchySummaryGroup root, final List<String> hierarchy, final String dataSourceId )
    {
        final HierarchySummaryGroup group = SummaryGroups.getGroup ( root, hierarchy, 0, true );
        Assert.assertNotNull ( "Summary group does not exists", group );
        Assert.assertTrue ( "Group does not contain requiered element: " + dataSourceId, group.getDataSourceIds ().contains ( dataSourceId ) );
    }
}
