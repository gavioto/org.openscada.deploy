/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.tests;

import junit.textui.TestRunner;

import org.openscada.deploy.iolist.model.FormulaItem;
import org.openscada.deploy.iolist.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Formula Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulaItemTest extends ItemTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( FormulaItemTest.class );
    }

    /**
     * Constructs a new Formula Item test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormulaItemTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Formula Item test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected FormulaItem getFixture ()
    {
        return (FormulaItem)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp () throws Exception
    {
        setFixture ( ModelFactory.eINSTANCE.createFormulaItem () );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown () throws Exception
    {
        setFixture ( null );
    }

} //FormulaItemTest
