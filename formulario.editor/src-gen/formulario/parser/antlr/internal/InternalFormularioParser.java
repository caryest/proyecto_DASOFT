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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Formulario'", "'{'", "'layout'", "'pruebas'", "'}'", "'Layout'", "'columnas'", "'entradas'", "','", "'comprobarAsercion'", "'comprobarAccion'", "'PruebaInterfaz'", "'acciones'", "'-'", "'visible'", "'habilitado'", "'obligatorio'", "'InputTexto'", "'valor'", "'InputRadio'", "'valores'", "'seleccion'", "'reaccion'", "'InputCombo'", "'InputCheck'", "'BotonValidar'", "'BotonGuardar'", "'BotonCancelar'", "'BotonCustom'", "'funcion'", "'ReaccionVisible'", "'activacion'", "'objetivo'", "'ReaccionHabilitado'", "'AccionValor'", "'elemento'", "'asercion'", "'AccionSeleccion'", "'AccionPulsacion'", "'estado'", "'AsercionInvisible'", "'AsercionHabilitado'", "'AsercionValor'", "'AsercionSeleccion'"
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:76:1: ruleFormulario returns [EObject current=null] : (otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'layout' ( (lv_layout_4_0= ruleLayout ) ) (otherlv_5= 'pruebas' ( (lv_pruebas_6_0= rulePruebaInterfaz ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleFormulario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_layout_4_0 = null;

        EObject lv_pruebas_6_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:79:28: ( (otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'layout' ( (lv_layout_4_0= ruleLayout ) ) (otherlv_5= 'pruebas' ( (lv_pruebas_6_0= rulePruebaInterfaz ) ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: (otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'layout' ( (lv_layout_4_0= ruleLayout ) ) (otherlv_5= 'pruebas' ( (lv_pruebas_6_0= rulePruebaInterfaz ) ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:1: (otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'layout' ( (lv_layout_4_0= ruleLayout ) ) (otherlv_5= 'pruebas' ( (lv_pruebas_6_0= rulePruebaInterfaz ) ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:80:3: otherlv_0= 'Formulario' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'layout' ( (lv_layout_4_0= ruleLayout ) ) (otherlv_5= 'pruebas' ( (lv_pruebas_6_0= rulePruebaInterfaz ) ) )? otherlv_7= '}'
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
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFormulario167); 

                	newLeafNode(otherlv_3, grammarAccess.getFormularioAccess().getLayoutKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:110:1: ( (lv_layout_4_0= ruleLayout ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:111:1: (lv_layout_4_0= ruleLayout )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:111:1: (lv_layout_4_0= ruleLayout )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:112:3: lv_layout_4_0= ruleLayout
            {
             
            	        newCompositeNode(grammarAccess.getFormularioAccess().getLayoutLayoutParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleFormulario188);
            lv_layout_4_0=ruleLayout();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormularioRule());
            	        }
                   		set(
                   			current, 
                   			"layout",
                    		lv_layout_4_0, 
                    		"Layout");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:128:2: (otherlv_5= 'pruebas' ( (lv_pruebas_6_0= rulePruebaInterfaz ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:128:4: otherlv_5= 'pruebas' ( (lv_pruebas_6_0= rulePruebaInterfaz ) )
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFormulario201); 

                        	newLeafNode(otherlv_5, grammarAccess.getFormularioAccess().getPruebasKeyword_5_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:132:1: ( (lv_pruebas_6_0= rulePruebaInterfaz ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:133:1: (lv_pruebas_6_0= rulePruebaInterfaz )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:133:1: (lv_pruebas_6_0= rulePruebaInterfaz )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:134:3: lv_pruebas_6_0= rulePruebaInterfaz
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormularioAccess().getPruebasPruebaInterfazParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_ruleFormulario222);
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


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFormulario236); 

                	newLeafNode(otherlv_7, grammarAccess.getFormularioAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:162:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:163:2: (iv_ruleInput= ruleInput EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:164:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInput_in_entryRuleInput272);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInput282); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:171:1: ruleInput returns [EObject current=null] : (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:174:28: ( (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:175:1: (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:175:1: (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom )
            int alt2=8;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:176:5: this_InputTexto_0= ruleInputTexto
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputTextoParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_ruleInput329);
                    this_InputTexto_0=ruleInputTexto();

                    state._fsp--;

                     
                            current = this_InputTexto_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:186:5: this_InputRadio_1= ruleInputRadio
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputRadioParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_ruleInput356);
                    this_InputRadio_1=ruleInputRadio();

                    state._fsp--;

                     
                            current = this_InputRadio_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:196:5: this_InputCombo_2= ruleInputCombo
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputComboParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_ruleInput383);
                    this_InputCombo_2=ruleInputCombo();

                    state._fsp--;

                     
                            current = this_InputCombo_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:206:5: this_InputCheck_3= ruleInputCheck
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputCheckParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_ruleInput410);
                    this_InputCheck_3=ruleInputCheck();

                    state._fsp--;

                     
                            current = this_InputCheck_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:216:5: this_BotonValidar_4= ruleBotonValidar
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonValidarParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_ruleInput437);
                    this_BotonValidar_4=ruleBotonValidar();

                    state._fsp--;

                     
                            current = this_BotonValidar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:226:5: this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonGuardar_ImplParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_ruleInput464);
                    this_BotonGuardar_Impl_5=ruleBotonGuardar_Impl();

                    state._fsp--;

                     
                            current = this_BotonGuardar_Impl_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:236:5: this_BotonCancelar_6= ruleBotonCancelar
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonCancelarParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_ruleInput491);
                    this_BotonCancelar_6=ruleBotonCancelar();

                    state._fsp--;

                     
                            current = this_BotonCancelar_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:246:5: this_BotonCustom_7= ruleBotonCustom
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getBotonCustomParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_ruleInput518);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:262:1: entryRuleAccion returns [EObject current=null] : iv_ruleAccion= ruleAccion EOF ;
    public final EObject entryRuleAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:263:2: (iv_ruleAccion= ruleAccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:264:2: iv_ruleAccion= ruleAccion EOF
            {
             newCompositeNode(grammarAccess.getAccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccion_in_entryRuleAccion553);
            iv_ruleAccion=ruleAccion();

            state._fsp--;

             current =iv_ruleAccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccion563); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:271:1: ruleAccion returns [EObject current=null] : (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion | this_AccionPulsacion_2= ruleAccionPulsacion ) ;
    public final EObject ruleAccion() throws RecognitionException {
        EObject current = null;

        EObject this_AccionValor_0 = null;

        EObject this_AccionSeleccion_1 = null;

        EObject this_AccionPulsacion_2 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:274:28: ( (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion | this_AccionPulsacion_2= ruleAccionPulsacion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:275:1: (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion | this_AccionPulsacion_2= ruleAccionPulsacion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:275:1: (this_AccionValor_0= ruleAccionValor | this_AccionSeleccion_1= ruleAccionSeleccion | this_AccionPulsacion_2= ruleAccionPulsacion )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt3=1;
                }
                break;
            case 48:
                {
                alt3=2;
                }
                break;
            case 49:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:276:5: this_AccionValor_0= ruleAccionValor
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAccionValorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_ruleAccion610);
                    this_AccionValor_0=ruleAccionValor();

                    state._fsp--;

                     
                            current = this_AccionValor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:286:5: this_AccionSeleccion_1= ruleAccionSeleccion
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAccionSeleccionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_ruleAccion637);
                    this_AccionSeleccion_1=ruleAccionSeleccion();

                    state._fsp--;

                     
                            current = this_AccionSeleccion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:296:5: this_AccionPulsacion_2= ruleAccionPulsacion
                    {
                     
                            newCompositeNode(grammarAccess.getAccionAccess().getAccionPulsacionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAccionPulsacion_in_ruleAccion664);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:312:1: entryRuleReaccion returns [EObject current=null] : iv_ruleReaccion= ruleReaccion EOF ;
    public final EObject entryRuleReaccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:313:2: (iv_ruleReaccion= ruleReaccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:314:2: iv_ruleReaccion= ruleReaccion EOF
            {
             newCompositeNode(grammarAccess.getReaccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_entryRuleReaccion699);
            iv_ruleReaccion=ruleReaccion();

            state._fsp--;

             current =iv_ruleReaccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccion709); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:321:1: ruleReaccion returns [EObject current=null] : (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado ) ;
    public final EObject ruleReaccion() throws RecognitionException {
        EObject current = null;

        EObject this_ReaccionVisible_0 = null;

        EObject this_ReaccionHabilitado_1 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:324:28: ( (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:325:1: (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:325:1: (this_ReaccionVisible_0= ruleReaccionVisible | this_ReaccionHabilitado_1= ruleReaccionHabilitado )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==44) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:326:5: this_ReaccionVisible_0= ruleReaccionVisible
                    {
                     
                            newCompositeNode(grammarAccess.getReaccionAccess().getReaccionVisibleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_ruleReaccion756);
                    this_ReaccionVisible_0=ruleReaccionVisible();

                    state._fsp--;

                     
                            current = this_ReaccionVisible_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:336:5: this_ReaccionHabilitado_1= ruleReaccionHabilitado
                    {
                     
                            newCompositeNode(grammarAccess.getReaccionAccess().getReaccionHabilitadoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_ruleReaccion783);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:352:1: entryRuleAsercion returns [EObject current=null] : iv_ruleAsercion= ruleAsercion EOF ;
    public final EObject entryRuleAsercion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:353:2: (iv_ruleAsercion= ruleAsercion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:354:2: iv_ruleAsercion= ruleAsercion EOF
            {
             newCompositeNode(grammarAccess.getAsercionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_entryRuleAsercion818);
            iv_ruleAsercion=ruleAsercion();

            state._fsp--;

             current =iv_ruleAsercion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercion828); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:361:1: ruleAsercion returns [EObject current=null] : (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion ) ;
    public final EObject ruleAsercion() throws RecognitionException {
        EObject current = null;

        EObject this_AsercionInvisible_0 = null;

        EObject this_AsercionHabilitado_1 = null;

        EObject this_AsercionValor_2 = null;

        EObject this_AsercionSeleccion_3 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:364:28: ( (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:365:1: (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:365:1: (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccion_3= ruleAsercionSeleccion )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==52) ) {
                    alt5=2;
                }
                else if ( (LA5_1==51) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 53:
                {
                alt5=3;
                }
                break;
            case 54:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:366:5: this_AsercionInvisible_0= ruleAsercionInvisible
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionInvisibleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_ruleAsercion875);
                    this_AsercionInvisible_0=ruleAsercionInvisible();

                    state._fsp--;

                     
                            current = this_AsercionInvisible_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:376:5: this_AsercionHabilitado_1= ruleAsercionHabilitado
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionHabilitadoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_ruleAsercion902);
                    this_AsercionHabilitado_1=ruleAsercionHabilitado();

                    state._fsp--;

                     
                            current = this_AsercionHabilitado_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:386:5: this_AsercionValor_2= ruleAsercionValor
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionValorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_ruleAsercion929);
                    this_AsercionValor_2=ruleAsercionValor();

                    state._fsp--;

                     
                            current = this_AsercionValor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:396:5: this_AsercionSeleccion_3= ruleAsercionSeleccion
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionSeleccionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_ruleAsercion956);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:412:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:413:2: (iv_ruleLayout= ruleLayout EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:414:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout991);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout1001); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:421:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:424:28: ( (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:425:1: (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:425:1: (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:425:3: otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'columnas' ( (lv_columnas_3_0= ruleEInt ) ) (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLayout1038); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayout1050); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout1062); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getColumnasKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:437:1: ( (lv_columnas_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:438:1: (lv_columnas_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:438:1: (lv_columnas_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:439:3: lv_columnas_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getLayoutAccess().getColumnasEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout1083);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:455:2: (otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:455:4: otherlv_4= 'entradas' otherlv_5= '{' ( (lv_entradas_6_0= ruleInput ) ) (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLayout1096); 

                        	newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getEntradasKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayout1108); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:463:1: ( (lv_entradas_6_0= ruleInput ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:464:1: (lv_entradas_6_0= ruleInput )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:464:1: (lv_entradas_6_0= ruleInput )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:465:3: lv_entradas_6_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout1129);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:481:2: (otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:481:4: otherlv_7= ',' ( (lv_entradas_8_0= ruleInput ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLayout1142); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:485:1: ( (lv_entradas_8_0= ruleInput ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:486:1: (lv_entradas_8_0= ruleInput )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:486:1: (lv_entradas_8_0= ruleInput )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:487:3: lv_entradas_8_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout1163);
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
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLayout1177); 

                        	newLeafNode(otherlv_9, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLayout1191); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:519:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:520:2: (iv_ruleEString= ruleEString EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:521:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1228);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1239); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:528:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:531:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:532:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:532:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:532:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1279); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:540:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1305); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:555:1: entryRulePruebaInterfaz returns [EObject current=null] : iv_rulePruebaInterfaz= rulePruebaInterfaz EOF ;
    public final EObject entryRulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePruebaInterfaz = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:556:2: (iv_rulePruebaInterfaz= rulePruebaInterfaz EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:557:2: iv_rulePruebaInterfaz= rulePruebaInterfaz EOF
            {
             newCompositeNode(grammarAccess.getPruebaInterfazRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1350);
            iv_rulePruebaInterfaz=rulePruebaInterfaz();

            state._fsp--;

             current =iv_rulePruebaInterfaz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz1360); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:564:1: rulePruebaInterfaz returns [EObject current=null] : ( () ( (lv_comprobarAsercion_1_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_2_0= 'comprobarAccion' ) )? otherlv_3= 'PruebaInterfaz' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'acciones' otherlv_7= '{' ( (lv_acciones_8_0= ruleAccion ) ) (otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject rulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        Token lv_comprobarAsercion_1_0=null;
        Token lv_comprobarAccion_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_acciones_8_0 = null;

        EObject lv_acciones_10_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:567:28: ( ( () ( (lv_comprobarAsercion_1_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_2_0= 'comprobarAccion' ) )? otherlv_3= 'PruebaInterfaz' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'acciones' otherlv_7= '{' ( (lv_acciones_8_0= ruleAccion ) ) (otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:568:1: ( () ( (lv_comprobarAsercion_1_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_2_0= 'comprobarAccion' ) )? otherlv_3= 'PruebaInterfaz' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'acciones' otherlv_7= '{' ( (lv_acciones_8_0= ruleAccion ) ) (otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:568:1: ( () ( (lv_comprobarAsercion_1_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_2_0= 'comprobarAccion' ) )? otherlv_3= 'PruebaInterfaz' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'acciones' otherlv_7= '{' ( (lv_acciones_8_0= ruleAccion ) ) (otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:568:2: () ( (lv_comprobarAsercion_1_0= 'comprobarAsercion' ) )? ( (lv_comprobarAccion_2_0= 'comprobarAccion' ) )? otherlv_3= 'PruebaInterfaz' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'acciones' otherlv_7= '{' ( (lv_acciones_8_0= ruleAccion ) ) (otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:568:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:569:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:574:2: ( (lv_comprobarAsercion_1_0= 'comprobarAsercion' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:575:1: (lv_comprobarAsercion_1_0= 'comprobarAsercion' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:575:1: (lv_comprobarAsercion_1_0= 'comprobarAsercion' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:576:3: lv_comprobarAsercion_1_0= 'comprobarAsercion'
                    {
                    lv_comprobarAsercion_1_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePruebaInterfaz1412); 

                            newLeafNode(lv_comprobarAsercion_1_0, grammarAccess.getPruebaInterfazAccess().getComprobarAsercionComprobarAsercionKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPruebaInterfazRule());
                    	        }
                           		setWithLastConsumed(current, "comprobarAsercion", true, "comprobarAsercion");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:589:3: ( (lv_comprobarAccion_2_0= 'comprobarAccion' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:1: (lv_comprobarAccion_2_0= 'comprobarAccion' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:590:1: (lv_comprobarAccion_2_0= 'comprobarAccion' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:591:3: lv_comprobarAccion_2_0= 'comprobarAccion'
                    {
                    lv_comprobarAccion_2_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePruebaInterfaz1444); 

                            newLeafNode(lv_comprobarAccion_2_0, grammarAccess.getPruebaInterfazAccess().getComprobarAccionComprobarAccionKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPruebaInterfazRule());
                    	        }
                           		setWithLastConsumed(current, "comprobarAccion", true, "comprobarAccion");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePruebaInterfaz1470); 

                	newLeafNode(otherlv_3, grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:608:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:609:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:609:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:610:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1491);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPruebaInterfazRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePruebaInterfaz1503); 

                	newLeafNode(otherlv_5, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:630:1: (otherlv_6= 'acciones' otherlv_7= '{' ( (lv_acciones_8_0= ruleAccion ) ) (otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) ) )* otherlv_11= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:630:3: otherlv_6= 'acciones' otherlv_7= '{' ( (lv_acciones_8_0= ruleAccion ) ) (otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePruebaInterfaz1516); 

                        	newLeafNode(otherlv_6, grammarAccess.getPruebaInterfazAccess().getAccionesKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePruebaInterfaz1528); 

                        	newLeafNode(otherlv_7, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:638:1: ( (lv_acciones_8_0= ruleAccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:639:1: (lv_acciones_8_0= ruleAccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:639:1: (lv_acciones_8_0= ruleAccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:640:3: lv_acciones_8_0= ruleAccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1549);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:656:2: (otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:656:4: otherlv_9= ',' ( (lv_acciones_10_0= ruleAccion ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePruebaInterfaz1562); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getPruebaInterfazAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:660:1: ( (lv_acciones_10_0= ruleAccion ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:661:1: (lv_acciones_10_0= ruleAccion )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:661:1: (lv_acciones_10_0= ruleAccion )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:662:3: lv_acciones_10_0= ruleAccion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1583);
                    	    lv_acciones_10_0=ruleAccion();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPruebaInterfazRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"acciones",
                    	            		lv_acciones_10_0, 
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

                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePruebaInterfaz1597); 

                        	newLeafNode(otherlv_11, grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePruebaInterfaz1611); 

                	newLeafNode(otherlv_12, grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:694:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:695:2: (iv_ruleEInt= ruleEInt EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:696:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1648);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1659); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:703:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:706:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:707:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:707:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:707:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:707:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:708:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEInt1698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1715); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:730:1: entryRuleInputTexto returns [EObject current=null] : iv_ruleInputTexto= ruleInputTexto EOF ;
    public final EObject entryRuleInputTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTexto = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:731:2: (iv_ruleInputTexto= ruleInputTexto EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:732:2: iv_ruleInputTexto= ruleInputTexto EOF
            {
             newCompositeNode(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto1762);
            iv_ruleInputTexto=ruleInputTexto();

            state._fsp--;

             current =iv_ruleInputTexto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto1772); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:739:1: ruleInputTexto returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:742:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:743:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:743:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:743:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:743:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:744:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputTextoAccess().getInputTextoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:749:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:750:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:750:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:751:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputTexto1824); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:764:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:765:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:765:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:766:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputTexto1856); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:779:3: ( (lv_obligatorio_3_0= 'obligatorio' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:780:1: (lv_obligatorio_3_0= 'obligatorio' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:780:1: (lv_obligatorio_3_0= 'obligatorio' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:781:3: lv_obligatorio_3_0= 'obligatorio'
                    {
                    lv_obligatorio_3_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputTexto1888); 

                            newLeafNode(lv_obligatorio_3_0, grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "obligatorio", true, "obligatorio");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputTexto1914); 

                	newLeafNode(otherlv_4, grammarAccess.getInputTextoAccess().getInputTextoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:798:1: ( (lv_name_5_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:799:1: (lv_name_5_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:799:1: (lv_name_5_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:800:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1935);
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

            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputTexto1947); 

                	newLeafNode(otherlv_6, grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:820:1: (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:820:3: otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputTexto1960); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputTextoAccess().getValorKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:824:1: ( (lv_valor_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:825:1: (lv_valor_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:825:1: (lv_valor_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:826:3: lv_valor_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1981);
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

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputTexto1995); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:854:1: entryRuleInputRadio returns [EObject current=null] : iv_ruleInputRadio= ruleInputRadio EOF ;
    public final EObject entryRuleInputRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRadio = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:855:2: (iv_ruleInputRadio= ruleInputRadio EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:856:2: iv_ruleInputRadio= ruleInputRadio EOF
            {
             newCompositeNode(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio2031);
            iv_ruleInputRadio=ruleInputRadio();

            state._fsp--;

             current =iv_ruleInputRadio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio2041); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:863:1: ruleInputRadio returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:866:28: ( ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:867:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:867:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:867:2: ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputRadio' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )? otherlv_13= 'reaccion' ( (lv_reaccion_14_0= ruleReaccion ) ) otherlv_15= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:867:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:868:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:868:1: (lv_visible_0_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:869:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputRadio2084); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:882:3: ( (lv_habilitado_1_0= 'habilitado' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:883:1: (lv_habilitado_1_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:883:1: (lv_habilitado_1_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:884:3: lv_habilitado_1_0= 'habilitado'
                    {
                    lv_habilitado_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputRadio2116); 

                            newLeafNode(lv_habilitado_1_0, grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputRadio2142); 

                	newLeafNode(otherlv_2, grammarAccess.getInputRadioAccess().getInputRadioKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:901:1: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:902:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:902:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:903:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2163);
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

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputRadio2175); 

                	newLeafNode(otherlv_4, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:923:1: (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:923:3: otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputRadio2188); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputRadioAccess().getValoresKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputRadio2200); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:931:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:932:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:932:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:933:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2221);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:949:2: (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==19) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:949:4: otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInputRadio2234); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInputRadioAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:953:1: ( (lv_valores_9_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:954:1: (lv_valores_9_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:954:1: (lv_valores_9_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:955:3: lv_valores_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2255);
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

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputRadio2269); 

                        	newLeafNode(otherlv_10, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:975:3: (otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:975:5: otherlv_11= 'seleccion' ( (lv_seleccion_12_0= ruleEInt ) )
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputRadio2284); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputRadioAccess().getSeleccionKeyword_6_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:979:1: ( (lv_seleccion_12_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:980:1: (lv_seleccion_12_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:980:1: (lv_seleccion_12_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:981:3: lv_seleccion_12_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputRadio2305);
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

            otherlv_13=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputRadio2319); 

                	newLeafNode(otherlv_13, grammarAccess.getInputRadioAccess().getReaccionKeyword_7());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1001:1: ( (lv_reaccion_14_0= ruleReaccion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1002:1: (lv_reaccion_14_0= ruleReaccion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1002:1: (lv_reaccion_14_0= ruleReaccion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1003:3: lv_reaccion_14_0= ruleReaccion
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getReaccionReaccionParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_ruleInputRadio2340);
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

            otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputRadio2352); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1031:1: entryRuleInputCombo returns [EObject current=null] : iv_ruleInputCombo= ruleInputCombo EOF ;
    public final EObject entryRuleInputCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCombo = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1032:2: (iv_ruleInputCombo= ruleInputCombo EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1033:2: iv_ruleInputCombo= ruleInputCombo EOF
            {
             newCompositeNode(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo2388);
            iv_ruleInputCombo=ruleInputCombo();

            state._fsp--;

             current =iv_ruleInputCombo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo2398); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1040:1: ruleInputCombo returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1043:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1044:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1044:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1044:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1044:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1045:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputComboAccess().getInputComboAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1050:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1051:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1051:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1052:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputCombo2450); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1065:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1066:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1066:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1067:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputCombo2482); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInputCombo2508); 

                	newLeafNode(otherlv_3, grammarAccess.getInputComboAccess().getInputComboKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1084:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1085:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1085:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1086:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2529);
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

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputCombo2541); 

                	newLeafNode(otherlv_5, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1106:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1106:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputCombo2554); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputComboAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputCombo2566); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1114:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1115:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1115:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1116:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2587);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1132:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==19) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1132:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInputCombo2600); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputComboAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1136:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1137:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1137:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1138:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2621);
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

                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCombo2635); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1158:3: (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1158:5: otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputCombo2650); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1162:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1163:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1163:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1164:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCombo2671);
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

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCombo2685); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1192:1: entryRuleInputCheck returns [EObject current=null] : iv_ruleInputCheck= ruleInputCheck EOF ;
    public final EObject entryRuleInputCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCheck = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1193:2: (iv_ruleInputCheck= ruleInputCheck EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1194:2: iv_ruleInputCheck= ruleInputCheck EOF
            {
             newCompositeNode(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck2721);
            iv_ruleInputCheck=ruleInputCheck();

            state._fsp--;

             current =iv_ruleInputCheck; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck2731); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1201:1: ruleInputCheck returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1204:28: ( ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1205:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1205:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1205:2: ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'InputCheck' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )? (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )? otherlv_17= 'reaccion' ( (lv_reaccion_18_0= ruleReaccion ) ) otherlv_19= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1205:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1206:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1206:1: (lv_visible_0_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1207:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInputCheck2774); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1220:3: ( (lv_habilitado_1_0= 'habilitado' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1221:1: (lv_habilitado_1_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1221:1: (lv_habilitado_1_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1222:3: lv_habilitado_1_0= 'habilitado'
                    {
                    lv_habilitado_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputCheck2806); 

                            newLeafNode(lv_habilitado_1_0, grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInputCheck2832); 

                	newLeafNode(otherlv_2, grammarAccess.getInputCheckAccess().getInputCheckKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1239:1: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1240:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1240:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1241:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2853);
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

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputCheck2865); 

                	newLeafNode(otherlv_4, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1261:1: (otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1261:3: otherlv_5= 'valores' otherlv_6= '{' ( (lv_valores_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputCheck2878); 

                        	newLeafNode(otherlv_5, grammarAccess.getInputCheckAccess().getValoresKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputCheck2890); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1269:1: ( (lv_valores_7_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1270:1: (lv_valores_7_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1270:1: (lv_valores_7_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1271:3: lv_valores_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2911);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1287:2: (otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==19) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1287:4: otherlv_8= ',' ( (lv_valores_9_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInputCheck2924); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getInputCheckAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1291:1: ( (lv_valores_9_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1292:1: (lv_valores_9_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1292:1: (lv_valores_9_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1293:3: lv_valores_9_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck2945);
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

                    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCheck2959); 

                        	newLeafNode(otherlv_10, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1313:3: (otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1313:5: otherlv_11= 'seleccion' otherlv_12= '{' ( (lv_seleccion_13_0= ruleEInt ) ) (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputCheck2974); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputCheckAccess().getSeleccionKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInputCheck2986); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1321:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1322:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1322:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1323:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3007);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1339:2: (otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==19) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1339:4: otherlv_14= ',' ( (lv_seleccion_15_0= ruleEInt ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleInputCheck3020); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1343:1: ( (lv_seleccion_15_0= ruleEInt ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1344:1: (lv_seleccion_15_0= ruleEInt )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1344:1: (lv_seleccion_15_0= ruleEInt )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1345:3: lv_seleccion_15_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3041);
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

                    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCheck3055); 

                        	newLeafNode(otherlv_16, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCheck3069); 

                	newLeafNode(otherlv_17, grammarAccess.getInputCheckAccess().getReaccionKeyword_7());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1369:1: ( (lv_reaccion_18_0= ruleReaccion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1370:1: (lv_reaccion_18_0= ruleReaccion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1370:1: (lv_reaccion_18_0= ruleReaccion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1371:3: lv_reaccion_18_0= ruleReaccion
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getReaccionReaccionParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleReaccion_in_ruleInputCheck3090);
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

            otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInputCheck3102); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1399:1: entryRuleBotonValidar returns [EObject current=null] : iv_ruleBotonValidar= ruleBotonValidar EOF ;
    public final EObject entryRuleBotonValidar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonValidar = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1400:2: (iv_ruleBotonValidar= ruleBotonValidar EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1401:2: iv_ruleBotonValidar= ruleBotonValidar EOF
            {
             newCompositeNode(grammarAccess.getBotonValidarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar3138);
            iv_ruleBotonValidar=ruleBotonValidar();

            state._fsp--;

             current =iv_ruleBotonValidar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonValidar3148); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1408:1: ruleBotonValidar returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonValidar() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1411:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1412:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1412:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1412:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonValidar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1412:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1413:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonValidarAccess().getBotonValidarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1418:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1419:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1419:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1420:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonValidar3200); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonValidarAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonValidarRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1433:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1434:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1434:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1435:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonValidar3232); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonValidarAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonValidarRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleBotonValidar3258); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonValidarAccess().getBotonValidarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1452:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1453:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1453:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1454:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonValidarAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonValidar3279);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1478:1: entryRuleBotonGuardar_Impl returns [EObject current=null] : iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF ;
    public final EObject entryRuleBotonGuardar_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonGuardar_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1479:2: (iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1480:2: iv_ruleBotonGuardar_Impl= ruleBotonGuardar_Impl EOF
            {
             newCompositeNode(grammarAccess.getBotonGuardar_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl3315);
            iv_ruleBotonGuardar_Impl=ruleBotonGuardar_Impl();

            state._fsp--;

             current =iv_ruleBotonGuardar_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonGuardar_Impl3325); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1487:1: ruleBotonGuardar_Impl returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonGuardar_Impl() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1490:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1491:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1491:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1491:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonGuardar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1491:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1492:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1497:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==25) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1498:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1498:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1499:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonGuardar_Impl3377); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonGuardar_ImplAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonGuardar_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1512:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1513:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1513:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1514:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonGuardar_Impl3409); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonGuardar_ImplAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonGuardar_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleBotonGuardar_Impl3435); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonGuardar_ImplAccess().getBotonGuardarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1531:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1532:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1532:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1533:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonGuardar_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonGuardar_Impl3456);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1557:1: entryRuleBotonCancelar returns [EObject current=null] : iv_ruleBotonCancelar= ruleBotonCancelar EOF ;
    public final EObject entryRuleBotonCancelar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCancelar = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1558:2: (iv_ruleBotonCancelar= ruleBotonCancelar EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1559:2: iv_ruleBotonCancelar= ruleBotonCancelar EOF
            {
             newCompositeNode(grammarAccess.getBotonCancelarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar3492);
            iv_ruleBotonCancelar=ruleBotonCancelar();

            state._fsp--;

             current =iv_ruleBotonCancelar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCancelar3502); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1566:1: ruleBotonCancelar returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleBotonCancelar() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1569:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1570:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1570:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1570:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'BotonCancelar' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1570:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1571:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBotonCancelarAccess().getBotonCancelarAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1576:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1577:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1577:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1578:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonCancelar3554); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getBotonCancelarAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCancelarRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1591:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1592:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1592:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1593:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonCancelar3586); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getBotonCancelarAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCancelarRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleBotonCancelar3612); 

                	newLeafNode(otherlv_3, grammarAccess.getBotonCancelarAccess().getBotonCancelarKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1610:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1611:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1611:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1612:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCancelarAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCancelar3633);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1636:1: entryRuleBotonCustom returns [EObject current=null] : iv_ruleBotonCustom= ruleBotonCustom EOF ;
    public final EObject entryRuleBotonCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotonCustom = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1637:2: (iv_ruleBotonCustom= ruleBotonCustom EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1638:2: iv_ruleBotonCustom= ruleBotonCustom EOF
            {
             newCompositeNode(grammarAccess.getBotonCustomRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom3669);
            iv_ruleBotonCustom=ruleBotonCustom();

            state._fsp--;

             current =iv_ruleBotonCustom; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBotonCustom3679); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1645:1: ruleBotonCustom returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1648:28: ( ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1649:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1649:1: ( ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1649:2: ( (lv_visible_0_0= 'visible' ) )? ( (lv_habilitado_1_0= 'habilitado' ) )? otherlv_2= 'BotonCustom' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' otherlv_5= 'funcion' ( (lv_funcion_6_0= ruleEString ) ) otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1649:2: ( (lv_visible_0_0= 'visible' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1650:1: (lv_visible_0_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1650:1: (lv_visible_0_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1651:3: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleBotonCustom3722); 

                            newLeafNode(lv_visible_0_0, grammarAccess.getBotonCustomAccess().getVisibleVisibleKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCustomRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1664:3: ( (lv_habilitado_1_0= 'habilitado' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1665:1: (lv_habilitado_1_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1665:1: (lv_habilitado_1_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1666:3: lv_habilitado_1_0= 'habilitado'
                    {
                    lv_habilitado_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBotonCustom3754); 

                            newLeafNode(lv_habilitado_1_0, grammarAccess.getBotonCustomAccess().getHabilitadoHabilitadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBotonCustomRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleBotonCustom3780); 

                	newLeafNode(otherlv_2, grammarAccess.getBotonCustomAccess().getBotonCustomKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1683:1: ( (lv_name_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1684:1: (lv_name_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1684:1: (lv_name_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1685:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCustomAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCustom3801);
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

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBotonCustom3813); 

                	newLeafNode(otherlv_4, grammarAccess.getBotonCustomAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleBotonCustom3825); 

                	newLeafNode(otherlv_5, grammarAccess.getBotonCustomAccess().getFuncionKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1709:1: ( (lv_funcion_6_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1710:1: (lv_funcion_6_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1710:1: (lv_funcion_6_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1711:3: lv_funcion_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getBotonCustomAccess().getFuncionEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBotonCustom3846);
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

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleBotonCustom3858); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1739:1: entryRuleReaccionVisible returns [EObject current=null] : iv_ruleReaccionVisible= ruleReaccionVisible EOF ;
    public final EObject entryRuleReaccionVisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccionVisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1740:2: (iv_ruleReaccionVisible= ruleReaccionVisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1741:2: iv_ruleReaccionVisible= ruleReaccionVisible EOF
            {
             newCompositeNode(grammarAccess.getReaccionVisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible3894);
            iv_ruleReaccionVisible=ruleReaccionVisible();

            state._fsp--;

             current =iv_ruleReaccionVisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionVisible3904); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1748:1: ruleReaccionVisible returns [EObject current=null] : (otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1751:28: ( (otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1752:1: (otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1752:1: (otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1752:3: otherlv_0= 'ReaccionVisible' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleReaccionVisible3941); 

                	newLeafNode(otherlv_0, grammarAccess.getReaccionVisibleAccess().getReaccionVisibleKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReaccionVisible3953); 

                	newLeafNode(otherlv_1, grammarAccess.getReaccionVisibleAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleReaccionVisible3965); 

                	newLeafNode(otherlv_2, grammarAccess.getReaccionVisibleAccess().getActivacionKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1764:1: ( (lv_activacion_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1765:1: (lv_activacion_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1765:1: (lv_activacion_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1766:3: lv_activacion_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getReaccionVisibleAccess().getActivacionEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReaccionVisible3986);
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

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleReaccionVisible3998); 

                	newLeafNode(otherlv_4, grammarAccess.getReaccionVisibleAccess().getObjetivoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1786:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1787:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1787:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1788:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReaccionVisibleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReaccionVisibleAccess().getObjetivoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReaccionVisible4021);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleReaccionVisible4033); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1813:1: entryRuleReaccionHabilitado returns [EObject current=null] : iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF ;
    public final EObject entryRuleReaccionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaccionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1814:2: (iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1815:2: iv_ruleReaccionHabilitado= ruleReaccionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getReaccionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado4069);
            iv_ruleReaccionHabilitado=ruleReaccionHabilitado();

            state._fsp--;

             current =iv_ruleReaccionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReaccionHabilitado4079); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1822:1: ruleReaccionHabilitado returns [EObject current=null] : (otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1825:28: ( (otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1826:1: (otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1826:1: (otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1826:3: otherlv_0= 'ReaccionHabilitado' otherlv_1= '{' otherlv_2= 'activacion' ( (lv_activacion_3_0= ruleEInt ) ) otherlv_4= 'objetivo' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleReaccionHabilitado4116); 

                	newLeafNode(otherlv_0, grammarAccess.getReaccionHabilitadoAccess().getReaccionHabilitadoKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReaccionHabilitado4128); 

                	newLeafNode(otherlv_1, grammarAccess.getReaccionHabilitadoAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleReaccionHabilitado4140); 

                	newLeafNode(otherlv_2, grammarAccess.getReaccionHabilitadoAccess().getActivacionKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1838:1: ( (lv_activacion_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1839:1: (lv_activacion_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1839:1: (lv_activacion_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1840:3: lv_activacion_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getReaccionHabilitadoAccess().getActivacionEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReaccionHabilitado4161);
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

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleReaccionHabilitado4173); 

                	newLeafNode(otherlv_4, grammarAccess.getReaccionHabilitadoAccess().getObjetivoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1860:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1861:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1861:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1862:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReaccionHabilitadoRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReaccionHabilitadoAccess().getObjetivoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReaccionHabilitado4196);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleReaccionHabilitado4208); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1887:1: entryRuleAccionValor returns [EObject current=null] : iv_ruleAccionValor= ruleAccionValor EOF ;
    public final EObject entryRuleAccionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1888:2: (iv_ruleAccionValor= ruleAccionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1889:2: iv_ruleAccionValor= ruleAccionValor EOF
            {
             newCompositeNode(grammarAccess.getAccionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionValor_in_entryRuleAccionValor4244);
            iv_ruleAccionValor=ruleAccionValor();

            state._fsp--;

             current =iv_ruleAccionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionValor4254); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1896:1: ruleAccionValor returns [EObject current=null] : (otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1899:28: ( (otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1900:1: (otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1900:1: (otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1900:3: otherlv_0= 'AccionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAccionValor4291); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionValorAccess().getAccionValorKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccionValor4303); 

                	newLeafNode(otherlv_1, grammarAccess.getAccionValorAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAccionValor4315); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionValorAccess().getValorKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1912:1: ( (lv_valor_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1913:1: (lv_valor_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1913:1: (lv_valor_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1914:3: lv_valor_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getValorEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionValor4336);
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

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAccionValor4348); 

                	newLeafNode(otherlv_4, grammarAccess.getAccionValorAccess().getElementoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1934:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1935:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1935:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1936:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionValorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getElementoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionValor4371);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAccionValor4383); 

                	newLeafNode(otherlv_6, grammarAccess.getAccionValorAccess().getAsercionKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1953:1: ( (lv_asercion_7_0= ruleAsercion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1954:1: (lv_asercion_7_0= ruleAsercion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1954:1: (lv_asercion_7_0= ruleAsercion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1955:3: lv_asercion_7_0= ruleAsercion
            {
             
            	        newCompositeNode(grammarAccess.getAccionValorAccess().getAsercionAsercionParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionValor4404);
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

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAccionValor4416); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1983:1: entryRuleAccionSeleccion returns [EObject current=null] : iv_ruleAccionSeleccion= ruleAccionSeleccion EOF ;
    public final EObject entryRuleAccionSeleccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionSeleccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1984:2: (iv_ruleAccionSeleccion= ruleAccionSeleccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1985:2: iv_ruleAccionSeleccion= ruleAccionSeleccion EOF
            {
             newCompositeNode(grammarAccess.getAccionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion4452);
            iv_ruleAccionSeleccion=ruleAccionSeleccion();

            state._fsp--;

             current =iv_ruleAccionSeleccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionSeleccion4462); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1992:1: ruleAccionSeleccion returns [EObject current=null] : (otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1995:28: ( (otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1996:1: (otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1996:1: (otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1996:3: otherlv_0= 'AccionSeleccion' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= 'asercion' ( (lv_asercion_7_0= ruleAsercion ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAccionSeleccion4499); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionSeleccionAccess().getAccionSeleccionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccionSeleccion4511); 

                	newLeafNode(otherlv_1, grammarAccess.getAccionSeleccionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAccionSeleccion4523); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionSeleccionAccess().getValorKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2008:1: ( (lv_valor_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2009:1: (lv_valor_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2009:1: (lv_valor_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2010:3: lv_valor_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getValorEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAccionSeleccion4544);
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

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAccionSeleccion4556); 

                	newLeafNode(otherlv_4, grammarAccess.getAccionSeleccionAccess().getElementoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2030:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2031:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2031:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2032:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionSeleccionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getElementoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionSeleccion4579);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAccionSeleccion4591); 

                	newLeafNode(otherlv_6, grammarAccess.getAccionSeleccionAccess().getAsercionKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2049:1: ( (lv_asercion_7_0= ruleAsercion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2050:1: (lv_asercion_7_0= ruleAsercion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2050:1: (lv_asercion_7_0= ruleAsercion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2051:3: lv_asercion_7_0= ruleAsercion
            {
             
            	        newCompositeNode(grammarAccess.getAccionSeleccionAccess().getAsercionAsercionParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionSeleccion4612);
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

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAccionSeleccion4624); 

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


    // $ANTLR start "entryRuleAccionPulsacion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2079:1: entryRuleAccionPulsacion returns [EObject current=null] : iv_ruleAccionPulsacion= ruleAccionPulsacion EOF ;
    public final EObject entryRuleAccionPulsacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccionPulsacion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2080:2: (iv_ruleAccionPulsacion= ruleAccionPulsacion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2081:2: iv_ruleAccionPulsacion= ruleAccionPulsacion EOF
            {
             newCompositeNode(grammarAccess.getAccionPulsacionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccionPulsacion_in_entryRuleAccionPulsacion4660);
            iv_ruleAccionPulsacion=ruleAccionPulsacion();

            state._fsp--;

             current =iv_ruleAccionPulsacion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccionPulsacion4670); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2088:1: ruleAccionPulsacion returns [EObject current=null] : (otherlv_0= 'AccionPulsacion' otherlv_1= '{' otherlv_2= 'elemento' ( ( ruleEString ) ) otherlv_4= 'asercion' ( (lv_asercion_5_0= ruleAsercion ) ) otherlv_6= '}' ) ;
    public final EObject ruleAccionPulsacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_asercion_5_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2091:28: ( (otherlv_0= 'AccionPulsacion' otherlv_1= '{' otherlv_2= 'elemento' ( ( ruleEString ) ) otherlv_4= 'asercion' ( (lv_asercion_5_0= ruleAsercion ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2092:1: (otherlv_0= 'AccionPulsacion' otherlv_1= '{' otherlv_2= 'elemento' ( ( ruleEString ) ) otherlv_4= 'asercion' ( (lv_asercion_5_0= ruleAsercion ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2092:1: (otherlv_0= 'AccionPulsacion' otherlv_1= '{' otherlv_2= 'elemento' ( ( ruleEString ) ) otherlv_4= 'asercion' ( (lv_asercion_5_0= ruleAsercion ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2092:3: otherlv_0= 'AccionPulsacion' otherlv_1= '{' otherlv_2= 'elemento' ( ( ruleEString ) ) otherlv_4= 'asercion' ( (lv_asercion_5_0= ruleAsercion ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAccionPulsacion4707); 

                	newLeafNode(otherlv_0, grammarAccess.getAccionPulsacionAccess().getAccionPulsacionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAccionPulsacion4719); 

                	newLeafNode(otherlv_1, grammarAccess.getAccionPulsacionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAccionPulsacion4731); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionPulsacionAccess().getElementoKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2104:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2105:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2105:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2106:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAccionPulsacionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAccionPulsacionAccess().getElementoInputCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccionPulsacion4754);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleAccionPulsacion4766); 

                	newLeafNode(otherlv_4, grammarAccess.getAccionPulsacionAccess().getAsercionKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2123:1: ( (lv_asercion_5_0= ruleAsercion ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2124:1: (lv_asercion_5_0= ruleAsercion )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2124:1: (lv_asercion_5_0= ruleAsercion )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2125:3: lv_asercion_5_0= ruleAsercion
            {
             
            	        newCompositeNode(grammarAccess.getAccionPulsacionAccess().getAsercionAsercionParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccionPulsacion4787);
            lv_asercion_5_0=ruleAsercion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAccionPulsacionRule());
            	        }
                   		set(
                   			current, 
                   			"asercion",
                    		lv_asercion_5_0, 
                    		"Asercion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAccionPulsacion4799); 

                	newLeafNode(otherlv_6, grammarAccess.getAccionPulsacionAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2153:1: entryRuleAsercionInvisible returns [EObject current=null] : iv_ruleAsercionInvisible= ruleAsercionInvisible EOF ;
    public final EObject entryRuleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionInvisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2154:2: (iv_ruleAsercionInvisible= ruleAsercionInvisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2155:2: iv_ruleAsercionInvisible= ruleAsercionInvisible EOF
            {
             newCompositeNode(grammarAccess.getAsercionInvisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible4835);
            iv_ruleAsercionInvisible=ruleAsercionInvisible();

            state._fsp--;

             current =iv_ruleAsercionInvisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionInvisible4845); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2162:1: ruleAsercionInvisible returns [EObject current=null] : ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        Token lv_estado_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2165:28: ( ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2166:1: ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2166:1: ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2166:2: ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionInvisible' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2166:2: ( (lv_estado_0_0= 'estado' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2167:1: (lv_estado_0_0= 'estado' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2167:1: (lv_estado_0_0= 'estado' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2168:3: lv_estado_0_0= 'estado'
            {
            lv_estado_0_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAsercionInvisible4888); 

                    newLeafNode(lv_estado_0_0, grammarAccess.getAsercionInvisibleAccess().getEstadoEstadoKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
            	        }
                   		setWithLastConsumed(current, "estado", true, "estado");
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleAsercionInvisible4913); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAsercionInvisible4925); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionInvisibleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionInvisible4937); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionInvisibleAccess().getElementoKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2193:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2194:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2194:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2195:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionInvisibleAccess().getElementoInputCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionInvisible4960);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAsercionInvisible4972); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2220:1: entryRuleAsercionHabilitado returns [EObject current=null] : iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF ;
    public final EObject entryRuleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2221:2: (iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2222:2: iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getAsercionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado5008);
            iv_ruleAsercionHabilitado=ruleAsercionHabilitado();

            state._fsp--;

             current =iv_ruleAsercionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionHabilitado5018); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2229:1: ruleAsercionHabilitado returns [EObject current=null] : ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        Token lv_estado_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2232:28: ( ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2233:1: ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2233:1: ( ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2233:2: ( (lv_estado_0_0= 'estado' ) ) otherlv_1= 'AsercionHabilitado' otherlv_2= '{' otherlv_3= 'elemento' ( ( ruleEString ) ) otherlv_5= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2233:2: ( (lv_estado_0_0= 'estado' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2234:1: (lv_estado_0_0= 'estado' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2234:1: (lv_estado_0_0= 'estado' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2235:3: lv_estado_0_0= 'estado'
            {
            lv_estado_0_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAsercionHabilitado5061); 

                    newLeafNode(lv_estado_0_0, grammarAccess.getAsercionHabilitadoAccess().getEstadoEstadoKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
            	        }
                   		setWithLastConsumed(current, "estado", true, "estado");
            	    

            }


            }

            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAsercionHabilitado5086); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionHabilitadoAccess().getAsercionHabilitadoKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAsercionHabilitado5098); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionHabilitadoAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionHabilitado5110); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionHabilitadoAccess().getElementoKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2260:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2261:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2261:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2262:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionHabilitadoAccess().getElementoInputCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionHabilitado5133);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAsercionHabilitado5145); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2287:1: entryRuleAsercionValor returns [EObject current=null] : iv_ruleAsercionValor= ruleAsercionValor EOF ;
    public final EObject entryRuleAsercionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2288:2: (iv_ruleAsercionValor= ruleAsercionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2289:2: iv_ruleAsercionValor= ruleAsercionValor EOF
            {
             newCompositeNode(grammarAccess.getAsercionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor5181);
            iv_ruleAsercionValor=ruleAsercionValor();

            state._fsp--;

             current =iv_ruleAsercionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionValor5191); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2296:1: ruleAsercionValor returns [EObject current=null] : (otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2299:28: ( (otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2300:1: (otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2300:1: (otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2300:3: otherlv_0= 'AsercionValor' otherlv_1= '{' otherlv_2= 'valor' ( (lv_valor_3_0= ruleEString ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAsercionValor5228); 

                	newLeafNode(otherlv_0, grammarAccess.getAsercionValorAccess().getAsercionValorKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAsercionValor5240); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionValorAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAsercionValor5252); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionValorAccess().getValorKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2312:1: ( (lv_valor_3_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2313:1: (lv_valor_3_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2313:1: (lv_valor_3_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2314:3: lv_valor_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAsercionValorAccess().getValorEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor5273);
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

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionValor5285); 

                	newLeafNode(otherlv_4, grammarAccess.getAsercionValorAccess().getElementoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2334:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2335:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2335:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2336:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionValorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionValorAccess().getElementoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor5308);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAsercionValor5320); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2361:1: entryRuleAsercionSeleccion returns [EObject current=null] : iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF ;
    public final EObject entryRuleAsercionSeleccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionSeleccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2362:2: (iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2363:2: iv_ruleAsercionSeleccion= ruleAsercionSeleccion EOF
            {
             newCompositeNode(grammarAccess.getAsercionSeleccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion5356);
            iv_ruleAsercionSeleccion=ruleAsercionSeleccion();

            state._fsp--;

             current =iv_ruleAsercionSeleccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionSeleccion5366); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2370:1: ruleAsercionSeleccion returns [EObject current=null] : (otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2373:28: ( (otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2374:1: (otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2374:1: (otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2374:3: otherlv_0= 'AsercionSeleccion' otherlv_1= '{' otherlv_2= 'estado' ( (lv_estado_3_0= ruleEInt ) ) otherlv_4= 'elemento' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAsercionSeleccion5403); 

                	newLeafNode(otherlv_0, grammarAccess.getAsercionSeleccionAccess().getAsercionSeleccionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAsercionSeleccion5415); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionSeleccionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAsercionSeleccion5427); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionSeleccionAccess().getEstadoKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2386:1: ( (lv_estado_3_0= ruleEInt ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2387:1: (lv_estado_3_0= ruleEInt )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2387:1: (lv_estado_3_0= ruleEInt )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2388:3: lv_estado_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getAsercionSeleccionAccess().getEstadoEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAsercionSeleccion5448);
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

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAsercionSeleccion5460); 

                	newLeafNode(otherlv_4, grammarAccess.getAsercionSeleccionAccess().getElementoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2408:1: ( ( ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2409:1: ( ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2409:1: ( ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:2410:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAsercionSeleccionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAsercionSeleccionAccess().getElementoInputCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionSeleccion5483);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAsercionSeleccion5495); 

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\13\uffff";
    static final String DFA2_eofS =
        "\13\uffff";
    static final String DFA2_minS =
        "\1\31\1\32\1\33\10\uffff";
    static final String DFA2_maxS =
        "\3\47\10\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA2_specialS =
        "\13\uffff}>";
    static final String[] DFA2_transitionS = {
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "175:1: (this_InputTexto_0= ruleInputTexto | this_InputRadio_1= ruleInputRadio | this_InputCombo_2= ruleInputCombo | this_InputCheck_3= ruleInputCheck | this_BotonValidar_4= ruleBotonValidar | this_BotonGuardar_Impl_5= ruleBotonGuardar_Impl | this_BotonCancelar_6= ruleBotonCancelar | this_BotonCustom_7= ruleBotonCustom )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormulario_in_entryRuleFormulario75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormulario85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleFormulario122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFormulario143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFormulario155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFormulario167 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleFormulario188 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleFormulario201 = new BitSet(new long[]{0x0000000000700000L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_ruleFormulario222 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFormulario236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInput_in_entryRuleInput272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInput282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_ruleInput329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_ruleInput356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_ruleInput383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_ruleInput410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_ruleInput437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_ruleInput464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_ruleInput491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_ruleInput518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion553 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccion563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_ruleAccion610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_ruleAccion637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionPulsacion_in_ruleAccion664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccion_in_entryRuleReaccion699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccion709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_ruleReaccion756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_ruleReaccion783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercion_in_entryRuleAsercion818 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercion828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_ruleAsercion875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_ruleAsercion902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_ruleAsercion929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_ruleAsercion956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout991 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout1001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleLayout1038 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayout1050 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLayout1062 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout1083 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleLayout1096 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayout1108 = new BitSet(new long[]{0x000000FC5E000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout1129 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleLayout1142 = new BitSet(new long[]{0x000000FC5E000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout1163 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_ruleLayout1177 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLayout1191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rulePruebaInterfaz1412 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_rulePruebaInterfaz1444 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_rulePruebaInterfaz1470 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1491 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePruebaInterfaz1503 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_rulePruebaInterfaz1516 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePruebaInterfaz1528 = new BitSet(new long[]{0x0003200000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1549 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_rulePruebaInterfaz1562 = new BitSet(new long[]{0x0003200000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1583 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_rulePruebaInterfaz1597 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePruebaInterfaz1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleEInt1698 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto1762 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto1772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInputTexto1824 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_26_in_ruleInputTexto1856 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_27_in_ruleInputTexto1888 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleInputTexto1914 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1935 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputTexto1947 = new BitSet(new long[]{0x0000000020008000L});
        public static final BitSet FOLLOW_29_in_ruleInputTexto1960 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1981 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputTexto1995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio2031 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInputRadio2084 = new BitSet(new long[]{0x0000000044000000L});
        public static final BitSet FOLLOW_26_in_ruleInputRadio2116 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleInputRadio2142 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2163 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputRadio2175 = new BitSet(new long[]{0x0000000380000000L});
        public static final BitSet FOLLOW_31_in_ruleInputRadio2188 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputRadio2200 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2221 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleInputRadio2234 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2255 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_ruleInputRadio2269 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleInputRadio2284 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputRadio2305 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleInputRadio2319 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_ruleReaccion_in_ruleInputRadio2340 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputRadio2352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo2388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo2398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInputCombo2450 = new BitSet(new long[]{0x0000000404000000L});
        public static final BitSet FOLLOW_26_in_ruleInputCombo2482 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInputCombo2508 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2529 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputCombo2541 = new BitSet(new long[]{0x0000000180008000L});
        public static final BitSet FOLLOW_31_in_ruleInputCombo2554 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputCombo2566 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2587 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleInputCombo2600 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2621 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_ruleInputCombo2635 = new BitSet(new long[]{0x0000000100008000L});
        public static final BitSet FOLLOW_32_in_ruleInputCombo2650 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCombo2671 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputCombo2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck2721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleInputCheck2774 = new BitSet(new long[]{0x0000000804000000L});
        public static final BitSet FOLLOW_26_in_ruleInputCheck2806 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleInputCheck2832 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2853 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputCheck2865 = new BitSet(new long[]{0x0000000380000000L});
        public static final BitSet FOLLOW_31_in_ruleInputCheck2878 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputCheck2890 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2911 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleInputCheck2924 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck2945 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_ruleInputCheck2959 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_32_in_ruleInputCheck2974 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInputCheck2986 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3007 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleInputCheck3020 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3041 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_15_in_ruleInputCheck3055 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleInputCheck3069 = new BitSet(new long[]{0x0000120000000000L});
        public static final BitSet FOLLOW_ruleReaccion_in_ruleInputCheck3090 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleInputCheck3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonValidar_in_entryRuleBotonValidar3138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonValidar3148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBotonValidar3200 = new BitSet(new long[]{0x0000001004000000L});
        public static final BitSet FOLLOW_26_in_ruleBotonValidar3232 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleBotonValidar3258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonValidar3279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonGuardar_Impl_in_entryRuleBotonGuardar_Impl3315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonGuardar_Impl3325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBotonGuardar_Impl3377 = new BitSet(new long[]{0x0000002004000000L});
        public static final BitSet FOLLOW_26_in_ruleBotonGuardar_Impl3409 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleBotonGuardar_Impl3435 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonGuardar_Impl3456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCancelar_in_entryRuleBotonCancelar3492 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCancelar3502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBotonCancelar3554 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_26_in_ruleBotonCancelar3586 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleBotonCancelar3612 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCancelar3633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBotonCustom_in_entryRuleBotonCustom3669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBotonCustom3679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleBotonCustom3722 = new BitSet(new long[]{0x0000008004000000L});
        public static final BitSet FOLLOW_26_in_ruleBotonCustom3754 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleBotonCustom3780 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCustom3801 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBotonCustom3813 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleBotonCustom3825 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBotonCustom3846 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleBotonCustom3858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionVisible_in_entryRuleReaccionVisible3894 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionVisible3904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleReaccionVisible3941 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReaccionVisible3953 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleReaccionVisible3965 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReaccionVisible3986 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleReaccionVisible3998 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReaccionVisible4021 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleReaccionVisible4033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReaccionHabilitado_in_entryRuleReaccionHabilitado4069 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReaccionHabilitado4079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleReaccionHabilitado4116 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReaccionHabilitado4128 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleReaccionHabilitado4140 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReaccionHabilitado4161 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleReaccionHabilitado4173 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReaccionHabilitado4196 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleReaccionHabilitado4208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionValor_in_entryRuleAccionValor4244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionValor4254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleAccionValor4291 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAccionValor4303 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAccionValor4315 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionValor4336 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAccionValor4348 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionValor4371 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleAccionValor4383 = new BitSet(new long[]{0x0064000000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionValor4404 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAccionValor4416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionSeleccion_in_entryRuleAccionSeleccion4452 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionSeleccion4462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAccionSeleccion4499 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAccionSeleccion4511 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAccionSeleccion4523 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAccionSeleccion4544 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAccionSeleccion4556 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionSeleccion4579 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleAccionSeleccion4591 = new BitSet(new long[]{0x0064000000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionSeleccion4612 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAccionSeleccion4624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccionPulsacion_in_entryRuleAccionPulsacion4660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccionPulsacion4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleAccionPulsacion4707 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAccionPulsacion4719 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAccionPulsacion4731 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccionPulsacion4754 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_47_in_ruleAccionPulsacion4766 = new BitSet(new long[]{0x0064000000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccionPulsacion4787 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAccionPulsacion4799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible4835 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionInvisible4845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAsercionInvisible4888 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleAsercionInvisible4913 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAsercionInvisible4925 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionInvisible4937 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionInvisible4960 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAsercionInvisible4972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado5008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionHabilitado5018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleAsercionHabilitado5061 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleAsercionHabilitado5086 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAsercionHabilitado5098 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionHabilitado5110 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionHabilitado5133 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAsercionHabilitado5145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor5181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionValor5191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleAsercionValor5228 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAsercionValor5240 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAsercionValor5252 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor5273 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionValor5285 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor5308 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAsercionValor5320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccion_in_entryRuleAsercionSeleccion5356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionSeleccion5366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAsercionSeleccion5403 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAsercionSeleccion5415 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleAsercionSeleccion5427 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAsercionSeleccion5448 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAsercionSeleccion5460 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionSeleccion5483 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAsercionSeleccion5495 = new BitSet(new long[]{0x0000000000000002L});
    }


}