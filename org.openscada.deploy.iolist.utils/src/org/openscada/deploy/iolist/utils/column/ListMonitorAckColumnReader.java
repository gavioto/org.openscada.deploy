package org.openscada.deploy.iolist.utils.column;

import org.openscada.core.Variant;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.utils.Cell;

public class ListMonitorAckColumnReader extends ListMonitorColumnReader
{

    private final boolean ack;

    public ListMonitorAckColumnReader ( final boolean ack )
    {
        this.ack = ack;
    }

    @Override
    protected void handleEntry ( final Item item, final ListMonitorEntry entry, final Cell cell, final Variant value )
    {
        entry.setRequireAck ( this.ack );
    }

}
