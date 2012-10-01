package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;

public abstract class ListMonitorColumn extends AbstractColumn
{

    public ListMonitorColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item )
    {
        final ListMonitor monitor = item.getLocalListMonitor ();
        if ( monitor == null )
        {
            return;
        }

        final String severity = monitor.getDefaultSeverity ();
        if ( severity.equals ( "WARNING" ) )
        {
            setBackgroundColor ( cell, "#FFFF00" );
        }
        else if ( severity.equals ( "ALARM" ) )
        {
            setBackgroundColor ( cell, "#FF0000" );
        }
        else if ( severity.equals ( "ERROR" ) )
        {
            setBackgroundColor ( cell, "#FF00FF" );
        }
        else
        {
            setBackgroundColor ( cell, "" );
        }
    }

}
