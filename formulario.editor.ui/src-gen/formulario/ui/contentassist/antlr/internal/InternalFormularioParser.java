package formulario.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import formulario.services.FormularioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormularioParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Formulario'", "'{'", "'}'", "'Layout'", "'columnas'", "'entradas'", "'['", "']'", "','", "'PruebaInterfaz'", "'-'", "'Input Texto'", "'inicial'", "'Radio'", "':'", "'Reaccion'", "'Combo'", "'Check'", "'iniciales'", "'BotonValidar'", "'BotonGuardar'", "'BotonCancelar'", "'BotonCustom'", "'Visible:'", "'->'", "'Deshabilitado:'", "'Accion para Texto'", "'Accion para Seleccion'", "'Accion para Boton'", "'Asercion invisible'", "'Asercion deshabilitado'", "'Asercion valor'", "'Asercion seleccion'", "'comprobacionCampos'", "'comprobacionAccion'", "'deshabilitado'", "'obligatorio'", "'invisible'", "'falso'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFormularioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormularioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormularioParser.tokenNames; }
    public String getGrammarFileName() { return "../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g"; }


     
     	private FormularioGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FormularioGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleFormulario"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:60:1: entryRuleFormulario : ruleFormulario EOF ;
    public final void entryRuleFormulario() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:61:1: ( ruleFormulario EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:62:1: ruleFormulario EOF
            {
             before(grammarAccess.getFormularioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFormulario_in_entryRuleFormulario61);
            ruleFormulario();

            state._fsp--;

             after(grammarAccess.getFormularioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormulario68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormulario"


    // $ANTLR start "ruleFormulario"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:69:1: ruleFormulario : ( ( rule__Formulario__Group__0 ) ) ;
    public final void ruleFormulario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:73:2: ( ( ( rule__Formulario__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:74:1: ( ( rule__Formulario__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:74:1: ( ( rule__Formulario__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:75:1: ( rule__Formulario__Group__0 )
            {
             before(grammarAccess.getFormularioAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:76:1: ( rule__Formulario__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:76:2: rule__Formulario__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__0_in_ruleFormulario94);
            rule__Formulario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormularioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormulario"


    // $ANTLR start "entryRuleInput"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:88:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:89:1: ( ruleInput EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:90:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_entryRuleInput121);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:97:1: ruleInput : ( ( rule__Input__Alternatives ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:101:2: ( ( ( rule__Input__Alternatives ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:102:1: ( ( rule__Input__Alternatives ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:102:1: ( ( rule__Input__Alternatives ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:103:1: ( rule__Input__Alternatives )
            {
             before(grammarAccess.getInputAccess().getAlternatives()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:104:1: ( rule__Input__Alternatives )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:104:2: rule__Input__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input__Alternatives_in_ruleInput154);
            rule__Input__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleAccion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:116:1: entryRuleAccion : ruleAccion EOF ;
    public final void entryRuleAccion() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:117:1: ( ruleAccion EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:118:1: ruleAccion EOF
            {
             before(grammarAccess.getAccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccion_in_entryRuleAccion181);
            ruleAccion();

            state._fsp--;

             after(grammarAccess.getAccionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccion188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccion"


    // $ANTLR start "ruleAccion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:125:1: ruleAccion : ( ( rule__Accion__Alternatives ) ) ;
    public final void ruleAccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:129:2: ( ( ( rule__Accion__Alternatives ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:130:1: ( ( rule__Accion__Alternatives ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:130:1: ( ( rule__Accion__Alternatives ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:131:1: ( rule__Accion__Alternatives )
            {
             before(grammarAccess.getAccionAccess().getAlternatives()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:132:1: ( rule__Accion__Alternatives )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:132:2: rule__Accion__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Accion__Alternatives_in_ruleAccion214);
            rule__Accion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccion"


    // $ANTLR start "entryRuleReaccion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:144:1: entryRuleReaccion : ruleReaccion EOF ;
    public final void entryRuleReaccion() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:145:1: ( ruleReaccion EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:146:1: ruleReaccion EOF
            {
             before(grammarAccess.getReaccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_entryRuleReaccion241);
            ruleReaccion();

            state._fsp--;

             after(grammarAccess.getReaccionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccion248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReaccion"


    // $ANTLR start "ruleReaccion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:153:1: ruleReaccion : ( ( rule__Reaccion__Alternatives ) ) ;
    public final void ruleReaccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:157:2: ( ( ( rule__Reaccion__Alternatives ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:158:1: ( ( rule__Reaccion__Alternatives ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:158:1: ( ( rule__Reaccion__Alternatives ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:159:1: ( rule__Reaccion__Alternatives )
            {
             before(grammarAccess.getReaccionAccess().getAlternatives()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:160:1: ( rule__Reaccion__Alternatives )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:160:2: rule__Reaccion__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Reaccion__Alternatives_in_ruleReaccion274);
            rule__Reaccion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReaccionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReaccion"


    // $ANTLR start "entryRuleAsercion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:172:1: entryRuleAsercion : ruleAsercion EOF ;
    public final void entryRuleAsercion() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:173:1: ( ruleAsercion EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:174:1: ruleAsercion EOF
            {
             before(grammarAccess.getAsercionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_entryRuleAsercion301);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getAsercionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercion308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsercion"


    // $ANTLR start "ruleAsercion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:181:1: ruleAsercion : ( ( rule__Asercion__Alternatives ) ) ;
    public final void ruleAsercion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:185:2: ( ( ( rule__Asercion__Alternatives ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:186:1: ( ( rule__Asercion__Alternatives ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:186:1: ( ( rule__Asercion__Alternatives ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:187:1: ( rule__Asercion__Alternatives )
            {
             before(grammarAccess.getAsercionAccess().getAlternatives()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:188:1: ( rule__Asercion__Alternatives )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:188:2: rule__Asercion__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Asercion__Alternatives_in_ruleAsercion334);
            rule__Asercion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsercion"


    // $ANTLR start "entryRuleLayout"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:200:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:201:1: ( ruleLayout EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:202:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout361);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:209:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:213:2: ( ( ( rule__Layout__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:214:1: ( ( rule__Layout__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:214:1: ( ( rule__Layout__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:215:1: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:216:1: ( rule__Layout__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:216:2: rule__Layout__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0_in_ruleLayout394);
            rule__Layout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleEString"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:229:1: ( ruleEString EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:230:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString421);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:242:1: ( ( rule__EString__Alternatives ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:242:1: ( ( rule__EString__Alternatives ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:243:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:244:1: ( rule__EString__Alternatives )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:244:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString454);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePruebaInterfaz"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:256:1: entryRulePruebaInterfaz : rulePruebaInterfaz EOF ;
    public final void entryRulePruebaInterfaz() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:257:1: ( rulePruebaInterfaz EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:258:1: rulePruebaInterfaz EOF
            {
             before(grammarAccess.getPruebaInterfazRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz481);
            rulePruebaInterfaz();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePruebaInterfaz"


    // $ANTLR start "rulePruebaInterfaz"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:265:1: rulePruebaInterfaz : ( ( rule__PruebaInterfaz__Group__0 ) ) ;
    public final void rulePruebaInterfaz() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:269:2: ( ( ( rule__PruebaInterfaz__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:270:1: ( ( rule__PruebaInterfaz__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:270:1: ( ( rule__PruebaInterfaz__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:271:1: ( rule__PruebaInterfaz__Group__0 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:272:1: ( rule__PruebaInterfaz__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:272:2: rule__PruebaInterfaz__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__0_in_rulePruebaInterfaz514);
            rule__PruebaInterfaz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPruebaInterfazAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePruebaInterfaz"


    // $ANTLR start "entryRuleEInt"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:286:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:287:1: ( ruleEInt EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:288:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt543);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:295:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:299:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:300:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:300:1: ( ( rule__EInt__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:301:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:302:1: ( rule__EInt__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:302:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt576);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInputTexto"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:314:1: entryRuleInputTexto : ruleInputTexto EOF ;
    public final void entryRuleInputTexto() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:315:1: ( ruleInputTexto EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:316:1: ruleInputTexto EOF
            {
             before(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto603);
            ruleInputTexto();

            state._fsp--;

             after(grammarAccess.getInputTextoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputTexto"


    // $ANTLR start "ruleInputTexto"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:323:1: ruleInputTexto : ( ( rule__InputTexto__Group__0 ) ) ;
    public final void ruleInputTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:327:2: ( ( ( rule__InputTexto__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:328:1: ( ( rule__InputTexto__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:328:1: ( ( rule__InputTexto__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:329:1: ( rule__InputTexto__Group__0 )
            {
             before(grammarAccess.getInputTextoAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:330:1: ( rule__InputTexto__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:330:2: rule__InputTexto__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__0_in_ruleInputTexto636);
            rule__InputTexto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputTextoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputTexto"


    // $ANTLR start "entryRuleInputRadio"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:342:1: entryRuleInputRadio : ruleInputRadio EOF ;
    public final void entryRuleInputRadio() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:343:1: ( ruleInputRadio EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:344:1: ruleInputRadio EOF
            {
             before(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio663);
            ruleInputRadio();

            state._fsp--;

             after(grammarAccess.getInputRadioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputRadio"


    // $ANTLR start "ruleInputRadio"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:351:1: ruleInputRadio : ( ( rule__InputRadio__Group__0 ) ) ;
    public final void ruleInputRadio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:355:2: ( ( ( rule__InputRadio__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:356:1: ( ( rule__InputRadio__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:356:1: ( ( rule__InputRadio__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:357:1: ( rule__InputRadio__Group__0 )
            {
             before(grammarAccess.getInputRadioAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:358:1: ( rule__InputRadio__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:358:2: rule__InputRadio__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__0_in_ruleInputRadio696);
            rule__InputRadio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputRadio"


    // $ANTLR start "entryRuleInputCombo"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:370:1: entryRuleInputCombo : ruleInputCombo EOF ;
    public final void entryRuleInputCombo() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:371:1: ( ruleInputCombo EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:372:1: ruleInputCombo EOF
            {
             before(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo723);
            ruleInputCombo();

            state._fsp--;

             after(grammarAccess.getInputComboRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputCombo"


    // $ANTLR start "ruleInputCombo"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:379:1: ruleInputCombo : ( ( rule__InputCombo__Group__0 ) ) ;
    public final void ruleInputCombo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:383:2: ( ( ( rule__InputCombo__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:384:1: ( ( rule__InputCombo__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:384:1: ( ( rule__InputCombo__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:385:1: ( rule__InputCombo__Group__0 )
            {
             before(grammarAccess.getInputComboAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:386:1: ( rule__InputCombo__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:386:2: rule__InputCombo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__0_in_ruleInputCombo756);
            rule__InputCombo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputComboAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputCombo"


    // $ANTLR start "entryRuleInputCheck"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:398:1: entryRuleInputCheck : ruleInputCheck EOF ;
    public final void entryRuleInputCheck() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:399:1: ( ruleInputCheck EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:400:1: ruleInputCheck EOF
            {
             before(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck783);
            ruleInputCheck();

            state._fsp--;

             after(grammarAccess.getInputCheckRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputCheck"


    // $ANTLR start "ruleInputCheck"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:407:1: ruleInputCheck : ( ( rule__InputCheck__Group__0 ) ) ;
    public final void ruleInputCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:411:2: ( ( ( rule__InputCheck__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:412:1: ( ( rule__InputCheck__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:412:1: ( ( rule__InputCheck__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:413:1: ( rule__InputCheck__Group__0 )
            {
             before(grammarAccess.getInputCheckAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:414:1: ( rule__InputCheck__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:414:2: rule__InputCheck__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__0_in_ruleInputCheck816);
            rule__InputCheck__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputCheck"


    // $ANTLR start "entryRuleBotonValidar"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:426:1: entryRuleBotonValidar : ruleBotonValidar EOF ;
    public final void entryRuleBotonValidar() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:427:1: ( ruleBotonValidar EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:428:1: ruleBotonValidar EOF
            {
             before(grammarAccess.getBotonValidarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar843);
            ruleBotonValidar();

            state._fsp--;

             after(grammarAccess.getBotonValidarRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonValidar850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBotonValidar"


    // $ANTLR start "ruleBotonValidar"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:435:1: ruleBotonValidar : ( ( rule__BotonValidar__Group__0 ) ) ;
    public final void ruleBotonValidar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:439:2: ( ( ( rule__BotonValidar__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:440:1: ( ( rule__BotonValidar__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:440:1: ( ( rule__BotonValidar__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:441:1: ( rule__BotonValidar__Group__0 )
            {
             before(grammarAccess.getBotonValidarAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:442:1: ( rule__BotonValidar__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:442:2: rule__BotonValidar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__0_in_ruleBotonValidar876);
            rule__BotonValidar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBotonValidarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBotonValidar"


    // $ANTLR start "entryRuleBotonGuardar_Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:454:1: entryRuleBotonGuardar_Impl : ruleBotonGuardar_Impl EOF ;
    public final void entryRuleBotonGuardar_Impl() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:455:1: ( ruleBotonGuardar_Impl EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:456:1: ruleBotonGuardar_Impl EOF
            {
             before(grammarAccess.getBotonGuardar_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl903);
            ruleBotonGuardar_Impl();

            state._fsp--;

             after(grammarAccess.getBotonGuardar_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonGuardar_Impl910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBotonGuardar_Impl"


    // $ANTLR start "ruleBotonGuardar_Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:463:1: ruleBotonGuardar_Impl : ( ( rule__BotonGuardar_Impl__Group__0 ) ) ;
    public final void ruleBotonGuardar_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:467:2: ( ( ( rule__BotonGuardar_Impl__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:468:1: ( ( rule__BotonGuardar_Impl__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:468:1: ( ( rule__BotonGuardar_Impl__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:469:1: ( rule__BotonGuardar_Impl__Group__0 )
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:470:1: ( rule__BotonGuardar_Impl__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:470:2: rule__BotonGuardar_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__0_in_ruleBotonGuardar_Impl936);
            rule__BotonGuardar_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBotonGuardar_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBotonGuardar_Impl"


    // $ANTLR start "entryRuleBotonCancelar"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:482:1: entryRuleBotonCancelar : ruleBotonCancelar EOF ;
    public final void entryRuleBotonCancelar() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:483:1: ( ruleBotonCancelar EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:484:1: ruleBotonCancelar EOF
            {
             before(grammarAccess.getBotonCancelarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar963);
            ruleBotonCancelar();

            state._fsp--;

             after(grammarAccess.getBotonCancelarRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCancelar970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBotonCancelar"


    // $ANTLR start "ruleBotonCancelar"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:491:1: ruleBotonCancelar : ( ( rule__BotonCancelar__Group__0 ) ) ;
    public final void ruleBotonCancelar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:495:2: ( ( ( rule__BotonCancelar__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:496:1: ( ( rule__BotonCancelar__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:496:1: ( ( rule__BotonCancelar__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:497:1: ( rule__BotonCancelar__Group__0 )
            {
             before(grammarAccess.getBotonCancelarAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:498:1: ( rule__BotonCancelar__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:498:2: rule__BotonCancelar__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__0_in_ruleBotonCancelar996);
            rule__BotonCancelar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBotonCancelarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBotonCancelar"


    // $ANTLR start "entryRuleBotonCustom"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:510:1: entryRuleBotonCustom : ruleBotonCustom EOF ;
    public final void entryRuleBotonCustom() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:511:1: ( ruleBotonCustom EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:512:1: ruleBotonCustom EOF
            {
             before(grammarAccess.getBotonCustomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom1023);
            ruleBotonCustom();

            state._fsp--;

             after(grammarAccess.getBotonCustomRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCustom1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBotonCustom"


    // $ANTLR start "ruleBotonCustom"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:519:1: ruleBotonCustom : ( ( rule__BotonCustom__Group__0 ) ) ;
    public final void ruleBotonCustom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:523:2: ( ( ( rule__BotonCustom__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:524:1: ( ( rule__BotonCustom__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:524:1: ( ( rule__BotonCustom__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:525:1: ( rule__BotonCustom__Group__0 )
            {
             before(grammarAccess.getBotonCustomAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:526:1: ( rule__BotonCustom__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:526:2: rule__BotonCustom__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__0_in_ruleBotonCustom1056);
            rule__BotonCustom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBotonCustomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBotonCustom"


    // $ANTLR start "entryRuleReaccionVisible"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:538:1: entryRuleReaccionVisible : ruleReaccionVisible EOF ;
    public final void entryRuleReaccionVisible() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:539:1: ( ruleReaccionVisible EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:540:1: ruleReaccionVisible EOF
            {
             before(grammarAccess.getReaccionVisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible1083);
            ruleReaccionVisible();

            state._fsp--;

             after(grammarAccess.getReaccionVisibleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionVisible1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReaccionVisible"


    // $ANTLR start "ruleReaccionVisible"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:547:1: ruleReaccionVisible : ( ( rule__ReaccionVisible__Group__0 ) ) ;
    public final void ruleReaccionVisible() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:551:2: ( ( ( rule__ReaccionVisible__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:552:1: ( ( rule__ReaccionVisible__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:552:1: ( ( rule__ReaccionVisible__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:553:1: ( rule__ReaccionVisible__Group__0 )
            {
             before(grammarAccess.getReaccionVisibleAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:554:1: ( rule__ReaccionVisible__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:554:2: rule__ReaccionVisible__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__Group__0_in_ruleReaccionVisible1116);
            rule__ReaccionVisible__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReaccionVisibleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReaccionVisible"


    // $ANTLR start "entryRuleReaccionHabilitado"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:566:1: entryRuleReaccionHabilitado : ruleReaccionHabilitado EOF ;
    public final void entryRuleReaccionHabilitado() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:567:1: ( ruleReaccionHabilitado EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:568:1: ruleReaccionHabilitado EOF
            {
             before(grammarAccess.getReaccionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado1143);
            ruleReaccionHabilitado();

            state._fsp--;

             after(grammarAccess.getReaccionHabilitadoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionHabilitado1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReaccionHabilitado"


    // $ANTLR start "ruleReaccionHabilitado"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:575:1: ruleReaccionHabilitado : ( ( rule__ReaccionHabilitado__Group__0 ) ) ;
    public final void ruleReaccionHabilitado() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:579:2: ( ( ( rule__ReaccionHabilitado__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:580:1: ( ( rule__ReaccionHabilitado__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:580:1: ( ( rule__ReaccionHabilitado__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:581:1: ( rule__ReaccionHabilitado__Group__0 )
            {
             before(grammarAccess.getReaccionHabilitadoAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:582:1: ( rule__ReaccionHabilitado__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:582:2: rule__ReaccionHabilitado__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__Group__0_in_ruleReaccionHabilitado1176);
            rule__ReaccionHabilitado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReaccionHabilitadoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReaccionHabilitado"


    // $ANTLR start "entryRuleAccionValor"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:594:1: entryRuleAccionValor : ruleAccionValor EOF ;
    public final void entryRuleAccionValor() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:595:1: ( ruleAccionValor EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:596:1: ruleAccionValor EOF
            {
             before(grammarAccess.getAccionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_entryRuleAccionValor1203);
            ruleAccionValor();

            state._fsp--;

             after(grammarAccess.getAccionValorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionValor1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccionValor"


    // $ANTLR start "ruleAccionValor"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:603:1: ruleAccionValor : ( ( rule__AccionValor__Group__0 ) ) ;
    public final void ruleAccionValor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:607:2: ( ( ( rule__AccionValor__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:608:1: ( ( rule__AccionValor__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:608:1: ( ( rule__AccionValor__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:609:1: ( rule__AccionValor__Group__0 )
            {
             before(grammarAccess.getAccionValorAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:610:1: ( rule__AccionValor__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:610:2: rule__AccionValor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__0_in_ruleAccionValor1236);
            rule__AccionValor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccionValorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccionValor"


    // $ANTLR start "entryRuleAccionSeleccion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:622:1: entryRuleAccionSeleccion : ruleAccionSeleccion EOF ;
    public final void entryRuleAccionSeleccion() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:623:1: ( ruleAccionSeleccion EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:624:1: ruleAccionSeleccion EOF
            {
             before(grammarAccess.getAccionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion1263);
            ruleAccionSeleccion();

            state._fsp--;

             after(grammarAccess.getAccionSeleccionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionSeleccion1270); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccionSeleccion"


    // $ANTLR start "ruleAccionSeleccion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:631:1: ruleAccionSeleccion : ( ( rule__AccionSeleccion__Group__0 ) ) ;
    public final void ruleAccionSeleccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:635:2: ( ( ( rule__AccionSeleccion__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:636:1: ( ( rule__AccionSeleccion__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:636:1: ( ( rule__AccionSeleccion__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:637:1: ( rule__AccionSeleccion__Group__0 )
            {
             before(grammarAccess.getAccionSeleccionAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:638:1: ( rule__AccionSeleccion__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:638:2: rule__AccionSeleccion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__0_in_ruleAccionSeleccion1296);
            rule__AccionSeleccion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccionSeleccionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccionSeleccion"


    // $ANTLR start "entryRuleAccionPulsacion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:650:1: entryRuleAccionPulsacion : ruleAccionPulsacion EOF ;
    public final void entryRuleAccionPulsacion() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:651:1: ( ruleAccionPulsacion EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:652:1: ruleAccionPulsacion EOF
            {
             before(grammarAccess.getAccionPulsacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionPulsacion_in_entryRuleAccionPulsacion1323);
            ruleAccionPulsacion();

            state._fsp--;

             after(grammarAccess.getAccionPulsacionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionPulsacion1330); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccionPulsacion"


    // $ANTLR start "ruleAccionPulsacion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:659:1: ruleAccionPulsacion : ( ( rule__AccionPulsacion__Group__0 ) ) ;
    public final void ruleAccionPulsacion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:663:2: ( ( ( rule__AccionPulsacion__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:664:1: ( ( rule__AccionPulsacion__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:664:1: ( ( rule__AccionPulsacion__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:665:1: ( rule__AccionPulsacion__Group__0 )
            {
             before(grammarAccess.getAccionPulsacionAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:666:1: ( rule__AccionPulsacion__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:666:2: rule__AccionPulsacion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__Group__0_in_ruleAccionPulsacion1356);
            rule__AccionPulsacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccionPulsacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccionPulsacion"


    // $ANTLR start "entryRuleAsercionInvisible"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:678:1: entryRuleAsercionInvisible : ruleAsercionInvisible EOF ;
    public final void entryRuleAsercionInvisible() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:679:1: ( ruleAsercionInvisible EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:680:1: ruleAsercionInvisible EOF
            {
             before(grammarAccess.getAsercionInvisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible1383);
            ruleAsercionInvisible();

            state._fsp--;

             after(grammarAccess.getAsercionInvisibleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionInvisible1390); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsercionInvisible"


    // $ANTLR start "ruleAsercionInvisible"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:687:1: ruleAsercionInvisible : ( ( rule__AsercionInvisible__Group__0 ) ) ;
    public final void ruleAsercionInvisible() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:691:2: ( ( ( rule__AsercionInvisible__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:692:1: ( ( rule__AsercionInvisible__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:692:1: ( ( rule__AsercionInvisible__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:693:1: ( rule__AsercionInvisible__Group__0 )
            {
             before(grammarAccess.getAsercionInvisibleAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:694:1: ( rule__AsercionInvisible__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:694:2: rule__AsercionInvisible__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__Group__0_in_ruleAsercionInvisible1416);
            rule__AsercionInvisible__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionInvisibleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsercionInvisible"


    // $ANTLR start "entryRuleAsercionHabilitado"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:706:1: entryRuleAsercionHabilitado : ruleAsercionHabilitado EOF ;
    public final void entryRuleAsercionHabilitado() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:707:1: ( ruleAsercionHabilitado EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:708:1: ruleAsercionHabilitado EOF
            {
             before(grammarAccess.getAsercionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado1443);
            ruleAsercionHabilitado();

            state._fsp--;

             after(grammarAccess.getAsercionHabilitadoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionHabilitado1450); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsercionHabilitado"


    // $ANTLR start "ruleAsercionHabilitado"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:715:1: ruleAsercionHabilitado : ( ( rule__AsercionHabilitado__Group__0 ) ) ;
    public final void ruleAsercionHabilitado() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:719:2: ( ( ( rule__AsercionHabilitado__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:720:1: ( ( rule__AsercionHabilitado__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:720:1: ( ( rule__AsercionHabilitado__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:721:1: ( rule__AsercionHabilitado__Group__0 )
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:722:1: ( rule__AsercionHabilitado__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:722:2: rule__AsercionHabilitado__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__Group__0_in_ruleAsercionHabilitado1476);
            rule__AsercionHabilitado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionHabilitadoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsercionHabilitado"


    // $ANTLR start "entryRuleAsercionValor"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:734:1: entryRuleAsercionValor : ruleAsercionValor EOF ;
    public final void entryRuleAsercionValor() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:735:1: ( ruleAsercionValor EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:736:1: ruleAsercionValor EOF
            {
             before(grammarAccess.getAsercionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor1503);
            ruleAsercionValor();

            state._fsp--;

             after(grammarAccess.getAsercionValorRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionValor1510); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsercionValor"


    // $ANTLR start "ruleAsercionValor"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:743:1: ruleAsercionValor : ( ( rule__AsercionValor__Group__0 ) ) ;
    public final void ruleAsercionValor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:747:2: ( ( ( rule__AsercionValor__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:748:1: ( ( rule__AsercionValor__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:748:1: ( ( rule__AsercionValor__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:749:1: ( rule__AsercionValor__Group__0 )
            {
             before(grammarAccess.getAsercionValorAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:750:1: ( rule__AsercionValor__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:750:2: rule__AsercionValor__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__Group__0_in_ruleAsercionValor1536);
            rule__AsercionValor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionValorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsercionValor"


    // $ANTLR start "entryRuleAsercionSeleccion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:762:1: entryRuleAsercionSeleccion : ruleAsercionSeleccion EOF ;
    public final void entryRuleAsercionSeleccion() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:763:1: ( ruleAsercionSeleccion EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:764:1: ruleAsercionSeleccion EOF
            {
             before(grammarAccess.getAsercionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion1563);
            ruleAsercionSeleccion();

            state._fsp--;

             after(grammarAccess.getAsercionSeleccionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionSeleccion1570); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsercionSeleccion"


    // $ANTLR start "ruleAsercionSeleccion"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:771:1: ruleAsercionSeleccion : ( ( rule__AsercionSeleccion__Group__0 ) ) ;
    public final void ruleAsercionSeleccion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:775:2: ( ( ( rule__AsercionSeleccion__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:776:1: ( ( rule__AsercionSeleccion__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:776:1: ( ( rule__AsercionSeleccion__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:777:1: ( rule__AsercionSeleccion__Group__0 )
            {
             before(grammarAccess.getAsercionSeleccionAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:778:1: ( rule__AsercionSeleccion__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:778:2: rule__AsercionSeleccion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__Group__0_in_ruleAsercionSeleccion1596);
            rule__AsercionSeleccion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionSeleccionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsercionSeleccion"


    // $ANTLR start "rule__Input__Alternatives"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:790:1: rule__Input__Alternatives : ( ( ruleInputTexto ) | ( ruleInputRadio ) | ( ruleInputCombo ) | ( ruleInputCheck ) | ( ruleBotonValidar ) | ( ruleBotonGuardar_Impl ) | ( ruleBotonCancelar ) | ( ruleBotonCustom ) );
    public final void rule__Input__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:794:1: ( ( ruleInputTexto ) | ( ruleInputRadio ) | ( ruleInputCombo ) | ( ruleInputCheck ) | ( ruleBotonValidar ) | ( ruleBotonGuardar_Impl ) | ( ruleBotonCancelar ) | ( ruleBotonCustom ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            case 31:
                {
                alt1=6;
                }
                break;
            case 32:
                {
                alt1=7;
                }
                break;
            case 33:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:795:1: ( ruleInputTexto )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:795:1: ( ruleInputTexto )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:796:1: ruleInputTexto
                    {
                     before(grammarAccess.getInputAccess().getInputTextoParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_rule__Input__Alternatives1632);
                    ruleInputTexto();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputTextoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:801:6: ( ruleInputRadio )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:801:6: ( ruleInputRadio )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:802:1: ruleInputRadio
                    {
                     before(grammarAccess.getInputAccess().getInputRadioParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_rule__Input__Alternatives1649);
                    ruleInputRadio();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputRadioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:807:6: ( ruleInputCombo )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:807:6: ( ruleInputCombo )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:808:1: ruleInputCombo
                    {
                     before(grammarAccess.getInputAccess().getInputComboParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_rule__Input__Alternatives1666);
                    ruleInputCombo();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputComboParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:813:6: ( ruleInputCheck )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:813:6: ( ruleInputCheck )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:814:1: ruleInputCheck
                    {
                     before(grammarAccess.getInputAccess().getInputCheckParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_rule__Input__Alternatives1683);
                    ruleInputCheck();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputCheckParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:819:6: ( ruleBotonValidar )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:819:6: ( ruleBotonValidar )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:820:1: ruleBotonValidar
                    {
                     before(grammarAccess.getInputAccess().getBotonValidarParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_rule__Input__Alternatives1700);
                    ruleBotonValidar();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getBotonValidarParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:825:6: ( ruleBotonGuardar_Impl )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:825:6: ( ruleBotonGuardar_Impl )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:826:1: ruleBotonGuardar_Impl
                    {
                     before(grammarAccess.getInputAccess().getBotonGuardar_ImplParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_rule__Input__Alternatives1717);
                    ruleBotonGuardar_Impl();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getBotonGuardar_ImplParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:831:6: ( ruleBotonCancelar )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:831:6: ( ruleBotonCancelar )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:832:1: ruleBotonCancelar
                    {
                     before(grammarAccess.getInputAccess().getBotonCancelarParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_rule__Input__Alternatives1734);
                    ruleBotonCancelar();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getBotonCancelarParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:837:6: ( ruleBotonCustom )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:837:6: ( ruleBotonCustom )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:838:1: ruleBotonCustom
                    {
                     before(grammarAccess.getInputAccess().getBotonCustomParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_rule__Input__Alternatives1751);
                    ruleBotonCustom();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getBotonCustomParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Alternatives"


    // $ANTLR start "rule__Accion__Alternatives"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:848:1: rule__Accion__Alternatives : ( ( ruleAccionValor ) | ( ruleAccionSeleccion ) | ( ruleAccionPulsacion ) );
    public final void rule__Accion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:852:1: ( ( ruleAccionValor ) | ( ruleAccionSeleccion ) | ( ruleAccionPulsacion ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt2=1;
                }
                break;
            case 38:
                {
                alt2=2;
                }
                break;
            case 39:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:853:1: ( ruleAccionValor )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:853:1: ( ruleAccionValor )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:854:1: ruleAccionValor
                    {
                     before(grammarAccess.getAccionAccess().getAccionValorParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_rule__Accion__Alternatives1783);
                    ruleAccionValor();

                    state._fsp--;

                     after(grammarAccess.getAccionAccess().getAccionValorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:859:6: ( ruleAccionSeleccion )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:859:6: ( ruleAccionSeleccion )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:860:1: ruleAccionSeleccion
                    {
                     before(grammarAccess.getAccionAccess().getAccionSeleccionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_rule__Accion__Alternatives1800);
                    ruleAccionSeleccion();

                    state._fsp--;

                     after(grammarAccess.getAccionAccess().getAccionSeleccionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:865:6: ( ruleAccionPulsacion )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:865:6: ( ruleAccionPulsacion )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:866:1: ruleAccionPulsacion
                    {
                     before(grammarAccess.getAccionAccess().getAccionPulsacionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAccionPulsacion_in_rule__Accion__Alternatives1817);
                    ruleAccionPulsacion();

                    state._fsp--;

                     after(grammarAccess.getAccionAccess().getAccionPulsacionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Accion__Alternatives"


    // $ANTLR start "rule__Reaccion__Alternatives"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:876:1: rule__Reaccion__Alternatives : ( ( ruleReaccionVisible ) | ( ruleReaccionHabilitado ) );
    public final void rule__Reaccion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:880:1: ( ( ruleReaccionVisible ) | ( ruleReaccionHabilitado ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==36) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:881:1: ( ruleReaccionVisible )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:881:1: ( ruleReaccionVisible )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:882:1: ruleReaccionVisible
                    {
                     before(grammarAccess.getReaccionAccess().getReaccionVisibleParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_rule__Reaccion__Alternatives1849);
                    ruleReaccionVisible();

                    state._fsp--;

                     after(grammarAccess.getReaccionAccess().getReaccionVisibleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:887:6: ( ruleReaccionHabilitado )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:887:6: ( ruleReaccionHabilitado )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:888:1: ruleReaccionHabilitado
                    {
                     before(grammarAccess.getReaccionAccess().getReaccionHabilitadoParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_rule__Reaccion__Alternatives1866);
                    ruleReaccionHabilitado();

                    state._fsp--;

                     after(grammarAccess.getReaccionAccess().getReaccionHabilitadoParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaccion__Alternatives"


    // $ANTLR start "rule__Asercion__Alternatives"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:898:1: rule__Asercion__Alternatives : ( ( ruleAsercionInvisible ) | ( ruleAsercionHabilitado ) | ( ruleAsercionValor ) | ( ruleAsercionSeleccion ) );
    public final void rule__Asercion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:902:1: ( ( ruleAsercionInvisible ) | ( ruleAsercionHabilitado ) | ( ruleAsercionValor ) | ( ruleAsercionSeleccion ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            case 43:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:903:1: ( ruleAsercionInvisible )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:903:1: ( ruleAsercionInvisible )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:904:1: ruleAsercionInvisible
                    {
                     before(grammarAccess.getAsercionAccess().getAsercionInvisibleParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_rule__Asercion__Alternatives1898);
                    ruleAsercionInvisible();

                    state._fsp--;

                     after(grammarAccess.getAsercionAccess().getAsercionInvisibleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:909:6: ( ruleAsercionHabilitado )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:909:6: ( ruleAsercionHabilitado )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:910:1: ruleAsercionHabilitado
                    {
                     before(grammarAccess.getAsercionAccess().getAsercionHabilitadoParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_rule__Asercion__Alternatives1915);
                    ruleAsercionHabilitado();

                    state._fsp--;

                     after(grammarAccess.getAsercionAccess().getAsercionHabilitadoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:915:6: ( ruleAsercionValor )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:915:6: ( ruleAsercionValor )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:916:1: ruleAsercionValor
                    {
                     before(grammarAccess.getAsercionAccess().getAsercionValorParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_rule__Asercion__Alternatives1932);
                    ruleAsercionValor();

                    state._fsp--;

                     after(grammarAccess.getAsercionAccess().getAsercionValorParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:921:6: ( ruleAsercionSeleccion )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:921:6: ( ruleAsercionSeleccion )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:922:1: ruleAsercionSeleccion
                    {
                     before(grammarAccess.getAsercionAccess().getAsercionSeleccionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_rule__Asercion__Alternatives1949);
                    ruleAsercionSeleccion();

                    state._fsp--;

                     after(grammarAccess.getAsercionAccess().getAsercionSeleccionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:932:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:936:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:937:1: ( RULE_STRING )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:937:1: ( RULE_STRING )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:938:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1981); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:943:6: ( RULE_ID )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:943:6: ( RULE_ID )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:944:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1998); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Formulario__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:957:1: rule__Formulario__Group__0 : rule__Formulario__Group__0__Impl rule__Formulario__Group__1 ;
    public final void rule__Formulario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:961:1: ( rule__Formulario__Group__0__Impl rule__Formulario__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:962:2: rule__Formulario__Group__0__Impl rule__Formulario__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__0__Impl_in_rule__Formulario__Group__02029);
            rule__Formulario__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__1_in_rule__Formulario__Group__02032);
            rule__Formulario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__0"


    // $ANTLR start "rule__Formulario__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:969:1: rule__Formulario__Group__0__Impl : ( 'Formulario' ) ;
    public final void rule__Formulario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:973:1: ( ( 'Formulario' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:974:1: ( 'Formulario' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:974:1: ( 'Formulario' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:975:1: 'Formulario'
            {
             before(grammarAccess.getFormularioAccess().getFormularioKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Formulario__Group__0__Impl2060); 
             after(grammarAccess.getFormularioAccess().getFormularioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__0__Impl"


    // $ANTLR start "rule__Formulario__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:988:1: rule__Formulario__Group__1 : rule__Formulario__Group__1__Impl rule__Formulario__Group__2 ;
    public final void rule__Formulario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:992:1: ( rule__Formulario__Group__1__Impl rule__Formulario__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:993:2: rule__Formulario__Group__1__Impl rule__Formulario__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__1__Impl_in_rule__Formulario__Group__12091);
            rule__Formulario__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__2_in_rule__Formulario__Group__12094);
            rule__Formulario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__1"


    // $ANTLR start "rule__Formulario__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1000:1: rule__Formulario__Group__1__Impl : ( ( rule__Formulario__NameAssignment_1 ) ) ;
    public final void rule__Formulario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1004:1: ( ( ( rule__Formulario__NameAssignment_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1005:1: ( ( rule__Formulario__NameAssignment_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1005:1: ( ( rule__Formulario__NameAssignment_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1006:1: ( rule__Formulario__NameAssignment_1 )
            {
             before(grammarAccess.getFormularioAccess().getNameAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1007:1: ( rule__Formulario__NameAssignment_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1007:2: rule__Formulario__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__NameAssignment_1_in_rule__Formulario__Group__1__Impl2121);
            rule__Formulario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormularioAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__1__Impl"


    // $ANTLR start "rule__Formulario__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1017:1: rule__Formulario__Group__2 : rule__Formulario__Group__2__Impl rule__Formulario__Group__3 ;
    public final void rule__Formulario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1021:1: ( rule__Formulario__Group__2__Impl rule__Formulario__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1022:2: rule__Formulario__Group__2__Impl rule__Formulario__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__2__Impl_in_rule__Formulario__Group__22151);
            rule__Formulario__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__3_in_rule__Formulario__Group__22154);
            rule__Formulario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__2"


    // $ANTLR start "rule__Formulario__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1029:1: rule__Formulario__Group__2__Impl : ( '{' ) ;
    public final void rule__Formulario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1033:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1034:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1034:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1035:1: '{'
            {
             before(grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Formulario__Group__2__Impl2182); 
             after(grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__2__Impl"


    // $ANTLR start "rule__Formulario__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1048:1: rule__Formulario__Group__3 : rule__Formulario__Group__3__Impl rule__Formulario__Group__4 ;
    public final void rule__Formulario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1052:1: ( rule__Formulario__Group__3__Impl rule__Formulario__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1053:2: rule__Formulario__Group__3__Impl rule__Formulario__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__3__Impl_in_rule__Formulario__Group__32213);
            rule__Formulario__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__4_in_rule__Formulario__Group__32216);
            rule__Formulario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__3"


    // $ANTLR start "rule__Formulario__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1060:1: rule__Formulario__Group__3__Impl : ( ( rule__Formulario__ComprobacionCamposAssignment_3 )? ) ;
    public final void rule__Formulario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1064:1: ( ( ( rule__Formulario__ComprobacionCamposAssignment_3 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1065:1: ( ( rule__Formulario__ComprobacionCamposAssignment_3 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1065:1: ( ( rule__Formulario__ComprobacionCamposAssignment_3 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1066:1: ( rule__Formulario__ComprobacionCamposAssignment_3 )?
            {
             before(grammarAccess.getFormularioAccess().getComprobacionCamposAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1067:1: ( rule__Formulario__ComprobacionCamposAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==44) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1067:2: rule__Formulario__ComprobacionCamposAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__ComprobacionCamposAssignment_3_in_rule__Formulario__Group__3__Impl2243);
                    rule__Formulario__ComprobacionCamposAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormularioAccess().getComprobacionCamposAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__3__Impl"


    // $ANTLR start "rule__Formulario__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1077:1: rule__Formulario__Group__4 : rule__Formulario__Group__4__Impl rule__Formulario__Group__5 ;
    public final void rule__Formulario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1081:1: ( rule__Formulario__Group__4__Impl rule__Formulario__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1082:2: rule__Formulario__Group__4__Impl rule__Formulario__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__4__Impl_in_rule__Formulario__Group__42274);
            rule__Formulario__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__5_in_rule__Formulario__Group__42277);
            rule__Formulario__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__4"


    // $ANTLR start "rule__Formulario__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1089:1: rule__Formulario__Group__4__Impl : ( ( rule__Formulario__ComprobacionAccionAssignment_4 )? ) ;
    public final void rule__Formulario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1093:1: ( ( ( rule__Formulario__ComprobacionAccionAssignment_4 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1094:1: ( ( rule__Formulario__ComprobacionAccionAssignment_4 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1094:1: ( ( rule__Formulario__ComprobacionAccionAssignment_4 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1095:1: ( rule__Formulario__ComprobacionAccionAssignment_4 )?
            {
             before(grammarAccess.getFormularioAccess().getComprobacionAccionAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1096:1: ( rule__Formulario__ComprobacionAccionAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==45) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1096:2: rule__Formulario__ComprobacionAccionAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__ComprobacionAccionAssignment_4_in_rule__Formulario__Group__4__Impl2304);
                    rule__Formulario__ComprobacionAccionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormularioAccess().getComprobacionAccionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__4__Impl"


    // $ANTLR start "rule__Formulario__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1106:1: rule__Formulario__Group__5 : rule__Formulario__Group__5__Impl rule__Formulario__Group__6 ;
    public final void rule__Formulario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1110:1: ( rule__Formulario__Group__5__Impl rule__Formulario__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1111:2: rule__Formulario__Group__5__Impl rule__Formulario__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__5__Impl_in_rule__Formulario__Group__52335);
            rule__Formulario__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__6_in_rule__Formulario__Group__52338);
            rule__Formulario__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__5"


    // $ANTLR start "rule__Formulario__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1118:1: rule__Formulario__Group__5__Impl : ( ( rule__Formulario__LayoutAssignment_5 ) ) ;
    public final void rule__Formulario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1122:1: ( ( ( rule__Formulario__LayoutAssignment_5 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1123:1: ( ( rule__Formulario__LayoutAssignment_5 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1123:1: ( ( rule__Formulario__LayoutAssignment_5 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1124:1: ( rule__Formulario__LayoutAssignment_5 )
            {
             before(grammarAccess.getFormularioAccess().getLayoutAssignment_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1125:1: ( rule__Formulario__LayoutAssignment_5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1125:2: rule__Formulario__LayoutAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__LayoutAssignment_5_in_rule__Formulario__Group__5__Impl2365);
            rule__Formulario__LayoutAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFormularioAccess().getLayoutAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__5__Impl"


    // $ANTLR start "rule__Formulario__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1135:1: rule__Formulario__Group__6 : rule__Formulario__Group__6__Impl rule__Formulario__Group__7 ;
    public final void rule__Formulario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1139:1: ( rule__Formulario__Group__6__Impl rule__Formulario__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1140:2: rule__Formulario__Group__6__Impl rule__Formulario__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__6__Impl_in_rule__Formulario__Group__62395);
            rule__Formulario__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__7_in_rule__Formulario__Group__62398);
            rule__Formulario__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__6"


    // $ANTLR start "rule__Formulario__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1147:1: rule__Formulario__Group__6__Impl : ( ( rule__Formulario__PruebasAssignment_6 )? ) ;
    public final void rule__Formulario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1151:1: ( ( ( rule__Formulario__PruebasAssignment_6 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1152:1: ( ( rule__Formulario__PruebasAssignment_6 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1152:1: ( ( rule__Formulario__PruebasAssignment_6 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1153:1: ( rule__Formulario__PruebasAssignment_6 )?
            {
             before(grammarAccess.getFormularioAccess().getPruebasAssignment_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1154:1: ( rule__Formulario__PruebasAssignment_6 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1154:2: rule__Formulario__PruebasAssignment_6
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__PruebasAssignment_6_in_rule__Formulario__Group__6__Impl2425);
                    rule__Formulario__PruebasAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormularioAccess().getPruebasAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__6__Impl"


    // $ANTLR start "rule__Formulario__Group__7"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1164:1: rule__Formulario__Group__7 : rule__Formulario__Group__7__Impl ;
    public final void rule__Formulario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1168:1: ( rule__Formulario__Group__7__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1169:2: rule__Formulario__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__7__Impl_in_rule__Formulario__Group__72456);
            rule__Formulario__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__7"


    // $ANTLR start "rule__Formulario__Group__7__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1175:1: rule__Formulario__Group__7__Impl : ( '}' ) ;
    public final void rule__Formulario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1179:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1180:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1180:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1181:1: '}'
            {
             before(grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Formulario__Group__7__Impl2484); 
             after(grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__7__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1210:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1214:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1215:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__02531);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__02534);
            rule__Layout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0"


    // $ANTLR start "rule__Layout__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1222:1: rule__Layout__Group__0__Impl : ( 'Layout' ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1226:1: ( ( 'Layout' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1227:1: ( 'Layout' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1227:1: ( 'Layout' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1228:1: 'Layout'
            {
             before(grammarAccess.getLayoutAccess().getLayoutKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Layout__Group__0__Impl2562); 
             after(grammarAccess.getLayoutAccess().getLayoutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1241:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1245:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1246:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__12593);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__12596);
            rule__Layout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1"


    // $ANTLR start "rule__Layout__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1253:1: rule__Layout__Group__1__Impl : ( '{' ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1257:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1258:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1258:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1259:1: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Layout__Group__1__Impl2624); 
             after(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__1__Impl"


    // $ANTLR start "rule__Layout__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1272:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1276:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1277:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__22655);
            rule__Layout__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__22658);
            rule__Layout__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2"


    // $ANTLR start "rule__Layout__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1284:1: rule__Layout__Group__2__Impl : ( 'columnas' ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1288:1: ( ( 'columnas' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1289:1: ( 'columnas' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1289:1: ( 'columnas' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1290:1: 'columnas'
            {
             before(grammarAccess.getLayoutAccess().getColumnasKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Layout__Group__2__Impl2686); 
             after(grammarAccess.getLayoutAccess().getColumnasKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__2__Impl"


    // $ANTLR start "rule__Layout__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1303:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl rule__Layout__Group__4 ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1307:1: ( rule__Layout__Group__3__Impl rule__Layout__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1308:2: rule__Layout__Group__3__Impl rule__Layout__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__32717);
            rule__Layout__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__32720);
            rule__Layout__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__3"


    // $ANTLR start "rule__Layout__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1315:1: rule__Layout__Group__3__Impl : ( ( rule__Layout__ColumnasAssignment_3 ) ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1319:1: ( ( ( rule__Layout__ColumnasAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1320:1: ( ( rule__Layout__ColumnasAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1320:1: ( ( rule__Layout__ColumnasAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1321:1: ( rule__Layout__ColumnasAssignment_3 )
            {
             before(grammarAccess.getLayoutAccess().getColumnasAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1322:1: ( rule__Layout__ColumnasAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1322:2: rule__Layout__ColumnasAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__ColumnasAssignment_3_in_rule__Layout__Group__3__Impl2747);
            rule__Layout__ColumnasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getColumnasAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__3__Impl"


    // $ANTLR start "rule__Layout__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1332:1: rule__Layout__Group__4 : rule__Layout__Group__4__Impl rule__Layout__Group__5 ;
    public final void rule__Layout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1336:1: ( rule__Layout__Group__4__Impl rule__Layout__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1337:2: rule__Layout__Group__4__Impl rule__Layout__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__42777);
            rule__Layout__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__5_in_rule__Layout__Group__42780);
            rule__Layout__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__4"


    // $ANTLR start "rule__Layout__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1344:1: rule__Layout__Group__4__Impl : ( ( rule__Layout__Group_4__0 )? ) ;
    public final void rule__Layout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1348:1: ( ( ( rule__Layout__Group_4__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1349:1: ( ( rule__Layout__Group_4__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1349:1: ( ( rule__Layout__Group_4__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1350:1: ( rule__Layout__Group_4__0 )?
            {
             before(grammarAccess.getLayoutAccess().getGroup_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1351:1: ( rule__Layout__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1351:2: rule__Layout__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__0_in_rule__Layout__Group__4__Impl2807);
                    rule__Layout__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayoutAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__4__Impl"


    // $ANTLR start "rule__Layout__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1361:1: rule__Layout__Group__5 : rule__Layout__Group__5__Impl ;
    public final void rule__Layout__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1365:1: ( rule__Layout__Group__5__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1366:2: rule__Layout__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__5__Impl_in_rule__Layout__Group__52838);
            rule__Layout__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__5"


    // $ANTLR start "rule__Layout__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1372:1: rule__Layout__Group__5__Impl : ( '}' ) ;
    public final void rule__Layout__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1376:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1377:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1377:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1378:1: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Layout__Group__5__Impl2866); 
             after(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__5__Impl"


    // $ANTLR start "rule__Layout__Group_4__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1403:1: rule__Layout__Group_4__0 : rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1 ;
    public final void rule__Layout__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1407:1: ( rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1408:2: rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__0__Impl_in_rule__Layout__Group_4__02909);
            rule__Layout__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__1_in_rule__Layout__Group_4__02912);
            rule__Layout__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__0"


    // $ANTLR start "rule__Layout__Group_4__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1415:1: rule__Layout__Group_4__0__Impl : ( 'entradas' ) ;
    public final void rule__Layout__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1419:1: ( ( 'entradas' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1420:1: ( 'entradas' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1420:1: ( 'entradas' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1421:1: 'entradas'
            {
             before(grammarAccess.getLayoutAccess().getEntradasKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Layout__Group_4__0__Impl2940); 
             after(grammarAccess.getLayoutAccess().getEntradasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__0__Impl"


    // $ANTLR start "rule__Layout__Group_4__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1434:1: rule__Layout__Group_4__1 : rule__Layout__Group_4__1__Impl rule__Layout__Group_4__2 ;
    public final void rule__Layout__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1438:1: ( rule__Layout__Group_4__1__Impl rule__Layout__Group_4__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1439:2: rule__Layout__Group_4__1__Impl rule__Layout__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__1__Impl_in_rule__Layout__Group_4__12971);
            rule__Layout__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__2_in_rule__Layout__Group_4__12974);
            rule__Layout__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__1"


    // $ANTLR start "rule__Layout__Group_4__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1446:1: rule__Layout__Group_4__1__Impl : ( '[' ) ;
    public final void rule__Layout__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1450:1: ( ( '[' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1451:1: ( '[' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1451:1: ( '[' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1452:1: '['
            {
             before(grammarAccess.getLayoutAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Layout__Group_4__1__Impl3002); 
             after(grammarAccess.getLayoutAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__1__Impl"


    // $ANTLR start "rule__Layout__Group_4__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1465:1: rule__Layout__Group_4__2 : rule__Layout__Group_4__2__Impl rule__Layout__Group_4__3 ;
    public final void rule__Layout__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1469:1: ( rule__Layout__Group_4__2__Impl rule__Layout__Group_4__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1470:2: rule__Layout__Group_4__2__Impl rule__Layout__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__2__Impl_in_rule__Layout__Group_4__23033);
            rule__Layout__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__3_in_rule__Layout__Group_4__23036);
            rule__Layout__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__2"


    // $ANTLR start "rule__Layout__Group_4__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1477:1: rule__Layout__Group_4__2__Impl : ( ( rule__Layout__EntradasAssignment_4_2 ) ) ;
    public final void rule__Layout__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1481:1: ( ( ( rule__Layout__EntradasAssignment_4_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1482:1: ( ( rule__Layout__EntradasAssignment_4_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1482:1: ( ( rule__Layout__EntradasAssignment_4_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1483:1: ( rule__Layout__EntradasAssignment_4_2 )
            {
             before(grammarAccess.getLayoutAccess().getEntradasAssignment_4_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1484:1: ( rule__Layout__EntradasAssignment_4_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1484:2: rule__Layout__EntradasAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__EntradasAssignment_4_2_in_rule__Layout__Group_4__2__Impl3063);
            rule__Layout__EntradasAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getEntradasAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__2__Impl"


    // $ANTLR start "rule__Layout__Group_4__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1494:1: rule__Layout__Group_4__3 : rule__Layout__Group_4__3__Impl rule__Layout__Group_4__4 ;
    public final void rule__Layout__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1498:1: ( rule__Layout__Group_4__3__Impl rule__Layout__Group_4__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1499:2: rule__Layout__Group_4__3__Impl rule__Layout__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__3__Impl_in_rule__Layout__Group_4__33093);
            rule__Layout__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__4_in_rule__Layout__Group_4__33096);
            rule__Layout__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__3"


    // $ANTLR start "rule__Layout__Group_4__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1506:1: rule__Layout__Group_4__3__Impl : ( ( rule__Layout__Group_4_3__0 )* ) ;
    public final void rule__Layout__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1510:1: ( ( ( rule__Layout__Group_4_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1511:1: ( ( rule__Layout__Group_4_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1511:1: ( ( rule__Layout__Group_4_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1512:1: ( rule__Layout__Group_4_3__0 )*
            {
             before(grammarAccess.getLayoutAccess().getGroup_4_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1513:1: ( rule__Layout__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1513:2: rule__Layout__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4_3__0_in_rule__Layout__Group_4__3__Impl3123);
            	    rule__Layout__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLayoutAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__3__Impl"


    // $ANTLR start "rule__Layout__Group_4__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1523:1: rule__Layout__Group_4__4 : rule__Layout__Group_4__4__Impl ;
    public final void rule__Layout__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1527:1: ( rule__Layout__Group_4__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1528:2: rule__Layout__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__4__Impl_in_rule__Layout__Group_4__43154);
            rule__Layout__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__4"


    // $ANTLR start "rule__Layout__Group_4__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1534:1: rule__Layout__Group_4__4__Impl : ( ']' ) ;
    public final void rule__Layout__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1538:1: ( ( ']' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1539:1: ( ']' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1539:1: ( ']' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1540:1: ']'
            {
             before(grammarAccess.getLayoutAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Layout__Group_4__4__Impl3182); 
             after(grammarAccess.getLayoutAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4__4__Impl"


    // $ANTLR start "rule__Layout__Group_4_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1563:1: rule__Layout__Group_4_3__0 : rule__Layout__Group_4_3__0__Impl rule__Layout__Group_4_3__1 ;
    public final void rule__Layout__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1567:1: ( rule__Layout__Group_4_3__0__Impl rule__Layout__Group_4_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1568:2: rule__Layout__Group_4_3__0__Impl rule__Layout__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4_3__0__Impl_in_rule__Layout__Group_4_3__03223);
            rule__Layout__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4_3__1_in_rule__Layout__Group_4_3__03226);
            rule__Layout__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4_3__0"


    // $ANTLR start "rule__Layout__Group_4_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1575:1: rule__Layout__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Layout__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1579:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1580:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1580:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1581:1: ','
            {
             before(grammarAccess.getLayoutAccess().getCommaKeyword_4_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Layout__Group_4_3__0__Impl3254); 
             after(grammarAccess.getLayoutAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4_3__0__Impl"


    // $ANTLR start "rule__Layout__Group_4_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1594:1: rule__Layout__Group_4_3__1 : rule__Layout__Group_4_3__1__Impl ;
    public final void rule__Layout__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1598:1: ( rule__Layout__Group_4_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1599:2: rule__Layout__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4_3__1__Impl_in_rule__Layout__Group_4_3__13285);
            rule__Layout__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4_3__1"


    // $ANTLR start "rule__Layout__Group_4_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1605:1: rule__Layout__Group_4_3__1__Impl : ( ( rule__Layout__EntradasAssignment_4_3_1 ) ) ;
    public final void rule__Layout__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1609:1: ( ( ( rule__Layout__EntradasAssignment_4_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1610:1: ( ( rule__Layout__EntradasAssignment_4_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1610:1: ( ( rule__Layout__EntradasAssignment_4_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1611:1: ( rule__Layout__EntradasAssignment_4_3_1 )
            {
             before(grammarAccess.getLayoutAccess().getEntradasAssignment_4_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1612:1: ( rule__Layout__EntradasAssignment_4_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1612:2: rule__Layout__EntradasAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__EntradasAssignment_4_3_1_in_rule__Layout__Group_4_3__1__Impl3312);
            rule__Layout__EntradasAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getEntradasAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group_4_3__1__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1626:1: rule__PruebaInterfaz__Group__0 : rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1 ;
    public final void rule__PruebaInterfaz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1630:1: ( rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1631:2: rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__0__Impl_in_rule__PruebaInterfaz__Group__03346);
            rule__PruebaInterfaz__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__1_in_rule__PruebaInterfaz__Group__03349);
            rule__PruebaInterfaz__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__0"


    // $ANTLR start "rule__PruebaInterfaz__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1638:1: rule__PruebaInterfaz__Group__0__Impl : ( () ) ;
    public final void rule__PruebaInterfaz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1642:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1643:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1643:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1644:1: ()
            {
             before(grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1645:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1647:1: 
            {
            }

             after(grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__0__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1657:1: rule__PruebaInterfaz__Group__1 : rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2 ;
    public final void rule__PruebaInterfaz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1661:1: ( rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1662:2: rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__1__Impl_in_rule__PruebaInterfaz__Group__13407);
            rule__PruebaInterfaz__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__2_in_rule__PruebaInterfaz__Group__13410);
            rule__PruebaInterfaz__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__1"


    // $ANTLR start "rule__PruebaInterfaz__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1669:1: rule__PruebaInterfaz__Group__1__Impl : ( 'PruebaInterfaz' ) ;
    public final void rule__PruebaInterfaz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1673:1: ( ( 'PruebaInterfaz' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1674:1: ( 'PruebaInterfaz' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1674:1: ( 'PruebaInterfaz' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1675:1: 'PruebaInterfaz'
            {
             before(grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__PruebaInterfaz__Group__1__Impl3438); 
             after(grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__1__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1688:1: rule__PruebaInterfaz__Group__2 : rule__PruebaInterfaz__Group__2__Impl rule__PruebaInterfaz__Group__3 ;
    public final void rule__PruebaInterfaz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1692:1: ( rule__PruebaInterfaz__Group__2__Impl rule__PruebaInterfaz__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1693:2: rule__PruebaInterfaz__Group__2__Impl rule__PruebaInterfaz__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__2__Impl_in_rule__PruebaInterfaz__Group__23469);
            rule__PruebaInterfaz__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__3_in_rule__PruebaInterfaz__Group__23472);
            rule__PruebaInterfaz__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__2"


    // $ANTLR start "rule__PruebaInterfaz__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1700:1: rule__PruebaInterfaz__Group__2__Impl : ( '{' ) ;
    public final void rule__PruebaInterfaz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1704:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1705:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1705:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1706:1: '{'
            {
             before(grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__PruebaInterfaz__Group__2__Impl3500); 
             after(grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__2__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1719:1: rule__PruebaInterfaz__Group__3 : rule__PruebaInterfaz__Group__3__Impl rule__PruebaInterfaz__Group__4 ;
    public final void rule__PruebaInterfaz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1723:1: ( rule__PruebaInterfaz__Group__3__Impl rule__PruebaInterfaz__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1724:2: rule__PruebaInterfaz__Group__3__Impl rule__PruebaInterfaz__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__3__Impl_in_rule__PruebaInterfaz__Group__33531);
            rule__PruebaInterfaz__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__4_in_rule__PruebaInterfaz__Group__33534);
            rule__PruebaInterfaz__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__3"


    // $ANTLR start "rule__PruebaInterfaz__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1731:1: rule__PruebaInterfaz__Group__3__Impl : ( ( rule__PruebaInterfaz__Group_3__0 )? ) ;
    public final void rule__PruebaInterfaz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1735:1: ( ( ( rule__PruebaInterfaz__Group_3__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1736:1: ( ( rule__PruebaInterfaz__Group_3__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1736:1: ( ( rule__PruebaInterfaz__Group_3__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1737:1: ( rule__PruebaInterfaz__Group_3__0 )?
            {
             before(grammarAccess.getPruebaInterfazAccess().getGroup_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1738:1: ( rule__PruebaInterfaz__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=37 && LA11_0<=39)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1738:2: rule__PruebaInterfaz__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_3__0_in_rule__PruebaInterfaz__Group__3__Impl3561);
                    rule__PruebaInterfaz__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPruebaInterfazAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__3__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1748:1: rule__PruebaInterfaz__Group__4 : rule__PruebaInterfaz__Group__4__Impl ;
    public final void rule__PruebaInterfaz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1752:1: ( rule__PruebaInterfaz__Group__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1753:2: rule__PruebaInterfaz__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__4__Impl_in_rule__PruebaInterfaz__Group__43592);
            rule__PruebaInterfaz__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__4"


    // $ANTLR start "rule__PruebaInterfaz__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1759:1: rule__PruebaInterfaz__Group__4__Impl : ( '}' ) ;
    public final void rule__PruebaInterfaz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1763:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1764:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1764:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1765:1: '}'
            {
             before(grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__PruebaInterfaz__Group__4__Impl3620); 
             after(grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group__4__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1788:1: rule__PruebaInterfaz__Group_3__0 : rule__PruebaInterfaz__Group_3__0__Impl rule__PruebaInterfaz__Group_3__1 ;
    public final void rule__PruebaInterfaz__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1792:1: ( rule__PruebaInterfaz__Group_3__0__Impl rule__PruebaInterfaz__Group_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1793:2: rule__PruebaInterfaz__Group_3__0__Impl rule__PruebaInterfaz__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_3__0__Impl_in_rule__PruebaInterfaz__Group_3__03661);
            rule__PruebaInterfaz__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_3__1_in_rule__PruebaInterfaz__Group_3__03664);
            rule__PruebaInterfaz__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group_3__0"


    // $ANTLR start "rule__PruebaInterfaz__Group_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1800:1: rule__PruebaInterfaz__Group_3__0__Impl : ( ( rule__PruebaInterfaz__AccionesAssignment_3_0 ) ) ;
    public final void rule__PruebaInterfaz__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1804:1: ( ( ( rule__PruebaInterfaz__AccionesAssignment_3_0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1805:1: ( ( rule__PruebaInterfaz__AccionesAssignment_3_0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1805:1: ( ( rule__PruebaInterfaz__AccionesAssignment_3_0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1806:1: ( rule__PruebaInterfaz__AccionesAssignment_3_0 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1807:1: ( rule__PruebaInterfaz__AccionesAssignment_3_0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1807:2: rule__PruebaInterfaz__AccionesAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__AccionesAssignment_3_0_in_rule__PruebaInterfaz__Group_3__0__Impl3691);
            rule__PruebaInterfaz__AccionesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group_3__0__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1817:1: rule__PruebaInterfaz__Group_3__1 : rule__PruebaInterfaz__Group_3__1__Impl ;
    public final void rule__PruebaInterfaz__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1821:1: ( rule__PruebaInterfaz__Group_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1822:2: rule__PruebaInterfaz__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_3__1__Impl_in_rule__PruebaInterfaz__Group_3__13721);
            rule__PruebaInterfaz__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group_3__1"


    // $ANTLR start "rule__PruebaInterfaz__Group_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1828:1: rule__PruebaInterfaz__Group_3__1__Impl : ( ( rule__PruebaInterfaz__Group_3_1__0 )* ) ;
    public final void rule__PruebaInterfaz__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1832:1: ( ( ( rule__PruebaInterfaz__Group_3_1__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1833:1: ( ( rule__PruebaInterfaz__Group_3_1__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1833:1: ( ( rule__PruebaInterfaz__Group_3_1__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1834:1: ( rule__PruebaInterfaz__Group_3_1__0 )*
            {
             before(grammarAccess.getPruebaInterfazAccess().getGroup_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1835:1: ( rule__PruebaInterfaz__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1835:2: rule__PruebaInterfaz__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_3_1__0_in_rule__PruebaInterfaz__Group_3__1__Impl3748);
            	    rule__PruebaInterfaz__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPruebaInterfazAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group_3__1__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_3_1__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1849:1: rule__PruebaInterfaz__Group_3_1__0 : rule__PruebaInterfaz__Group_3_1__0__Impl rule__PruebaInterfaz__Group_3_1__1 ;
    public final void rule__PruebaInterfaz__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1853:1: ( rule__PruebaInterfaz__Group_3_1__0__Impl rule__PruebaInterfaz__Group_3_1__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1854:2: rule__PruebaInterfaz__Group_3_1__0__Impl rule__PruebaInterfaz__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_3_1__0__Impl_in_rule__PruebaInterfaz__Group_3_1__03783);
            rule__PruebaInterfaz__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_3_1__1_in_rule__PruebaInterfaz__Group_3_1__03786);
            rule__PruebaInterfaz__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group_3_1__0"


    // $ANTLR start "rule__PruebaInterfaz__Group_3_1__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1861:1: rule__PruebaInterfaz__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__PruebaInterfaz__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1865:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1866:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1866:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1867:1: ','
            {
             before(grammarAccess.getPruebaInterfazAccess().getCommaKeyword_3_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PruebaInterfaz__Group_3_1__0__Impl3814); 
             after(grammarAccess.getPruebaInterfazAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group_3_1__0__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_3_1__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1880:1: rule__PruebaInterfaz__Group_3_1__1 : rule__PruebaInterfaz__Group_3_1__1__Impl ;
    public final void rule__PruebaInterfaz__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1884:1: ( rule__PruebaInterfaz__Group_3_1__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1885:2: rule__PruebaInterfaz__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_3_1__1__Impl_in_rule__PruebaInterfaz__Group_3_1__13845);
            rule__PruebaInterfaz__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group_3_1__1"


    // $ANTLR start "rule__PruebaInterfaz__Group_3_1__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1891:1: rule__PruebaInterfaz__Group_3_1__1__Impl : ( ( rule__PruebaInterfaz__AccionesAssignment_3_1_1 ) ) ;
    public final void rule__PruebaInterfaz__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1895:1: ( ( ( rule__PruebaInterfaz__AccionesAssignment_3_1_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1896:1: ( ( rule__PruebaInterfaz__AccionesAssignment_3_1_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1896:1: ( ( rule__PruebaInterfaz__AccionesAssignment_3_1_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1897:1: ( rule__PruebaInterfaz__AccionesAssignment_3_1_1 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_3_1_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1898:1: ( rule__PruebaInterfaz__AccionesAssignment_3_1_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1898:2: rule__PruebaInterfaz__AccionesAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__AccionesAssignment_3_1_1_in_rule__PruebaInterfaz__Group_3_1__1__Impl3872);
            rule__PruebaInterfaz__AccionesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__Group_3_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1912:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1916:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1917:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03906);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03909);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1924:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1928:1: ( ( ( '-' )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1929:1: ( ( '-' )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1929:1: ( ( '-' )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1930:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1931:1: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1932:2: '-'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__EInt__Group__0__Impl3938); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1943:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1947:1: ( rule__EInt__Group__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1948:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13971);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1954:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1958:1: ( ( RULE_INT ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1959:1: ( RULE_INT )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1959:1: ( RULE_INT )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1960:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3998); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__InputTexto__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1975:1: rule__InputTexto__Group__0 : rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1 ;
    public final void rule__InputTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1979:1: ( rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1980:2: rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__0__Impl_in_rule__InputTexto__Group__04031);
            rule__InputTexto__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__1_in_rule__InputTexto__Group__04034);
            rule__InputTexto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__0"


    // $ANTLR start "rule__InputTexto__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1987:1: rule__InputTexto__Group__0__Impl : ( () ) ;
    public final void rule__InputTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1991:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1992:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1992:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1993:1: ()
            {
             before(grammarAccess.getInputTextoAccess().getInputTextoAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1994:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1996:1: 
            {
            }

             after(grammarAccess.getInputTextoAccess().getInputTextoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__0__Impl"


    // $ANTLR start "rule__InputTexto__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2006:1: rule__InputTexto__Group__1 : rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2 ;
    public final void rule__InputTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2010:1: ( rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2011:2: rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__1__Impl_in_rule__InputTexto__Group__14092);
            rule__InputTexto__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__2_in_rule__InputTexto__Group__14095);
            rule__InputTexto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__1"


    // $ANTLR start "rule__InputTexto__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2018:1: rule__InputTexto__Group__1__Impl : ( 'Input Texto' ) ;
    public final void rule__InputTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2022:1: ( ( 'Input Texto' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2023:1: ( 'Input Texto' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2023:1: ( 'Input Texto' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2024:1: 'Input Texto'
            {
             before(grammarAccess.getInputTextoAccess().getInputTextoKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__InputTexto__Group__1__Impl4123); 
             after(grammarAccess.getInputTextoAccess().getInputTextoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__1__Impl"


    // $ANTLR start "rule__InputTexto__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2037:1: rule__InputTexto__Group__2 : rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3 ;
    public final void rule__InputTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2041:1: ( rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2042:2: rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__2__Impl_in_rule__InputTexto__Group__24154);
            rule__InputTexto__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__3_in_rule__InputTexto__Group__24157);
            rule__InputTexto__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__2"


    // $ANTLR start "rule__InputTexto__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2049:1: rule__InputTexto__Group__2__Impl : ( ( rule__InputTexto__DeshabilitadoAssignment_2 )? ) ;
    public final void rule__InputTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2053:1: ( ( ( rule__InputTexto__DeshabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2054:1: ( ( rule__InputTexto__DeshabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2054:1: ( ( rule__InputTexto__DeshabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2055:1: ( rule__InputTexto__DeshabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputTextoAccess().getDeshabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2056:1: ( rule__InputTexto__DeshabilitadoAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2056:2: rule__InputTexto__DeshabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__DeshabilitadoAssignment_2_in_rule__InputTexto__Group__2__Impl4184);
                    rule__InputTexto__DeshabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputTextoAccess().getDeshabilitadoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__2__Impl"


    // $ANTLR start "rule__InputTexto__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2066:1: rule__InputTexto__Group__3 : rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4 ;
    public final void rule__InputTexto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2070:1: ( rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2071:2: rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__3__Impl_in_rule__InputTexto__Group__34215);
            rule__InputTexto__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__4_in_rule__InputTexto__Group__34218);
            rule__InputTexto__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__3"


    // $ANTLR start "rule__InputTexto__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2078:1: rule__InputTexto__Group__3__Impl : ( ( rule__InputTexto__ObligatorioAssignment_3 )? ) ;
    public final void rule__InputTexto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2082:1: ( ( ( rule__InputTexto__ObligatorioAssignment_3 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2083:1: ( ( rule__InputTexto__ObligatorioAssignment_3 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2083:1: ( ( rule__InputTexto__ObligatorioAssignment_3 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2084:1: ( rule__InputTexto__ObligatorioAssignment_3 )?
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2085:1: ( rule__InputTexto__ObligatorioAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2085:2: rule__InputTexto__ObligatorioAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__ObligatorioAssignment_3_in_rule__InputTexto__Group__3__Impl4245);
                    rule__InputTexto__ObligatorioAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputTextoAccess().getObligatorioAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__3__Impl"


    // $ANTLR start "rule__InputTexto__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2095:1: rule__InputTexto__Group__4 : rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5 ;
    public final void rule__InputTexto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2099:1: ( rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2100:2: rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__4__Impl_in_rule__InputTexto__Group__44276);
            rule__InputTexto__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__5_in_rule__InputTexto__Group__44279);
            rule__InputTexto__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__4"


    // $ANTLR start "rule__InputTexto__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2107:1: rule__InputTexto__Group__4__Impl : ( ( rule__InputTexto__InvisibleAssignment_4 )? ) ;
    public final void rule__InputTexto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2111:1: ( ( ( rule__InputTexto__InvisibleAssignment_4 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2112:1: ( ( rule__InputTexto__InvisibleAssignment_4 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2112:1: ( ( rule__InputTexto__InvisibleAssignment_4 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2113:1: ( rule__InputTexto__InvisibleAssignment_4 )?
            {
             before(grammarAccess.getInputTextoAccess().getInvisibleAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2114:1: ( rule__InputTexto__InvisibleAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2114:2: rule__InputTexto__InvisibleAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__InvisibleAssignment_4_in_rule__InputTexto__Group__4__Impl4306);
                    rule__InputTexto__InvisibleAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputTextoAccess().getInvisibleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__4__Impl"


    // $ANTLR start "rule__InputTexto__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2124:1: rule__InputTexto__Group__5 : rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6 ;
    public final void rule__InputTexto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2128:1: ( rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2129:2: rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__5__Impl_in_rule__InputTexto__Group__54337);
            rule__InputTexto__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__6_in_rule__InputTexto__Group__54340);
            rule__InputTexto__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__5"


    // $ANTLR start "rule__InputTexto__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2136:1: rule__InputTexto__Group__5__Impl : ( ( rule__InputTexto__NameAssignment_5 ) ) ;
    public final void rule__InputTexto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2140:1: ( ( ( rule__InputTexto__NameAssignment_5 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2141:1: ( ( rule__InputTexto__NameAssignment_5 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2141:1: ( ( rule__InputTexto__NameAssignment_5 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2142:1: ( rule__InputTexto__NameAssignment_5 )
            {
             before(grammarAccess.getInputTextoAccess().getNameAssignment_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2143:1: ( rule__InputTexto__NameAssignment_5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2143:2: rule__InputTexto__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__NameAssignment_5_in_rule__InputTexto__Group__5__Impl4367);
            rule__InputTexto__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInputTextoAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__5__Impl"


    // $ANTLR start "rule__InputTexto__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2153:1: rule__InputTexto__Group__6 : rule__InputTexto__Group__6__Impl ;
    public final void rule__InputTexto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2157:1: ( rule__InputTexto__Group__6__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2158:2: rule__InputTexto__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__6__Impl_in_rule__InputTexto__Group__64397);
            rule__InputTexto__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__6"


    // $ANTLR start "rule__InputTexto__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2164:1: rule__InputTexto__Group__6__Impl : ( ( rule__InputTexto__Group_6__0 )? ) ;
    public final void rule__InputTexto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2168:1: ( ( ( rule__InputTexto__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2169:1: ( ( rule__InputTexto__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2169:1: ( ( rule__InputTexto__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2170:1: ( rule__InputTexto__Group_6__0 )?
            {
             before(grammarAccess.getInputTextoAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2171:1: ( rule__InputTexto__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2171:2: rule__InputTexto__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_6__0_in_rule__InputTexto__Group__6__Impl4424);
                    rule__InputTexto__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputTextoAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group__6__Impl"


    // $ANTLR start "rule__InputTexto__Group_6__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2195:1: rule__InputTexto__Group_6__0 : rule__InputTexto__Group_6__0__Impl rule__InputTexto__Group_6__1 ;
    public final void rule__InputTexto__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2199:1: ( rule__InputTexto__Group_6__0__Impl rule__InputTexto__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2200:2: rule__InputTexto__Group_6__0__Impl rule__InputTexto__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_6__0__Impl_in_rule__InputTexto__Group_6__04469);
            rule__InputTexto__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_6__1_in_rule__InputTexto__Group_6__04472);
            rule__InputTexto__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group_6__0"


    // $ANTLR start "rule__InputTexto__Group_6__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2207:1: rule__InputTexto__Group_6__0__Impl : ( 'inicial' ) ;
    public final void rule__InputTexto__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2211:1: ( ( 'inicial' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2212:1: ( 'inicial' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2212:1: ( 'inicial' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2213:1: 'inicial'
            {
             before(grammarAccess.getInputTextoAccess().getInicialKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__InputTexto__Group_6__0__Impl4500); 
             after(grammarAccess.getInputTextoAccess().getInicialKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group_6__0__Impl"


    // $ANTLR start "rule__InputTexto__Group_6__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2226:1: rule__InputTexto__Group_6__1 : rule__InputTexto__Group_6__1__Impl ;
    public final void rule__InputTexto__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2230:1: ( rule__InputTexto__Group_6__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2231:2: rule__InputTexto__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_6__1__Impl_in_rule__InputTexto__Group_6__14531);
            rule__InputTexto__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group_6__1"


    // $ANTLR start "rule__InputTexto__Group_6__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2237:1: rule__InputTexto__Group_6__1__Impl : ( ( rule__InputTexto__ValorAssignment_6_1 ) ) ;
    public final void rule__InputTexto__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2241:1: ( ( ( rule__InputTexto__ValorAssignment_6_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2242:1: ( ( rule__InputTexto__ValorAssignment_6_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2242:1: ( ( rule__InputTexto__ValorAssignment_6_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2243:1: ( rule__InputTexto__ValorAssignment_6_1 )
            {
             before(grammarAccess.getInputTextoAccess().getValorAssignment_6_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2244:1: ( rule__InputTexto__ValorAssignment_6_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2244:2: rule__InputTexto__ValorAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__ValorAssignment_6_1_in_rule__InputTexto__Group_6__1__Impl4558);
            rule__InputTexto__ValorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInputTextoAccess().getValorAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__Group_6__1__Impl"


    // $ANTLR start "rule__InputRadio__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2258:1: rule__InputRadio__Group__0 : rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1 ;
    public final void rule__InputRadio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2262:1: ( rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2263:2: rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__0__Impl_in_rule__InputRadio__Group__04592);
            rule__InputRadio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__1_in_rule__InputRadio__Group__04595);
            rule__InputRadio__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__0"


    // $ANTLR start "rule__InputRadio__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2270:1: rule__InputRadio__Group__0__Impl : ( 'Radio' ) ;
    public final void rule__InputRadio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2274:1: ( ( 'Radio' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2275:1: ( 'Radio' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2275:1: ( 'Radio' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2276:1: 'Radio'
            {
             before(grammarAccess.getInputRadioAccess().getRadioKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__InputRadio__Group__0__Impl4623); 
             after(grammarAccess.getInputRadioAccess().getRadioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__0__Impl"


    // $ANTLR start "rule__InputRadio__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2289:1: rule__InputRadio__Group__1 : rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2 ;
    public final void rule__InputRadio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2293:1: ( rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2294:2: rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__1__Impl_in_rule__InputRadio__Group__14654);
            rule__InputRadio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__2_in_rule__InputRadio__Group__14657);
            rule__InputRadio__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__1"


    // $ANTLR start "rule__InputRadio__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2301:1: rule__InputRadio__Group__1__Impl : ( ( rule__InputRadio__InvisibleAssignment_1 )? ) ;
    public final void rule__InputRadio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2305:1: ( ( ( rule__InputRadio__InvisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2306:1: ( ( rule__InputRadio__InvisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2306:1: ( ( rule__InputRadio__InvisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2307:1: ( rule__InputRadio__InvisibleAssignment_1 )?
            {
             before(grammarAccess.getInputRadioAccess().getInvisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2308:1: ( rule__InputRadio__InvisibleAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==48) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2308:2: rule__InputRadio__InvisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__InvisibleAssignment_1_in_rule__InputRadio__Group__1__Impl4684);
                    rule__InputRadio__InvisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputRadioAccess().getInvisibleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__1__Impl"


    // $ANTLR start "rule__InputRadio__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2318:1: rule__InputRadio__Group__2 : rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3 ;
    public final void rule__InputRadio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2322:1: ( rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2323:2: rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__2__Impl_in_rule__InputRadio__Group__24715);
            rule__InputRadio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__3_in_rule__InputRadio__Group__24718);
            rule__InputRadio__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__2"


    // $ANTLR start "rule__InputRadio__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2330:1: rule__InputRadio__Group__2__Impl : ( ( rule__InputRadio__DeshabilitadoAssignment_2 )? ) ;
    public final void rule__InputRadio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2334:1: ( ( ( rule__InputRadio__DeshabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2335:1: ( ( rule__InputRadio__DeshabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2335:1: ( ( rule__InputRadio__DeshabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2336:1: ( rule__InputRadio__DeshabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputRadioAccess().getDeshabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2337:1: ( rule__InputRadio__DeshabilitadoAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2337:2: rule__InputRadio__DeshabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__DeshabilitadoAssignment_2_in_rule__InputRadio__Group__2__Impl4745);
                    rule__InputRadio__DeshabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputRadioAccess().getDeshabilitadoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__2__Impl"


    // $ANTLR start "rule__InputRadio__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2347:1: rule__InputRadio__Group__3 : rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4 ;
    public final void rule__InputRadio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2351:1: ( rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2352:2: rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__3__Impl_in_rule__InputRadio__Group__34776);
            rule__InputRadio__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__4_in_rule__InputRadio__Group__34779);
            rule__InputRadio__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__3"


    // $ANTLR start "rule__InputRadio__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2359:1: rule__InputRadio__Group__3__Impl : ( ( rule__InputRadio__NameAssignment_3 ) ) ;
    public final void rule__InputRadio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2363:1: ( ( ( rule__InputRadio__NameAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2364:1: ( ( rule__InputRadio__NameAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2364:1: ( ( rule__InputRadio__NameAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2365:1: ( rule__InputRadio__NameAssignment_3 )
            {
             before(grammarAccess.getInputRadioAccess().getNameAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2366:1: ( rule__InputRadio__NameAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2366:2: rule__InputRadio__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__NameAssignment_3_in_rule__InputRadio__Group__3__Impl4806);
            rule__InputRadio__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__3__Impl"


    // $ANTLR start "rule__InputRadio__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2376:1: rule__InputRadio__Group__4 : rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5 ;
    public final void rule__InputRadio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2380:1: ( rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2381:2: rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__4__Impl_in_rule__InputRadio__Group__44836);
            rule__InputRadio__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__5_in_rule__InputRadio__Group__44839);
            rule__InputRadio__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__4"


    // $ANTLR start "rule__InputRadio__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2388:1: rule__InputRadio__Group__4__Impl : ( ':' ) ;
    public final void rule__InputRadio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2392:1: ( ( ':' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2393:1: ( ':' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2393:1: ( ':' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2394:1: ':'
            {
             before(grammarAccess.getInputRadioAccess().getColonKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__InputRadio__Group__4__Impl4867); 
             after(grammarAccess.getInputRadioAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__4__Impl"


    // $ANTLR start "rule__InputRadio__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2407:1: rule__InputRadio__Group__5 : rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6 ;
    public final void rule__InputRadio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2411:1: ( rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2412:2: rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__5__Impl_in_rule__InputRadio__Group__54898);
            rule__InputRadio__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__6_in_rule__InputRadio__Group__54901);
            rule__InputRadio__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__5"


    // $ANTLR start "rule__InputRadio__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2419:1: rule__InputRadio__Group__5__Impl : ( ( rule__InputRadio__Group_5__0 )? ) ;
    public final void rule__InputRadio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2423:1: ( ( ( rule__InputRadio__Group_5__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2424:1: ( ( rule__InputRadio__Group_5__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2424:1: ( ( rule__InputRadio__Group_5__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2425:1: ( rule__InputRadio__Group_5__0 )?
            {
             before(grammarAccess.getInputRadioAccess().getGroup_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2426:1: ( rule__InputRadio__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2426:2: rule__InputRadio__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5__0_in_rule__InputRadio__Group__5__Impl4928);
                    rule__InputRadio__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputRadioAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__5__Impl"


    // $ANTLR start "rule__InputRadio__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2436:1: rule__InputRadio__Group__6 : rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7 ;
    public final void rule__InputRadio__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2440:1: ( rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2441:2: rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__6__Impl_in_rule__InputRadio__Group__64959);
            rule__InputRadio__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__7_in_rule__InputRadio__Group__64962);
            rule__InputRadio__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__6"


    // $ANTLR start "rule__InputRadio__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2448:1: rule__InputRadio__Group__6__Impl : ( ( rule__InputRadio__Group_6__0 )? ) ;
    public final void rule__InputRadio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2452:1: ( ( ( rule__InputRadio__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2453:1: ( ( rule__InputRadio__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2453:1: ( ( rule__InputRadio__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2454:1: ( rule__InputRadio__Group_6__0 )?
            {
             before(grammarAccess.getInputRadioAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2455:1: ( rule__InputRadio__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2455:2: rule__InputRadio__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__0_in_rule__InputRadio__Group__6__Impl4989);
                    rule__InputRadio__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputRadioAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__6__Impl"


    // $ANTLR start "rule__InputRadio__Group__7"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2465:1: rule__InputRadio__Group__7 : rule__InputRadio__Group__7__Impl ;
    public final void rule__InputRadio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2469:1: ( rule__InputRadio__Group__7__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2470:2: rule__InputRadio__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__7__Impl_in_rule__InputRadio__Group__75020);
            rule__InputRadio__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__7"


    // $ANTLR start "rule__InputRadio__Group__7__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2476:1: rule__InputRadio__Group__7__Impl : ( ( rule__InputRadio__Group_7__0 )? ) ;
    public final void rule__InputRadio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2480:1: ( ( ( rule__InputRadio__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2481:1: ( ( rule__InputRadio__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2481:1: ( ( rule__InputRadio__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2482:1: ( rule__InputRadio__Group_7__0 )?
            {
             before(grammarAccess.getInputRadioAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2483:1: ( rule__InputRadio__Group_7__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2483:2: rule__InputRadio__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__0_in_rule__InputRadio__Group__7__Impl5047);
                    rule__InputRadio__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputRadioAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__7__Impl"


    // $ANTLR start "rule__InputRadio__Group_5__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2509:1: rule__InputRadio__Group_5__0 : rule__InputRadio__Group_5__0__Impl rule__InputRadio__Group_5__1 ;
    public final void rule__InputRadio__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2513:1: ( rule__InputRadio__Group_5__0__Impl rule__InputRadio__Group_5__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2514:2: rule__InputRadio__Group_5__0__Impl rule__InputRadio__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5__0__Impl_in_rule__InputRadio__Group_5__05094);
            rule__InputRadio__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5__1_in_rule__InputRadio__Group_5__05097);
            rule__InputRadio__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5__0"


    // $ANTLR start "rule__InputRadio__Group_5__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2521:1: rule__InputRadio__Group_5__0__Impl : ( '{' ) ;
    public final void rule__InputRadio__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2525:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2526:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2526:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2527:1: '{'
            {
             before(grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputRadio__Group_5__0__Impl5125); 
             after(grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5__0__Impl"


    // $ANTLR start "rule__InputRadio__Group_5__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2540:1: rule__InputRadio__Group_5__1 : rule__InputRadio__Group_5__1__Impl rule__InputRadio__Group_5__2 ;
    public final void rule__InputRadio__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2544:1: ( rule__InputRadio__Group_5__1__Impl rule__InputRadio__Group_5__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2545:2: rule__InputRadio__Group_5__1__Impl rule__InputRadio__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5__1__Impl_in_rule__InputRadio__Group_5__15156);
            rule__InputRadio__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5__2_in_rule__InputRadio__Group_5__15159);
            rule__InputRadio__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5__1"


    // $ANTLR start "rule__InputRadio__Group_5__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2552:1: rule__InputRadio__Group_5__1__Impl : ( ( rule__InputRadio__ValoresAssignment_5_1 ) ) ;
    public final void rule__InputRadio__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2556:1: ( ( ( rule__InputRadio__ValoresAssignment_5_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2557:1: ( ( rule__InputRadio__ValoresAssignment_5_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2557:1: ( ( rule__InputRadio__ValoresAssignment_5_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2558:1: ( rule__InputRadio__ValoresAssignment_5_1 )
            {
             before(grammarAccess.getInputRadioAccess().getValoresAssignment_5_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2559:1: ( rule__InputRadio__ValoresAssignment_5_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2559:2: rule__InputRadio__ValoresAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__ValoresAssignment_5_1_in_rule__InputRadio__Group_5__1__Impl5186);
            rule__InputRadio__ValoresAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getValoresAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5__1__Impl"


    // $ANTLR start "rule__InputRadio__Group_5__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2569:1: rule__InputRadio__Group_5__2 : rule__InputRadio__Group_5__2__Impl rule__InputRadio__Group_5__3 ;
    public final void rule__InputRadio__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2573:1: ( rule__InputRadio__Group_5__2__Impl rule__InputRadio__Group_5__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2574:2: rule__InputRadio__Group_5__2__Impl rule__InputRadio__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5__2__Impl_in_rule__InputRadio__Group_5__25216);
            rule__InputRadio__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5__3_in_rule__InputRadio__Group_5__25219);
            rule__InputRadio__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5__2"


    // $ANTLR start "rule__InputRadio__Group_5__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2581:1: rule__InputRadio__Group_5__2__Impl : ( ( rule__InputRadio__Group_5_2__0 )* ) ;
    public final void rule__InputRadio__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2585:1: ( ( ( rule__InputRadio__Group_5_2__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2586:1: ( ( rule__InputRadio__Group_5_2__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2586:1: ( ( rule__InputRadio__Group_5_2__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2587:1: ( rule__InputRadio__Group_5_2__0 )*
            {
             before(grammarAccess.getInputRadioAccess().getGroup_5_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2588:1: ( rule__InputRadio__Group_5_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==19) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2588:2: rule__InputRadio__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5_2__0_in_rule__InputRadio__Group_5__2__Impl5246);
            	    rule__InputRadio__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getInputRadioAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5__2__Impl"


    // $ANTLR start "rule__InputRadio__Group_5__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2598:1: rule__InputRadio__Group_5__3 : rule__InputRadio__Group_5__3__Impl ;
    public final void rule__InputRadio__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2602:1: ( rule__InputRadio__Group_5__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2603:2: rule__InputRadio__Group_5__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5__3__Impl_in_rule__InputRadio__Group_5__35277);
            rule__InputRadio__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5__3"


    // $ANTLR start "rule__InputRadio__Group_5__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2609:1: rule__InputRadio__Group_5__3__Impl : ( '}' ) ;
    public final void rule__InputRadio__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2613:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2614:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2614:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2615:1: '}'
            {
             before(grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputRadio__Group_5__3__Impl5305); 
             after(grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5__3__Impl"


    // $ANTLR start "rule__InputRadio__Group_5_2__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2636:1: rule__InputRadio__Group_5_2__0 : rule__InputRadio__Group_5_2__0__Impl rule__InputRadio__Group_5_2__1 ;
    public final void rule__InputRadio__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2640:1: ( rule__InputRadio__Group_5_2__0__Impl rule__InputRadio__Group_5_2__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2641:2: rule__InputRadio__Group_5_2__0__Impl rule__InputRadio__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5_2__0__Impl_in_rule__InputRadio__Group_5_2__05344);
            rule__InputRadio__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5_2__1_in_rule__InputRadio__Group_5_2__05347);
            rule__InputRadio__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5_2__0"


    // $ANTLR start "rule__InputRadio__Group_5_2__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2648:1: rule__InputRadio__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__InputRadio__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2652:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2653:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2653:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2654:1: ','
            {
             before(grammarAccess.getInputRadioAccess().getCommaKeyword_5_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__InputRadio__Group_5_2__0__Impl5375); 
             after(grammarAccess.getInputRadioAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5_2__0__Impl"


    // $ANTLR start "rule__InputRadio__Group_5_2__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2667:1: rule__InputRadio__Group_5_2__1 : rule__InputRadio__Group_5_2__1__Impl ;
    public final void rule__InputRadio__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2671:1: ( rule__InputRadio__Group_5_2__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2672:2: rule__InputRadio__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_5_2__1__Impl_in_rule__InputRadio__Group_5_2__15406);
            rule__InputRadio__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5_2__1"


    // $ANTLR start "rule__InputRadio__Group_5_2__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2678:1: rule__InputRadio__Group_5_2__1__Impl : ( ( rule__InputRadio__ValoresAssignment_5_2_1 ) ) ;
    public final void rule__InputRadio__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2682:1: ( ( ( rule__InputRadio__ValoresAssignment_5_2_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2683:1: ( ( rule__InputRadio__ValoresAssignment_5_2_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2683:1: ( ( rule__InputRadio__ValoresAssignment_5_2_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2684:1: ( rule__InputRadio__ValoresAssignment_5_2_1 )
            {
             before(grammarAccess.getInputRadioAccess().getValoresAssignment_5_2_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2685:1: ( rule__InputRadio__ValoresAssignment_5_2_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2685:2: rule__InputRadio__ValoresAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__ValoresAssignment_5_2_1_in_rule__InputRadio__Group_5_2__1__Impl5433);
            rule__InputRadio__ValoresAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getValoresAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_5_2__1__Impl"


    // $ANTLR start "rule__InputRadio__Group_6__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2699:1: rule__InputRadio__Group_6__0 : rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1 ;
    public final void rule__InputRadio__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2703:1: ( rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2704:2: rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__0__Impl_in_rule__InputRadio__Group_6__05467);
            rule__InputRadio__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__1_in_rule__InputRadio__Group_6__05470);
            rule__InputRadio__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_6__0"


    // $ANTLR start "rule__InputRadio__Group_6__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2711:1: rule__InputRadio__Group_6__0__Impl : ( 'inicial' ) ;
    public final void rule__InputRadio__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2715:1: ( ( 'inicial' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2716:1: ( 'inicial' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2716:1: ( 'inicial' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2717:1: 'inicial'
            {
             before(grammarAccess.getInputRadioAccess().getInicialKeyword_6_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__InputRadio__Group_6__0__Impl5498); 
             after(grammarAccess.getInputRadioAccess().getInicialKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_6__0__Impl"


    // $ANTLR start "rule__InputRadio__Group_6__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2730:1: rule__InputRadio__Group_6__1 : rule__InputRadio__Group_6__1__Impl ;
    public final void rule__InputRadio__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2734:1: ( rule__InputRadio__Group_6__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2735:2: rule__InputRadio__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__1__Impl_in_rule__InputRadio__Group_6__15529);
            rule__InputRadio__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_6__1"


    // $ANTLR start "rule__InputRadio__Group_6__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2741:1: rule__InputRadio__Group_6__1__Impl : ( ( rule__InputRadio__SeleccionAssignment_6_1 ) ) ;
    public final void rule__InputRadio__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2745:1: ( ( ( rule__InputRadio__SeleccionAssignment_6_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2746:1: ( ( rule__InputRadio__SeleccionAssignment_6_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2746:1: ( ( rule__InputRadio__SeleccionAssignment_6_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2747:1: ( rule__InputRadio__SeleccionAssignment_6_1 )
            {
             before(grammarAccess.getInputRadioAccess().getSeleccionAssignment_6_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2748:1: ( rule__InputRadio__SeleccionAssignment_6_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2748:2: rule__InputRadio__SeleccionAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__SeleccionAssignment_6_1_in_rule__InputRadio__Group_6__1__Impl5556);
            rule__InputRadio__SeleccionAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getSeleccionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_6__1__Impl"


    // $ANTLR start "rule__InputRadio__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2762:1: rule__InputRadio__Group_7__0 : rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1 ;
    public final void rule__InputRadio__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2766:1: ( rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2767:2: rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__0__Impl_in_rule__InputRadio__Group_7__05590);
            rule__InputRadio__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__1_in_rule__InputRadio__Group_7__05593);
            rule__InputRadio__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_7__0"


    // $ANTLR start "rule__InputRadio__Group_7__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2774:1: rule__InputRadio__Group_7__0__Impl : ( 'Reaccion' ) ;
    public final void rule__InputRadio__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2778:1: ( ( 'Reaccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2779:1: ( 'Reaccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2779:1: ( 'Reaccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2780:1: 'Reaccion'
            {
             before(grammarAccess.getInputRadioAccess().getReaccionKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__InputRadio__Group_7__0__Impl5621); 
             after(grammarAccess.getInputRadioAccess().getReaccionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_7__0__Impl"


    // $ANTLR start "rule__InputRadio__Group_7__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2793:1: rule__InputRadio__Group_7__1 : rule__InputRadio__Group_7__1__Impl ;
    public final void rule__InputRadio__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2797:1: ( rule__InputRadio__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2798:2: rule__InputRadio__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__1__Impl_in_rule__InputRadio__Group_7__15652);
            rule__InputRadio__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_7__1"


    // $ANTLR start "rule__InputRadio__Group_7__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2804:1: rule__InputRadio__Group_7__1__Impl : ( ( rule__InputRadio__ReaccionAssignment_7_1 ) ) ;
    public final void rule__InputRadio__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2808:1: ( ( ( rule__InputRadio__ReaccionAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2809:1: ( ( rule__InputRadio__ReaccionAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2809:1: ( ( rule__InputRadio__ReaccionAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2810:1: ( rule__InputRadio__ReaccionAssignment_7_1 )
            {
             before(grammarAccess.getInputRadioAccess().getReaccionAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2811:1: ( rule__InputRadio__ReaccionAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2811:2: rule__InputRadio__ReaccionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__ReaccionAssignment_7_1_in_rule__InputRadio__Group_7__1__Impl5679);
            rule__InputRadio__ReaccionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getReaccionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group_7__1__Impl"


    // $ANTLR start "rule__InputCombo__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2825:1: rule__InputCombo__Group__0 : rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1 ;
    public final void rule__InputCombo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2829:1: ( rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2830:2: rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__0__Impl_in_rule__InputCombo__Group__05713);
            rule__InputCombo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__1_in_rule__InputCombo__Group__05716);
            rule__InputCombo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__0"


    // $ANTLR start "rule__InputCombo__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2837:1: rule__InputCombo__Group__0__Impl : ( () ) ;
    public final void rule__InputCombo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2841:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2842:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2842:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2843:1: ()
            {
             before(grammarAccess.getInputComboAccess().getInputComboAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2844:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2846:1: 
            {
            }

             after(grammarAccess.getInputComboAccess().getInputComboAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__0__Impl"


    // $ANTLR start "rule__InputCombo__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2856:1: rule__InputCombo__Group__1 : rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2 ;
    public final void rule__InputCombo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2860:1: ( rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2861:2: rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__1__Impl_in_rule__InputCombo__Group__15774);
            rule__InputCombo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__2_in_rule__InputCombo__Group__15777);
            rule__InputCombo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__1"


    // $ANTLR start "rule__InputCombo__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2868:1: rule__InputCombo__Group__1__Impl : ( 'Combo' ) ;
    public final void rule__InputCombo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2872:1: ( ( 'Combo' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2873:1: ( 'Combo' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2873:1: ( 'Combo' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2874:1: 'Combo'
            {
             before(grammarAccess.getInputComboAccess().getComboKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__InputCombo__Group__1__Impl5805); 
             after(grammarAccess.getInputComboAccess().getComboKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__1__Impl"


    // $ANTLR start "rule__InputCombo__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2887:1: rule__InputCombo__Group__2 : rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3 ;
    public final void rule__InputCombo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2891:1: ( rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2892:2: rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__2__Impl_in_rule__InputCombo__Group__25836);
            rule__InputCombo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__3_in_rule__InputCombo__Group__25839);
            rule__InputCombo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__2"


    // $ANTLR start "rule__InputCombo__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2899:1: rule__InputCombo__Group__2__Impl : ( ( rule__InputCombo__InvisibleAssignment_2 )? ) ;
    public final void rule__InputCombo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2903:1: ( ( ( rule__InputCombo__InvisibleAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2904:1: ( ( rule__InputCombo__InvisibleAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2904:1: ( ( rule__InputCombo__InvisibleAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2905:1: ( rule__InputCombo__InvisibleAssignment_2 )?
            {
             before(grammarAccess.getInputComboAccess().getInvisibleAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2906:1: ( rule__InputCombo__InvisibleAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2906:2: rule__InputCombo__InvisibleAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__InvisibleAssignment_2_in_rule__InputCombo__Group__2__Impl5866);
                    rule__InputCombo__InvisibleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputComboAccess().getInvisibleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__2__Impl"


    // $ANTLR start "rule__InputCombo__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2916:1: rule__InputCombo__Group__3 : rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4 ;
    public final void rule__InputCombo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2920:1: ( rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2921:2: rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__3__Impl_in_rule__InputCombo__Group__35897);
            rule__InputCombo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__4_in_rule__InputCombo__Group__35900);
            rule__InputCombo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__3"


    // $ANTLR start "rule__InputCombo__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2928:1: rule__InputCombo__Group__3__Impl : ( ( rule__InputCombo__DeshabilitadoAssignment_3 )? ) ;
    public final void rule__InputCombo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2932:1: ( ( ( rule__InputCombo__DeshabilitadoAssignment_3 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2933:1: ( ( rule__InputCombo__DeshabilitadoAssignment_3 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2933:1: ( ( rule__InputCombo__DeshabilitadoAssignment_3 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2934:1: ( rule__InputCombo__DeshabilitadoAssignment_3 )?
            {
             before(grammarAccess.getInputComboAccess().getDeshabilitadoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2935:1: ( rule__InputCombo__DeshabilitadoAssignment_3 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2935:2: rule__InputCombo__DeshabilitadoAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__DeshabilitadoAssignment_3_in_rule__InputCombo__Group__3__Impl5927);
                    rule__InputCombo__DeshabilitadoAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputComboAccess().getDeshabilitadoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__3__Impl"


    // $ANTLR start "rule__InputCombo__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2945:1: rule__InputCombo__Group__4 : rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5 ;
    public final void rule__InputCombo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2949:1: ( rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2950:2: rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__4__Impl_in_rule__InputCombo__Group__45958);
            rule__InputCombo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__5_in_rule__InputCombo__Group__45961);
            rule__InputCombo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__4"


    // $ANTLR start "rule__InputCombo__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2957:1: rule__InputCombo__Group__4__Impl : ( ( rule__InputCombo__NameAssignment_4 ) ) ;
    public final void rule__InputCombo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2961:1: ( ( ( rule__InputCombo__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2962:1: ( ( rule__InputCombo__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2962:1: ( ( rule__InputCombo__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2963:1: ( rule__InputCombo__NameAssignment_4 )
            {
             before(grammarAccess.getInputComboAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2964:1: ( rule__InputCombo__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2964:2: rule__InputCombo__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__NameAssignment_4_in_rule__InputCombo__Group__4__Impl5988);
            rule__InputCombo__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputComboAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__4__Impl"


    // $ANTLR start "rule__InputCombo__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2974:1: rule__InputCombo__Group__5 : rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6 ;
    public final void rule__InputCombo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2978:1: ( rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2979:2: rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__5__Impl_in_rule__InputCombo__Group__56018);
            rule__InputCombo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__6_in_rule__InputCombo__Group__56021);
            rule__InputCombo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__5"


    // $ANTLR start "rule__InputCombo__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2986:1: rule__InputCombo__Group__5__Impl : ( ':' ) ;
    public final void rule__InputCombo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2990:1: ( ( ':' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2991:1: ( ':' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2991:1: ( ':' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2992:1: ':'
            {
             before(grammarAccess.getInputComboAccess().getColonKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__InputCombo__Group__5__Impl6049); 
             after(grammarAccess.getInputComboAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__5__Impl"


    // $ANTLR start "rule__InputCombo__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3005:1: rule__InputCombo__Group__6 : rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7 ;
    public final void rule__InputCombo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3009:1: ( rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3010:2: rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__6__Impl_in_rule__InputCombo__Group__66080);
            rule__InputCombo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__7_in_rule__InputCombo__Group__66083);
            rule__InputCombo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__6"


    // $ANTLR start "rule__InputCombo__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3017:1: rule__InputCombo__Group__6__Impl : ( ( rule__InputCombo__Group_6__0 )? ) ;
    public final void rule__InputCombo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3021:1: ( ( ( rule__InputCombo__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3022:1: ( ( rule__InputCombo__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3022:1: ( ( rule__InputCombo__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3023:1: ( rule__InputCombo__Group_6__0 )?
            {
             before(grammarAccess.getInputComboAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3024:1: ( rule__InputCombo__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3024:2: rule__InputCombo__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__0_in_rule__InputCombo__Group__6__Impl6110);
                    rule__InputCombo__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputComboAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__6__Impl"


    // $ANTLR start "rule__InputCombo__Group__7"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3034:1: rule__InputCombo__Group__7 : rule__InputCombo__Group__7__Impl ;
    public final void rule__InputCombo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3038:1: ( rule__InputCombo__Group__7__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3039:2: rule__InputCombo__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__7__Impl_in_rule__InputCombo__Group__76141);
            rule__InputCombo__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__7"


    // $ANTLR start "rule__InputCombo__Group__7__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3045:1: rule__InputCombo__Group__7__Impl : ( ( rule__InputCombo__Group_7__0 )? ) ;
    public final void rule__InputCombo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3049:1: ( ( ( rule__InputCombo__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3050:1: ( ( rule__InputCombo__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3050:1: ( ( rule__InputCombo__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3051:1: ( rule__InputCombo__Group_7__0 )?
            {
             before(grammarAccess.getInputComboAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3052:1: ( rule__InputCombo__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3052:2: rule__InputCombo__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__0_in_rule__InputCombo__Group__7__Impl6168);
                    rule__InputCombo__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputComboAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group__7__Impl"


    // $ANTLR start "rule__InputCombo__Group_6__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3078:1: rule__InputCombo__Group_6__0 : rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1 ;
    public final void rule__InputCombo__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3082:1: ( rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3083:2: rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__0__Impl_in_rule__InputCombo__Group_6__06215);
            rule__InputCombo__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__1_in_rule__InputCombo__Group_6__06218);
            rule__InputCombo__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6__0"


    // $ANTLR start "rule__InputCombo__Group_6__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3090:1: rule__InputCombo__Group_6__0__Impl : ( '{' ) ;
    public final void rule__InputCombo__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3094:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3095:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3095:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3096:1: '{'
            {
             before(grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCombo__Group_6__0__Impl6246); 
             after(grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6__0__Impl"


    // $ANTLR start "rule__InputCombo__Group_6__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3109:1: rule__InputCombo__Group_6__1 : rule__InputCombo__Group_6__1__Impl rule__InputCombo__Group_6__2 ;
    public final void rule__InputCombo__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3113:1: ( rule__InputCombo__Group_6__1__Impl rule__InputCombo__Group_6__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3114:2: rule__InputCombo__Group_6__1__Impl rule__InputCombo__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__1__Impl_in_rule__InputCombo__Group_6__16277);
            rule__InputCombo__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__2_in_rule__InputCombo__Group_6__16280);
            rule__InputCombo__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6__1"


    // $ANTLR start "rule__InputCombo__Group_6__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3121:1: rule__InputCombo__Group_6__1__Impl : ( ( rule__InputCombo__ValoresAssignment_6_1 ) ) ;
    public final void rule__InputCombo__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3125:1: ( ( ( rule__InputCombo__ValoresAssignment_6_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3126:1: ( ( rule__InputCombo__ValoresAssignment_6_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3126:1: ( ( rule__InputCombo__ValoresAssignment_6_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3127:1: ( rule__InputCombo__ValoresAssignment_6_1 )
            {
             before(grammarAccess.getInputComboAccess().getValoresAssignment_6_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3128:1: ( rule__InputCombo__ValoresAssignment_6_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3128:2: rule__InputCombo__ValoresAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__ValoresAssignment_6_1_in_rule__InputCombo__Group_6__1__Impl6307);
            rule__InputCombo__ValoresAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInputComboAccess().getValoresAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6__1__Impl"


    // $ANTLR start "rule__InputCombo__Group_6__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3138:1: rule__InputCombo__Group_6__2 : rule__InputCombo__Group_6__2__Impl rule__InputCombo__Group_6__3 ;
    public final void rule__InputCombo__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3142:1: ( rule__InputCombo__Group_6__2__Impl rule__InputCombo__Group_6__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3143:2: rule__InputCombo__Group_6__2__Impl rule__InputCombo__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__2__Impl_in_rule__InputCombo__Group_6__26337);
            rule__InputCombo__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__3_in_rule__InputCombo__Group_6__26340);
            rule__InputCombo__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6__2"


    // $ANTLR start "rule__InputCombo__Group_6__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3150:1: rule__InputCombo__Group_6__2__Impl : ( ( rule__InputCombo__Group_6_2__0 )* ) ;
    public final void rule__InputCombo__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3154:1: ( ( ( rule__InputCombo__Group_6_2__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3155:1: ( ( rule__InputCombo__Group_6_2__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3155:1: ( ( rule__InputCombo__Group_6_2__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3156:1: ( rule__InputCombo__Group_6_2__0 )*
            {
             before(grammarAccess.getInputComboAccess().getGroup_6_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3157:1: ( rule__InputCombo__Group_6_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3157:2: rule__InputCombo__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6_2__0_in_rule__InputCombo__Group_6__2__Impl6367);
            	    rule__InputCombo__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getInputComboAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6__2__Impl"


    // $ANTLR start "rule__InputCombo__Group_6__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3167:1: rule__InputCombo__Group_6__3 : rule__InputCombo__Group_6__3__Impl ;
    public final void rule__InputCombo__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3171:1: ( rule__InputCombo__Group_6__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3172:2: rule__InputCombo__Group_6__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__3__Impl_in_rule__InputCombo__Group_6__36398);
            rule__InputCombo__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6__3"


    // $ANTLR start "rule__InputCombo__Group_6__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3178:1: rule__InputCombo__Group_6__3__Impl : ( '}' ) ;
    public final void rule__InputCombo__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3182:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3183:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3183:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3184:1: '}'
            {
             before(grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputCombo__Group_6__3__Impl6426); 
             after(grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6__3__Impl"


    // $ANTLR start "rule__InputCombo__Group_6_2__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3205:1: rule__InputCombo__Group_6_2__0 : rule__InputCombo__Group_6_2__0__Impl rule__InputCombo__Group_6_2__1 ;
    public final void rule__InputCombo__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3209:1: ( rule__InputCombo__Group_6_2__0__Impl rule__InputCombo__Group_6_2__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3210:2: rule__InputCombo__Group_6_2__0__Impl rule__InputCombo__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6_2__0__Impl_in_rule__InputCombo__Group_6_2__06465);
            rule__InputCombo__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6_2__1_in_rule__InputCombo__Group_6_2__06468);
            rule__InputCombo__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6_2__0"


    // $ANTLR start "rule__InputCombo__Group_6_2__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3217:1: rule__InputCombo__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__InputCombo__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3221:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3222:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3222:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3223:1: ','
            {
             before(grammarAccess.getInputComboAccess().getCommaKeyword_6_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__InputCombo__Group_6_2__0__Impl6496); 
             after(grammarAccess.getInputComboAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6_2__0__Impl"


    // $ANTLR start "rule__InputCombo__Group_6_2__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3236:1: rule__InputCombo__Group_6_2__1 : rule__InputCombo__Group_6_2__1__Impl ;
    public final void rule__InputCombo__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3240:1: ( rule__InputCombo__Group_6_2__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3241:2: rule__InputCombo__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6_2__1__Impl_in_rule__InputCombo__Group_6_2__16527);
            rule__InputCombo__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6_2__1"


    // $ANTLR start "rule__InputCombo__Group_6_2__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3247:1: rule__InputCombo__Group_6_2__1__Impl : ( ( rule__InputCombo__ValoresAssignment_6_2_1 ) ) ;
    public final void rule__InputCombo__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3251:1: ( ( ( rule__InputCombo__ValoresAssignment_6_2_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3252:1: ( ( rule__InputCombo__ValoresAssignment_6_2_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3252:1: ( ( rule__InputCombo__ValoresAssignment_6_2_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3253:1: ( rule__InputCombo__ValoresAssignment_6_2_1 )
            {
             before(grammarAccess.getInputComboAccess().getValoresAssignment_6_2_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3254:1: ( rule__InputCombo__ValoresAssignment_6_2_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3254:2: rule__InputCombo__ValoresAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__ValoresAssignment_6_2_1_in_rule__InputCombo__Group_6_2__1__Impl6554);
            rule__InputCombo__ValoresAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInputComboAccess().getValoresAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_6_2__1__Impl"


    // $ANTLR start "rule__InputCombo__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3268:1: rule__InputCombo__Group_7__0 : rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1 ;
    public final void rule__InputCombo__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3272:1: ( rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3273:2: rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__0__Impl_in_rule__InputCombo__Group_7__06588);
            rule__InputCombo__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__1_in_rule__InputCombo__Group_7__06591);
            rule__InputCombo__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_7__0"


    // $ANTLR start "rule__InputCombo__Group_7__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3280:1: rule__InputCombo__Group_7__0__Impl : ( 'inicial' ) ;
    public final void rule__InputCombo__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3284:1: ( ( 'inicial' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3285:1: ( 'inicial' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3285:1: ( 'inicial' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3286:1: 'inicial'
            {
             before(grammarAccess.getInputComboAccess().getInicialKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__InputCombo__Group_7__0__Impl6619); 
             after(grammarAccess.getInputComboAccess().getInicialKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_7__0__Impl"


    // $ANTLR start "rule__InputCombo__Group_7__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3299:1: rule__InputCombo__Group_7__1 : rule__InputCombo__Group_7__1__Impl ;
    public final void rule__InputCombo__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3303:1: ( rule__InputCombo__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3304:2: rule__InputCombo__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__1__Impl_in_rule__InputCombo__Group_7__16650);
            rule__InputCombo__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_7__1"


    // $ANTLR start "rule__InputCombo__Group_7__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3310:1: rule__InputCombo__Group_7__1__Impl : ( ( rule__InputCombo__SeleccionAssignment_7_1 ) ) ;
    public final void rule__InputCombo__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3314:1: ( ( ( rule__InputCombo__SeleccionAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3315:1: ( ( rule__InputCombo__SeleccionAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3315:1: ( ( rule__InputCombo__SeleccionAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3316:1: ( rule__InputCombo__SeleccionAssignment_7_1 )
            {
             before(grammarAccess.getInputComboAccess().getSeleccionAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3317:1: ( rule__InputCombo__SeleccionAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3317:2: rule__InputCombo__SeleccionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__SeleccionAssignment_7_1_in_rule__InputCombo__Group_7__1__Impl6677);
            rule__InputCombo__SeleccionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInputComboAccess().getSeleccionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__Group_7__1__Impl"


    // $ANTLR start "rule__InputCheck__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3331:1: rule__InputCheck__Group__0 : rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1 ;
    public final void rule__InputCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3335:1: ( rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3336:2: rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__0__Impl_in_rule__InputCheck__Group__06711);
            rule__InputCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__1_in_rule__InputCheck__Group__06714);
            rule__InputCheck__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__0"


    // $ANTLR start "rule__InputCheck__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3343:1: rule__InputCheck__Group__0__Impl : ( 'Check' ) ;
    public final void rule__InputCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3347:1: ( ( 'Check' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3348:1: ( 'Check' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3348:1: ( 'Check' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3349:1: 'Check'
            {
             before(grammarAccess.getInputCheckAccess().getCheckKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__InputCheck__Group__0__Impl6742); 
             after(grammarAccess.getInputCheckAccess().getCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__0__Impl"


    // $ANTLR start "rule__InputCheck__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3362:1: rule__InputCheck__Group__1 : rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2 ;
    public final void rule__InputCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3366:1: ( rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3367:2: rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__1__Impl_in_rule__InputCheck__Group__16773);
            rule__InputCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__2_in_rule__InputCheck__Group__16776);
            rule__InputCheck__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__1"


    // $ANTLR start "rule__InputCheck__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3374:1: rule__InputCheck__Group__1__Impl : ( ( rule__InputCheck__InvisibleAssignment_1 )? ) ;
    public final void rule__InputCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3378:1: ( ( ( rule__InputCheck__InvisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3379:1: ( ( rule__InputCheck__InvisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3379:1: ( ( rule__InputCheck__InvisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3380:1: ( rule__InputCheck__InvisibleAssignment_1 )?
            {
             before(grammarAccess.getInputCheckAccess().getInvisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3381:1: ( rule__InputCheck__InvisibleAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3381:2: rule__InputCheck__InvisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__InvisibleAssignment_1_in_rule__InputCheck__Group__1__Impl6803);
                    rule__InputCheck__InvisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputCheckAccess().getInvisibleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__1__Impl"


    // $ANTLR start "rule__InputCheck__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3391:1: rule__InputCheck__Group__2 : rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3 ;
    public final void rule__InputCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3395:1: ( rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3396:2: rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__2__Impl_in_rule__InputCheck__Group__26834);
            rule__InputCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__3_in_rule__InputCheck__Group__26837);
            rule__InputCheck__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__2"


    // $ANTLR start "rule__InputCheck__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3403:1: rule__InputCheck__Group__2__Impl : ( ( rule__InputCheck__DeshabilitadoAssignment_2 )? ) ;
    public final void rule__InputCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3407:1: ( ( ( rule__InputCheck__DeshabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3408:1: ( ( rule__InputCheck__DeshabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3408:1: ( ( rule__InputCheck__DeshabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3409:1: ( rule__InputCheck__DeshabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputCheckAccess().getDeshabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3410:1: ( rule__InputCheck__DeshabilitadoAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==46) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3410:2: rule__InputCheck__DeshabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__DeshabilitadoAssignment_2_in_rule__InputCheck__Group__2__Impl6864);
                    rule__InputCheck__DeshabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputCheckAccess().getDeshabilitadoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__2__Impl"


    // $ANTLR start "rule__InputCheck__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3420:1: rule__InputCheck__Group__3 : rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4 ;
    public final void rule__InputCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3424:1: ( rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3425:2: rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__3__Impl_in_rule__InputCheck__Group__36895);
            rule__InputCheck__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__4_in_rule__InputCheck__Group__36898);
            rule__InputCheck__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__3"


    // $ANTLR start "rule__InputCheck__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3432:1: rule__InputCheck__Group__3__Impl : ( ( rule__InputCheck__NameAssignment_3 ) ) ;
    public final void rule__InputCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3436:1: ( ( ( rule__InputCheck__NameAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3437:1: ( ( rule__InputCheck__NameAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3437:1: ( ( rule__InputCheck__NameAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3438:1: ( rule__InputCheck__NameAssignment_3 )
            {
             before(grammarAccess.getInputCheckAccess().getNameAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3439:1: ( rule__InputCheck__NameAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3439:2: rule__InputCheck__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__NameAssignment_3_in_rule__InputCheck__Group__3__Impl6925);
            rule__InputCheck__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__3__Impl"


    // $ANTLR start "rule__InputCheck__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3449:1: rule__InputCheck__Group__4 : rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5 ;
    public final void rule__InputCheck__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3453:1: ( rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3454:2: rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__4__Impl_in_rule__InputCheck__Group__46955);
            rule__InputCheck__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__5_in_rule__InputCheck__Group__46958);
            rule__InputCheck__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__4"


    // $ANTLR start "rule__InputCheck__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3461:1: rule__InputCheck__Group__4__Impl : ( ':' ) ;
    public final void rule__InputCheck__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3465:1: ( ( ':' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3466:1: ( ':' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3466:1: ( ':' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3467:1: ':'
            {
             before(grammarAccess.getInputCheckAccess().getColonKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__InputCheck__Group__4__Impl6986); 
             after(grammarAccess.getInputCheckAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__4__Impl"


    // $ANTLR start "rule__InputCheck__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3480:1: rule__InputCheck__Group__5 : rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6 ;
    public final void rule__InputCheck__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3484:1: ( rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3485:2: rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__5__Impl_in_rule__InputCheck__Group__57017);
            rule__InputCheck__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__6_in_rule__InputCheck__Group__57020);
            rule__InputCheck__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__5"


    // $ANTLR start "rule__InputCheck__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3492:1: rule__InputCheck__Group__5__Impl : ( ( rule__InputCheck__Group_5__0 )? ) ;
    public final void rule__InputCheck__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3496:1: ( ( ( rule__InputCheck__Group_5__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3497:1: ( ( rule__InputCheck__Group_5__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3497:1: ( ( rule__InputCheck__Group_5__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3498:1: ( rule__InputCheck__Group_5__0 )?
            {
             before(grammarAccess.getInputCheckAccess().getGroup_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3499:1: ( rule__InputCheck__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==12) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3499:2: rule__InputCheck__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5__0_in_rule__InputCheck__Group__5__Impl7047);
                    rule__InputCheck__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputCheckAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__5__Impl"


    // $ANTLR start "rule__InputCheck__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3509:1: rule__InputCheck__Group__6 : rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7 ;
    public final void rule__InputCheck__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3513:1: ( rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3514:2: rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__6__Impl_in_rule__InputCheck__Group__67078);
            rule__InputCheck__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__7_in_rule__InputCheck__Group__67081);
            rule__InputCheck__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__6"


    // $ANTLR start "rule__InputCheck__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3521:1: rule__InputCheck__Group__6__Impl : ( ( rule__InputCheck__Group_6__0 )? ) ;
    public final void rule__InputCheck__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3525:1: ( ( ( rule__InputCheck__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3526:1: ( ( rule__InputCheck__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3526:1: ( ( rule__InputCheck__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3527:1: ( rule__InputCheck__Group_6__0 )?
            {
             before(grammarAccess.getInputCheckAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3528:1: ( rule__InputCheck__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3528:2: rule__InputCheck__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__0_in_rule__InputCheck__Group__6__Impl7108);
                    rule__InputCheck__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputCheckAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__6__Impl"


    // $ANTLR start "rule__InputCheck__Group__7"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3538:1: rule__InputCheck__Group__7 : rule__InputCheck__Group__7__Impl ;
    public final void rule__InputCheck__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3542:1: ( rule__InputCheck__Group__7__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3543:2: rule__InputCheck__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__7__Impl_in_rule__InputCheck__Group__77139);
            rule__InputCheck__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__7"


    // $ANTLR start "rule__InputCheck__Group__7__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3549:1: rule__InputCheck__Group__7__Impl : ( ( rule__InputCheck__Group_7__0 )? ) ;
    public final void rule__InputCheck__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3553:1: ( ( ( rule__InputCheck__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3554:1: ( ( rule__InputCheck__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3554:1: ( ( rule__InputCheck__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3555:1: ( rule__InputCheck__Group_7__0 )?
            {
             before(grammarAccess.getInputCheckAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3556:1: ( rule__InputCheck__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3556:2: rule__InputCheck__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__0_in_rule__InputCheck__Group__7__Impl7166);
                    rule__InputCheck__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputCheckAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__7__Impl"


    // $ANTLR start "rule__InputCheck__Group_5__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3582:1: rule__InputCheck__Group_5__0 : rule__InputCheck__Group_5__0__Impl rule__InputCheck__Group_5__1 ;
    public final void rule__InputCheck__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3586:1: ( rule__InputCheck__Group_5__0__Impl rule__InputCheck__Group_5__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3587:2: rule__InputCheck__Group_5__0__Impl rule__InputCheck__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5__0__Impl_in_rule__InputCheck__Group_5__07213);
            rule__InputCheck__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5__1_in_rule__InputCheck__Group_5__07216);
            rule__InputCheck__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5__0"


    // $ANTLR start "rule__InputCheck__Group_5__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3594:1: rule__InputCheck__Group_5__0__Impl : ( '{' ) ;
    public final void rule__InputCheck__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3598:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3599:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3599:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3600:1: '{'
            {
             before(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCheck__Group_5__0__Impl7244); 
             after(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5__0__Impl"


    // $ANTLR start "rule__InputCheck__Group_5__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3613:1: rule__InputCheck__Group_5__1 : rule__InputCheck__Group_5__1__Impl rule__InputCheck__Group_5__2 ;
    public final void rule__InputCheck__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3617:1: ( rule__InputCheck__Group_5__1__Impl rule__InputCheck__Group_5__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3618:2: rule__InputCheck__Group_5__1__Impl rule__InputCheck__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5__1__Impl_in_rule__InputCheck__Group_5__17275);
            rule__InputCheck__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5__2_in_rule__InputCheck__Group_5__17278);
            rule__InputCheck__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5__1"


    // $ANTLR start "rule__InputCheck__Group_5__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3625:1: rule__InputCheck__Group_5__1__Impl : ( ( rule__InputCheck__ValoresAssignment_5_1 ) ) ;
    public final void rule__InputCheck__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3629:1: ( ( ( rule__InputCheck__ValoresAssignment_5_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3630:1: ( ( rule__InputCheck__ValoresAssignment_5_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3630:1: ( ( rule__InputCheck__ValoresAssignment_5_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3631:1: ( rule__InputCheck__ValoresAssignment_5_1 )
            {
             before(grammarAccess.getInputCheckAccess().getValoresAssignment_5_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3632:1: ( rule__InputCheck__ValoresAssignment_5_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3632:2: rule__InputCheck__ValoresAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__ValoresAssignment_5_1_in_rule__InputCheck__Group_5__1__Impl7305);
            rule__InputCheck__ValoresAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getValoresAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5__1__Impl"


    // $ANTLR start "rule__InputCheck__Group_5__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3642:1: rule__InputCheck__Group_5__2 : rule__InputCheck__Group_5__2__Impl rule__InputCheck__Group_5__3 ;
    public final void rule__InputCheck__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3646:1: ( rule__InputCheck__Group_5__2__Impl rule__InputCheck__Group_5__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3647:2: rule__InputCheck__Group_5__2__Impl rule__InputCheck__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5__2__Impl_in_rule__InputCheck__Group_5__27335);
            rule__InputCheck__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5__3_in_rule__InputCheck__Group_5__27338);
            rule__InputCheck__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5__2"


    // $ANTLR start "rule__InputCheck__Group_5__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3654:1: rule__InputCheck__Group_5__2__Impl : ( ( rule__InputCheck__Group_5_2__0 )* ) ;
    public final void rule__InputCheck__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3658:1: ( ( ( rule__InputCheck__Group_5_2__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3659:1: ( ( rule__InputCheck__Group_5_2__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3659:1: ( ( rule__InputCheck__Group_5_2__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3660:1: ( rule__InputCheck__Group_5_2__0 )*
            {
             before(grammarAccess.getInputCheckAccess().getGroup_5_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3661:1: ( rule__InputCheck__Group_5_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==19) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3661:2: rule__InputCheck__Group_5_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5_2__0_in_rule__InputCheck__Group_5__2__Impl7365);
            	    rule__InputCheck__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getInputCheckAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5__2__Impl"


    // $ANTLR start "rule__InputCheck__Group_5__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3671:1: rule__InputCheck__Group_5__3 : rule__InputCheck__Group_5__3__Impl ;
    public final void rule__InputCheck__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3675:1: ( rule__InputCheck__Group_5__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3676:2: rule__InputCheck__Group_5__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5__3__Impl_in_rule__InputCheck__Group_5__37396);
            rule__InputCheck__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5__3"


    // $ANTLR start "rule__InputCheck__Group_5__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3682:1: rule__InputCheck__Group_5__3__Impl : ( '}' ) ;
    public final void rule__InputCheck__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3686:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3687:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3687:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3688:1: '}'
            {
             before(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputCheck__Group_5__3__Impl7424); 
             after(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5__3__Impl"


    // $ANTLR start "rule__InputCheck__Group_5_2__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3709:1: rule__InputCheck__Group_5_2__0 : rule__InputCheck__Group_5_2__0__Impl rule__InputCheck__Group_5_2__1 ;
    public final void rule__InputCheck__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3713:1: ( rule__InputCheck__Group_5_2__0__Impl rule__InputCheck__Group_5_2__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3714:2: rule__InputCheck__Group_5_2__0__Impl rule__InputCheck__Group_5_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5_2__0__Impl_in_rule__InputCheck__Group_5_2__07463);
            rule__InputCheck__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5_2__1_in_rule__InputCheck__Group_5_2__07466);
            rule__InputCheck__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5_2__0"


    // $ANTLR start "rule__InputCheck__Group_5_2__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3721:1: rule__InputCheck__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__InputCheck__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3725:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3726:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3726:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3727:1: ','
            {
             before(grammarAccess.getInputCheckAccess().getCommaKeyword_5_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__InputCheck__Group_5_2__0__Impl7494); 
             after(grammarAccess.getInputCheckAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5_2__0__Impl"


    // $ANTLR start "rule__InputCheck__Group_5_2__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3740:1: rule__InputCheck__Group_5_2__1 : rule__InputCheck__Group_5_2__1__Impl ;
    public final void rule__InputCheck__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3744:1: ( rule__InputCheck__Group_5_2__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3745:2: rule__InputCheck__Group_5_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_5_2__1__Impl_in_rule__InputCheck__Group_5_2__17525);
            rule__InputCheck__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5_2__1"


    // $ANTLR start "rule__InputCheck__Group_5_2__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3751:1: rule__InputCheck__Group_5_2__1__Impl : ( ( rule__InputCheck__ValoresAssignment_5_2_1 ) ) ;
    public final void rule__InputCheck__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3755:1: ( ( ( rule__InputCheck__ValoresAssignment_5_2_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3756:1: ( ( rule__InputCheck__ValoresAssignment_5_2_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3756:1: ( ( rule__InputCheck__ValoresAssignment_5_2_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3757:1: ( rule__InputCheck__ValoresAssignment_5_2_1 )
            {
             before(grammarAccess.getInputCheckAccess().getValoresAssignment_5_2_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3758:1: ( rule__InputCheck__ValoresAssignment_5_2_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3758:2: rule__InputCheck__ValoresAssignment_5_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__ValoresAssignment_5_2_1_in_rule__InputCheck__Group_5_2__1__Impl7552);
            rule__InputCheck__ValoresAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getValoresAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_5_2__1__Impl"


    // $ANTLR start "rule__InputCheck__Group_6__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3772:1: rule__InputCheck__Group_6__0 : rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1 ;
    public final void rule__InputCheck__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3776:1: ( rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3777:2: rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__0__Impl_in_rule__InputCheck__Group_6__07586);
            rule__InputCheck__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__1_in_rule__InputCheck__Group_6__07589);
            rule__InputCheck__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__0"


    // $ANTLR start "rule__InputCheck__Group_6__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3784:1: rule__InputCheck__Group_6__0__Impl : ( 'iniciales' ) ;
    public final void rule__InputCheck__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3788:1: ( ( 'iniciales' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3789:1: ( 'iniciales' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3789:1: ( 'iniciales' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3790:1: 'iniciales'
            {
             before(grammarAccess.getInputCheckAccess().getInicialesKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__InputCheck__Group_6__0__Impl7617); 
             after(grammarAccess.getInputCheckAccess().getInicialesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__0__Impl"


    // $ANTLR start "rule__InputCheck__Group_6__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3803:1: rule__InputCheck__Group_6__1 : rule__InputCheck__Group_6__1__Impl rule__InputCheck__Group_6__2 ;
    public final void rule__InputCheck__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3807:1: ( rule__InputCheck__Group_6__1__Impl rule__InputCheck__Group_6__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3808:2: rule__InputCheck__Group_6__1__Impl rule__InputCheck__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__1__Impl_in_rule__InputCheck__Group_6__17648);
            rule__InputCheck__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__2_in_rule__InputCheck__Group_6__17651);
            rule__InputCheck__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__1"


    // $ANTLR start "rule__InputCheck__Group_6__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3815:1: rule__InputCheck__Group_6__1__Impl : ( '{' ) ;
    public final void rule__InputCheck__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3819:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3820:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3820:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3821:1: '{'
            {
             before(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCheck__Group_6__1__Impl7679); 
             after(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__1__Impl"


    // $ANTLR start "rule__InputCheck__Group_6__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3834:1: rule__InputCheck__Group_6__2 : rule__InputCheck__Group_6__2__Impl rule__InputCheck__Group_6__3 ;
    public final void rule__InputCheck__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3838:1: ( rule__InputCheck__Group_6__2__Impl rule__InputCheck__Group_6__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3839:2: rule__InputCheck__Group_6__2__Impl rule__InputCheck__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__2__Impl_in_rule__InputCheck__Group_6__27710);
            rule__InputCheck__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__3_in_rule__InputCheck__Group_6__27713);
            rule__InputCheck__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__2"


    // $ANTLR start "rule__InputCheck__Group_6__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3846:1: rule__InputCheck__Group_6__2__Impl : ( ( rule__InputCheck__SeleccionAssignment_6_2 ) ) ;
    public final void rule__InputCheck__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3850:1: ( ( ( rule__InputCheck__SeleccionAssignment_6_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3851:1: ( ( rule__InputCheck__SeleccionAssignment_6_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3851:1: ( ( rule__InputCheck__SeleccionAssignment_6_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3852:1: ( rule__InputCheck__SeleccionAssignment_6_2 )
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionAssignment_6_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3853:1: ( rule__InputCheck__SeleccionAssignment_6_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3853:2: rule__InputCheck__SeleccionAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__SeleccionAssignment_6_2_in_rule__InputCheck__Group_6__2__Impl7740);
            rule__InputCheck__SeleccionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getSeleccionAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__2__Impl"


    // $ANTLR start "rule__InputCheck__Group_6__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3863:1: rule__InputCheck__Group_6__3 : rule__InputCheck__Group_6__3__Impl rule__InputCheck__Group_6__4 ;
    public final void rule__InputCheck__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3867:1: ( rule__InputCheck__Group_6__3__Impl rule__InputCheck__Group_6__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3868:2: rule__InputCheck__Group_6__3__Impl rule__InputCheck__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__3__Impl_in_rule__InputCheck__Group_6__37770);
            rule__InputCheck__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__4_in_rule__InputCheck__Group_6__37773);
            rule__InputCheck__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__3"


    // $ANTLR start "rule__InputCheck__Group_6__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3875:1: rule__InputCheck__Group_6__3__Impl : ( ( rule__InputCheck__Group_6_3__0 )* ) ;
    public final void rule__InputCheck__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3879:1: ( ( ( rule__InputCheck__Group_6_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3880:1: ( ( rule__InputCheck__Group_6_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3880:1: ( ( rule__InputCheck__Group_6_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3881:1: ( rule__InputCheck__Group_6_3__0 )*
            {
             before(grammarAccess.getInputCheckAccess().getGroup_6_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3882:1: ( rule__InputCheck__Group_6_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==19) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3882:2: rule__InputCheck__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6_3__0_in_rule__InputCheck__Group_6__3__Impl7800);
            	    rule__InputCheck__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getInputCheckAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__3__Impl"


    // $ANTLR start "rule__InputCheck__Group_6__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3892:1: rule__InputCheck__Group_6__4 : rule__InputCheck__Group_6__4__Impl ;
    public final void rule__InputCheck__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3896:1: ( rule__InputCheck__Group_6__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3897:2: rule__InputCheck__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__4__Impl_in_rule__InputCheck__Group_6__47831);
            rule__InputCheck__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__4"


    // $ANTLR start "rule__InputCheck__Group_6__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3903:1: rule__InputCheck__Group_6__4__Impl : ( '}' ) ;
    public final void rule__InputCheck__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3907:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3908:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3908:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3909:1: '}'
            {
             before(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputCheck__Group_6__4__Impl7859); 
             after(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6__4__Impl"


    // $ANTLR start "rule__InputCheck__Group_6_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3932:1: rule__InputCheck__Group_6_3__0 : rule__InputCheck__Group_6_3__0__Impl rule__InputCheck__Group_6_3__1 ;
    public final void rule__InputCheck__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3936:1: ( rule__InputCheck__Group_6_3__0__Impl rule__InputCheck__Group_6_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3937:2: rule__InputCheck__Group_6_3__0__Impl rule__InputCheck__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6_3__0__Impl_in_rule__InputCheck__Group_6_3__07900);
            rule__InputCheck__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6_3__1_in_rule__InputCheck__Group_6_3__07903);
            rule__InputCheck__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6_3__0"


    // $ANTLR start "rule__InputCheck__Group_6_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3944:1: rule__InputCheck__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__InputCheck__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3948:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3949:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3949:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3950:1: ','
            {
             before(grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__InputCheck__Group_6_3__0__Impl7931); 
             after(grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6_3__0__Impl"


    // $ANTLR start "rule__InputCheck__Group_6_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3963:1: rule__InputCheck__Group_6_3__1 : rule__InputCheck__Group_6_3__1__Impl ;
    public final void rule__InputCheck__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3967:1: ( rule__InputCheck__Group_6_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3968:2: rule__InputCheck__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6_3__1__Impl_in_rule__InputCheck__Group_6_3__17962);
            rule__InputCheck__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6_3__1"


    // $ANTLR start "rule__InputCheck__Group_6_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3974:1: rule__InputCheck__Group_6_3__1__Impl : ( ( rule__InputCheck__SeleccionAssignment_6_3_1 ) ) ;
    public final void rule__InputCheck__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3978:1: ( ( ( rule__InputCheck__SeleccionAssignment_6_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3979:1: ( ( rule__InputCheck__SeleccionAssignment_6_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3979:1: ( ( rule__InputCheck__SeleccionAssignment_6_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3980:1: ( rule__InputCheck__SeleccionAssignment_6_3_1 )
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionAssignment_6_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3981:1: ( rule__InputCheck__SeleccionAssignment_6_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3981:2: rule__InputCheck__SeleccionAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__SeleccionAssignment_6_3_1_in_rule__InputCheck__Group_6_3__1__Impl7989);
            rule__InputCheck__SeleccionAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getSeleccionAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_6_3__1__Impl"


    // $ANTLR start "rule__InputCheck__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3995:1: rule__InputCheck__Group_7__0 : rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1 ;
    public final void rule__InputCheck__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3999:1: ( rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4000:2: rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__0__Impl_in_rule__InputCheck__Group_7__08023);
            rule__InputCheck__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__1_in_rule__InputCheck__Group_7__08026);
            rule__InputCheck__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_7__0"


    // $ANTLR start "rule__InputCheck__Group_7__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4007:1: rule__InputCheck__Group_7__0__Impl : ( 'Reaccion' ) ;
    public final void rule__InputCheck__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4011:1: ( ( 'Reaccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4012:1: ( 'Reaccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4012:1: ( 'Reaccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4013:1: 'Reaccion'
            {
             before(grammarAccess.getInputCheckAccess().getReaccionKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__InputCheck__Group_7__0__Impl8054); 
             after(grammarAccess.getInputCheckAccess().getReaccionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_7__0__Impl"


    // $ANTLR start "rule__InputCheck__Group_7__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4026:1: rule__InputCheck__Group_7__1 : rule__InputCheck__Group_7__1__Impl ;
    public final void rule__InputCheck__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4030:1: ( rule__InputCheck__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4031:2: rule__InputCheck__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__1__Impl_in_rule__InputCheck__Group_7__18085);
            rule__InputCheck__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_7__1"


    // $ANTLR start "rule__InputCheck__Group_7__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4037:1: rule__InputCheck__Group_7__1__Impl : ( ( rule__InputCheck__ReaccionAssignment_7_1 ) ) ;
    public final void rule__InputCheck__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4041:1: ( ( ( rule__InputCheck__ReaccionAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4042:1: ( ( rule__InputCheck__ReaccionAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4042:1: ( ( rule__InputCheck__ReaccionAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4043:1: ( rule__InputCheck__ReaccionAssignment_7_1 )
            {
             before(grammarAccess.getInputCheckAccess().getReaccionAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4044:1: ( rule__InputCheck__ReaccionAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4044:2: rule__InputCheck__ReaccionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__ReaccionAssignment_7_1_in_rule__InputCheck__Group_7__1__Impl8112);
            rule__InputCheck__ReaccionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getReaccionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group_7__1__Impl"


    // $ANTLR start "rule__BotonValidar__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4058:1: rule__BotonValidar__Group__0 : rule__BotonValidar__Group__0__Impl rule__BotonValidar__Group__1 ;
    public final void rule__BotonValidar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4062:1: ( rule__BotonValidar__Group__0__Impl rule__BotonValidar__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4063:2: rule__BotonValidar__Group__0__Impl rule__BotonValidar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__0__Impl_in_rule__BotonValidar__Group__08146);
            rule__BotonValidar__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__1_in_rule__BotonValidar__Group__08149);
            rule__BotonValidar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__0"


    // $ANTLR start "rule__BotonValidar__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4070:1: rule__BotonValidar__Group__0__Impl : ( () ) ;
    public final void rule__BotonValidar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4074:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4075:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4075:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4076:1: ()
            {
             before(grammarAccess.getBotonValidarAccess().getBotonValidarAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4077:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4079:1: 
            {
            }

             after(grammarAccess.getBotonValidarAccess().getBotonValidarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__0__Impl"


    // $ANTLR start "rule__BotonValidar__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4089:1: rule__BotonValidar__Group__1 : rule__BotonValidar__Group__1__Impl rule__BotonValidar__Group__2 ;
    public final void rule__BotonValidar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4093:1: ( rule__BotonValidar__Group__1__Impl rule__BotonValidar__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4094:2: rule__BotonValidar__Group__1__Impl rule__BotonValidar__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__1__Impl_in_rule__BotonValidar__Group__18207);
            rule__BotonValidar__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__2_in_rule__BotonValidar__Group__18210);
            rule__BotonValidar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__1"


    // $ANTLR start "rule__BotonValidar__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4101:1: rule__BotonValidar__Group__1__Impl : ( 'BotonValidar' ) ;
    public final void rule__BotonValidar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4105:1: ( ( 'BotonValidar' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4106:1: ( 'BotonValidar' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4106:1: ( 'BotonValidar' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4107:1: 'BotonValidar'
            {
             before(grammarAccess.getBotonValidarAccess().getBotonValidarKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__BotonValidar__Group__1__Impl8238); 
             after(grammarAccess.getBotonValidarAccess().getBotonValidarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__1__Impl"


    // $ANTLR start "rule__BotonValidar__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4120:1: rule__BotonValidar__Group__2 : rule__BotonValidar__Group__2__Impl rule__BotonValidar__Group__3 ;
    public final void rule__BotonValidar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4124:1: ( rule__BotonValidar__Group__2__Impl rule__BotonValidar__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4125:2: rule__BotonValidar__Group__2__Impl rule__BotonValidar__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__2__Impl_in_rule__BotonValidar__Group__28269);
            rule__BotonValidar__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__3_in_rule__BotonValidar__Group__28272);
            rule__BotonValidar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__2"


    // $ANTLR start "rule__BotonValidar__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4132:1: rule__BotonValidar__Group__2__Impl : ( ( rule__BotonValidar__InvisibleAssignment_2 )? ) ;
    public final void rule__BotonValidar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4136:1: ( ( ( rule__BotonValidar__InvisibleAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4137:1: ( ( rule__BotonValidar__InvisibleAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4137:1: ( ( rule__BotonValidar__InvisibleAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4138:1: ( rule__BotonValidar__InvisibleAssignment_2 )?
            {
             before(grammarAccess.getBotonValidarAccess().getInvisibleAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4139:1: ( rule__BotonValidar__InvisibleAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4139:2: rule__BotonValidar__InvisibleAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__InvisibleAssignment_2_in_rule__BotonValidar__Group__2__Impl8299);
                    rule__BotonValidar__InvisibleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBotonValidarAccess().getInvisibleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__2__Impl"


    // $ANTLR start "rule__BotonValidar__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4149:1: rule__BotonValidar__Group__3 : rule__BotonValidar__Group__3__Impl rule__BotonValidar__Group__4 ;
    public final void rule__BotonValidar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4153:1: ( rule__BotonValidar__Group__3__Impl rule__BotonValidar__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4154:2: rule__BotonValidar__Group__3__Impl rule__BotonValidar__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__3__Impl_in_rule__BotonValidar__Group__38330);
            rule__BotonValidar__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__4_in_rule__BotonValidar__Group__38333);
            rule__BotonValidar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__3"


    // $ANTLR start "rule__BotonValidar__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4161:1: rule__BotonValidar__Group__3__Impl : ( ( rule__BotonValidar__DeshabilitadoAssignment_3 )? ) ;
    public final void rule__BotonValidar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4165:1: ( ( ( rule__BotonValidar__DeshabilitadoAssignment_3 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4166:1: ( ( rule__BotonValidar__DeshabilitadoAssignment_3 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4166:1: ( ( rule__BotonValidar__DeshabilitadoAssignment_3 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4167:1: ( rule__BotonValidar__DeshabilitadoAssignment_3 )?
            {
             before(grammarAccess.getBotonValidarAccess().getDeshabilitadoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4168:1: ( rule__BotonValidar__DeshabilitadoAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4168:2: rule__BotonValidar__DeshabilitadoAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__DeshabilitadoAssignment_3_in_rule__BotonValidar__Group__3__Impl8360);
                    rule__BotonValidar__DeshabilitadoAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBotonValidarAccess().getDeshabilitadoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__3__Impl"


    // $ANTLR start "rule__BotonValidar__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4178:1: rule__BotonValidar__Group__4 : rule__BotonValidar__Group__4__Impl ;
    public final void rule__BotonValidar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4182:1: ( rule__BotonValidar__Group__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4183:2: rule__BotonValidar__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__Group__4__Impl_in_rule__BotonValidar__Group__48391);
            rule__BotonValidar__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__4"


    // $ANTLR start "rule__BotonValidar__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4189:1: rule__BotonValidar__Group__4__Impl : ( ( rule__BotonValidar__NameAssignment_4 ) ) ;
    public final void rule__BotonValidar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4193:1: ( ( ( rule__BotonValidar__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4194:1: ( ( rule__BotonValidar__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4194:1: ( ( rule__BotonValidar__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4195:1: ( rule__BotonValidar__NameAssignment_4 )
            {
             before(grammarAccess.getBotonValidarAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4196:1: ( rule__BotonValidar__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4196:2: rule__BotonValidar__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonValidar__NameAssignment_4_in_rule__BotonValidar__Group__4__Impl8418);
            rule__BotonValidar__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBotonValidarAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__Group__4__Impl"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4216:1: rule__BotonGuardar_Impl__Group__0 : rule__BotonGuardar_Impl__Group__0__Impl rule__BotonGuardar_Impl__Group__1 ;
    public final void rule__BotonGuardar_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4220:1: ( rule__BotonGuardar_Impl__Group__0__Impl rule__BotonGuardar_Impl__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4221:2: rule__BotonGuardar_Impl__Group__0__Impl rule__BotonGuardar_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__0__Impl_in_rule__BotonGuardar_Impl__Group__08458);
            rule__BotonGuardar_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__1_in_rule__BotonGuardar_Impl__Group__08461);
            rule__BotonGuardar_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__0"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4228:1: rule__BotonGuardar_Impl__Group__0__Impl : ( () ) ;
    public final void rule__BotonGuardar_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4232:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4233:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4233:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4234:1: ()
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4235:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4237:1: 
            {
            }

             after(grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__0__Impl"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4247:1: rule__BotonGuardar_Impl__Group__1 : rule__BotonGuardar_Impl__Group__1__Impl rule__BotonGuardar_Impl__Group__2 ;
    public final void rule__BotonGuardar_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4251:1: ( rule__BotonGuardar_Impl__Group__1__Impl rule__BotonGuardar_Impl__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4252:2: rule__BotonGuardar_Impl__Group__1__Impl rule__BotonGuardar_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__1__Impl_in_rule__BotonGuardar_Impl__Group__18519);
            rule__BotonGuardar_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__2_in_rule__BotonGuardar_Impl__Group__18522);
            rule__BotonGuardar_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__1"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4259:1: rule__BotonGuardar_Impl__Group__1__Impl : ( 'BotonGuardar' ) ;
    public final void rule__BotonGuardar_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4263:1: ( ( 'BotonGuardar' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4264:1: ( 'BotonGuardar' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4264:1: ( 'BotonGuardar' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4265:1: 'BotonGuardar'
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__BotonGuardar_Impl__Group__1__Impl8550); 
             after(grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__1__Impl"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4278:1: rule__BotonGuardar_Impl__Group__2 : rule__BotonGuardar_Impl__Group__2__Impl rule__BotonGuardar_Impl__Group__3 ;
    public final void rule__BotonGuardar_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4282:1: ( rule__BotonGuardar_Impl__Group__2__Impl rule__BotonGuardar_Impl__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4283:2: rule__BotonGuardar_Impl__Group__2__Impl rule__BotonGuardar_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__2__Impl_in_rule__BotonGuardar_Impl__Group__28581);
            rule__BotonGuardar_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__3_in_rule__BotonGuardar_Impl__Group__28584);
            rule__BotonGuardar_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__2"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4290:1: rule__BotonGuardar_Impl__Group__2__Impl : ( ( rule__BotonGuardar_Impl__InvisibleAssignment_2 )? ) ;
    public final void rule__BotonGuardar_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4294:1: ( ( ( rule__BotonGuardar_Impl__InvisibleAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4295:1: ( ( rule__BotonGuardar_Impl__InvisibleAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4295:1: ( ( rule__BotonGuardar_Impl__InvisibleAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4296:1: ( rule__BotonGuardar_Impl__InvisibleAssignment_2 )?
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getInvisibleAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4297:1: ( rule__BotonGuardar_Impl__InvisibleAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4297:2: rule__BotonGuardar_Impl__InvisibleAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__InvisibleAssignment_2_in_rule__BotonGuardar_Impl__Group__2__Impl8611);
                    rule__BotonGuardar_Impl__InvisibleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBotonGuardar_ImplAccess().getInvisibleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__2__Impl"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4307:1: rule__BotonGuardar_Impl__Group__3 : rule__BotonGuardar_Impl__Group__3__Impl rule__BotonGuardar_Impl__Group__4 ;
    public final void rule__BotonGuardar_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4311:1: ( rule__BotonGuardar_Impl__Group__3__Impl rule__BotonGuardar_Impl__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4312:2: rule__BotonGuardar_Impl__Group__3__Impl rule__BotonGuardar_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__3__Impl_in_rule__BotonGuardar_Impl__Group__38642);
            rule__BotonGuardar_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__4_in_rule__BotonGuardar_Impl__Group__38645);
            rule__BotonGuardar_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__3"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4319:1: rule__BotonGuardar_Impl__Group__3__Impl : ( ( rule__BotonGuardar_Impl__DeshabilitadoAssignment_3 )? ) ;
    public final void rule__BotonGuardar_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4323:1: ( ( ( rule__BotonGuardar_Impl__DeshabilitadoAssignment_3 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4324:1: ( ( rule__BotonGuardar_Impl__DeshabilitadoAssignment_3 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4324:1: ( ( rule__BotonGuardar_Impl__DeshabilitadoAssignment_3 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4325:1: ( rule__BotonGuardar_Impl__DeshabilitadoAssignment_3 )?
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getDeshabilitadoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4326:1: ( rule__BotonGuardar_Impl__DeshabilitadoAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4326:2: rule__BotonGuardar_Impl__DeshabilitadoAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__DeshabilitadoAssignment_3_in_rule__BotonGuardar_Impl__Group__3__Impl8672);
                    rule__BotonGuardar_Impl__DeshabilitadoAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBotonGuardar_ImplAccess().getDeshabilitadoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__3__Impl"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4336:1: rule__BotonGuardar_Impl__Group__4 : rule__BotonGuardar_Impl__Group__4__Impl ;
    public final void rule__BotonGuardar_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4340:1: ( rule__BotonGuardar_Impl__Group__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4341:2: rule__BotonGuardar_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__Group__4__Impl_in_rule__BotonGuardar_Impl__Group__48703);
            rule__BotonGuardar_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__4"


    // $ANTLR start "rule__BotonGuardar_Impl__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4347:1: rule__BotonGuardar_Impl__Group__4__Impl : ( ( rule__BotonGuardar_Impl__NameAssignment_4 ) ) ;
    public final void rule__BotonGuardar_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4351:1: ( ( ( rule__BotonGuardar_Impl__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4352:1: ( ( rule__BotonGuardar_Impl__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4352:1: ( ( rule__BotonGuardar_Impl__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4353:1: ( rule__BotonGuardar_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4354:1: ( rule__BotonGuardar_Impl__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4354:2: rule__BotonGuardar_Impl__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonGuardar_Impl__NameAssignment_4_in_rule__BotonGuardar_Impl__Group__4__Impl8730);
            rule__BotonGuardar_Impl__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBotonGuardar_ImplAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__Group__4__Impl"


    // $ANTLR start "rule__BotonCancelar__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4374:1: rule__BotonCancelar__Group__0 : rule__BotonCancelar__Group__0__Impl rule__BotonCancelar__Group__1 ;
    public final void rule__BotonCancelar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4378:1: ( rule__BotonCancelar__Group__0__Impl rule__BotonCancelar__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4379:2: rule__BotonCancelar__Group__0__Impl rule__BotonCancelar__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__0__Impl_in_rule__BotonCancelar__Group__08770);
            rule__BotonCancelar__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__1_in_rule__BotonCancelar__Group__08773);
            rule__BotonCancelar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__0"


    // $ANTLR start "rule__BotonCancelar__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4386:1: rule__BotonCancelar__Group__0__Impl : ( () ) ;
    public final void rule__BotonCancelar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4390:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4391:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4391:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4392:1: ()
            {
             before(grammarAccess.getBotonCancelarAccess().getBotonCancelarAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4393:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4395:1: 
            {
            }

             after(grammarAccess.getBotonCancelarAccess().getBotonCancelarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__0__Impl"


    // $ANTLR start "rule__BotonCancelar__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4405:1: rule__BotonCancelar__Group__1 : rule__BotonCancelar__Group__1__Impl rule__BotonCancelar__Group__2 ;
    public final void rule__BotonCancelar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4409:1: ( rule__BotonCancelar__Group__1__Impl rule__BotonCancelar__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4410:2: rule__BotonCancelar__Group__1__Impl rule__BotonCancelar__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__1__Impl_in_rule__BotonCancelar__Group__18831);
            rule__BotonCancelar__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__2_in_rule__BotonCancelar__Group__18834);
            rule__BotonCancelar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__1"


    // $ANTLR start "rule__BotonCancelar__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4417:1: rule__BotonCancelar__Group__1__Impl : ( 'BotonCancelar' ) ;
    public final void rule__BotonCancelar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4421:1: ( ( 'BotonCancelar' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4422:1: ( 'BotonCancelar' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4422:1: ( 'BotonCancelar' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4423:1: 'BotonCancelar'
            {
             before(grammarAccess.getBotonCancelarAccess().getBotonCancelarKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__BotonCancelar__Group__1__Impl8862); 
             after(grammarAccess.getBotonCancelarAccess().getBotonCancelarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__1__Impl"


    // $ANTLR start "rule__BotonCancelar__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4436:1: rule__BotonCancelar__Group__2 : rule__BotonCancelar__Group__2__Impl rule__BotonCancelar__Group__3 ;
    public final void rule__BotonCancelar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4440:1: ( rule__BotonCancelar__Group__2__Impl rule__BotonCancelar__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4441:2: rule__BotonCancelar__Group__2__Impl rule__BotonCancelar__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__2__Impl_in_rule__BotonCancelar__Group__28893);
            rule__BotonCancelar__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__3_in_rule__BotonCancelar__Group__28896);
            rule__BotonCancelar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__2"


    // $ANTLR start "rule__BotonCancelar__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4448:1: rule__BotonCancelar__Group__2__Impl : ( ( rule__BotonCancelar__InvisibleAssignment_2 )? ) ;
    public final void rule__BotonCancelar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4452:1: ( ( ( rule__BotonCancelar__InvisibleAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4453:1: ( ( rule__BotonCancelar__InvisibleAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4453:1: ( ( rule__BotonCancelar__InvisibleAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4454:1: ( rule__BotonCancelar__InvisibleAssignment_2 )?
            {
             before(grammarAccess.getBotonCancelarAccess().getInvisibleAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4455:1: ( rule__BotonCancelar__InvisibleAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4455:2: rule__BotonCancelar__InvisibleAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__InvisibleAssignment_2_in_rule__BotonCancelar__Group__2__Impl8923);
                    rule__BotonCancelar__InvisibleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBotonCancelarAccess().getInvisibleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__2__Impl"


    // $ANTLR start "rule__BotonCancelar__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4465:1: rule__BotonCancelar__Group__3 : rule__BotonCancelar__Group__3__Impl rule__BotonCancelar__Group__4 ;
    public final void rule__BotonCancelar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4469:1: ( rule__BotonCancelar__Group__3__Impl rule__BotonCancelar__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4470:2: rule__BotonCancelar__Group__3__Impl rule__BotonCancelar__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__3__Impl_in_rule__BotonCancelar__Group__38954);
            rule__BotonCancelar__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__4_in_rule__BotonCancelar__Group__38957);
            rule__BotonCancelar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__3"


    // $ANTLR start "rule__BotonCancelar__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4477:1: rule__BotonCancelar__Group__3__Impl : ( ( rule__BotonCancelar__DeshabilitadoAssignment_3 )? ) ;
    public final void rule__BotonCancelar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4481:1: ( ( ( rule__BotonCancelar__DeshabilitadoAssignment_3 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4482:1: ( ( rule__BotonCancelar__DeshabilitadoAssignment_3 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4482:1: ( ( rule__BotonCancelar__DeshabilitadoAssignment_3 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4483:1: ( rule__BotonCancelar__DeshabilitadoAssignment_3 )?
            {
             before(grammarAccess.getBotonCancelarAccess().getDeshabilitadoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4484:1: ( rule__BotonCancelar__DeshabilitadoAssignment_3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4484:2: rule__BotonCancelar__DeshabilitadoAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__DeshabilitadoAssignment_3_in_rule__BotonCancelar__Group__3__Impl8984);
                    rule__BotonCancelar__DeshabilitadoAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBotonCancelarAccess().getDeshabilitadoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__3__Impl"


    // $ANTLR start "rule__BotonCancelar__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4494:1: rule__BotonCancelar__Group__4 : rule__BotonCancelar__Group__4__Impl ;
    public final void rule__BotonCancelar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4498:1: ( rule__BotonCancelar__Group__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4499:2: rule__BotonCancelar__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__Group__4__Impl_in_rule__BotonCancelar__Group__49015);
            rule__BotonCancelar__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__4"


    // $ANTLR start "rule__BotonCancelar__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4505:1: rule__BotonCancelar__Group__4__Impl : ( ( rule__BotonCancelar__NameAssignment_4 ) ) ;
    public final void rule__BotonCancelar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4509:1: ( ( ( rule__BotonCancelar__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4510:1: ( ( rule__BotonCancelar__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4510:1: ( ( rule__BotonCancelar__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4511:1: ( rule__BotonCancelar__NameAssignment_4 )
            {
             before(grammarAccess.getBotonCancelarAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4512:1: ( rule__BotonCancelar__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4512:2: rule__BotonCancelar__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCancelar__NameAssignment_4_in_rule__BotonCancelar__Group__4__Impl9042);
            rule__BotonCancelar__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBotonCancelarAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__Group__4__Impl"


    // $ANTLR start "rule__BotonCustom__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4532:1: rule__BotonCustom__Group__0 : rule__BotonCustom__Group__0__Impl rule__BotonCustom__Group__1 ;
    public final void rule__BotonCustom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4536:1: ( rule__BotonCustom__Group__0__Impl rule__BotonCustom__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4537:2: rule__BotonCustom__Group__0__Impl rule__BotonCustom__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__0__Impl_in_rule__BotonCustom__Group__09082);
            rule__BotonCustom__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__1_in_rule__BotonCustom__Group__09085);
            rule__BotonCustom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__0"


    // $ANTLR start "rule__BotonCustom__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4544:1: rule__BotonCustom__Group__0__Impl : ( 'BotonCustom' ) ;
    public final void rule__BotonCustom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4548:1: ( ( 'BotonCustom' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4549:1: ( 'BotonCustom' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4549:1: ( 'BotonCustom' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4550:1: 'BotonCustom'
            {
             before(grammarAccess.getBotonCustomAccess().getBotonCustomKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__BotonCustom__Group__0__Impl9113); 
             after(grammarAccess.getBotonCustomAccess().getBotonCustomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__0__Impl"


    // $ANTLR start "rule__BotonCustom__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4563:1: rule__BotonCustom__Group__1 : rule__BotonCustom__Group__1__Impl rule__BotonCustom__Group__2 ;
    public final void rule__BotonCustom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4567:1: ( rule__BotonCustom__Group__1__Impl rule__BotonCustom__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4568:2: rule__BotonCustom__Group__1__Impl rule__BotonCustom__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__1__Impl_in_rule__BotonCustom__Group__19144);
            rule__BotonCustom__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__2_in_rule__BotonCustom__Group__19147);
            rule__BotonCustom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__1"


    // $ANTLR start "rule__BotonCustom__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4575:1: rule__BotonCustom__Group__1__Impl : ( ( rule__BotonCustom__InvisibleAssignment_1 )? ) ;
    public final void rule__BotonCustom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4579:1: ( ( ( rule__BotonCustom__InvisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4580:1: ( ( rule__BotonCustom__InvisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4580:1: ( ( rule__BotonCustom__InvisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4581:1: ( rule__BotonCustom__InvisibleAssignment_1 )?
            {
             before(grammarAccess.getBotonCustomAccess().getInvisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4582:1: ( rule__BotonCustom__InvisibleAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4582:2: rule__BotonCustom__InvisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__InvisibleAssignment_1_in_rule__BotonCustom__Group__1__Impl9174);
                    rule__BotonCustom__InvisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBotonCustomAccess().getInvisibleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__1__Impl"


    // $ANTLR start "rule__BotonCustom__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4592:1: rule__BotonCustom__Group__2 : rule__BotonCustom__Group__2__Impl rule__BotonCustom__Group__3 ;
    public final void rule__BotonCustom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4596:1: ( rule__BotonCustom__Group__2__Impl rule__BotonCustom__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4597:2: rule__BotonCustom__Group__2__Impl rule__BotonCustom__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__2__Impl_in_rule__BotonCustom__Group__29205);
            rule__BotonCustom__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__3_in_rule__BotonCustom__Group__29208);
            rule__BotonCustom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__2"


    // $ANTLR start "rule__BotonCustom__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4604:1: rule__BotonCustom__Group__2__Impl : ( ( rule__BotonCustom__DeshabilitadoAssignment_2 )? ) ;
    public final void rule__BotonCustom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4608:1: ( ( ( rule__BotonCustom__DeshabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4609:1: ( ( rule__BotonCustom__DeshabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4609:1: ( ( rule__BotonCustom__DeshabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4610:1: ( rule__BotonCustom__DeshabilitadoAssignment_2 )?
            {
             before(grammarAccess.getBotonCustomAccess().getDeshabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4611:1: ( rule__BotonCustom__DeshabilitadoAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4611:2: rule__BotonCustom__DeshabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__DeshabilitadoAssignment_2_in_rule__BotonCustom__Group__2__Impl9235);
                    rule__BotonCustom__DeshabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBotonCustomAccess().getDeshabilitadoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__2__Impl"


    // $ANTLR start "rule__BotonCustom__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4621:1: rule__BotonCustom__Group__3 : rule__BotonCustom__Group__3__Impl rule__BotonCustom__Group__4 ;
    public final void rule__BotonCustom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4625:1: ( rule__BotonCustom__Group__3__Impl rule__BotonCustom__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4626:2: rule__BotonCustom__Group__3__Impl rule__BotonCustom__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__3__Impl_in_rule__BotonCustom__Group__39266);
            rule__BotonCustom__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__4_in_rule__BotonCustom__Group__39269);
            rule__BotonCustom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__3"


    // $ANTLR start "rule__BotonCustom__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4633:1: rule__BotonCustom__Group__3__Impl : ( ( rule__BotonCustom__NameAssignment_3 ) ) ;
    public final void rule__BotonCustom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4637:1: ( ( ( rule__BotonCustom__NameAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4638:1: ( ( rule__BotonCustom__NameAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4638:1: ( ( rule__BotonCustom__NameAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4639:1: ( rule__BotonCustom__NameAssignment_3 )
            {
             before(grammarAccess.getBotonCustomAccess().getNameAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4640:1: ( rule__BotonCustom__NameAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4640:2: rule__BotonCustom__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__NameAssignment_3_in_rule__BotonCustom__Group__3__Impl9296);
            rule__BotonCustom__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBotonCustomAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__3__Impl"


    // $ANTLR start "rule__BotonCustom__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4650:1: rule__BotonCustom__Group__4 : rule__BotonCustom__Group__4__Impl rule__BotonCustom__Group__5 ;
    public final void rule__BotonCustom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4654:1: ( rule__BotonCustom__Group__4__Impl rule__BotonCustom__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4655:2: rule__BotonCustom__Group__4__Impl rule__BotonCustom__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__4__Impl_in_rule__BotonCustom__Group__49326);
            rule__BotonCustom__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__5_in_rule__BotonCustom__Group__49329);
            rule__BotonCustom__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__4"


    // $ANTLR start "rule__BotonCustom__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4662:1: rule__BotonCustom__Group__4__Impl : ( '{' ) ;
    public final void rule__BotonCustom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4666:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4667:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4667:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4668:1: '{'
            {
             before(grammarAccess.getBotonCustomAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BotonCustom__Group__4__Impl9357); 
             after(grammarAccess.getBotonCustomAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__4__Impl"


    // $ANTLR start "rule__BotonCustom__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4681:1: rule__BotonCustom__Group__5 : rule__BotonCustom__Group__5__Impl rule__BotonCustom__Group__6 ;
    public final void rule__BotonCustom__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4685:1: ( rule__BotonCustom__Group__5__Impl rule__BotonCustom__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4686:2: rule__BotonCustom__Group__5__Impl rule__BotonCustom__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__5__Impl_in_rule__BotonCustom__Group__59388);
            rule__BotonCustom__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__6_in_rule__BotonCustom__Group__59391);
            rule__BotonCustom__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__5"


    // $ANTLR start "rule__BotonCustom__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4693:1: rule__BotonCustom__Group__5__Impl : ( ( rule__BotonCustom__FuncionAssignment_5 ) ) ;
    public final void rule__BotonCustom__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4697:1: ( ( ( rule__BotonCustom__FuncionAssignment_5 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4698:1: ( ( rule__BotonCustom__FuncionAssignment_5 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4698:1: ( ( rule__BotonCustom__FuncionAssignment_5 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4699:1: ( rule__BotonCustom__FuncionAssignment_5 )
            {
             before(grammarAccess.getBotonCustomAccess().getFuncionAssignment_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4700:1: ( rule__BotonCustom__FuncionAssignment_5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4700:2: rule__BotonCustom__FuncionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__FuncionAssignment_5_in_rule__BotonCustom__Group__5__Impl9418);
            rule__BotonCustom__FuncionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBotonCustomAccess().getFuncionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__5__Impl"


    // $ANTLR start "rule__BotonCustom__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4710:1: rule__BotonCustom__Group__6 : rule__BotonCustom__Group__6__Impl ;
    public final void rule__BotonCustom__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4714:1: ( rule__BotonCustom__Group__6__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4715:2: rule__BotonCustom__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BotonCustom__Group__6__Impl_in_rule__BotonCustom__Group__69448);
            rule__BotonCustom__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__6"


    // $ANTLR start "rule__BotonCustom__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4721:1: rule__BotonCustom__Group__6__Impl : ( '}' ) ;
    public final void rule__BotonCustom__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4725:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4726:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4726:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4727:1: '}'
            {
             before(grammarAccess.getBotonCustomAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BotonCustom__Group__6__Impl9476); 
             after(grammarAccess.getBotonCustomAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__Group__6__Impl"


    // $ANTLR start "rule__ReaccionVisible__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4754:1: rule__ReaccionVisible__Group__0 : rule__ReaccionVisible__Group__0__Impl rule__ReaccionVisible__Group__1 ;
    public final void rule__ReaccionVisible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4758:1: ( rule__ReaccionVisible__Group__0__Impl rule__ReaccionVisible__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4759:2: rule__ReaccionVisible__Group__0__Impl rule__ReaccionVisible__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__Group__0__Impl_in_rule__ReaccionVisible__Group__09521);
            rule__ReaccionVisible__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__Group__1_in_rule__ReaccionVisible__Group__09524);
            rule__ReaccionVisible__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__Group__0"


    // $ANTLR start "rule__ReaccionVisible__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4766:1: rule__ReaccionVisible__Group__0__Impl : ( 'Visible:' ) ;
    public final void rule__ReaccionVisible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4770:1: ( ( 'Visible:' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4771:1: ( 'Visible:' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4771:1: ( 'Visible:' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4772:1: 'Visible:'
            {
             before(grammarAccess.getReaccionVisibleAccess().getVisibleKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ReaccionVisible__Group__0__Impl9552); 
             after(grammarAccess.getReaccionVisibleAccess().getVisibleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__Group__0__Impl"


    // $ANTLR start "rule__ReaccionVisible__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4785:1: rule__ReaccionVisible__Group__1 : rule__ReaccionVisible__Group__1__Impl rule__ReaccionVisible__Group__2 ;
    public final void rule__ReaccionVisible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4789:1: ( rule__ReaccionVisible__Group__1__Impl rule__ReaccionVisible__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4790:2: rule__ReaccionVisible__Group__1__Impl rule__ReaccionVisible__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__Group__1__Impl_in_rule__ReaccionVisible__Group__19583);
            rule__ReaccionVisible__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__Group__2_in_rule__ReaccionVisible__Group__19586);
            rule__ReaccionVisible__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__Group__1"


    // $ANTLR start "rule__ReaccionVisible__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4797:1: rule__ReaccionVisible__Group__1__Impl : ( ( rule__ReaccionVisible__ActivacionAssignment_1 ) ) ;
    public final void rule__ReaccionVisible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4801:1: ( ( ( rule__ReaccionVisible__ActivacionAssignment_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4802:1: ( ( rule__ReaccionVisible__ActivacionAssignment_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4802:1: ( ( rule__ReaccionVisible__ActivacionAssignment_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4803:1: ( rule__ReaccionVisible__ActivacionAssignment_1 )
            {
             before(grammarAccess.getReaccionVisibleAccess().getActivacionAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4804:1: ( rule__ReaccionVisible__ActivacionAssignment_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4804:2: rule__ReaccionVisible__ActivacionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__ActivacionAssignment_1_in_rule__ReaccionVisible__Group__1__Impl9613);
            rule__ReaccionVisible__ActivacionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReaccionVisibleAccess().getActivacionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__Group__1__Impl"


    // $ANTLR start "rule__ReaccionVisible__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4814:1: rule__ReaccionVisible__Group__2 : rule__ReaccionVisible__Group__2__Impl rule__ReaccionVisible__Group__3 ;
    public final void rule__ReaccionVisible__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4818:1: ( rule__ReaccionVisible__Group__2__Impl rule__ReaccionVisible__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4819:2: rule__ReaccionVisible__Group__2__Impl rule__ReaccionVisible__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__Group__2__Impl_in_rule__ReaccionVisible__Group__29643);
            rule__ReaccionVisible__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__Group__3_in_rule__ReaccionVisible__Group__29646);
            rule__ReaccionVisible__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__Group__2"


    // $ANTLR start "rule__ReaccionVisible__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4826:1: rule__ReaccionVisible__Group__2__Impl : ( '->' ) ;
    public final void rule__ReaccionVisible__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4830:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4831:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4831:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4832:1: '->'
            {
             before(grammarAccess.getReaccionVisibleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ReaccionVisible__Group__2__Impl9674); 
             after(grammarAccess.getReaccionVisibleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__Group__2__Impl"


    // $ANTLR start "rule__ReaccionVisible__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4845:1: rule__ReaccionVisible__Group__3 : rule__ReaccionVisible__Group__3__Impl ;
    public final void rule__ReaccionVisible__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4849:1: ( rule__ReaccionVisible__Group__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4850:2: rule__ReaccionVisible__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__Group__3__Impl_in_rule__ReaccionVisible__Group__39705);
            rule__ReaccionVisible__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__Group__3"


    // $ANTLR start "rule__ReaccionVisible__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4856:1: rule__ReaccionVisible__Group__3__Impl : ( ( rule__ReaccionVisible__ObjetivoAssignment_3 ) ) ;
    public final void rule__ReaccionVisible__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4860:1: ( ( ( rule__ReaccionVisible__ObjetivoAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4861:1: ( ( rule__ReaccionVisible__ObjetivoAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4861:1: ( ( rule__ReaccionVisible__ObjetivoAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4862:1: ( rule__ReaccionVisible__ObjetivoAssignment_3 )
            {
             before(grammarAccess.getReaccionVisibleAccess().getObjetivoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4863:1: ( rule__ReaccionVisible__ObjetivoAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4863:2: rule__ReaccionVisible__ObjetivoAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionVisible__ObjetivoAssignment_3_in_rule__ReaccionVisible__Group__3__Impl9732);
            rule__ReaccionVisible__ObjetivoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReaccionVisibleAccess().getObjetivoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__Group__3__Impl"


    // $ANTLR start "rule__ReaccionHabilitado__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4881:1: rule__ReaccionHabilitado__Group__0 : rule__ReaccionHabilitado__Group__0__Impl rule__ReaccionHabilitado__Group__1 ;
    public final void rule__ReaccionHabilitado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4885:1: ( rule__ReaccionHabilitado__Group__0__Impl rule__ReaccionHabilitado__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4886:2: rule__ReaccionHabilitado__Group__0__Impl rule__ReaccionHabilitado__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__Group__0__Impl_in_rule__ReaccionHabilitado__Group__09770);
            rule__ReaccionHabilitado__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__Group__1_in_rule__ReaccionHabilitado__Group__09773);
            rule__ReaccionHabilitado__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__Group__0"


    // $ANTLR start "rule__ReaccionHabilitado__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4893:1: rule__ReaccionHabilitado__Group__0__Impl : ( 'Deshabilitado:' ) ;
    public final void rule__ReaccionHabilitado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4897:1: ( ( 'Deshabilitado:' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4898:1: ( 'Deshabilitado:' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4898:1: ( 'Deshabilitado:' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4899:1: 'Deshabilitado:'
            {
             before(grammarAccess.getReaccionHabilitadoAccess().getDeshabilitadoKeyword_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ReaccionHabilitado__Group__0__Impl9801); 
             after(grammarAccess.getReaccionHabilitadoAccess().getDeshabilitadoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__Group__0__Impl"


    // $ANTLR start "rule__ReaccionHabilitado__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4912:1: rule__ReaccionHabilitado__Group__1 : rule__ReaccionHabilitado__Group__1__Impl rule__ReaccionHabilitado__Group__2 ;
    public final void rule__ReaccionHabilitado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4916:1: ( rule__ReaccionHabilitado__Group__1__Impl rule__ReaccionHabilitado__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4917:2: rule__ReaccionHabilitado__Group__1__Impl rule__ReaccionHabilitado__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__Group__1__Impl_in_rule__ReaccionHabilitado__Group__19832);
            rule__ReaccionHabilitado__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__Group__2_in_rule__ReaccionHabilitado__Group__19835);
            rule__ReaccionHabilitado__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__Group__1"


    // $ANTLR start "rule__ReaccionHabilitado__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4924:1: rule__ReaccionHabilitado__Group__1__Impl : ( ( rule__ReaccionHabilitado__ActivacionAssignment_1 ) ) ;
    public final void rule__ReaccionHabilitado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4928:1: ( ( ( rule__ReaccionHabilitado__ActivacionAssignment_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4929:1: ( ( rule__ReaccionHabilitado__ActivacionAssignment_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4929:1: ( ( rule__ReaccionHabilitado__ActivacionAssignment_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4930:1: ( rule__ReaccionHabilitado__ActivacionAssignment_1 )
            {
             before(grammarAccess.getReaccionHabilitadoAccess().getActivacionAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4931:1: ( rule__ReaccionHabilitado__ActivacionAssignment_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4931:2: rule__ReaccionHabilitado__ActivacionAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__ActivacionAssignment_1_in_rule__ReaccionHabilitado__Group__1__Impl9862);
            rule__ReaccionHabilitado__ActivacionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReaccionHabilitadoAccess().getActivacionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__Group__1__Impl"


    // $ANTLR start "rule__ReaccionHabilitado__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4941:1: rule__ReaccionHabilitado__Group__2 : rule__ReaccionHabilitado__Group__2__Impl rule__ReaccionHabilitado__Group__3 ;
    public final void rule__ReaccionHabilitado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4945:1: ( rule__ReaccionHabilitado__Group__2__Impl rule__ReaccionHabilitado__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4946:2: rule__ReaccionHabilitado__Group__2__Impl rule__ReaccionHabilitado__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__Group__2__Impl_in_rule__ReaccionHabilitado__Group__29892);
            rule__ReaccionHabilitado__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__Group__3_in_rule__ReaccionHabilitado__Group__29895);
            rule__ReaccionHabilitado__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__Group__2"


    // $ANTLR start "rule__ReaccionHabilitado__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4953:1: rule__ReaccionHabilitado__Group__2__Impl : ( '->' ) ;
    public final void rule__ReaccionHabilitado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4957:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4958:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4958:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4959:1: '->'
            {
             before(grammarAccess.getReaccionHabilitadoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ReaccionHabilitado__Group__2__Impl9923); 
             after(grammarAccess.getReaccionHabilitadoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__Group__2__Impl"


    // $ANTLR start "rule__ReaccionHabilitado__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4972:1: rule__ReaccionHabilitado__Group__3 : rule__ReaccionHabilitado__Group__3__Impl ;
    public final void rule__ReaccionHabilitado__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4976:1: ( rule__ReaccionHabilitado__Group__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4977:2: rule__ReaccionHabilitado__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__Group__3__Impl_in_rule__ReaccionHabilitado__Group__39954);
            rule__ReaccionHabilitado__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__Group__3"


    // $ANTLR start "rule__ReaccionHabilitado__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4983:1: rule__ReaccionHabilitado__Group__3__Impl : ( ( rule__ReaccionHabilitado__ObjetivoAssignment_3 ) ) ;
    public final void rule__ReaccionHabilitado__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4987:1: ( ( ( rule__ReaccionHabilitado__ObjetivoAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4988:1: ( ( rule__ReaccionHabilitado__ObjetivoAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4988:1: ( ( rule__ReaccionHabilitado__ObjetivoAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4989:1: ( rule__ReaccionHabilitado__ObjetivoAssignment_3 )
            {
             before(grammarAccess.getReaccionHabilitadoAccess().getObjetivoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4990:1: ( rule__ReaccionHabilitado__ObjetivoAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4990:2: rule__ReaccionHabilitado__ObjetivoAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ReaccionHabilitado__ObjetivoAssignment_3_in_rule__ReaccionHabilitado__Group__3__Impl9981);
            rule__ReaccionHabilitado__ObjetivoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getReaccionHabilitadoAccess().getObjetivoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__Group__3__Impl"


    // $ANTLR start "rule__AccionValor__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5008:1: rule__AccionValor__Group__0 : rule__AccionValor__Group__0__Impl rule__AccionValor__Group__1 ;
    public final void rule__AccionValor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5012:1: ( rule__AccionValor__Group__0__Impl rule__AccionValor__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5013:2: rule__AccionValor__Group__0__Impl rule__AccionValor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__0__Impl_in_rule__AccionValor__Group__010019);
            rule__AccionValor__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__1_in_rule__AccionValor__Group__010022);
            rule__AccionValor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__0"


    // $ANTLR start "rule__AccionValor__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5020:1: rule__AccionValor__Group__0__Impl : ( 'Accion para Texto' ) ;
    public final void rule__AccionValor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5024:1: ( ( 'Accion para Texto' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5025:1: ( 'Accion para Texto' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5025:1: ( 'Accion para Texto' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5026:1: 'Accion para Texto'
            {
             before(grammarAccess.getAccionValorAccess().getAccionParaTextoKeyword_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__AccionValor__Group__0__Impl10050); 
             after(grammarAccess.getAccionValorAccess().getAccionParaTextoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__0__Impl"


    // $ANTLR start "rule__AccionValor__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5039:1: rule__AccionValor__Group__1 : rule__AccionValor__Group__1__Impl rule__AccionValor__Group__2 ;
    public final void rule__AccionValor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5043:1: ( rule__AccionValor__Group__1__Impl rule__AccionValor__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5044:2: rule__AccionValor__Group__1__Impl rule__AccionValor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__1__Impl_in_rule__AccionValor__Group__110081);
            rule__AccionValor__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__2_in_rule__AccionValor__Group__110084);
            rule__AccionValor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__1"


    // $ANTLR start "rule__AccionValor__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5051:1: rule__AccionValor__Group__1__Impl : ( ( rule__AccionValor__ValorAssignment_1 ) ) ;
    public final void rule__AccionValor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5055:1: ( ( ( rule__AccionValor__ValorAssignment_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5056:1: ( ( rule__AccionValor__ValorAssignment_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5056:1: ( ( rule__AccionValor__ValorAssignment_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5057:1: ( rule__AccionValor__ValorAssignment_1 )
            {
             before(grammarAccess.getAccionValorAccess().getValorAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5058:1: ( rule__AccionValor__ValorAssignment_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5058:2: rule__AccionValor__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__ValorAssignment_1_in_rule__AccionValor__Group__1__Impl10111);
            rule__AccionValor__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccionValorAccess().getValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__1__Impl"


    // $ANTLR start "rule__AccionValor__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5068:1: rule__AccionValor__Group__2 : rule__AccionValor__Group__2__Impl rule__AccionValor__Group__3 ;
    public final void rule__AccionValor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5072:1: ( rule__AccionValor__Group__2__Impl rule__AccionValor__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5073:2: rule__AccionValor__Group__2__Impl rule__AccionValor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__2__Impl_in_rule__AccionValor__Group__210141);
            rule__AccionValor__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__3_in_rule__AccionValor__Group__210144);
            rule__AccionValor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__2"


    // $ANTLR start "rule__AccionValor__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5080:1: rule__AccionValor__Group__2__Impl : ( ':' ) ;
    public final void rule__AccionValor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5084:1: ( ( ':' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5085:1: ( ':' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5085:1: ( ':' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5086:1: ':'
            {
             before(grammarAccess.getAccionValorAccess().getColonKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AccionValor__Group__2__Impl10172); 
             after(grammarAccess.getAccionValorAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__2__Impl"


    // $ANTLR start "rule__AccionValor__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5099:1: rule__AccionValor__Group__3 : rule__AccionValor__Group__3__Impl rule__AccionValor__Group__4 ;
    public final void rule__AccionValor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5103:1: ( rule__AccionValor__Group__3__Impl rule__AccionValor__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5104:2: rule__AccionValor__Group__3__Impl rule__AccionValor__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__3__Impl_in_rule__AccionValor__Group__310203);
            rule__AccionValor__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__4_in_rule__AccionValor__Group__310206);
            rule__AccionValor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__3"


    // $ANTLR start "rule__AccionValor__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5111:1: rule__AccionValor__Group__3__Impl : ( ( rule__AccionValor__ElementoAssignment_3 ) ) ;
    public final void rule__AccionValor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5115:1: ( ( ( rule__AccionValor__ElementoAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5116:1: ( ( rule__AccionValor__ElementoAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5116:1: ( ( rule__AccionValor__ElementoAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5117:1: ( rule__AccionValor__ElementoAssignment_3 )
            {
             before(grammarAccess.getAccionValorAccess().getElementoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5118:1: ( rule__AccionValor__ElementoAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5118:2: rule__AccionValor__ElementoAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__ElementoAssignment_3_in_rule__AccionValor__Group__3__Impl10233);
            rule__AccionValor__ElementoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAccionValorAccess().getElementoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__3__Impl"


    // $ANTLR start "rule__AccionValor__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5128:1: rule__AccionValor__Group__4 : rule__AccionValor__Group__4__Impl rule__AccionValor__Group__5 ;
    public final void rule__AccionValor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5132:1: ( rule__AccionValor__Group__4__Impl rule__AccionValor__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5133:2: rule__AccionValor__Group__4__Impl rule__AccionValor__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__4__Impl_in_rule__AccionValor__Group__410263);
            rule__AccionValor__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__5_in_rule__AccionValor__Group__410266);
            rule__AccionValor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__4"


    // $ANTLR start "rule__AccionValor__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5140:1: rule__AccionValor__Group__4__Impl : ( '->' ) ;
    public final void rule__AccionValor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5144:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5145:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5145:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5146:1: '->'
            {
             before(grammarAccess.getAccionValorAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AccionValor__Group__4__Impl10294); 
             after(grammarAccess.getAccionValorAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__4__Impl"


    // $ANTLR start "rule__AccionValor__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5159:1: rule__AccionValor__Group__5 : rule__AccionValor__Group__5__Impl ;
    public final void rule__AccionValor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5163:1: ( rule__AccionValor__Group__5__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5164:2: rule__AccionValor__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__Group__5__Impl_in_rule__AccionValor__Group__510325);
            rule__AccionValor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__5"


    // $ANTLR start "rule__AccionValor__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5170:1: rule__AccionValor__Group__5__Impl : ( ( rule__AccionValor__AsercionAssignment_5 ) ) ;
    public final void rule__AccionValor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5174:1: ( ( ( rule__AccionValor__AsercionAssignment_5 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5175:1: ( ( rule__AccionValor__AsercionAssignment_5 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5175:1: ( ( rule__AccionValor__AsercionAssignment_5 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5176:1: ( rule__AccionValor__AsercionAssignment_5 )
            {
             before(grammarAccess.getAccionValorAccess().getAsercionAssignment_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5177:1: ( rule__AccionValor__AsercionAssignment_5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5177:2: rule__AccionValor__AsercionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionValor__AsercionAssignment_5_in_rule__AccionValor__Group__5__Impl10352);
            rule__AccionValor__AsercionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAccionValorAccess().getAsercionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__Group__5__Impl"


    // $ANTLR start "rule__AccionSeleccion__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5199:1: rule__AccionSeleccion__Group__0 : rule__AccionSeleccion__Group__0__Impl rule__AccionSeleccion__Group__1 ;
    public final void rule__AccionSeleccion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5203:1: ( rule__AccionSeleccion__Group__0__Impl rule__AccionSeleccion__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5204:2: rule__AccionSeleccion__Group__0__Impl rule__AccionSeleccion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__0__Impl_in_rule__AccionSeleccion__Group__010394);
            rule__AccionSeleccion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__1_in_rule__AccionSeleccion__Group__010397);
            rule__AccionSeleccion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__0"


    // $ANTLR start "rule__AccionSeleccion__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5211:1: rule__AccionSeleccion__Group__0__Impl : ( 'Accion para Seleccion' ) ;
    public final void rule__AccionSeleccion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5215:1: ( ( 'Accion para Seleccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5216:1: ( 'Accion para Seleccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5216:1: ( 'Accion para Seleccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5217:1: 'Accion para Seleccion'
            {
             before(grammarAccess.getAccionSeleccionAccess().getAccionParaSeleccionKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__AccionSeleccion__Group__0__Impl10425); 
             after(grammarAccess.getAccionSeleccionAccess().getAccionParaSeleccionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__0__Impl"


    // $ANTLR start "rule__AccionSeleccion__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5230:1: rule__AccionSeleccion__Group__1 : rule__AccionSeleccion__Group__1__Impl rule__AccionSeleccion__Group__2 ;
    public final void rule__AccionSeleccion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5234:1: ( rule__AccionSeleccion__Group__1__Impl rule__AccionSeleccion__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5235:2: rule__AccionSeleccion__Group__1__Impl rule__AccionSeleccion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__1__Impl_in_rule__AccionSeleccion__Group__110456);
            rule__AccionSeleccion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__2_in_rule__AccionSeleccion__Group__110459);
            rule__AccionSeleccion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__1"


    // $ANTLR start "rule__AccionSeleccion__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5242:1: rule__AccionSeleccion__Group__1__Impl : ( ( rule__AccionSeleccion__ElementoAssignment_1 ) ) ;
    public final void rule__AccionSeleccion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5246:1: ( ( ( rule__AccionSeleccion__ElementoAssignment_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5247:1: ( ( rule__AccionSeleccion__ElementoAssignment_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5247:1: ( ( rule__AccionSeleccion__ElementoAssignment_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5248:1: ( rule__AccionSeleccion__ElementoAssignment_1 )
            {
             before(grammarAccess.getAccionSeleccionAccess().getElementoAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5249:1: ( rule__AccionSeleccion__ElementoAssignment_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5249:2: rule__AccionSeleccion__ElementoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__ElementoAssignment_1_in_rule__AccionSeleccion__Group__1__Impl10486);
            rule__AccionSeleccion__ElementoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccionSeleccionAccess().getElementoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__1__Impl"


    // $ANTLR start "rule__AccionSeleccion__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5259:1: rule__AccionSeleccion__Group__2 : rule__AccionSeleccion__Group__2__Impl rule__AccionSeleccion__Group__3 ;
    public final void rule__AccionSeleccion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5263:1: ( rule__AccionSeleccion__Group__2__Impl rule__AccionSeleccion__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5264:2: rule__AccionSeleccion__Group__2__Impl rule__AccionSeleccion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__2__Impl_in_rule__AccionSeleccion__Group__210516);
            rule__AccionSeleccion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__3_in_rule__AccionSeleccion__Group__210519);
            rule__AccionSeleccion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__2"


    // $ANTLR start "rule__AccionSeleccion__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5271:1: rule__AccionSeleccion__Group__2__Impl : ( ':' ) ;
    public final void rule__AccionSeleccion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5275:1: ( ( ':' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5276:1: ( ':' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5276:1: ( ':' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5277:1: ':'
            {
             before(grammarAccess.getAccionSeleccionAccess().getColonKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__AccionSeleccion__Group__2__Impl10547); 
             after(grammarAccess.getAccionSeleccionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__2__Impl"


    // $ANTLR start "rule__AccionSeleccion__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5290:1: rule__AccionSeleccion__Group__3 : rule__AccionSeleccion__Group__3__Impl rule__AccionSeleccion__Group__4 ;
    public final void rule__AccionSeleccion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5294:1: ( rule__AccionSeleccion__Group__3__Impl rule__AccionSeleccion__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5295:2: rule__AccionSeleccion__Group__3__Impl rule__AccionSeleccion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__3__Impl_in_rule__AccionSeleccion__Group__310578);
            rule__AccionSeleccion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__4_in_rule__AccionSeleccion__Group__310581);
            rule__AccionSeleccion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__3"


    // $ANTLR start "rule__AccionSeleccion__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5302:1: rule__AccionSeleccion__Group__3__Impl : ( ( rule__AccionSeleccion__ValorAssignment_3 ) ) ;
    public final void rule__AccionSeleccion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5306:1: ( ( ( rule__AccionSeleccion__ValorAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5307:1: ( ( rule__AccionSeleccion__ValorAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5307:1: ( ( rule__AccionSeleccion__ValorAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5308:1: ( rule__AccionSeleccion__ValorAssignment_3 )
            {
             before(grammarAccess.getAccionSeleccionAccess().getValorAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5309:1: ( rule__AccionSeleccion__ValorAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5309:2: rule__AccionSeleccion__ValorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__ValorAssignment_3_in_rule__AccionSeleccion__Group__3__Impl10608);
            rule__AccionSeleccion__ValorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAccionSeleccionAccess().getValorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__3__Impl"


    // $ANTLR start "rule__AccionSeleccion__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5319:1: rule__AccionSeleccion__Group__4 : rule__AccionSeleccion__Group__4__Impl rule__AccionSeleccion__Group__5 ;
    public final void rule__AccionSeleccion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5323:1: ( rule__AccionSeleccion__Group__4__Impl rule__AccionSeleccion__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5324:2: rule__AccionSeleccion__Group__4__Impl rule__AccionSeleccion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__4__Impl_in_rule__AccionSeleccion__Group__410638);
            rule__AccionSeleccion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__5_in_rule__AccionSeleccion__Group__410641);
            rule__AccionSeleccion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__4"


    // $ANTLR start "rule__AccionSeleccion__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5331:1: rule__AccionSeleccion__Group__4__Impl : ( '->' ) ;
    public final void rule__AccionSeleccion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5335:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5336:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5336:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5337:1: '->'
            {
             before(grammarAccess.getAccionSeleccionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AccionSeleccion__Group__4__Impl10669); 
             after(grammarAccess.getAccionSeleccionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__4__Impl"


    // $ANTLR start "rule__AccionSeleccion__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5350:1: rule__AccionSeleccion__Group__5 : rule__AccionSeleccion__Group__5__Impl ;
    public final void rule__AccionSeleccion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5354:1: ( rule__AccionSeleccion__Group__5__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5355:2: rule__AccionSeleccion__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__Group__5__Impl_in_rule__AccionSeleccion__Group__510700);
            rule__AccionSeleccion__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__5"


    // $ANTLR start "rule__AccionSeleccion__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5361:1: rule__AccionSeleccion__Group__5__Impl : ( ( rule__AccionSeleccion__AsercionAssignment_5 ) ) ;
    public final void rule__AccionSeleccion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5365:1: ( ( ( rule__AccionSeleccion__AsercionAssignment_5 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5366:1: ( ( rule__AccionSeleccion__AsercionAssignment_5 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5366:1: ( ( rule__AccionSeleccion__AsercionAssignment_5 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5367:1: ( rule__AccionSeleccion__AsercionAssignment_5 )
            {
             before(grammarAccess.getAccionSeleccionAccess().getAsercionAssignment_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5368:1: ( rule__AccionSeleccion__AsercionAssignment_5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5368:2: rule__AccionSeleccion__AsercionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionSeleccion__AsercionAssignment_5_in_rule__AccionSeleccion__Group__5__Impl10727);
            rule__AccionSeleccion__AsercionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAccionSeleccionAccess().getAsercionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__Group__5__Impl"


    // $ANTLR start "rule__AccionPulsacion__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5390:1: rule__AccionPulsacion__Group__0 : rule__AccionPulsacion__Group__0__Impl rule__AccionPulsacion__Group__1 ;
    public final void rule__AccionPulsacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5394:1: ( rule__AccionPulsacion__Group__0__Impl rule__AccionPulsacion__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5395:2: rule__AccionPulsacion__Group__0__Impl rule__AccionPulsacion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__Group__0__Impl_in_rule__AccionPulsacion__Group__010769);
            rule__AccionPulsacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__Group__1_in_rule__AccionPulsacion__Group__010772);
            rule__AccionPulsacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__Group__0"


    // $ANTLR start "rule__AccionPulsacion__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5402:1: rule__AccionPulsacion__Group__0__Impl : ( 'Accion para Boton' ) ;
    public final void rule__AccionPulsacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5406:1: ( ( 'Accion para Boton' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5407:1: ( 'Accion para Boton' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5407:1: ( 'Accion para Boton' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5408:1: 'Accion para Boton'
            {
             before(grammarAccess.getAccionPulsacionAccess().getAccionParaBotonKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__AccionPulsacion__Group__0__Impl10800); 
             after(grammarAccess.getAccionPulsacionAccess().getAccionParaBotonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__Group__0__Impl"


    // $ANTLR start "rule__AccionPulsacion__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5421:1: rule__AccionPulsacion__Group__1 : rule__AccionPulsacion__Group__1__Impl rule__AccionPulsacion__Group__2 ;
    public final void rule__AccionPulsacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5425:1: ( rule__AccionPulsacion__Group__1__Impl rule__AccionPulsacion__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5426:2: rule__AccionPulsacion__Group__1__Impl rule__AccionPulsacion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__Group__1__Impl_in_rule__AccionPulsacion__Group__110831);
            rule__AccionPulsacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__Group__2_in_rule__AccionPulsacion__Group__110834);
            rule__AccionPulsacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__Group__1"


    // $ANTLR start "rule__AccionPulsacion__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5433:1: rule__AccionPulsacion__Group__1__Impl : ( ( rule__AccionPulsacion__ElementoAssignment_1 ) ) ;
    public final void rule__AccionPulsacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5437:1: ( ( ( rule__AccionPulsacion__ElementoAssignment_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5438:1: ( ( rule__AccionPulsacion__ElementoAssignment_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5438:1: ( ( rule__AccionPulsacion__ElementoAssignment_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5439:1: ( rule__AccionPulsacion__ElementoAssignment_1 )
            {
             before(grammarAccess.getAccionPulsacionAccess().getElementoAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5440:1: ( rule__AccionPulsacion__ElementoAssignment_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5440:2: rule__AccionPulsacion__ElementoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__ElementoAssignment_1_in_rule__AccionPulsacion__Group__1__Impl10861);
            rule__AccionPulsacion__ElementoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAccionPulsacionAccess().getElementoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__Group__1__Impl"


    // $ANTLR start "rule__AccionPulsacion__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5450:1: rule__AccionPulsacion__Group__2 : rule__AccionPulsacion__Group__2__Impl rule__AccionPulsacion__Group__3 ;
    public final void rule__AccionPulsacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5454:1: ( rule__AccionPulsacion__Group__2__Impl rule__AccionPulsacion__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5455:2: rule__AccionPulsacion__Group__2__Impl rule__AccionPulsacion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__Group__2__Impl_in_rule__AccionPulsacion__Group__210891);
            rule__AccionPulsacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__Group__3_in_rule__AccionPulsacion__Group__210894);
            rule__AccionPulsacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__Group__2"


    // $ANTLR start "rule__AccionPulsacion__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5462:1: rule__AccionPulsacion__Group__2__Impl : ( '->' ) ;
    public final void rule__AccionPulsacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5466:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5467:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5467:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5468:1: '->'
            {
             before(grammarAccess.getAccionPulsacionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AccionPulsacion__Group__2__Impl10922); 
             after(grammarAccess.getAccionPulsacionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__Group__2__Impl"


    // $ANTLR start "rule__AccionPulsacion__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5481:1: rule__AccionPulsacion__Group__3 : rule__AccionPulsacion__Group__3__Impl ;
    public final void rule__AccionPulsacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5485:1: ( rule__AccionPulsacion__Group__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5486:2: rule__AccionPulsacion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__Group__3__Impl_in_rule__AccionPulsacion__Group__310953);
            rule__AccionPulsacion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__Group__3"


    // $ANTLR start "rule__AccionPulsacion__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5492:1: rule__AccionPulsacion__Group__3__Impl : ( ( rule__AccionPulsacion__AsercionAssignment_3 ) ) ;
    public final void rule__AccionPulsacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5496:1: ( ( ( rule__AccionPulsacion__AsercionAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5497:1: ( ( rule__AccionPulsacion__AsercionAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5497:1: ( ( rule__AccionPulsacion__AsercionAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5498:1: ( rule__AccionPulsacion__AsercionAssignment_3 )
            {
             before(grammarAccess.getAccionPulsacionAccess().getAsercionAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5499:1: ( rule__AccionPulsacion__AsercionAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5499:2: rule__AccionPulsacion__AsercionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AccionPulsacion__AsercionAssignment_3_in_rule__AccionPulsacion__Group__3__Impl10980);
            rule__AccionPulsacion__AsercionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAccionPulsacionAccess().getAsercionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__Group__3__Impl"


    // $ANTLR start "rule__AsercionInvisible__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5517:1: rule__AsercionInvisible__Group__0 : rule__AsercionInvisible__Group__0__Impl rule__AsercionInvisible__Group__1 ;
    public final void rule__AsercionInvisible__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5521:1: ( rule__AsercionInvisible__Group__0__Impl rule__AsercionInvisible__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5522:2: rule__AsercionInvisible__Group__0__Impl rule__AsercionInvisible__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__Group__0__Impl_in_rule__AsercionInvisible__Group__011018);
            rule__AsercionInvisible__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__Group__1_in_rule__AsercionInvisible__Group__011021);
            rule__AsercionInvisible__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__Group__0"


    // $ANTLR start "rule__AsercionInvisible__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5529:1: rule__AsercionInvisible__Group__0__Impl : ( 'Asercion invisible' ) ;
    public final void rule__AsercionInvisible__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5533:1: ( ( 'Asercion invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5534:1: ( 'Asercion invisible' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5534:1: ( 'Asercion invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5535:1: 'Asercion invisible'
            {
             before(grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleKeyword_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__AsercionInvisible__Group__0__Impl11049); 
             after(grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__Group__0__Impl"


    // $ANTLR start "rule__AsercionInvisible__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5548:1: rule__AsercionInvisible__Group__1 : rule__AsercionInvisible__Group__1__Impl rule__AsercionInvisible__Group__2 ;
    public final void rule__AsercionInvisible__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5552:1: ( rule__AsercionInvisible__Group__1__Impl rule__AsercionInvisible__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5553:2: rule__AsercionInvisible__Group__1__Impl rule__AsercionInvisible__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__Group__1__Impl_in_rule__AsercionInvisible__Group__111080);
            rule__AsercionInvisible__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__Group__2_in_rule__AsercionInvisible__Group__111083);
            rule__AsercionInvisible__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__Group__1"


    // $ANTLR start "rule__AsercionInvisible__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5560:1: rule__AsercionInvisible__Group__1__Impl : ( ( rule__AsercionInvisible__EstadoAssignment_1 )? ) ;
    public final void rule__AsercionInvisible__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5564:1: ( ( ( rule__AsercionInvisible__EstadoAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5565:1: ( ( rule__AsercionInvisible__EstadoAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5565:1: ( ( rule__AsercionInvisible__EstadoAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5566:1: ( rule__AsercionInvisible__EstadoAssignment_1 )?
            {
             before(grammarAccess.getAsercionInvisibleAccess().getEstadoAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5567:1: ( rule__AsercionInvisible__EstadoAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5567:2: rule__AsercionInvisible__EstadoAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__EstadoAssignment_1_in_rule__AsercionInvisible__Group__1__Impl11110);
                    rule__AsercionInvisible__EstadoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAsercionInvisibleAccess().getEstadoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__Group__1__Impl"


    // $ANTLR start "rule__AsercionInvisible__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5577:1: rule__AsercionInvisible__Group__2 : rule__AsercionInvisible__Group__2__Impl rule__AsercionInvisible__Group__3 ;
    public final void rule__AsercionInvisible__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5581:1: ( rule__AsercionInvisible__Group__2__Impl rule__AsercionInvisible__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5582:2: rule__AsercionInvisible__Group__2__Impl rule__AsercionInvisible__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__Group__2__Impl_in_rule__AsercionInvisible__Group__211141);
            rule__AsercionInvisible__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__Group__3_in_rule__AsercionInvisible__Group__211144);
            rule__AsercionInvisible__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__Group__2"


    // $ANTLR start "rule__AsercionInvisible__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5589:1: rule__AsercionInvisible__Group__2__Impl : ( '->' ) ;
    public final void rule__AsercionInvisible__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5593:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5594:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5594:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5595:1: '->'
            {
             before(grammarAccess.getAsercionInvisibleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AsercionInvisible__Group__2__Impl11172); 
             after(grammarAccess.getAsercionInvisibleAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__Group__2__Impl"


    // $ANTLR start "rule__AsercionInvisible__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5608:1: rule__AsercionInvisible__Group__3 : rule__AsercionInvisible__Group__3__Impl ;
    public final void rule__AsercionInvisible__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5612:1: ( rule__AsercionInvisible__Group__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5613:2: rule__AsercionInvisible__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__Group__3__Impl_in_rule__AsercionInvisible__Group__311203);
            rule__AsercionInvisible__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__Group__3"


    // $ANTLR start "rule__AsercionInvisible__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5619:1: rule__AsercionInvisible__Group__3__Impl : ( ( rule__AsercionInvisible__ElementoAssignment_3 ) ) ;
    public final void rule__AsercionInvisible__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5623:1: ( ( ( rule__AsercionInvisible__ElementoAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5624:1: ( ( rule__AsercionInvisible__ElementoAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5624:1: ( ( rule__AsercionInvisible__ElementoAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5625:1: ( rule__AsercionInvisible__ElementoAssignment_3 )
            {
             before(grammarAccess.getAsercionInvisibleAccess().getElementoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5626:1: ( rule__AsercionInvisible__ElementoAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5626:2: rule__AsercionInvisible__ElementoAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionInvisible__ElementoAssignment_3_in_rule__AsercionInvisible__Group__3__Impl11230);
            rule__AsercionInvisible__ElementoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAsercionInvisibleAccess().getElementoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__Group__3__Impl"


    // $ANTLR start "rule__AsercionHabilitado__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5644:1: rule__AsercionHabilitado__Group__0 : rule__AsercionHabilitado__Group__0__Impl rule__AsercionHabilitado__Group__1 ;
    public final void rule__AsercionHabilitado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5648:1: ( rule__AsercionHabilitado__Group__0__Impl rule__AsercionHabilitado__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5649:2: rule__AsercionHabilitado__Group__0__Impl rule__AsercionHabilitado__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__Group__0__Impl_in_rule__AsercionHabilitado__Group__011268);
            rule__AsercionHabilitado__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__Group__1_in_rule__AsercionHabilitado__Group__011271);
            rule__AsercionHabilitado__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__Group__0"


    // $ANTLR start "rule__AsercionHabilitado__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5656:1: rule__AsercionHabilitado__Group__0__Impl : ( 'Asercion deshabilitado' ) ;
    public final void rule__AsercionHabilitado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5660:1: ( ( 'Asercion deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5661:1: ( 'Asercion deshabilitado' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5661:1: ( 'Asercion deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5662:1: 'Asercion deshabilitado'
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getAsercionDeshabilitadoKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__AsercionHabilitado__Group__0__Impl11299); 
             after(grammarAccess.getAsercionHabilitadoAccess().getAsercionDeshabilitadoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__Group__0__Impl"


    // $ANTLR start "rule__AsercionHabilitado__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5675:1: rule__AsercionHabilitado__Group__1 : rule__AsercionHabilitado__Group__1__Impl rule__AsercionHabilitado__Group__2 ;
    public final void rule__AsercionHabilitado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5679:1: ( rule__AsercionHabilitado__Group__1__Impl rule__AsercionHabilitado__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5680:2: rule__AsercionHabilitado__Group__1__Impl rule__AsercionHabilitado__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__Group__1__Impl_in_rule__AsercionHabilitado__Group__111330);
            rule__AsercionHabilitado__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__Group__2_in_rule__AsercionHabilitado__Group__111333);
            rule__AsercionHabilitado__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__Group__1"


    // $ANTLR start "rule__AsercionHabilitado__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5687:1: rule__AsercionHabilitado__Group__1__Impl : ( ( rule__AsercionHabilitado__EstadoAssignment_1 )? ) ;
    public final void rule__AsercionHabilitado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5691:1: ( ( ( rule__AsercionHabilitado__EstadoAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5692:1: ( ( rule__AsercionHabilitado__EstadoAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5692:1: ( ( rule__AsercionHabilitado__EstadoAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5693:1: ( rule__AsercionHabilitado__EstadoAssignment_1 )?
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getEstadoAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5694:1: ( rule__AsercionHabilitado__EstadoAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5694:2: rule__AsercionHabilitado__EstadoAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__EstadoAssignment_1_in_rule__AsercionHabilitado__Group__1__Impl11360);
                    rule__AsercionHabilitado__EstadoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAsercionHabilitadoAccess().getEstadoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__Group__1__Impl"


    // $ANTLR start "rule__AsercionHabilitado__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5704:1: rule__AsercionHabilitado__Group__2 : rule__AsercionHabilitado__Group__2__Impl rule__AsercionHabilitado__Group__3 ;
    public final void rule__AsercionHabilitado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5708:1: ( rule__AsercionHabilitado__Group__2__Impl rule__AsercionHabilitado__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5709:2: rule__AsercionHabilitado__Group__2__Impl rule__AsercionHabilitado__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__Group__2__Impl_in_rule__AsercionHabilitado__Group__211391);
            rule__AsercionHabilitado__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__Group__3_in_rule__AsercionHabilitado__Group__211394);
            rule__AsercionHabilitado__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__Group__2"


    // $ANTLR start "rule__AsercionHabilitado__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5716:1: rule__AsercionHabilitado__Group__2__Impl : ( '->' ) ;
    public final void rule__AsercionHabilitado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5720:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5721:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5721:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5722:1: '->'
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AsercionHabilitado__Group__2__Impl11422); 
             after(grammarAccess.getAsercionHabilitadoAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__Group__2__Impl"


    // $ANTLR start "rule__AsercionHabilitado__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5735:1: rule__AsercionHabilitado__Group__3 : rule__AsercionHabilitado__Group__3__Impl ;
    public final void rule__AsercionHabilitado__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5739:1: ( rule__AsercionHabilitado__Group__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5740:2: rule__AsercionHabilitado__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__Group__3__Impl_in_rule__AsercionHabilitado__Group__311453);
            rule__AsercionHabilitado__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__Group__3"


    // $ANTLR start "rule__AsercionHabilitado__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5746:1: rule__AsercionHabilitado__Group__3__Impl : ( ( rule__AsercionHabilitado__ElementoAssignment_3 ) ) ;
    public final void rule__AsercionHabilitado__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5750:1: ( ( ( rule__AsercionHabilitado__ElementoAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5751:1: ( ( rule__AsercionHabilitado__ElementoAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5751:1: ( ( rule__AsercionHabilitado__ElementoAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5752:1: ( rule__AsercionHabilitado__ElementoAssignment_3 )
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getElementoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5753:1: ( rule__AsercionHabilitado__ElementoAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5753:2: rule__AsercionHabilitado__ElementoAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionHabilitado__ElementoAssignment_3_in_rule__AsercionHabilitado__Group__3__Impl11480);
            rule__AsercionHabilitado__ElementoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAsercionHabilitadoAccess().getElementoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__Group__3__Impl"


    // $ANTLR start "rule__AsercionValor__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5771:1: rule__AsercionValor__Group__0 : rule__AsercionValor__Group__0__Impl rule__AsercionValor__Group__1 ;
    public final void rule__AsercionValor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5775:1: ( rule__AsercionValor__Group__0__Impl rule__AsercionValor__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5776:2: rule__AsercionValor__Group__0__Impl rule__AsercionValor__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__Group__0__Impl_in_rule__AsercionValor__Group__011518);
            rule__AsercionValor__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__Group__1_in_rule__AsercionValor__Group__011521);
            rule__AsercionValor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__Group__0"


    // $ANTLR start "rule__AsercionValor__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5783:1: rule__AsercionValor__Group__0__Impl : ( 'Asercion valor' ) ;
    public final void rule__AsercionValor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5787:1: ( ( 'Asercion valor' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5788:1: ( 'Asercion valor' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5788:1: ( 'Asercion valor' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5789:1: 'Asercion valor'
            {
             before(grammarAccess.getAsercionValorAccess().getAsercionValorKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__AsercionValor__Group__0__Impl11549); 
             after(grammarAccess.getAsercionValorAccess().getAsercionValorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__Group__0__Impl"


    // $ANTLR start "rule__AsercionValor__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5802:1: rule__AsercionValor__Group__1 : rule__AsercionValor__Group__1__Impl rule__AsercionValor__Group__2 ;
    public final void rule__AsercionValor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5806:1: ( rule__AsercionValor__Group__1__Impl rule__AsercionValor__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5807:2: rule__AsercionValor__Group__1__Impl rule__AsercionValor__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__Group__1__Impl_in_rule__AsercionValor__Group__111580);
            rule__AsercionValor__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__Group__2_in_rule__AsercionValor__Group__111583);
            rule__AsercionValor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__Group__1"


    // $ANTLR start "rule__AsercionValor__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5814:1: rule__AsercionValor__Group__1__Impl : ( ( rule__AsercionValor__ValorAssignment_1 ) ) ;
    public final void rule__AsercionValor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5818:1: ( ( ( rule__AsercionValor__ValorAssignment_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5819:1: ( ( rule__AsercionValor__ValorAssignment_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5819:1: ( ( rule__AsercionValor__ValorAssignment_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5820:1: ( rule__AsercionValor__ValorAssignment_1 )
            {
             before(grammarAccess.getAsercionValorAccess().getValorAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5821:1: ( rule__AsercionValor__ValorAssignment_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5821:2: rule__AsercionValor__ValorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__ValorAssignment_1_in_rule__AsercionValor__Group__1__Impl11610);
            rule__AsercionValor__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionValorAccess().getValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__Group__1__Impl"


    // $ANTLR start "rule__AsercionValor__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5831:1: rule__AsercionValor__Group__2 : rule__AsercionValor__Group__2__Impl rule__AsercionValor__Group__3 ;
    public final void rule__AsercionValor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5835:1: ( rule__AsercionValor__Group__2__Impl rule__AsercionValor__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5836:2: rule__AsercionValor__Group__2__Impl rule__AsercionValor__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__Group__2__Impl_in_rule__AsercionValor__Group__211640);
            rule__AsercionValor__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__Group__3_in_rule__AsercionValor__Group__211643);
            rule__AsercionValor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__Group__2"


    // $ANTLR start "rule__AsercionValor__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5843:1: rule__AsercionValor__Group__2__Impl : ( '->' ) ;
    public final void rule__AsercionValor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5847:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5848:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5848:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5849:1: '->'
            {
             before(grammarAccess.getAsercionValorAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AsercionValor__Group__2__Impl11671); 
             after(grammarAccess.getAsercionValorAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__Group__2__Impl"


    // $ANTLR start "rule__AsercionValor__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5862:1: rule__AsercionValor__Group__3 : rule__AsercionValor__Group__3__Impl ;
    public final void rule__AsercionValor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5866:1: ( rule__AsercionValor__Group__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5867:2: rule__AsercionValor__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__Group__3__Impl_in_rule__AsercionValor__Group__311702);
            rule__AsercionValor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__Group__3"


    // $ANTLR start "rule__AsercionValor__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5873:1: rule__AsercionValor__Group__3__Impl : ( ( rule__AsercionValor__ElementoAssignment_3 ) ) ;
    public final void rule__AsercionValor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5877:1: ( ( ( rule__AsercionValor__ElementoAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5878:1: ( ( rule__AsercionValor__ElementoAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5878:1: ( ( rule__AsercionValor__ElementoAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5879:1: ( rule__AsercionValor__ElementoAssignment_3 )
            {
             before(grammarAccess.getAsercionValorAccess().getElementoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5880:1: ( rule__AsercionValor__ElementoAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5880:2: rule__AsercionValor__ElementoAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionValor__ElementoAssignment_3_in_rule__AsercionValor__Group__3__Impl11729);
            rule__AsercionValor__ElementoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAsercionValorAccess().getElementoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__Group__3__Impl"


    // $ANTLR start "rule__AsercionSeleccion__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5898:1: rule__AsercionSeleccion__Group__0 : rule__AsercionSeleccion__Group__0__Impl rule__AsercionSeleccion__Group__1 ;
    public final void rule__AsercionSeleccion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5902:1: ( rule__AsercionSeleccion__Group__0__Impl rule__AsercionSeleccion__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5903:2: rule__AsercionSeleccion__Group__0__Impl rule__AsercionSeleccion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__Group__0__Impl_in_rule__AsercionSeleccion__Group__011767);
            rule__AsercionSeleccion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__Group__1_in_rule__AsercionSeleccion__Group__011770);
            rule__AsercionSeleccion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__Group__0"


    // $ANTLR start "rule__AsercionSeleccion__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5910:1: rule__AsercionSeleccion__Group__0__Impl : ( 'Asercion seleccion' ) ;
    public final void rule__AsercionSeleccion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5914:1: ( ( 'Asercion seleccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5915:1: ( 'Asercion seleccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5915:1: ( 'Asercion seleccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5916:1: 'Asercion seleccion'
            {
             before(grammarAccess.getAsercionSeleccionAccess().getAsercionSeleccionKeyword_0()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__AsercionSeleccion__Group__0__Impl11798); 
             after(grammarAccess.getAsercionSeleccionAccess().getAsercionSeleccionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__Group__0__Impl"


    // $ANTLR start "rule__AsercionSeleccion__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5929:1: rule__AsercionSeleccion__Group__1 : rule__AsercionSeleccion__Group__1__Impl rule__AsercionSeleccion__Group__2 ;
    public final void rule__AsercionSeleccion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5933:1: ( rule__AsercionSeleccion__Group__1__Impl rule__AsercionSeleccion__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5934:2: rule__AsercionSeleccion__Group__1__Impl rule__AsercionSeleccion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__Group__1__Impl_in_rule__AsercionSeleccion__Group__111829);
            rule__AsercionSeleccion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__Group__2_in_rule__AsercionSeleccion__Group__111832);
            rule__AsercionSeleccion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__Group__1"


    // $ANTLR start "rule__AsercionSeleccion__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5941:1: rule__AsercionSeleccion__Group__1__Impl : ( ( rule__AsercionSeleccion__EstadoAssignment_1 ) ) ;
    public final void rule__AsercionSeleccion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5945:1: ( ( ( rule__AsercionSeleccion__EstadoAssignment_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5946:1: ( ( rule__AsercionSeleccion__EstadoAssignment_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5946:1: ( ( rule__AsercionSeleccion__EstadoAssignment_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5947:1: ( rule__AsercionSeleccion__EstadoAssignment_1 )
            {
             before(grammarAccess.getAsercionSeleccionAccess().getEstadoAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5948:1: ( rule__AsercionSeleccion__EstadoAssignment_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5948:2: rule__AsercionSeleccion__EstadoAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__EstadoAssignment_1_in_rule__AsercionSeleccion__Group__1__Impl11859);
            rule__AsercionSeleccion__EstadoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionSeleccionAccess().getEstadoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__Group__1__Impl"


    // $ANTLR start "rule__AsercionSeleccion__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5958:1: rule__AsercionSeleccion__Group__2 : rule__AsercionSeleccion__Group__2__Impl rule__AsercionSeleccion__Group__3 ;
    public final void rule__AsercionSeleccion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5962:1: ( rule__AsercionSeleccion__Group__2__Impl rule__AsercionSeleccion__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5963:2: rule__AsercionSeleccion__Group__2__Impl rule__AsercionSeleccion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__Group__2__Impl_in_rule__AsercionSeleccion__Group__211889);
            rule__AsercionSeleccion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__Group__3_in_rule__AsercionSeleccion__Group__211892);
            rule__AsercionSeleccion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__Group__2"


    // $ANTLR start "rule__AsercionSeleccion__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5970:1: rule__AsercionSeleccion__Group__2__Impl : ( '->' ) ;
    public final void rule__AsercionSeleccion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5974:1: ( ( '->' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5975:1: ( '->' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5975:1: ( '->' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5976:1: '->'
            {
             before(grammarAccess.getAsercionSeleccionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AsercionSeleccion__Group__2__Impl11920); 
             after(grammarAccess.getAsercionSeleccionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__Group__2__Impl"


    // $ANTLR start "rule__AsercionSeleccion__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5989:1: rule__AsercionSeleccion__Group__3 : rule__AsercionSeleccion__Group__3__Impl ;
    public final void rule__AsercionSeleccion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5993:1: ( rule__AsercionSeleccion__Group__3__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5994:2: rule__AsercionSeleccion__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__Group__3__Impl_in_rule__AsercionSeleccion__Group__311951);
            rule__AsercionSeleccion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__Group__3"


    // $ANTLR start "rule__AsercionSeleccion__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6000:1: rule__AsercionSeleccion__Group__3__Impl : ( ( rule__AsercionSeleccion__ElementoAssignment_3 ) ) ;
    public final void rule__AsercionSeleccion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6004:1: ( ( ( rule__AsercionSeleccion__ElementoAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6005:1: ( ( rule__AsercionSeleccion__ElementoAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6005:1: ( ( rule__AsercionSeleccion__ElementoAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6006:1: ( rule__AsercionSeleccion__ElementoAssignment_3 )
            {
             before(grammarAccess.getAsercionSeleccionAccess().getElementoAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6007:1: ( rule__AsercionSeleccion__ElementoAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6007:2: rule__AsercionSeleccion__ElementoAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AsercionSeleccion__ElementoAssignment_3_in_rule__AsercionSeleccion__Group__3__Impl11978);
            rule__AsercionSeleccion__ElementoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAsercionSeleccionAccess().getElementoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__Group__3__Impl"


    // $ANTLR start "rule__Formulario__NameAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6026:1: rule__Formulario__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Formulario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6030:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6031:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6031:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6032:1: ruleEString
            {
             before(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Formulario__NameAssignment_112021);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__NameAssignment_1"


    // $ANTLR start "rule__Formulario__ComprobacionCamposAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6041:1: rule__Formulario__ComprobacionCamposAssignment_3 : ( ( 'comprobacionCampos' ) ) ;
    public final void rule__Formulario__ComprobacionCamposAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6045:1: ( ( ( 'comprobacionCampos' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6046:1: ( ( 'comprobacionCampos' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6046:1: ( ( 'comprobacionCampos' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6047:1: ( 'comprobacionCampos' )
            {
             before(grammarAccess.getFormularioAccess().getComprobacionCamposComprobacionCamposKeyword_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6048:1: ( 'comprobacionCampos' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6049:1: 'comprobacionCampos'
            {
             before(grammarAccess.getFormularioAccess().getComprobacionCamposComprobacionCamposKeyword_3_0()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Formulario__ComprobacionCamposAssignment_312057); 
             after(grammarAccess.getFormularioAccess().getComprobacionCamposComprobacionCamposKeyword_3_0()); 

            }

             after(grammarAccess.getFormularioAccess().getComprobacionCamposComprobacionCamposKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__ComprobacionCamposAssignment_3"


    // $ANTLR start "rule__Formulario__ComprobacionAccionAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6064:1: rule__Formulario__ComprobacionAccionAssignment_4 : ( ( 'comprobacionAccion' ) ) ;
    public final void rule__Formulario__ComprobacionAccionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6068:1: ( ( ( 'comprobacionAccion' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6069:1: ( ( 'comprobacionAccion' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6069:1: ( ( 'comprobacionAccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6070:1: ( 'comprobacionAccion' )
            {
             before(grammarAccess.getFormularioAccess().getComprobacionAccionComprobacionAccionKeyword_4_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6071:1: ( 'comprobacionAccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6072:1: 'comprobacionAccion'
            {
             before(grammarAccess.getFormularioAccess().getComprobacionAccionComprobacionAccionKeyword_4_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Formulario__ComprobacionAccionAssignment_412101); 
             after(grammarAccess.getFormularioAccess().getComprobacionAccionComprobacionAccionKeyword_4_0()); 

            }

             after(grammarAccess.getFormularioAccess().getComprobacionAccionComprobacionAccionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__ComprobacionAccionAssignment_4"


    // $ANTLR start "rule__Formulario__LayoutAssignment_5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6087:1: rule__Formulario__LayoutAssignment_5 : ( ruleLayout ) ;
    public final void rule__Formulario__LayoutAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6091:1: ( ( ruleLayout ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6092:1: ( ruleLayout )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6092:1: ( ruleLayout )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6093:1: ruleLayout
            {
             before(grammarAccess.getFormularioAccess().getLayoutLayoutParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Formulario__LayoutAssignment_512140);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getFormularioAccess().getLayoutLayoutParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__LayoutAssignment_5"


    // $ANTLR start "rule__Formulario__PruebasAssignment_6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6102:1: rule__Formulario__PruebasAssignment_6 : ( rulePruebaInterfaz ) ;
    public final void rule__Formulario__PruebasAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6106:1: ( ( rulePruebaInterfaz ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6107:1: ( rulePruebaInterfaz )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6107:1: ( rulePruebaInterfaz )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6108:1: rulePruebaInterfaz
            {
             before(grammarAccess.getFormularioAccess().getPruebasPruebaInterfazParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_rule__Formulario__PruebasAssignment_612171);
            rulePruebaInterfaz();

            state._fsp--;

             after(grammarAccess.getFormularioAccess().getPruebasPruebaInterfazParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__PruebasAssignment_6"


    // $ANTLR start "rule__Layout__ColumnasAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6117:1: rule__Layout__ColumnasAssignment_3 : ( ruleEInt ) ;
    public final void rule__Layout__ColumnasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6121:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6122:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6122:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6123:1: ruleEInt
            {
             before(grammarAccess.getLayoutAccess().getColumnasEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Layout__ColumnasAssignment_312202);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getColumnasEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__ColumnasAssignment_3"


    // $ANTLR start "rule__Layout__EntradasAssignment_4_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6132:1: rule__Layout__EntradasAssignment_4_2 : ( ruleInput ) ;
    public final void rule__Layout__EntradasAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6136:1: ( ( ruleInput ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6137:1: ( ruleInput )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6137:1: ( ruleInput )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6138:1: ruleInput
            {
             before(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_4_212233);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__EntradasAssignment_4_2"


    // $ANTLR start "rule__Layout__EntradasAssignment_4_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6147:1: rule__Layout__EntradasAssignment_4_3_1 : ( ruleInput ) ;
    public final void rule__Layout__EntradasAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6151:1: ( ( ruleInput ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6152:1: ( ruleInput )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6152:1: ( ruleInput )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6153:1: ruleInput
            {
             before(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_4_3_112264);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__EntradasAssignment_4_3_1"


    // $ANTLR start "rule__PruebaInterfaz__AccionesAssignment_3_0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6162:1: rule__PruebaInterfaz__AccionesAssignment_3_0 : ( ruleAccion ) ;
    public final void rule__PruebaInterfaz__AccionesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6166:1: ( ( ruleAccion ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6167:1: ( ruleAccion )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6167:1: ( ruleAccion )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6168:1: ruleAccion
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rule__PruebaInterfaz__AccionesAssignment_3_012295);
            ruleAccion();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__AccionesAssignment_3_0"


    // $ANTLR start "rule__PruebaInterfaz__AccionesAssignment_3_1_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6177:1: rule__PruebaInterfaz__AccionesAssignment_3_1_1 : ( ruleAccion ) ;
    public final void rule__PruebaInterfaz__AccionesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6181:1: ( ( ruleAccion ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6182:1: ( ruleAccion )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6182:1: ( ruleAccion )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6183:1: ruleAccion
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rule__PruebaInterfaz__AccionesAssignment_3_1_112326);
            ruleAccion();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PruebaInterfaz__AccionesAssignment_3_1_1"


    // $ANTLR start "rule__InputTexto__DeshabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6192:1: rule__InputTexto__DeshabilitadoAssignment_2 : ( ( 'deshabilitado' ) ) ;
    public final void rule__InputTexto__DeshabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6196:1: ( ( ( 'deshabilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6197:1: ( ( 'deshabilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6197:1: ( ( 'deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6198:1: ( 'deshabilitado' )
            {
             before(grammarAccess.getInputTextoAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6199:1: ( 'deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6200:1: 'deshabilitado'
            {
             before(grammarAccess.getInputTextoAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__InputTexto__DeshabilitadoAssignment_212362); 
             after(grammarAccess.getInputTextoAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputTextoAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__DeshabilitadoAssignment_2"


    // $ANTLR start "rule__InputTexto__ObligatorioAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6215:1: rule__InputTexto__ObligatorioAssignment_3 : ( ( 'obligatorio' ) ) ;
    public final void rule__InputTexto__ObligatorioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6219:1: ( ( ( 'obligatorio' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6220:1: ( ( 'obligatorio' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6220:1: ( ( 'obligatorio' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6221:1: ( 'obligatorio' )
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6222:1: ( 'obligatorio' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6223:1: 'obligatorio'
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0()); 
            match(input,47,FollowSets000.FOLLOW_47_in_rule__InputTexto__ObligatorioAssignment_312406); 
             after(grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0()); 

            }

             after(grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__ObligatorioAssignment_3"


    // $ANTLR start "rule__InputTexto__InvisibleAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6238:1: rule__InputTexto__InvisibleAssignment_4 : ( ( 'invisible' ) ) ;
    public final void rule__InputTexto__InvisibleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6242:1: ( ( ( 'invisible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6243:1: ( ( 'invisible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6243:1: ( ( 'invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6244:1: ( 'invisible' )
            {
             before(grammarAccess.getInputTextoAccess().getInvisibleInvisibleKeyword_4_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6245:1: ( 'invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6246:1: 'invisible'
            {
             before(grammarAccess.getInputTextoAccess().getInvisibleInvisibleKeyword_4_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__InputTexto__InvisibleAssignment_412450); 
             after(grammarAccess.getInputTextoAccess().getInvisibleInvisibleKeyword_4_0()); 

            }

             after(grammarAccess.getInputTextoAccess().getInvisibleInvisibleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__InvisibleAssignment_4"


    // $ANTLR start "rule__InputTexto__NameAssignment_5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6261:1: rule__InputTexto__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__InputTexto__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6265:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6266:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6266:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6267:1: ruleEString
            {
             before(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputTexto__NameAssignment_512489);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__NameAssignment_5"


    // $ANTLR start "rule__InputTexto__ValorAssignment_6_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6276:1: rule__InputTexto__ValorAssignment_6_1 : ( ruleEString ) ;
    public final void rule__InputTexto__ValorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6280:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6281:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6281:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6282:1: ruleEString
            {
             before(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputTexto__ValorAssignment_6_112520);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__ValorAssignment_6_1"


    // $ANTLR start "rule__InputRadio__InvisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6291:1: rule__InputRadio__InvisibleAssignment_1 : ( ( 'invisible' ) ) ;
    public final void rule__InputRadio__InvisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6295:1: ( ( ( 'invisible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6296:1: ( ( 'invisible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6296:1: ( ( 'invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6297:1: ( 'invisible' )
            {
             before(grammarAccess.getInputRadioAccess().getInvisibleInvisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6298:1: ( 'invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6299:1: 'invisible'
            {
             before(grammarAccess.getInputRadioAccess().getInvisibleInvisibleKeyword_1_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__InputRadio__InvisibleAssignment_112556); 
             after(grammarAccess.getInputRadioAccess().getInvisibleInvisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInputRadioAccess().getInvisibleInvisibleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__InvisibleAssignment_1"


    // $ANTLR start "rule__InputRadio__DeshabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6314:1: rule__InputRadio__DeshabilitadoAssignment_2 : ( ( 'deshabilitado' ) ) ;
    public final void rule__InputRadio__DeshabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6318:1: ( ( ( 'deshabilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6319:1: ( ( 'deshabilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6319:1: ( ( 'deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6320:1: ( 'deshabilitado' )
            {
             before(grammarAccess.getInputRadioAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6321:1: ( 'deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6322:1: 'deshabilitado'
            {
             before(grammarAccess.getInputRadioAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__InputRadio__DeshabilitadoAssignment_212600); 
             after(grammarAccess.getInputRadioAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputRadioAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__DeshabilitadoAssignment_2"


    // $ANTLR start "rule__InputRadio__NameAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6337:1: rule__InputRadio__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__InputRadio__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6341:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6342:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6342:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6343:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__NameAssignment_312639);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__NameAssignment_3"


    // $ANTLR start "rule__InputRadio__ValoresAssignment_5_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6352:1: rule__InputRadio__ValoresAssignment_5_1 : ( ruleEString ) ;
    public final void rule__InputRadio__ValoresAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6356:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6357:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6357:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6358:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_5_112670);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__ValoresAssignment_5_1"


    // $ANTLR start "rule__InputRadio__ValoresAssignment_5_2_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6367:1: rule__InputRadio__ValoresAssignment_5_2_1 : ( ruleEString ) ;
    public final void rule__InputRadio__ValoresAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6371:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6372:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6372:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6373:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_5_2_112701);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__ValoresAssignment_5_2_1"


    // $ANTLR start "rule__InputRadio__SeleccionAssignment_6_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6382:1: rule__InputRadio__SeleccionAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__InputRadio__SeleccionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6386:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6387:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6387:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6388:1: ruleEInt
            {
             before(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputRadio__SeleccionAssignment_6_112732);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__SeleccionAssignment_6_1"


    // $ANTLR start "rule__InputRadio__ReaccionAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6397:1: rule__InputRadio__ReaccionAssignment_7_1 : ( ruleReaccion ) ;
    public final void rule__InputRadio__ReaccionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6401:1: ( ( ruleReaccion ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6402:1: ( ruleReaccion )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6402:1: ( ruleReaccion )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6403:1: ruleReaccion
            {
             before(grammarAccess.getInputRadioAccess().getReaccionReaccionParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_rule__InputRadio__ReaccionAssignment_7_112763);
            ruleReaccion();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getReaccionReaccionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__ReaccionAssignment_7_1"


    // $ANTLR start "rule__InputCombo__InvisibleAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6412:1: rule__InputCombo__InvisibleAssignment_2 : ( ( 'invisible' ) ) ;
    public final void rule__InputCombo__InvisibleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6416:1: ( ( ( 'invisible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6417:1: ( ( 'invisible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6417:1: ( ( 'invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6418:1: ( 'invisible' )
            {
             before(grammarAccess.getInputComboAccess().getInvisibleInvisibleKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6419:1: ( 'invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6420:1: 'invisible'
            {
             before(grammarAccess.getInputComboAccess().getInvisibleInvisibleKeyword_2_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__InputCombo__InvisibleAssignment_212799); 
             after(grammarAccess.getInputComboAccess().getInvisibleInvisibleKeyword_2_0()); 

            }

             after(grammarAccess.getInputComboAccess().getInvisibleInvisibleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__InvisibleAssignment_2"


    // $ANTLR start "rule__InputCombo__DeshabilitadoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6435:1: rule__InputCombo__DeshabilitadoAssignment_3 : ( ( 'deshabilitado' ) ) ;
    public final void rule__InputCombo__DeshabilitadoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6439:1: ( ( ( 'deshabilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6440:1: ( ( 'deshabilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6440:1: ( ( 'deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6441:1: ( 'deshabilitado' )
            {
             before(grammarAccess.getInputComboAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6442:1: ( 'deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6443:1: 'deshabilitado'
            {
             before(grammarAccess.getInputComboAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__InputCombo__DeshabilitadoAssignment_312843); 
             after(grammarAccess.getInputComboAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 

            }

             after(grammarAccess.getInputComboAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__DeshabilitadoAssignment_3"


    // $ANTLR start "rule__InputCombo__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6458:1: rule__InputCombo__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputCombo__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6462:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6463:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6463:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6464:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__NameAssignment_412882);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__NameAssignment_4"


    // $ANTLR start "rule__InputCombo__ValoresAssignment_6_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6473:1: rule__InputCombo__ValoresAssignment_6_1 : ( ruleEString ) ;
    public final void rule__InputCombo__ValoresAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6477:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6478:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6478:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6479:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_112913);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__ValoresAssignment_6_1"


    // $ANTLR start "rule__InputCombo__ValoresAssignment_6_2_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6488:1: rule__InputCombo__ValoresAssignment_6_2_1 : ( ruleEString ) ;
    public final void rule__InputCombo__ValoresAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6492:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6493:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6493:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6494:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_2_112944);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__ValoresAssignment_6_2_1"


    // $ANTLR start "rule__InputCombo__SeleccionAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6503:1: rule__InputCombo__SeleccionAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__InputCombo__SeleccionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6507:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6508:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6508:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6509:1: ruleEInt
            {
             before(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCombo__SeleccionAssignment_7_112975);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__SeleccionAssignment_7_1"


    // $ANTLR start "rule__InputCheck__InvisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6518:1: rule__InputCheck__InvisibleAssignment_1 : ( ( 'invisible' ) ) ;
    public final void rule__InputCheck__InvisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6522:1: ( ( ( 'invisible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6523:1: ( ( 'invisible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6523:1: ( ( 'invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6524:1: ( 'invisible' )
            {
             before(grammarAccess.getInputCheckAccess().getInvisibleInvisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6525:1: ( 'invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6526:1: 'invisible'
            {
             before(grammarAccess.getInputCheckAccess().getInvisibleInvisibleKeyword_1_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__InputCheck__InvisibleAssignment_113011); 
             after(grammarAccess.getInputCheckAccess().getInvisibleInvisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInputCheckAccess().getInvisibleInvisibleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__InvisibleAssignment_1"


    // $ANTLR start "rule__InputCheck__DeshabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6541:1: rule__InputCheck__DeshabilitadoAssignment_2 : ( ( 'deshabilitado' ) ) ;
    public final void rule__InputCheck__DeshabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6545:1: ( ( ( 'deshabilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6546:1: ( ( 'deshabilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6546:1: ( ( 'deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6547:1: ( 'deshabilitado' )
            {
             before(grammarAccess.getInputCheckAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6548:1: ( 'deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6549:1: 'deshabilitado'
            {
             before(grammarAccess.getInputCheckAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__InputCheck__DeshabilitadoAssignment_213055); 
             after(grammarAccess.getInputCheckAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputCheckAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__DeshabilitadoAssignment_2"


    // $ANTLR start "rule__InputCheck__NameAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6564:1: rule__InputCheck__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__InputCheck__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6568:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6569:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6569:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6570:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__NameAssignment_313094);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__NameAssignment_3"


    // $ANTLR start "rule__InputCheck__ValoresAssignment_5_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6579:1: rule__InputCheck__ValoresAssignment_5_1 : ( ruleEString ) ;
    public final void rule__InputCheck__ValoresAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6583:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6584:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6584:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6585:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_5_113125);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__ValoresAssignment_5_1"


    // $ANTLR start "rule__InputCheck__ValoresAssignment_5_2_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6594:1: rule__InputCheck__ValoresAssignment_5_2_1 : ( ruleEString ) ;
    public final void rule__InputCheck__ValoresAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6598:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6599:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6599:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6600:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_5_2_113156);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__ValoresAssignment_5_2_1"


    // $ANTLR start "rule__InputCheck__SeleccionAssignment_6_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6609:1: rule__InputCheck__SeleccionAssignment_6_2 : ( ruleEInt ) ;
    public final void rule__InputCheck__SeleccionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6613:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6614:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6614:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6615:1: ruleEInt
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_6_213187);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__SeleccionAssignment_6_2"


    // $ANTLR start "rule__InputCheck__SeleccionAssignment_6_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6624:1: rule__InputCheck__SeleccionAssignment_6_3_1 : ( ruleEInt ) ;
    public final void rule__InputCheck__SeleccionAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6628:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6629:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6629:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6630:1: ruleEInt
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_6_3_113218);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__SeleccionAssignment_6_3_1"


    // $ANTLR start "rule__InputCheck__ReaccionAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6639:1: rule__InputCheck__ReaccionAssignment_7_1 : ( ruleReaccion ) ;
    public final void rule__InputCheck__ReaccionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6643:1: ( ( ruleReaccion ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6644:1: ( ruleReaccion )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6644:1: ( ruleReaccion )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6645:1: ruleReaccion
            {
             before(grammarAccess.getInputCheckAccess().getReaccionReaccionParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_rule__InputCheck__ReaccionAssignment_7_113249);
            ruleReaccion();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getReaccionReaccionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__ReaccionAssignment_7_1"


    // $ANTLR start "rule__BotonValidar__InvisibleAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6654:1: rule__BotonValidar__InvisibleAssignment_2 : ( ( 'invisible' ) ) ;
    public final void rule__BotonValidar__InvisibleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6658:1: ( ( ( 'invisible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6659:1: ( ( 'invisible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6659:1: ( ( 'invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6660:1: ( 'invisible' )
            {
             before(grammarAccess.getBotonValidarAccess().getInvisibleInvisibleKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6661:1: ( 'invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6662:1: 'invisible'
            {
             before(grammarAccess.getBotonValidarAccess().getInvisibleInvisibleKeyword_2_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__BotonValidar__InvisibleAssignment_213285); 
             after(grammarAccess.getBotonValidarAccess().getInvisibleInvisibleKeyword_2_0()); 

            }

             after(grammarAccess.getBotonValidarAccess().getInvisibleInvisibleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__InvisibleAssignment_2"


    // $ANTLR start "rule__BotonValidar__DeshabilitadoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6677:1: rule__BotonValidar__DeshabilitadoAssignment_3 : ( ( 'deshabilitado' ) ) ;
    public final void rule__BotonValidar__DeshabilitadoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6681:1: ( ( ( 'deshabilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6682:1: ( ( 'deshabilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6682:1: ( ( 'deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6683:1: ( 'deshabilitado' )
            {
             before(grammarAccess.getBotonValidarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6684:1: ( 'deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6685:1: 'deshabilitado'
            {
             before(grammarAccess.getBotonValidarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__BotonValidar__DeshabilitadoAssignment_313329); 
             after(grammarAccess.getBotonValidarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 

            }

             after(grammarAccess.getBotonValidarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__DeshabilitadoAssignment_3"


    // $ANTLR start "rule__BotonValidar__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6700:1: rule__BotonValidar__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BotonValidar__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6704:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6705:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6705:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6706:1: ruleEString
            {
             before(grammarAccess.getBotonValidarAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BotonValidar__NameAssignment_413368);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonValidarAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonValidar__NameAssignment_4"


    // $ANTLR start "rule__BotonGuardar_Impl__InvisibleAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6715:1: rule__BotonGuardar_Impl__InvisibleAssignment_2 : ( ( 'invisible' ) ) ;
    public final void rule__BotonGuardar_Impl__InvisibleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6719:1: ( ( ( 'invisible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6720:1: ( ( 'invisible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6720:1: ( ( 'invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6721:1: ( 'invisible' )
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getInvisibleInvisibleKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6722:1: ( 'invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6723:1: 'invisible'
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getInvisibleInvisibleKeyword_2_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__BotonGuardar_Impl__InvisibleAssignment_213404); 
             after(grammarAccess.getBotonGuardar_ImplAccess().getInvisibleInvisibleKeyword_2_0()); 

            }

             after(grammarAccess.getBotonGuardar_ImplAccess().getInvisibleInvisibleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__InvisibleAssignment_2"


    // $ANTLR start "rule__BotonGuardar_Impl__DeshabilitadoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6738:1: rule__BotonGuardar_Impl__DeshabilitadoAssignment_3 : ( ( 'deshabilitado' ) ) ;
    public final void rule__BotonGuardar_Impl__DeshabilitadoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6742:1: ( ( ( 'deshabilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6743:1: ( ( 'deshabilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6743:1: ( ( 'deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6744:1: ( 'deshabilitado' )
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6745:1: ( 'deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6746:1: 'deshabilitado'
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__BotonGuardar_Impl__DeshabilitadoAssignment_313448); 
             after(grammarAccess.getBotonGuardar_ImplAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 

            }

             after(grammarAccess.getBotonGuardar_ImplAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__DeshabilitadoAssignment_3"


    // $ANTLR start "rule__BotonGuardar_Impl__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6761:1: rule__BotonGuardar_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BotonGuardar_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6765:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6766:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6766:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6767:1: ruleEString
            {
             before(grammarAccess.getBotonGuardar_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BotonGuardar_Impl__NameAssignment_413487);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonGuardar_ImplAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonGuardar_Impl__NameAssignment_4"


    // $ANTLR start "rule__BotonCancelar__InvisibleAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6776:1: rule__BotonCancelar__InvisibleAssignment_2 : ( ( 'invisible' ) ) ;
    public final void rule__BotonCancelar__InvisibleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6780:1: ( ( ( 'invisible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6781:1: ( ( 'invisible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6781:1: ( ( 'invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6782:1: ( 'invisible' )
            {
             before(grammarAccess.getBotonCancelarAccess().getInvisibleInvisibleKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6783:1: ( 'invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6784:1: 'invisible'
            {
             before(grammarAccess.getBotonCancelarAccess().getInvisibleInvisibleKeyword_2_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__BotonCancelar__InvisibleAssignment_213523); 
             after(grammarAccess.getBotonCancelarAccess().getInvisibleInvisibleKeyword_2_0()); 

            }

             after(grammarAccess.getBotonCancelarAccess().getInvisibleInvisibleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__InvisibleAssignment_2"


    // $ANTLR start "rule__BotonCancelar__DeshabilitadoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6799:1: rule__BotonCancelar__DeshabilitadoAssignment_3 : ( ( 'deshabilitado' ) ) ;
    public final void rule__BotonCancelar__DeshabilitadoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6803:1: ( ( ( 'deshabilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6804:1: ( ( 'deshabilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6804:1: ( ( 'deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6805:1: ( 'deshabilitado' )
            {
             before(grammarAccess.getBotonCancelarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6806:1: ( 'deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6807:1: 'deshabilitado'
            {
             before(grammarAccess.getBotonCancelarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__BotonCancelar__DeshabilitadoAssignment_313567); 
             after(grammarAccess.getBotonCancelarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 

            }

             after(grammarAccess.getBotonCancelarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__DeshabilitadoAssignment_3"


    // $ANTLR start "rule__BotonCancelar__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6822:1: rule__BotonCancelar__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__BotonCancelar__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6826:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6827:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6827:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6828:1: ruleEString
            {
             before(grammarAccess.getBotonCancelarAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BotonCancelar__NameAssignment_413606);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonCancelarAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCancelar__NameAssignment_4"


    // $ANTLR start "rule__BotonCustom__InvisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6837:1: rule__BotonCustom__InvisibleAssignment_1 : ( ( 'invisible' ) ) ;
    public final void rule__BotonCustom__InvisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6841:1: ( ( ( 'invisible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6842:1: ( ( 'invisible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6842:1: ( ( 'invisible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6843:1: ( 'invisible' )
            {
             before(grammarAccess.getBotonCustomAccess().getInvisibleInvisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6844:1: ( 'invisible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6845:1: 'invisible'
            {
             before(grammarAccess.getBotonCustomAccess().getInvisibleInvisibleKeyword_1_0()); 
            match(input,48,FollowSets000.FOLLOW_48_in_rule__BotonCustom__InvisibleAssignment_113642); 
             after(grammarAccess.getBotonCustomAccess().getInvisibleInvisibleKeyword_1_0()); 

            }

             after(grammarAccess.getBotonCustomAccess().getInvisibleInvisibleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__InvisibleAssignment_1"


    // $ANTLR start "rule__BotonCustom__DeshabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6860:1: rule__BotonCustom__DeshabilitadoAssignment_2 : ( ( 'deshabilitado' ) ) ;
    public final void rule__BotonCustom__DeshabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6864:1: ( ( ( 'deshabilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6865:1: ( ( 'deshabilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6865:1: ( ( 'deshabilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6866:1: ( 'deshabilitado' )
            {
             before(grammarAccess.getBotonCustomAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6867:1: ( 'deshabilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6868:1: 'deshabilitado'
            {
             before(grammarAccess.getBotonCustomAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 
            match(input,46,FollowSets000.FOLLOW_46_in_rule__BotonCustom__DeshabilitadoAssignment_213686); 
             after(grammarAccess.getBotonCustomAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getBotonCustomAccess().getDeshabilitadoDeshabilitadoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__DeshabilitadoAssignment_2"


    // $ANTLR start "rule__BotonCustom__NameAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6883:1: rule__BotonCustom__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__BotonCustom__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6887:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6888:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6888:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6889:1: ruleEString
            {
             before(grammarAccess.getBotonCustomAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BotonCustom__NameAssignment_313725);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonCustomAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__NameAssignment_3"


    // $ANTLR start "rule__BotonCustom__FuncionAssignment_5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6898:1: rule__BotonCustom__FuncionAssignment_5 : ( ruleEString ) ;
    public final void rule__BotonCustom__FuncionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6902:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6903:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6903:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6904:1: ruleEString
            {
             before(grammarAccess.getBotonCustomAccess().getFuncionEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BotonCustom__FuncionAssignment_513756);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBotonCustomAccess().getFuncionEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BotonCustom__FuncionAssignment_5"


    // $ANTLR start "rule__ReaccionVisible__ActivacionAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6913:1: rule__ReaccionVisible__ActivacionAssignment_1 : ( ruleEInt ) ;
    public final void rule__ReaccionVisible__ActivacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6917:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6918:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6918:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6919:1: ruleEInt
            {
             before(grammarAccess.getReaccionVisibleAccess().getActivacionEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ReaccionVisible__ActivacionAssignment_113787);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReaccionVisibleAccess().getActivacionEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__ActivacionAssignment_1"


    // $ANTLR start "rule__ReaccionVisible__ObjetivoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6928:1: rule__ReaccionVisible__ObjetivoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ReaccionVisible__ObjetivoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6932:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6933:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6933:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6934:1: ( ruleEString )
            {
             before(grammarAccess.getReaccionVisibleAccess().getObjetivoInputCrossReference_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6935:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6936:1: ruleEString
            {
             before(grammarAccess.getReaccionVisibleAccess().getObjetivoInputEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ReaccionVisible__ObjetivoAssignment_313822);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReaccionVisibleAccess().getObjetivoInputEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReaccionVisibleAccess().getObjetivoInputCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionVisible__ObjetivoAssignment_3"


    // $ANTLR start "rule__ReaccionHabilitado__ActivacionAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6947:1: rule__ReaccionHabilitado__ActivacionAssignment_1 : ( ruleEInt ) ;
    public final void rule__ReaccionHabilitado__ActivacionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6951:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6952:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6952:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6953:1: ruleEInt
            {
             before(grammarAccess.getReaccionHabilitadoAccess().getActivacionEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__ReaccionHabilitado__ActivacionAssignment_113857);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReaccionHabilitadoAccess().getActivacionEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__ActivacionAssignment_1"


    // $ANTLR start "rule__ReaccionHabilitado__ObjetivoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6962:1: rule__ReaccionHabilitado__ObjetivoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ReaccionHabilitado__ObjetivoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6966:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6967:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6967:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6968:1: ( ruleEString )
            {
             before(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputCrossReference_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6969:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6970:1: ruleEString
            {
             before(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ReaccionHabilitado__ObjetivoAssignment_313892);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReaccionHabilitado__ObjetivoAssignment_3"


    // $ANTLR start "rule__AccionValor__ValorAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6981:1: rule__AccionValor__ValorAssignment_1 : ( ruleEString ) ;
    public final void rule__AccionValor__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6985:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6986:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6986:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6987:1: ruleEString
            {
             before(grammarAccess.getAccionValorAccess().getValorEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AccionValor__ValorAssignment_113927);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccionValorAccess().getValorEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__ValorAssignment_1"


    // $ANTLR start "rule__AccionValor__ElementoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6996:1: rule__AccionValor__ElementoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AccionValor__ElementoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7000:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7001:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7001:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7002:1: ( ruleEString )
            {
             before(grammarAccess.getAccionValorAccess().getElementoInputCrossReference_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7003:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7004:1: ruleEString
            {
             before(grammarAccess.getAccionValorAccess().getElementoInputEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AccionValor__ElementoAssignment_313962);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccionValorAccess().getElementoInputEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAccionValorAccess().getElementoInputCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__ElementoAssignment_3"


    // $ANTLR start "rule__AccionValor__AsercionAssignment_5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7015:1: rule__AccionValor__AsercionAssignment_5 : ( ruleAsercion ) ;
    public final void rule__AccionValor__AsercionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7019:1: ( ( ruleAsercion ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7020:1: ( ruleAsercion )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7020:1: ( ruleAsercion )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7021:1: ruleAsercion
            {
             before(grammarAccess.getAccionValorAccess().getAsercionAsercionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_rule__AccionValor__AsercionAssignment_513997);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getAccionValorAccess().getAsercionAsercionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionValor__AsercionAssignment_5"


    // $ANTLR start "rule__AccionSeleccion__ElementoAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7030:1: rule__AccionSeleccion__ElementoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__AccionSeleccion__ElementoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7034:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7035:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7035:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7036:1: ( ruleEString )
            {
             before(grammarAccess.getAccionSeleccionAccess().getElementoInputCrossReference_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7037:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7038:1: ruleEString
            {
             before(grammarAccess.getAccionSeleccionAccess().getElementoInputEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AccionSeleccion__ElementoAssignment_114032);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccionSeleccionAccess().getElementoInputEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAccionSeleccionAccess().getElementoInputCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__ElementoAssignment_1"


    // $ANTLR start "rule__AccionSeleccion__ValorAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7049:1: rule__AccionSeleccion__ValorAssignment_3 : ( ruleEInt ) ;
    public final void rule__AccionSeleccion__ValorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7053:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7054:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7054:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7055:1: ruleEInt
            {
             before(grammarAccess.getAccionSeleccionAccess().getValorEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__AccionSeleccion__ValorAssignment_314067);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAccionSeleccionAccess().getValorEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__ValorAssignment_3"


    // $ANTLR start "rule__AccionSeleccion__AsercionAssignment_5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7064:1: rule__AccionSeleccion__AsercionAssignment_5 : ( ruleAsercion ) ;
    public final void rule__AccionSeleccion__AsercionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7068:1: ( ( ruleAsercion ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7069:1: ( ruleAsercion )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7069:1: ( ruleAsercion )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7070:1: ruleAsercion
            {
             before(grammarAccess.getAccionSeleccionAccess().getAsercionAsercionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_rule__AccionSeleccion__AsercionAssignment_514098);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getAccionSeleccionAccess().getAsercionAsercionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionSeleccion__AsercionAssignment_5"


    // $ANTLR start "rule__AccionPulsacion__ElementoAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7079:1: rule__AccionPulsacion__ElementoAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__AccionPulsacion__ElementoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7083:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7084:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7084:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7085:1: ( ruleEString )
            {
             before(grammarAccess.getAccionPulsacionAccess().getElementoInputCrossReference_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7086:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7087:1: ruleEString
            {
             before(grammarAccess.getAccionPulsacionAccess().getElementoInputEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AccionPulsacion__ElementoAssignment_114133);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAccionPulsacionAccess().getElementoInputEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAccionPulsacionAccess().getElementoInputCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__ElementoAssignment_1"


    // $ANTLR start "rule__AccionPulsacion__AsercionAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7098:1: rule__AccionPulsacion__AsercionAssignment_3 : ( ruleAsercion ) ;
    public final void rule__AccionPulsacion__AsercionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7102:1: ( ( ruleAsercion ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7103:1: ( ruleAsercion )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7103:1: ( ruleAsercion )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7104:1: ruleAsercion
            {
             before(grammarAccess.getAccionPulsacionAccess().getAsercionAsercionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_rule__AccionPulsacion__AsercionAssignment_314168);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getAccionPulsacionAccess().getAsercionAsercionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccionPulsacion__AsercionAssignment_3"


    // $ANTLR start "rule__AsercionInvisible__EstadoAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7113:1: rule__AsercionInvisible__EstadoAssignment_1 : ( ( 'falso' ) ) ;
    public final void rule__AsercionInvisible__EstadoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7117:1: ( ( ( 'falso' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7118:1: ( ( 'falso' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7118:1: ( ( 'falso' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7119:1: ( 'falso' )
            {
             before(grammarAccess.getAsercionInvisibleAccess().getEstadoFalsoKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7120:1: ( 'falso' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7121:1: 'falso'
            {
             before(grammarAccess.getAsercionInvisibleAccess().getEstadoFalsoKeyword_1_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__AsercionInvisible__EstadoAssignment_114204); 
             after(grammarAccess.getAsercionInvisibleAccess().getEstadoFalsoKeyword_1_0()); 

            }

             after(grammarAccess.getAsercionInvisibleAccess().getEstadoFalsoKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__EstadoAssignment_1"


    // $ANTLR start "rule__AsercionInvisible__ElementoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7136:1: rule__AsercionInvisible__ElementoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AsercionInvisible__ElementoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7140:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7141:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7141:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7142:1: ( ruleEString )
            {
             before(grammarAccess.getAsercionInvisibleAccess().getElementoInputCrossReference_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7143:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7144:1: ruleEString
            {
             before(grammarAccess.getAsercionInvisibleAccess().getElementoInputEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AsercionInvisible__ElementoAssignment_314247);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAsercionInvisibleAccess().getElementoInputEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAsercionInvisibleAccess().getElementoInputCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionInvisible__ElementoAssignment_3"


    // $ANTLR start "rule__AsercionHabilitado__EstadoAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7155:1: rule__AsercionHabilitado__EstadoAssignment_1 : ( ( 'falso' ) ) ;
    public final void rule__AsercionHabilitado__EstadoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7159:1: ( ( ( 'falso' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7160:1: ( ( 'falso' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7160:1: ( ( 'falso' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7161:1: ( 'falso' )
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getEstadoFalsoKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7162:1: ( 'falso' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7163:1: 'falso'
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getEstadoFalsoKeyword_1_0()); 
            match(input,49,FollowSets000.FOLLOW_49_in_rule__AsercionHabilitado__EstadoAssignment_114287); 
             after(grammarAccess.getAsercionHabilitadoAccess().getEstadoFalsoKeyword_1_0()); 

            }

             after(grammarAccess.getAsercionHabilitadoAccess().getEstadoFalsoKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__EstadoAssignment_1"


    // $ANTLR start "rule__AsercionHabilitado__ElementoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7178:1: rule__AsercionHabilitado__ElementoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AsercionHabilitado__ElementoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7182:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7183:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7183:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7184:1: ( ruleEString )
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getElementoInputCrossReference_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7185:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7186:1: ruleEString
            {
             before(grammarAccess.getAsercionHabilitadoAccess().getElementoInputEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AsercionHabilitado__ElementoAssignment_314330);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAsercionHabilitadoAccess().getElementoInputEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAsercionHabilitadoAccess().getElementoInputCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionHabilitado__ElementoAssignment_3"


    // $ANTLR start "rule__AsercionValor__ValorAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7197:1: rule__AsercionValor__ValorAssignment_1 : ( ruleEString ) ;
    public final void rule__AsercionValor__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7201:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7202:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7202:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7203:1: ruleEString
            {
             before(grammarAccess.getAsercionValorAccess().getValorEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AsercionValor__ValorAssignment_114365);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAsercionValorAccess().getValorEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__ValorAssignment_1"


    // $ANTLR start "rule__AsercionValor__ElementoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7212:1: rule__AsercionValor__ElementoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AsercionValor__ElementoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7216:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7217:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7217:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7218:1: ( ruleEString )
            {
             before(grammarAccess.getAsercionValorAccess().getElementoInputCrossReference_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7219:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7220:1: ruleEString
            {
             before(grammarAccess.getAsercionValorAccess().getElementoInputEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AsercionValor__ElementoAssignment_314400);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAsercionValorAccess().getElementoInputEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAsercionValorAccess().getElementoInputCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionValor__ElementoAssignment_3"


    // $ANTLR start "rule__AsercionSeleccion__EstadoAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7231:1: rule__AsercionSeleccion__EstadoAssignment_1 : ( ruleEInt ) ;
    public final void rule__AsercionSeleccion__EstadoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7235:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7236:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7236:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7237:1: ruleEInt
            {
             before(grammarAccess.getAsercionSeleccionAccess().getEstadoEIntParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__AsercionSeleccion__EstadoAssignment_114435);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAsercionSeleccionAccess().getEstadoEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__EstadoAssignment_1"


    // $ANTLR start "rule__AsercionSeleccion__ElementoAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7246:1: rule__AsercionSeleccion__ElementoAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AsercionSeleccion__ElementoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7250:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7251:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7251:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7252:1: ( ruleEString )
            {
             before(grammarAccess.getAsercionSeleccionAccess().getElementoInputCrossReference_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7253:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:7254:1: ruleEString
            {
             before(grammarAccess.getAsercionSeleccionAccess().getElementoInputEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AsercionSeleccion__ElementoAssignment_314470);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAsercionSeleccionAccess().getElementoInputEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAsercionSeleccionAccess().getElementoInputCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsercionSeleccion__ElementoAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormulario_in_entryRuleFormulario61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulario68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__0_in_ruleFormulario94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input__Alternatives_in_ruleInput154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccion188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Accion__Alternatives_in_ruleAccion214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccion_in_entryRuleReaccion241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccion248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Reaccion__Alternatives_in_ruleReaccion274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercion_in_entryRuleAsercion301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercion308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Asercion__Alternatives_in_ruleAsercion334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0_in_ruleLayout394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__0_in_rulePruebaInterfaz514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__0_in_ruleInputTexto636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__0_in_ruleInputRadio696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__0_in_ruleInputCombo756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__0_in_ruleInputCheck816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonValidar850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__0_in_ruleBotonValidar876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonGuardar_Impl910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__0_in_ruleBotonGuardar_Impl936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCancelar970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__0_in_ruleBotonCancelar996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom1023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCustom1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__0_in_ruleBotonCustom1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible1083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionVisible1090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__Group__0_in_ruleReaccionVisible1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado1143 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionHabilitado1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__Group__0_in_ruleReaccionHabilitado1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_entryRuleAccionValor1203 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionValor1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__0_in_ruleAccionValor1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion1263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionSeleccion1270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__0_in_ruleAccionSeleccion1296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionPulsacion_in_entryRuleAccionPulsacion1323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionPulsacion1330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__Group__0_in_ruleAccionPulsacion1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible1383 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionInvisible1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__Group__0_in_ruleAsercionInvisible1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado1443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionHabilitado1450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__Group__0_in_ruleAsercionHabilitado1476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor1503 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionValor1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionValor__Group__0_in_ruleAsercionValor1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion1563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionSeleccion1570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__Group__0_in_ruleAsercionSeleccion1596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_rule__Input__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_rule__Input__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_rule__Input__Alternatives1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_rule__Input__Alternatives1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_rule__Input__Alternatives1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_rule__Input__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_rule__Input__Alternatives1734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_rule__Input__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_rule__Accion__Alternatives1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_rule__Accion__Alternatives1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionPulsacion_in_rule__Accion__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_rule__Reaccion__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_rule__Reaccion__Alternatives1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_rule__Asercion__Alternatives1898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_rule__Asercion__Alternatives1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_rule__Asercion__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_rule__Asercion__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__0__Impl_in_rule__Formulario__Group__02029 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Formulario__Group__1_in_rule__Formulario__Group__02032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Formulario__Group__0__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__1__Impl_in_rule__Formulario__Group__12091 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__2_in_rule__Formulario__Group__12094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__NameAssignment_1_in_rule__Formulario__Group__1__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__2__Impl_in_rule__Formulario__Group__22151 = new BitSet(new long[]{0x0000300000004000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__3_in_rule__Formulario__Group__22154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Formulario__Group__2__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__3__Impl_in_rule__Formulario__Group__32213 = new BitSet(new long[]{0x0000300000004000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__4_in_rule__Formulario__Group__32216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__ComprobacionCamposAssignment_3_in_rule__Formulario__Group__3__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__4__Impl_in_rule__Formulario__Group__42274 = new BitSet(new long[]{0x0000300000004000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__5_in_rule__Formulario__Group__42277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__ComprobacionAccionAssignment_4_in_rule__Formulario__Group__4__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__5__Impl_in_rule__Formulario__Group__52335 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__6_in_rule__Formulario__Group__52338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__LayoutAssignment_5_in_rule__Formulario__Group__5__Impl2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__6__Impl_in_rule__Formulario__Group__62395 = new BitSet(new long[]{0x0000000000102000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__7_in_rule__Formulario__Group__62398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__PruebasAssignment_6_in_rule__Formulario__Group__6__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__7__Impl_in_rule__Formulario__Group__72456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Formulario__Group__7__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__02531 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__02534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Layout__Group__0__Impl2562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__12593 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__12596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Layout__Group__1__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__22655 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__22658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Layout__Group__2__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__32717 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__32720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__ColumnasAssignment_3_in_rule__Layout__Group__3__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__42777 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Layout__Group__5_in_rule__Layout__Group__42780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__0_in_rule__Layout__Group__4__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__5__Impl_in_rule__Layout__Group__52838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Layout__Group__5__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__0__Impl_in_rule__Layout__Group_4__02909 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__1_in_rule__Layout__Group_4__02912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Layout__Group_4__0__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__1__Impl_in_rule__Layout__Group_4__12971 = new BitSet(new long[]{0x00000003D9400000L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__2_in_rule__Layout__Group_4__12974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Layout__Group_4__1__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__2__Impl_in_rule__Layout__Group_4__23033 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__3_in_rule__Layout__Group_4__23036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__EntradasAssignment_4_2_in_rule__Layout__Group_4__2__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__3__Impl_in_rule__Layout__Group_4__33093 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__4_in_rule__Layout__Group_4__33096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4_3__0_in_rule__Layout__Group_4__3__Impl3123 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__4__Impl_in_rule__Layout__Group_4__43154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Layout__Group_4__4__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4_3__0__Impl_in_rule__Layout__Group_4_3__03223 = new BitSet(new long[]{0x00000003D9400000L});
        public static final BitSet FOLLOW_rule__Layout__Group_4_3__1_in_rule__Layout__Group_4_3__03226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Layout__Group_4_3__0__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4_3__1__Impl_in_rule__Layout__Group_4_3__13285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__EntradasAssignment_4_3_1_in_rule__Layout__Group_4_3__1__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__0__Impl_in_rule__PruebaInterfaz__Group__03346 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__1_in_rule__PruebaInterfaz__Group__03349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__1__Impl_in_rule__PruebaInterfaz__Group__13407 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__2_in_rule__PruebaInterfaz__Group__13410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__PruebaInterfaz__Group__1__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__2__Impl_in_rule__PruebaInterfaz__Group__23469 = new BitSet(new long[]{0x000000E000002000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__3_in_rule__PruebaInterfaz__Group__23472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__PruebaInterfaz__Group__2__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__3__Impl_in_rule__PruebaInterfaz__Group__33531 = new BitSet(new long[]{0x000000E000002000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__4_in_rule__PruebaInterfaz__Group__33534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_3__0_in_rule__PruebaInterfaz__Group__3__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__4__Impl_in_rule__PruebaInterfaz__Group__43592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__PruebaInterfaz__Group__4__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_3__0__Impl_in_rule__PruebaInterfaz__Group_3__03661 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_3__1_in_rule__PruebaInterfaz__Group_3__03664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__AccionesAssignment_3_0_in_rule__PruebaInterfaz__Group_3__0__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_3__1__Impl_in_rule__PruebaInterfaz__Group_3__13721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_3_1__0_in_rule__PruebaInterfaz__Group_3__1__Impl3748 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_3_1__0__Impl_in_rule__PruebaInterfaz__Group_3_1__03783 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_3_1__1_in_rule__PruebaInterfaz__Group_3_1__03786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PruebaInterfaz__Group_3_1__0__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_3_1__1__Impl_in_rule__PruebaInterfaz__Group_3_1__13845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__AccionesAssignment_3_1_1_in_rule__PruebaInterfaz__Group_3_1__1__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03906 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EInt__Group__0__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__0__Impl_in_rule__InputTexto__Group__04031 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__1_in_rule__InputTexto__Group__04034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__1__Impl_in_rule__InputTexto__Group__14092 = new BitSet(new long[]{0x0001C00000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__2_in_rule__InputTexto__Group__14095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__InputTexto__Group__1__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__2__Impl_in_rule__InputTexto__Group__24154 = new BitSet(new long[]{0x0001C00000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__3_in_rule__InputTexto__Group__24157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__DeshabilitadoAssignment_2_in_rule__InputTexto__Group__2__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__3__Impl_in_rule__InputTexto__Group__34215 = new BitSet(new long[]{0x0001C00000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__4_in_rule__InputTexto__Group__34218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__ObligatorioAssignment_3_in_rule__InputTexto__Group__3__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__4__Impl_in_rule__InputTexto__Group__44276 = new BitSet(new long[]{0x0001C00000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__5_in_rule__InputTexto__Group__44279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__InvisibleAssignment_4_in_rule__InputTexto__Group__4__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__5__Impl_in_rule__InputTexto__Group__54337 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__6_in_rule__InputTexto__Group__54340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__NameAssignment_5_in_rule__InputTexto__Group__5__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__6__Impl_in_rule__InputTexto__Group__64397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_6__0_in_rule__InputTexto__Group__6__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_6__0__Impl_in_rule__InputTexto__Group_6__04469 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_6__1_in_rule__InputTexto__Group_6__04472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__InputTexto__Group_6__0__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_6__1__Impl_in_rule__InputTexto__Group_6__14531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__ValorAssignment_6_1_in_rule__InputTexto__Group_6__1__Impl4558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__0__Impl_in_rule__InputRadio__Group__04592 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__1_in_rule__InputRadio__Group__04595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__InputRadio__Group__0__Impl4623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__1__Impl_in_rule__InputRadio__Group__14654 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__2_in_rule__InputRadio__Group__14657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__InvisibleAssignment_1_in_rule__InputRadio__Group__1__Impl4684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__2__Impl_in_rule__InputRadio__Group__24715 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__3_in_rule__InputRadio__Group__24718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__DeshabilitadoAssignment_2_in_rule__InputRadio__Group__2__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__3__Impl_in_rule__InputRadio__Group__34776 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__4_in_rule__InputRadio__Group__34779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__NameAssignment_3_in_rule__InputRadio__Group__3__Impl4806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__4__Impl_in_rule__InputRadio__Group__44836 = new BitSet(new long[]{0x0000000004801000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__5_in_rule__InputRadio__Group__44839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__InputRadio__Group__4__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__5__Impl_in_rule__InputRadio__Group__54898 = new BitSet(new long[]{0x0000000004801000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__6_in_rule__InputRadio__Group__54901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5__0_in_rule__InputRadio__Group__5__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__6__Impl_in_rule__InputRadio__Group__64959 = new BitSet(new long[]{0x0000000004801000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__7_in_rule__InputRadio__Group__64962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__0_in_rule__InputRadio__Group__6__Impl4989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__7__Impl_in_rule__InputRadio__Group__75020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__0_in_rule__InputRadio__Group__7__Impl5047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5__0__Impl_in_rule__InputRadio__Group_5__05094 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5__1_in_rule__InputRadio__Group_5__05097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputRadio__Group_5__0__Impl5125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5__1__Impl_in_rule__InputRadio__Group_5__15156 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5__2_in_rule__InputRadio__Group_5__15159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__ValoresAssignment_5_1_in_rule__InputRadio__Group_5__1__Impl5186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5__2__Impl_in_rule__InputRadio__Group_5__25216 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5__3_in_rule__InputRadio__Group_5__25219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5_2__0_in_rule__InputRadio__Group_5__2__Impl5246 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5__3__Impl_in_rule__InputRadio__Group_5__35277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputRadio__Group_5__3__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5_2__0__Impl_in_rule__InputRadio__Group_5_2__05344 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5_2__1_in_rule__InputRadio__Group_5_2__05347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__InputRadio__Group_5_2__0__Impl5375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_5_2__1__Impl_in_rule__InputRadio__Group_5_2__15406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__ValoresAssignment_5_2_1_in_rule__InputRadio__Group_5_2__1__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__0__Impl_in_rule__InputRadio__Group_6__05467 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__1_in_rule__InputRadio__Group_6__05470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__InputRadio__Group_6__0__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__1__Impl_in_rule__InputRadio__Group_6__15529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__SeleccionAssignment_6_1_in_rule__InputRadio__Group_6__1__Impl5556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__0__Impl_in_rule__InputRadio__Group_7__05590 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__1_in_rule__InputRadio__Group_7__05593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__InputRadio__Group_7__0__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__1__Impl_in_rule__InputRadio__Group_7__15652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__ReaccionAssignment_7_1_in_rule__InputRadio__Group_7__1__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__0__Impl_in_rule__InputCombo__Group__05713 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__1_in_rule__InputCombo__Group__05716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__1__Impl_in_rule__InputCombo__Group__15774 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__2_in_rule__InputCombo__Group__15777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__InputCombo__Group__1__Impl5805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__2__Impl_in_rule__InputCombo__Group__25836 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__3_in_rule__InputCombo__Group__25839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__InvisibleAssignment_2_in_rule__InputCombo__Group__2__Impl5866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__3__Impl_in_rule__InputCombo__Group__35897 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__4_in_rule__InputCombo__Group__35900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__DeshabilitadoAssignment_3_in_rule__InputCombo__Group__3__Impl5927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__4__Impl_in_rule__InputCombo__Group__45958 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__5_in_rule__InputCombo__Group__45961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__NameAssignment_4_in_rule__InputCombo__Group__4__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__5__Impl_in_rule__InputCombo__Group__56018 = new BitSet(new long[]{0x0000000000801000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__6_in_rule__InputCombo__Group__56021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__InputCombo__Group__5__Impl6049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__6__Impl_in_rule__InputCombo__Group__66080 = new BitSet(new long[]{0x0000000000801000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__7_in_rule__InputCombo__Group__66083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__0_in_rule__InputCombo__Group__6__Impl6110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__7__Impl_in_rule__InputCombo__Group__76141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__0_in_rule__InputCombo__Group__7__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__0__Impl_in_rule__InputCombo__Group_6__06215 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__1_in_rule__InputCombo__Group_6__06218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCombo__Group_6__0__Impl6246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__1__Impl_in_rule__InputCombo__Group_6__16277 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__2_in_rule__InputCombo__Group_6__16280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__ValoresAssignment_6_1_in_rule__InputCombo__Group_6__1__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__2__Impl_in_rule__InputCombo__Group_6__26337 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__3_in_rule__InputCombo__Group_6__26340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6_2__0_in_rule__InputCombo__Group_6__2__Impl6367 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__3__Impl_in_rule__InputCombo__Group_6__36398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputCombo__Group_6__3__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6_2__0__Impl_in_rule__InputCombo__Group_6_2__06465 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6_2__1_in_rule__InputCombo__Group_6_2__06468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__InputCombo__Group_6_2__0__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6_2__1__Impl_in_rule__InputCombo__Group_6_2__16527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__ValoresAssignment_6_2_1_in_rule__InputCombo__Group_6_2__1__Impl6554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__0__Impl_in_rule__InputCombo__Group_7__06588 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__1_in_rule__InputCombo__Group_7__06591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__InputCombo__Group_7__0__Impl6619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__1__Impl_in_rule__InputCombo__Group_7__16650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__SeleccionAssignment_7_1_in_rule__InputCombo__Group_7__1__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__0__Impl_in_rule__InputCheck__Group__06711 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__1_in_rule__InputCheck__Group__06714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__InputCheck__Group__0__Impl6742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__1__Impl_in_rule__InputCheck__Group__16773 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__2_in_rule__InputCheck__Group__16776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__InvisibleAssignment_1_in_rule__InputCheck__Group__1__Impl6803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__2__Impl_in_rule__InputCheck__Group__26834 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__3_in_rule__InputCheck__Group__26837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__DeshabilitadoAssignment_2_in_rule__InputCheck__Group__2__Impl6864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__3__Impl_in_rule__InputCheck__Group__36895 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__4_in_rule__InputCheck__Group__36898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__NameAssignment_3_in_rule__InputCheck__Group__3__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__4__Impl_in_rule__InputCheck__Group__46955 = new BitSet(new long[]{0x0000000024001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__5_in_rule__InputCheck__Group__46958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__InputCheck__Group__4__Impl6986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__5__Impl_in_rule__InputCheck__Group__57017 = new BitSet(new long[]{0x0000000024001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__6_in_rule__InputCheck__Group__57020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5__0_in_rule__InputCheck__Group__5__Impl7047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__6__Impl_in_rule__InputCheck__Group__67078 = new BitSet(new long[]{0x0000000024001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__7_in_rule__InputCheck__Group__67081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__0_in_rule__InputCheck__Group__6__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__7__Impl_in_rule__InputCheck__Group__77139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__0_in_rule__InputCheck__Group__7__Impl7166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5__0__Impl_in_rule__InputCheck__Group_5__07213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5__1_in_rule__InputCheck__Group_5__07216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCheck__Group_5__0__Impl7244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5__1__Impl_in_rule__InputCheck__Group_5__17275 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5__2_in_rule__InputCheck__Group_5__17278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__ValoresAssignment_5_1_in_rule__InputCheck__Group_5__1__Impl7305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5__2__Impl_in_rule__InputCheck__Group_5__27335 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5__3_in_rule__InputCheck__Group_5__27338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5_2__0_in_rule__InputCheck__Group_5__2__Impl7365 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5__3__Impl_in_rule__InputCheck__Group_5__37396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputCheck__Group_5__3__Impl7424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5_2__0__Impl_in_rule__InputCheck__Group_5_2__07463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5_2__1_in_rule__InputCheck__Group_5_2__07466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__InputCheck__Group_5_2__0__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_5_2__1__Impl_in_rule__InputCheck__Group_5_2__17525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__ValoresAssignment_5_2_1_in_rule__InputCheck__Group_5_2__1__Impl7552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__0__Impl_in_rule__InputCheck__Group_6__07586 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__1_in_rule__InputCheck__Group_6__07589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__InputCheck__Group_6__0__Impl7617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__1__Impl_in_rule__InputCheck__Group_6__17648 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__2_in_rule__InputCheck__Group_6__17651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCheck__Group_6__1__Impl7679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__2__Impl_in_rule__InputCheck__Group_6__27710 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__3_in_rule__InputCheck__Group_6__27713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__SeleccionAssignment_6_2_in_rule__InputCheck__Group_6__2__Impl7740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__3__Impl_in_rule__InputCheck__Group_6__37770 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__4_in_rule__InputCheck__Group_6__37773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6_3__0_in_rule__InputCheck__Group_6__3__Impl7800 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__4__Impl_in_rule__InputCheck__Group_6__47831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputCheck__Group_6__4__Impl7859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6_3__0__Impl_in_rule__InputCheck__Group_6_3__07900 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6_3__1_in_rule__InputCheck__Group_6_3__07903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__InputCheck__Group_6_3__0__Impl7931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6_3__1__Impl_in_rule__InputCheck__Group_6_3__17962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__SeleccionAssignment_6_3_1_in_rule__InputCheck__Group_6_3__1__Impl7989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__0__Impl_in_rule__InputCheck__Group_7__08023 = new BitSet(new long[]{0x0000001400000000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__1_in_rule__InputCheck__Group_7__08026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__InputCheck__Group_7__0__Impl8054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__1__Impl_in_rule__InputCheck__Group_7__18085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__ReaccionAssignment_7_1_in_rule__InputCheck__Group_7__1__Impl8112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__0__Impl_in_rule__BotonValidar__Group__08146 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__1_in_rule__BotonValidar__Group__08149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__1__Impl_in_rule__BotonValidar__Group__18207 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__2_in_rule__BotonValidar__Group__18210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__BotonValidar__Group__1__Impl8238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__2__Impl_in_rule__BotonValidar__Group__28269 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__3_in_rule__BotonValidar__Group__28272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__InvisibleAssignment_2_in_rule__BotonValidar__Group__2__Impl8299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__3__Impl_in_rule__BotonValidar__Group__38330 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__4_in_rule__BotonValidar__Group__38333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__DeshabilitadoAssignment_3_in_rule__BotonValidar__Group__3__Impl8360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__Group__4__Impl_in_rule__BotonValidar__Group__48391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonValidar__NameAssignment_4_in_rule__BotonValidar__Group__4__Impl8418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__0__Impl_in_rule__BotonGuardar_Impl__Group__08458 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__1_in_rule__BotonGuardar_Impl__Group__08461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__1__Impl_in_rule__BotonGuardar_Impl__Group__18519 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__2_in_rule__BotonGuardar_Impl__Group__18522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__BotonGuardar_Impl__Group__1__Impl8550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__2__Impl_in_rule__BotonGuardar_Impl__Group__28581 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__3_in_rule__BotonGuardar_Impl__Group__28584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__InvisibleAssignment_2_in_rule__BotonGuardar_Impl__Group__2__Impl8611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__3__Impl_in_rule__BotonGuardar_Impl__Group__38642 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__4_in_rule__BotonGuardar_Impl__Group__38645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__DeshabilitadoAssignment_3_in_rule__BotonGuardar_Impl__Group__3__Impl8672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__Group__4__Impl_in_rule__BotonGuardar_Impl__Group__48703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonGuardar_Impl__NameAssignment_4_in_rule__BotonGuardar_Impl__Group__4__Impl8730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__0__Impl_in_rule__BotonCancelar__Group__08770 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__1_in_rule__BotonCancelar__Group__08773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__1__Impl_in_rule__BotonCancelar__Group__18831 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__2_in_rule__BotonCancelar__Group__18834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__BotonCancelar__Group__1__Impl8862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__2__Impl_in_rule__BotonCancelar__Group__28893 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__3_in_rule__BotonCancelar__Group__28896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__InvisibleAssignment_2_in_rule__BotonCancelar__Group__2__Impl8923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__3__Impl_in_rule__BotonCancelar__Group__38954 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__4_in_rule__BotonCancelar__Group__38957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__DeshabilitadoAssignment_3_in_rule__BotonCancelar__Group__3__Impl8984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__Group__4__Impl_in_rule__BotonCancelar__Group__49015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCancelar__NameAssignment_4_in_rule__BotonCancelar__Group__4__Impl9042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__0__Impl_in_rule__BotonCustom__Group__09082 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__1_in_rule__BotonCustom__Group__09085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__BotonCustom__Group__0__Impl9113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__1__Impl_in_rule__BotonCustom__Group__19144 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__2_in_rule__BotonCustom__Group__19147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__InvisibleAssignment_1_in_rule__BotonCustom__Group__1__Impl9174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__2__Impl_in_rule__BotonCustom__Group__29205 = new BitSet(new long[]{0x0001400000000030L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__3_in_rule__BotonCustom__Group__29208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__DeshabilitadoAssignment_2_in_rule__BotonCustom__Group__2__Impl9235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__3__Impl_in_rule__BotonCustom__Group__39266 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__4_in_rule__BotonCustom__Group__39269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__NameAssignment_3_in_rule__BotonCustom__Group__3__Impl9296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__4__Impl_in_rule__BotonCustom__Group__49326 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__5_in_rule__BotonCustom__Group__49329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BotonCustom__Group__4__Impl9357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__5__Impl_in_rule__BotonCustom__Group__59388 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__6_in_rule__BotonCustom__Group__59391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__FuncionAssignment_5_in_rule__BotonCustom__Group__5__Impl9418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BotonCustom__Group__6__Impl_in_rule__BotonCustom__Group__69448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BotonCustom__Group__6__Impl9476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__Group__0__Impl_in_rule__ReaccionVisible__Group__09521 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__Group__1_in_rule__ReaccionVisible__Group__09524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ReaccionVisible__Group__0__Impl9552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__Group__1__Impl_in_rule__ReaccionVisible__Group__19583 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__Group__2_in_rule__ReaccionVisible__Group__19586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__ActivacionAssignment_1_in_rule__ReaccionVisible__Group__1__Impl9613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__Group__2__Impl_in_rule__ReaccionVisible__Group__29643 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__Group__3_in_rule__ReaccionVisible__Group__29646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ReaccionVisible__Group__2__Impl9674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__Group__3__Impl_in_rule__ReaccionVisible__Group__39705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionVisible__ObjetivoAssignment_3_in_rule__ReaccionVisible__Group__3__Impl9732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__Group__0__Impl_in_rule__ReaccionHabilitado__Group__09770 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__Group__1_in_rule__ReaccionHabilitado__Group__09773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ReaccionHabilitado__Group__0__Impl9801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__Group__1__Impl_in_rule__ReaccionHabilitado__Group__19832 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__Group__2_in_rule__ReaccionHabilitado__Group__19835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__ActivacionAssignment_1_in_rule__ReaccionHabilitado__Group__1__Impl9862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__Group__2__Impl_in_rule__ReaccionHabilitado__Group__29892 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__Group__3_in_rule__ReaccionHabilitado__Group__29895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ReaccionHabilitado__Group__2__Impl9923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__Group__3__Impl_in_rule__ReaccionHabilitado__Group__39954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ReaccionHabilitado__ObjetivoAssignment_3_in_rule__ReaccionHabilitado__Group__3__Impl9981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__0__Impl_in_rule__AccionValor__Group__010019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__1_in_rule__AccionValor__Group__010022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__AccionValor__Group__0__Impl10050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__1__Impl_in_rule__AccionValor__Group__110081 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__2_in_rule__AccionValor__Group__110084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__ValorAssignment_1_in_rule__AccionValor__Group__1__Impl10111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__2__Impl_in_rule__AccionValor__Group__210141 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__3_in_rule__AccionValor__Group__210144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AccionValor__Group__2__Impl10172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__3__Impl_in_rule__AccionValor__Group__310203 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__4_in_rule__AccionValor__Group__310206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__ElementoAssignment_3_in_rule__AccionValor__Group__3__Impl10233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__4__Impl_in_rule__AccionValor__Group__410263 = new BitSet(new long[]{0x00000F0000000000L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__5_in_rule__AccionValor__Group__410266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AccionValor__Group__4__Impl10294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__Group__5__Impl_in_rule__AccionValor__Group__510325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionValor__AsercionAssignment_5_in_rule__AccionValor__Group__5__Impl10352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__0__Impl_in_rule__AccionSeleccion__Group__010394 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__1_in_rule__AccionSeleccion__Group__010397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__AccionSeleccion__Group__0__Impl10425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__1__Impl_in_rule__AccionSeleccion__Group__110456 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__2_in_rule__AccionSeleccion__Group__110459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__ElementoAssignment_1_in_rule__AccionSeleccion__Group__1__Impl10486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__2__Impl_in_rule__AccionSeleccion__Group__210516 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__3_in_rule__AccionSeleccion__Group__210519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__AccionSeleccion__Group__2__Impl10547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__3__Impl_in_rule__AccionSeleccion__Group__310578 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__4_in_rule__AccionSeleccion__Group__310581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__ValorAssignment_3_in_rule__AccionSeleccion__Group__3__Impl10608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__4__Impl_in_rule__AccionSeleccion__Group__410638 = new BitSet(new long[]{0x00000F0000000000L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__5_in_rule__AccionSeleccion__Group__410641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AccionSeleccion__Group__4__Impl10669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__Group__5__Impl_in_rule__AccionSeleccion__Group__510700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionSeleccion__AsercionAssignment_5_in_rule__AccionSeleccion__Group__5__Impl10727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__Group__0__Impl_in_rule__AccionPulsacion__Group__010769 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__Group__1_in_rule__AccionPulsacion__Group__010772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__AccionPulsacion__Group__0__Impl10800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__Group__1__Impl_in_rule__AccionPulsacion__Group__110831 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__Group__2_in_rule__AccionPulsacion__Group__110834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__ElementoAssignment_1_in_rule__AccionPulsacion__Group__1__Impl10861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__Group__2__Impl_in_rule__AccionPulsacion__Group__210891 = new BitSet(new long[]{0x00000F0000000000L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__Group__3_in_rule__AccionPulsacion__Group__210894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AccionPulsacion__Group__2__Impl10922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__Group__3__Impl_in_rule__AccionPulsacion__Group__310953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AccionPulsacion__AsercionAssignment_3_in_rule__AccionPulsacion__Group__3__Impl10980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__Group__0__Impl_in_rule__AsercionInvisible__Group__011018 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__Group__1_in_rule__AsercionInvisible__Group__011021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__AsercionInvisible__Group__0__Impl11049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__Group__1__Impl_in_rule__AsercionInvisible__Group__111080 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__Group__2_in_rule__AsercionInvisible__Group__111083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__EstadoAssignment_1_in_rule__AsercionInvisible__Group__1__Impl11110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__Group__2__Impl_in_rule__AsercionInvisible__Group__211141 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__Group__3_in_rule__AsercionInvisible__Group__211144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AsercionInvisible__Group__2__Impl11172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__Group__3__Impl_in_rule__AsercionInvisible__Group__311203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionInvisible__ElementoAssignment_3_in_rule__AsercionInvisible__Group__3__Impl11230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__Group__0__Impl_in_rule__AsercionHabilitado__Group__011268 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__Group__1_in_rule__AsercionHabilitado__Group__011271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__AsercionHabilitado__Group__0__Impl11299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__Group__1__Impl_in_rule__AsercionHabilitado__Group__111330 = new BitSet(new long[]{0x0002000800000000L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__Group__2_in_rule__AsercionHabilitado__Group__111333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__EstadoAssignment_1_in_rule__AsercionHabilitado__Group__1__Impl11360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__Group__2__Impl_in_rule__AsercionHabilitado__Group__211391 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__Group__3_in_rule__AsercionHabilitado__Group__211394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AsercionHabilitado__Group__2__Impl11422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__Group__3__Impl_in_rule__AsercionHabilitado__Group__311453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionHabilitado__ElementoAssignment_3_in_rule__AsercionHabilitado__Group__3__Impl11480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionValor__Group__0__Impl_in_rule__AsercionValor__Group__011518 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AsercionValor__Group__1_in_rule__AsercionValor__Group__011521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__AsercionValor__Group__0__Impl11549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionValor__Group__1__Impl_in_rule__AsercionValor__Group__111580 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AsercionValor__Group__2_in_rule__AsercionValor__Group__111583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionValor__ValorAssignment_1_in_rule__AsercionValor__Group__1__Impl11610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionValor__Group__2__Impl_in_rule__AsercionValor__Group__211640 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AsercionValor__Group__3_in_rule__AsercionValor__Group__211643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AsercionValor__Group__2__Impl11671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionValor__Group__3__Impl_in_rule__AsercionValor__Group__311702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionValor__ElementoAssignment_3_in_rule__AsercionValor__Group__3__Impl11729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__Group__0__Impl_in_rule__AsercionSeleccion__Group__011767 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__Group__1_in_rule__AsercionSeleccion__Group__011770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__AsercionSeleccion__Group__0__Impl11798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__Group__1__Impl_in_rule__AsercionSeleccion__Group__111829 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__Group__2_in_rule__AsercionSeleccion__Group__111832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__EstadoAssignment_1_in_rule__AsercionSeleccion__Group__1__Impl11859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__Group__2__Impl_in_rule__AsercionSeleccion__Group__211889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__Group__3_in_rule__AsercionSeleccion__Group__211892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AsercionSeleccion__Group__2__Impl11920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__Group__3__Impl_in_rule__AsercionSeleccion__Group__311951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AsercionSeleccion__ElementoAssignment_3_in_rule__AsercionSeleccion__Group__3__Impl11978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Formulario__NameAssignment_112021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Formulario__ComprobacionCamposAssignment_312057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Formulario__ComprobacionAccionAssignment_412101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Formulario__LayoutAssignment_512140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_rule__Formulario__PruebasAssignment_612171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Layout__ColumnasAssignment_312202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_4_212233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_4_3_112264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccion_in_rule__PruebaInterfaz__AccionesAssignment_3_012295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccion_in_rule__PruebaInterfaz__AccionesAssignment_3_1_112326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__InputTexto__DeshabilitadoAssignment_212362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_rule__InputTexto__ObligatorioAssignment_312406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__InputTexto__InvisibleAssignment_412450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputTexto__NameAssignment_512489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputTexto__ValorAssignment_6_112520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__InputRadio__InvisibleAssignment_112556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__InputRadio__DeshabilitadoAssignment_212600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__NameAssignment_312639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_5_112670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_5_2_112701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputRadio__SeleccionAssignment_6_112732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccion_in_rule__InputRadio__ReaccionAssignment_7_112763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__InputCombo__InvisibleAssignment_212799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__InputCombo__DeshabilitadoAssignment_312843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__NameAssignment_412882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_112913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_2_112944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCombo__SeleccionAssignment_7_112975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__InputCheck__InvisibleAssignment_113011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__InputCheck__DeshabilitadoAssignment_213055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__NameAssignment_313094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_5_113125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_5_2_113156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_6_213187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_6_3_113218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccion_in_rule__InputCheck__ReaccionAssignment_7_113249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__BotonValidar__InvisibleAssignment_213285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__BotonValidar__DeshabilitadoAssignment_313329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BotonValidar__NameAssignment_413368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__BotonGuardar_Impl__InvisibleAssignment_213404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__BotonGuardar_Impl__DeshabilitadoAssignment_313448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BotonGuardar_Impl__NameAssignment_413487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__BotonCancelar__InvisibleAssignment_213523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__BotonCancelar__DeshabilitadoAssignment_313567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BotonCancelar__NameAssignment_413606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_rule__BotonCustom__InvisibleAssignment_113642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_rule__BotonCustom__DeshabilitadoAssignment_213686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BotonCustom__NameAssignment_313725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BotonCustom__FuncionAssignment_513756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ReaccionVisible__ActivacionAssignment_113787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ReaccionVisible__ObjetivoAssignment_313822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__ReaccionHabilitado__ActivacionAssignment_113857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ReaccionHabilitado__ObjetivoAssignment_313892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AccionValor__ValorAssignment_113927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AccionValor__ElementoAssignment_313962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercion_in_rule__AccionValor__AsercionAssignment_513997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AccionSeleccion__ElementoAssignment_114032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__AccionSeleccion__ValorAssignment_314067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercion_in_rule__AccionSeleccion__AsercionAssignment_514098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AccionPulsacion__ElementoAssignment_114133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercion_in_rule__AccionPulsacion__AsercionAssignment_314168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__AsercionInvisible__EstadoAssignment_114204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AsercionInvisible__ElementoAssignment_314247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_rule__AsercionHabilitado__EstadoAssignment_114287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AsercionHabilitado__ElementoAssignment_314330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AsercionValor__ValorAssignment_114365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AsercionValor__ElementoAssignment_314400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__AsercionSeleccion__EstadoAssignment_114435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AsercionSeleccion__ElementoAssignment_314470 = new BitSet(new long[]{0x0000000000000002L});
    }


}