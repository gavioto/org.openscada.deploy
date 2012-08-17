package org.openscada.configurator.loop.handler;

import java.util.Map;

import org.openscada.configurator.loop.DataSourceDescriptor;

public class FormulaHandler extends MultiSourceAttributeHandler
{

    public FormulaHandler ()
    {
        super ( "datasource." );
    }

    @Override
    protected DataSourceDescriptor createNode ( final String configurationId, final Map<String, String> parameters )
    {
        final DataSourceDescriptor node = super.createNode ( configurationId, parameters );

        if ( parameters.containsKey ( "outputDatasource.id" ) )
        {
            node.addReference ( "datasource", parameters.get ( "outputDatasource.id" ) );
        }

        return node;
    }

}
