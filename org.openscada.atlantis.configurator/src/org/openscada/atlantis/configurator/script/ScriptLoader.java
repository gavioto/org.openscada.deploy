package org.openscada.atlantis.configurator.script;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openscada.atlantis.configurator.Configuration;
import org.openscada.atlantis.configurator.common.DataLoader;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;

public class ScriptLoader
{

    public static String loadScripts ( final Configuration cfg, final File file, final File generatedFile, final File outputDir ) throws Exception
    {
        final File scriptBase = file.getParentFile ();

        final DataLoader loader = new DataLoader ( file, true );
        final ScriptLoadHandler handler = new ScriptLoadHandler ( cfg, scriptBase );
        loader.load ( 0, handler );

        // SpreadSheetPoiHelper.writeSpreadsheet ( generatedFile.getAbsolutePath (), handler.getItems () );

        create ( new File ( outputDir, "generated-scripts.xmi" ), handler.getItems () );

        return generatedFile.getAbsolutePath ();
    }

    private static void create ( final File filename, final Collection<? extends Item> items ) throws IOException
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
