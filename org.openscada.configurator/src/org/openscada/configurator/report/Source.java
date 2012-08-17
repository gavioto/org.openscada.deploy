package org.openscada.configurator.report;

import org.odftoolkit.odfdom.doc.OdfTextDocument;

public interface Source
{

    public void write ( OdfTextDocument odt ) throws Exception;

}
