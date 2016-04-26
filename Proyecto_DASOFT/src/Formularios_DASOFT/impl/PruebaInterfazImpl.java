/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Accion;
import Formularios_DASOFT.Asercion;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.PruebaInterfaz;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link Formularios_DASOFT.impl.PruebaInterfazImpl#getAserciones <em>Aserciones</em>}</li>
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
	 * The cached value of the '{@link #getAcciones() <em>Acciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Accion> acciones;

	/**
	 * The cached value of the '{@link #getAserciones() <em>Aserciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAserciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Asercion> aserciones;

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
			acciones = new EObjectResolvingEList<Accion>(Accion.class, this, Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ACCIONES);
		}
		return acciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asercion> getAserciones() {
		if (aserciones == null) {
			aserciones = new EObjectResolvingEList<Asercion>(Asercion.class, this, Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ASERCIONES);
		}
		return aserciones;
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
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ASERCIONES:
				return getAserciones();
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
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ASERCIONES:
				getAserciones().clear();
				getAserciones().addAll((Collection<? extends Asercion>)newValue);
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
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ASERCIONES:
				getAserciones().clear();
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
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ__ASERCIONES:
				return aserciones != null && !aserciones.isEmpty();
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

} //PruebaInterfazImpl
