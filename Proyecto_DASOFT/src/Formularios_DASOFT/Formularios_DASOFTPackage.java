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
	 * The feature id for the '<em><b>Entradas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__ENTRADAS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO__NAME = 1;

	/**
	 * The number of structural features of the '<em>Formulario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULARIO_FEATURE_COUNT = 2;

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
	int INPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

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
	int INPUT_TEXTO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO__NAME = INPUT__NAME;

	/**
	 * The number of structural features of the '<em>Input Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Texto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TEXTO_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputRadioImpl <em>Input Radio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputRadioImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputRadio()
	 * @generated
	 */
	int INPUT_RADIO = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO__NAME = INPUT__NAME;

	/**
	 * The number of structural features of the '<em>Input Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Radio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_RADIO_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputComboImpl <em>Input Combo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputComboImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCombo()
	 * @generated
	 */
	int INPUT_COMBO = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO__NAME = INPUT__NAME;

	/**
	 * The number of structural features of the '<em>Input Combo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Combo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_COMBO_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputCheckImpl <em>Input Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputCheckImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCheck()
	 * @generated
	 */
	int INPUT_CHECK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK__NAME = INPUT__NAME;

	/**
	 * The number of structural features of the '<em>Input Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CHECK_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Formularios_DASOFT.impl.InputBotonImpl <em>Input Boton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Formularios_DASOFT.impl.InputBotonImpl
	 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputBoton()
	 * @generated
	 */
	int INPUT_BOTON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_BOTON__NAME = INPUT__NAME;

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
	 * Returns the meta object for class '{@link Formularios_DASOFT.Formulario <em>Formulario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formulario</em>'.
	 * @see Formularios_DASOFT.Formulario
	 * @generated
	 */
	EClass getFormulario();

	/**
	 * Returns the meta object for the reference '{@link Formularios_DASOFT.Formulario#getEntradas <em>Entradas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entradas</em>'.
	 * @see Formularios_DASOFT.Formulario#getEntradas()
	 * @see #getFormulario()
	 * @generated
	 */
	EReference getFormulario_Entradas();

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
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputTexto <em>Input Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Texto</em>'.
	 * @see Formularios_DASOFT.InputTexto
	 * @generated
	 */
	EClass getInputTexto();

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
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputCombo <em>Input Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Combo</em>'.
	 * @see Formularios_DASOFT.InputCombo
	 * @generated
	 */
	EClass getInputCombo();

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
	 * Returns the meta object for class '{@link Formularios_DASOFT.InputBoton <em>Input Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Boton</em>'.
	 * @see Formularios_DASOFT.InputBoton
	 * @generated
	 */
	EClass getInputBoton();

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
		 * The meta object literal for the '<em><b>Entradas</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULARIO__ENTRADAS = eINSTANCE.getFormulario_Entradas();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULARIO__NAME = eINSTANCE.getFormulario_Name();

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
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputTextoImpl <em>Input Texto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputTextoImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputTexto()
		 * @generated
		 */
		EClass INPUT_TEXTO = eINSTANCE.getInputTexto();

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
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputComboImpl <em>Input Combo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputComboImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputCombo()
		 * @generated
		 */
		EClass INPUT_COMBO = eINSTANCE.getInputCombo();

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
		 * The meta object literal for the '{@link Formularios_DASOFT.impl.InputBotonImpl <em>Input Boton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Formularios_DASOFT.impl.InputBotonImpl
		 * @see Formularios_DASOFT.impl.Formularios_DASOFTPackageImpl#getInputBoton()
		 * @generated
		 */
		EClass INPUT_BOTON = eINSTANCE.getInputBoton();

	}

} //Formularios_DASOFTPackage
