/**
 */
package Formularios_DASOFT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prueba Interfaz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.PruebaInterfaz#getName <em>Name</em>}</li>
 *   <li>{@link Formularios_DASOFT.PruebaInterfaz#getAcciones <em>Acciones</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getPruebaInterfaz()
 * @model
 * @generated
 */
public interface PruebaInterfaz extends EObject {
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
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getPruebaInterfaz_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.PruebaInterfaz#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Acciones</b></em>' containment reference list.
	 * The list contents are of type {@link Formularios_DASOFT.Accion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acciones</em>' containment reference list.
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getPruebaInterfaz_Acciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Accion> getAcciones();

} // PruebaInterfaz
