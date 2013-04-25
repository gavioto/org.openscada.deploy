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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.util.SafeRunnable;

public class CreationContext
{

    public static interface OptionListener
    {
        public void optionChanged ( String key, Object value );
    }

    private final Map<String, Object> options = new HashMap<String, Object> ();

    private final Set<OptionListener> listeners = new HashSet<CreationContext.OptionListener> ();

    public Object getOption ( final String key )
    {
        return this.options.get ( key );
    }

    public void removeOption ( final String key )
    {
        final Object oldValue = this.options.remove ( key );
        if ( oldValue != null )
        {
            fireChange ( key, null );
        }
    }

    public void putOption ( final String key, final Object value )
    {
        if ( value == null )
        {
            removeOption ( key );
        }
        else
        {
            final Object oldValue = this.options.put ( key, value );
            if ( !value.equals ( oldValue ) )
            {
                fireChange ( key, value );
            }
        }
    }

    private void fireChange ( final String key, final Object value )
    {
        for ( final OptionListener listener : this.listeners )
        {
            SafeRunner.run ( new SafeRunnable () {

                @Override
                public void run () throws Exception
                {
                    listener.optionChanged ( key, value );
                }
            } );
        }
    }

    public void addListener ( final OptionListener listener )
    {
        this.listeners.add ( listener );
    }

    public void removeListener ( final OptionListener listener )
    {
        this.listeners.remove ( listener );
    }
}
