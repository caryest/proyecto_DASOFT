/**
 */
package Formularios_DASOFT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.Input#getName <em>Name</em>}</li>
 *   <li>{@link Formularios_DASOFT.Input#isInvisible <em>Invisible</em>}</li>
 *   <li>{@link Formularios_DASOFT.Input#isDeshabilitado <em>Deshabilitado</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInput()
 * @model abstract="true"
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"prueba"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInput_Name()
	 * @model default="prueba" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Input#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invisible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invisible</em>' attribute.
	 * @see #setInvisible(boolean)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInput_Invisible()
	 * @model
	 * @generated
	 */
	boolean isInvisible();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Input#isInvisible <em>Invisible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invisible</em>' attribute.
	 * @see #isInvisible()
	 * @generated
	 */
	void setInvisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Deshabilitado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deshabilitado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deshabilitado</em>' attribute.
	 * @see #setDeshabilitado(boolean)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getInput_Deshabilitado()
	 * @model
	 * @generated
	 */
	boolean isDeshabilitado();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Input#isDeshabilitado <em>Deshabilitado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deshabilitado</em>' attribute.
	 * @see #isDeshabilitado()
	 * @generated
	 */
	void setDeshabilitado(boolean value);

} // Input
