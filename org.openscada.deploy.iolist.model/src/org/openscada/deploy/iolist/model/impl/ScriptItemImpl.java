/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.deploy.iolist.model.DataType;
import org.openscada.deploy.iolist.model.FormulaInput;
import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.ScriptItem;
import org.openscada.deploy.iolist.model.ScriptOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getScriptEngine
 * <em>Script Engine</em>}</li>
 * <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getInputs
 * <em>Inputs</em>}</li>
 * <li>
 * {@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getInitScript
 * <em>Init Script</em>}</li>
 * <li>
 * {@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getUpdateScript
 * <em>Update Script</em>}</li>
 * <li>
 * {@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getTimerScript
 * <em>Timer Script</em>}</li>
 * <li>
 * {@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getTimerPeriod
 * <em>Timer Period</em>}</li>
 * <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getOutputs
 * <em>Outputs</em>}</li>
 * <li>
 * {@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getWriteCommand
 * <em>Write Command</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ScriptItemImpl extends ItemImpl implements ScriptItem
{
    /**
     * The default value of the '{@link #getScriptEngine()
     * <em>Script Engine</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getScriptEngine()
     * @generated
     * @ordered
     */
    protected static final String SCRIPT_ENGINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScriptEngine()
     * <em>Script Engine</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getScriptEngine()
     * @generated
     * @ordered
     */
    protected String scriptEngine = SCRIPT_ENGINE_EDEFAULT;

    /**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}'
     * containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected EList<FormulaInput> inputs;

    /**
     * The default value of the '{@link #getInitScript() <em>Init Script</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getInitScript()
     * @generated
     * @ordered
     */
    protected static final String INIT_SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitScript() <em>Init Script</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getInitScript()
     * @generated
     * @ordered
     */
    protected String initScript = INIT_SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getUpdateScript()
     * <em>Update Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUpdateScript()
     * @generated
     * @ordered
     */
    protected static final String UPDATE_SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpdateScript()
     * <em>Update Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getUpdateScript()
     * @generated
     * @ordered
     */
    protected String updateScript = UPDATE_SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getTimerScript() <em>Timer Script</em>}
     * ' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTimerScript()
     * @generated
     * @ordered
     */
    protected static final String TIMER_SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimerScript() <em>Timer Script</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTimerScript()
     * @generated
     * @ordered
     */
    protected String timerScript = TIMER_SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getTimerPeriod() <em>Timer Period</em>}
     * ' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTimerPeriod()
     * @generated
     * @ordered
     */
    protected static final Long TIMER_PERIOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimerPeriod() <em>Timer Period</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getTimerPeriod()
     * @generated
     * @ordered
     */
    protected Long timerPeriod = TIMER_PERIOD_EDEFAULT;

    /**
     * The cached value of the '{@link #getOutputs() <em>Outputs</em>}'
     * containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getOutputs()
     * @generated
     * @ordered
     */
    protected EList<ScriptOutput> outputs;

    /**
     * The default value of the '{@link #getWriteCommand()
     * <em>Write Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getWriteCommand()
     * @generated
     * @ordered
     */
    protected static final String WRITE_COMMAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWriteCommand()
     * <em>Write Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getWriteCommand()
     * @generated
     * @ordered
     */
    protected String writeCommand = WRITE_COMMAND_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ScriptItemImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return ModelPackage.Literals.SCRIPT_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getScriptEngine ()
    {
        return this.scriptEngine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setScriptEngine ( final String newScriptEngine )
    {
        final String oldScriptEngine = this.scriptEngine;
        this.scriptEngine = newScriptEngine;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__SCRIPT_ENGINE, oldScriptEngine, this.scriptEngine ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<FormulaInput> getInputs ()
    {
        if ( this.inputs == null )
        {
            this.inputs = new EObjectContainmentEList<FormulaInput> ( FormulaInput.class, this, ModelPackage.SCRIPT_ITEM__INPUTS );
        }
        return this.inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getInitScript ()
    {
        return this.initScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setInitScript ( final String newInitScript )
    {
        final String oldInitScript = this.initScript;
        this.initScript = newInitScript;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__INIT_SCRIPT, oldInitScript, this.initScript ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getUpdateScript ()
    {
        return this.updateScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setUpdateScript ( final String newUpdateScript )
    {
        final String oldUpdateScript = this.updateScript;
        this.updateScript = newUpdateScript;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__UPDATE_SCRIPT, oldUpdateScript, this.updateScript ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getTimerScript ()
    {
        return this.timerScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTimerScript ( final String newTimerScript )
    {
        final String oldTimerScript = this.timerScript;
        this.timerScript = newTimerScript;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__TIMER_SCRIPT, oldTimerScript, this.timerScript ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Long getTimerPeriod ()
    {
        return this.timerPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTimerPeriod ( final Long newTimerPeriod )
    {
        final Long oldTimerPeriod = this.timerPeriod;
        this.timerPeriod = newTimerPeriod;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__TIMER_PERIOD, oldTimerPeriod, this.timerPeriod ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<ScriptOutput> getOutputs ()
    {
        if ( this.outputs == null )
        {
            this.outputs = new EObjectContainmentEList<ScriptOutput> ( ScriptOutput.class, this, ModelPackage.SCRIPT_ITEM__OUTPUTS );
        }
        return this.outputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getWriteCommand ()
    {
        return this.writeCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setWriteCommand ( final String newWriteCommand )
    {
        final String oldWriteCommand = this.writeCommand;
        this.writeCommand = newWriteCommand;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__WRITE_COMMAND, oldWriteCommand, this.writeCommand ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void addInput ( final String name, final String datasourceId, final DataType dataType )
    {
        final FormulaInput input = ModelFactory.eINSTANCE.createFormulaInput ();
        input.setName ( name );
        input.setDatasourceId ( datasourceId );
        input.setType ( dataType );
        getInputs ().add ( input );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
    {
        switch ( featureID )
        {
            case ModelPackage.SCRIPT_ITEM__INPUTS:
                return ( (InternalEList<?>)getInputs () ).basicRemove ( otherEnd, msgs );
            case ModelPackage.SCRIPT_ITEM__OUTPUTS:
                return ( (InternalEList<?>)getOutputs () ).basicRemove ( otherEnd, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet ( final int featureID, final boolean resolve, final boolean coreType )
    {
        switch ( featureID )
        {
            case ModelPackage.SCRIPT_ITEM__SCRIPT_ENGINE:
                return getScriptEngine ();
            case ModelPackage.SCRIPT_ITEM__INPUTS:
                return getInputs ();
            case ModelPackage.SCRIPT_ITEM__INIT_SCRIPT:
                return getInitScript ();
            case ModelPackage.SCRIPT_ITEM__UPDATE_SCRIPT:
                return getUpdateScript ();
            case ModelPackage.SCRIPT_ITEM__TIMER_SCRIPT:
                return getTimerScript ();
            case ModelPackage.SCRIPT_ITEM__TIMER_PERIOD:
                return getTimerPeriod ();
            case ModelPackage.SCRIPT_ITEM__OUTPUTS:
                return getOutputs ();
            case ModelPackage.SCRIPT_ITEM__WRITE_COMMAND:
                return getWriteCommand ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( final int featureID, final Object newValue )
    {
        switch ( featureID )
        {
            case ModelPackage.SCRIPT_ITEM__SCRIPT_ENGINE:
                setScriptEngine ( (String)newValue );
                return;
            case ModelPackage.SCRIPT_ITEM__INPUTS:
                getInputs ().clear ();
                getInputs ().addAll ( (Collection<? extends FormulaInput>)newValue );
                return;
            case ModelPackage.SCRIPT_ITEM__INIT_SCRIPT:
                setInitScript ( (String)newValue );
                return;
            case ModelPackage.SCRIPT_ITEM__UPDATE_SCRIPT:
                setUpdateScript ( (String)newValue );
                return;
            case ModelPackage.SCRIPT_ITEM__TIMER_SCRIPT:
                setTimerScript ( (String)newValue );
                return;
            case ModelPackage.SCRIPT_ITEM__TIMER_PERIOD:
                setTimerPeriod ( (Long)newValue );
                return;
            case ModelPackage.SCRIPT_ITEM__OUTPUTS:
                getOutputs ().clear ();
                getOutputs ().addAll ( (Collection<? extends ScriptOutput>)newValue );
                return;
            case ModelPackage.SCRIPT_ITEM__WRITE_COMMAND:
                setWriteCommand ( (String)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset ( final int featureID )
    {
        switch ( featureID )
        {
            case ModelPackage.SCRIPT_ITEM__SCRIPT_ENGINE:
                setScriptEngine ( SCRIPT_ENGINE_EDEFAULT );
                return;
            case ModelPackage.SCRIPT_ITEM__INPUTS:
                getInputs ().clear ();
                return;
            case ModelPackage.SCRIPT_ITEM__INIT_SCRIPT:
                setInitScript ( INIT_SCRIPT_EDEFAULT );
                return;
            case ModelPackage.SCRIPT_ITEM__UPDATE_SCRIPT:
                setUpdateScript ( UPDATE_SCRIPT_EDEFAULT );
                return;
            case ModelPackage.SCRIPT_ITEM__TIMER_SCRIPT:
                setTimerScript ( TIMER_SCRIPT_EDEFAULT );
                return;
            case ModelPackage.SCRIPT_ITEM__TIMER_PERIOD:
                setTimerPeriod ( TIMER_PERIOD_EDEFAULT );
                return;
            case ModelPackage.SCRIPT_ITEM__OUTPUTS:
                getOutputs ().clear ();
                return;
            case ModelPackage.SCRIPT_ITEM__WRITE_COMMAND:
                setWriteCommand ( WRITE_COMMAND_EDEFAULT );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet ( final int featureID )
    {
        switch ( featureID )
        {
            case ModelPackage.SCRIPT_ITEM__SCRIPT_ENGINE:
                return SCRIPT_ENGINE_EDEFAULT == null ? this.scriptEngine != null : !SCRIPT_ENGINE_EDEFAULT.equals ( this.scriptEngine );
            case ModelPackage.SCRIPT_ITEM__INPUTS:
                return this.inputs != null && !this.inputs.isEmpty ();
            case ModelPackage.SCRIPT_ITEM__INIT_SCRIPT:
                return INIT_SCRIPT_EDEFAULT == null ? this.initScript != null : !INIT_SCRIPT_EDEFAULT.equals ( this.initScript );
            case ModelPackage.SCRIPT_ITEM__UPDATE_SCRIPT:
                return UPDATE_SCRIPT_EDEFAULT == null ? this.updateScript != null : !UPDATE_SCRIPT_EDEFAULT.equals ( this.updateScript );
            case ModelPackage.SCRIPT_ITEM__TIMER_SCRIPT:
                return TIMER_SCRIPT_EDEFAULT == null ? this.timerScript != null : !TIMER_SCRIPT_EDEFAULT.equals ( this.timerScript );
            case ModelPackage.SCRIPT_ITEM__TIMER_PERIOD:
                return TIMER_PERIOD_EDEFAULT == null ? this.timerPeriod != null : !TIMER_PERIOD_EDEFAULT.equals ( this.timerPeriod );
            case ModelPackage.SCRIPT_ITEM__OUTPUTS:
                return this.outputs != null && !this.outputs.isEmpty ();
            case ModelPackage.SCRIPT_ITEM__WRITE_COMMAND:
                return WRITE_COMMAND_EDEFAULT == null ? this.writeCommand != null : !WRITE_COMMAND_EDEFAULT.equals ( this.writeCommand );
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
        {
            return super.toString ();
        }

        final StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (scriptEngine: " );
        result.append ( this.scriptEngine );
        result.append ( ", initScript: " );
        result.append ( this.initScript );
        result.append ( ", updateScript: " );
        result.append ( this.updateScript );
        result.append ( ", timerScript: " );
        result.append ( this.timerScript );
        result.append ( ", timerPeriod: " );
        result.append ( this.timerPeriod );
        result.append ( ", writeCommand: " );
        result.append ( this.writeCommand );
        result.append ( ')' );
        return result.toString ();
    }

} //ScriptItemImpl
