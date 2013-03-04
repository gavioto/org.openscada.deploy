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
import java.util.List;
import java.util.Map;

import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.openscada.configurator.Configuration;
import org.openscada.deploy.iolist.model.Item;

public class SummarySource implements Source
{

    private final List<String> items;

    private final Configuration cfg;

    public SummarySource ( final Configuration cfg, final List<String> items )
    {
        this.items = items;
        this.cfg = cfg;
    }

    @Override
    public void write ( final OdfTextDocument odt ) throws Exception
    {
        final Map<String, Item> aliasMap = new HashMap<String, Item> ( this.cfg.getItems ().size () );

        for ( final Item item : this.cfg.getItems () )
        {
            aliasMap.put ( this.cfg.makeMasterId ( item ), item );
        }

        OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "SummarySource.description" ) ); //$NON-NLS-1$

        final OdfTable table = OdfTable.newTable ( odt, this.items.size () + 1, 2, 1, 0 );

        OdfHelper.setCell ( table, 0, 0, Messages.getString ( "SummarySource.header.external" ), OdfHelper.TABLE_HEADING ); //$NON-NLS-1$
        OdfHelper.setCell ( table, 1, 0, Messages.getString ( "SummarySource.header.internal" ), OdfHelper.TABLE_HEADING ); //$NON-NLS-1$

        int i = 1;
        for ( final String item : this.items )
        {
            final Item iitem = aliasMap.get ( item );

            if ( iitem != null )
            {
                OdfHelper.setCell ( table, 0, i, iitem.getAlias (), OdfHelper.TABLE_CONTENTS );
            }

            OdfHelper.setCell ( table, 1, i, item, OdfHelper.TABLE_CONTENTS );
            i++;
        }

    }
}
