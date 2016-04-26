/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Accion;
import Formularios_DASOFT.Asercion;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.Input;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.AccionImpl#getElemento <em>Elemento</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.AccionImpl#getAsercion <em>Asercion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccionImpl extends MinimalEObjectImpl.Container implements Accion {
	/**
	 * The cached value of the '{@link #getElemento() <em>Elemento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElemento()
	 * @generated
	 * @ordered
	 */
	protected Input elemento;

	/**
	 * The cached value of the '{@link #getAsercion() <em>Asercion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsercion()
	 * @generated
	 * @ordered
	 */
	protected Asercion asercion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.ACCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getElemento() {
		if (elemento != null && elemento.eIsProxy()) {
			InternalEObject oldElemento = (InternalEObject)elemento;
			elemento = (Input)eResolveProxy(oldElemento);
			if (elemento != oldElemento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Formularios_DASOFTPackage.ACCION__ELEMENTO, oldElemento, elemento));
			}
		}
		return elemento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input basicGetElemento() {
		return elemento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElemento(Input newElemento) {
		Input oldElemento = elemento;
		elemento = newElemento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.ACCION__ELEMENTO, oldElemento, elemento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asercion getAsercion() {
		return asercion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsercion(Asercion newAsercion, NotificationChain msgs) {
		Asercion oldAsercion = asercion;
		asercion = newAsercion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.ACCION__ASERCION, oldAsercion, newAsercion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsercion(Asercion newAsercion) {
		if (newAsercion != asercion) {
			NotificationChain msgs = null;
			if (asercion != null)
				msgs = ((InternalEObject)asercion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Formularios_DASOFTPackage.ACCION__ASERCION, null, msgs);
			if (newAsercion != null)
				msgs = ((InternalEObject)newAsercion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Formularios_DASOFTPackage.ACCION__ASERCION, null, msgs);
			msgs = basicSetAsercion(newAsercion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.ACCION__ASERCION, newAsercion, newAsercion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Formularios_DASOFTPackage.ACCION__ASERCION:
				return basicSetAsercion(null, msgs);
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
			case Formularios_DASOFTPackage.ACCION__ELEMENTO:
				if (resolve) return getElemento();
				return basicGetElemento();
			case Formularios_DASOFTPackage.ACCION__ASERCION:
				return getAsercion();
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
			case Formularios_DASOFTPackage.ACCION__ELEMENTO:
				setElemento((Input)newValue);
				return;
			case Formularios_DASOFTPackage.ACCION__ASERCION:
				setAsercion((Asercion)newValue);
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
			case Formularios_DASOFTPackage.ACCION__ELEMENTO:
				setElemento((Input)null);
				return;
			case Formularios_DASOFTPackage.ACCION__ASERCION:
				setAsercion((Asercion)null);
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
			case Formularios_DASOFTPackage.ACCION__ELEMENTO:
				return elemento != null;
			case Formularios_DASOFTPackage.ACCION__ASERCION:
				return asercion != null;
		}
		return super.eIsSet(featureID);
	}

} //AccionImpl
