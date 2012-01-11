package org.openscada.atlantis.configurator.report;

import org.eclipse.emf.common.util.EList;
import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextParagraph;
import org.openscada.deploy.iolist.model.FormulaInput;
import org.openscada.deploy.iolist.model.ScriptItem;
import org.openscada.deploy.iolist.model.ScriptOutput;

public class ScriptSource extends BaseScriptSource
{

    private final ScriptItem item;

    public ScriptSource ( final ScriptItem item )
    {
        this.item = item;
    }

    @Override
    public void write ( final OdfTextDocument odt ) throws Exception
    {
        final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "This item is based on a script fragment." );

        String scriptEngine = this.item.getScriptEngine ();
        if ( scriptEngine == null || scriptEngine.isEmpty () )
        {
            scriptEngine = "JavaScript";
        }

        p.addContent ( String.format ( "The script language used is »%s«", scriptEngine ) );

        // inputs
        if ( !this.item.getInputs ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "The following inputs are configured for this script:" );
            writeInputs ( odt, this.item.getInputs () );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "There are no input values configured for this script." );
        }
        // outputs
        if ( !this.item.getOutputs ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "The following outputs may be written by the script:" );
            writeOutputs ( odt, this.item.getOutputs () );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "No outputs are configured for this script." );
        }

        // init
        final String initScript = this.item.getInitScript ();
        if ( hasScript ( initScript ) )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "The script item is initialized by the following script code." );
            writeScript ( odt, initScript );
        }

        // timer
        if ( this.item.getTimerPeriod () != null && hasScript ( this.item.getTimerScript () ) )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, String.format ( "The script is executed periodically every %s ms", this.item.getTimerPeriod () ) );
        }

        // update
        if ( hasScript ( this.item.getUpdateScript () ) )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "If any of the source values changes, the following script code is executed:" );
            writeScript ( odt, this.item.getUpdateScript () );
        }

        // write
        if ( hasScript ( this.item.getWriteCommand () ) )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "Write requests to the item will be processed by the following script code:" );
            writeScript ( odt, this.item.getWriteCommand () );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "Write requests to the item will be rejected." );
        }
    }

    private void writeOutputs ( final OdfTextDocument odt, final EList<ScriptOutput> outputs )
    {
        final OdfTable table = OdfTable.newTable ( odt, outputs.size () + 1, 2, 1, 0 );

        table.getCellByPosition ( 0, 0 ).setStringValue ( "Name" );
        table.getCellByPosition ( 1, 0 ).setStringValue ( "Internal ID of value source" );

        int i = 1;
        for ( final ScriptOutput output : outputs )
        {
            table.getCellByPosition ( 0, i ).setStringValue ( output.getName () );
            table.getCellByPosition ( 1, i ).setStringValue ( output.getDatasourceId () );

            i++;
        }
    }

    private void writeInputs ( final OdfTextDocument odt, final EList<FormulaInput> inputs )
    {
        final OdfTable table = OdfTable.newTable ( odt, inputs.size () + 1, 3, 1, 0 );

        table.getCellByPosition ( 0, 0 ).setStringValue ( "Name" );
        table.getCellByPosition ( 1, 0 ).setStringValue ( "Internal ID of value source" );
        table.getCellByPosition ( 2, 0 ).setStringValue ( "Value Type" );

        int i = 1;
        for ( final FormulaInput input : inputs )
        {
            table.getCellByPosition ( 0, i ).setStringValue ( input.getName () );
            table.getCellByPosition ( 1, i ).setStringValue ( input.getDatasourceId () );
            table.getCellByPosition ( 2, i ).setStringValue ( input.getType () != null ? input.getType ().toString () : "any" );

            i++;
        }
    }

}
