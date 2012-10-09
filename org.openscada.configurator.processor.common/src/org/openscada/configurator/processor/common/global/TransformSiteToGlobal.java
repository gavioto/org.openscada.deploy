/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.processor.common.global;

import org.eclipse.emf.common.util.EList;
import org.openscada.configuration.model.Processor;

import org.openscada.configuration.model.master.AtlantisConfigurationSlot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Site To Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Converts a site local configuration to a global centralized data hub configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getGlobalSlot <em>Global Slot</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getSites <em>Sites</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal()
 * @model
 * @generated
 */
public interface TransformSiteToGlobal extends Processor
{
    /**
     * Returns the value of the '<em><b>Global Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Global Slot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Global Slot</em>' reference.
     * @see #setGlobalSlot(AtlantisConfigurationSlot)
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_GlobalSlot()
     * @model required="true"
     * @generated
     */
    AtlantisConfigurationSlot getGlobalSlot ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.global.TransformSiteToGlobal#getGlobalSlot <em>Global Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Global Slot</em>' reference.
     * @see #getGlobalSlot()
     * @generated
     */
    void setGlobalSlot ( AtlantisConfigurationSlot value );

    /**
     * Returns the value of the '<em><b>Sites</b></em>' containment reference list.
     * The list contents are of type {@link org.openscada.configurator.processor.common.global.Site}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sites</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sites</em>' containment reference list.
     * @see org.openscada.configurator.processor.common.global.GlobalPackage#getTransformSiteToGlobal_Sites()
     * @model containment="true"
     * @generated
     */
    EList<Site> getSites ();

} // TransformSiteToGlobal
