package org.openscada.atlantis.configurator.loop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SummaryHandler implements LoopHandler
{

    private final Set<SummaryDataSourceDescriptor> ourSources = new HashSet<SummaryDataSourceDescriptor> ();

    @Override
    public Set<DataSourceDescriptor> getNode ( final String configurationId, final Map<String, Object> parameters )
    {
        // we will add references later on
        final SummaryDataSourceDescriptor desc = new SummaryDataSourceDescriptor ( configurationId, makeBlacklist ( parameters ), parameters.containsKey ( "onlyMaster" ) );
        this.ourSources.add ( desc );

        return new HashSet<DataSourceDescriptor> ( Arrays.asList ( desc ) );
    }

    private Set<String> makeBlacklist ( final Map<String, Object> parameters )
    {
        final Set<String> result = new HashSet<String> ();

        for ( final Map.Entry<String, Object> entry : parameters.entrySet () )
        {
            if ( entry.getKey ().startsWith ( "blacklist." ) )
            {
                result.add ( (String)entry.getValue () );
            }
        }
        return result;
    }

    @Override
    public boolean providesDescriptors ()
    {
        return true;
    }

    @Override
    public boolean providesPostProcessing ()
    {
        return true;
    }

    @Override
    public void postProcess ( final Set<DataSourceDescriptor> descriptors )
    {
        for ( final SummaryDataSourceDescriptor our : this.ourSources )
        {
            for ( final DataSourceDescriptor desc : descriptors )
            {
                if ( our.equals ( desc ) )
                {
                    // skip ourself
                    continue;
                }

                if ( our.getBlacklist ().contains ( desc.getId () ) )
                {
                    // skip blacklist
                    continue;
                }

                if ( our.isMasterOnly () && !desc.getId ().endsWith ( ".master" ) )
                {
                    continue;
                }

                our.addReference ( desc.getId () );

            }
        }
    }

}
