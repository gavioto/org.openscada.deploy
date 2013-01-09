package org.openscada.configurator.module.common.network.handler;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.configurator.data.RowHandler;

public class NetworkDeviceRowHandler implements RowHandler
{

    private final Set<NetworkDevice> devices = new HashSet<NetworkDevice> ();

    public Set<NetworkDevice> getDevices ()
    {
        return this.devices;
    }

    @Override
    public void handleRow ( final int rowNumber, final Map<String, String> rowData )
    {
        final NetworkDevice device = new NetworkDevice ();

        if ( ( rowData.get ( "IP" ) == null ) || rowData.get ( "IP" ).isEmpty () )
        {
            return;
        }

        device.setHostname ( rowData.get ( "HOSTNAME" ) );
        device.setIp ( rowData.get ( "IP" ) );
        device.setAlias ( rowData.get ( "ALIAS" ) );
        device.setType ( rowData.get ( "TYPE" ) );

        int i = 0;
        while ( rowData.containsKey ( "LEVEL_" + i ) )
        {
            device.getHierarchy ().add ( rowData.get ( "LEVEL_" + i ) );
            i++;
        }

        device.setDescription ( rowData.get ( "DESCRIPTION" ) );
        if ( !rowData.get ( "WARN_RTT" ).isEmpty () )
        {
            device.setWarnRtt ( Double.parseDouble ( rowData.get ( "WARN_RTT" ) ) );
        }
        if ( !rowData.get ( "ALARM_RTT" ).isEmpty () )
        {
            device.setAlarmRtt ( Double.parseDouble ( rowData.get ( "ALARM_RTT" ) ) );
        }
        if ( !rowData.get ( "WARN_LOSS" ).isEmpty () )
        {
            device.setWarnLoss ( Double.parseDouble ( rowData.get ( "WARN_LOSS" ) ) );
        }
        if ( !rowData.get ( "ALARM_LOSS" ).isEmpty () )
        {
            device.setAlarmLoss ( Double.parseDouble ( rowData.get ( "ALARM_LOSS" ) ) );
        }

        this.devices.add ( device );
    }

}
