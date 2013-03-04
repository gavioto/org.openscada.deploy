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

package org.openscada.configurator.loop;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DataSourceNode
{
    private final String id;

    private final String type;

    private final Set<DataSourceNode> references = new HashSet<DataSourceNode> ();

    public DataSourceNode ( final String type, final String id )
    {
        this.type = type;
        this.id = id;
    }

    public boolean addReference ( final DataSourceNode node )
    {
        return this.references.add ( node );
    }

    public Set<DataSourceNode> getReferences ()
    {
        return Collections.unmodifiableSet ( this.references );
    }

    public String getId ()
    {
        return this.id;
    }

    public String getType ()
    {
        return this.type;
    }

    @Override
    public String toString ()
    {
        return this.type + "@" + this.id;
    }

    @Override
    public int hashCode ()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( this.id == null ? 0 : this.id.hashCode () );
        result = prime * result + ( this.type == null ? 0 : this.type.hashCode () );
        return result;
    }

    @Override
    public boolean equals ( final Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        if ( obj == null )
        {
            return false;
        }
        if ( ! ( obj instanceof DataSourceNode ) )
        {
            return false;
        }
        final DataSourceNode other = (DataSourceNode)obj;
        if ( this.id == null )
        {
            if ( other.id != null )
            {
                return false;
            }
        }
        else if ( !this.id.equals ( other.id ) )
        {
            return false;
        }
        if ( this.type == null )
        {
            if ( other.type != null )
            {
                return false;
            }
        }
        else if ( !this.type.equals ( other.type ) )
        {
            return false;
        }
        return true;
    }

}