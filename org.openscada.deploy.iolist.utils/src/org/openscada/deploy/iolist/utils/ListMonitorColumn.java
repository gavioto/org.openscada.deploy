package org.openscada.deploy.iolist.utils;

import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.utils.str.StringHelper;

public class ListMonitorColumn extends MonitorColumn
{

    public ListMonitorColumn ( final String name )
    {
        super ( name, ModelPackage.Literals.ITEM__LOCAL_LIST_MONITOR );
    }

    @Override
    protected void updateSetValue ( final OdfTableCell cell, final Item item )
    {
        cell.setStringValue ( makeListData ( item ) );
        cell.setValueType ( OfficeValueTypeAttribute.Value.STRING.toString () );
    }

    protected static String makeListData ( final Item item )
    {
        final StringBuilder sb = new StringBuilder ();

        if ( item.getLocalListMonitor ().isListIsAlarm () )
        {
            sb.append ( "ALARM:" );
        }
        else
        {
            sb.append ( "EVENT:" );
        }

        sb.append ( StringHelper.join ( item.getLocalListMonitor ().getValues (), "," ) );

        return sb.toString ();
    }

}
