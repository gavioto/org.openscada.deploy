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
