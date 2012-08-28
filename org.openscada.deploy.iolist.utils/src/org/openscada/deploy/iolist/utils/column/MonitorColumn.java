package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Monitor;

public abstract class MonitorColumn extends AbstractColumn
{

    protected final EStructuralFeature feature;

    protected abstract void updateSetValue ( final OdfTableCell cell, final Item item );

    public MonitorColumn ( final String name, final EStructuralFeature feature )
    {
        super ( name );
        this.feature = feature;
    }

    @Override
    protected void update ( final OdfTableCell cell, final Item item )
    {
        final Monitor levelMonitor = (Monitor)item.eGet ( this.feature );

        cell.getOdfElement ().setStyleName ( null );

        if ( levelMonitor == null )
        {
            return;
        }

        if ( levelMonitor.isActive () )
        {
            updateSetValue ( cell, item );
        }
        else
        {
            cell.setStringValue ( "X" );
            cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
        }

        if ( levelMonitor.isAck () )
        {
            cell.getOdfElement ().setStyleName ( "Alarm" );
        }
    }

}