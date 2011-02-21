package org.openscada.atlantis.configurator.loop.handler;

import java.util.Map;

import org.openscada.atlantis.configurator.loop.DataSourceDescriptor;

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
            node.addReference ( "datasource", (String)parameters.get ( "outputDatasource.id" ) );
        }

        return node;
    }

}
