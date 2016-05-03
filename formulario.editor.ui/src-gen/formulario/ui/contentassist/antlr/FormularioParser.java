/*
 * generated by Xtext
 */
package formulario.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import formulario.services.FormularioGrammarAccess;

public class FormularioParser extends AbstractContentAssistParser {
	
	@Inject
	private FormularioGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected formulario.ui.contentassist.antlr.internal.InternalFormularioParser createParser() {
		formulario.ui.contentassist.antlr.internal.InternalFormularioParser result = new formulario.ui.contentassist.antlr.internal.InternalFormularioParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInputAccess().getAlternatives(), "rule__Input__Alternatives");
					put(grammarAccess.getAccionAccess().getAlternatives(), "rule__Accion__Alternatives");
					put(grammarAccess.getReaccionAccess().getAlternatives(), "rule__Reaccion__Alternatives");
					put(grammarAccess.getAsercionAccess().getAlternatives(), "rule__Asercion__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getFormularioAccess().getGroup(), "rule__Formulario__Group__0");
					put(grammarAccess.getFormularioAccess().getGroup_7(), "rule__Formulario__Group_7__0");
					put(grammarAccess.getLayoutAccess().getGroup(), "rule__Layout__Group__0");
					put(grammarAccess.getLayoutAccess().getGroup_4(), "rule__Layout__Group_4__0");
					put(grammarAccess.getLayoutAccess().getGroup_4_3(), "rule__Layout__Group_4_3__0");
					put(grammarAccess.getPruebaInterfazAccess().getGroup(), "rule__PruebaInterfaz__Group__0");
					put(grammarAccess.getPruebaInterfazAccess().getGroup_4(), "rule__PruebaInterfaz__Group_4__0");
					put(grammarAccess.getPruebaInterfazAccess().getGroup_4_3(), "rule__PruebaInterfaz__Group_4_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getInputTextoAccess().getGroup(), "rule__InputTexto__Group__0");
					put(grammarAccess.getInputTextoAccess().getGroup_7(), "rule__InputTexto__Group_7__0");
					put(grammarAccess.getInputRadioAccess().getGroup(), "rule__InputRadio__Group__0");
					put(grammarAccess.getInputRadioAccess().getGroup_5(), "rule__InputRadio__Group_5__0");
					put(grammarAccess.getInputRadioAccess().getGroup_5_3(), "rule__InputRadio__Group_5_3__0");
					put(grammarAccess.getInputRadioAccess().getGroup_6(), "rule__InputRadio__Group_6__0");
					put(grammarAccess.getInputComboAccess().getGroup(), "rule__InputCombo__Group__0");
					put(grammarAccess.getInputComboAccess().getGroup_6(), "rule__InputCombo__Group_6__0");
					put(grammarAccess.getInputComboAccess().getGroup_6_3(), "rule__InputCombo__Group_6_3__0");
					put(grammarAccess.getInputComboAccess().getGroup_7(), "rule__InputCombo__Group_7__0");
					put(grammarAccess.getInputCheckAccess().getGroup(), "rule__InputCheck__Group__0");
					put(grammarAccess.getInputCheckAccess().getGroup_5(), "rule__InputCheck__Group_5__0");
					put(grammarAccess.getInputCheckAccess().getGroup_5_3(), "rule__InputCheck__Group_5_3__0");
					put(grammarAccess.getInputCheckAccess().getGroup_6(), "rule__InputCheck__Group_6__0");
					put(grammarAccess.getInputCheckAccess().getGroup_6_3(), "rule__InputCheck__Group_6_3__0");
					put(grammarAccess.getBotonValidarAccess().getGroup(), "rule__BotonValidar__Group__0");
					put(grammarAccess.getBotonGuardar_ImplAccess().getGroup(), "rule__BotonGuardar_Impl__Group__0");
					put(grammarAccess.getBotonCancelarAccess().getGroup(), "rule__BotonCancelar__Group__0");
					put(grammarAccess.getBotonCustomAccess().getGroup(), "rule__BotonCustom__Group__0");
					put(grammarAccess.getReaccionVisibleAccess().getGroup(), "rule__ReaccionVisible__Group__0");
					put(grammarAccess.getReaccionHabilitadoAccess().getGroup(), "rule__ReaccionHabilitado__Group__0");
					put(grammarAccess.getAccionValorAccess().getGroup(), "rule__AccionValor__Group__0");
					put(grammarAccess.getAccionSeleccionAccess().getGroup(), "rule__AccionSeleccion__Group__0");
					put(grammarAccess.getAccionPulsacionAccess().getGroup(), "rule__AccionPulsacion__Group__0");
					put(grammarAccess.getAsercionInvisibleAccess().getGroup(), "rule__AsercionInvisible__Group__0");
					put(grammarAccess.getAsercionHabilitadoAccess().getGroup(), "rule__AsercionHabilitado__Group__0");
					put(grammarAccess.getAsercionValorAccess().getGroup(), "rule__AsercionValor__Group__0");
					put(grammarAccess.getAsercionSeleccionAccess().getGroup(), "rule__AsercionSeleccion__Group__0");
					put(grammarAccess.getFormularioAccess().getComprobacionCamposAssignment_0(), "rule__Formulario__ComprobacionCamposAssignment_0");
					put(grammarAccess.getFormularioAccess().getComprobacionAccionAssignment_1(), "rule__Formulario__ComprobacionAccionAssignment_1");
					put(grammarAccess.getFormularioAccess().getNameAssignment_3(), "rule__Formulario__NameAssignment_3");
					put(grammarAccess.getFormularioAccess().getLayoutAssignment_6(), "rule__Formulario__LayoutAssignment_6");
					put(grammarAccess.getFormularioAccess().getPruebasAssignment_7_1(), "rule__Formulario__PruebasAssignment_7_1");
					put(grammarAccess.getLayoutAccess().getColumnasAssignment_3(), "rule__Layout__ColumnasAssignment_3");
					put(grammarAccess.getLayoutAccess().getEntradasAssignment_4_2(), "rule__Layout__EntradasAssignment_4_2");
					put(grammarAccess.getLayoutAccess().getEntradasAssignment_4_3_1(), "rule__Layout__EntradasAssignment_4_3_1");
					put(grammarAccess.getPruebaInterfazAccess().getNameAssignment_2(), "rule__PruebaInterfaz__NameAssignment_2");
					put(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_4_2(), "rule__PruebaInterfaz__AccionesAssignment_4_2");
					put(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_4_3_1(), "rule__PruebaInterfaz__AccionesAssignment_4_3_1");
					put(grammarAccess.getInputTextoAccess().getInvisibleAssignment_1(), "rule__InputTexto__InvisibleAssignment_1");
					put(grammarAccess.getInputTextoAccess().getDeshabilitadoAssignment_2(), "rule__InputTexto__DeshabilitadoAssignment_2");
					put(grammarAccess.getInputTextoAccess().getObligatorioAssignment_3(), "rule__InputTexto__ObligatorioAssignment_3");
					put(grammarAccess.getInputTextoAccess().getNameAssignment_5(), "rule__InputTexto__NameAssignment_5");
					put(grammarAccess.getInputTextoAccess().getValorAssignment_7_1(), "rule__InputTexto__ValorAssignment_7_1");
					put(grammarAccess.getInputRadioAccess().getInvisibleAssignment_0(), "rule__InputRadio__InvisibleAssignment_0");
					put(grammarAccess.getInputRadioAccess().getDeshabilitadoAssignment_1(), "rule__InputRadio__DeshabilitadoAssignment_1");
					put(grammarAccess.getInputRadioAccess().getNameAssignment_3(), "rule__InputRadio__NameAssignment_3");
					put(grammarAccess.getInputRadioAccess().getValoresAssignment_5_2(), "rule__InputRadio__ValoresAssignment_5_2");
					put(grammarAccess.getInputRadioAccess().getValoresAssignment_5_3_1(), "rule__InputRadio__ValoresAssignment_5_3_1");
					put(grammarAccess.getInputRadioAccess().getSeleccionAssignment_6_1(), "rule__InputRadio__SeleccionAssignment_6_1");
					put(grammarAccess.getInputRadioAccess().getReaccionAssignment_8(), "rule__InputRadio__ReaccionAssignment_8");
					put(grammarAccess.getInputComboAccess().getInvisibleAssignment_1(), "rule__InputCombo__InvisibleAssignment_1");
					put(grammarAccess.getInputComboAccess().getDeshabilitadoAssignment_2(), "rule__InputCombo__DeshabilitadoAssignment_2");
					put(grammarAccess.getInputComboAccess().getNameAssignment_4(), "rule__InputCombo__NameAssignment_4");
					put(grammarAccess.getInputComboAccess().getValoresAssignment_6_2(), "rule__InputCombo__ValoresAssignment_6_2");
					put(grammarAccess.getInputComboAccess().getValoresAssignment_6_3_1(), "rule__InputCombo__ValoresAssignment_6_3_1");
					put(grammarAccess.getInputComboAccess().getSeleccionAssignment_7_1(), "rule__InputCombo__SeleccionAssignment_7_1");
					put(grammarAccess.getInputCheckAccess().getInvisibleAssignment_0(), "rule__InputCheck__InvisibleAssignment_0");
					put(grammarAccess.getInputCheckAccess().getDeshabilitadoAssignment_1(), "rule__InputCheck__DeshabilitadoAssignment_1");
					put(grammarAccess.getInputCheckAccess().getNameAssignment_3(), "rule__InputCheck__NameAssignment_3");
					put(grammarAccess.getInputCheckAccess().getValoresAssignment_5_2(), "rule__InputCheck__ValoresAssignment_5_2");
					put(grammarAccess.getInputCheckAccess().getValoresAssignment_5_3_1(), "rule__InputCheck__ValoresAssignment_5_3_1");
					put(grammarAccess.getInputCheckAccess().getSeleccionAssignment_6_2(), "rule__InputCheck__SeleccionAssignment_6_2");
					put(grammarAccess.getInputCheckAccess().getSeleccionAssignment_6_3_1(), "rule__InputCheck__SeleccionAssignment_6_3_1");
					put(grammarAccess.getInputCheckAccess().getReaccionAssignment_8(), "rule__InputCheck__ReaccionAssignment_8");
					put(grammarAccess.getBotonValidarAccess().getInvisibleAssignment_1(), "rule__BotonValidar__InvisibleAssignment_1");
					put(grammarAccess.getBotonValidarAccess().getDeshabilitadoAssignment_2(), "rule__BotonValidar__DeshabilitadoAssignment_2");
					put(grammarAccess.getBotonValidarAccess().getNameAssignment_4(), "rule__BotonValidar__NameAssignment_4");
					put(grammarAccess.getBotonGuardar_ImplAccess().getInvisibleAssignment_1(), "rule__BotonGuardar_Impl__InvisibleAssignment_1");
					put(grammarAccess.getBotonGuardar_ImplAccess().getDeshabilitadoAssignment_2(), "rule__BotonGuardar_Impl__DeshabilitadoAssignment_2");
					put(grammarAccess.getBotonGuardar_ImplAccess().getNameAssignment_4(), "rule__BotonGuardar_Impl__NameAssignment_4");
					put(grammarAccess.getBotonCancelarAccess().getInvisibleAssignment_1(), "rule__BotonCancelar__InvisibleAssignment_1");
					put(grammarAccess.getBotonCancelarAccess().getDeshabilitadoAssignment_2(), "rule__BotonCancelar__DeshabilitadoAssignment_2");
					put(grammarAccess.getBotonCancelarAccess().getNameAssignment_4(), "rule__BotonCancelar__NameAssignment_4");
					put(grammarAccess.getBotonCustomAccess().getInvisibleAssignment_0(), "rule__BotonCustom__InvisibleAssignment_0");
					put(grammarAccess.getBotonCustomAccess().getDeshabilitadoAssignment_1(), "rule__BotonCustom__DeshabilitadoAssignment_1");
					put(grammarAccess.getBotonCustomAccess().getNameAssignment_3(), "rule__BotonCustom__NameAssignment_3");
					put(grammarAccess.getBotonCustomAccess().getFuncionAssignment_6(), "rule__BotonCustom__FuncionAssignment_6");
					put(grammarAccess.getReaccionVisibleAccess().getActivacionAssignment_3(), "rule__ReaccionVisible__ActivacionAssignment_3");
					put(grammarAccess.getReaccionVisibleAccess().getObjetivoAssignment_5(), "rule__ReaccionVisible__ObjetivoAssignment_5");
					put(grammarAccess.getReaccionHabilitadoAccess().getActivacionAssignment_3(), "rule__ReaccionHabilitado__ActivacionAssignment_3");
					put(grammarAccess.getReaccionHabilitadoAccess().getObjetivoAssignment_5(), "rule__ReaccionHabilitado__ObjetivoAssignment_5");
					put(grammarAccess.getAccionValorAccess().getValorAssignment_3(), "rule__AccionValor__ValorAssignment_3");
					put(grammarAccess.getAccionValorAccess().getElementoAssignment_5(), "rule__AccionValor__ElementoAssignment_5");
					put(grammarAccess.getAccionValorAccess().getAsercionAssignment_7(), "rule__AccionValor__AsercionAssignment_7");
					put(grammarAccess.getAccionSeleccionAccess().getValorAssignment_3(), "rule__AccionSeleccion__ValorAssignment_3");
					put(grammarAccess.getAccionSeleccionAccess().getElementoAssignment_5(), "rule__AccionSeleccion__ElementoAssignment_5");
					put(grammarAccess.getAccionSeleccionAccess().getAsercionAssignment_7(), "rule__AccionSeleccion__AsercionAssignment_7");
					put(grammarAccess.getAccionPulsacionAccess().getElementoAssignment_3(), "rule__AccionPulsacion__ElementoAssignment_3");
					put(grammarAccess.getAccionPulsacionAccess().getAsercionAssignment_5(), "rule__AccionPulsacion__AsercionAssignment_5");
					put(grammarAccess.getAsercionInvisibleAccess().getEstadoAssignment_0(), "rule__AsercionInvisible__EstadoAssignment_0");
					put(grammarAccess.getAsercionInvisibleAccess().getElementoAssignment_4(), "rule__AsercionInvisible__ElementoAssignment_4");
					put(grammarAccess.getAsercionHabilitadoAccess().getEstadoAssignment_0(), "rule__AsercionHabilitado__EstadoAssignment_0");
					put(grammarAccess.getAsercionHabilitadoAccess().getElementoAssignment_4(), "rule__AsercionHabilitado__ElementoAssignment_4");
					put(grammarAccess.getAsercionValorAccess().getValorAssignment_3(), "rule__AsercionValor__ValorAssignment_3");
					put(grammarAccess.getAsercionValorAccess().getElementoAssignment_5(), "rule__AsercionValor__ElementoAssignment_5");
					put(grammarAccess.getAsercionSeleccionAccess().getEstadoAssignment_3(), "rule__AsercionSeleccion__EstadoAssignment_3");
					put(grammarAccess.getAsercionSeleccionAccess().getElementoAssignment_5(), "rule__AsercionSeleccion__ElementoAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			formulario.ui.contentassist.antlr.internal.InternalFormularioParser typedParser = (formulario.ui.contentassist.antlr.internal.InternalFormularioParser) parser;
			typedParser.entryRuleFormulario();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FormularioGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FormularioGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
