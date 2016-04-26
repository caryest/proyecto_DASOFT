/*
 * generated by Xtext
 */
package formulario.serializer;

import Formularios_DASOFT.Accion;
import Formularios_DASOFT.AsercionHabilitado;
import Formularios_DASOFT.AsercionInvisible;
import Formularios_DASOFT.AsercionSeleccionado;
import Formularios_DASOFT.AsercionValor;
import Formularios_DASOFT.Formulario;
import Formularios_DASOFT.Formularios_DASOFTPackage;
import Formularios_DASOFT.InputBoton;
import Formularios_DASOFT.InputCheck;
import Formularios_DASOFT.InputCombo;
import Formularios_DASOFT.InputMultiple;
import Formularios_DASOFT.InputRadio;
import Formularios_DASOFT.InputTexto;
import Formularios_DASOFT.Layout;
import Formularios_DASOFT.PruebaInterfaz;
import com.google.inject.Inject;
import com.google.inject.Provider;
import formulario.services.FormularioGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractFormularioSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FormularioGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Formularios_DASOFTPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Formularios_DASOFTPackage.ACCION:
				sequence_Accion(context, (Accion) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ASERCION_HABILITADO:
				sequence_AsercionHabilitado(context, (AsercionHabilitado) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ASERCION_INVISIBLE:
				sequence_AsercionInvisible(context, (AsercionInvisible) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ASERCION_SELECCIONADO:
				sequence_AsercionSeleccionado(context, (AsercionSeleccionado) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.ASERCION_VALOR:
				sequence_AsercionValor(context, (AsercionValor) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.FORMULARIO:
				sequence_Formulario(context, (Formulario) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.INPUT_BOTON:
				sequence_InputBoton(context, (InputBoton) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.INPUT_CHECK:
				sequence_InputCheck(context, (InputCheck) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.INPUT_COMBO:
				sequence_InputCombo(context, (InputCombo) semanticObject); 
				return; 
			case Formularios_DASOFTPackage.INPUT_MULTIPLE:
				sequence_InputMultiple_Impl(context, (InputMultiple) semanticObject); 
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
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (elemento=[Input|EString]? asercion=Asercion?)
	 */
	protected void sequence_Accion(EObject context, Accion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (estado?='estado'? elemento=[Input|EString]?)
	 */
	protected void sequence_AsercionHabilitado(EObject context, AsercionHabilitado semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (estado?='estado'? elemento=[Input|EString]?)
	 */
	protected void sequence_AsercionInvisible(EObject context, AsercionInvisible semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (estado?='estado'? elemento=[Input|EString]?)
	 */
	protected void sequence_AsercionSeleccionado(EObject context, AsercionSeleccionado semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valor=EString? elemento=[Input|EString]?)
	 */
	protected void sequence_AsercionValor(EObject context, AsercionValor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comprobarAsercion?='comprobarAsercion'? comprobarAccion?='comprobarAccion'? name=EString layout=Layout pruebas=PruebaInterfaz?)
	 */
	protected void sequence_Formulario(EObject context, Formulario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString)
	 */
	protected void sequence_InputBoton(EObject context, InputBoton semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString (valores+=EString valores+=EString*)? (seleccion+=EInt seleccion+=EInt*)?)
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
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString (valores+=EString valores+=EString*)?)
	 */
	protected void sequence_InputMultiple_Impl(EObject context, InputMultiple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visible?='visible'? habilitado?='habilitado'? name=EString (valores+=EString valores+=EString*)? seleccion=EInt?)
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
	 *     (anchura=EInt? altura=EInt? (entradas+=Input entradas+=Input*)?)
	 */
	protected void sequence_Layout(EObject context, Layout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (acciones+=Accion acciones+=Accion*)?)
	 */
	protected void sequence_PruebaInterfaz(EObject context, PruebaInterfaz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
