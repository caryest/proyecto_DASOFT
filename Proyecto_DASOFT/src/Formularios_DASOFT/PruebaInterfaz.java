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
 *   <li>{@link Formularios_DASOFT.PruebaInterfaz#isComprobarAsercion <em>Comprobar Asercion</em>}</li>
 *   <li>{@link Formularios_DASOFT.PruebaInterfaz#isComprobarAccion <em>Comprobar Accion</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Comprobar Asercion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comprobar Asercion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comprobar Asercion</em>' attribute.
	 * @see #setComprobarAsercion(boolean)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getPruebaInterfaz_ComprobarAsercion()
	 * @model
	 * @generated
	 */
	boolean isComprobarAsercion();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.PruebaInterfaz#isComprobarAsercion <em>Comprobar Asercion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comprobar Asercion</em>' attribute.
	 * @see #isComprobarAsercion()
	 * @generated
	 */
	void setComprobarAsercion(boolean value);

	/**
	 * Returns the value of the '<em><b>Comprobar Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comprobar Accion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comprobar Accion</em>' attribute.
	 * @see #setComprobarAccion(boolean)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getPruebaInterfaz_ComprobarAccion()
	 * @model
	 * @generated
	 */
	boolean isComprobarAccion();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.PruebaInterfaz#isComprobarAccion <em>Comprobar Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comprobar Accion</em>' attribute.
	 * @see #isComprobarAccion()
	 * @generated
	 */
	void setComprobarAccion(boolean value);

} // PruebaInterfaz
