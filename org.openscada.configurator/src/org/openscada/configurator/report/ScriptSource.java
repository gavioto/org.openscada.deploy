/*
 * This file is part of the openSCADA project
 * Copyright (C) 2006-2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
 *
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 *
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 */

package org.openscada.configurator.report;

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
        final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.description" ) ); //$NON-NLS-1$

        String scriptEngine = this.item.getScriptEngine ();
        if ( scriptEngine == null || scriptEngine.isEmpty () )
        {
            scriptEngine = "JavaScript"; //$NON-NLS-1$
        }

        p.addContent ( String.format ( Messages.getString ( "ScriptSource.language" ), scriptEngine ) ); //$NON-NLS-1$

        // inputs
        if ( !this.item.getInputs ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.inputs" ) ); //$NON-NLS-1$
            writeInputs ( odt, this.item.getInputs () );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.inputs.none" ) ); //$NON-NLS-1$
        }
        // outputs
        if ( !this.item.getOutputs ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.outputs" ) ); //$NON-NLS-1$
            writeOutputs ( odt, this.item.getOutputs () );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.outputs.none" ) ); //$NON-NLS-1$
        }

        // init
        final String initScript = this.item.getInitScript ();
        if ( hasScript ( initScript ) )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.initScript" ) ); //$NON-NLS-1$
            writeScript ( odt, initScript );
        }

        // timer
        if ( this.item.getTimerPeriod () != null && hasScript ( this.item.getTimerScript () ) )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, String.format ( Messages.getString ( "ScriptSource.timer.period" ), this.item.getTimerPeriod () ) ); //$NON-NLS-1$
        }

        // update
        if ( hasScript ( this.item.getUpdateScript () ) )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.updateScript" ) ); //$NON-NLS-1$
            writeScript ( odt, this.item.getUpdateScript () );
        }

        // write
        if ( hasScript ( this.item.getWriteCommand () ) )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.writeCommand" ) ); //$NON-NLS-1$
            writeScript ( odt, this.item.getWriteCommand () );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "ScriptSource.writeCommand.none" ) ); //$NON-NLS-1$
        }
    }

    private void writeOutputs ( final OdfTextDocument odt, final EList<ScriptOutput> outputs ) throws Exception
    {
        final OdfTable table = OdfTable.newTable ( odt, outputs.size () + 1, 2, 1, 0 );

        OdfHelper.setCell ( table, 0, 0, Messages.getString ( "ScriptSource.output.header.name" ), OdfHelper.TABLE_HEADING ); //$NON-NLS-1$
        OdfHelper.setCell ( table, 1, 0, Messages.getString ( "ScriptSource.output.header.internalId" ), OdfHelper.TABLE_HEADING ); //$NON-NLS-1$

        int i = 1;
        for ( final ScriptOutput output : outputs )
        {
            OdfHelper.setCell ( table, 0, i, output.getName (), OdfHelper.TABLE_CONTENTS );
            OdfHelper.setCell ( table, 1, i, output.getDatasourceId (), OdfHelper.TABLE_CONTENTS );

            i++;
        }

    }

    private void writeInputs ( final OdfTextDocument odt, final EList<FormulaInput> inputs ) throws Exception
    {
        final OdfTable table = OdfTable.newTable ( odt, inputs.size () + 1, 3, 1, 0 );

        OdfHelper.setCell ( table, 0, 0, Messages.getString ( "ScriptSource.input.header.name" ), OdfHelper.TABLE_HEADING ); //$NON-NLS-1$
        OdfHelper.setCell ( table, 1, 0, Messages.getString ( "ScriptSource.input.header.internalId" ), OdfHelper.TABLE_HEADING ); //$NON-NLS-1$
        OdfHelper.setCell ( table, 2, 0, Messages.getString ( "ScriptSource.input.header.valueType" ), OdfHelper.TABLE_HEADING ); //$NON-NLS-1$

        int i = 1;
        for ( final FormulaInput input : inputs )
        {
            OdfHelper.setCell ( table, 0, i, input.getName (), OdfHelper.TABLE_CONTENTS );
            OdfHelper.setCell ( table, 1, i, input.getDatasourceId (), OdfHelper.TABLE_CONTENTS );
            OdfHelper.setCell ( table, 2, i, input.getType () != null ? input.getType ().toString () : Messages.getString ( "ScriptSource.any" ), OdfHelper.TABLE_CONTENTS ); //$NON-NLS-1$

            i++;
        }

    }
}
