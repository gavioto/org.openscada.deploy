package org.openscada.atlantis.configurator.loop.handler;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.openscada.atlantis.configurator.loop.DataSourceDescriptor;

public class NoOpHandler implements LoopHandler
{

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, String> parameters )
    {
        return Collections.emptySet ();
    }

    @Override
    public boolean providesDescriptors ()
    {
        return false;
    }

    @Override
    public boolean providesPostProcessing ()
    {
        return false;
    }

    @Override
    public void postProcess ( final Set<DataSourceDescriptor> descriptors )
    {
    }

}
