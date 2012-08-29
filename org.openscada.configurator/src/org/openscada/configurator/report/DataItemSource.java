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

import java.util.LinkedHashMap;
import java.util.Map;

import org.odftoolkit.odfdom.doc.OdfTextDocument;

public class DataItemSource implements Source
{
    private final String itemId;

    private final String connectionId;

    public DataItemSource ( final String itemId, final String connectionId )
    {
        this.itemId = itemId;
        this.connectionId = connectionId;
    }

    @Override
    public void write ( final OdfTextDocument odt ) throws Exception
    {
        OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "DataItemSource.description" ) ); //$NON-NLS-1$

        final Map<String, String> data = new LinkedHashMap<String, String> ();
        data.put ( Messages.getString ( "DataItemSource.connectionId" ), this.connectionId ); //$NON-NLS-1$
        data.put ( Messages.getString ( "DataItemSource.itemId" ), this.itemId ); //$NON-NLS-1$
        OdfHelper.createMapTable ( odt, data );

    }
}
