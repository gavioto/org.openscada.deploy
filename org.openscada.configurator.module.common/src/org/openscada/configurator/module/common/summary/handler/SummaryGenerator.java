package org.openscada.configurator.module.common.summary.handler;

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
import org.openscada.utils.str.StringHelper;

public class SummaryGenerator
{
    private static class Location
    {
        private final List<String> hierarchy;

        public Location ( final List<String> hierarchy )
        {
            this.hierarchy = hierarchy != null ? new LinkedList<String> ( hierarchy ) : new LinkedList<String> ( hierarchy );
        }

        public List<String> getHierarchy ()
        {
            return Collections.unmodifiableList ( this.hierarchy );
        }

        @Override
        public String toString ()
        {
            return StringHelper.join ( this.hierarchy, ", " );
        }

        @Override
        public int hashCode ()
        {
            final int prime = 31;
            int result = 1;
            result = prime * result + ( this.hierarchy == null ? 0 : this.hierarchy.hashCode () );
            return result;
        }

        @Override
        public boolean equals ( final Object obj )
        {
            if ( this == obj )
            {
                return true;
            }
            if ( obj == null )
            {
                return false;
            }
            if ( getClass () != obj.getClass () )
            {
                return false;
            }
            final Location other = (Location)obj;
            if ( this.hierarchy == null )
            {
                if ( other.hierarchy != null )
                {
                    return false;
                }
            }
            else if ( !this.hierarchy.equals ( other.hierarchy ) )
            {
                return false;
            }
            return true;
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

        // TODO: should fix prefix and suffix from project or module

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

        sb.append ( ".SUM.V" );

        return sb.toString ();
    }
}
