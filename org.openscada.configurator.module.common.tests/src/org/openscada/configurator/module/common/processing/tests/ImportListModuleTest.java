/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.processing.tests;

import junit.textui.TestRunner;

import org.openscada.configurator.module.common.processing.ImportListModule;
import org.openscada.configurator.module.common.processing.ProcessingFactory;

import org.openscada.configurator.module.common.tests.FileModuleTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Import List Module</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImportListModuleTest extends FileModuleTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ImportListModuleTest.class );
    }

    /**
     * Constructs a new Import List Module test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportListModuleTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Import List Module test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ImportListModule getFixture ()
    {
        return (ImportListModule)fixture;
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
        setFixture ( ProcessingFactory.eINSTANCE.createImportListModule () );
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

} //ImportListModuleTest
