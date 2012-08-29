/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ModelImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ModelImpl#getAverages <em>Averages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model
{
    /**
     * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItems()
     * @generated
     * @ordered
     */
    protected EList<Item> items;

    /**
     * The cached value of the '{@link #getAverages() <em>Averages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAverages()
     * @generated
     * @ordered
     */
    protected EList<Average> averages;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelImpl ()
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
        return ModelPackage.Literals.MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Item> getItems ()
    {
        if ( items == null )
        {
            items = new EObjectContainmentEList<Item> ( Item.class, this, ModelPackage.MODEL__ITEMS );
        }
        return items;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Average> getAverages ()
    {
        if ( averages == null )
        {
            averages = new EObjectContainmentEList<Average> ( Average.class, this, ModelPackage.MODEL__AVERAGES );
        }
        return averages;
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
            case ModelPackage.MODEL__ITEMS:
                return ( (InternalEList<?>)getItems () ).basicRemove ( otherEnd, msgs );
            case ModelPackage.MODEL__AVERAGES:
                return ( (InternalEList<?>)getAverages () ).basicRemove ( otherEnd, msgs );
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
            case ModelPackage.MODEL__ITEMS:
                return getItems ();
            case ModelPackage.MODEL__AVERAGES:
                return getAverages ();
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
            case ModelPackage.MODEL__ITEMS:
                getItems ().clear ();
                getItems ().addAll ( (Collection<? extends Item>)newValue );
                return;
            case ModelPackage.MODEL__AVERAGES:
                getAverages ().clear ();
                getAverages ().addAll ( (Collection<? extends Average>)newValue );
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
            case ModelPackage.MODEL__ITEMS:
                getItems ().clear ();
                return;
            case ModelPackage.MODEL__AVERAGES:
                getAverages ().clear ();
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
            case ModelPackage.MODEL__ITEMS:
                return items != null && !items.isEmpty ();
            case ModelPackage.MODEL__AVERAGES:
                return averages != null && !averages.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

} //ModelImpl
