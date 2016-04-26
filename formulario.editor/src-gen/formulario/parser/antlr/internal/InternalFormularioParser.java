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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'comprobarAsercion'", "'comprobarAccion'", "'Formulario'", "'{'", "'layout'", "'pruebas'", "'}'", "'Layout'", "'anchura'", "'altura'", "'entradas'", "','", "'PruebaInterfaz'", "'acciones'", "'('", "')'", "'aserciones'", "'-'", "'visible'", "'habilitado'", "'Input'", "'obligatorio'", "'InputTexto'", "'valor'", "'InputBoton'", "'InputMultiple'", "'valores'", "'InputRadio'", "'seleccion'", "'InputCombo'", "'InputCheck'"
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:76:1: ruleFormulario returns [EObject current=null] : ( ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) (otherlv_7= 'pruebas' ( (lv_pruebas_8_0= rulePruebaInterfaz ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleFormulario() throws RecognitionException {
        EObject current = null;

        Token lv_comprobarAsercion_0_0=null;
        Token lv_comprobarAccion_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_layout_6_0 = null;

        EObject lv_pruebas_8_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:79:28: ( ( ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) (otherlv_7= 'pruebas' ( (lv_pruebas_8_0= rulePruebaInterfaz ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: ( ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) (otherlv_7= 'pruebas' ( (lv_pruebas_8_0= rulePruebaInterfaz ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: ( ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) (otherlv_7= 'pruebas' ( (lv_pruebas_8_0= rulePruebaInterfaz ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:2: ( (lv_comprobarAsercion_0_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_1_0= 'comprobarAccion' ) )? otherlv_2= 'Formulario' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'layout' ( (lv_layout_6_0= ruleLayout ) ) (otherlv_7= 'pruebas' ( (lv_pruebas_8_0= rulePruebaInterfaz ) ) )? otherlv_9= '}'
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
                
            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFormulario231); 

                	newLeafNode(otherlv_5, grammarAccess.getFormularioAccess().getLayoutKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:140:1: ( (lv_layout_6_0= ruleLayout ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:141:1: (lv_layout_6_0= ruleLayout )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:141:1: (lv_layout_6_0= ruleLayout )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:142:3: lv_layout_6_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getFormularioAccess().getLayoutLayoutParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleFormulario252);
            lv_layout_6_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormularioRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_6_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:158:2: (otherlv_7= 'pruebas' ( (lv_pruebas_8_0= rulePruebaInterfaz ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:158:4: otherlv_7= 'pruebas' ( (lv_pruebas_8_0= rulePruebaInterfaz ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFormulario265); 

                        	newLeafNode(otherlv_7, grammarAccess.getFormularioAccess().getPruebasKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:162:1: ( (lv_pruebas_8_0= rulePruebaInterfaz ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:163:1: (lv_pruebas_8_0= rulePruebaInterfaz )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:163:1: (lv_pruebas_8_0= rulePruebaInterfaz )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:164:3: lv_pruebas_8_0= rulePruebaInterfaz
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormularioAccess().getPruebasPruebaInterfazParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_ruleFormulario286);
                    lv_pruebas_8_0=rulePruebaInterfaz();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormularioRule());
                    	        }
                           		set(
                           			current, 
                           			"pruebas",
                            		lv_pruebas_8_0, 
                            		"PruebaInterfaz");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFormulario300); 

                	newLeafNode(otherlv_9, grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:192:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:193:2: (iv_ruleInput= ruleInput EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:194:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_entryRuleInput336);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput346); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:201:1: ruleInput returns [EObject current=null] : (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:204:28: ( (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:205:1: (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:205:1: (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck )
            int alt4=7;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:206:5: this_Input_Impl_0= ruleInput_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInput_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_ruleInput393);
                    this_Input_Impl_0=ruleInput_Impl();

                    state._fsp--;

                     
                            current = this_Input_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:216:5: this_InputTexto_1= ruleInputTexto
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputTextoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_ruleInput420);
                    this_InputTexto_1=ruleInputTexto();

                    state._fsp--;

                     
                            current = this_InputTexto_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:226:5: this_InputBoton_2= ruleInputBoton
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputBotonParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_ruleInput447);
                    this_InputBoton_2=ruleInputBoton();

                    state._fsp--;

                     
                            current = this_InputBoton_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:236:5: this_InputMultiple_Impl_3= ruleInputMultiple_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputMultiple_ImplParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_ruleInput474);
                    this_InputMultiple_Impl_3=ruleInputMultiple_Impl();

                    state._fsp--;

                     
                            current = this_InputMultiple_Impl_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:246:5: this_InputRadio_4= ruleInputRadio
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputRadioParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_ruleInput501);
                    this_InputRadio_4=ruleInputRadio();

                    state._fsp--;

                     
                            current = this_InputRadio_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:256:5: this_InputCombo_5= ruleInputCombo
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputComboParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_ruleInput528);
                    this_InputCombo_5=ruleInputCombo();

                    state._fsp--;

                     
                            current = this_InputCombo_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:266:5: this_InputCheck_6= ruleInputCheck
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputCheckParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_ruleInput555);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:282:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:283:2: (iv_ruleLayout= ruleLayout EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:284:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout590);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout600); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:291:1: ruleLayout returns [EObject current=null] : ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:294:28: ( ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:295:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:295:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:295:2: () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:295:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:296:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLayoutAccess().getLayoutAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLayout646); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLayoutKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout658); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:309:1: (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:309:3: otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLayout671); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getAnchuraKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:313:1: ( (lv_anchura_4_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:314:1: (lv_anchura_4_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:314:1: (lv_anchura_4_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:315:3: lv_anchura_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getAnchuraEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout692);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:331:4: (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:331:6: otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLayout707); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getAlturaKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:335:1: ( (lv_altura_6_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:336:1: (lv_altura_6_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:336:1: (lv_altura_6_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:337:3: lv_altura_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getAlturaEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout728);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:353:4: (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:353:6: otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLayout743); 

                        	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getEntradasKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout755); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:361:1: ( (lv_entradas_9_0= ruleInput ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:362:1: (lv_entradas_9_0= ruleInput )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:362:1: (lv_entradas_9_0= ruleInput )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:363:3: lv_entradas_9_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout776);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:379:2: (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:379:4: otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) )
                    	    {
                    	    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLayout789); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getLayoutAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:383:1: ( (lv_entradas_11_0= ruleInput ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:384:1: (lv_entradas_11_0= ruleInput )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:384:1: (lv_entradas_11_0= ruleInput )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:385:3: lv_entradas_11_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout810);
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

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout824); 

                        	newLeafNode(otherlv_12, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout838); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:417:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:418:2: (iv_ruleEString= ruleEString EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:419:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString875);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString886); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:426:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:429:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:430:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:430:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:430:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString926); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:438:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString952); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:455:1: entryRulePruebaInterfaz returns [EObject current=null] : iv_rulePruebaInterfaz= rulePruebaInterfaz EOF ;
    public final EObject entryRulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePruebaInterfaz = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:456:2: (iv_rulePruebaInterfaz= rulePruebaInterfaz EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:457:2: iv_rulePruebaInterfaz= rulePruebaInterfaz EOF
            {
             newCompositeNode(grammarAccess.getPruebaInterfazRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz999);
            iv_rulePruebaInterfaz=rulePruebaInterfaz();

            state._fsp--;

             current =iv_rulePruebaInterfaz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz1009); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:464:1: rulePruebaInterfaz returns [EObject current=null] : ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'aserciones' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject rulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:467:28: ( ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'aserciones' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:468:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'aserciones' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:468:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'aserciones' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:468:2: () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'aserciones' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:468:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:469:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePruebaInterfaz1055); 

                	newLeafNode(otherlv_1, grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:478:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:479:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:479:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:480:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1076);
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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePruebaInterfaz1088); 

                	newLeafNode(otherlv_3, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:500:1: (otherlv_4= 'acciones' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:500:3: otherlv_4= 'acciones' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePruebaInterfaz1101); 

                        	newLeafNode(otherlv_4, grammarAccess.getPruebaInterfazAccess().getAccionesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePruebaInterfaz1113); 

                        	newLeafNode(otherlv_5, grammarAccess.getPruebaInterfazAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:508:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:509:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:509:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:510:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPruebaInterfazRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1136);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:523:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==22) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:523:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePruebaInterfaz1149); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPruebaInterfazAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:527:1: ( ( ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:528:1: ( ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:528:1: ( ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:529:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPruebaInterfazRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1172);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePruebaInterfaz1186); 

                        	newLeafNode(otherlv_9, grammarAccess.getPruebaInterfazAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:546:3: (otherlv_10= 'aserciones' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:546:5: otherlv_10= 'aserciones' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_rulePruebaInterfaz1201); 

                        	newLeafNode(otherlv_10, grammarAccess.getPruebaInterfazAccess().getAsercionesKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePruebaInterfaz1213); 

                        	newLeafNode(otherlv_11, grammarAccess.getPruebaInterfazAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:554:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:555:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:555:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:556:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPruebaInterfazRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1236);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:569:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==22) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:569:4: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePruebaInterfaz1249); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getPruebaInterfazAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:573:1: ( ( ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:574:1: ( ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:574:1: ( ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:575:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPruebaInterfazRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAsercionesAsercionCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1272);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePruebaInterfaz1286); 

                        	newLeafNode(otherlv_15, grammarAccess.getPruebaInterfazAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePruebaInterfaz1300); 

                	newLeafNode(otherlv_16, grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:604:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:605:2: (iv_ruleEInt= ruleEInt EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:606:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1337);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1348); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:613:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:616:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:617:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:617:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:617:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:617:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:618:2: kw= '-'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEInt1387); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1404); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:638:1: entryRuleInput_Impl returns [EObject current=null] : iv_ruleInput_Impl= ruleInput_Impl EOF ;
    public final EObject entryRuleInput_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:639:2: (iv_ruleInput_Impl= ruleInput_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:640:2: iv_ruleInput_Impl= ruleInput_Impl EOF
            {
             newCompositeNode(grammarAccess.getInput_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl1449);
            iv_ruleInput_Impl=ruleInput_Impl();

            state._fsp--;

             current =iv_ruleInput_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput_Impl1459); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:647:1: ruleInput_Impl returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleInput_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:650:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:651:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:651:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:651:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'Input' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:651:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:652:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInput_ImplAccess().getInputAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:657:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:658:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:658:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:659:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInput_Impl1511); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInput_ImplAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:672:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:673:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:673:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:674:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInput_Impl1543); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInput_ImplAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInput_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInput_Impl1569); 

                	newLeafNode(otherlv_3, grammarAccess.getInput_ImplAccess().getInputKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:691:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:692:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:692:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:693:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInput_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInput_Impl1590);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:717:1: entryRuleInputTexto returns [EObject current=null] : iv_ruleInputTexto= ruleInputTexto EOF ;
    public final EObject entryRuleInputTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTexto = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:718:2: (iv_ruleInputTexto= ruleInputTexto EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:719:2: iv_ruleInputTexto= ruleInputTexto EOF
            {
             newCompositeNode(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto1626);
            iv_ruleInputTexto=ruleInputTexto();

            state._fsp--;

             current =iv_ruleInputTexto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto1636); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:726:1: ruleInputTexto returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:729:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:730:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:730:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:730:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:730:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:731:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputTextoAccess().getInputTextoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:736:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:737:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:737:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:738:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputTexto1688); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:751:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:752:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:752:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:753:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputTexto1720); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:766:3: ( (lv_obligatorio_3_0= 'obligatorio' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:767:1: (lv_obligatorio_3_0= 'obligatorio' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:767:1: (lv_obligatorio_3_0= 'obligatorio' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:768:3: lv_obligatorio_3_0= 'obligatorio'
                    {
                    lv_obligatorio_3_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputTexto1752); 

                            newLeafNode(lv_obligatorio_3_0, grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "obligatorio", true, "obligatorio");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputTexto1778); 

                	newLeafNode(otherlv_4, grammarAccess.getInputTextoAccess().getInputTextoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:785:1: ( (lv_name_5_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:786:1: (lv_name_5_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:786:1: (lv_name_5_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:787:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1799);
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

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputTexto1811); 

                	newLeafNode(otherlv_6, grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:807:1: (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:807:3: otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInputTexto1824); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputTextoAccess().getValorKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:811:1: ( (lv_valor_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:812:1: (lv_valor_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:812:1: (lv_valor_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:813:3: lv_valor_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1845);
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

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputTexto1859); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:841:1: entryRuleInputBoton returns [EObject current=null] : iv_ruleInputBoton= ruleInputBoton EOF ;
    public final EObject entryRuleInputBoton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBoton = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:842:2: (iv_ruleInputBoton= ruleInputBoton EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:843:2: iv_ruleInputBoton= ruleInputBoton EOF
            {
             newCompositeNode(grammarAccess.getInputBotonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_entryRuleInputBoton1895);
            iv_ruleInputBoton=ruleInputBoton();

            state._fsp--;

             current =iv_ruleInputBoton; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputBoton1905); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:850:1: ruleInputBoton returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleInputBoton() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:853:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:854:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:854:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:854:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:854:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:855:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputBotonAccess().getInputBotonAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:860:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:861:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:861:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:862:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputBoton1957); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputBotonRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:875:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:876:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:876:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:877:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputBoton1989); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputBotonRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInputBoton2015); 

                	newLeafNode(otherlv_3, grammarAccess.getInputBotonAccess().getInputBotonKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:894:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:895:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:895:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:896:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputBoton2036);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:920:1: entryRuleInputMultiple_Impl returns [EObject current=null] : iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF ;
    public final EObject entryRuleInputMultiple_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputMultiple_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:921:2: (iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:922:2: iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF
            {
             newCompositeNode(grammarAccess.getInputMultiple_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_entryRuleInputMultiple_Impl2072);
            iv_ruleInputMultiple_Impl=ruleInputMultiple_Impl();

            state._fsp--;

             current =iv_ruleInputMultiple_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputMultiple_Impl2082); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:929:1: ruleInputMultiple_Impl returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleInputMultiple_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_8_0 = null;

        AntlrDatatypeRuleToken lv_valores_10_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:932:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:933:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:933:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:933:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:933:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:934:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputMultiple_ImplAccess().getInputMultipleAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:939:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:940:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:940:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:941:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputMultiple_Impl2134); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputMultiple_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:954:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:955:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:955:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:956:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputMultiple_Impl2166); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputMultiple_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInputMultiple_Impl2192); 

                	newLeafNode(otherlv_3, grammarAccess.getInputMultiple_ImplAccess().getInputMultipleKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:973:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:974:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:974:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:975:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputMultiple_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputMultiple_Impl2213);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputMultiple_Impl2225); 

                	newLeafNode(otherlv_5, grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:995:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:995:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInputMultiple_Impl2238); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputMultiple_ImplAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputMultiple_Impl2250); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1003:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1004:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1004:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1005:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputMultiple_Impl2271);
                    lv_valores_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputMultiple_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1021:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==22) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1021:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputMultiple_Impl2284); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputMultiple_ImplAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1025:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1026:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1026:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1027:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputMultiple_Impl2305);
                    	    lv_valores_10_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputMultiple_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valores",
                    	            		lv_valores_10_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputMultiple_Impl2319); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputMultiple_Impl2333); 

                	newLeafNode(otherlv_12, grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1059:1: entryRuleInputRadio returns [EObject current=null] : iv_ruleInputRadio= ruleInputRadio EOF ;
    public final EObject entryRuleInputRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRadio = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1060:2: (iv_ruleInputRadio= ruleInputRadio EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1061:2: iv_ruleInputRadio= ruleInputRadio EOF
            {
             newCompositeNode(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio2369);
            iv_ruleInputRadio=ruleInputRadio();

            state._fsp--;

             current =iv_ruleInputRadio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio2379); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1068:1: ruleInputRadio returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleInputRadio() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_8_0 = null;

        AntlrDatatypeRuleToken lv_valores_10_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_13_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1071:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1072:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1072:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1072:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1072:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1073:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputRadioAccess().getInputRadioAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1078:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1079:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1079:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1080:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputRadio2431); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1093:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1094:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1094:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1095:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputRadio2463); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInputRadio2489); 

                	newLeafNode(otherlv_3, grammarAccess.getInputRadioAccess().getInputRadioKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1112:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1113:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1113:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1114:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2510);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2522); 

                	newLeafNode(otherlv_5, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1134:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1134:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInputRadio2535); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputRadioAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2547); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1142:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1143:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1143:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1144:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2568);
                    lv_valores_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1160:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==22) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1160:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputRadio2581); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputRadioAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1164:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1165:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1165:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1166:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2602);
                    	    lv_valores_10_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valores",
                    	            		lv_valores_10_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio2616); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1186:3: (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1186:5: otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInputRadio2631); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputRadioAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1190:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1191:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1191:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1192:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputRadio2652);
                    lv_seleccion_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		set(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio2666); 

                	newLeafNode(otherlv_14, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1220:1: entryRuleInputCombo returns [EObject current=null] : iv_ruleInputCombo= ruleInputCombo EOF ;
    public final EObject entryRuleInputCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCombo = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1221:2: (iv_ruleInputCombo= ruleInputCombo EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1222:2: iv_ruleInputCombo= ruleInputCombo EOF
            {
             newCompositeNode(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo2702);
            iv_ruleInputCombo=ruleInputCombo();

            state._fsp--;

             current =iv_ruleInputCombo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo2712); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1229:1: ruleInputCombo returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleInputCombo() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_8_0 = null;

        AntlrDatatypeRuleToken lv_valores_10_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_13_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1232:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1233:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1233:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1233:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1233:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1234:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputComboAccess().getInputComboAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1239:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1240:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1240:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1241:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputCombo2764); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1254:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1255:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1255:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1256:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputCombo2796); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleInputCombo2822); 

                	newLeafNode(otherlv_3, grammarAccess.getInputComboAccess().getInputComboKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1273:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1274:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1274:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1275:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2843);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2855); 

                	newLeafNode(otherlv_5, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1295:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1295:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInputCombo2868); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputComboAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2880); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1303:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1304:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1304:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1305:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2901);
                    lv_valores_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputComboRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1321:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==22) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1321:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCombo2914); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputComboAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1325:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1326:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1326:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1327:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2935);
                    	    lv_valores_10_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputComboRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valores",
                    	            		lv_valores_10_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCombo2949); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1347:3: (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1347:5: otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInputCombo2964); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1351:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1352:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1352:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1353:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCombo2985);
                    lv_seleccion_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputComboRule());
                    	        }
                           		set(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCombo2999); 

                	newLeafNode(otherlv_14, grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1381:1: entryRuleInputCheck returns [EObject current=null] : iv_ruleInputCheck= ruleInputCheck EOF ;
    public final EObject entryRuleInputCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCheck = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1382:2: (iv_ruleInputCheck= ruleInputCheck EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1383:2: iv_ruleInputCheck= ruleInputCheck EOF
            {
             newCompositeNode(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck3035);
            iv_ruleInputCheck=ruleInputCheck();

            state._fsp--;

             current =iv_ruleInputCheck; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck3045); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1390:1: ruleInputCheck returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleInputCheck() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_8_0 = null;

        AntlrDatatypeRuleToken lv_valores_10_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_14_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_16_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1393:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1394:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1394:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1394:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1394:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1395:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputCheckAccess().getInputCheckAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1400:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1401:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1401:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1402:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputCheck3097); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1415:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==30) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1416:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1416:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1417:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputCheck3129); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleInputCheck3155); 

                	newLeafNode(otherlv_3, grammarAccess.getInputCheckAccess().getInputCheckKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1434:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1435:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1435:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1436:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck3176);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck3188); 

                	newLeafNode(otherlv_5, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1456:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1456:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInputCheck3201); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputCheckAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck3213); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1464:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1465:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1465:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1466:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck3234);
                    lv_valores_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1482:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==22) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1482:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCheck3247); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1486:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1487:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1487:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1488:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck3268);
                    	    lv_valores_10_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valores",
                    	            		lv_valores_10_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3282); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1508:3: (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1508:5: otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleInputCheck3297); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputCheckAccess().getSeleccionKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck3309); 

                        	newLeafNode(otherlv_13, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1516:1: ( (lv_seleccion_14_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1517:1: (lv_seleccion_14_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1517:1: (lv_seleccion_14_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1518:3: lv_seleccion_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3330);
                    lv_seleccion_14_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		add(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_14_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1534:2: (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==22) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1534:4: otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) )
                    	    {
                    	    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCheck3343); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getInputCheckAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1538:1: ( (lv_seleccion_16_0= ruleEInt ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1539:1: (lv_seleccion_16_0= ruleEInt )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1539:1: (lv_seleccion_16_0= ruleEInt )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1540:3: lv_seleccion_16_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3364);
                    	    lv_seleccion_16_0=ruleEInt();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"seleccion",
                    	            		lv_seleccion_16_0, 
                    	            		"EInt");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3378); 

                        	newLeafNode(otherlv_17, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3392); 

                	newLeafNode(otherlv_18, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_8());
                

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
        "\1\35\1\36\1\37\7\uffff";
    static final String DFA4_maxS =
        "\3\51\7\uffff";
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
            return "205:1: (this_Input_Impl_0= ruleInput_Impl | this_InputTexto_1= ruleInputTexto | this_InputBoton_2= ruleInputBoton | this_InputMultiple_Impl_3= ruleInputMultiple_Impl | this_InputRadio_4= ruleInputRadio | this_InputCombo_5= ruleInputCombo | this_InputCheck_6= ruleInputCheck )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormulario_in_entryRuleFormulario75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulario85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFormulario128 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleFormulario160 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFormulario186 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFormulario207 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFormulario219 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFormulario231 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleFormulario252 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleFormulario265 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_ruleFormulario286 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFormulario300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_Impl_in_ruleInput393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_ruleInput420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_ruleInput447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_ruleInput474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_ruleInput501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_ruleInput528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_ruleInput555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleLayout646 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout658 = new BitSet(new long[]{0x00000000003A0000L});
        public static final BitSet FOLLOW_19_in_ruleLayout671 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout692 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_20_in_ruleLayout707 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout728 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleLayout743 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout755 = new BitSet(new long[]{0x0000035BE0000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout776 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleLayout789 = new BitSet(new long[]{0x0000035BE0000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout810 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleLayout824 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLayout838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz999 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz1009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulePruebaInterfaz1055 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1076 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePruebaInterfaz1088 = new BitSet(new long[]{0x0000000009020000L});
        public static final BitSet FOLLOW_24_in_rulePruebaInterfaz1101 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulePruebaInterfaz1113 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1136 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_22_in_rulePruebaInterfaz1149 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1172 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_26_in_rulePruebaInterfaz1186 = new BitSet(new long[]{0x0000000008020000L});
        public static final BitSet FOLLOW_27_in_rulePruebaInterfaz1201 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_rulePruebaInterfaz1213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1236 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_22_in_rulePruebaInterfaz1249 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1272 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_26_in_rulePruebaInterfaz1286 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePruebaInterfaz1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1337 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleEInt1387 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_Impl_in_entryRuleInput_Impl1449 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput_Impl1459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInput_Impl1511 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_30_in_ruleInput_Impl1543 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleInput_Impl1569 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInput_Impl1590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto1626 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto1636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInputTexto1688 = new BitSet(new long[]{0x0000000340000000L});
        public static final BitSet FOLLOW_30_in_ruleInputTexto1720 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleInputTexto1752 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleInputTexto1778 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1799 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputTexto1811 = new BitSet(new long[]{0x0000000400020000L});
        public static final BitSet FOLLOW_34_in_ruleInputTexto1824 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1845 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputTexto1859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_entryRuleInputBoton1895 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputBoton1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInputBoton1957 = new BitSet(new long[]{0x0000000840000000L});
        public static final BitSet FOLLOW_30_in_ruleInputBoton1989 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleInputBoton2015 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputBoton2036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_entryRuleInputMultiple_Impl2072 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputMultiple_Impl2082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInputMultiple_Impl2134 = new BitSet(new long[]{0x0000001040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputMultiple_Impl2166 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleInputMultiple_Impl2192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputMultiple_Impl2213 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputMultiple_Impl2225 = new BitSet(new long[]{0x0000002000020000L});
        public static final BitSet FOLLOW_37_in_ruleInputMultiple_Impl2238 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputMultiple_Impl2250 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputMultiple_Impl2271 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputMultiple_Impl2284 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputMultiple_Impl2305 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputMultiple_Impl2319 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputMultiple_Impl2333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio2369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio2379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInputRadio2431 = new BitSet(new long[]{0x0000004040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputRadio2463 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleInputRadio2489 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2510 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2522 = new BitSet(new long[]{0x000000A000020000L});
        public static final BitSet FOLLOW_37_in_ruleInputRadio2535 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2547 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2568 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputRadio2581 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2602 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio2616 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleInputRadio2631 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputRadio2652 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo2702 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo2712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInputCombo2764 = new BitSet(new long[]{0x0000010040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputCombo2796 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleInputCombo2822 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2843 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2855 = new BitSet(new long[]{0x000000A000020000L});
        public static final BitSet FOLLOW_37_in_ruleInputCombo2868 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2901 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCombo2914 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2935 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCombo2949 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleInputCombo2964 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCombo2985 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputCombo2999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck3035 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck3045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInputCheck3097 = new BitSet(new long[]{0x0000020040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputCheck3129 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleInputCheck3155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck3176 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck3188 = new BitSet(new long[]{0x000000A000020000L});
        public static final BitSet FOLLOW_37_in_ruleInputCheck3201 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck3213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck3234 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCheck3247 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck3268 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3282 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleInputCheck3297 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck3309 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3330 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCheck3343 = new BitSet(new long[]{0x0000000010000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3364 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3378 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3392 = new BitSet(new long[]{0x0000000000000002L});
    }


}