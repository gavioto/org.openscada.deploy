/*
 * This file is part of the openSCADA project
 * Copyright (C) 2006-2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
 *
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 *
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 */

package org.openscada.configurator.report;

import java.util.LinkedList;
import java.util.List;

public class ReportDataItem
{
    private final String id;

    private Source source;

    private BaseInformation baseInformation;

    private String internalId;

    private final List<String> features = new LinkedList<String> ();

    private final List<Monitor> monitors = new LinkedList<Monitor> ();

    public ReportDataItem ( final String id )
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
        if ( ! ( obj instanceof ReportDataItem ) )
        {
            return false;
        }
        final ReportDataItem other = (ReportDataItem)obj;
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
