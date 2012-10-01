package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.BooleanMonitor;
import org.openscada.deploy.iolist.model.Item;

public class BooleanMonitorColumn extends MonitorColumn
{

    public BooleanMonitorColumn ( final String name, final EStructuralFeature feature )
    {
        super ( name, feature );
    }

    @Override
    protected void updateSetValue ( final TableTableCellElement cell, final Item item )
    {
        final BooleanMonitor booleanMonitor = (BooleanMonitor)item.eGet ( this.feature );

        setStringValue ( cell, booleanMonitor.isOkValue () ? "+" : "-" );
    }
}
