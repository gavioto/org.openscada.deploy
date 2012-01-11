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
        final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "" ); //$NON-NLS-1$

        p.addContent ( Messages.getString("LocalBooleanMonitor.description") ); //$NON-NLS-1$

        if ( this.referenceValue == null )
        {
            p.addContent ( Messages.getString("LocalBooleanMonitor.reference.none") ); //$NON-NLS-1$
        }
        else if ( this.referenceValue.equals ( "true" ) ) //$NON-NLS-1$
        {
            p.addContent ( Messages.getString("LocalBooleanMonitor.reference.true") ); //$NON-NLS-1$
        }
        else
        {
            p.addContent ( Messages.getString("LocalBooleanMonitor.reference.false") ); //$NON-NLS-1$
        }

        if ( this.requireAck )
        {
            p.addContent ( Messages.getString("LocalBooleanMonitor.requireAck") ); //$NON-NLS-1$
        }
    }

}
