/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.Input;
import Formularios_DASOFT.Layout;

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
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.LayoutImpl#getAnchura <em>Anchura</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.LayoutImpl#getAltura <em>Altura</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.LayoutImpl#getEntradas <em>Entradas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayoutImpl extends MinimalEObjectImpl.Container implements Layout {
	/**
	 * The default value of the '{@link #getAnchura() <em>Anchura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchura()
	 * @generated
	 * @ordered
	 */
	protected static final int ANCHURA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnchura() <em>Anchura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchura()
	 * @generated
	 * @ordered
	 */
	protected int anchura = ANCHURA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAltura() <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltura()
	 * @generated
	 * @ordered
	 */
	protected static final int ALTURA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAltura() <em>Altura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltura()
	 * @generated
	 * @ordered
	 */
	protected int altura = ALTURA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntradas() <em>Entradas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntradas()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> entradas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnchura() {
		return anchura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchura(int newAnchura) {
		int oldAnchura = anchura;
		anchura = newAnchura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.LAYOUT__ANCHURA, oldAnchura, anchura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltura(int newAltura) {
		int oldAltura = altura;
		altura = newAltura;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.LAYOUT__ALTURA, oldAltura, altura));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getEntradas() {
		if (entradas == null) {
			entradas = new EObjectContainmentEList<Input>(Input.class, this, Formularios_DASOFTPackage.LAYOUT__ENTRADAS);
		}
		return entradas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Formularios_DASOFTPackage.LAYOUT__ENTRADAS:
				return ((InternalEList<?>)getEntradas()).basicRemove(otherEnd, msgs);
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
			case Formularios_DASOFTPackage.LAYOUT__ANCHURA:
				return getAnchura();
			case Formularios_DASOFTPackage.LAYOUT__ALTURA:
				return getAltura();
			case Formularios_DASOFTPackage.LAYOUT__ENTRADAS:
				return getEntradas();
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
			case Formularios_DASOFTPackage.LAYOUT__ANCHURA:
				setAnchura((Integer)newValue);
				return;
			case Formularios_DASOFTPackage.LAYOUT__ALTURA:
				setAltura((Integer)newValue);
				return;
			case Formularios_DASOFTPackage.LAYOUT__ENTRADAS:
				getEntradas().clear();
				getEntradas().addAll((Collection<? extends Input>)newValue);
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
			case Formularios_DASOFTPackage.LAYOUT__ANCHURA:
				setAnchura(ANCHURA_EDEFAULT);
				return;
			case Formularios_DASOFTPackage.LAYOUT__ALTURA:
				setAltura(ALTURA_EDEFAULT);
				return;
			case Formularios_DASOFTPackage.LAYOUT__ENTRADAS:
				getEntradas().clear();
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
			case Formularios_DASOFTPackage.LAYOUT__ANCHURA:
				return anchura != ANCHURA_EDEFAULT;
			case Formularios_DASOFTPackage.LAYOUT__ALTURA:
				return altura != ALTURA_EDEFAULT;
			case Formularios_DASOFTPackage.LAYOUT__ENTRADAS:
				return entradas != null && !entradas.isEmpty();
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
		result.append(" (anchura: ");
		result.append(anchura);
		result.append(", altura: ");
		result.append(altura);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
