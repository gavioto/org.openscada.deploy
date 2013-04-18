/*
 * This file is part of the openSCADA project
 * 
 * Copyright (C) 2013 Jens Reimann (ctron@dentrassi.de)
 * 
 * openSCADA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * only, as published by the Free Software Foundation.
 * 
 * openSCADA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License version 3 for more details
 * (a copy is included in the LICENSE file that accompanied this code).
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with openSCADA. If not, see
 * <http://opensource.org/licenses/lgpl-3.0.html> for a copy of the LGPLv3 License.
 * 
 */

package org.openscada.configurator.project.wizard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.openscada.configuration.model.ConfiguratorFactory;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configurator.project.Activator;
import org.openscada.configurator.project.wizard.page.IOptionalPage;
import org.openscada.configurator.project.wizard.page.NewProjectModelFilePageWizard;
import org.openscada.configurator.project.wizard.page.ProjectFeaturePage;
import org.openscada.configurator.project.wizard.page.SecurityWizardPage;
import org.openscada.ui.utils.status.StatusHelper;

public class NewConfiguratorModelWizard extends Wizard implements INewWizard
{
    /**
     * The supported extensions for created files.
     */
    public static final List<String> FILE_EXTENSIONS = Arrays.asList ( "oscm" );

    /**
     * A formatted list of supported file extensions, suitable for display.
     */
    public static final String FORMATTED_FILE_EXTENSIONS = "oscm";

    /**
     * This caches an instance of the model package.
     */
    protected ConfiguratorPackage configuratorPackage = ConfiguratorPackage.eINSTANCE;

    /**
     * This caches an instance of the model factory.
     */
    protected ConfiguratorFactory configuratorFactory = this.configuratorPackage.getConfiguratorFactory ();

    /**
     * This is the file creation page.
     */
    protected NewProjectModelFilePageWizard newFileCreationPage;

    /**
     * Remember the selection during initialization for populating the default
     * container.
     */
    protected IStructuredSelection selection;

    /**
     * Remember the workbench during initialization.
     */
    protected IWorkbench workbench;

    /**
     * A list of project initializers
     */
    protected List<ProjectInitializerPage> initializers = new LinkedList<ProjectInitializerPage> ();

    private CreationContext context;

    /**
     * This just records the information.
     */
    @Override
    public void init ( final IWorkbench workbench, final IStructuredSelection selection )
    {
        this.workbench = workbench;
        this.selection = selection;
        setWindowTitle ( "Create new configuration model" );
        setDefaultPageImageDescriptor ( ImageDescriptor.createFromFile ( NewConfiguratorModelWizard.class, "icons/NewConfigurator.gif" ) );

        this.context = new CreationContext ();

    }

    protected CreationResult createResult () throws Exception
    {
        final CreationResult result = new CreationResult ();

        for ( final ProjectInitializerPage init : this.initializers )
        {
            init.applyTo ( result );
        }

        return result;
    }

    /**
     * Do the work after everything is specified.
     */
    @Override
    public boolean performFinish ()
    {
        try
        {
            // Remember the file.
            //
            final IFile modelFile = getModelFile ();

            // Do the work within an operation.
            //
            final WorkspaceModifyOperation operation = new WorkspaceModifyOperation () {
                @Override
                protected void execute ( final IProgressMonitor progressMonitor )
                {
                    try
                    {
                        final CreationResult result = createResult ();
                        result.create ();
                    }
                    catch ( final Exception exception )
                    {
                        log ( exception );
                    }
                    finally
                    {
                        progressMonitor.done ();
                    }
                }
            };

            getContainer ().run ( false, false, operation );

            // Select the new file resource in the current view.
            //
            final IWorkbenchWindow workbenchWindow = this.workbench.getActiveWorkbenchWindow ();
            final IWorkbenchPage page = workbenchWindow.getActivePage ();
            final IWorkbenchPart activePart = page.getActivePart ();
            if ( activePart instanceof ISetSelectionTarget )
            {
                final ISelection targetSelection = new StructuredSelection ( modelFile );
                getShell ().getDisplay ().asyncExec ( new Runnable () {
                    @Override
                    public void run ()
                    {
                        ( (ISetSelectionTarget)activePart ).selectReveal ( targetSelection );
                    }
                } );
            }

            // Open an editor on the new file.
            //
            try
            {
                page.openEditor ( new FileEditorInput ( modelFile ), this.workbench.getEditorRegistry ().getDefaultEditor ( modelFile.getFullPath ().toString () ).getId () );
            }
            catch ( final PartInitException exception )
            {
                MessageDialog.openError ( workbenchWindow.getShell (), "Open Editor", exception.getMessage () );
                return false;
            }

            return true;
        }
        catch ( final Exception exception )
        {
            log ( exception );
            return false;
        }
    }

