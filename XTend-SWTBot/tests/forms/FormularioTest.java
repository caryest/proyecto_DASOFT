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
import org.eclipse.swtbot.swt.finder.widgets.SWTBotCombo;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotLabel;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotRadio;
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
		SWTBotText textotexto1 = bot.textWithLabel("texto1");
				
		// CASO RADIO
		SWTBotRadio radioradio1[] = new SWTBotRadio[3];
		radioradio1[0] = bot.radio("val1");
		radioradio1[1] = bot.radio("val2");
		radioradio1[2] = bot.radio("val3");
				
		 // CASO COMBO
		SWTBotCombo combocombo1 = bot.comboBox("combo1");
		
		// CASO CHECKBOX
		SWTBotCheckBox checkcheck1[] = new SWTBotCheckBox[2];
		checkcheck1[0] = bot.checkBox("val1");
		checkcheck1[1] = bot.checkBox("val2");
				
		// CASO BOTON
		SWTBotButton botonvalidar = bot.button("validar");
				
		// CASO BOTON
		SWTBotButton botoncancelar = bot.button("cancelar");
				
		// CASO BOTON
		SWTBotButton botonguardar = bot.button("guardar");
				
		// Ahora codificamos los ASSERTS
		
		radioradio1[0].click();
		display.update();
		assertFalse(textotexto1.isEnabled());
		
		textotexto1.setText("");
		
		checkcheck1[0].setFocus();
		checkcheck1[0].select();
		display.update();
		assertFalse(textotexto1.isVisible());
		
		textotexto1.setText("");
		
		botoncancelar.click();
		display.update();
		assertTrue(checkcheck1[0].isVisible());
		assertTrue(checkcheck1[1].isVisible());
		
		assertFalse(checkcheck1[0].isEnabled());
		assertFalse(checkcheck1[1].isEnabled());
		

		display.dispose();
		shell.dispose();		 
	}
	
	
}
