/*
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2013 Jens Reimann (ctron@dentrassi.de)
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

import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.utils.Cell;

public class ListMonitorMessageColumnReader implements ColumnReader
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
        monitor.setMessageAttribute ( data );
    }
}
