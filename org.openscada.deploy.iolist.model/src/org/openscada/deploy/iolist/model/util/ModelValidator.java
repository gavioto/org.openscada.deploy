/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.util;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
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

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see org.openscada.deploy.iolist.model.ModelPackage
 * @generated
 */
public class ModelValidator extends EObjectValidator
{
    /**
     * The cached model package
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public static final ModelValidator INSTANCE = new ModelValidator ();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.openscada.deploy.iolist.model";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ModelValidator ()
    {
        super ();
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage ()
    {
        return ModelPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate ( int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        switch ( classifierID )
        {
        case ModelPackage.ITEM:
            return validateItem ( (Item)value, diagnostics, context );
        case ModelPackage.SUMMARY_GROUP:
            return validateSummaryGroup ( (SummaryGroup)value, diagnostics, context );
        case ModelPackage.FORMULA_ITEM:
            return validateFormulaItem ( (FormulaItem)value, diagnostics, context );
        case ModelPackage.FORMULA_INPUT:
            return validateFormulaInput ( (FormulaInput)value, diagnostics, context );
        case ModelPackage.SCRIPT_MODULE:
            return validateScriptModule ( (ScriptModule)value, diagnostics, context );
        case ModelPackage.MODEL:
            return validateModel ( (Model)value, diagnostics, context );
        case ModelPackage.SCRIPT_ITEM:
            return validateScriptItem ( (ScriptItem)value, diagnostics, context );
        case ModelPackage.SCRIPT_OUTPUT:
            return validateScriptOutput ( (ScriptOutput)value, diagnostics, context );
        case ModelPackage.MAPPER:
            return validateMapper ( (Mapper)value, diagnostics, context );
        case ModelPackage.MONITOR:
            return validateMonitor ( (Monitor)value, diagnostics, context );
        case ModelPackage.LEVEL_MONITOR:
            return validateLevelMonitor ( (LevelMonitor)value, diagnostics, context );
        case ModelPackage.LIST_MONITOR:
            return validateListMonitor ( (ListMonitor)value, diagnostics, context );
        case ModelPackage.BOOLEAN_MONITOR:
            return validateBooleanMonitor ( (BooleanMonitor)value, diagnostics, context );
        case ModelPackage.AVERAGE:
            return validateAverage ( (Average)value, diagnostics, context );
        case ModelPackage.AVERAGE_ITEM:
            return validateAverageItem ( (AverageItem)value, diagnostics, context );
        case ModelPackage.CONSTANT_ITEM:
            return validateConstantItem ( (ConstantItem)value, diagnostics, context );
        case ModelPackage.MOVING_AVERAGE_ITEM:
            return validateMovingAverageItem ( (MovingAverageItem)value, diagnostics, context );
        case ModelPackage.MOVING_AVERAGE:
            return validateMovingAverage ( (MovingAverage)value, diagnostics, context );
        case ModelPackage.LIST_MONITOR_ENTRY:
            return validateListMonitorEntry ( (ListMonitorEntry)value, diagnostics, context );
        case ModelPackage.BASIC_MONITOR:
            return validateBasicMonitor ( (BasicMonitor)value, diagnostics, context );
        case ModelPackage.DATA_TYPE:
            return validateDataType ( (DataType)value, diagnostics, context );
        case ModelPackage.ROUNDING:
            return validateRounding ( (Rounding)value, diagnostics, context );
        case ModelPackage.AVERAGE_REFERENCE_TYPE:
            return validateAverageReferenceType ( (AverageReferenceType)value, diagnostics, context );
        case ModelPackage.MOVING_AVERAGE_REFERENCE_TYPE:
            return validateMovingAverageReferenceType ( (MovingAverageReferenceType)value, diagnostics, context );
        case ModelPackage.VARIANT:
            return validateVariant ( (Variant)value, diagnostics, context );
        case ModelPackage.LIST_SEVERITY:
            return validateListSeverity ( (String)value, diagnostics, context );
        case ModelPackage.SEVERITY:
            return validateSeverity ( (Severity)value, diagnostics, context );
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateItem ( Item item, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( item, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSummaryGroup ( SummaryGroup summaryGroup, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( summaryGroup, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFormulaItem ( FormulaItem formulaItem, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( formulaItem, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateFormulaInput ( FormulaInput formulaInput, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( formulaInput, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScriptModule ( ScriptModule scriptModule, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( scriptModule, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateModel ( Model model, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( model, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScriptItem ( ScriptItem scriptItem, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( scriptItem, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateScriptOutput ( ScriptOutput scriptOutput, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( scriptOutput, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMapper ( Mapper mapper, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( mapper, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMonitor ( Monitor monitor, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( monitor, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateLevelMonitor ( LevelMonitor levelMonitor, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( levelMonitor, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateListMonitor ( ListMonitor listMonitor, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( listMonitor, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBooleanMonitor ( BooleanMonitor booleanMonitor, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( booleanMonitor, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAverage ( Average average, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( average, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAverageItem ( AverageItem averageItem, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( averageItem, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateConstantItem ( ConstantItem constantItem, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( constantItem, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMovingAverageItem ( MovingAverageItem movingAverageItem, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( movingAverageItem, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMovingAverage ( MovingAverage movingAverage, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( movingAverage, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateListMonitorEntry ( ListMonitorEntry listMonitorEntry, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( listMonitorEntry, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateBasicMonitor ( BasicMonitor basicMonitor, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return validate_EveryDefaultConstraint ( basicMonitor, diagnostics, context );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateDataType ( DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateRounding ( Rounding rounding, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateAverageReferenceType ( AverageReferenceType averageReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMovingAverageReferenceType ( MovingAverageReferenceType movingAverageReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateVariant ( Variant variant, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateListSeverity ( String listSeverity, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        boolean result = validateListSeverity_Enumeration ( listSeverity, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @see #validateListSeverity_Enumeration
     */
    public static final Collection<Object> LIST_SEVERITY__ENUMERATION__VALUES = wrapEnumerationValues ( new Object[] { "OK", "INFORMATION", "WARNING", "ALARM", "ERROR" } );

