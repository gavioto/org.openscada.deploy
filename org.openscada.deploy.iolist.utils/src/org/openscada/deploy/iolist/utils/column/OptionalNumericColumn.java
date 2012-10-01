package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.Item;

public abstract class OptionalNumericColumn extends AbstractColumn
{

    public OptionalNumericColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item )
    {
        final Double value = getValue ( item );
        final boolean available = isAvailale ( item );

        if ( available && value != null )
        {
            setFloatValue ( cell, value );
        }
        else if ( available )
        {
            setStringValue ( cell, "X" );
        }
    };

    protected abstract Double getValue ( Item item );

    protected abstract boolean isAvailale ( Item item );

}
