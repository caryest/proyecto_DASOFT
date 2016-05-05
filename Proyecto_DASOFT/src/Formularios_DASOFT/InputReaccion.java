/**
 */
package Formularios_DASOFT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Reaccion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.InputReaccion#getReaccion <em>Reaccion</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInputReaccion()
 * @model abstract="true"
 * @generated
 */
public interface InputReaccion extends InputMultiple {
	/**
	 * Returns the value of the '<em><b>Reaccion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reaccion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaccion</em>' containment reference.
	 * @see #setReaccion(Reaccion)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInputReaccion_Reaccion()
	 * @model containment="true"
	 * @generated
	 */
	Reaccion getReaccion();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.InputReaccion#getReaccion <em>Reaccion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaccion</em>' containment reference.
	 * @see #getReaccion()
	 * @generated
	 */
	void setReaccion(Reaccion value);

} // InputReaccion
