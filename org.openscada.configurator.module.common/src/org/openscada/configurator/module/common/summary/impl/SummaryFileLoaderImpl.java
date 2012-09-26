/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.summary.SummaryFileLoader;
import org.openscada.configurator.module.common.summary.SummaryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.summary.impl.SummaryFileLoaderImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.summary.impl.SummaryFileLoaderImpl#getRequiredItems <em>Required Items</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.summary.impl.SummaryFileLoaderImpl#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SummaryFileLoaderImpl extends EObjectImpl implements SummaryFileLoader
{
    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected EList<String> path;

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
     * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected static final String PREFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefix()
     * @generated
     * @ordered
     */
    protected String prefix = PREFIX_EDEFAULT;

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
    public EList<String> getPath ()
    {
        if ( path == null )
        {
            path = new EDataTypeUniqueEList<String> ( String.class, this, SummaryPackage.SUMMARY_FILE_LOADER__PATH );
        }
        return path;
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
    public String getPrefix ()
    {
        return prefix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrefix ( String newPrefix )
    {
        String oldPrefix = prefix;
        prefix = newPrefix;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, SummaryPackage.SUMMARY_FILE_LOADER__PREFIX, oldPrefix, prefix ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void process ( Configuration configuration, Project project )
    {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException ();
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
            case SummaryPackage.SUMMARY_FILE_LOADER__PATH:
                return getPath ();
            case SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS:
                return getRequiredItems ();
            case SummaryPackage.SUMMARY_FILE_LOADER__PREFIX:
                return getPrefix ();
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
            case SummaryPackage.SUMMARY_FILE_LOADER__PATH:
                getPath ().clear ();
                getPath ().addAll ( (Collection<? extends String>)newValue );
                return;
            case SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS:
                setRequiredItems ( (Integer)newValue );
                return;
            case SummaryPackage.SUMMARY_FILE_LOADER__PREFIX:
                setPrefix ( (String)newValue );
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
            case SummaryPackage.SUMMARY_FILE_LOADER__PATH:
                getPath ().clear ();
                return;
            case SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS:
                setRequiredItems ( REQUIRED_ITEMS_EDEFAULT );
                return;
            case SummaryPackage.SUMMARY_FILE_LOADER__PREFIX:
                setPrefix ( PREFIX_EDEFAULT );
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
            case SummaryPackage.SUMMARY_FILE_LOADER__PATH:
                return path != null && !path.isEmpty ();
            case SummaryPackage.SUMMARY_FILE_LOADER__REQUIRED_ITEMS:
                return requiredItems != REQUIRED_ITEMS_EDEFAULT;
            case SummaryPackage.SUMMARY_FILE_LOADER__PREFIX:
                return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals ( prefix );
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
        result.append ( " (path: " );
        result.append ( path );
        result.append ( ", requiredItems: " );
        result.append ( requiredItems );
        result.append ( ", prefix: " );
        result.append ( prefix );
        result.append ( ')' );
        return result.toString ();
    }

} //SummaryFileLoaderImpl
