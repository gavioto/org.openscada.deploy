package org.openscada.configurator.loader.main;

import java.util.Map;
import java.util.regex.Pattern;

import org.openscada.configurator.GenericMasterConfiguration;
import org.openscada.configurator.data.RowHandler;

public class PrioritiesHandler implements RowHandler
{

    private final GenericMasterConfiguration cfg;

    public PrioritiesHandler ( final GenericMasterConfiguration cfg )
    {
        this.cfg = cfg;
    }

    @Override
    public void handleRow ( final int rowNumber, final Map<String, String> rowData )
    {
        final String factoryId = rowData.get ( "FACTORY_ID" );
        final String configurationFilter = rowData.get ( "CONFIGURATION_FILTER" );

        if ( ( factoryId == null || factoryId.isEmpty () ) && ( configurationFilter == null || configurationFilter.isEmpty () ) )
        {
            return;
        }

        final Pattern p;
        if ( configurationFilter != null && !configurationFilter.isEmpty () )
        {
            p = Pattern.compile ( configurationFilter );
        }
        else
        {
            p = null;
        }

        final String prioString = rowData.get ( "DEFAULT_PRIORITY" );

        if ( prioString == null || prioString.isEmpty () )
        {
            throw new IllegalArgumentException ( "DEFAULT_PRIORITY must be set" );
            // FAIL
        }

        final int defaultPriority = Integer.parseInt ( rowData.get ( "DEFAULT_PRIORITY" ) );
        this.cfg.addPriority ( factoryId, p, defaultPriority );
    }

}
