/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.openscada.configurator.module.common.processing.ImportModule;
import org.openscada.configurator.module.common.processing.ProcessingFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Import Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.master.Module#process(org.openscada.configurator.Configuration, org.openscada.configuration.model.Project) <em>Process</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ImportModuleTest extends TestCase
{

    /**
     * The fixture for this Import Module test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImportModule fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ImportModuleTest.class );
    }

    /**
     * Constructs a new Import Module test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportModuleTest ( String name )
    {
        super ( name );
    }

    /**
     * Sets the fixture for this Import Module test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture ( ImportModule fixture )
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Import Module test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImportModule getFixture ()
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
        setFixture ( ProcessingFactory.eINSTANCE.createImportModule () );
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

} //ImportModuleTest
