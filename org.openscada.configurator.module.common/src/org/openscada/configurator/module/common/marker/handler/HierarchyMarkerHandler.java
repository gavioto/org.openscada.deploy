package org.openscada.configurator.module.common.marker.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.marker.HierarchyMarkerGenerator;
import org.openscada.configurator.module.common.marker.Marker;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.utils.str.StringHelper;

public class HierarchyMarkerHandler
{

    private final Configuration configuration;

    private final HierarchyMarkerGenerator module;

    public HierarchyMarkerHandler ( final Configuration configuration, final Project project, final HierarchyMarkerGenerator module )
    {
        this.configuration = configuration;
        this.module = module;
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

        final Map<String, String> markers = convert ( this.module.getMarkers () );

        for ( final Map.Entry<List<String>, Set<Item>> entry : locationItemMap.entrySet () )
        {
            // System.out.println ( String.format ( "Marker group %s -> %s entries - > %s", entry.getKey (), entry.getValue ().size (), entry.getValue () ) );

            final Map<String, String> attributes = new HashMap<String, String> ();

            Configuration.convertHierarchyToInfoAttributes ( entry.getKey (), attributes );

            this.configuration.addMarker ( this.module.getMarkerName () + "." + StringHelper.join ( entry.getKey (), "_" ), entry.getValue (), markers, attributes );
        }
    }

    private Map<String, String> convert ( final EList<Marker> markers )
    {
        final Map<String, String> result = new HashMap<String, String> ();

        for ( final Marker marker : markers )
        {
            result.put ( marker.getName (), marker.getValue () );
        }

        return result;
    }

}
