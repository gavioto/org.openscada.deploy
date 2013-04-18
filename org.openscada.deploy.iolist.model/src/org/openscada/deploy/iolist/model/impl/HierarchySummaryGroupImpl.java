/**
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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openscada.deploy.iolist.model.HierarchySummaryGroup;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.WeakSummaryReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hierarchy Summary Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.HierarchySummaryGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.HierarchySummaryGroupImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.HierarchySummaryGroupImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.HierarchySummaryGroupImpl#getWeakReferences <em>Weak References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HierarchySummaryGroupImpl extends SummaryGroupImpl implements HierarchySummaryGroup
{
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
    protected EList<HierarchySummaryGroup> children;

    /**
     * The cached value of the '{@link #getWeakReferences() <em>Weak References</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeakReferences()
     * @generated
     * @ordered
     */
    protected EList<WeakSummaryReference> weakReferences;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HierarchySummaryGroupImpl ()
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
        return ModelPackage.Literals.HIERARCHY_SUMMARY_GROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName ()
    {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName ( String newName )
    {
        String oldName = name;
        name = newName;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.HIERARCHY_SUMMARY_GROUP__NAME, oldName, name ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HierarchySummaryGroup getParent ()
    {
        if ( eContainerFeatureID () != ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT )
            return null;
        return (HierarchySummaryGroup)eContainer ();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParent ( HierarchySummaryGroup newParent, NotificationChain msgs )
    {
        msgs = eBasicSetContainer ( (InternalEObject)newParent, ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT, msgs );
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent ( HierarchySummaryGroup newParent )
    {
        if ( newParent != eInternalContainer () || ( eContainerFeatureID () != ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT && newParent != null ) )
        {
            if ( EcoreUtil.isAncestor ( this, newParent ) )
                throw new IllegalArgumentException ( "Recursive containment not allowed for " + toString () );
            NotificationChain msgs = null;
            if ( eInternalContainer () != null )
                msgs = eBasicRemoveFromContainer ( msgs );
            if ( newParent != null )
                msgs = ( (InternalEObject)newParent ).eInverseAdd ( this, ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN, HierarchySummaryGroup.class, msgs );
            msgs = basicSetParent ( newParent, msgs );
            if ( msgs != null )
                msgs.dispatch ();
        }
        else if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT, newParent, newParent ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HierarchySummaryGroup> getChildren ()
    {
        if ( children == null )
        {
            children = new EObjectContainmentWithInverseEList<HierarchySummaryGroup> ( HierarchySummaryGroup.class, this, ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN, ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT );
        }
        return children;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<WeakSummaryReference> getWeakReferences ()
    {
        if ( weakReferences == null )
        {
            weakReferences = new EObjectContainmentEList<WeakSummaryReference> ( WeakSummaryReference.class, this, ModelPackage.HIERARCHY_SUMMARY_GROUP__WEAK_REFERENCES );
        }
        return weakReferences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings ( "unchecked" )
    @Override
    public NotificationChain eInverseAdd ( InternalEObject otherEnd, int featureID, NotificationChain msgs )
    {
        switch ( featureID )
        {
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT:
                if ( eInternalContainer () != null )
                    msgs = eBasicRemoveFromContainer ( msgs );
                return basicSetParent ( (HierarchySummaryGroup)otherEnd, msgs );
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN:
                return ( (InternalEList<InternalEObject>)(InternalEList<?>)getChildren () ).basicAdd ( otherEnd, msgs );
        }
        return super.eInverseAdd ( otherEnd, featureID, msgs );
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
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT:
                return basicSetParent ( null, msgs );
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN:
                return ( (InternalEList<?>)getChildren () ).basicRemove ( otherEnd, msgs );
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__WEAK_REFERENCES:
                return ( (InternalEList<?>)getWeakReferences () ).basicRemove ( otherEnd, msgs );
        }
        return super.eInverseRemove ( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature ( NotificationChain msgs )
    {
        switch ( eContainerFeatureID () )
        {
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT:
                return eInternalContainer ().eInverseRemove ( this, ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN, HierarchySummaryGroup.class, msgs );
        }
        return super.eBasicRemoveFromContainerFeature ( msgs );
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
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__NAME:
                return getName ();
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT:
                return getParent ();
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN:
                return getChildren ();
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__WEAK_REFERENCES:
                return getWeakReferences ();
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
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__NAME:
                setName ( (String)newValue );
                return;
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT:
                setParent ( (HierarchySummaryGroup)newValue );
                return;
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN:
                getChildren ().clear ();
                getChildren ().addAll ( (Collection<? extends HierarchySummaryGroup>)newValue );
                return;
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__WEAK_REFERENCES:
                getWeakReferences ().clear ();
                getWeakReferences ().addAll ( (Collection<? extends WeakSummaryReference>)newValue );
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
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__NAME:
                setName ( NAME_EDEFAULT );
                return;
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT:
                setParent ( (HierarchySummaryGroup)null );
                return;
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN:
                getChildren ().clear ();
                return;
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__WEAK_REFERENCES:
                getWeakReferences ().clear ();
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
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals ( name );
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__PARENT:
                return getParent () != null;
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__CHILDREN:
                return children != null && !children.isEmpty ();
            case ModelPackage.HIERARCHY_SUMMARY_GROUP__WEAK_REFERENCES:
                return weakReferences != null && !weakReferences.isEmpty ();
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
        result.append ( " (name: " );
        result.append ( name );
        result.append ( ')' );
        return result.toString ();
    }

} //HierarchySummaryGroupImpl
