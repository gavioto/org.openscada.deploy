package org.openscada.atlantis.configurator.loop;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class NoOpHandler implements LoopHandler
{

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, Object> parameters )
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
