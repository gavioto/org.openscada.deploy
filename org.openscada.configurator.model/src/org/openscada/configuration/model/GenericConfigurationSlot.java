/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model;

import org.eclipse.emf.common.util.EList;
import org.openscada.configurator.GenericConfiguration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.GenericConfigurationSlot#getJsonBase <em>Json Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configuration.model.ConfiguratorPackage#getGenericConfigurationSlot()
 * @model abstract="true"
 * @generated
 */
public interface GenericConfigurationSlot extends ConfigurationSlot
{
    /**
     * Returns the value of the '<em><b>Json Base</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Json Base</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Json Base</em>' attribute list.
     * @see org.openscada.configuration.model.ConfiguratorPackage#getGenericConfigurationSlot_JsonBase()
     * @model
     * @generated
     */
    EList<String> getJsonBase ();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model configurationDataType="org.openscada.configuration.model.GenericConfiguration"
     * @generated
     */
    void initialize ( GenericConfiguration configuration );

} // GenericConfigurationSlot
