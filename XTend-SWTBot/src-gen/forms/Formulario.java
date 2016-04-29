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
		shell.setText  ("Prueba2");
		shell.setLayout(new GridLayout(3, false));
		
		// Añadimos los elementos de la interfaz
		
		// CASO TEXTO
		Composite contentTexttexto1 = new Composite(shell, SWT.BORDER);
		contentTexttexto1.setLayout(new GridLayout(2, true));
		Label labeltexto1 = new Label(contentTexttexto1, SWT.NONE);
		Text  texttexto1  = new Text(contentTexttexto1, SWT.BORDER);
		labeltexto1.setText("texto1");
				
		// CASO RADIO
		Composite contentRadioradio1 = new Composite(shell, SWT.BORDER);
		contentRadioradio1.setLayout(new GridLayout(1, true));
		Button[] radioradio1 = new Button[3];

		radioradio1[0] = new Button(contentRadioradio1, SWT.RADIO);
		radioradio1[0].setSelection(false);
		radioradio1[0].setText("val1");
		radioradio1[0].setBounds(10, 5, 75, 30);
		radioradio1[1] = new Button(contentRadioradio1, SWT.RADIO);
		radioradio1[1].setSelection(false);
		radioradio1[1].setText("val2");
		radioradio1[1].setBounds(10, 5, 75, 30);
		radioradio1[2] = new Button(contentRadioradio1, SWT.RADIO);
		radioradio1[2].setSelection(false);
		radioradio1[2].setText("val3");
		radioradio1[2].setBounds(10, 5, 75, 30);
				
		 // CASO COMBO
		Combo combocombo1 = new Combo(shell, SWT.SIMPLE);
		combocombo1.add("val1");
		combocombo1.add("val2");
		
		// CASO CHECKBOX
		Composite contentCheckcheck1 = new Composite(shell, SWT.BORDER);
		contentCheckcheck1.setLayout(new GridLayout(1, true));
		Button[] checkcheck1 = new Button[2];
		
		checkcheck1[0] = new Button(contentCheckcheck1, SWT.CHECK);
		checkcheck1[0].setText("val1");
		checkcheck1[1] = new Button(contentCheckcheck1, SWT.CHECK);
		checkcheck1[1].setText("val2");
				
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
		
		//Formularios_DASOFT.impl.InputTextoImpl
				
		//Formularios_DASOFT.impl.InputRadioImpl
		// CASO RADIO
		radioradio1[0].addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				texttexto1.setEnabled( !radioradio1[0].getSelection() );
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		
		//Formularios_DASOFT.impl.InputComboImpl
				
		//Formularios_DASOFT.impl.InputCheckImpl
		// CASO CHECKBOX
		checkcheck1[0].addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				texttexto1.setVisible( !checkcheck1[0].getSelection() );
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
				
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
