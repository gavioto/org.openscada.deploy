package org.openscada.deploy.iolist.utils;

public class Value
{
    private String value;

    private RGB backgroundColor;

    private static final RGB defaultColor = new RGB ( 255, 255, 255 );

    public void setBackgroundColor ( final RGB backgroundColor )
    {
        this.backgroundColor = backgroundColor;
    }

    public RGB getBackgroundColor ()
    {
        if ( this.backgroundColor == null )
        {
            return defaultColor;
        }
        return this.backgroundColor;
    }

    public void setValue ( final String value )
    {
        this.value = value;
    }

    public String getValue ()
    {
        return this.value;
    }

    public int length ()
    {
        return this.value.length ();
    }

    @Override
    public String toString ()
    {
        return this.value;
    }

}
