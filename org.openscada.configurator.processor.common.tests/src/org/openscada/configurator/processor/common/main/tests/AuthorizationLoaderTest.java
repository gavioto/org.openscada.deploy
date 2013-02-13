/**
 */
package org.openscada.configurator.processor.common.main.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configurator.processor.common.main.AuthorizationLoader;
import org.openscada.configurator.processor.common.main.MainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Authorization Loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.Processor#process(org.openscada.configuration.model.Project) <em>Process</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AuthorizationLoaderTest extends TestCase
{

    /**
     * The fixture for this Authorization Loader test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuthorizationLoader fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( AuthorizationLoaderTest.class );
    }

    /**
     * Constructs a new Authorization Loader test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AuthorizationLoaderTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Authorization Loader test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( AuthorizationLoader fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Authorization Loader test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuthorizationLoader getFixture ()
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
        setFixture ( MainFactory.eINSTANCE.createAuthorizationLoader () );
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

} //AuthorizationLoaderTest
