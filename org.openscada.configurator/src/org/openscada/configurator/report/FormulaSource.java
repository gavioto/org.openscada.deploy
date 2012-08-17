package org.openscada.configurator.report;

import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.openscada.deploy.iolist.model.FormulaItem;

public class FormulaSource extends BaseScriptSource
{

    private final FormulaItem item;

    public FormulaSource ( final FormulaItem item )
    {
        this.item = item;
    }

    @Override
    public void write ( final OdfTextDocument odt ) throws Exception
    {
        OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString("FormulaSource.description") ); //$NON-NLS-1$

        if ( this.item.getInitScript () != null && !this.item.getInitScript ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString("FormulaSource.initScript.text") ); //$NON-NLS-1$

            OdfHelper.newStyledParagraph ( odt, OdfHelper.SOURCE_TEXT, this.item.getInitScript () );
        }

        if ( this.item.getOutputFormula () != null && !this.item.getOutputFormula ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString("FormulaSource.outputScript.text") ); //$NON-NLS-1$

            OdfHelper.newStyledParagraph ( odt, OdfHelper.SOURCE_TEXT, this.item.getOutputFormula () );

            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, String.format ( Messages.getString("FormulaSource.outputScript.text.2"), this.item.getOutputDatasourceId () ) ); //$NON-NLS-1$
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString("FormulaSource.outputScript.none") ); //$NON-NLS-1$
        }
    }
}
