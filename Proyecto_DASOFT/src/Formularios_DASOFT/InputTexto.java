/**
 */
package Formularios_DASOFT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Texto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.InputTexto#isObligatorio <em>Obligatorio</em>}</li>
 *   <li>{@link Formularios_DASOFT.InputTexto#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInputTexto()
 * @model
 * @generated
 */
public interface InputTexto extends Input {
	/**
	 * Returns the value of the '<em><b>Obligatorio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obligatorio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obligatorio</em>' attribute.
	 * @see #setObligatorio(boolean)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInputTexto_Obligatorio()
	 * @model
	 * @generated
	 */
	boolean isObligatorio();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.InputTexto#isObligatorio <em>Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obligatorio</em>' attribute.
	 * @see #isObligatorio()
	 * @generated
	 */
	void setObligatorio(boolean value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInputTexto_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.InputTexto#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

} // InputTexto
