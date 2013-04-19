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

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.openscada.configurator.project.wizard.CreationContext;
import org.openscada.configurator.project.wizard.ProjectInitializerPage;

public abstract class AbstractProjectWizardPage extends WizardPage implements ProjectInitializerPage
{

    protected final CreationContext context;

    public AbstractProjectWizardPage ( final String pageName, final String title, final ImageDescriptor titleImage, final CreationContext context )
    {
        super ( pageName, title, titleImage );
        this.context = context;
    }

    public AbstractProjectWizardPage ( final String pageName, final CreationContext context )
    {
        super ( pageName );
        this.context = context;
    }

    protected void flag ( final boolean flag, final String optionKey )
    {
        if ( flag )
        {
            this.context.putOption ( optionKey, Boolean.TRUE );
        }
        else
        {
            this.context.removeOption ( optionKey );
        }
    }

    protected boolean isFlagged ( final String optionKey )
    {
        final Object option = this.context.getOption ( optionKey );
        if ( option == null )
        {
            return false;
        }
        if ( Boolean.FALSE.equals ( option ) )
        {
            return false;
        }
        return true;
    }
}
