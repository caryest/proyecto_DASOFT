/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.InputReaccion;
import Formularios_DASOFT.Reaccion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Reaccion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.InputReaccionImpl#getReaccion <em>Reaccion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InputReaccionImpl extends InputMultipleImpl implements InputReaccion {
	/**
	 * The cached value of the '{@link #getReaccion() <em>Reaccion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaccion()
	 * @generated
	 * @ordered
	 */
	protected Reaccion reaccion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputReaccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.INPUT_REACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reaccion getReaccion() {
		return reaccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReaccion(Reaccion newReaccion, NotificationChain msgs) {
		Reaccion oldReaccion = reaccion;
		reaccion = newReaccion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.INPUT_REACCION__REACCION, oldReaccion, newReaccion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReaccion(Reaccion newReaccion) {
		if (newReaccion != reaccion) {
			NotificationChain msgs = null;
			if (reaccion != null)
				msgs = ((InternalEObject)reaccion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Formularios_DASOFTPackage.INPUT_REACCION__REACCION, null, msgs);
			if (newReaccion != null)
				msgs = ((InternalEObject)newReaccion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Formularios_DASOFTPackage.INPUT_REACCION__REACCION, null, msgs);
			msgs = basicSetReaccion(newReaccion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.INPUT_REACCION__REACCION, newReaccion, newReaccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Formularios_DASOFTPackage.INPUT_REACCION__REACCION:
				return basicSetReaccion(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Formularios_DASOFTPackage.INPUT_REACCION__REACCION:
				return getReaccion();
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
			case Formularios_DASOFTPackage.INPUT_REACCION__REACCION:
				setReaccion((Reaccion)newValue);
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
			case Formularios_DASOFTPackage.INPUT_REACCION__REACCION:
				setReaccion((Reaccion)null);
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
			case Formularios_DASOFTPackage.INPUT_REACCION__REACCION:
				return reaccion != null;
		}
		return super.eIsSet(featureID);
	}

} //InputReaccionImpl
