/**
 */
package org.openscada.configurator.processor.common.main.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configurator.processor.common.main.MainFactory;
import org.openscada.configurator.processor.common.main.SecurityLoader;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.Processor#process(org.openscada.configuration.model.Project) <em>Process</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SecurityLoaderTest extends TestCase
{

    /**
     * The fixture for this Security Loader test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SecurityLoader fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( SecurityLoaderTest.class );
    }

    /**
     * Constructs a new Security Loader test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SecurityLoaderTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Security Loader test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( SecurityLoader fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Security Loader test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SecurityLoader getFixture ()
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
        setFixture ( MainFactory.eINSTANCE.createSecurityLoader () );
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

    /**
     * Tests the '{@link org.openscada.configuration.model.Processor#process(org.openscada.configuration.model.Project) <em>Process</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.Processor#process(org.openscada.configuration.model.Project)
     * @generated
     */
    public void testProcess__Project ()
    {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail ();
    }

} //SecurityLoaderTest
