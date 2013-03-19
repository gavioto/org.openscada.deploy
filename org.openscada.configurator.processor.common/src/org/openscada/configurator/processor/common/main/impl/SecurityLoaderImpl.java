/**
 */
package org.openscada.configurator.processor.common.main.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openscada.configuration.model.GenericMasterConfigurationSlot;
import org.openscada.configuration.model.Project;

import org.openscada.configurator.processor.common.main.MainPackage;
import org.openscada.configurator.processor.common.main.SecurityLoader;

import org.openscada.configurator.sec.Rules;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.main.impl.SecurityLoaderImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.main.impl.SecurityLoaderImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityLoaderImpl extends EObjectImpl implements SecurityLoader
{
    /**
     * The cached value of the '{@link #getRules() <em>Rules</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected Rules rules;

    /**
     * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlot()
     * @generated
     * @ordered
     */
    protected GenericMasterConfigurationSlot slot;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SecurityLoaderImpl ()
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
        return MainPackage.Literals.SECURITY_LOADER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rules getRules ()
    {
        if ( rules != null && rules.eIsProxy () )
        {
            InternalEObject oldRules = (InternalEObject)rules;
            rules = (Rules)eResolveProxy ( oldRules );
            if ( rules != oldRules )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, MainPackage.SECURITY_LOADER__RULES, oldRules, rules ) );
            }
        }
        return rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rules basicGetRules ()
    {
        return rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRules ( Rules newRules )
    {
        Rules oldRules = rules;
        rules = newRules;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, MainPackage.SECURITY_LOADER__RULES, oldRules, rules ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericMasterConfigurationSlot getSlot ()
    {
        if ( slot != null && slot.eIsProxy () )
        {
            InternalEObject oldSlot = (InternalEObject)slot;
            slot = (GenericMasterConfigurationSlot)eResolveProxy ( oldSlot );
            if ( slot != oldSlot )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, MainPackage.SECURITY_LOADER__SLOT, oldSlot, slot ) );
            }
        }
        return slot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericMasterConfigurationSlot basicGetSlot ()
    {
        return slot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSlot ( GenericMasterConfigurationSlot newSlot )
    {
        GenericMasterConfigurationSlot oldSlot = slot;
        slot = newSlot;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, MainPackage.SECURITY_LOADER__SLOT, oldSlot, slot ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void process ( Project project ) throws Exception
    {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException ();
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
            case MainPackage.SECURITY_LOADER__RULES:
                if ( resolve )
                    return getRules ();
                return basicGetRules ();
            case MainPackage.SECURITY_LOADER__SLOT:
                if ( resolve )
                    return getSlot ();
                return basicGetSlot ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case MainPackage.SECURITY_LOADER__RULES:
                setRules ( (Rules)newValue );
                return;
            case MainPackage.SECURITY_LOADER__SLOT:
                setSlot ( (GenericMasterConfigurationSlot)newValue );
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
            case MainPackage.SECURITY_LOADER__RULES:
                setRules ( (Rules)null );
                return;
            case MainPackage.SECURITY_LOADER__SLOT:
                setSlot ( (GenericMasterConfigurationSlot)null );
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
            case MainPackage.SECURITY_LOADER__RULES:
                return rules != null;
            case MainPackage.SECURITY_LOADER__SLOT:
                return slot != null;
        }
        return super.eIsSet ( featureID );
    }

} //SecurityLoaderImpl
