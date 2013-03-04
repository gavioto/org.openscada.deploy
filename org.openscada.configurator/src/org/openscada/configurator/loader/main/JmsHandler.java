package org.openscada.configurator.loader.main;

import java.util.HashMap;
import java.util.Map;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.data.RowHandler;

public class JmsHandler implements RowHandler
{
    private final Configuration configuration;

    public JmsHandler ( final Configuration configuration )
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

        final String system = rowData.get ( "SYSTEM" );
        final String actorType = rowData.get ( "ACTOR_TYPE" );
        final String monitorType = rowData.get ( "MONITOR_TYPE" );
        final String message = rowData.get ( "MESSAGE" );
        final String filter = rowData.get ( "FILTER" );

        final Map<String, String> attributes = new HashMap<String, String> ();

        attributes.put ( "system", system );
        attributes.put ( "actorType", actorType );
        attributes.put ( "monitorType", monitorType );
        attributes.put ( "message", message );

        this.configuration.addJmsMonitor ( id, filter, attributes );
    }

}
