/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formulario;
import Formularios_DASOFT.Formularios_DASOFTFactory;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.Input;
import Formularios_DASOFT.InputBoton;
import Formularios_DASOFT.InputCheck;
import Formularios_DASOFT.InputCombo;
import Formularios_DASOFT.InputRadio;
import Formularios_DASOFT.InputTexto;

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
public class Formularios_DASOFTPackageImpl extends EPackageImpl implements Formularios_DASOFTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formularioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTextoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputRadioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputComboEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputBotonEClass = null;

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
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Formularios_DASOFTPackageImpl() {
		super(eNS_URI, Formularios_DASOFTFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Formularios_DASOFTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Formularios_DASOFTPackage init() {
		if (isInited) return (Formularios_DASOFTPackage)EPackage.Registry.INSTANCE.getEPackage(Formularios_DASOFTPackage.eNS_URI);

		// Obtain or create and register package
		Formularios_DASOFTPackageImpl theFormularios_DASOFTPackage = (Formularios_DASOFTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Formularios_DASOFTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Formularios_DASOFTPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFormularios_DASOFTPackage.createPackageContents();

		// Initialize created meta-data
		theFormularios_DASOFTPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFormularios_DASOFTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Formularios_DASOFTPackage.eNS_URI, theFormularios_DASOFTPackage);
		return theFormularios_DASOFTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulario() {
		return formularioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulario_Entradas() {
		return (EReference)formularioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_Name() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Name() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputTexto() {
		return inputTextoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputRadio() {
		return inputRadioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputCombo() {
		return inputComboEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputCheck() {
		return inputCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputBoton() {
		return inputBotonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formularios_DASOFTFactory getFormularios_DASOFTFactory() {
		return (Formularios_DASOFTFactory)getEFactoryInstance();
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
		formularioEClass = createEClass(FORMULARIO);
		createEReference(formularioEClass, FORMULARIO__ENTRADAS);
		createEAttribute(formularioEClass, FORMULARIO__NAME);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__NAME);

		inputTextoEClass = createEClass(INPUT_TEXTO);

		inputRadioEClass = createEClass(INPUT_RADIO);

		inputComboEClass = createEClass(INPUT_COMBO);

		inputCheckEClass = createEClass(INPUT_CHECK);

		inputBotonEClass = createEClass(INPUT_BOTON);
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
		inputTextoEClass.getESuperTypes().add(this.getInput());
		inputRadioEClass.getESuperTypes().add(this.getInput());
		inputComboEClass.getESuperTypes().add(this.getInput());
		inputCheckEClass.getESuperTypes().add(this.getInput());
		inputBotonEClass.getESuperTypes().add(this.getInput());

		// Initialize classes, features, and operations; add parameters
		initEClass(formularioEClass, Formulario.class, "Formulario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulario_Entradas(), this.getInput(), null, "entradas", null, 0, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulario_Name(), ecorePackage.getEString(), "name", null, 0, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputTextoEClass, InputTexto.class, "InputTexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputRadioEClass, InputRadio.class, "InputRadio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputComboEClass, InputCombo.class, "InputCombo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputCheckEClass, InputCheck.class, "InputCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputBotonEClass, InputBoton.class, "InputBoton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Formularios_DASOFTPackageImpl
