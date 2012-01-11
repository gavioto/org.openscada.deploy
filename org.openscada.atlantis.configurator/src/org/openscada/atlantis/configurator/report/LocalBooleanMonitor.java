package org.openscada.atlantis.configurator.report;

import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextParagraph;

public class LocalBooleanMonitor implements Monitor
{

    private final String referenceValue;

    private final boolean requireAck;

    public LocalBooleanMonitor ( final String reference, final boolean requireAck )
    {
        this.referenceValue = reference;
        this.requireAck = requireAck;
    }

    @Override
    public void write ( final OdfTextDocument odt ) throws Exception
    {
        final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "" );

        p.addContent ( "The item's value is monitored as a boolean value." );

        if ( this.referenceValue == null )
        {
            p.addContent ( " Originally no reference value was set. This means that, as long as no value is set, the monitor will remain inactive." );
        }
        else if ( this.referenceValue.equals ( "true" ) )
        {
            p.addContent ( " The value »true« is considered as good state. If the value changes to »false« the monitor evalutes to fail state." );
        }
        else
        {
            p.addContent ( " The value »false« is considered as good state. If the value changes to »true« the monitor evalutes to fail state." );
        }

        if ( this.requireAck )
        {
            p.addContent ( " Users are required to acknowledge this event." );
        }
    }

}
