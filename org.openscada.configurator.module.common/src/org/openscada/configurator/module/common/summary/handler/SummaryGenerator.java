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
    private final Project project;

    private final Configuration cfg;

    private final GenerateSummaries module;

    public SummaryGenerator ( final Project project, final Configuration cfg, final GenerateSummaries module )
    {
        this.project = project;
        this.cfg = cfg;
        this.module = module;
    }

    public void generateSummaryAlarms ()
    {
        final List<Item> items = this.cfg.getItems ();

        final Map<List<String>, SummaryGroup> locations = new HashMap<List<String>, SummaryGroup> ();
        for ( final Item item : items )
        {
            if ( item.isIgnoreSummary () )
            {
                continue;
            }

            addItem ( locations, item.getHierarchy (), item );
        }

        this.cfg.addSummaries ( locations.values () );
    }

    private void addItem ( final Map<List<String>, SummaryGroup> locations, final List<String> location, final Item item )
    {
        final SummaryGroup locationItems = getGroup ( this.cfg, this.project, this.module, locations, location );

        if ( isSubSummary ( item ) )
        {
            addSubItemToGroup ( this.cfg, this.cfg.makeMasterId ( item ), locationItems );
        }
        else
        {
            addItemToGroup ( this.cfg, this.cfg.makeMasterId ( item ), locationItems );
        }
    }

    private boolean isSubSummary ( final Item item )
    {
        if ( this.module.getSubItemPattern () != null )
        {
            return this.module.getSubItemPattern ().matcher ( item.getAlias () ).matches ();
        }
        return false;
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
