/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.master.tests;

import junit.textui.TestRunner;

import org.openscada.configuration.model.master.AtlantisConfigurationSlot;
import org.openscada.configuration.model.master.MasterFactory;
import org.openscada.configuration.model.tests.GenericConfigurationSlotTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atlantis Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.master.AtlantisConfigurationSlot#getConfigurationData() <em>Get Configuration Data</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AtlantisConfigurationSlotTest extends GenericConfigurationSlotTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( AtlantisConfigurationSlotTest.class );
    }

    /**
     * Constructs a new Atlantis Configuration Slot test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AtlantisConfigurationSlotTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Atlantis Configuration Slot test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected AtlantisConfigurationSlot getFixture ()
    {
        return (AtlantisConfigurationSlot)fixture;
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
        setFixture ( MasterFactory.eINSTANCE.createAtlantisConfigurationSlot () );
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
     * Tests the '{@link org.openscada.configuration.model.master.AtlantisConfigurationSlot#getConfigurationData() <em>Get Configuration Data</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.master.AtlantisConfigurationSlot#getConfigurationData()
     * @generated
     */
    public void testGetConfigurationData ()
    {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail ();
    }

} //AtlantisConfigurationSlotTest
