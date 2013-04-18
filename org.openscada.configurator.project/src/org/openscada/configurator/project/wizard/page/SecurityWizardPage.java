package org.openscada.configurator.project.wizard.page;

import java.util.Collection;
import java.util.LinkedList;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.GenericMasterConfigurationSlot;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.processor.common.main.SecurityLoader;
import org.openscada.configurator.project.wizard.CreationContext;
import org.openscada.configurator.project.wizard.CreationContext.OptionListener;
import org.openscada.configurator.project.wizard.CreationResult;
import org.openscada.configurator.project.wizard.processor.AbstractProcessor;
import org.openscada.configurator.sec.Configuration;
import org.openscada.configurator.sec.GenericScript;
import org.openscada.configurator.sec.LogonRule;
import org.openscada.configurator.sec.ScriptRule;
import org.openscada.configurator.sec.SecurityFactory;

public class SecurityWizardPage extends AbstractProjectWizardPage implements OptionListener
{

    private static final String OPTION_SECURITY = "security";

    private Button addSecurityCheck;

    private static boolean DEFAULT_ACTIVE = true;

    private boolean masterActive = DEFAULT_ACTIVE;

    public SecurityWizardPage ( final CreationContext context )
    {
        super ( SecurityWizardPage.class.getName (), "Security Configuration", null, context );
    }

    @Override
    public void createControl ( final Composite parent )
    {
        final Composite wrapper = new Composite ( parent, SWT.NONE );

        wrapper.setLayout ( new GridLayout ( 3, false ) );

        this.addSecurityCheck = new Button ( wrapper, SWT.CHECK );
        this.addSecurityCheck.setText ( "Add some basic security rules" );
        this.addSecurityCheck.addSelectionListener ( new SelectionAdapter () {
            @Override
            public void widgetSelected ( final org.eclipse.swt.events.SelectionEvent e )
            {
                update ();
            };
        } );
        this.addSecurityCheck.setLayoutData ( new GridData ( SWT.FILL, SWT.BEGINNING, false, false, 3, 1 ) );

        setControl ( wrapper );

        this.addSecurityCheck.setSelection ( DEFAULT_ACTIVE );

        this.context.addListener ( this );
    }

    @Override
    public void setVisible ( final boolean visible )
    {
        super.setVisible ( visible );

        if ( visible && !this.masterActive )
        {
            setMessage ( "Disabled since master configuration is not enabled", INFORMATION );
        }

        if ( visible )
        {
            update ();
        }

    }

    private void update ()
    {
        this.masterActive = isFlagged ( ProjectFeaturePage.OPTION_MASTER );

        this.addSecurityCheck.setEnabled ( this.masterActive );
        flag ( this.addSecurityCheck.getSelection (), OPTION_SECURITY );
    }

    @Override
    public void applyTo ( final CreationResult result )
    {
        if ( !this.masterActive || !this.addSecurityCheck.getSelection () )
        {
            return;
        }

        result.addProcessor ( new AbstractProcessor ( 100 ) {

            @Override
            public void process ( final CreationResult result )
            {
                processResult ( result );
            }
        } );
    }

    private IFile getFile ()
    {
        final IFile file = (IFile)this.context.getOption ( "projectFile" );
        return file.getParent ().getFile ( new Path ( "input/rules.security" ) );
    }

    protected Configuration getConfiguration ( final ResourceSet resourceSet )
    {
        final IFile file = getFile ();

        final Resource resource = resourceSet.createResource ( URI.createFileURI ( file.getFullPath ().toString () ) );

        final EObject root = resource.getContents ().get ( 0 );

        if ( root instanceof Configuration )
        {
            return (Configuration)root;
        }

        throw new IllegalStateException ( String.format ( "Referenced file does not contain a valid security configuration: %s", root.getClass ().getName () ) );
    }

    protected void processResult ( final CreationResult result )
    {
        final Project project = result.getObject ( "project", Project.class );

        final Collection<GenericMasterConfigurationSlot> slots = new LinkedList<GenericMasterConfigurationSlot> ();

        for ( final ConfigurationSlot slot : project.getSlots () )
        {
            if ( slot instanceof GenericMasterConfigurationSlot )
            {
                slots.add ( (GenericMasterConfigurationSlot)slot );
            }
        }
        final SecurityLoader securityLoader = org.openscada.configurator.processor.common.main.MainFactory.eINSTANCE.createSecurityLoader ();

        final IFile file = getFile ();

        final Configuration secCfg;
        if ( file.exists () )
        {
            secCfg = getConfiguration ( result.getResourceSet () );
        }
        else
        {
            secCfg = createConfiguration ();
            result.registerResource ( "security", file, secCfg );
        }

        securityLoader.setRules ( secCfg );
        securityLoader.getSlot ().addAll ( slots );

        project.getProcessors ().add ( securityLoader );
    }

    private Configuration createConfiguration ()
    {
        final Configuration cfg = SecurityFactory.eINSTANCE.createConfiguration ();
        cfg.setName ( "Generated basic rules" );

        final GenericScript trueScript = SecurityFactory.eINSTANCE.createGenericScript ();
        trueScript.setSource ( "true;" );
        trueScript.setType ( "JavaScript" );

        cfg.getScripts ().add ( trueScript );

        final LogonRule logon = SecurityFactory.eINSTANCE.createLogonRule ();
        logon.setId ( "logon" );
        logon.setActionFilter ( Pattern.compile ( "CONNECT" ) );
        logon.setTypeFilter ( Pattern.compile ( "SESSION" ) );
        cfg.getRules ().add ( logon );

        final ScriptRule allowAll = SecurityFactory.eINSTANCE.createScriptRule ();
        allowAll.setId ( "allowAll" );
        allowAll.setScript ( trueScript );
        cfg.getRules ().add ( allowAll );

        return cfg;
    }

    @Override
    public void optionChanged ( final String key, final Object value )
    {
        if ( key.equals ( ProjectFeaturePage.OPTION_MASTER ) )
        {
            update ();
        }
    }

}
