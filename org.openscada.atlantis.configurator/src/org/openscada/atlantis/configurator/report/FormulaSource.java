package org.openscada.atlantis.configurator.report;

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
        OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "This item based on a formula and other data items." );

        if ( this.item.getInitScript () != null && !this.item.getInitScript ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "The item is initialized with the following script:" );

            OdfHelper.newStyledParagraph ( odt, OdfHelper.SOURCE_TEXT, this.item.getInitScript () );
        }

        if ( this.item.getOutputFormula () != null && !this.item.getOutputFormula ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "The item supports write operations. Write requests will be processed by the following output formula:" );

            OdfHelper.newStyledParagraph ( odt, OdfHelper.SOURCE_TEXT, this.item.getOutputFormula () );

            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, String.format ( "The result of this formula will be written to the item internally referenced by the ID »%s«", this.item.getOutputDatasourceId () ) );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "The item does not support write requests. Writing to the item will result in a error reported back as write result" );
        }
    }
}
