package org.openscada.deploy.iolist.utils.column;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.odftoolkit.odfdom.dom.style.props.OdfTextProperties;
import org.openscada.deploy.iolist.model.BasicMonitor;
import org.openscada.deploy.iolist.model.Item;

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
            cell.setStringValue ( "X" );
            cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
        }

        if ( basicMonitor.isAck () )
        {
            cell.setCellBackgroundColor ( "#FF0000" );
            cell.getOdfElement ().setProperty ( OdfTextProperties.FontWeight, "bold" );
        }

        if ( basicMonitor.getSeverity () != null )
        {
            switch ( basicMonitor.getSeverity () )
            {
                case WARNING:
                    cell.setCellBackgroundColor ( "#FFFF00" );
                    break;
                case ALARM:
                    cell.setCellBackgroundColor ( "#FF0000" );
                    break;
                case ERROR:
                    cell.setCellBackgroundColor ( "#FF00FF" );
                    break;
                default:
                    break;
            }
        }
    }

}