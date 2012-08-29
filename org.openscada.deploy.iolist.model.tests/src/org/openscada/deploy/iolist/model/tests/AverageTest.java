/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.deploy.iolist.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.deploy.iolist.model.Average;
import org.openscada.deploy.iolist.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Average</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AverageTest extends TestCase
{

    /**
     * The fixture for this Average test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Average fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( AverageTest.class );
    }

    /**
     * Constructs a new Average test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AverageTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Average test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( Average fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Average test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Average getFixture ()
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
        setFixture ( ModelFactory.eINSTANCE.createAverage () );
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

} //AverageTest
