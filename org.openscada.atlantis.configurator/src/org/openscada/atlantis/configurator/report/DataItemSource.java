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
        OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "DataItemSource.description" ) ); //$NON-NLS-1$

        final Map<String, String> data = new LinkedHashMap<String, String> ();
        data.put ( Messages.getString ( "DataItemSource.connectionId" ), this.connectionId ); //$NON-NLS-1$
        data.put ( Messages.getString ( "DataItemSource.itemId" ), this.itemId ); //$NON-NLS-1$
        OdfHelper.createMapTable ( odt, data );

    }
}
