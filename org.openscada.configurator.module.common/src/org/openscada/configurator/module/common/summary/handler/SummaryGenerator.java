package org.openscada.configurator.module.common.summary.handler;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.summary.GenerateSummaries;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.SummaryGroup;

public class SummaryGenerator
{
    public static void generateSummaryAlarms ( final Project project, final Configuration cfg, final GenerateSummaries module )
    {
        final List<Item> items = cfg.getItems ();

        final Map<List<String>, SummaryGroup> locations = new HashMap<List<String>, SummaryGroup> ();
        for ( final Item item : items )
        {
            if ( item.isIgnoreSummary () )
            {
                continue;
            }

            addItem ( cfg, project, locations, item.getHierarchy (), item, module );
        }

        cfg.addSummaries ( locations.values () );
    }

    private static void addItem ( final Configuration cfg, final Project project, final Map<List<String>, SummaryGroup> locations, final List<String> location, final Item item, final GenerateSummaries module )
    {
        final SummaryGroup locationItems = getGroup ( cfg, project, module, locations, location );

        addItemToGroup ( cfg, cfg.makeMasterId ( item ), locationItems );
    }

    protected static void addItemToGroup ( final Configuration cfg, final String itemId, final SummaryGroup locationItems )
    {
        locationItems.getDataSourceIds ().add ( itemId );
    }

    protected static void addSubItemToGroup ( final Configuration cfg, final String itemId, final SummaryGroup locationItems )
    {
        locationItems.getSubSummaryIds ().add ( itemId );
    }

    private static SummaryGroup getGroup ( final Configuration cfg, final Project project, final GenerateSummaries module, final Map<List<String>, SummaryGroup> locations, final List<String> location )
    {
        SummaryGroup locationItems = locations.get ( location );
        if ( locationItems == null )
        {
            locationItems = ModelFactory.eINSTANCE.createSummaryGroup ();
            locationItems.getHierarchy ().clear ();
            locationItems.getHierarchy ().addAll ( location );
            locationItems.setId ( makeGroupId ( project, location, module ) );
            locations.put ( location, locationItems );

            final LinkedList<String> parentLocation = new LinkedList<String> ( location );
            if ( !parentLocation.isEmpty () )
            {
                parentLocation.removeLast ();
                final SummaryGroup parentGroup = getGroup ( cfg, project, module, locations, parentLocation );

                addSubItemToGroup ( cfg, locationItems.getId () + ".master", parentGroup );
            }
        }
        return locationItems;
    }

    private static String makeGroupId ( final Project project, final List<String> location, final GenerateSummaries module )
    {
        final StringBuilder sb = new StringBuilder ();

        if ( module.getPrefix () != null )
        {
            sb.append ( module.getPrefix () );
        }

        for ( final String level : location )
        {
            if ( sb.length () > 0 )
            {
                sb.append ( "." );
            }
            if ( level != null )
            {
                sb.append ( level );
            }
        }

        if ( module.getSuffix () != null )
        {
            sb.append ( module.getSuffix () );
        }

        return sb.toString ();
    }
}
