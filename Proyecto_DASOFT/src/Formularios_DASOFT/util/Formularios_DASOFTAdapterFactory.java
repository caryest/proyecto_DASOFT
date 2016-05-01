/**
 */
package Formularios_DASOFT.util;

import Formularios_DASOFT.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Formularios_DASOFT.Formularios_DASOFTPackage
 * @generated
 */
public class Formularios_DASOFTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Formularios_DASOFTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formularios_DASOFTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Formularios_DASOFTPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Formularios_DASOFTSwitch<Adapter> modelSwitch =
		new Formularios_DASOFTSwitch<Adapter>() {
			@Override
			public Adapter caseFormulario(Formulario object) {
				return createFormularioAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseInputTexto(InputTexto object) {
				return createInputTextoAdapter();
			}
			@Override
			public Adapter caseInputBoton(InputBoton object) {
				return createInputBotonAdapter();
			}
			@Override
			public Adapter caseInputMultiple(InputMultiple object) {
				return createInputMultipleAdapter();
			}
			@Override
			public Adapter caseInputReaccion(InputReaccion object) {
				return createInputReaccionAdapter();
			}
			@Override
			public Adapter caseInputRadio(InputRadio object) {
				return createInputRadioAdapter();
			}
			@Override
			public Adapter caseInputCombo(InputCombo object) {
				return createInputComboAdapter();
			}
			@Override
			public Adapter caseInputCheck(InputCheck object) {
				return createInputCheckAdapter();
			}
			@Override
			public Adapter caseBotonValidar(BotonValidar object) {
				return createBotonValidarAdapter();
			}
			@Override
			public Adapter caseBotonGuardar(BotonGuardar object) {
				return createBotonGuardarAdapter();
			}
			@Override
			public Adapter caseBotonCancelar(BotonCancelar object) {
				return createBotonCancelarAdapter();
			}
			@Override
			public Adapter caseBotonCustom(BotonCustom object) {
				return createBotonCustomAdapter();
			}
			@Override
			public Adapter caseReaccion(Reaccion object) {
				return createReaccionAdapter();
			}
			@Override
			public Adapter caseReaccionVisible(ReaccionVisible object) {
				return createReaccionVisibleAdapter();
			}
			@Override
			public Adapter caseReaccionHabilitado(ReaccionHabilitado object) {
				return createReaccionHabilitadoAdapter();
			}
			@Override
			public Adapter casePruebaInterfaz(PruebaInterfaz object) {
				return createPruebaInterfazAdapter();
			}
			@Override
			public Adapter caseAccion(Accion object) {
				return createAccionAdapter();
			}
			@Override
			public Adapter caseAccionValor(AccionValor object) {
				return createAccionValorAdapter();
			}
			@Override
			public Adapter caseAccionSeleccion(AccionSeleccion object) {
				return createAccionSeleccionAdapter();
			}
			@Override
			public Adapter caseAccionPulsacion(AccionPulsacion object) {
				return createAccionPulsacionAdapter();
			}
			@Override
			public Adapter caseAsercion(Asercion object) {
				return createAsercionAdapter();
			}
			@Override
			public Adapter caseAsercionInvisible(AsercionInvisible object) {
				return createAsercionInvisibleAdapter();
			}
			@Override
			public Adapter caseAsercionHabilitado(AsercionHabilitado object) {
				return createAsercionHabilitadoAdapter();
			}
			@Override
			public Adapter caseAsercionValor(AsercionValor object) {
				return createAsercionValorAdapter();
			}
			@Override
			public Adapter caseAsercionSeleccion(AsercionSeleccion object) {
				return createAsercionSeleccionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.Formulario <em>Formulario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.Formulario
	 * @generated
	 */
	public Adapter createFormularioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.InputTexto <em>Input Texto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.InputTexto
	 * @generated
	 */
	public Adapter createInputTextoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.InputBoton <em>Input Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.InputBoton
	 * @generated
	 */
	public Adapter createInputBotonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.InputMultiple <em>Input Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.InputMultiple
	 * @generated
	 */
	public Adapter createInputMultipleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.InputReaccion <em>Input Reaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.InputReaccion
	 * @generated
	 */
	public Adapter createInputReaccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.InputRadio <em>Input Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.InputRadio
	 * @generated
	 */
	public Adapter createInputRadioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.InputCombo <em>Input Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.InputCombo
	 * @generated
	 */
	public Adapter createInputComboAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.InputCheck <em>Input Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.InputCheck
	 * @generated
	 */
	public Adapter createInputCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.BotonValidar <em>Boton Validar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.BotonValidar
	 * @generated
	 */
	public Adapter createBotonValidarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.BotonGuardar <em>Boton Guardar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.BotonGuardar
	 * @generated
	 */
	public Adapter createBotonGuardarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.BotonCancelar <em>Boton Cancelar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.BotonCancelar
	 * @generated
	 */
	public Adapter createBotonCancelarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.BotonCustom <em>Boton Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.BotonCustom
	 * @generated
	 */
	public Adapter createBotonCustomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.Reaccion <em>Reaccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.Reaccion
	 * @generated
	 */
	public Adapter createReaccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.ReaccionVisible <em>Reaccion Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.ReaccionVisible
	 * @generated
	 */
	public Adapter createReaccionVisibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.ReaccionHabilitado <em>Reaccion Habilitado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.ReaccionHabilitado
	 * @generated
	 */
	public Adapter createReaccionHabilitadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.PruebaInterfaz <em>Prueba Interfaz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.PruebaInterfaz
	 * @generated
	 */
	public Adapter createPruebaInterfazAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.Accion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.Accion
	 * @generated
	 */
	public Adapter createAccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.AccionValor <em>Accion Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.AccionValor
	 * @generated
	 */
	public Adapter createAccionValorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.AccionSeleccion <em>Accion Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.AccionSeleccion
	 * @generated
	 */
	public Adapter createAccionSeleccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.AccionPulsacion <em>Accion Pulsacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.AccionPulsacion
	 * @generated
	 */
	public Adapter createAccionPulsacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.Asercion <em>Asercion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.Asercion
	 * @generated
	 */
	public Adapter createAsercionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.AsercionInvisible <em>Asercion Invisible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.AsercionInvisible
	 * @generated
	 */
	public Adapter createAsercionInvisibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.AsercionHabilitado <em>Asercion Habilitado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.AsercionHabilitado
	 * @generated
	 */
	public Adapter createAsercionHabilitadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.AsercionValor <em>Asercion Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.AsercionValor
	 * @generated
	 */
	public Adapter createAsercionValorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Formularios_DASOFT.AsercionSeleccion <em>Asercion Seleccion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Formularios_DASOFT.AsercionSeleccion
	 * @generated
	 */
	public Adapter createAsercionSeleccionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Formularios_DASOFTAdapterFactory
