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
import org.openscada.ae.Severity;
import org.openscada.core.Variant;
import org.openscada.core.VariantEditor;
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.AverageItem;
import org.openscada.deploy.iolist.model.AverageReferenceType;
import org.openscada.deploy.iolist.model.BooleanMonitor;
import org.openscada.deploy.iolist.model.ConstantItem;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.FormulaInput;
import org.openscada.deploy.iolist.model.FormulaItem;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.LevelMonitor;
import org.openscada.deploy.iolist.model.ListMonitor;
import org.openscada.deploy.iolist.model.ListMonitorEntry;
import org.openscada.deploy.iolist.model.Mapper;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.MovingAverage;
import org.openscada.deploy.iolist.model.MovingAverageItem;
import org.openscada.deploy.iolist.model.MovingAverageReferenceType;
import org.openscada.deploy.iolist.model.Rounding;
import org.openscada.deploy.iolist.model.ScriptItem;
import org.openscada.deploy.iolist.model.ScriptModule;
import org.openscada.deploy.iolist.model.ScriptOutput;
import org.openscada.deploy.iolist.model.SummaryGroup;
import org.openscada.deploy.iolist.model.SummaryItem;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory
{
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static ModelFactory init ()
    {
        try
        {
            final ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory ( "http:///org/openscada/deploy/iolist/model.ecore" );
            if ( theModelFactory != null )
            {
                return theModelFactory;
            }
        }
        catch ( final Exception exception )
        {
            EcorePlugin.INSTANCE.log ( exception );
        }
        return new ModelFactoryImpl ();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ModelFactoryImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create ( final EClass eClass )
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
            case ModelPackage.LIST_MONITOR_ENTRY:
                return createListMonitorEntry ();
            default:
                throw new IllegalArgumentException ( "The class '" + eClass.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object createFromString ( final EDataType eDataType, final String initialValue )
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
            case ModelPackage.VARIANT:
                return createVariantFromString ( eDataType, initialValue );
            case ModelPackage.LIST_SEVERITY:
                return createListSeverityFromString ( eDataType, initialValue );
            case ModelPackage.SEVERITY:
                return createSeverityFromString ( eDataType, initialValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString ( final EDataType eDataType, final Object instanceValue )
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
            case ModelPackage.VARIANT:
                return convertVariantToString ( eDataType, instanceValue );
            case ModelPackage.LIST_SEVERITY:
                return convertListSeverityToString ( eDataType, instanceValue );
            case ModelPackage.SEVERITY:
                return convertSeverityToString ( eDataType, instanceValue );
            default:
                throw new IllegalArgumentException ( "The datatype '" + eDataType.getName () + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Item createItem ()
    {
        final ItemImpl item = new ItemImpl ();
        return item;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SummaryGroup createSummaryGroup ()
    {
        final SummaryGroupImpl summaryGroup = new SummaryGroupImpl ();
        return summaryGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SummaryItem createSummaryItem ()
    {
        final SummaryItemImpl summaryItem = new SummaryItemImpl ();
        return summaryItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FormulaItem createFormulaItem ()
    {
        final FormulaItemImpl formulaItem = new FormulaItemImpl ();
        return formulaItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FormulaInput createFormulaInput ()
    {
        final FormulaInputImpl formulaInput = new FormulaInputImpl ();
        return formulaInput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ScriptModule createScriptModule ()
    {
        final ScriptModuleImpl scriptModule = new ScriptModuleImpl ();
        return scriptModule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Model createModel ()
    {
        final ModelImpl model = new ModelImpl ();
        return model;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ScriptItem createScriptItem ()
    {
        final ScriptItemImpl scriptItem = new ScriptItemImpl ();
        return scriptItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ScriptOutput createScriptOutput ()
    {
        final ScriptOutputImpl scriptOutput = new ScriptOutputImpl ();
        return scriptOutput;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Mapper createMapper ()
    {
        final MapperImpl mapper = new MapperImpl ();
        return mapper;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public LevelMonitor createLevelMonitor ()
    {
        final LevelMonitorImpl levelMonitor = new LevelMonitorImpl ();
        return levelMonitor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ListMonitor createListMonitor ()
    {
        final ListMonitorImpl listMonitor = new ListMonitorImpl ();
        return listMonitor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public BooleanMonitor createBooleanMonitor ()
    {
        final BooleanMonitorImpl booleanMonitor = new BooleanMonitorImpl ();
        return booleanMonitor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Average createAverage ()
    {
        final AverageImpl average = new AverageImpl ();
        return average;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AverageItem createAverageItem ()
    {
        final AverageItemImpl averageItem = new AverageItemImpl ();
        return averageItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ConstantItem createConstantItem ()
    {
        final ConstantItemImpl constantItem = new ConstantItemImpl ();
        return constantItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MovingAverageItem createMovingAverageItem ()
    {
        final MovingAverageItemImpl movingAverageItem = new MovingAverageItemImpl ();
        return movingAverageItem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MovingAverage createMovingAverage ()
    {
        final MovingAverageImpl movingAverage = new MovingAverageImpl ();
        return movingAverage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ListMonitorEntry createListMonitorEntry ()
    {
        final ListMonitorEntryImpl listMonitorEntry = new ListMonitorEntryImpl ();
        return listMonitorEntry;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public DataType createDataTypeFromString ( final EDataType eDataType, final String initialValue )
    {
        final DataType result = DataType.get ( initialValue );
        if ( result == null )
        {
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertDataTypeToString ( final EDataType eDataType, final Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Rounding createRoundingFromString ( final EDataType eDataType, final String initialValue )
    {
        final Rounding result = Rounding.get ( initialValue );
        if ( result == null )
        {
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertRoundingToString ( final EDataType eDataType, final Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AverageReferenceType createAverageReferenceTypeFromString ( final EDataType eDataType, final String initialValue )
    {
        final AverageReferenceType result = AverageReferenceType.get ( initialValue );
        if ( result == null )
        {
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertAverageReferenceTypeToString ( final EDataType eDataType, final Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MovingAverageReferenceType createMovingAverageReferenceTypeFromString ( final EDataType eDataType, final String initialValue )
    {
        final MovingAverageReferenceType result = MovingAverageReferenceType.get ( initialValue );
        if ( result == null )
        {
            throw new IllegalArgumentException ( "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName () + "'" );
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertMovingAverageReferenceTypeToString ( final EDataType eDataType, final Object instanceValue )
    {
        return instanceValue == null ? null : instanceValue.toString ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String createListSeverityFromString ( final EDataType eDataType, final String initialValue )
    {
        return (String)super.createFromString ( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertListSeverityToString ( final EDataType eDataType, final Object instanceValue )
    {
        return super.convertToString ( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public Severity createSeverityFromString ( final EDataType eDataType, final String initialValue )
    {
        return (Severity)super.createFromString ( eDataType, initialValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertSeverityToString ( final EDataType eDataType, final Object instanceValue )
    {
        return super.convertToString ( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public Variant createVariantFromString ( final EDataType eDataType, final String initialValue )
    {
        return VariantEditor.toVariant ( initialValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertVariantToString ( final EDataType eDataType, final Object instanceValue )
    {
        return super.convertToString ( eDataType, instanceValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ModelPackage getModelPackage ()
    {
        return (ModelPackage)getEPackage ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModelPackage getPackage ()
    {
        return ModelPackage.eINSTANCE;
    }

} //ModelFactoryImpl
