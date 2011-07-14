package org.openscada.atlantis.configurator;

import java.util.HashMap;
import java.util.Map;

import org.openscada.deploy.iolist.utils.GenericConfiguration;

public class GenericMasterConfiguration extends GenericConfiguration
{

    public void addMaster ( final String id, final String dataSourceId )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "datasource.id", dataSourceId ); //$NON-NLS-1$

        addData ( "master.item", id, data ); //$NON-NLS-1$
    }

    protected void addConnection ( final String id, final String connectionUri )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "connection.uri", connectionUri ); //$NON-NLS-1$

        addData ( "da.connection", id, data ); //$NON-NLS-1$
    }

    public void addAlias ( final String id, final String itemId, final String dataSourceId, final String description )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();

        data.put ( "datasource.id", dataSourceId ); //$NON-NLS-1$
        data.put ( "item.id", itemId ); //$NON-NLS-1$
        if ( description != null )
        {
            data.put ( "description", description ); //$NON-NLS-1$
        }

        addData ( "da.dataitem.datasource", id, data ); //$NON-NLS-1$
    }

    protected void addDefaultChain ( final String masterId )
    {
        addSum ( masterId + ".sum.error.phase1", masterId, "error", 600, "phase1" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

        addSum ( masterId + ".sum.manual", masterId, "manual", 5010, null ); //$NON-NLS-1$ //$NON-NLS-2$
        addSum ( masterId + ".sum.error.phase2", masterId, "error", 5000, "phase2" ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        addSum ( masterId + ".sum.alarm", masterId, "alarm", 5020, null ); //$NON-NLS-1$ //$NON-NLS-2$
        addSum ( masterId + ".sum.ackRequired", masterId, "ackRequired", 5030, null ); //$NON-NLS-1$ //$NON-NLS-2$
        addSum ( masterId + ".sum.blocked", masterId, "blocked", 5040, null ); //$NON-NLS-1$ //$NON-NLS-2$
    }

    protected void addSum ( final String id, final String masterId, final String type, final int priority, final String prefix )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();
        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "tag", type ); //$NON-NLS-1$

        data.put ( "handlerPriority", "" + priority ); //$NON-NLS-1$ //$NON-NLS-2$

        if ( prefix != null )
        {
            data.put ( "prefix", prefix ); //$NON-NLS-1$
        }
        addData ( String.format ( "da.master.handler.sum", type ), id, data ); //$NON-NLS-1$
    }

    public void addSource ( final String id, final String itemId, final String connectionId )
    {
        final Map<String, Object> data = new HashMap<String, Object> ();
    
        data.put ( "item.id", itemId ); //$NON-NLS-1$
        data.put ( "connection.id", connectionId ); //$NON-NLS-1$
    
        addData ( "da.datasource.dataitem", id, data ); //$NON-NLS-1$
    }

}
