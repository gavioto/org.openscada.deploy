/*
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
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

package org.openscada.deploy.iolist.utils.column;

import org.openscada.core.Variant;
import org.openscada.core.VariantEditor;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.utils.Cell;

public abstract class ListMonitorColumnReader implements ColumnReader
{

    @Override
    public void readItem ( final Item item, final Cell cell )
    {
        final String data = cell.getText ();

        if ( data == null || data.isEmpty () )
        {
            return;
        }

        if ( item.getLocalListMonitor () == null )
        {
            item.setLocalListMonitor ( ModelFactory.eINSTANCE.createListMonitor () );
        }

        final ListMonitor monitor = item.getLocalListMonitor ();

        if ( "#FFFF00".equalsIgnoreCase ( cell.getBackgroundColor () ) )
        {
            monitor.setDefaultSeverity ( "WARNING" );
        }
        else if ( "#FF0000".equalsIgnoreCase ( cell.getBackgroundColor () ) )
        {
            monitor.setDefaultSeverity ( "ALARM" );
        }
        else if ( "#FF00FF".equalsIgnoreCase ( cell.getBackgroundColor () ) )
        {
            monitor.setDefaultSeverity ( "ERROR" );
        }

        for ( final String tok : data.split ( ", *" ) )
        {
            final Variant value = VariantEditor.toVariant ( tok );
            handleEntry ( item, findEntry ( item, value ), cell, value );
        }
    }

    protected ListMonitorEntry findEntry ( final Item item, final Variant value )
    {
        for ( final ListMonitorEntry entry : item.getLocalListMonitor ().getEntries () )
        {
            if ( entry.getValue ().equals ( value ) )
            {
                return entry;
            }
        }

        final ListMonitorEntry entry = ModelFactory.eINSTANCE.createListMonitorEntry ();
        entry.setValue ( value );
        item.getLocalListMonitor ().getEntries ().add ( entry );

        return entry;
    }

    protected abstract void handleEntry ( Item item, ListMonitorEntry listMonitorEntry, final Cell cell, final Variant value );
}
