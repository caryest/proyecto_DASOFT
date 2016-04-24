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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Formulario'", "'{'", "'}'", "'Layout'", "'anchura'", "'altura'", "'entradas'", "','", "'PruebaInterfaz'", "'-'", "'Input'", "'InputTexto'", "'valor'", "'InputBoton'", "'InputMultiple'", "'valores'", "'InputRadio'", "'seleccion'", "'InputCombo'", "'InputCheck'", "'comprobarAsercion'", "'comprobarAccion'", "'visible'", "'habilitado'", "'obligatorio'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:426:1: rule__Input__Alternatives : ( ( ruleInput_Impl ) | ( ruleInputTexto ) | ( ruleInputBoton ) | ( ruleInputMultiple_Impl ) | ( ruleInputRadio ) | ( ruleInputCombo ) | ( ruleInputCheck ) );
    public final void rule__Input__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:430:1: ( ( ruleInput_Impl ) | ( ruleInputTexto ) | ( ruleInputBoton ) | ( ruleInputMultiple_Impl ) | ( ruleInputRadio ) | ( ruleInputCombo ) | ( ruleInputCheck ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:431:1: ( ruleInput_Impl )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:431:1: ( ruleInput_Impl )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:432:1: ruleInput_Impl
                    {
                     before(grammarAccess.getInputAccess().getInput_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_rule__Input__Alternatives852);
                    ruleInput_Impl();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInput_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:437:6: ( ruleInputTexto )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:437:6: ( ruleInputTexto )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:438:1: ruleInputTexto
                    {
                     before(grammarAccess.getInputAccess().getInputTextoParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_rule__Input__Alternatives869);
                    ruleInputTexto();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputTextoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:443:6: ( ruleInputBoton )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:443:6: ( ruleInputBoton )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:444:1: ruleInputBoton
                    {
                     before(grammarAccess.getInputAccess().getInputBotonParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_rule__Input__Alternatives886);
                    ruleInputBoton();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputBotonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:449:6: ( ruleInputMultiple_Impl )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:449:6: ( ruleInputMultiple_Impl )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:450:1: ruleInputMultiple_Impl
                    {
                     before(grammarAccess.getInputAccess().getInputMultiple_ImplParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_rule__Input__Alternatives903);
                    ruleInputMultiple_Impl();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputMultiple_ImplParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:455:6: ( ruleInputRadio )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:455:6: ( ruleInputRadio )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:456:1: ruleInputRadio
                    {
                     before(grammarAccess.getInputAccess().getInputRadioParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_rule__Input__Alternatives920);
                    ruleInputRadio();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputRadioParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:461:6: ( ruleInputCombo )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:461:6: ( ruleInputCombo )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:462:1: ruleInputCombo
                    {
                     before(grammarAccess.getInputAccess().getInputComboParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_rule__Input__Alternatives937);
                    ruleInputCombo();

                    state._fsp--;

                     after(grammarAccess.getInputAccess().getInputComboParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:467:6: ( ruleInputCheck )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:467:6: ( ruleInputCheck )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:468:1: ruleInputCheck
                    {
                     before(grammarAccess.getInputAccess().getInputCheckParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_rule__Input__Alternatives954);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:478:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:482:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:483:1: ( RULE_STRING )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:483:1: ( RULE_STRING )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:484:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives986); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:489:6: ( RULE_ID )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:489:6: ( RULE_ID )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:490:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1003); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:503:1: rule__Formulario__Group__0 : rule__Formulario__Group__0__Impl rule__Formulario__Group__1 ;
    public final void rule__Formulario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:507:1: ( rule__Formulario__Group__0__Impl rule__Formulario__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:508:2: rule__Formulario__Group__0__Impl rule__Formulario__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__0__Impl_in_rule__Formulario__Group__01034);
            rule__Formulario__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__1_in_rule__Formulario__Group__01037);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:515:1: rule__Formulario__Group__0__Impl : ( ( rule__Formulario__ComprobarAsercionAssignment_0 )? ) ;
    public final void rule__Formulario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:519:1: ( ( ( rule__Formulario__ComprobarAsercionAssignment_0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:520:1: ( ( rule__Formulario__ComprobarAsercionAssignment_0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:520:1: ( ( rule__Formulario__ComprobarAsercionAssignment_0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:521:1: ( rule__Formulario__ComprobarAsercionAssignment_0 )?
            {
             before(grammarAccess.getFormularioAccess().getComprobarAsercionAssignment_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:522:1: ( rule__Formulario__ComprobarAsercionAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:522:2: rule__Formulario__ComprobarAsercionAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__ComprobarAsercionAssignment_0_in_rule__Formulario__Group__0__Impl1064);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:532:1: rule__Formulario__Group__1 : rule__Formulario__Group__1__Impl rule__Formulario__Group__2 ;
    public final void rule__Formulario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:536:1: ( rule__Formulario__Group__1__Impl rule__Formulario__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:537:2: rule__Formulario__Group__1__Impl rule__Formulario__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__1__Impl_in_rule__Formulario__Group__11095);
            rule__Formulario__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__2_in_rule__Formulario__Group__11098);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:544:1: rule__Formulario__Group__1__Impl : ( ( rule__Formulario__ComprobarAccionAssignment_1 )? ) ;
    public final void rule__Formulario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:548:1: ( ( ( rule__Formulario__ComprobarAccionAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:549:1: ( ( rule__Formulario__ComprobarAccionAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:549:1: ( ( rule__Formulario__ComprobarAccionAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:550:1: ( rule__Formulario__ComprobarAccionAssignment_1 )?
            {
             before(grammarAccess.getFormularioAccess().getComprobarAccionAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:551:1: ( rule__Formulario__ComprobarAccionAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:551:2: rule__Formulario__ComprobarAccionAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__ComprobarAccionAssignment_1_in_rule__Formulario__Group__1__Impl1125);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:561:1: rule__Formulario__Group__2 : rule__Formulario__Group__2__Impl rule__Formulario__Group__3 ;
    public final void rule__Formulario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:565:1: ( rule__Formulario__Group__2__Impl rule__Formulario__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:566:2: rule__Formulario__Group__2__Impl rule__Formulario__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__2__Impl_in_rule__Formulario__Group__21156);
            rule__Formulario__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__3_in_rule__Formulario__Group__21159);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:573:1: rule__Formulario__Group__2__Impl : ( 'Formulario' ) ;
    public final void rule__Formulario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:577:1: ( ( 'Formulario' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:578:1: ( 'Formulario' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:578:1: ( 'Formulario' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:579:1: 'Formulario'
            {
             before(grammarAccess.getFormularioAccess().getFormularioKeyword_2()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Formulario__Group__2__Impl1187); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:592:1: rule__Formulario__Group__3 : rule__Formulario__Group__3__Impl rule__Formulario__Group__4 ;
    public final void rule__Formulario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:596:1: ( rule__Formulario__Group__3__Impl rule__Formulario__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:597:2: rule__Formulario__Group__3__Impl rule__Formulario__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__3__Impl_in_rule__Formulario__Group__31218);
            rule__Formulario__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__4_in_rule__Formulario__Group__31221);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:604:1: rule__Formulario__Group__3__Impl : ( ( rule__Formulario__NameAssignment_3 ) ) ;
    public final void rule__Formulario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:608:1: ( ( ( rule__Formulario__NameAssignment_3 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:609:1: ( ( rule__Formulario__NameAssignment_3 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:609:1: ( ( rule__Formulario__NameAssignment_3 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:610:1: ( rule__Formulario__NameAssignment_3 )
            {
             before(grammarAccess.getFormularioAccess().getNameAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:611:1: ( rule__Formulario__NameAssignment_3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:611:2: rule__Formulario__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__NameAssignment_3_in_rule__Formulario__Group__3__Impl1248);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:621:1: rule__Formulario__Group__4 : rule__Formulario__Group__4__Impl rule__Formulario__Group__5 ;
    public final void rule__Formulario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:625:1: ( rule__Formulario__Group__4__Impl rule__Formulario__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:626:2: rule__Formulario__Group__4__Impl rule__Formulario__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__4__Impl_in_rule__Formulario__Group__41278);
            rule__Formulario__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__5_in_rule__Formulario__Group__41281);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:633:1: rule__Formulario__Group__4__Impl : ( '{' ) ;
    public final void rule__Formulario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:637:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:638:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:638:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:639:1: '{'
            {
             before(grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Formulario__Group__4__Impl1309); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:652:1: rule__Formulario__Group__5 : rule__Formulario__Group__5__Impl rule__Formulario__Group__6 ;
    public final void rule__Formulario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:656:1: ( rule__Formulario__Group__5__Impl rule__Formulario__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:657:2: rule__Formulario__Group__5__Impl rule__Formulario__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__5__Impl_in_rule__Formulario__Group__51340);
            rule__Formulario__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__6_in_rule__Formulario__Group__51343);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:664:1: rule__Formulario__Group__5__Impl : ( ( rule__Formulario__LayoutAssignment_5 ) ) ;
    public final void rule__Formulario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:668:1: ( ( ( rule__Formulario__LayoutAssignment_5 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:669:1: ( ( rule__Formulario__LayoutAssignment_5 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:669:1: ( ( rule__Formulario__LayoutAssignment_5 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:670:1: ( rule__Formulario__LayoutAssignment_5 )
            {
             before(grammarAccess.getFormularioAccess().getLayoutAssignment_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:671:1: ( rule__Formulario__LayoutAssignment_5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:671:2: rule__Formulario__LayoutAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__LayoutAssignment_5_in_rule__Formulario__Group__5__Impl1370);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:681:1: rule__Formulario__Group__6 : rule__Formulario__Group__6__Impl rule__Formulario__Group__7 ;
    public final void rule__Formulario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:685:1: ( rule__Formulario__Group__6__Impl rule__Formulario__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:686:2: rule__Formulario__Group__6__Impl rule__Formulario__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__6__Impl_in_rule__Formulario__Group__61400);
            rule__Formulario__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__7_in_rule__Formulario__Group__61403);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:693:1: rule__Formulario__Group__6__Impl : ( ( rule__Formulario__PruebasAssignment_6 )? ) ;
    public final void rule__Formulario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:697:1: ( ( ( rule__Formulario__PruebasAssignment_6 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:698:1: ( ( rule__Formulario__PruebasAssignment_6 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:698:1: ( ( rule__Formulario__PruebasAssignment_6 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:699:1: ( rule__Formulario__PruebasAssignment_6 )?
            {
             before(grammarAccess.getFormularioAccess().getPruebasAssignment_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:700:1: ( rule__Formulario__PruebasAssignment_6 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:700:2: rule__Formulario__PruebasAssignment_6
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__PruebasAssignment_6_in_rule__Formulario__Group__6__Impl1430);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:710:1: rule__Formulario__Group__7 : rule__Formulario__Group__7__Impl ;
    public final void rule__Formulario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:714:1: ( rule__Formulario__Group__7__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:715:2: rule__Formulario__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__7__Impl_in_rule__Formulario__Group__71461);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:721:1: rule__Formulario__Group__7__Impl : ( '}' ) ;
    public final void rule__Formulario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:725:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:726:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:726:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:727:1: '}'
            {
             before(grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Formulario__Group__7__Impl1489); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:756:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:760:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:761:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__01536);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__01539);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:768:1: rule__Layout__Group__0__Impl : ( () ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:772:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:773:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:773:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:774:1: ()
            {
             before(grammarAccess.getLayoutAccess().getLayoutAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:775:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:777:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:787:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:791:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:792:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__11597);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__11600);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:799:1: rule__Layout__Group__1__Impl : ( 'Layout' ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:803:1: ( ( 'Layout' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:804:1: ( 'Layout' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:804:1: ( 'Layout' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:805:1: 'Layout'
            {
             before(grammarAccess.getLayoutAccess().getLayoutKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Layout__Group__1__Impl1628); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:818:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:822:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:823:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__21659);
            rule__Layout__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__21662);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:830:1: rule__Layout__Group__2__Impl : ( '{' ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:834:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:835:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:835:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:836:1: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Layout__Group__2__Impl1690); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:849:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl rule__Layout__Group__4 ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:853:1: ( rule__Layout__Group__3__Impl rule__Layout__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:854:2: rule__Layout__Group__3__Impl rule__Layout__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__31721);
            rule__Layout__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__31724);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:861:1: rule__Layout__Group__3__Impl : ( ( rule__Layout__Group_3__0 )? ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:865:1: ( ( ( rule__Layout__Group_3__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:866:1: ( ( rule__Layout__Group_3__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:866:1: ( ( rule__Layout__Group_3__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:867:1: ( rule__Layout__Group_3__0 )?
            {
             before(grammarAccess.getLayoutAccess().getGroup_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:868:1: ( rule__Layout__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:868:2: rule__Layout__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__0_in_rule__Layout__Group__3__Impl1751);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:878:1: rule__Layout__Group__4 : rule__Layout__Group__4__Impl rule__Layout__Group__5 ;
    public final void rule__Layout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:882:1: ( rule__Layout__Group__4__Impl rule__Layout__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:883:2: rule__Layout__Group__4__Impl rule__Layout__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__41782);
            rule__Layout__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__5_in_rule__Layout__Group__41785);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:890:1: rule__Layout__Group__4__Impl : ( ( rule__Layout__Group_4__0 )? ) ;
    public final void rule__Layout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:894:1: ( ( ( rule__Layout__Group_4__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:895:1: ( ( rule__Layout__Group_4__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:895:1: ( ( rule__Layout__Group_4__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:896:1: ( rule__Layout__Group_4__0 )?
            {
             before(grammarAccess.getLayoutAccess().getGroup_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:897:1: ( rule__Layout__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:897:2: rule__Layout__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__0_in_rule__Layout__Group__4__Impl1812);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:907:1: rule__Layout__Group__5 : rule__Layout__Group__5__Impl rule__Layout__Group__6 ;
    public final void rule__Layout__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:911:1: ( rule__Layout__Group__5__Impl rule__Layout__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:912:2: rule__Layout__Group__5__Impl rule__Layout__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__5__Impl_in_rule__Layout__Group__51843);
            rule__Layout__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__6_in_rule__Layout__Group__51846);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:919:1: rule__Layout__Group__5__Impl : ( ( rule__Layout__Group_5__0 )? ) ;
    public final void rule__Layout__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:923:1: ( ( ( rule__Layout__Group_5__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:924:1: ( ( rule__Layout__Group_5__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:924:1: ( ( rule__Layout__Group_5__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:925:1: ( rule__Layout__Group_5__0 )?
            {
             before(grammarAccess.getLayoutAccess().getGroup_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:926:1: ( rule__Layout__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:926:2: rule__Layout__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__0_in_rule__Layout__Group__5__Impl1873);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:936:1: rule__Layout__Group__6 : rule__Layout__Group__6__Impl ;
    public final void rule__Layout__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:940:1: ( rule__Layout__Group__6__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:941:2: rule__Layout__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group__6__Impl_in_rule__Layout__Group__61904);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:947:1: rule__Layout__Group__6__Impl : ( '}' ) ;
    public final void rule__Layout__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:951:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:952:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:952:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:953:1: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Layout__Group__6__Impl1932); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:980:1: rule__Layout__Group_3__0 : rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1 ;
    public final void rule__Layout__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:984:1: ( rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:985:2: rule__Layout__Group_3__0__Impl rule__Layout__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__0__Impl_in_rule__Layout__Group_3__01977);
            rule__Layout__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__1_in_rule__Layout__Group_3__01980);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:992:1: rule__Layout__Group_3__0__Impl : ( 'anchura' ) ;
    public final void rule__Layout__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:996:1: ( ( 'anchura' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:997:1: ( 'anchura' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:997:1: ( 'anchura' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:998:1: 'anchura'
            {
             before(grammarAccess.getLayoutAccess().getAnchuraKeyword_3_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Layout__Group_3__0__Impl2008); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1011:1: rule__Layout__Group_3__1 : rule__Layout__Group_3__1__Impl ;
    public final void rule__Layout__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1015:1: ( rule__Layout__Group_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1016:2: rule__Layout__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_3__1__Impl_in_rule__Layout__Group_3__12039);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1022:1: rule__Layout__Group_3__1__Impl : ( ( rule__Layout__AnchuraAssignment_3_1 ) ) ;
    public final void rule__Layout__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1026:1: ( ( ( rule__Layout__AnchuraAssignment_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1027:1: ( ( rule__Layout__AnchuraAssignment_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1027:1: ( ( rule__Layout__AnchuraAssignment_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1028:1: ( rule__Layout__AnchuraAssignment_3_1 )
            {
             before(grammarAccess.getLayoutAccess().getAnchuraAssignment_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1029:1: ( rule__Layout__AnchuraAssignment_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1029:2: rule__Layout__AnchuraAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__AnchuraAssignment_3_1_in_rule__Layout__Group_3__1__Impl2066);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1043:1: rule__Layout__Group_4__0 : rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1 ;
    public final void rule__Layout__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1047:1: ( rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1048:2: rule__Layout__Group_4__0__Impl rule__Layout__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__0__Impl_in_rule__Layout__Group_4__02100);
            rule__Layout__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__1_in_rule__Layout__Group_4__02103);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1055:1: rule__Layout__Group_4__0__Impl : ( 'altura' ) ;
    public final void rule__Layout__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1059:1: ( ( 'altura' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1060:1: ( 'altura' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1060:1: ( 'altura' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1061:1: 'altura'
            {
             before(grammarAccess.getLayoutAccess().getAlturaKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Layout__Group_4__0__Impl2131); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1074:1: rule__Layout__Group_4__1 : rule__Layout__Group_4__1__Impl ;
    public final void rule__Layout__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1078:1: ( rule__Layout__Group_4__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1079:2: rule__Layout__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_4__1__Impl_in_rule__Layout__Group_4__12162);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1085:1: rule__Layout__Group_4__1__Impl : ( ( rule__Layout__AlturaAssignment_4_1 ) ) ;
    public final void rule__Layout__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1089:1: ( ( ( rule__Layout__AlturaAssignment_4_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1090:1: ( ( rule__Layout__AlturaAssignment_4_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1090:1: ( ( rule__Layout__AlturaAssignment_4_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1091:1: ( rule__Layout__AlturaAssignment_4_1 )
            {
             before(grammarAccess.getLayoutAccess().getAlturaAssignment_4_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1092:1: ( rule__Layout__AlturaAssignment_4_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1092:2: rule__Layout__AlturaAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__AlturaAssignment_4_1_in_rule__Layout__Group_4__1__Impl2189);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1106:1: rule__Layout__Group_5__0 : rule__Layout__Group_5__0__Impl rule__Layout__Group_5__1 ;
    public final void rule__Layout__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1110:1: ( rule__Layout__Group_5__0__Impl rule__Layout__Group_5__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1111:2: rule__Layout__Group_5__0__Impl rule__Layout__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__0__Impl_in_rule__Layout__Group_5__02223);
            rule__Layout__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__1_in_rule__Layout__Group_5__02226);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1118:1: rule__Layout__Group_5__0__Impl : ( 'entradas' ) ;
    public final void rule__Layout__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1122:1: ( ( 'entradas' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1123:1: ( 'entradas' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1123:1: ( 'entradas' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1124:1: 'entradas'
            {
             before(grammarAccess.getLayoutAccess().getEntradasKeyword_5_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Layout__Group_5__0__Impl2254); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1137:1: rule__Layout__Group_5__1 : rule__Layout__Group_5__1__Impl rule__Layout__Group_5__2 ;
    public final void rule__Layout__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1141:1: ( rule__Layout__Group_5__1__Impl rule__Layout__Group_5__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1142:2: rule__Layout__Group_5__1__Impl rule__Layout__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__1__Impl_in_rule__Layout__Group_5__12285);
            rule__Layout__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__2_in_rule__Layout__Group_5__12288);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1149:1: rule__Layout__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Layout__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1153:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1154:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1154:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1155:1: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Layout__Group_5__1__Impl2316); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1168:1: rule__Layout__Group_5__2 : rule__Layout__Group_5__2__Impl rule__Layout__Group_5__3 ;
    public final void rule__Layout__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1172:1: ( rule__Layout__Group_5__2__Impl rule__Layout__Group_5__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1173:2: rule__Layout__Group_5__2__Impl rule__Layout__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__2__Impl_in_rule__Layout__Group_5__22347);
            rule__Layout__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__3_in_rule__Layout__Group_5__22350);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1180:1: rule__Layout__Group_5__2__Impl : ( ( rule__Layout__EntradasAssignment_5_2 ) ) ;
    public final void rule__Layout__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1184:1: ( ( ( rule__Layout__EntradasAssignment_5_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1185:1: ( ( rule__Layout__EntradasAssignment_5_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1185:1: ( ( rule__Layout__EntradasAssignment_5_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1186:1: ( rule__Layout__EntradasAssignment_5_2 )
            {
             before(grammarAccess.getLayoutAccess().getEntradasAssignment_5_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1187:1: ( rule__Layout__EntradasAssignment_5_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1187:2: rule__Layout__EntradasAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__EntradasAssignment_5_2_in_rule__Layout__Group_5__2__Impl2377);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1197:1: rule__Layout__Group_5__3 : rule__Layout__Group_5__3__Impl rule__Layout__Group_5__4 ;
    public final void rule__Layout__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1201:1: ( rule__Layout__Group_5__3__Impl rule__Layout__Group_5__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1202:2: rule__Layout__Group_5__3__Impl rule__Layout__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__3__Impl_in_rule__Layout__Group_5__32407);
            rule__Layout__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__4_in_rule__Layout__Group_5__32410);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1209:1: rule__Layout__Group_5__3__Impl : ( ( rule__Layout__Group_5_3__0 )* ) ;
    public final void rule__Layout__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1213:1: ( ( ( rule__Layout__Group_5_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1214:1: ( ( rule__Layout__Group_5_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1214:1: ( ( rule__Layout__Group_5_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1215:1: ( rule__Layout__Group_5_3__0 )*
            {
             before(grammarAccess.getLayoutAccess().getGroup_5_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1216:1: ( rule__Layout__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1216:2: rule__Layout__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5_3__0_in_rule__Layout__Group_5__3__Impl2437);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1226:1: rule__Layout__Group_5__4 : rule__Layout__Group_5__4__Impl ;
    public final void rule__Layout__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1230:1: ( rule__Layout__Group_5__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1231:2: rule__Layout__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5__4__Impl_in_rule__Layout__Group_5__42468);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1237:1: rule__Layout__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Layout__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1241:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1242:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1242:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1243:1: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Layout__Group_5__4__Impl2496); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1266:1: rule__Layout__Group_5_3__0 : rule__Layout__Group_5_3__0__Impl rule__Layout__Group_5_3__1 ;
    public final void rule__Layout__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1270:1: ( rule__Layout__Group_5_3__0__Impl rule__Layout__Group_5_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1271:2: rule__Layout__Group_5_3__0__Impl rule__Layout__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5_3__0__Impl_in_rule__Layout__Group_5_3__02537);
            rule__Layout__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5_3__1_in_rule__Layout__Group_5_3__02540);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1278:1: rule__Layout__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Layout__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1282:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1283:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1283:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1284:1: ','
            {
             before(grammarAccess.getLayoutAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Layout__Group_5_3__0__Impl2568); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1297:1: rule__Layout__Group_5_3__1 : rule__Layout__Group_5_3__1__Impl ;
    public final void rule__Layout__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1301:1: ( rule__Layout__Group_5_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1302:2: rule__Layout__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__Group_5_3__1__Impl_in_rule__Layout__Group_5_3__12599);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1308:1: rule__Layout__Group_5_3__1__Impl : ( ( rule__Layout__EntradasAssignment_5_3_1 ) ) ;
    public final void rule__Layout__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1312:1: ( ( ( rule__Layout__EntradasAssignment_5_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1313:1: ( ( rule__Layout__EntradasAssignment_5_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1313:1: ( ( rule__Layout__EntradasAssignment_5_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1314:1: ( rule__Layout__EntradasAssignment_5_3_1 )
            {
             before(grammarAccess.getLayoutAccess().getEntradasAssignment_5_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1315:1: ( rule__Layout__EntradasAssignment_5_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1315:2: rule__Layout__EntradasAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Layout__EntradasAssignment_5_3_1_in_rule__Layout__Group_5_3__1__Impl2626);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1329:1: rule__PruebaInterfaz__Group__0 : rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1 ;
    public final void rule__PruebaInterfaz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1333:1: ( rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1334:2: rule__PruebaInterfaz__Group__0__Impl rule__PruebaInterfaz__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__0__Impl_in_rule__PruebaInterfaz__Group__02660);
            rule__PruebaInterfaz__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__1_in_rule__PruebaInterfaz__Group__02663);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1341:1: rule__PruebaInterfaz__Group__0__Impl : ( () ) ;
    public final void rule__PruebaInterfaz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1345:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1346:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1346:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1347:1: ()
            {
             before(grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1348:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1350:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1360:1: rule__PruebaInterfaz__Group__1 : rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2 ;
    public final void rule__PruebaInterfaz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1364:1: ( rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1365:2: rule__PruebaInterfaz__Group__1__Impl rule__PruebaInterfaz__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__1__Impl_in_rule__PruebaInterfaz__Group__12721);
            rule__PruebaInterfaz__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__2_in_rule__PruebaInterfaz__Group__12724);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1372:1: rule__PruebaInterfaz__Group__1__Impl : ( 'PruebaInterfaz' ) ;
    public final void rule__PruebaInterfaz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1376:1: ( ( 'PruebaInterfaz' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1377:1: ( 'PruebaInterfaz' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1377:1: ( 'PruebaInterfaz' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1378:1: 'PruebaInterfaz'
            {
             before(grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__PruebaInterfaz__Group__1__Impl2752); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1391:1: rule__PruebaInterfaz__Group__2 : rule__PruebaInterfaz__Group__2__Impl ;
    public final void rule__PruebaInterfaz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1395:1: ( rule__PruebaInterfaz__Group__2__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1396:2: rule__PruebaInterfaz__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__Group__2__Impl_in_rule__PruebaInterfaz__Group__22783);
            rule__PruebaInterfaz__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1402:1: rule__PruebaInterfaz__Group__2__Impl : ( ( rule__PruebaInterfaz__NameAssignment_2 ) ) ;
    public final void rule__PruebaInterfaz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1406:1: ( ( ( rule__PruebaInterfaz__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1407:1: ( ( rule__PruebaInterfaz__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1407:1: ( ( rule__PruebaInterfaz__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1408:1: ( rule__PruebaInterfaz__NameAssignment_2 )
            {
             before(grammarAccess.getPruebaInterfazAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1409:1: ( rule__PruebaInterfaz__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1409:2: rule__PruebaInterfaz__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__PruebaInterfaz__NameAssignment_2_in_rule__PruebaInterfaz__Group__2__Impl2810);
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


    // $ANTLR start "rule__EInt__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1425:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1429:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1430:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02846);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02849);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1437:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1441:1: ( ( ( '-' )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1442:1: ( ( '-' )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1442:1: ( ( '-' )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1443:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1444:1: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1445:2: '-'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__EInt__Group__0__Impl2878); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1456:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1460:1: ( rule__EInt__Group__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1461:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12911);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1467:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1471:1: ( ( RULE_INT ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1472:1: ( RULE_INT )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1472:1: ( RULE_INT )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1473:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2938); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1488:1: rule__Input_Impl__Group__0 : rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1 ;
    public final void rule__Input_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1492:1: ( rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1493:2: rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__0__Impl_in_rule__Input_Impl__Group__02971);
            rule__Input_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__1_in_rule__Input_Impl__Group__02974);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1500:1: rule__Input_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Input_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1504:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1505:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1505:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1506:1: ()
            {
             before(grammarAccess.getInput_ImplAccess().getInputAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1507:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1509:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1519:1: rule__Input_Impl__Group__1 : rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2 ;
    public final void rule__Input_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1523:1: ( rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1524:2: rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__1__Impl_in_rule__Input_Impl__Group__13032);
            rule__Input_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__2_in_rule__Input_Impl__Group__13035);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1531:1: rule__Input_Impl__Group__1__Impl : ( ( rule__Input_Impl__VisibleAssignment_1 )? ) ;
    public final void rule__Input_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1535:1: ( ( ( rule__Input_Impl__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1536:1: ( ( rule__Input_Impl__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1536:1: ( ( rule__Input_Impl__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1537:1: ( rule__Input_Impl__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInput_ImplAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1538:1: ( rule__Input_Impl__VisibleAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1538:2: rule__Input_Impl__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__VisibleAssignment_1_in_rule__Input_Impl__Group__1__Impl3062);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1548:1: rule__Input_Impl__Group__2 : rule__Input_Impl__Group__2__Impl rule__Input_Impl__Group__3 ;
    public final void rule__Input_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1552:1: ( rule__Input_Impl__Group__2__Impl rule__Input_Impl__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1553:2: rule__Input_Impl__Group__2__Impl rule__Input_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__2__Impl_in_rule__Input_Impl__Group__23093);
            rule__Input_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__3_in_rule__Input_Impl__Group__23096);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1560:1: rule__Input_Impl__Group__2__Impl : ( ( rule__Input_Impl__HabilitadoAssignment_2 )? ) ;
    public final void rule__Input_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1564:1: ( ( ( rule__Input_Impl__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1565:1: ( ( rule__Input_Impl__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1565:1: ( ( rule__Input_Impl__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1566:1: ( rule__Input_Impl__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInput_ImplAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1567:1: ( rule__Input_Impl__HabilitadoAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1567:2: rule__Input_Impl__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__HabilitadoAssignment_2_in_rule__Input_Impl__Group__2__Impl3123);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1577:1: rule__Input_Impl__Group__3 : rule__Input_Impl__Group__3__Impl rule__Input_Impl__Group__4 ;
    public final void rule__Input_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1581:1: ( rule__Input_Impl__Group__3__Impl rule__Input_Impl__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1582:2: rule__Input_Impl__Group__3__Impl rule__Input_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__3__Impl_in_rule__Input_Impl__Group__33154);
            rule__Input_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__4_in_rule__Input_Impl__Group__33157);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1589:1: rule__Input_Impl__Group__3__Impl : ( 'Input' ) ;
    public final void rule__Input_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1593:1: ( ( 'Input' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1594:1: ( 'Input' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1594:1: ( 'Input' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1595:1: 'Input'
            {
             before(grammarAccess.getInput_ImplAccess().getInputKeyword_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Input_Impl__Group__3__Impl3185); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1608:1: rule__Input_Impl__Group__4 : rule__Input_Impl__Group__4__Impl ;
    public final void rule__Input_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1612:1: ( rule__Input_Impl__Group__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1613:2: rule__Input_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__4__Impl_in_rule__Input_Impl__Group__43216);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1619:1: rule__Input_Impl__Group__4__Impl : ( ( rule__Input_Impl__NameAssignment_4 ) ) ;
    public final void rule__Input_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1623:1: ( ( ( rule__Input_Impl__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1624:1: ( ( rule__Input_Impl__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1624:1: ( ( rule__Input_Impl__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1625:1: ( rule__Input_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getInput_ImplAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1626:1: ( rule__Input_Impl__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1626:2: rule__Input_Impl__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__NameAssignment_4_in_rule__Input_Impl__Group__4__Impl3243);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1646:1: rule__InputTexto__Group__0 : rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1 ;
    public final void rule__InputTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1650:1: ( rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1651:2: rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__0__Impl_in_rule__InputTexto__Group__03283);
            rule__InputTexto__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__1_in_rule__InputTexto__Group__03286);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1658:1: rule__InputTexto__Group__0__Impl : ( () ) ;
    public final void rule__InputTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1662:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1663:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1663:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1664:1: ()
            {
             before(grammarAccess.getInputTextoAccess().getInputTextoAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1665:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1667:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1677:1: rule__InputTexto__Group__1 : rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2 ;
    public final void rule__InputTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1681:1: ( rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1682:2: rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__1__Impl_in_rule__InputTexto__Group__13344);
            rule__InputTexto__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__2_in_rule__InputTexto__Group__13347);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1689:1: rule__InputTexto__Group__1__Impl : ( ( rule__InputTexto__VisibleAssignment_1 )? ) ;
    public final void rule__InputTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1693:1: ( ( ( rule__InputTexto__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1694:1: ( ( rule__InputTexto__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1694:1: ( ( rule__InputTexto__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1695:1: ( rule__InputTexto__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputTextoAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1696:1: ( rule__InputTexto__VisibleAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1696:2: rule__InputTexto__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__VisibleAssignment_1_in_rule__InputTexto__Group__1__Impl3374);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1706:1: rule__InputTexto__Group__2 : rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3 ;
    public final void rule__InputTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1710:1: ( rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1711:2: rule__InputTexto__Group__2__Impl rule__InputTexto__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__2__Impl_in_rule__InputTexto__Group__23405);
            rule__InputTexto__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__3_in_rule__InputTexto__Group__23408);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1718:1: rule__InputTexto__Group__2__Impl : ( ( rule__InputTexto__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1722:1: ( ( ( rule__InputTexto__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1723:1: ( ( rule__InputTexto__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1723:1: ( ( rule__InputTexto__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1724:1: ( rule__InputTexto__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputTextoAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1725:1: ( rule__InputTexto__HabilitadoAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1725:2: rule__InputTexto__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__HabilitadoAssignment_2_in_rule__InputTexto__Group__2__Impl3435);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1735:1: rule__InputTexto__Group__3 : rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4 ;
    public final void rule__InputTexto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1739:1: ( rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1740:2: rule__InputTexto__Group__3__Impl rule__InputTexto__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__3__Impl_in_rule__InputTexto__Group__33466);
            rule__InputTexto__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__4_in_rule__InputTexto__Group__33469);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1747:1: rule__InputTexto__Group__3__Impl : ( ( rule__InputTexto__ObligatorioAssignment_3 )? ) ;
    public final void rule__InputTexto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1751:1: ( ( ( rule__InputTexto__ObligatorioAssignment_3 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1752:1: ( ( rule__InputTexto__ObligatorioAssignment_3 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1752:1: ( ( rule__InputTexto__ObligatorioAssignment_3 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1753:1: ( rule__InputTexto__ObligatorioAssignment_3 )?
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioAssignment_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1754:1: ( rule__InputTexto__ObligatorioAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1754:2: rule__InputTexto__ObligatorioAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__ObligatorioAssignment_3_in_rule__InputTexto__Group__3__Impl3496);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1764:1: rule__InputTexto__Group__4 : rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5 ;
    public final void rule__InputTexto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1768:1: ( rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1769:2: rule__InputTexto__Group__4__Impl rule__InputTexto__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__4__Impl_in_rule__InputTexto__Group__43527);
            rule__InputTexto__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__5_in_rule__InputTexto__Group__43530);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1776:1: rule__InputTexto__Group__4__Impl : ( 'InputTexto' ) ;
    public final void rule__InputTexto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1780:1: ( ( 'InputTexto' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1781:1: ( 'InputTexto' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1781:1: ( 'InputTexto' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1782:1: 'InputTexto'
            {
             before(grammarAccess.getInputTextoAccess().getInputTextoKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__InputTexto__Group__4__Impl3558); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1795:1: rule__InputTexto__Group__5 : rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6 ;
    public final void rule__InputTexto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1799:1: ( rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1800:2: rule__InputTexto__Group__5__Impl rule__InputTexto__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__5__Impl_in_rule__InputTexto__Group__53589);
            rule__InputTexto__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__6_in_rule__InputTexto__Group__53592);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1807:1: rule__InputTexto__Group__5__Impl : ( ( rule__InputTexto__NameAssignment_5 ) ) ;
    public final void rule__InputTexto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1811:1: ( ( ( rule__InputTexto__NameAssignment_5 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1812:1: ( ( rule__InputTexto__NameAssignment_5 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1812:1: ( ( rule__InputTexto__NameAssignment_5 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1813:1: ( rule__InputTexto__NameAssignment_5 )
            {
             before(grammarAccess.getInputTextoAccess().getNameAssignment_5()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1814:1: ( rule__InputTexto__NameAssignment_5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1814:2: rule__InputTexto__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__NameAssignment_5_in_rule__InputTexto__Group__5__Impl3619);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1824:1: rule__InputTexto__Group__6 : rule__InputTexto__Group__6__Impl rule__InputTexto__Group__7 ;
    public final void rule__InputTexto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1828:1: ( rule__InputTexto__Group__6__Impl rule__InputTexto__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1829:2: rule__InputTexto__Group__6__Impl rule__InputTexto__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__6__Impl_in_rule__InputTexto__Group__63649);
            rule__InputTexto__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__7_in_rule__InputTexto__Group__63652);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1836:1: rule__InputTexto__Group__6__Impl : ( '{' ) ;
    public final void rule__InputTexto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1840:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1841:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1841:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1842:1: '{'
            {
             before(grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputTexto__Group__6__Impl3680); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1855:1: rule__InputTexto__Group__7 : rule__InputTexto__Group__7__Impl rule__InputTexto__Group__8 ;
    public final void rule__InputTexto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1859:1: ( rule__InputTexto__Group__7__Impl rule__InputTexto__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1860:2: rule__InputTexto__Group__7__Impl rule__InputTexto__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__7__Impl_in_rule__InputTexto__Group__73711);
            rule__InputTexto__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__8_in_rule__InputTexto__Group__73714);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1867:1: rule__InputTexto__Group__7__Impl : ( ( rule__InputTexto__Group_7__0 )? ) ;
    public final void rule__InputTexto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1871:1: ( ( ( rule__InputTexto__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1872:1: ( ( rule__InputTexto__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1872:1: ( ( rule__InputTexto__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1873:1: ( rule__InputTexto__Group_7__0 )?
            {
             before(grammarAccess.getInputTextoAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1874:1: ( rule__InputTexto__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1874:2: rule__InputTexto__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_7__0_in_rule__InputTexto__Group__7__Impl3741);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1884:1: rule__InputTexto__Group__8 : rule__InputTexto__Group__8__Impl ;
    public final void rule__InputTexto__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1888:1: ( rule__InputTexto__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1889:2: rule__InputTexto__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__8__Impl_in_rule__InputTexto__Group__83772);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1895:1: rule__InputTexto__Group__8__Impl : ( '}' ) ;
    public final void rule__InputTexto__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1899:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1900:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1900:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1901:1: '}'
            {
             before(grammarAccess.getInputTextoAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputTexto__Group__8__Impl3800); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1932:1: rule__InputTexto__Group_7__0 : rule__InputTexto__Group_7__0__Impl rule__InputTexto__Group_7__1 ;
    public final void rule__InputTexto__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1936:1: ( rule__InputTexto__Group_7__0__Impl rule__InputTexto__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1937:2: rule__InputTexto__Group_7__0__Impl rule__InputTexto__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_7__0__Impl_in_rule__InputTexto__Group_7__03849);
            rule__InputTexto__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_7__1_in_rule__InputTexto__Group_7__03852);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1944:1: rule__InputTexto__Group_7__0__Impl : ( 'valor' ) ;
    public final void rule__InputTexto__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1948:1: ( ( 'valor' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1949:1: ( 'valor' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1949:1: ( 'valor' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1950:1: 'valor'
            {
             before(grammarAccess.getInputTextoAccess().getValorKeyword_7_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__InputTexto__Group_7__0__Impl3880); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1963:1: rule__InputTexto__Group_7__1 : rule__InputTexto__Group_7__1__Impl ;
    public final void rule__InputTexto__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1967:1: ( rule__InputTexto__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1968:2: rule__InputTexto__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group_7__1__Impl_in_rule__InputTexto__Group_7__13911);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1974:1: rule__InputTexto__Group_7__1__Impl : ( ( rule__InputTexto__ValorAssignment_7_1 ) ) ;
    public final void rule__InputTexto__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1978:1: ( ( ( rule__InputTexto__ValorAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1979:1: ( ( rule__InputTexto__ValorAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1979:1: ( ( rule__InputTexto__ValorAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1980:1: ( rule__InputTexto__ValorAssignment_7_1 )
            {
             before(grammarAccess.getInputTextoAccess().getValorAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1981:1: ( rule__InputTexto__ValorAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1981:2: rule__InputTexto__ValorAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__ValorAssignment_7_1_in_rule__InputTexto__Group_7__1__Impl3938);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1995:1: rule__InputBoton__Group__0 : rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1 ;
    public final void rule__InputBoton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1999:1: ( rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2000:2: rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__0__Impl_in_rule__InputBoton__Group__03972);
            rule__InputBoton__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__1_in_rule__InputBoton__Group__03975);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2007:1: rule__InputBoton__Group__0__Impl : ( () ) ;
    public final void rule__InputBoton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2011:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2012:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2012:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2013:1: ()
            {
             before(grammarAccess.getInputBotonAccess().getInputBotonAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2014:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2016:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2026:1: rule__InputBoton__Group__1 : rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2 ;
    public final void rule__InputBoton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2030:1: ( rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2031:2: rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__1__Impl_in_rule__InputBoton__Group__14033);
            rule__InputBoton__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__2_in_rule__InputBoton__Group__14036);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2038:1: rule__InputBoton__Group__1__Impl : ( ( rule__InputBoton__VisibleAssignment_1 )? ) ;
    public final void rule__InputBoton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2042:1: ( ( ( rule__InputBoton__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2043:1: ( ( rule__InputBoton__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2043:1: ( ( rule__InputBoton__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2044:1: ( rule__InputBoton__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputBotonAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2045:1: ( rule__InputBoton__VisibleAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2045:2: rule__InputBoton__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputBoton__VisibleAssignment_1_in_rule__InputBoton__Group__1__Impl4063);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2055:1: rule__InputBoton__Group__2 : rule__InputBoton__Group__2__Impl rule__InputBoton__Group__3 ;
    public final void rule__InputBoton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2059:1: ( rule__InputBoton__Group__2__Impl rule__InputBoton__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2060:2: rule__InputBoton__Group__2__Impl rule__InputBoton__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__2__Impl_in_rule__InputBoton__Group__24094);
            rule__InputBoton__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__3_in_rule__InputBoton__Group__24097);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2067:1: rule__InputBoton__Group__2__Impl : ( ( rule__InputBoton__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputBoton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2071:1: ( ( ( rule__InputBoton__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2072:1: ( ( rule__InputBoton__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2072:1: ( ( rule__InputBoton__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2073:1: ( rule__InputBoton__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputBotonAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2074:1: ( rule__InputBoton__HabilitadoAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2074:2: rule__InputBoton__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputBoton__HabilitadoAssignment_2_in_rule__InputBoton__Group__2__Impl4124);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2084:1: rule__InputBoton__Group__3 : rule__InputBoton__Group__3__Impl rule__InputBoton__Group__4 ;
    public final void rule__InputBoton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2088:1: ( rule__InputBoton__Group__3__Impl rule__InputBoton__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2089:2: rule__InputBoton__Group__3__Impl rule__InputBoton__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__3__Impl_in_rule__InputBoton__Group__34155);
            rule__InputBoton__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__4_in_rule__InputBoton__Group__34158);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2096:1: rule__InputBoton__Group__3__Impl : ( 'InputBoton' ) ;
    public final void rule__InputBoton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2100:1: ( ( 'InputBoton' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2101:1: ( 'InputBoton' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2101:1: ( 'InputBoton' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2102:1: 'InputBoton'
            {
             before(grammarAccess.getInputBotonAccess().getInputBotonKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__InputBoton__Group__3__Impl4186); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2115:1: rule__InputBoton__Group__4 : rule__InputBoton__Group__4__Impl ;
    public final void rule__InputBoton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2119:1: ( rule__InputBoton__Group__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2120:2: rule__InputBoton__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__4__Impl_in_rule__InputBoton__Group__44217);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2126:1: rule__InputBoton__Group__4__Impl : ( ( rule__InputBoton__NameAssignment_4 ) ) ;
    public final void rule__InputBoton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2130:1: ( ( ( rule__InputBoton__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2131:1: ( ( rule__InputBoton__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2131:1: ( ( rule__InputBoton__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2132:1: ( rule__InputBoton__NameAssignment_4 )
            {
             before(grammarAccess.getInputBotonAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2133:1: ( rule__InputBoton__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2133:2: rule__InputBoton__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__NameAssignment_4_in_rule__InputBoton__Group__4__Impl4244);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2153:1: rule__InputMultiple_Impl__Group__0 : rule__InputMultiple_Impl__Group__0__Impl rule__InputMultiple_Impl__Group__1 ;
    public final void rule__InputMultiple_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2157:1: ( rule__InputMultiple_Impl__Group__0__Impl rule__InputMultiple_Impl__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2158:2: rule__InputMultiple_Impl__Group__0__Impl rule__InputMultiple_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__0__Impl_in_rule__InputMultiple_Impl__Group__04284);
            rule__InputMultiple_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__1_in_rule__InputMultiple_Impl__Group__04287);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2165:1: rule__InputMultiple_Impl__Group__0__Impl : ( () ) ;
    public final void rule__InputMultiple_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2169:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2170:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2170:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2171:1: ()
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getInputMultipleAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2172:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2174:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2184:1: rule__InputMultiple_Impl__Group__1 : rule__InputMultiple_Impl__Group__1__Impl rule__InputMultiple_Impl__Group__2 ;
    public final void rule__InputMultiple_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2188:1: ( rule__InputMultiple_Impl__Group__1__Impl rule__InputMultiple_Impl__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2189:2: rule__InputMultiple_Impl__Group__1__Impl rule__InputMultiple_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__1__Impl_in_rule__InputMultiple_Impl__Group__14345);
            rule__InputMultiple_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__2_in_rule__InputMultiple_Impl__Group__14348);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2196:1: rule__InputMultiple_Impl__Group__1__Impl : ( ( rule__InputMultiple_Impl__VisibleAssignment_1 )? ) ;
    public final void rule__InputMultiple_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2200:1: ( ( ( rule__InputMultiple_Impl__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2201:1: ( ( rule__InputMultiple_Impl__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2201:1: ( ( rule__InputMultiple_Impl__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2202:1: ( rule__InputMultiple_Impl__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2203:1: ( rule__InputMultiple_Impl__VisibleAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2203:2: rule__InputMultiple_Impl__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__VisibleAssignment_1_in_rule__InputMultiple_Impl__Group__1__Impl4375);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2213:1: rule__InputMultiple_Impl__Group__2 : rule__InputMultiple_Impl__Group__2__Impl rule__InputMultiple_Impl__Group__3 ;
    public final void rule__InputMultiple_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2217:1: ( rule__InputMultiple_Impl__Group__2__Impl rule__InputMultiple_Impl__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2218:2: rule__InputMultiple_Impl__Group__2__Impl rule__InputMultiple_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__2__Impl_in_rule__InputMultiple_Impl__Group__24406);
            rule__InputMultiple_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__3_in_rule__InputMultiple_Impl__Group__24409);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2225:1: rule__InputMultiple_Impl__Group__2__Impl : ( ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputMultiple_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2229:1: ( ( ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2230:1: ( ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2230:1: ( ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2231:1: ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2232:1: ( rule__InputMultiple_Impl__HabilitadoAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2232:2: rule__InputMultiple_Impl__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__HabilitadoAssignment_2_in_rule__InputMultiple_Impl__Group__2__Impl4436);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2242:1: rule__InputMultiple_Impl__Group__3 : rule__InputMultiple_Impl__Group__3__Impl rule__InputMultiple_Impl__Group__4 ;
    public final void rule__InputMultiple_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2246:1: ( rule__InputMultiple_Impl__Group__3__Impl rule__InputMultiple_Impl__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2247:2: rule__InputMultiple_Impl__Group__3__Impl rule__InputMultiple_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__3__Impl_in_rule__InputMultiple_Impl__Group__34467);
            rule__InputMultiple_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__4_in_rule__InputMultiple_Impl__Group__34470);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2254:1: rule__InputMultiple_Impl__Group__3__Impl : ( 'InputMultiple' ) ;
    public final void rule__InputMultiple_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2258:1: ( ( 'InputMultiple' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2259:1: ( 'InputMultiple' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2259:1: ( 'InputMultiple' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2260:1: 'InputMultiple'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getInputMultipleKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__InputMultiple_Impl__Group__3__Impl4498); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2273:1: rule__InputMultiple_Impl__Group__4 : rule__InputMultiple_Impl__Group__4__Impl rule__InputMultiple_Impl__Group__5 ;
    public final void rule__InputMultiple_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2277:1: ( rule__InputMultiple_Impl__Group__4__Impl rule__InputMultiple_Impl__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2278:2: rule__InputMultiple_Impl__Group__4__Impl rule__InputMultiple_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__4__Impl_in_rule__InputMultiple_Impl__Group__44529);
            rule__InputMultiple_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__5_in_rule__InputMultiple_Impl__Group__44532);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2285:1: rule__InputMultiple_Impl__Group__4__Impl : ( ( rule__InputMultiple_Impl__NameAssignment_4 ) ) ;
    public final void rule__InputMultiple_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2289:1: ( ( ( rule__InputMultiple_Impl__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2290:1: ( ( rule__InputMultiple_Impl__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2290:1: ( ( rule__InputMultiple_Impl__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2291:1: ( rule__InputMultiple_Impl__NameAssignment_4 )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2292:1: ( rule__InputMultiple_Impl__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2292:2: rule__InputMultiple_Impl__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__NameAssignment_4_in_rule__InputMultiple_Impl__Group__4__Impl4559);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2302:1: rule__InputMultiple_Impl__Group__5 : rule__InputMultiple_Impl__Group__5__Impl rule__InputMultiple_Impl__Group__6 ;
    public final void rule__InputMultiple_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2306:1: ( rule__InputMultiple_Impl__Group__5__Impl rule__InputMultiple_Impl__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2307:2: rule__InputMultiple_Impl__Group__5__Impl rule__InputMultiple_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__5__Impl_in_rule__InputMultiple_Impl__Group__54589);
            rule__InputMultiple_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__6_in_rule__InputMultiple_Impl__Group__54592);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2314:1: rule__InputMultiple_Impl__Group__5__Impl : ( '{' ) ;
    public final void rule__InputMultiple_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2318:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2319:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2319:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2320:1: '{'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputMultiple_Impl__Group__5__Impl4620); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2333:1: rule__InputMultiple_Impl__Group__6 : rule__InputMultiple_Impl__Group__6__Impl rule__InputMultiple_Impl__Group__7 ;
    public final void rule__InputMultiple_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2337:1: ( rule__InputMultiple_Impl__Group__6__Impl rule__InputMultiple_Impl__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2338:2: rule__InputMultiple_Impl__Group__6__Impl rule__InputMultiple_Impl__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__6__Impl_in_rule__InputMultiple_Impl__Group__64651);
            rule__InputMultiple_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__7_in_rule__InputMultiple_Impl__Group__64654);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2345:1: rule__InputMultiple_Impl__Group__6__Impl : ( ( rule__InputMultiple_Impl__Group_6__0 )? ) ;
    public final void rule__InputMultiple_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2349:1: ( ( ( rule__InputMultiple_Impl__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2350:1: ( ( rule__InputMultiple_Impl__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2350:1: ( ( rule__InputMultiple_Impl__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2351:1: ( rule__InputMultiple_Impl__Group_6__0 )?
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2352:1: ( rule__InputMultiple_Impl__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2352:2: rule__InputMultiple_Impl__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__0_in_rule__InputMultiple_Impl__Group__6__Impl4681);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2362:1: rule__InputMultiple_Impl__Group__7 : rule__InputMultiple_Impl__Group__7__Impl ;
    public final void rule__InputMultiple_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2366:1: ( rule__InputMultiple_Impl__Group__7__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2367:2: rule__InputMultiple_Impl__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group__7__Impl_in_rule__InputMultiple_Impl__Group__74712);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2373:1: rule__InputMultiple_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__InputMultiple_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2377:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2378:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2378:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2379:1: '}'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputMultiple_Impl__Group__7__Impl4740); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2408:1: rule__InputMultiple_Impl__Group_6__0 : rule__InputMultiple_Impl__Group_6__0__Impl rule__InputMultiple_Impl__Group_6__1 ;
    public final void rule__InputMultiple_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2412:1: ( rule__InputMultiple_Impl__Group_6__0__Impl rule__InputMultiple_Impl__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2413:2: rule__InputMultiple_Impl__Group_6__0__Impl rule__InputMultiple_Impl__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__0__Impl_in_rule__InputMultiple_Impl__Group_6__04787);
            rule__InputMultiple_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__1_in_rule__InputMultiple_Impl__Group_6__04790);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2420:1: rule__InputMultiple_Impl__Group_6__0__Impl : ( 'valores' ) ;
    public final void rule__InputMultiple_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2424:1: ( ( 'valores' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2425:1: ( 'valores' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2425:1: ( 'valores' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2426:1: 'valores'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getValoresKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__InputMultiple_Impl__Group_6__0__Impl4818); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2439:1: rule__InputMultiple_Impl__Group_6__1 : rule__InputMultiple_Impl__Group_6__1__Impl ;
    public final void rule__InputMultiple_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2443:1: ( rule__InputMultiple_Impl__Group_6__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2444:2: rule__InputMultiple_Impl__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__Group_6__1__Impl_in_rule__InputMultiple_Impl__Group_6__14849);
            rule__InputMultiple_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2450:1: rule__InputMultiple_Impl__Group_6__1__Impl : ( ( rule__InputMultiple_Impl__ValoresAssignment_6_1 ) ) ;
    public final void rule__InputMultiple_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2454:1: ( ( ( rule__InputMultiple_Impl__ValoresAssignment_6_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2455:1: ( ( rule__InputMultiple_Impl__ValoresAssignment_6_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2455:1: ( ( rule__InputMultiple_Impl__ValoresAssignment_6_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2456:1: ( rule__InputMultiple_Impl__ValoresAssignment_6_1 )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getValoresAssignment_6_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2457:1: ( rule__InputMultiple_Impl__ValoresAssignment_6_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2457:2: rule__InputMultiple_Impl__ValoresAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputMultiple_Impl__ValoresAssignment_6_1_in_rule__InputMultiple_Impl__Group_6__1__Impl4876);
            rule__InputMultiple_Impl__ValoresAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInputMultiple_ImplAccess().getValoresAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputRadio__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2471:1: rule__InputRadio__Group__0 : rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1 ;
    public final void rule__InputRadio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2475:1: ( rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2476:2: rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__0__Impl_in_rule__InputRadio__Group__04910);
            rule__InputRadio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__1_in_rule__InputRadio__Group__04913);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2483:1: rule__InputRadio__Group__0__Impl : ( () ) ;
    public final void rule__InputRadio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2487:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2488:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2488:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2489:1: ()
            {
             before(grammarAccess.getInputRadioAccess().getInputRadioAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2490:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2492:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2502:1: rule__InputRadio__Group__1 : rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2 ;
    public final void rule__InputRadio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2506:1: ( rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2507:2: rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__1__Impl_in_rule__InputRadio__Group__14971);
            rule__InputRadio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__2_in_rule__InputRadio__Group__14974);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2514:1: rule__InputRadio__Group__1__Impl : ( ( rule__InputRadio__VisibleAssignment_1 )? ) ;
    public final void rule__InputRadio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2518:1: ( ( ( rule__InputRadio__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2519:1: ( ( rule__InputRadio__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2519:1: ( ( rule__InputRadio__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2520:1: ( rule__InputRadio__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputRadioAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2521:1: ( rule__InputRadio__VisibleAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2521:2: rule__InputRadio__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__VisibleAssignment_1_in_rule__InputRadio__Group__1__Impl5001);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2531:1: rule__InputRadio__Group__2 : rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3 ;
    public final void rule__InputRadio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2535:1: ( rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2536:2: rule__InputRadio__Group__2__Impl rule__InputRadio__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__2__Impl_in_rule__InputRadio__Group__25032);
            rule__InputRadio__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__3_in_rule__InputRadio__Group__25035);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2543:1: rule__InputRadio__Group__2__Impl : ( ( rule__InputRadio__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputRadio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2547:1: ( ( ( rule__InputRadio__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2548:1: ( ( rule__InputRadio__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2548:1: ( ( rule__InputRadio__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2549:1: ( rule__InputRadio__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputRadioAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2550:1: ( rule__InputRadio__HabilitadoAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2550:2: rule__InputRadio__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__HabilitadoAssignment_2_in_rule__InputRadio__Group__2__Impl5062);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2560:1: rule__InputRadio__Group__3 : rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4 ;
    public final void rule__InputRadio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2564:1: ( rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2565:2: rule__InputRadio__Group__3__Impl rule__InputRadio__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__3__Impl_in_rule__InputRadio__Group__35093);
            rule__InputRadio__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__4_in_rule__InputRadio__Group__35096);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2572:1: rule__InputRadio__Group__3__Impl : ( 'InputRadio' ) ;
    public final void rule__InputRadio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2576:1: ( ( 'InputRadio' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2577:1: ( 'InputRadio' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2577:1: ( 'InputRadio' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2578:1: 'InputRadio'
            {
             before(grammarAccess.getInputRadioAccess().getInputRadioKeyword_3()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__InputRadio__Group__3__Impl5124); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2591:1: rule__InputRadio__Group__4 : rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5 ;
    public final void rule__InputRadio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2595:1: ( rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2596:2: rule__InputRadio__Group__4__Impl rule__InputRadio__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__4__Impl_in_rule__InputRadio__Group__45155);
            rule__InputRadio__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__5_in_rule__InputRadio__Group__45158);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2603:1: rule__InputRadio__Group__4__Impl : ( ( rule__InputRadio__NameAssignment_4 ) ) ;
    public final void rule__InputRadio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2607:1: ( ( ( rule__InputRadio__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2608:1: ( ( rule__InputRadio__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2608:1: ( ( rule__InputRadio__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2609:1: ( rule__InputRadio__NameAssignment_4 )
            {
             before(grammarAccess.getInputRadioAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2610:1: ( rule__InputRadio__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2610:2: rule__InputRadio__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__NameAssignment_4_in_rule__InputRadio__Group__4__Impl5185);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2620:1: rule__InputRadio__Group__5 : rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6 ;
    public final void rule__InputRadio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2624:1: ( rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2625:2: rule__InputRadio__Group__5__Impl rule__InputRadio__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__5__Impl_in_rule__InputRadio__Group__55215);
            rule__InputRadio__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__6_in_rule__InputRadio__Group__55218);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2632:1: rule__InputRadio__Group__5__Impl : ( '{' ) ;
    public final void rule__InputRadio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2636:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2637:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2637:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2638:1: '{'
            {
             before(grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputRadio__Group__5__Impl5246); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2651:1: rule__InputRadio__Group__6 : rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7 ;
    public final void rule__InputRadio__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2655:1: ( rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2656:2: rule__InputRadio__Group__6__Impl rule__InputRadio__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__6__Impl_in_rule__InputRadio__Group__65277);
            rule__InputRadio__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__7_in_rule__InputRadio__Group__65280);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2663:1: rule__InputRadio__Group__6__Impl : ( ( rule__InputRadio__Group_6__0 )? ) ;
    public final void rule__InputRadio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2667:1: ( ( ( rule__InputRadio__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2668:1: ( ( rule__InputRadio__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2668:1: ( ( rule__InputRadio__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2669:1: ( rule__InputRadio__Group_6__0 )?
            {
             before(grammarAccess.getInputRadioAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2670:1: ( rule__InputRadio__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2670:2: rule__InputRadio__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__0_in_rule__InputRadio__Group__6__Impl5307);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2680:1: rule__InputRadio__Group__7 : rule__InputRadio__Group__7__Impl rule__InputRadio__Group__8 ;
    public final void rule__InputRadio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2684:1: ( rule__InputRadio__Group__7__Impl rule__InputRadio__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2685:2: rule__InputRadio__Group__7__Impl rule__InputRadio__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__7__Impl_in_rule__InputRadio__Group__75338);
            rule__InputRadio__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__8_in_rule__InputRadio__Group__75341);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2692:1: rule__InputRadio__Group__7__Impl : ( ( rule__InputRadio__Group_7__0 )? ) ;
    public final void rule__InputRadio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2696:1: ( ( ( rule__InputRadio__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2697:1: ( ( rule__InputRadio__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2697:1: ( ( rule__InputRadio__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2698:1: ( rule__InputRadio__Group_7__0 )?
            {
             before(grammarAccess.getInputRadioAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2699:1: ( rule__InputRadio__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2699:2: rule__InputRadio__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__0_in_rule__InputRadio__Group__7__Impl5368);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2709:1: rule__InputRadio__Group__8 : rule__InputRadio__Group__8__Impl ;
    public final void rule__InputRadio__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2713:1: ( rule__InputRadio__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2714:2: rule__InputRadio__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__8__Impl_in_rule__InputRadio__Group__85399);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2720:1: rule__InputRadio__Group__8__Impl : ( '}' ) ;
    public final void rule__InputRadio__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2724:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2725:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2725:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2726:1: '}'
            {
             before(grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputRadio__Group__8__Impl5427); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2757:1: rule__InputRadio__Group_6__0 : rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1 ;
    public final void rule__InputRadio__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2761:1: ( rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2762:2: rule__InputRadio__Group_6__0__Impl rule__InputRadio__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__0__Impl_in_rule__InputRadio__Group_6__05476);
            rule__InputRadio__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__1_in_rule__InputRadio__Group_6__05479);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2769:1: rule__InputRadio__Group_6__0__Impl : ( 'valores' ) ;
    public final void rule__InputRadio__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2773:1: ( ( 'valores' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2774:1: ( 'valores' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2774:1: ( 'valores' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2775:1: 'valores'
            {
             before(grammarAccess.getInputRadioAccess().getValoresKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__InputRadio__Group_6__0__Impl5507); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2788:1: rule__InputRadio__Group_6__1 : rule__InputRadio__Group_6__1__Impl ;
    public final void rule__InputRadio__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2792:1: ( rule__InputRadio__Group_6__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2793:2: rule__InputRadio__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_6__1__Impl_in_rule__InputRadio__Group_6__15538);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2799:1: rule__InputRadio__Group_6__1__Impl : ( ( rule__InputRadio__ValoresAssignment_6_1 ) ) ;
    public final void rule__InputRadio__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2803:1: ( ( ( rule__InputRadio__ValoresAssignment_6_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2804:1: ( ( rule__InputRadio__ValoresAssignment_6_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2804:1: ( ( rule__InputRadio__ValoresAssignment_6_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2805:1: ( rule__InputRadio__ValoresAssignment_6_1 )
            {
             before(grammarAccess.getInputRadioAccess().getValoresAssignment_6_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2806:1: ( rule__InputRadio__ValoresAssignment_6_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2806:2: rule__InputRadio__ValoresAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__ValoresAssignment_6_1_in_rule__InputRadio__Group_6__1__Impl5565);
            rule__InputRadio__ValoresAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getValoresAssignment_6_1()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2820:1: rule__InputRadio__Group_7__0 : rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1 ;
    public final void rule__InputRadio__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2824:1: ( rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2825:2: rule__InputRadio__Group_7__0__Impl rule__InputRadio__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__0__Impl_in_rule__InputRadio__Group_7__05599);
            rule__InputRadio__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__1_in_rule__InputRadio__Group_7__05602);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2832:1: rule__InputRadio__Group_7__0__Impl : ( 'seleccion' ) ;
    public final void rule__InputRadio__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2836:1: ( ( 'seleccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2837:1: ( 'seleccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2837:1: ( 'seleccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2838:1: 'seleccion'
            {
             before(grammarAccess.getInputRadioAccess().getSeleccionKeyword_7_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__InputRadio__Group_7__0__Impl5630); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2851:1: rule__InputRadio__Group_7__1 : rule__InputRadio__Group_7__1__Impl ;
    public final void rule__InputRadio__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2855:1: ( rule__InputRadio__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2856:2: rule__InputRadio__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group_7__1__Impl_in_rule__InputRadio__Group_7__15661);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2862:1: rule__InputRadio__Group_7__1__Impl : ( ( rule__InputRadio__SeleccionAssignment_7_1 ) ) ;
    public final void rule__InputRadio__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2866:1: ( ( ( rule__InputRadio__SeleccionAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2867:1: ( ( rule__InputRadio__SeleccionAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2867:1: ( ( rule__InputRadio__SeleccionAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2868:1: ( rule__InputRadio__SeleccionAssignment_7_1 )
            {
             before(grammarAccess.getInputRadioAccess().getSeleccionAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2869:1: ( rule__InputRadio__SeleccionAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2869:2: rule__InputRadio__SeleccionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__SeleccionAssignment_7_1_in_rule__InputRadio__Group_7__1__Impl5688);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2883:1: rule__InputCombo__Group__0 : rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1 ;
    public final void rule__InputCombo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2887:1: ( rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2888:2: rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__0__Impl_in_rule__InputCombo__Group__05722);
            rule__InputCombo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__1_in_rule__InputCombo__Group__05725);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2895:1: rule__InputCombo__Group__0__Impl : ( () ) ;
    public final void rule__InputCombo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2899:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2900:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2900:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2901:1: ()
            {
             before(grammarAccess.getInputComboAccess().getInputComboAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2902:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2904:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2914:1: rule__InputCombo__Group__1 : rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2 ;
    public final void rule__InputCombo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2918:1: ( rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2919:2: rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__1__Impl_in_rule__InputCombo__Group__15783);
            rule__InputCombo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__2_in_rule__InputCombo__Group__15786);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2926:1: rule__InputCombo__Group__1__Impl : ( ( rule__InputCombo__VisibleAssignment_1 )? ) ;
    public final void rule__InputCombo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2930:1: ( ( ( rule__InputCombo__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2931:1: ( ( rule__InputCombo__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2931:1: ( ( rule__InputCombo__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2932:1: ( rule__InputCombo__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputComboAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2933:1: ( rule__InputCombo__VisibleAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2933:2: rule__InputCombo__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__VisibleAssignment_1_in_rule__InputCombo__Group__1__Impl5813);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2943:1: rule__InputCombo__Group__2 : rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3 ;
    public final void rule__InputCombo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2947:1: ( rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2948:2: rule__InputCombo__Group__2__Impl rule__InputCombo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__2__Impl_in_rule__InputCombo__Group__25844);
            rule__InputCombo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__3_in_rule__InputCombo__Group__25847);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2955:1: rule__InputCombo__Group__2__Impl : ( ( rule__InputCombo__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputCombo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2959:1: ( ( ( rule__InputCombo__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2960:1: ( ( rule__InputCombo__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2960:1: ( ( rule__InputCombo__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2961:1: ( rule__InputCombo__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputComboAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2962:1: ( rule__InputCombo__HabilitadoAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2962:2: rule__InputCombo__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__HabilitadoAssignment_2_in_rule__InputCombo__Group__2__Impl5874);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2972:1: rule__InputCombo__Group__3 : rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4 ;
    public final void rule__InputCombo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2976:1: ( rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2977:2: rule__InputCombo__Group__3__Impl rule__InputCombo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__3__Impl_in_rule__InputCombo__Group__35905);
            rule__InputCombo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__4_in_rule__InputCombo__Group__35908);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2984:1: rule__InputCombo__Group__3__Impl : ( 'InputCombo' ) ;
    public final void rule__InputCombo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2988:1: ( ( 'InputCombo' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2989:1: ( 'InputCombo' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2989:1: ( 'InputCombo' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:2990:1: 'InputCombo'
            {
             before(grammarAccess.getInputComboAccess().getInputComboKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__InputCombo__Group__3__Impl5936); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3003:1: rule__InputCombo__Group__4 : rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5 ;
    public final void rule__InputCombo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3007:1: ( rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3008:2: rule__InputCombo__Group__4__Impl rule__InputCombo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__4__Impl_in_rule__InputCombo__Group__45967);
            rule__InputCombo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__5_in_rule__InputCombo__Group__45970);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3015:1: rule__InputCombo__Group__4__Impl : ( ( rule__InputCombo__NameAssignment_4 ) ) ;
    public final void rule__InputCombo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3019:1: ( ( ( rule__InputCombo__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3020:1: ( ( rule__InputCombo__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3020:1: ( ( rule__InputCombo__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3021:1: ( rule__InputCombo__NameAssignment_4 )
            {
             before(grammarAccess.getInputComboAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3022:1: ( rule__InputCombo__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3022:2: rule__InputCombo__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__NameAssignment_4_in_rule__InputCombo__Group__4__Impl5997);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3032:1: rule__InputCombo__Group__5 : rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6 ;
    public final void rule__InputCombo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3036:1: ( rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3037:2: rule__InputCombo__Group__5__Impl rule__InputCombo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__5__Impl_in_rule__InputCombo__Group__56027);
            rule__InputCombo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__6_in_rule__InputCombo__Group__56030);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3044:1: rule__InputCombo__Group__5__Impl : ( '{' ) ;
    public final void rule__InputCombo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3048:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3049:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3049:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3050:1: '{'
            {
             before(grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCombo__Group__5__Impl6058); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3063:1: rule__InputCombo__Group__6 : rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7 ;
    public final void rule__InputCombo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3067:1: ( rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3068:2: rule__InputCombo__Group__6__Impl rule__InputCombo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__6__Impl_in_rule__InputCombo__Group__66089);
            rule__InputCombo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__7_in_rule__InputCombo__Group__66092);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3075:1: rule__InputCombo__Group__6__Impl : ( ( rule__InputCombo__Group_6__0 )? ) ;
    public final void rule__InputCombo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3079:1: ( ( ( rule__InputCombo__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3080:1: ( ( rule__InputCombo__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3080:1: ( ( rule__InputCombo__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3081:1: ( rule__InputCombo__Group_6__0 )?
            {
             before(grammarAccess.getInputComboAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3082:1: ( rule__InputCombo__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3082:2: rule__InputCombo__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__0_in_rule__InputCombo__Group__6__Impl6119);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3092:1: rule__InputCombo__Group__7 : rule__InputCombo__Group__7__Impl rule__InputCombo__Group__8 ;
    public final void rule__InputCombo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3096:1: ( rule__InputCombo__Group__7__Impl rule__InputCombo__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3097:2: rule__InputCombo__Group__7__Impl rule__InputCombo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__7__Impl_in_rule__InputCombo__Group__76150);
            rule__InputCombo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__8_in_rule__InputCombo__Group__76153);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3104:1: rule__InputCombo__Group__7__Impl : ( ( rule__InputCombo__Group_7__0 )? ) ;
    public final void rule__InputCombo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3108:1: ( ( ( rule__InputCombo__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3109:1: ( ( rule__InputCombo__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3109:1: ( ( rule__InputCombo__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3110:1: ( rule__InputCombo__Group_7__0 )?
            {
             before(grammarAccess.getInputComboAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3111:1: ( rule__InputCombo__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3111:2: rule__InputCombo__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__0_in_rule__InputCombo__Group__7__Impl6180);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3121:1: rule__InputCombo__Group__8 : rule__InputCombo__Group__8__Impl ;
    public final void rule__InputCombo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3125:1: ( rule__InputCombo__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3126:2: rule__InputCombo__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__8__Impl_in_rule__InputCombo__Group__86211);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3132:1: rule__InputCombo__Group__8__Impl : ( '}' ) ;
    public final void rule__InputCombo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3136:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3137:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3137:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3138:1: '}'
            {
             before(grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputCombo__Group__8__Impl6239); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3169:1: rule__InputCombo__Group_6__0 : rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1 ;
    public final void rule__InputCombo__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3173:1: ( rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3174:2: rule__InputCombo__Group_6__0__Impl rule__InputCombo__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__0__Impl_in_rule__InputCombo__Group_6__06288);
            rule__InputCombo__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__1_in_rule__InputCombo__Group_6__06291);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3181:1: rule__InputCombo__Group_6__0__Impl : ( 'valores' ) ;
    public final void rule__InputCombo__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3185:1: ( ( 'valores' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3186:1: ( 'valores' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3186:1: ( 'valores' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3187:1: 'valores'
            {
             before(grammarAccess.getInputComboAccess().getValoresKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__InputCombo__Group_6__0__Impl6319); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3200:1: rule__InputCombo__Group_6__1 : rule__InputCombo__Group_6__1__Impl ;
    public final void rule__InputCombo__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3204:1: ( rule__InputCombo__Group_6__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3205:2: rule__InputCombo__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_6__1__Impl_in_rule__InputCombo__Group_6__16350);
            rule__InputCombo__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3211:1: rule__InputCombo__Group_6__1__Impl : ( ( rule__InputCombo__ValoresAssignment_6_1 ) ) ;
    public final void rule__InputCombo__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3215:1: ( ( ( rule__InputCombo__ValoresAssignment_6_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3216:1: ( ( rule__InputCombo__ValoresAssignment_6_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3216:1: ( ( rule__InputCombo__ValoresAssignment_6_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3217:1: ( rule__InputCombo__ValoresAssignment_6_1 )
            {
             before(grammarAccess.getInputComboAccess().getValoresAssignment_6_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3218:1: ( rule__InputCombo__ValoresAssignment_6_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3218:2: rule__InputCombo__ValoresAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__ValoresAssignment_6_1_in_rule__InputCombo__Group_6__1__Impl6377);
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


    // $ANTLR start "rule__InputCombo__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3232:1: rule__InputCombo__Group_7__0 : rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1 ;
    public final void rule__InputCombo__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3236:1: ( rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3237:2: rule__InputCombo__Group_7__0__Impl rule__InputCombo__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__0__Impl_in_rule__InputCombo__Group_7__06411);
            rule__InputCombo__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__1_in_rule__InputCombo__Group_7__06414);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3244:1: rule__InputCombo__Group_7__0__Impl : ( 'seleccion' ) ;
    public final void rule__InputCombo__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3248:1: ( ( 'seleccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3249:1: ( 'seleccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3249:1: ( 'seleccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3250:1: 'seleccion'
            {
             before(grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__InputCombo__Group_7__0__Impl6442); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3263:1: rule__InputCombo__Group_7__1 : rule__InputCombo__Group_7__1__Impl ;
    public final void rule__InputCombo__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3267:1: ( rule__InputCombo__Group_7__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3268:2: rule__InputCombo__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group_7__1__Impl_in_rule__InputCombo__Group_7__16473);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3274:1: rule__InputCombo__Group_7__1__Impl : ( ( rule__InputCombo__SeleccionAssignment_7_1 ) ) ;
    public final void rule__InputCombo__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3278:1: ( ( ( rule__InputCombo__SeleccionAssignment_7_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3279:1: ( ( rule__InputCombo__SeleccionAssignment_7_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3279:1: ( ( rule__InputCombo__SeleccionAssignment_7_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3280:1: ( rule__InputCombo__SeleccionAssignment_7_1 )
            {
             before(grammarAccess.getInputComboAccess().getSeleccionAssignment_7_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3281:1: ( rule__InputCombo__SeleccionAssignment_7_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3281:2: rule__InputCombo__SeleccionAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__SeleccionAssignment_7_1_in_rule__InputCombo__Group_7__1__Impl6500);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3295:1: rule__InputCheck__Group__0 : rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1 ;
    public final void rule__InputCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3299:1: ( rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3300:2: rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__0__Impl_in_rule__InputCheck__Group__06534);
            rule__InputCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__1_in_rule__InputCheck__Group__06537);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3307:1: rule__InputCheck__Group__0__Impl : ( () ) ;
    public final void rule__InputCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3311:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3312:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3312:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3313:1: ()
            {
             before(grammarAccess.getInputCheckAccess().getInputCheckAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3314:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3316:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3326:1: rule__InputCheck__Group__1 : rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2 ;
    public final void rule__InputCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3330:1: ( rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3331:2: rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__1__Impl_in_rule__InputCheck__Group__16595);
            rule__InputCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__2_in_rule__InputCheck__Group__16598);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3338:1: rule__InputCheck__Group__1__Impl : ( ( rule__InputCheck__VisibleAssignment_1 )? ) ;
    public final void rule__InputCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3342:1: ( ( ( rule__InputCheck__VisibleAssignment_1 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3343:1: ( ( rule__InputCheck__VisibleAssignment_1 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3343:1: ( ( rule__InputCheck__VisibleAssignment_1 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3344:1: ( rule__InputCheck__VisibleAssignment_1 )?
            {
             before(grammarAccess.getInputCheckAccess().getVisibleAssignment_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3345:1: ( rule__InputCheck__VisibleAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3345:2: rule__InputCheck__VisibleAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__VisibleAssignment_1_in_rule__InputCheck__Group__1__Impl6625);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3355:1: rule__InputCheck__Group__2 : rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3 ;
    public final void rule__InputCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3359:1: ( rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3360:2: rule__InputCheck__Group__2__Impl rule__InputCheck__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__2__Impl_in_rule__InputCheck__Group__26656);
            rule__InputCheck__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__3_in_rule__InputCheck__Group__26659);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3367:1: rule__InputCheck__Group__2__Impl : ( ( rule__InputCheck__HabilitadoAssignment_2 )? ) ;
    public final void rule__InputCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3371:1: ( ( ( rule__InputCheck__HabilitadoAssignment_2 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3372:1: ( ( rule__InputCheck__HabilitadoAssignment_2 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3372:1: ( ( rule__InputCheck__HabilitadoAssignment_2 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3373:1: ( rule__InputCheck__HabilitadoAssignment_2 )?
            {
             before(grammarAccess.getInputCheckAccess().getHabilitadoAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3374:1: ( rule__InputCheck__HabilitadoAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3374:2: rule__InputCheck__HabilitadoAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__HabilitadoAssignment_2_in_rule__InputCheck__Group__2__Impl6686);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3384:1: rule__InputCheck__Group__3 : rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4 ;
    public final void rule__InputCheck__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3388:1: ( rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3389:2: rule__InputCheck__Group__3__Impl rule__InputCheck__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__3__Impl_in_rule__InputCheck__Group__36717);
            rule__InputCheck__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__4_in_rule__InputCheck__Group__36720);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3396:1: rule__InputCheck__Group__3__Impl : ( 'InputCheck' ) ;
    public final void rule__InputCheck__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3400:1: ( ( 'InputCheck' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3401:1: ( 'InputCheck' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3401:1: ( 'InputCheck' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3402:1: 'InputCheck'
            {
             before(grammarAccess.getInputCheckAccess().getInputCheckKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__InputCheck__Group__3__Impl6748); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3415:1: rule__InputCheck__Group__4 : rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5 ;
    public final void rule__InputCheck__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3419:1: ( rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3420:2: rule__InputCheck__Group__4__Impl rule__InputCheck__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__4__Impl_in_rule__InputCheck__Group__46779);
            rule__InputCheck__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__5_in_rule__InputCheck__Group__46782);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3427:1: rule__InputCheck__Group__4__Impl : ( ( rule__InputCheck__NameAssignment_4 ) ) ;
    public final void rule__InputCheck__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3431:1: ( ( ( rule__InputCheck__NameAssignment_4 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3432:1: ( ( rule__InputCheck__NameAssignment_4 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3432:1: ( ( rule__InputCheck__NameAssignment_4 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3433:1: ( rule__InputCheck__NameAssignment_4 )
            {
             before(grammarAccess.getInputCheckAccess().getNameAssignment_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3434:1: ( rule__InputCheck__NameAssignment_4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3434:2: rule__InputCheck__NameAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__NameAssignment_4_in_rule__InputCheck__Group__4__Impl6809);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3444:1: rule__InputCheck__Group__5 : rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6 ;
    public final void rule__InputCheck__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3448:1: ( rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3449:2: rule__InputCheck__Group__5__Impl rule__InputCheck__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__5__Impl_in_rule__InputCheck__Group__56839);
            rule__InputCheck__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__6_in_rule__InputCheck__Group__56842);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3456:1: rule__InputCheck__Group__5__Impl : ( '{' ) ;
    public final void rule__InputCheck__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3460:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3461:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3461:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3462:1: '{'
            {
             before(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCheck__Group__5__Impl6870); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3475:1: rule__InputCheck__Group__6 : rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7 ;
    public final void rule__InputCheck__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3479:1: ( rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3480:2: rule__InputCheck__Group__6__Impl rule__InputCheck__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__6__Impl_in_rule__InputCheck__Group__66901);
            rule__InputCheck__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__7_in_rule__InputCheck__Group__66904);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3487:1: rule__InputCheck__Group__6__Impl : ( ( rule__InputCheck__Group_6__0 )? ) ;
    public final void rule__InputCheck__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3491:1: ( ( ( rule__InputCheck__Group_6__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3492:1: ( ( rule__InputCheck__Group_6__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3492:1: ( ( rule__InputCheck__Group_6__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3493:1: ( rule__InputCheck__Group_6__0 )?
            {
             before(grammarAccess.getInputCheckAccess().getGroup_6()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3494:1: ( rule__InputCheck__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3494:2: rule__InputCheck__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__0_in_rule__InputCheck__Group__6__Impl6931);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3504:1: rule__InputCheck__Group__7 : rule__InputCheck__Group__7__Impl rule__InputCheck__Group__8 ;
    public final void rule__InputCheck__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3508:1: ( rule__InputCheck__Group__7__Impl rule__InputCheck__Group__8 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3509:2: rule__InputCheck__Group__7__Impl rule__InputCheck__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__7__Impl_in_rule__InputCheck__Group__76962);
            rule__InputCheck__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__8_in_rule__InputCheck__Group__76965);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3516:1: rule__InputCheck__Group__7__Impl : ( ( rule__InputCheck__Group_7__0 )? ) ;
    public final void rule__InputCheck__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3520:1: ( ( ( rule__InputCheck__Group_7__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3521:1: ( ( rule__InputCheck__Group_7__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3521:1: ( ( rule__InputCheck__Group_7__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3522:1: ( rule__InputCheck__Group_7__0 )?
            {
             before(grammarAccess.getInputCheckAccess().getGroup_7()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3523:1: ( rule__InputCheck__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3523:2: rule__InputCheck__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__0_in_rule__InputCheck__Group__7__Impl6992);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3533:1: rule__InputCheck__Group__8 : rule__InputCheck__Group__8__Impl ;
    public final void rule__InputCheck__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3537:1: ( rule__InputCheck__Group__8__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3538:2: rule__InputCheck__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__8__Impl_in_rule__InputCheck__Group__87023);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3544:1: rule__InputCheck__Group__8__Impl : ( '}' ) ;
    public final void rule__InputCheck__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3548:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3549:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3549:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3550:1: '}'
            {
             before(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputCheck__Group__8__Impl7051); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3581:1: rule__InputCheck__Group_6__0 : rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1 ;
    public final void rule__InputCheck__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3585:1: ( rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3586:2: rule__InputCheck__Group_6__0__Impl rule__InputCheck__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__0__Impl_in_rule__InputCheck__Group_6__07100);
            rule__InputCheck__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__1_in_rule__InputCheck__Group_6__07103);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3593:1: rule__InputCheck__Group_6__0__Impl : ( 'valores' ) ;
    public final void rule__InputCheck__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3597:1: ( ( 'valores' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3598:1: ( 'valores' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3598:1: ( 'valores' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3599:1: 'valores'
            {
             before(grammarAccess.getInputCheckAccess().getValoresKeyword_6_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__InputCheck__Group_6__0__Impl7131); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3612:1: rule__InputCheck__Group_6__1 : rule__InputCheck__Group_6__1__Impl ;
    public final void rule__InputCheck__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3616:1: ( rule__InputCheck__Group_6__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3617:2: rule__InputCheck__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_6__1__Impl_in_rule__InputCheck__Group_6__17162);
            rule__InputCheck__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3623:1: rule__InputCheck__Group_6__1__Impl : ( ( rule__InputCheck__ValoresAssignment_6_1 ) ) ;
    public final void rule__InputCheck__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3627:1: ( ( ( rule__InputCheck__ValoresAssignment_6_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3628:1: ( ( rule__InputCheck__ValoresAssignment_6_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3628:1: ( ( rule__InputCheck__ValoresAssignment_6_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3629:1: ( rule__InputCheck__ValoresAssignment_6_1 )
            {
             before(grammarAccess.getInputCheckAccess().getValoresAssignment_6_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3630:1: ( rule__InputCheck__ValoresAssignment_6_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3630:2: rule__InputCheck__ValoresAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__ValoresAssignment_6_1_in_rule__InputCheck__Group_6__1__Impl7189);
            rule__InputCheck__ValoresAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getValoresAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputCheck__Group_7__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3644:1: rule__InputCheck__Group_7__0 : rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1 ;
    public final void rule__InputCheck__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3648:1: ( rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3649:2: rule__InputCheck__Group_7__0__Impl rule__InputCheck__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__0__Impl_in_rule__InputCheck__Group_7__07223);
            rule__InputCheck__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__1_in_rule__InputCheck__Group_7__07226);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3656:1: rule__InputCheck__Group_7__0__Impl : ( 'seleccion' ) ;
    public final void rule__InputCheck__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3660:1: ( ( 'seleccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3661:1: ( 'seleccion' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3661:1: ( 'seleccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3662:1: 'seleccion'
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionKeyword_7_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__InputCheck__Group_7__0__Impl7254); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3675:1: rule__InputCheck__Group_7__1 : rule__InputCheck__Group_7__1__Impl rule__InputCheck__Group_7__2 ;
    public final void rule__InputCheck__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3679:1: ( rule__InputCheck__Group_7__1__Impl rule__InputCheck__Group_7__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3680:2: rule__InputCheck__Group_7__1__Impl rule__InputCheck__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__1__Impl_in_rule__InputCheck__Group_7__17285);
            rule__InputCheck__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__2_in_rule__InputCheck__Group_7__17288);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3687:1: rule__InputCheck__Group_7__1__Impl : ( '{' ) ;
    public final void rule__InputCheck__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3691:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3692:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3692:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3693:1: '{'
            {
             before(grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__InputCheck__Group_7__1__Impl7316); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3706:1: rule__InputCheck__Group_7__2 : rule__InputCheck__Group_7__2__Impl rule__InputCheck__Group_7__3 ;
    public final void rule__InputCheck__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3710:1: ( rule__InputCheck__Group_7__2__Impl rule__InputCheck__Group_7__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3711:2: rule__InputCheck__Group_7__2__Impl rule__InputCheck__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__2__Impl_in_rule__InputCheck__Group_7__27347);
            rule__InputCheck__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__3_in_rule__InputCheck__Group_7__27350);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3718:1: rule__InputCheck__Group_7__2__Impl : ( ( rule__InputCheck__SeleccionAssignment_7_2 ) ) ;
    public final void rule__InputCheck__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3722:1: ( ( ( rule__InputCheck__SeleccionAssignment_7_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3723:1: ( ( rule__InputCheck__SeleccionAssignment_7_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3723:1: ( ( rule__InputCheck__SeleccionAssignment_7_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3724:1: ( rule__InputCheck__SeleccionAssignment_7_2 )
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionAssignment_7_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3725:1: ( rule__InputCheck__SeleccionAssignment_7_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3725:2: rule__InputCheck__SeleccionAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__SeleccionAssignment_7_2_in_rule__InputCheck__Group_7__2__Impl7377);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3735:1: rule__InputCheck__Group_7__3 : rule__InputCheck__Group_7__3__Impl rule__InputCheck__Group_7__4 ;
    public final void rule__InputCheck__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3739:1: ( rule__InputCheck__Group_7__3__Impl rule__InputCheck__Group_7__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3740:2: rule__InputCheck__Group_7__3__Impl rule__InputCheck__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__3__Impl_in_rule__InputCheck__Group_7__37407);
            rule__InputCheck__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__4_in_rule__InputCheck__Group_7__37410);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3747:1: rule__InputCheck__Group_7__3__Impl : ( ( rule__InputCheck__Group_7_3__0 )* ) ;
    public final void rule__InputCheck__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3751:1: ( ( ( rule__InputCheck__Group_7_3__0 )* ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3752:1: ( ( rule__InputCheck__Group_7_3__0 )* )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3752:1: ( ( rule__InputCheck__Group_7_3__0 )* )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3753:1: ( rule__InputCheck__Group_7_3__0 )*
            {
             before(grammarAccess.getInputCheckAccess().getGroup_7_3()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3754:1: ( rule__InputCheck__Group_7_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3754:2: rule__InputCheck__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7_3__0_in_rule__InputCheck__Group_7__3__Impl7437);
            	    rule__InputCheck__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3764:1: rule__InputCheck__Group_7__4 : rule__InputCheck__Group_7__4__Impl ;
    public final void rule__InputCheck__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3768:1: ( rule__InputCheck__Group_7__4__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3769:2: rule__InputCheck__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7__4__Impl_in_rule__InputCheck__Group_7__47468);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3775:1: rule__InputCheck__Group_7__4__Impl : ( '}' ) ;
    public final void rule__InputCheck__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3779:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3780:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3780:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3781:1: '}'
            {
             before(grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__InputCheck__Group_7__4__Impl7496); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3804:1: rule__InputCheck__Group_7_3__0 : rule__InputCheck__Group_7_3__0__Impl rule__InputCheck__Group_7_3__1 ;
    public final void rule__InputCheck__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3808:1: ( rule__InputCheck__Group_7_3__0__Impl rule__InputCheck__Group_7_3__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3809:2: rule__InputCheck__Group_7_3__0__Impl rule__InputCheck__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7_3__0__Impl_in_rule__InputCheck__Group_7_3__07537);
            rule__InputCheck__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7_3__1_in_rule__InputCheck__Group_7_3__07540);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3816:1: rule__InputCheck__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__InputCheck__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3820:1: ( ( ',' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3821:1: ( ',' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3821:1: ( ',' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3822:1: ','
            {
             before(grammarAccess.getInputCheckAccess().getCommaKeyword_7_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__InputCheck__Group_7_3__0__Impl7568); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3835:1: rule__InputCheck__Group_7_3__1 : rule__InputCheck__Group_7_3__1__Impl ;
    public final void rule__InputCheck__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3839:1: ( rule__InputCheck__Group_7_3__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3840:2: rule__InputCheck__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group_7_3__1__Impl_in_rule__InputCheck__Group_7_3__17599);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3846:1: rule__InputCheck__Group_7_3__1__Impl : ( ( rule__InputCheck__SeleccionAssignment_7_3_1 ) ) ;
    public final void rule__InputCheck__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3850:1: ( ( ( rule__InputCheck__SeleccionAssignment_7_3_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3851:1: ( ( rule__InputCheck__SeleccionAssignment_7_3_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3851:1: ( ( rule__InputCheck__SeleccionAssignment_7_3_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3852:1: ( rule__InputCheck__SeleccionAssignment_7_3_1 )
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionAssignment_7_3_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3853:1: ( rule__InputCheck__SeleccionAssignment_7_3_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3853:2: rule__InputCheck__SeleccionAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__SeleccionAssignment_7_3_1_in_rule__InputCheck__Group_7_3__1__Impl7626);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3868:1: rule__Formulario__ComprobarAsercionAssignment_0 : ( ( 'comprobarAsercion' ) ) ;
    public final void rule__Formulario__ComprobarAsercionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3872:1: ( ( ( 'comprobarAsercion' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3873:1: ( ( 'comprobarAsercion' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3873:1: ( ( 'comprobarAsercion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3874:1: ( 'comprobarAsercion' )
            {
             before(grammarAccess.getFormularioAccess().getComprobarAsercionComprobarAsercionKeyword_0_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3875:1: ( 'comprobarAsercion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3876:1: 'comprobarAsercion'
            {
             before(grammarAccess.getFormularioAccess().getComprobarAsercionComprobarAsercionKeyword_0_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Formulario__ComprobarAsercionAssignment_07670); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3891:1: rule__Formulario__ComprobarAccionAssignment_1 : ( ( 'comprobarAccion' ) ) ;
    public final void rule__Formulario__ComprobarAccionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3895:1: ( ( ( 'comprobarAccion' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3896:1: ( ( 'comprobarAccion' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3896:1: ( ( 'comprobarAccion' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3897:1: ( 'comprobarAccion' )
            {
             before(grammarAccess.getFormularioAccess().getComprobarAccionComprobarAccionKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3898:1: ( 'comprobarAccion' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3899:1: 'comprobarAccion'
            {
             before(grammarAccess.getFormularioAccess().getComprobarAccionComprobarAccionKeyword_1_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Formulario__ComprobarAccionAssignment_17714); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3914:1: rule__Formulario__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Formulario__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3918:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3919:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3919:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3920:1: ruleEString
            {
             before(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Formulario__NameAssignment_37753);
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


    // $ANTLR start "rule__Formulario__LayoutAssignment_5"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3929:1: rule__Formulario__LayoutAssignment_5 : ( ruleLayout ) ;
    public final void rule__Formulario__LayoutAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3933:1: ( ( ruleLayout ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3934:1: ( ruleLayout )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3934:1: ( ruleLayout )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3935:1: ruleLayout
            {
             before(grammarAccess.getFormularioAccess().getLayoutLayoutParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_rule__Formulario__LayoutAssignment_57784);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3944:1: rule__Formulario__PruebasAssignment_6 : ( rulePruebaInterfaz ) ;
    public final void rule__Formulario__PruebasAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3948:1: ( ( rulePruebaInterfaz ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3949:1: ( rulePruebaInterfaz )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3949:1: ( rulePruebaInterfaz )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3950:1: rulePruebaInterfaz
            {
             before(grammarAccess.getFormularioAccess().getPruebasPruebaInterfazParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_rule__Formulario__PruebasAssignment_67815);
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


    // $ANTLR start "rule__Layout__AnchuraAssignment_3_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3959:1: rule__Layout__AnchuraAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Layout__AnchuraAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3963:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3964:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3964:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3965:1: ruleEInt
            {
             before(grammarAccess.getLayoutAccess().getAnchuraEIntParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Layout__AnchuraAssignment_3_17846);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3974:1: rule__Layout__AlturaAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Layout__AlturaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3978:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3979:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3979:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3980:1: ruleEInt
            {
             before(grammarAccess.getLayoutAccess().getAlturaEIntParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Layout__AlturaAssignment_4_17877);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3989:1: rule__Layout__EntradasAssignment_5_2 : ( ruleInput ) ;
    public final void rule__Layout__EntradasAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3993:1: ( ( ruleInput ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3994:1: ( ruleInput )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3994:1: ( ruleInput )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:3995:1: ruleInput
            {
             before(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_5_27908);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4004:1: rule__Layout__EntradasAssignment_5_3_1 : ( ruleInput ) ;
    public final void rule__Layout__EntradasAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4008:1: ( ( ruleInput ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4009:1: ( ruleInput )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4009:1: ( ruleInput )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4010:1: ruleInput
            {
             before(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_5_3_17939);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4019:1: rule__PruebaInterfaz__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PruebaInterfaz__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4023:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4024:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4024:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4025:1: ruleEString
            {
             before(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__PruebaInterfaz__NameAssignment_27970);
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


    // $ANTLR start "rule__Input_Impl__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4034:1: rule__Input_Impl__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__Input_Impl__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4038:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4039:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4039:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4040:1: ( 'visible' )
            {
             before(grammarAccess.getInput_ImplAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4041:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4042:1: 'visible'
            {
             before(grammarAccess.getInput_ImplAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Input_Impl__VisibleAssignment_18006); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4057:1: rule__Input_Impl__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__Input_Impl__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4061:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4062:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4062:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4063:1: ( 'habilitado' )
            {
             before(grammarAccess.getInput_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4064:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4065:1: 'habilitado'
            {
             before(grammarAccess.getInput_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Input_Impl__HabilitadoAssignment_28050); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4080:1: rule__Input_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Input_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4084:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4085:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4085:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4086:1: ruleEString
            {
             before(grammarAccess.getInput_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Input_Impl__NameAssignment_48089);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4095:1: rule__InputTexto__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputTexto__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4099:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4100:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4100:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4101:1: ( 'visible' )
            {
             before(grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4102:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4103:1: 'visible'
            {
             before(grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__InputTexto__VisibleAssignment_18125); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4118:1: rule__InputTexto__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputTexto__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4122:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4123:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4123:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4124:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4125:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4126:1: 'habilitado'
            {
             before(grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputTexto__HabilitadoAssignment_28169); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4141:1: rule__InputTexto__ObligatorioAssignment_3 : ( ( 'obligatorio' ) ) ;
    public final void rule__InputTexto__ObligatorioAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4145:1: ( ( ( 'obligatorio' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4146:1: ( ( 'obligatorio' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4146:1: ( ( 'obligatorio' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4147:1: ( 'obligatorio' )
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4148:1: ( 'obligatorio' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4149:1: 'obligatorio'
            {
             before(grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__InputTexto__ObligatorioAssignment_38213); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4164:1: rule__InputTexto__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__InputTexto__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4168:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4169:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4169:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4170:1: ruleEString
            {
             before(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputTexto__NameAssignment_58252);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4179:1: rule__InputTexto__ValorAssignment_7_1 : ( ruleEString ) ;
    public final void rule__InputTexto__ValorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4183:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4184:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4184:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4185:1: ruleEString
            {
             before(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputTexto__ValorAssignment_7_18283);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4194:1: rule__InputBoton__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputBoton__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4198:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4199:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4199:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4200:1: ( 'visible' )
            {
             before(grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4201:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4202:1: 'visible'
            {
             before(grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__InputBoton__VisibleAssignment_18319); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4217:1: rule__InputBoton__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputBoton__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4221:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4222:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4222:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4223:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4224:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4225:1: 'habilitado'
            {
             before(grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputBoton__HabilitadoAssignment_28363); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4240:1: rule__InputBoton__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputBoton__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4244:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4245:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4245:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4246:1: ruleEString
            {
             before(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputBoton__NameAssignment_48402);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4255:1: rule__InputMultiple_Impl__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputMultiple_Impl__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4259:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4260:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4260:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4261:1: ( 'visible' )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4262:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4263:1: 'visible'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__InputMultiple_Impl__VisibleAssignment_18438); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4278:1: rule__InputMultiple_Impl__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputMultiple_Impl__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4282:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4283:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4283:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4284:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4285:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4286:1: 'habilitado'
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputMultiple_Impl__HabilitadoAssignment_28482); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4301:1: rule__InputMultiple_Impl__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputMultiple_Impl__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4305:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4306:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4306:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4307:1: ruleEString
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputMultiple_Impl__NameAssignment_48521);
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


    // $ANTLR start "rule__InputMultiple_Impl__ValoresAssignment_6_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4316:1: rule__InputMultiple_Impl__ValoresAssignment_6_1 : ( ruleEString ) ;
    public final void rule__InputMultiple_Impl__ValoresAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4320:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4321:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4321:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4322:1: ruleEString
            {
             before(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputMultiple_Impl__ValoresAssignment_6_18552);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputMultiple_Impl__ValoresAssignment_6_1"


    // $ANTLR start "rule__InputRadio__VisibleAssignment_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4331:1: rule__InputRadio__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputRadio__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4335:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4336:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4336:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4337:1: ( 'visible' )
            {
             before(grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4338:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4339:1: 'visible'
            {
             before(grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__InputRadio__VisibleAssignment_18588); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4354:1: rule__InputRadio__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputRadio__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4358:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4359:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4359:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4360:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4361:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4362:1: 'habilitado'
            {
             before(grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputRadio__HabilitadoAssignment_28632); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4377:1: rule__InputRadio__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputRadio__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4381:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4382:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4382:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4383:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__NameAssignment_48671);
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


    // $ANTLR start "rule__InputRadio__ValoresAssignment_6_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4392:1: rule__InputRadio__ValoresAssignment_6_1 : ( ruleEString ) ;
    public final void rule__InputRadio__ValoresAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4396:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4397:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4397:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4398:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_6_18702);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__ValoresAssignment_6_1"


    // $ANTLR start "rule__InputRadio__SeleccionAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4407:1: rule__InputRadio__SeleccionAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__InputRadio__SeleccionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4411:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4412:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4412:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4413:1: ruleEInt
            {
             before(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputRadio__SeleccionAssignment_7_18733);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4422:1: rule__InputCombo__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputCombo__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4426:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4427:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4427:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4428:1: ( 'visible' )
            {
             before(grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4429:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4430:1: 'visible'
            {
             before(grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__InputCombo__VisibleAssignment_18769); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4445:1: rule__InputCombo__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputCombo__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4449:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4450:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4450:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4451:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4452:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4453:1: 'habilitado'
            {
             before(grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputCombo__HabilitadoAssignment_28813); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4468:1: rule__InputCombo__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputCombo__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4472:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4473:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4473:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4474:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__NameAssignment_48852);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4483:1: rule__InputCombo__ValoresAssignment_6_1 : ( ruleEString ) ;
    public final void rule__InputCombo__ValoresAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4487:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4488:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4488:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4489:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_18883);
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


    // $ANTLR start "rule__InputCombo__SeleccionAssignment_7_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4498:1: rule__InputCombo__SeleccionAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__InputCombo__SeleccionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4502:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4503:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4503:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4504:1: ruleEInt
            {
             before(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCombo__SeleccionAssignment_7_18914);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4513:1: rule__InputCheck__VisibleAssignment_1 : ( ( 'visible' ) ) ;
    public final void rule__InputCheck__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4517:1: ( ( ( 'visible' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4518:1: ( ( 'visible' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4518:1: ( ( 'visible' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4519:1: ( 'visible' )
            {
             before(grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4520:1: ( 'visible' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4521:1: 'visible'
            {
             before(grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__InputCheck__VisibleAssignment_18950); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4536:1: rule__InputCheck__HabilitadoAssignment_2 : ( ( 'habilitado' ) ) ;
    public final void rule__InputCheck__HabilitadoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4540:1: ( ( ( 'habilitado' ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4541:1: ( ( 'habilitado' ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4541:1: ( ( 'habilitado' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4542:1: ( 'habilitado' )
            {
             before(grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4543:1: ( 'habilitado' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4544:1: 'habilitado'
            {
             before(grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__InputCheck__HabilitadoAssignment_28994); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4559:1: rule__InputCheck__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__InputCheck__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4563:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4564:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4564:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4565:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__NameAssignment_49033);
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


    // $ANTLR start "rule__InputCheck__ValoresAssignment_6_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4574:1: rule__InputCheck__ValoresAssignment_6_1 : ( ruleEString ) ;
    public final void rule__InputCheck__ValoresAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4578:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4579:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4579:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4580:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_6_19064);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__ValoresAssignment_6_1"


    // $ANTLR start "rule__InputCheck__SeleccionAssignment_7_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4589:1: rule__InputCheck__SeleccionAssignment_7_2 : ( ruleEInt ) ;
    public final void rule__InputCheck__SeleccionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4593:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4594:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4594:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4595:1: ruleEInt
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_7_29095);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4604:1: rule__InputCheck__SeleccionAssignment_7_3_1 : ( ruleEInt ) ;
    public final void rule__InputCheck__SeleccionAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4608:1: ( ( ruleEInt ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4609:1: ( ruleEInt )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4609:1: ( ruleEInt )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:4610:1: ruleEInt
            {
             before(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_7_3_19126);
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
        "\3\25\7\uffff";
    static final String DFA1_maxS =
        "\3\43\7\uffff";
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
            return "426:1: rule__Input__Alternatives : ( ( ruleInput_Impl ) | ( ruleInputTexto ) | ( ruleInputBoton ) | ( ruleInputMultiple_Impl ) | ( ruleInputRadio ) | ( ruleInputCombo ) | ( ruleInputCheck ) );";
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
        public static final BitSet FOLLOW_ruleInput_Impl_in_rule__Input__Alternatives852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_rule__Input__Alternatives869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_rule__Input__Alternatives886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_rule__Input__Alternatives903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_rule__Input__Alternatives920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_rule__Input__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_rule__Input__Alternatives954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__0__Impl_in_rule__Formulario__Group__01034 = new BitSet(new long[]{0x0000000100000800L});
        public static final BitSet FOLLOW_rule__Formulario__Group__1_in_rule__Formulario__Group__01037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__ComprobarAsercionAssignment_0_in_rule__Formulario__Group__0__Impl1064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__1__Impl_in_rule__Formulario__Group__11095 = new BitSet(new long[]{0x0000000100000800L});
        public static final BitSet FOLLOW_rule__Formulario__Group__2_in_rule__Formulario__Group__11098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__ComprobarAccionAssignment_1_in_rule__Formulario__Group__1__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__2__Impl_in_rule__Formulario__Group__21156 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Formulario__Group__3_in_rule__Formulario__Group__21159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Formulario__Group__2__Impl1187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__3__Impl_in_rule__Formulario__Group__31218 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__4_in_rule__Formulario__Group__31221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__NameAssignment_3_in_rule__Formulario__Group__3__Impl1248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__4__Impl_in_rule__Formulario__Group__41278 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__5_in_rule__Formulario__Group__41281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Formulario__Group__4__Impl1309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__5__Impl_in_rule__Formulario__Group__51340 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__6_in_rule__Formulario__Group__51343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__LayoutAssignment_5_in_rule__Formulario__Group__5__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__6__Impl_in_rule__Formulario__Group__61400 = new BitSet(new long[]{0x0000000000082000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__7_in_rule__Formulario__Group__61403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__PruebasAssignment_6_in_rule__Formulario__Group__6__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__7__Impl_in_rule__Formulario__Group__71461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Formulario__Group__7__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__0__Impl_in_rule__Layout__Group__01536 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Layout__Group__1_in_rule__Layout__Group__01539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__1__Impl_in_rule__Layout__Group__11597 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Layout__Group__2_in_rule__Layout__Group__11600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Layout__Group__1__Impl1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__2__Impl_in_rule__Layout__Group__21659 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_rule__Layout__Group__3_in_rule__Layout__Group__21662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Layout__Group__2__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__3__Impl_in_rule__Layout__Group__31721 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_rule__Layout__Group__4_in_rule__Layout__Group__31724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__0_in_rule__Layout__Group__3__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__4__Impl_in_rule__Layout__Group__41782 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_rule__Layout__Group__5_in_rule__Layout__Group__41785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__0_in_rule__Layout__Group__4__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__5__Impl_in_rule__Layout__Group__51843 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_rule__Layout__Group__6_in_rule__Layout__Group__51846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__0_in_rule__Layout__Group__5__Impl1873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group__6__Impl_in_rule__Layout__Group__61904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Layout__Group__6__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__0__Impl_in_rule__Layout__Group_3__01977 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__1_in_rule__Layout__Group_3__01980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Layout__Group_3__0__Impl2008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_3__1__Impl_in_rule__Layout__Group_3__12039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__AnchuraAssignment_3_1_in_rule__Layout__Group_3__1__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__0__Impl_in_rule__Layout__Group_4__02100 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__1_in_rule__Layout__Group_4__02103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Layout__Group_4__0__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_4__1__Impl_in_rule__Layout__Group_4__12162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__AlturaAssignment_4_1_in_rule__Layout__Group_4__1__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__0__Impl_in_rule__Layout__Group_5__02223 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__1_in_rule__Layout__Group_5__02226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Layout__Group_5__0__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__1__Impl_in_rule__Layout__Group_5__12285 = new BitSet(new long[]{0x0000000E6B600000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__2_in_rule__Layout__Group_5__12288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Layout__Group_5__1__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__2__Impl_in_rule__Layout__Group_5__22347 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__3_in_rule__Layout__Group_5__22350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__EntradasAssignment_5_2_in_rule__Layout__Group_5__2__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__3__Impl_in_rule__Layout__Group_5__32407 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__4_in_rule__Layout__Group_5__32410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5_3__0_in_rule__Layout__Group_5__3__Impl2437 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5__4__Impl_in_rule__Layout__Group_5__42468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Layout__Group_5__4__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5_3__0__Impl_in_rule__Layout__Group_5_3__02537 = new BitSet(new long[]{0x0000000E6B600000L});
        public static final BitSet FOLLOW_rule__Layout__Group_5_3__1_in_rule__Layout__Group_5_3__02540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Layout__Group_5_3__0__Impl2568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__Group_5_3__1__Impl_in_rule__Layout__Group_5_3__12599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Layout__EntradasAssignment_5_3_1_in_rule__Layout__Group_5_3__1__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__0__Impl_in_rule__PruebaInterfaz__Group__02660 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__1_in_rule__PruebaInterfaz__Group__02663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__1__Impl_in_rule__PruebaInterfaz__Group__12721 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__2_in_rule__PruebaInterfaz__Group__12724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__PruebaInterfaz__Group__1__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__Group__2__Impl_in_rule__PruebaInterfaz__Group__22783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PruebaInterfaz__NameAssignment_2_in_rule__PruebaInterfaz__Group__2__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02846 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EInt__Group__0__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__0__Impl_in_rule__Input_Impl__Group__02971 = new BitSet(new long[]{0x0000000600200000L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__1_in_rule__Input_Impl__Group__02974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__1__Impl_in_rule__Input_Impl__Group__13032 = new BitSet(new long[]{0x0000000600200000L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__2_in_rule__Input_Impl__Group__13035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__VisibleAssignment_1_in_rule__Input_Impl__Group__1__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__2__Impl_in_rule__Input_Impl__Group__23093 = new BitSet(new long[]{0x0000000600200000L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__3_in_rule__Input_Impl__Group__23096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__HabilitadoAssignment_2_in_rule__Input_Impl__Group__2__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__3__Impl_in_rule__Input_Impl__Group__33154 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__4_in_rule__Input_Impl__Group__33157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Input_Impl__Group__3__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__4__Impl_in_rule__Input_Impl__Group__43216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__NameAssignment_4_in_rule__Input_Impl__Group__4__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__0__Impl_in_rule__InputTexto__Group__03283 = new BitSet(new long[]{0x0000000E00400000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__1_in_rule__InputTexto__Group__03286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__1__Impl_in_rule__InputTexto__Group__13344 = new BitSet(new long[]{0x0000000E00400000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__2_in_rule__InputTexto__Group__13347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__VisibleAssignment_1_in_rule__InputTexto__Group__1__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__2__Impl_in_rule__InputTexto__Group__23405 = new BitSet(new long[]{0x0000000E00400000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__3_in_rule__InputTexto__Group__23408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__HabilitadoAssignment_2_in_rule__InputTexto__Group__2__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__3__Impl_in_rule__InputTexto__Group__33466 = new BitSet(new long[]{0x0000000E00400000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__4_in_rule__InputTexto__Group__33469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__ObligatorioAssignment_3_in_rule__InputTexto__Group__3__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__4__Impl_in_rule__InputTexto__Group__43527 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__5_in_rule__InputTexto__Group__43530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__InputTexto__Group__4__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__5__Impl_in_rule__InputTexto__Group__53589 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__6_in_rule__InputTexto__Group__53592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__NameAssignment_5_in_rule__InputTexto__Group__5__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__6__Impl_in_rule__InputTexto__Group__63649 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__7_in_rule__InputTexto__Group__63652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputTexto__Group__6__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__7__Impl_in_rule__InputTexto__Group__73711 = new BitSet(new long[]{0x0000000000802000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__8_in_rule__InputTexto__Group__73714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_7__0_in_rule__InputTexto__Group__7__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__8__Impl_in_rule__InputTexto__Group__83772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputTexto__Group__8__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_7__0__Impl_in_rule__InputTexto__Group_7__03849 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_7__1_in_rule__InputTexto__Group_7__03852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__InputTexto__Group_7__0__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group_7__1__Impl_in_rule__InputTexto__Group_7__13911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__ValorAssignment_7_1_in_rule__InputTexto__Group_7__1__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__0__Impl_in_rule__InputBoton__Group__03972 = new BitSet(new long[]{0x0000000601000000L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__1_in_rule__InputBoton__Group__03975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__1__Impl_in_rule__InputBoton__Group__14033 = new BitSet(new long[]{0x0000000601000000L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__2_in_rule__InputBoton__Group__14036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__VisibleAssignment_1_in_rule__InputBoton__Group__1__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__2__Impl_in_rule__InputBoton__Group__24094 = new BitSet(new long[]{0x0000000601000000L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__3_in_rule__InputBoton__Group__24097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__HabilitadoAssignment_2_in_rule__InputBoton__Group__2__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__3__Impl_in_rule__InputBoton__Group__34155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__4_in_rule__InputBoton__Group__34158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__InputBoton__Group__3__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__4__Impl_in_rule__InputBoton__Group__44217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__NameAssignment_4_in_rule__InputBoton__Group__4__Impl4244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__0__Impl_in_rule__InputMultiple_Impl__Group__04284 = new BitSet(new long[]{0x0000000602000000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__1_in_rule__InputMultiple_Impl__Group__04287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__1__Impl_in_rule__InputMultiple_Impl__Group__14345 = new BitSet(new long[]{0x0000000602000000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__2_in_rule__InputMultiple_Impl__Group__14348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__VisibleAssignment_1_in_rule__InputMultiple_Impl__Group__1__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__2__Impl_in_rule__InputMultiple_Impl__Group__24406 = new BitSet(new long[]{0x0000000602000000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__3_in_rule__InputMultiple_Impl__Group__24409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__HabilitadoAssignment_2_in_rule__InputMultiple_Impl__Group__2__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__3__Impl_in_rule__InputMultiple_Impl__Group__34467 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__4_in_rule__InputMultiple_Impl__Group__34470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__InputMultiple_Impl__Group__3__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__4__Impl_in_rule__InputMultiple_Impl__Group__44529 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__5_in_rule__InputMultiple_Impl__Group__44532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__NameAssignment_4_in_rule__InputMultiple_Impl__Group__4__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__5__Impl_in_rule__InputMultiple_Impl__Group__54589 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__6_in_rule__InputMultiple_Impl__Group__54592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputMultiple_Impl__Group__5__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__6__Impl_in_rule__InputMultiple_Impl__Group__64651 = new BitSet(new long[]{0x0000000004002000L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__7_in_rule__InputMultiple_Impl__Group__64654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__0_in_rule__InputMultiple_Impl__Group__6__Impl4681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group__7__Impl_in_rule__InputMultiple_Impl__Group__74712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputMultiple_Impl__Group__7__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__0__Impl_in_rule__InputMultiple_Impl__Group_6__04787 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__1_in_rule__InputMultiple_Impl__Group_6__04790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__InputMultiple_Impl__Group_6__0__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__Group_6__1__Impl_in_rule__InputMultiple_Impl__Group_6__14849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputMultiple_Impl__ValoresAssignment_6_1_in_rule__InputMultiple_Impl__Group_6__1__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__0__Impl_in_rule__InputRadio__Group__04910 = new BitSet(new long[]{0x0000000608000000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__1_in_rule__InputRadio__Group__04913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__1__Impl_in_rule__InputRadio__Group__14971 = new BitSet(new long[]{0x0000000608000000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__2_in_rule__InputRadio__Group__14974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__VisibleAssignment_1_in_rule__InputRadio__Group__1__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__2__Impl_in_rule__InputRadio__Group__25032 = new BitSet(new long[]{0x0000000608000000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__3_in_rule__InputRadio__Group__25035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__HabilitadoAssignment_2_in_rule__InputRadio__Group__2__Impl5062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__3__Impl_in_rule__InputRadio__Group__35093 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__4_in_rule__InputRadio__Group__35096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__InputRadio__Group__3__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__4__Impl_in_rule__InputRadio__Group__45155 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__5_in_rule__InputRadio__Group__45158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__NameAssignment_4_in_rule__InputRadio__Group__4__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__5__Impl_in_rule__InputRadio__Group__55215 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__6_in_rule__InputRadio__Group__55218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputRadio__Group__5__Impl5246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__6__Impl_in_rule__InputRadio__Group__65277 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__7_in_rule__InputRadio__Group__65280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__0_in_rule__InputRadio__Group__6__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__7__Impl_in_rule__InputRadio__Group__75338 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__8_in_rule__InputRadio__Group__75341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__0_in_rule__InputRadio__Group__7__Impl5368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__8__Impl_in_rule__InputRadio__Group__85399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputRadio__Group__8__Impl5427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__0__Impl_in_rule__InputRadio__Group_6__05476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__1_in_rule__InputRadio__Group_6__05479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__InputRadio__Group_6__0__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_6__1__Impl_in_rule__InputRadio__Group_6__15538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__ValoresAssignment_6_1_in_rule__InputRadio__Group_6__1__Impl5565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__0__Impl_in_rule__InputRadio__Group_7__05599 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__1_in_rule__InputRadio__Group_7__05602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__InputRadio__Group_7__0__Impl5630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group_7__1__Impl_in_rule__InputRadio__Group_7__15661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__SeleccionAssignment_7_1_in_rule__InputRadio__Group_7__1__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__0__Impl_in_rule__InputCombo__Group__05722 = new BitSet(new long[]{0x0000000620000000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__1_in_rule__InputCombo__Group__05725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__1__Impl_in_rule__InputCombo__Group__15783 = new BitSet(new long[]{0x0000000620000000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__2_in_rule__InputCombo__Group__15786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__VisibleAssignment_1_in_rule__InputCombo__Group__1__Impl5813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__2__Impl_in_rule__InputCombo__Group__25844 = new BitSet(new long[]{0x0000000620000000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__3_in_rule__InputCombo__Group__25847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__HabilitadoAssignment_2_in_rule__InputCombo__Group__2__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__3__Impl_in_rule__InputCombo__Group__35905 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__4_in_rule__InputCombo__Group__35908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__InputCombo__Group__3__Impl5936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__4__Impl_in_rule__InputCombo__Group__45967 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__5_in_rule__InputCombo__Group__45970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__NameAssignment_4_in_rule__InputCombo__Group__4__Impl5997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__5__Impl_in_rule__InputCombo__Group__56027 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__6_in_rule__InputCombo__Group__56030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCombo__Group__5__Impl6058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__6__Impl_in_rule__InputCombo__Group__66089 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__7_in_rule__InputCombo__Group__66092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__0_in_rule__InputCombo__Group__6__Impl6119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__7__Impl_in_rule__InputCombo__Group__76150 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__8_in_rule__InputCombo__Group__76153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__0_in_rule__InputCombo__Group__7__Impl6180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__8__Impl_in_rule__InputCombo__Group__86211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputCombo__Group__8__Impl6239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__0__Impl_in_rule__InputCombo__Group_6__06288 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__1_in_rule__InputCombo__Group_6__06291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__InputCombo__Group_6__0__Impl6319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_6__1__Impl_in_rule__InputCombo__Group_6__16350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__ValoresAssignment_6_1_in_rule__InputCombo__Group_6__1__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__0__Impl_in_rule__InputCombo__Group_7__06411 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__1_in_rule__InputCombo__Group_7__06414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__InputCombo__Group_7__0__Impl6442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group_7__1__Impl_in_rule__InputCombo__Group_7__16473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__SeleccionAssignment_7_1_in_rule__InputCombo__Group_7__1__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__0__Impl_in_rule__InputCheck__Group__06534 = new BitSet(new long[]{0x0000000E6B600000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__1_in_rule__InputCheck__Group__06537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__1__Impl_in_rule__InputCheck__Group__16595 = new BitSet(new long[]{0x0000000E6B600000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__2_in_rule__InputCheck__Group__16598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__VisibleAssignment_1_in_rule__InputCheck__Group__1__Impl6625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__2__Impl_in_rule__InputCheck__Group__26656 = new BitSet(new long[]{0x0000000E6B600000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__3_in_rule__InputCheck__Group__26659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__HabilitadoAssignment_2_in_rule__InputCheck__Group__2__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__3__Impl_in_rule__InputCheck__Group__36717 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__4_in_rule__InputCheck__Group__36720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__InputCheck__Group__3__Impl6748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__4__Impl_in_rule__InputCheck__Group__46779 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__5_in_rule__InputCheck__Group__46782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__NameAssignment_4_in_rule__InputCheck__Group__4__Impl6809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__5__Impl_in_rule__InputCheck__Group__56839 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__6_in_rule__InputCheck__Group__56842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCheck__Group__5__Impl6870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__6__Impl_in_rule__InputCheck__Group__66901 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__7_in_rule__InputCheck__Group__66904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__0_in_rule__InputCheck__Group__6__Impl6931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__7__Impl_in_rule__InputCheck__Group__76962 = new BitSet(new long[]{0x0000000014002000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__8_in_rule__InputCheck__Group__76965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__0_in_rule__InputCheck__Group__7__Impl6992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__8__Impl_in_rule__InputCheck__Group__87023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputCheck__Group__8__Impl7051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__0__Impl_in_rule__InputCheck__Group_6__07100 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__1_in_rule__InputCheck__Group_6__07103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__InputCheck__Group_6__0__Impl7131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_6__1__Impl_in_rule__InputCheck__Group_6__17162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__ValoresAssignment_6_1_in_rule__InputCheck__Group_6__1__Impl7189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__0__Impl_in_rule__InputCheck__Group_7__07223 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__1_in_rule__InputCheck__Group_7__07226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__InputCheck__Group_7__0__Impl7254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__1__Impl_in_rule__InputCheck__Group_7__17285 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__2_in_rule__InputCheck__Group_7__17288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__InputCheck__Group_7__1__Impl7316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__2__Impl_in_rule__InputCheck__Group_7__27347 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__3_in_rule__InputCheck__Group_7__27350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__SeleccionAssignment_7_2_in_rule__InputCheck__Group_7__2__Impl7377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__3__Impl_in_rule__InputCheck__Group_7__37407 = new BitSet(new long[]{0x0000000000042000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__4_in_rule__InputCheck__Group_7__37410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7_3__0_in_rule__InputCheck__Group_7__3__Impl7437 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7__4__Impl_in_rule__InputCheck__Group_7__47468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__InputCheck__Group_7__4__Impl7496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7_3__0__Impl_in_rule__InputCheck__Group_7_3__07537 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7_3__1_in_rule__InputCheck__Group_7_3__07540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__InputCheck__Group_7_3__0__Impl7568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group_7_3__1__Impl_in_rule__InputCheck__Group_7_3__17599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__SeleccionAssignment_7_3_1_in_rule__InputCheck__Group_7_3__1__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Formulario__ComprobarAsercionAssignment_07670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Formulario__ComprobarAccionAssignment_17714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Formulario__NameAssignment_37753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_rule__Formulario__LayoutAssignment_57784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_rule__Formulario__PruebasAssignment_67815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Layout__AnchuraAssignment_3_17846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Layout__AlturaAssignment_4_17877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_5_27908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_rule__Layout__EntradasAssignment_5_3_17939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__PruebaInterfaz__NameAssignment_27970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Input_Impl__VisibleAssignment_18006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Input_Impl__HabilitadoAssignment_28050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Input_Impl__NameAssignment_48089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__InputTexto__VisibleAssignment_18125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputTexto__HabilitadoAssignment_28169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__InputTexto__ObligatorioAssignment_38213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputTexto__NameAssignment_58252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputTexto__ValorAssignment_7_18283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__InputBoton__VisibleAssignment_18319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputBoton__HabilitadoAssignment_28363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputBoton__NameAssignment_48402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__InputMultiple_Impl__VisibleAssignment_18438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputMultiple_Impl__HabilitadoAssignment_28482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputMultiple_Impl__NameAssignment_48521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputMultiple_Impl__ValoresAssignment_6_18552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__InputRadio__VisibleAssignment_18588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputRadio__HabilitadoAssignment_28632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__NameAssignment_48671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__ValoresAssignment_6_18702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputRadio__SeleccionAssignment_7_18733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__InputCombo__VisibleAssignment_18769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputCombo__HabilitadoAssignment_28813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__NameAssignment_48852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__ValoresAssignment_6_18883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCombo__SeleccionAssignment_7_18914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__InputCheck__VisibleAssignment_18950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__InputCheck__HabilitadoAssignment_28994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__NameAssignment_49033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__ValoresAssignment_6_19064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_7_29095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__InputCheck__SeleccionAssignment_7_3_19126 = new BitSet(new long[]{0x0000000000000002L});
    }


}