package org.openscada.configurator.project.wizard;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.openscada.ui.databinding.AdapterHelper;

public class CreationResult
{
    private final Map<String, EObject> objectMap = new HashMap<String, EObject> ();

    private final Map<IFile, EObject> resourceMap = new HashMap<IFile, EObject> ();

    private final List<Processor> processors = new ArrayList<CreationResult.Processor> ();

    private final ResourceSetImpl resourceSet;

    private final Map<IFile, byte[]> blobs = new HashMap<IFile, byte[]> ();

    public static interface Processor extends Comparable<Processor>
    {
        public void process ( CreationResult result );

        public int getPriority ();
    }

    public CreationResult ()
    {
        // Create a resource set
        //
        this.resourceSet = new ResourceSetImpl ();
    }

    public Map<IFile, byte[]> getBlobs ()
    {
        return this.blobs;
    }

    public ResourceSetImpl getResourceSet ()
    {
        return this.resourceSet;
    }

    public boolean hasProcessor ( final Class<? extends Processor> clazz )
    {
        return getProcessor ( clazz ) != null;
    }

    public <T extends Processor> T getProcessor ( final Class<T> clazz )
    {
        for ( final Processor p : this.processors )
        {
            if ( clazz.isAssignableFrom ( p.getClass () ) )
            {
                return clazz.cast ( p );
            }
        }
        return null;
    }

    public void addProcessor ( final Processor processor )
    {
        this.processors.add ( processor );
    }

    public void registerResource ( final String id, final IFile file, final EObject object )
    {
        this.resourceMap.put ( file, object );
        this.objectMap.put ( id, object );
    }

    public Map<String, EObject> getObjectMap ()
    {
        return this.objectMap;
    }

    public EObject getObject ( final String id )
    {
        return this.objectMap.get ( id );
    }

    public <T> T getObject ( final String id, final Class<T> clazz )
    {
        return AdapterHelper.adapt ( getObject ( id ), clazz );
    }

    public Map<IFile, EObject> getResourceMap ()
    {
        return this.resourceMap;
    }

    public void create () throws Exception
    {
        Collections.sort ( this.processors );

        for ( final Processor processor : this.processors )
        {
            processor.process ( this );
        }

        for ( final Map.Entry<IFile, EObject> entry : this.resourceMap.entrySet () )
        {
            // Get the URI of the model file.
            //
            final URI fileURI = URI.createPlatformResourceURI ( entry.getKey ().getFullPath ().toString (), true );

            // Create a resource for this file.
            //
            final Resource resource = this.resourceSet.createResource ( fileURI );

            resource.getContents ().add ( entry.getValue () );
        }

        for ( final Resource resource : this.resourceSet.getResources () )
        {
            // Save the contents of the resource to the file system.
            //
            final Map<Object, Object> options = new HashMap<Object, Object> ();
            options.put ( XMLResource.OPTION_ENCODING, "UTF-8" );
            resource.save ( options );
        }

        for ( final Map.Entry<IFile, byte[]> entry : this.blobs.entrySet () )
        {
            final IFile file = entry.getKey ();

            createParents ( file.getParent () );

            if ( entry.getKey ().exists () )
            {
                entry.getKey ().setContents ( new ByteArrayInputStream ( entry.getValue () ), IResource.KEEP_HISTORY, null );
            }
            else
            {
                entry.getKey ().create ( new ByteArrayInputStream ( entry.getValue () ), IResource.KEEP_HISTORY, null );
            }
        }
    }

    private void createParents ( final IContainer container ) throws CoreException
    {
        if ( ! ( container.getParent () instanceof IProject ) )
        {
            createParents ( container.getParent () );
        }

        if ( container instanceof IFolder )
        {
            if ( !container.exists () )
            {
                ( (IFolder)container ).create ( false, true, null );
            }
        }
    }
}
