package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.openscada.ae.Severity;
import org.openscada.deploy.iolist.model.BasicMonitor;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.Monitor;
import org.openscada.deploy.iolist.utils.Cell;

public class MonitorColumnReader implements ColumnReader
{

    private final EStructuralFeature feature;

    private final EClass monitorClass;

    public MonitorColumnReader ( final EStructuralFeature feature, final EClass monitorClass )
    {
        this.feature = feature;
        this.monitorClass = monitorClass;
    }

    @Override
    public void readItem ( final Item item, final Cell cell )
    {
        final String value = cell.getText ();
        if ( value == null || value.isEmpty () )
        {
            return;
        }

        item.eSet ( this.feature, ModelFactory.eINSTANCE.create ( this.monitorClass ) );
        final BasicMonitor monitor = (BasicMonitor)item.eGet ( this.feature );

        monitor.setActive ( true );

        final String color = cell.getBackgroundColor ();
        if ( "#FF00FF".equalsIgnoreCase ( color ) )
        {
            monitor.setSeverity ( Severity.ERROR );
        }
        else if ( "#FF0000".equalsIgnoreCase ( color ) )
        {
            monitor.setSeverity ( Severity.ALARM );
        }
        else if ( "#FFFF00".equalsIgnoreCase ( color ) )
        {
            monitor.setSeverity ( Severity.WARNING );
        }

        monitor.setAck ( cell.isBold () );

        readMonitor ( item, monitor, cell );
    }

    protected void readMonitor ( final Item item, final Monitor monitor, final Cell cell )
    {
    }

}
