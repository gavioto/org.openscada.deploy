package org.openscada.deploy.iolist.utils.column;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.utils.str.StringHelper;

public class ListMonitorAckColumn extends ListMonitorColumn
{

    private final boolean ack;

    public ListMonitorAckColumn ( final String name, final boolean ack )
    {
        super ( name );
        this.ack = ack;
    }

    @Override
    protected void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item )
    {
        final ListMonitor monitor = item.getLocalListMonitor ();
        if ( monitor == null )
        {
            return;
        }

        final Set<String> values = new HashSet<String> ();
        for ( final ListMonitorEntry entry : monitor.getEntries () )
        {
            if ( entry.getRequireAck () == null )
            {
                continue;
            }
            if ( entry.getRequireAck ().equals ( this.ack ) )
            {
                values.add ( entry.getValue ().toString () );
            }
        }

        final ArrayList<String> sortedValues = new ArrayList<String> ( values );
        Collections.sort ( sortedValues );

        setStringValue ( cell, StringHelper.join ( sortedValues, ", " ) );

        super.update ( output, cell, item );
    }
}
