package org.openscada.atlantis.configurator.loop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.atlantis.configurator.loop.handler.LoopHandler;
import org.openscada.atlantis.configurator.loop.handler.NoOpHandler;

public class SimpleHandler extends NoOpHandler implements LoopHandler
{
    private final String type;

    public SimpleHandler ( final String type )
    {
        this.type = type;
    }

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, String> parameters )
    {
        final DataSourceDescriptor desc = new DataSourceDescriptor ( this.type, configurationId );

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

}
