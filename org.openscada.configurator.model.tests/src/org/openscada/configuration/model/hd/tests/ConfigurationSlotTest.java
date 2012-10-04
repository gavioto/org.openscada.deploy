/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configuration.model.hd.tests;

import junit.textui.TestRunner;

import org.openscada.configuration.model.hd.ConfigurationSlot;
import org.openscada.configuration.model.hd.HdFactory;

import org.openscada.configuration.model.tests.GenericConfigurationSlotTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Configuration Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.openscada.configuration.model.hd.ConfigurationSlot#getConfigurationData() <em>Get Configuration Data</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ConfigurationSlotTest extends GenericConfigurationSlotTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main ( String[] args )
    {
        TestRunner.run ( ConfigurationSlotTest.class );
    }

    /**
     * Constructs a new Configuration Slot test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigurationSlotTest ( String name )
    {
        super ( name );
    }

    /**
     * Returns the fixture for this Configuration Slot test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ConfigurationSlot getFixture ()
    {
        return (ConfigurationSlot)fixture;
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
        setFixture ( HdFactory.eINSTANCE.createConfigurationSlot () );
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
     * Tests the '{@link org.openscada.configuration.model.hd.ConfigurationSlot#getConfigurationData() <em>Get Configuration Data</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configuration.model.hd.ConfigurationSlot#getConfigurationData()
     * @generated
     */
    public void testGetConfigurationData ()
    {
        // TODO: implement this operation test method
        // Ensure that you remove @generated or mark it @generated NOT
        fail ();
    }

} //ConfigurationSlotTest
