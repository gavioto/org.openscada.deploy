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
import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Average</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.AverageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.AverageImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.openscada.deploy.iolist.model.impl.AverageImpl#getPercentRequired <em>Percent Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AverageImpl extends EObjectImpl implements Average
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
     * The cached value of the '{@link #getSources() <em>Sources</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSources()
     * @generated
     * @ordered
     */
    protected EList<String> sources;

    /**
     * The default value of the '{@link #getPercentRequired() <em>Percent Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPercentRequired()
     * @generated
     * @ordered
     */
    protected static final double PERCENT_REQUIRED_EDEFAULT = 1.0;

    /**
     * The cached value of the '{@link #getPercentRequired() <em>Percent Required</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPercentRequired()
     * @generated
     * @ordered
     */
    protected double percentRequired = PERCENT_REQUIRED_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AverageImpl ()
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
        return ModelPackage.Literals.AVERAGE;
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
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.AVERAGE__ID, oldId, id ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getSources ()
    {
        if ( sources == null )
        {
            sources = new EDataTypeUniqueEList<String> ( String.class, this, ModelPackage.AVERAGE__SOURCES );
        }
        return sources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getPercentRequired ()
    {
        return percentRequired;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPercentRequired ( double newPercentRequired )
    {
        double oldPercentRequired = percentRequired;
        percentRequired = newPercentRequired;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, ModelPackage.AVERAGE__PERCENT_REQUIRED, oldPercentRequired, percentRequired ) );
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
            case ModelPackage.AVERAGE__ID:
                return getId ();
            case ModelPackage.AVERAGE__SOURCES:
                return getSources ();
            case ModelPackage.AVERAGE__PERCENT_REQUIRED:
                return getPercentRequired ();
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
            case ModelPackage.AVERAGE__ID:
                setId ( (String)newValue );
                return;
            case ModelPackage.AVERAGE__SOURCES:
                getSources ().clear ();
                getSources ().addAll ( (Collection<? extends String>)newValue );
                return;
            case ModelPackage.AVERAGE__PERCENT_REQUIRED:
                setPercentRequired ( (Double)newValue );
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
            case ModelPackage.AVERAGE__ID:
                setId ( ID_EDEFAULT );
                return;
            case ModelPackage.AVERAGE__SOURCES:
                getSources ().clear ();
                return;
            case ModelPackage.AVERAGE__PERCENT_REQUIRED:
                setPercentRequired ( PERCENT_REQUIRED_EDEFAULT );
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
            case ModelPackage.AVERAGE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals ( id );
            case ModelPackage.AVERAGE__SOURCES:
                return sources != null && !sources.isEmpty ();
            case ModelPackage.AVERAGE__PERCENT_REQUIRED:
                return percentRequired != PERCENT_REQUIRED_EDEFAULT;
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
        result.append ( ", sources: " );
        result.append ( sources );
        result.append ( ", percentRequired: " );
        result.append ( percentRequired );
        result.append ( ')' );
        return result.toString ();
    }

} //AverageImpl
