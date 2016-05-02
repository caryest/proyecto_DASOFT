/**
 */
package Formularios_DASOFT.impl;

import Formularios_DASOFT.Formulario;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.Layout;
import Formularios_DASOFT.PruebaInterfaz;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link Formularios_DASOFT.impl.FormularioImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.FormularioImpl#getName <em>Name</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.FormularioImpl#getPruebas <em>Pruebas</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.FormularioImpl#isComprobacionCampos <em>Comprobacion Campos</em>}</li>
 *   <li>{@link Formularios_DASOFT.impl.FormularioImpl#isComprobacionAccion <em>Comprobacion Accion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormularioImpl extends MinimalEObjectImpl.Container implements Formulario {
	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected Layout layout;

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
	 * The cached value of the '{@link #getPruebas() <em>Pruebas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruebas()
	 * @generated
	 * @ordered
	 */
	protected PruebaInterfaz pruebas;

	/**
	 * The default value of the '{@link #isComprobacionCampos() <em>Comprobacion Campos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComprobacionCampos()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPROBACION_CAMPOS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComprobacionCampos() <em>Comprobacion Campos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComprobacionCampos()
	 * @generated
	 * @ordered
	 */
	protected boolean comprobacionCampos = COMPROBACION_CAMPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #isComprobacionAccion() <em>Comprobacion Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComprobacionAccion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMPROBACION_ACCION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isComprobacionAccion() <em>Comprobacion Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComprobacionAccion()
	 * @generated
	 * @ordered
	 */
	protected boolean comprobacionAccion = COMPROBACION_ACCION_EDEFAULT;

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
	public Layout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(Layout newLayout, NotificationChain msgs) {
		Layout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.FORMULARIO__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(Layout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Formularios_DASOFTPackage.FORMULARIO__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Formularios_DASOFTPackage.FORMULARIO__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.FORMULARIO__LAYOUT, newLayout, newLayout));
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
	public PruebaInterfaz getPruebas() {
		return pruebas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruebas(PruebaInterfaz newPruebas, NotificationChain msgs) {
		PruebaInterfaz oldPruebas = pruebas;
		pruebas = newPruebas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.FORMULARIO__PRUEBAS, oldPruebas, newPruebas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPruebas(PruebaInterfaz newPruebas) {
		if (newPruebas != pruebas) {
			NotificationChain msgs = null;
			if (pruebas != null)
				msgs = ((InternalEObject)pruebas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Formularios_DASOFTPackage.FORMULARIO__PRUEBAS, null, msgs);
			if (newPruebas != null)
				msgs = ((InternalEObject)newPruebas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Formularios_DASOFTPackage.FORMULARIO__PRUEBAS, null, msgs);
			msgs = basicSetPruebas(newPruebas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.FORMULARIO__PRUEBAS, newPruebas, newPruebas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComprobacionCampos() {
		return comprobacionCampos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComprobacionCampos(boolean newComprobacionCampos) {
		boolean oldComprobacionCampos = comprobacionCampos;
		comprobacionCampos = newComprobacionCampos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_CAMPOS, oldComprobacionCampos, comprobacionCampos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComprobacionAccion() {
		return comprobacionAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComprobacionAccion(boolean newComprobacionAccion) {
		boolean oldComprobacionAccion = comprobacionAccion;
		comprobacionAccion = newComprobacionAccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_ACCION, oldComprobacionAccion, comprobacionAccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Formularios_DASOFTPackage.FORMULARIO__LAYOUT:
				return basicSetLayout(null, msgs);
			case Formularios_DASOFTPackage.FORMULARIO__PRUEBAS:
				return basicSetPruebas(null, msgs);
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
			case Formularios_DASOFTPackage.FORMULARIO__LAYOUT:
				return getLayout();
			case Formularios_DASOFTPackage.FORMULARIO__NAME:
				return getName();
			case Formularios_DASOFTPackage.FORMULARIO__PRUEBAS:
				return getPruebas();
			case Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_CAMPOS:
				return isComprobacionCampos();
			case Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_ACCION:
				return isComprobacionAccion();
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
			case Formularios_DASOFTPackage.FORMULARIO__LAYOUT:
				setLayout((Layout)newValue);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__NAME:
				setName((String)newValue);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__PRUEBAS:
				setPruebas((PruebaInterfaz)newValue);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_CAMPOS:
				setComprobacionCampos((Boolean)newValue);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_ACCION:
				setComprobacionAccion((Boolean)newValue);
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
			case Formularios_DASOFTPackage.FORMULARIO__LAYOUT:
				setLayout((Layout)null);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__PRUEBAS:
				setPruebas((PruebaInterfaz)null);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_CAMPOS:
				setComprobacionCampos(COMPROBACION_CAMPOS_EDEFAULT);
				return;
			case Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_ACCION:
				setComprobacionAccion(COMPROBACION_ACCION_EDEFAULT);
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
			case Formularios_DASOFTPackage.FORMULARIO__LAYOUT:
				return layout != null;
			case Formularios_DASOFTPackage.FORMULARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Formularios_DASOFTPackage.FORMULARIO__PRUEBAS:
				return pruebas != null;
			case Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_CAMPOS:
				return comprobacionCampos != COMPROBACION_CAMPOS_EDEFAULT;
			case Formularios_DASOFTPackage.FORMULARIO__COMPROBACION_ACCION:
				return comprobacionAccion != COMPROBACION_ACCION_EDEFAULT;
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
		result.append(", comprobacionCampos: ");
		result.append(comprobacionCampos);
		result.append(", comprobacionAccion: ");
		result.append(comprobacionAccion);
		result.append(')');
		return result.toString();
	}

} //FormularioImpl
