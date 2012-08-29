/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configurator.module.common.processing.ImportListModule;
import org.openscada.configurator.module.common.processing.ImportModule;
import org.openscada.configurator.module.common.processing.OverrideListModule;
import org.openscada.configurator.module.common.processing.ProcessingFactory;
import org.openscada.configurator.module.common.processing.ProcessingPackage;
import org.openscada.configurator.module.common.processing.RemoveInactive;
import org.openscada.configurator.module.common.processing.ScriptOverrides;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessingFactoryImpl extends EFactoryImpl implements ProcessingFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProcessingFactory init ()
    {
        try
        {
            ProcessingFactory theProcessingFactory = (ProcessingFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Configurator/Modules/Common/Processing" );
            if ( theProcessingFactory != null )
            {
                return theProcessingFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new ProcessingFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessingFactoryImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create ( EClass eClass )
    {
        switch ( eClass.getClassifierID () )
        {
            case ProcessingPackage.IMPORT_MODULE:
                return createImportModule ();
            case ProcessingPackage.OVERRIDE_LIST_MODULE:
                return createOverrideListModule ();
            case ProcessingPackage.IMPORT_LIST_MODULE:
                return createImportListModule ();
            case ProcessingPackage.SCRIPT_OVERRIDES:
                return createScriptOverrides ();
            case ProcessingPackage.REMOVE_INACTIVE:
                return createRemoveInactive ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportModule createImportModule ()
    {
        ImportModuleImpl importModule = new ImportModuleImpl ();
        return importModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OverrideListModule createOverrideListModule ()
    {
        OverrideListModuleImpl overrideListModule = new OverrideListModuleImpl ();
        return overrideListModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportListModule createImportListModule ()
    {
        ImportListModuleImpl importListModule = new ImportListModuleImpl ();
        return importListModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptOverrides createScriptOverrides ()
    {
        ScriptOverridesImpl scriptOverrides = new ScriptOverridesImpl ();
        return scriptOverrides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoveInactive createRemoveInactive ()
    {
        RemoveInactiveImpl removeInactive = new RemoveInactiveImpl ();
        return removeInactive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessingPackage getProcessingPackage ()
    {
        return (ProcessingPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ProcessingPackage getPackage ()
    {
        return ProcessingPackage.eINSTANCE;
    }

} //ProcessingFactoryImpl
