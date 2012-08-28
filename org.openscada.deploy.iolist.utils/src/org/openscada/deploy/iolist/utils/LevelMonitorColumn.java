package org.openscada.deploy.iolist.utils;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;

public class LevelMonitorColumn extends MonitorColumn
{

    public LevelMonitorColumn ( final String name, final EStructuralFeature feature )
    {
        super ( name, feature );
    }

    @Override
    protected void updateSetValue ( final OdfTableCell cell, final Item item )
    {
        final LevelMonitor levelMonitor = (LevelMonitor)item.eGet ( this.feature );

        final Double preset = levelMonitor.getPreset ();

        if ( preset != null )
        {
            cell.setDoubleValue ( preset );
            cell.setValueType ( OfficeValueTypeAttribute.Value.FLOAT.toString () );
        }
        else
        {
            cell.setStringValue ( "X" );
            cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
        }
    }
}
