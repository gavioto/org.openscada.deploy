package org.openscada.configurator.module.common.network.handler;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
    private static final String BUNDLE_NAME = "org.openscada.configurator.module.common.network.handler.messages"; //$NON-NLS-1$

    public static String Application_PacketLoss_Description;

    public static String Application_RTT_Description;
    static
    {
        // initialize resource bundle
        NLS.initializeMessages ( BUNDLE_NAME, Messages.class );
    }

    private Messages ()
    {
    }
}
