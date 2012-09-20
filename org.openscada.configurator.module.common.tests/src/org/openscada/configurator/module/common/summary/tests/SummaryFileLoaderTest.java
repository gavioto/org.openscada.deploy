/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.summary.tests;

import junit.textui.TestRunner;

import org.openscada.configurator.module.common.summary.SummaryFactory;
import org.openscada.configurator.module.common.summary.SummaryFileLoader;
import org.openscada.configurator.module.common.tests.FileModuleTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>File Loader</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SummaryFileLoaderTest extends FileModuleTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( SummaryFileLoaderTest.class );
    }

    /**
     * Constructs a new File Loader test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SummaryFileLoaderTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this File Loader test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected SummaryFileLoader getFixture ()
    {
        return (SummaryFileLoader)fixture;
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
        setFixture ( SummaryFactory.eINSTANCE.createSummaryFileLoader () );
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

} //SummaryFileLoaderTest
