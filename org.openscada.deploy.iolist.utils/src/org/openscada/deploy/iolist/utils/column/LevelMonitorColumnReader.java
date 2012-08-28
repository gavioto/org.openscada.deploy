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
