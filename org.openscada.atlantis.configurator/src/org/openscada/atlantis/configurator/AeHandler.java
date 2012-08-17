package org.openscada.atlantis.configurator;

import java.util.Map;

import org.openscada.configurator.RowHandler;

public class AeHandler implements RowHandler
{
    private final Configuration configuration;

    public AeHandler ( final Configuration configuration )
    {
        this.configuration = configuration;
    }

    @Override
    public void handleRow ( final int rowNumber, final Map<String, String> rowData )
    {
        final String type = rowData.get ( "TYPE" );
        final String id = rowData.get ( "ID" );

        if ( type == null || type.isEmpty () || id == null || id.isEmpty () )
        {
            return;
        }

        if ( type.equals ( "EVENT" ) )
        {
            final String filter = rowData.get ( "FILTER" );
            final int size = Integer.parseInt ( rowData.get ( "SIZE" ) );
            this.configuration.addEventQuery ( id, filter, size );
        }
        else if ( type.equals ( "MONITOR" ) )
        {
            final String filter = rowData.get ( "FILTER" );
            this.configuration.addMonitorQuery ( id, filter );
        }
    }
}