    /**
     * The framework calls this to create the contents of the wizard.
     */
    @Override
    public void addPages ()
    {
        // Create a page, set the title, and the initial model file name.
        //
        this.newFileCreationPage = new NewProjectModelFilePageWizard ( "NewFile", this.selection, this.context );
        this.newFileCreationPage.setTitle ( "Configurator Model" );
        this.newFileCreationPage.setDescription ( " Create a new Configurator model" );
        this.newFileCreationPage.setFileName ( "project." + FILE_EXTENSIONS.get ( 0 ) );
        addPage ( this.newFileCreationPage );

        // Try and get the resource selection to determine a current directory for the file dialog.
        //
        if ( this.selection != null && !this.selection.isEmpty () )
        {
            // Get the resource...
            //
            final Object selectedElement = this.selection.iterator ().next ();
            if ( selectedElement instanceof IResource )
            {
                // Get the resource parent, if its a file.
                //
                IResource selectedResource = (IResource)selectedElement;
                if ( selectedResource.getType () == IResource.FILE )
                {
                    selectedResource = selectedResource.getParent ();
                }

                // This gives us a directory...
                //
                if ( selectedResource instanceof IFolder || selectedResource instanceof IProject )
                {
                    // Set this for the container.
                    //
                    this.newFileCreationPage.setContainerFullPath ( selectedResource.getFullPath () );

                    // Make up a unique new name here.
                    //
                    final String defaultModelBaseFilename = "project";
                    final String defaultModelFilenameExtension = FILE_EXTENSIONS.get ( 0 );
                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
                    for ( int i = 1; ( (IContainer)selectedResource ).findMember ( modelFilename ) != null; ++i )
                    {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    }
                    this.newFileCreationPage.setFileName ( modelFilename );
                }
            }
        }

        addPage ( new ProjectFeaturePage ( this.context ) );
        addPage ( new SecurityWizardPage ( this.context ) );
    }

    @Override
    public void addPage ( final IWizardPage page )
    {
        if ( page instanceof ProjectInitializerPage )
        {
            this.initializers.add ( (ProjectInitializerPage)page );
        }
        super.addPage ( page );
    }

    @Override
    public IWizardPage getPreviousPage ( final IWizardPage page )
    {
        final List<IWizardPage> pages = Arrays.asList ( getPages () );

        int index = pages.indexOf ( page );

        while ( index - 1 >= 0 )
        {
            index--;
            final IWizardPage otherPage = pages.get ( index );
            if ( otherPage instanceof IOptionalPage )
            {
                if ( ( (IOptionalPage)otherPage ).isActive () )
                {
                    return otherPage;
                }
            }
            else
            {
                return otherPage;
            }
        }

        return null;
    }

    @Override
    public IWizardPage getNextPage ( final IWizardPage page )
    {
        final List<IWizardPage> pages = Arrays.asList ( getPages () );

        int index = pages.indexOf ( page );

        while ( index + 1 < pages.size () )
        {
            index++;
            final IWizardPage otherPage = pages.get ( index );
            if ( otherPage instanceof IOptionalPage )
            {
                if ( ( (IOptionalPage)otherPage ).isActive () )
                {
                    return otherPage;
                }
            }
            else
            {
                return otherPage;
            }
        }

        return null;
    }

    @Override
    public boolean canFinish ()
    {
        for ( final IWizardPage page : getPages () )
        {
            if ( page instanceof IOptionalPage )
            {
                if ( ! ( (IOptionalPage)page ).isActive () )
                {
                    continue;
                }
            }

            if ( !page.isPageComplete () )
            {
                return false;
            }

        }
        return true;
    }

    /**
     * Get the file from the page.
     */
    public IFile getModelFile ()
    {
        return this.newFileCreationPage.getModelFile ();
    }

    private void log ( final Exception exception )
    {
        Activator.getDefault ().getLog ().log ( StatusHelper.convertStatus ( Activator.PLUGIN_ID, exception ) );
    }

}
