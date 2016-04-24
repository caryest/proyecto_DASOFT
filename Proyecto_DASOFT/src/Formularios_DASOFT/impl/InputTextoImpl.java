/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.InputTexto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Texto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.InputTextoImpl#isObligatorio <em>Obligatorio</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.InputTextoImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputTextoImpl extends InputImpl implements InputTexto {
	/**
	 * The default value of the '{@link #isObligatorio() <em>Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatorio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBLIGATORIO_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isObligatorio() <em>Obligatorio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObligatorio()
	 * @generated
	 * @ordered
	 */
	protected boolean obligatorio = OBLIGATORIO_EDEFAULT;
	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputTextoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.INPUT_TEXTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObligatorio() {
		return obligatorio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObligatorio(boolean newObligatorio) {
		boolean oldObligatorio = obligatorio;
		obligatorio = newObligatorio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.INPUT_TEXTO__OBLIGATORIO, oldObligatorio, obligatorio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.INPUT_TEXTO__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Formularios_DASOFTPackage.INPUT_TEXTO__OBLIGATORIO:
				return isObligatorio();
			case Formularios_DASOFTPackage.INPUT_TEXTO__VALOR:
				return getValor();
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
			case Formularios_DASOFTPackage.INPUT_TEXTO__OBLIGATORIO:
				setObligatorio((Boolean)newValue);
				return;
			case Formularios_DASOFTPackage.INPUT_TEXTO__VALOR:
				setValor((String)newValue);
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
			case Formularios_DASOFTPackage.INPUT_TEXTO__OBLIGATORIO:
				setObligatorio(OBLIGATORIO_EDEFAULT);
				return;
			case Formularios_DASOFTPackage.INPUT_TEXTO__VALOR:
				setValor(VALOR_EDEFAULT);
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
			case Formularios_DASOFTPackage.INPUT_TEXTO__OBLIGATORIO:
				return obligatorio != OBLIGATORIO_EDEFAULT;
			case Formularios_DASOFTPackage.INPUT_TEXTO__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
		result.append(" (obligatorio: ");
		result.append(obligatorio);
		result.append(", valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //InputTextoImpl
