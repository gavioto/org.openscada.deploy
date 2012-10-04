/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.configuration.model.ConfigurationSlot;
import org.openscada.configuration.model.ConfiguratorPackage;
import org.openscada.configuration.model.Processor;
import org.openscada.configuration.model.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.impl.ProjectImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link org.openscada.configuration.model.impl.ProjectImpl#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project
{
    /**
     * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlots()
     * @generated
     * @ordered
     */
    protected EList<ConfigurationSlot> slots;

    /**
     * The cached value of the '{@link #getProcessors() <em>Processors</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessors()
     * @generated
     * @ordered
     */
    protected EList<Processor> processors;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProjectImpl ()
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
        return ConfiguratorPackage.Literals.PROJECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConfigurationSlot> getSlots ()
    {
        if ( slots == null )
        {
            slots = new EObjectContainmentEList.Resolving<ConfigurationSlot> ( ConfigurationSlot.class, this, ConfiguratorPackage.PROJECT__SLOTS );
        }
        return slots;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Processor> getProcessors ()
    {
        if ( processors == null )
        {
            processors = new EObjectContainmentEList.Resolving<Processor> ( Processor.class, this, ConfiguratorPackage.PROJECT__PROCESSORS );
        }
        return processors;
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
            case ConfiguratorPackage.PROJECT__SLOTS:
                return ( (InternalEList<?>)getSlots () ).basicRemove ( otherEnd, msgs );
            case ConfiguratorPackage.PROJECT__PROCESSORS:
                return ( (InternalEList<?>)getProcessors () ).basicRemove ( otherEnd, msgs );
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
            case ConfiguratorPackage.PROJECT__SLOTS:
                return getSlots ();
            case ConfiguratorPackage.PROJECT__PROCESSORS:
                return getProcessors ();
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
            case ConfiguratorPackage.PROJECT__SLOTS:
                getSlots ().clear ();
                getSlots ().addAll ( (Collection<? extends ConfigurationSlot>)newValue );
                return;
            case ConfiguratorPackage.PROJECT__PROCESSORS:
                getProcessors ().clear ();
                getProcessors ().addAll ( (Collection<? extends Processor>)newValue );
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
            case ConfiguratorPackage.PROJECT__SLOTS:
                getSlots ().clear ();
                return;
            case ConfiguratorPackage.PROJECT__PROCESSORS:
                getProcessors ().clear ();
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
            case ConfiguratorPackage.PROJECT__SLOTS:
                return slots != null && !slots.isEmpty ();
            case ConfiguratorPackage.PROJECT__PROCESSORS:
                return processors != null && !processors.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

} //ProjectImpl
