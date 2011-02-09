package org.openscada.atlantis.configurator.loop;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DataSourceDescriptor
{
    private final String id;

    private final Set<String> references = new HashSet<String> ();

    public DataSourceDescriptor ( final String id )
    {
        this.id = id;
    }

    public String getId ()
    {
        return this.id;
    }

    public Set<String> getReferences ()
    {
        return Collections.unmodifiableSet ( this.references );
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
        if ( ! ( obj instanceof DataSourceDescriptor ) )
        {
            return false;
        }
        final DataSourceDescriptor other = (DataSourceDescriptor)obj;
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

    public void addReference ( final String reference )
    {
        this.references.add ( reference );
    }

    public void addReferences ( final Collection<String> refs )
    {
        this.references.addAll ( refs );
    }

}
