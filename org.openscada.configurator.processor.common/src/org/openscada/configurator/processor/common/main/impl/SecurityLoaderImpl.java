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
 * <li>
 * {@link org.openscada.configurator.processor.common.main.impl.SecurityLoaderImpl#getRules
 * <em>Rules</em>}</li>
 * <li>
 * {@link org.openscada.configurator.processor.common.main.impl.SecurityLoaderImpl#getSlot
 * <em>Slot</em>}</li>
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
     * 
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected Rules rules;

    /**
     * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getSlot()
     * @generated
     * @ordered
     */
    protected GenericMasterConfigurationSlot slot;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SecurityLoaderImpl ()
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
        return MainPackage.Literals.SECURITY_LOADER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Rules getRules ()
    {
        if ( this.rules != null && this.rules.eIsProxy () )
        {
            final InternalEObject oldRules = (InternalEObject)this.rules;
            this.rules = (Rules)eResolveProxy ( oldRules );
            if ( this.rules != oldRules )
            {
                if ( eNotificationRequired () )
                {
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, MainPackage.SECURITY_LOADER__RULES, oldRules, this.rules ) );
                }
            }
        }
        return this.rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Rules basicGetRules ()
    {
        return this.rules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRules ( final Rules newRules )
    {
        final Rules oldRules = this.rules;
        this.rules = newRules;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, MainPackage.SECURITY_LOADER__RULES, oldRules, this.rules ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public GenericMasterConfigurationSlot getSlot ()
    {
        if ( this.slot != null && this.slot.eIsProxy () )
        {
            final InternalEObject oldSlot = (InternalEObject)this.slot;
            this.slot = (GenericMasterConfigurationSlot)eResolveProxy ( oldSlot );
            if ( this.slot != oldSlot )
            {
                if ( eNotificationRequired () )
                {
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, MainPackage.SECURITY_LOADER__SLOT, oldSlot, this.slot ) );
                }
            }
        }
        return this.slot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public GenericMasterConfigurationSlot basicGetSlot ()
    {
        return this.slot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSlot ( final GenericMasterConfigurationSlot newSlot )
    {
        final GenericMasterConfigurationSlot oldSlot = this.slot;
        this.slot = newSlot;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, MainPackage.SECURITY_LOADER__SLOT, oldSlot, this.slot ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Project project ) throws Exception
    {
        getSlot ().getConfigurationData ().addSecurityRules ( getRules () );
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
            case MainPackage.SECURITY_LOADER__RULES:
                if ( resolve )
                {
                    return getRules ();
                }
                return basicGetRules ();
            case MainPackage.SECURITY_LOADER__SLOT:
                if ( resolve )
                {
                    return getSlot ();
                }
                return basicGetSlot ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet ( final int featureID, final Object newValue )
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
     * 
     * @generated
     */
    @Override
    public void eUnset ( final int featureID )
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
     * 
     * @generated
     */
    @Override
    public boolean eIsSet ( final int featureID )
    {
        switch ( featureID )
        {
            case MainPackage.SECURITY_LOADER__RULES:
                return this.rules != null;
            case MainPackage.SECURITY_LOADER__SLOT:
                return this.slot != null;
        }
        return super.eIsSet ( featureID );
    }

} //SecurityLoaderImpl
