package org.openscada.configurator.module.common.processing.handler;

import java.io.File;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.processing.ImportModule;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;

public class ImportHandler
{

    public static void process ( final Configuration configuration, final Project project, final ImportModule module )
    {
        try
        {
            final File dir = new File ( FileLocator.toFileURL ( new URL ( module.getPath () ) ).getFile () );
            if ( dir.isFile () )
            {
                loadFile ( configuration, dir );
            }
            else
            {
                System.out.println ( " * Loading directory : " + dir );
                for ( final File file : dir.listFiles () )
                {
                    if ( file.isFile () )
                    {
                        loadFile ( configuration, file );
                    }
                }
            }
        }
        catch ( final Exception e )
        {
            throw new RuntimeException ( e );
        }
    }

    private static void loadFile ( final Configuration configuration, final File file )
    {
        System.out.print ( " * Importing items from " + file );

        final ResourceSet rs = new ResourceSetImpl ();
        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "xmi", new XMIResourceFactoryImpl () );

        final URI uri1 = URI.createURI ( ModelFactory.eINSTANCE.getModelPackage ().getNsURI () );
        final URI uri2 = URI.createPlatformPluginURI ( "/org.openscada.deploy.iolist.model/model/model.ecore", true );
        rs.getURIConverter ().getURIMap ().put ( uri1, uri2 );

        final Resource resource = rs.getResource ( URI.createFileURI ( file.getAbsolutePath () ), true );

        final Model model = (Model)EcoreUtil.getObjectByType ( resource.getContents (), ModelPackage.Literals.MODEL );

        configuration.addItems ( model.getItems () );
        System.out.println ( String.format ( " ... found %s items", model.getItems ().size () ) );
    }

}
