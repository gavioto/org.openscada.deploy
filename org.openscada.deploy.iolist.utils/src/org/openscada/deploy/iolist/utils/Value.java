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

public class Value
{
    private String value;

    private RGB backgroundColor;

    private boolean strikeThrough;

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

    public void setStrikeThrough ( final boolean strikthrough )
    {
        this.strikeThrough = strikthrough;
    }

    public boolean isStrikeThrough ()
    {
        return this.strikeThrough;
    }
}
