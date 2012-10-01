package org.openscada.deploy.iolist.utils.column;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.ae.monitor.datasource.common.ListSeverity;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.utils.str.StringHelper;

public class ListMonitorSeverityColumn extends ListMonitorColumn
{

    private final ListSeverity severity;

    public ListMonitorSeverityColumn ( final String name, final ListSeverity severity )
    {
        super ( name );
        this.severity = severity;
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
            if ( entry.getSeverity ().equals ( this.severity.toString () ) )
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
