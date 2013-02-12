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
import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.odftoolkit.odfdom.dom.style.props.OdfTextProperties;
import org.openscada.deploy.iolist.model.BasicMonitor;
import org.openscada.deploy.iolist.model.Item;

public abstract class MonitorColumn extends AbstractColumn
{

    protected final EStructuralFeature feature;

    protected abstract void updateSetValue ( final TableTableCellElement cell, final Item item );

    public MonitorColumn ( final String name, final EStructuralFeature feature )
    {
        super ( name );
        this.feature = feature;
    }

    @Override
    protected void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item )
    {
        final BasicMonitor basicMonitor = (BasicMonitor)item.eGet ( this.feature );

        if ( basicMonitor == null )
        {
            return;
        }

        if ( basicMonitor.isActive () )
        {
            updateSetValue ( cell, item );
        }
        else
        {
            setStringValue ( cell, "X" );
        }

        if ( basicMonitor.isAck () )
        {
            setBackgroundColor ( cell, "#FF0000" );
            cell.setProperty ( OdfTextProperties.FontWeight, "bold" );
        }

        if ( basicMonitor.getSeverity () != null )
        {
            switch ( basicMonitor.getSeverity () )
            {
                case WARNING:
                    setBackgroundColor ( cell, "#FFFF00" );
                    break;
                case ALARM:
                    setBackgroundColor ( cell, "#FF0000" );
                    break;
                case ERROR:
                    setBackgroundColor ( cell, "#FF00FF" );
                    break;
                default:
                    break;
            }
        }
    }

}