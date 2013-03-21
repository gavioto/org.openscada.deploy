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

import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.pde.launching.IPDELauncherConstants;
import org.eclipse.pde.ui.launcher.ConfigurationTab;
import org.eclipse.pde.ui.launcher.EclipseLauncherTabGroup;
import org.eclipse.pde.ui.launcher.MainTab;
import org.eclipse.pde.ui.launcher.PluginsTab;
import org.eclipse.pde.ui.launcher.TracingTab;
import org.openscada.atlantis.configurator.Application;

public class LaunchConfigurationTabGroup extends EclipseLauncherTabGroup
{

    public LaunchConfigurationTabGroup ()
    {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.debug.ui.ILaunchConfigurationTabGroup#createTabs(org.eclipse.debug.ui.ILaunchConfigurationDialog, java.lang.String)
     */
    @Override
    public void createTabs ( final ILaunchConfigurationDialog dialog, final String mode )
    {
        ILaunchConfigurationTab[] tabs = null;
        tabs = new ILaunchConfigurationTab[] { new MainTab (), new ConfigurationFilesTab (), new JavaArgumentsTab (), new PluginsTab (), new ConfigurationTab (), new TracingTab (), new EnvironmentTab (), new CommonTab () };
        setTabs ( tabs );
    }

    @Override
    public void setDefaults ( final ILaunchConfigurationWorkingCopy configuration )
    {
        super.setDefaults ( configuration );

        configuration.setAttribute ( IPDELauncherConstants.USE_PRODUCT, false );
        configuration.setAttribute ( IPDELauncherConstants.APPLICATION, Application.APPLICATION_ID );
        configuration.setAttribute ( IPDELauncherConstants.AUTOMATIC_VALIDATE, true );
        configuration.setAttribute ( IPDELauncherConstants.CONFIG_CLEAR_AREA, true );

        final IExecutionEnvironment ee = JavaRuntime.getExecutionEnvironmentsManager ().getEnvironment ( "JavaSE-1.7" );
        final String jreAttr = JavaRuntime.newJREContainerPath ( ee ).toPortableString ();
        configuration.setAttribute ( IJavaLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, jreAttr );

        configuration.setAttribute ( IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, "-Dsummary.requiredSize=2 -DskipReport=true" );
    }
}
