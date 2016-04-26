/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.*;

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
public class Formularios_DASOFTFactoryImpl extends EFactoryImpl implements Formularios_DASOFTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Formularios_DASOFTFactory init() {
		try {
			Formularios_DASOFTFactory theFormularios_DASOFTFactory = (Formularios_DASOFTFactory)EPackage.Registry.INSTANCE.getEFactory(Formularios_DASOFTPackage.eNS_URI);
			if (theFormularios_DASOFTFactory != null) {
				return theFormularios_DASOFTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Formularios_DASOFTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formularios_DASOFTFactoryImpl() {
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
			case Formularios_DASOFTPackage.FORMULARIO: return createFormulario();
			case Formularios_DASOFTPackage.LAYOUT: return createLayout();
			case Formularios_DASOFTPackage.INPUT_TEXTO: return createInputTexto();
			case Formularios_DASOFTPackage.INPUT_BOTON: return createInputBoton();
			case Formularios_DASOFTPackage.INPUT_MULTIPLE: return createInputMultiple();
			case Formularios_DASOFTPackage.INPUT_RADIO: return createInputRadio();
			case Formularios_DASOFTPackage.INPUT_COMBO: return createInputCombo();
			case Formularios_DASOFTPackage.INPUT_CHECK: return createInputCheck();
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ: return createPruebaInterfaz();
			case Formularios_DASOFTPackage.ACCION: return createAccion();
			case Formularios_DASOFTPackage.ASERCION_INVISIBLE: return createAsercionInvisible();
			case Formularios_DASOFTPackage.ASERCION_HABILITADO: return createAsercionHabilitado();
			case Formularios_DASOFTPackage.ASERCION_VALOR: return createAsercionValor();
			case Formularios_DASOFTPackage.ASERCION_SELECCIONADO: return createAsercionSeleccionado();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formulario createFormulario() {
		FormularioImpl formulario = new FormularioImpl();
		return formulario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTexto createInputTexto() {
		InputTextoImpl inputTexto = new InputTextoImpl();
		return inputTexto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBoton createInputBoton() {
		InputBotonImpl inputBoton = new InputBotonImpl();
		return inputBoton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputMultiple createInputMultiple() {
		InputMultipleImpl inputMultiple = new InputMultipleImpl();
		return inputMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputRadio createInputRadio() {
		InputRadioImpl inputRadio = new InputRadioImpl();
		return inputRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputCombo createInputCombo() {
		InputComboImpl inputCombo = new InputComboImpl();
		return inputCombo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputCheck createInputCheck() {
		InputCheckImpl inputCheck = new InputCheckImpl();
		return inputCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PruebaInterfaz createPruebaInterfaz() {
		PruebaInterfazImpl pruebaInterfaz = new PruebaInterfazImpl();
		return pruebaInterfaz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accion createAccion() {
		AccionImpl accion = new AccionImpl();
		return accion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsercionInvisible createAsercionInvisible() {
		AsercionInvisibleImpl asercionInvisible = new AsercionInvisibleImpl();
		return asercionInvisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsercionHabilitado createAsercionHabilitado() {
		AsercionHabilitadoImpl asercionHabilitado = new AsercionHabilitadoImpl();
		return asercionHabilitado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsercionValor createAsercionValor() {
		AsercionValorImpl asercionValor = new AsercionValorImpl();
		return asercionValor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsercionSeleccionado createAsercionSeleccionado() {
		AsercionSeleccionadoImpl asercionSeleccionado = new AsercionSeleccionadoImpl();
		return asercionSeleccionado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formularios_DASOFTPackage getFormularios_DASOFTPackage() {
		return (Formularios_DASOFTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Formularios_DASOFTPackage getPackage() {
		return Formularios_DASOFTPackage.eINSTANCE;
	}

} //Formularios_DASOFTFactoryImpl
