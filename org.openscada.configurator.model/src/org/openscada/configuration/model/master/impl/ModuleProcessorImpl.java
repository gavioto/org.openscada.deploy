/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.configuration.model.Project;
import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configuration.model.master.MasterPackage;
import org.openscada.configuration.model.master.Module;
import org.openscada.configuration.model.master.ModuleProcessor;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Module Processor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openscada.configuration.model.master.impl.ModuleProcessorImpl#getModules <em>Modules</em>}</li>
 * <li>{@link org.openscada.configuration.model.master.impl.ModuleProcessorImpl#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ModuleProcessorImpl extends EObjectImpl implements ModuleProcessor
{
    /**
     * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getModules()
     * @generated
     * @ordered
     */
    protected EList<Module> modules;

    /**
     * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSlot()
     * @generated
     * @ordered
     */
    protected AtlantisConfigurationSlot slot;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ModuleProcessorImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return MasterPackage.Literals.MODULE_PROCESSOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Module> getModules ()
    {
        if ( this.modules == null )
        {
            this.modules = new EObjectContainmentEList.Resolving<Module> ( Module.class, this, MasterPackage.MODULE_PROCESSOR__MODULES );
        }
        return this.modules;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public AtlantisConfigurationSlot getSlot ()
    {
        if ( this.slot != null && this.slot.eIsProxy () )
        {
            final InternalEObject oldSlot = (InternalEObject)this.slot;
            this.slot = (AtlantisConfigurationSlot)eResolveProxy ( oldSlot );
            if ( this.slot != oldSlot )
            {
                if ( eNotificationRequired () )
                {
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, MasterPackage.MODULE_PROCESSOR__SLOT, oldSlot, this.slot ) );
                }
            }
        }
        return this.slot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AtlantisConfigurationSlot basicGetSlot ()
    {
        return this.slot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSlot ( final AtlantisConfigurationSlot newSlot )
    {
        final AtlantisConfigurationSlot oldSlot = this.slot;
        this.slot = newSlot;
        if ( eNotificationRequired () )
        {
            eNotify ( new ENotificationImpl ( this, Notification.SET, MasterPackage.MODULE_PROCESSOR__SLOT, oldSlot, this.slot ) );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Project project ) throws Exception
    {
        for ( final Module module : getModules () )
        {
            module.process ( this.slot.getConfigurationData (), project );
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove ( final InternalEObject otherEnd, final int featureID, final NotificationChain msgs )
    {
        switch ( featureID )
        {
            case MasterPackage.MODULE_PROCESSOR__MODULES:
                return ( (InternalEList<?>)getModules () ).basicRemove ( otherEnd, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet ( final int featureID, final boolean resolve, final boolean coreType )
    {
        switch ( featureID )
        {
            case MasterPackage.MODULE_PROCESSOR__MODULES:
                return getModules ();
            case MasterPackage.MODULE_PROCESSOR__SLOT:
                if ( resolve )
                {
                    return getSlot ();
                }
                return basicGetSlot ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( final int featureID, final Object newValue )
    {
        switch ( featureID )
        {
            case MasterPackage.MODULE_PROCESSOR__MODULES:
                getModules ().clear ();
                getModules ().addAll ( (Collection<? extends Module>)newValue );
                return;
            case MasterPackage.MODULE_PROCESSOR__SLOT:
                setSlot ( (AtlantisConfigurationSlot)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset ( final int featureID )
    {
        switch ( featureID )
        {
            case MasterPackage.MODULE_PROCESSOR__MODULES:
                getModules ().clear ();
                return;
            case MasterPackage.MODULE_PROCESSOR__SLOT:
                setSlot ( (AtlantisConfigurationSlot)null );
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet ( final int featureID )
    {
        switch ( featureID )
        {
            case MasterPackage.MODULE_PROCESSOR__MODULES:
                return this.modules != null && !this.modules.isEmpty ();
            case MasterPackage.MODULE_PROCESSOR__SLOT:
                return this.slot != null;
        }
        return super.eIsSet ( featureID );
    }

} //ModuleProcessorImpl