    /**
     * Validates the Enumeration constraint of '<em>List Severity</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateListSeverity_Enumeration ( String listSeverity, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        boolean result = LIST_SEVERITY__ENUMERATION__VALUES.contains ( listSeverity );
        if ( !result && diagnostics != null )
            reportEnumerationViolation ( ModelPackage.Literals.LIST_SEVERITY, listSeverity, LIST_SEVERITY__ENUMERATION__VALUES, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSeverity ( Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        boolean result = validateSeverity_Enumeration ( severity, diagnostics, context );
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     * @see #validateSeverity_Enumeration
     */
    public static final Collection<Object> SEVERITY__ENUMERATION__VALUES = wrapEnumerationValues ( new Object[] { ModelFactory.eINSTANCE.createFromString ( ModelPackage.eINSTANCE.getSeverity (), "INFORMATION" ), ModelFactory.eINSTANCE.createFromString ( ModelPackage.eINSTANCE.getSeverity (), "WARNING" ), ModelFactory.eINSTANCE.createFromString ( ModelPackage.eINSTANCE.getSeverity (), "ALARM" ), ModelFactory.eINSTANCE.createFromString ( ModelPackage.eINSTANCE.getSeverity (), "ERROR" ) } );

    /**
     * Validates the Enumeration constraint of '<em>Severity</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public boolean validateSeverity_Enumeration ( Severity severity, DiagnosticChain diagnostics, Map<Object, Object> context )
    {
        boolean result = SEVERITY__ENUMERATION__VALUES.contains ( severity );
        if ( !result && diagnostics != null )
            reportEnumerationViolation ( ModelPackage.Literals.SEVERITY, severity, SEVERITY__ENUMERATION__VALUES, diagnostics, context );
        return result;
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator ()
    {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator ();
    }

} //ModelValidator
