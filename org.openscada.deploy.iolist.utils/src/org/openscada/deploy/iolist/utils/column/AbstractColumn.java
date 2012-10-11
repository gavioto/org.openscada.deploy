package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowElement;
import org.odftoolkit.odfdom.dom.style.props.OdfStylePropertiesSet;
import org.odftoolkit.odfdom.dom.style.props.OdfStyleProperty;
import org.odftoolkit.odfdom.dom.style.props.OdfTableCellProperties;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextParagraph;
import org.odftoolkit.odfdom.incubator.doc.text.OdfWhitespaceProcessor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.type.Color;
import org.openscada.deploy.iolist.model.Item;

public abstract class AbstractColumn implements ColumnWriter
{

    private final String name;

    protected abstract void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item );

    public AbstractColumn ( final String name )
    {
        this.name = name;
    }

    @Override
    public void writeHeader ( final OdfSpreadsheetDocument output, final TableTableRowElement row, final int colIndex ) throws Exception
    {
        final TableTableCellElement cell = new TableTableCellElement ( output.getContentDom () );
        row.appendChild ( cell );
        setStringValue ( cell, this.name );
    }

    private void setDisplayValue ( final TableTableCellElement cell, final String string )
    {
        final OdfWhitespaceProcessor textProcessor = new OdfWhitespaceProcessor ();
        final OdfTextParagraph para = new OdfTextParagraph ( (OdfFileDom)cell.getOwnerDocument () );
        textProcessor.append ( para, string );

        cell.appendChild ( para );
    }

    protected void setStringValue ( final TableTableCellElement cell, final String string )
    {
        cell.setOfficeValueTypeAttribute ( OfficeValueTypeAttribute.Value.STRING.toString () );
        cell.setOfficeStringValueAttribute ( string );

        setDisplayValue ( cell, string );
    }

    protected void setFloatValue ( final TableTableCellElement cell, final double value )
    {
        cell.setOfficeValueTypeAttribute ( OfficeValueTypeAttribute.Value.FLOAT.toString () );
        cell.setOfficeValueAttribute ( value );

        setDisplayValue ( cell, "" + value );
    }

    protected void setBackgroundColor ( final TableTableCellElement cell, final String color )
    {
        if ( ( color == null ) || color.isEmpty () || Color.isValid ( color ) )
        {
            cell.setProperty ( OdfTableCellProperties.BackgroundColor, "".equals ( color ) ? null : color );
        }
        else
        {
            throw new IllegalArgumentException ( "Invalid color: " + color );
        }
    }

    protected void setBackgroundStyleColor ( final OdfStyleBase cellStyle, final String color )
    {
        if ( ( color == null ) || color.isEmpty () || Color.isValid ( color ) )
        {
            final OdfStyleProperty bkColorProperty = OdfStyleProperty.get ( OdfStylePropertiesSet.TableCellProperties, OdfName.newName ( OdfDocumentNamespace.FO, "background-color" ) );
            cellStyle.setProperty ( bkColorProperty, "".equals ( color ) ? null : color );
        }
        else
        {
            throw new IllegalArgumentException ( "Invalid color: " + color );
        }
    }

    @Override
    public void writeItem ( final OdfSpreadsheetDocument output, final TableTableRowElement row, final int rowIndex, final int colIndex, final Item item ) throws Exception
    {
        final TableTableCellElement cell = new TableTableCellElement ( output.getContentDom () );
        row.appendChild ( cell );

        update ( output, cell, item );
    }

}