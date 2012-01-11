package org.openscada.atlantis.configurator.report;

import java.util.HashMap;
import java.util.Map;

import org.odftoolkit.odfdom.doc.OdfTextDocument;

public class BaseInformation
{

    private final Map<String, String> data;

    private final boolean logger;

    public BaseInformation ( final String hive, final String system, final String location, final String component, final String description, final boolean logger )
    {
        this.data = new HashMap<String, String> ();

        if ( hive != null )
        {
            this.data.put ( Messages.getString("BaseInformation.driverName"), hive ); //$NON-NLS-1$
        }
        if ( system != null )
        {
            this.data.put ( Messages.getString("BaseInformation.system"), system ); //$NON-NLS-1$
        }
        if ( location != null )
        {
            this.data.put ( Messages.getString("BaseInformation.location"), location ); //$NON-NLS-1$
        }
        if ( component != null )
        {
            this.data.put ( Messages.getString("BaseInformation.component"), component ); //$NON-NLS-1$
        }
        if ( description != null )
        {
            this.data.put ( Messages.getString("BaseInformation.description"), description ); //$NON-NLS-1$
        }
        this.logger = logger;
    }

    public void write ( final OdfTextDocument odt ) throws Exception
    {
        OdfHelper.createMapTable ( odt, this.data );
        if ( this.logger )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, Messages.getString("BaseInformation.loggerText") ); //$NON-NLS-1$
        }
    }

}
