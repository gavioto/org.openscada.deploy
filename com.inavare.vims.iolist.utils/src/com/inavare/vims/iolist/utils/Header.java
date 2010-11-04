/**
 * 
 */
package com.inavare.vims.iolist.utils;

import java.util.regex.Pattern;

import com.inavare.vims.iolist.model.DataType;
import com.inavare.vims.iolist.model.Item;

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
            item.setLocation ( value.getValue () );
        }
    },
    COMPONENT
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setComponent ( value.getValue () );
        }
    },
    ALIAS
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setAlias ( value.getValue () );
        }
    },
    MIN
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalMin ( Double.valueOf ( value.getValue () ) );
                item.setLocalMinAck ( value.getBackgroundColor ().isRed () );
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
                item.setLocalMax ( Double.valueOf ( value.getValue () ) );
                item.setLocalMaxAck ( value.getBackgroundColor ().isRed () );
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
                item.setLocalLowLowAvailable ( true );
                item.setLocalLowLowPreset ( makeDouble ( value ) );
                item.setLocalLowLowAck ( value.getBackgroundColor ().isRed () );
            }
            else
            {
                item.setLocalLowLowAvailable ( false );
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
                item.setLocalLowAvailable ( true );
                item.setLocalLowPreset ( makeDouble ( value ) );
                item.setLocalLowAck ( value.getBackgroundColor ().isRed () );
            }
            else
            {
                item.setLocalLowAvailable ( false );
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
                item.setLocalHighAvailable ( true );
                item.setLocalHighPreset ( makeDouble ( value ) );
                item.setLocalHighAck ( value.getBackgroundColor ().isRed () );
            }
            else
            {
                item.setLocalHighAvailable ( false );
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
                item.setLocalHighHighAvailable ( true );
                item.setLocalHighHighPreset ( makeDouble ( value ) );
                item.setLocalHighHighAck ( value.getBackgroundColor ().isRed () );
            }
            else
            {
                item.setLocalHighHighAvailable ( false );
            }
        }
    },
    MONITOR_BOOL
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            if ( value != null && value.length () != 0 )
            {
                item.setLocalBoolAvailable ( true );
                item.setLocalBool ( asOptionalBoolean ( value ) );
                item.setLocalBoolAck ( value.getBackgroundColor ().isRed () );
            }
            else
            {
                item.setLocalBoolAvailable ( false );
            }
        }
    },
    LIST_MONITOR
    {
        final Pattern splitPattern = Pattern.compile ( "[, \\n\\t\\r]+" );

        @Override
        public void apply ( final Item item, final Value cValue )
        {
            if ( cValue != null && cValue.length () != 0 )
            {
                final String value = cValue.getValue ();
                item.setListMonitorPreset ( true );
                final String toks[] = value.split ( ":" );
                if ( toks.length > 1 )
                {
                    item.setListMonitorListIsAlarm ( toks[0].toUpperCase ().equals ( "ALARM" ) );
                    for ( final String valueEntry : this.splitPattern.split ( toks[1] ) )
                    {
                        item.getListMonitorItems ().add ( valueEntry );
                    }
                }
            }
            else
            {
                item.setListMonitorPreset ( false );
            }
            item.setListMonitorAckRequired ( cValue.getBackgroundColor ().isRed () );
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
    EXCLUDE_SUMMARY
    {
        @Override
        public void apply ( final Item item, final Value value )
        {
            item.setIgnoreSummary ( asBoolean ( value ) );
        }
    };

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