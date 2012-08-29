package org.openscada.configurator.module.common.summary.handler;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{
    private static final String BUNDLE_NAME = "org.openscada.configurator.module.common.summary.handler.messages"; //$NON-NLS-1$

    public static String SumLoader_Description;

    public static String SumLoader_System;
    static
    {
        // initialize resource bundle
        NLS.initializeMessages ( BUNDLE_NAME, Messages.class );
    }

    private Messages ()
    {
    }
}
