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
 *   <li>{@link Formularios_DASOFT.Formulario#getLayout <em>Layout</em>}</li>
 *   <li>{@link Formularios_DASOFT.Formulario#getName <em>Name</em>}</li>
 *   <li>{@link Formularios_DASOFT.Formulario#getPruebas <em>Pruebas</em>}</li>
 * </ul>
 *
 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getFormulario()
 * @model
 * @generated
 */
public interface Formulario extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(Layout)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getFormulario_Layout()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Formulario#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

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

	/**
	 * Returns the value of the '<em><b>Pruebas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pruebas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pruebas</em>' containment reference.
	 * @see #setPruebas(PruebaInterfaz)
	 * @see Formularios_DASOFT.Formularios_DASOFTPackage#getFormulario_Pruebas()
	 * @model containment="true"
	 * @generated
	 */
	PruebaInterfaz getPruebas();

	/**
	 * Sets the value of the '{@link Formularios_DASOFT.Formulario#getPruebas <em>Pruebas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruebas</em>' containment reference.
	 * @see #getPruebas()
	 * @generated
	 */
	void setPruebas(PruebaInterfaz value);

} // Formulario
