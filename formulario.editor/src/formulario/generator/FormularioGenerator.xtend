/*
 * generated by Xtext
 */
package formulario.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import Formularios_DASOFT.Formulario
import Formularios_DASOFT.Input
import Formularios_DASOFT.InputBoton
import Formularios_DASOFT.InputTexto
import Formularios_DASOFT.InputCheck
import Formularios_DASOFT.InputRadio
import Formularios_DASOFT.InputCombo
import Formularios_DASOFT.PruebaInterfaz
import Formularios_DASOFT.BotonValidar
import Formularios_DASOFT.BotonGuardar
import Formularios_DASOFT.BotonCancelar
import Formularios_DASOFT.BotonCustom
import Formularios_DASOFT.ReaccionHabilitado
import Formularios_DASOFT.ReaccionVisible
import Formularios_DASOFT.AccionValor
import Formularios_DASOFT.AccionSeleccion
import Formularios_DASOFT.AsercionHabilitado
import Formularios_DASOFT.AsercionInvisible
import Formularios_DASOFT.AsercionValor
import Formularios_DASOFT.AsercionSeleccion

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FormularioGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		

 		for(Formulario form : resource.allContents.toIterable.filter(Formulario)){
			fsa.generateFile("forms/Formulario.java", generarFormulario(form))
		
			fsa.generateFile("../tests/forms/FormularioTest.java", generarTest(form.pruebas))
		}
		
	}
	
	def generarFormulario (Formulario form)'''
		package forms;

		import org.eclipse.swt.SWT;
		import org.eclipse.swt.events.SelectionEvent;
		import org.eclipse.swt.events.SelectionListener;
		import org.eclipse.swt.layout.GridData;
		import org.eclipse.swt.layout.GridLayout;
		import org.eclipse.swt.widgets.Button;
		import org.eclipse.swt.widgets.Combo;
		import org.eclipse.swt.widgets.Display;
		import org.eclipse.swt.widgets.Composite;
		import org.eclipse.swt.widgets.Label;
		import org.eclipse.swt.widgets.Shell;
		import org.eclipse.swt.widgets.Text;
		
		public class Formulario {
				
			public static void main(String[] args) {
				Display display = new Display();
				Shell   shell   = new Formulario().showForm(display);
				while (!shell.isDisposed()) 
					if (!display.readAndDispatch())
						display.sleep();
				display.dispose();
			}
			
			public Shell showForm(Display display) {
				
				Shell shell = new Shell(display);
				shell.setText  ("«form.name»");
				shell.setLayout(new GridLayout(«form.layout.columnas», false));
				
				// Añadimos los elementos de la interfaz
				«FOR input : form.layout.entradas»
				
				« IF input instanceof InputBoton »// CASO BOTONES
				Button boton«input.name» = new Button(shell, SWT.CHECK);
				boton«input.name».setText("«input.name»");
				« ELSEIF input instanceof InputTexto »// CASO TEXTO
				Composite contentText«input.name» = new Composite(shell, SWT.BORDER);
				contentText«input.name».setLayout(new GridLayout(2, true));
				Label label«input.name» = new Label(contentText«input.name», SWT.NONE);
				Text  texto«input.name»  = new Text(contentText«input.name», SWT.BORDER);
				label«input.name».setText("«input.name»");
				« ELSEIF input instanceof InputCheck »// CASO CHECKBOX
				Composite contentCheck«input.name» = new Composite(shell, SWT.BORDER);
				contentCheck«input.name».setLayout(new GridLayout(1, true));
				Button[] check«input.name» = new Button[«(input as InputCheck).valores.size»];
				
				«FOR valor : (input as InputCheck).valores»
				check«input.name»[«(input as InputCheck).valores.indexOf(valor)»] = new Button(contentCheck«input.name», SWT.CHECK);
				check«input.name»[«(input as InputCheck).valores.indexOf(valor)»].setText("«valor»");
				«ENDFOR»
				« ELSEIF input instanceof InputRadio »// CASO RADIO
				Composite contentRadio«input.name» = new Composite(shell, SWT.BORDER);
				contentRadio«input.name».setLayout(new GridLayout(1, true));
				Button[] radio«input.name» = new Button[«(input as InputRadio).valores.size»];

				«FOR valor : (input as InputRadio).valores»
				radio«input.name»[«(input as InputRadio).valores.indexOf(valor)»] = new Button(contentRadio«input.name», SWT.RADIO);
				radio«input.name»[«(input as InputRadio).valores.indexOf(valor)»].setSelection(false);
				radio«input.name»[«(input as InputRadio).valores.indexOf(valor)»].setText("«valor»");
				radio«input.name»[«(input as InputRadio).valores.indexOf(valor)»].setBounds(10, 5, 75, 30);
				«ENDFOR»
				« ELSEIF input instanceof InputCombo » // CASO COMBO
				Combo combo«input.name» = new Combo(shell, SWT.SIMPLE);
				«FOR valor : (input as InputCombo).valores»
				combo«input.name».add("«valor»");
				«ENDFOR»
				« ENDIF »
				«ENDFOR»
				
				// layout
				GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
				data.horizontalSpan = 2;
				//checkCash.setLayoutData(data);	
				
				/**
				// checkbutton
				Button checkCash = new Button(shell, SWT.CHECK);
				checkCash.setText("Pay with cash?");		
				
				// text field
				Label labelCCNumber = new Label(shell, SWT.NONE);
				Text  textCCNumber  = new Text(shell, SWT.BORDER);
				labelCCNumber.setText("Credit card number");
				
				// layout
				GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
				shell.setLayout(new GridLayout(2, true));
				data.horizontalSpan = 2;
				checkCash.setLayoutData(data);		
				**/
				
				// Funciones Reaccion
				«FOR input : form.layout.entradas»
				
				//« input.class.name »
				« IF input instanceof InputCheck »// CASO CHECKBOX
				« IF (input as InputCheck).reaccion != null »
				« IF (input as InputCheck).reaccion instanceof ReaccionVisible »
				check«input.name»[«(input as InputCheck).reaccion.activacion»].addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent arg0) {
						« IF (input as InputCheck).reaccion.objetivo instanceof InputBoton »
						boton«(input as InputCheck).reaccion.objetivo.name».setVisible( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputCheck).reaccion.objetivo instanceof InputTexto »
						texto«(input as InputCheck).reaccion.objetivo.name».setVisible( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputCheck).reaccion.objetivo instanceof InputCheck »
						check«(input as InputCheck).reaccion.objetivo.name».setVisible( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputCheck).reaccion.objetivo instanceof InputCombo »
						combo«(input as InputCheck).reaccion.objetivo.name».setVisible( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputCheck).reaccion.objetivo instanceof InputRadio »
						radio«(input as InputCheck).reaccion.objetivo.name».setVisible( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ENDIF »
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent arg0) {}
				});
				« ELSEIF (input as InputCheck).reaccion instanceof ReaccionHabilitado »
				check«input.name»[«(input as InputCheck).reaccion.activacion»].addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent arg0) {
						« IF (input as InputCheck).reaccion.objetivo instanceof InputBoton »
						boton«(input as InputCheck).reaccion.objetivo.name».setEnabled( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputCheck).reaccion.objetivo instanceof InputTexto »
						texto«(input as InputCheck).reaccion.objetivo.name».setEnabled( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputCheck).reaccion.objetivo instanceof InputCheck »
						check«(input as InputCheck).reaccion.objetivo.name».setEnabled( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputCheck).reaccion.objetivo instanceof InputCombo »
						combo«(input as InputCheck).reaccion.objetivo.name».setEnabled( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputCheck).reaccion.objetivo instanceof InputRadio »
						radio«(input as InputCheck).reaccion.objetivo.name».setEnabled( !check«input.name»[«(input as InputCheck).reaccion.activacion»].getSelection() );
						« ENDIF »
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent arg0) {}
				});
				« ENDIF »
				« ENDIF »
				« ELSEIF input instanceof InputRadio »// CASO RADIO
				« IF (input as InputRadio).reaccion != null »
				« IF (input as InputRadio).reaccion instanceof ReaccionVisible »
				radio«input.name»[«(input as InputRadio).reaccion.activacion»].addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent arg0) {
						« IF (input as InputRadio).reaccion.objetivo instanceof InputBoton »
						boton«(input as InputRadio).reaccion.objetivo.name».setVisible( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputRadio).reaccion.objetivo instanceof InputTexto »
						texto«(input as InputRadio).reaccion.objetivo.name».setVisible( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputRadio).reaccion.objetivo instanceof InputCheck »
						check«(input as InputRadio).reaccion.objetivo.name».setVisible( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputRadio).reaccion.objetivo instanceof InputCombo »
						combo«(input as InputRadio).reaccion.objetivo.name».setVisible( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputRadio).reaccion.objetivo instanceof InputRadio »
						radio«(input as InputRadio).reaccion.objetivo.name».setVisible( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ENDIF »
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent arg0) {}
				});
				« ELSEIF (input as InputRadio).reaccion instanceof ReaccionHabilitado »
				radio«input.name»[«(input as InputRadio).reaccion.activacion»].addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent arg0) {
						« IF (input as InputRadio).reaccion.objetivo instanceof InputBoton »
						boton«(input as InputRadio).reaccion.objetivo.name».setEnabled( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputRadio).reaccion.objetivo instanceof InputTexto »
						texto«(input as InputRadio).reaccion.objetivo.name».setEnabled( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputRadio).reaccion.objetivo instanceof InputCheck »
						check«(input as InputRadio).reaccion.objetivo.name».setEnabled( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputRadio).reaccion.objetivo instanceof InputCombo »
						combo«(input as InputRadio).reaccion.objetivo.name».setEnabled( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ELSEIF (input as InputRadio).reaccion.objetivo instanceof InputRadio »
						radio«(input as InputRadio).reaccion.objetivo.name».setEnabled( !radio«input.name»[«(input as InputRadio).reaccion.activacion»].getSelection() );
						« ENDIF »
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent arg0) {}
				});
				« ENDIF »
				« ENDIF »
				« ENDIF »
				«ENDFOR»
				
				/**
				// show or hide text field depending on checkbutton selection
				checkCash.addSelectionListener(new SelectionListener() {
					
					@Override
					public void widgetSelected(SelectionEvent arg0) {
						labelCCNumber.setVisible( !checkCash.getSelection() );
						textCCNumber.setVisible ( !checkCash.getSelection() );
					}
					
					@Override
					public void widgetDefaultSelected(SelectionEvent arg0) {}
				});
				**/
				
				// show form
				shell.pack();
				shell.open();
				return shell;
				
			}
		}
	'''
	
	def generarTest (PruebaInterfaz pruebas)'''
		package forms;

		import static org.junit.Assert.assertFalse;
		import static org.junit.Assert.assertTrue;
		
		import org.eclipse.swt.widgets.Display;
		import org.eclipse.swt.widgets.Shell;
		import org.eclipse.swtbot.swt.finder.SWTBot;
		import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
		import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
		import org.eclipse.swtbot.swt.finder.widgets.SWTBotCheckBox;
		import org.eclipse.swtbot.swt.finder.widgets.SWTBotLabel;
		import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
		import org.junit.Before;
		import org.junit.Test;
		import org.junit.runner.RunWith;
		
		@RunWith(SWTBotJunit4ClassRunner.class)
		public class FormularioTest {
		
		    private Display display;
		    private Shell shell;
		    private SWTBot bot;
		    
			@Before
		    public void setup() {
		      display = new Display();
		      shell   = new Formulario().showForm(display);
		      bot     = new SWTBot(shell);
			}
		
			@Test
			public void test1() {
				// slow down execution
				SWTBotPreferences.PLAYBACK_DELAY = 100;
		
				« FOR accion : pruebas.acciones »
				« IF accion instanceof AccionValor »// CASO ACCION VALOR
				« IF accion.elemento instanceof InputBoton »// CASO BOTONES
				SWTBotButton boton«accion.elemento.name» = bot.button("«accion.elemento.name»");
				« ELSEIF accion.elemento instanceof InputTexto »// CASO TEXTO
				SWTBotText texto«accion.elemento.name» = bot.textWithLabel("«accion.elemento.name»");
				« ENDIF »
				« ELSEIF accion instanceof AccionSeleccion » // CASO ACCION SELECCION
				« IF accion.elemento instanceof InputCombo »// CASO COMBO
				SWTBotButton boton«accion.elemento.name» = bot.comboWithLabel("«(accion.elemento as InputCheck).valores.get((accion as AccionSeleccion).valor)»");
				« ELSEIF accion.elemento instanceof InputRadio »// CASO RADIO
				SWTBotButton texto«accion.elemento.name» = bot.button("«accion.elemento.name»");
				« ELSEIF accion.elemento instanceof InputCheck »// CASO CHECK
				SWTBotCheckBox check«accion.elemento.name» = bot.checkBox("«(accion.elemento as InputCheck).valores.get((accion as AccionSeleccion).valor)»");
				« ENDIF »
				« ENDIF »
				« ENDFOR »
				
				/*
				SWTBotCheckBox checkCash  = bot.checkBox("Pay with cash?");
				SWTBotText  textCCNumber  = bot.textWithLabel("Credit card number");
				SWTBotLabel labelCCNumber = bot.label("Credit card number");
				*/
				
				// Ahora codificamos los ASSERTS
				
				« FOR accion : pruebas.acciones »
				« IF accion.asercion instanceof AsercionHabilitado »
				« IF accion.asercion.elemento instanceof InputBoton »
				assertTrue(boton«accion.asercion.elemento.name».isEnabled());
				« ELSEIF accion.asercion.elemento instanceof InputTexto »
				assertTrue(texto«accion.asercion.elemento.name».isEnabled());
				« ELSEIF accion.asercion.elemento instanceof InputCombo »
				assertTrue(combo«accion.asercion.elemento.name».isEnabled());
				« ELSEIF accion.asercion.elemento instanceof InputRadio »
				assertTrue(radio«accion.asercion.elemento.name».isEnabled()); /// ESTAAAAAA MAAAAAAAAAAAAAAL
				« ELSEIF accion.asercion.elemento instanceof InputCheck »
				assertTrue(check«accion.asercion.elemento.name».isEnabled());
				« ENDIF»
				« ELSEIF accion.asercion instanceof AsercionInvisible »
				« IF accion.asercion.elemento instanceof InputBoton »
				assertTrue(boton«accion.asercion.elemento.name».isVisible());
				« ELSEIF accion.asercion.elemento instanceof InputTexto »
				assertTrue(texto«accion.asercion.elemento.name».isVisible());
				« ELSEIF accion.asercion.elemento instanceof InputCombo »
				assertTrue(combo«accion.asercion.elemento.name».isVisible());
				« ELSEIF accion.asercion.elemento instanceof InputRadio »
				assertTrue(radio«accion.asercion.elemento.name».isVisible()); /// ESTAAAAAA MAAAAAAAAAAAAAAL
				« ELSEIF accion.asercion.elemento instanceof InputCheck »
				assertTrue(check«accion.asercion.elemento.name».isVisible());
				« ELSEIF accion.asercion instanceof AsercionValor »
				« ELSEIF accion.asercion instanceof AsercionSeleccion »
				« IF accion.asercion.elemento instanceof InputCheck »
				assertTrue(check«accion.asercion.elemento.name».isSelected());
				« ELSEIF accion.asercion.elemento instanceof InputCombo »
				assertTrue(combo«accion.asercion.elemento.name».isSelected());
				« ELSEIF accion.asercion.elemento instanceof InputRadio »
				assertTrue(radio«accion.asercion.elemento.name».isSelected());
				« ENDIF »
				« ENDIF »
				« ENDIF »
				« ENDFOR »
		
				// select check
				checkCash.setFocus();
				checkCash.select();
				display.update();
		
				// checkbutton should be checked, text field should be hidden
				assertTrue(checkCash.isChecked());
				assertFalse(textCCNumber.isVisible());
				assertFalse(labelCCNumber.isVisible());
		
				// deselect check
				checkCash.setFocus();
				checkCash.deselect();
				display.update();
		
				// checkbutton should be unchecked, text field should be visible
				assertFalse(checkCash.isChecked());
				assertTrue(textCCNumber.isVisible());
				assertTrue(labelCCNumber.isVisible());
		
				display.dispose();
				shell.dispose();		 
			}
		}
	'''
	
}
