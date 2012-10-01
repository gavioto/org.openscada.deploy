package org.openscada.deploy.iolist.utils.column;

import org.odftoolkit.odfdom.doc.OdfSpreadsheetDocument;
import org.odftoolkit.odfdom.dom.element.table.TableTableRowElement;
import org.openscada.deploy.iolist.model.Item;

public interface ColumnWriter
{
    public void writeHeader ( final OdfSpreadsheetDocument output, final TableTableRowElement row, int colIndex ) throws Exception;

    public void writeItem ( final OdfSpreadsheetDocument output, final TableTableRowElement row, int rowIndex, int colIndex, final Item item ) throws Exception;
}
