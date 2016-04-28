package forms;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
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
		shell.setText  ("Prueba2");
		
		// class Formularios_DASOFT.impl.InputTextoImpl
		Label labeltexto1 = new Label(shell, SWT.NONE);
		Text  texttexto1  = new Text(shell, SWT.BORDER);
		labeltexto1.setText("texto1");
		// class Formularios_DASOFT.impl.InputRadioImpl
		
		// class Formularios_DASOFT.impl.InputComboImpl
		
		// class Formularios_DASOFT.impl.InputCheckImpl
		Button botoncheck1 = new Button(shell, SWT.CHECK);
		botoncheck1.setText("check1");
		
		// layout
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		shell.setLayout(new GridLayout(3, true));
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
