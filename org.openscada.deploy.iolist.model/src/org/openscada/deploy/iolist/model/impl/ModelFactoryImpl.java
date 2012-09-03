/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openscada.deploy.iolist.model.*;
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.AverageItem;
import org.openscada.deploy.iolist.model.AverageReferenceType;
import org.openscada.deploy.iolist.model.BooleanMonitor;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.FormulaInput;
import org.openscada.deploy.iolist.model.FormulaItem;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.Rounding;
import org.openscada.deploy.iolist.model.ScriptItem;
import org.openscada.deploy.iolist.model.ScriptModule;
import org.openscada.deploy.iolist.model.ScriptOutput;
import org.openscada.deploy.iolist.model.SummaryGroup;
import org.openscada.deploy.iolist.model.SummaryItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModelFactory init ()
    {
        try
        {
            ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory ( "http:///org/openscada/deploy/iolist/model.ecore" );
            if ( theModelFactory != null )
            {
                return theModelFactory;
            }
        }
        catch ( Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new ModelFactoryImpl ();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelFactoryImpl ()
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
            case ModelPackage.ITEM:
                return createItem ();
            case ModelPackage.SUMMARY_GROUP:
                return createSummaryGroup ();
            case ModelPackage.SUMMARY_ITEM:
                return createSummaryItem ();
            case ModelPackage.FORMULA_ITEM:
                return createFormulaItem ();
            case ModelPackage.FORMULA_INPUT:
                return createFormulaInput ();
            case ModelPackage.SCRIPT_MODULE:
                return createScriptModule ();
            case ModelPackage.MODEL:
                return createModel ();
            case ModelPackage.SCRIPT_ITEM:
                return createScriptItem ();
            case ModelPackage.SCRIPT_OUTPUT:
                return createScriptOutput ();
            case ModelPackage.MAPPER:
                return createMapper ();
            case ModelPackage.LEVEL_MONITOR:
                return createLevelMonitor ();
            case ModelPackage.LIST_MONITOR:
                return createListMonitor ();
            case ModelPackage.BOOLEAN_MONITOR:
                return createBooleanMonitor ();
            case ModelPackage.AVERAGE:
                return createAverage ();
            case ModelPackage.AVERAGE_ITEM:
                return createAverageItem ();
            case ModelPackage.CONSTANT_ITEM:
                return createConstantItem ();
            case ModelPackage.MOVING_AVERAGE_ITEM:
                return createMovingAverageItem ();
            case ModelPackage.MOVING_AVERAGE:
                return createMovingAverage ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString ( EDataType eDataType, String initialValue )
    {
        switch ( eDataType.getClassifierID () )
        {
            case ModelPackage.DATA_TYPE:
                return createDataTypeFromString ( eDataType, initialValue );
            case ModelPackage.ROUNDING:
                return createRoundingFromString ( eDataType, initialValue );
            case ModelPackage.AVERAGE_REFERENCE_TYPE:
                return createAverageReferenceTypeFromString ( eDataType, initialValue );
            case ModelPackage.MOVING_AVERAGE_REFERENCE_TYPE:
                return createMovingAverageReferenceTypeFromString ( eDataType, initialValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString ( EDataType eDataType, Object instanceValue )
    {
        switch ( eDataType.getClassifierID () )
        {
            case ModelPackage.DATA_TYPE:
                return convertDataTypeToString ( eDataType, instanceValue );
            case ModelPackage.ROUNDING:
                return convertRoundingToString ( eDataType, instanceValue );
            case ModelPackage.AVERAGE_REFERENCE_TYPE:
                return convertAverageReferenceTypeToString ( eDataType, instanceValue );
            case ModelPackage.MOVING_AVERAGE_REFERENCE_TYPE:
                return convertMovingAverageReferenceTypeToString ( eDataType, instanceValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Item createItem ()
    {
        ItemImpl item = new ItemImpl ();
        return item;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryGroup createSummaryGroup ()
    {
        SummaryGroupImpl summaryGroup = new SummaryGroupImpl ();
        return summaryGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryItem createSummaryItem ()
    {
        SummaryItemImpl summaryItem = new SummaryItemImpl ();
        return summaryItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaItem createFormulaItem ()
    {
        FormulaItemImpl formulaItem = new FormulaItemImpl ();
        return formulaItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaInput createFormulaInput ()
    {
        FormulaInputImpl formulaInput = new FormulaInputImpl ();
        return formulaInput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptModule createScriptModule ()
    {
        ScriptModuleImpl scriptModule = new ScriptModuleImpl ();
        return scriptModule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model createModel ()
    {
        ModelImpl model = new ModelImpl ();
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptItem createScriptItem ()
    {
        ScriptItemImpl scriptItem = new ScriptItemImpl ();
        return scriptItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScriptOutput createScriptOutput ()
    {
        ScriptOutputImpl scriptOutput = new ScriptOutputImpl ();
        return scriptOutput;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Mapper createMapper ()
    {
        MapperImpl mapper = new MapperImpl ();
        return mapper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LevelMonitor createLevelMonitor ()
    {
        LevelMonitorImpl levelMonitor = new LevelMonitorImpl ();
        return levelMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListMonitor createListMonitor ()
    {
        ListMonitorImpl listMonitor = new ListMonitorImpl ();
        return listMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BooleanMonitor createBooleanMonitor ()
    {
        BooleanMonitorImpl booleanMonitor = new BooleanMonitorImpl ();
        return booleanMonitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Average createAverage ()
    {
        AverageImpl average = new AverageImpl ();
        return average;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AverageItem createAverageItem ()
    {
        AverageItemImpl averageItem = new AverageItemImpl ();
        return averageItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConstantItem createConstantItem ()
    {
        ConstantItemImpl constantItem = new ConstantItemImpl ();
        return constantItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverageItem createMovingAverageItem ()
    {
        MovingAverageItemImpl movingAverageItem = new MovingAverageItemImpl ();
        return movingAverageItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverage createMovingAverage ()
    {
        MovingAverageImpl movingAverage = new MovingAverageImpl ();
        return movingAverage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType createDataTypeFromString ( EDataType eDataType, String initialValue )
    {
        DataType result = DataType.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDataTypeToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rounding createRoundingFromString ( EDataType eDataType, String initialValue )
    {
        Rounding result = Rounding.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRoundingToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AverageReferenceType createAverageReferenceTypeFromString ( EDataType eDataType, String initialValue )
    {
        AverageReferenceType result = AverageReferenceType.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAverageReferenceTypeToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MovingAverageReferenceType createMovingAverageReferenceTypeFromString ( EDataType eDataType, String initialValue )
    {
        MovingAverageReferenceType result = MovingAverageReferenceType.get ( initialValue );
        if ( result == null )
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMovingAverageReferenceTypeToString ( EDataType eDataType, Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelPackage getModelPackage ()
    {
        return (ModelPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModelPackage getPackage ()
    {
        return ModelPackage.eINSTANCE;
    }

} //ModelFactoryImpl
