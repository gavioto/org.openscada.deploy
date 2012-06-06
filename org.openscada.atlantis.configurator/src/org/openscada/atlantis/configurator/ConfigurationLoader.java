package org.openscada.atlantis.configurator;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.Project;
import org.openscada.deploy.iolist.model.ModelFactory;

public class ConfigurationLoader
{

    public static Project load ( final File filename )
    {
        final ResourceSet rs = new ResourceSetImpl ();
        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "oscm", new XMIResourceFactoryImpl () );

        final URI uri1 = URI.createURI ( ModelFactory.eINSTANCE.getModelPackage ().getNsURI () );
        final URI uri2 = URI.createPlatformPluginURI ( "/org.openscada.configurator.model/model/configuration.ecore", true );
        rs.getURIConverter ().getURIMap ().put ( uri1, uri2 );

        final Resource resource = rs.getResource ( URI.createFileURI ( filename.getAbsolutePath () ), true );

        final Project project = (Project)EcoreUtil.getObjectByType ( resource.getContents (), ConfiguratorPackage.Literals.PROJECT );

        return project;
    }

}
