/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Accion;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.PruebaInterfaz;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prueba Interfaz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.PruebaInterfazImpl#getName <em>Name</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.PruebaInterfazImpl#getAcciones <em>Acciones</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.PruebaInterfazImpl#isComprobarAsercion <em>Comprobar Asercion</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.PruebaInterfazImpl#isComprobarAccion <em>Comprobar Accion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PruebaInterfazImpl extends MinimalEObjectImpl.Container implements PruebaInterfaz {
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
	 * The cached value of the '{@link #getAcciones() <em>Acciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Accion> acciones;

	/**
	 * The default value of the '{@link #isComprobarAsercion() <em>Comprobar Asercion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComprobarAsercion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPROBAR_ASERCION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComprobarAsercion() <em>Comprobar Asercion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComprobarAsercion()
	 * @generated
	 * @ordered
	 */
	protected boolean comprobarAsercion = COMPROBAR_ASERCION_EDEFAULT;

	/**
	 * The default value of the '{@link #isComprobarAccion() <em>Comprobar Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComprobarAccion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPROBAR_ACCION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComprobarAccion() <em>Comprobar Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComprobarAccion()
	 * @generated
	 * @ordered
	 */
	protected boolean comprobarAccion = COMPROBAR_ACCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PruebaInterfazImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.PRUEBA_INTERFAZ;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.PRUEBA_INTERFAZ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Accion> getAcciones() {
		if (acciones == null) {
			acciones = new EObjectContainmentEList<Accion>(Accion.class, this, Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ACCIONES);
		}
		return acciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComprobarAsercion() {
		return comprobarAsercion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComprobarAsercion(boolean newComprobarAsercion) {
		boolean oldComprobarAsercion = comprobarAsercion;
		comprobarAsercion = newComprobarAsercion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ASERCION, oldComprobarAsercion, comprobarAsercion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComprobarAccion() {
		return comprobarAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComprobarAccion(boolean newComprobarAccion) {
		boolean oldComprobarAccion = comprobarAccion;
		comprobarAccion = newComprobarAccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ACCION, oldComprobarAccion, comprobarAccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ACCIONES:
				return ((InternalEList<?>)getAcciones()).basicRemove(otherEnd, msgs);
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
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__NAME:
				return getName();
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ACCIONES:
				return getAcciones();
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ASERCION:
				return isComprobarAsercion();
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ACCION:
				return isComprobarAccion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__NAME:
				setName((String)newValue);
				return;
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ACCIONES:
				getAcciones().clear();
				getAcciones().addAll((Collection<? extends Accion>)newValue);
				return;
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ASERCION:
				setComprobarAsercion((Boolean)newValue);
				return;
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ACCION:
				setComprobarAccion((Boolean)newValue);
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
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ACCIONES:
				getAcciones().clear();
				return;
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ASERCION:
				setComprobarAsercion(COMPROBAR_ASERCION_EDEFAULT);
				return;
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ACCION:
				setComprobarAccion(COMPROBAR_ACCION_EDEFAULT);
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
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ACCIONES:
				return acciones != null && !acciones.isEmpty();
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ASERCION:
				return comprobarAsercion != COMPROBAR_ASERCION_EDEFAULT;
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__COMPROBAR_ACCION:
				return comprobarAccion != COMPROBAR_ACCION_EDEFAULT;
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
		result.append(", comprobarAsercion: ");
		result.append(comprobarAsercion);
		result.append(", comprobarAccion: ");
		result.append(comprobarAccion);
		result.append(')');
		return result.toString();
	}

} //PruebaInterfazImpl
