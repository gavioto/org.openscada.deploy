package org.openscada.atlantis.configurator.report;

import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.text.TextSectionElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentSourceElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.style.props.OdfParagraphProperties;
import org.odftoolkit.odfdom.dom.style.props.OdfTextProperties;
import org.odftoolkit.odfdom.incubator.doc.office.OdfOfficeStyles;
import org.odftoolkit.odfdom.incubator.doc.style.OdfStyle;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextHeading;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextParagraph;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

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

    public void write ( final File file, final File inputDir ) throws Exception
    {
        // Create a text document from a standard template (empty documents within the JAR)
        final OdfTextDocument odt = OdfTextDocument.newTextDocument ();
        cleanOutDocument ( odt );

        odt.getOfficeMetadata ().setTitle ( Messages.getString ( "Report.title" ) ); //$NON-NLS-1$
        odt.getOfficeMetadata ().setSubject ( Messages.getString ( "Report.subtitle" ) ); //$NON-NLS-1$

        createStyles ( odt );

        // insert title page
        {
            final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.TITLE, null );
            p.newTextTitleElement ();
        }

        {
            final OdfTextParagraph p = OdfHelper.newStyledParagraph ( odt, OdfHelper.SUBTITLE, null );
            p.newTextSubjectElement ();
        }

        // insert TOC

        final TextTableOfContentElement toc = new TextTableOfContentElement ( odt.getContentDom () );
        odt.getContentRoot ().appendChild ( toc );

        final TextTableOfContentSourceElement tocSource = toc.newTextTableOfContentSourceElement ();
        tocSource.setTextOutlineLevelAttribute ( 2 );
        odt.setLocale ( Locale.GERMAN );

        createStaticContent ( odt, new File ( inputDir, "static.odt" ) );

        writeItems ( odt );

        // Save document
        odt.save ( file );
    }

    private void createStaticContent ( final OdfTextDocument odt, final File file ) throws Exception
    {
        if ( !file.canRead () || !file.isFile () )
        {
            return;
        }

        final OdfTextDocument staticOdt = OdfTextDocument.loadDocument ( file );

        final TextSectionElement section = new TextSectionElement ( odt.getContentDom () );
        odt.getContentRoot ().appendChild ( section );
        section.setTextProtectedAttribute ( true );
        section.setTextNameAttribute ( "Static Content" ); //$NON-NLS-1$

        final NodeList childNodes = staticOdt.getContentRoot ().getChildNodes ();
        for ( int i = 0; i < childNodes.getLength (); i++ )
        {
            final Node newNode = childNodes.item ( i ).cloneNode ( true );
            final Node adoptedNode = odt.getContentDom ().adoptNode ( newNode );
            section.appendChild ( adoptedNode );
        }
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

        {
            final OdfStyle style = styles.newStyle ( OdfHelper.SOURCE_TEXT, OdfStyleFamily.Paragraph );
            style.setStyleParentStyleNameAttribute ( OdfHelper.TEXT_BODY );
            style.setProperty ( OdfParagraphProperties.Margin, "1cm" ); //$NON-NLS-1$
            style.setProperty ( OdfParagraphProperties.BackgroundColor, "#DDDDDD" ); //$NON-NLS-1$
            setFontFamily ( style, "Courier New" ); //$NON-NLS-1$
        }
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
        heading.addStyledContent ( "Heading 1", Messages.getString ( "Report.header.availaleItems" ) ); //$NON-NLS-1$ //$NON-NLS-2$
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
        heading.addStyledContent ( "Heading 2", item.getId () ); //$NON-NLS-1$
        heading.setTextOutlineLevelAttribute ( 2 );

        odt.getContentRoot ().appendChild ( heading );

        OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, String.format ( Messages.getString ( "Report.item.internalReference" ), item.getInternalId () ) ); //$NON-NLS-1$

        if ( item.getBaseInformation () != null )
        {
            item.getBaseInformation ().write ( odt );
        }

        // dump features

        if ( !item.getFeatures ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "Report.item.features" ) ); //$NON-NLS-1$
            OdfHelper.newTextList ( odt, item.getFeatures () );
        }

        writeItemSource ( odt, item );
        writeItemMonitors ( odt, item );
    }

    private void writeItemMonitors ( final OdfTextDocument odt, final DataItem item ) throws Exception
    {
        final OdfTextHeading heading = new OdfTextHeading ( odt.getContentDom () );
        heading.addStyledContent ( "Heading 3", Messages.getString ( "Report.heading.monitors" ) ); //$NON-NLS-1$ //$NON-NLS-2$
        heading.setTextOutlineLevelAttribute ( 3 );

        odt.getContentRoot ().appendChild ( heading );

        if ( item.getMonitors ().isEmpty () )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "Report.monitors.none" ) ); //$NON-NLS-1$
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
        heading.addStyledContent ( "Heading 3", Messages.getString ( "Report.heading.valueSource" ) ); //$NON-NLS-1$ //$NON-NLS-2$
        heading.setTextOutlineLevelAttribute ( 3 );

        odt.getContentRoot ().appendChild ( heading );

        if ( item.getSource () != null )
        {
            item.getSource ().write ( odt );
        }
        else
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString ( "Report.valueSource.none" ) ); //$NON-NLS-1$
        }
    }
}
