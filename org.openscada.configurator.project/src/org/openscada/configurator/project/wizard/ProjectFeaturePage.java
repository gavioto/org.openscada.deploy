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

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configuration.model.master.MasterFactory;

public class ProjectFeaturePage extends WizardPage implements ProjectInitializerPage
{

    private Button masterCheck;

    public ProjectFeaturePage ()
    {
        super ( ProjectFeaturePage.class.getName (), "Master Server Features", null );
    }

    @Override
    public void createControl ( final Composite parent )
    {
        final Composite wrapper = new Composite ( parent, SWT.NONE );
        wrapper.setLayout ( new GridLayout ( 1, false ) );

        this.masterCheck = new Button ( wrapper, SWT.CHECK );
        this.masterCheck.setText ( "Create configuration for master server" );

        initialSettings ();
    }

    private void initialSettings ()
    {
        this.masterCheck.setSelection ( true );
    }

    @Override
    public void applyTo ( final CreationContext context )
    {
        final AtlantisConfigurationSlot masterSlot = MasterFactory.eINSTANCE.createAtlantisConfigurationSlot ();
        masterSlot.setId ( "master" );

        context.getProject ().getSlots ().add ( masterSlot );
        context.addStoreSlot ( masterSlot );
    }

}
