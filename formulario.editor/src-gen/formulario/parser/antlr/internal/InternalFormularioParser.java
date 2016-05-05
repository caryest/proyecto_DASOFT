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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Formulario'", "'{'", "'comprobacionCampos'", "'comprobacionAccion'", "'}'", "'Layout'", "'columnas'", "'entradas'", "'['", "','", "']'", "'PruebaInterfaz'", "'-'", "'Input Texto'", "'deshabilitado'", "'obligatorio'", "'invisible'", "'inicial'", "'Radio'", "':'", "'Reaccion'", "'Combo'", "'Check'", "'iniciales'", "'BotonValidar'", "'BotonGuardar'", "'BotonCancelar'", "'BotonCustom'", "'Visible'", "'->'", "'Deshabilitado'", "'Accion para Texto'", "'Accion para Seleccion'", "'Accion para Boton'", "'Asercion invisible'", "'falso'", "'Asercion deshabilitado'", "'Asercion valor'", "'Asercion seleccion'"
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:76:1: ruleFormulario returns [EObject current=null] : (otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_comprobacionCampos_3_0= 'comprobacionCampos' ) )? ( (lv_comprobacionAccion_4_0= 'comprobacionAccion' ) )? ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}' ) ;
    public final EObject ruleFormulario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_comprobacionCampos_3_0=null;
        Token lv_comprobacionAccion_4_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_layout_5_0 = null;

        EObject lv_pruebas_6_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:79:28: ( (otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_comprobacionCampos_3_0= 'comprobacionCampos' ) )? ( (lv_comprobacionAccion_4_0= 'comprobacionAccion' ) )? ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: (otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_comprobacionCampos_3_0= 'comprobacionCampos' ) )? ( (lv_comprobacionAccion_4_0= 'comprobacionAccion' ) )? ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: (otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_comprobacionCampos_3_0= 'comprobacionCampos' ) )? ( (lv_comprobacionAccion_4_0= 'comprobacionAccion' ) )? ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:3: otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_comprobacionCampos_3_0= 'comprobacionCampos' ) )? ( (lv_comprobacionAccion_4_0= 'comprobacionAccion' ) )? ( (lv_layout_5_0= ruleLayout ) ) ( (lv_pruebas_6_0= rulePruebaInterfaz ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleFormulario122); 

                	newLeafNode(otherlv_0, grammarAccess.getFormularioAccess().getFormularioKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:85:1: (lv_name_1_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFormularioAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFormulario143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormularioRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFormulario155); 

                	newLeafNode(otherlv_2, grammarAccess.getFormularioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:106:1: ( (lv_comprobacionCampos_3_0= 'comprobacionCampos' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:107:1: (lv_comprobacionCampos_3_0= 'comprobacionCampos' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:107:1: (lv_comprobacionCampos_3_0= 'comprobacionCampos' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:108:3: lv_comprobacionCampos_3_0= 'comprobacionCampos'
                    {
                    lv_comprobacionCampos_3_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFormulario173); 

                            newLeafNode(lv_comprobacionCampos_3_0, grammarAccess.getFormularioAccess().getComprobacionCamposComprobacionCamposKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormularioRule());
                    	        }
                           		setWithLastConsumed(current, "comprobacionCampos", true, "comprobacionCampos");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:121:3: ( (lv_comprobacionAccion_4_0= 'comprobacionAccion' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:122:1: (lv_comprobacionAccion_4_0= 'comprobacionAccion' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:122:1: (lv_comprobacionAccion_4_0= 'comprobacionAccion' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:123:3: lv_comprobacionAccion_4_0= 'comprobacionAccion'
                    {
                    lv_comprobacionAccion_4_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFormulario205); 

                            newLeafNode(lv_comprobacionAccion_4_0, grammarAccess.getFormularioAccess().getComprobacionAccionComprobacionAccionKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFormularioRule());
                    	        }
                           		setWithLastConsumed(current, "comprobacionAccion", true, "comprobacionAccion");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:136:3: ( (lv_layout_5_0= ruleLayout ) )
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

            if ( (LA3_0==22) ) {
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:193:1: ruleInput returns [EObject current=null] : (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:196:28: ( (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:197:1: (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:197:1: (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 32:
                {
                alt4=3;
                }
                break;
            case 33:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            case 36:
                {
                alt4=6;
                }
                break;
            case 37:
                {
                alt4=7;
                }
                break;
            case 38:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:198:5: this_InputTexto_0= ruleInputTexto
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputTextoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_ruleInput367);
                    this_InputTexto_0=ruleInputTexto();

                    state._fsp--;

                     
                            current = this_InputTexto_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:208:5: this_InputRadio_1= ruleInputRadio
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputRadioParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_ruleInput394);
                    this_InputRadio_1=ruleInputRadio();

                    state._fsp--;

                     
                            current = this_InputRadio_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:218:5: this_InputCombo_2= ruleInputCombo
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputComboParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_ruleInput421);
                    this_InputCombo_2=ruleInputCombo();

                    state._fsp--;

                     
                            current = this_InputCombo_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:228:5: this_InputCheck_3= ruleInputCheck
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputCheckParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_ruleInput448);
                    this_InputCheck_3=ruleInputCheck();

                    state._fsp--;

                     
                            current = this_InputCheck_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:238:5: this_BotonValidar_4= ruleBotonValidar
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonValidarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_ruleInput475);
                    this_BotonValidar_4=ruleBotonValidar();

                    state._fsp--;

                     
                            current = this_BotonValidar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:248:5: this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonGuardar_ImplParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_ruleInput502);
                    this_BotonGuardar_Impl_5=ruleBotonGuardar_Impl();

                    state._fsp--;

                     
                            current = this_BotonGuardar_Impl_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:258:5: this_BotonCancelar_6= ruleBotonCancelar
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonCancelarParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_ruleInput529);
                    this_BotonCancelar_6=ruleBotonCancelar();

                    state._fsp--;

                     
                            current = this_BotonCancelar_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:268:5: this_BotonCustom_7= ruleBotonCustom
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonCustomParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_ruleInput556);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:284:1: entryRuleAccion returns [EObject current=null] : iv_ruleAccion= ruleAccion EOF ;
    public final EObject entryRuleAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:285:2: (iv_ruleAccion= ruleAccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:286:2: iv_ruleAccion= ruleAccion EOF
            {
             newCompositeNode(grammarAccess.getAccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccion_in_entryRuleAccion591);
            iv_ruleAccion=ruleAccion();

            state._fsp--;

             current =iv_ruleAccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccion601); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:293:1: ruleAccion returns [EObject current=null] : (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion | this_AccionPulsacion_2= ruleAccionPulsacion ) ;
    public final EObject ruleAccion() throws RecognitionException {
        EObject current = null;

        EObject this_AccionValor_0 = null;

        EObject this_AccionSeleccion_1 = null;

        EObject this_AccionPulsacion_2 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:296:28: ( (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion | this_AccionPulsacion_2= ruleAccionPulsacion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:297:1: (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion | this_AccionPulsacion_2= ruleAccionPulsacion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:297:1: (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion | this_AccionPulsacion_2= ruleAccionPulsacion )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:298:5: this_AccionValor_0= ruleAccionValor
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAccionValorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_ruleAccion648);
                    this_AccionValor_0=ruleAccionValor();

                    state._fsp--;

                     
                            current = this_AccionValor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:308:5: this_AccionSeleccion_1= ruleAccionSeleccion
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAccionSeleccionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_ruleAccion675);
                    this_AccionSeleccion_1=ruleAccionSeleccion();

                    state._fsp--;

                     
                            current = this_AccionSeleccion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:318:5: this_AccionPulsacion_2= ruleAccionPulsacion
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAccionPulsacionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccionPulsacion_in_ruleAccion702);
                    this_AccionPulsacion_2=ruleAccionPulsacion();

                    state._fsp--;

                     
                            current = this_AccionPulsacion_2; 
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:334:1: entryRuleReaccion returns [EObject current=null] : iv_ruleReaccion= ruleReaccion EOF ;
    public final EObject entryRuleReaccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:335:2: (iv_ruleReaccion= ruleReaccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:336:2: iv_ruleReaccion= ruleReaccion EOF
            {
             newCompositeNode(grammarAccess.getReaccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_entryRuleReaccion737);
            iv_ruleReaccion=ruleReaccion();

            state._fsp--;

             current =iv_ruleReaccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccion747); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:343:1: ruleReaccion returns [EObject current=null] : (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado ) ;
    public final EObject ruleReaccion() throws RecognitionException {
        EObject current = null;

        EObject this_ReaccionVisible_0 = null;

        EObject this_ReaccionHabilitado_1 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:346:28: ( (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:347:1: (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:347:1: (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==41) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:348:5: this_ReaccionVisible_0= ruleReaccionVisible
                    {
                     
                            newCompositeNode(grammarAccess.getReaccionAccess().getReaccionVisibleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_ruleReaccion794);
                    this_ReaccionVisible_0=ruleReaccionVisible();

                    state._fsp--;

                     
                            current = this_ReaccionVisible_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:358:5: this_ReaccionHabilitado_1= ruleReaccionHabilitado
                    {
                     
                            newCompositeNode(grammarAccess.getReaccionAccess().getReaccionHabilitadoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_ruleReaccion821);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:374:1: entryRuleAsercion returns [EObject current=null] : iv_ruleAsercion= ruleAsercion EOF ;
    public final EObject entryRuleAsercion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:375:2: (iv_ruleAsercion= ruleAsercion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:376:2: iv_ruleAsercion= ruleAsercion EOF
            {
             newCompositeNode(grammarAccess.getAsercionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_entryRuleAsercion856);
            iv_ruleAsercion=ruleAsercion();

            state._fsp--;

             current =iv_ruleAsercion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercion866); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:383:1: ruleAsercion returns [EObject current=null] : (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion ) ;
    public final EObject ruleAsercion() throws RecognitionException {
        EObject current = null;

        EObject this_AsercionInvisible_0 = null;

        EObject this_AsercionHabilitado_1 = null;

        EObject this_AsercionValor_2 = null;

        EObject this_AsercionSeleccion_3 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:386:28: ( (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:387:1: (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:387:1: (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt7=1;
                }
                break;
            case 47:
                {
                alt7=2;
                }
                break;
            case 48:
                {
                alt7=3;
                }
                break;
            case 49:
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
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:388:5: this_AsercionInvisible_0= ruleAsercionInvisible
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionInvisibleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_ruleAsercion913);
                    this_AsercionInvisible_0=ruleAsercionInvisible();

                    state._fsp--;

                     
                            current = this_AsercionInvisible_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:398:5: this_AsercionHabilitado_1= ruleAsercionHabilitado
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionHabilitadoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_ruleAsercion940);
                    this_AsercionHabilitado_1=ruleAsercionHabilitado();

                    state._fsp--;

                     
                            current = this_AsercionHabilitado_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:408:5: this_AsercionValor_2= ruleAsercionValor
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionValorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_ruleAsercion967);
                    this_AsercionValor_2=ruleAsercionValor();

                    state._fsp--;

                     
                            current = this_AsercionValor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:418:5: this_AsercionSeleccion_3= ruleAsercionSeleccion
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionSeleccionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_ruleAsercion994);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:434:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:435:2: (iv_ruleLayout= ruleLayout EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:436:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout1029);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout1039); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:443:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '[' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= ']' )? otherlv_10= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:446:28: ( (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '[' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= ']' )? otherlv_10= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:447:1: (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '[' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= ']' )? otherlv_10= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:447:1: (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '[' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= ']' )? otherlv_10= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:447:3: otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '[' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= ']' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLayout1076); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayout1088); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout1100); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getColumnasKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:459:1: ( (lv_columnas_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:460:1: (lv_columnas_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:460:1: (lv_columnas_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:461:3: lv_columnas_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getLayoutAccess().getColumnasEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout1121);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:477:2: (otherlv_4= 'entradas' otherlv_5= '[' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:477:4: otherlv_4= 'entradas' otherlv_5= '[' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLayout1134); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getEntradasKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLayout1146); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getLeftSquareBracketKeyword_4_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:485:1: ( (lv_entradas_6_0= ruleInput ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:486:1: (lv_entradas_6_0= ruleInput )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:486:1: (lv_entradas_6_0= ruleInput )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:487:3: lv_entradas_6_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout1167);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:503:2: (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:503:4: otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLayout1180); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:507:1: ( (lv_entradas_8_0= ruleInput ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:508:1: (lv_entradas_8_0= ruleInput )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:508:1: (lv_entradas_8_0= ruleInput )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:509:3: lv_entradas_8_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout1201);
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

                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLayout1215); 

                        	newLeafNode(otherlv_9, grammarAccess.getLayoutAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLayout1229); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:541:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:542:2: (iv_ruleEString= ruleEString EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:543:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1266);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1277); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:550:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:553:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:554:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:554:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:554:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1317); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:562:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1343); 

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
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1388);
            iv_rulePruebaInterfaz=rulePruebaInterfaz();

            state._fsp--;

             current =iv_rulePruebaInterfaz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz1398); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:586:1: rulePruebaInterfaz returns [EObject current=null] : ( () otherlv_1= 'PruebaInterfaz' otherlv_2= '{' ( ( (lv_acciones_3_0= ruleAccion ) ) (otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) ) )* )? otherlv_6= '}' ) ;
    public final EObject rulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_acciones_3_0 = null;

        EObject lv_acciones_5_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:589:28: ( ( () otherlv_1= 'PruebaInterfaz' otherlv_2= '{' ( ( (lv_acciones_3_0= ruleAccion ) ) (otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) ) )* )? otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:1: ( () otherlv_1= 'PruebaInterfaz' otherlv_2= '{' ( ( (lv_acciones_3_0= ruleAccion ) ) (otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) ) )* )? otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:1: ( () otherlv_1= 'PruebaInterfaz' otherlv_2= '{' ( ( (lv_acciones_3_0= ruleAccion ) ) (otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) ) )* )? otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:2: () otherlv_1= 'PruebaInterfaz' otherlv_2= '{' ( ( (lv_acciones_3_0= ruleAccion ) ) (otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) ) )* )? otherlv_6= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:591:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePruebaInterfaz1444); 

                	newLeafNode(otherlv_1, grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePruebaInterfaz1456); 

                	newLeafNode(otherlv_2, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:604:1: ( ( (lv_acciones_3_0= ruleAccion ) ) (otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=42 && LA12_0<=44)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:604:2: ( (lv_acciones_3_0= ruleAccion ) ) (otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) ) )*
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:604:2: ( (lv_acciones_3_0= ruleAccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:605:1: (lv_acciones_3_0= ruleAccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:605:1: (lv_acciones_3_0= ruleAccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:606:3: lv_acciones_3_0= ruleAccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1478);
                    lv_acciones_3_0=ruleAccion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPruebaInterfazRule());
                    	        }
                           		add(
                           			current, 
                           			"acciones",
                            		lv_acciones_3_0, 
                            		"Accion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:622:2: (otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:622:4: otherlv_4= ',' ( (lv_acciones_5_0= ruleAccion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePruebaInterfaz1491); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getPruebaInterfazAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:626:1: ( (lv_acciones_5_0= ruleAccion ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:627:1: (lv_acciones_5_0= ruleAccion )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:627:1: (lv_acciones_5_0= ruleAccion )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:628:3: lv_acciones_5_0= ruleAccion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1512);
                    	    lv_acciones_5_0=ruleAccion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPruebaInterfazRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"acciones",
                    	            		lv_acciones_5_0, 
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePruebaInterfaz1528); 

                	newLeafNode(otherlv_6, grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:658:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:659:2: (iv_ruleEInt= ruleEInt EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:660:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1567);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1578); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:667:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:670:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:671:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:671:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:671:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:671:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:672:2: kw= '-'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEInt1617); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1634); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:692:1: entryRuleInputTexto returns [EObject current=null] : iv_ruleInputTexto= ruleInputTexto EOF ;
    public final EObject entryRuleInputTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTexto = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:693:2: (iv_ruleInputTexto= ruleInputTexto EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:694:2: iv_ruleInputTexto= ruleInputTexto EOF
            {
             newCompositeNode(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto1679);
            iv_ruleInputTexto=ruleInputTexto();

            state._fsp--;

             current =iv_ruleInputTexto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto1689); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:701:1: ruleInputTexto returns [EObject current=null] : ( () otherlv_1= 'Input Texto' ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? ( (lv_invisible_4_0= 'invisible' ) )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'inicial' ( (lv_valor_7_0= ruleEString ) ) )? ) ;
    public final EObject ruleInputTexto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_deshabilitado_2_0=null;
        Token lv_obligatorio_3_0=null;
        Token lv_invisible_4_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_valor_7_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:704:28: ( ( () otherlv_1= 'Input Texto' ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? ( (lv_invisible_4_0= 'invisible' ) )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'inicial' ( (lv_valor_7_0= ruleEString ) ) )? ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:705:1: ( () otherlv_1= 'Input Texto' ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? ( (lv_invisible_4_0= 'invisible' ) )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'inicial' ( (lv_valor_7_0= ruleEString ) ) )? )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:705:1: ( () otherlv_1= 'Input Texto' ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? ( (lv_invisible_4_0= 'invisible' ) )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'inicial' ( (lv_valor_7_0= ruleEString ) ) )? )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:705:2: () otherlv_1= 'Input Texto' ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? ( (lv_invisible_4_0= 'invisible' ) )? ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'inicial' ( (lv_valor_7_0= ruleEString ) ) )?
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:705:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:706:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputTextoAccess().getInputTextoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInputTexto1735); 

                	newLeafNode(otherlv_1, grammarAccess.getInputTextoAccess().getInputTextoKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:715:1: ( (lv_deshabilitado_2_0= 'deshabilitado' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:716:1: (lv_deshabilitado_2_0= 'deshabilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:716:1: (lv_deshabilitado_2_0= 'deshabilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:717:3: lv_deshabilitado_2_0= 'deshabilitado'
                    {
                    lv_deshabilitado_2_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputTexto1753); 

                            newLeafNode(lv_deshabilitado_2_0, grammarAccess.getInputTextoAccess().getDeshabilitadoDeshabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "deshabilitado", true, "deshabilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:730:3: ( (lv_obligatorio_3_0= 'obligatorio' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:731:1: (lv_obligatorio_3_0= 'obligatorio' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:731:1: (lv_obligatorio_3_0= 'obligatorio' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:732:3: lv_obligatorio_3_0= 'obligatorio'
                    {
                    lv_obligatorio_3_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputTexto1785); 

                            newLeafNode(lv_obligatorio_3_0, grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "obligatorio", true, "obligatorio");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:745:3: ( (lv_invisible_4_0= 'invisible' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:746:1: (lv_invisible_4_0= 'invisible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:746:1: (lv_invisible_4_0= 'invisible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:747:3: lv_invisible_4_0= 'invisible'
                    {
                    lv_invisible_4_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputTexto1817); 

                            newLeafNode(lv_invisible_4_0, grammarAccess.getInputTextoAccess().getInvisibleInvisibleKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "invisible", true, "invisible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:760:3: ( (lv_name_5_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:761:1: (lv_name_5_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:761:1: (lv_name_5_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:762:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1852);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:778:2: (otherlv_6= 'inicial' ( (lv_valor_7_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:778:4: otherlv_6= 'inicial' ( (lv_valor_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputTexto1865); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputTextoAccess().getInicialKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:782:1: ( (lv_valor_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:783:1: (lv_valor_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:783:1: (lv_valor_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:784:3: lv_valor_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1886);
                    lv_valor_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputTextoRule());
                    	        }
                           		set(
                           			current, 
                           			"valor",
                            		lv_valor_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:808:1: entryRuleInputRadio returns [EObject current=null] : iv_ruleInputRadio= ruleInputRadio EOF ;
    public final EObject entryRuleInputRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRadio = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:809:2: (iv_ruleInputRadio= ruleInputRadio EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:810:2: iv_ruleInputRadio= ruleInputRadio EOF
            {
             newCompositeNode(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio1924);
            iv_ruleInputRadio=ruleInputRadio();

            state._fsp--;

             current =iv_ruleInputRadio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio1934); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:817:1: ruleInputRadio returns [EObject current=null] : (otherlv_0= 'Radio' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'inicial' ( (lv_seleccion_11_0= ruleEInt ) ) )? (otherlv_12= 'Reaccion' ( (lv_reaccion_13_0= ruleReaccion ) ) )? ) ;
    public final EObject ruleInputRadio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_invisible_1_0=null;
        Token lv_deshabilitado_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_valores_6_0 = null;

        AntlrDatatypeRuleToken lv_valores_8_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_11_0 = null;

        EObject lv_reaccion_13_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:820:28: ( (otherlv_0= 'Radio' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'inicial' ( (lv_seleccion_11_0= ruleEInt ) ) )? (otherlv_12= 'Reaccion' ( (lv_reaccion_13_0= ruleReaccion ) ) )? ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:821:1: (otherlv_0= 'Radio' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'inicial' ( (lv_seleccion_11_0= ruleEInt ) ) )? (otherlv_12= 'Reaccion' ( (lv_reaccion_13_0= ruleReaccion ) ) )? )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:821:1: (otherlv_0= 'Radio' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'inicial' ( (lv_seleccion_11_0= ruleEInt ) ) )? (otherlv_12= 'Reaccion' ( (lv_reaccion_13_0= ruleReaccion ) ) )? )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:821:3: otherlv_0= 'Radio' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'inicial' ( (lv_seleccion_11_0= ruleEInt ) ) )? (otherlv_12= 'Reaccion' ( (lv_reaccion_13_0= ruleReaccion ) ) )?
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputRadio1971); 

                	newLeafNode(otherlv_0, grammarAccess.getInputRadioAccess().getRadioKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:825:1: ( (lv_invisible_1_0= 'invisible' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:826:1: (lv_invisible_1_0= 'invisible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:826:1: (lv_invisible_1_0= 'invisible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:827:3: lv_invisible_1_0= 'invisible'
                    {
                    lv_invisible_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputRadio1989); 

                            newLeafNode(lv_invisible_1_0, grammarAccess.getInputRadioAccess().getInvisibleInvisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "invisible", true, "invisible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:840:3: ( (lv_deshabilitado_2_0= 'deshabilitado' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:841:1: (lv_deshabilitado_2_0= 'deshabilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:841:1: (lv_deshabilitado_2_0= 'deshabilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:842:3: lv_deshabilitado_2_0= 'deshabilitado'
                    {
                    lv_deshabilitado_2_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputRadio2021); 

                            newLeafNode(lv_deshabilitado_2_0, grammarAccess.getInputRadioAccess().getDeshabilitadoDeshabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "deshabilitado", true, "deshabilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:855:3: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:856:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:856:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:857:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2056);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputRadio2068); 

                	newLeafNode(otherlv_4, grammarAccess.getInputRadioAccess().getColonKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:877:1: (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:877:3: otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputRadio2081); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:881:1: ( (lv_valores_6_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:882:1: (lv_valores_6_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:882:1: (lv_valores_6_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:883:3: lv_valores_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2102);
                    lv_valores_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:899:2: (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==20) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:899:4: otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInputRadio2115); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getInputRadioAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:903:1: ( (lv_valores_8_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:904:1: (lv_valores_8_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:904:1: (lv_valores_8_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:905:3: lv_valores_8_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2136);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputRadio2150); 

                        	newLeafNode(otherlv_9, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:925:3: (otherlv_10= 'inicial' ( (lv_seleccion_11_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:925:5: otherlv_10= 'inicial' ( (lv_seleccion_11_0= ruleEInt ) )
                    {
                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputRadio2165); 

                        	newLeafNode(otherlv_10, grammarAccess.getInputRadioAccess().getInicialKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:929:1: ( (lv_seleccion_11_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:930:1: (lv_seleccion_11_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:930:1: (lv_seleccion_11_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:931:3: lv_seleccion_11_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputRadio2186);
                    lv_seleccion_11_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		set(
                           			current, 
                           			"seleccion",
                            		lv_seleccion_11_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:947:4: (otherlv_12= 'Reaccion' ( (lv_reaccion_13_0= ruleReaccion ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:947:6: otherlv_12= 'Reaccion' ( (lv_reaccion_13_0= ruleReaccion ) )
                    {
                    otherlv_12=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputRadio2201); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputRadioAccess().getReaccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:951:1: ( (lv_reaccion_13_0= ruleReaccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:952:1: (lv_reaccion_13_0= ruleReaccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:952:1: (lv_reaccion_13_0= ruleReaccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:953:3: lv_reaccion_13_0= ruleReaccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getReaccionReaccionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_ruleInputRadio2222);
                    lv_reaccion_13_0=ruleReaccion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRadioRule());
                    	        }
                           		set(
                           			current, 
                           			"reaccion",
                            		lv_reaccion_13_0, 
                            		"Reaccion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:977:1: entryRuleInputCombo returns [EObject current=null] : iv_ruleInputCombo= ruleInputCombo EOF ;
    public final EObject entryRuleInputCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCombo = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:978:2: (iv_ruleInputCombo= ruleInputCombo EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:979:2: iv_ruleInputCombo= ruleInputCombo EOF
            {
             newCompositeNode(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo2260);
            iv_ruleInputCombo=ruleInputCombo();

            state._fsp--;

             current =iv_ruleInputCombo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo2270); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:986:1: ruleInputCombo returns [EObject current=null] : ( () otherlv_1= 'Combo' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' (otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'inicial' ( (lv_seleccion_12_0= ruleEInt ) ) )? ) ;
    public final EObject ruleInputCombo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_invisible_2_0=null;
        Token lv_deshabilitado_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_valores_7_0 = null;

        AntlrDatatypeRuleToken lv_valores_9_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_12_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:989:28: ( ( () otherlv_1= 'Combo' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' (otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'inicial' ( (lv_seleccion_12_0= ruleEInt ) ) )? ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:990:1: ( () otherlv_1= 'Combo' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' (otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'inicial' ( (lv_seleccion_12_0= ruleEInt ) ) )? )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:990:1: ( () otherlv_1= 'Combo' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' (otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'inicial' ( (lv_seleccion_12_0= ruleEInt ) ) )? )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:990:2: () otherlv_1= 'Combo' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) otherlv_5= ':' (otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'inicial' ( (lv_seleccion_12_0= ruleEInt ) ) )?
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:990:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:991:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputComboAccess().getInputComboAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputCombo2316); 

                	newLeafNode(otherlv_1, grammarAccess.getInputComboAccess().getComboKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1000:1: ( (lv_invisible_2_0= 'invisible' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1001:1: (lv_invisible_2_0= 'invisible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1001:1: (lv_invisible_2_0= 'invisible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1002:3: lv_invisible_2_0= 'invisible'
                    {
                    lv_invisible_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputCombo2334); 

                            newLeafNode(lv_invisible_2_0, grammarAccess.getInputComboAccess().getInvisibleInvisibleKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "invisible", true, "invisible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1015:3: ( (lv_deshabilitado_3_0= 'deshabilitado' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1016:1: (lv_deshabilitado_3_0= 'deshabilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1016:1: (lv_deshabilitado_3_0= 'deshabilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1017:3: lv_deshabilitado_3_0= 'deshabilitado'
                    {
                    lv_deshabilitado_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputCombo2366); 

                            newLeafNode(lv_deshabilitado_3_0, grammarAccess.getInputComboAccess().getDeshabilitadoDeshabilitadoKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "deshabilitado", true, "deshabilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1030:3: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1031:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1031:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1032:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2401);
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

            otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputCombo2413); 

                	newLeafNode(otherlv_5, grammarAccess.getInputComboAccess().getColonKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1052:1: (otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1052:3: otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputCombo2426); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1056:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1057:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1057:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1058:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2447);
                    lv_valores_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputComboRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1074:2: (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==20) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1074:4: otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInputCombo2460); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInputComboAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1078:1: ( (lv_valores_9_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1079:1: (lv_valores_9_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1079:1: (lv_valores_9_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1080:3: lv_valores_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2481);
                    	    lv_valores_9_0=ruleEString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputComboRule());
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCombo2495); 

                        	newLeafNode(otherlv_10, grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1100:3: (otherlv_11= 'inicial' ( (lv_seleccion_12_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1100:5: otherlv_11= 'inicial' ( (lv_seleccion_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputCombo2510); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputComboAccess().getInicialKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1104:1: ( (lv_seleccion_12_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1105:1: (lv_seleccion_12_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1105:1: (lv_seleccion_12_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1106:3: lv_seleccion_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCombo2531);
                    lv_seleccion_12_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputComboRule());
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1130:1: entryRuleInputCheck returns [EObject current=null] : iv_ruleInputCheck= ruleInputCheck EOF ;
    public final EObject entryRuleInputCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCheck = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1131:2: (iv_ruleInputCheck= ruleInputCheck EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1132:2: iv_ruleInputCheck= ruleInputCheck EOF
            {
             newCompositeNode(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck2569);
            iv_ruleInputCheck=ruleInputCheck();

            state._fsp--;

             current =iv_ruleInputCheck; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck2579); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1139:1: ruleInputCheck returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'iniciales' otherlv_11= '{' ( (lv_seleccion_12_0= ruleEInt ) ) (otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) ) )* otherlv_15= '}' )? (otherlv_16= 'Reaccion' ( (lv_reaccion_17_0= ruleReaccion ) ) )? ) ;
    public final EObject ruleInputCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_invisible_1_0=null;
        Token lv_deshabilitado_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_valores_6_0 = null;

        AntlrDatatypeRuleToken lv_valores_8_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_12_0 = null;

        AntlrDatatypeRuleToken lv_seleccion_14_0 = null;

        EObject lv_reaccion_17_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1142:28: ( (otherlv_0= 'Check' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'iniciales' otherlv_11= '{' ( (lv_seleccion_12_0= ruleEInt ) ) (otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) ) )* otherlv_15= '}' )? (otherlv_16= 'Reaccion' ( (lv_reaccion_17_0= ruleReaccion ) ) )? ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1143:1: (otherlv_0= 'Check' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'iniciales' otherlv_11= '{' ( (lv_seleccion_12_0= ruleEInt ) ) (otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) ) )* otherlv_15= '}' )? (otherlv_16= 'Reaccion' ( (lv_reaccion_17_0= ruleReaccion ) ) )? )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1143:1: (otherlv_0= 'Check' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'iniciales' otherlv_11= '{' ( (lv_seleccion_12_0= ruleEInt ) ) (otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) ) )* otherlv_15= '}' )? (otherlv_16= 'Reaccion' ( (lv_reaccion_17_0= ruleReaccion ) ) )? )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1143:3: otherlv_0= 'Check' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= ':' (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )? (otherlv_10= 'iniciales' otherlv_11= '{' ( (lv_seleccion_12_0= ruleEInt ) ) (otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) ) )* otherlv_15= '}' )? (otherlv_16= 'Reaccion' ( (lv_reaccion_17_0= ruleReaccion ) ) )?
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCheck2616); 

                	newLeafNode(otherlv_0, grammarAccess.getInputCheckAccess().getCheckKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1147:1: ( (lv_invisible_1_0= 'invisible' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1148:1: (lv_invisible_1_0= 'invisible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1148:1: (lv_invisible_1_0= 'invisible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1149:3: lv_invisible_1_0= 'invisible'
                    {
                    lv_invisible_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputCheck2634); 

                            newLeafNode(lv_invisible_1_0, grammarAccess.getInputCheckAccess().getInvisibleInvisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "invisible", true, "invisible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1162:3: ( (lv_deshabilitado_2_0= 'deshabilitado' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1163:1: (lv_deshabilitado_2_0= 'deshabilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1163:1: (lv_deshabilitado_2_0= 'deshabilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1164:3: lv_deshabilitado_2_0= 'deshabilitado'
                    {
                    lv_deshabilitado_2_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputCheck2666); 

                            newLeafNode(lv_deshabilitado_2_0, grammarAccess.getInputCheckAccess().getDeshabilitadoDeshabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "deshabilitado", true, "deshabilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1177:3: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1178:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1178:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1179:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2701);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputCheck2713); 

                	newLeafNode(otherlv_4, grammarAccess.getInputCheckAccess().getColonKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1199:1: (otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==12) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1199:3: otherlv_5= '{' ( (lv_valores_6_0= ruleEString ) ) (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputCheck2726); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1203:1: ( (lv_valores_6_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1204:1: (lv_valores_6_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1204:1: (lv_valores_6_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1205:3: lv_valores_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2747);
                    lv_valores_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		add(
                           			current, 
                           			"valores",
                            		lv_valores_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1221:2: (otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==20) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1221:4: otherlv_7= ',' ( (lv_valores_8_0= ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInputCheck2760); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getInputCheckAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1225:1: ( (lv_valores_8_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1226:1: (lv_valores_8_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1226:1: (lv_valores_8_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1227:3: lv_valores_8_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2781);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCheck2795); 

                        	newLeafNode(otherlv_9, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1247:3: (otherlv_10= 'iniciales' otherlv_11= '{' ( (lv_seleccion_12_0= ruleEInt ) ) (otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) ) )* otherlv_15= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==34) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1247:5: otherlv_10= 'iniciales' otherlv_11= '{' ( (lv_seleccion_12_0= ruleEInt ) ) (otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInputCheck2810); 

                        	newLeafNode(otherlv_10, grammarAccess.getInputCheckAccess().getInicialesKeyword_6_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputCheck2822); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1255:1: ( (lv_seleccion_12_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1256:1: (lv_seleccion_12_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1256:1: (lv_seleccion_12_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1257:3: lv_seleccion_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck2843);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1273:2: (otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==20) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1273:4: otherlv_13= ',' ( (lv_seleccion_14_0= ruleEInt ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInputCheck2856); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1277:1: ( (lv_seleccion_14_0= ruleEInt ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1278:1: (lv_seleccion_14_0= ruleEInt )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1278:1: (lv_seleccion_14_0= ruleEInt )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1279:3: lv_seleccion_14_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck2877);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCheck2891); 

                        	newLeafNode(otherlv_15, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1299:3: (otherlv_16= 'Reaccion' ( (lv_reaccion_17_0= ruleReaccion ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1299:5: otherlv_16= 'Reaccion' ( (lv_reaccion_17_0= ruleReaccion ) )
                    {
                    otherlv_16=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputCheck2906); 

                        	newLeafNode(otherlv_16, grammarAccess.getInputCheckAccess().getReaccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1303:1: ( (lv_reaccion_17_0= ruleReaccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1304:1: (lv_reaccion_17_0= ruleReaccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1304:1: (lv_reaccion_17_0= ruleReaccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1305:3: lv_reaccion_17_0= ruleReaccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getReaccionReaccionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_ruleInputCheck2927);
                    lv_reaccion_17_0=ruleReaccion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"reaccion",
                            		lv_reaccion_17_0, 
                            		"Reaccion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleBotonValidar"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1329:1: entryRuleBotonValidar returns [EObject current=null] : iv_ruleBotonValidar= ruleBotonValidar EOF ;
    public final EObject entryRuleBotonValidar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonValidar = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1330:2: (iv_ruleBotonValidar= ruleBotonValidar EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1331:2: iv_ruleBotonValidar= ruleBotonValidar EOF
            {
             newCompositeNode(grammarAccess.getBotonValidarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar2965);
            iv_ruleBotonValidar=ruleBotonValidar();

            state._fsp--;

             current =iv_ruleBotonValidar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonValidar2975); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1338:1: ruleBotonValidar returns [EObject current=null] : ( () otherlv_1= 'BotonValidar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonValidar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_invisible_2_0=null;
        Token lv_deshabilitado_3_0=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1341:28: ( ( () otherlv_1= 'BotonValidar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1342:1: ( () otherlv_1= 'BotonValidar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1342:1: ( () otherlv_1= 'BotonValidar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1342:2: () otherlv_1= 'BotonValidar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1342:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1343:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonValidarAccess().getBotonValidarAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleBotonValidar3021); 

                	newLeafNode(otherlv_1, grammarAccess.getBotonValidarAccess().getBotonValidarKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1352:1: ( (lv_invisible_2_0= 'invisible' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1353:1: (lv_invisible_2_0= 'invisible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1353:1: (lv_invisible_2_0= 'invisible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1354:3: lv_invisible_2_0= 'invisible'
                    {
                    lv_invisible_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBotonValidar3039); 

                            newLeafNode(lv_invisible_2_0, grammarAccess.getBotonValidarAccess().getInvisibleInvisibleKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonValidarRule());
                    	        }
                           		setWithLastConsumed(current, "invisible", true, "invisible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1367:3: ( (lv_deshabilitado_3_0= 'deshabilitado' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==25) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1368:1: (lv_deshabilitado_3_0= 'deshabilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1368:1: (lv_deshabilitado_3_0= 'deshabilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1369:3: lv_deshabilitado_3_0= 'deshabilitado'
                    {
                    lv_deshabilitado_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonValidar3071); 

                            newLeafNode(lv_deshabilitado_3_0, grammarAccess.getBotonValidarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonValidarRule());
                    	        }
                           		setWithLastConsumed(current, "deshabilitado", true, "deshabilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1382:3: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1383:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1383:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1384:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonValidarAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonValidar3106);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1408:1: entryRuleBotonGuardar_Impl returns [EObject current=null] : iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF ;
    public final EObject entryRuleBotonGuardar_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonGuardar_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1409:2: (iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1410:2: iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF
            {
             newCompositeNode(grammarAccess.getBotonGuardar_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl3142);
            iv_ruleBotonGuardar_Impl=ruleBotonGuardar_Impl();

            state._fsp--;

             current =iv_ruleBotonGuardar_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonGuardar_Impl3152); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1417:1: ruleBotonGuardar_Impl returns [EObject current=null] : ( () otherlv_1= 'BotonGuardar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonGuardar_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_invisible_2_0=null;
        Token lv_deshabilitado_3_0=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1420:28: ( ( () otherlv_1= 'BotonGuardar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1421:1: ( () otherlv_1= 'BotonGuardar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1421:1: ( () otherlv_1= 'BotonGuardar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1421:2: () otherlv_1= 'BotonGuardar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1421:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1422:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBotonGuardar_Impl3198); 

                	newLeafNode(otherlv_1, grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1431:1: ( (lv_invisible_2_0= 'invisible' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1432:1: (lv_invisible_2_0= 'invisible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1432:1: (lv_invisible_2_0= 'invisible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1433:3: lv_invisible_2_0= 'invisible'
                    {
                    lv_invisible_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBotonGuardar_Impl3216); 

                            newLeafNode(lv_invisible_2_0, grammarAccess.getBotonGuardar_ImplAccess().getInvisibleInvisibleKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonGuardar_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "invisible", true, "invisible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1446:3: ( (lv_deshabilitado_3_0= 'deshabilitado' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==25) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1447:1: (lv_deshabilitado_3_0= 'deshabilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1447:1: (lv_deshabilitado_3_0= 'deshabilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1448:3: lv_deshabilitado_3_0= 'deshabilitado'
                    {
                    lv_deshabilitado_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonGuardar_Impl3248); 

                            newLeafNode(lv_deshabilitado_3_0, grammarAccess.getBotonGuardar_ImplAccess().getDeshabilitadoDeshabilitadoKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonGuardar_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "deshabilitado", true, "deshabilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1461:3: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1462:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1462:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1463:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonGuardar_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonGuardar_Impl3283);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1487:1: entryRuleBotonCancelar returns [EObject current=null] : iv_ruleBotonCancelar= ruleBotonCancelar EOF ;
    public final EObject entryRuleBotonCancelar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCancelar = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1488:2: (iv_ruleBotonCancelar= ruleBotonCancelar EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1489:2: iv_ruleBotonCancelar= ruleBotonCancelar EOF
            {
             newCompositeNode(grammarAccess.getBotonCancelarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar3319);
            iv_ruleBotonCancelar=ruleBotonCancelar();

            state._fsp--;

             current =iv_ruleBotonCancelar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCancelar3329); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1496:1: ruleBotonCancelar returns [EObject current=null] : ( () otherlv_1= 'BotonCancelar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonCancelar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_invisible_2_0=null;
        Token lv_deshabilitado_3_0=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1499:28: ( ( () otherlv_1= 'BotonCancelar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1500:1: ( () otherlv_1= 'BotonCancelar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1500:1: ( () otherlv_1= 'BotonCancelar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1500:2: () otherlv_1= 'BotonCancelar' ( (lv_invisible_2_0= 'invisible' ) )? ( (lv_deshabilitado_3_0= 'deshabilitado' ) )? ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1500:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1501:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonCancelarAccess().getBotonCancelarAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBotonCancelar3375); 

                	newLeafNode(otherlv_1, grammarAccess.getBotonCancelarAccess().getBotonCancelarKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1510:1: ( (lv_invisible_2_0= 'invisible' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1511:1: (lv_invisible_2_0= 'invisible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1511:1: (lv_invisible_2_0= 'invisible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1512:3: lv_invisible_2_0= 'invisible'
                    {
                    lv_invisible_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBotonCancelar3393); 

                            newLeafNode(lv_invisible_2_0, grammarAccess.getBotonCancelarAccess().getInvisibleInvisibleKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCancelarRule());
                    	        }
                           		setWithLastConsumed(current, "invisible", true, "invisible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1525:3: ( (lv_deshabilitado_3_0= 'deshabilitado' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==25) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1526:1: (lv_deshabilitado_3_0= 'deshabilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1526:1: (lv_deshabilitado_3_0= 'deshabilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1527:3: lv_deshabilitado_3_0= 'deshabilitado'
                    {
                    lv_deshabilitado_3_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonCancelar3425); 

                            newLeafNode(lv_deshabilitado_3_0, grammarAccess.getBotonCancelarAccess().getDeshabilitadoDeshabilitadoKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCancelarRule());
                    	        }
                           		setWithLastConsumed(current, "deshabilitado", true, "deshabilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1540:3: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1541:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1541:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1542:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCancelarAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCancelar3460);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1566:1: entryRuleBotonCustom returns [EObject current=null] : iv_ruleBotonCustom= ruleBotonCustom EOF ;
    public final EObject entryRuleBotonCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCustom = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1567:2: (iv_ruleBotonCustom= ruleBotonCustom EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1568:2: iv_ruleBotonCustom= ruleBotonCustom EOF
            {
             newCompositeNode(grammarAccess.getBotonCustomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom3496);
            iv_ruleBotonCustom=ruleBotonCustom();

            state._fsp--;

             current =iv_ruleBotonCustom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCustom3506); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1575:1: ruleBotonCustom returns [EObject current=null] : (otherlv_0= 'BotonCustom' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_funcion_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleBotonCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_invisible_1_0=null;
        Token lv_deshabilitado_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_funcion_5_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1578:28: ( (otherlv_0= 'BotonCustom' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_funcion_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1579:1: (otherlv_0= 'BotonCustom' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_funcion_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1579:1: (otherlv_0= 'BotonCustom' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_funcion_5_0= ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1579:3: otherlv_0= 'BotonCustom' ( (lv_invisible_1_0= 'invisible' ) )? ( (lv_deshabilitado_2_0= 'deshabilitado' ) )? ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( (lv_funcion_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBotonCustom3543); 

                	newLeafNode(otherlv_0, grammarAccess.getBotonCustomAccess().getBotonCustomKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1583:1: ( (lv_invisible_1_0= 'invisible' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1584:1: (lv_invisible_1_0= 'invisible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1584:1: (lv_invisible_1_0= 'invisible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1585:3: lv_invisible_1_0= 'invisible'
                    {
                    lv_invisible_1_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleBotonCustom3561); 

                            newLeafNode(lv_invisible_1_0, grammarAccess.getBotonCustomAccess().getInvisibleInvisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCustomRule());
                    	        }
                           		setWithLastConsumed(current, "invisible", true, "invisible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1598:3: ( (lv_deshabilitado_2_0= 'deshabilitado' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1599:1: (lv_deshabilitado_2_0= 'deshabilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1599:1: (lv_deshabilitado_2_0= 'deshabilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1600:3: lv_deshabilitado_2_0= 'deshabilitado'
                    {
                    lv_deshabilitado_2_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonCustom3593); 

                            newLeafNode(lv_deshabilitado_2_0, grammarAccess.getBotonCustomAccess().getDeshabilitadoDeshabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCustomRule());
                    	        }
                           		setWithLastConsumed(current, "deshabilitado", true, "deshabilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1613:3: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1614:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1614:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1615:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCustomAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCustom3628);
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

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBotonCustom3640); 

                	newLeafNode(otherlv_4, grammarAccess.getBotonCustomAccess().getLeftCurlyBracketKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1635:1: ( (lv_funcion_5_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1636:1: (lv_funcion_5_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1636:1: (lv_funcion_5_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1637:3: lv_funcion_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCustomAccess().getFuncionEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCustom3661);
            lv_funcion_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBotonCustomRule());
            	        }
                   		set(
                   			current, 
                   			"funcion",
                    		lv_funcion_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBotonCustom3673); 

                	newLeafNode(otherlv_6, grammarAccess.getBotonCustomAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1665:1: entryRuleReaccionVisible returns [EObject current=null] : iv_ruleReaccionVisible= ruleReaccionVisible EOF ;
    public final EObject entryRuleReaccionVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccionVisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1666:2: (iv_ruleReaccionVisible= ruleReaccionVisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1667:2: iv_ruleReaccionVisible= ruleReaccionVisible EOF
            {
             newCompositeNode(grammarAccess.getReaccionVisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible3709);
            iv_ruleReaccionVisible=ruleReaccionVisible();

            state._fsp--;

             current =iv_ruleReaccionVisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionVisible3719); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1674:1: ruleReaccionVisible returns [EObject current=null] : (otherlv_0= 'Visible' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleReaccionVisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_activacion_1_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1677:28: ( (otherlv_0= 'Visible' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1678:1: (otherlv_0= 'Visible' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1678:1: (otherlv_0= 'Visible' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1678:3: otherlv_0= 'Visible' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleReaccionVisible3756); 

                	newLeafNode(otherlv_0, grammarAccess.getReaccionVisibleAccess().getVisibleKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1682:1: ( (lv_activacion_1_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1683:1: (lv_activacion_1_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1683:1: (lv_activacion_1_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1684:3: lv_activacion_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getReaccionVisibleAccess().getActivacionEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReaccionVisible3777);
            lv_activacion_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReaccionVisibleRule());
            	        }
                   		set(
                   			current, 
                   			"activacion",
                    		lv_activacion_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleReaccionVisible3789); 

                	newLeafNode(otherlv_2, grammarAccess.getReaccionVisibleAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1704:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1705:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1705:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1706:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReaccionVisibleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReaccionVisibleAccess().getObjetivoInputCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReaccionVisible3812);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleReaccionVisible"


    // $ANTLR start "entryRuleReaccionHabilitado"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1727:1: entryRuleReaccionHabilitado returns [EObject current=null] : iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF ;
    public final EObject entryRuleReaccionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1728:2: (iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1729:2: iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getReaccionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado3848);
            iv_ruleReaccionHabilitado=ruleReaccionHabilitado();

            state._fsp--;

             current =iv_ruleReaccionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionHabilitado3858); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1736:1: ruleReaccionHabilitado returns [EObject current=null] : (otherlv_0= 'Deshabilitado' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleReaccionHabilitado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_activacion_1_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1739:28: ( (otherlv_0= 'Deshabilitado' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1740:1: (otherlv_0= 'Deshabilitado' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1740:1: (otherlv_0= 'Deshabilitado' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1740:3: otherlv_0= 'Deshabilitado' ( (lv_activacion_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleReaccionHabilitado3895); 

                	newLeafNode(otherlv_0, grammarAccess.getReaccionHabilitadoAccess().getDeshabilitadoKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1744:1: ( (lv_activacion_1_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1745:1: (lv_activacion_1_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1745:1: (lv_activacion_1_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1746:3: lv_activacion_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getReaccionHabilitadoAccess().getActivacionEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReaccionHabilitado3916);
            lv_activacion_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReaccionHabilitadoRule());
            	        }
                   		set(
                   			current, 
                   			"activacion",
                    		lv_activacion_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleReaccionHabilitado3928); 

                	newLeafNode(otherlv_2, grammarAccess.getReaccionHabilitadoAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1766:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1767:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1767:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1768:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReaccionHabilitadoRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReaccionHabilitado3951);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleReaccionHabilitado"


    // $ANTLR start "entryRuleAccionValor"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1789:1: entryRuleAccionValor returns [EObject current=null] : iv_ruleAccionValor= ruleAccionValor EOF ;
    public final EObject entryRuleAccionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1790:2: (iv_ruleAccionValor= ruleAccionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1791:2: iv_ruleAccionValor= ruleAccionValor EOF
            {
             newCompositeNode(grammarAccess.getAccionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_entryRuleAccionValor3987);
            iv_ruleAccionValor=ruleAccionValor();

            state._fsp--;

             current =iv_ruleAccionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionValor3997); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1798:1: ruleAccionValor returns [EObject current=null] : (otherlv_0= 'Accion para Texto' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) ) ) ;
    public final EObject ruleAccionValor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        EObject lv_asercion_5_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1801:28: ( (otherlv_0= 'Accion para Texto' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1802:1: (otherlv_0= 'Accion para Texto' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1802:1: (otherlv_0= 'Accion para Texto' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1802:3: otherlv_0= 'Accion para Texto' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) )
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAccionValor4034); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionValorAccess().getAccionParaTextoKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1806:1: ( (lv_valor_1_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1807:1: (lv_valor_1_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1807:1: (lv_valor_1_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1808:3: lv_valor_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getValorEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionValor4055);
            lv_valor_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionValorRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAccionValor4067); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionValorAccess().getColonKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1828:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1829:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1829:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1830:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionValorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getElementoInputCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionValor4090);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAccionValor4102); 

                	newLeafNode(otherlv_4, grammarAccess.getAccionValorAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1847:1: ( (lv_asercion_5_0= ruleAsercion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1848:1: (lv_asercion_5_0= ruleAsercion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1848:1: (lv_asercion_5_0= ruleAsercion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1849:3: lv_asercion_5_0= ruleAsercion
            {
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getAsercionAsercionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionValor4123);
            lv_asercion_5_0=ruleAsercion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionValorRule());
            	        }
                   		set(
                   			current, 
                   			"asercion",
                    		lv_asercion_5_0, 
                    		"Asercion");
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
    // $ANTLR end "ruleAccionValor"


    // $ANTLR start "entryRuleAccionSeleccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1873:1: entryRuleAccionSeleccion returns [EObject current=null] : iv_ruleAccionSeleccion= ruleAccionSeleccion EOF ;
    public final EObject entryRuleAccionSeleccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionSeleccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1874:2: (iv_ruleAccionSeleccion= ruleAccionSeleccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1875:2: iv_ruleAccionSeleccion= ruleAccionSeleccion EOF
            {
             newCompositeNode(grammarAccess.getAccionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion4159);
            iv_ruleAccionSeleccion=ruleAccionSeleccion();

            state._fsp--;

             current =iv_ruleAccionSeleccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionSeleccion4169); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1882:1: ruleAccionSeleccion returns [EObject current=null] : (otherlv_0= 'Accion para Seleccion' ( ( ruleEString ) ) otherlv_2= ':' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) ) ) ;
    public final EObject ruleAccionSeleccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_valor_3_0 = null;

        EObject lv_asercion_5_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1885:28: ( (otherlv_0= 'Accion para Seleccion' ( ( ruleEString ) ) otherlv_2= ':' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1886:1: (otherlv_0= 'Accion para Seleccion' ( ( ruleEString ) ) otherlv_2= ':' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1886:1: (otherlv_0= 'Accion para Seleccion' ( ( ruleEString ) ) otherlv_2= ':' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1886:3: otherlv_0= 'Accion para Seleccion' ( ( ruleEString ) ) otherlv_2= ':' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= '->' ( (lv_asercion_5_0= ruleAsercion ) )
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAccionSeleccion4206); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionSeleccionAccess().getAccionParaSeleccionKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1890:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1891:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1891:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1892:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionSeleccionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getElementoInputCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionSeleccion4229);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAccionSeleccion4241); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionSeleccionAccess().getColonKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1909:1: ( (lv_valor_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1910:1: (lv_valor_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1910:1: (lv_valor_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1911:3: lv_valor_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getValorEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAccionSeleccion4262);
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

            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAccionSeleccion4274); 

                	newLeafNode(otherlv_4, grammarAccess.getAccionSeleccionAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1931:1: ( (lv_asercion_5_0= ruleAsercion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1932:1: (lv_asercion_5_0= ruleAsercion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1932:1: (lv_asercion_5_0= ruleAsercion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1933:3: lv_asercion_5_0= ruleAsercion
            {
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getAsercionAsercionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionSeleccion4295);
            lv_asercion_5_0=ruleAsercion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionSeleccionRule());
            	        }
                   		set(
                   			current, 
                   			"asercion",
                    		lv_asercion_5_0, 
                    		"Asercion");
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
    // $ANTLR end "ruleAccionSeleccion"


    // $ANTLR start "entryRuleAccionPulsacion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1957:1: entryRuleAccionPulsacion returns [EObject current=null] : iv_ruleAccionPulsacion= ruleAccionPulsacion EOF ;
    public final EObject entryRuleAccionPulsacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionPulsacion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1958:2: (iv_ruleAccionPulsacion= ruleAccionPulsacion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1959:2: iv_ruleAccionPulsacion= ruleAccionPulsacion EOF
            {
             newCompositeNode(grammarAccess.getAccionPulsacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionPulsacion_in_entryRuleAccionPulsacion4331);
            iv_ruleAccionPulsacion=ruleAccionPulsacion();

            state._fsp--;

             current =iv_ruleAccionPulsacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionPulsacion4341); 

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
    // $ANTLR end "entryRuleAccionPulsacion"


    // $ANTLR start "ruleAccionPulsacion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1966:1: ruleAccionPulsacion returns [EObject current=null] : (otherlv_0= 'Accion para Boton' ( ( ruleEString ) ) otherlv_2= '->' ( (lv_asercion_3_0= ruleAsercion ) ) ) ;
    public final EObject ruleAccionPulsacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_asercion_3_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1969:28: ( (otherlv_0= 'Accion para Boton' ( ( ruleEString ) ) otherlv_2= '->' ( (lv_asercion_3_0= ruleAsercion ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1970:1: (otherlv_0= 'Accion para Boton' ( ( ruleEString ) ) otherlv_2= '->' ( (lv_asercion_3_0= ruleAsercion ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1970:1: (otherlv_0= 'Accion para Boton' ( ( ruleEString ) ) otherlv_2= '->' ( (lv_asercion_3_0= ruleAsercion ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1970:3: otherlv_0= 'Accion para Boton' ( ( ruleEString ) ) otherlv_2= '->' ( (lv_asercion_3_0= ruleAsercion ) )
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleAccionPulsacion4378); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionPulsacionAccess().getAccionParaBotonKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1974:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1975:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1975:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1976:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionPulsacionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAccionPulsacionAccess().getElementoInputCrossReference_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionPulsacion4401);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAccionPulsacion4413); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionPulsacionAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1993:1: ( (lv_asercion_3_0= ruleAsercion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1994:1: (lv_asercion_3_0= ruleAsercion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1994:1: (lv_asercion_3_0= ruleAsercion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1995:3: lv_asercion_3_0= ruleAsercion
            {
             
            	        newCompositeNode(grammarAccess.getAccionPulsacionAccess().getAsercionAsercionParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionPulsacion4434);
            lv_asercion_3_0=ruleAsercion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionPulsacionRule());
            	        }
                   		set(
                   			current, 
                   			"asercion",
                    		lv_asercion_3_0, 
                    		"Asercion");
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
    // $ANTLR end "ruleAccionPulsacion"


    // $ANTLR start "entryRuleAsercionInvisible"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2019:1: entryRuleAsercionInvisible returns [EObject current=null] : iv_ruleAsercionInvisible= ruleAsercionInvisible EOF ;
    public final EObject entryRuleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionInvisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2020:2: (iv_ruleAsercionInvisible= ruleAsercionInvisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2021:2: iv_ruleAsercionInvisible= ruleAsercionInvisible EOF
            {
             newCompositeNode(grammarAccess.getAsercionInvisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible4470);
            iv_ruleAsercionInvisible=ruleAsercionInvisible();

            state._fsp--;

             current =iv_ruleAsercionInvisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionInvisible4480); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2028:1: ruleAsercionInvisible returns [EObject current=null] : (otherlv_0= 'Asercion invisible' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_estado_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2031:28: ( (otherlv_0= 'Asercion invisible' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2032:1: (otherlv_0= 'Asercion invisible' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2032:1: (otherlv_0= 'Asercion invisible' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2032:3: otherlv_0= 'Asercion invisible' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAsercionInvisible4517); 

                	newLeafNode(otherlv_0, grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2036:1: ( (lv_estado_1_0= 'falso' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2037:1: (lv_estado_1_0= 'falso' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2037:1: (lv_estado_1_0= 'falso' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2038:3: lv_estado_1_0= 'falso'
                    {
                    lv_estado_1_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionInvisible4535); 

                            newLeafNode(lv_estado_1_0, grammarAccess.getAsercionInvisibleAccess().getEstadoFalsoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
                    	        }
                           		setWithLastConsumed(current, "estado", true, "falso");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAsercionInvisible4561); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionInvisibleAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2055:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2056:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2056:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2057:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionInvisibleAccess().getElementoInputCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionInvisible4584);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleAsercionInvisible"


    // $ANTLR start "entryRuleAsercionHabilitado"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2078:1: entryRuleAsercionHabilitado returns [EObject current=null] : iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF ;
    public final EObject entryRuleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2079:2: (iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2080:2: iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getAsercionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado4620);
            iv_ruleAsercionHabilitado=ruleAsercionHabilitado();

            state._fsp--;

             current =iv_ruleAsercionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionHabilitado4630); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2087:1: ruleAsercionHabilitado returns [EObject current=null] : (otherlv_0= 'Asercion deshabilitado' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_estado_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2090:28: ( (otherlv_0= 'Asercion deshabilitado' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2091:1: (otherlv_0= 'Asercion deshabilitado' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2091:1: (otherlv_0= 'Asercion deshabilitado' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2091:3: otherlv_0= 'Asercion deshabilitado' ( (lv_estado_1_0= 'falso' ) )? otherlv_2= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAsercionHabilitado4667); 

                	newLeafNode(otherlv_0, grammarAccess.getAsercionHabilitadoAccess().getAsercionDeshabilitadoKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2095:1: ( (lv_estado_1_0= 'falso' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2096:1: (lv_estado_1_0= 'falso' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2096:1: (lv_estado_1_0= 'falso' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2097:3: lv_estado_1_0= 'falso'
                    {
                    lv_estado_1_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionHabilitado4685); 

                            newLeafNode(lv_estado_1_0, grammarAccess.getAsercionHabilitadoAccess().getEstadoFalsoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
                    	        }
                           		setWithLastConsumed(current, "estado", true, "falso");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAsercionHabilitado4711); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionHabilitadoAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2114:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2115:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2115:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2116:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionHabilitadoAccess().getElementoInputCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionHabilitado4734);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleAsercionHabilitado"


    // $ANTLR start "entryRuleAsercionValor"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2137:1: entryRuleAsercionValor returns [EObject current=null] : iv_ruleAsercionValor= ruleAsercionValor EOF ;
    public final EObject entryRuleAsercionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2138:2: (iv_ruleAsercionValor= ruleAsercionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2139:2: iv_ruleAsercionValor= ruleAsercionValor EOF
            {
             newCompositeNode(grammarAccess.getAsercionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor4770);
            iv_ruleAsercionValor=ruleAsercionValor();

            state._fsp--;

             current =iv_ruleAsercionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionValor4780); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2146:1: ruleAsercionValor returns [EObject current=null] : (otherlv_0= 'Asercion valor' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleAsercionValor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_valor_1_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2149:28: ( (otherlv_0= 'Asercion valor' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2150:1: (otherlv_0= 'Asercion valor' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2150:1: (otherlv_0= 'Asercion valor' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2150:3: otherlv_0= 'Asercion valor' ( (lv_valor_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAsercionValor4817); 

                	newLeafNode(otherlv_0, grammarAccess.getAsercionValorAccess().getAsercionValorKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2154:1: ( (lv_valor_1_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2155:1: (lv_valor_1_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2155:1: (lv_valor_1_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2156:3: lv_valor_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsercionValorAccess().getValorEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor4838);
            lv_valor_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsercionValorRule());
            	        }
                   		set(
                   			current, 
                   			"valor",
                    		lv_valor_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAsercionValor4850); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionValorAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2176:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2177:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2177:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2178:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionValorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionValorAccess().getElementoInputCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor4873);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleAsercionValor"


    // $ANTLR start "entryRuleAsercionSeleccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2199:1: entryRuleAsercionSeleccion returns [EObject current=null] : iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF ;
    public final EObject entryRuleAsercionSeleccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionSeleccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2200:2: (iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2201:2: iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF
            {
             newCompositeNode(grammarAccess.getAsercionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion4909);
            iv_ruleAsercionSeleccion=ruleAsercionSeleccion();

            state._fsp--;

             current =iv_ruleAsercionSeleccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionSeleccion4919); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2208:1: ruleAsercionSeleccion returns [EObject current=null] : (otherlv_0= 'Asercion seleccion' ( (lv_estado_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) ) ;
    public final EObject ruleAsercionSeleccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_estado_1_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2211:28: ( (otherlv_0= 'Asercion seleccion' ( (lv_estado_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2212:1: (otherlv_0= 'Asercion seleccion' ( (lv_estado_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2212:1: (otherlv_0= 'Asercion seleccion' ( (lv_estado_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2212:3: otherlv_0= 'Asercion seleccion' ( (lv_estado_1_0= ruleEInt ) ) otherlv_2= '->' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAsercionSeleccion4956); 

                	newLeafNode(otherlv_0, grammarAccess.getAsercionSeleccionAccess().getAsercionSeleccionKeyword_0());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2216:1: ( (lv_estado_1_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2217:1: (lv_estado_1_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2217:1: (lv_estado_1_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2218:3: lv_estado_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getAsercionSeleccionAccess().getEstadoEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAsercionSeleccion4977);
            lv_estado_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAsercionSeleccionRule());
            	        }
                   		set(
                   			current, 
                   			"estado",
                    		lv_estado_1_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAsercionSeleccion4989); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionSeleccionAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2238:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2239:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2239:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2240:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionSeleccionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionSeleccionAccess().getElementoInputCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionSeleccion5012);
            ruleEString();

            state._fsp--;

             
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
    // $ANTLR end "ruleAsercionSeleccion"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormulario_in_entryRuleFormulario75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulario85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFormulario122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFormulario143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFormulario155 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_13_in_ruleFormulario173 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_14_in_ruleFormulario205 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleFormulario240 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_ruleFormulario261 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFormulario274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_ruleInput367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_ruleInput394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_ruleInput421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_ruleInput448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_ruleInput475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_ruleInput502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_ruleInput529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_ruleInput556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion591 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccion601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_ruleAccion648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_ruleAccion675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionPulsacion_in_ruleAccion702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccion_in_entryRuleReaccion737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccion747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_ruleReaccion794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_ruleReaccion821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercion_in_entryRuleAsercion856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercion866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_ruleAsercion913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_ruleAsercion940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_ruleAsercion967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_ruleAsercion994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout1029 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout1039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleLayout1076 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayout1088 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLayout1100 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout1121 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleLayout1134 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLayout1146 = new BitSet(new long[]{0x0000007B21000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout1167 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_20_in_ruleLayout1180 = new BitSet(new long[]{0x0000007B21000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout1201 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_21_in_ruleLayout1215 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLayout1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1266 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rulePruebaInterfaz1444 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePruebaInterfaz1456 = new BitSet(new long[]{0x00001C0000008000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1478 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_rulePruebaInterfaz1491 = new BitSet(new long[]{0x00001C0000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1512 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_rulePruebaInterfaz1528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1567 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleEInt1617 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto1679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto1689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleInputTexto1735 = new BitSet(new long[]{0x000000000E000030L});
        public static final BitSet FOLLOW_25_in_ruleInputTexto1753 = new BitSet(new long[]{0x000000000C000030L});
        public static final BitSet FOLLOW_26_in_ruleInputTexto1785 = new BitSet(new long[]{0x0000000008000030L});
        public static final BitSet FOLLOW_27_in_ruleInputTexto1817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1852 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleInputTexto1865 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio1924 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio1934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleInputRadio1971 = new BitSet(new long[]{0x000000000A000030L});
        public static final BitSet FOLLOW_27_in_ruleInputRadio1989 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleInputRadio2021 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2056 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputRadio2068 = new BitSet(new long[]{0x0000000090001002L});
        public static final BitSet FOLLOW_12_in_ruleInputRadio2081 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2102 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleInputRadio2115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2136 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleInputRadio2150 = new BitSet(new long[]{0x0000000090000002L});
        public static final BitSet FOLLOW_28_in_ruleInputRadio2165 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputRadio2186 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleInputRadio2201 = new BitSet(new long[]{0x0000028000000000L});
        public static final BitSet FOLLOW_ruleReaccion_in_ruleInputRadio2222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo2260 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo2270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleInputCombo2316 = new BitSet(new long[]{0x000000000A000030L});
        public static final BitSet FOLLOW_27_in_ruleInputCombo2334 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleInputCombo2366 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2401 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputCombo2413 = new BitSet(new long[]{0x0000000010001002L});
        public static final BitSet FOLLOW_12_in_ruleInputCombo2426 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2447 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleInputCombo2460 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2481 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleInputCombo2495 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleInputCombo2510 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCombo2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck2569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck2579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleInputCheck2616 = new BitSet(new long[]{0x000000000A000030L});
        public static final BitSet FOLLOW_27_in_ruleInputCheck2634 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleInputCheck2666 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2701 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputCheck2713 = new BitSet(new long[]{0x0000000480001002L});
        public static final BitSet FOLLOW_12_in_ruleInputCheck2726 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2747 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleInputCheck2760 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2781 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleInputCheck2795 = new BitSet(new long[]{0x0000000480000002L});
        public static final BitSet FOLLOW_34_in_ruleInputCheck2810 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputCheck2822 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck2843 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_20_in_ruleInputCheck2856 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck2877 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleInputCheck2891 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleInputCheck2906 = new BitSet(new long[]{0x0000028000000000L});
        public static final BitSet FOLLOW_ruleReaccion_in_ruleInputCheck2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar2965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonValidar2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleBotonValidar3021 = new BitSet(new long[]{0x000000000A000030L});
        public static final BitSet FOLLOW_27_in_ruleBotonValidar3039 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleBotonValidar3071 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonValidar3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl3142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonGuardar_Impl3152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleBotonGuardar_Impl3198 = new BitSet(new long[]{0x000000000A000030L});
        public static final BitSet FOLLOW_27_in_ruleBotonGuardar_Impl3216 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleBotonGuardar_Impl3248 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonGuardar_Impl3283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar3319 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCancelar3329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleBotonCancelar3375 = new BitSet(new long[]{0x000000000A000030L});
        public static final BitSet FOLLOW_27_in_ruleBotonCancelar3393 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleBotonCancelar3425 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCancelar3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom3496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCustom3506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleBotonCustom3543 = new BitSet(new long[]{0x000000000A000030L});
        public static final BitSet FOLLOW_27_in_ruleBotonCustom3561 = new BitSet(new long[]{0x0000000002000030L});
        public static final BitSet FOLLOW_25_in_ruleBotonCustom3593 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCustom3628 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBotonCustom3640 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCustom3661 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBotonCustom3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible3709 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionVisible3719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleReaccionVisible3756 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReaccionVisible3777 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleReaccionVisible3789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReaccionVisible3812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado3848 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionHabilitado3858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleReaccionHabilitado3895 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReaccionHabilitado3916 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleReaccionHabilitado3928 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReaccionHabilitado3951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_entryRuleAccionValor3987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionValor3997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleAccionValor4034 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionValor4055 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAccionValor4067 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionValor4090 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAccionValor4102 = new BitSet(new long[]{0x0003A00000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionValor4123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion4159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionSeleccion4169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAccionSeleccion4206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionSeleccion4229 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAccionSeleccion4241 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAccionSeleccion4262 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAccionSeleccion4274 = new BitSet(new long[]{0x0003A00000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionSeleccion4295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionPulsacion_in_entryRuleAccionPulsacion4331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionPulsacion4341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleAccionPulsacion4378 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionPulsacion4401 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAccionPulsacion4413 = new BitSet(new long[]{0x0003A00000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionPulsacion4434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible4470 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionInvisible4480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleAsercionInvisible4517 = new BitSet(new long[]{0x0000410000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionInvisible4535 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAsercionInvisible4561 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionInvisible4584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado4620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionHabilitado4630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleAsercionHabilitado4667 = new BitSet(new long[]{0x0000410000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionHabilitado4685 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAsercionHabilitado4711 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionHabilitado4734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor4770 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionValor4780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAsercionValor4817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor4838 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAsercionValor4850 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor4873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion4909 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionSeleccion4919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAsercionSeleccion4956 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAsercionSeleccion4977 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleAsercionSeleccion4989 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionSeleccion5012 = new BitSet(new long[]{0x0000000000000002L});
    }


}