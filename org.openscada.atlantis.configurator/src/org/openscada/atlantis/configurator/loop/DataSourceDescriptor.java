package org.openscada.atlantis.configurator.loop;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DataSourceDescriptor extends DataSourceReference
{

    public DataSourceDescriptor ( final String type, final String id )
    {
        super ( type, id );
    }

    private final Set<DataSourceReference> references = new HashSet<DataSourceReference> ();

    public Set<DataSourceReference> getReferences ()
    {
        return Collections.unmodifiableSet ( this.references );
    }

    public void addReference ( final String type, final String reference )
    {
        this.references.add ( new DataSourceReference ( type, reference ) );
    }

}
