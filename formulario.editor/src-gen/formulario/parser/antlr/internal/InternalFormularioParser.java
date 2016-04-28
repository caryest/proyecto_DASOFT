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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'comprobarAsercion'", "'comprobarAccion'", "'Formulario'", "'{'", "'layout'", "'pruebas'", "'}'", "'Layout'", "'columnas'", "'entradas'", "','", "'PruebaInterfaz'", "'acciones'", "'-'", "'visible'", "'habilitado'", "'obligatorio'", "'InputTexto'", "'valor'", "'InputRadio'", "'valores'", "'seleccion'", "'reaccion'", "'InputCombo'", "'InputCheck'", "'BotonValidar'", "'BotonGuardar'", "'BotonCancelar'", "'BotonCustom'", "'funcion'", "'ReaccionVisible'", "'activacion'", "'objetivo'", "'ReaccionHabilitado'", "'AccionValor'", "'elemento'", "'asercion'", "'AccionSeleccion'", "'estado'", "'AsercionInvisible'", "'AsercionHabilitado'", "'AsercionValor'", "'AsercionSeleccion'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:201:1: ruleInput returns [EObject current=null] : (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        EObject this_InputTexto_0 = null;

        EObject this_InputRadio_1 = null;

        EObject this_InputCombo_2 = null;

        EObject this_InputCheck_3 = null;

        EObject this_BotonValidar_4 = null;

        EObject this_BotonGuardar_Impl_5 = null;

        EObject this_BotonCancelar_6 = null;

        EObject this_BotonCustom_7 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:204:28: ( (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:205:1: (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:205:1: (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:206:5: this_InputTexto_0= ruleInputTexto
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputTextoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_ruleInput393);
                    this_InputTexto_0=ruleInputTexto();

                    state._fsp--;

                     
                            current = this_InputTexto_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:216:5: this_InputRadio_1= ruleInputRadio
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputRadioParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_ruleInput420);
                    this_InputRadio_1=ruleInputRadio();

                    state._fsp--;

                     
                            current = this_InputRadio_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:226:5: this_InputCombo_2= ruleInputCombo
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputComboParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_ruleInput447);
                    this_InputCombo_2=ruleInputCombo();

                    state._fsp--;

                     
                            current = this_InputCombo_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:236:5: this_InputCheck_3= ruleInputCheck
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputCheckParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_ruleInput474);
                    this_InputCheck_3=ruleInputCheck();

                    state._fsp--;

                     
                            current = this_InputCheck_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:246:5: this_BotonValidar_4= ruleBotonValidar
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonValidarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_ruleInput501);
                    this_BotonValidar_4=ruleBotonValidar();

                    state._fsp--;

                     
                            current = this_BotonValidar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:256:5: this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonGuardar_ImplParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_ruleInput528);
                    this_BotonGuardar_Impl_5=ruleBotonGuardar_Impl();

                    state._fsp--;

                     
                            current = this_BotonGuardar_Impl_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:266:5: this_BotonCancelar_6= ruleBotonCancelar
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonCancelarParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_ruleInput555);
                    this_BotonCancelar_6=ruleBotonCancelar();

                    state._fsp--;

                     
                            current = this_BotonCancelar_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:276:5: this_BotonCustom_7= ruleBotonCustom
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonCustomParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_ruleInput582);
                    this_BotonCustom_7=ruleBotonCustom();

                    state._fsp--;

                     
                            current = this_BotonCustom_7; 
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


    // $ANTLR start "entryRuleAccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:292:1: entryRuleAccion returns [EObject current=null] : iv_ruleAccion= ruleAccion EOF ;
    public final EObject entryRuleAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:293:2: (iv_ruleAccion= ruleAccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:294:2: iv_ruleAccion= ruleAccion EOF
            {
             newCompositeNode(grammarAccess.getAccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccion_in_entryRuleAccion617);
            iv_ruleAccion=ruleAccion();

            state._fsp--;

             current =iv_ruleAccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccion627); 

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
    // $ANTLR end "entryRuleAccion"


    // $ANTLR start "ruleAccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:301:1: ruleAccion returns [EObject current=null] : (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion ) ;
    public final EObject ruleAccion() throws RecognitionException {
        EObject current = null;

        EObject this_AccionValor_0 = null;

        EObject this_AccionSeleccion_1 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:304:28: ( (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:305:1: (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:305:1: (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            else if ( (LA5_0==48) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:306:5: this_AccionValor_0= ruleAccionValor
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAccionValorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_ruleAccion674);
                    this_AccionValor_0=ruleAccionValor();

                    state._fsp--;

                     
                            current = this_AccionValor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:316:5: this_AccionSeleccion_1= ruleAccionSeleccion
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAccionSeleccionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_ruleAccion701);
                    this_AccionSeleccion_1=ruleAccionSeleccion();

                    state._fsp--;

                     
                            current = this_AccionSeleccion_1; 
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
    // $ANTLR end "ruleAccion"


    // $ANTLR start "entryRuleReaccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:332:1: entryRuleReaccion returns [EObject current=null] : iv_ruleReaccion= ruleReaccion EOF ;
    public final EObject entryRuleReaccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:333:2: (iv_ruleReaccion= ruleReaccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:334:2: iv_ruleReaccion= ruleReaccion EOF
            {
             newCompositeNode(grammarAccess.getReaccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_entryRuleReaccion736);
            iv_ruleReaccion=ruleReaccion();

            state._fsp--;

             current =iv_ruleReaccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccion746); 

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
    // $ANTLR end "entryRuleReaccion"


    // $ANTLR start "ruleReaccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:341:1: ruleReaccion returns [EObject current=null] : (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado ) ;
    public final EObject ruleReaccion() throws RecognitionException {
        EObject current = null;

        EObject this_ReaccionVisible_0 = null;

        EObject this_ReaccionHabilitado_1 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:344:28: ( (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:345:1: (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:345:1: (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==44) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:346:5: this_ReaccionVisible_0= ruleReaccionVisible
                    {
                     
                            newCompositeNode(grammarAccess.getReaccionAccess().getReaccionVisibleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_ruleReaccion793);
                    this_ReaccionVisible_0=ruleReaccionVisible();

                    state._fsp--;

                     
                            current = this_ReaccionVisible_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:356:5: this_ReaccionHabilitado_1= ruleReaccionHabilitado
                    {
                     
                            newCompositeNode(grammarAccess.getReaccionAccess().getReaccionHabilitadoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_ruleReaccion820);
                    this_ReaccionHabilitado_1=ruleReaccionHabilitado();

                    state._fsp--;

                     
                            current = this_ReaccionHabilitado_1; 
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
    // $ANTLR end "ruleReaccion"


    // $ANTLR start "entryRuleAsercion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:372:1: entryRuleAsercion returns [EObject current=null] : iv_ruleAsercion= ruleAsercion EOF ;
    public final EObject entryRuleAsercion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:373:2: (iv_ruleAsercion= ruleAsercion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:374:2: iv_ruleAsercion= ruleAsercion EOF
            {
             newCompositeNode(grammarAccess.getAsercionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_entryRuleAsercion855);
            iv_ruleAsercion=ruleAsercion();

            state._fsp--;

             current =iv_ruleAsercion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercion865); 

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
    // $ANTLR end "entryRuleAsercion"


    // $ANTLR start "ruleAsercion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:381:1: ruleAsercion returns [EObject current=null] : (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion ) ;
    public final EObject ruleAsercion() throws RecognitionException {
        EObject current = null;

        EObject this_AsercionInvisible_0 = null;

        EObject this_AsercionHabilitado_1 = null;

        EObject this_AsercionValor_2 = null;

        EObject this_AsercionSeleccion_3 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:384:28: ( (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:385:1: (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:385:1: (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==50) ) {
                    alt7=1;
                }
                else if ( (LA7_1==51) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt7=3;
                }
                break;
            case 53:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:386:5: this_AsercionInvisible_0= ruleAsercionInvisible
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionInvisibleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_ruleAsercion912);
                    this_AsercionInvisible_0=ruleAsercionInvisible();

                    state._fsp--;

                     
                            current = this_AsercionInvisible_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:396:5: this_AsercionHabilitado_1= ruleAsercionHabilitado
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionHabilitadoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_ruleAsercion939);
                    this_AsercionHabilitado_1=ruleAsercionHabilitado();

                    state._fsp--;

                     
                            current = this_AsercionHabilitado_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:406:5: this_AsercionValor_2= ruleAsercionValor
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionValorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_ruleAsercion966);
                    this_AsercionValor_2=ruleAsercionValor();

                    state._fsp--;

                     
                            current = this_AsercionValor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:416:5: this_AsercionSeleccion_3= ruleAsercionSeleccion
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionSeleccionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_ruleAsercion993);
                    this_AsercionSeleccion_3=ruleAsercionSeleccion();

                    state._fsp--;

                     
                            current = this_AsercionSeleccion_3; 
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
    // $ANTLR end "ruleAsercion"


    // $ANTLR start "entryRuleLayout"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:432:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:433:2: (iv_ruleLayout= ruleLayout EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:434:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout1028);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout1038); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:441:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_columnas_3_0 = null;

        EObject lv_entradas_6_0 = null;

        EObject lv_entradas_8_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:444:28: ( (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:445:1: (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:445:1: (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:445:3: otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLayout1075); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout1087); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLayout1099); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getColumnasKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:457:1: ( (lv_columnas_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:458:1: (lv_columnas_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:458:1: (lv_columnas_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:459:3: lv_columnas_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getLayoutAccess().getColumnasEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout1120);
            lv_columnas_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLayoutRule());
            	        }
                   		set(
                   			current, 
                   			"columnas",
                    		lv_columnas_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:475:2: (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:475:4: otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLayout1133); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getEntradasKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout1145); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:483:1: ( (lv_entradas_6_0= ruleInput ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:484:1: (lv_entradas_6_0= ruleInput )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:484:1: (lv_entradas_6_0= ruleInput )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:485:3: lv_entradas_6_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout1166);
                    lv_entradas_6_0=ruleInput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	        }
                           		add(
                           			current, 
                           			"entradas",
                            		lv_entradas_6_0, 
                            		"Input");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:501:2: (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:501:4: otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLayout1179); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:505:1: ( (lv_entradas_8_0= ruleInput ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:506:1: (lv_entradas_8_0= ruleInput )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:506:1: (lv_entradas_8_0= ruleInput )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:507:3: lv_entradas_8_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout1200);
                    	    lv_entradas_8_0=ruleInput();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entradas",
                    	            		lv_entradas_8_0, 
                    	            		"Input");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout1214); 

                        	newLeafNode(otherlv_9, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout1228); 

                	newLeafNode(otherlv_10, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:539:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:540:2: (iv_ruleEString= ruleEString EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:541:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1265);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1276); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:548:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:551:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:552:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:552:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:552:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1316); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:560:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1342); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:577:1: entryRulePruebaInterfaz returns [EObject current=null] : iv_rulePruebaInterfaz= rulePruebaInterfaz EOF ;
    public final EObject entryRulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePruebaInterfaz = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:578:2: (iv_rulePruebaInterfaz= rulePruebaInterfaz EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:579:2: iv_rulePruebaInterfaz= rulePruebaInterfaz EOF
            {
             newCompositeNode(grammarAccess.getPruebaInterfazRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1389);
            iv_rulePruebaInterfaz=rulePruebaInterfaz();

            state._fsp--;

             current =iv_rulePruebaInterfaz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz1399); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:586:1: rulePruebaInterfaz returns [EObject current=null] : ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject rulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_acciones_6_0 = null;

        EObject lv_acciones_8_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:589:28: ( ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:2: () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:591:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePruebaInterfaz1445); 

                	newLeafNode(otherlv_1, grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:600:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:601:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:601:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:602:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1466);
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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePruebaInterfaz1478); 

                	newLeafNode(otherlv_3, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:622:1: (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:622:3: otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePruebaInterfaz1491); 

                        	newLeafNode(otherlv_4, grammarAccess.getPruebaInterfazAccess().getAccionesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePruebaInterfaz1503); 

                        	newLeafNode(otherlv_5, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:630:1: ( (lv_acciones_6_0= ruleAccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:631:1: (lv_acciones_6_0= ruleAccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:631:1: (lv_acciones_6_0= ruleAccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:632:3: lv_acciones_6_0= ruleAccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1524);
                    lv_acciones_6_0=ruleAccion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPruebaInterfazRule());
                    	        }
                           		add(
                           			current, 
                           			"acciones",
                            		lv_acciones_6_0, 
                            		"Accion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:648:2: (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:648:4: otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePruebaInterfaz1537); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPruebaInterfazAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:652:1: ( (lv_acciones_8_0= ruleAccion ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:653:1: (lv_acciones_8_0= ruleAccion )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:653:1: (lv_acciones_8_0= ruleAccion )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:654:3: lv_acciones_8_0= ruleAccion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1558);
                    	    lv_acciones_8_0=ruleAccion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPruebaInterfazRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"acciones",
                    	            		lv_acciones_8_0, 
                    	            		"Accion");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePruebaInterfaz1572); 

                        	newLeafNode(otherlv_9, grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePruebaInterfaz1586); 

                	newLeafNode(otherlv_10, grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:686:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:687:2: (iv_ruleEInt= ruleEInt EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:688:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1623);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1634); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:695:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:698:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:699:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:699:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:699:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:699:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:700:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEInt1673); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1690); 

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


    // $ANTLR start "entryRuleInputTexto"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:720:1: entryRuleInputTexto returns [EObject current=null] : iv_ruleInputTexto= ruleInputTexto EOF ;
    public final EObject entryRuleInputTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTexto = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:721:2: (iv_ruleInputTexto= ruleInputTexto EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:722:2: iv_ruleInputTexto= ruleInputTexto EOF
            {
             newCompositeNode(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto1735);
            iv_ruleInputTexto=ruleInputTexto();

            state._fsp--;

             current =iv_ruleInputTexto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto1745); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:729:1: ruleInputTexto returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:732:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:733:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:733:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:733:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:733:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:734:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputTextoAccess().getInputTextoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:739:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:740:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:740:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:741:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputTexto1797); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:754:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:755:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:755:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:756:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputTexto1829); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:769:3: ( (lv_obligatorio_3_0= 'obligatorio' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:770:1: (lv_obligatorio_3_0= 'obligatorio' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:770:1: (lv_obligatorio_3_0= 'obligatorio' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:771:3: lv_obligatorio_3_0= 'obligatorio'
                    {
                    lv_obligatorio_3_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputTexto1861); 

                            newLeafNode(lv_obligatorio_3_0, grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "obligatorio", true, "obligatorio");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputTexto1887); 

                	newLeafNode(otherlv_4, grammarAccess.getInputTextoAccess().getInputTextoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:788:1: ( (lv_name_5_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:789:1: (lv_name_5_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:789:1: (lv_name_5_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:790:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1908);
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

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputTexto1920); 

                	newLeafNode(otherlv_6, grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:810:1: (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:810:3: otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputTexto1933); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputTextoAccess().getValorKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:814:1: ( (lv_valor_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:815:1: (lv_valor_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:815:1: (lv_valor_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:816:3: lv_valor_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1954);
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

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputTexto1968); 

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


    // $ANTLR start "entryRuleInputRadio"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:844:1: entryRuleInputRadio returns [EObject current=null] : iv_ruleInputRadio= ruleInputRadio EOF ;
    public final EObject entryRuleInputRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRadio = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:845:2: (iv_ruleInputRadio= ruleInputRadio EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:846:2: iv_ruleInputRadio= ruleInputRadio EOF
            {
             newCompositeNode(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio2004);
            iv_ruleInputRadio=ruleInputRadio();

            state._fsp--;

             current =iv_ruleInputRadio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio2014); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:853:1: ruleInputRadio returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}' ) ;
    public final EObject ruleInputRadio() throws RecognitionException {
        EObject current = null;

        Token lv_visible_0_0=null;
        Token lv_habilitado_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_valores_7_0 = null;

        AntlrDatatypeRuleToken lv_valores_9_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_12_0 = null;

        EObject lv_reaccion_14_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:856:28: ( ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:857:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:857:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:857:2: ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:857:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:858:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:858:1: (lv_visible_0_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:859:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputRadio2057); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:872:3: ( (lv_habilitado_1_0= 'habilitado' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:873:1: (lv_habilitado_1_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:873:1: (lv_habilitado_1_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:874:3: lv_habilitado_1_0= 'habilitado'
                    {
                    lv_habilitado_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputRadio2089); 

                            newLeafNode(lv_habilitado_1_0, grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputRadio2115); 

                	newLeafNode(otherlv_2, grammarAccess.getInputRadioAccess().getInputRadioKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:891:1: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:892:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:892:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:893:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2136);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2148); 

                	newLeafNode(otherlv_4, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:913:1: (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:913:3: otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputRadio2161); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputRadioAccess().getValoresKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2173); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:921:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:922:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:922:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:923:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2194);
                    lv_valores_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:939:2: (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==21) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:939:4: otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInputRadio2207); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInputRadioAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:943:1: ( (lv_valores_9_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:944:1: (lv_valores_9_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:944:1: (lv_valores_9_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:945:3: lv_valores_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2228);
                    	    lv_valores_9_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valores",
                    	            		lv_valores_9_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio2242); 

                        	newLeafNode(otherlv_10, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:965:3: (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:965:5: otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputRadio2257); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputRadioAccess().getSeleccionKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:969:1: ( (lv_seleccion_12_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:970:1: (lv_seleccion_12_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:970:1: (lv_seleccion_12_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:971:3: lv_seleccion_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputRadio2278);
                    lv_seleccion_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		set(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_12_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputRadio2292); 

                	newLeafNode(otherlv_13, grammarAccess.getInputRadioAccess().getReaccionKeyword_7());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:991:1: ( (lv_reaccion_14_0= ruleReaccion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:992:1: (lv_reaccion_14_0= ruleReaccion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:992:1: (lv_reaccion_14_0= ruleReaccion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:993:3: lv_reaccion_14_0= ruleReaccion
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getReaccionReaccionParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_ruleInputRadio2313);
            lv_reaccion_14_0=ruleReaccion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
            	        }
                   		set(
                   			current, 
                   			"reaccion",
                    		lv_reaccion_14_0, 
                    		"Reaccion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio2325); 

                	newLeafNode(otherlv_15, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1021:1: entryRuleInputCombo returns [EObject current=null] : iv_ruleInputCombo= ruleInputCombo EOF ;
    public final EObject entryRuleInputCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCombo = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1022:2: (iv_ruleInputCombo= ruleInputCombo EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1023:2: iv_ruleInputCombo= ruleInputCombo EOF
            {
             newCompositeNode(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo2361);
            iv_ruleInputCombo=ruleInputCombo();

            state._fsp--;

             current =iv_ruleInputCombo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo2371); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1030:1: ruleInputCombo returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1033:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1034:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1034:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1034:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1034:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1035:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputComboAccess().getInputComboAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1040:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1041:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1041:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1042:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputCombo2423); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1055:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1056:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1056:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1057:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputCombo2455); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInputCombo2481); 

                	newLeafNode(otherlv_3, grammarAccess.getInputComboAccess().getInputComboKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1074:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1075:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1075:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1076:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2502);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2514); 

                	newLeafNode(otherlv_5, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1096:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1096:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputCombo2527); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputComboAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2539); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1104:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1105:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1105:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1106:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2560);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1122:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==21) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1122:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInputCombo2573); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputComboAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1126:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1127:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1127:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1128:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2594);
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
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCombo2608); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1148:3: (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1148:5: otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputCombo2623); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1152:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1153:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1153:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1154:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCombo2644);
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

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCombo2658); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1182:1: entryRuleInputCheck returns [EObject current=null] : iv_ruleInputCheck= ruleInputCheck EOF ;
    public final EObject entryRuleInputCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCheck = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1183:2: (iv_ruleInputCheck= ruleInputCheck EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1184:2: iv_ruleInputCheck= ruleInputCheck EOF
            {
             newCompositeNode(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck2694);
            iv_ruleInputCheck=ruleInputCheck();

            state._fsp--;

             current =iv_ruleInputCheck; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck2704); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1191:1: ruleInputCheck returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}' ) ;
    public final EObject ruleInputCheck() throws RecognitionException {
        EObject current = null;

        Token lv_visible_0_0=null;
        Token lv_habilitado_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_valores_7_0 = null;

        AntlrDatatypeRuleToken lv_valores_9_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_13_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_15_0 = null;

        EObject lv_reaccion_18_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1194:28: ( ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1195:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1195:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1195:2: ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1195:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1196:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1196:1: (lv_visible_0_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1197:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputCheck2747); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1210:3: ( (lv_habilitado_1_0= 'habilitado' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1211:1: (lv_habilitado_1_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1211:1: (lv_habilitado_1_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1212:3: lv_habilitado_1_0= 'habilitado'
                    {
                    lv_habilitado_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputCheck2779); 

                            newLeafNode(lv_habilitado_1_0, grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInputCheck2805); 

                	newLeafNode(otherlv_2, grammarAccess.getInputCheckAccess().getInputCheckKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1229:1: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1230:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1230:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1231:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2826);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck2838); 

                	newLeafNode(otherlv_4, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1251:1: (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1251:3: otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputCheck2851); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputCheckAccess().getValoresKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck2863); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1259:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1260:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1260:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1261:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2884);
                    lv_valores_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1277:2: (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==21) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1277:4: otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInputCheck2897); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInputCheckAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1281:1: ( (lv_valores_9_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1282:1: (lv_valores_9_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1282:1: (lv_valores_9_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1283:3: lv_valores_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2918);
                    	    lv_valores_9_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valores",
                    	            		lv_valores_9_0, 
                    	            		"EString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck2932); 

                        	newLeafNode(otherlv_10, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1303:3: (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1303:5: otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputCheck2947); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputCheckAccess().getSeleccionKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck2959); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1311:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1312:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1312:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1313:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck2980);
                    lv_seleccion_13_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		add(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_13_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1329:2: (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==21) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1329:4: otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) )
                    	    {
                    	    otherlv_14=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInputCheck2993); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1333:1: ( (lv_seleccion_15_0= ruleEInt ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1334:1: (lv_seleccion_15_0= ruleEInt )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1334:1: (lv_seleccion_15_0= ruleEInt )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1335:3: lv_seleccion_15_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3014);
                    	    lv_seleccion_15_0=ruleEInt();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"seleccion",
                    	            		lv_seleccion_15_0, 
                    	            		"EInt");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3028); 

                        	newLeafNode(otherlv_16, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCheck3042); 

                	newLeafNode(otherlv_17, grammarAccess.getInputCheckAccess().getReaccionKeyword_7());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1359:1: ( (lv_reaccion_18_0= ruleReaccion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1360:1: (lv_reaccion_18_0= ruleReaccion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1360:1: (lv_reaccion_18_0= ruleReaccion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1361:3: lv_reaccion_18_0= ruleReaccion
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getReaccionReaccionParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_ruleInputCheck3063);
            lv_reaccion_18_0=ruleReaccion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
            	        }
                   		set(
                   			current, 
                   			"reaccion",
                    		lv_reaccion_18_0, 
                    		"Reaccion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3075); 

                	newLeafNode(otherlv_19, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleBotonValidar"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1389:1: entryRuleBotonValidar returns [EObject current=null] : iv_ruleBotonValidar= ruleBotonValidar EOF ;
    public final EObject entryRuleBotonValidar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonValidar = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1390:2: (iv_ruleBotonValidar= ruleBotonValidar EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1391:2: iv_ruleBotonValidar= ruleBotonValidar EOF
            {
             newCompositeNode(grammarAccess.getBotonValidarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar3111);
            iv_ruleBotonValidar=ruleBotonValidar();

            state._fsp--;

             current =iv_ruleBotonValidar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonValidar3121); 

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
    // $ANTLR end "entryRuleBotonValidar"


    // $ANTLR start "ruleBotonValidar"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1398:1: ruleBotonValidar returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonValidar() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1401:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1402:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1402:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1402:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1402:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1403:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonValidarAccess().getBotonValidarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1408:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1409:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1409:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1410:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonValidar3173); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonValidarAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonValidarRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1423:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1424:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1424:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1425:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonValidar3205); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonValidarAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonValidarRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBotonValidar3231); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonValidarAccess().getBotonValidarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1442:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1443:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1443:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1444:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonValidarAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonValidar3252);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBotonValidarRule());
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
    // $ANTLR end "ruleBotonValidar"


    // $ANTLR start "entryRuleBotonGuardar_Impl"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1468:1: entryRuleBotonGuardar_Impl returns [EObject current=null] : iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF ;
    public final EObject entryRuleBotonGuardar_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonGuardar_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1469:2: (iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1470:2: iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF
            {
             newCompositeNode(grammarAccess.getBotonGuardar_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl3288);
            iv_ruleBotonGuardar_Impl=ruleBotonGuardar_Impl();

            state._fsp--;

             current =iv_ruleBotonGuardar_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonGuardar_Impl3298); 

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
    // $ANTLR end "entryRuleBotonGuardar_Impl"


    // $ANTLR start "ruleBotonGuardar_Impl"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1477:1: ruleBotonGuardar_Impl returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonGuardar_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1480:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1481:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1481:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1481:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1481:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1482:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1487:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1488:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1488:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1489:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonGuardar_Impl3350); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonGuardar_ImplAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonGuardar_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1502:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1503:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1503:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1504:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonGuardar_Impl3382); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonGuardar_ImplAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonGuardar_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBotonGuardar_Impl3408); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1521:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1522:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1522:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1523:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonGuardar_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonGuardar_Impl3429);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBotonGuardar_ImplRule());
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
    // $ANTLR end "ruleBotonGuardar_Impl"


    // $ANTLR start "entryRuleBotonCancelar"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1547:1: entryRuleBotonCancelar returns [EObject current=null] : iv_ruleBotonCancelar= ruleBotonCancelar EOF ;
    public final EObject entryRuleBotonCancelar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCancelar = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1548:2: (iv_ruleBotonCancelar= ruleBotonCancelar EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1549:2: iv_ruleBotonCancelar= ruleBotonCancelar EOF
            {
             newCompositeNode(grammarAccess.getBotonCancelarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar3465);
            iv_ruleBotonCancelar=ruleBotonCancelar();

            state._fsp--;

             current =iv_ruleBotonCancelar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCancelar3475); 

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
    // $ANTLR end "entryRuleBotonCancelar"


    // $ANTLR start "ruleBotonCancelar"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1556:1: ruleBotonCancelar returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonCancelar() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1559:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1560:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1560:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1560:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1560:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1561:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonCancelarAccess().getBotonCancelarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1566:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1567:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1567:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1568:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonCancelar3527); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonCancelarAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCancelarRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1581:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1582:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1582:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1583:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonCancelar3559); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonCancelarAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCancelarRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBotonCancelar3585); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonCancelarAccess().getBotonCancelarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1600:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1601:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1601:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1602:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCancelarAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCancelar3606);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBotonCancelarRule());
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
    // $ANTLR end "ruleBotonCancelar"


    // $ANTLR start "entryRuleBotonCustom"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1626:1: entryRuleBotonCustom returns [EObject current=null] : iv_ruleBotonCustom= ruleBotonCustom EOF ;
    public final EObject entryRuleBotonCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCustom = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1627:2: (iv_ruleBotonCustom= ruleBotonCustom EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1628:2: iv_ruleBotonCustom= ruleBotonCustom EOF
            {
             newCompositeNode(grammarAccess.getBotonCustomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom3642);
            iv_ruleBotonCustom=ruleBotonCustom();

            state._fsp--;

             current =iv_ruleBotonCustom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCustom3652); 

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
    // $ANTLR end "entryRuleBotonCustom"


    // $ANTLR start "ruleBotonCustom"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1635:1: ruleBotonCustom returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleBotonCustom() throws RecognitionException {
        EObject current = null;

        Token lv_visible_0_0=null;
        Token lv_habilitado_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_funcion_6_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1638:28: ( ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1639:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1639:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1639:2: ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1639:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1640:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1640:1: (lv_visible_0_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1641:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonCustom3695); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getBotonCustomAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCustomRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1654:3: ( (lv_habilitado_1_0= 'habilitado' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1655:1: (lv_habilitado_1_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1655:1: (lv_habilitado_1_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1656:3: lv_habilitado_1_0= 'habilitado'
                    {
                    lv_habilitado_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonCustom3727); 

                            newLeafNode(lv_habilitado_1_0, grammarAccess.getBotonCustomAccess().getHabilitadoHabilitadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCustomRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBotonCustom3753); 

                	newLeafNode(otherlv_2, grammarAccess.getBotonCustomAccess().getBotonCustomKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1673:1: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1674:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1674:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1675:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCustomAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCustom3774);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBotonCustomRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBotonCustom3786); 

                	newLeafNode(otherlv_4, grammarAccess.getBotonCustomAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBotonCustom3798); 

                	newLeafNode(otherlv_5, grammarAccess.getBotonCustomAccess().getFuncionKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1699:1: ( (lv_funcion_6_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1700:1: (lv_funcion_6_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1700:1: (lv_funcion_6_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1701:3: lv_funcion_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCustomAccess().getFuncionEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCustom3819);
            lv_funcion_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBotonCustomRule());
            	        }
                   		set(
                   			current, 
                   			"funcion",
                    		lv_funcion_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBotonCustom3831); 

                	newLeafNode(otherlv_7, grammarAccess.getBotonCustomAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleBotonCustom"


    // $ANTLR start "entryRuleReaccionVisible"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1729:1: entryRuleReaccionVisible returns [EObject current=null] : iv_ruleReaccionVisible= ruleReaccionVisible EOF ;
    public final EObject entryRuleReaccionVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccionVisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1730:2: (iv_ruleReaccionVisible= ruleReaccionVisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1731:2: iv_ruleReaccionVisible= ruleReaccionVisible EOF
            {
             newCompositeNode(grammarAccess.getReaccionVisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible3867);
            iv_ruleReaccionVisible=ruleReaccionVisible();

            state._fsp--;

             current =iv_ruleReaccionVisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionVisible3877); 

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
    // $ANTLR end "entryRuleReaccionVisible"


    // $ANTLR start "ruleReaccionVisible"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1738:1: ruleReaccionVisible returns [EObject current=null] : (otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleReaccionVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_activacion_3_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1741:28: ( (otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1742:1: (otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1742:1: (otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1742:3: otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleReaccionVisible3914); 

                	newLeafNode(otherlv_0, grammarAccess.getReaccionVisibleAccess().getReaccionVisibleKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleReaccionVisible3926); 

                	newLeafNode(otherlv_1, grammarAccess.getReaccionVisibleAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleReaccionVisible3938); 

                	newLeafNode(otherlv_2, grammarAccess.getReaccionVisibleAccess().getActivacionKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1754:1: ( (lv_activacion_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1755:1: (lv_activacion_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1755:1: (lv_activacion_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1756:3: lv_activacion_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getReaccionVisibleAccess().getActivacionEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReaccionVisible3959);
            lv_activacion_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReaccionVisibleRule());
            	        }
                   		set(
                   			current, 
                   			"activacion",
                    		lv_activacion_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleReaccionVisible3971); 

                	newLeafNode(otherlv_4, grammarAccess.getReaccionVisibleAccess().getObjetivoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1776:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1777:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1777:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1778:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReaccionVisibleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReaccionVisibleAccess().getObjetivoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReaccionVisible3994);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReaccionVisible4006); 

                	newLeafNode(otherlv_6, grammarAccess.getReaccionVisibleAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleReaccionVisible"


    // $ANTLR start "entryRuleReaccionHabilitado"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1803:1: entryRuleReaccionHabilitado returns [EObject current=null] : iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF ;
    public final EObject entryRuleReaccionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1804:2: (iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1805:2: iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getReaccionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado4042);
            iv_ruleReaccionHabilitado=ruleReaccionHabilitado();

            state._fsp--;

             current =iv_ruleReaccionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionHabilitado4052); 

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
    // $ANTLR end "entryRuleReaccionHabilitado"


    // $ANTLR start "ruleReaccionHabilitado"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1812:1: ruleReaccionHabilitado returns [EObject current=null] : (otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleReaccionHabilitado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_activacion_3_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1815:28: ( (otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1816:1: (otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1816:1: (otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1816:3: otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleReaccionHabilitado4089); 

                	newLeafNode(otherlv_0, grammarAccess.getReaccionHabilitadoAccess().getReaccionHabilitadoKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleReaccionHabilitado4101); 

                	newLeafNode(otherlv_1, grammarAccess.getReaccionHabilitadoAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleReaccionHabilitado4113); 

                	newLeafNode(otherlv_2, grammarAccess.getReaccionHabilitadoAccess().getActivacionKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1828:1: ( (lv_activacion_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1829:1: (lv_activacion_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1829:1: (lv_activacion_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1830:3: lv_activacion_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getReaccionHabilitadoAccess().getActivacionEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReaccionHabilitado4134);
            lv_activacion_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReaccionHabilitadoRule());
            	        }
                   		set(
                   			current, 
                   			"activacion",
                    		lv_activacion_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleReaccionHabilitado4146); 

                	newLeafNode(otherlv_4, grammarAccess.getReaccionHabilitadoAccess().getObjetivoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1850:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1851:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1851:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1852:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReaccionHabilitadoRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReaccionHabilitado4169);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReaccionHabilitado4181); 

                	newLeafNode(otherlv_6, grammarAccess.getReaccionHabilitadoAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleReaccionHabilitado"


    // $ANTLR start "entryRuleAccionValor"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1877:1: entryRuleAccionValor returns [EObject current=null] : iv_ruleAccionValor= ruleAccionValor EOF ;
    public final EObject entryRuleAccionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1878:2: (iv_ruleAccionValor= ruleAccionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1879:2: iv_ruleAccionValor= ruleAccionValor EOF
            {
             newCompositeNode(grammarAccess.getAccionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_entryRuleAccionValor4217);
            iv_ruleAccionValor=ruleAccionValor();

            state._fsp--;

             current =iv_ruleAccionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionValor4227); 

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
    // $ANTLR end "entryRuleAccionValor"


    // $ANTLR start "ruleAccionValor"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1886:1: ruleAccionValor returns [EObject current=null] : (otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' ) ;
    public final EObject ruleAccionValor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_valor_3_0 = null;

        EObject lv_asercion_7_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1889:28: ( (otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1890:1: (otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1890:1: (otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1890:3: otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAccionValor4264); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionValorAccess().getAccionValorKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAccionValor4276); 

                	newLeafNode(otherlv_1, grammarAccess.getAccionValorAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAccionValor4288); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionValorAccess().getValorKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1902:1: ( (lv_valor_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1903:1: (lv_valor_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1903:1: (lv_valor_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1904:3: lv_valor_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getValorEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionValor4309);
            lv_valor_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionValorRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAccionValor4321); 

                	newLeafNode(otherlv_4, grammarAccess.getAccionValorAccess().getElementoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1924:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1925:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1925:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1926:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionValorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getElementoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionValor4344);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAccionValor4356); 

                	newLeafNode(otherlv_6, grammarAccess.getAccionValorAccess().getAsercionKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1943:1: ( (lv_asercion_7_0= ruleAsercion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1944:1: (lv_asercion_7_0= ruleAsercion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1944:1: (lv_asercion_7_0= ruleAsercion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1945:3: lv_asercion_7_0= ruleAsercion
            {
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getAsercionAsercionParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionValor4377);
            lv_asercion_7_0=ruleAsercion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionValorRule());
            	        }
                   		set(
                   			current, 
                   			"asercion",
                    		lv_asercion_7_0, 
                    		"Asercion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAccionValor4389); 

                	newLeafNode(otherlv_8, grammarAccess.getAccionValorAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAccionValor"


    // $ANTLR start "entryRuleAccionSeleccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1973:1: entryRuleAccionSeleccion returns [EObject current=null] : iv_ruleAccionSeleccion= ruleAccionSeleccion EOF ;
    public final EObject entryRuleAccionSeleccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionSeleccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1974:2: (iv_ruleAccionSeleccion= ruleAccionSeleccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1975:2: iv_ruleAccionSeleccion= ruleAccionSeleccion EOF
            {
             newCompositeNode(grammarAccess.getAccionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion4425);
            iv_ruleAccionSeleccion=ruleAccionSeleccion();

            state._fsp--;

             current =iv_ruleAccionSeleccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionSeleccion4435); 

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
    // $ANTLR end "entryRuleAccionSeleccion"


    // $ANTLR start "ruleAccionSeleccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1982:1: ruleAccionSeleccion returns [EObject current=null] : (otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' ) ;
    public final EObject ruleAccionSeleccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_valor_3_0 = null;

        EObject lv_asercion_7_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1985:28: ( (otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1986:1: (otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1986:1: (otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1986:3: otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAccionSeleccion4472); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionSeleccionAccess().getAccionSeleccionKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAccionSeleccion4484); 

                	newLeafNode(otherlv_1, grammarAccess.getAccionSeleccionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAccionSeleccion4496); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionSeleccionAccess().getValorKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1998:1: ( (lv_valor_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1999:1: (lv_valor_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1999:1: (lv_valor_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2000:3: lv_valor_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getValorEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAccionSeleccion4517);
            lv_valor_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionSeleccionRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAccionSeleccion4529); 

                	newLeafNode(otherlv_4, grammarAccess.getAccionSeleccionAccess().getElementoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2020:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2021:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2021:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2022:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionSeleccionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getElementoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionSeleccion4552);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAccionSeleccion4564); 

                	newLeafNode(otherlv_6, grammarAccess.getAccionSeleccionAccess().getAsercionKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2039:1: ( (lv_asercion_7_0= ruleAsercion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2040:1: (lv_asercion_7_0= ruleAsercion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2040:1: (lv_asercion_7_0= ruleAsercion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2041:3: lv_asercion_7_0= ruleAsercion
            {
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getAsercionAsercionParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionSeleccion4585);
            lv_asercion_7_0=ruleAsercion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionSeleccionRule());
            	        }
                   		set(
                   			current, 
                   			"asercion",
                    		lv_asercion_7_0, 
                    		"Asercion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAccionSeleccion4597); 

                	newLeafNode(otherlv_8, grammarAccess.getAccionSeleccionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAccionSeleccion"


    // $ANTLR start "entryRuleAsercionInvisible"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2069:1: entryRuleAsercionInvisible returns [EObject current=null] : iv_ruleAsercionInvisible= ruleAsercionInvisible EOF ;
    public final EObject entryRuleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionInvisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2070:2: (iv_ruleAsercionInvisible= ruleAsercionInvisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2071:2: iv_ruleAsercionInvisible= ruleAsercionInvisible EOF
            {
             newCompositeNode(grammarAccess.getAsercionInvisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible4633);
            iv_ruleAsercionInvisible=ruleAsercionInvisible();

            state._fsp--;

             current =iv_ruleAsercionInvisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionInvisible4643); 

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
    // $ANTLR end "entryRuleAsercionInvisible"


    // $ANTLR start "ruleAsercionInvisible"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2078:1: ruleAsercionInvisible returns [EObject current=null] : ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        Token lv_estado_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2081:28: ( ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2082:1: ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2082:1: ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2082:2: ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2082:2: ( (lv_estado_0_0= 'estado' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2083:1: (lv_estado_0_0= 'estado' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2083:1: (lv_estado_0_0= 'estado' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2084:3: lv_estado_0_0= 'estado'
            {
            lv_estado_0_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAsercionInvisible4686); 

                    newLeafNode(lv_estado_0_0, grammarAccess.getAsercionInvisibleAccess().getEstadoEstadoKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
            	        }
                   		setWithLastConsumed(current, "estado", true, "estado");
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAsercionInvisible4711); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionInvisible4723); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionInvisibleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionInvisible4735); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionInvisibleAccess().getElementoKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2109:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2110:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2110:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2111:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionInvisibleAccess().getElementoInputCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionInvisible4758);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionInvisible4770); 

                	newLeafNode(otherlv_5, grammarAccess.getAsercionInvisibleAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAsercionInvisible"


    // $ANTLR start "entryRuleAsercionHabilitado"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2136:1: entryRuleAsercionHabilitado returns [EObject current=null] : iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF ;
    public final EObject entryRuleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2137:2: (iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2138:2: iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getAsercionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado4806);
            iv_ruleAsercionHabilitado=ruleAsercionHabilitado();

            state._fsp--;

             current =iv_ruleAsercionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionHabilitado4816); 

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
    // $ANTLR end "entryRuleAsercionHabilitado"


    // $ANTLR start "ruleAsercionHabilitado"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2145:1: ruleAsercionHabilitado returns [EObject current=null] : ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        Token lv_estado_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2148:28: ( ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2149:1: ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2149:1: ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2149:2: ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2149:2: ( (lv_estado_0_0= 'estado' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2150:1: (lv_estado_0_0= 'estado' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2150:1: (lv_estado_0_0= 'estado' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2151:3: lv_estado_0_0= 'estado'
            {
            lv_estado_0_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAsercionHabilitado4859); 

                    newLeafNode(lv_estado_0_0, grammarAccess.getAsercionHabilitadoAccess().getEstadoEstadoKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
            	        }
                   		setWithLastConsumed(current, "estado", true, "estado");
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleAsercionHabilitado4884); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionHabilitadoAccess().getAsercionHabilitadoKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionHabilitado4896); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionHabilitadoAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionHabilitado4908); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionHabilitadoAccess().getElementoKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2176:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2177:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2177:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2178:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionHabilitadoAccess().getElementoInputCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionHabilitado4931);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionHabilitado4943); 

                	newLeafNode(otherlv_5, grammarAccess.getAsercionHabilitadoAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAsercionHabilitado"


    // $ANTLR start "entryRuleAsercionValor"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2203:1: entryRuleAsercionValor returns [EObject current=null] : iv_ruleAsercionValor= ruleAsercionValor EOF ;
    public final EObject entryRuleAsercionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2204:2: (iv_ruleAsercionValor= ruleAsercionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2205:2: iv_ruleAsercionValor= ruleAsercionValor EOF
            {
             newCompositeNode(grammarAccess.getAsercionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor4979);
            iv_ruleAsercionValor=ruleAsercionValor();

            state._fsp--;

             current =iv_ruleAsercionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionValor4989); 

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
    // $ANTLR end "entryRuleAsercionValor"


    // $ANTLR start "ruleAsercionValor"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2212:1: ruleAsercionValor returns [EObject current=null] : (otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAsercionValor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valor_3_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2215:28: ( (otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2216:1: (otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2216:1: (otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2216:3: otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAsercionValor5026); 

                	newLeafNode(otherlv_0, grammarAccess.getAsercionValorAccess().getAsercionValorKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionValor5038); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionValorAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAsercionValor5050); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionValorAccess().getValorKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2228:1: ( (lv_valor_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2229:1: (lv_valor_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2229:1: (lv_valor_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2230:3: lv_valor_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsercionValorAccess().getValorEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor5071);
            lv_valor_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsercionValorRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionValor5083); 

                	newLeafNode(otherlv_4, grammarAccess.getAsercionValorAccess().getElementoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2250:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2251:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2251:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2252:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionValorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionValorAccess().getElementoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor5106);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionValor5118); 

                	newLeafNode(otherlv_6, grammarAccess.getAsercionValorAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAsercionValor"


    // $ANTLR start "entryRuleAsercionSeleccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2277:1: entryRuleAsercionSeleccion returns [EObject current=null] : iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF ;
    public final EObject entryRuleAsercionSeleccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionSeleccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2278:2: (iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2279:2: iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF
            {
             newCompositeNode(grammarAccess.getAsercionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion5154);
            iv_ruleAsercionSeleccion=ruleAsercionSeleccion();

            state._fsp--;

             current =iv_ruleAsercionSeleccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionSeleccion5164); 

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
    // $ANTLR end "entryRuleAsercionSeleccion"


    // $ANTLR start "ruleAsercionSeleccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2286:1: ruleAsercionSeleccion returns [EObject current=null] : (otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAsercionSeleccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_estado_3_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2289:28: ( (otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2290:1: (otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2290:1: (otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2290:3: otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAsercionSeleccion5201); 

                	newLeafNode(otherlv_0, grammarAccess.getAsercionSeleccionAccess().getAsercionSeleccionKeyword_0());
                
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionSeleccion5213); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionSeleccionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAsercionSeleccion5225); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionSeleccionAccess().getEstadoKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2302:1: ( (lv_estado_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2303:1: (lv_estado_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2303:1: (lv_estado_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2304:3: lv_estado_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getAsercionSeleccionAccess().getEstadoEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAsercionSeleccion5246);
            lv_estado_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsercionSeleccionRule());
            	        }
                   		set(
                   			current, 
                   			"estado",
                    		lv_estado_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionSeleccion5258); 

                	newLeafNode(otherlv_4, grammarAccess.getAsercionSeleccionAccess().getElementoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2324:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2325:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2325:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2326:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionSeleccionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionSeleccionAccess().getElementoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionSeleccion5281);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionSeleccion5293); 

                	newLeafNode(otherlv_6, grammarAccess.getAsercionSeleccionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAsercionSeleccion"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\31\1\32\1\33\10\uffff";
    static final String DFA4_maxS =
        "\3\47\10\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\2\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "\1\2\2\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "\2\3\1\uffff\1\4\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12",
            "",
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
            return "205:1: (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom )";
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
        public static final BitSet FOLLOW_16_in_ruleFormulario265 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_ruleFormulario286 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleFormulario300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_ruleInput393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_ruleInput420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_ruleInput447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_ruleInput474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_ruleInput501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_ruleInput528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_ruleInput555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_ruleInput582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion617 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccion627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_ruleAccion674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_ruleAccion701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccion_in_entryRuleReaccion736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccion746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_ruleReaccion793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_ruleReaccion820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercion_in_entryRuleAsercion855 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercion865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_ruleAsercion912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_ruleAsercion939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_ruleAsercion966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_ruleAsercion993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout1028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout1038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleLayout1075 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout1087 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLayout1099 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout1120 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_20_in_ruleLayout1133 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout1145 = new BitSet(new long[]{0x000000FC5E000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout1166 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleLayout1179 = new BitSet(new long[]{0x000000FC5E000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout1200 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleLayout1214 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLayout1228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1265 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1389 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz1399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePruebaInterfaz1445 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1466 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePruebaInterfaz1478 = new BitSet(new long[]{0x0000000000820000L});
        public static final BitSet FOLLOW_23_in_rulePruebaInterfaz1491 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePruebaInterfaz1503 = new BitSet(new long[]{0x0001200000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1524 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_rulePruebaInterfaz1537 = new BitSet(new long[]{0x0001200000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1558 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_rulePruebaInterfaz1572 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePruebaInterfaz1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1623 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEInt1673 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto1735 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto1745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInputTexto1797 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_26_in_ruleInputTexto1829 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleInputTexto1861 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleInputTexto1887 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1908 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputTexto1920 = new BitSet(new long[]{0x0000000020020000L});
        public static final BitSet FOLLOW_29_in_ruleInputTexto1933 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1954 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputTexto1968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio2004 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio2014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInputRadio2057 = new BitSet(new long[]{0x0000000044000000L});
        public static final BitSet FOLLOW_26_in_ruleInputRadio2089 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputRadio2115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2136 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2148 = new BitSet(new long[]{0x0000000380000000L});
        public static final BitSet FOLLOW_31_in_ruleInputRadio2161 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2173 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2194 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleInputRadio2207 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2228 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio2242 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleInputRadio2257 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputRadio2278 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleInputRadio2292 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_ruleReaccion_in_ruleInputRadio2313 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio2325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo2361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInputCombo2423 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_26_in_ruleInputCombo2455 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInputCombo2481 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2502 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2514 = new BitSet(new long[]{0x0000000180020000L});
        public static final BitSet FOLLOW_31_in_ruleInputCombo2527 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2539 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2560 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleInputCombo2573 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2594 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleInputCombo2608 = new BitSet(new long[]{0x0000000100020000L});
        public static final BitSet FOLLOW_32_in_ruleInputCombo2623 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCombo2644 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputCombo2658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck2694 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInputCheck2747 = new BitSet(new long[]{0x0000000804000000L});
        public static final BitSet FOLLOW_26_in_ruleInputCheck2779 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleInputCheck2805 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2826 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck2838 = new BitSet(new long[]{0x0000000380000000L});
        public static final BitSet FOLLOW_31_in_ruleInputCheck2851 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck2863 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2884 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleInputCheck2897 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2918 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck2932 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleInputCheck2947 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck2959 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck2980 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleInputCheck2993 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3014 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3028 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleInputCheck3042 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_ruleReaccion_in_ruleInputCheck3063 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar3111 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonValidar3121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBotonValidar3173 = new BitSet(new long[]{0x0000001004000000L});
        public static final BitSet FOLLOW_26_in_ruleBotonValidar3205 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleBotonValidar3231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonValidar3252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl3288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonGuardar_Impl3298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBotonGuardar_Impl3350 = new BitSet(new long[]{0x0000002004000000L});
        public static final BitSet FOLLOW_26_in_ruleBotonGuardar_Impl3382 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleBotonGuardar_Impl3408 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonGuardar_Impl3429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar3465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCancelar3475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBotonCancelar3527 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_26_in_ruleBotonCancelar3559 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleBotonCancelar3585 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCancelar3606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom3642 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCustom3652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBotonCustom3695 = new BitSet(new long[]{0x0000008004000000L});
        public static final BitSet FOLLOW_26_in_ruleBotonCustom3727 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleBotonCustom3753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCustom3774 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBotonCustom3786 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleBotonCustom3798 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCustom3819 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBotonCustom3831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible3867 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionVisible3877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleReaccionVisible3914 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleReaccionVisible3926 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleReaccionVisible3938 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReaccionVisible3959 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleReaccionVisible3971 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReaccionVisible3994 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleReaccionVisible4006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado4042 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionHabilitado4052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleReaccionHabilitado4089 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleReaccionHabilitado4101 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleReaccionHabilitado4113 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReaccionHabilitado4134 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleReaccionHabilitado4146 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReaccionHabilitado4169 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleReaccionHabilitado4181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_entryRuleAccionValor4217 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionValor4227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleAccionValor4264 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAccionValor4276 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAccionValor4288 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionValor4309 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAccionValor4321 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionValor4344 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleAccionValor4356 = new BitSet(new long[]{0x0032000000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionValor4377 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAccionValor4389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion4425 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionSeleccion4435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAccionSeleccion4472 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAccionSeleccion4484 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAccionSeleccion4496 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAccionSeleccion4517 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAccionSeleccion4529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionSeleccion4552 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleAccionSeleccion4564 = new BitSet(new long[]{0x0032000000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionSeleccion4585 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAccionSeleccion4597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible4633 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionInvisible4643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAsercionInvisible4686 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleAsercionInvisible4711 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionInvisible4723 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionInvisible4735 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionInvisible4758 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionInvisible4770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado4806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionHabilitado4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAsercionHabilitado4859 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleAsercionHabilitado4884 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionHabilitado4896 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionHabilitado4908 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionHabilitado4931 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionHabilitado4943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor4979 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionValor4989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleAsercionValor5026 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionValor5038 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAsercionValor5050 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor5071 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionValor5083 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor5106 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionValor5118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion5154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionSeleccion5164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleAsercionSeleccion5201 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionSeleccion5213 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49_in_ruleAsercionSeleccion5225 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAsercionSeleccion5246 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionSeleccion5258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionSeleccion5281 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionSeleccion5293 = new BitSet(new long[]{0x0000000000000002L});
    }


}