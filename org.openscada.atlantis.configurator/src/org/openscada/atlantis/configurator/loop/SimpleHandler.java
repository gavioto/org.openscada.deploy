package org.openscada.atlantis.configurator.loop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.atlantis.configurator.loop.handler.LoopHandler;
import org.openscada.atlantis.configurator.loop.handler.NoOpHandler;

public class SimpleHandler extends NoOpHandler implements LoopHandler
{
    public SimpleHandler ()
    {
    }

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, Object> parameters )
    {
        final DataSourceDescriptor desc = new DataSourceDescriptor ( configurationId );

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

}
