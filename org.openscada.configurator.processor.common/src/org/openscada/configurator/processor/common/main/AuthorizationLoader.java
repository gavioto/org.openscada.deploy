/**
 */
package org.openscada.configurator.processor.common.main;

import org.openscada.configuration.model.GenericMasterConfigurationSlot;
import org.openscada.configuration.model.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openscada.configurator.processor.common.main.AuthorizationLoader#getFile <em>File</em>}</li>
 *   <li>{@link org.openscada.configurator.processor.common.main.AuthorizationLoader#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openscada.configurator.processor.common.main.MainPackage#getAuthorizationLoader()
 * @model
 * @generated
 */
public interface AuthorizationLoader extends Processor
{
    /**
     * Returns the value of the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File</em>' attribute.
     * @see #setFile(String)
     * @see org.openscada.configurator.processor.common.main.MainPackage#getAuthorizationLoader_File()
     * @model required="true"
     * @generated
     */
    String getFile ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.main.AuthorizationLoader#getFile <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File</em>' attribute.
     * @see #getFile()
     * @generated
     */
    void setFile ( String value );

    /**
     * Returns the value of the '<em><b>Slot</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Slot</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Slot</em>' reference.
     * @see #setSlot(GenericMasterConfigurationSlot)
     * @see org.openscada.configurator.processor.common.main.MainPackage#getAuthorizationLoader_Slot()
     * @model
     * @generated
     */
    GenericMasterConfigurationSlot getSlot ();

    /**
     * Sets the value of the '{@link org.openscada.configurator.processor.common.main.AuthorizationLoader#getSlot <em>Slot</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Slot</em>' reference.
     * @see #getSlot()
     * @generated
     */
    void setSlot ( GenericMasterConfigurationSlot value );

} // AuthorizationLoader
