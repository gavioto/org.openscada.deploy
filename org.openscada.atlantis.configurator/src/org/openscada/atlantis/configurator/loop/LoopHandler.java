package org.openscada.atlantis.configurator.loop;

import java.util.Map;
import java.util.Set;

public interface LoopHandler
{
    public Set<DataSourceDescriptor> getNode ( String configurationId, Map<String, Object> parameters );

    public boolean providesDescriptors ();

    public boolean providesPostProcessing ();

    public void postProcess ( Set<DataSourceDescriptor> descriptors );
}
