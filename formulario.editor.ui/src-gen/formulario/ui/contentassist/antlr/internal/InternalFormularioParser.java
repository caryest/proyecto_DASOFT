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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Formulario'", "'{'", "'}'", "'entradas'", "'Input'", "'InputTexto'", "'InputRadio'", "'InputCombo'", "'InputCheck'", "'InputBoton'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

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


    // $ANTLR start "entryRuleInput_Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:90:1: entryRuleInput_Impl : ruleInput_Impl EOF ;
    public final void entryRuleInput_Impl() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:91:1: ( ruleInput_Impl EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:92:1: ruleInput_Impl EOF
            {
             before(grammarAccess.getInput_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl123);
            ruleInput_Impl();

            state._fsp--;

             after(grammarAccess.getInput_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput_Impl130); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:99:1: ruleInput_Impl : ( ( rule__Input_Impl__Group__0 ) ) ;
    public final void ruleInput_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:103:2: ( ( ( rule__Input_Impl__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:104:1: ( ( rule__Input_Impl__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:104:1: ( ( rule__Input_Impl__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:105:1: ( rule__Input_Impl__Group__0 )
            {
             before(grammarAccess.getInput_ImplAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:106:1: ( rule__Input_Impl__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:106:2: rule__Input_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__0_in_ruleInput_Impl156);
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


    // $ANTLR start "entryRuleEString"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:118:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:119:1: ( ruleEString EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:120:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString183);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString190); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:127:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:131:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:132:1: ( ( rule__EString__Alternatives ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:132:1: ( ( rule__EString__Alternatives ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:133:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:134:1: ( rule__EString__Alternatives )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:134:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString216);
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


    // $ANTLR start "entryRuleInputTexto"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:146:1: entryRuleInputTexto : ruleInputTexto EOF ;
    public final void entryRuleInputTexto() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:147:1: ( ruleInputTexto EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:148:1: ruleInputTexto EOF
            {
             before(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto243);
            ruleInputTexto();

            state._fsp--;

             after(grammarAccess.getInputTextoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto250); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:155:1: ruleInputTexto : ( ( rule__InputTexto__Group__0 ) ) ;
    public final void ruleInputTexto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:159:2: ( ( ( rule__InputTexto__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:160:1: ( ( rule__InputTexto__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:160:1: ( ( rule__InputTexto__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:161:1: ( rule__InputTexto__Group__0 )
            {
             before(grammarAccess.getInputTextoAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:162:1: ( rule__InputTexto__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:162:2: rule__InputTexto__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__0_in_ruleInputTexto276);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:174:1: entryRuleInputRadio : ruleInputRadio EOF ;
    public final void entryRuleInputRadio() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:175:1: ( ruleInputRadio EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:176:1: ruleInputRadio EOF
            {
             before(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio303);
            ruleInputRadio();

            state._fsp--;

             after(grammarAccess.getInputRadioRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio310); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:183:1: ruleInputRadio : ( ( rule__InputRadio__Group__0 ) ) ;
    public final void ruleInputRadio() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:187:2: ( ( ( rule__InputRadio__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:188:1: ( ( rule__InputRadio__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:188:1: ( ( rule__InputRadio__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:189:1: ( rule__InputRadio__Group__0 )
            {
             before(grammarAccess.getInputRadioAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:190:1: ( rule__InputRadio__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:190:2: rule__InputRadio__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__0_in_ruleInputRadio336);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:202:1: entryRuleInputCombo : ruleInputCombo EOF ;
    public final void entryRuleInputCombo() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:203:1: ( ruleInputCombo EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:204:1: ruleInputCombo EOF
            {
             before(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo363);
            ruleInputCombo();

            state._fsp--;

             after(grammarAccess.getInputComboRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo370); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:211:1: ruleInputCombo : ( ( rule__InputCombo__Group__0 ) ) ;
    public final void ruleInputCombo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:215:2: ( ( ( rule__InputCombo__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:216:1: ( ( rule__InputCombo__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:216:1: ( ( rule__InputCombo__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:217:1: ( rule__InputCombo__Group__0 )
            {
             before(grammarAccess.getInputComboAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:218:1: ( rule__InputCombo__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:218:2: rule__InputCombo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__0_in_ruleInputCombo396);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:230:1: entryRuleInputCheck : ruleInputCheck EOF ;
    public final void entryRuleInputCheck() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:231:1: ( ruleInputCheck EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:232:1: ruleInputCheck EOF
            {
             before(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck423);
            ruleInputCheck();

            state._fsp--;

             after(grammarAccess.getInputCheckRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck430); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:239:1: ruleInputCheck : ( ( rule__InputCheck__Group__0 ) ) ;
    public final void ruleInputCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:243:2: ( ( ( rule__InputCheck__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:244:1: ( ( rule__InputCheck__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:244:1: ( ( rule__InputCheck__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:245:1: ( rule__InputCheck__Group__0 )
            {
             before(grammarAccess.getInputCheckAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:246:1: ( rule__InputCheck__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:246:2: rule__InputCheck__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__0_in_ruleInputCheck456);
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


    // $ANTLR start "entryRuleInputBoton"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:258:1: entryRuleInputBoton : ruleInputBoton EOF ;
    public final void entryRuleInputBoton() throws RecognitionException {
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:259:1: ( ruleInputBoton EOF )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:260:1: ruleInputBoton EOF
            {
             before(grammarAccess.getInputBotonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_entryRuleInputBoton483);
            ruleInputBoton();

            state._fsp--;

             after(grammarAccess.getInputBotonRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputBoton490); 

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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:267:1: ruleInputBoton : ( ( rule__InputBoton__Group__0 ) ) ;
    public final void ruleInputBoton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:271:2: ( ( ( rule__InputBoton__Group__0 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:272:1: ( ( rule__InputBoton__Group__0 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:272:1: ( ( rule__InputBoton__Group__0 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:273:1: ( rule__InputBoton__Group__0 )
            {
             before(grammarAccess.getInputBotonAccess().getGroup()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:274:1: ( rule__InputBoton__Group__0 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:274:2: rule__InputBoton__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__0_in_ruleInputBoton516);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:287:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:291:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:292:1: ( RULE_STRING )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:292:1: ( RULE_STRING )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:293:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives553); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:298:6: ( RULE_ID )
                    {
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:298:6: ( RULE_ID )
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:299:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives570); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:311:1: rule__Formulario__Group__0 : rule__Formulario__Group__0__Impl rule__Formulario__Group__1 ;
    public final void rule__Formulario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:315:1: ( rule__Formulario__Group__0__Impl rule__Formulario__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:316:2: rule__Formulario__Group__0__Impl rule__Formulario__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__0__Impl_in_rule__Formulario__Group__0600);
            rule__Formulario__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__1_in_rule__Formulario__Group__0603);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:323:1: rule__Formulario__Group__0__Impl : ( () ) ;
    public final void rule__Formulario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:327:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:328:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:328:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:329:1: ()
            {
             before(grammarAccess.getFormularioAccess().getFormularioAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:330:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:332:1: 
            {
            }

             after(grammarAccess.getFormularioAccess().getFormularioAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group__0__Impl"


    // $ANTLR start "rule__Formulario__Group__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:342:1: rule__Formulario__Group__1 : rule__Formulario__Group__1__Impl rule__Formulario__Group__2 ;
    public final void rule__Formulario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:346:1: ( rule__Formulario__Group__1__Impl rule__Formulario__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:347:2: rule__Formulario__Group__1__Impl rule__Formulario__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__1__Impl_in_rule__Formulario__Group__1661);
            rule__Formulario__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__2_in_rule__Formulario__Group__1664);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:354:1: rule__Formulario__Group__1__Impl : ( 'Formulario' ) ;
    public final void rule__Formulario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:358:1: ( ( 'Formulario' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:359:1: ( 'Formulario' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:359:1: ( 'Formulario' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:360:1: 'Formulario'
            {
             before(grammarAccess.getFormularioAccess().getFormularioKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Formulario__Group__1__Impl692); 
             after(grammarAccess.getFormularioAccess().getFormularioKeyword_1()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:373:1: rule__Formulario__Group__2 : rule__Formulario__Group__2__Impl rule__Formulario__Group__3 ;
    public final void rule__Formulario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:377:1: ( rule__Formulario__Group__2__Impl rule__Formulario__Group__3 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:378:2: rule__Formulario__Group__2__Impl rule__Formulario__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__2__Impl_in_rule__Formulario__Group__2723);
            rule__Formulario__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__3_in_rule__Formulario__Group__2726);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:385:1: rule__Formulario__Group__2__Impl : ( ( rule__Formulario__NameAssignment_2 ) ) ;
    public final void rule__Formulario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:389:1: ( ( ( rule__Formulario__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:390:1: ( ( rule__Formulario__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:390:1: ( ( rule__Formulario__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:391:1: ( rule__Formulario__NameAssignment_2 )
            {
             before(grammarAccess.getFormularioAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:392:1: ( rule__Formulario__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:392:2: rule__Formulario__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__NameAssignment_2_in_rule__Formulario__Group__2__Impl753);
            rule__Formulario__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormularioAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:402:1: rule__Formulario__Group__3 : rule__Formulario__Group__3__Impl rule__Formulario__Group__4 ;
    public final void rule__Formulario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:406:1: ( rule__Formulario__Group__3__Impl rule__Formulario__Group__4 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:407:2: rule__Formulario__Group__3__Impl rule__Formulario__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__3__Impl_in_rule__Formulario__Group__3783);
            rule__Formulario__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__4_in_rule__Formulario__Group__3786);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:414:1: rule__Formulario__Group__3__Impl : ( '{' ) ;
    public final void rule__Formulario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:418:1: ( ( '{' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:419:1: ( '{' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:419:1: ( '{' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:420:1: '{'
            {
             before(grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Formulario__Group__3__Impl814); 
             after(grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:433:1: rule__Formulario__Group__4 : rule__Formulario__Group__4__Impl rule__Formulario__Group__5 ;
    public final void rule__Formulario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:437:1: ( rule__Formulario__Group__4__Impl rule__Formulario__Group__5 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:438:2: rule__Formulario__Group__4__Impl rule__Formulario__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__4__Impl_in_rule__Formulario__Group__4845);
            rule__Formulario__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__5_in_rule__Formulario__Group__4848);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:445:1: rule__Formulario__Group__4__Impl : ( ( rule__Formulario__Group_4__0 )? ) ;
    public final void rule__Formulario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:449:1: ( ( ( rule__Formulario__Group_4__0 )? ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:450:1: ( ( rule__Formulario__Group_4__0 )? )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:450:1: ( ( rule__Formulario__Group_4__0 )? )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:451:1: ( rule__Formulario__Group_4__0 )?
            {
             before(grammarAccess.getFormularioAccess().getGroup_4()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:452:1: ( rule__Formulario__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:452:2: rule__Formulario__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group_4__0_in_rule__Formulario__Group__4__Impl875);
                    rule__Formulario__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormularioAccess().getGroup_4()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:462:1: rule__Formulario__Group__5 : rule__Formulario__Group__5__Impl ;
    public final void rule__Formulario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:466:1: ( rule__Formulario__Group__5__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:467:2: rule__Formulario__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group__5__Impl_in_rule__Formulario__Group__5906);
            rule__Formulario__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:473:1: rule__Formulario__Group__5__Impl : ( '}' ) ;
    public final void rule__Formulario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:477:1: ( ( '}' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:478:1: ( '}' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:478:1: ( '}' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:479:1: '}'
            {
             before(grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Formulario__Group__5__Impl934); 
             after(grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Formulario__Group_4__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:504:1: rule__Formulario__Group_4__0 : rule__Formulario__Group_4__0__Impl rule__Formulario__Group_4__1 ;
    public final void rule__Formulario__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:508:1: ( rule__Formulario__Group_4__0__Impl rule__Formulario__Group_4__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:509:2: rule__Formulario__Group_4__0__Impl rule__Formulario__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group_4__0__Impl_in_rule__Formulario__Group_4__0977);
            rule__Formulario__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group_4__1_in_rule__Formulario__Group_4__0980);
            rule__Formulario__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group_4__0"


    // $ANTLR start "rule__Formulario__Group_4__0__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:516:1: rule__Formulario__Group_4__0__Impl : ( 'entradas' ) ;
    public final void rule__Formulario__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:520:1: ( ( 'entradas' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:521:1: ( 'entradas' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:521:1: ( 'entradas' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:522:1: 'entradas'
            {
             before(grammarAccess.getFormularioAccess().getEntradasKeyword_4_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Formulario__Group_4__0__Impl1008); 
             after(grammarAccess.getFormularioAccess().getEntradasKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group_4__0__Impl"


    // $ANTLR start "rule__Formulario__Group_4__1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:535:1: rule__Formulario__Group_4__1 : rule__Formulario__Group_4__1__Impl ;
    public final void rule__Formulario__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:539:1: ( rule__Formulario__Group_4__1__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:540:2: rule__Formulario__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__Group_4__1__Impl_in_rule__Formulario__Group_4__11039);
            rule__Formulario__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group_4__1"


    // $ANTLR start "rule__Formulario__Group_4__1__Impl"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:546:1: rule__Formulario__Group_4__1__Impl : ( ( rule__Formulario__EntradasAssignment_4_1 ) ) ;
    public final void rule__Formulario__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:550:1: ( ( ( rule__Formulario__EntradasAssignment_4_1 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:551:1: ( ( rule__Formulario__EntradasAssignment_4_1 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:551:1: ( ( rule__Formulario__EntradasAssignment_4_1 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:552:1: ( rule__Formulario__EntradasAssignment_4_1 )
            {
             before(grammarAccess.getFormularioAccess().getEntradasAssignment_4_1()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:553:1: ( rule__Formulario__EntradasAssignment_4_1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:553:2: rule__Formulario__EntradasAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Formulario__EntradasAssignment_4_1_in_rule__Formulario__Group_4__1__Impl1066);
            rule__Formulario__EntradasAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFormularioAccess().getEntradasAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__Group_4__1__Impl"


    // $ANTLR start "rule__Input_Impl__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:567:1: rule__Input_Impl__Group__0 : rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1 ;
    public final void rule__Input_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:571:1: ( rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:572:2: rule__Input_Impl__Group__0__Impl rule__Input_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__0__Impl_in_rule__Input_Impl__Group__01100);
            rule__Input_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__1_in_rule__Input_Impl__Group__01103);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:579:1: rule__Input_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Input_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:583:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:584:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:584:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:585:1: ()
            {
             before(grammarAccess.getInput_ImplAccess().getInputAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:586:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:588:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:598:1: rule__Input_Impl__Group__1 : rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2 ;
    public final void rule__Input_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:602:1: ( rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:603:2: rule__Input_Impl__Group__1__Impl rule__Input_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__1__Impl_in_rule__Input_Impl__Group__11161);
            rule__Input_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__2_in_rule__Input_Impl__Group__11164);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:610:1: rule__Input_Impl__Group__1__Impl : ( 'Input' ) ;
    public final void rule__Input_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:614:1: ( ( 'Input' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:615:1: ( 'Input' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:615:1: ( 'Input' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:616:1: 'Input'
            {
             before(grammarAccess.getInput_ImplAccess().getInputKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Input_Impl__Group__1__Impl1192); 
             after(grammarAccess.getInput_ImplAccess().getInputKeyword_1()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:629:1: rule__Input_Impl__Group__2 : rule__Input_Impl__Group__2__Impl ;
    public final void rule__Input_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:633:1: ( rule__Input_Impl__Group__2__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:634:2: rule__Input_Impl__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__Group__2__Impl_in_rule__Input_Impl__Group__21223);
            rule__Input_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:640:1: rule__Input_Impl__Group__2__Impl : ( ( rule__Input_Impl__NameAssignment_2 ) ) ;
    public final void rule__Input_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:644:1: ( ( ( rule__Input_Impl__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:645:1: ( ( rule__Input_Impl__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:645:1: ( ( rule__Input_Impl__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:646:1: ( rule__Input_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getInput_ImplAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:647:1: ( rule__Input_Impl__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:647:2: rule__Input_Impl__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Input_Impl__NameAssignment_2_in_rule__Input_Impl__Group__2__Impl1250);
            rule__Input_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInput_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputTexto__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:663:1: rule__InputTexto__Group__0 : rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1 ;
    public final void rule__InputTexto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:667:1: ( rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:668:2: rule__InputTexto__Group__0__Impl rule__InputTexto__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__0__Impl_in_rule__InputTexto__Group__01286);
            rule__InputTexto__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__1_in_rule__InputTexto__Group__01289);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:675:1: rule__InputTexto__Group__0__Impl : ( () ) ;
    public final void rule__InputTexto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:679:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:680:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:680:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:681:1: ()
            {
             before(grammarAccess.getInputTextoAccess().getInputTextoAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:682:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:684:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:694:1: rule__InputTexto__Group__1 : rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2 ;
    public final void rule__InputTexto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:698:1: ( rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:699:2: rule__InputTexto__Group__1__Impl rule__InputTexto__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__1__Impl_in_rule__InputTexto__Group__11347);
            rule__InputTexto__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__2_in_rule__InputTexto__Group__11350);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:706:1: rule__InputTexto__Group__1__Impl : ( 'InputTexto' ) ;
    public final void rule__InputTexto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:710:1: ( ( 'InputTexto' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:711:1: ( 'InputTexto' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:711:1: ( 'InputTexto' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:712:1: 'InputTexto'
            {
             before(grammarAccess.getInputTextoAccess().getInputTextoKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__InputTexto__Group__1__Impl1378); 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:725:1: rule__InputTexto__Group__2 : rule__InputTexto__Group__2__Impl ;
    public final void rule__InputTexto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:729:1: ( rule__InputTexto__Group__2__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:730:2: rule__InputTexto__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__Group__2__Impl_in_rule__InputTexto__Group__21409);
            rule__InputTexto__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:736:1: rule__InputTexto__Group__2__Impl : ( ( rule__InputTexto__NameAssignment_2 ) ) ;
    public final void rule__InputTexto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:740:1: ( ( ( rule__InputTexto__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:741:1: ( ( rule__InputTexto__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:741:1: ( ( rule__InputTexto__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:742:1: ( rule__InputTexto__NameAssignment_2 )
            {
             before(grammarAccess.getInputTextoAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:743:1: ( rule__InputTexto__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:743:2: rule__InputTexto__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputTexto__NameAssignment_2_in_rule__InputTexto__Group__2__Impl1436);
            rule__InputTexto__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputTextoAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputRadio__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:759:1: rule__InputRadio__Group__0 : rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1 ;
    public final void rule__InputRadio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:763:1: ( rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:764:2: rule__InputRadio__Group__0__Impl rule__InputRadio__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__0__Impl_in_rule__InputRadio__Group__01472);
            rule__InputRadio__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__1_in_rule__InputRadio__Group__01475);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:771:1: rule__InputRadio__Group__0__Impl : ( () ) ;
    public final void rule__InputRadio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:775:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:776:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:776:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:777:1: ()
            {
             before(grammarAccess.getInputRadioAccess().getInputRadioAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:778:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:780:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:790:1: rule__InputRadio__Group__1 : rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2 ;
    public final void rule__InputRadio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:794:1: ( rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:795:2: rule__InputRadio__Group__1__Impl rule__InputRadio__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__1__Impl_in_rule__InputRadio__Group__11533);
            rule__InputRadio__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__2_in_rule__InputRadio__Group__11536);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:802:1: rule__InputRadio__Group__1__Impl : ( 'InputRadio' ) ;
    public final void rule__InputRadio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:806:1: ( ( 'InputRadio' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:807:1: ( 'InputRadio' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:807:1: ( 'InputRadio' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:808:1: 'InputRadio'
            {
             before(grammarAccess.getInputRadioAccess().getInputRadioKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__InputRadio__Group__1__Impl1564); 
             after(grammarAccess.getInputRadioAccess().getInputRadioKeyword_1()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:821:1: rule__InputRadio__Group__2 : rule__InputRadio__Group__2__Impl ;
    public final void rule__InputRadio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:825:1: ( rule__InputRadio__Group__2__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:826:2: rule__InputRadio__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__Group__2__Impl_in_rule__InputRadio__Group__21595);
            rule__InputRadio__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:832:1: rule__InputRadio__Group__2__Impl : ( ( rule__InputRadio__NameAssignment_2 ) ) ;
    public final void rule__InputRadio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:836:1: ( ( ( rule__InputRadio__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:837:1: ( ( rule__InputRadio__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:837:1: ( ( rule__InputRadio__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:838:1: ( rule__InputRadio__NameAssignment_2 )
            {
             before(grammarAccess.getInputRadioAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:839:1: ( rule__InputRadio__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:839:2: rule__InputRadio__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputRadio__NameAssignment_2_in_rule__InputRadio__Group__2__Impl1622);
            rule__InputRadio__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputRadioAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputCombo__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:855:1: rule__InputCombo__Group__0 : rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1 ;
    public final void rule__InputCombo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:859:1: ( rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:860:2: rule__InputCombo__Group__0__Impl rule__InputCombo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__0__Impl_in_rule__InputCombo__Group__01658);
            rule__InputCombo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__1_in_rule__InputCombo__Group__01661);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:867:1: rule__InputCombo__Group__0__Impl : ( () ) ;
    public final void rule__InputCombo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:871:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:872:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:872:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:873:1: ()
            {
             before(grammarAccess.getInputComboAccess().getInputComboAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:874:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:876:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:886:1: rule__InputCombo__Group__1 : rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2 ;
    public final void rule__InputCombo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:890:1: ( rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:891:2: rule__InputCombo__Group__1__Impl rule__InputCombo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__1__Impl_in_rule__InputCombo__Group__11719);
            rule__InputCombo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__2_in_rule__InputCombo__Group__11722);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:898:1: rule__InputCombo__Group__1__Impl : ( 'InputCombo' ) ;
    public final void rule__InputCombo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:902:1: ( ( 'InputCombo' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:903:1: ( 'InputCombo' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:903:1: ( 'InputCombo' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:904:1: 'InputCombo'
            {
             before(grammarAccess.getInputComboAccess().getInputComboKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__InputCombo__Group__1__Impl1750); 
             after(grammarAccess.getInputComboAccess().getInputComboKeyword_1()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:917:1: rule__InputCombo__Group__2 : rule__InputCombo__Group__2__Impl ;
    public final void rule__InputCombo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:921:1: ( rule__InputCombo__Group__2__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:922:2: rule__InputCombo__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__Group__2__Impl_in_rule__InputCombo__Group__21781);
            rule__InputCombo__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:928:1: rule__InputCombo__Group__2__Impl : ( ( rule__InputCombo__NameAssignment_2 ) ) ;
    public final void rule__InputCombo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:932:1: ( ( ( rule__InputCombo__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:933:1: ( ( rule__InputCombo__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:933:1: ( ( rule__InputCombo__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:934:1: ( rule__InputCombo__NameAssignment_2 )
            {
             before(grammarAccess.getInputComboAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:935:1: ( rule__InputCombo__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:935:2: rule__InputCombo__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCombo__NameAssignment_2_in_rule__InputCombo__Group__2__Impl1808);
            rule__InputCombo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputComboAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputCheck__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:951:1: rule__InputCheck__Group__0 : rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1 ;
    public final void rule__InputCheck__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:955:1: ( rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:956:2: rule__InputCheck__Group__0__Impl rule__InputCheck__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__0__Impl_in_rule__InputCheck__Group__01844);
            rule__InputCheck__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__1_in_rule__InputCheck__Group__01847);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:963:1: rule__InputCheck__Group__0__Impl : ( () ) ;
    public final void rule__InputCheck__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:967:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:968:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:968:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:969:1: ()
            {
             before(grammarAccess.getInputCheckAccess().getInputCheckAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:970:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:972:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:982:1: rule__InputCheck__Group__1 : rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2 ;
    public final void rule__InputCheck__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:986:1: ( rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:987:2: rule__InputCheck__Group__1__Impl rule__InputCheck__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__1__Impl_in_rule__InputCheck__Group__11905);
            rule__InputCheck__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__2_in_rule__InputCheck__Group__11908);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:994:1: rule__InputCheck__Group__1__Impl : ( 'InputCheck' ) ;
    public final void rule__InputCheck__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:998:1: ( ( 'InputCheck' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:999:1: ( 'InputCheck' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:999:1: ( 'InputCheck' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1000:1: 'InputCheck'
            {
             before(grammarAccess.getInputCheckAccess().getInputCheckKeyword_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__InputCheck__Group__1__Impl1936); 
             after(grammarAccess.getInputCheckAccess().getInputCheckKeyword_1()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1013:1: rule__InputCheck__Group__2 : rule__InputCheck__Group__2__Impl ;
    public final void rule__InputCheck__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1017:1: ( rule__InputCheck__Group__2__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1018:2: rule__InputCheck__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__Group__2__Impl_in_rule__InputCheck__Group__21967);
            rule__InputCheck__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1024:1: rule__InputCheck__Group__2__Impl : ( ( rule__InputCheck__NameAssignment_2 ) ) ;
    public final void rule__InputCheck__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1028:1: ( ( ( rule__InputCheck__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1029:1: ( ( rule__InputCheck__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1029:1: ( ( rule__InputCheck__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1030:1: ( rule__InputCheck__NameAssignment_2 )
            {
             before(grammarAccess.getInputCheckAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1031:1: ( rule__InputCheck__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1031:2: rule__InputCheck__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputCheck__NameAssignment_2_in_rule__InputCheck__Group__2__Impl1994);
            rule__InputCheck__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputCheckAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputBoton__Group__0"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1047:1: rule__InputBoton__Group__0 : rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1 ;
    public final void rule__InputBoton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1051:1: ( rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1052:2: rule__InputBoton__Group__0__Impl rule__InputBoton__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__0__Impl_in_rule__InputBoton__Group__02030);
            rule__InputBoton__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__1_in_rule__InputBoton__Group__02033);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1059:1: rule__InputBoton__Group__0__Impl : ( () ) ;
    public final void rule__InputBoton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1063:1: ( ( () ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1064:1: ( () )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1064:1: ( () )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1065:1: ()
            {
             before(grammarAccess.getInputBotonAccess().getInputBotonAction_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1066:1: ()
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1068:1: 
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1078:1: rule__InputBoton__Group__1 : rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2 ;
    public final void rule__InputBoton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1082:1: ( rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1083:2: rule__InputBoton__Group__1__Impl rule__InputBoton__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__1__Impl_in_rule__InputBoton__Group__12091);
            rule__InputBoton__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__2_in_rule__InputBoton__Group__12094);
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1090:1: rule__InputBoton__Group__1__Impl : ( 'InputBoton' ) ;
    public final void rule__InputBoton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1094:1: ( ( 'InputBoton' ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1095:1: ( 'InputBoton' )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1095:1: ( 'InputBoton' )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1096:1: 'InputBoton'
            {
             before(grammarAccess.getInputBotonAccess().getInputBotonKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__InputBoton__Group__1__Impl2122); 
             after(grammarAccess.getInputBotonAccess().getInputBotonKeyword_1()); 

            }


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1109:1: rule__InputBoton__Group__2 : rule__InputBoton__Group__2__Impl ;
    public final void rule__InputBoton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1113:1: ( rule__InputBoton__Group__2__Impl )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1114:2: rule__InputBoton__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__Group__2__Impl_in_rule__InputBoton__Group__22153);
            rule__InputBoton__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1120:1: rule__InputBoton__Group__2__Impl : ( ( rule__InputBoton__NameAssignment_2 ) ) ;
    public final void rule__InputBoton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1124:1: ( ( ( rule__InputBoton__NameAssignment_2 ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1125:1: ( ( rule__InputBoton__NameAssignment_2 ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1125:1: ( ( rule__InputBoton__NameAssignment_2 ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1126:1: ( rule__InputBoton__NameAssignment_2 )
            {
             before(grammarAccess.getInputBotonAccess().getNameAssignment_2()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1127:1: ( rule__InputBoton__NameAssignment_2 )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1127:2: rule__InputBoton__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__InputBoton__NameAssignment_2_in_rule__InputBoton__Group__2__Impl2180);
            rule__InputBoton__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputBotonAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Formulario__NameAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1144:1: rule__Formulario__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Formulario__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1148:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1149:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1149:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1150:1: ruleEString
            {
             before(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Formulario__NameAssignment_22221);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__NameAssignment_2"


    // $ANTLR start "rule__Formulario__EntradasAssignment_4_1"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1159:1: rule__Formulario__EntradasAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Formulario__EntradasAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1163:1: ( ( ( ruleEString ) ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1164:1: ( ( ruleEString ) )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1164:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1165:1: ( ruleEString )
            {
             before(grammarAccess.getFormularioAccess().getEntradasInputCrossReference_4_1_0()); 
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1166:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1167:1: ruleEString
            {
             before(grammarAccess.getFormularioAccess().getEntradasInputEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Formulario__EntradasAssignment_4_12256);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormularioAccess().getEntradasInputEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFormularioAccess().getEntradasInputCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formulario__EntradasAssignment_4_1"


    // $ANTLR start "rule__Input_Impl__NameAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1178:1: rule__Input_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Input_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1182:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1183:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1183:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1184:1: ruleEString
            {
             before(grammarAccess.getInput_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Input_Impl__NameAssignment_22291);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInput_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input_Impl__NameAssignment_2"


    // $ANTLR start "rule__InputTexto__NameAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1193:1: rule__InputTexto__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputTexto__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1197:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1198:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1198:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1199:1: ruleEString
            {
             before(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputTexto__NameAssignment_22322);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputTexto__NameAssignment_2"


    // $ANTLR start "rule__InputRadio__NameAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1208:1: rule__InputRadio__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputRadio__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1212:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1213:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1213:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1214:1: ruleEString
            {
             before(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputRadio__NameAssignment_22353);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputRadio__NameAssignment_2"


    // $ANTLR start "rule__InputCombo__NameAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1223:1: rule__InputCombo__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputCombo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1227:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1228:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1228:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1229:1: ruleEString
            {
             before(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCombo__NameAssignment_22384);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCombo__NameAssignment_2"


    // $ANTLR start "rule__InputCheck__NameAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1238:1: rule__InputCheck__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputCheck__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1242:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1243:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1243:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1244:1: ruleEString
            {
             before(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputCheck__NameAssignment_22415);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputCheck__NameAssignment_2"


    // $ANTLR start "rule__InputBoton__NameAssignment_2"
    // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1253:1: rule__InputBoton__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__InputBoton__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1257:1: ( ( ruleEString ) )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1258:1: ( ruleEString )
            {
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1258:1: ( ruleEString )
            // ../formulario.editor.ui/src-gen/formulario/ui/contentassist/antlr/internal/InternalFormulario.g:1259:1: ruleEString
            {
             before(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__InputBoton__NameAssignment_22446);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputBoton__NameAssignment_2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormulario_in_entryRuleFormulario61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulario68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__0_in_ruleFormulario94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput_Impl130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__0_in_ruleInput_Impl156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__0_in_ruleInputTexto276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__0_in_ruleInputRadio336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__0_in_ruleInputCombo396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__0_in_ruleInputCheck456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_entryRuleInputBoton483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputBoton490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__0_in_ruleInputBoton516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__0__Impl_in_rule__Formulario__Group__0600 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Formulario__Group__1_in_rule__Formulario__Group__0603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__1__Impl_in_rule__Formulario__Group__1661 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Formulario__Group__2_in_rule__Formulario__Group__1664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Formulario__Group__1__Impl692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__2__Impl_in_rule__Formulario__Group__2723 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__3_in_rule__Formulario__Group__2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__NameAssignment_2_in_rule__Formulario__Group__2__Impl753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__3__Impl_in_rule__Formulario__Group__3783 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__4_in_rule__Formulario__Group__3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Formulario__Group__3__Impl814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__4__Impl_in_rule__Formulario__Group__4845 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_rule__Formulario__Group__5_in_rule__Formulario__Group__4848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group_4__0_in_rule__Formulario__Group__4__Impl875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group__5__Impl_in_rule__Formulario__Group__5906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Formulario__Group__5__Impl934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group_4__0__Impl_in_rule__Formulario__Group_4__0977 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Formulario__Group_4__1_in_rule__Formulario__Group_4__0980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Formulario__Group_4__0__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__Group_4__1__Impl_in_rule__Formulario__Group_4__11039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Formulario__EntradasAssignment_4_1_in_rule__Formulario__Group_4__1__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__0__Impl_in_rule__Input_Impl__Group__01100 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__1_in_rule__Input_Impl__Group__01103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__1__Impl_in_rule__Input_Impl__Group__11161 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__2_in_rule__Input_Impl__Group__11164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Input_Impl__Group__1__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__Group__2__Impl_in_rule__Input_Impl__Group__21223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Input_Impl__NameAssignment_2_in_rule__Input_Impl__Group__2__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__0__Impl_in_rule__InputTexto__Group__01286 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__1_in_rule__InputTexto__Group__01289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__1__Impl_in_rule__InputTexto__Group__11347 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__2_in_rule__InputTexto__Group__11350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__InputTexto__Group__1__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__Group__2__Impl_in_rule__InputTexto__Group__21409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputTexto__NameAssignment_2_in_rule__InputTexto__Group__2__Impl1436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__0__Impl_in_rule__InputRadio__Group__01472 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__1_in_rule__InputRadio__Group__01475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__1__Impl_in_rule__InputRadio__Group__11533 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__2_in_rule__InputRadio__Group__11536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__InputRadio__Group__1__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__Group__2__Impl_in_rule__InputRadio__Group__21595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputRadio__NameAssignment_2_in_rule__InputRadio__Group__2__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__0__Impl_in_rule__InputCombo__Group__01658 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__1_in_rule__InputCombo__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__1__Impl_in_rule__InputCombo__Group__11719 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__2_in_rule__InputCombo__Group__11722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__InputCombo__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__Group__2__Impl_in_rule__InputCombo__Group__21781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCombo__NameAssignment_2_in_rule__InputCombo__Group__2__Impl1808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__0__Impl_in_rule__InputCheck__Group__01844 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__1_in_rule__InputCheck__Group__01847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__1__Impl_in_rule__InputCheck__Group__11905 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__2_in_rule__InputCheck__Group__11908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__InputCheck__Group__1__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__Group__2__Impl_in_rule__InputCheck__Group__21967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputCheck__NameAssignment_2_in_rule__InputCheck__Group__2__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__0__Impl_in_rule__InputBoton__Group__02030 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__1_in_rule__InputBoton__Group__02033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__1__Impl_in_rule__InputBoton__Group__12091 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__2_in_rule__InputBoton__Group__12094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__InputBoton__Group__1__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__Group__2__Impl_in_rule__InputBoton__Group__22153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__InputBoton__NameAssignment_2_in_rule__InputBoton__Group__2__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Formulario__NameAssignment_22221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Formulario__EntradasAssignment_4_12256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Input_Impl__NameAssignment_22291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputTexto__NameAssignment_22322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputRadio__NameAssignment_22353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCombo__NameAssignment_22384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputCheck__NameAssignment_22415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__InputBoton__NameAssignment_22446 = new BitSet(new long[]{0x0000000000000002L});
    }


}