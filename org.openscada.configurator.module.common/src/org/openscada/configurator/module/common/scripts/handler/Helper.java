package org.openscada.configurator.module.common.scripts.handler;

import java.util.HashMap;
import java.util.Map;

public class Helper
{

    public static Map<String, String> parseInputs ( final String dataSource )
    {
        final Map<String, String> result = new HashMap<String, String> ();
        if ( dataSource == null || dataSource.isEmpty () )
        {
            return result;
        }

        final String[] toks = dataSource.split ( "[, \n\r]+" );
        for ( int i = 0; i < toks.length; i++ )
        {
            final String[] subToks = toks[i].split ( "=", 2 );
            if ( subToks.length > 1 )
            {
                result.put ( subToks[0], subToks[1] );
            }
            else
            {
                result.put ( "source" + i, toks[i] );
            }
        }
        return result;
    }
}
