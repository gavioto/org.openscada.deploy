package org.openscada.atlantis.configurator.exec;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openscada.atlantis.configurator.common.RowHandler;

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

        device.setHostname ( rowData.get ( "HOSTNAME" ) );
        device.setIp ( rowData.get ( "IP" ) );
        device.setAlias ( rowData.get ( "ALIAS" ) );
        device.setType ( rowData.get ( "TYPE" ) );
        device.setLocation ( rowData.get ( "LOCATION" ) );
        device.setComponent ( rowData.get ( "COMPONENT" ) );
        device.setDescription ( rowData.get ( "DESCRIPTION" ) );
        device.setWarnRtt ( Double.parseDouble ( rowData.get ( "WARN_RTT" ) ) );
        device.setAlarmRtt ( Double.parseDouble ( rowData.get ( "ALARM_RTT" ) ) );
        device.setWarnLoss ( Double.parseDouble ( rowData.get ( "WARN_LOSS" ) ) );
        device.setAlarmLoss ( Double.parseDouble ( rowData.get ( "ALARM_LOSS" ) ) );

        this.devices.add ( device );
    }

}
