/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openscada.configurator.module.common.impl.FileModuleImpl;
import org.openscada.configurator.module.common.summary.SummaryFileLoader;
import org.openscada.configurator.module.common.summary.SummaryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.summary.impl.SummaryFileLoaderImpl#getRequiredItems <em>Required Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SummaryFileLoaderImpl extends FileModuleImpl implements SummaryFileLoader
{
    /**
     * The default value of the '{@link #getRequiredItems() <em>Required Items</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiredItems()
     * @generated
     * @ordered
     */
    protected static final int REQUIRED_ITEMS_EDEFAULT = 2;

    /**
     * The cached value of the '{@link #getRequiredItems() <em>Required Items</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiredItems()
     * @generated
     * @ordered
     */
    protected int requiredItems = REQUIRED_ITEMS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SummaryFileLoaderImpl ()
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
        return SummaryPackage.Literals.SUMMARY_FILE_LOADER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getRequiredItems ()
    {
        return requiredItems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequiredItems ( int newRequiredItems )
    {
        int oldRequiredItems = requiredItems;
        requiredItems = newRequiredItems;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS, oldRequiredItems, requiredItems ) );
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
            case SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS:
                return getRequiredItems ();
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
            case SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS:
                setRequiredItems ( (Integer)newValue );
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
            case SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS:
                setRequiredItems ( REQUIRED_ITEMS_EDEFAULT );
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
            case SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS:
                return requiredItems != REQUIRED_ITEMS_EDEFAULT;
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
        result.append ( " (requiredItems: " );
        result.append ( requiredItems );
        result.append ( ')' );
        return result.toString ();
    }

} //SummaryFileLoaderImpl
