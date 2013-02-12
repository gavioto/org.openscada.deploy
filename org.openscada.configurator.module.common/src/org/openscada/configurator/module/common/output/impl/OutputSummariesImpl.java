/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.output.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openscada.configuration.model.Project;
import org.openscada.configurator.Configuration;
import org.openscada.configurator.module.common.output.OutputPackage;
import org.openscada.configurator.module.common.output.OutputSummaries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Summaries</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openscada.configurator.module.common.output.impl.OutputSummariesImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.openscada.configurator.module.common.output.impl.OutputSummariesImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputSummariesImpl extends EObjectImpl implements OutputSummaries
{
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
     * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuffix()
     * @generated
     * @ordered
     */
    protected static final String SUFFIX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuffix()
     * @generated
     * @ordered
     */
    protected String suffix = SUFFIX_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OutputSummariesImpl ()
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
        return OutputPackage.Literals.OUTPUT_SUMMARIES;
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
            eNotify ( new ENotificationImpl ( this, Notification.SET, OutputPackage.OUTPUT_SUMMARIES__PREFIX, oldPrefix, prefix ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSuffix ()
    {
        return suffix;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuffix ( String newSuffix )
    {
        String oldSuffix = suffix;
        suffix = newSuffix;
        if ( eNotificationRequired () )
            eNotify ( new ENotificationImpl ( this, Notification.SET, OutputPackage.OUTPUT_SUMMARIES__SUFFIX, oldSuffix, suffix ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void process ( Configuration configuration, Project project )
    {
        configuration.outputSummaries ( getPrefix (), getSuffix () );
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
            case OutputPackage.OUTPUT_SUMMARIES__PREFIX:
                return getPrefix ();
            case OutputPackage.OUTPUT_SUMMARIES__SUFFIX:
                return getSuffix ();
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
            case OutputPackage.OUTPUT_SUMMARIES__PREFIX:
                setPrefix ( (String)newValue );
                return;
            case OutputPackage.OUTPUT_SUMMARIES__SUFFIX:
                setSuffix ( (String)newValue );
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
            case OutputPackage.OUTPUT_SUMMARIES__PREFIX:
                setPrefix ( PREFIX_EDEFAULT );
                return;
            case OutputPackage.OUTPUT_SUMMARIES__SUFFIX:
                setSuffix ( SUFFIX_EDEFAULT );
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
            case OutputPackage.OUTPUT_SUMMARIES__PREFIX:
                return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals ( prefix );
            case OutputPackage.OUTPUT_SUMMARIES__SUFFIX:
                return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals ( suffix );
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
        result.append ( " (prefix: " );
        result.append ( prefix );
        result.append ( ", suffix: " );
        result.append ( suffix );
        result.append ( ')' );
        return result.toString ();
    }

} //OutputSummariesImpl
