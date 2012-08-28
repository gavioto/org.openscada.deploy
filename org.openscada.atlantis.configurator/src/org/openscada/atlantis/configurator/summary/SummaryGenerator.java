package org.openscada.atlantis.configurator.summary;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.SummaryGroup;
import org.openscada.deploy.iolist.model.SummaryItem;

public class SummaryGenerator
{
    private static class Location
    {
        private final List<String> hierarchy;

        public Location ( final List<String> hierarchy )
        {
            this.hierarchy = hierarchy != null ? new LinkedList<String> ( hierarchy ) : Collections.<String> emptyList ();
        }

        public List<String> getHierarchy ()
        {
            return Collections.unmodifiableList ( this.hierarchy );
        }
    }

    public static void generateSummaryAlarms ( final Project project, final Configuration cfg, final List<Item> items, final int requiredSize )
    {
        final Map<Location, SummaryGroup> locations = new HashMap<Location, SummaryGroup> ();
        for ( final Item item : items )
        {
            if ( item.isIgnoreSummary () )
            {
                continue;
            }

            final List<String> group = new LinkedList<String> ();
            for ( final String level : item.getHierarchy () )
            {
                group.add ( level );
                addItem ( project, locations, new Location ( group ), item );
            }
        }

        SumLoader.configureGroups ( cfg, locations.values (), items, requiredSize );
    }

    private static void addItem ( final Project project, final Map<Location, SummaryGroup> locations, final Location location, final Item item )
    {
        /*
        if ( !location.isValid () )
        {
            return;
        }
        */

        SummaryGroup locationItems = locations.get ( location );
        if ( locationItems == null )
        {
            locationItems = ModelFactory.eINSTANCE.createSummaryGroup ();
            locationItems.getHierarchy ().clear ();
            locationItems.getHierarchy ().addAll ( location.getHierarchy () );
            locationItems.setId ( makeGroupId ( project, location ) );
            locations.put ( location, locationItems );
        }

        final SummaryItem summaryItem = ModelFactory.eINSTANCE.createSummaryItem ();
        summaryItem.setDataSourceId ( item.getAlias () + ".master" );
        locationItems.getItems ().add ( summaryItem );
    }

    private static String makeGroupId ( final Project project, final Location location )
    {
        final StringBuilder sb = new StringBuilder ();

        // TODO: should fix prefix from project or module

        final String prefix = System.getProperty ( "prefix", null );
        if ( prefix != null )
        {
            sb.append ( prefix );
        }

        for ( final String level : location.getHierarchy () )
        {
            if ( sb.length () > 0 )
            {
                sb.append ( "." );
            }
            if ( level != null )
            {
                sb.append ( level );
            }
        }

        return sb.toString ();
    }
}
