package org.openscada.configurator.data.rule;

import java.util.Map;

import org.openscada.configurator.sec.ScriptRule;

public class ScriptRuleEncoder extends RuleEncoder
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
        putScript ( data, "properties.script", this.rule.getScript () );
        putScript ( data, "properties.callbackScript", this.rule.getCallbackScript () );
    }
}
