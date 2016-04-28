/**
 */
package Formularios_DASOFT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.InputCheck#getSeleccion <em>Seleccion</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInputCheck()
 * @model
 * @generated
 */
public interface InputCheck extends InputReaccion {
	/**
	 * Returns the value of the '<em><b>Seleccion</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seleccion</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seleccion</em>' attribute list.
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInputCheck_Seleccion()
	 * @model
	 * @generated
	 */
	EList<Integer> getSeleccion();

} // InputCheck
