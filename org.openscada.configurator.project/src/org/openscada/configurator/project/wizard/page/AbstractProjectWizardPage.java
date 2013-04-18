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
