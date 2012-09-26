package org.openscada.configurator.module.common.scripts.handler;

import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openscada.configurator.Configuration;
import org.openscada.configurator.data.RowHandler;

public class ScriptMonitorRowHandler implements RowHandler
{

    private static final String SPLIT_PATTERN = "([,\\n\\r]|, *)";

    private final Configuration configuration;

    private final File baseDir;

    public ScriptMonitorRowHandler ( final Configuration configuration, final File baseDir )
    {
        this.configuration = configuration;
        this.baseDir = baseDir;
    }

    @Override
    public void handleRow ( final int rowNumber, final Map<String, String> rowData )
    {
        final String id = rowData.remove ( "ID" );
        if ( id == null || id.isEmpty () )
        {
            return;
        }

        final int priority = Integer.parseInt ( rowData.remove ( "PRIORITY" ) );
        final String scriptEngine = rowData.remove ( "SCRIPT_ENGINE" );
        String updateScript = rowData.remove ( "UPDATE_SCRIPT" );
        final String inputsString = rowData.remove ( "INPUTS" );
        final String outputsString = rowData.remove ( "OUTPUTS" );

        final Set<String> outputs = new TreeSet<String> ();
        final Map<String, String> inputs = new TreeMap<String, String> ();

        inputs.putAll ( Helper.parseInputs ( inputsString ) );
        outputs.addAll ( Arrays.asList ( outputsString.split ( SPLIT_PATTERN ) ) );

        if ( updateScript.startsWith ( "@" ) )
        {
            try
            {
                updateScript = Configuration.loadFromFile ( new File ( this.baseDir, updateScript.substring ( 1 ) ) );
            }
            catch ( final Exception e )
            {
                throw new RuntimeException ( e );
            }
        }

        this.configuration.addScriptMonitor ( id, priority, scriptEngine, updateScript, inputs, outputs, rowData );
    }
}
