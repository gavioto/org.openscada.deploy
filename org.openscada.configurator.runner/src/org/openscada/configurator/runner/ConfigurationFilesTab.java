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

package org.openscada.configurator.runner;

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.debug.ui.StringVariableSelectionDialog;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.navigator.ResourceComparator;

public class ConfigurationFilesTab extends AbstractLaunchConfigurationTab
{
    private final String WORKSPACE_SELECTION_DIALOG = Activator.PLUGIN_ID + ".WORKSPACE_SELECTION_DIALOG"; //$NON-NLS-1$

    private final String VARIABLE_SELECTION_DIALOG = Activator.PLUGIN_ID + ".VARIABLE_SELECTION_DIALOG"; //$NON-NLS-1$

    private Text text;

    @Override
    public void createControl ( final Composite parent )
    {
        parent.setLayout ( new FillLayout () );

        final Composite wrapper = new Composite ( parent, SWT.NONE );
        wrapper.setLayout ( new GridLayout ( 1, false ) );
        setControl ( wrapper );

        final Composite buttons = new Composite ( wrapper, SWT.NONE );
        buttons.setLayout ( new RowLayout ( SWT.HORIZONTAL ) );
        buttons.setLayoutData ( new GridData ( SWT.BEGINNING, SWT.BEGINNING, true, false ) );

        this.text = new Text ( wrapper, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER );
        this.text.setLayoutData ( new GridData ( SWT.FILL, SWT.FILL, true, true ) );

        final Button fileButton = new Button ( buttons, SWT.PUSH );
        fileButton.setText ( "File…" );
        fileButton.addSelectionListener ( new SelectionAdapter () {
            @Override
            public void widgetSelected ( final SelectionEvent e )
            {
                chooseFile ();
            }
        } );

        final Button workspaceButton = new Button ( buttons, SWT.PUSH );
        workspaceButton.setText ( "Workspace…" );
        workspaceButton.addSelectionListener ( new SelectionAdapter () {
            @Override
            public void widgetSelected ( final SelectionEvent e )
            {
                chooseWorkspace ();
            }
        } );

        final Button variableButton = new Button ( buttons, SWT.PUSH );
        variableButton.setText ( "Variable…" );
        variableButton.addSelectionListener ( new SelectionAdapter () {
            @Override
            public void widgetSelected ( final SelectionEvent e )
            {
                chooseVariable ();
            }
        } );
    }

    protected void chooseVariable ()
    {
        final StringVariableSelectionDialog dlg = new StringVariableSelectionDialog ( getShell () );
        dlg.setDialogBoundsSettings ( getDialogBoundsSettings ( this.VARIABLE_SELECTION_DIALOG ), Dialog.DIALOG_PERSISTSIZE );
        if ( dlg.open () == Window.OK )
        {
            this.text.insert ( dlg.getVariableExpression () );
            makeDirty ();
        }
    }

    protected void chooseFile ()
    {
        final FileDialog dlg = new FileDialog ( getShell (), SWT.OPEN | SWT.MULTI );
        dlg.setFilterExtensions ( new String[] { "*.oscm", "*.*" } );
        dlg.setFilterNames ( new String[] { "openSCADA Configuration Files", "All files" } );
        final String result = dlg.open ();
        if ( result != null )
        {
            final File base = new File ( dlg.getFilterPath () );

            for ( final String name : dlg.getFileNames () )
            {
                this.text.insert ( new File ( base, name ).getAbsolutePath () + System.getProperty ( "line.separator" ) );
            }
            makeDirty ();
        }
    }

    private IDialogSettings getDialogBoundsSettings ( final String id )
    {
        final IDialogSettings settings = Activator.getDefault ().getDialogSettings ();
        IDialogSettings section = settings.getSection ( id );
        if ( section == null )
        {
            section = settings.addNewSection ( id );
        }
        return section;
    }

    protected void chooseWorkspace ()
    {
        final ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog ( getShell (), new WorkbenchLabelProvider (), new WorkbenchContentProvider () );
        dialog.setTitle ( "Add OSCM file" );
        dialog.setMessage ( "Choose an OSCM file to add to the configuration" );
        dialog.setInput ( ResourcesPlugin.getWorkspace ().getRoot () );
        dialog.setComparator ( new ResourceComparator ( ResourceComparator.NAME ) );
        dialog.setAllowMultiple ( true );
        dialog.setDialogBoundsSettings ( getDialogBoundsSettings ( this.WORKSPACE_SELECTION_DIALOG ), Dialog.DIALOG_PERSISTSIZE );
        if ( dialog.open () == IDialogConstants.OK_ID )
        {
            final IResource resource = (IResource)dialog.getFirstResult ();
            if ( resource != null )
            {
                final String arg = resource.getFullPath ().toString ();
                final String fileLoc = VariablesPlugin.getDefault ().getStringVariableManager ().generateVariableExpression ( "workspace_loc", arg ); //$NON-NLS-1$
                this.text.insert ( fileLoc );
                makeDirty ();
            }
        }
    }

    protected void makeDirty ()
    {
        setDirty ( true );
        updateLaunchConfigurationDialog ();
    }

    @Override
    public void setDefaults ( final ILaunchConfigurationWorkingCopy configuration )
    {
        configuration.setAttribute ( IConfiguratorLauncherConstants.OSCM_FILES, "" );
    }

    @Override
    public void initializeFrom ( final ILaunchConfiguration configuration )
    {
        try
        {
            this.text.setText ( configuration.getAttribute ( IConfiguratorLauncherConstants.OSCM_FILES, "" ) );
        }
        catch ( final CoreException e )
        {
            setErrorMessage ( e.getLocalizedMessage () );
        }

        setDirty ( false );
        updateLaunchConfigurationDialog ();
    }

    @Override
    public void performApply ( final ILaunchConfigurationWorkingCopy configuration )
    {
        configuration.setAttribute ( IConfiguratorLauncherConstants.OSCM_FILES, this.text.getText () );
    }

    @Override
    public String getName ()
    {
        return "OSCM Files";
    }

}
