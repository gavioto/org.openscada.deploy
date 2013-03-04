/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.Site#getId <em>Id</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.Site#getConnectionDa <em>Connection Da</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.Site#getConnectionAe <em>Connection Ae</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.Site#getSiteOutputDir <em>Site Output Dir</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.Site#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.Site#getAknPattern <em>Akn Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.global.GlobalPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject
{
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getSite_Id()
     * @model id="true" required="true"
     * @generated
     */
    String getId ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.Site#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId ( String value );

    /**
     * Returns the value of the '<em><b>Connection Da</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Da</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Da</em>' attribute.
     * @see #setConnectionDa(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getSite_ConnectionDa()
     * @model required="true"
     * @generated
     */
    String getConnectionDa ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.Site#getConnectionDa <em>Connection Da</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Da</em>' attribute.
     * @see #getConnectionDa()
     * @generated
     */
    void setConnectionDa ( String value );

    /**
     * Returns the value of the '<em><b>Connection Ae</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connection Ae</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connection Ae</em>' attribute.
     * @see #setConnectionAe(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getSite_ConnectionAe()
     * @model required="true"
     * @generated
     */
    String getConnectionAe ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.Site#getConnectionAe <em>Connection Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connection Ae</em>' attribute.
     * @see #getConnectionAe()
     * @generated
     */
    void setConnectionAe ( String value );

    /**
     * Returns the value of the '<em><b>Site Output Dir</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Output directory of the site configuration.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Site Output Dir</em>' attribute.
     * @see #setSiteOutputDir(String)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getSite_SiteOutputDir()
     * @model required="true"
     * @generated
     */
    String getSiteOutputDir ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.Site#getSiteOutputDir <em>Site Output Dir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Site Output Dir</em>' attribute.
     * @see #getSiteOutputDir()
     * @generated
     */
    void setSiteOutputDir ( String value );

    /**
     * Returns the value of the '<em><b>Hierarchy</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hierarchy</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hierarchy</em>' attribute list.
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getSite_Hierarchy()
     * @model
     * @generated
     */
    EList<String> getHierarchy ();

    /**
     * Returns the value of the '<em><b>Akn Pattern</b></em>' attribute list.
     * The list contents are of type {@link java.util.regex.Pattern}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Akn Pattern</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Akn Pattern</em>' attribute list.
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getSite_AknPattern()
     * @model dataType="org.openscada.configurator.processor.common.Pattern"
     * @generated
     */
    EList<Pattern> getAknPattern ();

} // Site
