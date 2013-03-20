package org.openscada.configurator.data.rule;

import java.util.HashMap;
import java.util.Map;

import org.openscada.configurator.data.ConfigurationTarget;
import org.openscada.configurator.sec.PreFilterRule;
import org.openscada.configurator.sec.Rule;
import org.openscada.configurator.sec.ScriptRule;

public class RuleEncoder
{
    public static final String ID = "org.openscada.sec.osgi.manager";

    public static RuleEncoder findEncoder ( final Rule rule )
    {
        if ( rule instanceof ScriptRule )
        {
            return new ScriptRuleEncoder ( (ScriptRule)rule );
        }
        else if ( rule instanceof PreFilterRule )
        {
            return new PreFilterRuleEncoder ( (PreFilterRule)rule );
        }
        return null;
    }

    private final Rule rule;

    public RuleEncoder ( final Rule rule )
    {
        this.rule = rule;
    }

    public void encodeRule ( final ConfigurationTarget target )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "serviceType", this.rule.getRuleType () );

        putData ( data );

        target.addData ( ID, this.rule.getId (), data );
    }

    protected void putData ( final Map<String, String> data )
    {
        data.put ( "priority", "" + this.rule.getPriority () );
    }
}
