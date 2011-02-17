package org.openscada.atlantis.configurator.script;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.atlantis.configurator.Configuration;
import org.openscada.atlantis.configurator.common.RowHandler;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;

public class ScriptLoadHandler implements RowHandler
{

    private final Collection<Item> items = new ArrayList<Item> ();

    private final Configuration cfg;

    private final File scriptBase;

    public ScriptLoadHandler ( final Configuration cfg, final File scriptBase )
    {
        this.cfg = cfg;
        this.scriptBase = scriptBase;
    }

    @Override
    public void handleRow ( final int rowNumber, final Map<String, String> rowData )
    {
        final String alias = rowData.get ( "ITEM_ID" );
        final String scriptEngine = rowData.get ( "SCRIPT_ENGINE" );
        final String initScript = getScript ( rowData.get ( "INIT_SCRIPT" ) );
        final String updateScript = getScript ( rowData.get ( "UPDATE_SCRIPT" ) );
        final String timeoutScript = getScript ( rowData.get ( "TIMER_SCRIPT" ) );
        final String timerString = rowData.get ( "TIMER" );

        Integer timer;
        if ( timerString != null && timerString.length () > 0 )
        {
            timer = (int)Double.parseDouble ( timerString );
        }
        else
        {
            timer = null;
        }

        final Map<String, String> dataSources = new HashMap<String, String> ();
        {
            // get inputs
            final String dataSource = rowData.get ( "INPUTS" );
            final String[] toks = dataSource.split ( "[, \n\r]+" );
            for ( int i = 0; i < toks.length; i++ )
            {
                final String[] subToks = toks[i].split ( "=", 2 );
                if ( subToks.length > 1 )
                {
                    dataSources.put ( subToks[0], subToks[1] );
                }
                else
                {
                    dataSources.put ( "source" + i, toks[i] );
                }
            }
        }

        final Set<String> outputs = new HashSet<String> ();
        {
            // get outputs
            final String[] toks = rowData.get ( "OUTPUTS" ).split ( "[, \n\t]+" );
            outputs.addAll ( Arrays.asList ( toks ) );
        }

        final String id = alias + ".script";

        this.cfg.addScript ( id, scriptEngine, dataSources, outputs, initScript, updateScript, timeoutScript, timer );

        this.items.add ( createItem ( alias ) );
    }

    private String getScript ( final String string )
    {
        if ( string == null )
        {
            return null;
        }

        if ( !string.startsWith ( "@" ) )
        {
            return string;
        }

        try
        {
            return Configuration.loadFromFile ( new File ( this.scriptBase, string.substring ( 1 ) ) );
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }

    private Item createItem ( final String alias )
    {
        final Item item = ModelFactory.eINSTANCE.createItem ();
        item.setAlias ( alias );
        item.setDevice ( null );
        item.setName ( alias + ".script" );
        item.setLocalHighAvailable ( true );
        item.setLocalLowAvailable ( true );
        item.setLocalHighHighAvailable ( true );
        item.setLocalLowLowAvailable ( true );
        return item;
    }

    public Collection<Item> getItems ()
    {
        return this.items;
    }

}
