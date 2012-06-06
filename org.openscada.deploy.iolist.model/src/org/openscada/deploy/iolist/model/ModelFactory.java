/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openscada.deploy.iolist.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ModelFactory eINSTANCE = org.openscada.deploy.iolist.model.impl.ModelFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Item</em>'.
     * @generated
     */
    Item createItem();

    /**
     * Returns a new object of class '<em>Summary Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Summary Group</em>'.
     * @generated
     */
    SummaryGroup createSummaryGroup();

    /**
     * Returns a new object of class '<em>Summary Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Summary Item</em>'.
     * @generated
     */
    SummaryItem createSummaryItem();

    /**
     * Returns a new object of class '<em>Formula Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula Item</em>'.
     * @generated
     */
    FormulaItem createFormulaItem();

    /**
     * Returns a new object of class '<em>Formula Input</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Formula Input</em>'.
     * @generated
     */
    FormulaInput createFormulaInput();

    /**
     * Returns a new object of class '<em>Script Module</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Script Module</em>'.
     * @generated
     */
    ScriptModule createScriptModule();

    /**
     * Returns a new object of class '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model</em>'.
     * @generated
     */
    Model createModel();

    /**
     * Returns a new object of class '<em>Script Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Script Item</em>'.
     * @generated
     */
    ScriptItem createScriptItem();

    /**
     * Returns a new object of class '<em>Script Output</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Script Output</em>'.
     * @generated
     */
    ScriptOutput createScriptOutput();

    /**
     * Returns a new object of class '<em>Mapper</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mapper</em>'.
     * @generated
     */
    Mapper createMapper();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ModelPackage getModelPackage();

} //ModelFactory
