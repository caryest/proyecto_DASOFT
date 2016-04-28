/**
 */
package Formularios_DASOFT;

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
 * @see Formularios_DASOFT.Formularios_DASOFTFactory
 * @model kind="package"
 * @generated
 */
public interface Formularios_DASOFTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Formularios_DASOFT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Formularios_DASOFT";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Formularios_DASOFT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Formularios_DASOFTPackage eINSTANCE = Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl.init();

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.FormularioImpl <em>Formulario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.FormularioImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getFormulario()
	 * @generated
	 */
	int FORMULARIO = 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Comprobar Asercion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__COMPROBAR_ASERCION = 2;

	/**
	 * The feature id for the '<em><b>Comprobar Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__COMPROBAR_ACCION = 3;

	/**
	 * The feature id for the '<em><b>Pruebas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__PRUEBAS = 4;

	/**
	 * The number of structural features of the '<em>Formulario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Formulario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.LayoutImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Anchura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ANCHURA = 0;

	/**
	 * The feature id for the '<em><b>Altura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ALTURA = 1;

	/**
	 * The feature id for the '<em><b>Entradas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ENTRADAS = 2;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VISIBLE = 1;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__HABILITADO = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputTextoImpl <em>Input Texto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputTextoImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputTexto()
	 * @generated
	 */
	int INPUT_TEXTO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO__VISIBLE = INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO__HABILITADO = INPUT__HABILITADO;

	/**
	 * The feature id for the '<em><b>Obligatorio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO__OBLIGATORIO = INPUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO__VALOR = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO_FEATURE_COUNT = INPUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputBotonImpl <em>Input Boton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputBotonImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputBoton()
	 * @generated
	 */
	int INPUT_BOTON = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BOTON__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BOTON__VISIBLE = INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BOTON__HABILITADO = INPUT__HABILITADO;

	/**
	 * The number of structural features of the '<em>Input Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BOTON_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BOTON_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputMultipleImpl <em>Input Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputMultipleImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputMultiple()
	 * @generated
	 */
	int INPUT_MULTIPLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MULTIPLE__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MULTIPLE__VISIBLE = INPUT__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MULTIPLE__HABILITADO = INPUT__HABILITADO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MULTIPLE__VALORES = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MULTIPLE_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Multiple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_MULTIPLE_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputReaccionImpl <em>Input Reaccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputReaccionImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputReaccion()
	 * @generated
	 */
	int INPUT_REACCION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REACCION__NAME = INPUT_MULTIPLE__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REACCION__VISIBLE = INPUT_MULTIPLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REACCION__HABILITADO = INPUT_MULTIPLE__HABILITADO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REACCION__VALORES = INPUT_MULTIPLE__VALORES;

	/**
	 * The feature id for the '<em><b>Reaccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REACCION__REACCION = INPUT_MULTIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Reaccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REACCION_FEATURE_COUNT = INPUT_MULTIPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Reaccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REACCION_OPERATION_COUNT = INPUT_MULTIPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputRadioImpl <em>Input Radio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputRadioImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputRadio()
	 * @generated
	 */
	int INPUT_RADIO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__NAME = INPUT_REACCION__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__VISIBLE = INPUT_REACCION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__HABILITADO = INPUT_REACCION__HABILITADO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__VALORES = INPUT_REACCION__VALORES;

	/**
	 * The feature id for the '<em><b>Reaccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__REACCION = INPUT_REACCION__REACCION;

	/**
	 * The feature id for the '<em><b>Seleccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__SELECCION = INPUT_REACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO_FEATURE_COUNT = INPUT_REACCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO_OPERATION_COUNT = INPUT_REACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputComboImpl <em>Input Combo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputComboImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCombo()
	 * @generated
	 */
	int INPUT_COMBO = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO__NAME = INPUT_MULTIPLE__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO__VISIBLE = INPUT_MULTIPLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO__HABILITADO = INPUT_MULTIPLE__HABILITADO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO__VALORES = INPUT_MULTIPLE__VALORES;

	/**
	 * The feature id for the '<em><b>Seleccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO__SELECCION = INPUT_MULTIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Combo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO_FEATURE_COUNT = INPUT_MULTIPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Combo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO_OPERATION_COUNT = INPUT_MULTIPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputCheckImpl <em>Input Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputCheckImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCheck()
	 * @generated
	 */
	int INPUT_CHECK = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__NAME = INPUT_REACCION__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__VISIBLE = INPUT_REACCION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__HABILITADO = INPUT_REACCION__HABILITADO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__VALORES = INPUT_REACCION__VALORES;

	/**
	 * The feature id for the '<em><b>Reaccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__REACCION = INPUT_REACCION__REACCION;

	/**
	 * The feature id for the '<em><b>Seleccion</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__SELECCION = INPUT_REACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK_FEATURE_COUNT = INPUT_REACCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK_OPERATION_COUNT = INPUT_REACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.BotonValidarImpl <em>Boton Validar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.BotonValidarImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getBotonValidar()
	 * @generated
	 */
	int BOTON_VALIDAR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_VALIDAR__NAME = INPUT_BOTON__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_VALIDAR__VISIBLE = INPUT_BOTON__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_VALIDAR__HABILITADO = INPUT_BOTON__HABILITADO;

	/**
	 * The number of structural features of the '<em>Boton Validar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_VALIDAR_FEATURE_COUNT = INPUT_BOTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boton Validar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_VALIDAR_OPERATION_COUNT = INPUT_BOTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.BotonGuardarImpl <em>Boton Guardar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.BotonGuardarImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getBotonGuardar()
	 * @generated
	 */
	int BOTON_GUARDAR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_GUARDAR__NAME = INPUT_BOTON__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_GUARDAR__VISIBLE = INPUT_BOTON__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_GUARDAR__HABILITADO = INPUT_BOTON__HABILITADO;

	/**
	 * The number of structural features of the '<em>Boton Guardar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_GUARDAR_FEATURE_COUNT = INPUT_BOTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boton Guardar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_GUARDAR_OPERATION_COUNT = INPUT_BOTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.BotonCancelarImpl <em>Boton Cancelar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.BotonCancelarImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getBotonCancelar()
	 * @generated
	 */
	int BOTON_CANCELAR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CANCELAR__NAME = BOTON_GUARDAR__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CANCELAR__VISIBLE = BOTON_GUARDAR__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CANCELAR__HABILITADO = BOTON_GUARDAR__HABILITADO;

	/**
	 * The number of structural features of the '<em>Boton Cancelar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CANCELAR_FEATURE_COUNT = BOTON_GUARDAR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boton Cancelar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CANCELAR_OPERATION_COUNT = BOTON_GUARDAR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.BotonCustomImpl <em>Boton Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.BotonCustomImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getBotonCustom()
	 * @generated
	 */
	int BOTON_CUSTOM = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CUSTOM__NAME = INPUT_BOTON__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CUSTOM__VISIBLE = INPUT_BOTON__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CUSTOM__HABILITADO = INPUT_BOTON__HABILITADO;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CUSTOM__FUNCION = INPUT_BOTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boton Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CUSTOM_FEATURE_COUNT = INPUT_BOTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boton Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_CUSTOM_OPERATION_COUNT = INPUT_BOTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.ReaccionImpl <em>Reaccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.ReaccionImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getReaccion()
	 * @generated
	 */
	int REACCION = 14;

	/**
	 * The feature id for the '<em><b>Objetivo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION__OBJETIVO = 0;

	/**
	 * The feature id for the '<em><b>Activacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION__ACTIVACION = 1;

	/**
	 * The number of structural features of the '<em>Reaccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Reaccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.ReaccionVisibleImpl <em>Reaccion Visible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.ReaccionVisibleImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getReaccionVisible()
	 * @generated
	 */
	int REACCION_VISIBLE = 15;

	/**
	 * The feature id for the '<em><b>Objetivo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_VISIBLE__OBJETIVO = REACCION__OBJETIVO;

	/**
	 * The feature id for the '<em><b>Activacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_VISIBLE__ACTIVACION = REACCION__ACTIVACION;

	/**
	 * The number of structural features of the '<em>Reaccion Visible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_VISIBLE_FEATURE_COUNT = REACCION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reaccion Visible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_VISIBLE_OPERATION_COUNT = REACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.ReaccionHabilitadoImpl <em>Reaccion Habilitado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.ReaccionHabilitadoImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getReaccionHabilitado()
	 * @generated
	 */
	int REACCION_HABILITADO = 16;

	/**
	 * The feature id for the '<em><b>Objetivo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_HABILITADO__OBJETIVO = REACCION__OBJETIVO;

	/**
	 * The feature id for the '<em><b>Activacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_HABILITADO__ACTIVACION = REACCION__ACTIVACION;

	/**
	 * The number of structural features of the '<em>Reaccion Habilitado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_HABILITADO_FEATURE_COUNT = REACCION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reaccion Habilitado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACCION_HABILITADO_OPERATION_COUNT = REACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.PruebaInterfazImpl <em>Prueba Interfaz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.PruebaInterfazImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getPruebaInterfaz()
	 * @generated
	 */
	int PRUEBA_INTERFAZ = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA_INTERFAZ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Acciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA_INTERFAZ__ACCIONES = 1;

	/**
	 * The number of structural features of the '<em>Prueba Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA_INTERFAZ_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prueba Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA_INTERFAZ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AccionImpl <em>Accion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AccionImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAccion()
	 * @generated
	 */
	int ACCION = 18;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ELEMENTO = 0;

	/**
	 * The feature id for the '<em><b>Asercion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION__ASERCION = 1;

	/**
	 * The number of structural features of the '<em>Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AccionValorImpl <em>Accion Valor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AccionValorImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAccionValor()
	 * @generated
	 */
	int ACCION_VALOR = 19;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_VALOR__ELEMENTO = ACCION__ELEMENTO;

	/**
	 * The feature id for the '<em><b>Asercion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_VALOR__ASERCION = ACCION__ASERCION;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_VALOR__VALOR = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accion Valor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_VALOR_FEATURE_COUNT = ACCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Accion Valor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_VALOR_OPERATION_COUNT = ACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AccionSeleccionImpl <em>Accion Seleccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AccionSeleccionImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAccionSeleccion()
	 * @generated
	 */
	int ACCION_SELECCION = 20;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_SELECCION__ELEMENTO = ACCION__ELEMENTO;

	/**
	 * The feature id for the '<em><b>Asercion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_SELECCION__ASERCION = ACCION__ASERCION;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_SELECCION__VALOR = ACCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accion Seleccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_SELECCION_FEATURE_COUNT = ACCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Accion Seleccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_SELECCION_OPERATION_COUNT = ACCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AsercionImpl <em>Asercion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AsercionImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercion()
	 * @generated
	 */
	int ASERCION = 21;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION__ELEMENTO = 0;

	/**
	 * The number of structural features of the '<em>Asercion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Asercion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AsercionInvisibleImpl <em>Asercion Invisible</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AsercionInvisibleImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercionInvisible()
	 * @generated
	 */
	int ASERCION_INVISIBLE = 22;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_INVISIBLE__ELEMENTO = ASERCION__ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_INVISIBLE__ESTADO = ASERCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asercion Invisible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_INVISIBLE_FEATURE_COUNT = ASERCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asercion Invisible</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_INVISIBLE_OPERATION_COUNT = ASERCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AsercionHabilitadoImpl <em>Asercion Habilitado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AsercionHabilitadoImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercionHabilitado()
	 * @generated
	 */
	int ASERCION_HABILITADO = 23;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_HABILITADO__ELEMENTO = ASERCION__ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_HABILITADO__ESTADO = ASERCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asercion Habilitado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_HABILITADO_FEATURE_COUNT = ASERCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asercion Habilitado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_HABILITADO_OPERATION_COUNT = ASERCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AsercionValorImpl <em>Asercion Valor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AsercionValorImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercionValor()
	 * @generated
	 */
	int ASERCION_VALOR = 24;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_VALOR__ELEMENTO = ASERCION__ELEMENTO;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_VALOR__VALOR = ASERCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asercion Valor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_VALOR_FEATURE_COUNT = ASERCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asercion Valor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_VALOR_OPERATION_COUNT = ASERCION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AsercionSeleccionImpl <em>Asercion Seleccion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AsercionSeleccionImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercionSeleccion()
	 * @generated
	 */
	int ASERCION_SELECCION = 25;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_SELECCION__ELEMENTO = ASERCION__ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_SELECCION__ESTADO = ASERCION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asercion Seleccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_SELECCION_FEATURE_COUNT = ASERCION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Asercion Seleccion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_SELECCION_OPERATION_COUNT = ASERCION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.Formulario <em>Formulario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulario</em>'.
	 * @see Formularios_DASOFT.Formulario
	 * @generated
	 */
	EClass getFormulario();

	/**
	 * Returns the meta object for the containment reference '{@link Formularios_DASOFT.Formulario#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see Formularios_DASOFT.Formulario#getLayout()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Layout();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Formulario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Formularios_DASOFT.Formulario#getName()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_Name();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Formulario#isComprobarAsercion <em>Comprobar Asercion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comprobar Asercion</em>'.
	 * @see Formularios_DASOFT.Formulario#isComprobarAsercion()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_ComprobarAsercion();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Formulario#isComprobarAccion <em>Comprobar Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comprobar Accion</em>'.
	 * @see Formularios_DASOFT.Formulario#isComprobarAccion()
	 * @see #getFormulario()
	 * @generated
	 */
	EAttribute getFormulario_ComprobarAccion();

	/**
	 * Returns the meta object for the containment reference '{@link Formularios_DASOFT.Formulario#getPruebas <em>Pruebas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pruebas</em>'.
	 * @see Formularios_DASOFT.Formulario#getPruebas()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Pruebas();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see Formularios_DASOFT.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Layout#getAnchura <em>Anchura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchura</em>'.
	 * @see Formularios_DASOFT.Layout#getAnchura()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Anchura();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Layout#getAltura <em>Altura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altura</em>'.
	 * @see Formularios_DASOFT.Layout#getAltura()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Altura();

	/**
	 * Returns the meta object for the containment reference list '{@link Formularios_DASOFT.Layout#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entradas</em>'.
	 * @see Formularios_DASOFT.Layout#getEntradas()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Entradas();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see Formularios_DASOFT.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Formularios_DASOFT.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Input#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see Formularios_DASOFT.Input#isVisible()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Visible();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Input#isHabilitado <em>Habilitado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Habilitado</em>'.
	 * @see Formularios_DASOFT.Input#isHabilitado()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Habilitado();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputTexto <em>Input Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Texto</em>'.
	 * @see Formularios_DASOFT.InputTexto
	 * @generated
	 */
	EClass getInputTexto();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.InputTexto#isObligatorio <em>Obligatorio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obligatorio</em>'.
	 * @see Formularios_DASOFT.InputTexto#isObligatorio()
	 * @see #getInputTexto()
	 * @generated
	 */
	EAttribute getInputTexto_Obligatorio();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.InputTexto#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Formularios_DASOFT.InputTexto#getValor()
	 * @see #getInputTexto()
	 * @generated
	 */
	EAttribute getInputTexto_Valor();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputBoton <em>Input Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Boton</em>'.
	 * @see Formularios_DASOFT.InputBoton
	 * @generated
	 */
	EClass getInputBoton();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputMultiple <em>Input Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Multiple</em>'.
	 * @see Formularios_DASOFT.InputMultiple
	 * @generated
	 */
	EClass getInputMultiple();

	/**
	 * Returns the meta object for the attribute list '{@link Formularios_DASOFT.InputMultiple#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valores</em>'.
	 * @see Formularios_DASOFT.InputMultiple#getValores()
	 * @see #getInputMultiple()
	 * @generated
	 */
	EAttribute getInputMultiple_Valores();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputReaccion <em>Input Reaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Reaccion</em>'.
	 * @see Formularios_DASOFT.InputReaccion
	 * @generated
	 */
	EClass getInputReaccion();

	/**
	 * Returns the meta object for the containment reference '{@link Formularios_DASOFT.InputReaccion#getReaccion <em>Reaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reaccion</em>'.
	 * @see Formularios_DASOFT.InputReaccion#getReaccion()
	 * @see #getInputReaccion()
	 * @generated
	 */
	EReference getInputReaccion_Reaccion();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputRadio <em>Input Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Radio</em>'.
	 * @see Formularios_DASOFT.InputRadio
	 * @generated
	 */
	EClass getInputRadio();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.InputRadio#getSeleccion <em>Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seleccion</em>'.
	 * @see Formularios_DASOFT.InputRadio#getSeleccion()
	 * @see #getInputRadio()
	 * @generated
	 */
	EAttribute getInputRadio_Seleccion();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputCombo <em>Input Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Combo</em>'.
	 * @see Formularios_DASOFT.InputCombo
	 * @generated
	 */
	EClass getInputCombo();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.InputCombo#getSeleccion <em>Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seleccion</em>'.
	 * @see Formularios_DASOFT.InputCombo#getSeleccion()
	 * @see #getInputCombo()
	 * @generated
	 */
	EAttribute getInputCombo_Seleccion();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputCheck <em>Input Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Check</em>'.
	 * @see Formularios_DASOFT.InputCheck
	 * @generated
	 */
	EClass getInputCheck();

	/**
	 * Returns the meta object for the attribute list '{@link Formularios_DASOFT.InputCheck#getSeleccion <em>Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Seleccion</em>'.
	 * @see Formularios_DASOFT.InputCheck#getSeleccion()
	 * @see #getInputCheck()
	 * @generated
	 */
	EAttribute getInputCheck_Seleccion();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.BotonValidar <em>Boton Validar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton Validar</em>'.
	 * @see Formularios_DASOFT.BotonValidar
	 * @generated
	 */
	EClass getBotonValidar();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.BotonGuardar <em>Boton Guardar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton Guardar</em>'.
	 * @see Formularios_DASOFT.BotonGuardar
	 * @generated
	 */
	EClass getBotonGuardar();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.BotonCancelar <em>Boton Cancelar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton Cancelar</em>'.
	 * @see Formularios_DASOFT.BotonCancelar
	 * @generated
	 */
	EClass getBotonCancelar();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.BotonCustom <em>Boton Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton Custom</em>'.
	 * @see Formularios_DASOFT.BotonCustom
	 * @generated
	 */
	EClass getBotonCustom();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.BotonCustom#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funcion</em>'.
	 * @see Formularios_DASOFT.BotonCustom#getFuncion()
	 * @see #getBotonCustom()
	 * @generated
	 */
	EAttribute getBotonCustom_Funcion();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.Reaccion <em>Reaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaccion</em>'.
	 * @see Formularios_DASOFT.Reaccion
	 * @generated
	 */
	EClass getReaccion();

	/**
	 * Returns the meta object for the reference '{@link Formularios_DASOFT.Reaccion#getObjetivo <em>Objetivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objetivo</em>'.
	 * @see Formularios_DASOFT.Reaccion#getObjetivo()
	 * @see #getReaccion()
	 * @generated
	 */
	EReference getReaccion_Objetivo();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.Reaccion#getActivacion <em>Activacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activacion</em>'.
	 * @see Formularios_DASOFT.Reaccion#getActivacion()
	 * @see #getReaccion()
	 * @generated
	 */
	EAttribute getReaccion_Activacion();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.ReaccionVisible <em>Reaccion Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaccion Visible</em>'.
	 * @see Formularios_DASOFT.ReaccionVisible
	 * @generated
	 */
	EClass getReaccionVisible();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.ReaccionHabilitado <em>Reaccion Habilitado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaccion Habilitado</em>'.
	 * @see Formularios_DASOFT.ReaccionHabilitado
	 * @generated
	 */
	EClass getReaccionHabilitado();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.PruebaInterfaz <em>Prueba Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prueba Interfaz</em>'.
	 * @see Formularios_DASOFT.PruebaInterfaz
	 * @generated
	 */
	EClass getPruebaInterfaz();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.PruebaInterfaz#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Formularios_DASOFT.PruebaInterfaz#getName()
	 * @see #getPruebaInterfaz()
	 * @generated
	 */
	EAttribute getPruebaInterfaz_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Formularios_DASOFT.PruebaInterfaz#getAcciones <em>Acciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acciones</em>'.
	 * @see Formularios_DASOFT.PruebaInterfaz#getAcciones()
	 * @see #getPruebaInterfaz()
	 * @generated
	 */
	EReference getPruebaInterfaz_Acciones();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accion</em>'.
	 * @see Formularios_DASOFT.Accion
	 * @generated
	 */
	EClass getAccion();

	/**
	 * Returns the meta object for the reference '{@link Formularios_DASOFT.Accion#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elemento</em>'.
	 * @see Formularios_DASOFT.Accion#getElemento()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Elemento();

	/**
	 * Returns the meta object for the containment reference '{@link Formularios_DASOFT.Accion#getAsercion <em>Asercion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asercion</em>'.
	 * @see Formularios_DASOFT.Accion#getAsercion()
	 * @see #getAccion()
	 * @generated
	 */
	EReference getAccion_Asercion();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.AccionValor <em>Accion Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accion Valor</em>'.
	 * @see Formularios_DASOFT.AccionValor
	 * @generated
	 */
	EClass getAccionValor();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.AccionValor#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Formularios_DASOFT.AccionValor#getValor()
	 * @see #getAccionValor()
	 * @generated
	 */
	EAttribute getAccionValor_Valor();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.AccionSeleccion <em>Accion Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accion Seleccion</em>'.
	 * @see Formularios_DASOFT.AccionSeleccion
	 * @generated
	 */
	EClass getAccionSeleccion();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.AccionSeleccion#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Formularios_DASOFT.AccionSeleccion#getValor()
	 * @see #getAccionSeleccion()
	 * @generated
	 */
	EAttribute getAccionSeleccion_Valor();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.Asercion <em>Asercion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asercion</em>'.
	 * @see Formularios_DASOFT.Asercion
	 * @generated
	 */
	EClass getAsercion();

	/**
	 * Returns the meta object for the reference '{@link Formularios_DASOFT.Asercion#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elemento</em>'.
	 * @see Formularios_DASOFT.Asercion#getElemento()
	 * @see #getAsercion()
	 * @generated
	 */
	EReference getAsercion_Elemento();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.AsercionInvisible <em>Asercion Invisible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asercion Invisible</em>'.
	 * @see Formularios_DASOFT.AsercionInvisible
	 * @generated
	 */
	EClass getAsercionInvisible();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.AsercionInvisible#isEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see Formularios_DASOFT.AsercionInvisible#isEstado()
	 * @see #getAsercionInvisible()
	 * @generated
	 */
	EAttribute getAsercionInvisible_Estado();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.AsercionHabilitado <em>Asercion Habilitado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asercion Habilitado</em>'.
	 * @see Formularios_DASOFT.AsercionHabilitado
	 * @generated
	 */
	EClass getAsercionHabilitado();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.AsercionHabilitado#isEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see Formularios_DASOFT.AsercionHabilitado#isEstado()
	 * @see #getAsercionHabilitado()
	 * @generated
	 */
	EAttribute getAsercionHabilitado_Estado();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.AsercionValor <em>Asercion Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asercion Valor</em>'.
	 * @see Formularios_DASOFT.AsercionValor
	 * @generated
	 */
	EClass getAsercionValor();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.AsercionValor#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see Formularios_DASOFT.AsercionValor#getValor()
	 * @see #getAsercionValor()
	 * @generated
	 */
	EAttribute getAsercionValor_Valor();

	/**
	 * Returns the meta object for class '{@link Formularios_DASOFT.AsercionSeleccion <em>Asercion Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asercion Seleccion</em>'.
	 * @see Formularios_DASOFT.AsercionSeleccion
	 * @generated
	 */
	EClass getAsercionSeleccion();

	/**
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.AsercionSeleccion#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see Formularios_DASOFT.AsercionSeleccion#getEstado()
	 * @see #getAsercionSeleccion()
	 * @generated
	 */
	EAttribute getAsercionSeleccion_Estado();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Formularios_DASOFTFactory getFormularios_DASOFTFactory();

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
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.FormularioImpl <em>Formulario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.FormularioImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getFormulario()
		 * @generated
		 */
		EClass FORMULARIO = eINSTANCE.getFormulario();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__LAYOUT = eINSTANCE.getFormulario_Layout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__NAME = eINSTANCE.getFormulario_Name();

		/**
		 * The meta object literal for the '<em><b>Comprobar Asercion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__COMPROBAR_ASERCION = eINSTANCE.getFormulario_ComprobarAsercion();

		/**
		 * The meta object literal for the '<em><b>Comprobar Accion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__COMPROBAR_ACCION = eINSTANCE.getFormulario_ComprobarAccion();

		/**
		 * The meta object literal for the '<em><b>Pruebas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__PRUEBAS = eINSTANCE.getFormulario_Pruebas();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.LayoutImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Anchura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ANCHURA = eINSTANCE.getLayout_Anchura();

		/**
		 * The meta object literal for the '<em><b>Altura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ALTURA = eINSTANCE.getLayout_Altura();

		/**
		 * The meta object literal for the '<em><b>Entradas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__ENTRADAS = eINSTANCE.getLayout_Entradas();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__VISIBLE = eINSTANCE.getInput_Visible();

		/**
		 * The meta object literal for the '<em><b>Habilitado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__HABILITADO = eINSTANCE.getInput_Habilitado();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputTextoImpl <em>Input Texto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputTextoImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputTexto()
		 * @generated
		 */
		EClass INPUT_TEXTO = eINSTANCE.getInputTexto();

		/**
		 * The meta object literal for the '<em><b>Obligatorio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TEXTO__OBLIGATORIO = eINSTANCE.getInputTexto_Obligatorio();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_TEXTO__VALOR = eINSTANCE.getInputTexto_Valor();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputBotonImpl <em>Input Boton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputBotonImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputBoton()
		 * @generated
		 */
		EClass INPUT_BOTON = eINSTANCE.getInputBoton();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputMultipleImpl <em>Input Multiple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputMultipleImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputMultiple()
		 * @generated
		 */
		EClass INPUT_MULTIPLE = eINSTANCE.getInputMultiple();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MULTIPLE__VALORES = eINSTANCE.getInputMultiple_Valores();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputReaccionImpl <em>Input Reaccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputReaccionImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputReaccion()
		 * @generated
		 */
		EClass INPUT_REACCION = eINSTANCE.getInputReaccion();

		/**
		 * The meta object literal for the '<em><b>Reaccion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_REACCION__REACCION = eINSTANCE.getInputReaccion_Reaccion();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputRadioImpl <em>Input Radio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputRadioImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputRadio()
		 * @generated
		 */
		EClass INPUT_RADIO = eINSTANCE.getInputRadio();

		/**
		 * The meta object literal for the '<em><b>Seleccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_RADIO__SELECCION = eINSTANCE.getInputRadio_Seleccion();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputComboImpl <em>Input Combo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputComboImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCombo()
		 * @generated
		 */
		EClass INPUT_COMBO = eINSTANCE.getInputCombo();

		/**
		 * The meta object literal for the '<em><b>Seleccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_COMBO__SELECCION = eINSTANCE.getInputCombo_Seleccion();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputCheckImpl <em>Input Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputCheckImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCheck()
		 * @generated
		 */
		EClass INPUT_CHECK = eINSTANCE.getInputCheck();

		/**
		 * The meta object literal for the '<em><b>Seleccion</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_CHECK__SELECCION = eINSTANCE.getInputCheck_Seleccion();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.BotonValidarImpl <em>Boton Validar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.BotonValidarImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getBotonValidar()
		 * @generated
		 */
		EClass BOTON_VALIDAR = eINSTANCE.getBotonValidar();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.BotonGuardarImpl <em>Boton Guardar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.BotonGuardarImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getBotonGuardar()
		 * @generated
		 */
		EClass BOTON_GUARDAR = eINSTANCE.getBotonGuardar();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.BotonCancelarImpl <em>Boton Cancelar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.BotonCancelarImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getBotonCancelar()
		 * @generated
		 */
		EClass BOTON_CANCELAR = eINSTANCE.getBotonCancelar();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.BotonCustomImpl <em>Boton Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.BotonCustomImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getBotonCustom()
		 * @generated
		 */
		EClass BOTON_CUSTOM = eINSTANCE.getBotonCustom();

		/**
		 * The meta object literal for the '<em><b>Funcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTON_CUSTOM__FUNCION = eINSTANCE.getBotonCustom_Funcion();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.ReaccionImpl <em>Reaccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.ReaccionImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getReaccion()
		 * @generated
		 */
		EClass REACCION = eINSTANCE.getReaccion();

		/**
		 * The meta object literal for the '<em><b>Objetivo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACCION__OBJETIVO = eINSTANCE.getReaccion_Objetivo();

		/**
		 * The meta object literal for the '<em><b>Activacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACCION__ACTIVACION = eINSTANCE.getReaccion_Activacion();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.ReaccionVisibleImpl <em>Reaccion Visible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.ReaccionVisibleImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getReaccionVisible()
		 * @generated
		 */
		EClass REACCION_VISIBLE = eINSTANCE.getReaccionVisible();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.ReaccionHabilitadoImpl <em>Reaccion Habilitado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.ReaccionHabilitadoImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getReaccionHabilitado()
		 * @generated
		 */
		EClass REACCION_HABILITADO = eINSTANCE.getReaccionHabilitado();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.PruebaInterfazImpl <em>Prueba Interfaz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.PruebaInterfazImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getPruebaInterfaz()
		 * @generated
		 */
		EClass PRUEBA_INTERFAZ = eINSTANCE.getPruebaInterfaz();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRUEBA_INTERFAZ__NAME = eINSTANCE.getPruebaInterfaz_Name();

		/**
		 * The meta object literal for the '<em><b>Acciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRUEBA_INTERFAZ__ACCIONES = eINSTANCE.getPruebaInterfaz_Acciones();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AccionImpl <em>Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AccionImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAccion()
		 * @generated
		 */
		EClass ACCION = eINSTANCE.getAccion();

		/**
		 * The meta object literal for the '<em><b>Elemento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__ELEMENTO = eINSTANCE.getAccion_Elemento();

		/**
		 * The meta object literal for the '<em><b>Asercion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCION__ASERCION = eINSTANCE.getAccion_Asercion();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AccionValorImpl <em>Accion Valor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AccionValorImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAccionValor()
		 * @generated
		 */
		EClass ACCION_VALOR = eINSTANCE.getAccionValor();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION_VALOR__VALOR = eINSTANCE.getAccionValor_Valor();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AccionSeleccionImpl <em>Accion Seleccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AccionSeleccionImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAccionSeleccion()
		 * @generated
		 */
		EClass ACCION_SELECCION = eINSTANCE.getAccionSeleccion();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCION_SELECCION__VALOR = eINSTANCE.getAccionSeleccion_Valor();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AsercionImpl <em>Asercion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AsercionImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercion()
		 * @generated
		 */
		EClass ASERCION = eINSTANCE.getAsercion();

		/**
		 * The meta object literal for the '<em><b>Elemento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASERCION__ELEMENTO = eINSTANCE.getAsercion_Elemento();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AsercionInvisibleImpl <em>Asercion Invisible</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AsercionInvisibleImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercionInvisible()
		 * @generated
		 */
		EClass ASERCION_INVISIBLE = eINSTANCE.getAsercionInvisible();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASERCION_INVISIBLE__ESTADO = eINSTANCE.getAsercionInvisible_Estado();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AsercionHabilitadoImpl <em>Asercion Habilitado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AsercionHabilitadoImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercionHabilitado()
		 * @generated
		 */
		EClass ASERCION_HABILITADO = eINSTANCE.getAsercionHabilitado();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASERCION_HABILITADO__ESTADO = eINSTANCE.getAsercionHabilitado_Estado();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AsercionValorImpl <em>Asercion Valor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AsercionValorImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercionValor()
		 * @generated
		 */
		EClass ASERCION_VALOR = eINSTANCE.getAsercionValor();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASERCION_VALOR__VALOR = eINSTANCE.getAsercionValor_Valor();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AsercionSeleccionImpl <em>Asercion Seleccion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AsercionSeleccionImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercionSeleccion()
		 * @generated
		 */
		EClass ASERCION_SELECCION = eINSTANCE.getAsercionSeleccion();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASERCION_SELECCION__ESTADO = eINSTANCE.getAsercionSeleccion_Estado();

	}

} //Formularios_DASOFTPackage
