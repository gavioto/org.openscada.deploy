package org.openscada.atlantis.configurator.loop.handler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.atlantis.configurator.loop.DataSourceDescriptor;

public class MultiSourceAttributeHandler extends NoOpHandler implements LoopHandler
{
    private final String attributePrefix;

    public MultiSourceAttributeHandler ( final String attributePrefix )
    {
        this.attributePrefix = attributePrefix;
    }

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, Object> parameters )
    {
        final DataSourceDescriptor desc = createNode ( configurationId, parameters );

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    protected DataSourceDescriptor createNode ( final String configurationId, final Map<String, Object> parameters )
    {
        final DataSourceDescriptor desc = new DataSourceDescriptor ( "datasource", configurationId );

        for ( final Map.Entry<String, Object> entry : parameters.entrySet () )
        {
            if ( !entry.getKey ().startsWith ( this.attributePrefix ) )
            {
                continue;
            }

            if ( ! ( entry.getValue () instanceof String ) )
            {
                continue;
            }

            if ( ( (String)entry.getValue () ).isEmpty () )
            {
                continue;
            }

            desc.addReference ( "datasource", (String)entry.getValue () );
        }
        return desc;
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

}
