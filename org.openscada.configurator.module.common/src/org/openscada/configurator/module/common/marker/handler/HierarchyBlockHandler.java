package org.openscada.configurator.module.common.marker.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.scada.utils.str.StringHelper;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.marker.HierarchyBlockGenerator;
import org.openscada.deploy.iolist.model.Item;

public class HierarchyBlockHandler
{

    private final Configuration configuration;

    public HierarchyBlockHandler ( final Configuration configuration, final Project project, final HierarchyBlockGenerator module )
    {
        this.configuration = configuration;
    }

    public void process ()
    {
        final Map<List<String>, Set<Item>> locationItemMap = new HashMap<List<String>, Set<Item>> ();
        for ( final Item item : this.configuration.getItems () )
        {
            if ( item.getHierarchy () == null || item.getHierarchy ().isEmpty () )
            {
                continue;
            }

            final LinkedList<String> hierarchy = new LinkedList<String> ( item.getHierarchy () );

            while ( !hierarchy.isEmpty () )
            {
                Set<Item> itemSet = locationItemMap.get ( hierarchy );
                if ( itemSet == null )
                {
                    itemSet = new HashSet<Item> ();
                    locationItemMap.put ( new ArrayList<String> ( hierarchy ), itemSet );
                }
                itemSet.add ( item );
                hierarchy.removeLast ();
            }
        }

        final Map<String, String> attributes = new HashMap<String, String> ();

        for ( final Map.Entry<List<String>, Set<Item>> entry : locationItemMap.entrySet () )
        {
            final ArrayList<String> masterIds = new ArrayList<String> ();
            for ( final Item item : entry.getValue () )
            {
                masterIds.add ( this.configuration.makeMasterId ( item ) );
            }

            this.configuration.addBlock ( "block." + StringHelper.join ( entry.getKey (), "_" ), masterIds, attributes );
        }
    }

}
