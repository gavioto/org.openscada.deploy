package org.openscada.deploy.iolist.utils;

import java.util.Collection;

import org.openscada.deploy.iolist.model.Item;
import org.openscada.utils.str.StringHelper;

public abstract class GenericSpreadSheetHelper
{
    protected abstract void addHeaderCell ( final String string, final int index ) throws Exception;

    protected void writeHeader () throws Exception
    {
        for ( final Header header : Header.values () )
        {
            addHeaderCell ( header.toString (), header.ordinal () );
        }
    }

    protected void writeItems ( final Collection<? extends Item> items ) throws Exception
    {
        int row = 1;
        for ( final Item item : items )
        {
            addData ( row, Header.HIVE.ordinal (), item.getDevice () );
            addData ( row, Header.SOURCE_NAME.ordinal (), item.getName () );
            addData ( row, Header.DATA_TYPE.ordinal (), item.getDataType ().toString () );
            addData ( row, Header.UNIT.ordinal (), item.getUnit () );

            addData ( row, Header.DESCRIPTION.ordinal (), item.getDescription () );
            addData ( row, Header.SYSTEM.ordinal (), item.getSystem () );
            addData ( row, Header.LOCATION.ordinal (), item.getLocation () );
            addData ( row, Header.COMPONENT.ordinal (), item.getComponent () );
            addData ( row, Header.ALIAS.ordinal (), item.getAlias () );

            addFlag ( row, Header.DEFAULT_CHAIN.ordinal (), item.isDefaultChain (), false );

            addData ( row, Header.MIN.ordinal (), item.getLocalMin (), item.isLocalMinAck () );
            addData ( row, Header.MAX.ordinal (), item.getLocalMax (), item.isLocalMaxAck () );
            addSelectiveDataAck ( row, Header.LIMIT_HH.ordinal (), item.isLocalHighHighAvailable (), item.getLocalHighHighPreset (), item.isLocalHighHighAck () );
            addSelectiveDataAck ( row, Header.LIMIT_H.ordinal (), item.isLocalHighAvailable (), item.getLocalHighPreset (), item.isLocalHighAck () );
            addSelectiveDataAck ( row, Header.LIMIT_L.ordinal (), item.isLocalLowAvailable (), item.getLocalLowPreset (), item.isLocalLowAck () );
            addSelectiveDataAck ( row, Header.LIMIT_LL.ordinal (), item.isLocalLowLowAvailable (), item.getLocalLowLowPreset (), item.isLocalLowLowAck () );

            addFlag ( row, Header.EVENT_WRITE.ordinal (), item.isEventCommand (), false );
            addFlag ( row, Header.MANUAL.ordinal (), item.isLocalManual (), false );
            addSelectiveOptionalFlag ( row, Header.MONITOR_BOOL.ordinal (), item.isLocalBoolAvailable (), item.getLocalBool (), item.isLocalBoolAck () );

            addSelectiveData ( row, Header.LIST_MONITOR.ordinal (), item.isListMonitorPreset (), makeListData ( item ), item.isListMonitorAckRequired () );

            addFlag ( row, Header.REMOTE_MIN.ordinal (), item.isRemoteMin (), false );
            addFlag ( row, Header.REMOTE_MAX.ordinal (), item.isRemoteMax (), false );

            addFlag ( row, Header.REMOTE_HH.ordinal (), item.isRemoteHighHigh (), false );
            addFlag ( row, Header.REMOTE_H.ordinal (), item.isRemoteHigh (), false );
            addFlag ( row, Header.REMOTE_L.ordinal (), item.isRemoteLow (), false );
            addFlag ( row, Header.REMOTE_LL.ordinal (), item.isRemoteLowLow (), false );

            addFlag ( row, Header.REMOTE_BOOL.ordinal (), item.isRemoteBool (), false );
            addOptionalBoolean ( row, Header.REMOTE_BOOL_ACK_VALUE.ordinal (), item.getRemoteBoolAckValue () );

            addFlag ( row, Header.REMOTE_MANUAL.ordinal (), item.isRemoteManual (), false );
            addFlag ( row, Header.EXCLUDE_SUMMARY.ordinal (), item.isIgnoreSummary (), false );

            addSelectiveData ( row, Header.LOCAL_SCALE_FACTOR.ordinal (), item.isLocalScaleAvailable (), item.getLocalScaleFactor () );
            addSelectiveData ( row, Header.LOCAL_SCALE_OFFSET.ordinal (), item.isLocalScaleAvailable (), item.getLocalScaleOffset () );

            addFlag ( row, Header.BLOCK.ordinal (), item.isBlock (), false );

            if ( !item.isEnabled () )
            {
                strikeThroughRow ( row );
            }

            row++;
        }
    }

    protected static String makeListData ( final Item item )
    {
        final StringBuilder sb = new StringBuilder ();

        if ( item.isListMonitorListIsAlarm () )
        {
            sb.append ( "ALARM:" );
        }
        else
        {
            sb.append ( "EVENT:" );
        }

        sb.append ( StringHelper.join ( item.getListMonitorItems (), "," ) );

        return sb.toString ();
    }

    protected void addSelectiveData ( final int row, final int column, final boolean available, final Double value ) throws Exception
    {
        addSelectiveDataAck ( row, column, available, value, false );
    }

    protected void addData ( final int row, final int column, final String data ) throws Exception
    {
        addData ( row, column, data, false );
    }

    protected void addFlag ( final int row, final int column, final boolean flag, final boolean ack ) throws Exception
    {
        addData ( row, column, flag ? "X" : null, ack );
    }

    protected void addOptionalBoolean ( final int row, final int column, final Boolean value ) throws Exception
    {
        if ( value != null )
        {
            addData ( row, column, value ? "+" : "-" );
        }
    }

    protected void addSelectiveOptionalFlag ( final int row, final int column, final boolean available, final Boolean flag, final boolean ack ) throws Exception
    {
        if ( available )
        {
            if ( flag == null )
            {
                addData ( row, column, "X", ack );
            }
            else
            {
                addData ( row, column, flag ? "+" : "-", ack );
            }
        }
        else
        {
            addData ( row, column, (String)null, ack );
        }
    }

    protected abstract void strikeThroughRow ( int row ) throws Exception;

    protected abstract void addData ( final int row, final int column, final String data, final boolean ack ) throws Exception;

    protected abstract void addData ( final int row, final int column, final Double data, final boolean ack ) throws Exception;

    protected abstract void addSelectiveDataAck ( final int row, final int column, final boolean available, final Double value, final boolean ack ) throws Exception;

    protected abstract void addSelectiveData ( final int row, final int column, final boolean available, final String value, final boolean ackRequired ) throws Exception;
}
