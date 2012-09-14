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

public class LocalLevelMonitor implements Monitor
{

    private final String type;

    private final boolean cap;

    private final boolean requireAck;

    private final Double preset;

    public LocalLevelMonitor ( final String type, final boolean cap, final boolean requireAck, final Double preset )
    {
        this.type = type;
        this.cap = cap;
        this.requireAck = requireAck;
        this.preset = preset;
    }

    @Override
    public void write ( final OdfTextDocument odt ) throws Exception
    {
        final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "" ); //$NON-NLS-1$

        p.addContent ( String.format ( Messages.getString ( "LocalLevelMonitor.description" ), this.type ) ); //$NON-NLS-1$

        if ( this.cap )
        {
            p.addContent ( Messages.getString ( "LocalLevelMonitor.cap" ) ); //$NON-NLS-1$
        }

        if ( this.requireAck )
        {
            p.addContent ( Messages.getString ( "LocalLevelMonitor.requireAck" ) ); //$NON-NLS-1$
        }

        if ( this.preset != null )
        {
            p.addContent ( String.format ( Messages.getString ( "LocalLevelMonitor.preset" ), this.preset ) ); //$NON-NLS-1$
        }
        else
        {
            p.addContent ( Messages.getString ( "LocalLevelMonitor.preset.none" ) ); //$NON-NLS-1$
        }
    }

}
