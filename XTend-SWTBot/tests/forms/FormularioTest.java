package forms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotCCombo;
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
		
		// Añadimos las referencias a los elementos del formulario
		
		// CASO TEXTO
		SWTBotButton textotexto1 = bot.button("texto1");
				
		// CASO RADIO

				
		 // CASO COMBO
		//SWTBotCCombo botoncombo1 = bot.comboWithLabel("combo1");
		
		// CASO CHECKBOX
		
				
		// CASO BOTON
		SWTBotButton botonvalidar = bot.button("validar");
				
		// CASO BOTON
		SWTBotButton botoncancelar = bot.button("cancelar");
				
		// CASO BOTON
		SWTBotButton botonguardar = bot.button("guardar");
				
		// Ahora codificamos los ASSERTS
		
		assertTrue(textotexto1.isEnabled());
		assertTrue(textotexto1.isVisible());

		/*
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
		*/

		display.dispose();
		shell.dispose();		 
	}
}
