package org.openscada.configurator.data.rule;

import java.util.Map;

import org.openscada.configurator.sec.PreFilterRule;

public class PreFilterRuleEncoder extends RuleEncoder
{

    private final PreFilterRule rule;

    public PreFilterRuleEncoder ( final PreFilterRule rule )
    {
        super ( rule );
        this.rule = rule;
    }

    @Override
    protected void putData ( final Map<String, String> data )
    {
        super.putData ( data );

        if ( this.rule.getIdFilter () != null )
        {
            data.put ( "properties.for.id", "" + this.rule.getIdFilter () );
        }
        if ( this.rule.getTypeFilter () != null )
        {
            data.put ( "properties.for.type", "" + this.rule.getTypeFilter () );
        }
        if ( this.rule.getActionFilter () != null )
        {
            data.put ( "properties.for.action", "" + this.rule.getActionFilter () );
        }
    }
}