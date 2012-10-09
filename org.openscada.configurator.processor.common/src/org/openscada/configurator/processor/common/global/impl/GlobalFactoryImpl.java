/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openscada.configurator.processor.common.global.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalFactoryImpl extends EFactoryImpl implements GlobalFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static GlobalFactory init ()
    {
        try
        {
            GlobalFactory theGlobalFactory = (GlobalFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Configurator/Processors/Common/Global" );
            if ( theGlobalFactory != null )
            {
                return theGlobalFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new GlobalFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalFactoryImpl ()
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
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL:
                return createTransformSiteToGlobal ();
            case GlobalPackage.SITE:
                return createSite ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransformSiteToGlobal createTransformSiteToGlobal ()
    {
        TransformSiteToGlobalImpl transformSiteToGlobal = new TransformSiteToGlobalImpl ();
        return transformSiteToGlobal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Site createSite ()
    {
        SiteImpl site = new SiteImpl ();
        return site;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GlobalPackage getGlobalPackage ()
    {
        return (GlobalPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static GlobalPackage getPackage ()
    {
        return GlobalPackage.eINSTANCE;
    }

} //GlobalFactoryImpl
