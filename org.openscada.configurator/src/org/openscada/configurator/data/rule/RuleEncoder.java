package org.openscada.configurator.data.rule;

import java.util.HashMap;
import java.util.Map;

import org.openscada.configurator.data.ConfigurationTarget;
import org.openscada.configurator.sec.Rule;
import org.openscada.configurator.sec.Script;
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
        return new RuleEncoder ( rule );
    }

    private final Rule rule;

    public RuleEncoder ( final Rule rule )
    {
        this.rule = rule;
    }

    public void encodeRule ( final ConfigurationTarget target, final int priority )
    {
        final Map<String, String> data = new HashMap<String, String> ();

        data.put ( "serviceType", this.rule.getRuleType () );
        data.put ( "priority", "" + priority );

        if ( this.rule.getIdFilter () != null )
        {
            data.put ( "for.id", "" + this.rule.getIdFilter () );
        }
        if ( this.rule.getTypeFilter () != null )
        {
            data.put ( "for.type", "" + this.rule.getTypeFilter () );
        }
        if ( this.rule.getActionFilter () != null )
        {
            data.put ( "for.action", "" + this.rule.getActionFilter () );
        }
        putScript ( data, "filter.script", this.rule.getFilterScript () );

        putData ( data );

        target.addData ( ID, this.rule.getId (), data );
    }

    protected void putData ( final Map<String, String> data )
    {
    }

    public static void putScript ( final Map<String, String> data, final String prefix, final Script script )
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
