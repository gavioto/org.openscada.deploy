package org.openscada.deploy.iolist.utils;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;
import org.openscada.deploy.iolist.model.Mapper;
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
            addHierarchy ( row, item );
            addData ( row, Header.ALIAS.ordinal (), item.getAlias () );

            addFlag ( row, Header.DEFAULT_CHAIN.ordinal (), item.isDefaultChain (), false );

            addSelectiveDataAck ( row, Header.MAX.ordinal (), item.getLocalMax () );
            addSelectiveDataAck ( row, Header.MIN.ordinal (), item.getLocalMin () );
            addSelectiveDataAck ( row, Header.LIMIT_HH.ordinal (), item.getLocalHighHigh () );
            addSelectiveDataAck ( row, Header.LIMIT_H.ordinal (), item.getLocalHigh () );
            addSelectiveDataAck ( row, Header.LIMIT_L.ordinal (), item.getLocalLow () );
            addSelectiveDataAck ( row, Header.LIMIT_LL.ordinal (), item.getLocalLowLow () );

            addFlag ( row, Header.EVENT_WRITE.ordinal (), item.isEventCommand (), false );
            addFlag ( row, Header.MANUAL.ordinal (), item.isLocalManual (), false );
            addSelectiveOptionalFlag ( row, Header.MONITOR_BOOL.ordinal (), item.getLocalListMonitor () != null, item.getLocalListMonitor () != null ? item.getLocalBooleanMonitor ().isOkValue () : false, item.getLocalListMonitor () != null ? item.getLocalBooleanMonitor ().isAck () : false );

            addSelectiveData ( row, Header.LIST_MONITOR.ordinal (), item.getLocalListMonitor () != null, item.getLocalListMonitor () != null ? makeListData ( item ) : null, item.getLocalListMonitor () != null ? item.getLocalListMonitor ().isAck () : false );

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
            addSelectiveData ( row, Header.ROUNDING.ordinal (), item.isRoundingAvailable (), item.getRoundingValue ().toString (), false );

            addFlag ( row, Header.BLOCK.ordinal (), item.isBlock (), false );

            addData ( row, Header.HD_STORAGE.ordinal (), item.getHdStorage () );

            addData ( row, Header.DATA_MAPPER.ordinal (), makeMapper ( item.getMapper () ) );

            addData ( row, Header.SIMULATION_VALUE.ordinal (), item.getSimulationValue () );

            if ( !item.isEnabled () )
            {
                strikeThroughRow ( row );
            }

            row++;
        }
    }

    private void addHierarchy ( final int row, final Item item ) throws Exception
    {
        final List<String> h = item.getHierarchy ();
        if ( h.isEmpty () )
        {
            return;
        }

        addData ( row, Header.LOCATION.ordinal (), h.get ( 0 ) );

        if ( h.size () > 1 )
        {
            addData ( row, Header.COMPONENT.ordinal (), h.get ( 1 ) );
        }
    }

    private String makeMapper ( final EList<Mapper> mapper )
    {
        if ( mapper == null )
        {
            return null;
        }
        if ( mapper.isEmpty () )
        {
            return null;
        }
        if ( mapper.size () > 1 )
        {
            throw new IllegalStateException ( "Mapper contains more than one entry. This can not be serialzed into spreadsheets" );
        }

        final Mapper m = mapper.get ( 0 );
        if ( m.getFromAttribute () == null )
        {
            m.setFromAttribute ( "" );
        }
        if ( m.getToAttribute () == null )
        {
            m.setToAttribute ( "" );
        }

        return String.format ( "%s:%s/%s", m.getMapperId (), m.getFromAttribute (), m.getToAttribute () );
    }

    protected static String makeListData ( final Item item )
    {
        final StringBuilder sb = new StringBuilder ();

        if ( item.getLocalListMonitor ().isListIsAlarm () )
        {
            sb.append ( "ALARM:" );
        }
        else
        {
            sb.append ( "EVENT:" );
        }

        sb.append ( StringHelper.join ( item.getLocalListMonitor ().getValues (), "," ) );

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

    protected abstract void addSelectiveDataAck ( final int row, final int column, LevelMonitor levelMonitor ) throws Exception;

    protected abstract void addSelectiveDataAck ( final int row, final int column, boolean available, Double preset, boolean ackRequired ) throws Exception;

    protected abstract void addSelectiveData ( final int row, final int column, final boolean available, final String value, final boolean ackRequired ) throws Exception;
}
