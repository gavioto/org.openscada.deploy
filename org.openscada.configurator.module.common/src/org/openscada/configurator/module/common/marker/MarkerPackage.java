/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openscada.configurator.module.common.marker;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openscada.configuration.model.ConfiguratorPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openscada.configurator.module.common.marker.MarkerFactory
 * @model kind="package"
 * @generated
 */
public interface MarkerPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "marker";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://openscada.org/Configurator/Modules/Common/Marker";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "marker";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MarkerPackage eINSTANCE = org.openscada.configurator.module.common.marker.impl.MarkerPackageImpl.init ();

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.marker.impl.LevelMarkerGeneratorImpl <em>Level Marker Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.marker.impl.LevelMarkerGeneratorImpl
     * @see org.openscada.configurator.module.common.marker.impl.MarkerPackageImpl#getLevelMarkerGenerator()
     * @generated
     */
    int LEVEL_MARKER_GENERATOR = 0;

    /**
     * The feature id for the '<em><b>Marker Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_MARKER_GENERATOR__MARKER_NAME = ConfiguratorPackage.MODULE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Markers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_MARKER_GENERATOR__MARKERS = ConfiguratorPackage.MODULE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Level Marker Generator</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LEVEL_MARKER_GENERATOR_FEATURE_COUNT = ConfiguratorPackage.MODULE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.openscada.configurator.module.common.marker.impl.MarkerImpl <em>Marker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openscada.configurator.module.common.marker.impl.MarkerImpl
     * @see org.openscada.configurator.module.common.marker.impl.MarkerPackageImpl#getMarker()
     * @generated
     */
    int MARKER = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER__VALUE = 1;

    /**
     * The number of structural features of the '<em>Marker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKER_FEATURE_COUNT = 2;

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.marker.LevelMarkerGenerator <em>Level Marker Generator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Level Marker Generator</em>'.
     * @see org.openscada.configurator.module.common.marker.LevelMarkerGenerator
     * @generated
     */
    EClass getLevelMarkerGenerator ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.marker.LevelMarkerGenerator#getMarkerName <em>Marker Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Marker Name</em>'.
     * @see org.openscada.configurator.module.common.marker.LevelMarkerGenerator#getMarkerName()
     * @see #getLevelMarkerGenerator()
     * @generated
     */
    EAttribute getLevelMarkerGenerator_MarkerName ();

    /**
     * Returns the meta object for the containment reference list '{@link org.openscada.configurator.module.common.marker.LevelMarkerGenerator#getMarkers <em>Markers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Markers</em>'.
     * @see org.openscada.configurator.module.common.marker.LevelMarkerGenerator#getMarkers()
     * @see #getLevelMarkerGenerator()
     * @generated
     */
    EReference getLevelMarkerGenerator_Markers ();

    /**
     * Returns the meta object for class '{@link org.openscada.configurator.module.common.marker.Marker <em>Marker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Marker</em>'.
     * @see org.openscada.configurator.module.common.marker.Marker
     * @generated
     */
    EClass getMarker ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.marker.Marker#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.openscada.configurator.module.common.marker.Marker#getName()
     * @see #getMarker()
     * @generated
     */
    EAttribute getMarker_Name ();

    /**
     * Returns the meta object for the attribute '{@link org.openscada.configurator.module.common.marker.Marker#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.openscada.configurator.module.common.marker.Marker#getValue()
     * @see #getMarker()
     * @generated
     */
    EAttribute getMarker_Value ();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MarkerFactory getMarkerFactory ();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.marker.impl.LevelMarkerGeneratorImpl <em>Level Marker Generator</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.marker.impl.LevelMarkerGeneratorImpl
         * @see org.openscada.configurator.module.common.marker.impl.MarkerPackageImpl#getLevelMarkerGenerator()
         * @generated
         */
        EClass LEVEL_MARKER_GENERATOR = eINSTANCE.getLevelMarkerGenerator ();

        /**
         * The meta object literal for the '<em><b>Marker Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LEVEL_MARKER_GENERATOR__MARKER_NAME = eINSTANCE.getLevelMarkerGenerator_MarkerName ();

        /**
         * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LEVEL_MARKER_GENERATOR__MARKERS = eINSTANCE.getLevelMarkerGenerator_Markers ();

        /**
         * The meta object literal for the '{@link org.openscada.configurator.module.common.marker.impl.MarkerImpl <em>Marker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.openscada.configurator.module.common.marker.impl.MarkerImpl
         * @see org.openscada.configurator.module.common.marker.impl.MarkerPackageImpl#getMarker()
         * @generated
         */
        EClass MARKER = eINSTANCE.getMarker ();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MARKER__NAME = eINSTANCE.getMarker_Name ();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MARKER__VALUE = eINSTANCE.getMarker_Value ();

    }

} //MarkerPackage
