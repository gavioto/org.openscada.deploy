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
        OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "FormulaSource.description" ) ); //$NON-NLS-1$

        if ( this.item.getInitScript () != null && !this.item.getInitScript ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "FormulaSource.initScript.text" ) ); //$NON-NLS-1$

            OdfHelper.newStyledParagraph ( odt, OdfHelper.SOURCE_TEXT, this.item.getInitScript () );
        }

        if ( this.item.getOutputFormula () != null && !this.item.getOutputFormula ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "FormulaSource.outputScript.text" ) ); //$NON-NLS-1$

            OdfHelper.newStyledParagraph ( odt, OdfHelper.SOURCE_TEXT, this.item.getOutputFormula () );

            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, String.format ( Messages.getString ( "FormulaSource.outputScript.text.2" ), this.item.getOutputDatasourceId () ) ); //$NON-NLS-1$
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "FormulaSource.outputScript.none" ) ); //$NON-NLS-1$
        }
    }
}
