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