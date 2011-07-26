package org.openscada.atlantis.configurator.summary;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.openscada.atlantis.configurator.Configuration;
import org.openscada.atlantis.configurator.common.DataLoader;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.SummaryGroup;
import org.openscada.deploy.iolist.utils.SpreadSheetPoiHelper;

public class SumLoader
{
    public static Collection<SummaryGroup> loadGroups ( final File file ) throws IOException
    {
        final DataLoader loader = new DataLoader ( file, false );
        final SumLoadHandler handler = new SumLoadHandler ();
        loader.load ( 0, handler );
        return handler.getGroups ();
    }

    public static String convertGroups ( final Configuration cfg, final File file, final File generatedFile, final int requiredSize ) throws Exception
    {
        final Collection<Item> items = new LinkedList<Item> ();
        configureGroups ( cfg, loadGroups ( file ), items, requiredSize );
        SpreadSheetPoiHelper.writeSpreadsheet ( generatedFile, items );
        return generatedFile.getAbsolutePath ();
    }

    public static void configureGroups ( final Configuration cfg, final Collection<SummaryGroup> groups, final Collection<Item> items, final int requiredSize )
    {
        final Set<String> groupsSum = new HashSet<String> ( Arrays.asList ( "manual", "error", "alarm", "ackRequired", "blocked" ) ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

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
            item.setLocation ( group.getLocation () );
            item.setComponent ( group.getComponent () );

            if ( group.getItems ().size () >= requiredSize )
            {
                items.add ( item );
                cfg.addSum ( id + ".sum", group.getItems (), groupsSum ); //$NON-NLS-1$
            }
        }
    }

}
