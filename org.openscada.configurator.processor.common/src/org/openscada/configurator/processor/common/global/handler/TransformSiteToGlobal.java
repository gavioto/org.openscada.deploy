package org.openscada.configurator.processor.common.global.handler;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.processor.common.global.Exclude;
import org.openscada.configurator.processor.common.global.Include;
import org.openscada.configurator.processor.common.global.ItemSelector;
import org.openscada.configurator.processor.common.global.Site;
import org.openscada.deploy.iolist.model.DataType;
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

    private String makeConnectionId ( final String type, final Site site )
    {
        return String.format ( this.processor.getConnectionIdFormat (), type, site.getId () );
    }

    private void processSite ( final Site site )
    {
        System.out.println ( " *** Adding site : " + site );

        final String connectionDaId = makeConnectionId ( "da", site );
        this.cfg.addConnection ( connectionDaId, site.getConnectionDa () );
        makeConnectionItems ( site, connectionDaId, "DA" );

        final String connectionAeId = makeConnectionId ( "ae", site );
        this.cfg.addConnection ( connectionAeId, site.getConnectionAe () );
        makeConnectionItems ( site, connectionAeId, "AE" );

        final List<Item> items = loadSiteItems ( site.getSiteOutputDir () + "/configuration.iolist" );

        System.out.println ( String.format ( "** Loaded %s items", items.size () ) );

        int included = 0;
        for ( final Item item : items )
        {
            if ( isIncluded ( item ) )
            {
                addItem ( site, item );
                included++;
            }
        }
        System.out.println ( String.format ( "** Included %s of %s items", included, items.size () ) );
    }

    private boolean isIncluded ( final Item item )
    {
        final String alias = item.getAlias ();

        for ( final ItemSelector selector : this.processor.getSelector () )
        {
            if ( selector instanceof Include )
            {
                if ( selector.getPattern ().matcher ( alias ).matches () )
                {
                    return true;
                }
            }
            if ( selector instanceof Exclude )
            {
                if ( selector.getPattern ().matcher ( alias ).matches () )
                {
                    return false;
                }
            }
        }
        return false;
    }

    private void makeConnectionItems ( final Site site, final String connectionId, final String connectionTag )
    {
        {
            final Item item = ModelFactory.eINSTANCE.createItem ();
            item.setAlias ( String.format ( this.processor.getConnectionItemStateFormat (), site.getId (), connectionTag ) );
            item.setName ( String.format ( "org.openscada.da.master.analyzer.connectionService.%s.state.connected", connectionId ) );
            item.setDevice ( "master" );
            item.setDescription ( String.format ( "Conected state to site local %s master", connectionTag ) );
            item.setSystem ( "SCADA" );
            item.getHierarchy ().addAll ( this.processor.getHierarchyPrefix () );
            item.getHierarchy ().add ( site.getId () );
            item.setDataType ( DataType.BOOLEAN );

            this.cfg.addItem ( item );
        }

        {
            final Item item = ModelFactory.eINSTANCE.createItem ();
            item.setAlias ( String.format ( this.processor.getConnectionItemStringStateFormat (), site.getId (), connectionTag ) );
            item.setName ( String.format ( "org.openscada.da.master.analyzer.connectionService.%s.state.state", connectionId ) );
            item.setDevice ( "master" );
            item.setDescription ( String.format ( "Conected state to site local %s master", connectionTag ) );
            item.setSystem ( "SCADA" );
            item.getHierarchy ().addAll ( this.processor.getHierarchyPrefix () );
            item.getHierarchy ().add ( site.getId () );
            item.setDataType ( DataType.BOOLEAN );

            this.cfg.addItem ( item );
        }
    }

    private void addItem ( final Site site, final Item item )
    {
        final Item globalItem = ModelFactory.eINSTANCE.createItem ();

        String alias = item.getAlias ();
        if ( this.processor.getSummaryItemPattern ().matcher ( alias ).matches () )
        {
            // handle summary item
            /**
             * Summary items which are already global in the local site will be
             * renamed but
             * the hierarchy will not be changed. This way they will still end
             * in the real
             * global summaries.
             */
            alias = String.format ( this.processor.getSummaryItemFormat (), site.getId (), alias );

            // System.out.println ( String.format ( " **** Transforming summary from %s to %s: %s", item.getAlias (), alias, item ) );
        }
        else if ( isWrongHierarchy ( site, item ) )
        {
            System.out.println ( String.format ( " **** Item has wrong hierarchy (site: %s, item: %s). Skipping ... %s", site.getHierarchy (), item.getHierarchy (), item ) );
            return;
        }

        globalItem.setAlias ( alias );
        globalItem.setName ( item.getAlias () );
        globalItem.setDescription ( item.getDescription () );
        globalItem.setUnit ( item.getUnit () );
        globalItem.setDataType ( item.getDataType () );
        globalItem.setDevice ( makeConnectionId ( "da", site ) );
        globalItem.setDefaultChain ( false );
        globalItem.setLocalManual ( false );
        globalItem.setBlock ( false );
        globalItem.getHierarchy ().addAll ( item.getHierarchy () );

        this.cfg.addItem ( globalItem );
    }

    private boolean isWrongHierarchy ( final Site site, final Item item )
    {
        if ( item.getHierarchy ().size () < site.getHierarchy ().size () )
        {
            return true;
        }

        final Iterator<String> siteIter = site.getHierarchy ().iterator ();
        final Iterator<String> itemIter = item.getHierarchy ().iterator ();
        while ( siteIter.hasNext () )
        {
            if ( !siteIter.next ().equals ( itemIter.next () ) )
            {
                return true;
            }
        }
        return false;
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
