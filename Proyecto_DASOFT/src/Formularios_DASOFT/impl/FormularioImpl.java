/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formulario;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.Input;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formulario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.FormularioImpl#getEntradas <em>Entradas</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.FormularioImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormularioImpl extends MinimalEObjectImpl.Container implements Formulario {
	/**
	 * The cached value of the '{@link #getEntradas() <em>Entradas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntradas()
	 * @generated
	 * @ordered
	 */
	protected Input entradas;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormularioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.FORMULARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getEntradas() {
		if (entradas != null && entradas.eIsProxy()) {
			InternalEObject oldEntradas = (InternalEObject)entradas;
			entradas = (Input)eResolveProxy(oldEntradas);
			if (entradas != oldEntradas) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Formularios_DASOFTPackage.FORMULARIO__ENTRADAS, oldEntradas, entradas));
			}
		}
		return entradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetEntradas() {
		return entradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntradas(Input newEntradas) {
		Input oldEntradas = entradas;
		entradas = newEntradas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.FORMULARIO__ENTRADAS, oldEntradas, entradas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.FORMULARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Formularios_DASOFTPackage.FORMULARIO__ENTRADAS:
				if (resolve) return getEntradas();
				return basicGetEntradas();
			case Formularios_DASOFTPackage.FORMULARIO__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Formularios_DASOFTPackage.FORMULARIO__ENTRADAS:
				setEntradas((Input)newValue);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Formularios_DASOFTPackage.FORMULARIO__ENTRADAS:
				setEntradas((Input)null);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Formularios_DASOFTPackage.FORMULARIO__ENTRADAS:
				return entradas != null;
			case Formularios_DASOFTPackage.FORMULARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FormularioImpl
