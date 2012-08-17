package org.openscada.configurator;

import java.util.Map;

public interface RowHandler
{
    public void handleRow ( int rowNumber, Map<String, String> rowData );
}
