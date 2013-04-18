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

import java.text.MessageFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * This is the one page of the wizard.
 */
public class ConfiguratorModelWizardNewFileCreationPage extends WizardNewFileCreationPage
{
    /**
     * Pass in the selection.
     */
    public ConfiguratorModelWizardNewFileCreationPage ( final String pageId, final IStructuredSelection selection )
    {
        super ( pageId, selection );
    }

    /**
     * The framework calls this to see if the file is correct.
     */
    @Override
    protected boolean validatePage ()
    {
        if ( super.validatePage () )
        {
            final String extension = new Path ( getFileName () ).getFileExtension ();
            if ( extension == null || !ConfiguratorModelWizard.FILE_EXTENSIONS.contains ( extension ) )
            {
                final String message = ConfiguratorModelWizard.FILE_EXTENSIONS.size () > 1 ? "The file name must have one of the following extensions: {0}" : "The file name must end in ''.{0}''";
                setErrorMessage ( MessageFormat.format ( message, new Object[] { ConfiguratorModelWizard.FORMATTED_FILE_EXTENSIONS } ) );
                return false;
            }
            return true;
        }
        return false;
    }

    public IFile getModelFile ()
    {
        return ResourcesPlugin.getWorkspace ().getRoot ().getFile ( getContainerFullPath ().append ( getFileName () ) );
    }
}