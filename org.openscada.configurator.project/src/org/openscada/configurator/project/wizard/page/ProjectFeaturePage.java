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

package org.openscada.configurator.project.wizard.page;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configuration.model.master.MasterFactory;
import org.openscada.configuration.model.master.ModuleProcessor;
import org.openscada.configurator.module.common.main.MainFactory;
import org.openscada.configurator.module.common.main.MainLoader;
import org.openscada.configurator.module.common.output.OutputFactory;
import org.openscada.configurator.module.common.output.OutputSummaries;
import org.openscada.configurator.module.common.processing.ImportListModule;
import org.openscada.configurator.module.common.processing.ProcessingFactory;
import org.openscada.configurator.module.common.summary.CleanupSummaries;
import org.openscada.configurator.module.common.summary.SummaryFactory;
import org.openscada.configurator.project.Activator;
import org.openscada.configurator.project.wizard.CreationContext;
import org.openscada.configurator.project.wizard.CreationResult;
import org.openscada.configurator.project.wizard.processor.StoreSlotsProcessor;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.utils.ItemListWriter;

import com.google.common.io.ByteStreams;

public class ProjectFeaturePage extends AbstractProjectWizardPage
{

    public static final String OPTION_MASTER = "master";

    private Button masterCheck;

    private final SelectionListener updateListener = new SelectionAdapter () {
        @Override
        public void widgetSelected ( final SelectionEvent e )
        {
            update ();
        }
    };

    private Text prefixText;

    private Button itemsCheck;

    public ProjectFeaturePage ( final CreationContext context )
    {
        super ( ProjectFeaturePage.class.getName (), "Master Server Features", null, context );
    }

    @Override
    public void createControl ( final Composite parent )
    {
        final Composite wrapper = new Composite ( parent, SWT.NONE );
        wrapper.setLayout ( new GridLayout ( 3, false ) );

        // master

        this.masterCheck = new Button ( wrapper, SWT.CHECK );
        this.masterCheck.setText ( "Create configuration for master server" );
        this.masterCheck.addSelectionListener ( this.updateListener );
        this.masterCheck.setLayoutData ( new GridData ( SWT.BEGINNING, SWT.CENTER, false, false, 3, 1 ) );

        // prefix

        final Label label = new Label ( wrapper, SWT.NONE );
        label.setText ( "Prefix:" );

        this.prefixText = new Text ( wrapper, SWT.BORDER | SWT.SINGLE );
        this.prefixText.setLayoutData ( new GridData ( SWT.FILL, SWT.CENTER, false, false, 2, 1 ) );
        this.prefixText.setText ( "PREFIX" );

        // add sample items

        this.itemsCheck = new Button ( wrapper, SWT.CHECK );
        this.itemsCheck.setText ( "Create some sample data items" );
        this.itemsCheck.setLayoutData ( new GridData ( SWT.BEGINNING, SWT.CENTER, false, false, 3, 1 ) );

        setControl ( wrapper );

        initialSettings ();
    }

    @Override
    public void setVisible ( final boolean visible )
    {
        super.setVisible ( visible );
        if ( visible )
        {
            update ();
        }
    }

    private IFile getFile ( final String name )
    {
        final IFile file = (IFile)this.context.getOption ( "projectFile" );
        if ( file == null )
        {
            return null;
        }

        return file.getParent ().getFile ( new Path ( name ) );
    }

    private IFolder getFolder ( final String name )
    {
        final IFile file = (IFile)this.context.getOption ( "projectFile" );
        if ( file == null )
        {
            return null;
        }

        return file.getParent ().getFolder ( new Path ( name ) );
    }

    protected void update ()
    {
        final boolean active = this.masterCheck.getSelection ();
        flag ( active, OPTION_MASTER );

        this.prefixText.setEnabled ( active );
    }

    private void initialSettings ()
    {
        this.masterCheck.setSelection ( true );
        update ();
    }

