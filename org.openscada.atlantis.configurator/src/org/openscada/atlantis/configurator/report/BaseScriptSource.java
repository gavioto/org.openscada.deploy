package org.openscada.atlantis.configurator.report;

import java.util.StringTokenizer;

import org.odftoolkit.odfdom.doc.OdfTextDocument;

public abstract class BaseScriptSource implements Source
{

    protected void writeScript ( final OdfTextDocument odt, final String script ) throws Exception
    {
        final StringTokenizer tok = new StringTokenizer ( script, "\n" );
        while ( tok.hasMoreElements () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.SOURCE_TEXT, tok.nextToken () );
        }
    }

    protected boolean hasScript ( final String script )
    {
        return script != null && !script.isEmpty ();
    }

}
