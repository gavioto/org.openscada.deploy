package org.openscada.atlantis.configurator.report;

import org.odftoolkit.odfdom.doc.OdfTextDocument;

public interface Source
{

    public void write ( OdfTextDocument odt ) throws Exception;

}
