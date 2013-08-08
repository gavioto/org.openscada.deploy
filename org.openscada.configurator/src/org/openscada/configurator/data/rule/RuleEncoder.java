package org.openscada.configurator.data.rule;

import java.util.HashMap;
import java.util.Map;

import org.openscada.configuration.security.Rule;
import org.openscada.configuration.security.Script;
import org.openscada.configuration.security.ScriptRule;
import org.openscada.configuration.security.SignatureRule;
import org.openscada.configurator.data.ConfigurationTarget;

public class RuleEncoder
{
    public static final String ID = "org.openscada.sec.osgi.manager";

    public static RuleEncoder findEncoder ( final Rule rule )
    {
        if ( rule instanceof ScriptRule )
        {
            return new ScriptRuleEncoder ( (ScriptRule)rule );
        }
        else if ( rule instanceof SignatureRule )
        {
            return new SigatureRuleEncoder ( (SignatureRule)rule );
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
        if ( script == null )
        {
            return;
        }

        if ( script.getSource () == null )
        {
            throw new NullPointerException ( "'script' must not be null" );
        }

        data.put ( prefix, script.getSource () );
        if ( script.getType () != null )
        {
            data.put ( prefix + ".engine", script.getType () );
        }
    }
}
