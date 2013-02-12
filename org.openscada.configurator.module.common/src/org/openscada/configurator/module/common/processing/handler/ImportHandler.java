package org.openscada.configurator.module.common.processing.handler;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.handler.AbstractFileHandler;
import org.openscada.configurator.module.common.processing.ImportModule;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.utils.SummaryGroups;

public class ImportHandler extends AbstractFileHandler<ImportModule>
{

    @Override
    protected void loadFile ( final Configuration configuration, final ImportModule module, final File file )
    {
        System.out.print ( " * Importing items from " + file );

        final ResourceSet rs = new ResourceSetImpl ();
        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "xmi", new XMIResourceFactoryImpl () );
        rs.getResourceFactoryRegistry ().getExtensionToFactoryMap ().put ( "iolist", new XMIResourceFactoryImpl () );

        final URI uri1 = URI.createURI ( ModelFactory.eINSTANCE.getModelPackage ().getNsURI () );
        final URI uri2 = URI.createPlatformPluginURI ( "/org.openscada.deploy.iolist.model/model/model.ecore", true );
        rs.getURIConverter ().getURIMap ().put ( uri1, uri2 );

        final Resource resource = rs.getResource ( URI.createFileURI ( file.getAbsolutePath () ), true );

        final Model model = (Model)EcoreUtil.getObjectByType ( resource.getContents (), ModelPackage.Literals.MODEL );

        configuration.addItems ( model.getItems () );
        configuration.addAverages ( model.getAverages () );
        configuration.addMovingAverages ( model.getMovingAverages () );
        configuration.setRootSummaryGroup ( SummaryGroups.mergeRoots ( configuration.getRootSummaryGroup (), model.getRootSummary () ) );
        configuration.getPlainSummaryGroups ().addAll ( model.getPlainSummary () );

        // FIXME: need a merge

        System.out.println ( String.format ( " ... found %s items", model.getItems ().size () ) );
    }
}
