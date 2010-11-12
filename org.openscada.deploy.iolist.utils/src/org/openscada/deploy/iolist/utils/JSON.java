package org.openscada.deploy.iolist.utils;

import java.io.PrintStream;
import java.util.Map;

public class JSON
{

    public static void endFile ( final PrintStream out )
    {
        out.println ( "];" );

    }

    public static void startFile ( final PrintStream out )
    {
        out.println ( "ids=[" );
    }

    public static void writeMap ( final String id, final Map<String, Object> data, final PrintStream out )
    {
        out.println ( "{" );

        out.print ( "   " );
        out.print ( String.format ( "\"id\":\"%s\",", id ) );
        out.println ();

        for ( final Map.Entry<String, Object> entry : data.entrySet () )
        {
            writeEntry ( out, entry.getKey (), entry.getValue () );
        }

        out.print ( "}," );
        out.println ();
    }

    private static void writeEntry ( final PrintStream out, final String key, final Object value )
    {
        out.print ( "   " );

        out.print ( "\"" + key + "\"" );
        out.print ( ":" );

        if ( value instanceof Number )
        {
            out.print ( value );
        }
        else
        {
            out.print ( "\"" );
            out.print ( escape ( "" + value ) );
            out.print ( "\"" );
        }

        out.print ( "," );
        out.println ();
    }

    private static String escape ( final String value )
    {
        String str = value.replace ( "\\", "\\\\" );
        str = str.replace ( "\"", "\\\"" );
        str = str.replace ( "\t", "\\t" );
        // str = str.replace ( "/", "\\/" );
        str = str.replace ( "\n", "\\n" );
        str = str.replace ( "\r", "\\r" );
        return str;
    }

}
