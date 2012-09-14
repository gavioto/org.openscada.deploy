package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;

public abstract class ListMonitorColumn extends AbstractColumn
{

    public ListMonitorColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfTableCell cell, final Item item )
    {
        final ListMonitor monitor = item.getLocalListMonitor ();
        if ( monitor == null )
        {
            return;
        }

        final String severity = monitor.getDefaultSeverity ();
        if ( severity.equals ( "WARNING" ) )
        {
            cell.setCellBackgroundColor ( "#FFFF00" );
        }
        else if ( severity.equals ( "ALARM" ) )
        {
            cell.setCellBackgroundColor ( "#FF0000" );
        }
        else if ( severity.equals ( "ERROR" ) )
        {
            cell.setCellBackgroundColor ( "#FF00FF" );
        }
        else
        {
            cell.setCellBackgroundColor ( "" );
        }
    }

}
