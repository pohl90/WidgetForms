/**
 */
package de.pohl.widgetforms.model.widgetforms.impl;

import de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration;
import de.pohl.widgetforms.model.widgetforms.WidgetFormsOption;
import de.pohl.widgetforms.model.widgetforms.WidgetformsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget Forms Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.pohl.widgetforms.model.widgetforms.impl.WidgetFormsConfigurationImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetFormsConfigurationImpl extends MinimalEObjectImpl.Container implements WidgetFormsConfiguration {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<WidgetFormsOption> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetFormsConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetformsPackage.Literals.WIDGET_FORMS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WidgetFormsOption> getOptions() {
		if (options == null) {
			options = new EObjectResolvingEList<WidgetFormsOption>(WidgetFormsOption.class, this, WidgetformsPackage.WIDGET_FORMS_CONFIGURATION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WidgetformsPackage.WIDGET_FORMS_CONFIGURATION__OPTIONS:
				return getOptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WidgetformsPackage.WIDGET_FORMS_CONFIGURATION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends WidgetFormsOption>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WidgetformsPackage.WIDGET_FORMS_CONFIGURATION__OPTIONS:
				getOptions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WidgetformsPackage.WIDGET_FORMS_CONFIGURATION__OPTIONS:
				return options != null && !options.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WidgetFormsConfigurationImpl
