/**
 */
package de.pohl.widgetforms.model.widgetforms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.pohl.widgetforms.model.widgetforms.WidgetformsFactory
 * @model kind="package"
 * @generated
 */
public interface WidgetformsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "widgetforms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.pohl.de/widgetforms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "widgetforms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WidgetformsPackage eINSTANCE = de.pohl.widgetforms.model.widgetforms.impl.WidgetformsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsConfigurationImpl <em>Widget Forms Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsConfigurationImpl
	 * @see de.pohl.widgetforms.model.widgetforms.impl.WidgetformsPackageImpl#getWidgetFormsConfiguration()
	 * @generated
	 */
	int WIDGET_FORMS_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORMS_CONFIGURATION__OPTIONS = 0;

	/**
	 * The number of structural features of the '<em>Widget Forms Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORMS_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Widget Forms Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORMS_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsOptionImpl <em>Widget Forms Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsOptionImpl
	 * @see de.pohl.widgetforms.model.widgetforms.impl.WidgetformsPackageImpl#getWidgetFormsOption()
	 * @generated
	 */
	int WIDGET_FORMS_OPTION = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORMS_OPTION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORMS_OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Widget Forms Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORMS_OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Widget Forms Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FORMS_OPTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration <em>Widget Forms Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Forms Configuration</em>'.
	 * @see de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration
	 * @generated
	 */
	EClass getWidgetFormsConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration#getOptions()
	 * @see #getWidgetFormsConfiguration()
	 * @generated
	 */
	EReference getWidgetFormsConfiguration_Options();

	/**
	 * Returns the meta object for class '{@link de.pohl.widgetforms.model.widgetforms.WidgetFormsOption <em>Widget Forms Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget Forms Option</em>'.
	 * @see de.pohl.widgetforms.model.widgetforms.WidgetFormsOption
	 * @generated
	 */
	EClass getWidgetFormsOption();

	/**
	 * Returns the meta object for the attribute '{@link de.pohl.widgetforms.model.widgetforms.WidgetFormsOption#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.pohl.widgetforms.model.widgetforms.WidgetFormsOption#getKey()
	 * @see #getWidgetFormsOption()
	 * @generated
	 */
	EAttribute getWidgetFormsOption_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.pohl.widgetforms.model.widgetforms.WidgetFormsOption#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.pohl.widgetforms.model.widgetforms.WidgetFormsOption#getValue()
	 * @see #getWidgetFormsOption()
	 * @generated
	 */
	EAttribute getWidgetFormsOption_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WidgetformsFactory getWidgetformsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsConfigurationImpl <em>Widget Forms Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsConfigurationImpl
		 * @see de.pohl.widgetforms.model.widgetforms.impl.WidgetformsPackageImpl#getWidgetFormsConfiguration()
		 * @generated
		 */
		EClass WIDGET_FORMS_CONFIGURATION = eINSTANCE.getWidgetFormsConfiguration();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIDGET_FORMS_CONFIGURATION__OPTIONS = eINSTANCE.getWidgetFormsConfiguration_Options();

		/**
		 * The meta object literal for the '{@link de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsOptionImpl <em>Widget Forms Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsOptionImpl
		 * @see de.pohl.widgetforms.model.widgetforms.impl.WidgetformsPackageImpl#getWidgetFormsOption()
		 * @generated
		 */
		EClass WIDGET_FORMS_OPTION = eINSTANCE.getWidgetFormsOption();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FORMS_OPTION__KEY = eINSTANCE.getWidgetFormsOption_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET_FORMS_OPTION__VALUE = eINSTANCE.getWidgetFormsOption_Value();

	}

} //WidgetformsPackage
