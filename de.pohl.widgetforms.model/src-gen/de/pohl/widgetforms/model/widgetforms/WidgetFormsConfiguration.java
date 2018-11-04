/**
 */
package de.pohl.widgetforms.model.widgetforms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget Forms Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see de.pohl.widgetforms.model.widgetforms.WidgetformsPackage#getWidgetFormsConfiguration()
 * @model
 * @generated
 */
public interface WidgetFormsConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' reference list.
	 * The list contents are of type {@link de.pohl.widgetforms.model.widgetforms.WidgetFormsOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' reference list.
	 * @see de.pohl.widgetforms.model.widgetforms.WidgetformsPackage#getWidgetFormsConfiguration_Options()
	 * @model
	 * @generated
	 */
	EList<WidgetFormsOption> getOptions();

} // WidgetFormsConfiguration
