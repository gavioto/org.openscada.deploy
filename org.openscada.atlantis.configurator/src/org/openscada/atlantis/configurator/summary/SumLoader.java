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

import com.inavare.vims.iolist.model.DataType;
import com.inavare.vims.iolist.model.Item;
import com.inavare.vims.iolist.model.ModelFactory;
import com.inavare.vims.iolist.model.SummaryGroup;
import com.inavare.vims.iolist.utils.SpreadSheetHelper;

public class SumLoader
{
    public static Collection<SummaryGroup> loadGroups ( final File file ) throws IOException
    {
        final DataLoader loader = new DataLoader ( file, false );
        final SumLoadHandler handler = new SumLoadHandler ();
        loader.load ( 0, handler );
        return handler.getGroups ();
    }

    public static String convertGroups ( final Configuration cfg, final File file, final File generatedFile ) throws Exception
    {
        final Collection<Item> items = new LinkedList<Item> ();
        configureGroups ( cfg, loadGroups ( file ), items );
        SpreadSheetHelper.writeSpreadsheet ( generatedFile.getAbsolutePath (), items );
        return generatedFile.getAbsolutePath ();
    }

    public static void configureGroups ( final Configuration cfg, final Collection<SummaryGroup> groups, final Collection<Item> items )
    {
        final Set<String> groupsSum = new HashSet<String> ( Arrays.asList ( "manual", "error", "alarm", "ackRequired" ) );

        for ( final SummaryGroup group : groups )
        {
            final String id = group.getId ();
            final Item item = ModelFactory.eINSTANCE.createItem ();
            item.setDescription ( "Summary item for group: " + id );
            item.setName ( id + ".sum" );
            item.setAlias ( id );
            item.setDataType ( DataType.INTEGER );
            item.setLocalManual ( false );
            item.setDefaultChain ( false );
            item.setLocation ( group.getLocation () );
            item.setComponent ( group.getComponent () );
            items.add ( item );

            cfg.addSum ( id + ".sum", group.getItems (), groupsSum );
        }
    }

}