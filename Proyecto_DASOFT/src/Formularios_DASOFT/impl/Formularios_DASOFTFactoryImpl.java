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
			case Formularios_DASOFTPackage.INPUT: return createInput();
			case Formularios_DASOFTPackage.INPUT_TEXTO: return createInputTexto();
			case Formularios_DASOFTPackage.INPUT_RADIO: return createInputRadio();
			case Formularios_DASOFTPackage.INPUT_COMBO: return createInputCombo();
			case Formularios_DASOFTPackage.INPUT_CHECK: return createInputCheck();
			case Formularios_DASOFTPackage.INPUT_BOTON: return createInputBoton();
			case Formularios_DASOFTPackage.LAYOUT: return createLayout();
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ: return createPruebaInterfaz();
			case Formularios_DASOFTPackage.ACCION: return createAccion();
			case Formularios_DASOFTPackage.ASERCION: return createAsercion();
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
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
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
	public InputBoton createInputBoton() {
		InputBotonImpl inputBoton = new InputBotonImpl();
		return inputBoton;
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
	public Asercion createAsercion() {
		AsercionImpl asercion = new AsercionImpl();
		return asercion;
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
