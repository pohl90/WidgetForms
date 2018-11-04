/**
 */
package de.pohl.widgetforms.model.widgetforms.impl;

import de.pohl.widgetforms.model.widgetforms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetformsFactoryImpl extends EFactoryImpl implements WidgetformsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WidgetformsFactory init() {
		try {
			WidgetformsFactory theWidgetformsFactory = (WidgetformsFactory)EPackage.Registry.INSTANCE.getEFactory(WidgetformsPackage.eNS_URI);
			if (theWidgetformsFactory != null) {
				return theWidgetformsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WidgetformsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetformsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WidgetformsPackage.WIDGET_FORMS_CONFIGURATION: return createWidgetFormsConfiguration();
			case WidgetformsPackage.WIDGET_FORMS_OPTION: return createWidgetFormsOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetFormsConfiguration createWidgetFormsConfiguration() {
		WidgetFormsConfigurationImpl widgetFormsConfiguration = new WidgetFormsConfigurationImpl();
		return widgetFormsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetFormsOption createWidgetFormsOption() {
		WidgetFormsOptionImpl widgetFormsOption = new WidgetFormsOptionImpl();
		return widgetFormsOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetformsPackage getWidgetformsPackage() {
		return (WidgetformsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WidgetformsPackage getPackage() {
		return WidgetformsPackage.eINSTANCE;
	}

} //WidgetformsFactoryImpl
