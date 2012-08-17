package org.openscada.configurator.report;

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
        final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "" ); //$NON-NLS-1$

        p.addContent ( String.format ( Messages.getString("LocalLevelMonitor.description"), this.type ) ); //$NON-NLS-1$

        if ( this.error )
        {
            p.addContent ( Messages.getString("LocalLevelMonitor.error") ); //$NON-NLS-1$
        }

        if ( this.requireAck )
        {
            p.addContent ( Messages.getString("LocalLevelMonitor.requireAck") ); //$NON-NLS-1$
        }

        if ( this.preset != null )
        {
            p.addContent ( String.format ( Messages.getString("LocalLevelMonitor.preset"), this.preset ) ); //$NON-NLS-1$
        }
        else
        {
            p.addContent ( Messages.getString("LocalLevelMonitor.preset.none") ); //$NON-NLS-1$
        }
    }

}
