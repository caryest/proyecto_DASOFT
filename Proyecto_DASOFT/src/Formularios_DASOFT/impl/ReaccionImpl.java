/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.Input;
import Formularios_DASOFT.Reaccion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaccion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.ReaccionImpl#getObjetivo <em>Objetivo</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.ReaccionImpl#getActivacion <em>Activacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReaccionImpl extends MinimalEObjectImpl.Container implements Reaccion {
	/**
	 * The cached value of the '{@link #getObjetivo() <em>Objetivo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetivo()
	 * @generated
	 * @ordered
	 */
	protected Input objetivo;

	/**
	 * The default value of the '{@link #getActivacion() <em>Activacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivacion()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVACION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActivacion() <em>Activacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivacion()
	 * @generated
	 * @ordered
	 */
	protected int activacion = ACTIVACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReaccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.REACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getObjetivo() {
		if (objetivo != null && objetivo.eIsProxy()) {
			InternalEObject oldObjetivo = (InternalEObject)objetivo;
			objetivo = (Input)eResolveProxy(oldObjetivo);
			if (objetivo != oldObjetivo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Formularios_DASOFTPackage.REACCION__OBJETIVO, oldObjetivo, objetivo));
			}
		}
		return objetivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetObjetivo() {
		return objetivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetivo(Input newObjetivo) {
		Input oldObjetivo = objetivo;
		objetivo = newObjetivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.REACCION__OBJETIVO, oldObjetivo, objetivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActivacion() {
		return activacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivacion(int newActivacion) {
		int oldActivacion = activacion;
		activacion = newActivacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.REACCION__ACTIVACION, oldActivacion, activacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Formularios_DASOFTPackage.REACCION__OBJETIVO:
				if (resolve) return getObjetivo();
				return basicGetObjetivo();
			case Formularios_DASOFTPackage.REACCION__ACTIVACION:
				return getActivacion();
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
			case Formularios_DASOFTPackage.REACCION__OBJETIVO:
				setObjetivo((Input)newValue);
				return;
			case Formularios_DASOFTPackage.REACCION__ACTIVACION:
				setActivacion((Integer)newValue);
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
			case Formularios_DASOFTPackage.REACCION__OBJETIVO:
				setObjetivo((Input)null);
				return;
			case Formularios_DASOFTPackage.REACCION__ACTIVACION:
				setActivacion(ACTIVACION_EDEFAULT);
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
			case Formularios_DASOFTPackage.REACCION__OBJETIVO:
				return objetivo != null;
			case Formularios_DASOFTPackage.REACCION__ACTIVACION:
				return activacion != ACTIVACION_EDEFAULT;
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
		result.append(" (activacion: ");
		result.append(activacion);
		result.append(')');
		return result.toString();
	}

} //ReaccionImpl
