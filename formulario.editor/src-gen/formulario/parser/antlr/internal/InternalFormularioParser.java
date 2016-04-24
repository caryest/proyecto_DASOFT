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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'comprobarAsercion'", "'comprobarAccion'", "'Formulario'", "'{'", "'}'", "'Layout'", "'anchura'", "'altura'", "'entradas'", "','", "'PruebaInterfaz'", "'-'", "'visible'", "'habilitado'", "'Input'", "'obligatorio'", "'InputTexto'", "'valor'", "'InputBoton'", "'InputMultiple'", "'valores'", "'InputRadio'", "'seleccion'", "'InputCombo'", "'InputCheck'"
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:76:1: ruleFormulario returns [EObject current=null] : ( ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}' ) ;
    public final EObject ruleFormulario() throws RecognitionException {
        EObject current = null;

        Token lv_comprobarAsercion_0_0=null;
        Token lv_comprobarAccion_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_layout_5_0 = null;

        EObject lv_pruebas_6_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:79:28: ( ( ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: ( ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: ( ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:2: ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:2: ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:81:1: (lv_comprobarAsercion_0_0= 'comprobarAsercion' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:81:1: (lv_comprobarAsercion_0_0= 'comprobarAsercion' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:82:3: lv_comprobarAsercion_0_0= 'comprobarAsercion'
                    {
                    lv_comprobarAsercion_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFormulario128); 

                            newLeafNode(lv_comprobarAsercion_0_0, grammarAccess.getFormularioAccess().getComprobarAsercionComprobarAsercionKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormularioRule());
                    	        }
                           		setWithLastConsumed(current, "comprobarAsercion", true, "comprobarAsercion");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:95:3: ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:96:1: (lv_comprobarAccion_1_0= 'comprobarAccion' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:96:1: (lv_comprobarAccion_1_0= 'comprobarAccion' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:97:3: lv_comprobarAccion_1_0= 'comprobarAccion'
                    {
                    lv_comprobarAccion_1_0=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFormulario160); 

                            newLeafNode(lv_comprobarAccion_1_0, grammarAccess.getFormularioAccess().getComprobarAccionComprobarAccionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormularioRule());
                    	        }
                           		setWithLastConsumed(current, "comprobarAccion", true, "comprobarAccion");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFormulario186); 

                	newLeafNode(otherlv_2, grammarAccess.getFormularioAccess().getFormularioKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:114:1: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:115:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:115:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:116:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFormulario207);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormularioRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFormulario219); 

                	newLeafNode(otherlv_4, grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:136:1: ( (lv_layout_5_0= ruleLayout ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:137:1: (lv_layout_5_0= ruleLayout )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:137:1: (lv_layout_5_0= ruleLayout )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:138:3: lv_layout_5_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getFormularioAccess().getLayoutLayoutParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleFormulario240);
            lv_layout_5_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormularioRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_5_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:154:2: ( (lv_pruebas_6_0= rulePruebaInterfaz ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:155:1: (lv_pruebas_6_0= rulePruebaInterfaz )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:155:1: (lv_pruebas_6_0= rulePruebaInterfaz )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:156:3: lv_pruebas_6_0= rulePruebaInterfaz
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormularioAccess().getPruebasPruebaInterfazParserRuleCall_6_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_ruleFormulario261);
                    lv_pruebas_6_0=rulePruebaInterfaz();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormularioRule());
                    	        }
                           		set(
                           			current, 
                           			"pruebas",
                            		lv_pruebas_6_0, 
                            		"PruebaInterfaz");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFormulario274); 

                	newLeafNode(otherlv_7, grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleInput"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:184:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:185:2: (iv_ruleInput= ruleInput EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:186:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_entryRuleInput310);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput320); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:193:1: ruleInput returns [EObject current=null] : (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        EObject this_Input_Impl_0 = null;

        EObject this_InputTexto_1 = null;

        EObject this_InputBoton_2 = null;

        EObject this_InputMultiple_Impl_3 = null;

        EObject this_InputRadio_4 = null;

        EObject this_InputCombo_5 = null;

        EObject this_InputCheck_6 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:196:28: ( (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:197:1: (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:197:1: (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:198:5: this_Input_Impl_0= ruleInput_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInput_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_ruleInput367);
                    this_Input_Impl_0=ruleInput_Impl();

                    state._fsp--;

                     
                            current = this_Input_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:208:5: this_InputTexto_1= ruleInputTexto
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputTextoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_ruleInput394);
                    this_InputTexto_1=ruleInputTexto();

                    state._fsp--;

                     
                            current = this_InputTexto_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:218:5: this_InputBoton_2= ruleInputBoton
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputBotonParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_ruleInput421);
                    this_InputBoton_2=ruleInputBoton();

                    state._fsp--;

                     
                            current = this_InputBoton_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:228:5: this_InputMultiple_Impl_3= ruleInputMultiple_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputMultiple_ImplParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_ruleInput448);
                    this_InputMultiple_Impl_3=ruleInputMultiple_Impl();

                    state._fsp--;

                     
                            current = this_InputMultiple_Impl_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:238:5: this_InputRadio_4= ruleInputRadio
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputRadioParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_ruleInput475);
                    this_InputRadio_4=ruleInputRadio();

                    state._fsp--;

                     
                            current = this_InputRadio_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:248:5: this_InputCombo_5= ruleInputCombo
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputComboParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_ruleInput502);
                    this_InputCombo_5=ruleInputCombo();

                    state._fsp--;

                     
                            current = this_InputCombo_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:258:5: this_InputCheck_6= ruleInputCheck
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputCheckParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_ruleInput529);
                    this_InputCheck_6=ruleInputCheck();

                    state._fsp--;

                     
                            current = this_InputCheck_6; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleLayout"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:274:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:275:2: (iv_ruleLayout= ruleLayout EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:276:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout564);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout574); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:283:1: ruleLayout returns [EObject current=null] : ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_anchura_4_0 = null;

        AntlrDatatypeRuleToken lv_altura_6_0 = null;

        EObject lv_entradas_9_0 = null;

        EObject lv_entradas_11_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:286:28: ( ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:287:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:287:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:287:2: () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:287:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:288:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLayoutAccess().getLayoutAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLayout620); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLayoutKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout632); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:301:1: (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:301:3: otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout645); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getAnchuraKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:305:1: ( (lv_anchura_4_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:306:1: (lv_anchura_4_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:306:1: (lv_anchura_4_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:307:3: lv_anchura_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getAnchuraEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout666);
                    lv_anchura_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"anchura",
                            		lv_anchura_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:323:4: (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:323:6: otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLayout681); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getAlturaKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:327:1: ( (lv_altura_6_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:328:1: (lv_altura_6_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:328:1: (lv_altura_6_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:329:3: lv_altura_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getAlturaEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout702);
                    lv_altura_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	        }
                           		set(
                           			current, 
                           			"altura",
                            		lv_altura_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:345:4: (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:345:6: otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLayout717); 

                        	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getEntradasKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout729); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:353:1: ( (lv_entradas_9_0= ruleInput ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:354:1: (lv_entradas_9_0= ruleInput )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:354:1: (lv_entradas_9_0= ruleInput )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:355:3: lv_entradas_9_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout750);
                    lv_entradas_9_0=ruleInput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	        }
                           		add(
                           			current, 
                           			"entradas",
                            		lv_entradas_9_0, 
                            		"Input");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:371:2: (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:371:4: otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLayout763); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getLayoutAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:375:1: ( (lv_entradas_11_0= ruleInput ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:376:1: (lv_entradas_11_0= ruleInput )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:376:1: (lv_entradas_11_0= ruleInput )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:377:3: lv_entradas_11_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout784);
                    	    lv_entradas_11_0=ruleInput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entradas",
                    	            		lv_entradas_11_0, 
                    	            		"Input");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLayout798); 

                        	newLeafNode(otherlv_12, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLayout812); 

                	newLeafNode(otherlv_13, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleEString"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:409:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:410:2: (iv_ruleEString= ruleEString EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:411:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString849);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString860); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:418:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:421:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:422:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:422:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:422:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString900); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:430:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString926); 

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


    // $ANTLR start "entryRulePruebaInterfaz"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:447:1: entryRulePruebaInterfaz returns [EObject current=null] : iv_rulePruebaInterfaz= rulePruebaInterfaz EOF ;
    public final EObject entryRulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePruebaInterfaz = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:448:2: (iv_rulePruebaInterfaz= rulePruebaInterfaz EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:449:2: iv_rulePruebaInterfaz= rulePruebaInterfaz EOF
            {
             newCompositeNode(grammarAccess.getPruebaInterfazRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz973);
            iv_rulePruebaInterfaz=rulePruebaInterfaz();

            state._fsp--;

             current =iv_rulePruebaInterfaz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz983); 

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
    // $ANTLR end "entryRulePruebaInterfaz"


    // $ANTLR start "rulePruebaInterfaz"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:456:1: rulePruebaInterfaz returns [EObject current=null] : ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:459:28: ( ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:460:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:460:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:460:2: () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:460:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:461:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePruebaInterfaz1029); 

                	newLeafNode(otherlv_1, grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:470:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:471:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:471:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:472:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1050);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPruebaInterfazRule());
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
    // $ANTLR end "rulePruebaInterfaz"


    // $ANTLR start "entryRuleEInt"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:496:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:497:2: (iv_ruleEInt= ruleEInt EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:498:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1087);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1098); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:505:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:508:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:509:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:509:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:509:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:509:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:510:2: kw= '-'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEInt1137); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1154); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleInput_Impl"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:530:1: entryRuleInput_Impl returns [EObject current=null] : iv_ruleInput_Impl= ruleInput_Impl EOF ;
    public final EObject entryRuleInput_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:531:2: (iv_ruleInput_Impl= ruleInput_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:532:2: iv_ruleInput_Impl= ruleInput_Impl EOF
            {
             newCompositeNode(grammarAccess.getInput_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl1199);
            iv_ruleInput_Impl=ruleInput_Impl();

            state._fsp--;

             current =iv_ruleInput_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput_Impl1209); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:539:1: ruleInput_Impl returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleInput_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:542:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:543:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:543:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:543:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:543:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:544:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInput_ImplAccess().getInputAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:549:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:550:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:550:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:551:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInput_Impl1261); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInput_ImplAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:564:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:565:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:565:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:566:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInput_Impl1293); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInput_ImplAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInput_Impl1319); 

                	newLeafNode(otherlv_3, grammarAccess.getInput_ImplAccess().getInputKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:583:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:584:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:584:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:585:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInput_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInput_Impl1340);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInput_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
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


    // $ANTLR start "entryRuleInputTexto"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:609:1: entryRuleInputTexto returns [EObject current=null] : iv_ruleInputTexto= ruleInputTexto EOF ;
    public final EObject entryRuleInputTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTexto = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:610:2: (iv_ruleInputTexto= ruleInputTexto EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:611:2: iv_ruleInputTexto= ruleInputTexto EOF
            {
             newCompositeNode(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto1376);
            iv_ruleInputTexto=ruleInputTexto();

            state._fsp--;

             current =iv_ruleInputTexto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto1386); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:618:1: ruleInputTexto returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleInputTexto() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token lv_obligatorio_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_valor_8_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:621:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:622:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:622:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:622:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:622:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:623:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputTextoAccess().getInputTextoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:628:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:629:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:629:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:630:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInputTexto1438); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:643:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:644:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:644:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:645:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInputTexto1470); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:658:3: ( (lv_obligatorio_3_0= 'obligatorio' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:659:1: (lv_obligatorio_3_0= 'obligatorio' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:659:1: (lv_obligatorio_3_0= 'obligatorio' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:660:3: lv_obligatorio_3_0= 'obligatorio'
                    {
                    lv_obligatorio_3_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputTexto1502); 

                            newLeafNode(lv_obligatorio_3_0, grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "obligatorio", true, "obligatorio");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputTexto1528); 

                	newLeafNode(otherlv_4, grammarAccess.getInputTextoAccess().getInputTextoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:677:1: ( (lv_name_5_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:678:1: (lv_name_5_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:678:1: (lv_name_5_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:679:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1549);
            lv_name_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputTextoRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputTexto1561); 

                	newLeafNode(otherlv_6, grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:699:1: (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:699:3: otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputTexto1574); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputTextoAccess().getValorKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:703:1: ( (lv_valor_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:704:1: (lv_valor_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:704:1: (lv_valor_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:705:3: lv_valor_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1595);
                    lv_valor_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputTextoRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputTexto1609); 

                	newLeafNode(otherlv_9, grammarAccess.getInputTextoAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleInputBoton"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:733:1: entryRuleInputBoton returns [EObject current=null] : iv_ruleInputBoton= ruleInputBoton EOF ;
    public final EObject entryRuleInputBoton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBoton = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:734:2: (iv_ruleInputBoton= ruleInputBoton EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:735:2: iv_ruleInputBoton= ruleInputBoton EOF
            {
             newCompositeNode(grammarAccess.getInputBotonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_entryRuleInputBoton1645);
            iv_ruleInputBoton=ruleInputBoton();

            state._fsp--;

             current =iv_ruleInputBoton; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputBoton1655); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:742:1: ruleInputBoton returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleInputBoton() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:745:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:746:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:746:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:746:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:746:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:747:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputBotonAccess().getInputBotonAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:752:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:753:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:753:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:754:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInputBoton1707); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputBotonRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:767:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:768:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:768:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:769:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInputBoton1739); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputBotonRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputBoton1765); 

                	newLeafNode(otherlv_3, grammarAccess.getInputBotonAccess().getInputBotonKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:786:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:787:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:787:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:788:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputBoton1786);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputBotonRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
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


    // $ANTLR start "entryRuleInputMultiple_Impl"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:812:1: entryRuleInputMultiple_Impl returns [EObject current=null] : iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF ;
    public final EObject entryRuleInputMultiple_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputMultiple_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:813:2: (iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:814:2: iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF
            {
             newCompositeNode(grammarAccess.getInputMultiple_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_entryRuleInputMultiple_Impl1822);
            iv_ruleInputMultiple_Impl=ruleInputMultiple_Impl();

            state._fsp--;

             current =iv_ruleInputMultiple_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputMultiple_Impl1832); 

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
    // $ANTLR end "entryRuleInputMultiple_Impl"


    // $ANTLR start "ruleInputMultiple_Impl"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:821:1: ruleInputMultiple_Impl returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleInputMultiple_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_7_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:824:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:825:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:825:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:825:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:825:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:826:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputMultiple_ImplAccess().getInputMultipleAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:831:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:832:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:832:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:833:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInputMultiple_Impl1884); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputMultiple_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:846:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:847:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:847:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:848:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInputMultiple_Impl1916); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputMultiple_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputMultiple_Impl1942); 

                	newLeafNode(otherlv_3, grammarAccess.getInputMultiple_ImplAccess().getInputMultipleKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:865:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:866:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:866:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:867:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputMultiple_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputMultiple_Impl1963);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputMultiple_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputMultiple_Impl1975); 

                	newLeafNode(otherlv_5, grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:887:1: (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:887:3: otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputMultiple_Impl1988); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputMultiple_ImplAccess().getValoresKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:891:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:892:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:892:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:893:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputMultiple_Impl2009);
                    lv_valores_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputMultiple_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"valores",
                            		lv_valores_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputMultiple_Impl2023); 

                	newLeafNode(otherlv_8, grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleInputMultiple_Impl"


    // $ANTLR start "entryRuleInputRadio"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:921:1: entryRuleInputRadio returns [EObject current=null] : iv_ruleInputRadio= ruleInputRadio EOF ;
    public final EObject entryRuleInputRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRadio = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:922:2: (iv_ruleInputRadio= ruleInputRadio EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:923:2: iv_ruleInputRadio= ruleInputRadio EOF
            {
             newCompositeNode(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio2059);
            iv_ruleInputRadio=ruleInputRadio();

            state._fsp--;

             current =iv_ruleInputRadio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio2069); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:930:1: ruleInputRadio returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleInputRadio() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_7_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_9_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:933:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:934:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:934:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:934:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:934:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:935:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputRadioAccess().getInputRadioAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:940:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:941:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:941:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:942:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInputRadio2121); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:955:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:956:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:956:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:957:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInputRadio2153); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputRadio2179); 

                	newLeafNode(otherlv_3, grammarAccess.getInputRadioAccess().getInputRadioKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:974:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:975:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:975:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:976:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2200);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2212); 

                	newLeafNode(otherlv_5, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:996:1: (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:996:3: otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputRadio2225); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputRadioAccess().getValoresKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1000:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1001:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1001:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1002:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2246);
                    lv_valores_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		set(
                           			current, 
                           			"valores",
                            		lv_valores_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1018:4: (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1018:6: otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputRadio2261); 

                        	newLeafNode(otherlv_8, grammarAccess.getInputRadioAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1022:1: ( (lv_seleccion_9_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1023:1: (lv_seleccion_9_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1023:1: (lv_seleccion_9_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1024:3: lv_seleccion_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputRadio2282);
                    lv_seleccion_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		set(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputRadio2296); 

                	newLeafNode(otherlv_10, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1052:1: entryRuleInputCombo returns [EObject current=null] : iv_ruleInputCombo= ruleInputCombo EOF ;
    public final EObject entryRuleInputCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCombo = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1053:2: (iv_ruleInputCombo= ruleInputCombo EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1054:2: iv_ruleInputCombo= ruleInputCombo EOF
            {
             newCompositeNode(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo2332);
            iv_ruleInputCombo=ruleInputCombo();

            state._fsp--;

             current =iv_ruleInputCombo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo2342); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1061:1: ruleInputCombo returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleInputCombo() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_7_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_9_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1064:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1065:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1065:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1065:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )? otherlv_10= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1065:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1066:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputComboAccess().getInputComboAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1071:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1072:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1072:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1073:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInputCombo2394); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1086:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1087:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1087:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1088:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInputCombo2426); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInputCombo2452); 

                	newLeafNode(otherlv_3, grammarAccess.getInputComboAccess().getInputComboKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1105:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1106:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1106:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1107:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2473);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputComboRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2485); 

                	newLeafNode(otherlv_5, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1127:1: (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1127:3: otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputCombo2498); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputComboAccess().getValoresKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1131:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1132:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1132:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1133:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2519);
                    lv_valores_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputComboRule());
                    	        }
                           		set(
                           			current, 
                           			"valores",
                            		lv_valores_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1149:4: (otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1149:6: otherlv_8= 'seleccion' ( (lv_seleccion_9_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCombo2534); 

                        	newLeafNode(otherlv_8, grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1153:1: ( (lv_seleccion_9_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1154:1: (lv_seleccion_9_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1154:1: (lv_seleccion_9_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1155:3: lv_seleccion_9_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCombo2555);
                    lv_seleccion_9_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputComboRule());
                    	        }
                           		set(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_9_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCombo2569); 

                	newLeafNode(otherlv_10, grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1183:1: entryRuleInputCheck returns [EObject current=null] : iv_ruleInputCheck= ruleInputCheck EOF ;
    public final EObject entryRuleInputCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCheck = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1184:2: (iv_ruleInputCheck= ruleInputCheck EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1185:2: iv_ruleInputCheck= ruleInputCheck EOF
            {
             newCompositeNode(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck2605);
            iv_ruleInputCheck=ruleInputCheck();

            state._fsp--;

             current =iv_ruleInputCheck; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck2615); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1192:1: ruleInputCheck returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' otherlv_9= '{' ( (lv_seleccion_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleInputCheck() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_7_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_10_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_12_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1195:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' otherlv_9= '{' ( (lv_seleccion_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1196:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' otherlv_9= '{' ( (lv_seleccion_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1196:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' otherlv_9= '{' ( (lv_seleccion_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1196:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )? (otherlv_8= 'seleccion' otherlv_9= '{' ( (lv_seleccion_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1196:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1197:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputCheckAccess().getInputCheckAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1202:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1203:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1203:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1204:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInputCheck2667); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1217:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1218:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1218:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1219:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInputCheck2699); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInputCheck2725); 

                	newLeafNode(otherlv_3, grammarAccess.getInputCheckAccess().getInputCheckKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1236:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1237:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1237:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1238:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2746);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck2758); 

                	newLeafNode(otherlv_5, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1258:1: (otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1258:3: otherlv_6= 'valores' ( (lv_valores_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputCheck2771); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputCheckAccess().getValoresKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1262:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1263:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1263:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1264:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2792);
                    lv_valores_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"valores",
                            		lv_valores_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1280:4: (otherlv_8= 'seleccion' otherlv_9= '{' ( (lv_seleccion_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) ) )* otherlv_13= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1280:6: otherlv_8= 'seleccion' otherlv_9= '{' ( (lv_seleccion_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCheck2807); 

                        	newLeafNode(otherlv_8, grammarAccess.getInputCheckAccess().getSeleccionKeyword_7_0());
                        
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck2819); 

                        	newLeafNode(otherlv_9, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1288:1: ( (lv_seleccion_10_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1289:1: (lv_seleccion_10_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1289:1: (lv_seleccion_10_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1290:3: lv_seleccion_10_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck2840);
                    lv_seleccion_10_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		add(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_10_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1306:2: (otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==20) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1306:4: otherlv_11= ',' ( (lv_seleccion_12_0= ruleEInt ) )
                    	    {
                    	    otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInputCheck2853); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getInputCheckAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1310:1: ( (lv_seleccion_12_0= ruleEInt ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1311:1: (lv_seleccion_12_0= ruleEInt )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1311:1: (lv_seleccion_12_0= ruleEInt )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1312:3: lv_seleccion_12_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck2874);
                    	    lv_seleccion_12_0=ruleEInt();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"seleccion",
                    	            		lv_seleccion_12_0, 
                    	            		"EInt");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCheck2888); 

                        	newLeafNode(otherlv_13, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCheck2902); 

                	newLeafNode(otherlv_14, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_8());
                

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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\12\uffff";
    static final String DFA4_minS =
        "\1\27\1\30\1\31\7\uffff";
    static final String DFA4_maxS =
        "\3\43\7\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\1\3\2\4\1\uffff\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1"+
            "\11",
            "\1\2\1\3\2\4\1\uffff\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1\11",
            "\1\3\2\4\1\uffff\1\5\1\6\1\uffff\1\7\1\uffff\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "197:1: (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormulario_in_entryRuleFormulario75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulario85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFormulario128 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleFormulario160 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFormulario186 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFormulario207 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFormulario219 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleFormulario240 = new BitSet(new long[]{0x0000000000208000L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_ruleFormulario261 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFormulario274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_Impl_in_ruleInput367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_ruleInput394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_ruleInput421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_ruleInput448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_ruleInput475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_ruleInput502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_ruleInput529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleLayout620 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout632 = new BitSet(new long[]{0x00000000000E8000L});
        public static final BitSet FOLLOW_17_in_ruleLayout645 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout666 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_18_in_ruleLayout681 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout702 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleLayout717 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout729 = new BitSet(new long[]{0x0000000D6F800000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout750 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleLayout763 = new BitSet(new long[]{0x0000000D6F800000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout784 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleLayout798 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLayout812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString849 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz973 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rulePruebaInterfaz1029 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEInt1137 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl1199 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput_Impl1209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInput_Impl1261 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleInput_Impl1293 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleInput_Impl1319 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInput_Impl1340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto1376 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto1386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInputTexto1438 = new BitSet(new long[]{0x000000000D000000L});
        public static final BitSet FOLLOW_24_in_ruleInputTexto1470 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleInputTexto1502 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleInputTexto1528 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1549 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputTexto1561 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_28_in_ruleInputTexto1574 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1595 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputTexto1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_entryRuleInputBoton1645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputBoton1655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInputBoton1707 = new BitSet(new long[]{0x0000000021000000L});
        public static final BitSet FOLLOW_24_in_ruleInputBoton1739 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleInputBoton1765 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputBoton1786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_entryRuleInputMultiple_Impl1822 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputMultiple_Impl1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInputMultiple_Impl1884 = new BitSet(new long[]{0x0000000041000000L});
        public static final BitSet FOLLOW_24_in_ruleInputMultiple_Impl1916 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputMultiple_Impl1942 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputMultiple_Impl1963 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputMultiple_Impl1975 = new BitSet(new long[]{0x0000000080008000L});
        public static final BitSet FOLLOW_31_in_ruleInputMultiple_Impl1988 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputMultiple_Impl2009 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputMultiple_Impl2023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio2059 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInputRadio2121 = new BitSet(new long[]{0x0000000101000000L});
        public static final BitSet FOLLOW_24_in_ruleInputRadio2153 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleInputRadio2179 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2200 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2212 = new BitSet(new long[]{0x0000000280008000L});
        public static final BitSet FOLLOW_31_in_ruleInputRadio2225 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2246 = new BitSet(new long[]{0x0000000200008000L});
        public static final BitSet FOLLOW_33_in_ruleInputRadio2261 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputRadio2282 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputRadio2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo2332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo2342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInputCombo2394 = new BitSet(new long[]{0x0000000401000000L});
        public static final BitSet FOLLOW_24_in_ruleInputCombo2426 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInputCombo2452 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2473 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2485 = new BitSet(new long[]{0x0000000280008000L});
        public static final BitSet FOLLOW_31_in_ruleInputCombo2498 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2519 = new BitSet(new long[]{0x0000000200008000L});
        public static final BitSet FOLLOW_33_in_ruleInputCombo2534 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCombo2555 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputCombo2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck2605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleInputCheck2667 = new BitSet(new long[]{0x0000000801000000L});
        public static final BitSet FOLLOW_24_in_ruleInputCheck2699 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleInputCheck2725 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2746 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck2758 = new BitSet(new long[]{0x0000000280008000L});
        public static final BitSet FOLLOW_31_in_ruleInputCheck2771 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2792 = new BitSet(new long[]{0x0000000200008000L});
        public static final BitSet FOLLOW_33_in_ruleInputCheck2807 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck2819 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck2840 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleInputCheck2853 = new BitSet(new long[]{0x0000000000400040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck2874 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleInputCheck2888 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputCheck2902 = new BitSet(new long[]{0x0000000000000002L});
    }


}