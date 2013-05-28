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

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.variables.IStringVariableManager;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.pde.launching.EclipseApplicationLaunchConfiguration;

public class ConfiguratorLauncherDelegate extends EclipseApplicationLaunchConfiguration
{
    @Override
    public String[] getProgramArguments ( final ILaunchConfiguration configuration ) throws CoreException
    {
        final List<String> args = new LinkedList<String> ( Arrays.asList ( super.getProgramArguments ( configuration ) ) );

        final IStringVariableManager svm = VariablesPlugin.getDefault ().getStringVariableManager ();

        final String files = configuration.getAttribute ( IConfiguratorLauncherConstants.OSCM_FILES, "" );
        for ( final String tok : files.split ( "[\\n\\r]+" ) )
        {
            args.add ( svm.performStringSubstitution ( tok, true ) );
        }

        return args.toArray ( new String[args.size ()] );
    }

}
