/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.InputCombo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Combo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.InputComboImpl#getSeleccion <em>Seleccion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputComboImpl extends InputMultipleImpl implements InputCombo {
	/**
	 * The default value of the '{@link #getSeleccion() <em>Seleccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeleccion()
	 * @generated
	 * @ordered
	 */
	protected static final int SELECCION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeleccion() <em>Seleccion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeleccion()
	 * @generated
	 * @ordered
	 */
	protected int seleccion = SELECCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputComboImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.INPUT_COMBO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeleccion() {
		return seleccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeleccion(int newSeleccion) {
		int oldSeleccion = seleccion;
		seleccion = newSeleccion-1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.INPUT_COMBO__SELECCION, oldSeleccion, seleccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Formularios_DASOFTPackage.INPUT_COMBO__SELECCION:
				return getSeleccion();
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
			case Formularios_DASOFTPackage.INPUT_COMBO__SELECCION:
				setSeleccion((Integer)newValue);
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
			case Formularios_DASOFTPackage.INPUT_COMBO__SELECCION:
				setSeleccion(SELECCION_EDEFAULT);
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
			case Formularios_DASOFTPackage.INPUT_COMBO__SELECCION:
				return seleccion != SELECCION_EDEFAULT;
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
		result.append(" (seleccion: ");
		result.append(seleccion);
		result.append(')');
		return result.toString();
	}

} //InputComboImpl
