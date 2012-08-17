package org.openscada.configurator.report;

import java.util.List;
import java.util.Map;

import org.odftoolkit.odfdom.doc.OdfTextDocument;
import org.odftoolkit.odfdom.doc.table.OdfTable;
import org.odftoolkit.odfdom.doc.table.OdfTableCell;
import org.odftoolkit.odfdom.dom.element.text.TextListItemElement;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextList;
import org.odftoolkit.odfdom.incubator.doc.text.OdfTextParagraph;

public class OdfHelper
{
    public static final String SOURCE_TEXT = "Screen Text"; //$NON-NLS-1$

    public static final String TEXT_BODY = "Text body"; //$NON-NLS-1$

    public static final String TITLE = "Title"; //$NON-NLS-1$

    public static final String SUBTITLE = "Subtitle"; //$NON-NLS-1$

    public static final String TABLE_HEADING = "Table Heading";//$NON-NLS-1$

    public static final String TABLE_CONTENTS = "Table Contents";//$NON-NLS-1$

    public static void createMapTable ( final OdfTextDocument odt, final Map<String, String> data )
    {
        if ( data.isEmpty () )
        {
            return;
        }

        final OdfTable table = OdfTable.newTable ( odt, data.size (), 2, 0, 1 );

        int i = 0;
        for ( final Map.Entry<String, String> entry : data.entrySet () )
        {
            table.getCellByPosition ( 0, i ).setStringValue ( entry.getKey () );
            table.getCellByPosition ( 1, i ).setStringValue ( entry.getValue () );

            table.getCellByPosition ( 0, i ).getOdfElement ().setStyleName ( TABLE_HEADING );
            table.getCellByPosition ( 1, i ).getOdfElement ().setStyleName ( TABLE_CONTENTS );
            i++;
        }
    }

    public static OdfTextList newTextList ( final OdfTextDocument odt, final List<String> content ) throws Exception
    {
        final OdfTextList list = new OdfTextList ( odt.getContentDom () );

        for ( final String entry : content )
        {
            final TextListItemElement li = list.newTextListItemElement ();
            li.newTextPElement ().setTextContent ( entry );
        }

        odt.getContentRoot ().appendChild ( list );
        return list;
    }

    public static void setCell ( final OdfTable table, final int col, final int row, final String content, final String style )
    {
        final OdfTableCell cell = table.getCellByPosition ( col, row );
        cell.setStringValue ( content );
        cell.getOdfElement ().setStyleName ( style );
    }

    public static OdfTextParagraph newStyledParagraph ( final OdfTextDocument odt, final String style, final String content ) throws Exception
    {
        final OdfTextParagraph p;

        if ( content != null )
        {
            p = odt.newParagraph ( content );
        }
        else
        {
            p = odt.newParagraph ();
        }
        p.setStyleName ( style );
        return p;
    }
}
