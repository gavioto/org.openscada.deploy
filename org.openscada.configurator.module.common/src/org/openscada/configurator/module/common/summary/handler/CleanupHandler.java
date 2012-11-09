package org.openscada.configurator.module.common.summary.handler;

import java.util.ArrayList;
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
        int totalRemoved = 0;
        int removed;
        while ( ( removed = perform ( configuration, module ) ) > 0 )
        {
            System.out.println ( "** Removed " + removed );
            totalRemoved += removed;
        }
        System.out.println ( String.format ( "** Total removed: %s, remaining: %s", totalRemoved, configuration.getSummaryGroups ().size () ) );
    }

    protected static int perform ( final Configuration configuration, final CleanupSummaries module )
    {
        int hasRemoved = 0;

        final Set<String> removed = new HashSet<String> ();

        {
            final Iterator<SummaryGroup> i = new ArrayList<SummaryGroup> ( configuration.getSummaryGroups () ).iterator ();
            while ( i.hasNext () )
            {
                final SummaryGroup group = i.next ();
                if ( !group.getSubSummaryIds ().isEmpty () )
                {
                    // we have sub summary ids ... so never remove
                    continue;
                }

                if ( group.getDataSourceIds ().size () < module.getRequiredItems () && !group.isRetain () )
                {
                    // System.out.println ( "Removing summary group: " + group.getId () );
                    configuration.removeSummary ( group );
                    removed.add ( group.getId () );

                    hasRemoved++;
                }
            }
        }

        for ( final SummaryGroup group : configuration.getSummaryGroups () )
        {
            final Iterator<String> i = group.getSubSummaryIds ().iterator ();
            while ( i.hasNext () )
            {
                final String id = i.next ();
                for ( final String groupId : removed )
                {
                    if ( id.equals ( groupId + ".master" ) )
                    {
                        // System.out.println ( String.format ( " - Removing summary group %s from parent group %s", groupId, group.getId () ) );
                        i.remove ();
                    }
                }
            }
        }

        return hasRemoved;
    }

}
