package org.openscada.configurator.loop.handler;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.scada.ca.ConfigurationDataHelper;
import org.openscada.configurator.loop.DataSourceDescriptor;

public class ProxyQueryHandler extends NoOpHandler
{
    private final String ourType;

    public ProxyQueryHandler ( final String ourType )
    {
        this.ourType = ourType;
    }

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, String> parameters )
    {
        final Set<DataSourceDescriptor> result = new HashSet<DataSourceDescriptor> ();

        final DataSourceDescriptor desc = new DataSourceDescriptor ( this.ourType, configurationId );

        final ConfigurationDataHelper cfg = new ConfigurationDataHelper ( parameters );

        for ( final String query : cfg.getPrefixed ( "local.queries." ).values () )
        {
            desc.addReference ( this.ourType, query );
        }

        for ( final String query : cfg.getPrefixed ( "remove.queries." ).values () )
        {
            final String tok[] = query.split ( "#" );
            desc.addReference ( "ae.connection", tok[0] );
        }

        result.add ( desc );

        return result;
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }
}
