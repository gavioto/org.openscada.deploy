package org.openscada.atlantis.configurator.exec;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.xmlbeans.XmlOptions;
import org.openscada.atlantis.configurator.common.DataLoader;
import org.openscada.da.server.exec.configuration.model.HiveProcessCommandType;
import org.openscada.da.server.exec.configuration.model.ProcessType;
import org.openscada.da.server.exec.configuration.model.RootDocument;
import org.openscada.da.server.exec.configuration.model.RootType;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.utils.SpreadSheetPoiHelper;

public class Application
{
    public static void process ( final String prefix, final String outList, final String sourceFile, final String xmlOutFile ) throws IOException, Exception
    {
        final DataLoader loader = new DataLoader ( new File ( sourceFile ) );

        final NetworkDeviceRowHandler handler = new NetworkDeviceRowHandler ();
        loader.load ( 0, handler );

        SpreadSheetPoiHelper.writeSpreadsheet ( outList, convertDevices ( prefix, handler.getDevices () ) );

        final RootDocument doc = createDoc ( handler.getDevices () );

        saveConfiguration ( new File ( xmlOutFile ), doc );
    }

    private static void saveConfiguration ( final File file, final RootDocument doc ) throws IOException
    {
        final XmlOptions options = new XmlOptions ();
        options.setCharacterEncoding ( "UTF-8" ); //$NON-NLS-1$
        options.setSavePrettyPrint ();

        final Map<Object, Object> suggestedPrefixes = new HashMap<Object, Object> ();
        suggestedPrefixes.put ( "http://openscada.org/DA/Exec/Configuration", "exec" ); //$NON-NLS-1$ //$NON-NLS-2$

        options.setSaveSuggestedPrefixes ( suggestedPrefixes );
        doc.save ( file, options );
    }

    private static RootDocument createDoc ( final Set<NetworkDevice> devices )
    {
        final RootDocument doc = RootDocument.Factory.newInstance ();

        final RootType root = RootType.Factory.newInstance ();

        final HiveProcessCommandType hive = root.addNewHiveProcess ();
        hive.setRestartDelay ( 5000 );
        hive.setId ( "PING" ); //$NON-NLS-1$

        final ProcessType proc = hive.addNewProcess ();
        proc.setExec ( "openscada_ping" ); //$NON-NLS-1$

        for ( final NetworkDevice device : devices )
        {
            proc.addArgument ( String.format ( "%s=%s", device.getIp (), device.getHostname () ) ); //$NON-NLS-1$
        }

        doc.setRoot ( root );

        return doc;
    }

    private static List<Item> convertDevices ( final String prefix, final Set<NetworkDevice> devices )
    {
        final List<Item> items = new ArrayList<Item> ();

        for ( final NetworkDevice device : devices )
        {
            {
                final Item item = createDeviceItem ( device, null, null, device.getWarnLoss () / 100.0, device.getAlarmLoss () / 100.0 );
                item.setAlias ( String.format ( "%s.%s.%s.AVAIL.V", prefix, item.getLocation (), item.getComponent () ) ); //$NON-NLS-1$
                item.setName ( String.format ( "PING.values.%s.reach", device.getHostname () ) ); //$NON-NLS-1$
                item.setDescription ( String.format ( Messages.Application_PacketLoss_Description, device.getDescription () ) );
                item.setUnit ( "%" ); //$NON-NLS-1$
                items.add ( item );
            }
            {
                final Item item = createDeviceItem ( device, device.getWarnRtt (), device.getAlarmRtt (), null, null );
                item.setAlias ( String.format ( "%s.%s.%s.P_RT.V", prefix, item.getLocation (), item.getComponent () ) ); //$NON-NLS-1$
                item.setName ( String.format ( "PING.values.%s.rtt", device.getHostname () ) ); //$NON-NLS-1$
                item.setDescription ( String.format ( Messages.Application_RTT_Description, device.getDescription () ) );
                item.setUnit ( "ms" ); //$NON-NLS-1$
                items.add ( item );
            }

        }

        return items;
    }

    private static Item createDeviceItem ( final NetworkDevice device, final Double warnHigh, final Double alarmHigh, final Double warnLow, final Double alarmLow )
    {
        final Item item = ModelFactory.eINSTANCE.createItem ();
        item.setDevice ( "exec" ); //$NON-NLS-1$
        item.setSystem ( "NETWORK" ); //$NON-NLS-1$

        item.setDataType ( DataType.FLOAT );

        item.setLocation ( device.getLocation () );
        item.setComponent ( device.getComponent () );

        item.setLocalLowAvailable ( true );
        if ( warnLow != null )
        {
            item.setLocalLowPreset ( warnLow );
        }
        item.setLocalLowLowAvailable ( true );
        if ( alarmLow != null )
        {
            item.setLocalLowLowPreset ( alarmLow );
        }

        item.setLocalHighAvailable ( true );
        if ( warnHigh != null )
        {
            item.setLocalHighPreset ( warnHigh );
        }
        item.setLocalHighHighAvailable ( true );
        if ( alarmHigh != null )
        {
            item.setLocalHighHighPreset ( alarmHigh );
        }

        item.setLocalMin ( 0.0 );

        return item;
    }
}
