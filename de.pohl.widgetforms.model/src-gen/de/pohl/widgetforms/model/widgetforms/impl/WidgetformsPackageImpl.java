/**
 */
package de.pohl.widgetforms.model.widgetforms.impl;

import de.pohl.widgetforms.model.widgetforms.WidgetFormsConfiguration;
import de.pohl.widgetforms.model.widgetforms.WidgetFormsOption;
import de.pohl.widgetforms.model.widgetforms.WidgetformsFactory;
import de.pohl.widgetforms.model.widgetforms.WidgetformsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetformsPackageImpl extends EPackageImpl implements WidgetformsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetFormsConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetFormsOptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.pohl.widgetforms.model.widgetforms.WidgetformsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WidgetformsPackageImpl() {
		super(eNS_URI, WidgetformsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WidgetformsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WidgetformsPackage init() {
		if (isInited) return (WidgetformsPackage)EPackage.Registry.INSTANCE.getEPackage(WidgetformsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWidgetformsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WidgetformsPackageImpl theWidgetformsPackage = registeredWidgetformsPackage instanceof WidgetformsPackageImpl ? (WidgetformsPackageImpl)registeredWidgetformsPackage : new WidgetformsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWidgetformsPackage.createPackageContents();

		// Initialize created meta-data
		theWidgetformsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWidgetformsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WidgetformsPackage.eNS_URI, theWidgetformsPackage);
		return theWidgetformsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetFormsConfiguration() {
		return widgetFormsConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWidgetFormsConfiguration_Options() {
		return (EReference)widgetFormsConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidgetFormsOption() {
		return widgetFormsOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetFormsOption_Key() {
		return (EAttribute)widgetFormsOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidgetFormsOption_Value() {
		return (EAttribute)widgetFormsOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetformsFactory getWidgetformsFactory() {
		return (WidgetformsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		widgetFormsConfigurationEClass = createEClass(WIDGET_FORMS_CONFIGURATION);
		createEReference(widgetFormsConfigurationEClass, WIDGET_FORMS_CONFIGURATION__OPTIONS);

		widgetFormsOptionEClass = createEClass(WIDGET_FORMS_OPTION);
		createEAttribute(widgetFormsOptionEClass, WIDGET_FORMS_OPTION__KEY);
		createEAttribute(widgetFormsOptionEClass, WIDGET_FORMS_OPTION__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(widgetFormsConfigurationEClass, WidgetFormsConfiguration.class, "WidgetFormsConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWidgetFormsConfiguration_Options(), this.getWidgetFormsOption(), null, "options", null, 0, -1, WidgetFormsConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetFormsOptionEClass, WidgetFormsOption.class, "WidgetFormsOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidgetFormsOption_Key(), ecorePackage.getEString(), "key", null, 0, 1, WidgetFormsOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidgetFormsOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, WidgetFormsOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WidgetformsPackageImpl
