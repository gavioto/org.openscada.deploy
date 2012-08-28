package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.BooleanMonitor;
import org.openscada.deploy.iolist.model.Item;

public class BooleanMonitorColumn extends MonitorColumn
{

    public BooleanMonitorColumn ( final String name, final EStructuralFeature feature )
    {
        super ( name, feature );
    }

    @Override
    protected void updateSetValue ( final OdfTableCell cell, final Item item )
    {
        final BooleanMonitor booleanMonitor = (BooleanMonitor)item.eGet ( this.feature );

        cell.setStringValue ( booleanMonitor.isOkValue () ? "+" : "-" );
        cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
    }
}
