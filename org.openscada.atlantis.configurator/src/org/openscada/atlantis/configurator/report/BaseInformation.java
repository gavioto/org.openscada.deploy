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
            this.data.put ( "Driver Name", hive );
        }
        if ( system != null )
        {
            this.data.put ( "System", system );
        }
        if ( location != null )
        {
            this.data.put ( "Location", location );
        }
        if ( component != null )
        {
            this.data.put ( "Component", component );
        }
        if ( description != null )
        {
            this.data.put ( "Description", description );
        }
        this.logger = logger;
    }

    public void write ( final OdfTextDocument odt ) throws Exception
    {
        OdfHelper.createMapTable ( odt, this.data );
        if ( this.logger )
        {
            OdfHelper.newStyledParagraph ( odt, OdfHelper.TEXT_BODY, "All value, write requests and state changes of this item are logged into AE." );
        }
    }

}
