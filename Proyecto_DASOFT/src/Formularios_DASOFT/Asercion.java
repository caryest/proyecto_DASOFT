/**
 */
package Formularios_DASOFT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asercion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.Asercion#getElemento <em>Elemento</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getAsercion()
 * @model abstract="true"
 * @generated
 */
public interface Asercion extends EObject {
	/**
	 * Returns the value of the '<em><b>Elemento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento</em>' reference.
	 * @see #setElemento(Input)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getAsercion_Elemento()
	 * @model required="true"
	 * @generated
	 */
	Input getElemento();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Asercion#getElemento <em>Elemento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento</em>' reference.
	 * @see #getElemento()
	 * @generated
	 */
	void setElemento(Input value);

} // Asercion
