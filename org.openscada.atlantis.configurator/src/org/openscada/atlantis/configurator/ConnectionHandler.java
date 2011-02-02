package org.openscada.atlantis.configurator;

import java.util.Map;

import org.openscada.atlantis.configurator.common.RowHandler;

public class ConnectionHandler implements RowHandler
{
    private final Configuration configuration;

    public ConnectionHandler ( final Configuration configuration )
    {
        this.configuration = configuration;
    }

    @Override
    public void handleRow ( final int rowNumber, final Map<String, String> rowData )
    {
        final String hive = rowData.get ( "HIVE" );

        if ( hive == null || hive.isEmpty () )
        {
            return;
        }

        final String uri = rowData.get ( "URI" );
        System.out.println ( String.format ( "Adding connection '%s' as '%s'", uri, hive ) );
        this.configuration.addConnection ( hive, uri );
    }

}
