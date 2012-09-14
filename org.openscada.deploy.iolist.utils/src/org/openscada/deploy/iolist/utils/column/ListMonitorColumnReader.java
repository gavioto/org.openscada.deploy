package org.openscada.deploy.iolist.utils.column;

import org.openscada.core.Variant;
import org.openscada.core.VariantEditor;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.utils.Cell;

public abstract class ListMonitorColumnReader implements ColumnReader
{

    @Override
    public void readItem ( final Item item, final Cell cell )
    {
        final String data = cell.getText ();

        if ( data == null || data.isEmpty () )
        {
            return;
        }

        if ( item.getLocalListMonitor () == null )
        {
            item.setLocalListMonitor ( ModelFactory.eINSTANCE.createListMonitor () );
        }

        final ListMonitor monitor = item.getLocalListMonitor ();

        if ( "#FFFF00".equalsIgnoreCase ( cell.getBackgroundColor () ) )
        {
            monitor.setDefaultSeverity ( "WARNING" );
        }
        else if ( "#FF0000".equalsIgnoreCase ( cell.getBackgroundColor () ) )
        {
            monitor.setDefaultSeverity ( "ALARM" );
        }
        else if ( "#FF00FF".equalsIgnoreCase ( cell.getBackgroundColor () ) )
        {
            monitor.setDefaultSeverity ( "ERROR" );
        }

        for ( final String tok : data.split ( ", *" ) )
        {
            final Variant value = VariantEditor.toVariant ( tok );
            handleEntry ( item, findEntry ( item, value ), cell, value );
        }
    }

    protected ListMonitorEntry findEntry ( final Item item, final Variant value )
    {
        for ( final ListMonitorEntry entry : item.getLocalListMonitor ().getEntries () )
        {
            if ( entry.getValue ().equals ( value ) )
            {
                return entry;
            }
        }

        final ListMonitorEntry entry = ModelFactory.eINSTANCE.createListMonitorEntry ();
        entry.setValue ( value );
        item.getLocalListMonitor ().getEntries ().add ( entry );

        return entry;
    }

    protected abstract void handleEntry ( Item item, ListMonitorEntry listMonitorEntry, final Cell cell, final Variant value );
}
