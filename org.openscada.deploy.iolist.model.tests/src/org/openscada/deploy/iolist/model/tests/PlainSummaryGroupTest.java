/**
 */
package org.openscada.deploy.iolist.model.tests;

import junit.textui.TestRunner;

import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.PlainSummaryGroup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plain Summary Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlainSummaryGroupTest extends SummaryGroupTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( PlainSummaryGroupTest.class );
    }

    /**
     * Constructs a new Plain Summary Group test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PlainSummaryGroupTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Plain Summary Group test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PlainSummaryGroup getFixture ()
    {
        return (PlainSummaryGroup)fixture;
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
        setFixture ( ModelFactory.eINSTANCE.createPlainSummaryGroup () );
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

} //PlainSummaryGroupTest
