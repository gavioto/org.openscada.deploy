package org.openscada.atlantis.configurator;

import java.util.Map;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.data.RowHandler;

public class AuthorizationHandler implements RowHandler
{
    private final Configuration configuration;

    public AuthorizationHandler ( final Configuration configuration )
    {
        this.configuration = configuration;
    }

    @Override
    public void handleRow ( final int rowNumber, final Map<String, String> rowData )
    {
        final String id = rowData.get ( "ID" );

        if ( id == null || id.isEmpty () )
        {
            return;
        }

        final Integer priority = Integer.parseInt ( rowData.get ( "PRIORITY" ), 10 );
        final String idFilter = rowData.get ( "ID_FILTER" ).isEmpty () ? null : rowData.get ( "ID_FILTER" );
        final String typeFilter = rowData.get ( "TYPE_FILTER" ).isEmpty () ? null : rowData.get ( "TYPE_FILTER" );
        final String actionFilter = rowData.get ( "ACTION_FILTER" ).isEmpty () ? null : rowData.get ( "ACTION_FILTER" );
        final String script = rowData.get ( "SCRIPT" );

        this.configuration.addAuthorizationScript ( id, script, priority, idFilter, typeFilter, actionFilter );
    }

}
