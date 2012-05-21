package org.openscada.atlantis.configurator.loop.handler;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.atlantis.configurator.loop.DataSourceDescriptor;

public class SimpleAttributeHandler extends NoOpHandler implements LoopHandler
{
    private final String attributeName;

    private final String type;

    private final String referenceType;

    public SimpleAttributeHandler ( final String type, final String referenceType, final String attributeName )
    {
        this.type = type;
        this.referenceType = referenceType;
        this.attributeName = attributeName;
    }

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, String> parameters )
    {
        final DataSourceDescriptor desc = new DataSourceDescriptor ( this.type, configurationId );
        final Object reference = parameters.get ( this.attributeName );

        if ( ! ( reference instanceof String ) )
        {
            return Collections.emptySet ();
        }

        if ( ( (String)reference ).isEmpty () )
        {
            return Collections.emptySet ();
        }

        desc.addReference ( this.referenceType, (String)reference );

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

}
