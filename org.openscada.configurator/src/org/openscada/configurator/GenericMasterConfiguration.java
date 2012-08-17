package org.openscada.configurator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openscada.deploy.iolist.utils.GenericConfiguration;
import org.openscada.utils.str.StringHelper;

public class GenericMasterConfiguration extends GenericConfiguration
{

    public void addMaster ( final String id, final String dataSourceId )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "datasource.id", dataSourceId ); //$NON-NLS-1$

        addData ( "master.item", id, data ); //$NON-NLS-1$
    }

    public void addConnection ( final String id, final String connectionUri )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "connection.uri", connectionUri ); //$NON-NLS-1$

        addData ( "da.connection", id, data ); //$NON-NLS-1$
    }

    public void addAlias ( final String id, final String itemId, final String dataSourceId, final String description )
    {
        final Map<String, String> data = new HashMap<String, String> ();

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
        final Map<String, String> data = new HashMap<String, String> ();
        data.put ( "master.id", masterId ); //$NON-NLS-1$
        data.put ( "tag", type ); //$NON-NLS-1$

        data.put ( "handlerPriority", "" + priority ); //$NON-NLS-1$ //$NON-NLS-2$

        if ( prefix != null )
        {
            data.put ( "prefix", prefix ); //$NON-NLS-1$
        }
        addData ( "da.master.handler.sum", id, data ); //$NON-NLS-1$
    }

    public void addSource ( final String id, final String itemId, final String connectionId )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "item.id", itemId ); //$NON-NLS-1$
        data.put ( "connection.id", connectionId ); //$NON-NLS-1$

        addData ( "da.datasource.dataitem", id, data ); //$NON-NLS-1$
    }

    public void addProxy ( final String id, final String... sources )
    {
        addProxy ( id, new HashSet<String> ( Arrays.asList ( sources ) ) );
    }

    public void addProxy ( final String id, final Set<String> sources )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        final List<String> sourceList = new ArrayList<String> ( sources );
        Collections.sort ( sourceList );

        data.put ( "sources", StringHelper.join ( sourceList, ", " ) );

        addData ( "da.datasource.proxy", id, data ); //$NON-NLS-1$
    }

    protected void addMapperHandler ( final String masterId, final String id, final String mapperId, final String fromAttribute, final String toAttribute )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "master.id", masterId );
        data.put ( "mapper.id", mapperId );
        if ( fromAttribute != null && !fromAttribute.isEmpty () )
        {
            data.put ( "sourceAttributeName", fromAttribute );
        }
        if ( toAttribute != null && !toAttribute.isEmpty () )
        {
            data.put ( "targetAttributeName", toAttribute );
        }

        addData ( "org.openscada.da.master.mapper", id, data );
    }

}
