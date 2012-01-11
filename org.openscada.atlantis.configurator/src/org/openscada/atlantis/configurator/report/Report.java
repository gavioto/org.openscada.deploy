package org.openscada.atlantis.configurator.report;

import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.style.props.OdfParagraphProperties;
import org.odftoolkit.odfdom.dom.style.props.OdfTextProperties;
import org.odftoolkit.odfdom.incubator.doc.office.OdfOfficeStyles;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStyle;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextHeading;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

public class Report
{
    private final Map<String, DataItem> items = new TreeMap<String, DataItem> ();

    public DataItem getItem ( final String id )
    {
        if ( id == null )
        {
            return new DataItem ( null );
        }

        DataItem item = this.items.get ( id );
        if ( item == null )
        {
            item = new DataItem ( id );
            this.items.put ( id, item );
        }
        return item;
    }

    public void write ( final File file ) throws Exception
    {
        // Create a text document from a standard template (empty documents within the JAR)
        final OdfTextDocument odt = OdfTextDocument.newTextDocument ();
        cleanOutDocument ( odt );

        createStyles ( odt );

        final TextTableOfContentElement toc = new TextTableOfContentElement ( odt.getContentDom () );
        odt.getContentRoot ().appendChild ( toc );

        //         final TextTableOfContentSourceElement tocSource = toc.newTextTableOfContentSourceElement ();
        odt.setLocale ( Locale.ENGLISH );

        writeItems ( odt );

        // Save document
        odt.save ( file );
    }

    protected void setFontFamily ( final OdfStyleBase style, final String value )
    {
        style.setProperty ( OdfTextProperties.FontFamily, value );
        style.setProperty ( OdfTextProperties.FontFamilyAsian, value );
        style.setProperty ( OdfTextProperties.FontFamilyComplex, value );
    }

    private void createStyles ( final OdfTextDocument odt )
    {
        final OdfOfficeStyles styles = odt.getOrCreateDocumentStyles ();
        //final OdfStyle defaultStyle = styles.getStyle ( OdfHelper.TEXT_BODY, OdfStyleFamily.Paragraph );

        final OdfStyle style = styles.newStyle ( OdfHelper.SOURCE_TEXT, OdfStyleFamily.Paragraph );
        style.setStyleParentStyleNameAttribute ( OdfHelper.TEXT_BODY );
        style.setProperty ( OdfParagraphProperties.Margin, "1cm" );
        style.setProperty ( OdfParagraphProperties.BackgroundColor, "#DDDDDD" );
        setFontFamily ( style, "Courier New" );
    }

    void cleanOutDocument ( final OdfTextDocument odt ) throws DOMException, Exception
    {
        Node childNode;
        childNode = odt.getContentRoot ().getFirstChild ();
        while ( childNode != null )
        {
            odt.getContentRoot ().removeChild ( childNode );
            childNode = odt.getContentRoot ().getFirstChild ();
        }
    }

    private void writeItems ( final OdfTextDocument odt ) throws Exception
    {
        final OdfTextHeading heading = new OdfTextHeading ( odt.getContentDom () );
        heading.addStyledContent ( "Heading 1", "Available Items" );
        heading.setTextOutlineLevelAttribute ( 1 );

        odt.getContentRoot ().appendChild ( heading );

        for ( final DataItem item : this.items.values () )
        {
            writeItem ( odt, item );
        }
    }

    private void writeItem ( final OdfTextDocument odt, final DataItem item ) throws Exception
    {
        final OdfTextHeading heading = new OdfTextHeading ( odt.getContentDom () );
        heading.addStyledContent ( "Heading 2", item.getId () );
        heading.setTextOutlineLevelAttribute ( 2 );

        odt.getContentRoot ().appendChild ( heading );

        OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, String.format ( "The item is internally referenced as »%s«.", item.getInternalId () ) );

        if ( item.getBaseInformation () != null )
        {
            item.getBaseInformation ().write ( odt );
        }

        // dump features

        if ( !item.getFeatures ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "The following features are supported by this item:" );
            OdfHelper.newTextList ( odt, item.getFeatures () );
        }

        writeItemSource ( odt, item );
        writeItemMonitors ( odt, item );
    }

    private void writeItemMonitors ( final OdfTextDocument odt, final DataItem item ) throws Exception
    {
        final OdfTextHeading heading = new OdfTextHeading ( odt.getContentDom () );
        heading.addStyledContent ( "Heading 3", "Monitors" );
        heading.setTextOutlineLevelAttribute ( 3 );

        odt.getContentRoot ().appendChild ( heading );

        if ( item.getMonitors ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "The item is not monitored." );
        }
        else
        {
            for ( final Monitor monitor : item.getMonitors () )
            {
                monitor.write ( odt );
            }
        }
    }

    private void writeItemSource ( final OdfTextDocument odt, final DataItem item ) throws Exception
    {
        final OdfTextHeading heading = new OdfTextHeading ( odt.getContentDom () );
        heading.addStyledContent ( "Heading 3", "Value Source" );
        heading.setTextOutlineLevelAttribute ( 3 );

        odt.getContentRoot ().appendChild ( heading );

        if ( item.getSource () != null )
        {
            item.getSource ().write ( odt );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "Internal value source." );
        }
    }
}
