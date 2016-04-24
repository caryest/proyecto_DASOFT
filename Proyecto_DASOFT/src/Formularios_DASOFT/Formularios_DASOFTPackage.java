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
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

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
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputRadioImpl <em>Input Radio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputRadioImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputRadio()
	 * @generated
	 */
	int INPUT_RADIO = 6;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputComboImpl <em>Input Combo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputComboImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCombo()
	 * @generated
	 */
	int INPUT_COMBO = 7;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputCheckImpl <em>Input Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputCheckImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCheck()
	 * @generated
	 */
	int INPUT_CHECK = 8;

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
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputMultipleImpl <em>Input Multiple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputMultipleImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputMultiple()
	 * @generated
	 */
	int INPUT_MULTIPLE = 5;

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
	 * The feature id for the '<em><b>Valores</b></em>' attribute.
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__NAME = INPUT_MULTIPLE__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__VISIBLE = INPUT_MULTIPLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__HABILITADO = INPUT_MULTIPLE__HABILITADO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__VALORES = INPUT_MULTIPLE__VALORES;

	/**
	 * The feature id for the '<em><b>Seleccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__SELECCION = INPUT_MULTIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO_FEATURE_COUNT = INPUT_MULTIPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO_OPERATION_COUNT = INPUT_MULTIPLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Valores</b></em>' attribute.
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__NAME = INPUT_MULTIPLE__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__VISIBLE = INPUT_MULTIPLE__VISIBLE;

	/**
	 * The feature id for the '<em><b>Habilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__HABILITADO = INPUT_MULTIPLE__HABILITADO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__VALORES = INPUT_MULTIPLE__VALORES;

	/**
	 * The feature id for the '<em><b>Seleccion</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__SELECCION = INPUT_MULTIPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK_FEATURE_COUNT = INPUT_MULTIPLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK_OPERATION_COUNT = INPUT_MULTIPLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.PruebaInterfazImpl <em>Prueba Interfaz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.PruebaInterfazImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getPruebaInterfaz()
	 * @generated
	 */
	int PRUEBA_INTERFAZ = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA_INTERFAZ__NAME = 0;

	/**
	 * The number of structural features of the '<em>Prueba Interfaz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRUEBA_INTERFAZ_FEATURE_COUNT = 1;

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
	int ACCION = 10;

	/**
	 * The number of structural features of the '<em>Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Accion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.AsercionImpl <em>Asercion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.AsercionImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercion()
	 * @generated
	 */
	int ASERCION = 11;

	/**
	 * The number of structural features of the '<em>Asercion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Asercion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASERCION_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the attribute '{@link Formularios_DASOFT.InputMultiple#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valores</em>'.
	 * @see Formularios_DASOFT.InputMultiple#getValores()
	 * @see #getInputMultiple()
	 * @generated
	 */
	EAttribute getInputMultiple_Valores();

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
	 * Returns the meta object for class '{@link Formularios_DASOFT.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accion</em>'.
	 * @see Formularios_DASOFT.Accion
	 * @generated
	 */
	EClass getAccion();

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
		 * The meta object literal for the '<em><b>Valores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_MULTIPLE__VALORES = eINSTANCE.getInputMultiple_Valores();

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
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AccionImpl <em>Accion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AccionImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAccion()
		 * @generated
		 */
		EClass ACCION = eINSTANCE.getAccion();

		/**
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.AsercionImpl <em>Asercion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.AsercionImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getAsercion()
		 * @generated
		 */
		EClass ASERCION = eINSTANCE.getAsercion();

	}

} //Formularios_DASOFTPackage
