package org.openscada.atlantis.configurator.common;

import java.util.Map;

public interface RowHandler
{
    public void handleRow ( int rowNumber, Map<String, String> rowData );
}
