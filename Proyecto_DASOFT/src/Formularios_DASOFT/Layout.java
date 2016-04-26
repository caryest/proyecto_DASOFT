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
 *   <li>{@link Formularios_DASOFT.Layout#getAnchura <em>Anchura</em>}</li>
 *   <li>{@link Formularios_DASOFT.Layout#getAltura <em>Altura</em>}</li>
 *   <li>{@link Formularios_DASOFT.Layout#getEntradas <em>Entradas</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Anchura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anchura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anchura</em>' attribute.
	 * @see #setAnchura(int)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getLayout_Anchura()
	 * @model
	 * @generated
	 */
	int getAnchura();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Layout#getAnchura <em>Anchura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anchura</em>' attribute.
	 * @see #getAnchura()
	 * @generated
	 */
	void setAnchura(int value);

	/**
	 * Returns the value of the '<em><b>Altura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altura</em>' attribute.
	 * @see #setAltura(int)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getLayout_Altura()
	 * @model
	 * @generated
	 */
	int getAltura();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Layout#getAltura <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altura</em>' attribute.
	 * @see #getAltura()
	 * @generated
	 */
	void setAltura(int value);

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
