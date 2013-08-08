package org.openscada.configurator.data.rule;

import java.util.Map;

import org.openscada.configuration.security.CA;
import org.openscada.configuration.security.SignatureRule;

public class SigatureRuleEncoder extends RuleEncoder
{

    private final SignatureRule rule;

    public SigatureRuleEncoder ( final SignatureRule rule )
    {
        super ( rule );
        this.rule = rule;
    }

    @Override
    protected void putData ( final Map<String, String> data )
    {
        super.putData ( data );

        data.put ( "properties.reloadPeriod", "" + this.rule.getReloadPeriod () );

        int i = 0;
        for ( final CA ca : this.rule.getTrustedCertificationAuthority () )
        {
            if ( ca.getCertificateUrl () != null )
            {
                data.put ( String.format ( "properties.ca.%s.cert", i ), ca.getCertificateUrl () );
            }

            int j = 0;
            for ( final String url : ca.getCrlUrl () )
            {
                data.put ( String.format ( "properties.ca.%s.crl.%s", i, j ), url );
                j++;
            }
            i++;
        }

        putScript ( data, "properties.postProcessor", this.rule.getPostProcessor () );
    }
}
