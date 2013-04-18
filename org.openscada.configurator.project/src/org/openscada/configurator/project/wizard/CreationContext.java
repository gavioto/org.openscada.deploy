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

import java.util.LinkedList;
import java.util.List;

import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.processor.common.CommonFactory;
import org.openscada.configurator.processor.common.StoreConfigurationSlotProcessor;

public class CreationContext
{
    private final Project project;

    private final List<ConfigurationSlot> storeSlots = new LinkedList<ConfigurationSlot> ();

    public CreationContext ( final Project project )
    {
        this.project = project;
    }

    public Project getProject ()
    {
        return this.project;
    }

    public void addStoreSlot ( final ConfigurationSlot slot )
    {
        this.storeSlots.add ( slot );
    }

    public void complete ()
    {
        if ( !this.storeSlots.isEmpty () )
        {
            final StoreConfigurationSlotProcessor store = CommonFactory.eINSTANCE.createStoreConfigurationSlotProcessor ();
            store.getSlots ().addAll ( this.storeSlots );
            this.project.getProcessors ().add ( store );
        }
    }
}
