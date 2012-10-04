/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.configurator.module.common.output.OutputAverages;
import org.openscada.configurator.module.common.output.OutputFactory;
import org.openscada.configurator.module.common.output.OutputGlobalSummaries;
import org.openscada.configurator.module.common.output.OutputItems;
import org.openscada.configurator.module.common.output.OutputPackage;
import org.openscada.configurator.module.common.output.OutputSummaries;
import org.openscada.configurator.module.common.output.WriteOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputFactoryImpl extends EFactoryImpl implements OutputFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static OutputFactory init ()
    {
        try
        {
            OutputFactory theOutputFactory = (OutputFactory)EPackage.Registry.INSTANCE.getEFactory ( "http://openscada.org/Configurator/Modules/Common/Output" );
            if ( theOutputFactory != null )
            {
                return theOutputFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new OutputFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputFactoryImpl ()
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
            case OutputPackage.OUTPUT_AVERAGES:
                return createOutputAverages ();
            case OutputPackage.OUTPUT_ITEMS:
                return createOutputItems ();
            case OutputPackage.OUTPUT_SUMMARIES:
                return createOutputSummaries ();
            case OutputPackage.OUTPUT_GLOBAL_SUMMARIES:
                return createOutputGlobalSummaries ();
            case OutputPackage.WRITE_OUTPUT:
                return createWriteOutput ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputAverages createOutputAverages ()
    {
        OutputAveragesImpl outputAverages = new OutputAveragesImpl ();
        return outputAverages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputItems createOutputItems ()
    {
        OutputItemsImpl outputItems = new OutputItemsImpl ();
        return outputItems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputSummaries createOutputSummaries ()
    {
        OutputSummariesImpl outputSummaries = new OutputSummariesImpl ();
        return outputSummaries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputGlobalSummaries createOutputGlobalSummaries ()
    {
        OutputGlobalSummariesImpl outputGlobalSummaries = new OutputGlobalSummariesImpl ();
        return outputGlobalSummaries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WriteOutput createWriteOutput ()
    {
        WriteOutputImpl writeOutput = new WriteOutputImpl ();
        return writeOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputPackage getOutputPackage ()
    {
        return (OutputPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static OutputPackage getPackage ()
    {
        return OutputPackage.eINSTANCE;
    }

} //OutputFactoryImpl
