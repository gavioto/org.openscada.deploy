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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;

public class LevelMonitorColumn extends MonitorColumn
{

    public LevelMonitorColumn ( final String name, final EStructuralFeature feature )
    {
        super ( name, feature );
    }

    @Override
    protected void updateSetValue ( final TableTableCellElement cell, final Item item )
    {
        final LevelMonitor levelMonitor = (LevelMonitor)item.eGet ( this.feature );

        final Double preset = levelMonitor.getPreset ();

        if ( preset != null )
        {
            setFloatValue ( cell, preset );
        }
        else
        {
            setStringValue ( cell, "X" );
        }
    }
}
