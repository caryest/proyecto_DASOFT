/**
 */
package Formularios_DASOFT;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Formularios_DASOFT.Formularios_DASOFTPackage
 * @generated
 */
public interface Formularios_DASOFTFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Formularios_DASOFTFactory eINSTANCE = Formularios_DASOFT.impl.Formularios_DASOFTFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Formulario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formulario</em>'.
	 * @generated
	 */
	Formulario createFormulario();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Input Texto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Texto</em>'.
	 * @generated
	 */
	InputTexto createInputTexto();

	/**
	 * Returns a new object of class '<em>Input Radio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Radio</em>'.
	 * @generated
	 */
	InputRadio createInputRadio();

	/**
	 * Returns a new object of class '<em>Input Combo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Combo</em>'.
	 * @generated
	 */
	InputCombo createInputCombo();

	/**
	 * Returns a new object of class '<em>Input Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Check</em>'.
	 * @generated
	 */
	InputCheck createInputCheck();

	/**
	 * Returns a new object of class '<em>Input Boton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Boton</em>'.
	 * @generated
	 */
	InputBoton createInputBoton();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Formularios_DASOFTPackage getFormularios_DASOFTPackage();

} //Formularios_DASOFTFactory
