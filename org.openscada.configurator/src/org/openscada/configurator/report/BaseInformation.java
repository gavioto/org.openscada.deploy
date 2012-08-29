/*
 * This file is part of the openSCADA project
 * Copyright (C) 2006-2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
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

package org.openscada.configurator.report;

import java.util.HashMap;
import java.util.Map;

import org.odftoolkit.odfdom.doc.OdfTextDocument;

public class BaseInformation
{

    private final Map<String, String> data;

    private final boolean logger;

    public BaseInformation ( final String hive, final String system, final String location, final String component, final String description, final boolean logger )
    {
        this.data = new HashMap<String, String> ();

        if ( hive != null )
        {
            this.data.put ( Messages.getString ( "BaseInformation.driverName" ), hive ); //$NON-NLS-1$
        }
        if ( system != null )
        {
            this.data.put ( Messages.getString ( "BaseInformation.system" ), system ); //$NON-NLS-1$
        }
        if ( location != null )
        {
            this.data.put ( Messages.getString ( "BaseInformation.location" ), location ); //$NON-NLS-1$
        }
        if ( component != null )
        {
            this.data.put ( Messages.getString ( "BaseInformation.component" ), component ); //$NON-NLS-1$
        }
        if ( description != null )
        {
            this.data.put ( Messages.getString ( "BaseInformation.description" ), description ); //$NON-NLS-1$
        }
        this.logger = logger;
    }

    public void write ( final OdfTextDocument odt ) throws Exception
    {
        OdfHelper.createMapTable ( odt, this.data );
        if ( this.logger )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "BaseInformation.loggerText" ) ); //$NON-NLS-1$
        }
    }

}
