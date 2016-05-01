/*
 * generated by Xtext
 */
package formulario.serializer;

import Formularios_DASOFT.AccionPulsacion;
import Formularios_DASOFT.AccionSeleccion;
import Formularios_DASOFT.AccionValor;
import Formularios_DASOFT.AsercionHabilitado;
import Formularios_DASOFT.AsercionInvisible;
import Formularios_DASOFT.AsercionSeleccion;
import Formularios_DASOFT.AsercionValor;
import Formularios_DASOFT.BotonCancelar;
import Formularios_DASOFT.BotonCustom;
import Formularios_DASOFT.BotonGuardar;
import Formularios_DASOFT.BotonValidar;
import Formularios_DASOFT.Formulario;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.InputCheck;
import Formularios_DASOFT.InputCombo;
import Formularios_DASOFT.InputRadio;
import Formularios_DASOFT.InputTexto;
import Formularios_DASOFT.Layout;
import Formularios_DASOFT.PruebaInterfaz;
import Formularios_DASOFT.ReaccionHabilitado;
import Formularios_DASOFT.ReaccionVisible;
import com.google.inject.Inject;
import com.google.inject.Provider;
import formulario.services.FormularioGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractFormularioSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FormularioGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Formularios_DASOFTPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Formularios_DASOFTPackage.ACCION_PULSACION:
				sequence_AccionPulsacion(context, (AccionPulsacion) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ACCION_SELECCION:
				sequence_AccionSeleccion(context, (AccionSeleccion) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ACCION_VALOR:
				sequence_AccionValor(context, (AccionValor) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ASERCION_HABILITADO:
				sequence_AsercionHabilitado(context, (AsercionHabilitado) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ASERCION_INVISIBLE:
				sequence_AsercionInvisible(context, (AsercionInvisible) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ASERCION_SELECCION:
				sequence_AsercionSeleccion(context, (AsercionSeleccion) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ASERCION_VALOR:
				sequence_AsercionValor(context, (AsercionValor) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.BOTON_CANCELAR:
				sequence_BotonCancelar(context, (BotonCancelar) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.BOTON_CUSTOM:
				sequence_BotonCustom(context, (BotonCustom) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.BOTON_GUARDAR:
				sequence_BotonGuardar_Impl(context, (BotonGuardar) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.BOTON_VALIDAR:
				sequence_BotonValidar(context, (BotonValidar) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.FORMULARIO:
				sequence_Formulario(context, (Formulario) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.INPUT_CHECK:
				sequence_InputCheck(context, (InputCheck) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.INPUT_COMBO:
				sequence_InputCombo(context, (InputCombo) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.INPUT_RADIO:
				sequence_InputRadio(context, (InputRadio) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.INPUT_TEXTO:
				sequence_InputTexto(context, (InputTexto) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.LAYOUT:
				sequence_Layout(context, (Layout) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.PRUEBA_INTERFAZ:
				sequence_PruebaInterfaz(context, (PruebaInterfaz) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.REACCION_HABILITADO:
				sequence_ReaccionHabilitado(context, (ReaccionHabilitado) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.REACCION_VISIBLE:
				sequence_ReaccionVisible(context, (ReaccionVisible) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (elemento=[Input|EString] asercion=Asercion)
	 */
	protected void sequence_AccionPulsacion(EObject context, AccionPulsacion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ELEMENTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ELEMENTO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ASERCION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ASERCION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccionPulsacionAccess().getElementoInputEStringParserRuleCall_3_0_1(), semanticObject.getElemento());
		feeder.accept(grammarAccess.getAccionPulsacionAccess().getAsercionAsercionParserRuleCall_5_0(), semanticObject.getAsercion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (valor=EInt elemento=[Input|EString] asercion=Asercion)
	 */
	protected void sequence_AccionSeleccion(EObject context, AccionSeleccion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ELEMENTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ELEMENTO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ASERCION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ASERCION));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ACCION_SELECCION__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ACCION_SELECCION__VALOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccionSeleccionAccess().getValorEIntParserRuleCall_3_0(), semanticObject.getValor());
		feeder.accept(grammarAccess.getAccionSeleccionAccess().getElementoInputEStringParserRuleCall_5_0_1(), semanticObject.getElemento());
		feeder.accept(grammarAccess.getAccionSeleccionAccess().getAsercionAsercionParserRuleCall_7_0(), semanticObject.getAsercion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (valor=EString elemento=[Input|EString] asercion=Asercion)
	 */
	protected void sequence_AccionValor(EObject context, AccionValor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ELEMENTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ELEMENTO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ASERCION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ACCION__ASERCION));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ACCION_VALOR__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ACCION_VALOR__VALOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAccionValorAccess().getValorEStringParserRuleCall_3_0(), semanticObject.getValor());
		feeder.accept(grammarAccess.getAccionValorAccess().getElementoInputEStringParserRuleCall_5_0_1(), semanticObject.getElemento());
		feeder.accept(grammarAccess.getAccionValorAccess().getAsercionAsercionParserRuleCall_7_0(), semanticObject.getAsercion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (estado?='estado' elemento=[Input|EString])
	 */
	protected void sequence_AsercionHabilitado(EObject context, AsercionHabilitado semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION__ELEMENTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION__ELEMENTO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION_HABILITADO__ESTADO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION_HABILITADO__ESTADO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAsercionHabilitadoAccess().getEstadoEstadoKeyword_0_0(), semanticObject.isEstado());
		feeder.accept(grammarAccess.getAsercionHabilitadoAccess().getElementoInputEStringParserRuleCall_4_0_1(), semanticObject.getElemento());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (estado?='estado' elemento=[Input|EString])
	 */
	protected void sequence_AsercionInvisible(EObject context, AsercionInvisible semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION__ELEMENTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION__ELEMENTO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION_INVISIBLE__ESTADO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION_INVISIBLE__ESTADO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAsercionInvisibleAccess().getEstadoEstadoKeyword_0_0(), semanticObject.isEstado());
		feeder.accept(grammarAccess.getAsercionInvisibleAccess().getElementoInputEStringParserRuleCall_4_0_1(), semanticObject.getElemento());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (estado=EInt elemento=[Input|EString])
	 */
	protected void sequence_AsercionSeleccion(EObject context, AsercionSeleccion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION__ELEMENTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION__ELEMENTO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION_SELECCION__ESTADO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION_SELECCION__ESTADO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAsercionSeleccionAccess().getEstadoEIntParserRuleCall_3_0(), semanticObject.getEstado());
		feeder.accept(grammarAccess.getAsercionSeleccionAccess().getElementoInputEStringParserRuleCall_5_0_1(), semanticObject.getElemento());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (valor=EString elemento=[Input|EString])
	 */
	protected void sequence_AsercionValor(EObject context, AsercionValor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION__ELEMENTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION__ELEMENTO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION_VALOR__VALOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.ASERCION_VALOR__VALOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAsercionValorAccess().getValorEStringParserRuleCall_3_0(), semanticObject.getValor());
		feeder.accept(grammarAccess.getAsercionValorAccess().getElementoInputEStringParserRuleCall_5_0_1(), semanticObject.getElemento());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString)
	 */
	protected void sequence_BotonCancelar(EObject context, BotonCancelar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString funcion=EString)
	 */
	protected void sequence_BotonCustom(EObject context, BotonCustom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString)
	 */
	protected void sequence_BotonGuardar_Impl(EObject context, BotonGuardar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString)
	 */
	protected void sequence_BotonValidar(EObject context, BotonValidar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString layout=Layout pruebas=PruebaInterfaz?)
	 */
	protected void sequence_Formulario(EObject context, Formulario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         habilitado?='habilitado'? 
	 *         name=EString 
	 *         (valores+=EString valores+=EString*)? 
	 *         (seleccion+=EInt seleccion+=EInt*)? 
	 *         reaccion=Reaccion
	 *     )
	 */
	protected void sequence_InputCheck(EObject context, InputCheck semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString (valores+=EString valores+=EString*)? seleccion=EInt?)
	 */
	protected void sequence_InputCombo(EObject context, InputCombo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visible?='visible'? 
	 *         habilitado?='habilitado'? 
	 *         name=EString 
	 *         (valores+=EString valores+=EString*)? 
	 *         seleccion=EInt? 
	 *         reaccion=Reaccion
	 *     )
	 */
	protected void sequence_InputRadio(EObject context, InputRadio semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? obligatorio?='obligatorio'? name=EString valor=EString?)
	 */
	protected void sequence_InputTexto(EObject context, InputTexto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (columnas=EInt (entradas+=Input entradas+=Input*)?)
	 */
	protected void sequence_Layout(EObject context, Layout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comprobarAsercion?='comprobarAsercion'? comprobarAccion?='comprobarAccion'? name=EString (acciones+=Accion acciones+=Accion*)?)
	 */
	protected void sequence_PruebaInterfaz(EObject context, PruebaInterfaz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (activacion=EInt objetivo=[Input|EString])
	 */
	protected void sequence_ReaccionHabilitado(EObject context, ReaccionHabilitado semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.REACCION__OBJETIVO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.REACCION__OBJETIVO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.REACCION__ACTIVACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.REACCION__ACTIVACION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReaccionHabilitadoAccess().getActivacionEIntParserRuleCall_3_0(), semanticObject.getActivacion());
		feeder.accept(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputEStringParserRuleCall_5_0_1(), semanticObject.getObjetivo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (activacion=EInt objetivo=[Input|EString])
	 */
	protected void sequence_ReaccionVisible(EObject context, ReaccionVisible semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.REACCION__OBJETIVO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.REACCION__OBJETIVO));
			if(transientValues.isValueTransient(semanticObject, Formularios_DASOFTPackage.Literals.REACCION__ACTIVACION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Formularios_DASOFTPackage.Literals.REACCION__ACTIVACION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReaccionVisibleAccess().getActivacionEIntParserRuleCall_3_0(), semanticObject.getActivacion());
		feeder.accept(grammarAccess.getReaccionVisibleAccess().getObjetivoInputEStringParserRuleCall_5_0_1(), semanticObject.getObjetivo());
		feeder.finish();
	}
}
