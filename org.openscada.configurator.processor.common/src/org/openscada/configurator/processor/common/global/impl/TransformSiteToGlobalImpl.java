/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global.impl;

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
import org.openscada.configurator.processor.common.global.GlobalPackage;
import org.openscada.configurator.processor.common.global.Site;
import org.openscada.configurator.processor.common.global.TransformSiteToGlobal;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Transform Site To Global</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getGlobalSlot <em>Global Slot</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.impl.TransformSiteToGlobalImpl#getSites <em>Sites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformSiteToGlobalImpl extends EObjectImpl implements TransformSiteToGlobal
{
    /**
     * The cached value of the '{@link #getGlobalSlot() <em>Global Slot</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getGlobalSlot()
     * @generated
     * @ordered
     */
    protected AtlantisConfigurationSlot globalSlot;

    /**
     * The cached value of the '{@link #getSites() <em>Sites</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSites()
     * @generated
     * @ordered
     */
    protected EList<Site> sites;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TransformSiteToGlobalImpl ()
    {
        super ();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass ()
    {
        return GlobalPackage.Literals.TRANSFORM_SITE_TO_GLOBAL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AtlantisConfigurationSlot getGlobalSlot ()
    {
        if ( globalSlot != null && globalSlot.eIsProxy () )
        {
            InternalEObject oldGlobalSlot = (InternalEObject)globalSlot;
            globalSlot = (AtlantisConfigurationSlot)eResolveProxy ( oldGlobalSlot );
            if ( globalSlot != oldGlobalSlot )
            {
                if ( eNotificationRequired () )
                    eNotify ( new ENotificationImpl ( this, Notification.RESOLVE, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT, oldGlobalSlot, globalSlot ) );
            }
        }
        return globalSlot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AtlantisConfigurationSlot basicGetGlobalSlot ()
    {
        return globalSlot;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGlobalSlot ( AtlantisConfigurationSlot newGlobalSlot )
    {
        AtlantisConfigurationSlot oldGlobalSlot = globalSlot;
        globalSlot = newGlobalSlot;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT, oldGlobalSlot, globalSlot ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Site> getSites ()
    {
        if ( sites == null )
        {
            sites = new EObjectContainmentEList<Site> ( Site.class, this, GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES );
        }
        return sites;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public void process ( final Project project ) throws Exception
    {
        new org.openscada.configurator.processor.common.global.handler.TransformSiteToGlobal ( this ).process ();
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
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                return ( (InternalEList<?>)getSites () ).basicRemove ( otherEnd, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet ( int featureID, boolean resolve, boolean coreType )
    {
        switch ( featureID )
        {
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT:
                if ( resolve )
                    return getGlobalSlot ();
                return basicGetGlobalSlot ();
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                return getSites ();
        }
        return super.eGet ( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public void eSet ( int featureID, Object newValue )
    {
        switch ( featureID )
        {
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT:
                setGlobalSlot ( (AtlantisConfigurationSlot)newValue );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                getSites ().clear ();
                getSites ().addAll ( (Collection<? extends Site>)newValue );
                return;
        }
        super.eSet ( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset ( int featureID )
    {
        switch ( featureID )
        {
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT:
                setGlobalSlot ( (AtlantisConfigurationSlot)null );
                return;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                getSites ().clear ();
                return;
        }
        super.eUnset ( featureID );
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet ( int featureID )
    {
        switch ( featureID )
        {
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__GLOBAL_SLOT:
                return globalSlot != null;
            case GlobalPackage.TRANSFORM_SITE_TO_GLOBAL__SITES:
                return sites != null && !sites.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

} //TransformSiteToGlobalImpl
