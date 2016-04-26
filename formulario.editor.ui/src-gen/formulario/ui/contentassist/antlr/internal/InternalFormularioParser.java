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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Formulario'", "'{'", "'layout'", "'}'", "'pruebas'", "'Layout'", "'anchura'", "'altura'", "'entradas'", "','", "'PruebaInterfaz'", "'acciones'", "'('", "')'", "'aserciones'", "'-'", "'Input'", "'InputTexto'", "'valor'", "'InputBoton'", "'InputMultiple'", "'valores'", "'InputRadio'", "'seleccion'", "'InputCombo'", "'InputCheck'", "'comprobarAsercion'", "'comprobarAccion'", "'visible'", "'habilitado'", "'obligatorio'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleLayout"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:116:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:117:1: ( ruleLayout EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:118:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout181);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout188); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:125:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:129:2: ( ( ( rule__Layout__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:130:1: ( ( rule__Layout__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:130:1: ( ( rule__Layout__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:131:1: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:132:1: ( rule__Layout__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:132:2: rule__Layout__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0_in_ruleLayout214);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:145:1: ( ruleEString EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:160:1: ( rule__EString__Alternatives )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:174:1: entryRulePruebaInterfaz : rulePruebaInterfaz EOF ;
    public final void entryRulePruebaInterfaz() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:175:1: ( rulePruebaInterfaz EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:176:1: rulePruebaInterfaz EOF
            {
             before(grammarAccess.getPruebaInterfazRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz303);
            rulePruebaInterfaz();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz310); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:183:1: rulePruebaInterfaz : ( ( rule__PruebaInterfaz__Group__0 ) ) ;
    public final void rulePruebaInterfaz() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:187:2: ( ( ( rule__PruebaInterfaz__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:188:1: ( ( rule__PruebaInterfaz__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:188:1: ( ( rule__PruebaInterfaz__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:189:1: ( rule__PruebaInterfaz__Group__0 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:190:1: ( rule__PruebaInterfaz__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:190:2: rule__PruebaInterfaz__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__0_in_rulePruebaInterfaz336);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:202:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:203:1: ( ruleEInt EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:204:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt363);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt370); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:211:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:215:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:216:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:216:1: ( ( rule__EInt__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:217:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:218:1: ( rule__EInt__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:218:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt396);
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


    // $ANTLR start "entryRuleInput_Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:230:1: entryRuleInput_Impl : ruleInput_Impl EOF ;
    public final void entryRuleInput_Impl() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:231:1: ( ruleInput_Impl EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:232:1: ruleInput_Impl EOF
            {
             before(grammarAccess.getInput_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl423);
            ruleInput_Impl();

            state._fsp--;

             after(grammarAccess.getInput_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput_Impl430); 

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
    // $ANTLR end "entryRuleInput_Impl"


    // $ANTLR start "ruleInput_Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:239:1: ruleInput_Impl : ( ( rule__Input_Impl__Group__0 ) ) ;
    public final void ruleInput_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:243:2: ( ( ( rule__Input_Impl__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:244:1: ( ( rule__Input_Impl__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:244:1: ( ( rule__Input_Impl__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:245:1: ( rule__Input_Impl__Group__0 )
            {
             before(grammarAccess.getInput_ImplAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:246:1: ( rule__Input_Impl__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:246:2: rule__Input_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__0_in_ruleInput_Impl456);
            rule__Input_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInput_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleInput_Impl"


    // $ANTLR start "entryRuleInputTexto"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:258:1: entryRuleInputTexto : ruleInputTexto EOF ;
    public final void entryRuleInputTexto() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:259:1: ( ruleInputTexto EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:260:1: ruleInputTexto EOF
            {
             before(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto483);
            ruleInputTexto();

            state._fsp--;

             after(grammarAccess.getInputTextoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto490); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:267:1: ruleInputTexto : ( ( rule__InputTexto__Group__0 ) ) ;
    public final void ruleInputTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:271:2: ( ( ( rule__InputTexto__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:272:1: ( ( rule__InputTexto__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:272:1: ( ( rule__InputTexto__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:273:1: ( rule__InputTexto__Group__0 )
            {
             before(grammarAccess.getInputTextoAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:274:1: ( rule__InputTexto__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:274:2: rule__InputTexto__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__0_in_ruleInputTexto516);
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


    // $ANTLR start "entryRuleInputBoton"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:286:1: entryRuleInputBoton : ruleInputBoton EOF ;
    public final void entryRuleInputBoton() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:287:1: ( ruleInputBoton EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:288:1: ruleInputBoton EOF
            {
             before(grammarAccess.getInputBotonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_entryRuleInputBoton543);
            ruleInputBoton();

            state._fsp--;

             after(grammarAccess.getInputBotonRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputBoton550); 

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
    // $ANTLR end "entryRuleInputBoton"


    // $ANTLR start "ruleInputBoton"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:295:1: ruleInputBoton : ( ( rule__InputBoton__Group__0 ) ) ;
    public final void ruleInputBoton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:299:2: ( ( ( rule__InputBoton__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:300:1: ( ( rule__InputBoton__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:300:1: ( ( rule__InputBoton__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:301:1: ( rule__InputBoton__Group__0 )
            {
             before(grammarAccess.getInputBotonAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:302:1: ( rule__InputBoton__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:302:2: rule__InputBoton__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__0_in_ruleInputBoton576);
            rule__InputBoton__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputBotonAccess().getGroup()); 

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
    // $ANTLR end "ruleInputBoton"


    // $ANTLR start "entryRuleInputMultiple_Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:314:1: entryRuleInputMultiple_Impl : ruleInputMultiple_Impl EOF ;
    public final void entryRuleInputMultiple_Impl() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:315:1: ( ruleInputMultiple_Impl EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:316:1: ruleInputMultiple_Impl EOF
            {
             before(grammarAccess.getInputMultiple_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_entryRuleInputMultiple_Impl603);
            ruleInputMultiple_Impl();

            state._fsp--;

             after(grammarAccess.getInputMultiple_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputMultiple_Impl610); 

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
    // $ANTLR end "entryRuleInputMultiple_Impl"


    // $ANTLR start "ruleInputMultiple_Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:323:1: ruleInputMultiple_Impl : ( ( rule__InputMultiple_Impl__Group__0 ) ) ;
    public final void ruleInputMultiple_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:327:2: ( ( ( rule__InputMultiple_Impl__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:328:1: ( ( rule__InputMultiple_Impl__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:328:1: ( ( rule__InputMultiple_Impl__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:329:1: ( rule__InputMultiple_Impl__Group__0 )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:330:1: ( rule__InputMultiple_Impl__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:330:2: rule__InputMultiple_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__0_in_ruleInputMultiple_Impl636);
            rule__InputMultiple_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputMultiple_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleInputMultiple_Impl"


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


    // $ANTLR start "rule__Input__Alternatives"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:430:1: rule__Input__Alternatives : ( ( ruleInput_Impl ) | ( ruleInputTexto ) | ( ruleInputBoton ) | ( ruleInputMultiple_Impl ) | ( ruleInputRadio ) | ( ruleInputCombo ) | ( ruleInputCheck ) );
    public final void rule__Input__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:434:1: ( ( ruleInput_Impl ) | ( ruleInputTexto ) | ( ruleInputBoton ) | ( ruleInputMultiple_Impl ) | ( ruleInputRadio ) | ( ruleInputCombo ) | ( ruleInputCheck ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:435:1: ( ruleInput_Impl )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:435:1: ( ruleInput_Impl )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:436:1: ruleInput_Impl
                    {
                     before(grammarAccess.getInputAccess().getInput_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_rule__Input__Alternatives856);
                    ruleInput_Impl();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInput_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:441:6: ( ruleInputTexto )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:441:6: ( ruleInputTexto )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:442:1: ruleInputTexto
                    {
                     before(grammarAccess.getInputAccess().getInputTextoParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_rule__Input__Alternatives873);
                    ruleInputTexto();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputTextoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:447:6: ( ruleInputBoton )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:447:6: ( ruleInputBoton )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:448:1: ruleInputBoton
                    {
                     before(grammarAccess.getInputAccess().getInputBotonParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_rule__Input__Alternatives890);
                    ruleInputBoton();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputBotonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:453:6: ( ruleInputMultiple_Impl )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:453:6: ( ruleInputMultiple_Impl )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:454:1: ruleInputMultiple_Impl
                    {
                     before(grammarAccess.getInputAccess().getInputMultiple_ImplParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_rule__Input__Alternatives907);
                    ruleInputMultiple_Impl();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputMultiple_ImplParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:459:6: ( ruleInputRadio )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:459:6: ( ruleInputRadio )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:460:1: ruleInputRadio
                    {
                     before(grammarAccess.getInputAccess().getInputRadioParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_rule__Input__Alternatives924);
                    ruleInputRadio();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputRadioParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:465:6: ( ruleInputCombo )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:465:6: ( ruleInputCombo )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:466:1: ruleInputCombo
                    {
                     before(grammarAccess.getInputAccess().getInputComboParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_rule__Input__Alternatives941);
                    ruleInputCombo();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputComboParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:471:6: ( ruleInputCheck )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:471:6: ( ruleInputCheck )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:472:1: ruleInputCheck
                    {
                     before(grammarAccess.getInputAccess().getInputCheckParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_rule__Input__Alternatives958);
                    ruleInputCheck();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputCheckParserRuleCall_6()); 

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


    // $ANTLR start "rule__EString__Alternatives"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:482:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:486:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:487:1: ( RULE_STRING )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:487:1: ( RULE_STRING )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:488:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives990); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:493:6: ( RULE_ID )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:493:6: ( RULE_ID )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:494:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1007); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:507:1: rule__Formulario__Group__0 : rule__Formulario__Group__0__Impl rule__Formulario__Group__1 ;
    public final void rule__Formulario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:511:1: ( rule__Formulario__Group__0__Impl rule__Formulario__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:512:2: rule__Formulario__Group__0__Impl rule__Formulario__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__0__Impl_in_rule__Formulario__Group__01038);
            rule__Formulario__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__1_in_rule__Formulario__Group__01041);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:519:1: rule__Formulario__Group__0__Impl : ( ( rule__Formulario__ComprobarAsercionAssignment_0 )? ) ;
    public final void rule__Formulario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:523:1: ( ( ( rule__Formulario__ComprobarAsercionAssignment_0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:524:1: ( ( rule__Formulario__ComprobarAsercionAssignment_0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:524:1: ( ( rule__Formulario__ComprobarAsercionAssignment_0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:525:1: ( rule__Formulario__ComprobarAsercionAssignment_0 )?
            {
             before(grammarAccess.getFormularioAccess().getComprobarAsercionAssignment_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:526:1: ( rule__Formulario__ComprobarAsercionAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:526:2: rule__Formulario__ComprobarAsercionAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__ComprobarAsercionAssignment_0_in_rule__Formulario__Group__0__Impl1068);
                    rule__Formulario__ComprobarAsercionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormularioAccess().getComprobarAsercionAssignment_0()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:536:1: rule__Formulario__Group__1 : rule__Formulario__Group__1__Impl rule__Formulario__Group__2 ;
    public final void rule__Formulario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:540:1: ( rule__Formulario__Group__1__Impl rule__Formulario__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:541:2: rule__Formulario__Group__1__Impl rule__Formulario__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__1__Impl_in_rule__Formulario__Group__11099);
            rule__Formulario__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__2_in_rule__Formulario__Group__11102);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:548:1: rule__Formulario__Group__1__Impl : ( ( rule__Formulario__ComprobarAccionAssignment_1 )? ) ;
    public final void rule__Formulario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:552:1: ( ( ( rule__Formulario__ComprobarAccionAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:553:1: ( ( rule__Formulario__ComprobarAccionAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:553:1: ( ( rule__Formulario__ComprobarAccionAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:554:1: ( rule__Formulario__ComprobarAccionAssignment_1 )?
            {
             before(grammarAccess.getFormularioAccess().getComprobarAccionAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:555:1: ( rule__Formulario__ComprobarAccionAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:555:2: rule__Formulario__ComprobarAccionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__ComprobarAccionAssignment_1_in_rule__Formulario__Group__1__Impl1129);
                    rule__Formulario__ComprobarAccionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormularioAccess().getComprobarAccionAssignment_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:565:1: rule__Formulario__Group__2 : rule__Formulario__Group__2__Impl rule__Formulario__Group__3 ;
    public final void rule__Formulario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:569:1: ( rule__Formulario__Group__2__Impl rule__Formulario__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:570:2: rule__Formulario__Group__2__Impl rule__Formulario__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__2__Impl_in_rule__Formulario__Group__21160);
            rule__Formulario__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__3_in_rule__Formulario__Group__21163);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:577:1: rule__Formulario__Group__2__Impl : ( 'Formulario' ) ;
    public final void rule__Formulario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:581:1: ( ( 'Formulario' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:582:1: ( 'Formulario' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:582:1: ( 'Formulario' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:583:1: 'Formulario'
            {
             before(grammarAccess.getFormularioAccess().getFormularioKeyword_2()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Formulario__Group__2__Impl1191); 
             after(grammarAccess.getFormularioAccess().getFormularioKeyword_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:596:1: rule__Formulario__Group__3 : rule__Formulario__Group__3__Impl rule__Formulario__Group__4 ;
    public final void rule__Formulario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:600:1: ( rule__Formulario__Group__3__Impl rule__Formulario__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:601:2: rule__Formulario__Group__3__Impl rule__Formulario__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__3__Impl_in_rule__Formulario__Group__31222);
            rule__Formulario__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__4_in_rule__Formulario__Group__31225);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:608:1: rule__Formulario__Group__3__Impl : ( ( rule__Formulario__NameAssignment_3 ) ) ;
    public final void rule__Formulario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:612:1: ( ( ( rule__Formulario__NameAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:613:1: ( ( rule__Formulario__NameAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:613:1: ( ( rule__Formulario__NameAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:614:1: ( rule__Formulario__NameAssignment_3 )
            {
             before(grammarAccess.getFormularioAccess().getNameAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:615:1: ( rule__Formulario__NameAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:615:2: rule__Formulario__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__NameAssignment_3_in_rule__Formulario__Group__3__Impl1252);
            rule__Formulario__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFormularioAccess().getNameAssignment_3()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:625:1: rule__Formulario__Group__4 : rule__Formulario__Group__4__Impl rule__Formulario__Group__5 ;
    public final void rule__Formulario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:629:1: ( rule__Formulario__Group__4__Impl rule__Formulario__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:630:2: rule__Formulario__Group__4__Impl rule__Formulario__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__4__Impl_in_rule__Formulario__Group__41282);
            rule__Formulario__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__5_in_rule__Formulario__Group__41285);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:637:1: rule__Formulario__Group__4__Impl : ( '{' ) ;
    public final void rule__Formulario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:641:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:642:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:642:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:643:1: '{'
            {
             before(grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Formulario__Group__4__Impl1313); 
             after(grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_4()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:656:1: rule__Formulario__Group__5 : rule__Formulario__Group__5__Impl rule__Formulario__Group__6 ;
    public final void rule__Formulario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:660:1: ( rule__Formulario__Group__5__Impl rule__Formulario__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:661:2: rule__Formulario__Group__5__Impl rule__Formulario__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__5__Impl_in_rule__Formulario__Group__51344);
            rule__Formulario__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__6_in_rule__Formulario__Group__51347);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:668:1: rule__Formulario__Group__5__Impl : ( 'layout' ) ;
    public final void rule__Formulario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:672:1: ( ( 'layout' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:673:1: ( 'layout' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:673:1: ( 'layout' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:674:1: 'layout'
            {
             before(grammarAccess.getFormularioAccess().getLayoutKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Formulario__Group__5__Impl1375); 
             after(grammarAccess.getFormularioAccess().getLayoutKeyword_5()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:687:1: rule__Formulario__Group__6 : rule__Formulario__Group__6__Impl rule__Formulario__Group__7 ;
    public final void rule__Formulario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:691:1: ( rule__Formulario__Group__6__Impl rule__Formulario__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:692:2: rule__Formulario__Group__6__Impl rule__Formulario__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__6__Impl_in_rule__Formulario__Group__61406);
            rule__Formulario__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__7_in_rule__Formulario__Group__61409);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:699:1: rule__Formulario__Group__6__Impl : ( ( rule__Formulario__LayoutAssignment_6 ) ) ;
    public final void rule__Formulario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:703:1: ( ( ( rule__Formulario__LayoutAssignment_6 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:704:1: ( ( rule__Formulario__LayoutAssignment_6 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:704:1: ( ( rule__Formulario__LayoutAssignment_6 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:705:1: ( rule__Formulario__LayoutAssignment_6 )
            {
             before(grammarAccess.getFormularioAccess().getLayoutAssignment_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:706:1: ( rule__Formulario__LayoutAssignment_6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:706:2: rule__Formulario__LayoutAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__LayoutAssignment_6_in_rule__Formulario__Group__6__Impl1436);
            rule__Formulario__LayoutAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFormularioAccess().getLayoutAssignment_6()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:716:1: rule__Formulario__Group__7 : rule__Formulario__Group__7__Impl rule__Formulario__Group__8 ;
    public final void rule__Formulario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:720:1: ( rule__Formulario__Group__7__Impl rule__Formulario__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:721:2: rule__Formulario__Group__7__Impl rule__Formulario__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__7__Impl_in_rule__Formulario__Group__71466);
            rule__Formulario__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__8_in_rule__Formulario__Group__71469);
            rule__Formulario__Group__8();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:728:1: rule__Formulario__Group__7__Impl : ( ( rule__Formulario__Group_7__0 )? ) ;
    public final void rule__Formulario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:732:1: ( ( ( rule__Formulario__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:733:1: ( ( rule__Formulario__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:733:1: ( ( rule__Formulario__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:734:1: ( rule__Formulario__Group_7__0 )?
            {
             before(grammarAccess.getFormularioAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:735:1: ( rule__Formulario__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:735:2: rule__Formulario__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group_7__0_in_rule__Formulario__Group__7__Impl1496);
                    rule__Formulario__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormularioAccess().getGroup_7()); 

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


    // $ANTLR start "rule__Formulario__Group__8"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:745:1: rule__Formulario__Group__8 : rule__Formulario__Group__8__Impl ;
    public final void rule__Formulario__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:749:1: ( rule__Formulario__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:750:2: rule__Formulario__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__8__Impl_in_rule__Formulario__Group__81527);
            rule__Formulario__Group__8__Impl();

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
    // $ANTLR end "rule__Formulario__Group__8"


    // $ANTLR start "rule__Formulario__Group__8__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:756:1: rule__Formulario__Group__8__Impl : ( '}' ) ;
    public final void rule__Formulario__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:760:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:761:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:761:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:762:1: '}'
            {
             before(grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Formulario__Group__8__Impl1555); 
             after(grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Formulario__Group__8__Impl"


    // $ANTLR start "rule__Formulario__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:793:1: rule__Formulario__Group_7__0 : rule__Formulario__Group_7__0__Impl rule__Formulario__Group_7__1 ;
    public final void rule__Formulario__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:797:1: ( rule__Formulario__Group_7__0__Impl rule__Formulario__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:798:2: rule__Formulario__Group_7__0__Impl rule__Formulario__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group_7__0__Impl_in_rule__Formulario__Group_7__01604);
            rule__Formulario__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group_7__1_in_rule__Formulario__Group_7__01607);
            rule__Formulario__Group_7__1();

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
    // $ANTLR end "rule__Formulario__Group_7__0"


    // $ANTLR start "rule__Formulario__Group_7__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:805:1: rule__Formulario__Group_7__0__Impl : ( 'pruebas' ) ;
    public final void rule__Formulario__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:809:1: ( ( 'pruebas' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:810:1: ( 'pruebas' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:810:1: ( 'pruebas' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:811:1: 'pruebas'
            {
             before(grammarAccess.getFormularioAccess().getPruebasKeyword_7_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Formulario__Group_7__0__Impl1635); 
             after(grammarAccess.getFormularioAccess().getPruebasKeyword_7_0()); 

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
    // $ANTLR end "rule__Formulario__Group_7__0__Impl"


    // $ANTLR start "rule__Formulario__Group_7__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:824:1: rule__Formulario__Group_7__1 : rule__Formulario__Group_7__1__Impl ;
    public final void rule__Formulario__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:828:1: ( rule__Formulario__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:829:2: rule__Formulario__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group_7__1__Impl_in_rule__Formulario__Group_7__11666);
            rule__Formulario__Group_7__1__Impl();

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
    // $ANTLR end "rule__Formulario__Group_7__1"


    // $ANTLR start "rule__Formulario__Group_7__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:835:1: rule__Formulario__Group_7__1__Impl : ( ( rule__Formulario__PruebasAssignment_7_1 ) ) ;
    public final void rule__Formulario__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:839:1: ( ( ( rule__Formulario__PruebasAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:840:1: ( ( rule__Formulario__PruebasAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:840:1: ( ( rule__Formulario__PruebasAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:841:1: ( rule__Formulario__PruebasAssignment_7_1 )
            {
             before(grammarAccess.getFormularioAccess().getPruebasAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:842:1: ( rule__Formulario__PruebasAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:842:2: rule__Formulario__PruebasAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__PruebasAssignment_7_1_in_rule__Formulario__Group_7__1__Impl1693);
            rule__Formulario__PruebasAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getFormularioAccess().getPruebasAssignment_7_1()); 

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
    // $ANTLR end "rule__Formulario__Group_7__1__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:856:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:860:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:861:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__01727);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__01730);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:868:1: rule__Layout__Group__0__Impl : ( () ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:872:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:873:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:873:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:874:1: ()
            {
             before(grammarAccess.getLayoutAccess().getLayoutAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:875:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:877:1: 
            {
            }

             after(grammarAccess.getLayoutAccess().getLayoutAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:887:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:891:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:892:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__11788);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__11791);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:899:1: rule__Layout__Group__1__Impl : ( 'Layout' ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:903:1: ( ( 'Layout' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:904:1: ( 'Layout' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:904:1: ( 'Layout' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:905:1: 'Layout'
            {
             before(grammarAccess.getLayoutAccess().getLayoutKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Layout__Group__1__Impl1819); 
             after(grammarAccess.getLayoutAccess().getLayoutKeyword_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:918:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:922:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:923:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__21850);
            rule__Layout__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__21853);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:930:1: rule__Layout__Group__2__Impl : ( '{' ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:934:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:935:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:935:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:936:1: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Layout__Group__2__Impl1881); 
             after(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:949:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl rule__Layout__Group__4 ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:953:1: ( rule__Layout__Group__3__Impl rule__Layout__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:954:2: rule__Layout__Group__3__Impl rule__Layout__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__31912);
            rule__Layout__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__31915);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:961:1: rule__Layout__Group__3__Impl : ( ( rule__Layout__Group_3__0 )? ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:965:1: ( ( ( rule__Layout__Group_3__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:966:1: ( ( rule__Layout__Group_3__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:966:1: ( ( rule__Layout__Group_3__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:967:1: ( rule__Layout__Group_3__0 )?
            {
             before(grammarAccess.getLayoutAccess().getGroup_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:968:1: ( rule__Layout__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:968:2: rule__Layout__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__0_in_rule__Layout__Group__3__Impl1942);
                    rule__Layout__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayoutAccess().getGroup_3()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:978:1: rule__Layout__Group__4 : rule__Layout__Group__4__Impl rule__Layout__Group__5 ;
    public final void rule__Layout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:982:1: ( rule__Layout__Group__4__Impl rule__Layout__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:983:2: rule__Layout__Group__4__Impl rule__Layout__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__41973);
            rule__Layout__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__5_in_rule__Layout__Group__41976);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:990:1: rule__Layout__Group__4__Impl : ( ( rule__Layout__Group_4__0 )? ) ;
    public final void rule__Layout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:994:1: ( ( ( rule__Layout__Group_4__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:995:1: ( ( rule__Layout__Group_4__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:995:1: ( ( rule__Layout__Group_4__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:996:1: ( rule__Layout__Group_4__0 )?
            {
             before(grammarAccess.getLayoutAccess().getGroup_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:997:1: ( rule__Layout__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:997:2: rule__Layout__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__0_in_rule__Layout__Group__4__Impl2003);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1007:1: rule__Layout__Group__5 : rule__Layout__Group__5__Impl rule__Layout__Group__6 ;
    public final void rule__Layout__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1011:1: ( rule__Layout__Group__5__Impl rule__Layout__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1012:2: rule__Layout__Group__5__Impl rule__Layout__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__5__Impl_in_rule__Layout__Group__52034);
            rule__Layout__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__6_in_rule__Layout__Group__52037);
            rule__Layout__Group__6();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1019:1: rule__Layout__Group__5__Impl : ( ( rule__Layout__Group_5__0 )? ) ;
    public final void rule__Layout__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1023:1: ( ( ( rule__Layout__Group_5__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1024:1: ( ( rule__Layout__Group_5__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1024:1: ( ( rule__Layout__Group_5__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1025:1: ( rule__Layout__Group_5__0 )?
            {
             before(grammarAccess.getLayoutAccess().getGroup_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1026:1: ( rule__Layout__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1026:2: rule__Layout__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__0_in_rule__Layout__Group__5__Impl2064);
                    rule__Layout__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLayoutAccess().getGroup_5()); 

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


    // $ANTLR start "rule__Layout__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1036:1: rule__Layout__Group__6 : rule__Layout__Group__6__Impl ;
    public final void rule__Layout__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1040:1: ( rule__Layout__Group__6__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1041:2: rule__Layout__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__6__Impl_in_rule__Layout__Group__62095);
            rule__Layout__Group__6__Impl();

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
    // $ANTLR end "rule__Layout__Group__6"


    // $ANTLR start "rule__Layout__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1047:1: rule__Layout__Group__6__Impl : ( '}' ) ;
    public final void rule__Layout__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1051:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1052:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1052:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1053:1: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Layout__Group__6__Impl2123); 
             after(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Layout__Group__6__Impl"


    // $ANTLR start "rule__Layout__Group_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1080:1: rule__Layout__Group_3__0 : rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1 ;
    public final void rule__Layout__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1084:1: ( rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1085:2: rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__0__Impl_in_rule__Layout__Group_3__02168);
            rule__Layout__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__1_in_rule__Layout__Group_3__02171);
            rule__Layout__Group_3__1();

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
    // $ANTLR end "rule__Layout__Group_3__0"


    // $ANTLR start "rule__Layout__Group_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1092:1: rule__Layout__Group_3__0__Impl : ( 'anchura' ) ;
    public final void rule__Layout__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1096:1: ( ( 'anchura' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1097:1: ( 'anchura' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1097:1: ( 'anchura' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1098:1: 'anchura'
            {
             before(grammarAccess.getLayoutAccess().getAnchuraKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Layout__Group_3__0__Impl2199); 
             after(grammarAccess.getLayoutAccess().getAnchuraKeyword_3_0()); 

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
    // $ANTLR end "rule__Layout__Group_3__0__Impl"


    // $ANTLR start "rule__Layout__Group_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1111:1: rule__Layout__Group_3__1 : rule__Layout__Group_3__1__Impl ;
    public final void rule__Layout__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1115:1: ( rule__Layout__Group_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1116:2: rule__Layout__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__1__Impl_in_rule__Layout__Group_3__12230);
            rule__Layout__Group_3__1__Impl();

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
    // $ANTLR end "rule__Layout__Group_3__1"


    // $ANTLR start "rule__Layout__Group_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1122:1: rule__Layout__Group_3__1__Impl : ( ( rule__Layout__AnchuraAssignment_3_1 ) ) ;
    public final void rule__Layout__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1126:1: ( ( ( rule__Layout__AnchuraAssignment_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1127:1: ( ( rule__Layout__AnchuraAssignment_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1127:1: ( ( rule__Layout__AnchuraAssignment_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1128:1: ( rule__Layout__AnchuraAssignment_3_1 )
            {
             before(grammarAccess.getLayoutAccess().getAnchuraAssignment_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1129:1: ( rule__Layout__AnchuraAssignment_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1129:2: rule__Layout__AnchuraAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__AnchuraAssignment_3_1_in_rule__Layout__Group_3__1__Impl2257);
            rule__Layout__AnchuraAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAnchuraAssignment_3_1()); 

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
    // $ANTLR end "rule__Layout__Group_3__1__Impl"


    // $ANTLR start "rule__Layout__Group_4__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1143:1: rule__Layout__Group_4__0 : rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1 ;
    public final void rule__Layout__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1147:1: ( rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1148:2: rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__0__Impl_in_rule__Layout__Group_4__02291);
            rule__Layout__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__1_in_rule__Layout__Group_4__02294);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1155:1: rule__Layout__Group_4__0__Impl : ( 'altura' ) ;
    public final void rule__Layout__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1159:1: ( ( 'altura' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1160:1: ( 'altura' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1160:1: ( 'altura' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1161:1: 'altura'
            {
             before(grammarAccess.getLayoutAccess().getAlturaKeyword_4_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Layout__Group_4__0__Impl2322); 
             after(grammarAccess.getLayoutAccess().getAlturaKeyword_4_0()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1174:1: rule__Layout__Group_4__1 : rule__Layout__Group_4__1__Impl ;
    public final void rule__Layout__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1178:1: ( rule__Layout__Group_4__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1179:2: rule__Layout__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__1__Impl_in_rule__Layout__Group_4__12353);
            rule__Layout__Group_4__1__Impl();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1185:1: rule__Layout__Group_4__1__Impl : ( ( rule__Layout__AlturaAssignment_4_1 ) ) ;
    public final void rule__Layout__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1189:1: ( ( ( rule__Layout__AlturaAssignment_4_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1190:1: ( ( rule__Layout__AlturaAssignment_4_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1190:1: ( ( rule__Layout__AlturaAssignment_4_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1191:1: ( rule__Layout__AlturaAssignment_4_1 )
            {
             before(grammarAccess.getLayoutAccess().getAlturaAssignment_4_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1192:1: ( rule__Layout__AlturaAssignment_4_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1192:2: rule__Layout__AlturaAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__AlturaAssignment_4_1_in_rule__Layout__Group_4__1__Impl2380);
            rule__Layout__AlturaAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAlturaAssignment_4_1()); 

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


    // $ANTLR start "rule__Layout__Group_5__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1206:1: rule__Layout__Group_5__0 : rule__Layout__Group_5__0__Impl rule__Layout__Group_5__1 ;
    public final void rule__Layout__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1210:1: ( rule__Layout__Group_5__0__Impl rule__Layout__Group_5__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1211:2: rule__Layout__Group_5__0__Impl rule__Layout__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__0__Impl_in_rule__Layout__Group_5__02414);
            rule__Layout__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__1_in_rule__Layout__Group_5__02417);
            rule__Layout__Group_5__1();

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
    // $ANTLR end "rule__Layout__Group_5__0"


    // $ANTLR start "rule__Layout__Group_5__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1218:1: rule__Layout__Group_5__0__Impl : ( 'entradas' ) ;
    public final void rule__Layout__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1222:1: ( ( 'entradas' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1223:1: ( 'entradas' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1223:1: ( 'entradas' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1224:1: 'entradas'
            {
             before(grammarAccess.getLayoutAccess().getEntradasKeyword_5_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Layout__Group_5__0__Impl2445); 
             after(grammarAccess.getLayoutAccess().getEntradasKeyword_5_0()); 

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
    // $ANTLR end "rule__Layout__Group_5__0__Impl"


    // $ANTLR start "rule__Layout__Group_5__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1237:1: rule__Layout__Group_5__1 : rule__Layout__Group_5__1__Impl rule__Layout__Group_5__2 ;
    public final void rule__Layout__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1241:1: ( rule__Layout__Group_5__1__Impl rule__Layout__Group_5__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1242:2: rule__Layout__Group_5__1__Impl rule__Layout__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__1__Impl_in_rule__Layout__Group_5__12476);
            rule__Layout__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__2_in_rule__Layout__Group_5__12479);
            rule__Layout__Group_5__2();

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
    // $ANTLR end "rule__Layout__Group_5__1"


    // $ANTLR start "rule__Layout__Group_5__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1249:1: rule__Layout__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Layout__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1253:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1254:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1254:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1255:1: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Layout__Group_5__1__Impl2507); 
             after(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Layout__Group_5__1__Impl"


    // $ANTLR start "rule__Layout__Group_5__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1268:1: rule__Layout__Group_5__2 : rule__Layout__Group_5__2__Impl rule__Layout__Group_5__3 ;
    public final void rule__Layout__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1272:1: ( rule__Layout__Group_5__2__Impl rule__Layout__Group_5__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1273:2: rule__Layout__Group_5__2__Impl rule__Layout__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__2__Impl_in_rule__Layout__Group_5__22538);
            rule__Layout__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__3_in_rule__Layout__Group_5__22541);
            rule__Layout__Group_5__3();

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
    // $ANTLR end "rule__Layout__Group_5__2"


    // $ANTLR start "rule__Layout__Group_5__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1280:1: rule__Layout__Group_5__2__Impl : ( ( rule__Layout__EntradasAssignment_5_2 ) ) ;
    public final void rule__Layout__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1284:1: ( ( ( rule__Layout__EntradasAssignment_5_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1285:1: ( ( rule__Layout__EntradasAssignment_5_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1285:1: ( ( rule__Layout__EntradasAssignment_5_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1286:1: ( rule__Layout__EntradasAssignment_5_2 )
            {
             before(grammarAccess.getLayoutAccess().getEntradasAssignment_5_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1287:1: ( rule__Layout__EntradasAssignment_5_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1287:2: rule__Layout__EntradasAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__EntradasAssignment_5_2_in_rule__Layout__Group_5__2__Impl2568);
            rule__Layout__EntradasAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getEntradasAssignment_5_2()); 

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
    // $ANTLR end "rule__Layout__Group_5__2__Impl"


    // $ANTLR start "rule__Layout__Group_5__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1297:1: rule__Layout__Group_5__3 : rule__Layout__Group_5__3__Impl rule__Layout__Group_5__4 ;
    public final void rule__Layout__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1301:1: ( rule__Layout__Group_5__3__Impl rule__Layout__Group_5__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1302:2: rule__Layout__Group_5__3__Impl rule__Layout__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__3__Impl_in_rule__Layout__Group_5__32598);
            rule__Layout__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__4_in_rule__Layout__Group_5__32601);
            rule__Layout__Group_5__4();

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
    // $ANTLR end "rule__Layout__Group_5__3"


    // $ANTLR start "rule__Layout__Group_5__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1309:1: rule__Layout__Group_5__3__Impl : ( ( rule__Layout__Group_5_3__0 )* ) ;
    public final void rule__Layout__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1313:1: ( ( ( rule__Layout__Group_5_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1314:1: ( ( rule__Layout__Group_5_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1314:1: ( ( rule__Layout__Group_5_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1315:1: ( rule__Layout__Group_5_3__0 )*
            {
             before(grammarAccess.getLayoutAccess().getGroup_5_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1316:1: ( rule__Layout__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1316:2: rule__Layout__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5_3__0_in_rule__Layout__Group_5__3__Impl2628);
            	    rule__Layout__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLayoutAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Layout__Group_5__3__Impl"


    // $ANTLR start "rule__Layout__Group_5__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1326:1: rule__Layout__Group_5__4 : rule__Layout__Group_5__4__Impl ;
    public final void rule__Layout__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1330:1: ( rule__Layout__Group_5__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1331:2: rule__Layout__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__4__Impl_in_rule__Layout__Group_5__42659);
            rule__Layout__Group_5__4__Impl();

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
    // $ANTLR end "rule__Layout__Group_5__4"


    // $ANTLR start "rule__Layout__Group_5__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1337:1: rule__Layout__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Layout__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1341:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1342:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1342:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1343:1: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Layout__Group_5__4__Impl2687); 
             after(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Layout__Group_5__4__Impl"


    // $ANTLR start "rule__Layout__Group_5_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1366:1: rule__Layout__Group_5_3__0 : rule__Layout__Group_5_3__0__Impl rule__Layout__Group_5_3__1 ;
    public final void rule__Layout__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1370:1: ( rule__Layout__Group_5_3__0__Impl rule__Layout__Group_5_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1371:2: rule__Layout__Group_5_3__0__Impl rule__Layout__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5_3__0__Impl_in_rule__Layout__Group_5_3__02728);
            rule__Layout__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5_3__1_in_rule__Layout__Group_5_3__02731);
            rule__Layout__Group_5_3__1();

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
    // $ANTLR end "rule__Layout__Group_5_3__0"


    // $ANTLR start "rule__Layout__Group_5_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1378:1: rule__Layout__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Layout__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1382:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1383:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1383:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1384:1: ','
            {
             before(grammarAccess.getLayoutAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Layout__Group_5_3__0__Impl2759); 
             after(grammarAccess.getLayoutAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Layout__Group_5_3__0__Impl"


    // $ANTLR start "rule__Layout__Group_5_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1397:1: rule__Layout__Group_5_3__1 : rule__Layout__Group_5_3__1__Impl ;
    public final void rule__Layout__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1401:1: ( rule__Layout__Group_5_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1402:2: rule__Layout__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5_3__1__Impl_in_rule__Layout__Group_5_3__12790);
            rule__Layout__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Layout__Group_5_3__1"


    // $ANTLR start "rule__Layout__Group_5_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1408:1: rule__Layout__Group_5_3__1__Impl : ( ( rule__Layout__EntradasAssignment_5_3_1 ) ) ;
    public final void rule__Layout__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1412:1: ( ( ( rule__Layout__EntradasAssignment_5_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1413:1: ( ( rule__Layout__EntradasAssignment_5_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1413:1: ( ( rule__Layout__EntradasAssignment_5_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1414:1: ( rule__Layout__EntradasAssignment_5_3_1 )
            {
             before(grammarAccess.getLayoutAccess().getEntradasAssignment_5_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1415:1: ( rule__Layout__EntradasAssignment_5_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1415:2: rule__Layout__EntradasAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__EntradasAssignment_5_3_1_in_rule__Layout__Group_5_3__1__Impl2817);
            rule__Layout__EntradasAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getEntradasAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Layout__Group_5_3__1__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1429:1: rule__PruebaInterfaz__Group__0 : rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1 ;
    public final void rule__PruebaInterfaz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1433:1: ( rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1434:2: rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__0__Impl_in_rule__PruebaInterfaz__Group__02851);
            rule__PruebaInterfaz__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__1_in_rule__PruebaInterfaz__Group__02854);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1441:1: rule__PruebaInterfaz__Group__0__Impl : ( () ) ;
    public final void rule__PruebaInterfaz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1445:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1446:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1446:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1447:1: ()
            {
             before(grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1448:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1450:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1460:1: rule__PruebaInterfaz__Group__1 : rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2 ;
    public final void rule__PruebaInterfaz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1464:1: ( rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1465:2: rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__1__Impl_in_rule__PruebaInterfaz__Group__12912);
            rule__PruebaInterfaz__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__2_in_rule__PruebaInterfaz__Group__12915);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1472:1: rule__PruebaInterfaz__Group__1__Impl : ( 'PruebaInterfaz' ) ;
    public final void rule__PruebaInterfaz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1476:1: ( ( 'PruebaInterfaz' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1477:1: ( 'PruebaInterfaz' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1477:1: ( 'PruebaInterfaz' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1478:1: 'PruebaInterfaz'
            {
             before(grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__PruebaInterfaz__Group__1__Impl2943); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1491:1: rule__PruebaInterfaz__Group__2 : rule__PruebaInterfaz__Group__2__Impl rule__PruebaInterfaz__Group__3 ;
    public final void rule__PruebaInterfaz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1495:1: ( rule__PruebaInterfaz__Group__2__Impl rule__PruebaInterfaz__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1496:2: rule__PruebaInterfaz__Group__2__Impl rule__PruebaInterfaz__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__2__Impl_in_rule__PruebaInterfaz__Group__22974);
            rule__PruebaInterfaz__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__3_in_rule__PruebaInterfaz__Group__22977);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1503:1: rule__PruebaInterfaz__Group__2__Impl : ( ( rule__PruebaInterfaz__NameAssignment_2 ) ) ;
    public final void rule__PruebaInterfaz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1507:1: ( ( ( rule__PruebaInterfaz__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1508:1: ( ( rule__PruebaInterfaz__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1508:1: ( ( rule__PruebaInterfaz__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1509:1: ( rule__PruebaInterfaz__NameAssignment_2 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1510:1: ( rule__PruebaInterfaz__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1510:2: rule__PruebaInterfaz__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__NameAssignment_2_in_rule__PruebaInterfaz__Group__2__Impl3004);
            rule__PruebaInterfaz__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPruebaInterfazAccess().getNameAssignment_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1520:1: rule__PruebaInterfaz__Group__3 : rule__PruebaInterfaz__Group__3__Impl rule__PruebaInterfaz__Group__4 ;
    public final void rule__PruebaInterfaz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1524:1: ( rule__PruebaInterfaz__Group__3__Impl rule__PruebaInterfaz__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1525:2: rule__PruebaInterfaz__Group__3__Impl rule__PruebaInterfaz__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__3__Impl_in_rule__PruebaInterfaz__Group__33034);
            rule__PruebaInterfaz__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__4_in_rule__PruebaInterfaz__Group__33037);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1532:1: rule__PruebaInterfaz__Group__3__Impl : ( '{' ) ;
    public final void rule__PruebaInterfaz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1536:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1537:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1537:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1538:1: '{'
            {
             before(grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__PruebaInterfaz__Group__3__Impl3065); 
             after(grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1551:1: rule__PruebaInterfaz__Group__4 : rule__PruebaInterfaz__Group__4__Impl rule__PruebaInterfaz__Group__5 ;
    public final void rule__PruebaInterfaz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1555:1: ( rule__PruebaInterfaz__Group__4__Impl rule__PruebaInterfaz__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1556:2: rule__PruebaInterfaz__Group__4__Impl rule__PruebaInterfaz__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__4__Impl_in_rule__PruebaInterfaz__Group__43096);
            rule__PruebaInterfaz__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__5_in_rule__PruebaInterfaz__Group__43099);
            rule__PruebaInterfaz__Group__5();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1563:1: rule__PruebaInterfaz__Group__4__Impl : ( ( rule__PruebaInterfaz__Group_4__0 )? ) ;
    public final void rule__PruebaInterfaz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1567:1: ( ( ( rule__PruebaInterfaz__Group_4__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1568:1: ( ( rule__PruebaInterfaz__Group_4__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1568:1: ( ( rule__PruebaInterfaz__Group_4__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1569:1: ( rule__PruebaInterfaz__Group_4__0 )?
            {
             before(grammarAccess.getPruebaInterfazAccess().getGroup_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1570:1: ( rule__PruebaInterfaz__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1570:2: rule__PruebaInterfaz__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__0_in_rule__PruebaInterfaz__Group__4__Impl3126);
                    rule__PruebaInterfaz__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPruebaInterfazAccess().getGroup_4()); 

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


    // $ANTLR start "rule__PruebaInterfaz__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1580:1: rule__PruebaInterfaz__Group__5 : rule__PruebaInterfaz__Group__5__Impl rule__PruebaInterfaz__Group__6 ;
    public final void rule__PruebaInterfaz__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1584:1: ( rule__PruebaInterfaz__Group__5__Impl rule__PruebaInterfaz__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1585:2: rule__PruebaInterfaz__Group__5__Impl rule__PruebaInterfaz__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__5__Impl_in_rule__PruebaInterfaz__Group__53157);
            rule__PruebaInterfaz__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__6_in_rule__PruebaInterfaz__Group__53160);
            rule__PruebaInterfaz__Group__6();

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
    // $ANTLR end "rule__PruebaInterfaz__Group__5"


    // $ANTLR start "rule__PruebaInterfaz__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1592:1: rule__PruebaInterfaz__Group__5__Impl : ( ( rule__PruebaInterfaz__Group_5__0 )? ) ;
    public final void rule__PruebaInterfaz__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1596:1: ( ( ( rule__PruebaInterfaz__Group_5__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1597:1: ( ( rule__PruebaInterfaz__Group_5__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1597:1: ( ( rule__PruebaInterfaz__Group_5__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1598:1: ( rule__PruebaInterfaz__Group_5__0 )?
            {
             before(grammarAccess.getPruebaInterfazAccess().getGroup_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1599:1: ( rule__PruebaInterfaz__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1599:2: rule__PruebaInterfaz__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__0_in_rule__PruebaInterfaz__Group__5__Impl3187);
                    rule__PruebaInterfaz__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPruebaInterfazAccess().getGroup_5()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group__5__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1609:1: rule__PruebaInterfaz__Group__6 : rule__PruebaInterfaz__Group__6__Impl ;
    public final void rule__PruebaInterfaz__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1613:1: ( rule__PruebaInterfaz__Group__6__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1614:2: rule__PruebaInterfaz__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__6__Impl_in_rule__PruebaInterfaz__Group__63218);
            rule__PruebaInterfaz__Group__6__Impl();

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
    // $ANTLR end "rule__PruebaInterfaz__Group__6"


    // $ANTLR start "rule__PruebaInterfaz__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1620:1: rule__PruebaInterfaz__Group__6__Impl : ( '}' ) ;
    public final void rule__PruebaInterfaz__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1624:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1625:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1625:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1626:1: '}'
            {
             before(grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__PruebaInterfaz__Group__6__Impl3246); 
             after(grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group__6__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1653:1: rule__PruebaInterfaz__Group_4__0 : rule__PruebaInterfaz__Group_4__0__Impl rule__PruebaInterfaz__Group_4__1 ;
    public final void rule__PruebaInterfaz__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1657:1: ( rule__PruebaInterfaz__Group_4__0__Impl rule__PruebaInterfaz__Group_4__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1658:2: rule__PruebaInterfaz__Group_4__0__Impl rule__PruebaInterfaz__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__0__Impl_in_rule__PruebaInterfaz__Group_4__03291);
            rule__PruebaInterfaz__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__1_in_rule__PruebaInterfaz__Group_4__03294);
            rule__PruebaInterfaz__Group_4__1();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__0"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1665:1: rule__PruebaInterfaz__Group_4__0__Impl : ( 'acciones' ) ;
    public final void rule__PruebaInterfaz__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1669:1: ( ( 'acciones' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1670:1: ( 'acciones' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1670:1: ( 'acciones' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1671:1: 'acciones'
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__PruebaInterfaz__Group_4__0__Impl3322); 
             after(grammarAccess.getPruebaInterfazAccess().getAccionesKeyword_4_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__0__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1684:1: rule__PruebaInterfaz__Group_4__1 : rule__PruebaInterfaz__Group_4__1__Impl rule__PruebaInterfaz__Group_4__2 ;
    public final void rule__PruebaInterfaz__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1688:1: ( rule__PruebaInterfaz__Group_4__1__Impl rule__PruebaInterfaz__Group_4__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1689:2: rule__PruebaInterfaz__Group_4__1__Impl rule__PruebaInterfaz__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__1__Impl_in_rule__PruebaInterfaz__Group_4__13353);
            rule__PruebaInterfaz__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__2_in_rule__PruebaInterfaz__Group_4__13356);
            rule__PruebaInterfaz__Group_4__2();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__1"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1696:1: rule__PruebaInterfaz__Group_4__1__Impl : ( '(' ) ;
    public final void rule__PruebaInterfaz__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1700:1: ( ( '(' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1701:1: ( '(' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1701:1: ( '(' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1702:1: '('
            {
             before(grammarAccess.getPruebaInterfazAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__PruebaInterfaz__Group_4__1__Impl3384); 
             after(grammarAccess.getPruebaInterfazAccess().getLeftParenthesisKeyword_4_1()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__1__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1715:1: rule__PruebaInterfaz__Group_4__2 : rule__PruebaInterfaz__Group_4__2__Impl rule__PruebaInterfaz__Group_4__3 ;
    public final void rule__PruebaInterfaz__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1719:1: ( rule__PruebaInterfaz__Group_4__2__Impl rule__PruebaInterfaz__Group_4__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1720:2: rule__PruebaInterfaz__Group_4__2__Impl rule__PruebaInterfaz__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__2__Impl_in_rule__PruebaInterfaz__Group_4__23415);
            rule__PruebaInterfaz__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__3_in_rule__PruebaInterfaz__Group_4__23418);
            rule__PruebaInterfaz__Group_4__3();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__2"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1727:1: rule__PruebaInterfaz__Group_4__2__Impl : ( ( rule__PruebaInterfaz__AccionesAssignment_4_2 ) ) ;
    public final void rule__PruebaInterfaz__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1731:1: ( ( ( rule__PruebaInterfaz__AccionesAssignment_4_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1732:1: ( ( rule__PruebaInterfaz__AccionesAssignment_4_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1732:1: ( ( rule__PruebaInterfaz__AccionesAssignment_4_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1733:1: ( rule__PruebaInterfaz__AccionesAssignment_4_2 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_4_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1734:1: ( rule__PruebaInterfaz__AccionesAssignment_4_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1734:2: rule__PruebaInterfaz__AccionesAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__AccionesAssignment_4_2_in_rule__PruebaInterfaz__Group_4__2__Impl3445);
            rule__PruebaInterfaz__AccionesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_4_2()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__2__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1744:1: rule__PruebaInterfaz__Group_4__3 : rule__PruebaInterfaz__Group_4__3__Impl rule__PruebaInterfaz__Group_4__4 ;
    public final void rule__PruebaInterfaz__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1748:1: ( rule__PruebaInterfaz__Group_4__3__Impl rule__PruebaInterfaz__Group_4__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1749:2: rule__PruebaInterfaz__Group_4__3__Impl rule__PruebaInterfaz__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__3__Impl_in_rule__PruebaInterfaz__Group_4__33475);
            rule__PruebaInterfaz__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__4_in_rule__PruebaInterfaz__Group_4__33478);
            rule__PruebaInterfaz__Group_4__4();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__3"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1756:1: rule__PruebaInterfaz__Group_4__3__Impl : ( ( rule__PruebaInterfaz__Group_4_3__0 )* ) ;
    public final void rule__PruebaInterfaz__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1760:1: ( ( ( rule__PruebaInterfaz__Group_4_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1761:1: ( ( rule__PruebaInterfaz__Group_4_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1761:1: ( ( rule__PruebaInterfaz__Group_4_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1762:1: ( rule__PruebaInterfaz__Group_4_3__0 )*
            {
             before(grammarAccess.getPruebaInterfazAccess().getGroup_4_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1763:1: ( rule__PruebaInterfaz__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1763:2: rule__PruebaInterfaz__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4_3__0_in_rule__PruebaInterfaz__Group_4__3__Impl3505);
            	    rule__PruebaInterfaz__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPruebaInterfazAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__3__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1773:1: rule__PruebaInterfaz__Group_4__4 : rule__PruebaInterfaz__Group_4__4__Impl ;
    public final void rule__PruebaInterfaz__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1777:1: ( rule__PruebaInterfaz__Group_4__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1778:2: rule__PruebaInterfaz__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4__4__Impl_in_rule__PruebaInterfaz__Group_4__43536);
            rule__PruebaInterfaz__Group_4__4__Impl();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__4"


    // $ANTLR start "rule__PruebaInterfaz__Group_4__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1784:1: rule__PruebaInterfaz__Group_4__4__Impl : ( ')' ) ;
    public final void rule__PruebaInterfaz__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1788:1: ( ( ')' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1789:1: ( ')' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1789:1: ( ')' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1790:1: ')'
            {
             before(grammarAccess.getPruebaInterfazAccess().getRightParenthesisKeyword_4_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PruebaInterfaz__Group_4__4__Impl3564); 
             after(grammarAccess.getPruebaInterfazAccess().getRightParenthesisKeyword_4_4()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4__4__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_4_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1813:1: rule__PruebaInterfaz__Group_4_3__0 : rule__PruebaInterfaz__Group_4_3__0__Impl rule__PruebaInterfaz__Group_4_3__1 ;
    public final void rule__PruebaInterfaz__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1817:1: ( rule__PruebaInterfaz__Group_4_3__0__Impl rule__PruebaInterfaz__Group_4_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1818:2: rule__PruebaInterfaz__Group_4_3__0__Impl rule__PruebaInterfaz__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4_3__0__Impl_in_rule__PruebaInterfaz__Group_4_3__03605);
            rule__PruebaInterfaz__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4_3__1_in_rule__PruebaInterfaz__Group_4_3__03608);
            rule__PruebaInterfaz__Group_4_3__1();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4_3__0"


    // $ANTLR start "rule__PruebaInterfaz__Group_4_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1825:1: rule__PruebaInterfaz__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__PruebaInterfaz__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1829:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1830:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1830:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1831:1: ','
            {
             before(grammarAccess.getPruebaInterfazAccess().getCommaKeyword_4_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__PruebaInterfaz__Group_4_3__0__Impl3636); 
             after(grammarAccess.getPruebaInterfazAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4_3__0__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_4_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1844:1: rule__PruebaInterfaz__Group_4_3__1 : rule__PruebaInterfaz__Group_4_3__1__Impl ;
    public final void rule__PruebaInterfaz__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1848:1: ( rule__PruebaInterfaz__Group_4_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1849:2: rule__PruebaInterfaz__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_4_3__1__Impl_in_rule__PruebaInterfaz__Group_4_3__13667);
            rule__PruebaInterfaz__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4_3__1"


    // $ANTLR start "rule__PruebaInterfaz__Group_4_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1855:1: rule__PruebaInterfaz__Group_4_3__1__Impl : ( ( rule__PruebaInterfaz__AccionesAssignment_4_3_1 ) ) ;
    public final void rule__PruebaInterfaz__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1859:1: ( ( ( rule__PruebaInterfaz__AccionesAssignment_4_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1860:1: ( ( rule__PruebaInterfaz__AccionesAssignment_4_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1860:1: ( ( rule__PruebaInterfaz__AccionesAssignment_4_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1861:1: ( rule__PruebaInterfaz__AccionesAssignment_4_3_1 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_4_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1862:1: ( rule__PruebaInterfaz__AccionesAssignment_4_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1862:2: rule__PruebaInterfaz__AccionesAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__AccionesAssignment_4_3_1_in_rule__PruebaInterfaz__Group_4_3__1__Impl3694);
            rule__PruebaInterfaz__AccionesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_4_3__1__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1876:1: rule__PruebaInterfaz__Group_5__0 : rule__PruebaInterfaz__Group_5__0__Impl rule__PruebaInterfaz__Group_5__1 ;
    public final void rule__PruebaInterfaz__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1880:1: ( rule__PruebaInterfaz__Group_5__0__Impl rule__PruebaInterfaz__Group_5__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1881:2: rule__PruebaInterfaz__Group_5__0__Impl rule__PruebaInterfaz__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__0__Impl_in_rule__PruebaInterfaz__Group_5__03728);
            rule__PruebaInterfaz__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__1_in_rule__PruebaInterfaz__Group_5__03731);
            rule__PruebaInterfaz__Group_5__1();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__0"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1888:1: rule__PruebaInterfaz__Group_5__0__Impl : ( 'aserciones' ) ;
    public final void rule__PruebaInterfaz__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1892:1: ( ( 'aserciones' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1893:1: ( 'aserciones' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1893:1: ( 'aserciones' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1894:1: 'aserciones'
            {
             before(grammarAccess.getPruebaInterfazAccess().getAsercionesKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__PruebaInterfaz__Group_5__0__Impl3759); 
             after(grammarAccess.getPruebaInterfazAccess().getAsercionesKeyword_5_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__0__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1907:1: rule__PruebaInterfaz__Group_5__1 : rule__PruebaInterfaz__Group_5__1__Impl rule__PruebaInterfaz__Group_5__2 ;
    public final void rule__PruebaInterfaz__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1911:1: ( rule__PruebaInterfaz__Group_5__1__Impl rule__PruebaInterfaz__Group_5__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1912:2: rule__PruebaInterfaz__Group_5__1__Impl rule__PruebaInterfaz__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__1__Impl_in_rule__PruebaInterfaz__Group_5__13790);
            rule__PruebaInterfaz__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__2_in_rule__PruebaInterfaz__Group_5__13793);
            rule__PruebaInterfaz__Group_5__2();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__1"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1919:1: rule__PruebaInterfaz__Group_5__1__Impl : ( '(' ) ;
    public final void rule__PruebaInterfaz__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1923:1: ( ( '(' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1924:1: ( '(' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1924:1: ( '(' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1925:1: '('
            {
             before(grammarAccess.getPruebaInterfazAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__PruebaInterfaz__Group_5__1__Impl3821); 
             after(grammarAccess.getPruebaInterfazAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__1__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1938:1: rule__PruebaInterfaz__Group_5__2 : rule__PruebaInterfaz__Group_5__2__Impl rule__PruebaInterfaz__Group_5__3 ;
    public final void rule__PruebaInterfaz__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1942:1: ( rule__PruebaInterfaz__Group_5__2__Impl rule__PruebaInterfaz__Group_5__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1943:2: rule__PruebaInterfaz__Group_5__2__Impl rule__PruebaInterfaz__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__2__Impl_in_rule__PruebaInterfaz__Group_5__23852);
            rule__PruebaInterfaz__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__3_in_rule__PruebaInterfaz__Group_5__23855);
            rule__PruebaInterfaz__Group_5__3();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__2"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1950:1: rule__PruebaInterfaz__Group_5__2__Impl : ( ( rule__PruebaInterfaz__AsercionesAssignment_5_2 ) ) ;
    public final void rule__PruebaInterfaz__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1954:1: ( ( ( rule__PruebaInterfaz__AsercionesAssignment_5_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1955:1: ( ( rule__PruebaInterfaz__AsercionesAssignment_5_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1955:1: ( ( rule__PruebaInterfaz__AsercionesAssignment_5_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1956:1: ( rule__PruebaInterfaz__AsercionesAssignment_5_2 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAsercionesAssignment_5_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1957:1: ( rule__PruebaInterfaz__AsercionesAssignment_5_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1957:2: rule__PruebaInterfaz__AsercionesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__AsercionesAssignment_5_2_in_rule__PruebaInterfaz__Group_5__2__Impl3882);
            rule__PruebaInterfaz__AsercionesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPruebaInterfazAccess().getAsercionesAssignment_5_2()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__2__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1967:1: rule__PruebaInterfaz__Group_5__3 : rule__PruebaInterfaz__Group_5__3__Impl rule__PruebaInterfaz__Group_5__4 ;
    public final void rule__PruebaInterfaz__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1971:1: ( rule__PruebaInterfaz__Group_5__3__Impl rule__PruebaInterfaz__Group_5__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1972:2: rule__PruebaInterfaz__Group_5__3__Impl rule__PruebaInterfaz__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__3__Impl_in_rule__PruebaInterfaz__Group_5__33912);
            rule__PruebaInterfaz__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__4_in_rule__PruebaInterfaz__Group_5__33915);
            rule__PruebaInterfaz__Group_5__4();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__3"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1979:1: rule__PruebaInterfaz__Group_5__3__Impl : ( ( rule__PruebaInterfaz__Group_5_3__0 )* ) ;
    public final void rule__PruebaInterfaz__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1983:1: ( ( ( rule__PruebaInterfaz__Group_5_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1984:1: ( ( rule__PruebaInterfaz__Group_5_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1984:1: ( ( rule__PruebaInterfaz__Group_5_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1985:1: ( rule__PruebaInterfaz__Group_5_3__0 )*
            {
             before(grammarAccess.getPruebaInterfazAccess().getGroup_5_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1986:1: ( rule__PruebaInterfaz__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1986:2: rule__PruebaInterfaz__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5_3__0_in_rule__PruebaInterfaz__Group_5__3__Impl3942);
            	    rule__PruebaInterfaz__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPruebaInterfazAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__3__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1996:1: rule__PruebaInterfaz__Group_5__4 : rule__PruebaInterfaz__Group_5__4__Impl ;
    public final void rule__PruebaInterfaz__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2000:1: ( rule__PruebaInterfaz__Group_5__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2001:2: rule__PruebaInterfaz__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5__4__Impl_in_rule__PruebaInterfaz__Group_5__43973);
            rule__PruebaInterfaz__Group_5__4__Impl();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__4"


    // $ANTLR start "rule__PruebaInterfaz__Group_5__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2007:1: rule__PruebaInterfaz__Group_5__4__Impl : ( ')' ) ;
    public final void rule__PruebaInterfaz__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2011:1: ( ( ')' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2012:1: ( ')' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2012:1: ( ')' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2013:1: ')'
            {
             before(grammarAccess.getPruebaInterfazAccess().getRightParenthesisKeyword_5_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__PruebaInterfaz__Group_5__4__Impl4001); 
             after(grammarAccess.getPruebaInterfazAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5__4__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_5_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2036:1: rule__PruebaInterfaz__Group_5_3__0 : rule__PruebaInterfaz__Group_5_3__0__Impl rule__PruebaInterfaz__Group_5_3__1 ;
    public final void rule__PruebaInterfaz__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2040:1: ( rule__PruebaInterfaz__Group_5_3__0__Impl rule__PruebaInterfaz__Group_5_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2041:2: rule__PruebaInterfaz__Group_5_3__0__Impl rule__PruebaInterfaz__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5_3__0__Impl_in_rule__PruebaInterfaz__Group_5_3__04042);
            rule__PruebaInterfaz__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5_3__1_in_rule__PruebaInterfaz__Group_5_3__04045);
            rule__PruebaInterfaz__Group_5_3__1();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5_3__0"


    // $ANTLR start "rule__PruebaInterfaz__Group_5_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2048:1: rule__PruebaInterfaz__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__PruebaInterfaz__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2052:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2053:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2053:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2054:1: ','
            {
             before(grammarAccess.getPruebaInterfazAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__PruebaInterfaz__Group_5_3__0__Impl4073); 
             after(grammarAccess.getPruebaInterfazAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5_3__0__Impl"


    // $ANTLR start "rule__PruebaInterfaz__Group_5_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2067:1: rule__PruebaInterfaz__Group_5_3__1 : rule__PruebaInterfaz__Group_5_3__1__Impl ;
    public final void rule__PruebaInterfaz__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2071:1: ( rule__PruebaInterfaz__Group_5_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2072:2: rule__PruebaInterfaz__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group_5_3__1__Impl_in_rule__PruebaInterfaz__Group_5_3__14104);
            rule__PruebaInterfaz__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5_3__1"


    // $ANTLR start "rule__PruebaInterfaz__Group_5_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2078:1: rule__PruebaInterfaz__Group_5_3__1__Impl : ( ( rule__PruebaInterfaz__AsercionesAssignment_5_3_1 ) ) ;
    public final void rule__PruebaInterfaz__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2082:1: ( ( ( rule__PruebaInterfaz__AsercionesAssignment_5_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2083:1: ( ( rule__PruebaInterfaz__AsercionesAssignment_5_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2083:1: ( ( rule__PruebaInterfaz__AsercionesAssignment_5_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2084:1: ( rule__PruebaInterfaz__AsercionesAssignment_5_3_1 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAsercionesAssignment_5_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2085:1: ( rule__PruebaInterfaz__AsercionesAssignment_5_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2085:2: rule__PruebaInterfaz__AsercionesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__AsercionesAssignment_5_3_1_in_rule__PruebaInterfaz__Group_5_3__1__Impl4131);
            rule__PruebaInterfaz__AsercionesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPruebaInterfazAccess().getAsercionesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__PruebaInterfaz__Group_5_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2099:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2103:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2104:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04165);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04168);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2111:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2115:1: ( ( ( '-' )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2116:1: ( ( '-' )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2116:1: ( ( '-' )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2117:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2118:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2119:2: '-'
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_rule__EInt__Group__0__Impl4197); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2130:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2134:1: ( rule__EInt__Group__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2135:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14230);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2141:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2145:1: ( ( RULE_INT ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2146:1: ( RULE_INT )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2146:1: ( RULE_INT )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2147:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4257); 
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


    // $ANTLR start "rule__Input_Impl__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2162:1: rule__Input_Impl__Group__0 : rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1 ;
    public final void rule__Input_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2166:1: ( rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2167:2: rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__0__Impl_in_rule__Input_Impl__Group__04290);
            rule__Input_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__1_in_rule__Input_Impl__Group__04293);
            rule__Input_Impl__Group__1();

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
    // $ANTLR end "rule__Input_Impl__Group__0"


    // $ANTLR start "rule__Input_Impl__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2174:1: rule__Input_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Input_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2178:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2179:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2179:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2180:1: ()
            {
             before(grammarAccess.getInput_ImplAccess().getInputAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2181:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2183:1: 
            {
            }

             after(grammarAccess.getInput_ImplAccess().getInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input_Impl__Group__0__Impl"


    // $ANTLR start "rule__Input_Impl__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2193:1: rule__Input_Impl__Group__1 : rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2 ;
    public final void rule__Input_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2197:1: ( rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2198:2: rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__1__Impl_in_rule__Input_Impl__Group__14351);
            rule__Input_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__2_in_rule__Input_Impl__Group__14354);
            rule__Input_Impl__Group__2();

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
    // $ANTLR end "rule__Input_Impl__Group__1"


    // $ANTLR start "rule__Input_Impl__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2205:1: rule__Input_Impl__Group__1__Impl : ( ( rule__Input_Impl__VisibleAssignment_1 )? ) ;
    public final void rule__Input_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2209:1: ( ( ( rule__Input_Impl__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2210:1: ( ( rule__Input_Impl__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2210:1: ( ( rule__Input_Impl__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2211:1: ( rule__Input_Impl__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInput_ImplAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2212:1: ( rule__Input_Impl__VisibleAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2212:2: rule__Input_Impl__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__VisibleAssignment_1_in_rule__Input_Impl__Group__1__Impl4381);
                    rule__Input_Impl__VisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInput_ImplAccess().getVisibleAssignment_1()); 

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
    // $ANTLR end "rule__Input_Impl__Group__1__Impl"


    // $ANTLR start "rule__Input_Impl__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2222:1: rule__Input_Impl__Group__2 : rule__Input_Impl__Group__2__Impl rule__Input_Impl__Group__3 ;
    public final void rule__Input_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2226:1: ( rule__Input_Impl__Group__2__Impl rule__Input_Impl__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2227:2: rule__Input_Impl__Group__2__Impl rule__Input_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__2__Impl_in_rule__Input_Impl__Group__24412);
            rule__Input_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__3_in_rule__Input_Impl__Group__24415);
            rule__Input_Impl__Group__3();

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
    // $ANTLR end "rule__Input_Impl__Group__2"


    // $ANTLR start "rule__Input_Impl__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2234:1: rule__Input_Impl__Group__2__Impl : ( ( rule__Input_Impl__HabilitadoAssignment_2 )? ) ;
    public final void rule__Input_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2238:1: ( ( ( rule__Input_Impl__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2239:1: ( ( rule__Input_Impl__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2239:1: ( ( rule__Input_Impl__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2240:1: ( rule__Input_Impl__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInput_ImplAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2241:1: ( rule__Input_Impl__HabilitadoAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2241:2: rule__Input_Impl__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__HabilitadoAssignment_2_in_rule__Input_Impl__Group__2__Impl4442);
                    rule__Input_Impl__HabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInput_ImplAccess().getHabilitadoAssignment_2()); 

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
    // $ANTLR end "rule__Input_Impl__Group__2__Impl"


    // $ANTLR start "rule__Input_Impl__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2251:1: rule__Input_Impl__Group__3 : rule__Input_Impl__Group__3__Impl rule__Input_Impl__Group__4 ;
    public final void rule__Input_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2255:1: ( rule__Input_Impl__Group__3__Impl rule__Input_Impl__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2256:2: rule__Input_Impl__Group__3__Impl rule__Input_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__3__Impl_in_rule__Input_Impl__Group__34473);
            rule__Input_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__4_in_rule__Input_Impl__Group__34476);
            rule__Input_Impl__Group__4();

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
    // $ANTLR end "rule__Input_Impl__Group__3"


    // $ANTLR start "rule__Input_Impl__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2263:1: rule__Input_Impl__Group__3__Impl : ( 'Input' ) ;
    public final void rule__Input_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2267:1: ( ( 'Input' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2268:1: ( 'Input' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2268:1: ( 'Input' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2269:1: 'Input'
            {
             before(grammarAccess.getInput_ImplAccess().getInputKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Input_Impl__Group__3__Impl4504); 
             after(grammarAccess.getInput_ImplAccess().getInputKeyword_3()); 

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
    // $ANTLR end "rule__Input_Impl__Group__3__Impl"


    // $ANTLR start "rule__Input_Impl__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2282:1: rule__Input_Impl__Group__4 : rule__Input_Impl__Group__4__Impl ;
    public final void rule__Input_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2286:1: ( rule__Input_Impl__Group__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2287:2: rule__Input_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__4__Impl_in_rule__Input_Impl__Group__44535);
            rule__Input_Impl__Group__4__Impl();

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
    // $ANTLR end "rule__Input_Impl__Group__4"


    // $ANTLR start "rule__Input_Impl__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2293:1: rule__Input_Impl__Group__4__Impl : ( ( rule__Input_Impl__NameAssignment_4 ) ) ;
    public final void rule__Input_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2297:1: ( ( ( rule__Input_Impl__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2298:1: ( ( rule__Input_Impl__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2298:1: ( ( rule__Input_Impl__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2299:1: ( rule__Input_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getInput_ImplAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2300:1: ( rule__Input_Impl__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2300:2: rule__Input_Impl__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__NameAssignment_4_in_rule__Input_Impl__Group__4__Impl4562);
            rule__Input_Impl__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInput_ImplAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Input_Impl__Group__4__Impl"


    // $ANTLR start "rule__InputTexto__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2320:1: rule__InputTexto__Group__0 : rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1 ;
    public final void rule__InputTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2324:1: ( rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2325:2: rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__0__Impl_in_rule__InputTexto__Group__04602);
            rule__InputTexto__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__1_in_rule__InputTexto__Group__04605);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2332:1: rule__InputTexto__Group__0__Impl : ( () ) ;
    public final void rule__InputTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2336:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2337:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2337:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2338:1: ()
            {
             before(grammarAccess.getInputTextoAccess().getInputTextoAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2339:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2341:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2351:1: rule__InputTexto__Group__1 : rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2 ;
    public final void rule__InputTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2355:1: ( rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2356:2: rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__1__Impl_in_rule__InputTexto__Group__14663);
            rule__InputTexto__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__2_in_rule__InputTexto__Group__14666);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2363:1: rule__InputTexto__Group__1__Impl : ( ( rule__InputTexto__VisibleAssignment_1 )? ) ;
    public final void rule__InputTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2367:1: ( ( ( rule__InputTexto__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2368:1: ( ( rule__InputTexto__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2368:1: ( ( rule__InputTexto__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2369:1: ( rule__InputTexto__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputTextoAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2370:1: ( rule__InputTexto__VisibleAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2370:2: rule__InputTexto__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__VisibleAssignment_1_in_rule__InputTexto__Group__1__Impl4693);
                    rule__InputTexto__VisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputTextoAccess().getVisibleAssignment_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2380:1: rule__InputTexto__Group__2 : rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3 ;
    public final void rule__InputTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2384:1: ( rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2385:2: rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__2__Impl_in_rule__InputTexto__Group__24724);
            rule__InputTexto__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__3_in_rule__InputTexto__Group__24727);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2392:1: rule__InputTexto__Group__2__Impl : ( ( rule__InputTexto__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2396:1: ( ( ( rule__InputTexto__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2397:1: ( ( rule__InputTexto__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2397:1: ( ( rule__InputTexto__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2398:1: ( rule__InputTexto__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputTextoAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2399:1: ( rule__InputTexto__HabilitadoAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2399:2: rule__InputTexto__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__HabilitadoAssignment_2_in_rule__InputTexto__Group__2__Impl4754);
                    rule__InputTexto__HabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputTextoAccess().getHabilitadoAssignment_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2409:1: rule__InputTexto__Group__3 : rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4 ;
    public final void rule__InputTexto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2413:1: ( rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2414:2: rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__3__Impl_in_rule__InputTexto__Group__34785);
            rule__InputTexto__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__4_in_rule__InputTexto__Group__34788);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2421:1: rule__InputTexto__Group__3__Impl : ( ( rule__InputTexto__ObligatorioAssignment_3 )? ) ;
    public final void rule__InputTexto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2425:1: ( ( ( rule__InputTexto__ObligatorioAssignment_3 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2426:1: ( ( rule__InputTexto__ObligatorioAssignment_3 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2426:1: ( ( rule__InputTexto__ObligatorioAssignment_3 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2427:1: ( rule__InputTexto__ObligatorioAssignment_3 )?
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2428:1: ( rule__InputTexto__ObligatorioAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2428:2: rule__InputTexto__ObligatorioAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__ObligatorioAssignment_3_in_rule__InputTexto__Group__3__Impl4815);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2438:1: rule__InputTexto__Group__4 : rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5 ;
    public final void rule__InputTexto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2442:1: ( rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2443:2: rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__4__Impl_in_rule__InputTexto__Group__44846);
            rule__InputTexto__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__5_in_rule__InputTexto__Group__44849);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2450:1: rule__InputTexto__Group__4__Impl : ( 'InputTexto' ) ;
    public final void rule__InputTexto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2454:1: ( ( 'InputTexto' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2455:1: ( 'InputTexto' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2455:1: ( 'InputTexto' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2456:1: 'InputTexto'
            {
             before(grammarAccess.getInputTextoAccess().getInputTextoKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__InputTexto__Group__4__Impl4877); 
             after(grammarAccess.getInputTextoAccess().getInputTextoKeyword_4()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2469:1: rule__InputTexto__Group__5 : rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6 ;
    public final void rule__InputTexto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2473:1: ( rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2474:2: rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__5__Impl_in_rule__InputTexto__Group__54908);
            rule__InputTexto__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__6_in_rule__InputTexto__Group__54911);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2481:1: rule__InputTexto__Group__5__Impl : ( ( rule__InputTexto__NameAssignment_5 ) ) ;
    public final void rule__InputTexto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2485:1: ( ( ( rule__InputTexto__NameAssignment_5 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2486:1: ( ( rule__InputTexto__NameAssignment_5 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2486:1: ( ( rule__InputTexto__NameAssignment_5 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2487:1: ( rule__InputTexto__NameAssignment_5 )
            {
             before(grammarAccess.getInputTextoAccess().getNameAssignment_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2488:1: ( rule__InputTexto__NameAssignment_5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2488:2: rule__InputTexto__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__NameAssignment_5_in_rule__InputTexto__Group__5__Impl4938);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2498:1: rule__InputTexto__Group__6 : rule__InputTexto__Group__6__Impl rule__InputTexto__Group__7 ;
    public final void rule__InputTexto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2502:1: ( rule__InputTexto__Group__6__Impl rule__InputTexto__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2503:2: rule__InputTexto__Group__6__Impl rule__InputTexto__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__6__Impl_in_rule__InputTexto__Group__64968);
            rule__InputTexto__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__7_in_rule__InputTexto__Group__64971);
            rule__InputTexto__Group__7();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2510:1: rule__InputTexto__Group__6__Impl : ( '{' ) ;
    public final void rule__InputTexto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2514:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2515:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2515:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2516:1: '{'
            {
             before(grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputTexto__Group__6__Impl4999); 
             after(grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6()); 

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


    // $ANTLR start "rule__InputTexto__Group__7"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2529:1: rule__InputTexto__Group__7 : rule__InputTexto__Group__7__Impl rule__InputTexto__Group__8 ;
    public final void rule__InputTexto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2533:1: ( rule__InputTexto__Group__7__Impl rule__InputTexto__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2534:2: rule__InputTexto__Group__7__Impl rule__InputTexto__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__7__Impl_in_rule__InputTexto__Group__75030);
            rule__InputTexto__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__8_in_rule__InputTexto__Group__75033);
            rule__InputTexto__Group__8();

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
    // $ANTLR end "rule__InputTexto__Group__7"


    // $ANTLR start "rule__InputTexto__Group__7__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2541:1: rule__InputTexto__Group__7__Impl : ( ( rule__InputTexto__Group_7__0 )? ) ;
    public final void rule__InputTexto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2545:1: ( ( ( rule__InputTexto__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2546:1: ( ( rule__InputTexto__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2546:1: ( ( rule__InputTexto__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2547:1: ( rule__InputTexto__Group_7__0 )?
            {
             before(grammarAccess.getInputTextoAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2548:1: ( rule__InputTexto__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2548:2: rule__InputTexto__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_7__0_in_rule__InputTexto__Group__7__Impl5060);
                    rule__InputTexto__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputTextoAccess().getGroup_7()); 

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
    // $ANTLR end "rule__InputTexto__Group__7__Impl"


    // $ANTLR start "rule__InputTexto__Group__8"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2558:1: rule__InputTexto__Group__8 : rule__InputTexto__Group__8__Impl ;
    public final void rule__InputTexto__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2562:1: ( rule__InputTexto__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2563:2: rule__InputTexto__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__8__Impl_in_rule__InputTexto__Group__85091);
            rule__InputTexto__Group__8__Impl();

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
    // $ANTLR end "rule__InputTexto__Group__8"


    // $ANTLR start "rule__InputTexto__Group__8__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2569:1: rule__InputTexto__Group__8__Impl : ( '}' ) ;
    public final void rule__InputTexto__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2573:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2574:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2574:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2575:1: '}'
            {
             before(grammarAccess.getInputTextoAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputTexto__Group__8__Impl5119); 
             after(grammarAccess.getInputTextoAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__InputTexto__Group__8__Impl"


    // $ANTLR start "rule__InputTexto__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2606:1: rule__InputTexto__Group_7__0 : rule__InputTexto__Group_7__0__Impl rule__InputTexto__Group_7__1 ;
    public final void rule__InputTexto__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2610:1: ( rule__InputTexto__Group_7__0__Impl rule__InputTexto__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2611:2: rule__InputTexto__Group_7__0__Impl rule__InputTexto__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_7__0__Impl_in_rule__InputTexto__Group_7__05168);
            rule__InputTexto__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_7__1_in_rule__InputTexto__Group_7__05171);
            rule__InputTexto__Group_7__1();

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
    // $ANTLR end "rule__InputTexto__Group_7__0"


    // $ANTLR start "rule__InputTexto__Group_7__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2618:1: rule__InputTexto__Group_7__0__Impl : ( 'valor' ) ;
    public final void rule__InputTexto__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2622:1: ( ( 'valor' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2623:1: ( 'valor' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2623:1: ( 'valor' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2624:1: 'valor'
            {
             before(grammarAccess.getInputTextoAccess().getValorKeyword_7_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__InputTexto__Group_7__0__Impl5199); 
             after(grammarAccess.getInputTextoAccess().getValorKeyword_7_0()); 

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
    // $ANTLR end "rule__InputTexto__Group_7__0__Impl"


    // $ANTLR start "rule__InputTexto__Group_7__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2637:1: rule__InputTexto__Group_7__1 : rule__InputTexto__Group_7__1__Impl ;
    public final void rule__InputTexto__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2641:1: ( rule__InputTexto__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2642:2: rule__InputTexto__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_7__1__Impl_in_rule__InputTexto__Group_7__15230);
            rule__InputTexto__Group_7__1__Impl();

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
    // $ANTLR end "rule__InputTexto__Group_7__1"


    // $ANTLR start "rule__InputTexto__Group_7__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2648:1: rule__InputTexto__Group_7__1__Impl : ( ( rule__InputTexto__ValorAssignment_7_1 ) ) ;
    public final void rule__InputTexto__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2652:1: ( ( ( rule__InputTexto__ValorAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2653:1: ( ( rule__InputTexto__ValorAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2653:1: ( ( rule__InputTexto__ValorAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2654:1: ( rule__InputTexto__ValorAssignment_7_1 )
            {
             before(grammarAccess.getInputTextoAccess().getValorAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2655:1: ( rule__InputTexto__ValorAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2655:2: rule__InputTexto__ValorAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__ValorAssignment_7_1_in_rule__InputTexto__Group_7__1__Impl5257);
            rule__InputTexto__ValorAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInputTextoAccess().getValorAssignment_7_1()); 

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
    // $ANTLR end "rule__InputTexto__Group_7__1__Impl"


    // $ANTLR start "rule__InputBoton__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2669:1: rule__InputBoton__Group__0 : rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1 ;
    public final void rule__InputBoton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2673:1: ( rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2674:2: rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__0__Impl_in_rule__InputBoton__Group__05291);
            rule__InputBoton__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__1_in_rule__InputBoton__Group__05294);
            rule__InputBoton__Group__1();

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
    // $ANTLR end "rule__InputBoton__Group__0"


    // $ANTLR start "rule__InputBoton__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2681:1: rule__InputBoton__Group__0__Impl : ( () ) ;
    public final void rule__InputBoton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2685:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2686:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2686:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2687:1: ()
            {
             before(grammarAccess.getInputBotonAccess().getInputBotonAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2688:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2690:1: 
            {
            }

             after(grammarAccess.getInputBotonAccess().getInputBotonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputBoton__Group__0__Impl"


    // $ANTLR start "rule__InputBoton__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2700:1: rule__InputBoton__Group__1 : rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2 ;
    public final void rule__InputBoton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2704:1: ( rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2705:2: rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__1__Impl_in_rule__InputBoton__Group__15352);
            rule__InputBoton__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__2_in_rule__InputBoton__Group__15355);
            rule__InputBoton__Group__2();

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
    // $ANTLR end "rule__InputBoton__Group__1"


    // $ANTLR start "rule__InputBoton__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2712:1: rule__InputBoton__Group__1__Impl : ( ( rule__InputBoton__VisibleAssignment_1 )? ) ;
    public final void rule__InputBoton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2716:1: ( ( ( rule__InputBoton__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2717:1: ( ( rule__InputBoton__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2717:1: ( ( rule__InputBoton__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2718:1: ( rule__InputBoton__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputBotonAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2719:1: ( rule__InputBoton__VisibleAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2719:2: rule__InputBoton__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputBoton__VisibleAssignment_1_in_rule__InputBoton__Group__1__Impl5382);
                    rule__InputBoton__VisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputBotonAccess().getVisibleAssignment_1()); 

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
    // $ANTLR end "rule__InputBoton__Group__1__Impl"


    // $ANTLR start "rule__InputBoton__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2729:1: rule__InputBoton__Group__2 : rule__InputBoton__Group__2__Impl rule__InputBoton__Group__3 ;
    public final void rule__InputBoton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2733:1: ( rule__InputBoton__Group__2__Impl rule__InputBoton__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2734:2: rule__InputBoton__Group__2__Impl rule__InputBoton__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__2__Impl_in_rule__InputBoton__Group__25413);
            rule__InputBoton__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__3_in_rule__InputBoton__Group__25416);
            rule__InputBoton__Group__3();

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
    // $ANTLR end "rule__InputBoton__Group__2"


    // $ANTLR start "rule__InputBoton__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2741:1: rule__InputBoton__Group__2__Impl : ( ( rule__InputBoton__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputBoton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2745:1: ( ( ( rule__InputBoton__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2746:1: ( ( rule__InputBoton__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2746:1: ( ( rule__InputBoton__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2747:1: ( rule__InputBoton__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputBotonAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2748:1: ( rule__InputBoton__HabilitadoAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2748:2: rule__InputBoton__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputBoton__HabilitadoAssignment_2_in_rule__InputBoton__Group__2__Impl5443);
                    rule__InputBoton__HabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputBotonAccess().getHabilitadoAssignment_2()); 

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
    // $ANTLR end "rule__InputBoton__Group__2__Impl"


    // $ANTLR start "rule__InputBoton__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2758:1: rule__InputBoton__Group__3 : rule__InputBoton__Group__3__Impl rule__InputBoton__Group__4 ;
    public final void rule__InputBoton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2762:1: ( rule__InputBoton__Group__3__Impl rule__InputBoton__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2763:2: rule__InputBoton__Group__3__Impl rule__InputBoton__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__3__Impl_in_rule__InputBoton__Group__35474);
            rule__InputBoton__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__4_in_rule__InputBoton__Group__35477);
            rule__InputBoton__Group__4();

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
    // $ANTLR end "rule__InputBoton__Group__3"


    // $ANTLR start "rule__InputBoton__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2770:1: rule__InputBoton__Group__3__Impl : ( 'InputBoton' ) ;
    public final void rule__InputBoton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2774:1: ( ( 'InputBoton' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2775:1: ( 'InputBoton' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2775:1: ( 'InputBoton' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2776:1: 'InputBoton'
            {
             before(grammarAccess.getInputBotonAccess().getInputBotonKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__InputBoton__Group__3__Impl5505); 
             after(grammarAccess.getInputBotonAccess().getInputBotonKeyword_3()); 

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
    // $ANTLR end "rule__InputBoton__Group__3__Impl"


    // $ANTLR start "rule__InputBoton__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2789:1: rule__InputBoton__Group__4 : rule__InputBoton__Group__4__Impl ;
    public final void rule__InputBoton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2793:1: ( rule__InputBoton__Group__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2794:2: rule__InputBoton__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__4__Impl_in_rule__InputBoton__Group__45536);
            rule__InputBoton__Group__4__Impl();

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
    // $ANTLR end "rule__InputBoton__Group__4"


    // $ANTLR start "rule__InputBoton__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2800:1: rule__InputBoton__Group__4__Impl : ( ( rule__InputBoton__NameAssignment_4 ) ) ;
    public final void rule__InputBoton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2804:1: ( ( ( rule__InputBoton__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2805:1: ( ( rule__InputBoton__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2805:1: ( ( rule__InputBoton__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2806:1: ( rule__InputBoton__NameAssignment_4 )
            {
             before(grammarAccess.getInputBotonAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2807:1: ( rule__InputBoton__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2807:2: rule__InputBoton__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__NameAssignment_4_in_rule__InputBoton__Group__4__Impl5563);
            rule__InputBoton__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputBotonAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__InputBoton__Group__4__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2827:1: rule__InputMultiple_Impl__Group__0 : rule__InputMultiple_Impl__Group__0__Impl rule__InputMultiple_Impl__Group__1 ;
    public final void rule__InputMultiple_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2831:1: ( rule__InputMultiple_Impl__Group__0__Impl rule__InputMultiple_Impl__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2832:2: rule__InputMultiple_Impl__Group__0__Impl rule__InputMultiple_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__0__Impl_in_rule__InputMultiple_Impl__Group__05603);
            rule__InputMultiple_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__1_in_rule__InputMultiple_Impl__Group__05606);
            rule__InputMultiple_Impl__Group__1();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__0"


    // $ANTLR start "rule__InputMultiple_Impl__Group__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2839:1: rule__InputMultiple_Impl__Group__0__Impl : ( () ) ;
    public final void rule__InputMultiple_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2843:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2844:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2844:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2845:1: ()
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getInputMultipleAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2846:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2848:1: 
            {
            }

             after(grammarAccess.getInputMultiple_ImplAccess().getInputMultipleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputMultiple_Impl__Group__0__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2858:1: rule__InputMultiple_Impl__Group__1 : rule__InputMultiple_Impl__Group__1__Impl rule__InputMultiple_Impl__Group__2 ;
    public final void rule__InputMultiple_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2862:1: ( rule__InputMultiple_Impl__Group__1__Impl rule__InputMultiple_Impl__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2863:2: rule__InputMultiple_Impl__Group__1__Impl rule__InputMultiple_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__1__Impl_in_rule__InputMultiple_Impl__Group__15664);
            rule__InputMultiple_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__2_in_rule__InputMultiple_Impl__Group__15667);
            rule__InputMultiple_Impl__Group__2();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__1"


    // $ANTLR start "rule__InputMultiple_Impl__Group__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2870:1: rule__InputMultiple_Impl__Group__1__Impl : ( ( rule__InputMultiple_Impl__VisibleAssignment_1 )? ) ;
    public final void rule__InputMultiple_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2874:1: ( ( ( rule__InputMultiple_Impl__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2875:1: ( ( rule__InputMultiple_Impl__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2875:1: ( ( rule__InputMultiple_Impl__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2876:1: ( rule__InputMultiple_Impl__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2877:1: ( rule__InputMultiple_Impl__VisibleAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2877:2: rule__InputMultiple_Impl__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__VisibleAssignment_1_in_rule__InputMultiple_Impl__Group__1__Impl5694);
                    rule__InputMultiple_Impl__VisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputMultiple_ImplAccess().getVisibleAssignment_1()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__1__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2887:1: rule__InputMultiple_Impl__Group__2 : rule__InputMultiple_Impl__Group__2__Impl rule__InputMultiple_Impl__Group__3 ;
    public final void rule__InputMultiple_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2891:1: ( rule__InputMultiple_Impl__Group__2__Impl rule__InputMultiple_Impl__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2892:2: rule__InputMultiple_Impl__Group__2__Impl rule__InputMultiple_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__2__Impl_in_rule__InputMultiple_Impl__Group__25725);
            rule__InputMultiple_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__3_in_rule__InputMultiple_Impl__Group__25728);
            rule__InputMultiple_Impl__Group__3();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__2"


    // $ANTLR start "rule__InputMultiple_Impl__Group__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2899:1: rule__InputMultiple_Impl__Group__2__Impl : ( ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputMultiple_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2903:1: ( ( ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2904:1: ( ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2904:1: ( ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2905:1: ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2906:1: ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2906:2: rule__InputMultiple_Impl__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__HabilitadoAssignment_2_in_rule__InputMultiple_Impl__Group__2__Impl5755);
                    rule__InputMultiple_Impl__HabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoAssignment_2()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__2__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2916:1: rule__InputMultiple_Impl__Group__3 : rule__InputMultiple_Impl__Group__3__Impl rule__InputMultiple_Impl__Group__4 ;
    public final void rule__InputMultiple_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2920:1: ( rule__InputMultiple_Impl__Group__3__Impl rule__InputMultiple_Impl__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2921:2: rule__InputMultiple_Impl__Group__3__Impl rule__InputMultiple_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__3__Impl_in_rule__InputMultiple_Impl__Group__35786);
            rule__InputMultiple_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__4_in_rule__InputMultiple_Impl__Group__35789);
            rule__InputMultiple_Impl__Group__4();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__3"


    // $ANTLR start "rule__InputMultiple_Impl__Group__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2928:1: rule__InputMultiple_Impl__Group__3__Impl : ( 'InputMultiple' ) ;
    public final void rule__InputMultiple_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2932:1: ( ( 'InputMultiple' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2933:1: ( 'InputMultiple' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2933:1: ( 'InputMultiple' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2934:1: 'InputMultiple'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getInputMultipleKeyword_3()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__InputMultiple_Impl__Group__3__Impl5817); 
             after(grammarAccess.getInputMultiple_ImplAccess().getInputMultipleKeyword_3()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__3__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2947:1: rule__InputMultiple_Impl__Group__4 : rule__InputMultiple_Impl__Group__4__Impl rule__InputMultiple_Impl__Group__5 ;
    public final void rule__InputMultiple_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2951:1: ( rule__InputMultiple_Impl__Group__4__Impl rule__InputMultiple_Impl__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2952:2: rule__InputMultiple_Impl__Group__4__Impl rule__InputMultiple_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__4__Impl_in_rule__InputMultiple_Impl__Group__45848);
            rule__InputMultiple_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__5_in_rule__InputMultiple_Impl__Group__45851);
            rule__InputMultiple_Impl__Group__5();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__4"


    // $ANTLR start "rule__InputMultiple_Impl__Group__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2959:1: rule__InputMultiple_Impl__Group__4__Impl : ( ( rule__InputMultiple_Impl__NameAssignment_4 ) ) ;
    public final void rule__InputMultiple_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2963:1: ( ( ( rule__InputMultiple_Impl__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2964:1: ( ( rule__InputMultiple_Impl__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2964:1: ( ( rule__InputMultiple_Impl__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2965:1: ( rule__InputMultiple_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2966:1: ( rule__InputMultiple_Impl__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2966:2: rule__InputMultiple_Impl__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__NameAssignment_4_in_rule__InputMultiple_Impl__Group__4__Impl5878);
            rule__InputMultiple_Impl__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputMultiple_ImplAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__4__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group__5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2976:1: rule__InputMultiple_Impl__Group__5 : rule__InputMultiple_Impl__Group__5__Impl rule__InputMultiple_Impl__Group__6 ;
    public final void rule__InputMultiple_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2980:1: ( rule__InputMultiple_Impl__Group__5__Impl rule__InputMultiple_Impl__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2981:2: rule__InputMultiple_Impl__Group__5__Impl rule__InputMultiple_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__5__Impl_in_rule__InputMultiple_Impl__Group__55908);
            rule__InputMultiple_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__6_in_rule__InputMultiple_Impl__Group__55911);
            rule__InputMultiple_Impl__Group__6();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__5"


    // $ANTLR start "rule__InputMultiple_Impl__Group__5__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2988:1: rule__InputMultiple_Impl__Group__5__Impl : ( '{' ) ;
    public final void rule__InputMultiple_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2992:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2993:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2993:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2994:1: '{'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputMultiple_Impl__Group__5__Impl5939); 
             after(grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__5__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group__6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3007:1: rule__InputMultiple_Impl__Group__6 : rule__InputMultiple_Impl__Group__6__Impl rule__InputMultiple_Impl__Group__7 ;
    public final void rule__InputMultiple_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3011:1: ( rule__InputMultiple_Impl__Group__6__Impl rule__InputMultiple_Impl__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3012:2: rule__InputMultiple_Impl__Group__6__Impl rule__InputMultiple_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__6__Impl_in_rule__InputMultiple_Impl__Group__65970);
            rule__InputMultiple_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__7_in_rule__InputMultiple_Impl__Group__65973);
            rule__InputMultiple_Impl__Group__7();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__6"


    // $ANTLR start "rule__InputMultiple_Impl__Group__6__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3019:1: rule__InputMultiple_Impl__Group__6__Impl : ( ( rule__InputMultiple_Impl__Group_6__0 )? ) ;
    public final void rule__InputMultiple_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3023:1: ( ( ( rule__InputMultiple_Impl__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3024:1: ( ( rule__InputMultiple_Impl__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3024:1: ( ( rule__InputMultiple_Impl__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3025:1: ( rule__InputMultiple_Impl__Group_6__0 )?
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3026:1: ( rule__InputMultiple_Impl__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3026:2: rule__InputMultiple_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__0_in_rule__InputMultiple_Impl__Group__6__Impl6000);
                    rule__InputMultiple_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputMultiple_ImplAccess().getGroup_6()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__6__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group__7"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3036:1: rule__InputMultiple_Impl__Group__7 : rule__InputMultiple_Impl__Group__7__Impl ;
    public final void rule__InputMultiple_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3040:1: ( rule__InputMultiple_Impl__Group__7__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3041:2: rule__InputMultiple_Impl__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__7__Impl_in_rule__InputMultiple_Impl__Group__76031);
            rule__InputMultiple_Impl__Group__7__Impl();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__7"


    // $ANTLR start "rule__InputMultiple_Impl__Group__7__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3047:1: rule__InputMultiple_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__InputMultiple_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3051:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3052:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3052:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3053:1: '}'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputMultiple_Impl__Group__7__Impl6059); 
             after(grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group__7__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3082:1: rule__InputMultiple_Impl__Group_6__0 : rule__InputMultiple_Impl__Group_6__0__Impl rule__InputMultiple_Impl__Group_6__1 ;
    public final void rule__InputMultiple_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3086:1: ( rule__InputMultiple_Impl__Group_6__0__Impl rule__InputMultiple_Impl__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3087:2: rule__InputMultiple_Impl__Group_6__0__Impl rule__InputMultiple_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__0__Impl_in_rule__InputMultiple_Impl__Group_6__06106);
            rule__InputMultiple_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__1_in_rule__InputMultiple_Impl__Group_6__06109);
            rule__InputMultiple_Impl__Group_6__1();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__0"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3094:1: rule__InputMultiple_Impl__Group_6__0__Impl : ( 'valores' ) ;
    public final void rule__InputMultiple_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3098:1: ( ( 'valores' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3099:1: ( 'valores' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3099:1: ( 'valores' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3100:1: 'valores'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getValoresKeyword_6_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__InputMultiple_Impl__Group_6__0__Impl6137); 
             after(grammarAccess.getInputMultiple_ImplAccess().getValoresKeyword_6_0()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3113:1: rule__InputMultiple_Impl__Group_6__1 : rule__InputMultiple_Impl__Group_6__1__Impl rule__InputMultiple_Impl__Group_6__2 ;
    public final void rule__InputMultiple_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3117:1: ( rule__InputMultiple_Impl__Group_6__1__Impl rule__InputMultiple_Impl__Group_6__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3118:2: rule__InputMultiple_Impl__Group_6__1__Impl rule__InputMultiple_Impl__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__1__Impl_in_rule__InputMultiple_Impl__Group_6__16168);
            rule__InputMultiple_Impl__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__2_in_rule__InputMultiple_Impl__Group_6__16171);
            rule__InputMultiple_Impl__Group_6__2();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__1"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3125:1: rule__InputMultiple_Impl__Group_6__1__Impl : ( '{' ) ;
    public final void rule__InputMultiple_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3129:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3130:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3130:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3131:1: '{'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputMultiple_Impl__Group_6__1__Impl6199); 
             after(grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3144:1: rule__InputMultiple_Impl__Group_6__2 : rule__InputMultiple_Impl__Group_6__2__Impl rule__InputMultiple_Impl__Group_6__3 ;
    public final void rule__InputMultiple_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3148:1: ( rule__InputMultiple_Impl__Group_6__2__Impl rule__InputMultiple_Impl__Group_6__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3149:2: rule__InputMultiple_Impl__Group_6__2__Impl rule__InputMultiple_Impl__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__2__Impl_in_rule__InputMultiple_Impl__Group_6__26230);
            rule__InputMultiple_Impl__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__3_in_rule__InputMultiple_Impl__Group_6__26233);
            rule__InputMultiple_Impl__Group_6__3();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__2"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3156:1: rule__InputMultiple_Impl__Group_6__2__Impl : ( ( rule__InputMultiple_Impl__ValoresAssignment_6_2 ) ) ;
    public final void rule__InputMultiple_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3160:1: ( ( ( rule__InputMultiple_Impl__ValoresAssignment_6_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3161:1: ( ( rule__InputMultiple_Impl__ValoresAssignment_6_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3161:1: ( ( rule__InputMultiple_Impl__ValoresAssignment_6_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3162:1: ( rule__InputMultiple_Impl__ValoresAssignment_6_2 )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getValoresAssignment_6_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3163:1: ( rule__InputMultiple_Impl__ValoresAssignment_6_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3163:2: rule__InputMultiple_Impl__ValoresAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__ValoresAssignment_6_2_in_rule__InputMultiple_Impl__Group_6__2__Impl6260);
            rule__InputMultiple_Impl__ValoresAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInputMultiple_ImplAccess().getValoresAssignment_6_2()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__2__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3173:1: rule__InputMultiple_Impl__Group_6__3 : rule__InputMultiple_Impl__Group_6__3__Impl rule__InputMultiple_Impl__Group_6__4 ;
    public final void rule__InputMultiple_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3177:1: ( rule__InputMultiple_Impl__Group_6__3__Impl rule__InputMultiple_Impl__Group_6__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3178:2: rule__InputMultiple_Impl__Group_6__3__Impl rule__InputMultiple_Impl__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__3__Impl_in_rule__InputMultiple_Impl__Group_6__36290);
            rule__InputMultiple_Impl__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__4_in_rule__InputMultiple_Impl__Group_6__36293);
            rule__InputMultiple_Impl__Group_6__4();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__3"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3185:1: rule__InputMultiple_Impl__Group_6__3__Impl : ( ( rule__InputMultiple_Impl__Group_6_3__0 )* ) ;
    public final void rule__InputMultiple_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3189:1: ( ( ( rule__InputMultiple_Impl__Group_6_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3190:1: ( ( rule__InputMultiple_Impl__Group_6_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3190:1: ( ( rule__InputMultiple_Impl__Group_6_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3191:1: ( rule__InputMultiple_Impl__Group_6_3__0 )*
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getGroup_6_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3192:1: ( rule__InputMultiple_Impl__Group_6_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3192:2: rule__InputMultiple_Impl__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6_3__0_in_rule__InputMultiple_Impl__Group_6__3__Impl6320);
            	    rule__InputMultiple_Impl__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInputMultiple_ImplAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__3__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3202:1: rule__InputMultiple_Impl__Group_6__4 : rule__InputMultiple_Impl__Group_6__4__Impl ;
    public final void rule__InputMultiple_Impl__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3206:1: ( rule__InputMultiple_Impl__Group_6__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3207:2: rule__InputMultiple_Impl__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__4__Impl_in_rule__InputMultiple_Impl__Group_6__46351);
            rule__InputMultiple_Impl__Group_6__4__Impl();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__4"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3213:1: rule__InputMultiple_Impl__Group_6__4__Impl : ( '}' ) ;
    public final void rule__InputMultiple_Impl__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3217:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3218:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3218:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3219:1: '}'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputMultiple_Impl__Group_6__4__Impl6379); 
             after(grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6__4__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3242:1: rule__InputMultiple_Impl__Group_6_3__0 : rule__InputMultiple_Impl__Group_6_3__0__Impl rule__InputMultiple_Impl__Group_6_3__1 ;
    public final void rule__InputMultiple_Impl__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3246:1: ( rule__InputMultiple_Impl__Group_6_3__0__Impl rule__InputMultiple_Impl__Group_6_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3247:2: rule__InputMultiple_Impl__Group_6_3__0__Impl rule__InputMultiple_Impl__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6_3__0__Impl_in_rule__InputMultiple_Impl__Group_6_3__06420);
            rule__InputMultiple_Impl__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6_3__1_in_rule__InputMultiple_Impl__Group_6_3__06423);
            rule__InputMultiple_Impl__Group_6_3__1();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6_3__0"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3254:1: rule__InputMultiple_Impl__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__InputMultiple_Impl__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3258:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3259:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3259:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3260:1: ','
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__InputMultiple_Impl__Group_6_3__0__Impl6451); 
             after(grammarAccess.getInputMultiple_ImplAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6_3__0__Impl"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3273:1: rule__InputMultiple_Impl__Group_6_3__1 : rule__InputMultiple_Impl__Group_6_3__1__Impl ;
    public final void rule__InputMultiple_Impl__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3277:1: ( rule__InputMultiple_Impl__Group_6_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3278:2: rule__InputMultiple_Impl__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6_3__1__Impl_in_rule__InputMultiple_Impl__Group_6_3__16482);
            rule__InputMultiple_Impl__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6_3__1"


    // $ANTLR start "rule__InputMultiple_Impl__Group_6_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3284:1: rule__InputMultiple_Impl__Group_6_3__1__Impl : ( ( rule__InputMultiple_Impl__ValoresAssignment_6_3_1 ) ) ;
    public final void rule__InputMultiple_Impl__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3288:1: ( ( ( rule__InputMultiple_Impl__ValoresAssignment_6_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3289:1: ( ( rule__InputMultiple_Impl__ValoresAssignment_6_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3289:1: ( ( rule__InputMultiple_Impl__ValoresAssignment_6_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3290:1: ( rule__InputMultiple_Impl__ValoresAssignment_6_3_1 )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getValoresAssignment_6_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3291:1: ( rule__InputMultiple_Impl__ValoresAssignment_6_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3291:2: rule__InputMultiple_Impl__ValoresAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__ValoresAssignment_6_3_1_in_rule__InputMultiple_Impl__Group_6_3__1__Impl6509);
            rule__InputMultiple_Impl__ValoresAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputMultiple_ImplAccess().getValoresAssignment_6_3_1()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__Group_6_3__1__Impl"


    // $ANTLR start "rule__InputRadio__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3305:1: rule__InputRadio__Group__0 : rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1 ;
    public final void rule__InputRadio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3309:1: ( rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3310:2: rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__0__Impl_in_rule__InputRadio__Group__06543);
            rule__InputRadio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__1_in_rule__InputRadio__Group__06546);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3317:1: rule__InputRadio__Group__0__Impl : ( () ) ;
    public final void rule__InputRadio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3321:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3322:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3322:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3323:1: ()
            {
             before(grammarAccess.getInputRadioAccess().getInputRadioAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3324:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3326:1: 
            {
            }

             after(grammarAccess.getInputRadioAccess().getInputRadioAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__Group__0__Impl"


    // $ANTLR start "rule__InputRadio__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3336:1: rule__InputRadio__Group__1 : rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2 ;
    public final void rule__InputRadio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3340:1: ( rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3341:2: rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__1__Impl_in_rule__InputRadio__Group__16604);
            rule__InputRadio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__2_in_rule__InputRadio__Group__16607);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3348:1: rule__InputRadio__Group__1__Impl : ( ( rule__InputRadio__VisibleAssignment_1 )? ) ;
    public final void rule__InputRadio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3352:1: ( ( ( rule__InputRadio__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3353:1: ( ( rule__InputRadio__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3353:1: ( ( rule__InputRadio__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3354:1: ( rule__InputRadio__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputRadioAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3355:1: ( rule__InputRadio__VisibleAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3355:2: rule__InputRadio__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__VisibleAssignment_1_in_rule__InputRadio__Group__1__Impl6634);
                    rule__InputRadio__VisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputRadioAccess().getVisibleAssignment_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3365:1: rule__InputRadio__Group__2 : rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3 ;
    public final void rule__InputRadio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3369:1: ( rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3370:2: rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__2__Impl_in_rule__InputRadio__Group__26665);
            rule__InputRadio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__3_in_rule__InputRadio__Group__26668);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3377:1: rule__InputRadio__Group__2__Impl : ( ( rule__InputRadio__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputRadio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3381:1: ( ( ( rule__InputRadio__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3382:1: ( ( rule__InputRadio__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3382:1: ( ( rule__InputRadio__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3383:1: ( rule__InputRadio__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputRadioAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3384:1: ( rule__InputRadio__HabilitadoAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3384:2: rule__InputRadio__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__HabilitadoAssignment_2_in_rule__InputRadio__Group__2__Impl6695);
                    rule__InputRadio__HabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputRadioAccess().getHabilitadoAssignment_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3394:1: rule__InputRadio__Group__3 : rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4 ;
    public final void rule__InputRadio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3398:1: ( rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3399:2: rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__3__Impl_in_rule__InputRadio__Group__36726);
            rule__InputRadio__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__4_in_rule__InputRadio__Group__36729);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3406:1: rule__InputRadio__Group__3__Impl : ( 'InputRadio' ) ;
    public final void rule__InputRadio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3410:1: ( ( 'InputRadio' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3411:1: ( 'InputRadio' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3411:1: ( 'InputRadio' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3412:1: 'InputRadio'
            {
             before(grammarAccess.getInputRadioAccess().getInputRadioKeyword_3()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__InputRadio__Group__3__Impl6757); 
             after(grammarAccess.getInputRadioAccess().getInputRadioKeyword_3()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3425:1: rule__InputRadio__Group__4 : rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5 ;
    public final void rule__InputRadio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3429:1: ( rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3430:2: rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__4__Impl_in_rule__InputRadio__Group__46788);
            rule__InputRadio__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__5_in_rule__InputRadio__Group__46791);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3437:1: rule__InputRadio__Group__4__Impl : ( ( rule__InputRadio__NameAssignment_4 ) ) ;
    public final void rule__InputRadio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3441:1: ( ( ( rule__InputRadio__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3442:1: ( ( rule__InputRadio__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3442:1: ( ( rule__InputRadio__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3443:1: ( rule__InputRadio__NameAssignment_4 )
            {
             before(grammarAccess.getInputRadioAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3444:1: ( rule__InputRadio__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3444:2: rule__InputRadio__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__NameAssignment_4_in_rule__InputRadio__Group__4__Impl6818);
            rule__InputRadio__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getNameAssignment_4()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3454:1: rule__InputRadio__Group__5 : rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6 ;
    public final void rule__InputRadio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3458:1: ( rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3459:2: rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__5__Impl_in_rule__InputRadio__Group__56848);
            rule__InputRadio__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__6_in_rule__InputRadio__Group__56851);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3466:1: rule__InputRadio__Group__5__Impl : ( '{' ) ;
    public final void rule__InputRadio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3470:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3471:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3471:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3472:1: '{'
            {
             before(grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputRadio__Group__5__Impl6879); 
             after(grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3485:1: rule__InputRadio__Group__6 : rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7 ;
    public final void rule__InputRadio__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3489:1: ( rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3490:2: rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__6__Impl_in_rule__InputRadio__Group__66910);
            rule__InputRadio__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__7_in_rule__InputRadio__Group__66913);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3497:1: rule__InputRadio__Group__6__Impl : ( ( rule__InputRadio__Group_6__0 )? ) ;
    public final void rule__InputRadio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3501:1: ( ( ( rule__InputRadio__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3502:1: ( ( rule__InputRadio__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3502:1: ( ( rule__InputRadio__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3503:1: ( rule__InputRadio__Group_6__0 )?
            {
             before(grammarAccess.getInputRadioAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3504:1: ( rule__InputRadio__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3504:2: rule__InputRadio__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__0_in_rule__InputRadio__Group__6__Impl6940);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3514:1: rule__InputRadio__Group__7 : rule__InputRadio__Group__7__Impl rule__InputRadio__Group__8 ;
    public final void rule__InputRadio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3518:1: ( rule__InputRadio__Group__7__Impl rule__InputRadio__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3519:2: rule__InputRadio__Group__7__Impl rule__InputRadio__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__7__Impl_in_rule__InputRadio__Group__76971);
            rule__InputRadio__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__8_in_rule__InputRadio__Group__76974);
            rule__InputRadio__Group__8();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3526:1: rule__InputRadio__Group__7__Impl : ( ( rule__InputRadio__Group_7__0 )? ) ;
    public final void rule__InputRadio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3530:1: ( ( ( rule__InputRadio__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3531:1: ( ( rule__InputRadio__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3531:1: ( ( rule__InputRadio__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3532:1: ( rule__InputRadio__Group_7__0 )?
            {
             before(grammarAccess.getInputRadioAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3533:1: ( rule__InputRadio__Group_7__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==34) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3533:2: rule__InputRadio__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__0_in_rule__InputRadio__Group__7__Impl7001);
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


    // $ANTLR start "rule__InputRadio__Group__8"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3543:1: rule__InputRadio__Group__8 : rule__InputRadio__Group__8__Impl ;
    public final void rule__InputRadio__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3547:1: ( rule__InputRadio__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3548:2: rule__InputRadio__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__8__Impl_in_rule__InputRadio__Group__87032);
            rule__InputRadio__Group__8__Impl();

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
    // $ANTLR end "rule__InputRadio__Group__8"


    // $ANTLR start "rule__InputRadio__Group__8__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3554:1: rule__InputRadio__Group__8__Impl : ( '}' ) ;
    public final void rule__InputRadio__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3558:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3559:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3559:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3560:1: '}'
            {
             before(grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputRadio__Group__8__Impl7060); 
             after(grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__InputRadio__Group__8__Impl"


    // $ANTLR start "rule__InputRadio__Group_6__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3591:1: rule__InputRadio__Group_6__0 : rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1 ;
    public final void rule__InputRadio__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3595:1: ( rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3596:2: rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__0__Impl_in_rule__InputRadio__Group_6__07109);
            rule__InputRadio__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__1_in_rule__InputRadio__Group_6__07112);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3603:1: rule__InputRadio__Group_6__0__Impl : ( 'valores' ) ;
    public final void rule__InputRadio__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3607:1: ( ( 'valores' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3608:1: ( 'valores' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3608:1: ( 'valores' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3609:1: 'valores'
            {
             before(grammarAccess.getInputRadioAccess().getValoresKeyword_6_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__InputRadio__Group_6__0__Impl7140); 
             after(grammarAccess.getInputRadioAccess().getValoresKeyword_6_0()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3622:1: rule__InputRadio__Group_6__1 : rule__InputRadio__Group_6__1__Impl rule__InputRadio__Group_6__2 ;
    public final void rule__InputRadio__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3626:1: ( rule__InputRadio__Group_6__1__Impl rule__InputRadio__Group_6__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3627:2: rule__InputRadio__Group_6__1__Impl rule__InputRadio__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__1__Impl_in_rule__InputRadio__Group_6__17171);
            rule__InputRadio__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__2_in_rule__InputRadio__Group_6__17174);
            rule__InputRadio__Group_6__2();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3634:1: rule__InputRadio__Group_6__1__Impl : ( '{' ) ;
    public final void rule__InputRadio__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3638:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3639:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3639:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3640:1: '{'
            {
             before(grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputRadio__Group_6__1__Impl7202); 
             after(grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_6_1()); 

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


    // $ANTLR start "rule__InputRadio__Group_6__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3653:1: rule__InputRadio__Group_6__2 : rule__InputRadio__Group_6__2__Impl rule__InputRadio__Group_6__3 ;
    public final void rule__InputRadio__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3657:1: ( rule__InputRadio__Group_6__2__Impl rule__InputRadio__Group_6__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3658:2: rule__InputRadio__Group_6__2__Impl rule__InputRadio__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__2__Impl_in_rule__InputRadio__Group_6__27233);
            rule__InputRadio__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__3_in_rule__InputRadio__Group_6__27236);
            rule__InputRadio__Group_6__3();

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
    // $ANTLR end "rule__InputRadio__Group_6__2"


    // $ANTLR start "rule__InputRadio__Group_6__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3665:1: rule__InputRadio__Group_6__2__Impl : ( ( rule__InputRadio__ValoresAssignment_6_2 ) ) ;
    public final void rule__InputRadio__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3669:1: ( ( ( rule__InputRadio__ValoresAssignment_6_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3670:1: ( ( rule__InputRadio__ValoresAssignment_6_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3670:1: ( ( rule__InputRadio__ValoresAssignment_6_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3671:1: ( rule__InputRadio__ValoresAssignment_6_2 )
            {
             before(grammarAccess.getInputRadioAccess().getValoresAssignment_6_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3672:1: ( rule__InputRadio__ValoresAssignment_6_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3672:2: rule__InputRadio__ValoresAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__ValoresAssignment_6_2_in_rule__InputRadio__Group_6__2__Impl7263);
            rule__InputRadio__ValoresAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getValoresAssignment_6_2()); 

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
    // $ANTLR end "rule__InputRadio__Group_6__2__Impl"


    // $ANTLR start "rule__InputRadio__Group_6__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3682:1: rule__InputRadio__Group_6__3 : rule__InputRadio__Group_6__3__Impl rule__InputRadio__Group_6__4 ;
    public final void rule__InputRadio__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3686:1: ( rule__InputRadio__Group_6__3__Impl rule__InputRadio__Group_6__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3687:2: rule__InputRadio__Group_6__3__Impl rule__InputRadio__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__3__Impl_in_rule__InputRadio__Group_6__37293);
            rule__InputRadio__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__4_in_rule__InputRadio__Group_6__37296);
            rule__InputRadio__Group_6__4();

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
    // $ANTLR end "rule__InputRadio__Group_6__3"


    // $ANTLR start "rule__InputRadio__Group_6__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3694:1: rule__InputRadio__Group_6__3__Impl : ( ( rule__InputRadio__Group_6_3__0 )* ) ;
    public final void rule__InputRadio__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3698:1: ( ( ( rule__InputRadio__Group_6_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3699:1: ( ( rule__InputRadio__Group_6_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3699:1: ( ( rule__InputRadio__Group_6_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3700:1: ( rule__InputRadio__Group_6_3__0 )*
            {
             before(grammarAccess.getInputRadioAccess().getGroup_6_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3701:1: ( rule__InputRadio__Group_6_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3701:2: rule__InputRadio__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6_3__0_in_rule__InputRadio__Group_6__3__Impl7323);
            	    rule__InputRadio__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getInputRadioAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__InputRadio__Group_6__3__Impl"


    // $ANTLR start "rule__InputRadio__Group_6__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3711:1: rule__InputRadio__Group_6__4 : rule__InputRadio__Group_6__4__Impl ;
    public final void rule__InputRadio__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3715:1: ( rule__InputRadio__Group_6__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3716:2: rule__InputRadio__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__4__Impl_in_rule__InputRadio__Group_6__47354);
            rule__InputRadio__Group_6__4__Impl();

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
    // $ANTLR end "rule__InputRadio__Group_6__4"


    // $ANTLR start "rule__InputRadio__Group_6__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3722:1: rule__InputRadio__Group_6__4__Impl : ( '}' ) ;
    public final void rule__InputRadio__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3726:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3727:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3727:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3728:1: '}'
            {
             before(grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputRadio__Group_6__4__Impl7382); 
             after(grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__InputRadio__Group_6__4__Impl"


    // $ANTLR start "rule__InputRadio__Group_6_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3751:1: rule__InputRadio__Group_6_3__0 : rule__InputRadio__Group_6_3__0__Impl rule__InputRadio__Group_6_3__1 ;
    public final void rule__InputRadio__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3755:1: ( rule__InputRadio__Group_6_3__0__Impl rule__InputRadio__Group_6_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3756:2: rule__InputRadio__Group_6_3__0__Impl rule__InputRadio__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6_3__0__Impl_in_rule__InputRadio__Group_6_3__07423);
            rule__InputRadio__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6_3__1_in_rule__InputRadio__Group_6_3__07426);
            rule__InputRadio__Group_6_3__1();

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
    // $ANTLR end "rule__InputRadio__Group_6_3__0"


    // $ANTLR start "rule__InputRadio__Group_6_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3763:1: rule__InputRadio__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__InputRadio__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3767:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3768:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3768:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3769:1: ','
            {
             before(grammarAccess.getInputRadioAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__InputRadio__Group_6_3__0__Impl7454); 
             after(grammarAccess.getInputRadioAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__InputRadio__Group_6_3__0__Impl"


    // $ANTLR start "rule__InputRadio__Group_6_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3782:1: rule__InputRadio__Group_6_3__1 : rule__InputRadio__Group_6_3__1__Impl ;
    public final void rule__InputRadio__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3786:1: ( rule__InputRadio__Group_6_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3787:2: rule__InputRadio__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6_3__1__Impl_in_rule__InputRadio__Group_6_3__17485);
            rule__InputRadio__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__InputRadio__Group_6_3__1"


    // $ANTLR start "rule__InputRadio__Group_6_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3793:1: rule__InputRadio__Group_6_3__1__Impl : ( ( rule__InputRadio__ValoresAssignment_6_3_1 ) ) ;
    public final void rule__InputRadio__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3797:1: ( ( ( rule__InputRadio__ValoresAssignment_6_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3798:1: ( ( rule__InputRadio__ValoresAssignment_6_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3798:1: ( ( rule__InputRadio__ValoresAssignment_6_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3799:1: ( rule__InputRadio__ValoresAssignment_6_3_1 )
            {
             before(grammarAccess.getInputRadioAccess().getValoresAssignment_6_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3800:1: ( rule__InputRadio__ValoresAssignment_6_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3800:2: rule__InputRadio__ValoresAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__ValoresAssignment_6_3_1_in_rule__InputRadio__Group_6_3__1__Impl7512);
            rule__InputRadio__ValoresAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getValoresAssignment_6_3_1()); 

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
    // $ANTLR end "rule__InputRadio__Group_6_3__1__Impl"


    // $ANTLR start "rule__InputRadio__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3814:1: rule__InputRadio__Group_7__0 : rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1 ;
    public final void rule__InputRadio__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3818:1: ( rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3819:2: rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__0__Impl_in_rule__InputRadio__Group_7__07546);
            rule__InputRadio__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__1_in_rule__InputRadio__Group_7__07549);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3826:1: rule__InputRadio__Group_7__0__Impl : ( 'seleccion' ) ;
    public final void rule__InputRadio__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3830:1: ( ( 'seleccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3831:1: ( 'seleccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3831:1: ( 'seleccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3832:1: 'seleccion'
            {
             before(grammarAccess.getInputRadioAccess().getSeleccionKeyword_7_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputRadio__Group_7__0__Impl7577); 
             after(grammarAccess.getInputRadioAccess().getSeleccionKeyword_7_0()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3845:1: rule__InputRadio__Group_7__1 : rule__InputRadio__Group_7__1__Impl ;
    public final void rule__InputRadio__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3849:1: ( rule__InputRadio__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3850:2: rule__InputRadio__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__1__Impl_in_rule__InputRadio__Group_7__17608);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3856:1: rule__InputRadio__Group_7__1__Impl : ( ( rule__InputRadio__SeleccionAssignment_7_1 ) ) ;
    public final void rule__InputRadio__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3860:1: ( ( ( rule__InputRadio__SeleccionAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3861:1: ( ( rule__InputRadio__SeleccionAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3861:1: ( ( rule__InputRadio__SeleccionAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3862:1: ( rule__InputRadio__SeleccionAssignment_7_1 )
            {
             before(grammarAccess.getInputRadioAccess().getSeleccionAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3863:1: ( rule__InputRadio__SeleccionAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3863:2: rule__InputRadio__SeleccionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__SeleccionAssignment_7_1_in_rule__InputRadio__Group_7__1__Impl7635);
            rule__InputRadio__SeleccionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getSeleccionAssignment_7_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3877:1: rule__InputCombo__Group__0 : rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1 ;
    public final void rule__InputCombo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3881:1: ( rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3882:2: rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__0__Impl_in_rule__InputCombo__Group__07669);
            rule__InputCombo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__1_in_rule__InputCombo__Group__07672);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3889:1: rule__InputCombo__Group__0__Impl : ( () ) ;
    public final void rule__InputCombo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3893:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3894:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3894:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3895:1: ()
            {
             before(grammarAccess.getInputComboAccess().getInputComboAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3896:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3898:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3908:1: rule__InputCombo__Group__1 : rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2 ;
    public final void rule__InputCombo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3912:1: ( rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3913:2: rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__1__Impl_in_rule__InputCombo__Group__17730);
            rule__InputCombo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__2_in_rule__InputCombo__Group__17733);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3920:1: rule__InputCombo__Group__1__Impl : ( ( rule__InputCombo__VisibleAssignment_1 )? ) ;
    public final void rule__InputCombo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3924:1: ( ( ( rule__InputCombo__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3925:1: ( ( rule__InputCombo__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3925:1: ( ( rule__InputCombo__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3926:1: ( rule__InputCombo__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputComboAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3927:1: ( rule__InputCombo__VisibleAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3927:2: rule__InputCombo__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__VisibleAssignment_1_in_rule__InputCombo__Group__1__Impl7760);
                    rule__InputCombo__VisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputComboAccess().getVisibleAssignment_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3937:1: rule__InputCombo__Group__2 : rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3 ;
    public final void rule__InputCombo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3941:1: ( rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3942:2: rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__2__Impl_in_rule__InputCombo__Group__27791);
            rule__InputCombo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__3_in_rule__InputCombo__Group__27794);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3949:1: rule__InputCombo__Group__2__Impl : ( ( rule__InputCombo__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputCombo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3953:1: ( ( ( rule__InputCombo__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3954:1: ( ( rule__InputCombo__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3954:1: ( ( rule__InputCombo__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3955:1: ( rule__InputCombo__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputComboAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3956:1: ( rule__InputCombo__HabilitadoAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3956:2: rule__InputCombo__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__HabilitadoAssignment_2_in_rule__InputCombo__Group__2__Impl7821);
                    rule__InputCombo__HabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputComboAccess().getHabilitadoAssignment_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3966:1: rule__InputCombo__Group__3 : rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4 ;
    public final void rule__InputCombo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3970:1: ( rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3971:2: rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__3__Impl_in_rule__InputCombo__Group__37852);
            rule__InputCombo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__4_in_rule__InputCombo__Group__37855);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3978:1: rule__InputCombo__Group__3__Impl : ( 'InputCombo' ) ;
    public final void rule__InputCombo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3982:1: ( ( 'InputCombo' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3983:1: ( 'InputCombo' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3983:1: ( 'InputCombo' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3984:1: 'InputCombo'
            {
             before(grammarAccess.getInputComboAccess().getInputComboKeyword_3()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__InputCombo__Group__3__Impl7883); 
             after(grammarAccess.getInputComboAccess().getInputComboKeyword_3()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3997:1: rule__InputCombo__Group__4 : rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5 ;
    public final void rule__InputCombo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4001:1: ( rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4002:2: rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__4__Impl_in_rule__InputCombo__Group__47914);
            rule__InputCombo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__5_in_rule__InputCombo__Group__47917);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4009:1: rule__InputCombo__Group__4__Impl : ( ( rule__InputCombo__NameAssignment_4 ) ) ;
    public final void rule__InputCombo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4013:1: ( ( ( rule__InputCombo__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4014:1: ( ( rule__InputCombo__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4014:1: ( ( rule__InputCombo__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4015:1: ( rule__InputCombo__NameAssignment_4 )
            {
             before(grammarAccess.getInputComboAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4016:1: ( rule__InputCombo__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4016:2: rule__InputCombo__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__NameAssignment_4_in_rule__InputCombo__Group__4__Impl7944);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4026:1: rule__InputCombo__Group__5 : rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6 ;
    public final void rule__InputCombo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4030:1: ( rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4031:2: rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__5__Impl_in_rule__InputCombo__Group__57974);
            rule__InputCombo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__6_in_rule__InputCombo__Group__57977);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4038:1: rule__InputCombo__Group__5__Impl : ( '{' ) ;
    public final void rule__InputCombo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4042:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4043:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4043:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4044:1: '{'
            {
             before(grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCombo__Group__5__Impl8005); 
             after(grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4057:1: rule__InputCombo__Group__6 : rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7 ;
    public final void rule__InputCombo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4061:1: ( rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4062:2: rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__6__Impl_in_rule__InputCombo__Group__68036);
            rule__InputCombo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__7_in_rule__InputCombo__Group__68039);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4069:1: rule__InputCombo__Group__6__Impl : ( ( rule__InputCombo__Group_6__0 )? ) ;
    public final void rule__InputCombo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4073:1: ( ( ( rule__InputCombo__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4074:1: ( ( rule__InputCombo__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4074:1: ( ( rule__InputCombo__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4075:1: ( rule__InputCombo__Group_6__0 )?
            {
             before(grammarAccess.getInputComboAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4076:1: ( rule__InputCombo__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4076:2: rule__InputCombo__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__0_in_rule__InputCombo__Group__6__Impl8066);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4086:1: rule__InputCombo__Group__7 : rule__InputCombo__Group__7__Impl rule__InputCombo__Group__8 ;
    public final void rule__InputCombo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4090:1: ( rule__InputCombo__Group__7__Impl rule__InputCombo__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4091:2: rule__InputCombo__Group__7__Impl rule__InputCombo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__7__Impl_in_rule__InputCombo__Group__78097);
            rule__InputCombo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__8_in_rule__InputCombo__Group__78100);
            rule__InputCombo__Group__8();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4098:1: rule__InputCombo__Group__7__Impl : ( ( rule__InputCombo__Group_7__0 )? ) ;
    public final void rule__InputCombo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4102:1: ( ( ( rule__InputCombo__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4103:1: ( ( rule__InputCombo__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4103:1: ( ( rule__InputCombo__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4104:1: ( rule__InputCombo__Group_7__0 )?
            {
             before(grammarAccess.getInputComboAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4105:1: ( rule__InputCombo__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4105:2: rule__InputCombo__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__0_in_rule__InputCombo__Group__7__Impl8127);
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


    // $ANTLR start "rule__InputCombo__Group__8"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4115:1: rule__InputCombo__Group__8 : rule__InputCombo__Group__8__Impl ;
    public final void rule__InputCombo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4119:1: ( rule__InputCombo__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4120:2: rule__InputCombo__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__8__Impl_in_rule__InputCombo__Group__88158);
            rule__InputCombo__Group__8__Impl();

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
    // $ANTLR end "rule__InputCombo__Group__8"


    // $ANTLR start "rule__InputCombo__Group__8__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4126:1: rule__InputCombo__Group__8__Impl : ( '}' ) ;
    public final void rule__InputCombo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4130:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4131:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4131:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4132:1: '}'
            {
             before(grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputCombo__Group__8__Impl8186); 
             after(grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__InputCombo__Group__8__Impl"


    // $ANTLR start "rule__InputCombo__Group_6__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4163:1: rule__InputCombo__Group_6__0 : rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1 ;
    public final void rule__InputCombo__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4167:1: ( rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4168:2: rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__0__Impl_in_rule__InputCombo__Group_6__08235);
            rule__InputCombo__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__1_in_rule__InputCombo__Group_6__08238);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4175:1: rule__InputCombo__Group_6__0__Impl : ( 'valores' ) ;
    public final void rule__InputCombo__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4179:1: ( ( 'valores' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4180:1: ( 'valores' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4180:1: ( 'valores' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4181:1: 'valores'
            {
             before(grammarAccess.getInputComboAccess().getValoresKeyword_6_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__InputCombo__Group_6__0__Impl8266); 
             after(grammarAccess.getInputComboAccess().getValoresKeyword_6_0()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4194:1: rule__InputCombo__Group_6__1 : rule__InputCombo__Group_6__1__Impl rule__InputCombo__Group_6__2 ;
    public final void rule__InputCombo__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4198:1: ( rule__InputCombo__Group_6__1__Impl rule__InputCombo__Group_6__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4199:2: rule__InputCombo__Group_6__1__Impl rule__InputCombo__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__1__Impl_in_rule__InputCombo__Group_6__18297);
            rule__InputCombo__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__2_in_rule__InputCombo__Group_6__18300);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4206:1: rule__InputCombo__Group_6__1__Impl : ( '{' ) ;
    public final void rule__InputCombo__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4210:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4211:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4211:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4212:1: '{'
            {
             before(grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCombo__Group_6__1__Impl8328); 
             after(grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4225:1: rule__InputCombo__Group_6__2 : rule__InputCombo__Group_6__2__Impl rule__InputCombo__Group_6__3 ;
    public final void rule__InputCombo__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4229:1: ( rule__InputCombo__Group_6__2__Impl rule__InputCombo__Group_6__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4230:2: rule__InputCombo__Group_6__2__Impl rule__InputCombo__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__2__Impl_in_rule__InputCombo__Group_6__28359);
            rule__InputCombo__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__3_in_rule__InputCombo__Group_6__28362);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4237:1: rule__InputCombo__Group_6__2__Impl : ( ( rule__InputCombo__ValoresAssignment_6_2 ) ) ;
    public final void rule__InputCombo__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4241:1: ( ( ( rule__InputCombo__ValoresAssignment_6_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4242:1: ( ( rule__InputCombo__ValoresAssignment_6_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4242:1: ( ( rule__InputCombo__ValoresAssignment_6_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4243:1: ( rule__InputCombo__ValoresAssignment_6_2 )
            {
             before(grammarAccess.getInputComboAccess().getValoresAssignment_6_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4244:1: ( rule__InputCombo__ValoresAssignment_6_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4244:2: rule__InputCombo__ValoresAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__ValoresAssignment_6_2_in_rule__InputCombo__Group_6__2__Impl8389);
            rule__InputCombo__ValoresAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInputComboAccess().getValoresAssignment_6_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4254:1: rule__InputCombo__Group_6__3 : rule__InputCombo__Group_6__3__Impl rule__InputCombo__Group_6__4 ;
    public final void rule__InputCombo__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4258:1: ( rule__InputCombo__Group_6__3__Impl rule__InputCombo__Group_6__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4259:2: rule__InputCombo__Group_6__3__Impl rule__InputCombo__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__3__Impl_in_rule__InputCombo__Group_6__38419);
            rule__InputCombo__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__4_in_rule__InputCombo__Group_6__38422);
            rule__InputCombo__Group_6__4();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4266:1: rule__InputCombo__Group_6__3__Impl : ( ( rule__InputCombo__Group_6_3__0 )* ) ;
    public final void rule__InputCombo__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4270:1: ( ( ( rule__InputCombo__Group_6_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4271:1: ( ( rule__InputCombo__Group_6_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4271:1: ( ( rule__InputCombo__Group_6_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4272:1: ( rule__InputCombo__Group_6_3__0 )*
            {
             before(grammarAccess.getInputComboAccess().getGroup_6_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4273:1: ( rule__InputCombo__Group_6_3__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==20) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4273:2: rule__InputCombo__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6_3__0_in_rule__InputCombo__Group_6__3__Impl8449);
            	    rule__InputCombo__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getInputComboAccess().getGroup_6_3()); 

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


    // $ANTLR start "rule__InputCombo__Group_6__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4283:1: rule__InputCombo__Group_6__4 : rule__InputCombo__Group_6__4__Impl ;
    public final void rule__InputCombo__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4287:1: ( rule__InputCombo__Group_6__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4288:2: rule__InputCombo__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__4__Impl_in_rule__InputCombo__Group_6__48480);
            rule__InputCombo__Group_6__4__Impl();

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
    // $ANTLR end "rule__InputCombo__Group_6__4"


    // $ANTLR start "rule__InputCombo__Group_6__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4294:1: rule__InputCombo__Group_6__4__Impl : ( '}' ) ;
    public final void rule__InputCombo__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4298:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4299:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4299:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4300:1: '}'
            {
             before(grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputCombo__Group_6__4__Impl8508); 
             after(grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__InputCombo__Group_6__4__Impl"


    // $ANTLR start "rule__InputCombo__Group_6_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4323:1: rule__InputCombo__Group_6_3__0 : rule__InputCombo__Group_6_3__0__Impl rule__InputCombo__Group_6_3__1 ;
    public final void rule__InputCombo__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4327:1: ( rule__InputCombo__Group_6_3__0__Impl rule__InputCombo__Group_6_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4328:2: rule__InputCombo__Group_6_3__0__Impl rule__InputCombo__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6_3__0__Impl_in_rule__InputCombo__Group_6_3__08549);
            rule__InputCombo__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6_3__1_in_rule__InputCombo__Group_6_3__08552);
            rule__InputCombo__Group_6_3__1();

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
    // $ANTLR end "rule__InputCombo__Group_6_3__0"


    // $ANTLR start "rule__InputCombo__Group_6_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4335:1: rule__InputCombo__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__InputCombo__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4339:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4340:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4340:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4341:1: ','
            {
             before(grammarAccess.getInputComboAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__InputCombo__Group_6_3__0__Impl8580); 
             after(grammarAccess.getInputComboAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__InputCombo__Group_6_3__0__Impl"


    // $ANTLR start "rule__InputCombo__Group_6_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4354:1: rule__InputCombo__Group_6_3__1 : rule__InputCombo__Group_6_3__1__Impl ;
    public final void rule__InputCombo__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4358:1: ( rule__InputCombo__Group_6_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4359:2: rule__InputCombo__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6_3__1__Impl_in_rule__InputCombo__Group_6_3__18611);
            rule__InputCombo__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__InputCombo__Group_6_3__1"


    // $ANTLR start "rule__InputCombo__Group_6_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4365:1: rule__InputCombo__Group_6_3__1__Impl : ( ( rule__InputCombo__ValoresAssignment_6_3_1 ) ) ;
    public final void rule__InputCombo__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4369:1: ( ( ( rule__InputCombo__ValoresAssignment_6_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4370:1: ( ( rule__InputCombo__ValoresAssignment_6_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4370:1: ( ( rule__InputCombo__ValoresAssignment_6_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4371:1: ( rule__InputCombo__ValoresAssignment_6_3_1 )
            {
             before(grammarAccess.getInputComboAccess().getValoresAssignment_6_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4372:1: ( rule__InputCombo__ValoresAssignment_6_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4372:2: rule__InputCombo__ValoresAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__ValoresAssignment_6_3_1_in_rule__InputCombo__Group_6_3__1__Impl8638);
            rule__InputCombo__ValoresAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputComboAccess().getValoresAssignment_6_3_1()); 

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
    // $ANTLR end "rule__InputCombo__Group_6_3__1__Impl"


    // $ANTLR start "rule__InputCombo__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4386:1: rule__InputCombo__Group_7__0 : rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1 ;
    public final void rule__InputCombo__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4390:1: ( rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4391:2: rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__0__Impl_in_rule__InputCombo__Group_7__08672);
            rule__InputCombo__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__1_in_rule__InputCombo__Group_7__08675);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4398:1: rule__InputCombo__Group_7__0__Impl : ( 'seleccion' ) ;
    public final void rule__InputCombo__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4402:1: ( ( 'seleccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4403:1: ( 'seleccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4403:1: ( 'seleccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4404:1: 'seleccion'
            {
             before(grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputCombo__Group_7__0__Impl8703); 
             after(grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4417:1: rule__InputCombo__Group_7__1 : rule__InputCombo__Group_7__1__Impl ;
    public final void rule__InputCombo__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4421:1: ( rule__InputCombo__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4422:2: rule__InputCombo__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__1__Impl_in_rule__InputCombo__Group_7__18734);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4428:1: rule__InputCombo__Group_7__1__Impl : ( ( rule__InputCombo__SeleccionAssignment_7_1 ) ) ;
    public final void rule__InputCombo__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4432:1: ( ( ( rule__InputCombo__SeleccionAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4433:1: ( ( rule__InputCombo__SeleccionAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4433:1: ( ( rule__InputCombo__SeleccionAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4434:1: ( rule__InputCombo__SeleccionAssignment_7_1 )
            {
             before(grammarAccess.getInputComboAccess().getSeleccionAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4435:1: ( rule__InputCombo__SeleccionAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4435:2: rule__InputCombo__SeleccionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__SeleccionAssignment_7_1_in_rule__InputCombo__Group_7__1__Impl8761);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4449:1: rule__InputCheck__Group__0 : rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1 ;
    public final void rule__InputCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4453:1: ( rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4454:2: rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__0__Impl_in_rule__InputCheck__Group__08795);
            rule__InputCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__1_in_rule__InputCheck__Group__08798);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4461:1: rule__InputCheck__Group__0__Impl : ( () ) ;
    public final void rule__InputCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4465:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4466:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4466:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4467:1: ()
            {
             before(grammarAccess.getInputCheckAccess().getInputCheckAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4468:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4470:1: 
            {
            }

             after(grammarAccess.getInputCheckAccess().getInputCheckAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__Group__0__Impl"


    // $ANTLR start "rule__InputCheck__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4480:1: rule__InputCheck__Group__1 : rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2 ;
    public final void rule__InputCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4484:1: ( rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4485:2: rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__1__Impl_in_rule__InputCheck__Group__18856);
            rule__InputCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__2_in_rule__InputCheck__Group__18859);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4492:1: rule__InputCheck__Group__1__Impl : ( ( rule__InputCheck__VisibleAssignment_1 )? ) ;
    public final void rule__InputCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4496:1: ( ( ( rule__InputCheck__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4497:1: ( ( rule__InputCheck__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4497:1: ( ( rule__InputCheck__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4498:1: ( rule__InputCheck__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputCheckAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4499:1: ( rule__InputCheck__VisibleAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4499:2: rule__InputCheck__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__VisibleAssignment_1_in_rule__InputCheck__Group__1__Impl8886);
                    rule__InputCheck__VisibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputCheckAccess().getVisibleAssignment_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4509:1: rule__InputCheck__Group__2 : rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3 ;
    public final void rule__InputCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4513:1: ( rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4514:2: rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__2__Impl_in_rule__InputCheck__Group__28917);
            rule__InputCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__3_in_rule__InputCheck__Group__28920);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4521:1: rule__InputCheck__Group__2__Impl : ( ( rule__InputCheck__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4525:1: ( ( ( rule__InputCheck__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4526:1: ( ( rule__InputCheck__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4526:1: ( ( rule__InputCheck__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4527:1: ( rule__InputCheck__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputCheckAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4528:1: ( rule__InputCheck__HabilitadoAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4528:2: rule__InputCheck__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__HabilitadoAssignment_2_in_rule__InputCheck__Group__2__Impl8947);
                    rule__InputCheck__HabilitadoAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputCheckAccess().getHabilitadoAssignment_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4538:1: rule__InputCheck__Group__3 : rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4 ;
    public final void rule__InputCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4542:1: ( rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4543:2: rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__3__Impl_in_rule__InputCheck__Group__38978);
            rule__InputCheck__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__4_in_rule__InputCheck__Group__38981);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4550:1: rule__InputCheck__Group__3__Impl : ( 'InputCheck' ) ;
    public final void rule__InputCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4554:1: ( ( 'InputCheck' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4555:1: ( 'InputCheck' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4555:1: ( 'InputCheck' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4556:1: 'InputCheck'
            {
             before(grammarAccess.getInputCheckAccess().getInputCheckKeyword_3()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__InputCheck__Group__3__Impl9009); 
             after(grammarAccess.getInputCheckAccess().getInputCheckKeyword_3()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4569:1: rule__InputCheck__Group__4 : rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5 ;
    public final void rule__InputCheck__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4573:1: ( rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4574:2: rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__4__Impl_in_rule__InputCheck__Group__49040);
            rule__InputCheck__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__5_in_rule__InputCheck__Group__49043);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4581:1: rule__InputCheck__Group__4__Impl : ( ( rule__InputCheck__NameAssignment_4 ) ) ;
    public final void rule__InputCheck__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4585:1: ( ( ( rule__InputCheck__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4586:1: ( ( rule__InputCheck__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4586:1: ( ( rule__InputCheck__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4587:1: ( rule__InputCheck__NameAssignment_4 )
            {
             before(grammarAccess.getInputCheckAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4588:1: ( rule__InputCheck__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4588:2: rule__InputCheck__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__NameAssignment_4_in_rule__InputCheck__Group__4__Impl9070);
            rule__InputCheck__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getNameAssignment_4()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4598:1: rule__InputCheck__Group__5 : rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6 ;
    public final void rule__InputCheck__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4602:1: ( rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4603:2: rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__5__Impl_in_rule__InputCheck__Group__59100);
            rule__InputCheck__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__6_in_rule__InputCheck__Group__59103);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4610:1: rule__InputCheck__Group__5__Impl : ( '{' ) ;
    public final void rule__InputCheck__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4614:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4615:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4615:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4616:1: '{'
            {
             before(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCheck__Group__5__Impl9131); 
             after(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4629:1: rule__InputCheck__Group__6 : rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7 ;
    public final void rule__InputCheck__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4633:1: ( rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4634:2: rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__6__Impl_in_rule__InputCheck__Group__69162);
            rule__InputCheck__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__7_in_rule__InputCheck__Group__69165);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4641:1: rule__InputCheck__Group__6__Impl : ( ( rule__InputCheck__Group_6__0 )? ) ;
    public final void rule__InputCheck__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4645:1: ( ( ( rule__InputCheck__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4646:1: ( ( rule__InputCheck__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4646:1: ( ( rule__InputCheck__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4647:1: ( rule__InputCheck__Group_6__0 )?
            {
             before(grammarAccess.getInputCheckAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4648:1: ( rule__InputCheck__Group_6__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4648:2: rule__InputCheck__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__0_in_rule__InputCheck__Group__6__Impl9192);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4658:1: rule__InputCheck__Group__7 : rule__InputCheck__Group__7__Impl rule__InputCheck__Group__8 ;
    public final void rule__InputCheck__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4662:1: ( rule__InputCheck__Group__7__Impl rule__InputCheck__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4663:2: rule__InputCheck__Group__7__Impl rule__InputCheck__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__7__Impl_in_rule__InputCheck__Group__79223);
            rule__InputCheck__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__8_in_rule__InputCheck__Group__79226);
            rule__InputCheck__Group__8();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4670:1: rule__InputCheck__Group__7__Impl : ( ( rule__InputCheck__Group_7__0 )? ) ;
    public final void rule__InputCheck__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4674:1: ( ( ( rule__InputCheck__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4675:1: ( ( rule__InputCheck__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4675:1: ( ( rule__InputCheck__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4676:1: ( rule__InputCheck__Group_7__0 )?
            {
             before(grammarAccess.getInputCheckAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4677:1: ( rule__InputCheck__Group_7__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4677:2: rule__InputCheck__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__0_in_rule__InputCheck__Group__7__Impl9253);
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


    // $ANTLR start "rule__InputCheck__Group__8"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4687:1: rule__InputCheck__Group__8 : rule__InputCheck__Group__8__Impl ;
    public final void rule__InputCheck__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4691:1: ( rule__InputCheck__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4692:2: rule__InputCheck__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__8__Impl_in_rule__InputCheck__Group__89284);
            rule__InputCheck__Group__8__Impl();

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
    // $ANTLR end "rule__InputCheck__Group__8"


    // $ANTLR start "rule__InputCheck__Group__8__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4698:1: rule__InputCheck__Group__8__Impl : ( '}' ) ;
    public final void rule__InputCheck__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4702:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4703:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4703:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4704:1: '}'
            {
             before(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputCheck__Group__8__Impl9312); 
             after(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__InputCheck__Group__8__Impl"


    // $ANTLR start "rule__InputCheck__Group_6__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4735:1: rule__InputCheck__Group_6__0 : rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1 ;
    public final void rule__InputCheck__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4739:1: ( rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4740:2: rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__0__Impl_in_rule__InputCheck__Group_6__09361);
            rule__InputCheck__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__1_in_rule__InputCheck__Group_6__09364);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4747:1: rule__InputCheck__Group_6__0__Impl : ( 'valores' ) ;
    public final void rule__InputCheck__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4751:1: ( ( 'valores' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4752:1: ( 'valores' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4752:1: ( 'valores' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4753:1: 'valores'
            {
             before(grammarAccess.getInputCheckAccess().getValoresKeyword_6_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__InputCheck__Group_6__0__Impl9392); 
             after(grammarAccess.getInputCheckAccess().getValoresKeyword_6_0()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4766:1: rule__InputCheck__Group_6__1 : rule__InputCheck__Group_6__1__Impl rule__InputCheck__Group_6__2 ;
    public final void rule__InputCheck__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4770:1: ( rule__InputCheck__Group_6__1__Impl rule__InputCheck__Group_6__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4771:2: rule__InputCheck__Group_6__1__Impl rule__InputCheck__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__1__Impl_in_rule__InputCheck__Group_6__19423);
            rule__InputCheck__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__2_in_rule__InputCheck__Group_6__19426);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4778:1: rule__InputCheck__Group_6__1__Impl : ( '{' ) ;
    public final void rule__InputCheck__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4782:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4783:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4783:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4784:1: '{'
            {
             before(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCheck__Group_6__1__Impl9454); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4797:1: rule__InputCheck__Group_6__2 : rule__InputCheck__Group_6__2__Impl rule__InputCheck__Group_6__3 ;
    public final void rule__InputCheck__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4801:1: ( rule__InputCheck__Group_6__2__Impl rule__InputCheck__Group_6__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4802:2: rule__InputCheck__Group_6__2__Impl rule__InputCheck__Group_6__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__2__Impl_in_rule__InputCheck__Group_6__29485);
            rule__InputCheck__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__3_in_rule__InputCheck__Group_6__29488);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4809:1: rule__InputCheck__Group_6__2__Impl : ( ( rule__InputCheck__ValoresAssignment_6_2 ) ) ;
    public final void rule__InputCheck__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4813:1: ( ( ( rule__InputCheck__ValoresAssignment_6_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4814:1: ( ( rule__InputCheck__ValoresAssignment_6_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4814:1: ( ( rule__InputCheck__ValoresAssignment_6_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4815:1: ( rule__InputCheck__ValoresAssignment_6_2 )
            {
             before(grammarAccess.getInputCheckAccess().getValoresAssignment_6_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4816:1: ( rule__InputCheck__ValoresAssignment_6_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4816:2: rule__InputCheck__ValoresAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__ValoresAssignment_6_2_in_rule__InputCheck__Group_6__2__Impl9515);
            rule__InputCheck__ValoresAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getValoresAssignment_6_2()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4826:1: rule__InputCheck__Group_6__3 : rule__InputCheck__Group_6__3__Impl rule__InputCheck__Group_6__4 ;
    public final void rule__InputCheck__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4830:1: ( rule__InputCheck__Group_6__3__Impl rule__InputCheck__Group_6__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4831:2: rule__InputCheck__Group_6__3__Impl rule__InputCheck__Group_6__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__3__Impl_in_rule__InputCheck__Group_6__39545);
            rule__InputCheck__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__4_in_rule__InputCheck__Group_6__39548);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4838:1: rule__InputCheck__Group_6__3__Impl : ( ( rule__InputCheck__Group_6_3__0 )* ) ;
    public final void rule__InputCheck__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4842:1: ( ( ( rule__InputCheck__Group_6_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4843:1: ( ( rule__InputCheck__Group_6_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4843:1: ( ( rule__InputCheck__Group_6_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4844:1: ( rule__InputCheck__Group_6_3__0 )*
            {
             before(grammarAccess.getInputCheckAccess().getGroup_6_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4845:1: ( rule__InputCheck__Group_6_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==20) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4845:2: rule__InputCheck__Group_6_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6_3__0_in_rule__InputCheck__Group_6__3__Impl9575);
            	    rule__InputCheck__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4855:1: rule__InputCheck__Group_6__4 : rule__InputCheck__Group_6__4__Impl ;
    public final void rule__InputCheck__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4859:1: ( rule__InputCheck__Group_6__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4860:2: rule__InputCheck__Group_6__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__4__Impl_in_rule__InputCheck__Group_6__49606);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4866:1: rule__InputCheck__Group_6__4__Impl : ( '}' ) ;
    public final void rule__InputCheck__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4870:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4871:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4871:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4872:1: '}'
            {
             before(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputCheck__Group_6__4__Impl9634); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4895:1: rule__InputCheck__Group_6_3__0 : rule__InputCheck__Group_6_3__0__Impl rule__InputCheck__Group_6_3__1 ;
    public final void rule__InputCheck__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4899:1: ( rule__InputCheck__Group_6_3__0__Impl rule__InputCheck__Group_6_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4900:2: rule__InputCheck__Group_6_3__0__Impl rule__InputCheck__Group_6_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6_3__0__Impl_in_rule__InputCheck__Group_6_3__09675);
            rule__InputCheck__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6_3__1_in_rule__InputCheck__Group_6_3__09678);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4907:1: rule__InputCheck__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__InputCheck__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4911:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4912:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4912:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4913:1: ','
            {
             before(grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__InputCheck__Group_6_3__0__Impl9706); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4926:1: rule__InputCheck__Group_6_3__1 : rule__InputCheck__Group_6_3__1__Impl ;
    public final void rule__InputCheck__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4930:1: ( rule__InputCheck__Group_6_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4931:2: rule__InputCheck__Group_6_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6_3__1__Impl_in_rule__InputCheck__Group_6_3__19737);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4937:1: rule__InputCheck__Group_6_3__1__Impl : ( ( rule__InputCheck__ValoresAssignment_6_3_1 ) ) ;
    public final void rule__InputCheck__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4941:1: ( ( ( rule__InputCheck__ValoresAssignment_6_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4942:1: ( ( rule__InputCheck__ValoresAssignment_6_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4942:1: ( ( rule__InputCheck__ValoresAssignment_6_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4943:1: ( rule__InputCheck__ValoresAssignment_6_3_1 )
            {
             before(grammarAccess.getInputCheckAccess().getValoresAssignment_6_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4944:1: ( rule__InputCheck__ValoresAssignment_6_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4944:2: rule__InputCheck__ValoresAssignment_6_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__ValoresAssignment_6_3_1_in_rule__InputCheck__Group_6_3__1__Impl9764);
            rule__InputCheck__ValoresAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getValoresAssignment_6_3_1()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4958:1: rule__InputCheck__Group_7__0 : rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1 ;
    public final void rule__InputCheck__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4962:1: ( rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4963:2: rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__0__Impl_in_rule__InputCheck__Group_7__09798);
            rule__InputCheck__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__1_in_rule__InputCheck__Group_7__09801);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4970:1: rule__InputCheck__Group_7__0__Impl : ( 'seleccion' ) ;
    public final void rule__InputCheck__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4974:1: ( ( 'seleccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4975:1: ( 'seleccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4975:1: ( 'seleccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4976:1: 'seleccion'
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionKeyword_7_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputCheck__Group_7__0__Impl9829); 
             after(grammarAccess.getInputCheckAccess().getSeleccionKeyword_7_0()); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4989:1: rule__InputCheck__Group_7__1 : rule__InputCheck__Group_7__1__Impl rule__InputCheck__Group_7__2 ;
    public final void rule__InputCheck__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4993:1: ( rule__InputCheck__Group_7__1__Impl rule__InputCheck__Group_7__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4994:2: rule__InputCheck__Group_7__1__Impl rule__InputCheck__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__1__Impl_in_rule__InputCheck__Group_7__19860);
            rule__InputCheck__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__2_in_rule__InputCheck__Group_7__19863);
            rule__InputCheck__Group_7__2();

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5001:1: rule__InputCheck__Group_7__1__Impl : ( '{' ) ;
    public final void rule__InputCheck__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5005:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5006:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5006:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5007:1: '{'
            {
             before(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCheck__Group_7__1__Impl9891); 
             after(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_7_1()); 

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


    // $ANTLR start "rule__InputCheck__Group_7__2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5020:1: rule__InputCheck__Group_7__2 : rule__InputCheck__Group_7__2__Impl rule__InputCheck__Group_7__3 ;
    public final void rule__InputCheck__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5024:1: ( rule__InputCheck__Group_7__2__Impl rule__InputCheck__Group_7__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5025:2: rule__InputCheck__Group_7__2__Impl rule__InputCheck__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__2__Impl_in_rule__InputCheck__Group_7__29922);
            rule__InputCheck__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__3_in_rule__InputCheck__Group_7__29925);
            rule__InputCheck__Group_7__3();

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
    // $ANTLR end "rule__InputCheck__Group_7__2"


    // $ANTLR start "rule__InputCheck__Group_7__2__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5032:1: rule__InputCheck__Group_7__2__Impl : ( ( rule__InputCheck__SeleccionAssignment_7_2 ) ) ;
    public final void rule__InputCheck__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5036:1: ( ( ( rule__InputCheck__SeleccionAssignment_7_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5037:1: ( ( rule__InputCheck__SeleccionAssignment_7_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5037:1: ( ( rule__InputCheck__SeleccionAssignment_7_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5038:1: ( rule__InputCheck__SeleccionAssignment_7_2 )
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionAssignment_7_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5039:1: ( rule__InputCheck__SeleccionAssignment_7_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5039:2: rule__InputCheck__SeleccionAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__SeleccionAssignment_7_2_in_rule__InputCheck__Group_7__2__Impl9952);
            rule__InputCheck__SeleccionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getSeleccionAssignment_7_2()); 

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
    // $ANTLR end "rule__InputCheck__Group_7__2__Impl"


    // $ANTLR start "rule__InputCheck__Group_7__3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5049:1: rule__InputCheck__Group_7__3 : rule__InputCheck__Group_7__3__Impl rule__InputCheck__Group_7__4 ;
    public final void rule__InputCheck__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5053:1: ( rule__InputCheck__Group_7__3__Impl rule__InputCheck__Group_7__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5054:2: rule__InputCheck__Group_7__3__Impl rule__InputCheck__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__3__Impl_in_rule__InputCheck__Group_7__39982);
            rule__InputCheck__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__4_in_rule__InputCheck__Group_7__39985);
            rule__InputCheck__Group_7__4();

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
    // $ANTLR end "rule__InputCheck__Group_7__3"


    // $ANTLR start "rule__InputCheck__Group_7__3__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5061:1: rule__InputCheck__Group_7__3__Impl : ( ( rule__InputCheck__Group_7_3__0 )* ) ;
    public final void rule__InputCheck__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5065:1: ( ( ( rule__InputCheck__Group_7_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5066:1: ( ( rule__InputCheck__Group_7_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5066:1: ( ( rule__InputCheck__Group_7_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5067:1: ( rule__InputCheck__Group_7_3__0 )*
            {
             before(grammarAccess.getInputCheckAccess().getGroup_7_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5068:1: ( rule__InputCheck__Group_7_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==20) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5068:2: rule__InputCheck__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7_3__0_in_rule__InputCheck__Group_7__3__Impl10012);
            	    rule__InputCheck__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getInputCheckAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__InputCheck__Group_7__3__Impl"


    // $ANTLR start "rule__InputCheck__Group_7__4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5078:1: rule__InputCheck__Group_7__4 : rule__InputCheck__Group_7__4__Impl ;
    public final void rule__InputCheck__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5082:1: ( rule__InputCheck__Group_7__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5083:2: rule__InputCheck__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__4__Impl_in_rule__InputCheck__Group_7__410043);
            rule__InputCheck__Group_7__4__Impl();

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
    // $ANTLR end "rule__InputCheck__Group_7__4"


    // $ANTLR start "rule__InputCheck__Group_7__4__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5089:1: rule__InputCheck__Group_7__4__Impl : ( '}' ) ;
    public final void rule__InputCheck__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5093:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5094:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5094:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5095:1: '}'
            {
             before(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__InputCheck__Group_7__4__Impl10071); 
             after(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__InputCheck__Group_7__4__Impl"


    // $ANTLR start "rule__InputCheck__Group_7_3__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5118:1: rule__InputCheck__Group_7_3__0 : rule__InputCheck__Group_7_3__0__Impl rule__InputCheck__Group_7_3__1 ;
    public final void rule__InputCheck__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5122:1: ( rule__InputCheck__Group_7_3__0__Impl rule__InputCheck__Group_7_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5123:2: rule__InputCheck__Group_7_3__0__Impl rule__InputCheck__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7_3__0__Impl_in_rule__InputCheck__Group_7_3__010112);
            rule__InputCheck__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7_3__1_in_rule__InputCheck__Group_7_3__010115);
            rule__InputCheck__Group_7_3__1();

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
    // $ANTLR end "rule__InputCheck__Group_7_3__0"


    // $ANTLR start "rule__InputCheck__Group_7_3__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5130:1: rule__InputCheck__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__InputCheck__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5134:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5135:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5135:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5136:1: ','
            {
             before(grammarAccess.getInputCheckAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__InputCheck__Group_7_3__0__Impl10143); 
             after(grammarAccess.getInputCheckAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__InputCheck__Group_7_3__0__Impl"


    // $ANTLR start "rule__InputCheck__Group_7_3__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5149:1: rule__InputCheck__Group_7_3__1 : rule__InputCheck__Group_7_3__1__Impl ;
    public final void rule__InputCheck__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5153:1: ( rule__InputCheck__Group_7_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5154:2: rule__InputCheck__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7_3__1__Impl_in_rule__InputCheck__Group_7_3__110174);
            rule__InputCheck__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__InputCheck__Group_7_3__1"


    // $ANTLR start "rule__InputCheck__Group_7_3__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5160:1: rule__InputCheck__Group_7_3__1__Impl : ( ( rule__InputCheck__SeleccionAssignment_7_3_1 ) ) ;
    public final void rule__InputCheck__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5164:1: ( ( ( rule__InputCheck__SeleccionAssignment_7_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5165:1: ( ( rule__InputCheck__SeleccionAssignment_7_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5165:1: ( ( rule__InputCheck__SeleccionAssignment_7_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5166:1: ( rule__InputCheck__SeleccionAssignment_7_3_1 )
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionAssignment_7_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5167:1: ( rule__InputCheck__SeleccionAssignment_7_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5167:2: rule__InputCheck__SeleccionAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__SeleccionAssignment_7_3_1_in_rule__InputCheck__Group_7_3__1__Impl10201);
            rule__InputCheck__SeleccionAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getSeleccionAssignment_7_3_1()); 

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
    // $ANTLR end "rule__InputCheck__Group_7_3__1__Impl"


    // $ANTLR start "rule__Formulario__ComprobarAsercionAssignment_0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5184:1: rule__Formulario__ComprobarAsercionAssignment_0 : ( ( 'comprobarAsercion' ) ) ;
    public final void rule__Formulario__ComprobarAsercionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5188:1: ( ( ( 'comprobarAsercion' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5189:1: ( ( 'comprobarAsercion' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5189:1: ( ( 'comprobarAsercion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5190:1: ( 'comprobarAsercion' )
            {
             before(grammarAccess.getFormularioAccess().getComprobarAsercionComprobarAsercionKeyword_0_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5191:1: ( 'comprobarAsercion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5192:1: 'comprobarAsercion'
            {
             before(grammarAccess.getFormularioAccess().getComprobarAsercionComprobarAsercionKeyword_0_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Formulario__ComprobarAsercionAssignment_010247); 
             after(grammarAccess.getFormularioAccess().getComprobarAsercionComprobarAsercionKeyword_0_0()); 

            }

             after(grammarAccess.getFormularioAccess().getComprobarAsercionComprobarAsercionKeyword_0_0()); 

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
    // $ANTLR end "rule__Formulario__ComprobarAsercionAssignment_0"


    // $ANTLR start "rule__Formulario__ComprobarAccionAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5207:1: rule__Formulario__ComprobarAccionAssignment_1 : ( ( 'comprobarAccion' ) ) ;
    public final void rule__Formulario__ComprobarAccionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5211:1: ( ( ( 'comprobarAccion' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5212:1: ( ( 'comprobarAccion' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5212:1: ( ( 'comprobarAccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5213:1: ( 'comprobarAccion' )
            {
             before(grammarAccess.getFormularioAccess().getComprobarAccionComprobarAccionKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5214:1: ( 'comprobarAccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5215:1: 'comprobarAccion'
            {
             before(grammarAccess.getFormularioAccess().getComprobarAccionComprobarAccionKeyword_1_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Formulario__ComprobarAccionAssignment_110291); 
             after(grammarAccess.getFormularioAccess().getComprobarAccionComprobarAccionKeyword_1_0()); 

            }

             after(grammarAccess.getFormularioAccess().getComprobarAccionComprobarAccionKeyword_1_0()); 

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
    // $ANTLR end "rule__Formulario__ComprobarAccionAssignment_1"


    // $ANTLR start "rule__Formulario__NameAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5230:1: rule__Formulario__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Formulario__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5234:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5235:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5235:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5236:1: ruleEString
            {
             before(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Formulario__NameAssignment_310330);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Formulario__NameAssignment_3"


    // $ANTLR start "rule__Formulario__LayoutAssignment_6"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5245:1: rule__Formulario__LayoutAssignment_6 : ( ruleLayout ) ;
    public final void rule__Formulario__LayoutAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5249:1: ( ( ruleLayout ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5250:1: ( ruleLayout )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5250:1: ( ruleLayout )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5251:1: ruleLayout
            {
             before(grammarAccess.getFormularioAccess().getLayoutLayoutParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Formulario__LayoutAssignment_610361);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getFormularioAccess().getLayoutLayoutParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Formulario__LayoutAssignment_6"


    // $ANTLR start "rule__Formulario__PruebasAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5260:1: rule__Formulario__PruebasAssignment_7_1 : ( rulePruebaInterfaz ) ;
    public final void rule__Formulario__PruebasAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5264:1: ( ( rulePruebaInterfaz ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5265:1: ( rulePruebaInterfaz )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5265:1: ( rulePruebaInterfaz )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5266:1: rulePruebaInterfaz
            {
             before(grammarAccess.getFormularioAccess().getPruebasPruebaInterfazParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_rule__Formulario__PruebasAssignment_7_110392);
            rulePruebaInterfaz();

            state._fsp--;

             after(grammarAccess.getFormularioAccess().getPruebasPruebaInterfazParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Formulario__PruebasAssignment_7_1"


    // $ANTLR start "rule__Layout__AnchuraAssignment_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5275:1: rule__Layout__AnchuraAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Layout__AnchuraAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5279:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5280:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5280:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5281:1: ruleEInt
            {
             before(grammarAccess.getLayoutAccess().getAnchuraEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Layout__AnchuraAssignment_3_110423);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getAnchuraEIntParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Layout__AnchuraAssignment_3_1"


    // $ANTLR start "rule__Layout__AlturaAssignment_4_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5290:1: rule__Layout__AlturaAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Layout__AlturaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5294:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5295:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5295:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5296:1: ruleEInt
            {
             before(grammarAccess.getLayoutAccess().getAlturaEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Layout__AlturaAssignment_4_110454);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getAlturaEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Layout__AlturaAssignment_4_1"


    // $ANTLR start "rule__Layout__EntradasAssignment_5_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5305:1: rule__Layout__EntradasAssignment_5_2 : ( ruleInput ) ;
    public final void rule__Layout__EntradasAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5309:1: ( ( ruleInput ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5310:1: ( ruleInput )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5310:1: ( ruleInput )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5311:1: ruleInput
            {
             before(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_5_210485);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Layout__EntradasAssignment_5_2"


    // $ANTLR start "rule__Layout__EntradasAssignment_5_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5320:1: rule__Layout__EntradasAssignment_5_3_1 : ( ruleInput ) ;
    public final void rule__Layout__EntradasAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5324:1: ( ( ruleInput ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5325:1: ( ruleInput )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5325:1: ( ruleInput )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5326:1: ruleInput
            {
             before(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_5_3_110516);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Layout__EntradasAssignment_5_3_1"


    // $ANTLR start "rule__PruebaInterfaz__NameAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5335:1: rule__PruebaInterfaz__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PruebaInterfaz__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5339:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5340:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5340:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5341:1: ruleEString
            {
             before(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PruebaInterfaz__NameAssignment_210547);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__NameAssignment_2"


    // $ANTLR start "rule__PruebaInterfaz__AccionesAssignment_4_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5350:1: rule__PruebaInterfaz__AccionesAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__PruebaInterfaz__AccionesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5354:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5355:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5355:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5356:1: ( ruleEString )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAccionCrossReference_4_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5357:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5358:1: ruleEString
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAccionEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PruebaInterfaz__AccionesAssignment_4_210582);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAccionEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAccionCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__AccionesAssignment_4_2"


    // $ANTLR start "rule__PruebaInterfaz__AccionesAssignment_4_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5369:1: rule__PruebaInterfaz__AccionesAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__PruebaInterfaz__AccionesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5373:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5374:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5374:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5375:1: ( ruleEString )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAccionCrossReference_4_3_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5376:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5377:1: ruleEString
            {
             before(grammarAccess.getPruebaInterfazAccess().getAccionesAccionEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PruebaInterfaz__AccionesAssignment_4_3_110621);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAccionEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getPruebaInterfazAccess().getAccionesAccionCrossReference_4_3_1_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__AccionesAssignment_4_3_1"


    // $ANTLR start "rule__PruebaInterfaz__AsercionesAssignment_5_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5388:1: rule__PruebaInterfaz__AsercionesAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__PruebaInterfaz__AsercionesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5392:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5393:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5393:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5394:1: ( ruleEString )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionCrossReference_5_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5395:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5396:1: ruleEString
            {
             before(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PruebaInterfaz__AsercionesAssignment_5_210660);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__AsercionesAssignment_5_2"


    // $ANTLR start "rule__PruebaInterfaz__AsercionesAssignment_5_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5407:1: rule__PruebaInterfaz__AsercionesAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__PruebaInterfaz__AsercionesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5411:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5412:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5412:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5413:1: ( ruleEString )
            {
             before(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionCrossReference_5_3_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5414:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5415:1: ruleEString
            {
             before(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PruebaInterfaz__AsercionesAssignment_5_3_110699);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__PruebaInterfaz__AsercionesAssignment_5_3_1"


    // $ANTLR start "rule__Input_Impl__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5426:1: rule__Input_Impl__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__Input_Impl__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5430:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5431:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5431:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5432:1: ( 'visible' )
            {
             before(grammarAccess.getInput_ImplAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5433:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5434:1: 'visible'
            {
             before(grammarAccess.getInput_ImplAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Input_Impl__VisibleAssignment_110739); 
             after(grammarAccess.getInput_ImplAccess().getVisibleVisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInput_ImplAccess().getVisibleVisibleKeyword_1_0()); 

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
    // $ANTLR end "rule__Input_Impl__VisibleAssignment_1"


    // $ANTLR start "rule__Input_Impl__HabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5449:1: rule__Input_Impl__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__Input_Impl__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5453:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5454:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5454:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5455:1: ( 'habilitado' )
            {
             before(grammarAccess.getInput_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5456:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5457:1: 'habilitado'
            {
             before(grammarAccess.getInput_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Input_Impl__HabilitadoAssignment_210783); 
             after(grammarAccess.getInput_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInput_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 

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
    // $ANTLR end "rule__Input_Impl__HabilitadoAssignment_2"


    // $ANTLR start "rule__Input_Impl__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5472:1: rule__Input_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Input_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5476:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5477:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5477:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5478:1: ruleEString
            {
             before(grammarAccess.getInput_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Input_Impl__NameAssignment_410822);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInput_ImplAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Input_Impl__NameAssignment_4"


    // $ANTLR start "rule__InputTexto__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5487:1: rule__InputTexto__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputTexto__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5491:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5492:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5492:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5493:1: ( 'visible' )
            {
             before(grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5494:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5495:1: 'visible'
            {
             before(grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__InputTexto__VisibleAssignment_110858); 
             after(grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0()); 

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
    // $ANTLR end "rule__InputTexto__VisibleAssignment_1"


    // $ANTLR start "rule__InputTexto__HabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5510:1: rule__InputTexto__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputTexto__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5514:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5515:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5515:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5516:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5517:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5518:1: 'habilitado'
            {
             before(grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__InputTexto__HabilitadoAssignment_210902); 
             after(grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0()); 

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
    // $ANTLR end "rule__InputTexto__HabilitadoAssignment_2"


    // $ANTLR start "rule__InputTexto__ObligatorioAssignment_3"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5533:1: rule__InputTexto__ObligatorioAssignment_3 : ( ( 'obligatorio' ) ) ;
    public final void rule__InputTexto__ObligatorioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5537:1: ( ( ( 'obligatorio' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5538:1: ( ( 'obligatorio' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5538:1: ( ( 'obligatorio' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5539:1: ( 'obligatorio' )
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5540:1: ( 'obligatorio' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5541:1: 'obligatorio'
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__InputTexto__ObligatorioAssignment_310946); 
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


    // $ANTLR start "rule__InputTexto__NameAssignment_5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5556:1: rule__InputTexto__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__InputTexto__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5560:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5561:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5561:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5562:1: ruleEString
            {
             before(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputTexto__NameAssignment_510985);
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


    // $ANTLR start "rule__InputTexto__ValorAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5571:1: rule__InputTexto__ValorAssignment_7_1 : ( ruleEString ) ;
    public final void rule__InputTexto__ValorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5575:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5576:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5576:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5577:1: ruleEString
            {
             before(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputTexto__ValorAssignment_7_111016);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__InputTexto__ValorAssignment_7_1"


    // $ANTLR start "rule__InputBoton__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5586:1: rule__InputBoton__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputBoton__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5590:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5591:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5591:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5592:1: ( 'visible' )
            {
             before(grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5593:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5594:1: 'visible'
            {
             before(grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__InputBoton__VisibleAssignment_111052); 
             after(grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0()); 

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
    // $ANTLR end "rule__InputBoton__VisibleAssignment_1"


    // $ANTLR start "rule__InputBoton__HabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5609:1: rule__InputBoton__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputBoton__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5613:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5614:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5614:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5615:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5616:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5617:1: 'habilitado'
            {
             before(grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__InputBoton__HabilitadoAssignment_211096); 
             after(grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0()); 

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
    // $ANTLR end "rule__InputBoton__HabilitadoAssignment_2"


    // $ANTLR start "rule__InputBoton__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5632:1: rule__InputBoton__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputBoton__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5636:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5637:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5637:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5638:1: ruleEString
            {
             before(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputBoton__NameAssignment_411135);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InputBoton__NameAssignment_4"


    // $ANTLR start "rule__InputMultiple_Impl__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5647:1: rule__InputMultiple_Impl__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputMultiple_Impl__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5651:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5652:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5652:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5653:1: ( 'visible' )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5654:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5655:1: 'visible'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__InputMultiple_Impl__VisibleAssignment_111171); 
             after(grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__VisibleAssignment_1"


    // $ANTLR start "rule__InputMultiple_Impl__HabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5670:1: rule__InputMultiple_Impl__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputMultiple_Impl__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5674:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5675:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5675:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5676:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5677:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5678:1: 'habilitado'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__InputMultiple_Impl__HabilitadoAssignment_211215); 
             after(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__HabilitadoAssignment_2"


    // $ANTLR start "rule__InputMultiple_Impl__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5693:1: rule__InputMultiple_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputMultiple_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5697:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5698:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5698:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5699:1: ruleEString
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputMultiple_Impl__NameAssignment_411254);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputMultiple_ImplAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__NameAssignment_4"


    // $ANTLR start "rule__InputMultiple_Impl__ValoresAssignment_6_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5708:1: rule__InputMultiple_Impl__ValoresAssignment_6_2 : ( ruleEString ) ;
    public final void rule__InputMultiple_Impl__ValoresAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5712:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5713:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5713:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5714:1: ruleEString
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputMultiple_Impl__ValoresAssignment_6_211285);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__ValoresAssignment_6_2"


    // $ANTLR start "rule__InputMultiple_Impl__ValoresAssignment_6_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5723:1: rule__InputMultiple_Impl__ValoresAssignment_6_3_1 : ( ruleEString ) ;
    public final void rule__InputMultiple_Impl__ValoresAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5727:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5728:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5728:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5729:1: ruleEString
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputMultiple_Impl__ValoresAssignment_6_3_111316);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__InputMultiple_Impl__ValoresAssignment_6_3_1"


    // $ANTLR start "rule__InputRadio__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5738:1: rule__InputRadio__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputRadio__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5742:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5743:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5743:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5744:1: ( 'visible' )
            {
             before(grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5745:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5746:1: 'visible'
            {
             before(grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__InputRadio__VisibleAssignment_111352); 
             after(grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0()); 

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
    // $ANTLR end "rule__InputRadio__VisibleAssignment_1"


    // $ANTLR start "rule__InputRadio__HabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5761:1: rule__InputRadio__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputRadio__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5765:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5766:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5766:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5767:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5768:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5769:1: 'habilitado'
            {
             before(grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__InputRadio__HabilitadoAssignment_211396); 
             after(grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0()); 

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
    // $ANTLR end "rule__InputRadio__HabilitadoAssignment_2"


    // $ANTLR start "rule__InputRadio__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5784:1: rule__InputRadio__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputRadio__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5788:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5789:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5789:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5790:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__NameAssignment_411435);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InputRadio__NameAssignment_4"


    // $ANTLR start "rule__InputRadio__ValoresAssignment_6_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5799:1: rule__InputRadio__ValoresAssignment_6_2 : ( ruleEString ) ;
    public final void rule__InputRadio__ValoresAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5803:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5804:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5804:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5805:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_6_211466);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__InputRadio__ValoresAssignment_6_2"


    // $ANTLR start "rule__InputRadio__ValoresAssignment_6_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5814:1: rule__InputRadio__ValoresAssignment_6_3_1 : ( ruleEString ) ;
    public final void rule__InputRadio__ValoresAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5818:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5819:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5819:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5820:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_6_3_111497);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__InputRadio__ValoresAssignment_6_3_1"


    // $ANTLR start "rule__InputRadio__SeleccionAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5829:1: rule__InputRadio__SeleccionAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__InputRadio__SeleccionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5833:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5834:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5834:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5835:1: ruleEInt
            {
             before(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputRadio__SeleccionAssignment_7_111528);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__InputRadio__SeleccionAssignment_7_1"


    // $ANTLR start "rule__InputCombo__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5844:1: rule__InputCombo__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputCombo__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5848:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5849:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5849:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5850:1: ( 'visible' )
            {
             before(grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5851:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5852:1: 'visible'
            {
             before(grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__InputCombo__VisibleAssignment_111564); 
             after(grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0()); 

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
    // $ANTLR end "rule__InputCombo__VisibleAssignment_1"


    // $ANTLR start "rule__InputCombo__HabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5867:1: rule__InputCombo__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputCombo__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5871:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5872:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5872:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5873:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5874:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5875:1: 'habilitado'
            {
             before(grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__InputCombo__HabilitadoAssignment_211608); 
             after(grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0()); 

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
    // $ANTLR end "rule__InputCombo__HabilitadoAssignment_2"


    // $ANTLR start "rule__InputCombo__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5890:1: rule__InputCombo__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputCombo__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5894:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5895:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5895:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5896:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__NameAssignment_411647);
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


    // $ANTLR start "rule__InputCombo__ValoresAssignment_6_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5905:1: rule__InputCombo__ValoresAssignment_6_2 : ( ruleEString ) ;
    public final void rule__InputCombo__ValoresAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5909:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5910:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5910:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5911:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_211678);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__InputCombo__ValoresAssignment_6_2"


    // $ANTLR start "rule__InputCombo__ValoresAssignment_6_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5920:1: rule__InputCombo__ValoresAssignment_6_3_1 : ( ruleEString ) ;
    public final void rule__InputCombo__ValoresAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5924:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5925:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5925:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5926:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_3_111709);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__InputCombo__ValoresAssignment_6_3_1"


    // $ANTLR start "rule__InputCombo__SeleccionAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5935:1: rule__InputCombo__SeleccionAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__InputCombo__SeleccionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5939:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5940:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5940:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5941:1: ruleEInt
            {
             before(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCombo__SeleccionAssignment_7_111740);
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


    // $ANTLR start "rule__InputCheck__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5950:1: rule__InputCheck__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputCheck__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5954:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5955:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5955:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5956:1: ( 'visible' )
            {
             before(grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5957:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5958:1: 'visible'
            {
             before(grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__InputCheck__VisibleAssignment_111776); 
             after(grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0()); 

            }

             after(grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0()); 

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
    // $ANTLR end "rule__InputCheck__VisibleAssignment_1"


    // $ANTLR start "rule__InputCheck__HabilitadoAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5973:1: rule__InputCheck__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputCheck__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5977:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5978:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5978:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5979:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5980:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5981:1: 'habilitado'
            {
             before(grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__InputCheck__HabilitadoAssignment_211820); 
             after(grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0()); 

            }

             after(grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0()); 

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
    // $ANTLR end "rule__InputCheck__HabilitadoAssignment_2"


    // $ANTLR start "rule__InputCheck__NameAssignment_4"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:5996:1: rule__InputCheck__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputCheck__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6000:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6001:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6001:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6002:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__NameAssignment_411859);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InputCheck__NameAssignment_4"


    // $ANTLR start "rule__InputCheck__ValoresAssignment_6_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6011:1: rule__InputCheck__ValoresAssignment_6_2 : ( ruleEString ) ;
    public final void rule__InputCheck__ValoresAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6015:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6016:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6016:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6017:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_6_211890);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__InputCheck__ValoresAssignment_6_2"


    // $ANTLR start "rule__InputCheck__ValoresAssignment_6_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6026:1: rule__InputCheck__ValoresAssignment_6_3_1 : ( ruleEString ) ;
    public final void rule__InputCheck__ValoresAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6030:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6031:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6031:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6032:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_6_3_111921);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__InputCheck__ValoresAssignment_6_3_1"


    // $ANTLR start "rule__InputCheck__SeleccionAssignment_7_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6041:1: rule__InputCheck__SeleccionAssignment_7_2 : ( ruleEInt ) ;
    public final void rule__InputCheck__SeleccionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6045:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6046:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6046:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6047:1: ruleEInt
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_7_211952);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__InputCheck__SeleccionAssignment_7_2"


    // $ANTLR start "rule__InputCheck__SeleccionAssignment_7_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6056:1: rule__InputCheck__SeleccionAssignment_7_3_1 : ( ruleEInt ) ;
    public final void rule__InputCheck__SeleccionAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6060:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6061:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6061:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:6062:1: ruleEInt
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_7_3_111983);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__InputCheck__SeleccionAssignment_7_3_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\3\33\7\uffff";
    static final String DFA1_maxS =
        "\3\51\7\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\1\4\1\uffff\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1\11\2\uffff"+
            "\1\1\1\2\1\4",
            "\1\3\1\4\1\uffff\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1\11\3\uffff"+
            "\1\2\1\4",
            "\1\3\1\4\1\uffff\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1\11\4\uffff"+
            "\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "430:1: rule__Input__Alternatives : ( ( ruleInput_Impl ) | ( ruleInputTexto ) | ( ruleInputBoton ) | ( ruleInputMultiple_Impl ) | ( ruleInputRadio ) | ( ruleInputCombo ) | ( ruleInputCheck ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormulario_in_entryRuleFormulario61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulario68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__0_in_ruleFormulario94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input__Alternatives_in_ruleInput154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0_in_ruleLayout214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__0_in_rulePruebaInterfaz336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput_Impl430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__0_in_ruleInput_Impl456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__0_in_ruleInputTexto516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_entryRuleInputBoton543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputBoton550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__0_in_ruleInputBoton576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_entryRuleInputMultiple_Impl603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputMultiple_Impl610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__0_in_ruleInputMultiple_Impl636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__0_in_ruleInputRadio696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__0_in_ruleInputCombo756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__0_in_ruleInputCheck816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_Impl_in_rule__Input__Alternatives856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_rule__Input__Alternatives873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_rule__Input__Alternatives890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_rule__Input__Alternatives907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_rule__Input__Alternatives924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_rule__Input__Alternatives941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_rule__Input__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__0__Impl_in_rule__Formulario__Group__01038 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_rule__Formulario__Group__1_in_rule__Formulario__Group__01041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__ComprobarAsercionAssignment_0_in_rule__Formulario__Group__0__Impl1068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__1__Impl_in_rule__Formulario__Group__11099 = new BitSet(new long[]{0x0000004000000800L});
        public static final BitSet FOLLOW_rule__Formulario__Group__2_in_rule__Formulario__Group__11102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__ComprobarAccionAssignment_1_in_rule__Formulario__Group__1__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__2__Impl_in_rule__Formulario__Group__21160 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Formulario__Group__3_in_rule__Formulario__Group__21163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Formulario__Group__2__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__3__Impl_in_rule__Formulario__Group__31222 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__4_in_rule__Formulario__Group__31225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__NameAssignment_3_in_rule__Formulario__Group__3__Impl1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__4__Impl_in_rule__Formulario__Group__41282 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__5_in_rule__Formulario__Group__41285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Formulario__Group__4__Impl1313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__5__Impl_in_rule__Formulario__Group__51344 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__6_in_rule__Formulario__Group__51347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Formulario__Group__5__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__6__Impl_in_rule__Formulario__Group__61406 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__7_in_rule__Formulario__Group__61409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__LayoutAssignment_6_in_rule__Formulario__Group__6__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__7__Impl_in_rule__Formulario__Group__71466 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__8_in_rule__Formulario__Group__71469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group_7__0_in_rule__Formulario__Group__7__Impl1496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__8__Impl_in_rule__Formulario__Group__81527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Formulario__Group__8__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group_7__0__Impl_in_rule__Formulario__Group_7__01604 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Formulario__Group_7__1_in_rule__Formulario__Group_7__01607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Formulario__Group_7__0__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group_7__1__Impl_in_rule__Formulario__Group_7__11666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__PruebasAssignment_7_1_in_rule__Formulario__Group_7__1__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__01727 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__01730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__11788 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__11791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Layout__Group__1__Impl1819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__21850 = new BitSet(new long[]{0x00000000000E4000L});
        public static final BitSet FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__21853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Layout__Group__2__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__31912 = new BitSet(new long[]{0x00000000000E4000L});
        public static final BitSet FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__31915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__0_in_rule__Layout__Group__3__Impl1942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__41973 = new BitSet(new long[]{0x00000000000E4000L});
        public static final BitSet FOLLOW_rule__Layout__Group__5_in_rule__Layout__Group__41976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__0_in_rule__Layout__Group__4__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__5__Impl_in_rule__Layout__Group__52034 = new BitSet(new long[]{0x00000000000E4000L});
        public static final BitSet FOLLOW_rule__Layout__Group__6_in_rule__Layout__Group__52037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__0_in_rule__Layout__Group__5__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__6__Impl_in_rule__Layout__Group__62095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Layout__Group__6__Impl2123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__0__Impl_in_rule__Layout__Group_3__02168 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__1_in_rule__Layout__Group_3__02171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Layout__Group_3__0__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__1__Impl_in_rule__Layout__Group_3__12230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__AnchuraAssignment_3_1_in_rule__Layout__Group_3__1__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__0__Impl_in_rule__Layout__Group_4__02291 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__1_in_rule__Layout__Group_4__02294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Layout__Group_4__0__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__1__Impl_in_rule__Layout__Group_4__12353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__AlturaAssignment_4_1_in_rule__Layout__Group_4__1__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__0__Impl_in_rule__Layout__Group_5__02414 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__1_in_rule__Layout__Group_5__02417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Layout__Group_5__0__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__1__Impl_in_rule__Layout__Group_5__12476 = new BitSet(new long[]{0x0000039AD8000000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__2_in_rule__Layout__Group_5__12479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Layout__Group_5__1__Impl2507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__2__Impl_in_rule__Layout__Group_5__22538 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__3_in_rule__Layout__Group_5__22541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__EntradasAssignment_5_2_in_rule__Layout__Group_5__2__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__3__Impl_in_rule__Layout__Group_5__32598 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__4_in_rule__Layout__Group_5__32601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5_3__0_in_rule__Layout__Group_5__3__Impl2628 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__4__Impl_in_rule__Layout__Group_5__42659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Layout__Group_5__4__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5_3__0__Impl_in_rule__Layout__Group_5_3__02728 = new BitSet(new long[]{0x0000039AD8000000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5_3__1_in_rule__Layout__Group_5_3__02731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Layout__Group_5_3__0__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5_3__1__Impl_in_rule__Layout__Group_5_3__12790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__EntradasAssignment_5_3_1_in_rule__Layout__Group_5_3__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__0__Impl_in_rule__PruebaInterfaz__Group__02851 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__1_in_rule__PruebaInterfaz__Group__02854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__1__Impl_in_rule__PruebaInterfaz__Group__12912 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__2_in_rule__PruebaInterfaz__Group__12915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__PruebaInterfaz__Group__1__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__2__Impl_in_rule__PruebaInterfaz__Group__22974 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__3_in_rule__PruebaInterfaz__Group__22977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__NameAssignment_2_in_rule__PruebaInterfaz__Group__2__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__3__Impl_in_rule__PruebaInterfaz__Group__33034 = new BitSet(new long[]{0x0000000002404000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__4_in_rule__PruebaInterfaz__Group__33037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__PruebaInterfaz__Group__3__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__4__Impl_in_rule__PruebaInterfaz__Group__43096 = new BitSet(new long[]{0x0000000002404000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__5_in_rule__PruebaInterfaz__Group__43099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__0_in_rule__PruebaInterfaz__Group__4__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__5__Impl_in_rule__PruebaInterfaz__Group__53157 = new BitSet(new long[]{0x0000000002404000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__6_in_rule__PruebaInterfaz__Group__53160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__0_in_rule__PruebaInterfaz__Group__5__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__6__Impl_in_rule__PruebaInterfaz__Group__63218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__PruebaInterfaz__Group__6__Impl3246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__0__Impl_in_rule__PruebaInterfaz__Group_4__03291 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__1_in_rule__PruebaInterfaz__Group_4__03294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__PruebaInterfaz__Group_4__0__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__1__Impl_in_rule__PruebaInterfaz__Group_4__13353 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__2_in_rule__PruebaInterfaz__Group_4__13356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__PruebaInterfaz__Group_4__1__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__2__Impl_in_rule__PruebaInterfaz__Group_4__23415 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__3_in_rule__PruebaInterfaz__Group_4__23418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__AccionesAssignment_4_2_in_rule__PruebaInterfaz__Group_4__2__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__3__Impl_in_rule__PruebaInterfaz__Group_4__33475 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__4_in_rule__PruebaInterfaz__Group_4__33478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4_3__0_in_rule__PruebaInterfaz__Group_4__3__Impl3505 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4__4__Impl_in_rule__PruebaInterfaz__Group_4__43536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PruebaInterfaz__Group_4__4__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4_3__0__Impl_in_rule__PruebaInterfaz__Group_4_3__03605 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4_3__1_in_rule__PruebaInterfaz__Group_4_3__03608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__PruebaInterfaz__Group_4_3__0__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_4_3__1__Impl_in_rule__PruebaInterfaz__Group_4_3__13667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__AccionesAssignment_4_3_1_in_rule__PruebaInterfaz__Group_4_3__1__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__0__Impl_in_rule__PruebaInterfaz__Group_5__03728 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__1_in_rule__PruebaInterfaz__Group_5__03731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__PruebaInterfaz__Group_5__0__Impl3759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__1__Impl_in_rule__PruebaInterfaz__Group_5__13790 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__2_in_rule__PruebaInterfaz__Group_5__13793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__PruebaInterfaz__Group_5__1__Impl3821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__2__Impl_in_rule__PruebaInterfaz__Group_5__23852 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__3_in_rule__PruebaInterfaz__Group_5__23855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__AsercionesAssignment_5_2_in_rule__PruebaInterfaz__Group_5__2__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__3__Impl_in_rule__PruebaInterfaz__Group_5__33912 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__4_in_rule__PruebaInterfaz__Group_5__33915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5_3__0_in_rule__PruebaInterfaz__Group_5__3__Impl3942 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5__4__Impl_in_rule__PruebaInterfaz__Group_5__43973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__PruebaInterfaz__Group_5__4__Impl4001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5_3__0__Impl_in_rule__PruebaInterfaz__Group_5_3__04042 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5_3__1_in_rule__PruebaInterfaz__Group_5_3__04045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__PruebaInterfaz__Group_5_3__0__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group_5_3__1__Impl_in_rule__PruebaInterfaz__Group_5_3__14104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__AsercionesAssignment_5_3_1_in_rule__PruebaInterfaz__Group_5_3__1__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04165 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__EInt__Group__0__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__0__Impl_in_rule__Input_Impl__Group__04290 = new BitSet(new long[]{0x0000018008000000L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__1_in_rule__Input_Impl__Group__04293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__1__Impl_in_rule__Input_Impl__Group__14351 = new BitSet(new long[]{0x0000018008000000L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__2_in_rule__Input_Impl__Group__14354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__VisibleAssignment_1_in_rule__Input_Impl__Group__1__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__2__Impl_in_rule__Input_Impl__Group__24412 = new BitSet(new long[]{0x0000018008000000L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__3_in_rule__Input_Impl__Group__24415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__HabilitadoAssignment_2_in_rule__Input_Impl__Group__2__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__3__Impl_in_rule__Input_Impl__Group__34473 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__4_in_rule__Input_Impl__Group__34476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Input_Impl__Group__3__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__4__Impl_in_rule__Input_Impl__Group__44535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__NameAssignment_4_in_rule__Input_Impl__Group__4__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__0__Impl_in_rule__InputTexto__Group__04602 = new BitSet(new long[]{0x0000038010000000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__1_in_rule__InputTexto__Group__04605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__1__Impl_in_rule__InputTexto__Group__14663 = new BitSet(new long[]{0x0000038010000000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__2_in_rule__InputTexto__Group__14666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__VisibleAssignment_1_in_rule__InputTexto__Group__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__2__Impl_in_rule__InputTexto__Group__24724 = new BitSet(new long[]{0x0000038010000000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__3_in_rule__InputTexto__Group__24727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__HabilitadoAssignment_2_in_rule__InputTexto__Group__2__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__3__Impl_in_rule__InputTexto__Group__34785 = new BitSet(new long[]{0x0000038010000000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__4_in_rule__InputTexto__Group__34788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__ObligatorioAssignment_3_in_rule__InputTexto__Group__3__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__4__Impl_in_rule__InputTexto__Group__44846 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__5_in_rule__InputTexto__Group__44849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__InputTexto__Group__4__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__5__Impl_in_rule__InputTexto__Group__54908 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__6_in_rule__InputTexto__Group__54911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__NameAssignment_5_in_rule__InputTexto__Group__5__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__6__Impl_in_rule__InputTexto__Group__64968 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__7_in_rule__InputTexto__Group__64971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputTexto__Group__6__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__7__Impl_in_rule__InputTexto__Group__75030 = new BitSet(new long[]{0x0000000020004000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__8_in_rule__InputTexto__Group__75033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_7__0_in_rule__InputTexto__Group__7__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__8__Impl_in_rule__InputTexto__Group__85091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputTexto__Group__8__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_7__0__Impl_in_rule__InputTexto__Group_7__05168 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_7__1_in_rule__InputTexto__Group_7__05171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__InputTexto__Group_7__0__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_7__1__Impl_in_rule__InputTexto__Group_7__15230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__ValorAssignment_7_1_in_rule__InputTexto__Group_7__1__Impl5257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__0__Impl_in_rule__InputBoton__Group__05291 = new BitSet(new long[]{0x0000018040000000L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__1_in_rule__InputBoton__Group__05294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__1__Impl_in_rule__InputBoton__Group__15352 = new BitSet(new long[]{0x0000018040000000L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__2_in_rule__InputBoton__Group__15355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__VisibleAssignment_1_in_rule__InputBoton__Group__1__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__2__Impl_in_rule__InputBoton__Group__25413 = new BitSet(new long[]{0x0000018040000000L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__3_in_rule__InputBoton__Group__25416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__HabilitadoAssignment_2_in_rule__InputBoton__Group__2__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__3__Impl_in_rule__InputBoton__Group__35474 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__4_in_rule__InputBoton__Group__35477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__InputBoton__Group__3__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__4__Impl_in_rule__InputBoton__Group__45536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__NameAssignment_4_in_rule__InputBoton__Group__4__Impl5563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__0__Impl_in_rule__InputMultiple_Impl__Group__05603 = new BitSet(new long[]{0x0000018080000000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__1_in_rule__InputMultiple_Impl__Group__05606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__1__Impl_in_rule__InputMultiple_Impl__Group__15664 = new BitSet(new long[]{0x0000018080000000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__2_in_rule__InputMultiple_Impl__Group__15667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__VisibleAssignment_1_in_rule__InputMultiple_Impl__Group__1__Impl5694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__2__Impl_in_rule__InputMultiple_Impl__Group__25725 = new BitSet(new long[]{0x0000018080000000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__3_in_rule__InputMultiple_Impl__Group__25728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__HabilitadoAssignment_2_in_rule__InputMultiple_Impl__Group__2__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__3__Impl_in_rule__InputMultiple_Impl__Group__35786 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__4_in_rule__InputMultiple_Impl__Group__35789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__InputMultiple_Impl__Group__3__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__4__Impl_in_rule__InputMultiple_Impl__Group__45848 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__5_in_rule__InputMultiple_Impl__Group__45851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__NameAssignment_4_in_rule__InputMultiple_Impl__Group__4__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__5__Impl_in_rule__InputMultiple_Impl__Group__55908 = new BitSet(new long[]{0x0000000100004000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__6_in_rule__InputMultiple_Impl__Group__55911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputMultiple_Impl__Group__5__Impl5939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__6__Impl_in_rule__InputMultiple_Impl__Group__65970 = new BitSet(new long[]{0x0000000100004000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__7_in_rule__InputMultiple_Impl__Group__65973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__0_in_rule__InputMultiple_Impl__Group__6__Impl6000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__7__Impl_in_rule__InputMultiple_Impl__Group__76031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputMultiple_Impl__Group__7__Impl6059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__0__Impl_in_rule__InputMultiple_Impl__Group_6__06106 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__1_in_rule__InputMultiple_Impl__Group_6__06109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__InputMultiple_Impl__Group_6__0__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__1__Impl_in_rule__InputMultiple_Impl__Group_6__16168 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__2_in_rule__InputMultiple_Impl__Group_6__16171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputMultiple_Impl__Group_6__1__Impl6199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__2__Impl_in_rule__InputMultiple_Impl__Group_6__26230 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__3_in_rule__InputMultiple_Impl__Group_6__26233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__ValoresAssignment_6_2_in_rule__InputMultiple_Impl__Group_6__2__Impl6260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__3__Impl_in_rule__InputMultiple_Impl__Group_6__36290 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__4_in_rule__InputMultiple_Impl__Group_6__36293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6_3__0_in_rule__InputMultiple_Impl__Group_6__3__Impl6320 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__4__Impl_in_rule__InputMultiple_Impl__Group_6__46351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputMultiple_Impl__Group_6__4__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6_3__0__Impl_in_rule__InputMultiple_Impl__Group_6_3__06420 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6_3__1_in_rule__InputMultiple_Impl__Group_6_3__06423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__InputMultiple_Impl__Group_6_3__0__Impl6451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6_3__1__Impl_in_rule__InputMultiple_Impl__Group_6_3__16482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__ValoresAssignment_6_3_1_in_rule__InputMultiple_Impl__Group_6_3__1__Impl6509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__0__Impl_in_rule__InputRadio__Group__06543 = new BitSet(new long[]{0x0000018200000000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__1_in_rule__InputRadio__Group__06546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__1__Impl_in_rule__InputRadio__Group__16604 = new BitSet(new long[]{0x0000018200000000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__2_in_rule__InputRadio__Group__16607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__VisibleAssignment_1_in_rule__InputRadio__Group__1__Impl6634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__2__Impl_in_rule__InputRadio__Group__26665 = new BitSet(new long[]{0x0000018200000000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__3_in_rule__InputRadio__Group__26668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__HabilitadoAssignment_2_in_rule__InputRadio__Group__2__Impl6695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__3__Impl_in_rule__InputRadio__Group__36726 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__4_in_rule__InputRadio__Group__36729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__InputRadio__Group__3__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__4__Impl_in_rule__InputRadio__Group__46788 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__5_in_rule__InputRadio__Group__46791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__NameAssignment_4_in_rule__InputRadio__Group__4__Impl6818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__5__Impl_in_rule__InputRadio__Group__56848 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__6_in_rule__InputRadio__Group__56851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputRadio__Group__5__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__6__Impl_in_rule__InputRadio__Group__66910 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__7_in_rule__InputRadio__Group__66913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__0_in_rule__InputRadio__Group__6__Impl6940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__7__Impl_in_rule__InputRadio__Group__76971 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__8_in_rule__InputRadio__Group__76974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__0_in_rule__InputRadio__Group__7__Impl7001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__8__Impl_in_rule__InputRadio__Group__87032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputRadio__Group__8__Impl7060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__0__Impl_in_rule__InputRadio__Group_6__07109 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__1_in_rule__InputRadio__Group_6__07112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__InputRadio__Group_6__0__Impl7140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__1__Impl_in_rule__InputRadio__Group_6__17171 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__2_in_rule__InputRadio__Group_6__17174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputRadio__Group_6__1__Impl7202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__2__Impl_in_rule__InputRadio__Group_6__27233 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__3_in_rule__InputRadio__Group_6__27236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__ValoresAssignment_6_2_in_rule__InputRadio__Group_6__2__Impl7263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__3__Impl_in_rule__InputRadio__Group_6__37293 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__4_in_rule__InputRadio__Group_6__37296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6_3__0_in_rule__InputRadio__Group_6__3__Impl7323 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__4__Impl_in_rule__InputRadio__Group_6__47354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputRadio__Group_6__4__Impl7382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6_3__0__Impl_in_rule__InputRadio__Group_6_3__07423 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6_3__1_in_rule__InputRadio__Group_6_3__07426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__InputRadio__Group_6_3__0__Impl7454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6_3__1__Impl_in_rule__InputRadio__Group_6_3__17485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__ValoresAssignment_6_3_1_in_rule__InputRadio__Group_6_3__1__Impl7512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__0__Impl_in_rule__InputRadio__Group_7__07546 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__1_in_rule__InputRadio__Group_7__07549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputRadio__Group_7__0__Impl7577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__1__Impl_in_rule__InputRadio__Group_7__17608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__SeleccionAssignment_7_1_in_rule__InputRadio__Group_7__1__Impl7635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__0__Impl_in_rule__InputCombo__Group__07669 = new BitSet(new long[]{0x0000018800000000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__1_in_rule__InputCombo__Group__07672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__1__Impl_in_rule__InputCombo__Group__17730 = new BitSet(new long[]{0x0000018800000000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__2_in_rule__InputCombo__Group__17733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__VisibleAssignment_1_in_rule__InputCombo__Group__1__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__2__Impl_in_rule__InputCombo__Group__27791 = new BitSet(new long[]{0x0000018800000000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__3_in_rule__InputCombo__Group__27794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__HabilitadoAssignment_2_in_rule__InputCombo__Group__2__Impl7821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__3__Impl_in_rule__InputCombo__Group__37852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__4_in_rule__InputCombo__Group__37855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__InputCombo__Group__3__Impl7883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__4__Impl_in_rule__InputCombo__Group__47914 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__5_in_rule__InputCombo__Group__47917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__NameAssignment_4_in_rule__InputCombo__Group__4__Impl7944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__5__Impl_in_rule__InputCombo__Group__57974 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__6_in_rule__InputCombo__Group__57977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCombo__Group__5__Impl8005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__6__Impl_in_rule__InputCombo__Group__68036 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__7_in_rule__InputCombo__Group__68039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__0_in_rule__InputCombo__Group__6__Impl8066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__7__Impl_in_rule__InputCombo__Group__78097 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__8_in_rule__InputCombo__Group__78100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__0_in_rule__InputCombo__Group__7__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__8__Impl_in_rule__InputCombo__Group__88158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputCombo__Group__8__Impl8186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__0__Impl_in_rule__InputCombo__Group_6__08235 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__1_in_rule__InputCombo__Group_6__08238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__InputCombo__Group_6__0__Impl8266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__1__Impl_in_rule__InputCombo__Group_6__18297 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__2_in_rule__InputCombo__Group_6__18300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCombo__Group_6__1__Impl8328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__2__Impl_in_rule__InputCombo__Group_6__28359 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__3_in_rule__InputCombo__Group_6__28362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__ValoresAssignment_6_2_in_rule__InputCombo__Group_6__2__Impl8389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__3__Impl_in_rule__InputCombo__Group_6__38419 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__4_in_rule__InputCombo__Group_6__38422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6_3__0_in_rule__InputCombo__Group_6__3__Impl8449 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__4__Impl_in_rule__InputCombo__Group_6__48480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputCombo__Group_6__4__Impl8508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6_3__0__Impl_in_rule__InputCombo__Group_6_3__08549 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6_3__1_in_rule__InputCombo__Group_6_3__08552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__InputCombo__Group_6_3__0__Impl8580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6_3__1__Impl_in_rule__InputCombo__Group_6_3__18611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__ValoresAssignment_6_3_1_in_rule__InputCombo__Group_6_3__1__Impl8638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__0__Impl_in_rule__InputCombo__Group_7__08672 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__1_in_rule__InputCombo__Group_7__08675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputCombo__Group_7__0__Impl8703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__1__Impl_in_rule__InputCombo__Group_7__18734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__SeleccionAssignment_7_1_in_rule__InputCombo__Group_7__1__Impl8761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__0__Impl_in_rule__InputCheck__Group__08795 = new BitSet(new long[]{0x0000039AD8000000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__1_in_rule__InputCheck__Group__08798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__1__Impl_in_rule__InputCheck__Group__18856 = new BitSet(new long[]{0x0000039AD8000000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__2_in_rule__InputCheck__Group__18859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__VisibleAssignment_1_in_rule__InputCheck__Group__1__Impl8886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__2__Impl_in_rule__InputCheck__Group__28917 = new BitSet(new long[]{0x0000039AD8000000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__3_in_rule__InputCheck__Group__28920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__HabilitadoAssignment_2_in_rule__InputCheck__Group__2__Impl8947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__3__Impl_in_rule__InputCheck__Group__38978 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__4_in_rule__InputCheck__Group__38981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__InputCheck__Group__3__Impl9009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__4__Impl_in_rule__InputCheck__Group__49040 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__5_in_rule__InputCheck__Group__49043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__NameAssignment_4_in_rule__InputCheck__Group__4__Impl9070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__5__Impl_in_rule__InputCheck__Group__59100 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__6_in_rule__InputCheck__Group__59103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCheck__Group__5__Impl9131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__6__Impl_in_rule__InputCheck__Group__69162 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__7_in_rule__InputCheck__Group__69165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__0_in_rule__InputCheck__Group__6__Impl9192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__7__Impl_in_rule__InputCheck__Group__79223 = new BitSet(new long[]{0x0000000500004000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__8_in_rule__InputCheck__Group__79226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__0_in_rule__InputCheck__Group__7__Impl9253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__8__Impl_in_rule__InputCheck__Group__89284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputCheck__Group__8__Impl9312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__0__Impl_in_rule__InputCheck__Group_6__09361 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__1_in_rule__InputCheck__Group_6__09364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__InputCheck__Group_6__0__Impl9392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__1__Impl_in_rule__InputCheck__Group_6__19423 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__2_in_rule__InputCheck__Group_6__19426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCheck__Group_6__1__Impl9454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__2__Impl_in_rule__InputCheck__Group_6__29485 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__3_in_rule__InputCheck__Group_6__29488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__ValoresAssignment_6_2_in_rule__InputCheck__Group_6__2__Impl9515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__3__Impl_in_rule__InputCheck__Group_6__39545 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__4_in_rule__InputCheck__Group_6__39548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6_3__0_in_rule__InputCheck__Group_6__3__Impl9575 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__4__Impl_in_rule__InputCheck__Group_6__49606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputCheck__Group_6__4__Impl9634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6_3__0__Impl_in_rule__InputCheck__Group_6_3__09675 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6_3__1_in_rule__InputCheck__Group_6_3__09678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__InputCheck__Group_6_3__0__Impl9706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6_3__1__Impl_in_rule__InputCheck__Group_6_3__19737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__ValoresAssignment_6_3_1_in_rule__InputCheck__Group_6_3__1__Impl9764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__0__Impl_in_rule__InputCheck__Group_7__09798 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__1_in_rule__InputCheck__Group_7__09801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputCheck__Group_7__0__Impl9829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__1__Impl_in_rule__InputCheck__Group_7__19860 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__2_in_rule__InputCheck__Group_7__19863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCheck__Group_7__1__Impl9891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__2__Impl_in_rule__InputCheck__Group_7__29922 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__3_in_rule__InputCheck__Group_7__29925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__SeleccionAssignment_7_2_in_rule__InputCheck__Group_7__2__Impl9952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__3__Impl_in_rule__InputCheck__Group_7__39982 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__4_in_rule__InputCheck__Group_7__39985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7_3__0_in_rule__InputCheck__Group_7__3__Impl10012 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__4__Impl_in_rule__InputCheck__Group_7__410043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__InputCheck__Group_7__4__Impl10071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7_3__0__Impl_in_rule__InputCheck__Group_7_3__010112 = new BitSet(new long[]{0x0000000004000040L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7_3__1_in_rule__InputCheck__Group_7_3__010115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__InputCheck__Group_7_3__0__Impl10143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7_3__1__Impl_in_rule__InputCheck__Group_7_3__110174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__SeleccionAssignment_7_3_1_in_rule__InputCheck__Group_7_3__1__Impl10201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Formulario__ComprobarAsercionAssignment_010247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Formulario__ComprobarAccionAssignment_110291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Formulario__NameAssignment_310330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Formulario__LayoutAssignment_610361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_rule__Formulario__PruebasAssignment_7_110392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Layout__AnchuraAssignment_3_110423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Layout__AlturaAssignment_4_110454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_5_210485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_5_3_110516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PruebaInterfaz__NameAssignment_210547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PruebaInterfaz__AccionesAssignment_4_210582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PruebaInterfaz__AccionesAssignment_4_3_110621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PruebaInterfaz__AsercionesAssignment_5_210660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PruebaInterfaz__AsercionesAssignment_5_3_110699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Input_Impl__VisibleAssignment_110739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Input_Impl__HabilitadoAssignment_210783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Input_Impl__NameAssignment_410822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__InputTexto__VisibleAssignment_110858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__InputTexto__HabilitadoAssignment_210902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__InputTexto__ObligatorioAssignment_310946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputTexto__NameAssignment_510985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputTexto__ValorAssignment_7_111016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__InputBoton__VisibleAssignment_111052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__InputBoton__HabilitadoAssignment_211096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputBoton__NameAssignment_411135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__InputMultiple_Impl__VisibleAssignment_111171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__InputMultiple_Impl__HabilitadoAssignment_211215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputMultiple_Impl__NameAssignment_411254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputMultiple_Impl__ValoresAssignment_6_211285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputMultiple_Impl__ValoresAssignment_6_3_111316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__InputRadio__VisibleAssignment_111352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__InputRadio__HabilitadoAssignment_211396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__NameAssignment_411435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_6_211466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_6_3_111497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputRadio__SeleccionAssignment_7_111528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__InputCombo__VisibleAssignment_111564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__InputCombo__HabilitadoAssignment_211608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__NameAssignment_411647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_211678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_3_111709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCombo__SeleccionAssignment_7_111740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__InputCheck__VisibleAssignment_111776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__InputCheck__HabilitadoAssignment_211820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__NameAssignment_411859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_6_211890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_6_3_111921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_7_211952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_7_3_111983 = new BitSet(new long[]{0x0000000000000002L});
    }


}