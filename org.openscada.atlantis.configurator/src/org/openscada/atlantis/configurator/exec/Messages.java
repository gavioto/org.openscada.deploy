package org.openscada.atlantis.configurator.exec;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
    private static final String BUNDLE_NAME = "org.openscada.atlantis.configurator.exec.messages"; //$NON-NLS-1$

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
