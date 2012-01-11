package org.openscada.atlantis.configurator.report;

import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextParagraph;

public class LocalLevelMonitor implements Monitor
{

    private final String type;

    private final boolean error;

    private final boolean requireAck;

    private final Double preset;

    public LocalLevelMonitor ( final String type, final boolean error, final boolean requireAck, final Double preset )
    {
        this.type = type;
        this.error = error;
        this.requireAck = requireAck;
        this.preset = preset;
    }

    @Override
    public void write ( final OdfTextDocument odt ) throws Exception
    {
        final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "" );

        p.addContent ( String.format ( "A local level monitor named »%s« is attached to this item.", this.type ) );

        if ( this.error )
        {
            p.addContent ( " Reaching the level will cause the data item be flagged as erroneous." );
        }

        if ( this.requireAck )
        {
            p.addContent ( " Users are required to acknowledge this event." );
        }

        if ( this.preset != null )
        {
            p.addContent ( String.format ( " The original level limit was set to %f. It might have been changed by users since the original configuration was loaded.", this.preset ) );
        }
        else
        {
            p.addContent ( " Originally no limit was set. This means that, as long as no value is set, the monitor will remain inactive." );
        }
    }

}
