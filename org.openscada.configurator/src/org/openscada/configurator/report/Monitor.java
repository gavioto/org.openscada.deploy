package org.openscada.configurator.report;

import org.odftoolkit.odfdom.doc.OdfTextDocument;

public interface Monitor
{
    public void write ( OdfTextDocument odt ) throws Exception;
}
