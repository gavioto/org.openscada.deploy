package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableCellElement;
import org.openscada.deploy.iolist.model.Item;

public abstract class NumericColumn extends AbstractColumn
{

    public NumericColumn ( final String name )
    {
        super ( name );
    }

    @Override
    protected void update ( final OdfSpreadsheetDocument output, final TableTableCellElement cell, final Item item )
    {
        final Number value = getValue ( item );
        if ( value != null )
        {
            setFloatValue ( cell, value.doubleValue () );
        }
    };

    protected abstract Number getValue ( Item item );

}
