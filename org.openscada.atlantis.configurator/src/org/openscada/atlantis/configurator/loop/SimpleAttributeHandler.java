package org.openscada.atlantis.configurator.loop;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SimpleAttributeHandler extends NoOpHandler implements LoopHandler
{
    private final String attributeName;

    public SimpleAttributeHandler ( final String attributeName )
    {
        this.attributeName = attributeName;
    }

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, Object> parameters )
    {
        final DataSourceDescriptor desc = new DataSourceDescriptor ( configurationId );
        final Object reference = parameters.get ( this.attributeName );

        if ( ! ( reference instanceof String ) )
        {
            return Collections.emptySet ();
        }

        if ( ( (String)reference ).isEmpty () )
        {
            return Collections.emptySet ();
        }

        desc.addReference ( (String)reference );

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

}
