package org.openscada.configurator.report;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.openscada.configurator.Configuration;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.SummaryItem;

public class SummarySource implements Source
{

    private final List<SummaryItem> items;

    private final Configuration cfg;

    public SummarySource ( final Configuration cfg, final List<SummaryItem> items )
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
        for ( final SummaryItem item : this.items )
        {
            final Item iitem = aliasMap.get ( item.getDataSourceId () );

            if ( iitem != null )
            {
                OdfHelper.setCell ( table, 0, i, iitem.getAlias (), OdfHelper.TABLE_CONTENTS );
            }

            OdfHelper.setCell ( table, 1, i, item.getDataSourceId (), OdfHelper.TABLE_CONTENTS );
            i++;
        }

    }
}
