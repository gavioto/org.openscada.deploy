package org.openscada.deploy.iolist.utils.column;

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.Monitor;
import org.openscada.deploy.iolist.utils.Cell;

public class ListMonitorColumnReader extends MonitorColumnReader
{

    public ListMonitorColumnReader ( final EStructuralFeature feature )
    {
        super ( feature, ModelPackage.Literals.LIST_MONITOR );
    }

    private static final Pattern splitPattern = Pattern.compile ( "," );

    @Override
    protected void readMonitor ( final Item item, final Monitor monitor, final Cell cell )
    {
        final ListMonitor listMonitor = (ListMonitor)monitor;

        final String value = cell.getText ();

        if ( value != null && value.length () != 0 )
        {
            final String toks[] = value.split ( ":", 2 );
            if ( toks.length > 1 )
            {
                listMonitor.setListIsAlarm ( toks[0].toUpperCase ().equals ( "ALARM" ) );
                for ( final String valueEntry : ListMonitorColumnReader.splitPattern.split ( toks[1] ) )
                {
                    listMonitor.getValues ().add ( valueEntry );
                }
            }
            else
            {
                for ( final String valueEntry : ListMonitorColumnReader.splitPattern.split ( value ) )
                {
                    listMonitor.getValues ().add ( valueEntry );
                }

            }
        }
        else
        {
            item.setLocalListMonitor ( null );
        }

    }

}
