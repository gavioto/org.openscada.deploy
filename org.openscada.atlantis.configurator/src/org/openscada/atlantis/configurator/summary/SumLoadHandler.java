package org.openscada.atlantis.configurator.summary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openscada.atlantis.configurator.common.RowHandler;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.SummaryGroup;
import org.openscada.deploy.iolist.model.SummaryItem;

public class SumLoadHandler implements RowHandler
{

    private final Map<String, SummaryGroup> groups = new HashMap<String, SummaryGroup> ();

    @Override
    public void handleRow ( final int rowNumber, final Map<String, String> rowData )
    {
        final String id = makeId ( rowData.get ( "0" ) );

        if ( id == null )
        {
            return;
        }

        final String dataSourceId = makeDataSourceId ( rowData.get ( "1" ) );

        final SummaryGroup group;
        if ( !this.groups.containsKey ( id ) )
        {
            group = ModelFactory.eINSTANCE.createSummaryGroup ();
            group.setId ( id );
            this.groups.put ( id, group );
        }
        else
        {
            group = this.groups.get ( id );
        }

        final SummaryItem item = ModelFactory.eINSTANCE.createSummaryItem ();
        item.setDataSourceId ( dataSourceId );
        item.setType ( convertType ( rowData.get ( "2" ) ) );
        group.getItems ().add ( item );
    }

    private static String makeId ( final String id )
    {
        final Matcher m = Pattern.compile ( ".*/([^/]+).(grxs|gpp)" ).matcher ( id );

        if ( !m.matches () )
        {
            return null;
        }

        return System.getProperty ( "prefix", "BG_IPT" ) + ".DCS." + m.group ( 1 ) + ".SUM.V";
    }

    private String convertType ( String string )
    {
        if ( string == null || "".equals ( string ) )
        {
            return null;
        }

        string = string.toLowerCase ();
        if ( "local".equals ( string ) )
        {
            string = "manual";
        }

        return string;
    }

    private String makeDataSourceId ( final String cell )
    {
        final String tok[] = cell.split ( "#", 2 );
        return tok[1] + ".master";
    }

    public Collection<SummaryGroup> getGroups ()
    {
        return this.groups.values ();
    }

}
