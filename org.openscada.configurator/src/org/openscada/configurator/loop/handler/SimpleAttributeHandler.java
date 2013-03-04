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
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.configurator.loop.DataSourceDescriptor;

public class SimpleAttributeHandler extends NoOpHandler implements LoopHandler
{
    private final String attributeName;

    private final String type;

    private final String referenceType;

    private final String splitPattern;

    public SimpleAttributeHandler ( final String type, final String referenceType, final String attributeName, final String splitPattern )
    {
        this.type = type;
        this.referenceType = referenceType;
        this.attributeName = attributeName;
        this.splitPattern = splitPattern;
    }

    public SimpleAttributeHandler ( final String type, final String referenceType, final String attributeName )
    {
        this ( type, referenceType, attributeName, null );
    }

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, String> parameters )
    {
        final DataSourceDescriptor desc = new DataSourceDescriptor ( this.type, configurationId );
        final String reference = parameters.get ( this.attributeName );

        if ( reference == null || reference.isEmpty () )
        {
            return Collections.emptySet ();
        }

        if ( this.splitPattern != null )
        {
            for ( final String ref : reference.split ( this.splitPattern ) )
            {
                desc.addReference ( this.referenceType, ref );
            }
        }
        else
        {
            desc.addReference ( this.referenceType, reference );
        }

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

}
