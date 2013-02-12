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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.HierarchySummaryGroup;
import org.openscada.deploy.iolist.model.Item;
import org.openscada.deploy.iolist.model.Model;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.MovingAverage;
import org.openscada.deploy.iolist.model.PlainSummaryGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ModelImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ModelImpl#getAverages <em>Averages</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ModelImpl#getMovingAverages <em>Moving Averages</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ModelImpl#getRootSummary <em>Root Summary</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.ModelImpl#getPlainSummary <em>Plain Summary</em>}</li>
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
     * The cached value of the '{@link #getMovingAverages() <em>Moving Averages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMovingAverages()
     * @generated
     * @ordered
     */
    protected EList<MovingAverage> movingAverages;

    /**
     * The cached value of the '{@link #getRootSummary() <em>Root Summary</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootSummary()
     * @generated
     * @ordered
     */
    protected HierarchySummaryGroup rootSummary;

    /**
     * The cached value of the '{@link #getPlainSummary() <em>Plain Summary</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlainSummary()
     * @generated
     * @ordered
     */
    protected EList<PlainSummaryGroup> plainSummary;

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
    public EList<MovingAverage> getMovingAverages ()
    {
        if ( movingAverages == null )
        {
            movingAverages = new EObjectContainmentEList<MovingAverage> ( MovingAverage.class, this, ModelPackage.MODEL__MOVING_AVERAGES );
        }
        return movingAverages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HierarchySummaryGroup getRootSummary ()
    {
        return rootSummary;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRootSummary ( HierarchySummaryGroup newRootSummary, NotificationChain msgs )
    {
        HierarchySummaryGroup oldRootSummary = rootSummary;
        rootSummary = newRootSummary;
        if ( eNotificationRequired () )
        {
            ENotificationImpl notification = new ENotificationImpl ( this, Notification.SET, ModelPackage.MODEL__ROOT_SUMMARY, oldRootSummary, newRootSummary );
            if ( msgs == null )
                msgs = notification;
            else
                msgs.add ( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootSummary ( HierarchySummaryGroup newRootSummary )
    {
        if ( newRootSummary != rootSummary )
        {
            NotificationChain msgs = null;
            if ( rootSummary != null )
                msgs = ( (InternalEObject)rootSummary ).eInverseRemove ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODEL__ROOT_SUMMARY, null, msgs );
            if ( newRootSummary != null )
                msgs = ( (InternalEObject)newRootSummary ).eInverseAdd ( this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODEL__ROOT_SUMMARY, null, msgs );
            msgs = basicSetRootSummary ( newRootSummary, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.MODEL__ROOT_SUMMARY, newRootSummary, newRootSummary ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PlainSummaryGroup> getPlainSummary ()
    {
        if ( plainSummary == null )
        {
            plainSummary = new EObjectContainmentEList<PlainSummaryGroup> ( PlainSummaryGroup.class, this, ModelPackage.MODEL__PLAIN_SUMMARY );
        }
        return plainSummary;
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
            case ModelPackage.MODEL__MOVING_AVERAGES:
                return ( (InternalEList<?>)getMovingAverages () ).basicRemove ( otherEnd, msgs );
            case ModelPackage.MODEL__ROOT_SUMMARY:
                return basicSetRootSummary ( null, msgs );
            case ModelPackage.MODEL__PLAIN_SUMMARY:
                return ( (InternalEList<?>)getPlainSummary () ).basicRemove ( otherEnd, msgs );
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
            case ModelPackage.MODEL__MOVING_AVERAGES:
                return getMovingAverages ();
            case ModelPackage.MODEL__ROOT_SUMMARY:
                return getRootSummary ();
            case ModelPackage.MODEL__PLAIN_SUMMARY:
                return getPlainSummary ();
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
            case ModelPackage.MODEL__MOVING_AVERAGES:
                getMovingAverages ().clear ();
                getMovingAverages ().addAll ( (Collection<? extends MovingAverage>)newValue );
                return;
            case ModelPackage.MODEL__ROOT_SUMMARY:
                setRootSummary ( (HierarchySummaryGroup)newValue );
                return;
            case ModelPackage.MODEL__PLAIN_SUMMARY:
                getPlainSummary ().clear ();
                getPlainSummary ().addAll ( (Collection<? extends PlainSummaryGroup>)newValue );
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
            case ModelPackage.MODEL__MOVING_AVERAGES:
                getMovingAverages ().clear ();
                return;
            case ModelPackage.MODEL__ROOT_SUMMARY:
                setRootSummary ( (HierarchySummaryGroup)null );
                return;
            case ModelPackage.MODEL__PLAIN_SUMMARY:
                getPlainSummary ().clear ();
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
            case ModelPackage.MODEL__MOVING_AVERAGES:
                return movingAverages != null && !movingAverages.isEmpty ();
            case ModelPackage.MODEL__ROOT_SUMMARY:
                return rootSummary != null;
            case ModelPackage.MODEL__PLAIN_SUMMARY:
                return plainSummary != null && !plainSummary.isEmpty ();
        }
        return super.eIsSet ( featureID );
    }

} //ModelImpl
