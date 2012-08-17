package org.openscada.atlantis.configurator.summary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openscada.configurator.Configuration;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.SummaryGroup;
import org.openscada.deploy.iolist.model.SummaryItem;

public class SummaryGenerator
{
    private static class Location
    {
        private final String location;

        private final String component;

        public Location ( final String location, final String component )
        {
            super ();
            this.location = location == null ? "" : location;
            this.component = component == null ? "" : component;
        }

        public String getComponent ()
        {
            return this.component;
        }

        public String getLocation ()
        {
            return this.location;
        }

        @Override
        public int hashCode ()
        {
            final int prime = 31;
            int result = 1;
            result = prime * result + ( this.component == null ? 0 : this.component.hashCode () );
            result = prime * result + ( this.location == null ? 0 : this.location.hashCode () );
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
            if ( ! ( obj instanceof Location ) )
            {
                return false;
            }
            final Location other = (Location)obj;
            if ( this.component == null )
            {
                if ( other.component != null )
                {
                    return false;
                }
            }
            else if ( !this.component.equals ( other.component ) )
            {
                return false;
            }
            if ( this.location == null )
            {
                if ( other.location != null )
                {
                    return false;
                }
            }
            else if ( !this.location.equals ( other.location ) )
            {
                return false;
            }
            return true;
        }

        public boolean isValid ()
        {
            return this.location != null && this.location.length () != 0;
        }

    }

    public static void generateSummaryAlarms ( final Configuration cfg, final List<Item> items, final int requiredSize )
    {
        final Map<Location, SummaryGroup> locations = new HashMap<Location, SummaryGroup> ();
        for ( final Item item : items )
        {
            if ( item.isIgnoreSummary () )
            {
                continue;
            }

            addItem ( locations, new Location ( item.getLocation (), item.getComponent () ), item );
            addItem ( locations, new Location ( item.getLocation (), null ), item );
        }

        SumLoader.configureGroups ( cfg, locations.values (), items, requiredSize );
    }

    private static void addItem ( final Map<Location, SummaryGroup> locations, final Location location, final Item item )
    {
        if ( !location.isValid () )
        {
            return;
        }

        SummaryGroup locationItems = locations.get ( location );
        if ( locationItems == null )
        {
            locationItems = ModelFactory.eINSTANCE.createSummaryGroup ();
            locationItems.setLocation ( location.getLocation () );
            locationItems.setComponent ( location.getComponent () );
            locationItems.setId ( makeGroupId ( location ) );
            locations.put ( location, locationItems );
        }

        final SummaryItem summaryItem = ModelFactory.eINSTANCE.createSummaryItem ();
        summaryItem.setDataSourceId ( item.getAlias () + ".master" );
        locationItems.getItems ().add ( summaryItem );
    }

    private static String makeGroupId ( final Location location )
    {
        final String strLoc = location.getLocation () == null ? "" : location.getLocation ();
        final String strComp = location.getComponent () == null ? "" : location.getComponent ();

        return System.getProperty ( "prefix", "BG_IPT" ) + "." + strLoc + "." + strComp + ".SUM.V";
    }
}
