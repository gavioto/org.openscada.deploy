package org.openscada.configurator.data.rule;

import java.util.Map;

import org.openscada.configurator.sec.Script;
import org.openscada.configurator.sec.ScriptRule;

public class ScriptRuleEncoder extends PreFilterRuleEncoder
{

    private final ScriptRule rule;

    public ScriptRuleEncoder ( final ScriptRule rule )
    {
        super ( rule );
        this.rule = rule;
    }

    @Override
    protected void putData ( final Map<String, String> data )
    {
        super.putData ( data );
        putScript ( data, "properties.script", this.rule.getScript () );
        putScript ( data, "properties.callbackScript", this.rule.getCallbackScript () );
    }

    protected void putScript ( final Map<String, String> data, final String prefix, final Script script )
    {
        if ( script != null )
        {
            data.put ( prefix, script.getSource () );
            if ( script.getType () != null )
            {
                data.put ( prefix + ".engine", script.getType () );
            }
        }
    }
}
