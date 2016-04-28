/**
 */
package Formularios_DASOFT.util;

import Formularios_DASOFT.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Formularios_DASOFT.Formularios_DASOFTPackage
 * @generated
 */
public class Formularios_DASOFTSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Formularios_DASOFTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formularios_DASOFTSwitch() {
		if (modelPackage == null) {
			modelPackage = Formularios_DASOFTPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Formularios_DASOFTPackage.FORMULARIO: {
				Formulario formulario = (Formulario)theEObject;
				T result = caseFormulario(formulario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.INPUT_TEXTO: {
				InputTexto inputTexto = (InputTexto)theEObject;
				T result = caseInputTexto(inputTexto);
				if (result == null) result = caseInput(inputTexto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.INPUT_BOTON: {
				InputBoton inputBoton = (InputBoton)theEObject;
				T result = caseInputBoton(inputBoton);
				if (result == null) result = caseInput(inputBoton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.INPUT_MULTIPLE: {
				InputMultiple inputMultiple = (InputMultiple)theEObject;
				T result = caseInputMultiple(inputMultiple);
				if (result == null) result = caseInput(inputMultiple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.INPUT_REACCION: {
				InputReaccion inputReaccion = (InputReaccion)theEObject;
				T result = caseInputReaccion(inputReaccion);
				if (result == null) result = caseInputMultiple(inputReaccion);
				if (result == null) result = caseInput(inputReaccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.INPUT_RADIO: {
				InputRadio inputRadio = (InputRadio)theEObject;
				T result = caseInputRadio(inputRadio);
				if (result == null) result = caseInputReaccion(inputRadio);
				if (result == null) result = caseInputMultiple(inputRadio);
				if (result == null) result = caseInput(inputRadio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.INPUT_COMBO: {
				InputCombo inputCombo = (InputCombo)theEObject;
				T result = caseInputCombo(inputCombo);
				if (result == null) result = caseInputMultiple(inputCombo);
				if (result == null) result = caseInput(inputCombo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.INPUT_CHECK: {
				InputCheck inputCheck = (InputCheck)theEObject;
				T result = caseInputCheck(inputCheck);
				if (result == null) result = caseInputReaccion(inputCheck);
				if (result == null) result = caseInputMultiple(inputCheck);
				if (result == null) result = caseInput(inputCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.BOTON_VALIDAR: {
				BotonValidar botonValidar = (BotonValidar)theEObject;
				T result = caseBotonValidar(botonValidar);
				if (result == null) result = caseInputBoton(botonValidar);
				if (result == null) result = caseInput(botonValidar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.BOTON_GUARDAR: {
				BotonGuardar botonGuardar = (BotonGuardar)theEObject;
				T result = caseBotonGuardar(botonGuardar);
				if (result == null) result = caseInputBoton(botonGuardar);
				if (result == null) result = caseInput(botonGuardar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.BOTON_CANCELAR: {
				BotonCancelar botonCancelar = (BotonCancelar)theEObject;
				T result = caseBotonCancelar(botonCancelar);
				if (result == null) result = caseBotonGuardar(botonCancelar);
				if (result == null) result = caseInputBoton(botonCancelar);
				if (result == null) result = caseInput(botonCancelar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.BOTON_CUSTOM: {
				BotonCustom botonCustom = (BotonCustom)theEObject;
				T result = caseBotonCustom(botonCustom);
				if (result == null) result = caseInputBoton(botonCustom);
				if (result == null) result = caseInput(botonCustom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.REACCION: {
				Reaccion reaccion = (Reaccion)theEObject;
				T result = caseReaccion(reaccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.REACCION_VISIBLE: {
				ReaccionVisible reaccionVisible = (ReaccionVisible)theEObject;
				T result = caseReaccionVisible(reaccionVisible);
				if (result == null) result = caseReaccion(reaccionVisible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.REACCION_HABILITADO: {
				ReaccionHabilitado reaccionHabilitado = (ReaccionHabilitado)theEObject;
				T result = caseReaccionHabilitado(reaccionHabilitado);
				if (result == null) result = caseReaccion(reaccionHabilitado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ: {
				PruebaInterfaz pruebaInterfaz = (PruebaInterfaz)theEObject;
				T result = casePruebaInterfaz(pruebaInterfaz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.ACCION: {
				Accion accion = (Accion)theEObject;
				T result = caseAccion(accion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.ACCION_VALOR: {
				AccionValor accionValor = (AccionValor)theEObject;
				T result = caseAccionValor(accionValor);
				if (result == null) result = caseAccion(accionValor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.ACCION_SELECCION: {
				AccionSeleccion accionSeleccion = (AccionSeleccion)theEObject;
				T result = caseAccionSeleccion(accionSeleccion);
				if (result == null) result = caseAccion(accionSeleccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.ASERCION: {
				Asercion asercion = (Asercion)theEObject;
				T result = caseAsercion(asercion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.ASERCION_INVISIBLE: {
				AsercionInvisible asercionInvisible = (AsercionInvisible)theEObject;
				T result = caseAsercionInvisible(asercionInvisible);
				if (result == null) result = caseAsercion(asercionInvisible);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.ASERCION_HABILITADO: {
				AsercionHabilitado asercionHabilitado = (AsercionHabilitado)theEObject;
				T result = caseAsercionHabilitado(asercionHabilitado);
				if (result == null) result = caseAsercion(asercionHabilitado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.ASERCION_VALOR: {
				AsercionValor asercionValor = (AsercionValor)theEObject;
				T result = caseAsercionValor(asercionValor);
				if (result == null) result = caseAsercion(asercionValor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Formularios_DASOFTPackage.ASERCION_SELECCION: {
				AsercionSeleccion asercionSeleccion = (AsercionSeleccion)theEObject;
				T result = caseAsercionSeleccion(asercionSeleccion);
				if (result == null) result = caseAsercion(asercionSeleccion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formulario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formulario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulario(Formulario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Texto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Texto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputTexto(InputTexto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Boton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Boton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputBoton(InputBoton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Multiple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Multiple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputMultiple(InputMultiple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Reaccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Reaccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputReaccion(InputReaccion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Radio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Radio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputRadio(InputRadio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Combo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Combo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputCombo(InputCombo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputCheck(InputCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boton Validar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boton Validar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotonValidar(BotonValidar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boton Guardar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boton Guardar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotonGuardar(BotonGuardar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boton Cancelar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boton Cancelar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotonCancelar(BotonCancelar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boton Custom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boton Custom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotonCustom(BotonCustom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaccion(Reaccion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaccion Visible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaccion Visible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaccionVisible(ReaccionVisible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaccion Habilitado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaccion Habilitado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReaccionHabilitado(ReaccionHabilitado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prueba Interfaz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prueba Interfaz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePruebaInterfaz(PruebaInterfaz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccion(Accion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accion Valor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accion Valor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccionValor(AccionValor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accion Seleccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accion Seleccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccionSeleccion(AccionSeleccion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asercion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asercion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsercion(Asercion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asercion Invisible</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asercion Invisible</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsercionInvisible(AsercionInvisible object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asercion Habilitado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asercion Habilitado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsercionHabilitado(AsercionHabilitado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asercion Valor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asercion Valor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsercionValor(AsercionValor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asercion Seleccion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asercion Seleccion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsercionSeleccion(AsercionSeleccion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Formularios_DASOFTSwitch
