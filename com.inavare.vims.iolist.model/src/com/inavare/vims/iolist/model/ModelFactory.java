/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.inavare.vims.iolist.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.inavare.vims.iolist.model.ModelPackage
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
    ModelFactory eINSTANCE = com.inavare.vims.iolist.model.impl.ModelFactoryImpl.init();

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
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ModelPackage getModelPackage();

} //ModelFactory
