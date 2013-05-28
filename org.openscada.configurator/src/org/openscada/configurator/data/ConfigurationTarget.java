package org.openscada.configurator.data;

import java.util.Map;

public interface ConfigurationTarget
{
    public void addData ( String factoryId, String id, Map<String, String> data );
}
