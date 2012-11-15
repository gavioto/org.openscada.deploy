/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ae Pull Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getDriverName <em>Driver Name</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getCustomSelectSql <em>Custom Select Sql</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getCustomDeleteSql <em>Custom Delete Sql</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getDelay <em>Delay</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.global.GlobalPackage#getAePullConfiguration()
 * @model
 * @generated
 */
public interface AePullConfiguration extends EObject
{
    /**
     * Returns the value of the '<em><b>Driver Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Driver Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Driver Name</em>' attribute.
     * @see #setDriverName(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getAePullConfiguration_DriverName()
     * @model required="true"
     * @generated
     */
    String getDriverName ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getDriverName <em>Driver Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Driver Name</em>' attribute.
     * @see #getDriverName()
     * @generated
     */
    void setDriverName ( String value );

    /**
     * Returns the value of the '<em><b>Custom Select Sql</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Custom Select Sql</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Select Sql</em>' attribute.
     * @see #setCustomSelectSql(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getAePullConfiguration_CustomSelectSql()
     * @model
     * @generated
     */
    String getCustomSelectSql ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getCustomSelectSql <em>Custom Select Sql</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Custom Select Sql</em>' attribute.
     * @see #getCustomSelectSql()
     * @generated
     */
    void setCustomSelectSql ( String value );

    /**
     * Returns the value of the '<em><b>Custom Delete Sql</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Custom Delete Sql</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Custom Delete Sql</em>' attribute.
     * @see #setCustomDeleteSql(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getAePullConfiguration_CustomDeleteSql()
     * @model
     * @generated
     */
    String getCustomDeleteSql ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getCustomDeleteSql <em>Custom Delete Sql</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Custom Delete Sql</em>' attribute.
     * @see #getCustomDeleteSql()
     * @generated
     */
    void setCustomDeleteSql ( String value );

    /**
     * Returns the value of the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delay</em>' attribute.
     * @see #setDelay(Integer)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getAePullConfiguration_Delay()
     * @model
     * @generated
     */
    Integer getDelay ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.AePullConfiguration#getDelay <em>Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delay</em>' attribute.
     * @see #getDelay()
     * @generated
     */
    void setDelay ( Integer value );

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configurator.processor.common.global.PropertyEntry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getAePullConfiguration_Properties()
     * @model containment="true"
     * @generated
     */
    EList<PropertyEntry> getProperties ();

} // AePullConfiguration
