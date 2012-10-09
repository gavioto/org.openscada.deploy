package org.openscada.configurator.processor.common.global.handler;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.processor.common.global.Site;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;

public class TransformSiteToGlobal
{

    private final org.openscada.configurator.processor.common.global.TransformSiteToGlobal processor;

    private final Configuration cfg;

    public TransformSiteToGlobal ( final org.openscada.configurator.processor.common.global.TransformSiteToGlobal processor )
    {
        this.processor = processor;
        this.cfg = this.processor.getGlobalSlot ().getConfigurationData ();
    }

    public void process ()
    {
        for ( final Site site : this.processor.getSites () )
        {
            processSite ( site );
        }
    }

    private String makeDaConnectionId ( final Site site )
    {
        return "site.master.da." + site.getId ();
    }

    private void processSite ( final Site site )
    {
        System.out.println ( " *** Adding site : " + site );
        this.cfg.addConnection ( makeDaConnectionId ( site ), site.getConnectionDa () );
        this.cfg.addConnection ( "site.master.ae." + site.getId (), site.getConnectionAe () );

        final List<Item> items = loadSiteItems ( site.getSiteOutputDir () + "/configuration.iolist" );

        System.out.println ( String.format ( "Loaded %s items", items.size () ) );

        for ( final Item item : items )
        {
            addItem ( site, item );
        }
    }

    private void addItem ( final Site site, final Item item )
    {
        final Item globalItem = ModelFactory.eINSTANCE.createItem ();

        globalItem.setAlias ( item.getAlias () );
        globalItem.setDescription ( item.getDescription () );
        globalItem.setUnit ( item.getUnit () );
        globalItem.setDataType ( item.getDataType () );
        globalItem.setDevice ( makeDaConnectionId ( site ) );
        globalItem.setDefaultChain ( false );
        globalItem.setLocalManual ( false );
        globalItem.setBlock ( false );

        this.cfg.addItem ( globalItem );
    }

    protected List<Item> loadSiteItems ( final String url )
    {
        System.out.println ( " * Importing items from " + url );

        final ResourceSet rs = new ResourceSetImpl ();
        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "xmi", new XMIResourceFactoryImpl () );
        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "iolist", new XMIResourceFactoryImpl () );

        final URI uri1 = URI.createURI ( ModelFactory.eINSTANCE.getModelPackage ().getNsURI () );
        final URI uri2 = URI.createPlatformPluginURI ( "/org.openscada.deploy.iolist.model/model/model.ecore", true );
        rs.getURIConverter ().getURIMap ().put ( uri1, uri2 );

        final Resource resource = rs.getResource ( URI.createURI ( url ), true );

        final Model model = (Model)EcoreUtil.getObjectByType ( resource.getContents (), ModelPackage.Literals.MODEL );

        return model.getItems ();
    }
}