    @Override
    public void applyTo ( final CreationResult result ) throws Exception
    {
        if ( !this.masterCheck.getSelection () )
        {
            return;
        }

        final Project project = result.getObject ( "project", Project.class );

        // master slot

        final AtlantisConfigurationSlot masterSlot = MasterFactory.eINSTANCE.createAtlantisConfigurationSlot ();
        masterSlot.setId ( "master" );

        project.getSlots ().add ( masterSlot );

        StoreSlotsProcessor p1 = result.getProcessor ( StoreSlotsProcessor.class );
        if ( p1 == null )
        {
            p1 = new StoreSlotsProcessor ();
            result.addProcessor ( p1 );
        }

        p1.getSlots ().add ( masterSlot );

        final String prefix = this.prefixText.getText ();

        // common module processor

        final ModuleProcessor moduleProcessor = MasterFactory.eINSTANCE.createModuleProcessor ();
        moduleProcessor.setSlot ( masterSlot );
        project.getProcessors ().add ( moduleProcessor );

        moduleProcessor.getModules ().add ( createMainLoader ( result ) );

        moduleProcessor.getModules ().add ( createImportList ( result ) );

        moduleProcessor.getModules ().add ( ProcessingFactory.eINSTANCE.createRemoveInactive () );
        moduleProcessor.getModules ().add ( SummaryFactory.eINSTANCE.createGenerateSummaries () );
        moduleProcessor.getModules ().add ( OutputFactory.eINSTANCE.createOutputAverages () );
        moduleProcessor.getModules ().add ( createCleanupSummaries () );
        moduleProcessor.getModules ().add ( createSummaries ( prefix ) );
        moduleProcessor.getModules ().add ( OutputFactory.eINSTANCE.createOutputItems () );
        moduleProcessor.getModules ().add ( OutputFactory.eINSTANCE.createOutputGlobalSummaries () );
        moduleProcessor.getModules ().add ( MainFactory.eINSTANCE.createValidateConfiguration () );
    }

    private URI toPlatformURI ( final IResource resource )
    {
        final IFile projectFile = (IFile)this.context.getOption ( "projectFile" );

        final IPath path = resource.getLocation ().makeRelativeTo ( projectFile.getWorkspace ().getRoot ().getLocation () );

        return URI.createPlatformResourceURI ( path.toPortableString (), true );
    }

    private ImportListModule createImportList ( final CreationResult creationResult ) throws Exception
    {
        final ImportListModule result = ProcessingFactory.eINSTANCE.createImportListModule ();

        final IFolder folder = getFolder ( "input/iolists" );

        result.getPath ().add ( toPlatformURI ( folder ).toString () );

        final Item item1 = createTestItem ( 1 );
        final Item item2 = createTestItem ( 2 );

        final Model model = ModelFactory.eINSTANCE.createModel ();
        model.getItems ().add ( item1 );
        model.getItems ().add ( item2 );

        final ItemListWriter writer = new ItemListWriter ();
        writer.addAll ( model.getItems () );

        final ByteArrayOutputStream bos = new ByteArrayOutputStream ();
        writer.write ( bos );

        creationResult.getBlobs ().put ( folder.getFile ( "list1.ods" ), bos.toByteArray () );

        return result;
    }

    private Item createTestItem ( final int index )
    {
        final Item item = ModelFactory.eINSTANCE.createItem ();

        item.setAlias ( String.format ( "%s.ITEM%s.V", this.prefixText.getText (), index ) );
        item.setEnabled ( true );
        item.setBlock ( true );
        item.setLocalManual ( true );
        item.setEventCommand ( true );
        item.setLocalScaleAvailable ( true );
        item.setName ( "sourceName" );
        item.setDevice ( "connectioName" );
        item.setDataType ( DataType.VARIANT );

        return item;
    }

    private MainLoader createMainLoader ( final CreationResult creationResult ) throws IOException
    {
        final MainLoader result = MainFactory.eINSTANCE.createMainLoader ();

        final IFile file = getFile ( "input/main.ods" );

        if ( !file.exists () )
        {
            final InputStream stream = FileLocator.openStream ( Activator.getDefault ().getBundle (), new Path ( "resources/main.ods" ), false );
            try
            {
                creationResult.getBlobs ().put ( file, ByteStreams.toByteArray ( stream ) );
            }
            finally
            {
                stream.close ();
            }
        }

        result.setFile ( toPlatformURI ( file ).toString () );

        return result;
    }

    private CleanupSummaries createCleanupSummaries ()
    {
        final CleanupSummaries result = SummaryFactory.eINSTANCE.createCleanupSummaries ();
        result.setRequiredItems ( 2 );
        return result;
    }

    private OutputSummaries createSummaries ( final String prefix )
    {
        final OutputSummaries result = OutputFactory.eINSTANCE.createOutputSummaries ();
        result.setPrefix ( prefix );
        result.setSuffix ( ".SUM.V" );
        return result;
    }
}
