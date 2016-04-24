/**
 */
package Formularios_DASOFT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formulario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.Formulario#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link Formularios_DASOFT.Formulario#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getFormulario()
 * @model
 * @generated
 */
public interface Formulario extends EObject {
	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' reference.
	 * @see #setEntradas(Input)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getFormulario_Entradas()
	 * @model
	 * @generated
	 */
	Input getEntradas();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Formulario#getEntradas <em>Entradas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entradas</em>' reference.
	 * @see #getEntradas()
	 * @generated
	 */
	void setEntradas(Input value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getFormulario_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Formulario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Formulario
