/**
 */
package Formularios_DASOFT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.Layout#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link Formularios_DASOFT.Layout#getEntradas <em>Entradas</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Columnas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columnas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columnas</em>' attribute.
	 * @see #setColumnas(int)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getLayout_Columnas()
	 * @model required="true"
	 * @generated
	 */
	int getColumnas();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Layout#getColumnas <em>Columnas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columnas</em>' attribute.
	 * @see #getColumnas()
	 * @generated
	 */
	void setColumnas(int value);

	/**
	 * Returns the value of the '<em><b>Entradas</b></em>' containment reference list.
	 * The list contents are of type {@link Formularios_DASOFT.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entradas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entradas</em>' containment reference list.
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getLayout_Entradas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getEntradas();

} // Layout
