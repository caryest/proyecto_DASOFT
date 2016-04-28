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

		SWTBotCheckBox checkCash  = bot.checkBox("Pay with cash?");
		SWTBotText  textCCNumber  = bot.textWithLabel("Credit card number");
		SWTBotLabel labelCCNumber = bot.label("Credit card number");

		// checkbutton should be unchecked, text field should be visible
		assertFalse(checkCash.isChecked());
		assertTrue(textCCNumber.isVisible());
		assertTrue(labelCCNumber.isVisible());

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
