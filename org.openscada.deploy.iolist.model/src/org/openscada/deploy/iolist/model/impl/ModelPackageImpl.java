/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openscada.ae.Severity;
import org.openscada.core.Variant;
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.AverageItem;
import org.openscada.deploy.iolist.model.AverageReferenceType;
import org.openscada.deploy.iolist.model.BasicMonitor;
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
import org.openscada.deploy.iolist.model.Monitor;
import org.openscada.deploy.iolist.model.MovingAverage;
import org.openscada.deploy.iolist.model.MovingAverageItem;
import org.openscada.deploy.iolist.model.MovingAverageReferenceType;
import org.openscada.deploy.iolist.model.Rounding;
import org.openscada.deploy.iolist.model.ScriptItem;
import org.openscada.deploy.iolist.model.ScriptModule;
import org.openscada.deploy.iolist.model.ScriptOutput;
import org.openscada.deploy.iolist.model.SummaryGroup;
import org.openscada.deploy.iolist.model.util.ModelValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage
{
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass itemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass summaryGroupEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass formulaItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass formulaInputEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptModuleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass modelEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptOutputEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass mapperEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass monitorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass levelMonitorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass listMonitorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanMonitorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass averageEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass averageItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass constantItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass movingAverageItemEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass movingAverageEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass listMonitorEntryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EClass basicMonitorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum dataTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum roundingEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum averageReferenceTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EEnum movingAverageReferenceTypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType variantEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType listSeverityEDataType = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private EDataType severityEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.openscada.deploy.iolist.model.ModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelPackageImpl ()
    {
        super ( eNS_URI, ModelFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelPackage init ()
    {
        if ( isInited )
            return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage ( ModelPackage.eNS_URI );

        // Obtain or create and register package
        ModelPackageImpl theModelPackage = (ModelPackageImpl) ( EPackage.Registry.INSTANCE.get ( eNS_URI ) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get ( eNS_URI ) : new ModelPackageImpl () );

        isInited = true;

        // Create package meta-data objects
        theModelPackage.createPackageContents ();

        // Initialize created meta-data
        theModelPackage.initializePackageContents ();

        // Register package validator
        EValidator.Registry.INSTANCE.put ( theModelPackage, new EValidator.Descriptor () {
            public EValidator getEValidator ()
            {
                return ModelValidator.INSTANCE;
            }
        } );

        // Mark meta-data to indicate it can't be changed
        theModelPackage.freeze ();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put ( ModelPackage.eNS_URI, theModelPackage );
        return theModelPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getItem ()
    {
        return itemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Device ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Name ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_DataType ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Unit ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Alias ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Description ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_AttributeSummaryLevel ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 6 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_LocalMin ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 38 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_LocalMax ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 39 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_LocalListMonitor ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 40 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_LocalBooleanMonitor ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 41 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItem_DefaultMonitorDemote ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 42 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_EventCommand ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 7 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_LocalManual ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 8 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteManual ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 9 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_System ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 10 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Hierarchy ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 11 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteMin ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 12 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteMax ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 13 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteHighHigh ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 14 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteHigh ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 15 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteLow ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 16 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteLowLow ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 17 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteBool ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 18 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RemoteBoolAckValue ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 19 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Input ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 20 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Output ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 21 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_LocalScaleAvailable ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 22 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_LocalScaleFactor ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 23 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_LocalScaleOffset ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 24 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_DebugInformation ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 25 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_IgnoreSummary ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 26 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Block ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 27 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_Enabled ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 28 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_HdStorage ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 29 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_Mapper ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 30 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_SimulationValue ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 31 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RoundingAvailable ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 32 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getItem_RoundingValue ()
    {
        return (EAttribute)itemEClass.getEStructuralFeatures ().get ( 33 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_LocalHighHigh ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 34 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_LocalHigh ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 35 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_LocalLow ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 36 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getItem_LocalLowLow ()
    {
        return (EReference)itemEClass.getEStructuralFeatures ().get ( 37 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSummaryGroup ()
    {
        return summaryGroupEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSummaryGroup_Id ()
    {
        return (EAttribute)summaryGroupEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSummaryGroup_Hierarchy ()
    {
        return (EAttribute)summaryGroupEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryGroup_DataSourceIds ()
    {
        return (EAttribute)summaryGroupEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryGroup_Retain ()
    {
        return (EAttribute)summaryGroupEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSummaryGroup_SubSummaryIds ()
    {
        return (EAttribute)summaryGroupEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFormulaItem ()
    {
        return formulaItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaItem_InputFormula ()
    {
        return (EAttribute)formulaItemEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaItem_OutputFormula ()
    {
        return (EAttribute)formulaItemEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFormulaItem_Inputs ()
    {
        return (EReference)formulaItemEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaItem_OutputDatasourceId ()
    {
        return (EAttribute)formulaItemEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaItem_WriteValueName ()
    {
        return (EAttribute)formulaItemEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaItem_InitScript ()
    {
        return (EAttribute)formulaItemEClass.getEStructuralFeatures ().get ( 5 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaItem_OutputDatasourceType ()
    {
        return (EAttribute)formulaItemEClass.getEStructuralFeatures ().get ( 6 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getFormulaItem_ScriptModules ()
    {
        return (EReference)formulaItemEClass.getEStructuralFeatures ().get ( 7 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getFormulaInput ()
    {
        return formulaInputEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaInput_Name ()
    {
        return (EAttribute)formulaInputEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaInput_DatasourceId ()
    {
        return (EAttribute)formulaInputEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getFormulaInput_Type ()
    {
        return (EAttribute)formulaInputEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScriptModule ()
    {
        return scriptModuleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptModule_Data ()
    {
        return (EAttribute)scriptModuleEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptModule_Resource ()
    {
        return (EAttribute)scriptModuleEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getModel ()
    {
        return modelEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModel_Items ()
    {
        return (EReference)modelEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModel_Averages ()
    {
        return (EReference)modelEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getModel_MovingAverages ()
    {
        return (EReference)modelEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModel_Summaries ()
    {
        return (EReference)modelEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScriptItem ()
    {
        return scriptItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptItem_ScriptEngine ()
    {
        return (EAttribute)scriptItemEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScriptItem_Inputs ()
    {
        return (EReference)scriptItemEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptItem_InitScript ()
    {
        return (EAttribute)scriptItemEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptItem_UpdateScript ()
    {
        return (EAttribute)scriptItemEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptItem_TimerScript ()
    {
        return (EAttribute)scriptItemEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptItem_TimerPeriod ()
    {
        return (EAttribute)scriptItemEClass.getEStructuralFeatures ().get ( 5 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScriptItem_Outputs ()
    {
        return (EReference)scriptItemEClass.getEStructuralFeatures ().get ( 6 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptItem_WriteCommand ()
    {
        return (EAttribute)scriptItemEClass.getEStructuralFeatures ().get ( 7 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScriptOutput ()
    {
        return scriptOutputEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptOutput_DatasourceId ()
    {
        return (EAttribute)scriptOutputEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getScriptOutput_Name ()
    {
        return (EAttribute)scriptOutputEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMapper ()
    {
        return mapperEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMapper_MapperId ()
    {
        return (EAttribute)mapperEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMapper_FromAttribute ()
    {
        return (EAttribute)mapperEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMapper_ToAttribute ()
    {
        return (EAttribute)mapperEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMonitor ()
    {
        return monitorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMonitor_Active ()
    {
        return (EAttribute)monitorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLevelMonitor ()
    {
        return levelMonitorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLevelMonitor_Preset ()
    {
        return (EAttribute)levelMonitorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getListMonitor ()
    {
        return listMonitorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getListMonitor_Entries ()
    {
        return (EReference)listMonitorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getListMonitor_DefaultAck ()
    {
        return (EAttribute)listMonitorEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getListMonitor_DefaultSeverity ()
    {
        return (EAttribute)listMonitorEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBooleanMonitor ()
    {
        return booleanMonitorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBooleanMonitor_OkValue ()
    {
        return (EAttribute)booleanMonitorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAverage ()
    {
        return averageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAverage_Id ()
    {
        return (EAttribute)averageEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAverage_Sources ()
    {
        return (EAttribute)averageEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAverage_PercentRequired ()
    {
        return (EAttribute)averageEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAverageItem ()
    {
        return averageItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAverageItem_Average ()
    {
        return (EReference)averageItemEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAverageItem_Type ()
    {
        return (EAttribute)averageItemEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConstantItem ()
    {
        return constantItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMovingAverageItem ()
    {
        return movingAverageItemEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMovingAverageItem_Average ()
    {
        return (EReference)movingAverageItemEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMovingAverageItem_Type ()
    {
        return (EAttribute)movingAverageItemEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMovingAverage ()
    {
        return movingAverageEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMovingAverage_Id ()
    {
        return (EAttribute)movingAverageEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMovingAverage_Source ()
    {
        return (EAttribute)movingAverageEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMovingAverage_Trigger ()
    {
        return (EAttribute)movingAverageEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMovingAverage_Range ()
    {
        return (EAttribute)movingAverageEClass.getEStructuralFeatures ().get ( 3 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getMovingAverage_NullRange ()
    {
        return (EAttribute)movingAverageEClass.getEStructuralFeatures ().get ( 4 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getListMonitorEntry ()
    {
        return listMonitorEntryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getListMonitorEntry_Value ()
    {
        return (EAttribute)listMonitorEntryEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getListMonitorEntry_Severity ()
    {
        return (EAttribute)listMonitorEntryEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getListMonitorEntry_RequireAck ()
    {
        return (EAttribute)listMonitorEntryEClass.getEStructuralFeatures ().get ( 2 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBasicMonitor ()
    {
        return basicMonitorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBasicMonitor_Ack ()
    {
        return (EAttribute)basicMonitorEClass.getEStructuralFeatures ().get ( 0 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBasicMonitor_Severity ()
    {
        return (EAttribute)basicMonitorEClass.getEStructuralFeatures ().get ( 1 );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getDataType ()
    {
        return dataTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getRounding ()
    {
        return roundingEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getAverageReferenceType ()
    {
        return averageReferenceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getMovingAverageReferenceType ()
    {
        return movingAverageReferenceTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getListSeverity ()
    {
        return listSeverityEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getSeverity ()
    {
        return severityEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EDataType getVariant ()
    {
        return variantEDataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ModelFactory getModelFactory ()
    {
        return (ModelFactory)getEFactoryInstance ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents ()
    {
        if ( isCreated )
            return;
        isCreated = true;

        // Create classes and their features
        itemEClass = createEClass ( ITEM );
        createEAttribute ( itemEClass, ITEM__DEVICE );
        createEAttribute ( itemEClass, ITEM__NAME );
        createEAttribute ( itemEClass, ITEM__DATA_TYPE );
        createEAttribute ( itemEClass, ITEM__UNIT );
        createEAttribute ( itemEClass, ITEM__ALIAS );
        createEAttribute ( itemEClass, ITEM__DESCRIPTION );
        createEAttribute ( itemEClass, ITEM__ATTRIBUTE_SUMMARY_LEVEL );
        createEAttribute ( itemEClass, ITEM__EVENT_COMMAND );
        createEAttribute ( itemEClass, ITEM__LOCAL_MANUAL );
        createEAttribute ( itemEClass, ITEM__REMOTE_MANUAL );
        createEAttribute ( itemEClass, ITEM__SYSTEM );
        createEAttribute ( itemEClass, ITEM__HIERARCHY );
        createEAttribute ( itemEClass, ITEM__REMOTE_MIN );
        createEAttribute ( itemEClass, ITEM__REMOTE_MAX );
        createEAttribute ( itemEClass, ITEM__REMOTE_HIGH_HIGH );
        createEAttribute ( itemEClass, ITEM__REMOTE_HIGH );
        createEAttribute ( itemEClass, ITEM__REMOTE_LOW );
        createEAttribute ( itemEClass, ITEM__REMOTE_LOW_LOW );
        createEAttribute ( itemEClass, ITEM__REMOTE_BOOL );
        createEAttribute ( itemEClass, ITEM__REMOTE_BOOL_ACK_VALUE );
        createEAttribute ( itemEClass, ITEM__INPUT );
        createEAttribute ( itemEClass, ITEM__OUTPUT );
        createEAttribute ( itemEClass, ITEM__LOCAL_SCALE_AVAILABLE );
        createEAttribute ( itemEClass, ITEM__LOCAL_SCALE_FACTOR );
        createEAttribute ( itemEClass, ITEM__LOCAL_SCALE_OFFSET );
        createEAttribute ( itemEClass, ITEM__DEBUG_INFORMATION );
        createEAttribute ( itemEClass, ITEM__IGNORE_SUMMARY );
        createEAttribute ( itemEClass, ITEM__BLOCK );
        createEAttribute ( itemEClass, ITEM__ENABLED );
        createEAttribute ( itemEClass, ITEM__HD_STORAGE );
        createEReference ( itemEClass, ITEM__MAPPER );
        createEAttribute ( itemEClass, ITEM__SIMULATION_VALUE );
        createEAttribute ( itemEClass, ITEM__ROUNDING_AVAILABLE );
        createEAttribute ( itemEClass, ITEM__ROUNDING_VALUE );
        createEReference ( itemEClass, ITEM__LOCAL_HIGH_HIGH );
        createEReference ( itemEClass, ITEM__LOCAL_HIGH );
        createEReference ( itemEClass, ITEM__LOCAL_LOW );
        createEReference ( itemEClass, ITEM__LOCAL_LOW_LOW );
        createEReference ( itemEClass, ITEM__LOCAL_MIN );
        createEReference ( itemEClass, ITEM__LOCAL_MAX );
        createEReference ( itemEClass, ITEM__LOCAL_LIST_MONITOR );
        createEReference ( itemEClass, ITEM__LOCAL_BOOLEAN_MONITOR );
        createEAttribute ( itemEClass, ITEM__DEFAULT_MONITOR_DEMOTE );

        summaryGroupEClass = createEClass ( SUMMARY_GROUP );
        createEAttribute ( summaryGroupEClass, SUMMARY_GROUP__ID );
        createEAttribute ( summaryGroupEClass, SUMMARY_GROUP__HIERARCHY );
        createEAttribute ( summaryGroupEClass, SUMMARY_GROUP__DATA_SOURCE_IDS );
        createEAttribute ( summaryGroupEClass, SUMMARY_GROUP__RETAIN );
        createEAttribute ( summaryGroupEClass, SUMMARY_GROUP__SUB_SUMMARY_IDS );

        formulaItemEClass = createEClass ( FORMULA_ITEM );
        createEAttribute ( formulaItemEClass, FORMULA_ITEM__INPUT_FORMULA );
        createEAttribute ( formulaItemEClass, FORMULA_ITEM__OUTPUT_FORMULA );
        createEReference ( formulaItemEClass, FORMULA_ITEM__INPUTS );
        createEAttribute ( formulaItemEClass, FORMULA_ITEM__OUTPUT_DATASOURCE_ID );
        createEAttribute ( formulaItemEClass, FORMULA_ITEM__WRITE_VALUE_NAME );
        createEAttribute ( formulaItemEClass, FORMULA_ITEM__INIT_SCRIPT );
        createEAttribute ( formulaItemEClass, FORMULA_ITEM__OUTPUT_DATASOURCE_TYPE );
        createEReference ( formulaItemEClass, FORMULA_ITEM__SCRIPT_MODULES );

        formulaInputEClass = createEClass ( FORMULA_INPUT );
        createEAttribute ( formulaInputEClass, FORMULA_INPUT__NAME );
        createEAttribute ( formulaInputEClass, FORMULA_INPUT__DATASOURCE_ID );
        createEAttribute ( formulaInputEClass, FORMULA_INPUT__TYPE );

        scriptModuleEClass = createEClass ( SCRIPT_MODULE );
        createEAttribute ( scriptModuleEClass, SCRIPT_MODULE__DATA );
        createEAttribute ( scriptModuleEClass, SCRIPT_MODULE__RESOURCE );

        modelEClass = createEClass ( MODEL );
        createEReference ( modelEClass, MODEL__ITEMS );
        createEReference ( modelEClass, MODEL__AVERAGES );
        createEReference ( modelEClass, MODEL__MOVING_AVERAGES );
        createEReference ( modelEClass, MODEL__SUMMARIES );

        scriptItemEClass = createEClass ( SCRIPT_ITEM );
        createEAttribute ( scriptItemEClass, SCRIPT_ITEM__SCRIPT_ENGINE );
        createEReference ( scriptItemEClass, SCRIPT_ITEM__INPUTS );
        createEAttribute ( scriptItemEClass, SCRIPT_ITEM__INIT_SCRIPT );
        createEAttribute ( scriptItemEClass, SCRIPT_ITEM__UPDATE_SCRIPT );
        createEAttribute ( scriptItemEClass, SCRIPT_ITEM__TIMER_SCRIPT );
        createEAttribute ( scriptItemEClass, SCRIPT_ITEM__TIMER_PERIOD );
        createEReference ( scriptItemEClass, SCRIPT_ITEM__OUTPUTS );
        createEAttribute ( scriptItemEClass, SCRIPT_ITEM__WRITE_COMMAND );

        scriptOutputEClass = createEClass ( SCRIPT_OUTPUT );
        createEAttribute ( scriptOutputEClass, SCRIPT_OUTPUT__DATASOURCE_ID );
        createEAttribute ( scriptOutputEClass, SCRIPT_OUTPUT__NAME );

        mapperEClass = createEClass ( MAPPER );
        createEAttribute ( mapperEClass, MAPPER__MAPPER_ID );
        createEAttribute ( mapperEClass, MAPPER__FROM_ATTRIBUTE );
        createEAttribute ( mapperEClass, MAPPER__TO_ATTRIBUTE );

        monitorEClass = createEClass ( MONITOR );
        createEAttribute ( monitorEClass, MONITOR__ACTIVE );

        levelMonitorEClass = createEClass ( LEVEL_MONITOR );
        createEAttribute ( levelMonitorEClass, LEVEL_MONITOR__PRESET );

        listMonitorEClass = createEClass ( LIST_MONITOR );
        createEReference ( listMonitorEClass, LIST_MONITOR__ENTRIES );
        createEAttribute ( listMonitorEClass, LIST_MONITOR__DEFAULT_ACK );
        createEAttribute ( listMonitorEClass, LIST_MONITOR__DEFAULT_SEVERITY );

        booleanMonitorEClass = createEClass ( BOOLEAN_MONITOR );
        createEAttribute ( booleanMonitorEClass, BOOLEAN_MONITOR__OK_VALUE );

        averageEClass = createEClass ( AVERAGE );
        createEAttribute ( averageEClass, AVERAGE__ID );
        createEAttribute ( averageEClass, AVERAGE__SOURCES );
        createEAttribute ( averageEClass, AVERAGE__PERCENT_REQUIRED );

        averageItemEClass = createEClass ( AVERAGE_ITEM );
        createEReference ( averageItemEClass, AVERAGE_ITEM__AVERAGE );
        createEAttribute ( averageItemEClass, AVERAGE_ITEM__TYPE );

        constantItemEClass = createEClass ( CONSTANT_ITEM );

        movingAverageItemEClass = createEClass ( MOVING_AVERAGE_ITEM );
        createEReference ( movingAverageItemEClass, MOVING_AVERAGE_ITEM__AVERAGE );
        createEAttribute ( movingAverageItemEClass, MOVING_AVERAGE_ITEM__TYPE );

        movingAverageEClass = createEClass ( MOVING_AVERAGE );
        createEAttribute ( movingAverageEClass, MOVING_AVERAGE__ID );
        createEAttribute ( movingAverageEClass, MOVING_AVERAGE__SOURCE );
        createEAttribute ( movingAverageEClass, MOVING_AVERAGE__TRIGGER );
        createEAttribute ( movingAverageEClass, MOVING_AVERAGE__RANGE );
        createEAttribute ( movingAverageEClass, MOVING_AVERAGE__NULL_RANGE );

        listMonitorEntryEClass = createEClass ( LIST_MONITOR_ENTRY );
        createEAttribute ( listMonitorEntryEClass, LIST_MONITOR_ENTRY__VALUE );
        createEAttribute ( listMonitorEntryEClass, LIST_MONITOR_ENTRY__SEVERITY );
        createEAttribute ( listMonitorEntryEClass, LIST_MONITOR_ENTRY__REQUIRE_ACK );

        basicMonitorEClass = createEClass ( BASIC_MONITOR );
        createEAttribute ( basicMonitorEClass, BASIC_MONITOR__ACK );
        createEAttribute ( basicMonitorEClass, BASIC_MONITOR__SEVERITY );

        // Create enums
        dataTypeEEnum = createEEnum ( DATA_TYPE );
        roundingEEnum = createEEnum ( ROUNDING );
        averageReferenceTypeEEnum = createEEnum ( AVERAGE_REFERENCE_TYPE );
        movingAverageReferenceTypeEEnum = createEEnum ( MOVING_AVERAGE_REFERENCE_TYPE );

        // Create data types
        variantEDataType = createEDataType ( VARIANT );
        listSeverityEDataType = createEDataType ( LIST_SEVERITY );
        severityEDataType = createEDataType ( SEVERITY );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents ()
    {
        if ( isInitialized )
            return;
        isInitialized = true;

        // Initialize package
        setName ( eNAME );
        setNsPrefix ( eNS_PREFIX );
        setNsURI ( eNS_URI );

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        formulaItemEClass.getESuperTypes ().add ( this.getItem () );
        scriptItemEClass.getESuperTypes ().add ( this.getItem () );
        levelMonitorEClass.getESuperTypes ().add ( this.getBasicMonitor () );
        listMonitorEClass.getESuperTypes ().add ( this.getMonitor () );
        booleanMonitorEClass.getESuperTypes ().add ( this.getBasicMonitor () );
        averageItemEClass.getESuperTypes ().add ( this.getItem () );
        constantItemEClass.getESuperTypes ().add ( this.getItem () );
        movingAverageItemEClass.getESuperTypes ().add ( this.getItem () );
        basicMonitorEClass.getESuperTypes ().add ( this.getMonitor () );

        // Initialize classes and features; add operations and parameters
        initEClass ( itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getItem_Device (), ecorePackage.getEString (), "device", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Name (), ecorePackage.getEString (), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_DataType (), this.getDataType (), "dataType", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Unit (), ecorePackage.getEString (), "unit", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Alias (), ecorePackage.getEString (), "alias", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Description (), ecorePackage.getEString (), "description", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_AttributeSummaryLevel (), ecorePackage.getEInt (), "attributeSummaryLevel", "0", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_EventCommand (), ecorePackage.getEBoolean (), "eventCommand", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_LocalManual (), ecorePackage.getEBoolean (), "localManual", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteManual (), ecorePackage.getEBoolean (), "remoteManual", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_System (), ecorePackage.getEString (), "system", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Hierarchy (), ecorePackage.getEString (), "hierarchy", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteMin (), ecorePackage.getEBoolean (), "remoteMin", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteMax (), ecorePackage.getEBoolean (), "remoteMax", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteHighHigh (), ecorePackage.getEBoolean (), "remoteHighHigh", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteHigh (), ecorePackage.getEBoolean (), "remoteHigh", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteLow (), ecorePackage.getEBoolean (), "remoteLow", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteLowLow (), ecorePackage.getEBoolean (), "remoteLowLow", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteBool (), ecorePackage.getEBoolean (), "remoteBool", "false", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RemoteBoolAckValue (), ecorePackage.getEBooleanObject (), "remoteBoolAckValue", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Input (), ecorePackage.getEBoolean (), "input", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Output (), ecorePackage.getEBoolean (), "output", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_LocalScaleAvailable (), ecorePackage.getEBoolean (), "localScaleAvailable", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_LocalScaleFactor (), ecorePackage.getEDoubleObject (), "localScaleFactor", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_LocalScaleOffset (), ecorePackage.getEDoubleObject (), "localScaleOffset", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_DebugInformation (), ecorePackage.getEString (), "debugInformation", null, 0, 1, Item.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_IgnoreSummary (), ecorePackage.getEBoolean (), "ignoreSummary", "false", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Block (), ecorePackage.getEBoolean (), "block", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_Enabled (), ecorePackage.getEBoolean (), "enabled", "true", 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_HdStorage (), ecorePackage.getEString (), "hdStorage", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_Mapper (), this.getMapper (), null, "mapper", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_SimulationValue (), ecorePackage.getEString (), "simulationValue", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RoundingAvailable (), ecorePackage.getEBoolean (), "roundingAvailable", "false", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_RoundingValue (), this.getRounding (), "roundingValue", "NONE", 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_LocalHighHigh (), this.getLevelMonitor (), null, "localHighHigh", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_LocalHigh (), this.getLevelMonitor (), null, "localHigh", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_LocalLow (), this.getLevelMonitor (), null, "localLow", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_LocalLowLow (), this.getLevelMonitor (), null, "localLowLow", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_LocalMin (), this.getLevelMonitor (), null, "localMin", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_LocalMax (), this.getLevelMonitor (), null, "localMax", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_LocalListMonitor (), this.getListMonitor (), null, "localListMonitor", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getItem_LocalBooleanMonitor (), this.getBooleanMonitor (), null, "localBooleanMonitor", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getItem_DefaultMonitorDemote (), ecorePackage.getEString (), "defaultMonitorDemote", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( summaryGroupEClass, SummaryGroup.class, "SummaryGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getSummaryGroup_Id (), ecorePackage.getEString (), "id", null, 1, 1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSummaryGroup_Hierarchy (), ecorePackage.getEString (), "hierarchy", null, 0, -1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSummaryGroup_DataSourceIds (), ecorePackage.getEString (), "dataSourceIds", null, 0, -1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSummaryGroup_Retain (), ecorePackage.getEBoolean (), "retain", "false", 0, 1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getSummaryGroup_SubSummaryIds (), ecorePackage.getEString (), "subSummaryIds", null, 0, -1, SummaryGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( formulaItemEClass, FormulaItem.class, "FormulaItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getFormulaItem_InputFormula (), ecorePackage.getEString (), "inputFormula", null, 0, 1, FormulaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getFormulaItem_OutputFormula (), ecorePackage.getEString (), "outputFormula", null, 0, 1, FormulaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getFormulaItem_Inputs (), this.getFormulaInput (), null, "inputs", null, 0, -1, FormulaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getFormulaItem_OutputDatasourceId (), ecorePackage.getEString (), "outputDatasourceId", null, 0, 1, FormulaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getFormulaItem_WriteValueName (), ecorePackage.getEString (), "writeValueName", null, 0, 1, FormulaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getFormulaItem_InitScript (), ecorePackage.getEString (), "initScript", null, 0, 1, FormulaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getFormulaItem_OutputDatasourceType (), this.getDataType (), "outputDatasourceType", null, 0, 1, FormulaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getFormulaItem_ScriptModules (), this.getScriptModule (), null, "scriptModules", null, 0, -1, FormulaItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( formulaInputEClass, FormulaInput.class, "FormulaInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getFormulaInput_Name (), ecorePackage.getEString (), "name", null, 1, 1, FormulaInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getFormulaInput_DatasourceId (), ecorePackage.getEString (), "datasourceId", null, 1, 1, FormulaInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getFormulaInput_Type (), this.getDataType (), "type", null, 1, 1, FormulaInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( scriptModuleEClass, ScriptModule.class, "ScriptModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getScriptModule_Data (), ecorePackage.getEString (), "data", null, 1, 1, ScriptModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getScriptModule_Resource (), ecorePackage.getEBoolean (), "resource", "false", 1, 1, ScriptModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getModel_Items (), this.getItem (), null, "items", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getModel_Averages (), this.getAverage (), null, "averages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getModel_MovingAverages (), this.getMovingAverage (), null, "movingAverages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getModel_Summaries (), this.getSummaryGroup (), null, "summaries", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( scriptItemEClass, ScriptItem.class, "ScriptItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getScriptItem_ScriptEngine (), ecorePackage.getEString (), "scriptEngine", null, 0, 1, ScriptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getScriptItem_Inputs (), this.getFormulaInput (), null, "inputs", null, 0, -1, ScriptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getScriptItem_InitScript (), ecorePackage.getEString (), "initScript", null, 0, 1, ScriptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getScriptItem_UpdateScript (), ecorePackage.getEString (), "updateScript", null, 0, 1, ScriptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getScriptItem_TimerScript (), ecorePackage.getEString (), "timerScript", null, 0, 1, ScriptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getScriptItem_TimerPeriod (), ecorePackage.getELongObject (), "timerPeriod", null, 0, 1, ScriptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEReference ( getScriptItem_Outputs (), this.getScriptOutput (), null, "outputs", null, 0, -1, ScriptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getScriptItem_WriteCommand (), ecorePackage.getEString (), "writeCommand", null, 0, 1, ScriptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        EOperation op = addEOperation ( scriptItemEClass, null, "addInput", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, ecorePackage.getEString (), "name", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, ecorePackage.getEString (), "datasourceId", 0, 1, IS_UNIQUE, IS_ORDERED );
        addEParameter ( op, this.getDataType (), "dataType", 0, 1, IS_UNIQUE, IS_ORDERED );

        initEClass ( scriptOutputEClass, ScriptOutput.class, "ScriptOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getScriptOutput_DatasourceId (), ecorePackage.getEString (), "datasourceId", null, 1, 1, ScriptOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getScriptOutput_Name (), ecorePackage.getEString (), "name", null, 1, 1, ScriptOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( mapperEClass, Mapper.class, "Mapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getMapper_MapperId (), ecorePackage.getEString (), "mapperId", null, 1, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getMapper_FromAttribute (), ecorePackage.getEString (), "fromAttribute", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getMapper_ToAttribute (), ecorePackage.getEString (), "toAttribute", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( monitorEClass, Monitor.class, "Monitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getMonitor_Active (), ecorePackage.getEBoolean (), "active", "true", 1, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( levelMonitorEClass, LevelMonitor.class, "LevelMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getLevelMonitor_Preset (), ecorePackage.getEDoubleObject (), "preset", null, 0, 1, LevelMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( listMonitorEClass, ListMonitor.class, "ListMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getListMonitor_Entries (), this.getListMonitorEntry (), null, "entries", null, 0, -1, ListMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getListMonitor_DefaultAck (), ecorePackage.getEBoolean (), "defaultAck", "false", 1, 1, ListMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getListMonitor_DefaultSeverity (), this.getListSeverity (), "defaultSeverity", "OK", 1, 1, ListMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( booleanMonitorEClass, BooleanMonitor.class, "BooleanMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getBooleanMonitor_OkValue (), ecorePackage.getEBoolean (), "okValue", null, 1, 1, BooleanMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( averageEClass, Average.class, "Average", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getAverage_Id (), ecorePackage.getEString (), "id", null, 1, 1, Average.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getAverage_Sources (), ecorePackage.getEString (), "sources", null, 0, -1, Average.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getAverage_PercentRequired (), ecorePackage.getEDouble (), "percentRequired", "1.0", 0, 1, Average.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( averageItemEClass, AverageItem.class, "AverageItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getAverageItem_Average (), this.getAverage (), null, "average", null, 1, 1, AverageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        getAverageItem_Average ().getEKeys ().add ( this.getAverage_Id () );
        initEAttribute ( getAverageItem_Type (), this.getAverageReferenceType (), "type", "MEAN", 0, 1, AverageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( constantItemEClass, ConstantItem.class, "ConstantItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );

        initEClass ( movingAverageItemEClass, MovingAverageItem.class, "MovingAverageItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEReference ( getMovingAverageItem_Average (), this.getMovingAverage (), null, "average", null, 1, 1, MovingAverageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        getMovingAverageItem_Average ().getEKeys ().add ( this.getMovingAverage_Id () );
        initEAttribute ( getMovingAverageItem_Type (), this.getMovingAverageReferenceType (), "type", null, 1, 1, MovingAverageItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( movingAverageEClass, MovingAverage.class, "MovingAverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getMovingAverage_Id (), ecorePackage.getEString (), "id", null, 1, 1, MovingAverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getMovingAverage_Source (), ecorePackage.getEString (), "source", null, 1, 1, MovingAverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getMovingAverage_Trigger (), ecorePackage.getELongObject (), "trigger", null, 0, 1, MovingAverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getMovingAverage_Range (), ecorePackage.getELongObject (), "range", null, 0, 1, MovingAverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getMovingAverage_NullRange (), ecorePackage.getELongObject (), "nullRange", null, 0, 1, MovingAverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( listMonitorEntryEClass, ListMonitorEntry.class, "ListMonitorEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getListMonitorEntry_Value (), this.getVariant (), "value", null, 1, 1, ListMonitorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getListMonitorEntry_Severity (), this.getListSeverity (), "severity", null, 0, 1, ListMonitorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getListMonitorEntry_RequireAck (), ecorePackage.getEBooleanObject (), "requireAck", null, 0, 1, ListMonitorEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        initEClass ( basicMonitorEClass, BasicMonitor.class, "BasicMonitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS );
        initEAttribute ( getBasicMonitor_Ack (), ecorePackage.getEBoolean (), "ack", "true", 1, 1, BasicMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );
        initEAttribute ( getBasicMonitor_Severity (), this.getSeverity (), "severity", "ERROR", 1, 1, BasicMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED );

        // Initialize enums and add enum literals
        initEEnum ( dataTypeEEnum, DataType.class, "DataType" );
        addEEnumLiteral ( dataTypeEEnum, DataType.VARIANT );
        addEEnumLiteral ( dataTypeEEnum, DataType.FLOAT );
        addEEnumLiteral ( dataTypeEEnum, DataType.STRING );
        addEEnumLiteral ( dataTypeEEnum, DataType.BOOLEAN );
        addEEnumLiteral ( dataTypeEEnum, DataType.INTEGER );
        addEEnumLiteral ( dataTypeEEnum, DataType.LONG_INTEGER );

        initEEnum ( roundingEEnum, Rounding.class, "Rounding" );
        addEEnumLiteral ( roundingEEnum, Rounding.NONE );
        addEEnumLiteral ( roundingEEnum, Rounding.ROUND );
        addEEnumLiteral ( roundingEEnum, Rounding.CEIL );
        addEEnumLiteral ( roundingEEnum, Rounding.FLOOR );

        initEEnum ( averageReferenceTypeEEnum, AverageReferenceType.class, "AverageReferenceType" );
        addEEnumLiteral ( averageReferenceTypeEEnum, AverageReferenceType.MIN );
        addEEnumLiteral ( averageReferenceTypeEEnum, AverageReferenceType.MAX );
        addEEnumLiteral ( averageReferenceTypeEEnum, AverageReferenceType.MEAN );
        addEEnumLiteral ( averageReferenceTypeEEnum, AverageReferenceType.MEDIAN );
        addEEnumLiteral ( averageReferenceTypeEEnum, AverageReferenceType.DEVIATION );
        addEEnumLiteral ( averageReferenceTypeEEnum, AverageReferenceType.SUM );

        initEEnum ( movingAverageReferenceTypeEEnum, MovingAverageReferenceType.class, "MovingAverageReferenceType" );
        addEEnumLiteral ( movingAverageReferenceTypeEEnum, MovingAverageReferenceType.MIN );
        addEEnumLiteral ( movingAverageReferenceTypeEEnum, MovingAverageReferenceType.MAX );
        addEEnumLiteral ( movingAverageReferenceTypeEEnum, MovingAverageReferenceType.MEDIAN );
        addEEnumLiteral ( movingAverageReferenceTypeEEnum, MovingAverageReferenceType.ARITHMETIC );
        addEEnumLiteral ( movingAverageReferenceTypeEEnum, MovingAverageReferenceType.WEIGHTED );
        addEEnumLiteral ( movingAverageReferenceTypeEEnum, MovingAverageReferenceType.DEVIATION_ARITHMETIC );
        addEEnumLiteral ( movingAverageReferenceTypeEEnum, MovingAverageReferenceType.DEVIATION_WEIGHTED );

        // Initialize data types
        initEDataType ( variantEDataType, Variant.class, "Variant", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType ( listSeverityEDataType, String.class, "ListSeverity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );
        initEDataType ( severityEDataType, Severity.class, "Severity", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS );

        // Create resource
        createResource ( eNS_URI );

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations ();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations ()
    {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        addAnnotation ( getItem_Alias (), source, new String[] { "namespace", "" } );
        addAnnotation ( listSeverityEDataType, source, new String[] { "enumeration", "OK INFORMATION WARNING ALARM ERROR" } );
        addAnnotation ( severityEDataType, source, new String[] { "enumeration", "INFORMATION WARNING ALARM ERROR" } );
    }

} //ModelPackageImpl
