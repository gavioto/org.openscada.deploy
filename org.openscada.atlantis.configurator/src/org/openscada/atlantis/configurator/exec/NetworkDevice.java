package org.openscada.atlantis.configurator.exec;

public class NetworkDevice
{
    private String hostname;

    private String ip;

    private String alias;

    private String type;

    private String location;

    private String component;

    private String description;

    private Double warnRtt;

    private Double alarmRtt;

    private Double warnLoss;

    private Double alarmLoss;

    @Override
    public int hashCode ()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( this.hostname == null ? 0 : this.hostname.hashCode () );
        return result;
    }

    @Override
    public boolean equals ( final Object obj )
    {
        if ( this == obj )
        {
            return true;
        }
        if ( obj == null )
        {
            return false;
        }
        if ( ! ( obj instanceof NetworkDevice ) )
        {
            return false;
        }
        final NetworkDevice other = (NetworkDevice)obj;
        if ( this.hostname == null )
        {
            if ( other.hostname != null )
            {
                return false;
            }
        }
        else if ( !this.hostname.equals ( other.hostname ) )
        {
            return false;
        }
        return true;
    }

    public String getHostname ()
    {
        return this.hostname;
    }

    public void setHostname ( final String hostname )
    {
        this.hostname = hostname;
    }

    public String getIp ()
    {
        return this.ip;
    }

    public void setIp ( final String ip )
    {
        this.ip = ip;
    }

    public String getAlias ()
    {
        return this.alias;
    }

    public void setAlias ( final String alias )
    {
        this.alias = alias;
    }

    public String getType ()
    {
        return this.type;
    }

    public void setType ( final String type )
    {
        this.type = type;
    }

    public String getLocation ()
    {
        return this.location;
    }

    public void setLocation ( final String location )
    {
        this.location = location;
    }

    public String getComponent ()
    {
        return this.component;
    }

    public void setComponent ( final String component )
    {
        this.component = component;
    }

    public String getDescription ()
    {
        return this.description;
    }

    public void setDescription ( final String description )
    {
        this.description = description;
    }

    public Double getWarnRtt ()
    {
        return this.warnRtt;
    }

    public void setWarnRtt ( final Double warnRtt )
    {
        this.warnRtt = warnRtt;
    }

    public Double getAlarmRtt ()
    {
        return this.alarmRtt;
    }

    public void setAlarmRtt ( final Double alarmRtt )
    {
        this.alarmRtt = alarmRtt;
    }

    public Double getWarnLoss ()
    {
        return this.warnLoss;
    }

    public void setWarnLoss ( final Double warnLoss )
    {
        this.warnLoss = warnLoss;
    }

    public Double getAlarmLoss ()
    {
        return this.alarmLoss;
    }

    public void setAlarmLoss ( final Double alarmLoss )
    {
        this.alarmLoss = alarmLoss;
    }

}
