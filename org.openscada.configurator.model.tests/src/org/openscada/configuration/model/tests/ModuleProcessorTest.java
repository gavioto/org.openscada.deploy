/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.openscada.configuration.model.ConfiguratorFactory;
import org.openscada.configuration.model.ModuleProcessor;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Module Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.Processor#process(org.openscada.configuration.model.Project) <em>Process</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ModuleProcessorTest extends TestCase
{

    /**
     * The fixture for this Module Processor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleProcessor fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ModuleProcessorTest.class );
    }

    /**
     * Constructs a new Module Processor test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModuleProcessorTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Module Processor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( ModuleProcessor fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Module Processor test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModuleProcessor getFixture ()
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
        setFixture ( ConfiguratorFactory.eINSTANCE.createModuleProcessor () );
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
    public void testProcess ()
    {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail ();
    }

} //ModuleProcessorTest
