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
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getFormularioAccess().getGroup(), "rule__Formulario__Group__0");
					put(grammarAccess.getFormularioAccess().getGroup_7(), "rule__Formulario__Group_7__0");
					put(grammarAccess.getLayoutAccess().getGroup(), "rule__Layout__Group__0");
					put(grammarAccess.getLayoutAccess().getGroup_3(), "rule__Layout__Group_3__0");
					put(grammarAccess.getLayoutAccess().getGroup_4(), "rule__Layout__Group_4__0");
					put(grammarAccess.getLayoutAccess().getGroup_5(), "rule__Layout__Group_5__0");
					put(grammarAccess.getLayoutAccess().getGroup_5_3(), "rule__Layout__Group_5_3__0");
					put(grammarAccess.getPruebaInterfazAccess().getGroup(), "rule__PruebaInterfaz__Group__0");
					put(grammarAccess.getPruebaInterfazAccess().getGroup_4(), "rule__PruebaInterfaz__Group_4__0");
					put(grammarAccess.getPruebaInterfazAccess().getGroup_4_3(), "rule__PruebaInterfaz__Group_4_3__0");
					put(grammarAccess.getPruebaInterfazAccess().getGroup_5(), "rule__PruebaInterfaz__Group_5__0");
					put(grammarAccess.getPruebaInterfazAccess().getGroup_5_3(), "rule__PruebaInterfaz__Group_5_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getInput_ImplAccess().getGroup(), "rule__Input_Impl__Group__0");
					put(grammarAccess.getInputTextoAccess().getGroup(), "rule__InputTexto__Group__0");
					put(grammarAccess.getInputTextoAccess().getGroup_7(), "rule__InputTexto__Group_7__0");
					put(grammarAccess.getInputBotonAccess().getGroup(), "rule__InputBoton__Group__0");
					put(grammarAccess.getInputMultiple_ImplAccess().getGroup(), "rule__InputMultiple_Impl__Group__0");
					put(grammarAccess.getInputMultiple_ImplAccess().getGroup_6(), "rule__InputMultiple_Impl__Group_6__0");
					put(grammarAccess.getInputMultiple_ImplAccess().getGroup_6_3(), "rule__InputMultiple_Impl__Group_6_3__0");
					put(grammarAccess.getInputRadioAccess().getGroup(), "rule__InputRadio__Group__0");
					put(grammarAccess.getInputRadioAccess().getGroup_6(), "rule__InputRadio__Group_6__0");
					put(grammarAccess.getInputRadioAccess().getGroup_6_3(), "rule__InputRadio__Group_6_3__0");
					put(grammarAccess.getInputRadioAccess().getGroup_7(), "rule__InputRadio__Group_7__0");
					put(grammarAccess.getInputComboAccess().getGroup(), "rule__InputCombo__Group__0");
					put(grammarAccess.getInputComboAccess().getGroup_6(), "rule__InputCombo__Group_6__0");
					put(grammarAccess.getInputComboAccess().getGroup_6_3(), "rule__InputCombo__Group_6_3__0");
					put(grammarAccess.getInputComboAccess().getGroup_7(), "rule__InputCombo__Group_7__0");
					put(grammarAccess.getInputCheckAccess().getGroup(), "rule__InputCheck__Group__0");
					put(grammarAccess.getInputCheckAccess().getGroup_6(), "rule__InputCheck__Group_6__0");
					put(grammarAccess.getInputCheckAccess().getGroup_6_3(), "rule__InputCheck__Group_6_3__0");
					put(grammarAccess.getInputCheckAccess().getGroup_7(), "rule__InputCheck__Group_7__0");
					put(grammarAccess.getInputCheckAccess().getGroup_7_3(), "rule__InputCheck__Group_7_3__0");
					put(grammarAccess.getAccionAccess().getGroup(), "rule__Accion__Group__0");
					put(grammarAccess.getAsercionAccess().getGroup(), "rule__Asercion__Group__0");
					put(grammarAccess.getFormularioAccess().getComprobarAsercionAssignment_0(), "rule__Formulario__ComprobarAsercionAssignment_0");
					put(grammarAccess.getFormularioAccess().getComprobarAccionAssignment_1(), "rule__Formulario__ComprobarAccionAssignment_1");
					put(grammarAccess.getFormularioAccess().getNameAssignment_3(), "rule__Formulario__NameAssignment_3");
					put(grammarAccess.getFormularioAccess().getLayoutAssignment_6(), "rule__Formulario__LayoutAssignment_6");
					put(grammarAccess.getFormularioAccess().getPruebasAssignment_7_1(), "rule__Formulario__PruebasAssignment_7_1");
					put(grammarAccess.getLayoutAccess().getAnchuraAssignment_3_1(), "rule__Layout__AnchuraAssignment_3_1");
					put(grammarAccess.getLayoutAccess().getAlturaAssignment_4_1(), "rule__Layout__AlturaAssignment_4_1");
					put(grammarAccess.getLayoutAccess().getEntradasAssignment_5_2(), "rule__Layout__EntradasAssignment_5_2");
					put(grammarAccess.getLayoutAccess().getEntradasAssignment_5_3_1(), "rule__Layout__EntradasAssignment_5_3_1");
					put(grammarAccess.getPruebaInterfazAccess().getNameAssignment_2(), "rule__PruebaInterfaz__NameAssignment_2");
					put(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_4_2(), "rule__PruebaInterfaz__AccionesAssignment_4_2");
					put(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_4_3_1(), "rule__PruebaInterfaz__AccionesAssignment_4_3_1");
					put(grammarAccess.getPruebaInterfazAccess().getAsercionesAssignment_5_2(), "rule__PruebaInterfaz__AsercionesAssignment_5_2");
					put(grammarAccess.getPruebaInterfazAccess().getAsercionesAssignment_5_3_1(), "rule__PruebaInterfaz__AsercionesAssignment_5_3_1");
					put(grammarAccess.getInput_ImplAccess().getVisibleAssignment_1(), "rule__Input_Impl__VisibleAssignment_1");
					put(grammarAccess.getInput_ImplAccess().getHabilitadoAssignment_2(), "rule__Input_Impl__HabilitadoAssignment_2");
					put(grammarAccess.getInput_ImplAccess().getNameAssignment_4(), "rule__Input_Impl__NameAssignment_4");
					put(grammarAccess.getInputTextoAccess().getVisibleAssignment_1(), "rule__InputTexto__VisibleAssignment_1");
					put(grammarAccess.getInputTextoAccess().getHabilitadoAssignment_2(), "rule__InputTexto__HabilitadoAssignment_2");
					put(grammarAccess.getInputTextoAccess().getObligatorioAssignment_3(), "rule__InputTexto__ObligatorioAssignment_3");
					put(grammarAccess.getInputTextoAccess().getNameAssignment_5(), "rule__InputTexto__NameAssignment_5");
					put(grammarAccess.getInputTextoAccess().getValorAssignment_7_1(), "rule__InputTexto__ValorAssignment_7_1");
					put(grammarAccess.getInputBotonAccess().getVisibleAssignment_1(), "rule__InputBoton__VisibleAssignment_1");
					put(grammarAccess.getInputBotonAccess().getHabilitadoAssignment_2(), "rule__InputBoton__HabilitadoAssignment_2");
					put(grammarAccess.getInputBotonAccess().getNameAssignment_4(), "rule__InputBoton__NameAssignment_4");
					put(grammarAccess.getInputMultiple_ImplAccess().getVisibleAssignment_1(), "rule__InputMultiple_Impl__VisibleAssignment_1");
					put(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoAssignment_2(), "rule__InputMultiple_Impl__HabilitadoAssignment_2");
					put(grammarAccess.getInputMultiple_ImplAccess().getNameAssignment_4(), "rule__InputMultiple_Impl__NameAssignment_4");
					put(grammarAccess.getInputMultiple_ImplAccess().getValoresAssignment_6_2(), "rule__InputMultiple_Impl__ValoresAssignment_6_2");
					put(grammarAccess.getInputMultiple_ImplAccess().getValoresAssignment_6_3_1(), "rule__InputMultiple_Impl__ValoresAssignment_6_3_1");
					put(grammarAccess.getInputRadioAccess().getVisibleAssignment_1(), "rule__InputRadio__VisibleAssignment_1");
					put(grammarAccess.getInputRadioAccess().getHabilitadoAssignment_2(), "rule__InputRadio__HabilitadoAssignment_2");
					put(grammarAccess.getInputRadioAccess().getNameAssignment_4(), "rule__InputRadio__NameAssignment_4");
					put(grammarAccess.getInputRadioAccess().getValoresAssignment_6_2(), "rule__InputRadio__ValoresAssignment_6_2");
					put(grammarAccess.getInputRadioAccess().getValoresAssignment_6_3_1(), "rule__InputRadio__ValoresAssignment_6_3_1");
					put(grammarAccess.getInputRadioAccess().getSeleccionAssignment_7_1(), "rule__InputRadio__SeleccionAssignment_7_1");
					put(grammarAccess.getInputComboAccess().getVisibleAssignment_1(), "rule__InputCombo__VisibleAssignment_1");
					put(grammarAccess.getInputComboAccess().getHabilitadoAssignment_2(), "rule__InputCombo__HabilitadoAssignment_2");
					put(grammarAccess.getInputComboAccess().getNameAssignment_4(), "rule__InputCombo__NameAssignment_4");
					put(grammarAccess.getInputComboAccess().getValoresAssignment_6_2(), "rule__InputCombo__ValoresAssignment_6_2");
					put(grammarAccess.getInputComboAccess().getValoresAssignment_6_3_1(), "rule__InputCombo__ValoresAssignment_6_3_1");
					put(grammarAccess.getInputComboAccess().getSeleccionAssignment_7_1(), "rule__InputCombo__SeleccionAssignment_7_1");
					put(grammarAccess.getInputCheckAccess().getVisibleAssignment_1(), "rule__InputCheck__VisibleAssignment_1");
					put(grammarAccess.getInputCheckAccess().getHabilitadoAssignment_2(), "rule__InputCheck__HabilitadoAssignment_2");
					put(grammarAccess.getInputCheckAccess().getNameAssignment_4(), "rule__InputCheck__NameAssignment_4");
					put(grammarAccess.getInputCheckAccess().getValoresAssignment_6_2(), "rule__InputCheck__ValoresAssignment_6_2");
					put(grammarAccess.getInputCheckAccess().getValoresAssignment_6_3_1(), "rule__InputCheck__ValoresAssignment_6_3_1");
					put(grammarAccess.getInputCheckAccess().getSeleccionAssignment_7_2(), "rule__InputCheck__SeleccionAssignment_7_2");
					put(grammarAccess.getInputCheckAccess().getSeleccionAssignment_7_3_1(), "rule__InputCheck__SeleccionAssignment_7_3_1");
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
