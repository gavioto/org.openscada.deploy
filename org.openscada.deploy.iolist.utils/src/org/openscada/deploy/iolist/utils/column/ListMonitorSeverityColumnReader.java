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

import org.openscada.ae.monitor.datasource.common.ListSeverity;
import org.openscada.core.Variant;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.utils.Cell;

public class ListMonitorSeverityColumnReader extends ListMonitorColumnReader
{

    private final ListSeverity severity;

    public ListMonitorSeverityColumnReader ( final ListSeverity severity )
    {
        this.severity = severity;
    }

    @Override
    protected void handleEntry ( final Item item, final ListMonitorEntry entry, final Cell cell, final Variant value )
    {
        entry.setSeverity ( this.severity.name () );
    }

}
