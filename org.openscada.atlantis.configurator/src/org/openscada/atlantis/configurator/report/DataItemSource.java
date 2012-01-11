package org.openscada.atlantis.configurator.report;

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
        odt.newParagraph ( "This item is imported from another interface driver." );

        final Map<String, String> data = new LinkedHashMap<String, String> ();
        data.put ( "Connection Id", this.connectionId );
        data.put ( "Item Id", this.itemId );
        OdfHelper.createMapTable ( odt, data );

    }
}
