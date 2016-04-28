/**
 */
package Formularios_DASOFT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaccion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.Reaccion#getObjetivo <em>Objetivo</em>}</li>
 *   <li>{@link Formularios_DASOFT.Reaccion#getActivacion <em>Activacion</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getReaccion()
 * @model abstract="true"
 * @generated
 */
public interface Reaccion extends EObject {
	/**
	 * Returns the value of the '<em><b>Objetivo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objetivo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objetivo</em>' reference.
	 * @see #setObjetivo(Input)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getReaccion_Objetivo()
	 * @model required="true"
	 * @generated
	 */
	Input getObjetivo();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Reaccion#getObjetivo <em>Objetivo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objetivo</em>' reference.
	 * @see #getObjetivo()
	 * @generated
	 */
	void setObjetivo(Input value);

	/**
	 * Returns the value of the '<em><b>Activacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activacion</em>' attribute.
	 * @see #setActivacion(int)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getReaccion_Activacion()
	 * @model required="true"
	 * @generated
	 */
	int getActivacion();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Reaccion#getActivacion <em>Activacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activacion</em>' attribute.
	 * @see #getActivacion()
	 * @generated
	 */
	void setActivacion(int value);

} // Reaccion
