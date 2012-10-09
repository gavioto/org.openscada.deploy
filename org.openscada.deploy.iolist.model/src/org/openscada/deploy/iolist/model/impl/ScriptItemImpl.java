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
import org.openscada.deploy.iolist.model.FormulaInput;
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
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getScriptEngine <em>Script Engine</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getInitScript <em>Init Script</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getUpdateScript <em>Update Script</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getTimerScript <em>Timer Script</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getTimerPeriod <em>Timer Period</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ScriptItemImpl#getWriteCommand <em>Write Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptItemImpl extends ItemImpl implements ScriptItem
{
    /**
     * The default value of the '{@link #getScriptEngine() <em>Script Engine</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptEngine()
     * @generated
     * @ordered
     */
    protected static final String SCRIPT_ENGINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScriptEngine() <em>Script Engine</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScriptEngine()
     * @generated
     * @ordered
     */
    protected String scriptEngine = SCRIPT_ENGINE_EDEFAULT;

    /**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
    protected EList<FormulaInput> inputs;

    /**
     * The default value of the '{@link #getInitScript() <em>Init Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitScript()
     * @generated
     * @ordered
     */
    protected static final String INIT_SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitScript() <em>Init Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitScript()
     * @generated
     * @ordered
     */
    protected String initScript = INIT_SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getUpdateScript() <em>Update Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdateScript()
     * @generated
     * @ordered
     */
    protected static final String UPDATE_SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpdateScript() <em>Update Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdateScript()
     * @generated
     * @ordered
     */
    protected String updateScript = UPDATE_SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getTimerScript() <em>Timer Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimerScript()
     * @generated
     * @ordered
     */
    protected static final String TIMER_SCRIPT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimerScript() <em>Timer Script</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimerScript()
     * @generated
     * @ordered
     */
    protected String timerScript = TIMER_SCRIPT_EDEFAULT;

    /**
     * The default value of the '{@link #getTimerPeriod() <em>Timer Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimerPeriod()
     * @generated
     * @ordered
     */
    protected static final Long TIMER_PERIOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimerPeriod() <em>Timer Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimerPeriod()
     * @generated
     * @ordered
     */
    protected Long timerPeriod = TIMER_PERIOD_EDEFAULT;

    /**
     * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputs()
     * @generated
     * @ordered
     */
    protected EList<ScriptOutput> outputs;

    /**
     * The default value of the '{@link #getWriteCommand() <em>Write Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteCommand()
     * @generated
     * @ordered
     */
    protected static final String WRITE_COMMAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWriteCommand() <em>Write Command</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteCommand()
     * @generated
     * @ordered
     */
    protected String writeCommand = WRITE_COMMAND_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScriptItemImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
     * @generated
     */
    public String getScriptEngine ()
    {
        return scriptEngine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScriptEngine ( String newScriptEngine )
    {
        String oldScriptEngine = scriptEngine;
        scriptEngine = newScriptEngine;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__SCRIPT_ENGINE, oldScriptEngine, scriptEngine ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FormulaInput> getInputs ()
    {
        if ( inputs == null )
        {
            inputs = new EObjectContainmentEList<FormulaInput> ( FormulaInput.class, this, ModelPackage.SCRIPT_ITEM__INPUTS );
        }
        return inputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInitScript ()
    {
        return initScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitScript ( String newInitScript )
    {
        String oldInitScript = initScript;
        initScript = newInitScript;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__INIT_SCRIPT, oldInitScript, initScript ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUpdateScript ()
    {
        return updateScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpdateScript ( String newUpdateScript )
    {
        String oldUpdateScript = updateScript;
        updateScript = newUpdateScript;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__UPDATE_SCRIPT, oldUpdateScript, updateScript ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTimerScript ()
    {
        return timerScript;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimerScript ( String newTimerScript )
    {
        String oldTimerScript = timerScript;
        timerScript = newTimerScript;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__TIMER_SCRIPT, oldTimerScript, timerScript ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Long getTimerPeriod ()
    {
        return timerPeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimerPeriod ( Long newTimerPeriod )
    {
        Long oldTimerPeriod = timerPeriod;
        timerPeriod = newTimerPeriod;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__TIMER_PERIOD, oldTimerPeriod, timerPeriod ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ScriptOutput> getOutputs ()
    {
        if ( outputs == null )
        {
            outputs = new EObjectContainmentEList<ScriptOutput> ( ScriptOutput.class, this, ModelPackage.SCRIPT_ITEM__OUTPUTS );
        }
        return outputs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWriteCommand ()
    {
        return writeCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWriteCommand ( String newWriteCommand )
    {
        String oldWriteCommand = writeCommand;
        writeCommand = newWriteCommand;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SCRIPT_ITEM__WRITE_COMMAND, oldWriteCommand, writeCommand ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( InternalEObject otherEnd, int featureID, NotificationChain msgs )
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
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
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
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( int featureID, Object newValue )
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
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
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
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case ModelPackage.SCRIPT_ITEM__SCRIPT_ENGINE:
                return SCRIPT_ENGINE_EDEFAULT == null ? scriptEngine != null : !SCRIPT_ENGINE_EDEFAULT.equals ( scriptEngine );
            case ModelPackage.SCRIPT_ITEM__INPUTS:
                return inputs != null && !inputs.isEmpty ();
            case ModelPackage.SCRIPT_ITEM__INIT_SCRIPT:
                return INIT_SCRIPT_EDEFAULT == null ? initScript != null : !INIT_SCRIPT_EDEFAULT.equals ( initScript );
            case ModelPackage.SCRIPT_ITEM__UPDATE_SCRIPT:
                return UPDATE_SCRIPT_EDEFAULT == null ? updateScript != null : !UPDATE_SCRIPT_EDEFAULT.equals ( updateScript );
            case ModelPackage.SCRIPT_ITEM__TIMER_SCRIPT:
                return TIMER_SCRIPT_EDEFAULT == null ? timerScript != null : !TIMER_SCRIPT_EDEFAULT.equals ( timerScript );
            case ModelPackage.SCRIPT_ITEM__TIMER_PERIOD:
                return TIMER_PERIOD_EDEFAULT == null ? timerPeriod != null : !TIMER_PERIOD_EDEFAULT.equals ( timerPeriod );
            case ModelPackage.SCRIPT_ITEM__OUTPUTS:
                return outputs != null && !outputs.isEmpty ();
            case ModelPackage.SCRIPT_ITEM__WRITE_COMMAND:
                return WRITE_COMMAND_EDEFAULT == null ? writeCommand != null : !WRITE_COMMAND_EDEFAULT.equals ( writeCommand );
        }
        return super.eIsSet ( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString ()
    {
        if ( eIsProxy () )
            return super.toString ();

        StringBuffer result = new StringBuffer ( super.toString () );
        result.append ( " (scriptEngine: " );
        result.append ( scriptEngine );
        result.append ( ", initScript: " );
        result.append ( initScript );
        result.append ( ", updateScript: " );
        result.append ( updateScript );
        result.append ( ", timerScript: " );
        result.append ( timerScript );
        result.append ( ", timerPeriod: " );
        result.append ( timerPeriod );
        result.append ( ", writeCommand: " );
        result.append ( writeCommand );
        result.append ( ')' );
        return result.toString ();
    }

} //ScriptItemImpl
