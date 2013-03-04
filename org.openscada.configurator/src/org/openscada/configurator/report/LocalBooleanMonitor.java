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
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextParagraph;

public class LocalBooleanMonitor implements Monitor
{

    private final String referenceValue;

    private final boolean requireAck;

    private final boolean suppressEvents;

    public LocalBooleanMonitor ( final String reference, final boolean requireAck, final boolean suppressEvents )
    {
        this.referenceValue = reference;
        this.requireAck = requireAck;
        this.suppressEvents = suppressEvents;
    }

    @Override
    public void write ( final OdfTextDocument odt ) throws Exception
    {
        final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "" ); //$NON-NLS-1$

        p.addContent ( Messages.getString ( "LocalBooleanMonitor.description" ) ); //$NON-NLS-1$

        if ( this.referenceValue == null )
        {
            p.addContent ( Messages.getString ( "LocalBooleanMonitor.reference.none" ) ); //$NON-NLS-1$
        }
        else if ( this.referenceValue.equals ( "true" ) ) //$NON-NLS-1$
        {
            p.addContent ( Messages.getString ( "LocalBooleanMonitor.reference.true" ) ); //$NON-NLS-1$
        }
        else
        {
            p.addContent ( Messages.getString ( "LocalBooleanMonitor.reference.false" ) ); //$NON-NLS-1$
        }

        if ( this.requireAck )
        {
            p.addContent ( Messages.getString ( "LocalBooleanMonitor.requireAck" ) ); //$NON-NLS-1$
        }
        if ( this.suppressEvents )
        {
            p.addContent ( Messages.getString ( "LocalBooleanMonitor.suppressEvents" ) ); //$NON-NLS-1$
        }
    }

}
