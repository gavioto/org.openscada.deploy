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

package org.openscada.configurator.loop.handler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.configurator.loop.DataSourceDescriptor;

public class SummaryHandler implements LoopHandler
{

    private final Set<SummaryDataSourceDescriptor> ourSources = new HashSet<SummaryDataSourceDescriptor> ();

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, String> parameters )
    {
        // we will add references later on
        final SummaryDataSourceDescriptor desc = new SummaryDataSourceDescriptor ( configurationId, makeBlacklist ( parameters ), parameters.containsKey ( "onlyMaster" ) );
        this.ourSources.add ( desc );

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    private Set<String> makeBlacklist ( final Map<String, String> parameters )
    {
        final Set<String> result = new HashSet<String> ();

        for ( final Map.Entry<String, String> entry : parameters.entrySet () )
        {
            if ( entry.getKey ().startsWith ( "blacklist." ) )
            {
                result.add ( entry.getValue () );
            }
        }
        return result;
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

    @Override
    public boolean providesPostProcessing ()
    {
        return true;
    }

    @Override
    public void postProcess ( final Set<DataSourceDescriptor> descriptors )
    {
        for ( final SummaryDataSourceDescriptor our : this.ourSources )
        {
            for ( final DataSourceDescriptor desc : descriptors )
            {
                if ( our.equals ( desc ) )
                {
                    // skip ourself
                    continue;
                }

                if ( our.getBlacklist ().contains ( desc.getId () ) )
                {
                    // skip blacklist
                    continue;
                }

                if ( our.isMasterOnly () && !desc.getId ().endsWith ( ".master" ) )
                {
                    continue;
                }

                our.addReference ( "datasource", desc.getId () );

            }
        }
    }

}
