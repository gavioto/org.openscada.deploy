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
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.Monitor;
import org.openscada.deploy.iolist.utils.Cell;

public class LevelMonitorColumnReader extends MonitorColumnReader
{

    public LevelMonitorColumnReader ( final EStructuralFeature feature )
    {
        super ( feature, ModelPackage.Literals.LEVEL_MONITOR );
    }

    @Override
    protected void readMonitor ( final Item item, final Monitor monitor, final Cell cell )
    {
        final LevelMonitor level = (LevelMonitor)monitor;

        if ( OfficeValueTypeAttribute.Value.FLOAT.equals ( cell.getCell ().getOfficeValueTypeAttribute () ) )
        {
            level.setPreset ( cell.getCell ().getOfficeValueAttribute () );
        }
        else if ( "X".equalsIgnoreCase ( cell.getText () ) )
        {
            // nothing to do ... only activate
        }
        else
        {
            level.setPreset ( Double.parseDouble ( cell.getText () ) );
        }
    }

}
