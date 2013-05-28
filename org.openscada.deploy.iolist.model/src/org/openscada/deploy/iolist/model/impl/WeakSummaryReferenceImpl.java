/**
 */
package org.openscada.deploy.iolist.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.deploy.iolist.model.ModelPackage;
import org.openscada.deploy.iolist.model.WeakSummaryReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weak Summary Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.WeakSummaryReferenceImpl#getDataSourceId <em>Data Source Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeakSummaryReferenceImpl extends EObjectImpl implements WeakSummaryReference
{
    /**
     * The default value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSourceId()
     * @generated
     * @ordered
     */
    protected static final String DATA_SOURCE_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataSourceId() <em>Data Source Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataSourceId()
     * @generated
     * @ordered
     */
    protected String dataSourceId = DATA_SOURCE_ID_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WeakSummaryReferenceImpl ()
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
        return ModelPackage.Literals.WEAK_SUMMARY_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDataSourceId ()
    {
        return dataSourceId;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataSourceId ( String newDataSourceId )
    {
        String oldDataSourceId = dataSourceId;
        dataSourceId = newDataSourceId;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.WEAK_SUMMARY_REFERENCE__DATA_SOURCE_ID, oldDataSourceId, dataSourceId ) );
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
            case ModelPackage.WEAK_SUMMARY_REFERENCE__DATA_SOURCE_ID:
                return getDataSourceId ();
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
            case ModelPackage.WEAK_SUMMARY_REFERENCE__DATA_SOURCE_ID:
                setDataSourceId ( (String)newValue );
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
            case ModelPackage.WEAK_SUMMARY_REFERENCE__DATA_SOURCE_ID:
                setDataSourceId ( DATA_SOURCE_ID_EDEFAULT );
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
            case ModelPackage.WEAK_SUMMARY_REFERENCE__DATA_SOURCE_ID:
                return DATA_SOURCE_ID_EDEFAULT == null ? dataSourceId != null : !DATA_SOURCE_ID_EDEFAULT.equals ( dataSourceId );
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
        result.append ( " (dataSourceId: " );
        result.append ( dataSourceId );
        result.append ( ')' );
        return result.toString ();
    }

} //WeakSummaryReferenceImpl
