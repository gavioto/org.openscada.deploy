package org.openscada.atlantis.configurator.report;

import java.util.LinkedList;
import java.util.List;

public class DataItem
{
    private final String id;

    private Source source;

    private BaseInformation baseInformation;

    private String internalId;

    private final List<String> features = new LinkedList<String> ();

    private final List<Monitor> monitors = new LinkedList<Monitor> ();

    public DataItem ( final String id )
    {
        this.id = id;
    }

    public String getId ()
    {
        return this.id;
    }

    @Override
    public int hashCode ()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( this.id == null ? 0 : this.id.hashCode () );
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
        if ( ! ( obj instanceof DataItem ) )
        {
            return false;
        }
        final DataItem other = (DataItem)obj;
        if ( this.id == null )
        {
            if ( other.id != null )
            {
                return false;
            }
        }
        else if ( !this.id.equals ( other.id ) )
        {
            return false;
        }
        return true;
    }

    public void setValueSource ( final Source source )
    {
        this.source = source;
    }

    public Source getSource ()
    {
        return this.source;
    }

    public void setBasicInformation ( final String hive, final String system, final String location, final String component, final String description, final boolean logger )
    {
        this.baseInformation = new BaseInformation ( hive, system, location, component, description, logger );
    }

    public BaseInformation getBaseInformation ()
    {
        return this.baseInformation;
    }

    public void setInternalId ( final String internalId )
    {
        this.internalId = internalId;
    }

    public String getInternalId ()
    {
        return this.internalId;
    }

    public void addFeature ( final String feature )
    {
        this.features.add ( feature );
    }

    public List<String> getFeatures ()
    {
        return this.features;
    }

    public void addMonitor ( final Monitor monitor )
    {
        this.monitors.add ( monitor );
    }

    public List<Monitor> getMonitors ()
    {
        return this.monitors;
    }
}
