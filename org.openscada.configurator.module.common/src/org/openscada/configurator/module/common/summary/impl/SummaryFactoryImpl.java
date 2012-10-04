/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configurator.module.common.summary.*;
import org.openscada.configurator.module.common.summary.CleanupSummaries;
import org.openscada.configurator.module.common.summary.GenerateSummaries;
import org.openscada.configurator.module.common.summary.SummaryFactory;
import org.openscada.configurator.module.common.summary.SummaryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SummaryFactoryImpl extends EFactoryImpl implements SummaryFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SummaryFactory init ()
    {
        try
        {
            SummaryFactory theSummaryFactory = (SummaryFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Configurator/Modules/Common/Summary" );
            if ( theSummaryFactory != null )
            {
                return theSummaryFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new SummaryFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryFactoryImpl ()
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
            case SummaryPackage.GENERATE_SUMMARIES:
                return createGenerateSummaries ();
            case SummaryPackage.CLEANUP_SUMMARIES:
                return createCleanupSummaries ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenerateSummaries createGenerateSummaries ()
    {
        GenerateSummariesImpl generateSummaries = new GenerateSummariesImpl ();
        return generateSummaries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CleanupSummaries createCleanupSummaries ()
    {
        CleanupSummariesImpl cleanupSummaries = new CleanupSummariesImpl ();
        return cleanupSummaries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryPackage getSummaryPackage ()
    {
        return (SummaryPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SummaryPackage getPackage ()
    {
        return SummaryPackage.eINSTANCE;
    }

} //SummaryFactoryImpl
