/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.scripts.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openscada.configurator.module.common.scripts.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptsFactoryImpl extends EFactoryImpl implements ScriptsFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ScriptsFactory init ()
    {
        try
        {
            ScriptsFactory theScriptsFactory = (ScriptsFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Configurator/Modules/Common/Scripts" );
            if ( theScriptsFactory != null )
            {
                return theScriptsFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new ScriptsFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptsFactoryImpl ()
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
            case ScriptsPackage.SCRIPTS_MODULE:
                return createScriptsModule ();
            case ScriptsPackage.LEGACY_FORMULA_MODULE:
                return createLegacyFormulaModule ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptsModule createScriptsModule ()
    {
        ScriptsModuleImpl scriptsModule = new ScriptsModuleImpl ();
        return scriptsModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LegacyFormulaModule createLegacyFormulaModule ()
    {
        LegacyFormulaModuleImpl legacyFormulaModule = new LegacyFormulaModuleImpl ();
        return legacyFormulaModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptsPackage getScriptsPackage ()
    {
        return (ScriptsPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ScriptsPackage getPackage ()
    {
        return ScriptsPackage.eINSTANCE;
    }

} //ScriptsFactoryImpl
