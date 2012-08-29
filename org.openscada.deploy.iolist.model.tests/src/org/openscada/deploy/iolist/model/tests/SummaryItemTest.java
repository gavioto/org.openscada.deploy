/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.SummaryItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Summary Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SummaryItemTest extends TestCase
{

    /**
     * The fixture for this Summary Item test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SummaryItem fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( SummaryItemTest.class );
    }

    /**
     * Constructs a new Summary Item test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryItemTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Summary Item test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( SummaryItem fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Summary Item test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SummaryItem getFixture ()
    {
        return fixture;
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
        setFixture ( ModelFactory.eINSTANCE.createSummaryItem () );
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

} //SummaryItemTest
