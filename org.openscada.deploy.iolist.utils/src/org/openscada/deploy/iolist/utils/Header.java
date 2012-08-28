/**
 * 
 */
package org.openscada.deploy.iolist.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.Rounding;

public enum Header
{

    HIVE
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setDevice ( value.getValue () );
        }
    },

    SOURCE_NAME
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setName ( value.getValue () );
        }
    },
    DATA_TYPE
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            String str = value.getValue ();
            if ( "BOOLEAN".equals ( str ) )
            {
                str = "BOOL";
            }
            if ( "INTEGER".equals ( str ) )
            {
                str = "INT32";
            }
            if ( "LONG".equals ( str ) )
            {
                str = "INT64";
            }
            if ( "DOUBLE".equals ( str ) )
            {
                str = "FLOAT";
            }

            final DataType result = DataType.get ( str );
            if ( result == null )
            {
                System.err.println ( String.format ( "Invalid data type: '%s'", str ) );
            }

            item.setDataType ( result );
        }
    },
    UNIT
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setUnit ( value.getValue () );
        }
    },
    DESCRIPTION
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setDescription ( value.getValue () );
        }
    },
    DEFAULT_CHAIN
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setDefaultChain ( value != null && value.length () > 0 );
        }
    },
    SYSTEM
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setSystem ( value.getValue () );
        }
    },
    LOCATION
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( item.getHierarchy ().isEmpty () )
            {
                item.getHierarchy ().add ( value.getValue () );
            }
            else if ( item.getHierarchy ().size () == 1 )
            {
                item.getHierarchy ().add ( 0, value.getValue () );
            }
            else if ( item.getHierarchy ().size () > 2 )
            {
                while ( item.getHierarchy ().size () > 2 )
                {
                    item.getHierarchy ().remove ( 0 );
                }
                item.getHierarchy ().add ( 0, value.getValue () );
            }
        }
    },
    COMPONENT
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( item.getHierarchy ().isEmpty () )
            {
                item.getHierarchy ().add ( "" );
                item.getHierarchy ().add ( value.getValue () );
            }
            else
            {
                item.getHierarchy ().add ( value.getValue () );
            }
        }
    },
    ALIAS
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setAlias ( value.getValue () );
            item.setEnabled ( !value.isStrikeThrough () );
        }
    },
    MIN
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalMin ( ModelFactory.eINSTANCE.createLevelMonitor () );
                item.getLocalMin ().setActive ( true );
                item.getLocalMin ().setAck ( value.getBackgroundColor ().isRed () );
                item.getLocalMin ().setPreset ( makeDouble ( value ) );
            }
            else
            {
                item.setLocalMin ( null );
            }
        }
    },
    MAX
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalMax ( ModelFactory.eINSTANCE.createLevelMonitor () );
                item.getLocalMax ().setActive ( true );
                item.getLocalMax ().setAck ( value.getBackgroundColor ().isRed () );
                item.getLocalMax ().setPreset ( makeDouble ( value ) );
            }
            else
            {
                item.setLocalMax ( null );
            }
        }
    },
    LIMIT_LL
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalLowLow ( ModelFactory.eINSTANCE.createLevelMonitor () );
                item.getLocalLowLow ().setActive ( true );
                item.getLocalLowLow ().setAck ( value.getBackgroundColor ().isRed () );
                item.getLocalLowLow ().setPreset ( makeDouble ( value ) );
            }
            else
            {
                item.setLocalLowLow ( null );
            }
        }
    },
    LIMIT_L
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalLow ( ModelFactory.eINSTANCE.createLevelMonitor () );
                item.getLocalLow ().setActive ( true );
                item.getLocalLow ().setAck ( value.getBackgroundColor ().isRed () );
                item.getLocalLow ().setPreset ( makeDouble ( value ) );
            }
            else
            {
                item.setLocalLow ( null );
            }
        }
    },
    LIMIT_H
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalHigh ( ModelFactory.eINSTANCE.createLevelMonitor () );
                item.getLocalHigh ().setActive ( true );
                item.getLocalHigh ().setAck ( value.getBackgroundColor ().isRed () );
                item.getLocalHigh ().setPreset ( makeDouble ( value ) );
            }
            else
            {
                item.setLocalHigh ( null );
            }
        }
    },
    LIMIT_HH
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalHighHigh ( ModelFactory.eINSTANCE.createLevelMonitor () );
                item.getLocalHighHigh ().setActive ( true );
                item.getLocalHighHigh ().setAck ( value.getBackgroundColor ().isRed () );
                item.getLocalHighHigh ().setPreset ( makeDouble ( value ) );
            }
            else
            {
                item.setLocalHighHigh ( null );
            }
        }
    },
    MONITOR_BOOL
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            final Boolean okValue = asOptionalBoolean ( value );
            if ( value != null && value.length () != 0 && okValue != null )
            {
                item.setLocalBooleanMonitor ( ModelFactory.eINSTANCE.createBooleanMonitor () );
                item.getLocalBooleanMonitor ().setActive ( true );
                item.getLocalBooleanMonitor ().setOkValue ( okValue );
                item.getLocalBooleanMonitor ().setAck ( value.getBackgroundColor ().isRed () );
            }
            else
            {
                item.setLocalBooleanMonitor ( null );
            }
        }
    },
    LIST_MONITOR
    {
        final Pattern splitPattern = Pattern.compile ( "," );

        @Override
        public void apply ( final Item item, final Value cValue )
        {
            if ( cValue != null && cValue.length () != 0 )
            {
                item.setLocalListMonitor ( ModelFactory.eINSTANCE.createListMonitor () );
                item.getLocalListMonitor ().setActive ( true );
                item.getLocalListMonitor ().setAck ( cValue.getBackgroundColor ().isRed () );

                final String value = cValue.getValue ();
                final String toks[] = value.split ( ":", 2 );
                if ( toks.length > 1 )
                {
                    item.getLocalListMonitor ().setListIsAlarm ( toks[0].toUpperCase ().equals ( "ALARM" ) );
                    for ( final String valueEntry : this.splitPattern.split ( toks[1] ) )
                    {
                        item.getLocalListMonitor ().getValues ().add ( valueEntry );
                    }
                }
                else
                {
                    for ( final String valueEntry : this.splitPattern.split ( value ) )
                    {
                        item.getLocalListMonitor ().getValues ().add ( valueEntry );
                    }

                }
            }
            else
            {
                item.setLocalListMonitor ( null );
            }

        }
    },
    REMOTE_MIN
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteMin ( asBoolean ( value ) );
        }
    },
    REMOTE_MAX
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteMax ( asBoolean ( value ) );
        }
    },
    REMOTE_LL
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteLowLow ( asBoolean ( value ) );
        }
    },
    REMOTE_L
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteLow ( asBoolean ( value ) );
        }
    },
    REMOTE_H
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteHigh ( asBoolean ( value ) );
        }
    },
    REMOTE_HH
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteHighHigh ( asBoolean ( value ) );
        }
    },
    REMOTE_BOOL
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteBool ( asBoolean ( value ) );
        }
    },
    REMOTE_BOOL_ACK_VALUE
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteBoolAckValue ( asOptionalBoolean ( value ) );
        }
    },
    REMOTE_MANUAL
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setRemoteManual ( asBoolean ( value ) );
        }
    },
    EVENT_WRITE
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setEventCommand ( asBoolean ( value ) );
        }
    },
    MANUAL
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setLocalManual ( asBoolean ( value ) );
        }
    },
    LOCAL_SCALE_FACTOR
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalScaleAvailable ( true );
                item.setLocalScaleFactor ( makeDouble ( value ) );
            }
        }
    },
    LOCAL_SCALE_OFFSET
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalScaleAvailable ( true );
                item.setLocalScaleOffset ( makeDouble ( value ) );
            }
        }
    },
    ROUNDING
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setRoundingAvailable ( true );
                if ( value != null )
                {
                    final Rounding rounding = Rounding.get ( value.getValue () );
                    if ( rounding != null && rounding != Rounding.NONE )
                    {
                        item.setRoundingValue ( rounding );
                    }
                }
            }
        }
    },
    EXCLUDE_SUMMARY
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setIgnoreSummary ( asBoolean ( value ) );
        }
    },
    BLOCK
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setBlock ( asBoolean ( value ) );
        }
    },
    HD_STORAGE
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setHdStorage ( value.getValue () );
        }
    },
    DATA_MAPPER
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            final String stringValue = value.getValue ();
            if ( stringValue == null || stringValue.isEmpty () )
            {
                return;
            }

            final Matcher m = p.matcher ( stringValue );

            if ( m.matches () )
            {
                final Mapper mapper = ModelFactory.eINSTANCE.createMapper ();

                mapper.setMapperId ( m.group ( 1 ) );
                mapper.setFromAttribute ( m.group ( 2 ) );
                mapper.setToAttribute ( m.group ( 3 ) );

                item.getMapper ().add ( mapper );
            }
        }
    },
    SIMULATION_VALUE
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setSimulationValue ( value.getValue () );
        }
    };
    private static final Pattern p = Pattern.compile ( "(.*?):(.*?)/(.*?)" );

    public abstract void apply ( final Item item, final Value value );

    protected Double makeDouble ( final Value value )
    {
        try
        {
            return Double.valueOf ( value.getValue () );
        }
        catch ( final NumberFormatException e )
        {
            return null;
        }
    }

    protected boolean asBoolean ( final Value value )
    {
        if ( value == null )
        {
            return false;
        }
        final String strValue = value.getValue ();
        if ( strValue.length () == 0 )
        {
            return false;
        }
        return true;
    }

    protected Boolean asOptionalBoolean ( final Value value )
    {
        if ( value == null )
        {
            return null;
        }
        final String strValue = value.getValue ();
        if ( strValue.length () == 0 )
        {
            return null;
        }
        if ( strValue.equals ( "+" ) )
        {
            return true;
        }
        if ( strValue.equals ( "-" ) )
        {
            return false;
        }
        return null;
    }
}