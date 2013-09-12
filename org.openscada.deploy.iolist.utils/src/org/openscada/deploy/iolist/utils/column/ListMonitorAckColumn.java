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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.scada.utils.str.StringHelper;
import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;

public class ListMonitorAckColumn extends ListMonitorColumn
{

    private final boolean ack;

    public ListMonitorAckColumn ( final String name, final boolean ack )
    {
        super ( name );
        this.ack = ack;
    }

    @Override
    protected void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item )
    {
        final ListMonitor monitor = item.getLocalListMonitor ();
        if ( monitor == null )
        {
            return;
        }

        final Set<String> values = new HashSet<String> ();
        for ( final ListMonitorEntry entry : monitor.getEntries () )
        {
            if ( entry.getRequireAck () == null )
            {
                continue;
            }
            if ( entry.getRequireAck ().equals ( this.ack ) )
            {
                values.add ( entry.getValue ().toString () );
            }
        }

        final ArrayList<String> sortedValues = new ArrayList<String> ( values );
        Collections.sort ( sortedValues );

        setStringValue ( cell, StringHelper.join ( sortedValues, ", " ) );

        super.update ( output, cell, item );
    }
}
