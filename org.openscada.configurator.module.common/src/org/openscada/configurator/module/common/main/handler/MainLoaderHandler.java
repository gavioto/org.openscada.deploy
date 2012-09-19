package org.openscada.configurator.module.common.main.handler;

import java.io.File;
import java.io.PrintStream;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.data.DataLoaderOdfDom;

public class MainLoaderHandler
{

    public static void loadBasics ( final PrintStream log, final Configuration cfg, final File file ) throws Exception
    {
        log.println ( "Loading basics from: " + file );
        final DataLoaderOdfDom loader = new DataLoaderOdfDom ( file );

        log.println ( "**** 1aa - Loading basic configuration - Connections" );
        loader.load ( 0, new ConnectionHandler ( cfg ) );

        log.println ( "**** 1ab - Loading basic configuration - Authorizations" );
        loader.load ( 1, new AuthorizationHandler ( cfg ) );

        log.println ( "**** 1ac - Loading basic configuration - JMS Monitors" );
        loader.load ( 2, new JmsHandler ( cfg ) );

        log.println ( "**** 1ad - Loading basic configuration - AE" );
        loader.load ( 3, new AeHandler ( cfg ) );

        log.println ( "**** 1ae - Loading basic configuration - AE Filter" );
        loader.load ( 4, new EventFilterHandler ( cfg ) );

        log.println ( "**** 1af - Loading basic configuration - Master Handler Priorities" );
        loader.load ( 5, new PrioritiesHandler ( cfg ) );
    }

}
