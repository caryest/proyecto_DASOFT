/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Accion;
import Formularios_DASOFT.AccionSeleccion;
import Formularios_DASOFT.AccionValor;
import Formularios_DASOFT.Asercion;
import Formularios_DASOFT.AsercionHabilitado;
import Formularios_DASOFT.AsercionInvisible;
import Formularios_DASOFT.AsercionSeleccion;
import Formularios_DASOFT.AsercionValor;
import Formularios_DASOFT.BotonCancelar;
import Formularios_DASOFT.BotonCustom;
import Formularios_DASOFT.BotonGuardar;
import Formularios_DASOFT.BotonValidar;
import Formularios_DASOFT.Formulario;
import Formularios_DASOFT.Formularios_DASOFTFactory;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.Input;
import Formularios_DASOFT.InputBoton;
import Formularios_DASOFT.InputCheck;
import Formularios_DASOFT.InputCombo;
import Formularios_DASOFT.InputMultiple;
import Formularios_DASOFT.InputRadio;
import Formularios_DASOFT.InputReaccion;
import Formularios_DASOFT.InputTexto;
import Formularios_DASOFT.Layout;
import Formularios_DASOFT.PruebaInterfaz;
import Formularios_DASOFT.Reaccion;
import Formularios_DASOFT.ReaccionHabilitado;
import Formularios_DASOFT.ReaccionVisible;

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
	private EClass layoutEClass = null;

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
	private EClass inputBotonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputMultipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputReaccionEClass = null;

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
	private EClass botonValidarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botonGuardarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botonCancelarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botonCustomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reaccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reaccionVisibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reaccionHabilitadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pruebaInterfazEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accionValorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accionSeleccionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asercionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asercionInvisibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asercionHabilitadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asercionValorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asercionSeleccionEClass = null;

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
	public EReference getFormulario_Layout() {
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
	public EAttribute getFormulario_ComprobarAsercion() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulario_ComprobarAccion() {
		return (EAttribute)formularioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulario_Pruebas() {
		return (EReference)formularioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Columnas() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Entradas() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getInput_Visible() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Habilitado() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getInputTexto_Obligatorio() {
		return (EAttribute)inputTextoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputTexto_Valor() {
		return (EAttribute)inputTextoEClass.getEStructuralFeatures().get(1);
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
	public EClass getInputMultiple() {
		return inputMultipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputMultiple_Valores() {
		return (EAttribute)inputMultipleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputReaccion() {
		return inputReaccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputReaccion_Reaccion() {
		return (EReference)inputReaccionEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInputRadio_Seleccion() {
		return (EAttribute)inputRadioEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInputCombo_Seleccion() {
		return (EAttribute)inputComboEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInputCheck_Seleccion() {
		return (EAttribute)inputCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotonValidar() {
		return botonValidarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotonGuardar() {
		return botonGuardarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotonCancelar() {
		return botonCancelarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotonCustom() {
		return botonCustomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBotonCustom_Funcion() {
		return (EAttribute)botonCustomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReaccion() {
		return reaccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReaccion_Objetivo() {
		return (EReference)reaccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReaccion_Activacion() {
		return (EAttribute)reaccionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReaccionVisible() {
		return reaccionVisibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReaccionHabilitado() {
		return reaccionHabilitadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPruebaInterfaz() {
		return pruebaInterfazEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPruebaInterfaz_Name() {
		return (EAttribute)pruebaInterfazEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPruebaInterfaz_Acciones() {
		return (EReference)pruebaInterfazEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccion() {
		return accionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Elemento() {
		return (EReference)accionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccion_Asercion() {
		return (EReference)accionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccionValor() {
		return accionValorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccionValor_Valor() {
		return (EAttribute)accionValorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccionSeleccion() {
		return accionSeleccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccionSeleccion_Valor() {
		return (EAttribute)accionSeleccionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsercion() {
		return asercionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsercion_Elemento() {
		return (EReference)asercionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsercionInvisible() {
		return asercionInvisibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsercionInvisible_Estado() {
		return (EAttribute)asercionInvisibleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsercionHabilitado() {
		return asercionHabilitadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsercionHabilitado_Estado() {
		return (EAttribute)asercionHabilitadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsercionValor() {
		return asercionValorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsercionValor_Valor() {
		return (EAttribute)asercionValorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsercionSeleccion() {
		return asercionSeleccionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsercionSeleccion_Estado() {
		return (EAttribute)asercionSeleccionEClass.getEStructuralFeatures().get(0);
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
		createEReference(formularioEClass, FORMULARIO__LAYOUT);
		createEAttribute(formularioEClass, FORMULARIO__NAME);
		createEAttribute(formularioEClass, FORMULARIO__COMPROBAR_ASERCION);
		createEAttribute(formularioEClass, FORMULARIO__COMPROBAR_ACCION);
		createEReference(formularioEClass, FORMULARIO__PRUEBAS);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__COLUMNAS);
		createEReference(layoutEClass, LAYOUT__ENTRADAS);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__NAME);
		createEAttribute(inputEClass, INPUT__VISIBLE);
		createEAttribute(inputEClass, INPUT__HABILITADO);

		inputTextoEClass = createEClass(INPUT_TEXTO);
		createEAttribute(inputTextoEClass, INPUT_TEXTO__OBLIGATORIO);
		createEAttribute(inputTextoEClass, INPUT_TEXTO__VALOR);

		inputBotonEClass = createEClass(INPUT_BOTON);

		inputMultipleEClass = createEClass(INPUT_MULTIPLE);
		createEAttribute(inputMultipleEClass, INPUT_MULTIPLE__VALORES);

		inputReaccionEClass = createEClass(INPUT_REACCION);
		createEReference(inputReaccionEClass, INPUT_REACCION__REACCION);

		inputRadioEClass = createEClass(INPUT_RADIO);
		createEAttribute(inputRadioEClass, INPUT_RADIO__SELECCION);

		inputComboEClass = createEClass(INPUT_COMBO);
		createEAttribute(inputComboEClass, INPUT_COMBO__SELECCION);

		inputCheckEClass = createEClass(INPUT_CHECK);
		createEAttribute(inputCheckEClass, INPUT_CHECK__SELECCION);

		botonValidarEClass = createEClass(BOTON_VALIDAR);

		botonGuardarEClass = createEClass(BOTON_GUARDAR);

		botonCancelarEClass = createEClass(BOTON_CANCELAR);

		botonCustomEClass = createEClass(BOTON_CUSTOM);
		createEAttribute(botonCustomEClass, BOTON_CUSTOM__FUNCION);

		reaccionEClass = createEClass(REACCION);
		createEReference(reaccionEClass, REACCION__OBJETIVO);
		createEAttribute(reaccionEClass, REACCION__ACTIVACION);

		reaccionVisibleEClass = createEClass(REACCION_VISIBLE);

		reaccionHabilitadoEClass = createEClass(REACCION_HABILITADO);

		pruebaInterfazEClass = createEClass(PRUEBA_INTERFAZ);
		createEAttribute(pruebaInterfazEClass, PRUEBA_INTERFAZ__NAME);
		createEReference(pruebaInterfazEClass, PRUEBA_INTERFAZ__ACCIONES);

		accionEClass = createEClass(ACCION);
		createEReference(accionEClass, ACCION__ELEMENTO);
		createEReference(accionEClass, ACCION__ASERCION);

		accionValorEClass = createEClass(ACCION_VALOR);
		createEAttribute(accionValorEClass, ACCION_VALOR__VALOR);

		accionSeleccionEClass = createEClass(ACCION_SELECCION);
		createEAttribute(accionSeleccionEClass, ACCION_SELECCION__VALOR);

		asercionEClass = createEClass(ASERCION);
		createEReference(asercionEClass, ASERCION__ELEMENTO);

		asercionInvisibleEClass = createEClass(ASERCION_INVISIBLE);
		createEAttribute(asercionInvisibleEClass, ASERCION_INVISIBLE__ESTADO);

		asercionHabilitadoEClass = createEClass(ASERCION_HABILITADO);
		createEAttribute(asercionHabilitadoEClass, ASERCION_HABILITADO__ESTADO);

		asercionValorEClass = createEClass(ASERCION_VALOR);
		createEAttribute(asercionValorEClass, ASERCION_VALOR__VALOR);

		asercionSeleccionEClass = createEClass(ASERCION_SELECCION);
		createEAttribute(asercionSeleccionEClass, ASERCION_SELECCION__ESTADO);
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
		inputBotonEClass.getESuperTypes().add(this.getInput());
		inputMultipleEClass.getESuperTypes().add(this.getInput());
		inputReaccionEClass.getESuperTypes().add(this.getInputMultiple());
		inputRadioEClass.getESuperTypes().add(this.getInputReaccion());
		inputComboEClass.getESuperTypes().add(this.getInputMultiple());
		inputCheckEClass.getESuperTypes().add(this.getInputReaccion());
		botonValidarEClass.getESuperTypes().add(this.getInputBoton());
		botonGuardarEClass.getESuperTypes().add(this.getInputBoton());
		botonCancelarEClass.getESuperTypes().add(this.getBotonGuardar());
		botonCustomEClass.getESuperTypes().add(this.getInputBoton());
		reaccionVisibleEClass.getESuperTypes().add(this.getReaccion());
		reaccionHabilitadoEClass.getESuperTypes().add(this.getReaccion());
		accionValorEClass.getESuperTypes().add(this.getAccion());
		accionSeleccionEClass.getESuperTypes().add(this.getAccion());
		asercionInvisibleEClass.getESuperTypes().add(this.getAsercion());
		asercionHabilitadoEClass.getESuperTypes().add(this.getAsercion());
		asercionValorEClass.getESuperTypes().add(this.getAsercion());
		asercionSeleccionEClass.getESuperTypes().add(this.getAsercion());

		// Initialize classes, features, and operations; add parameters
		initEClass(formularioEClass, Formulario.class, "Formulario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulario_Layout(), this.getLayout(), null, "layout", null, 1, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulario_Name(), ecorePackage.getEString(), "name", null, 0, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulario_ComprobarAsercion(), ecorePackage.getEBoolean(), "comprobarAsercion", null, 0, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulario_ComprobarAccion(), ecorePackage.getEBoolean(), "comprobarAccion", null, 0, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormulario_Pruebas(), this.getPruebaInterfaz(), null, "pruebas", null, 0, 1, Formulario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_Columnas(), ecorePackage.getEInt(), "columnas", null, 1, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Entradas(), this.getInput(), null, "entradas", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", "prueba", 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Habilitado(), ecorePackage.getEBoolean(), "habilitado", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputTextoEClass, InputTexto.class, "InputTexto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputTexto_Obligatorio(), ecorePackage.getEBoolean(), "obligatorio", null, 0, 1, InputTexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputTexto_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, InputTexto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputBotonEClass, InputBoton.class, "InputBoton", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputMultipleEClass, InputMultiple.class, "InputMultiple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputMultiple_Valores(), ecorePackage.getEString(), "valores", null, 0, -1, InputMultiple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputReaccionEClass, InputReaccion.class, "InputReaccion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputReaccion_Reaccion(), this.getReaccion(), null, "reaccion", null, 1, 1, InputReaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputRadioEClass, InputRadio.class, "InputRadio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputRadio_Seleccion(), ecorePackage.getEInt(), "seleccion", null, 0, 1, InputRadio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputComboEClass, InputCombo.class, "InputCombo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputCombo_Seleccion(), ecorePackage.getEInt(), "seleccion", null, 0, 1, InputCombo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputCheckEClass, InputCheck.class, "InputCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputCheck_Seleccion(), ecorePackage.getEInt(), "seleccion", null, 0, -1, InputCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botonValidarEClass, BotonValidar.class, "BotonValidar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(botonGuardarEClass, BotonGuardar.class, "BotonGuardar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(botonCancelarEClass, BotonCancelar.class, "BotonCancelar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(botonCustomEClass, BotonCustom.class, "BotonCustom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBotonCustom_Funcion(), ecorePackage.getEString(), "funcion", null, 1, 1, BotonCustom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reaccionEClass, Reaccion.class, "Reaccion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReaccion_Objetivo(), this.getInput(), null, "objetivo", null, 1, 1, Reaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReaccion_Activacion(), ecorePackage.getEInt(), "activacion", null, 1, 1, Reaccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reaccionVisibleEClass, ReaccionVisible.class, "ReaccionVisible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reaccionHabilitadoEClass, ReaccionHabilitado.class, "ReaccionHabilitado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pruebaInterfazEClass, PruebaInterfaz.class, "PruebaInterfaz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPruebaInterfaz_Name(), ecorePackage.getEString(), "name", null, 0, 1, PruebaInterfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPruebaInterfaz_Acciones(), this.getAccion(), null, "acciones", null, 0, -1, PruebaInterfaz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accionEClass, Accion.class, "Accion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccion_Elemento(), this.getInput(), null, "elemento", null, 1, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccion_Asercion(), this.getAsercion(), null, "asercion", null, 1, 1, Accion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accionValorEClass, AccionValor.class, "AccionValor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccionValor_Valor(), ecorePackage.getEString(), "valor", null, 1, 1, AccionValor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accionSeleccionEClass, AccionSeleccion.class, "AccionSeleccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccionSeleccion_Valor(), ecorePackage.getEInt(), "valor", null, 1, 1, AccionSeleccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asercionEClass, Asercion.class, "Asercion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsercion_Elemento(), this.getInput(), null, "elemento", null, 1, 1, Asercion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asercionInvisibleEClass, AsercionInvisible.class, "AsercionInvisible", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsercionInvisible_Estado(), ecorePackage.getEBoolean(), "estado", null, 1, 1, AsercionInvisible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asercionHabilitadoEClass, AsercionHabilitado.class, "AsercionHabilitado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsercionHabilitado_Estado(), ecorePackage.getEBoolean(), "estado", null, 1, 1, AsercionHabilitado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asercionValorEClass, AsercionValor.class, "AsercionValor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsercionValor_Valor(), ecorePackage.getEString(), "valor", null, 1, 1, AsercionValor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asercionSeleccionEClass, AsercionSeleccion.class, "AsercionSeleccion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsercionSeleccion_Estado(), ecorePackage.getEInt(), "estado", null, 1, 1, AsercionSeleccion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Formularios_DASOFTPackageImpl
