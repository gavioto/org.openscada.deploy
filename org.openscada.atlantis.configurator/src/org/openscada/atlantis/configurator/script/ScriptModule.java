package org.openscada.atlantis.configurator.script;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openscada.atlantis.configurator.Configuration;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.ScriptItem;

public class ScriptModule
{
    public static void process ( final File base, final Configuration cfg ) throws IOException
    {
        if ( !base.exists () )
        {
            return;
        }

        if ( !new File ( base, "scripts.xmi" ).exists () )
        {
            create ( new File ( base, "scripts.xmi" ) );
        }

        for ( final File file : base.listFiles ( new FileFilter () {

            @Override
            public boolean accept ( final File pathname )
            {
                return pathname.getName ().endsWith ( ".xmi" );
            }
        } ) )
        {
            loadFile ( file, cfg );
        }
    }

    private static List<ScriptItem> load ( final File filename )
    {
        final ResourceSet rs = new ResourceSetImpl ();
        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "xmi", new XMIResourceFactoryImpl () );

        final URI uri1 = URI.createURI ( ModelFactory.eINSTANCE.getModelPackage ().getNsURI () );
        final URI uri2 = URI.createPlatformPluginURI ( "/org.openscada.deploy.iolist.model/model/model.ecore", true );
        rs.getURIConverter ().getURIMap ().put ( uri1, uri2 );

        final Resource resource = rs.getResource ( URI.createFileURI ( filename.getAbsolutePath () ), true );

        final List<ScriptItem> result = new ArrayList<ScriptItem> ();

        final Model model = (Model)EcoreUtil.getObjectByType ( resource.getContents (), ModelPackage.Literals.MODEL );

        for ( final Item i : model.getItems () )
        {
            if ( i instanceof ScriptItem )
            {
                result.add ( (ScriptItem)i );
            }
        }

        return result;
    }

    private static void loadFile ( final File file, final Configuration cfg )
    {
        System.out.println ( "*** Loading file : " + file.getAbsolutePath () );
        cfg.addItems ( load ( file ) );
    }

    private static void create ( final File filename ) throws IOException
    {
        final Model model = ModelFactory.eINSTANCE.createModel ();

        final ResourceSet rs = new ResourceSetImpl ();
        final URI uri1 = URI.createURI ( ModelFactory.eINSTANCE.getModelPackage ().getNsURI () );
        final URI uri2 = URI.createPlatformPluginURI ( "/org.openscada.deploy.iolist.model/model/model.ecore", true );

        System.out.println ( uri1 );

        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "xmi", new XMIResourceFactoryImpl () );

        final URI fileUri = URI.createFileURI ( filename.getAbsolutePath () );
        System.out.println ( "output: " + fileUri );
        System.out.println ( "NS: " + ModelFactory.eINSTANCE.getModelPackage ().eResource ().getURI () );
        ModelFactory.eINSTANCE.getModelPackage ().eResource ().setURI ( uri2 );
        final Resource resource = rs.createResource ( fileUri );
        resource.getContents ().add ( model );

        // plant.eResource ().setURI ( uri2 );

        final Map<Object, Object> options = new HashMap<Object, Object> ();
        options.put ( XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE );

        resource.save ( options );
    }

    public static void create ( final File filename, final Collection<? extends Item> items ) throws IOException
    {
        final Model model = ModelFactory.eINSTANCE.createModel ();
        model.getItems ().addAll ( items );
    
        final ResourceSet rs = new ResourceSetImpl ();
        final URI uri1 = URI.createURI ( ModelFactory.eINSTANCE.getModelPackage ().getNsURI () );
        final URI uri2 = URI.createPlatformPluginURI ( "/org.openscada.deploy.iolist.model/model/model.ecore", true );
    
        System.out.println ( uri1 );
    
        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "xmi", new XMIResourceFactoryImpl () );
    
        final URI fileUri = URI.createFileURI ( filename.getAbsolutePath () );
        System.out.println ( "output: " + fileUri );
        System.out.println ( "NS: " + ModelFactory.eINSTANCE.getModelPackage ().eResource ().getURI () );
        ModelFactory.eINSTANCE.getModelPackage ().eResource ().setURI ( uri2 );
        final Resource resource = rs.createResource ( fileUri );
    
        resource.getContents ().add ( model );
    
        // plant.eResource ().setURI ( uri2 );
    
        final Map<Object, Object> options = new HashMap<Object, Object> ();
        options.put ( XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE );
    
        resource.save ( options );
    }
}
