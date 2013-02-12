/*
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
 *
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 *
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 */

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
