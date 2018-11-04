/**
 */
package de.pohl.widgetforms.model.widgetforms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.pohl.widgetforms.model.widgetforms.WidgetformsPackage
 * @generated
 */
public interface WidgetformsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WidgetformsFactory eINSTANCE = de.pohl.widgetforms.model.widgetforms.impl.WidgetformsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Widget Forms Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Forms Configuration</em>'.
	 * @generated
	 */
	WidgetFormsConfiguration createWidgetFormsConfiguration();

	/**
	 * Returns a new object of class '<em>Widget Forms Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Widget Forms Option</em>'.
	 * @generated
	 */
	WidgetFormsOption createWidgetFormsOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WidgetformsPackage getWidgetformsPackage();

} //WidgetformsFactory
