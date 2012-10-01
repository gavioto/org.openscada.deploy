package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.Item;

public abstract class BooleanColumn extends AbstractColumn
{

    public BooleanColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item )
    {
        final Boolean value = getValue ( item );
        if ( value != null )
        {
            setStringValue ( cell, value ? "X" : "" );
        }
    };

    protected abstract Boolean getValue ( Item item );

}
