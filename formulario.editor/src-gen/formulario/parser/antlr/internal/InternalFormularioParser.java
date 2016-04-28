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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'comprobarAsercion'", "'comprobarAccion'", "'Formulario'", "'{'", "'layout'", "'pruebas'", "'}'", "'Layout'", "'anchura'", "'altura'", "'entradas'", "','", "'PruebaInterfaz'", "'acciones'", "'-'", "'visible'", "'habilitado'", "'obligatorio'", "'InputTexto'", "'valor'", "'InputRadio'", "'valores'", "'seleccion'", "'reaccion'", "'InputCombo'", "'InputCheck'", "'BotonValidar'", "'BotonGuardar'", "'BotonCancelar'", "'BotonCustom'", "'funcion'", "'ReaccionVisible'", "'activacion'", "'objetivo'", "'ReaccionHabilitado'", "'AccionValor'", "'elemento'", "'asercion'", "'AccionSeleccion'", "'estado'", "'AsercionInvisible'", "'AsercionHabilitado'", "'AsercionValor'", "'AsercionSeleccion'"
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
    public static final int T__54=54;
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

            if ( (LA5_0==46) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
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

            if ( (LA6_0==42) ) {
                alt6=1;
            }
            else if ( (LA6_0==45) ) {
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
            case 50:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==52) ) {
                    alt7=2;
                }
                else if ( (LA7_1==51) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 51:
                {
                alt7=1;
                }
                break;
            case 52:
                {
                alt7=2;
                }
                break;
            case 53:
                {
                alt7=3;
                }
                break;
            case 54:
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:441:1: ruleLayout returns [EObject current=null] : ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:444:28: ( ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:445:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:445:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:445:2: () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:445:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:446:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLayoutAccess().getLayoutAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLayout1084); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLayoutKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout1096); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:459:1: (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:459:3: otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLayout1109); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getAnchuraKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:463:1: ( (lv_anchura_4_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:464:1: (lv_anchura_4_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:464:1: (lv_anchura_4_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:465:3: lv_anchura_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getAnchuraEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout1130);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:481:4: (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:481:6: otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLayout1145); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getAlturaKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:485:1: ( (lv_altura_6_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:486:1: (lv_altura_6_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:486:1: (lv_altura_6_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:487:3: lv_altura_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getAlturaEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout1166);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:503:4: (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:503:6: otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLayout1181); 

                        	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getEntradasKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout1193); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:511:1: ( (lv_entradas_9_0= ruleInput ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:512:1: (lv_entradas_9_0= ruleInput )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:512:1: (lv_entradas_9_0= ruleInput )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:513:3: lv_entradas_9_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout1214);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:529:2: (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==22) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:529:4: otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) )
                    	    {
                    	    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLayout1227); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getLayoutAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:533:1: ( (lv_entradas_11_0= ruleInput ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:534:1: (lv_entradas_11_0= ruleInput )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:534:1: (lv_entradas_11_0= ruleInput )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:535:3: lv_entradas_11_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout1248);
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
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout1262); 

                        	newLeafNode(otherlv_12, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout1276); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:567:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:568:2: (iv_ruleEString= ruleEString EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:569:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1313);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1324); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:576:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:579:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:580:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:580:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:580:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1364); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:588:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1390); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:605:1: entryRulePruebaInterfaz returns [EObject current=null] : iv_rulePruebaInterfaz= rulePruebaInterfaz EOF ;
    public final EObject entryRulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePruebaInterfaz = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:606:2: (iv_rulePruebaInterfaz= rulePruebaInterfaz EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:607:2: iv_rulePruebaInterfaz= rulePruebaInterfaz EOF
            {
             newCompositeNode(grammarAccess.getPruebaInterfazRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1437);
            iv_rulePruebaInterfaz=rulePruebaInterfaz();

            state._fsp--;

             current =iv_rulePruebaInterfaz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz1447); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:614:1: rulePruebaInterfaz returns [EObject current=null] : ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:617:28: ( ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:618:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:618:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:618:2: () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:618:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:619:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePruebaInterfaz1493); 

                	newLeafNode(otherlv_1, grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:628:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:629:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:629:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:630:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1514);
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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePruebaInterfaz1526); 

                	newLeafNode(otherlv_3, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:650:1: (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:650:3: otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePruebaInterfaz1539); 

                        	newLeafNode(otherlv_4, grammarAccess.getPruebaInterfazAccess().getAccionesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePruebaInterfaz1551); 

                        	newLeafNode(otherlv_5, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:658:1: ( (lv_acciones_6_0= ruleAccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:659:1: (lv_acciones_6_0= ruleAccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:659:1: (lv_acciones_6_0= ruleAccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:660:3: lv_acciones_6_0= ruleAccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1572);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:676:2: (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==22) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:676:4: otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePruebaInterfaz1585); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPruebaInterfazAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:680:1: ( (lv_acciones_8_0= ruleAccion ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:681:1: (lv_acciones_8_0= ruleAccion )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:681:1: (lv_acciones_8_0= ruleAccion )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:682:3: lv_acciones_8_0= ruleAccion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1606);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePruebaInterfaz1620); 

                        	newLeafNode(otherlv_9, grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePruebaInterfaz1634); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:714:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:715:2: (iv_ruleEInt= ruleEInt EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:716:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1671);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1682); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:723:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:726:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:727:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:727:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:727:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:727:2: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:728:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEInt1721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1738); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:748:1: entryRuleInputTexto returns [EObject current=null] : iv_ruleInputTexto= ruleInputTexto EOF ;
    public final EObject entryRuleInputTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTexto = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:749:2: (iv_ruleInputTexto= ruleInputTexto EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:750:2: iv_ruleInputTexto= ruleInputTexto EOF
            {
             newCompositeNode(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto1783);
            iv_ruleInputTexto=ruleInputTexto();

            state._fsp--;

             current =iv_ruleInputTexto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto1793); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:757:1: ruleInputTexto returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:760:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:761:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:761:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:761:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:761:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:762:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputTextoAccess().getInputTextoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:767:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:768:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:768:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:769:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputTexto1845); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:782:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:783:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:783:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:784:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputTexto1877); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:797:3: ( (lv_obligatorio_3_0= 'obligatorio' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:798:1: (lv_obligatorio_3_0= 'obligatorio' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:798:1: (lv_obligatorio_3_0= 'obligatorio' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:799:3: lv_obligatorio_3_0= 'obligatorio'
                    {
                    lv_obligatorio_3_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputTexto1909); 

                            newLeafNode(lv_obligatorio_3_0, grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "obligatorio", true, "obligatorio");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputTexto1935); 

                	newLeafNode(otherlv_4, grammarAccess.getInputTextoAccess().getInputTextoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:816:1: ( (lv_name_5_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:817:1: (lv_name_5_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:817:1: (lv_name_5_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:818:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1956);
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

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputTexto1968); 

                	newLeafNode(otherlv_6, grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:838:1: (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:838:3: otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputTexto1981); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputTextoAccess().getValorKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:842:1: ( (lv_valor_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:843:1: (lv_valor_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:843:1: (lv_valor_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:844:3: lv_valor_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto2002);
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

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputTexto2016); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:872:1: entryRuleInputRadio returns [EObject current=null] : iv_ruleInputRadio= ruleInputRadio EOF ;
    public final EObject entryRuleInputRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRadio = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:873:2: (iv_ruleInputRadio= ruleInputRadio EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:874:2: iv_ruleInputRadio= ruleInputRadio EOF
            {
             newCompositeNode(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio2052);
            iv_ruleInputRadio=ruleInputRadio();

            state._fsp--;

             current =iv_ruleInputRadio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio2062); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:881:1: ruleInputRadio returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? (otherlv_14= 'reaccion' ( (lv_reaccion_15_0= ruleReaccion ) ) )? otherlv_16= '}' ) ;
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
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_8_0 = null;

        AntlrDatatypeRuleToken lv_valores_10_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_13_0 = null;

        EObject lv_reaccion_15_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:884:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? (otherlv_14= 'reaccion' ( (lv_reaccion_15_0= ruleReaccion ) ) )? otherlv_16= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:885:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? (otherlv_14= 'reaccion' ( (lv_reaccion_15_0= ruleReaccion ) ) )? otherlv_16= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:885:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? (otherlv_14= 'reaccion' ( (lv_reaccion_15_0= ruleReaccion ) ) )? otherlv_16= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:885:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? (otherlv_14= 'reaccion' ( (lv_reaccion_15_0= ruleReaccion ) ) )? otherlv_16= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:885:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:886:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputRadioAccess().getInputRadioAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:891:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:892:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:892:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:893:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputRadio2114); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:906:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:907:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:907:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:908:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputRadio2146); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputRadio2172); 

                	newLeafNode(otherlv_3, grammarAccess.getInputRadioAccess().getInputRadioKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:925:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:926:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:926:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:927:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2193);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2205); 

                	newLeafNode(otherlv_5, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:947:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:947:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputRadio2218); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputRadioAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2230); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:955:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:956:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:956:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:957:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2251);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:973:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==22) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:973:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputRadio2264); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputRadioAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:977:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:978:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:978:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:979:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2285);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio2299); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:999:3: (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:999:5: otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputRadio2314); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputRadioAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1003:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1004:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1004:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1005:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputRadio2335);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1021:4: (otherlv_14= 'reaccion' ( (lv_reaccion_15_0= ruleReaccion ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1021:6: otherlv_14= 'reaccion' ( (lv_reaccion_15_0= ruleReaccion ) )
                    {
                    otherlv_14=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInputRadio2350); 

                        	newLeafNode(otherlv_14, grammarAccess.getInputRadioAccess().getReaccionKeyword_8_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1025:1: ( (lv_reaccion_15_0= ruleReaccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1026:1: (lv_reaccion_15_0= ruleReaccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1026:1: (lv_reaccion_15_0= ruleReaccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1027:3: lv_reaccion_15_0= ruleReaccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getReaccionReaccionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_ruleInputRadio2371);
                    lv_reaccion_15_0=ruleReaccion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		set(
                           			current, 
                           			"reaccion",
                            		lv_reaccion_15_0, 
                            		"Reaccion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio2385); 

                	newLeafNode(otherlv_16, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1055:1: entryRuleInputCombo returns [EObject current=null] : iv_ruleInputCombo= ruleInputCombo EOF ;
    public final EObject entryRuleInputCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCombo = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1056:2: (iv_ruleInputCombo= ruleInputCombo EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1057:2: iv_ruleInputCombo= ruleInputCombo EOF
            {
             newCompositeNode(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo2421);
            iv_ruleInputCombo=ruleInputCombo();

            state._fsp--;

             current =iv_ruleInputCombo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo2431); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1064:1: ruleInputCombo returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1067:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1068:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1068:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1068:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1068:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1069:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputComboAccess().getInputComboAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1074:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1075:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1075:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1076:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputCombo2483); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1089:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1090:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1090:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1091:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputCombo2515); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInputCombo2541); 

                	newLeafNode(otherlv_3, grammarAccess.getInputComboAccess().getInputComboKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1108:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1109:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1109:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1110:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2562);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2574); 

                	newLeafNode(otherlv_5, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1130:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1130:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputCombo2587); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputComboAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2599); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1138:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1139:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1139:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1140:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2620);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1156:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==22) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1156:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCombo2633); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputComboAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1160:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1161:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1161:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1162:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2654);
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
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCombo2668); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1182:3: (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1182:5: otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCombo2683); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1186:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1187:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1187:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1188:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCombo2704);
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

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCombo2718); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1216:1: entryRuleInputCheck returns [EObject current=null] : iv_ruleInputCheck= ruleInputCheck EOF ;
    public final EObject entryRuleInputCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCheck = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1217:2: (iv_ruleInputCheck= ruleInputCheck EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1218:2: iv_ruleInputCheck= ruleInputCheck EOF
            {
             newCompositeNode(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck2754);
            iv_ruleInputCheck=ruleInputCheck();

            state._fsp--;

             current =iv_ruleInputCheck; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck2764); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1225:1: ruleInputCheck returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? (otherlv_18= 'reaccion' ( (lv_reaccion_19_0= ruleReaccion ) ) )? otherlv_20= '}' ) ;
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
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_8_0 = null;

        AntlrDatatypeRuleToken lv_valores_10_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_14_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_16_0 = null;

        EObject lv_reaccion_19_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1228:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? (otherlv_18= 'reaccion' ( (lv_reaccion_19_0= ruleReaccion ) ) )? otherlv_20= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1229:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? (otherlv_18= 'reaccion' ( (lv_reaccion_19_0= ruleReaccion ) ) )? otherlv_20= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1229:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? (otherlv_18= 'reaccion' ( (lv_reaccion_19_0= ruleReaccion ) ) )? otherlv_20= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1229:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? (otherlv_18= 'reaccion' ( (lv_reaccion_19_0= ruleReaccion ) ) )? otherlv_20= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1229:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1230:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputCheckAccess().getInputCheckAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1235:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1236:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1236:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1237:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputCheck2816); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1250:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1251:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1251:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1252:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputCheck2848); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInputCheck2874); 

                	newLeafNode(otherlv_3, grammarAccess.getInputCheckAccess().getInputCheckKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1269:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1270:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1270:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1271:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2895);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck2907); 

                	newLeafNode(otherlv_5, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1291:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1291:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputCheck2920); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputCheckAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck2932); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1299:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1300:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1300:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1301:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2953);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1317:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==22) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1317:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCheck2966); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1321:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1322:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1322:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1323:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2987);
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
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3001); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1343:3: (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1343:5: otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCheck3016); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputCheckAccess().getSeleccionKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck3028); 

                        	newLeafNode(otherlv_13, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1351:1: ( (lv_seleccion_14_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1352:1: (lv_seleccion_14_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1352:1: (lv_seleccion_14_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1353:3: lv_seleccion_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3049);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1369:2: (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==22) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1369:4: otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) )
                    	    {
                    	    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCheck3062); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getInputCheckAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1373:1: ( (lv_seleccion_16_0= ruleEInt ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1374:1: (lv_seleccion_16_0= ruleEInt )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1374:1: (lv_seleccion_16_0= ruleEInt )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1375:3: lv_seleccion_16_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3083);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3097); 

                        	newLeafNode(otherlv_17, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1395:3: (otherlv_18= 'reaccion' ( (lv_reaccion_19_0= ruleReaccion ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1395:5: otherlv_18= 'reaccion' ( (lv_reaccion_19_0= ruleReaccion ) )
                    {
                    otherlv_18=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInputCheck3112); 

                        	newLeafNode(otherlv_18, grammarAccess.getInputCheckAccess().getReaccionKeyword_8_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1399:1: ( (lv_reaccion_19_0= ruleReaccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1400:1: (lv_reaccion_19_0= ruleReaccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1400:1: (lv_reaccion_19_0= ruleReaccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1401:3: lv_reaccion_19_0= ruleReaccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getReaccionReaccionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_ruleInputCheck3133);
                    lv_reaccion_19_0=ruleReaccion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"reaccion",
                            		lv_reaccion_19_0, 
                            		"Reaccion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3147); 

                	newLeafNode(otherlv_20, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1429:1: entryRuleBotonValidar returns [EObject current=null] : iv_ruleBotonValidar= ruleBotonValidar EOF ;
    public final EObject entryRuleBotonValidar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonValidar = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1430:2: (iv_ruleBotonValidar= ruleBotonValidar EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1431:2: iv_ruleBotonValidar= ruleBotonValidar EOF
            {
             newCompositeNode(grammarAccess.getBotonValidarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar3183);
            iv_ruleBotonValidar=ruleBotonValidar();

            state._fsp--;

             current =iv_ruleBotonValidar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonValidar3193); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1438:1: ruleBotonValidar returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonValidar() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1441:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1442:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1442:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1442:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1442:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1443:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonValidarAccess().getBotonValidarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1448:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1449:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1449:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1450:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonValidar3245); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonValidarAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonValidarRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1463:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1464:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1464:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1465:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBotonValidar3277); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonValidarAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonValidarRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBotonValidar3303); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonValidarAccess().getBotonValidarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1482:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1483:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1483:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1484:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonValidarAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonValidar3324);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1508:1: entryRuleBotonGuardar_Impl returns [EObject current=null] : iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF ;
    public final EObject entryRuleBotonGuardar_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonGuardar_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1509:2: (iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1510:2: iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF
            {
             newCompositeNode(grammarAccess.getBotonGuardar_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl3360);
            iv_ruleBotonGuardar_Impl=ruleBotonGuardar_Impl();

            state._fsp--;

             current =iv_ruleBotonGuardar_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonGuardar_Impl3370); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1517:1: ruleBotonGuardar_Impl returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonGuardar_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1520:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1521:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1521:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1521:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1521:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1522:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1527:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1528:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1528:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1529:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonGuardar_Impl3422); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonGuardar_ImplAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonGuardar_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1542:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1543:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1543:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1544:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBotonGuardar_Impl3454); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonGuardar_ImplAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonGuardar_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBotonGuardar_Impl3480); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1561:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1562:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1562:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1563:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonGuardar_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonGuardar_Impl3501);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1587:1: entryRuleBotonCancelar returns [EObject current=null] : iv_ruleBotonCancelar= ruleBotonCancelar EOF ;
    public final EObject entryRuleBotonCancelar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCancelar = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1588:2: (iv_ruleBotonCancelar= ruleBotonCancelar EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1589:2: iv_ruleBotonCancelar= ruleBotonCancelar EOF
            {
             newCompositeNode(grammarAccess.getBotonCancelarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar3537);
            iv_ruleBotonCancelar=ruleBotonCancelar();

            state._fsp--;

             current =iv_ruleBotonCancelar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCancelar3547); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1596:1: ruleBotonCancelar returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonCancelar() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1599:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1600:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1600:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1600:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1600:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1601:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonCancelarAccess().getBotonCancelarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1606:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==26) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1607:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1607:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1608:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonCancelar3599); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonCancelarAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCancelarRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1621:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==27) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1622:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1622:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1623:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBotonCancelar3631); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonCancelarAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCancelarRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBotonCancelar3657); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonCancelarAccess().getBotonCancelarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1640:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1641:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1641:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1642:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCancelarAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCancelar3678);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1666:1: entryRuleBotonCustom returns [EObject current=null] : iv_ruleBotonCustom= ruleBotonCustom EOF ;
    public final EObject entryRuleBotonCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCustom = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1667:2: (iv_ruleBotonCustom= ruleBotonCustom EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1668:2: iv_ruleBotonCustom= ruleBotonCustom EOF
            {
             newCompositeNode(grammarAccess.getBotonCustomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom3714);
            iv_ruleBotonCustom=ruleBotonCustom();

            state._fsp--;

             current =iv_ruleBotonCustom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCustom3724); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1675:1: ruleBotonCustom returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCustom' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'funcion' ( (lv_funcion_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleBotonCustom() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_funcion_7_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1678:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCustom' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'funcion' ( (lv_funcion_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1679:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCustom' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'funcion' ( (lv_funcion_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1679:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCustom' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'funcion' ( (lv_funcion_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1679:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCustom' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'funcion' ( (lv_funcion_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1679:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1680:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonCustomAccess().getBotonCustomAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1685:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1686:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1686:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1687:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonCustom3776); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonCustomAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCustomRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1700:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==27) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1701:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1701:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1702:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBotonCustom3808); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonCustomAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCustomRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBotonCustom3834); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonCustomAccess().getBotonCustomKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1719:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1720:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1720:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1721:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCustomAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCustom3855);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBotonCustomRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleBotonCustom3867); 

                	newLeafNode(otherlv_5, grammarAccess.getBotonCustomAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1741:1: (otherlv_6= 'funcion' ( (lv_funcion_7_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==41) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1741:3: otherlv_6= 'funcion' ( (lv_funcion_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleBotonCustom3880); 

                        	newLeafNode(otherlv_6, grammarAccess.getBotonCustomAccess().getFuncionKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1745:1: ( (lv_funcion_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1746:1: (lv_funcion_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1746:1: (lv_funcion_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1747:3: lv_funcion_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBotonCustomAccess().getFuncionEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCustom3901);
                    lv_funcion_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBotonCustomRule());
                    	        }
                           		set(
                           			current, 
                           			"funcion",
                            		lv_funcion_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBotonCustom3915); 

                	newLeafNode(otherlv_8, grammarAccess.getBotonCustomAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1775:1: entryRuleReaccionVisible returns [EObject current=null] : iv_ruleReaccionVisible= ruleReaccionVisible EOF ;
    public final EObject entryRuleReaccionVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccionVisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1776:2: (iv_ruleReaccionVisible= ruleReaccionVisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1777:2: iv_ruleReaccionVisible= ruleReaccionVisible EOF
            {
             newCompositeNode(grammarAccess.getReaccionVisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible3951);
            iv_ruleReaccionVisible=ruleReaccionVisible();

            state._fsp--;

             current =iv_ruleReaccionVisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionVisible3961); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1784:1: ruleReaccionVisible returns [EObject current=null] : ( () otherlv_1= 'ReaccionVisible' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleReaccionVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_activacion_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1787:28: ( ( () otherlv_1= 'ReaccionVisible' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1788:1: ( () otherlv_1= 'ReaccionVisible' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1788:1: ( () otherlv_1= 'ReaccionVisible' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1788:2: () otherlv_1= 'ReaccionVisible' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1788:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1789:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReaccionVisibleAccess().getReaccionVisibleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleReaccionVisible4007); 

                	newLeafNode(otherlv_1, grammarAccess.getReaccionVisibleAccess().getReaccionVisibleKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleReaccionVisible4019); 

                	newLeafNode(otherlv_2, grammarAccess.getReaccionVisibleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1802:1: (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==43) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1802:3: otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleReaccionVisible4032); 

                        	newLeafNode(otherlv_3, grammarAccess.getReaccionVisibleAccess().getActivacionKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1806:1: ( (lv_activacion_4_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1807:1: (lv_activacion_4_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1807:1: (lv_activacion_4_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1808:3: lv_activacion_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReaccionVisibleAccess().getActivacionEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReaccionVisible4053);
                    lv_activacion_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReaccionVisibleRule());
                    	        }
                           		set(
                           			current, 
                           			"activacion",
                            		lv_activacion_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1824:4: (otherlv_5= 'objetivo' ( ( ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==44) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1824:6: otherlv_5= 'objetivo' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleReaccionVisible4068); 

                        	newLeafNode(otherlv_5, grammarAccess.getReaccionVisibleAccess().getObjetivoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1828:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1829:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1829:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1830:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReaccionVisibleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReaccionVisibleAccess().getObjetivoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReaccionVisible4091);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReaccionVisible4105); 

                	newLeafNode(otherlv_7, grammarAccess.getReaccionVisibleAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1855:1: entryRuleReaccionHabilitado returns [EObject current=null] : iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF ;
    public final EObject entryRuleReaccionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1856:2: (iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1857:2: iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getReaccionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado4141);
            iv_ruleReaccionHabilitado=ruleReaccionHabilitado();

            state._fsp--;

             current =iv_ruleReaccionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionHabilitado4151); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1864:1: ruleReaccionHabilitado returns [EObject current=null] : ( () otherlv_1= 'ReaccionHabilitado' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleReaccionHabilitado() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_activacion_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1867:28: ( ( () otherlv_1= 'ReaccionHabilitado' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1868:1: ( () otherlv_1= 'ReaccionHabilitado' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1868:1: ( () otherlv_1= 'ReaccionHabilitado' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1868:2: () otherlv_1= 'ReaccionHabilitado' otherlv_2= '{' (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )? (otherlv_5= 'objetivo' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1868:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1869:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReaccionHabilitadoAccess().getReaccionHabilitadoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleReaccionHabilitado4197); 

                	newLeafNode(otherlv_1, grammarAccess.getReaccionHabilitadoAccess().getReaccionHabilitadoKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleReaccionHabilitado4209); 

                	newLeafNode(otherlv_2, grammarAccess.getReaccionHabilitadoAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1882:1: (otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==43) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1882:3: otherlv_3= 'activacion' ( (lv_activacion_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleReaccionHabilitado4222); 

                        	newLeafNode(otherlv_3, grammarAccess.getReaccionHabilitadoAccess().getActivacionKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1886:1: ( (lv_activacion_4_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1887:1: (lv_activacion_4_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1887:1: (lv_activacion_4_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1888:3: lv_activacion_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReaccionHabilitadoAccess().getActivacionEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReaccionHabilitado4243);
                    lv_activacion_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReaccionHabilitadoRule());
                    	        }
                           		set(
                           			current, 
                           			"activacion",
                            		lv_activacion_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1904:4: (otherlv_5= 'objetivo' ( ( ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==44) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1904:6: otherlv_5= 'objetivo' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleReaccionHabilitado4258); 

                        	newLeafNode(otherlv_5, grammarAccess.getReaccionHabilitadoAccess().getObjetivoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1908:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1909:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1909:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1910:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReaccionHabilitadoRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReaccionHabilitado4281);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReaccionHabilitado4295); 

                	newLeafNode(otherlv_7, grammarAccess.getReaccionHabilitadoAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1935:1: entryRuleAccionValor returns [EObject current=null] : iv_ruleAccionValor= ruleAccionValor EOF ;
    public final EObject entryRuleAccionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1936:2: (iv_ruleAccionValor= ruleAccionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1937:2: iv_ruleAccionValor= ruleAccionValor EOF
            {
             newCompositeNode(grammarAccess.getAccionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_entryRuleAccionValor4331);
            iv_ruleAccionValor=ruleAccionValor();

            state._fsp--;

             current =iv_ruleAccionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionValor4341); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1944:1: ruleAccionValor returns [EObject current=null] : ( () otherlv_1= 'AccionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleAccionValor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_valor_4_0 = null;

        EObject lv_asercion_8_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1947:28: ( ( () otherlv_1= 'AccionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1948:1: ( () otherlv_1= 'AccionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1948:1: ( () otherlv_1= 'AccionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1948:2: () otherlv_1= 'AccionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1948:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1949:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccionValorAccess().getAccionValorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAccionValor4387); 

                	newLeafNode(otherlv_1, grammarAccess.getAccionValorAccess().getAccionValorKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAccionValor4399); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionValorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1962:1: (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==30) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1962:3: otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAccionValor4412); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccionValorAccess().getValorKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1966:1: ( (lv_valor_4_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1967:1: (lv_valor_4_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1967:1: (lv_valor_4_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1968:3: lv_valor_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccionValorAccess().getValorEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionValor4433);
                    lv_valor_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccionValorRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1984:4: (otherlv_5= 'elemento' ( ( ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1984:6: otherlv_5= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAccionValor4448); 

                        	newLeafNode(otherlv_5, grammarAccess.getAccionValorAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1988:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1989:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1989:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1990:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAccionValorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAccionValorAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionValor4471);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2003:4: (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==48) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2003:6: otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) )
                    {
                    otherlv_7=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAccionValor4486); 

                        	newLeafNode(otherlv_7, grammarAccess.getAccionValorAccess().getAsercionKeyword_5_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2007:1: ( (lv_asercion_8_0= ruleAsercion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2008:1: (lv_asercion_8_0= ruleAsercion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2008:1: (lv_asercion_8_0= ruleAsercion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2009:3: lv_asercion_8_0= ruleAsercion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccionValorAccess().getAsercionAsercionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionValor4507);
                    lv_asercion_8_0=ruleAsercion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccionValorRule());
                    	        }
                           		set(
                           			current, 
                           			"asercion",
                            		lv_asercion_8_0, 
                            		"Asercion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAccionValor4521); 

                	newLeafNode(otherlv_9, grammarAccess.getAccionValorAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2037:1: entryRuleAccionSeleccion returns [EObject current=null] : iv_ruleAccionSeleccion= ruleAccionSeleccion EOF ;
    public final EObject entryRuleAccionSeleccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionSeleccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2038:2: (iv_ruleAccionSeleccion= ruleAccionSeleccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2039:2: iv_ruleAccionSeleccion= ruleAccionSeleccion EOF
            {
             newCompositeNode(grammarAccess.getAccionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion4557);
            iv_ruleAccionSeleccion=ruleAccionSeleccion();

            state._fsp--;

             current =iv_ruleAccionSeleccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionSeleccion4567); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2046:1: ruleAccionSeleccion returns [EObject current=null] : ( () otherlv_1= 'AccionSeleccion' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleAccionSeleccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_valor_4_0 = null;

        EObject lv_asercion_8_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2049:28: ( ( () otherlv_1= 'AccionSeleccion' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2050:1: ( () otherlv_1= 'AccionSeleccion' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2050:1: ( () otherlv_1= 'AccionSeleccion' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2050:2: () otherlv_1= 'AccionSeleccion' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )? otherlv_9= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2050:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2051:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccionSeleccionAccess().getAccionSeleccionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAccionSeleccion4613); 

                	newLeafNode(otherlv_1, grammarAccess.getAccionSeleccionAccess().getAccionSeleccionKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAccionSeleccion4625); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionSeleccionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2064:1: (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEInt ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==30) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2064:3: otherlv_3= 'valor' ( (lv_valor_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAccionSeleccion4638); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccionSeleccionAccess().getValorKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2068:1: ( (lv_valor_4_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2069:1: (lv_valor_4_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2069:1: (lv_valor_4_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2070:3: lv_valor_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getValorEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAccionSeleccion4659);
                    lv_valor_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccionSeleccionRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2086:4: (otherlv_5= 'elemento' ( ( ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2086:6: otherlv_5= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAccionSeleccion4674); 

                        	newLeafNode(otherlv_5, grammarAccess.getAccionSeleccionAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2090:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2091:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2091:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2092:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAccionSeleccionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionSeleccion4697);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2105:4: (otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==48) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2105:6: otherlv_7= 'asercion' ( (lv_asercion_8_0= ruleAsercion ) )
                    {
                    otherlv_7=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAccionSeleccion4712); 

                        	newLeafNode(otherlv_7, grammarAccess.getAccionSeleccionAccess().getAsercionKeyword_5_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2109:1: ( (lv_asercion_8_0= ruleAsercion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2110:1: (lv_asercion_8_0= ruleAsercion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2110:1: (lv_asercion_8_0= ruleAsercion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2111:3: lv_asercion_8_0= ruleAsercion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getAsercionAsercionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionSeleccion4733);
                    lv_asercion_8_0=ruleAsercion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccionSeleccionRule());
                    	        }
                           		set(
                           			current, 
                           			"asercion",
                            		lv_asercion_8_0, 
                            		"Asercion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAccionSeleccion4747); 

                	newLeafNode(otherlv_9, grammarAccess.getAccionSeleccionAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2139:1: entryRuleAsercionInvisible returns [EObject current=null] : iv_ruleAsercionInvisible= ruleAsercionInvisible EOF ;
    public final EObject entryRuleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionInvisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2140:2: (iv_ruleAsercionInvisible= ruleAsercionInvisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2141:2: iv_ruleAsercionInvisible= ruleAsercionInvisible EOF
            {
             newCompositeNode(grammarAccess.getAsercionInvisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible4783);
            iv_ruleAsercionInvisible=ruleAsercionInvisible();

            state._fsp--;

             current =iv_ruleAsercionInvisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionInvisible4793); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2148:1: ruleAsercionInvisible returns [EObject current=null] : ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        Token lv_estado_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2151:28: ( ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2152:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2152:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2152:2: () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2152:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2153:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2158:2: ( (lv_estado_1_0= 'estado' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2159:1: (lv_estado_1_0= 'estado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2159:1: (lv_estado_1_0= 'estado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2160:3: lv_estado_1_0= 'estado'
                    {
                    lv_estado_1_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAsercionInvisible4845); 

                            newLeafNode(lv_estado_1_0, grammarAccess.getAsercionInvisibleAccess().getEstadoEstadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
                    	        }
                           		setWithLastConsumed(current, "estado", true, "estado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleAsercionInvisible4871); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionInvisible4883); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionInvisibleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2181:1: (otherlv_4= 'elemento' ( ( ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==47) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2181:3: otherlv_4= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAsercionInvisible4896); 

                        	newLeafNode(otherlv_4, grammarAccess.getAsercionInvisibleAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2185:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2186:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2186:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2187:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAsercionInvisibleAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionInvisible4919);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionInvisible4933); 

                	newLeafNode(otherlv_6, grammarAccess.getAsercionInvisibleAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2212:1: entryRuleAsercionHabilitado returns [EObject current=null] : iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF ;
    public final EObject entryRuleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2213:2: (iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2214:2: iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getAsercionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado4969);
            iv_ruleAsercionHabilitado=ruleAsercionHabilitado();

            state._fsp--;

             current =iv_ruleAsercionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionHabilitado4979); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2221:1: ruleAsercionHabilitado returns [EObject current=null] : ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        Token lv_estado_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2224:28: ( ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2225:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2225:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2225:2: () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2225:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAsercionHabilitadoAccess().getAsercionHabilitadoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2231:2: ( (lv_estado_1_0= 'estado' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==50) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2232:1: (lv_estado_1_0= 'estado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2232:1: (lv_estado_1_0= 'estado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2233:3: lv_estado_1_0= 'estado'
                    {
                    lv_estado_1_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAsercionHabilitado5031); 

                            newLeafNode(lv_estado_1_0, grammarAccess.getAsercionHabilitadoAccess().getEstadoEstadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
                    	        }
                           		setWithLastConsumed(current, "estado", true, "estado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAsercionHabilitado5057); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionHabilitadoAccess().getAsercionHabilitadoKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionHabilitado5069); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionHabilitadoAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2254:1: (otherlv_4= 'elemento' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==47) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2254:3: otherlv_4= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAsercionHabilitado5082); 

                        	newLeafNode(otherlv_4, grammarAccess.getAsercionHabilitadoAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2258:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2259:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2259:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2260:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAsercionHabilitadoAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionHabilitado5105);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionHabilitado5119); 

                	newLeafNode(otherlv_6, grammarAccess.getAsercionHabilitadoAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2285:1: entryRuleAsercionValor returns [EObject current=null] : iv_ruleAsercionValor= ruleAsercionValor EOF ;
    public final EObject entryRuleAsercionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2286:2: (iv_ruleAsercionValor= ruleAsercionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2287:2: iv_ruleAsercionValor= ruleAsercionValor EOF
            {
             newCompositeNode(grammarAccess.getAsercionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor5155);
            iv_ruleAsercionValor=ruleAsercionValor();

            state._fsp--;

             current =iv_ruleAsercionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionValor5165); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2294:1: ruleAsercionValor returns [EObject current=null] : ( () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAsercionValor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_valor_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2297:28: ( ( () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2298:1: ( () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2298:1: ( () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2298:2: () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2298:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2299:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAsercionValorAccess().getAsercionValorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAsercionValor5211); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionValorAccess().getAsercionValorKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionValor5223); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionValorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2312:1: (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==30) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2312:3: otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAsercionValor5236); 

                        	newLeafNode(otherlv_3, grammarAccess.getAsercionValorAccess().getValorKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2316:1: ( (lv_valor_4_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2317:1: (lv_valor_4_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2317:1: (lv_valor_4_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2318:3: lv_valor_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAsercionValorAccess().getValorEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor5257);
                    lv_valor_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAsercionValorRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2334:4: (otherlv_5= 'elemento' ( ( ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==47) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2334:6: otherlv_5= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAsercionValor5272); 

                        	newLeafNode(otherlv_5, grammarAccess.getAsercionValorAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2338:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2339:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2339:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2340:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionValorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAsercionValorAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor5295);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionValor5309); 

                	newLeafNode(otherlv_7, grammarAccess.getAsercionValorAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2365:1: entryRuleAsercionSeleccion returns [EObject current=null] : iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF ;
    public final EObject entryRuleAsercionSeleccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionSeleccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2366:2: (iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2367:2: iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF
            {
             newCompositeNode(grammarAccess.getAsercionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion5345);
            iv_ruleAsercionSeleccion=ruleAsercionSeleccion();

            state._fsp--;

             current =iv_ruleAsercionSeleccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionSeleccion5355); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2374:1: ruleAsercionSeleccion returns [EObject current=null] : ( () otherlv_1= 'AsercionSeleccion' otherlv_2= '{' (otherlv_3= 'estado' ( (lv_estado_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAsercionSeleccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_estado_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2377:28: ( ( () otherlv_1= 'AsercionSeleccion' otherlv_2= '{' (otherlv_3= 'estado' ( (lv_estado_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2378:1: ( () otherlv_1= 'AsercionSeleccion' otherlv_2= '{' (otherlv_3= 'estado' ( (lv_estado_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2378:1: ( () otherlv_1= 'AsercionSeleccion' otherlv_2= '{' (otherlv_3= 'estado' ( (lv_estado_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2378:2: () otherlv_1= 'AsercionSeleccion' otherlv_2= '{' (otherlv_3= 'estado' ( (lv_estado_4_0= ruleEInt ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2378:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2379:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAsercionSeleccionAccess().getAsercionSeleccionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAsercionSeleccion5401); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionSeleccionAccess().getAsercionSeleccionKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionSeleccion5413); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionSeleccionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2392:1: (otherlv_3= 'estado' ( (lv_estado_4_0= ruleEInt ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2392:3: otherlv_3= 'estado' ( (lv_estado_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAsercionSeleccion5426); 

                        	newLeafNode(otherlv_3, grammarAccess.getAsercionSeleccionAccess().getEstadoKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2396:1: ( (lv_estado_4_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2397:1: (lv_estado_4_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2397:1: (lv_estado_4_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2398:3: lv_estado_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAsercionSeleccionAccess().getEstadoEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAsercionSeleccion5447);
                    lv_estado_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAsercionSeleccionRule());
                    	        }
                           		set(
                           			current, 
                           			"estado",
                            		lv_estado_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2414:4: (otherlv_5= 'elemento' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==47) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2414:6: otherlv_5= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAsercionSeleccion5462); 

                        	newLeafNode(otherlv_5, grammarAccess.getAsercionSeleccionAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2418:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2419:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2419:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2420:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionSeleccionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAsercionSeleccionAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionSeleccion5485);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionSeleccion5499); 

                	newLeafNode(otherlv_7, grammarAccess.getAsercionSeleccionAccess().getRightCurlyBracketKeyword_5());
                

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
        "\1\32\1\33\1\34\10\uffff";
    static final String DFA4_maxS =
        "\3\50\10\uffff";
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
        public static final BitSet FOLLOW_16_in_ruleFormulario265 = new BitSet(new long[]{0x0000000000800000L});
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
        public static final BitSet FOLLOW_18_in_ruleLayout1084 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout1096 = new BitSet(new long[]{0x00000000003A0000L});
        public static final BitSet FOLLOW_19_in_ruleLayout1109 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout1130 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_20_in_ruleLayout1145 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout1166 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleLayout1181 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout1193 = new BitSet(new long[]{0x000001F8BC000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout1214 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleLayout1227 = new BitSet(new long[]{0x000001F8BC000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout1248 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleLayout1262 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLayout1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulePruebaInterfaz1493 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1514 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePruebaInterfaz1526 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_rulePruebaInterfaz1539 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePruebaInterfaz1551 = new BitSet(new long[]{0x0002400000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1572 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_rulePruebaInterfaz1585 = new BitSet(new long[]{0x0002400000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1606 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_rulePruebaInterfaz1620 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePruebaInterfaz1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEInt1721 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto1783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto1793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputTexto1845 = new BitSet(new long[]{0x0000000038000000L});
        public static final BitSet FOLLOW_27_in_ruleInputTexto1877 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_28_in_ruleInputTexto1909 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleInputTexto1935 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1956 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputTexto1968 = new BitSet(new long[]{0x0000000040020000L});
        public static final BitSet FOLLOW_30_in_ruleInputTexto1981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto2002 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputTexto2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio2052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputRadio2114 = new BitSet(new long[]{0x0000000088000000L});
        public static final BitSet FOLLOW_27_in_ruleInputRadio2146 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleInputRadio2172 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2193 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2205 = new BitSet(new long[]{0x0000000700020000L});
        public static final BitSet FOLLOW_32_in_ruleInputRadio2218 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2230 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2251 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputRadio2264 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2285 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio2299 = new BitSet(new long[]{0x0000000600020000L});
        public static final BitSet FOLLOW_33_in_ruleInputRadio2314 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputRadio2335 = new BitSet(new long[]{0x0000000400020000L});
        public static final BitSet FOLLOW_34_in_ruleInputRadio2350 = new BitSet(new long[]{0x0000240000000000L});
        public static final BitSet FOLLOW_ruleReaccion_in_ruleInputRadio2371 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo2421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputCombo2483 = new BitSet(new long[]{0x0000000808000000L});
        public static final BitSet FOLLOW_27_in_ruleInputCombo2515 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleInputCombo2541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2562 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2574 = new BitSet(new long[]{0x0000000300020000L});
        public static final BitSet FOLLOW_32_in_ruleInputCombo2587 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2599 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2620 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCombo2633 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2654 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCombo2668 = new BitSet(new long[]{0x0000000200020000L});
        public static final BitSet FOLLOW_33_in_ruleInputCombo2683 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCombo2704 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputCombo2718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck2754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputCheck2816 = new BitSet(new long[]{0x0000001008000000L});
        public static final BitSet FOLLOW_27_in_ruleInputCheck2848 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleInputCheck2874 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2895 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck2907 = new BitSet(new long[]{0x0000000700020000L});
        public static final BitSet FOLLOW_32_in_ruleInputCheck2920 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck2932 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2953 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCheck2966 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2987 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3001 = new BitSet(new long[]{0x0000000600020000L});
        public static final BitSet FOLLOW_33_in_ruleInputCheck3016 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck3028 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3049 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCheck3062 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3083 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3097 = new BitSet(new long[]{0x0000000400020000L});
        public static final BitSet FOLLOW_34_in_ruleInputCheck3112 = new BitSet(new long[]{0x0000240000000000L});
        public static final BitSet FOLLOW_ruleReaccion_in_ruleInputCheck3133 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar3183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonValidar3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleBotonValidar3245 = new BitSet(new long[]{0x0000002008000000L});
        public static final BitSet FOLLOW_27_in_ruleBotonValidar3277 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleBotonValidar3303 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonValidar3324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl3360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonGuardar_Impl3370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleBotonGuardar_Impl3422 = new BitSet(new long[]{0x0000004008000000L});
        public static final BitSet FOLLOW_27_in_ruleBotonGuardar_Impl3454 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleBotonGuardar_Impl3480 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonGuardar_Impl3501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar3537 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCancelar3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleBotonCancelar3599 = new BitSet(new long[]{0x0000008008000000L});
        public static final BitSet FOLLOW_27_in_ruleBotonCancelar3631 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleBotonCancelar3657 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCancelar3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom3714 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCustom3724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleBotonCustom3776 = new BitSet(new long[]{0x0000010008000000L});
        public static final BitSet FOLLOW_27_in_ruleBotonCustom3808 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleBotonCustom3834 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCustom3855 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleBotonCustom3867 = new BitSet(new long[]{0x0000020000020000L});
        public static final BitSet FOLLOW_41_in_ruleBotonCustom3880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCustom3901 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleBotonCustom3915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible3951 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionVisible3961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleReaccionVisible4007 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleReaccionVisible4019 = new BitSet(new long[]{0x0000180000020000L});
        public static final BitSet FOLLOW_43_in_ruleReaccionVisible4032 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReaccionVisible4053 = new BitSet(new long[]{0x0000100000020000L});
        public static final BitSet FOLLOW_44_in_ruleReaccionVisible4068 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReaccionVisible4091 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleReaccionVisible4105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado4141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionHabilitado4151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleReaccionHabilitado4197 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleReaccionHabilitado4209 = new BitSet(new long[]{0x0000180000020000L});
        public static final BitSet FOLLOW_43_in_ruleReaccionHabilitado4222 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReaccionHabilitado4243 = new BitSet(new long[]{0x0000100000020000L});
        public static final BitSet FOLLOW_44_in_ruleReaccionHabilitado4258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReaccionHabilitado4281 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleReaccionHabilitado4295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_entryRuleAccionValor4331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionValor4341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleAccionValor4387 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAccionValor4399 = new BitSet(new long[]{0x0001800040020000L});
        public static final BitSet FOLLOW_30_in_ruleAccionValor4412 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionValor4433 = new BitSet(new long[]{0x0001800000020000L});
        public static final BitSet FOLLOW_47_in_ruleAccionValor4448 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionValor4471 = new BitSet(new long[]{0x0001000000020000L});
        public static final BitSet FOLLOW_48_in_ruleAccionValor4486 = new BitSet(new long[]{0x007C000000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionValor4507 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAccionValor4521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion4557 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionSeleccion4567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAccionSeleccion4613 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAccionSeleccion4625 = new BitSet(new long[]{0x0001800040020000L});
        public static final BitSet FOLLOW_30_in_ruleAccionSeleccion4638 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAccionSeleccion4659 = new BitSet(new long[]{0x0001800000020000L});
        public static final BitSet FOLLOW_47_in_ruleAccionSeleccion4674 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionSeleccion4697 = new BitSet(new long[]{0x0001000000020000L});
        public static final BitSet FOLLOW_48_in_ruleAccionSeleccion4712 = new BitSet(new long[]{0x007C000000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionSeleccion4733 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAccionSeleccion4747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible4783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionInvisible4793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAsercionInvisible4845 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleAsercionInvisible4871 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionInvisible4883 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_47_in_ruleAsercionInvisible4896 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionInvisible4919 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionInvisible4933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado4969 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionHabilitado4979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAsercionHabilitado5031 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleAsercionHabilitado5057 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionHabilitado5069 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_47_in_ruleAsercionHabilitado5082 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionHabilitado5105 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionHabilitado5119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor5155 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionValor5165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleAsercionValor5211 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionValor5223 = new BitSet(new long[]{0x0000800040020000L});
        public static final BitSet FOLLOW_30_in_ruleAsercionValor5236 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor5257 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_47_in_ruleAsercionValor5272 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor5295 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionValor5309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion5345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionSeleccion5355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAsercionSeleccion5401 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionSeleccion5413 = new BitSet(new long[]{0x0004800000020000L});
        public static final BitSet FOLLOW_50_in_ruleAsercionSeleccion5426 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAsercionSeleccion5447 = new BitSet(new long[]{0x0000800000020000L});
        public static final BitSet FOLLOW_47_in_ruleAsercionSeleccion5462 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionSeleccion5485 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionSeleccion5499 = new BitSet(new long[]{0x0000000000000002L});
    }


}