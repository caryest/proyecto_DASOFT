package formulario.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import formulario.services.FormularioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFormularioParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Formulario'", "'{'", "'entradas'", "'}'", "'Input'", "'InputTexto'", "'InputRadio'", "'InputCombo'", "'InputCheck'", "'InputBoton'"
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
    public String getGrammarFileName() { return "../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g"; }



     	private FormularioGrammarAccess grammarAccess;
     	
        public InternalFormularioParser(TokenStream input, FormularioGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Formulario";	
       	}
       	
       	@Override
       	protected FormularioGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFormulario"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:67:1: entryRuleFormulario returns [EObject current=null] : iv_ruleFormulario= ruleFormulario EOF ;
    public final EObject entryRuleFormulario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulario = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:68:2: (iv_ruleFormulario= ruleFormulario EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:69:2: iv_ruleFormulario= ruleFormulario EOF
            {
             newCompositeNode(grammarAccess.getFormularioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFormulario_in_entryRuleFormulario75);
            iv_ruleFormulario=ruleFormulario();

            state._fsp--;

             current =iv_ruleFormulario; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormulario85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormulario"


    // $ANTLR start "ruleFormulario"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:76:1: ruleFormulario returns [EObject current=null] : ( () otherlv_1= 'Formulario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entradas' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFormulario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:79:28: ( ( () otherlv_1= 'Formulario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entradas' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: ( () otherlv_1= 'Formulario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entradas' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: ( () otherlv_1= 'Formulario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entradas' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:2: () otherlv_1= 'Formulario' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entradas' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFormularioAccess().getFormularioAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFormulario131); 

                	newLeafNode(otherlv_1, grammarAccess.getFormularioAccess().getFormularioKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:91:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:92:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFormulario152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormularioRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFormulario164); 

                	newLeafNode(otherlv_3, grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:112:1: (otherlv_4= 'entradas' ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:112:3: otherlv_4= 'entradas' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFormulario177); 

                        	newLeafNode(otherlv_4, grammarAccess.getFormularioAccess().getEntradasKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:116:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:117:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:117:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:118:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormularioRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getFormularioAccess().getEntradasInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFormulario200);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFormulario214); 

                	newLeafNode(otherlv_6, grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormulario"


    // $ANTLR start "entryRuleInput_Impl"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:145:1: entryRuleInput_Impl returns [EObject current=null] : iv_ruleInput_Impl= ruleInput_Impl EOF ;
    public final EObject entryRuleInput_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:146:2: (iv_ruleInput_Impl= ruleInput_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:147:2: iv_ruleInput_Impl= ruleInput_Impl EOF
            {
             newCompositeNode(grammarAccess.getInput_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl252);
            iv_ruleInput_Impl=ruleInput_Impl();

            state._fsp--;

             current =iv_ruleInput_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput_Impl262); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput_Impl"


    // $ANTLR start "ruleInput_Impl"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:154:1: ruleInput_Impl returns [EObject current=null] : ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInput_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:157:28: ( ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:158:1: ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:158:1: ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:158:2: () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:158:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:159:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInput_ImplAccess().getInputAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInput_Impl308); 

                	newLeafNode(otherlv_1, grammarAccess.getInput_ImplAccess().getInputKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:168:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:169:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:169:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:170:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInput_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInput_Impl329);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInput_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput_Impl"


    // $ANTLR start "entryRuleEString"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:194:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:195:2: (iv_ruleEString= ruleEString EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:196:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString366);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString377); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:203:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:206:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:207:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:207:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:207:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString417); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:215:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString443); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleInputTexto"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:230:1: entryRuleInputTexto returns [EObject current=null] : iv_ruleInputTexto= ruleInputTexto EOF ;
    public final EObject entryRuleInputTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTexto = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:231:2: (iv_ruleInputTexto= ruleInputTexto EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:232:2: iv_ruleInputTexto= ruleInputTexto EOF
            {
             newCompositeNode(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto488);
            iv_ruleInputTexto=ruleInputTexto();

            state._fsp--;

             current =iv_ruleInputTexto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputTexto"


    // $ANTLR start "ruleInputTexto"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:239:1: ruleInputTexto returns [EObject current=null] : ( () otherlv_1= 'InputTexto' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInputTexto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:242:28: ( ( () otherlv_1= 'InputTexto' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:243:1: ( () otherlv_1= 'InputTexto' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:243:1: ( () otherlv_1= 'InputTexto' ( (lv_name_2_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:243:2: () otherlv_1= 'InputTexto' ( (lv_name_2_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:243:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:244:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputTextoAccess().getInputTextoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInputTexto544); 

                	newLeafNode(otherlv_1, grammarAccess.getInputTextoAccess().getInputTextoKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:253:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:254:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:254:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:255:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto565);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputTextoRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputTexto"


    // $ANTLR start "entryRuleInputRadio"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:279:1: entryRuleInputRadio returns [EObject current=null] : iv_ruleInputRadio= ruleInputRadio EOF ;
    public final EObject entryRuleInputRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRadio = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:280:2: (iv_ruleInputRadio= ruleInputRadio EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:281:2: iv_ruleInputRadio= ruleInputRadio EOF
            {
             newCompositeNode(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio601);
            iv_ruleInputRadio=ruleInputRadio();

            state._fsp--;

             current =iv_ruleInputRadio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio611); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputRadio"


    // $ANTLR start "ruleInputRadio"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:288:1: ruleInputRadio returns [EObject current=null] : ( () otherlv_1= 'InputRadio' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInputRadio() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:291:28: ( ( () otherlv_1= 'InputRadio' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:292:1: ( () otherlv_1= 'InputRadio' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:292:1: ( () otherlv_1= 'InputRadio' ( (lv_name_2_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:292:2: () otherlv_1= 'InputRadio' ( (lv_name_2_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:292:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:293:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputRadioAccess().getInputRadioAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio657); 

                	newLeafNode(otherlv_1, grammarAccess.getInputRadioAccess().getInputRadioKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:302:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:303:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:303:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:304:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio678);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputRadio"


    // $ANTLR start "entryRuleInputCombo"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:328:1: entryRuleInputCombo returns [EObject current=null] : iv_ruleInputCombo= ruleInputCombo EOF ;
    public final EObject entryRuleInputCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCombo = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:329:2: (iv_ruleInputCombo= ruleInputCombo EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:330:2: iv_ruleInputCombo= ruleInputCombo EOF
            {
             newCompositeNode(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo714);
            iv_ruleInputCombo=ruleInputCombo();

            state._fsp--;

             current =iv_ruleInputCombo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo724); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputCombo"


    // $ANTLR start "ruleInputCombo"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:337:1: ruleInputCombo returns [EObject current=null] : ( () otherlv_1= 'InputCombo' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInputCombo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:340:28: ( ( () otherlv_1= 'InputCombo' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:341:1: ( () otherlv_1= 'InputCombo' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:341:1: ( () otherlv_1= 'InputCombo' ( (lv_name_2_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:341:2: () otherlv_1= 'InputCombo' ( (lv_name_2_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:341:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:342:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputComboAccess().getInputComboAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleInputCombo770); 

                	newLeafNode(otherlv_1, grammarAccess.getInputComboAccess().getInputComboKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:351:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:352:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:352:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:353:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo791);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputComboRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputCombo"


    // $ANTLR start "entryRuleInputCheck"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:377:1: entryRuleInputCheck returns [EObject current=null] : iv_ruleInputCheck= ruleInputCheck EOF ;
    public final EObject entryRuleInputCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCheck = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:378:2: (iv_ruleInputCheck= ruleInputCheck EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:379:2: iv_ruleInputCheck= ruleInputCheck EOF
            {
             newCompositeNode(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck827);
            iv_ruleInputCheck=ruleInputCheck();

            state._fsp--;

             current =iv_ruleInputCheck; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputCheck"


    // $ANTLR start "ruleInputCheck"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:386:1: ruleInputCheck returns [EObject current=null] : ( () otherlv_1= 'InputCheck' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInputCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:389:28: ( ( () otherlv_1= 'InputCheck' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:390:1: ( () otherlv_1= 'InputCheck' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:390:1: ( () otherlv_1= 'InputCheck' ( (lv_name_2_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:390:2: () otherlv_1= 'InputCheck' ( (lv_name_2_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:390:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:391:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputCheckAccess().getInputCheckAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInputCheck883); 

                	newLeafNode(otherlv_1, grammarAccess.getInputCheckAccess().getInputCheckKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:400:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:401:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:401:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:402:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck904);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputCheck"


    // $ANTLR start "entryRuleInputBoton"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:426:1: entryRuleInputBoton returns [EObject current=null] : iv_ruleInputBoton= ruleInputBoton EOF ;
    public final EObject entryRuleInputBoton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBoton = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:427:2: (iv_ruleInputBoton= ruleInputBoton EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:428:2: iv_ruleInputBoton= ruleInputBoton EOF
            {
             newCompositeNode(grammarAccess.getInputBotonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_entryRuleInputBoton940);
            iv_ruleInputBoton=ruleInputBoton();

            state._fsp--;

             current =iv_ruleInputBoton; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputBoton950); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputBoton"


    // $ANTLR start "ruleInputBoton"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:435:1: ruleInputBoton returns [EObject current=null] : ( () otherlv_1= 'InputBoton' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInputBoton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:438:28: ( ( () otherlv_1= 'InputBoton' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:439:1: ( () otherlv_1= 'InputBoton' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:439:1: ( () otherlv_1= 'InputBoton' ( (lv_name_2_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:439:2: () otherlv_1= 'InputBoton' ( (lv_name_2_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:439:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:440:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputBotonAccess().getInputBotonAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInputBoton996); 

                	newLeafNode(otherlv_1, grammarAccess.getInputBotonAccess().getInputBotonKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:449:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:450:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:450:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:451:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputBoton1017);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputBotonRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputBoton"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormulario_in_entryRuleFormulario75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulario85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFormulario131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFormulario152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFormulario164 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleFormulario177 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFormulario200 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFormulario214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput_Impl262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleInput_Impl308 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInput_Impl329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleInputTexto544 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio657 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo714 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleInputCombo770 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleInputCheck883 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_entryRuleInputBoton940 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputBoton950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleInputBoton996 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputBoton1017 = new BitSet(new long[]{0x0000000000000002L});
    }


}