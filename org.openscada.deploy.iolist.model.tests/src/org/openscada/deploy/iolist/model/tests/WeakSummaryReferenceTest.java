/**
 */
package org.openscada.deploy.iolist.model.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.openscada.deploy.iolist.model.ModelFactory;
import org.openscada.deploy.iolist.model.WeakSummaryReference;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Weak Summary Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeakSummaryReferenceTest extends TestCase
{

    /**
     * The fixture for this Weak Summary Reference test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WeakSummaryReference fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( WeakSummaryReferenceTest.class );
    }

    /**
     * Constructs a new Weak Summary Reference test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WeakSummaryReferenceTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Weak Summary Reference test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( WeakSummaryReference fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Weak Summary Reference test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WeakSummaryReference getFixture ()
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
        setFixture ( ModelFactory.eINSTANCE.createWeakSummaryReference () );
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

} //WeakSummaryReferenceTest
