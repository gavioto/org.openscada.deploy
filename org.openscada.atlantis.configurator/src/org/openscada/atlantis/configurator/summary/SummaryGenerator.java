package org.openscada.atlantis.configurator.summary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openscada.atlantis.configurator.Configuration;

import com.inavare.vims.iolist.model.Item;
import com.inavare.vims.iolist.model.ModelFactory;
import com.inavare.vims.iolist.model.SummaryGroup;
import com.inavare.vims.iolist.model.SummaryItem;

public class SummaryGenerator
{
    private static class Location
    {
        private final String location;

        private final String component;

        public Location ( final String location, final String component )
        {
            super ();
            this.location = location;
            this.component = component;
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
            return this.location != null && this.component != null && this.location.length () != 0 && this.component.length () != 0;
        }

    }

    public static void generateSummaryAlarms ( final Configuration cfg, final List<Item> items )
    {
        final Map<Location, SummaryGroup> locations = new HashMap<Location, SummaryGroup> ();
        for ( final Item item : items )
        {
            final Location location = new Location ( item.getLocation (), item.getComponent () );
            if ( !location.isValid () || item.isIgnoreSummary () )
            {
                continue;
            }

            SummaryGroup locationItems = locations.get ( location );
            if ( locationItems == null )
            {
                locationItems = ModelFactory.eINSTANCE.createSummaryGroup ();
                locationItems.setLocation ( item.getLocation () );
                locationItems.setComponent ( item.getComponent () );
                locationItems.setId ( makeGroupId ( location ) );
                locations.put ( location, locationItems );
            }

            final SummaryItem summaryItem = ModelFactory.eINSTANCE.createSummaryItem ();
            summaryItem.setDataSourceId ( item.getAlias () + ".master" );
            locationItems.getItems ().add ( summaryItem );
        }

        SumLoader.configureGroups ( cfg, locations.values (), items );
    }

    private static String makeGroupId ( final Location location )
    {
        return System.getProperty ( "prefix", "BG_IPT" ) + "." + location.getLocation () + "." + location.getComponent () + ".SUM.V";
    }
}
