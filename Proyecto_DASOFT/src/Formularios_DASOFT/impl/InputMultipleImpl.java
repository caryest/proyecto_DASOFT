/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.InputMultiple;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Multiple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Formularios_DASOFT.impl.InputMultipleImpl#getValores <em>Valores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputMultipleImpl extends InputImpl implements InputMultiple {
	/**
	 * The cached value of the '{@link #getValores() <em>Valores</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValores()
	 * @generated
	 * @ordered
	 */
	protected EList<String> valores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputMultipleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Formularios_DASOFTPackage.Literals.INPUT_MULTIPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValores() {
		if (valores == null) {
			valores = new EDataTypeUniqueEList<String>(String.class, this, Formularios_DASOFTPackage.INPUT_MULTIPLE__VALORES);
		}
		return valores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Formularios_DASOFTPackage.INPUT_MULTIPLE__VALORES:
				return getValores();
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
			case Formularios_DASOFTPackage.INPUT_MULTIPLE__VALORES:
				getValores().clear();
				getValores().addAll((Collection<? extends String>)newValue);
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
			case Formularios_DASOFTPackage.INPUT_MULTIPLE__VALORES:
				getValores().clear();
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
			case Formularios_DASOFTPackage.INPUT_MULTIPLE__VALORES:
				return valores != null && !valores.isEmpty();
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
		result.append(" (valores: ");
		result.append(valores);
		result.append(')');
		return result.toString();
	}

} //InputMultipleImpl
