package org.openscada.configurator.module.common.main.handler;

import java.util.Map;

import org.openscada.configurator.GenericMasterConfiguration;
import org.openscada.configurator.data.RowHandler;

public class ConnectionHandler implements RowHandler
{
    private final GenericMasterConfiguration configuration;

    public ConnectionHandler ( final GenericMasterConfiguration configuration )
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
