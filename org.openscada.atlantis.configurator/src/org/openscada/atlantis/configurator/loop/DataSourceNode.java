package org.openscada.atlantis.configurator.loop;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DataSourceNode
{
    private final String id;

    private final Set<DataSourceNode> references = new HashSet<DataSourceNode> ();

    public DataSourceNode ( final String id )
    {
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

    @Override
    public int hashCode ()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( this.id == null ? 0 : this.id.hashCode () );
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
        return true;
    }

    @Override
    public String toString ()
    {
        return this.id;
    }

}