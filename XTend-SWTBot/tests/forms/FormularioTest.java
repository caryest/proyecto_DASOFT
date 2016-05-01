package forms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
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
		SWTBotButton botoncombo1 = bot.comboWithLabel("combo1");
		
		// CASO CHECKBOX
		
				
		// CASO BOTON
		SWTBotButton botonvalidar = bot.button("validar");
				
		// CASO BOTON
		SWTBotButton botoncancelar = bot.button("cancelar");
				
		// CASO BOTON
		SWTBotButton botonguardar = bot.button("guardar");
				
		// Ahora codificamos los ASSERTS
		
// ****************AUN QUEDA******************
		radioradio1.setFocus();
		radioradio1.select();
		display.update();
		assertTrue(textotexto1.isEnabled());
// ****************AUN QUEDA******************
		checkcheck1.setFocus();
		checkcheck1.select();
		display.update();
				assertTrue(textotexto1.isVisible());

		display.dispose();
		shell.dispose();		 
	}
}
