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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'comprobarAsercion'", "'comprobarAccion'", "'Formulario'", "'{'", "'layout'", "'pruebas'", "'}'", "'Layout'", "'anchura'", "'altura'", "'entradas'", "','", "'PruebaInterfaz'", "'acciones'", "'-'", "'visible'", "'habilitado'", "'obligatorio'", "'InputTexto'", "'valor'", "'InputBoton'", "'InputMultiple'", "'valores'", "'InputRadio'", "'seleccion'", "'InputCombo'", "'InputCheck'", "'Accion'", "'elemento'", "'asercion'", "'estado'", "'AsercionInvisible'", "'AsercionHabilitado'", "'AsercionValor'", "'AsercionSeleccionado'"
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
    public static final int T__44=44;
    public static final int T__45=45;
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:201:1: ruleInput returns [EObject current=null] : (this_InputTexto_0= ruleInputTexto | this_InputBoton_1= ruleInputBoton | this_InputMultiple_Impl_2= ruleInputMultiple_Impl | this_InputRadio_3= ruleInputRadio | this_InputCombo_4= ruleInputCombo | this_InputCheck_5= ruleInputCheck ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        EObject this_InputTexto_0 = null;

        EObject this_InputBoton_1 = null;

        EObject this_InputMultiple_Impl_2 = null;

        EObject this_InputRadio_3 = null;

        EObject this_InputCombo_4 = null;

        EObject this_InputCheck_5 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:204:28: ( (this_InputTexto_0= ruleInputTexto | this_InputBoton_1= ruleInputBoton | this_InputMultiple_Impl_2= ruleInputMultiple_Impl | this_InputRadio_3= ruleInputRadio | this_InputCombo_4= ruleInputCombo | this_InputCheck_5= ruleInputCheck ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:205:1: (this_InputTexto_0= ruleInputTexto | this_InputBoton_1= ruleInputBoton | this_InputMultiple_Impl_2= ruleInputMultiple_Impl | this_InputRadio_3= ruleInputRadio | this_InputCombo_4= ruleInputCombo | this_InputCheck_5= ruleInputCheck )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:205:1: (this_InputTexto_0= ruleInputTexto | this_InputBoton_1= ruleInputBoton | this_InputMultiple_Impl_2= ruleInputMultiple_Impl | this_InputRadio_3= ruleInputRadio | this_InputCombo_4= ruleInputCombo | this_InputCheck_5= ruleInputCheck )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    switch ( input.LA(3) ) {
                    case 34:
                        {
                        alt4=4;
                        }
                        break;
                    case 37:
                        {
                        alt4=6;
                        }
                        break;
                    case 31:
                        {
                        alt4=2;
                        }
                        break;
                    case 28:
                    case 29:
                        {
                        alt4=1;
                        }
                        break;
                    case 32:
                        {
                        alt4=3;
                        }
                        break;
                    case 36:
                        {
                        alt4=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 28:
                case 29:
                    {
                    alt4=1;
                    }
                    break;
                case 32:
                    {
                    alt4=3;
                    }
                    break;
                case 36:
                    {
                    alt4=5;
                    }
                    break;
                case 34:
                    {
                    alt4=4;
                    }
                    break;
                case 37:
                    {
                    alt4=6;
                    }
                    break;
                case 31:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            case 27:
                {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt4=4;
                    }
                    break;
                case 37:
                    {
                    alt4=6;
                    }
                    break;
                case 31:
                    {
                    alt4=2;
                    }
                    break;
                case 28:
                case 29:
                    {
                    alt4=1;
                    }
                    break;
                case 32:
                    {
                    alt4=3;
                    }
                    break;
                case 36:
                    {
                    alt4=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

                }
                break;
            case 28:
            case 29:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 32:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 37:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

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
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:216:5: this_InputBoton_1= ruleInputBoton
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputBotonParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_ruleInput420);
                    this_InputBoton_1=ruleInputBoton();

                    state._fsp--;

                     
                            current = this_InputBoton_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:226:5: this_InputMultiple_Impl_2= ruleInputMultiple_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputMultiple_ImplParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_ruleInput447);
                    this_InputMultiple_Impl_2=ruleInputMultiple_Impl();

                    state._fsp--;

                     
                            current = this_InputMultiple_Impl_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:236:5: this_InputRadio_3= ruleInputRadio
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputRadioParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_ruleInput474);
                    this_InputRadio_3=ruleInputRadio();

                    state._fsp--;

                     
                            current = this_InputRadio_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:246:5: this_InputCombo_4= ruleInputCombo
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputComboParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_ruleInput501);
                    this_InputCombo_4=ruleInputCombo();

                    state._fsp--;

                     
                            current = this_InputCombo_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:256:5: this_InputCheck_5= ruleInputCheck
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputCheckParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_ruleInput528);
                    this_InputCheck_5=ruleInputCheck();

                    state._fsp--;

                     
                            current = this_InputCheck_5; 
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


    // $ANTLR start "entryRuleAsercion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:272:1: entryRuleAsercion returns [EObject current=null] : iv_ruleAsercion= ruleAsercion EOF ;
    public final EObject entryRuleAsercion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:273:2: (iv_ruleAsercion= ruleAsercion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:274:2: iv_ruleAsercion= ruleAsercion EOF
            {
             newCompositeNode(grammarAccess.getAsercionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_entryRuleAsercion563);
            iv_ruleAsercion=ruleAsercion();

            state._fsp--;

             current =iv_ruleAsercion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercion573); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:281:1: ruleAsercion returns [EObject current=null] : (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccionado_3= ruleAsercionSeleccionado ) ;
    public final EObject ruleAsercion() throws RecognitionException {
        EObject current = null;

        EObject this_AsercionInvisible_0 = null;

        EObject this_AsercionHabilitado_1 = null;

        EObject this_AsercionValor_2 = null;

        EObject this_AsercionSeleccionado_3 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:284:28: ( (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccionado_3= ruleAsercionSeleccionado ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:285:1: (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccionado_3= ruleAsercionSeleccionado )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:285:1: (this_AsercionInvisible_0= ruleAsercionInvisible | this_AsercionHabilitado_1= ruleAsercionHabilitado | this_AsercionValor_2= ruleAsercionValor | this_AsercionSeleccionado_3= ruleAsercionSeleccionado )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt5=2;
                    }
                    break;
                case 42:
                    {
                    alt5=1;
                    }
                    break;
                case 45:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
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
            case 45:
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
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:286:5: this_AsercionInvisible_0= ruleAsercionInvisible
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionInvisibleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_ruleAsercion620);
                    this_AsercionInvisible_0=ruleAsercionInvisible();

                    state._fsp--;

                     
                            current = this_AsercionInvisible_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:296:5: this_AsercionHabilitado_1= ruleAsercionHabilitado
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionHabilitadoParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_ruleAsercion647);
                    this_AsercionHabilitado_1=ruleAsercionHabilitado();

                    state._fsp--;

                     
                            current = this_AsercionHabilitado_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:306:5: this_AsercionValor_2= ruleAsercionValor
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionValorParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_ruleAsercion674);
                    this_AsercionValor_2=ruleAsercionValor();

                    state._fsp--;

                     
                            current = this_AsercionValor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:316:5: this_AsercionSeleccionado_3= ruleAsercionSeleccionado
                    {
                     
                            newCompositeNode(grammarAccess.getAsercionAccess().getAsercionSeleccionadoParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccionado_in_ruleAsercion701);
                    this_AsercionSeleccionado_3=ruleAsercionSeleccionado();

                    state._fsp--;

                     
                            current = this_AsercionSeleccionado_3; 
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:332:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:333:2: (iv_ruleLayout= ruleLayout EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:334:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout736);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout746); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:341:1: ruleLayout returns [EObject current=null] : ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:344:28: ( ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:345:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:345:1: ( () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:345:2: () otherlv_1= 'Layout' otherlv_2= '{' (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )? (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )? (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:345:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:346:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLayoutAccess().getLayoutAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLayout792); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLayoutKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout804); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:359:1: (otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:359:3: otherlv_3= 'anchura' ( (lv_anchura_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLayout817); 

                        	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getAnchuraKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:363:1: ( (lv_anchura_4_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:364:1: (lv_anchura_4_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:364:1: (lv_anchura_4_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:365:3: lv_anchura_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getAnchuraEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout838);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:381:4: (otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:381:6: otherlv_5= 'altura' ( (lv_altura_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLayout853); 

                        	newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getAlturaKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:385:1: ( (lv_altura_6_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:386:1: (lv_altura_6_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:386:1: (lv_altura_6_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:387:3: lv_altura_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getAlturaEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLayout874);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:403:4: (otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:403:6: otherlv_7= 'entradas' otherlv_8= '{' ( (lv_entradas_9_0= ruleInput ) ) (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleLayout889); 

                        	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getEntradasKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLayout901); 

                        	newLeafNode(otherlv_8, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:411:1: ( (lv_entradas_9_0= ruleInput ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:412:1: (lv_entradas_9_0= ruleInput )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:412:1: (lv_entradas_9_0= ruleInput )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:413:3: lv_entradas_9_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout922);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:429:2: (otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:429:4: otherlv_10= ',' ( (lv_entradas_11_0= ruleInput ) )
                    	    {
                    	    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLayout935); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getLayoutAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:433:1: ( (lv_entradas_11_0= ruleInput ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:434:1: (lv_entradas_11_0= ruleInput )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:434:1: (lv_entradas_11_0= ruleInput )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:435:3: lv_entradas_11_0= ruleInput
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLayoutAccess().getEntradasInputParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInput_in_ruleLayout956);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout970); 

                        	newLeafNode(otherlv_12, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLayout984); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:467:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:468:2: (iv_ruleEString= ruleEString EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:469:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1021);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1032); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:476:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:479:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:480:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:480:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:480:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1072); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:488:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1098); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:505:1: entryRulePruebaInterfaz returns [EObject current=null] : iv_rulePruebaInterfaz= rulePruebaInterfaz EOF ;
    public final EObject entryRulePruebaInterfaz() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePruebaInterfaz = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:506:2: (iv_rulePruebaInterfaz= rulePruebaInterfaz EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:507:2: iv_rulePruebaInterfaz= rulePruebaInterfaz EOF
            {
             newCompositeNode(grammarAccess.getPruebaInterfazRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1145);
            iv_rulePruebaInterfaz=rulePruebaInterfaz();

            state._fsp--;

             current =iv_rulePruebaInterfaz; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePruebaInterfaz1155); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:514:1: rulePruebaInterfaz returns [EObject current=null] : ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:517:28: ( ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:518:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:518:1: ( () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:518:2: () otherlv_1= 'PruebaInterfaz' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:518:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:519:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPruebaInterfazAccess().getPruebaInterfazAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePruebaInterfaz1201); 

                	newLeafNode(otherlv_1, grammarAccess.getPruebaInterfazAccess().getPruebaInterfazKeyword_1());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:528:1: ( (lv_name_2_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:529:1: (lv_name_2_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:529:1: (lv_name_2_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:530:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePruebaInterfaz1222);
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

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePruebaInterfaz1234); 

                	newLeafNode(otherlv_3, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:550:1: (otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:550:3: otherlv_4= 'acciones' otherlv_5= '{' ( (lv_acciones_6_0= ruleAccion ) ) (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePruebaInterfaz1247); 

                        	newLeafNode(otherlv_4, grammarAccess.getPruebaInterfazAccess().getAccionesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePruebaInterfaz1259); 

                        	newLeafNode(otherlv_5, grammarAccess.getPruebaInterfazAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:558:1: ( (lv_acciones_6_0= ruleAccion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:559:1: (lv_acciones_6_0= ruleAccion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:559:1: (lv_acciones_6_0= ruleAccion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:560:3: lv_acciones_6_0= ruleAccion
                    {
                     
                    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1280);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:576:2: (otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==22) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:576:4: otherlv_7= ',' ( (lv_acciones_8_0= ruleAccion ) )
                    	    {
                    	    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePruebaInterfaz1293); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getPruebaInterfazAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:580:1: ( (lv_acciones_8_0= ruleAccion ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:581:1: (lv_acciones_8_0= ruleAccion )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:581:1: (lv_acciones_8_0= ruleAccion )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:582:3: lv_acciones_8_0= ruleAccion
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPruebaInterfazAccess().getAccionesAccionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAccion_in_rulePruebaInterfaz1314);
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

                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePruebaInterfaz1328); 

                        	newLeafNode(otherlv_9, grammarAccess.getPruebaInterfazAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePruebaInterfaz1342); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:614:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:615:2: (iv_ruleEInt= ruleEInt EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:616:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1379);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1390); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:623:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:626:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:627:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:627:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:627:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:627:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:628:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEInt1429); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1446); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:648:1: entryRuleInputTexto returns [EObject current=null] : iv_ruleInputTexto= ruleInputTexto EOF ;
    public final EObject entryRuleInputTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputTexto = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:649:2: (iv_ruleInputTexto= ruleInputTexto EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:650:2: iv_ruleInputTexto= ruleInputTexto EOF
            {
             newCompositeNode(grammarAccess.getInputTextoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputTexto_in_entryRuleInputTexto1491);
            iv_ruleInputTexto=ruleInputTexto();

            state._fsp--;

             current =iv_ruleInputTexto; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputTexto1501); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:657:1: ruleInputTexto returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:660:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:661:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:661:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:661:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? ( (lv_obligatorio_3_0= 'obligatorio' ) )? otherlv_4= 'InputTexto' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:661:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:662:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputTextoAccess().getInputTextoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:667:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:668:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:668:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:669:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputTexto1553); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputTextoAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:682:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:683:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:683:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:684:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputTexto1585); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputTextoAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:697:3: ( (lv_obligatorio_3_0= 'obligatorio' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:698:1: (lv_obligatorio_3_0= 'obligatorio' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:698:1: (lv_obligatorio_3_0= 'obligatorio' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:699:3: lv_obligatorio_3_0= 'obligatorio'
                    {
                    lv_obligatorio_3_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputTexto1617); 

                            newLeafNode(lv_obligatorio_3_0, grammarAccess.getInputTextoAccess().getObligatorioObligatorioKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputTextoRule());
                    	        }
                           		setWithLastConsumed(current, "obligatorio", true, "obligatorio");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleInputTexto1643); 

                	newLeafNode(otherlv_4, grammarAccess.getInputTextoAccess().getInputTextoKeyword_4());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:716:1: ( (lv_name_5_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:717:1: (lv_name_5_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:717:1: (lv_name_5_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:718:3: lv_name_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputTextoAccess().getNameEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1664);
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

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputTexto1676); 

                	newLeafNode(otherlv_6, grammarAccess.getInputTextoAccess().getLeftCurlyBracketKeyword_6());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:738:1: (otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:738:3: otherlv_7= 'valor' ( (lv_valor_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputTexto1689); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputTextoAccess().getValorKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:742:1: ( (lv_valor_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:743:1: (lv_valor_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:743:1: (lv_valor_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:744:3: lv_valor_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputTextoAccess().getValorEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputTexto1710);
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

            otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputTexto1724); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:772:1: entryRuleInputBoton returns [EObject current=null] : iv_ruleInputBoton= ruleInputBoton EOF ;
    public final EObject entryRuleInputBoton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputBoton = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:773:2: (iv_ruleInputBoton= ruleInputBoton EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:774:2: iv_ruleInputBoton= ruleInputBoton EOF
            {
             newCompositeNode(grammarAccess.getInputBotonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputBoton_in_entryRuleInputBoton1760);
            iv_ruleInputBoton=ruleInputBoton();

            state._fsp--;

             current =iv_ruleInputBoton; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputBoton1770); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:781:1: ruleInputBoton returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) ) ;
    public final EObject ruleInputBoton() throws RecognitionException {
        EObject current = null;

        Token lv_visible_1_0=null;
        Token lv_habilitado_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:784:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:785:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:785:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:785:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputBoton' ( (lv_name_4_0= ruleEString ) )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:785:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:786:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputBotonAccess().getInputBotonAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:791:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:792:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:792:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:793:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputBoton1822); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputBotonAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputBotonRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:806:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:807:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:807:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:808:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputBoton1854); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputBotonAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputBotonRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleInputBoton1880); 

                	newLeafNode(otherlv_3, grammarAccess.getInputBotonAccess().getInputBotonKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:825:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:826:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:826:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:827:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputBotonAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputBoton1901);
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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:851:1: entryRuleInputMultiple_Impl returns [EObject current=null] : iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF ;
    public final EObject entryRuleInputMultiple_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputMultiple_Impl = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:852:2: (iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:853:2: iv_ruleInputMultiple_Impl= ruleInputMultiple_Impl EOF
            {
             newCompositeNode(grammarAccess.getInputMultiple_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputMultiple_Impl_in_entryRuleInputMultiple_Impl1937);
            iv_ruleInputMultiple_Impl=ruleInputMultiple_Impl();

            state._fsp--;

             current =iv_ruleInputMultiple_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputMultiple_Impl1947); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:860:1: ruleInputMultiple_Impl returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:863:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:864:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:864:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:864:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputMultiple' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:864:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:865:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputMultiple_ImplAccess().getInputMultipleAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:870:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:871:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:871:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:872:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputMultiple_Impl1999); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputMultiple_ImplAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputMultiple_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:885:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:886:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:886:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:887:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputMultiple_Impl2031); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputMultiple_ImplAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputMultiple_ImplRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInputMultiple_Impl2057); 

                	newLeafNode(otherlv_3, grammarAccess.getInputMultiple_ImplAccess().getInputMultipleKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:904:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:905:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:905:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:906:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputMultiple_ImplAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputMultiple_Impl2078);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputMultiple_Impl2090); 

                	newLeafNode(otherlv_5, grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:926:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:926:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputMultiple_Impl2103); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputMultiple_ImplAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputMultiple_Impl2115); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputMultiple_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:934:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:935:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:935:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:936:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputMultiple_Impl2136);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:952:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==22) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:952:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputMultiple_Impl2149); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputMultiple_ImplAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:956:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:957:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:957:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:958:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputMultiple_ImplAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputMultiple_Impl2170);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputMultiple_Impl2184); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputMultiple_ImplAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputMultiple_Impl2198); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:990:1: entryRuleInputRadio returns [EObject current=null] : iv_ruleInputRadio= ruleInputRadio EOF ;
    public final EObject entryRuleInputRadio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputRadio = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:991:2: (iv_ruleInputRadio= ruleInputRadio EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:992:2: iv_ruleInputRadio= ruleInputRadio EOF
            {
             newCompositeNode(grammarAccess.getInputRadioRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputRadio_in_entryRuleInputRadio2234);
            iv_ruleInputRadio=ruleInputRadio();

            state._fsp--;

             current =iv_ruleInputRadio; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputRadio2244); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:999:1: ruleInputRadio returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1002:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1003:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1003:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1003:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputRadio' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1003:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1004:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputRadioAccess().getInputRadioAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1009:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1010:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1010:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1011:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputRadio2296); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputRadioAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1024:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1025:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1025:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1026:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputRadio2328); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputRadioAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRadioRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInputRadio2354); 

                	newLeafNode(otherlv_3, grammarAccess.getInputRadioAccess().getInputRadioKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1043:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1044:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1044:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1045:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputRadioAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2375);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2387); 

                	newLeafNode(otherlv_5, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1065:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1065:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputRadio2400); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputRadioAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputRadio2412); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputRadioAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1073:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1074:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1074:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1075:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2433);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1091:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==22) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1091:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputRadio2446); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputRadioAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1095:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1096:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1096:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1097:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputRadioAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputRadio2467);
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio2481); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputRadioAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1117:3: (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1117:5: otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInputRadio2496); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputRadioAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1121:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1122:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1122:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1123:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputRadioAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputRadio2517);
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

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputRadio2531); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1151:1: entryRuleInputCombo returns [EObject current=null] : iv_ruleInputCombo= ruleInputCombo EOF ;
    public final EObject entryRuleInputCombo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCombo = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1152:2: (iv_ruleInputCombo= ruleInputCombo EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1153:2: iv_ruleInputCombo= ruleInputCombo EOF
            {
             newCompositeNode(grammarAccess.getInputComboRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCombo_in_entryRuleInputCombo2567);
            iv_ruleInputCombo=ruleInputCombo();

            state._fsp--;

             current =iv_ruleInputCombo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCombo2577); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1160:1: ruleInputCombo returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1163:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1164:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1164:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1164:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCombo' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )? otherlv_14= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1164:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1165:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputComboAccess().getInputComboAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1170:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1171:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1171:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1172:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputCombo2629); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputComboAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1185:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1186:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1186:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1187:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputCombo2661); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputComboAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputComboRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInputCombo2687); 

                	newLeafNode(otherlv_3, grammarAccess.getInputComboAccess().getInputComboKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1204:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1205:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1205:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1206:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputComboAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2708);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2720); 

                	newLeafNode(otherlv_5, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1226:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1226:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCombo2733); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputComboAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCombo2745); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputComboAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1234:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1235:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1235:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1236:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2766);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1252:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==22) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1252:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCombo2779); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputComboAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1256:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1257:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1257:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1258:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputComboAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCombo2800);
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
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCombo2814); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputComboAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1278:3: (otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1278:5: otherlv_12= 'seleccion' ( (lv_seleccion_13_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInputCombo2829); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputComboAccess().getSeleccionKeyword_7_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1282:1: ( (lv_seleccion_13_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1283:1: (lv_seleccion_13_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1283:1: (lv_seleccion_13_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1284:3: lv_seleccion_13_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputComboAccess().getSeleccionEIntParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCombo2850);
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

            otherlv_14=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCombo2864); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1312:1: entryRuleInputCheck returns [EObject current=null] : iv_ruleInputCheck= ruleInputCheck EOF ;
    public final EObject entryRuleInputCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputCheck = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1313:2: (iv_ruleInputCheck= ruleInputCheck EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1314:2: iv_ruleInputCheck= ruleInputCheck EOF
            {
             newCompositeNode(grammarAccess.getInputCheckRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInputCheck_in_entryRuleInputCheck2900);
            iv_ruleInputCheck=ruleInputCheck();

            state._fsp--;

             current =iv_ruleInputCheck; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputCheck2910); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1321:1: ruleInputCheck returns [EObject current=null] : ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1324:28: ( ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1325:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1325:1: ( () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1325:2: () ( (lv_visible_1_0= 'visible' ) )? ( (lv_habilitado_2_0= 'habilitado' ) )? otherlv_3= 'InputCheck' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )? (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1325:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1326:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputCheckAccess().getInputCheckAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1331:2: ( (lv_visible_1_0= 'visible' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1332:1: (lv_visible_1_0= 'visible' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1332:1: (lv_visible_1_0= 'visible' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1333:3: lv_visible_1_0= 'visible'
                    {
                    lv_visible_1_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInputCheck2962); 

                            newLeafNode(lv_visible_1_0, grammarAccess.getInputCheckAccess().getVisibleVisibleKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "visible", true, "visible");
                    	    

                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1346:3: ( (lv_habilitado_2_0= 'habilitado' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1347:1: (lv_habilitado_2_0= 'habilitado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1347:1: (lv_habilitado_2_0= 'habilitado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1348:3: lv_habilitado_2_0= 'habilitado'
                    {
                    lv_habilitado_2_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInputCheck2994); 

                            newLeafNode(lv_habilitado_2_0, grammarAccess.getInputCheckAccess().getHabilitadoHabilitadoKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputCheckRule());
                    	        }
                           		setWithLastConsumed(current, "habilitado", true, "habilitado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInputCheck3020); 

                	newLeafNode(otherlv_3, grammarAccess.getInputCheckAccess().getInputCheckKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1365:1: ( (lv_name_4_0= ruleEString ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1366:1: (lv_name_4_0= ruleEString )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1366:1: (lv_name_4_0= ruleEString )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1367:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInputCheckAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck3041);
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck3053); 

                	newLeafNode(otherlv_5, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_5());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1387:1: (otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1387:3: otherlv_6= 'valores' otherlv_7= '{' ( (lv_valores_8_0= ruleEString ) ) (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInputCheck3066); 

                        	newLeafNode(otherlv_6, grammarAccess.getInputCheckAccess().getValoresKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck3078); 

                        	newLeafNode(otherlv_7, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1395:1: ( (lv_valores_8_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1396:1: (lv_valores_8_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1396:1: (lv_valores_8_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1397:3: lv_valores_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck3099);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1413:2: (otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==22) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1413:4: otherlv_9= ',' ( (lv_valores_10_0= ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCheck3112); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInputCheckAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1417:1: ( (lv_valores_10_0= ruleEString ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1418:1: (lv_valores_10_0= ruleEString )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1418:1: (lv_valores_10_0= ruleEString )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1419:3: lv_valores_10_0= ruleEString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getValoresEStringParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInputCheck3133);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3147); 

                        	newLeafNode(otherlv_11, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1439:3: (otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1439:5: otherlv_12= 'seleccion' otherlv_13= '{' ( (lv_seleccion_14_0= ruleEInt ) ) (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInputCheck3162); 

                        	newLeafNode(otherlv_12, grammarAccess.getInputCheckAccess().getSeleccionKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleInputCheck3174); 

                        	newLeafNode(otherlv_13, grammarAccess.getInputCheckAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1447:1: ( (lv_seleccion_14_0= ruleEInt ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1448:1: (lv_seleccion_14_0= ruleEInt )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1448:1: (lv_seleccion_14_0= ruleEInt )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1449:3: lv_seleccion_14_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3195);
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

                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1465:2: (otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==22) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1465:4: otherlv_15= ',' ( (lv_seleccion_16_0= ruleEInt ) )
                    	    {
                    	    otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInputCheck3208); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getInputCheckAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1469:1: ( (lv_seleccion_16_0= ruleEInt ) )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1470:1: (lv_seleccion_16_0= ruleEInt )
                    	    {
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1470:1: (lv_seleccion_16_0= ruleEInt )
                    	    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1471:3: lv_seleccion_16_0= ruleEInt
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputCheckAccess().getSeleccionEIntParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleInputCheck3229);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3243); 

                        	newLeafNode(otherlv_17, grammarAccess.getInputCheckAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleInputCheck3257); 

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


    // $ANTLR start "entryRuleAccion"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1503:1: entryRuleAccion returns [EObject current=null] : iv_ruleAccion= ruleAccion EOF ;
    public final EObject entryRuleAccion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccion = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1504:2: (iv_ruleAccion= ruleAccion EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1505:2: iv_ruleAccion= ruleAccion EOF
            {
             newCompositeNode(grammarAccess.getAccionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAccion_in_entryRuleAccion3293);
            iv_ruleAccion=ruleAccion();

            state._fsp--;

             current =iv_ruleAccion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccion3303); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1512:1: ruleAccion returns [EObject current=null] : ( () otherlv_1= 'Accion' otherlv_2= '{' (otherlv_3= 'elemento' ( ( ruleEString ) ) )? (otherlv_5= 'asercion' ( (lv_asercion_6_0= ruleAsercion ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAccion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_asercion_6_0 = null;


         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1515:28: ( ( () otherlv_1= 'Accion' otherlv_2= '{' (otherlv_3= 'elemento' ( ( ruleEString ) ) )? (otherlv_5= 'asercion' ( (lv_asercion_6_0= ruleAsercion ) ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1516:1: ( () otherlv_1= 'Accion' otherlv_2= '{' (otherlv_3= 'elemento' ( ( ruleEString ) ) )? (otherlv_5= 'asercion' ( (lv_asercion_6_0= ruleAsercion ) ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1516:1: ( () otherlv_1= 'Accion' otherlv_2= '{' (otherlv_3= 'elemento' ( ( ruleEString ) ) )? (otherlv_5= 'asercion' ( (lv_asercion_6_0= ruleAsercion ) ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1516:2: () otherlv_1= 'Accion' otherlv_2= '{' (otherlv_3= 'elemento' ( ( ruleEString ) ) )? (otherlv_5= 'asercion' ( (lv_asercion_6_0= ruleAsercion ) ) )? otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1516:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1517:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAccionAccess().getAccionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAccion3349); 

                	newLeafNode(otherlv_1, grammarAccess.getAccionAccess().getAccionKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAccion3361); 

                	newLeafNode(otherlv_2, grammarAccess.getAccionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1530:1: (otherlv_3= 'elemento' ( ( ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==39) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1530:3: otherlv_3= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAccion3374); 

                        	newLeafNode(otherlv_3, grammarAccess.getAccionAccess().getElementoKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1534:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1535:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1535:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1536:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAccionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAccionAccess().getElementoInputCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAccion3397);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1549:4: (otherlv_5= 'asercion' ( (lv_asercion_6_0= ruleAsercion ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==40) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1549:6: otherlv_5= 'asercion' ( (lv_asercion_6_0= ruleAsercion ) )
                    {
                    otherlv_5=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAccion3412); 

                        	newLeafNode(otherlv_5, grammarAccess.getAccionAccess().getAsercionKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1553:1: ( (lv_asercion_6_0= ruleAsercion ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1554:1: (lv_asercion_6_0= ruleAsercion )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1554:1: (lv_asercion_6_0= ruleAsercion )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1555:3: lv_asercion_6_0= ruleAsercion
                    {
                     
                    	        newCompositeNode(grammarAccess.getAccionAccess().getAsercionAsercionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAsercion_in_ruleAccion3433);
                    lv_asercion_6_0=ruleAsercion();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAccionRule());
                    	        }
                           		set(
                           			current, 
                           			"asercion",
                            		lv_asercion_6_0, 
                            		"Asercion");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAccion3447); 

                	newLeafNode(otherlv_7, grammarAccess.getAccionAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleAsercionInvisible"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1583:1: entryRuleAsercionInvisible returns [EObject current=null] : iv_ruleAsercionInvisible= ruleAsercionInvisible EOF ;
    public final EObject entryRuleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionInvisible = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1584:2: (iv_ruleAsercionInvisible= ruleAsercionInvisible EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1585:2: iv_ruleAsercionInvisible= ruleAsercionInvisible EOF
            {
             newCompositeNode(grammarAccess.getAsercionInvisibleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible3483);
            iv_ruleAsercionInvisible=ruleAsercionInvisible();

            state._fsp--;

             current =iv_ruleAsercionInvisible; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionInvisible3493); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1592:1: ruleAsercionInvisible returns [EObject current=null] : ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAsercionInvisible() throws RecognitionException {
        EObject current = null;

        Token lv_estado_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1595:28: ( ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1596:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1596:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1596:2: () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionInvisible' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1596:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1597:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1602:2: ( (lv_estado_1_0= 'estado' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==41) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1603:1: (lv_estado_1_0= 'estado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1603:1: (lv_estado_1_0= 'estado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1604:3: lv_estado_1_0= 'estado'
                    {
                    lv_estado_1_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAsercionInvisible3545); 

                            newLeafNode(lv_estado_1_0, grammarAccess.getAsercionInvisibleAccess().getEstadoEstadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
                    	        }
                           		setWithLastConsumed(current, "estado", true, "estado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAsercionInvisible3571); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionInvisibleAccess().getAsercionInvisibleKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionInvisible3583); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionInvisibleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1625:1: (otherlv_4= 'elemento' ( ( ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1625:3: otherlv_4= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAsercionInvisible3596); 

                        	newLeafNode(otherlv_4, grammarAccess.getAsercionInvisibleAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1629:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1630:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1630:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1631:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionInvisibleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAsercionInvisibleAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionInvisible3619);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionInvisible3633); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1656:1: entryRuleAsercionHabilitado returns [EObject current=null] : iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF ;
    public final EObject entryRuleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionHabilitado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1657:2: (iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1658:2: iv_ruleAsercionHabilitado= ruleAsercionHabilitado EOF
            {
             newCompositeNode(grammarAccess.getAsercionHabilitadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado3669);
            iv_ruleAsercionHabilitado=ruleAsercionHabilitado();

            state._fsp--;

             current =iv_ruleAsercionHabilitado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionHabilitado3679); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1665:1: ruleAsercionHabilitado returns [EObject current=null] : ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAsercionHabilitado() throws RecognitionException {
        EObject current = null;

        Token lv_estado_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1668:28: ( ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1669:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1669:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1669:2: () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionHabilitado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1669:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1670:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAsercionHabilitadoAccess().getAsercionHabilitadoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1675:2: ( (lv_estado_1_0= 'estado' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1676:1: (lv_estado_1_0= 'estado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1676:1: (lv_estado_1_0= 'estado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1677:3: lv_estado_1_0= 'estado'
                    {
                    lv_estado_1_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAsercionHabilitado3731); 

                            newLeafNode(lv_estado_1_0, grammarAccess.getAsercionHabilitadoAccess().getEstadoEstadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
                    	        }
                           		setWithLastConsumed(current, "estado", true, "estado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAsercionHabilitado3757); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionHabilitadoAccess().getAsercionHabilitadoKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionHabilitado3769); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionHabilitadoAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1698:1: (otherlv_4= 'elemento' ( ( ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==39) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1698:3: otherlv_4= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAsercionHabilitado3782); 

                        	newLeafNode(otherlv_4, grammarAccess.getAsercionHabilitadoAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1702:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1703:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1703:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1704:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionHabilitadoRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAsercionHabilitadoAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionHabilitado3805);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionHabilitado3819); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1729:1: entryRuleAsercionValor returns [EObject current=null] : iv_ruleAsercionValor= ruleAsercionValor EOF ;
    public final EObject entryRuleAsercionValor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionValor = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1730:2: (iv_ruleAsercionValor= ruleAsercionValor EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1731:2: iv_ruleAsercionValor= ruleAsercionValor EOF
            {
             newCompositeNode(grammarAccess.getAsercionValorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor3855);
            iv_ruleAsercionValor=ruleAsercionValor();

            state._fsp--;

             current =iv_ruleAsercionValor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionValor3865); 

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
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1738:1: ruleAsercionValor returns [EObject current=null] : ( () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
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
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1741:28: ( ( () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1742:1: ( () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1742:1: ( () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1742:2: () otherlv_1= 'AsercionValor' otherlv_2= '{' (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )? (otherlv_5= 'elemento' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1742:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1743:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAsercionValorAccess().getAsercionValorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleAsercionValor3911); 

                	newLeafNode(otherlv_1, grammarAccess.getAsercionValorAccess().getAsercionValorKeyword_1());
                
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionValor3923); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionValorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1756:1: (otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1756:3: otherlv_3= 'valor' ( (lv_valor_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAsercionValor3936); 

                        	newLeafNode(otherlv_3, grammarAccess.getAsercionValorAccess().getValorKeyword_3_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1760:1: ( (lv_valor_4_0= ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1761:1: (lv_valor_4_0= ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1761:1: (lv_valor_4_0= ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1762:3: lv_valor_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAsercionValorAccess().getValorEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor3957);
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

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1778:4: (otherlv_5= 'elemento' ( ( ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==39) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1778:6: otherlv_5= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAsercionValor3972); 

                        	newLeafNode(otherlv_5, grammarAccess.getAsercionValorAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1782:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1783:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1783:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1784:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionValorRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAsercionValorAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionValor3995);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionValor4009); 

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


    // $ANTLR start "entryRuleAsercionSeleccionado"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1809:1: entryRuleAsercionSeleccionado returns [EObject current=null] : iv_ruleAsercionSeleccionado= ruleAsercionSeleccionado EOF ;
    public final EObject entryRuleAsercionSeleccionado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsercionSeleccionado = null;


        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1810:2: (iv_ruleAsercionSeleccionado= ruleAsercionSeleccionado EOF )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1811:2: iv_ruleAsercionSeleccionado= ruleAsercionSeleccionado EOF
            {
             newCompositeNode(grammarAccess.getAsercionSeleccionadoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAsercionSeleccionado_in_entryRuleAsercionSeleccionado4045);
            iv_ruleAsercionSeleccionado=ruleAsercionSeleccionado();

            state._fsp--;

             current =iv_ruleAsercionSeleccionado; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsercionSeleccionado4055); 

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
    // $ANTLR end "entryRuleAsercionSeleccionado"


    // $ANTLR start "ruleAsercionSeleccionado"
    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1818:1: ruleAsercionSeleccionado returns [EObject current=null] : ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionSeleccionado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleAsercionSeleccionado() throws RecognitionException {
        EObject current = null;

        Token lv_estado_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1821:28: ( ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionSeleccionado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1822:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionSeleccionado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1822:1: ( () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionSeleccionado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1822:2: () ( (lv_estado_1_0= 'estado' ) )? otherlv_2= 'AsercionSeleccionado' otherlv_3= '{' (otherlv_4= 'elemento' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1822:2: ()
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1823:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAsercionSeleccionadoAccess().getAsercionSeleccionadoAction_0(),
                        current);
                

            }

            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1828:2: ( (lv_estado_1_0= 'estado' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==41) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1829:1: (lv_estado_1_0= 'estado' )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1829:1: (lv_estado_1_0= 'estado' )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1830:3: lv_estado_1_0= 'estado'
                    {
                    lv_estado_1_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAsercionSeleccionado4107); 

                            newLeafNode(lv_estado_1_0, grammarAccess.getAsercionSeleccionadoAccess().getEstadoEstadoKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionSeleccionadoRule());
                    	        }
                           		setWithLastConsumed(current, "estado", true, "estado");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAsercionSeleccionado4133); 

                	newLeafNode(otherlv_2, grammarAccess.getAsercionSeleccionadoAccess().getAsercionSeleccionadoKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsercionSeleccionado4145); 

                	newLeafNode(otherlv_3, grammarAccess.getAsercionSeleccionadoAccess().getLeftCurlyBracketKeyword_3());
                
            // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1851:1: (otherlv_4= 'elemento' ( ( ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==39) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1851:3: otherlv_4= 'elemento' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAsercionSeleccionado4158); 

                        	newLeafNode(otherlv_4, grammarAccess.getAsercionSeleccionadoAccess().getElementoKeyword_4_0());
                        
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1855:1: ( ( ruleEString ) )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1856:1: ( ruleEString )
                    {
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1856:1: ( ruleEString )
                    // ../formulario.editor/src-gen/formulario/parser/antlr/internal/InternalFormulario.g:1857:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAsercionSeleccionadoRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAsercionSeleccionadoAccess().getElementoInputCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAsercionSeleccionado4181);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAsercionSeleccionado4195); 

                	newLeafNode(otherlv_6, grammarAccess.getAsercionSeleccionadoAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleAsercionSeleccionado"

    // Delegated rules


 

    
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
        public static final BitSet FOLLOW_ruleInputBoton_in_ruleInput420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_ruleInput447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_ruleInput474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_ruleInput501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_ruleInput528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercion_in_entryRuleAsercion563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercion573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_ruleAsercion620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_ruleAsercion647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_ruleAsercion674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccionado_in_ruleAsercion701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout736 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleLayout792 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout804 = new BitSet(new long[]{0x00000000003A0000L});
        public static final BitSet FOLLOW_19_in_ruleLayout817 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout838 = new BitSet(new long[]{0x0000000000320000L});
        public static final BitSet FOLLOW_20_in_ruleLayout853 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLayout874 = new BitSet(new long[]{0x0000000000220000L});
        public static final BitSet FOLLOW_21_in_ruleLayout889 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLayout901 = new BitSet(new long[]{0x00000035BC000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout922 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleLayout935 = new BitSet(new long[]{0x00000035BC000000L});
        public static final BitSet FOLLOW_ruleInput_in_ruleLayout956 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleLayout970 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleLayout984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePruebaInterfaz_in_entryRulePruebaInterfaz1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePruebaInterfaz1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rulePruebaInterfaz1201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePruebaInterfaz1222 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePruebaInterfaz1234 = new BitSet(new long[]{0x0000000001020000L});
        public static final BitSet FOLLOW_24_in_rulePruebaInterfaz1247 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePruebaInterfaz1259 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1280 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_rulePruebaInterfaz1293 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleAccion_in_rulePruebaInterfaz1314 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_rulePruebaInterfaz1328 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePruebaInterfaz1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEInt1429 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputTexto_in_entryRuleInputTexto1491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputTexto1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputTexto1553 = new BitSet(new long[]{0x0000000038000000L});
        public static final BitSet FOLLOW_27_in_ruleInputTexto1585 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_28_in_ruleInputTexto1617 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleInputTexto1643 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1664 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputTexto1676 = new BitSet(new long[]{0x0000000040020000L});
        public static final BitSet FOLLOW_30_in_ruleInputTexto1689 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputTexto1710 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputTexto1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputBoton_in_entryRuleInputBoton1760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputBoton1770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputBoton1822 = new BitSet(new long[]{0x0000000088000000L});
        public static final BitSet FOLLOW_27_in_ruleInputBoton1854 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleInputBoton1880 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputBoton1901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputMultiple_Impl_in_entryRuleInputMultiple_Impl1937 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputMultiple_Impl1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputMultiple_Impl1999 = new BitSet(new long[]{0x0000000108000000L});
        public static final BitSet FOLLOW_27_in_ruleInputMultiple_Impl2031 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleInputMultiple_Impl2057 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputMultiple_Impl2078 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputMultiple_Impl2090 = new BitSet(new long[]{0x0000000200020000L});
        public static final BitSet FOLLOW_33_in_ruleInputMultiple_Impl2103 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputMultiple_Impl2115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputMultiple_Impl2136 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputMultiple_Impl2149 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputMultiple_Impl2170 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputMultiple_Impl2184 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputMultiple_Impl2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputRadio_in_entryRuleInputRadio2234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputRadio2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputRadio2296 = new BitSet(new long[]{0x0000000408000000L});
        public static final BitSet FOLLOW_27_in_ruleInputRadio2328 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleInputRadio2354 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2375 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2387 = new BitSet(new long[]{0x0000000A00020000L});
        public static final BitSet FOLLOW_33_in_ruleInputRadio2400 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputRadio2412 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2433 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputRadio2446 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputRadio2467 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio2481 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_35_in_ruleInputRadio2496 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputRadio2517 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputRadio2531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCombo_in_entryRuleInputCombo2567 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCombo2577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputCombo2629 = new BitSet(new long[]{0x0000001008000000L});
        public static final BitSet FOLLOW_27_in_ruleInputCombo2661 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleInputCombo2687 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2708 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2720 = new BitSet(new long[]{0x0000000A00020000L});
        public static final BitSet FOLLOW_33_in_ruleInputCombo2733 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCombo2745 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2766 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCombo2779 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCombo2800 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCombo2814 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_35_in_ruleInputCombo2829 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCombo2850 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputCombo2864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputCheck_in_entryRuleInputCheck2900 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputCheck2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleInputCheck2962 = new BitSet(new long[]{0x0000002008000000L});
        public static final BitSet FOLLOW_27_in_ruleInputCheck2994 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleInputCheck3020 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck3041 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck3053 = new BitSet(new long[]{0x0000000A00020000L});
        public static final BitSet FOLLOW_33_in_ruleInputCheck3066 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck3078 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck3099 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCheck3112 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInputCheck3133 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3147 = new BitSet(new long[]{0x0000000800020000L});
        public static final BitSet FOLLOW_35_in_ruleInputCheck3162 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleInputCheck3174 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3195 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_22_in_ruleInputCheck3208 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleInputCheck3229 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3243 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleInputCheck3257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccion_in_entryRuleAccion3293 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccion3303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleAccion3349 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAccion3361 = new BitSet(new long[]{0x0000018000020000L});
        public static final BitSet FOLLOW_39_in_ruleAccion3374 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAccion3397 = new BitSet(new long[]{0x0000010000020000L});
        public static final BitSet FOLLOW_40_in_ruleAccion3412 = new BitSet(new long[]{0x00003E0000000000L});
        public static final BitSet FOLLOW_ruleAsercion_in_ruleAccion3433 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAccion3447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionInvisible_in_entryRuleAsercionInvisible3483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionInvisible3493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAsercionInvisible3545 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleAsercionInvisible3571 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionInvisible3583 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleAsercionInvisible3596 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionInvisible3619 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionInvisible3633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionHabilitado_in_entryRuleAsercionHabilitado3669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionHabilitado3679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAsercionHabilitado3731 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleAsercionHabilitado3757 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionHabilitado3769 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleAsercionHabilitado3782 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionHabilitado3805 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionHabilitado3819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionValor_in_entryRuleAsercionValor3855 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionValor3865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleAsercionValor3911 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionValor3923 = new BitSet(new long[]{0x0000008040020000L});
        public static final BitSet FOLLOW_30_in_ruleAsercionValor3936 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor3957 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleAsercionValor3972 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionValor3995 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionValor4009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsercionSeleccionado_in_entryRuleAsercionSeleccionado4045 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsercionSeleccionado4055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAsercionSeleccionado4107 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleAsercionSeleccionado4133 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsercionSeleccionado4145 = new BitSet(new long[]{0x0000008000020000L});
        public static final BitSet FOLLOW_39_in_ruleAsercionSeleccionado4158 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAsercionSeleccionado4181 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleAsercionSeleccionado4195 = new BitSet(new long[]{0x0000000000000002L});
    }


}