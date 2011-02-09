package org.openscada.atlantis.configurator.loop;

import java.util.Map;

public class FormulaHandler extends MultiSourceAttributeHandler
{

    public FormulaHandler ()
    {
        super ( "datasource." );
    }

    @Override
    protected DataSourceDescriptor createNode ( final String configurationId, final Map<String, Object> parameters )
    {
        final DataSourceDescriptor node = super.createNode ( configurationId, parameters );

        if ( parameters.containsKey ( "outputDatasource.id" ) )
        {
            node.addReference ( (String)parameters.get ( "outputDatasource.id" ) );
        }

        return node;
    }

}
