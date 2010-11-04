package org.openscada.deploy.iolist.utils;

public class RGB
{
    private final int red;

    private final int green;

    private final int blue;

    public RGB ( final int red, final int green, final int blue )
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getBlue ()
    {
        return this.blue;
    }

    public int getGreen ()
    {
        return this.green;
    }

    public int getRed ()
    {
        return this.red;
    }

    public boolean isBlack ()
    {
        return this.red == 0 && this.green == 0 && this.blue == 0;
    }

    public boolean isRed ()
    {
        return this.red == 0xFF && this.blue == 0x00 && this.green == 0x00;
    }
}
