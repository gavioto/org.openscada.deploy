package org.openscada.deploy.iolist.utils.column;

import org.openscada.ae.monitor.datasource.common.ListSeverity;
import org.openscada.core.Variant;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.utils.Cell;

public class ListMonitorSeverityColumnReader extends ListMonitorColumnReader
{

    private final ListSeverity severity;

    public ListMonitorSeverityColumnReader ( final ListSeverity severity )
    {
        this.severity = severity;
    }

    @Override
    protected void handleEntry ( final Item item, final ListMonitorEntry entry, final Cell cell, final Variant value )
    {
        entry.setSeverity ( this.severity.name () );
    }

}
