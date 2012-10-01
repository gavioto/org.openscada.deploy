package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.Item;

public abstract class TextColumn extends AbstractColumn
{

    public TextColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item )
    {
        final String value = getValue ( item );
        if ( value != null )
        {
            setStringValue ( cell, value );
        }
    };

    protected abstract String getValue ( Item item );

}
