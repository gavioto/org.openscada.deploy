package org.openscada.configurator.module.common.summary.handler;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.summary.CleanupSummaries;
import org.openscada.deploy.iolist.model.SummaryGroup;

public class CleanupHandler
{

    public static void process ( final Configuration configuration, final Project project, final CleanupSummaries module )
    {
        while ( perform ( configuration, module ) )
        {
        }
    }

    protected static boolean perform ( final Configuration configuration, final CleanupSummaries module )
    {
        boolean hasRemoved = false;

        final Set<String> removed = new HashSet<String> ();

        {
            final Iterator<SummaryGroup> i = configuration.getSummaryGroups ().iterator ();
            while ( i.hasNext () )
            {
                final SummaryGroup group = i.next ();
                if ( group.getDataSourceIds ().size () < module.getRequiredItems () )
                {
                    System.out.println ( "Removing summary group: " + group.getId () );
                    i.remove ();
                    removed.add ( group.getId () );

                    hasRemoved = true;
                }
            }
        }

        for ( final SummaryGroup group : configuration.getSummaryGroups () )
        {
            final Iterator<String> i = group.getDataSourceIds ().iterator ();
            while ( i.hasNext () )
            {
                final String id = i.next ();
                for ( final String groupId : removed )
                {
                    if ( id.equals ( groupId + ".master" ) )
                    {
                        System.out.println ( String.format ( " - Removing summary group %s from parent group %s", groupId, group.getId () ) );
                        i.remove ();
                    }
                }
            }
        }

        return hasRemoved;
    }

}
