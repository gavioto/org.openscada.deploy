package org.openscada.configurator.loop.handler;

import java.util.Map;
import java.util.Set;

import org.openscada.configurator.loop.DataSourceDescriptor;

public interface LoopHandler
{
    public Set<DataSourceDescriptor> getNode ( String configurationId, Map<String, String> parameters );

    public boolean providesDescriptors ();

    public boolean providesPostProcessing ();

    public void postProcess ( Set<DataSourceDescriptor> descriptors );
}
