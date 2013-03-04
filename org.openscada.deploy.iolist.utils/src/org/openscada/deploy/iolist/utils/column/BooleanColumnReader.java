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

package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.utils.Cell;

public abstract class BooleanColumnReader implements ColumnReader
{

    @Override
    public void readItem ( final Item item, final Cell cell )
    {
        final String valueType = cell.getCell ().getOfficeValueTypeAttribute ();
        if ( OfficeValueTypeAttribute.Value.STRING.equals ( valueType ) )
        {
            setValue ( item, cell.getCell ().getOfficeBooleanValueAttribute () );
        }
        else
        {
            setValue ( item, makeBoolean ( cell, null ) );
        }
    }

    public static Boolean makeBoolean ( final Cell cell, final Boolean defaultValue )
    {
        try
        {
            final String text = cell.getText ();
            if ( text == null )
            {
                return false;
            }
            if ( text.isEmpty () )
            {
                return false;
            }
            if ( text.equalsIgnoreCase ( "X" ) )
            {
                return true;
            }
            if ( text.equals ( "-" ) )
            {
                return false;
            }
            if ( text.equals ( "+" ) )
            {
                return true;
            }
            return Boolean.parseBoolean ( text );
        }
        catch ( final Exception e )
        {
            return defaultValue;
        }
    }

    public abstract void setValue ( final Item item, final Boolean value );

}
