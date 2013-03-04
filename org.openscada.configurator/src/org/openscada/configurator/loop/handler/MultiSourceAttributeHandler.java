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

public class MultiSourceAttributeHandler extends NoOpHandler implements LoopHandler
{
    private final String attributePrefix;

    public MultiSourceAttributeHandler ( final String attributePrefix )
    {
        this.attributePrefix = attributePrefix;
    }

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, String> parameters )
    {
        final DataSourceDescriptor desc = createNode ( configurationId, parameters );

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    protected DataSourceDescriptor createNode ( final String configurationId, final Map<String, String> parameters )
    {
        final DataSourceDescriptor desc = new DataSourceDescriptor ( "datasource", configurationId );

        for ( final Map.Entry<String, String> entry : parameters.entrySet () )
        {
            if ( !entry.getKey ().startsWith ( this.attributePrefix ) )
            {
                continue;
            }

            if ( ! ( entry.getValue () instanceof String ) )
            {
                continue;
            }

            if ( entry.getValue ().isEmpty () )
            {
                continue;
            }

            desc.addReference ( "datasource", entry.getValue () );
        }
        return desc;
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

}
