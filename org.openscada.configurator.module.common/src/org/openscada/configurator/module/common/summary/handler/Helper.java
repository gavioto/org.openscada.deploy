package org.openscada.configurator.module.common.summary.handler;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.report.ReportDataItem;
import org.openscada.configurator.report.SummarySource;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.SummaryGroup;

public class Helper
{
    public static void configureGroups ( final Configuration cfg, final Collection<SummaryGroup> groups, final Collection<Item> items, final int requiredSize )
    {
        final Set<String> groupsSum = new HashSet<String> ( Arrays.asList ( "manual", "error", "alarm", "ackRequired", "blocked", "info", "warning" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

        for ( final SummaryGroup group : groups )
        {
            final String id = group.getId ();
            final Item item = ModelFactory.eINSTANCE.createItem ();
            item.setDescription ( Messages.SumLoader_Description + id );
            item.setName ( id + ".sum" ); //$NON-NLS-1$
            item.setAlias ( id );
            item.setSystem ( Messages.SumLoader_System );
            item.setDataType ( DataType.INTEGER );
            item.setLocalManual ( false );
            item.setDefaultChain ( false );
            item.getHierarchy ().clear ();
            item.getHierarchy ().addAll ( group.getHierarchy () );

            if ( group.getItems ().size () >= requiredSize )
            {
                items.add ( item );
                cfg.addSum ( id + ".sum", group.getItems (), groupsSum ); //$NON-NLS-1$

                final ReportDataItem reportItem = cfg.getReportItem ( item.getAlias () );
                reportItem.setValueSource ( new SummarySource ( cfg, group.getItems () ) );
            }
        }
    }
}
