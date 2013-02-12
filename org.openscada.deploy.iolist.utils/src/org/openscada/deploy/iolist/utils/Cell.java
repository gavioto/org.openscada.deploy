/*
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2012 TH4 SYSTEMS GmbH (http://th4-systems.com)
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

package org.openscada.deploy.iolist.utils;

import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableColumnElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStyle;
import org.odftoolkit.odfdom.incubator.doc.text.OdfWhitespaceProcessor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.type.Color;

public class Cell
{
    private final TableTableCellElement cell;

    private final TableTableRowElement row;

    private final TableTableColumnElement col;

    public Cell ( final TableTableCellElement cell, final TableTableRowElement row, final TableTableColumnElement col )
    {
        this.cell = cell;
        this.row = row;
        this.col = col;
    }

    public TableTableCellElement getCell ()
    {
        return this.cell;
    }

    public String getText ()
    {
        return new OdfWhitespaceProcessor ().getText ( this.cell );
    }

    public boolean isBold ()
    {
        final OdfStyle styleElement = getCellStyleElement ();
        if ( styleElement == null )
        {
            return false;
        }

        final OdfStyleProperty fontWeightProperty = OdfStyleProperty.get ( OdfStylePropertiesSet.TextProperties, OdfName.newName ( OdfDocumentNamespace.FO, "font-weight" ) );

        final String property = styleElement.getProperty ( fontWeightProperty );

        return "bold".equalsIgnoreCase ( property );
    }

    public String getBackgroundColor ()
    {
        String color = "#FFFFFF";
        final OdfStyleBase styleElement = getCellStyleElement ();
        if ( styleElement != null )
        {
            final OdfStyleProperty bkColorProperty = OdfStyleProperty.get ( OdfStylePropertiesSet.TableCellProperties, OdfName.newName ( OdfDocumentNamespace.FO, "background-color" ) );
            final String property = styleElement.getProperty ( bkColorProperty );
            if ( Color.isValid ( property ) )
            {
                color = property;
            }
        }
        return color;
    }

    protected OdfStyle getCellStyleElement ()
    {

        final OdfDocument document = (OdfDocument) ( (OdfFileDom)this.cell.getOwnerDocument () ).getDocument ();

        String styleName = this.cell.getStyleName ();
        if ( styleName == null || styleName.equals ( "" ) )
        {
            //search in row
            if ( this.row != null )
            {
                styleName = this.row.getTableDefaultCellStyleNameAttribute ();
            }
        }
        if ( styleName == null || styleName.equals ( "" ) )
        {
            //search in column
            if ( this.col != null )
            {
                styleName = this.col.getTableDefaultCellStyleNameAttribute ();
            }
        }
        if ( styleName == null || styleName.equals ( "" ) )
        {
            return null;
        }

        OdfStyle styleElement = this.cell.getAutomaticStyles ().getStyle ( styleName, this.cell.getStyleFamily () );

        if ( styleElement == null )
        {
            styleElement = document.getDocumentStyles ().getStyle ( styleName, OdfStyleFamily.TableCell );
        }

        if ( styleElement == null )
        {
            styleElement = this.cell.getDocumentStyle ();
        }

        return styleElement;
    }
}