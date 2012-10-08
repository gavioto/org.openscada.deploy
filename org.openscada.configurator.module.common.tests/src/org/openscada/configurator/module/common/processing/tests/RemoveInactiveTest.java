/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.openscada.configurator.module.common.processing.ProcessingFactory;
import org.openscada.configurator.module.common.processing.RemoveInactive;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Remove Inactive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.master.Module#process(org.openscada.configurator.Configuration, org.openscada.configuration.model.Project) <em>Process</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RemoveInactiveTest extends TestCase
{

    /**
     * The fixture for this Remove Inactive test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoveInactive fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( RemoveInactiveTest.class );
    }

    /**
     * Constructs a new Remove Inactive test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoveInactiveTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Remove Inactive test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( RemoveInactive fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Remove Inactive test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RemoveInactive getFixture ()
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
        setFixture ( ProcessingFactory.eINSTANCE.createRemoveInactive () );
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
     * Tests the '{@link org.openscada.configuration.model.master.Module#process(org.openscada.configurator.Configuration, org.openscada.configuration.model.Project) <em>Process</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.master.Module#process(org.openscada.configurator.Configuration, org.openscada.configuration.model.Project)
     * @generated
     */
    public void testProcess__Configuration_Project ()
    {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail ();
    }

} //RemoveInactiveTest
