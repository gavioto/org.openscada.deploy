package org.openscada.configurator.project.wizard.page;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ResourceChooser
{
    public static interface ModifyListener
    {
        public void resourcesChanged ( IPath path );
    }

    private final Text fileName;

    private final Button fileSelect;

    private final Label label;

    private final IContainer container;

    private final Set<ModifyListener> listeners = new HashSet<ResourceChooser.ModifyListener> ();

    private IPath path;

    public ResourceChooser ( final Composite parent, final IContainer container )
    {
        this.container = container;

        this.label = new Label ( parent, SWT.NONE );

        this.fileName = new Text ( parent, SWT.SINGLE | SWT.BORDER );
        this.fileName.setLayoutData ( new GridData ( SWT.FILL, SWT.CENTER, true, false ) );
        this.fileName.addModifyListener ( new org.eclipse.swt.events.ModifyListener () {

            @Override
            public void modifyText ( final ModifyEvent e )
            {
                update ();
            }
        } );

        this.fileSelect = new Button ( parent, SWT.PUSH );
        this.fileSelect.setText ( "…" );
        this.fileSelect.addSelectionListener ( new SelectionAdapter () {
            @Override
            public void widgetSelected ( final SelectionEvent e )
            {
                openSelectionDialog ();
            }
        } );
    }

    protected boolean isValid ( final IResource resource )
    {
        return true;
    }

    public void setText ( final String text )
    {
        this.label.setText ( text );
    }

    public void setPath ( final IPath path )
    {
        this.path = path;
        this.fileName.setText ( path.toString () );
    }

    protected void openSelectionDialog ()
    {

    }

    protected void update ()
    {
        this.path = new Path ( this.fileName.getText () );
        fireChange ( this.path );
    }

    public void addListener ( final ModifyListener listener )
    {
        this.listeners.add ( listener );
    }

    public void removeListener ( final ModifyListener listener )
    {
        this.listeners.remove ( listener );
    }

    private void fireChange ( final IPath path )
    {
        for ( final ModifyListener listener : this.listeners )
        {
            SafeRunner.run ( new SafeRunnable () {

                @Override
                public void run () throws Exception
                {
                    listener.resourcesChanged ( path );
                }
            } );
        }
    }

    public void setEnabled ( final boolean enabled )
    {
        this.fileName.setEnabled ( enabled );
        this.fileSelect.setEnabled ( enabled );
    }

    public IPath getPath ()
    {
        return this.path;
    }

}
