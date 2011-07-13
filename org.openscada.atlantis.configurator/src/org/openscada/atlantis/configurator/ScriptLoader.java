package org.openscada.atlantis.configurator;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.utils.SpreadSheetPoiHelper;

public class ScriptLoader
{

    private static void addExtScript ( final Configuration cfg, final File scriptBase, final String target, final String function, final Map<String, String> sources, final Collection<Item> items ) throws Exception
    {
        cfg.addScript ( target + ".script", null, sources, null, Configuration.loadFromFile ( new File ( scriptBase, "functions.js" ) ), convertJs ( function, sources.size () ), null, null, null );

        final Item item = ModelFactory.eINSTANCE.createItem ();

        item.setAlias ( target );
        item.setName ( target + ".script" );
        item.setLocalHighAvailable ( true );
        item.setLocalLowAvailable ( true );
        item.setLocalHighHighAvailable ( true );
        item.setLocalLowLowAvailable ( true );

        items.add ( item );
    }

    private static String convertJs ( final String function, final int sources )
    {
        final StringWriter sw = new StringWriter ();
        final PrintWriter pw = new PrintWriter ( sw );

        pw.println ( "var builder = new org.openscada.da.datasource.script.DataItemValueBuilder();" );
        pw.println ( "builder.setSubscriptionState ( org.openscada.da.datasource.script.DataItemValueBuilder.CONNECTED );" );

        if ( Boolean.getBoolean ( "debug" ) )
        {
            pw.println ( "builder.setAttribute ( \"debug\", new org.openscada.core.Variant ( data.toString () ) );" );
        }

        pw.println ( "var error = false;" );
        pw.println ( "var manual = false;" );

        for ( int i = 0; i < sources; i++ )
        {

            final String var = String.format ( "A%s", i + 1 );
            pw.println ( String.format ( "var %1$s = data.get(\"%1$s\");", var ) );
            pw.println ( String.format ( "if ( %1$s === undefined || %1$s == null || %1$s.getValue () == null || %1$s.getValue ().isNull () ) { error = true; }", var ) );

            pw.println ( "else {" );
            pw.println ( String.format ( "if ( %1$s.isManual () ) { manual = true; }", var ) );
            pw.println ( String.format ( "%1$s = %1$s.getValue ().asDouble ();", var ) );
            pw.println ( "}" );
        }

        pw.println ( "if ( error ) {" );
        pw.println ( "  builder.setAttribute ( \"eval.error\", new org.openscada.core.Variant ( true ) );" );
        pw.println ( "} else { " );
        pw.println ( "  try {" );
        pw.println ( "    builder.setAttribute ( \"script.manual\", new org.openscada.core.Variant ( manual ) );" );
        pw.println ( "    builder.setValue ( new org.openscada.core.Variant ( " + function + " ) );" );
        pw.println ( "  }" );
        pw.println ( "  catch ( e ) {" );
        pw.println ( "    builder.setAttribute ( \"func.error\", new org.openscada.core.Variant ( true ) );" );
        pw.println ( "    builder.setAttribute ( \"func.error.message\", new org.openscada.core.Variant ( e ) );" );
        pw.println ( "  }" );
        pw.println ( "}" );

        // set builder as return
        pw.println ( "builder;" );

        return sw.toString ();
    }

    public static String loadScript ( final Configuration cfg, final File file, final File scriptBase, final File itemFile ) throws Exception
    {
        final List<Item> items = new LinkedList<Item> ();

        final LineNumberReader reader = new LineNumberReader ( new FileReader ( file ) );
        try
        {
            String line;

            String target = null;
            String function = null;
            final Map<String, String> sources = new HashMap<String, String> ();

            while ( ( line = reader.readLine () ) != null )
            {
                final String[] toks = line.split ( " " );
                if ( line.length () == 0 )
                {
                    addExtScript ( cfg, scriptBase, target, function, sources, items );
                    sources.clear ();
                }
                else if ( toks.length == 4 )
                {
                    target = makeAlias ( toks[0] );
                    function = toks[1];
                }
                else if ( toks.length == 1 )
                {
                    final String key = String.format ( "A%s", sources.size () + 1 );
                    sources.put ( key, makeAlias ( toks[0] ) + ".master" );
                }
                else if ( toks.length == 0 )
                {
                    addExtScript ( cfg, scriptBase, target, function, sources, items );
                    sources.clear ();
                }
                else
                {
                    throw new RuntimeException ( String.format ( "Invalid entry in line: %s", reader.getLineNumber () ) );
                }
            }

            if ( !sources.isEmpty () )
            {
                addExtScript ( cfg, scriptBase, target, function, sources, items );
            }
        }
        finally
        {
            reader.close ();
        }

        SpreadSheetPoiHelper.writeSpreadsheet ( itemFile, items );

        return itemFile.getAbsolutePath ();
    }

    private static String makeAlias ( String string )
    {
        string = string.replace ( "__", "_" );
        return string;
    }

}
