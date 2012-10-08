/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.SummaryGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Summary Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.SummaryGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.SummaryGroupImpl#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.SummaryGroupImpl#getDataSourceIds <em>Data Source Ids</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.SummaryGroupImpl#isRetain <em>Retain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SummaryGroupImpl extends EObjectImpl implements SummaryGroup
{
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The cached value of the '{@link #getHierarchy() <em>Hierarchy</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHierarchy()
     * @generated
     * @ordered
     */
    protected EList<String> hierarchy;

    /**
     * The cached value of the '{@link #getDataSourceIds() <em>Data Source Ids</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSourceIds()
     * @generated
     * @ordered
     */
    protected EList<String> dataSourceIds;

    /**
     * The default value of the '{@link #isRetain() <em>Retain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRetain()
     * @generated
     * @ordered
     */
    protected static final boolean RETAIN_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isRetain() <em>Retain</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isRetain()
     * @generated
     * @ordered
     */
    protected boolean retain = RETAIN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SummaryGroupImpl ()
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
        return ModelPackage.Literals.SUMMARY_GROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId ()
    {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId ( String newId )
    {
        String oldId = id;
        id = newId;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SUMMARY_GROUP__ID, oldId, id ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getHierarchy ()
    {
        if ( hierarchy == null )
        {
            hierarchy = new EDataTypeUniqueEList<String> ( String.class, this, ModelPackage.SUMMARY_GROUP__HIERARCHY );
        }
        return hierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getDataSourceIds ()
    {
        if ( dataSourceIds == null )
        {
            dataSourceIds = new EDataTypeUniqueEList<String> ( String.class, this, ModelPackage.SUMMARY_GROUP__DATA_SOURCE_IDS );
        }
        return dataSourceIds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isRetain ()
    {
        return retain;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRetain ( boolean newRetain )
    {
        boolean oldRetain = retain;
        retain = newRetain;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.SUMMARY_GROUP__RETAIN, oldRetain, retain ) );
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
            case ModelPackage.SUMMARY_GROUP__ID:
                return getId ();
            case ModelPackage.SUMMARY_GROUP__HIERARCHY:
                return getHierarchy ();
            case ModelPackage.SUMMARY_GROUP__DATA_SOURCE_IDS:
                return getDataSourceIds ();
            case ModelPackage.SUMMARY_GROUP__RETAIN:
                return isRetain ();
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
            case ModelPackage.SUMMARY_GROUP__ID:
                setId ( (String)newValue );
                return;
            case ModelPackage.SUMMARY_GROUP__HIERARCHY:
                getHierarchy ().clear ();
                getHierarchy ().addAll ( (Collection<? extends String>)newValue );
                return;
            case ModelPackage.SUMMARY_GROUP__DATA_SOURCE_IDS:
                getDataSourceIds ().clear ();
                getDataSourceIds ().addAll ( (Collection<? extends String>)newValue );
                return;
            case ModelPackage.SUMMARY_GROUP__RETAIN:
                setRetain ( (Boolean)newValue );
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
            case ModelPackage.SUMMARY_GROUP__ID:
                setId ( ID_EDEFAULT );
                return;
            case ModelPackage.SUMMARY_GROUP__HIERARCHY:
                getHierarchy ().clear ();
                return;
            case ModelPackage.SUMMARY_GROUP__DATA_SOURCE_IDS:
                getDataSourceIds ().clear ();
                return;
            case ModelPackage.SUMMARY_GROUP__RETAIN:
                setRetain ( RETAIN_EDEFAULT );
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
            case ModelPackage.SUMMARY_GROUP__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals ( id );
            case ModelPackage.SUMMARY_GROUP__HIERARCHY:
                return hierarchy != null && !hierarchy.isEmpty ();
            case ModelPackage.SUMMARY_GROUP__DATA_SOURCE_IDS:
                return dataSourceIds != null && !dataSourceIds.isEmpty ();
            case ModelPackage.SUMMARY_GROUP__RETAIN:
                return retain != RETAIN_EDEFAULT;
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
        result.append ( " (id: " );
        result.append ( id );
        result.append ( ", hierarchy: " );
        result.append ( hierarchy );
        result.append ( ", dataSourceIds: " );
        result.append ( dataSourceIds );
        result.append ( ", retain: " );
        result.append ( retain );
        result.append ( ')' );
        return result.toString ();
    }

} //SummaryGroupImpl
