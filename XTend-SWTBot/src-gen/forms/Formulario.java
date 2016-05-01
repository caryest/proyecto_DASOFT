package forms;

import java.io.FileWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
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
		Text  textotexto1  = new Text(contentTexttexto1, SWT.BORDER);
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
				
		// CASO BOTON
		Button botonvalidar = new Button(shell, SWT.BUTTON1);
		botonvalidar.setText("validar");
				
		// CASO BOTON
		Button botoncancelar = new Button(shell, SWT.BUTTON1);
		botoncancelar.setText("cancelar");
				
		// CASO BOTON
		Button botonguardar = new Button(shell, SWT.BUTTON1);
		botonguardar.setText("guardar");
				
		// Funciones Reaccion
				// CASO RADIO
		radioradio1[1].addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				textotexto1.setEnabled( !radioradio1[1].getSelection() );
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
				// CASO CHECKBOX
		checkcheck1[1].addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				textotexto1.setVisible( !checkcheck1[1].getSelection() );
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
										
		// Funciones de Input de tipo BOTON
		// Caso Validar
		botonvalidar.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				
				String mensaje_error = "";
				boolean hay_error = false;
				
				if (textotexto1.getText().length() == 0){
					hay_error = true;
					mensaje_error += "*La entrada de texto 'texto1' no puede estar vacía.\n";
				}
				
				if (hay_error){
					MessageBox dialog = new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
					dialog.setText("Validación");
					dialog.setMessage(mensaje_error);
					
					// open dialog and await user selection
					dialog.open();
				}else{
					MessageBox dialog = new MessageBox(shell, SWT.ICON_INFORMATION | SWT.OK);
					dialog.setText("Validación");
					dialog.setMessage("Resultado de la validación correcto.");
					
					// open dialog and await user selection
					dialog.open();
				}
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		 // Caso Cancelar
		botoncancelar.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				
				textotexto1.setText("");
				radioradio1[0].setSelection(false);
				radioradio1[1].setSelection(false);
				radioradio1[2].setSelection(false);
				combocombo1.deselect(0);
				checkcheck1[0].setSelection(false);
				checkcheck1[1].setSelection(false);
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		 // Caso Guardar
		botonguardar.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				
				FileDialog dialog = new FileDialog(shell, SWT.SAVE);
			    dialog.setFilterNames(new String[] { "Formulario", "All Files (*.*)" });
			    dialog.setFilterExtensions(new String[] { "*.formulario", "*.*" }); // Windows
			                                    // wild
			                                    // cards
			    dialog.setFilterPath("c:\\"); // Windows path
			    dialog.setFileName("form.formulario");
			    String filename = dialog.open(); 
			    
			    while (!shell.isDisposed()) {
		        if (!display.readAndDispatch())
			        display.sleep();
			    }
			    display.dispose();
			    
			    FileWriter writer = null; 
				try 
				{ 
					writer = new FileWriter(filename); 
					writer.write(textotexto1 + ": " + textotexto1.getText() + "\n"); 
					String valoresRadioradio1 = "";
					for(Button btnRadio : radioradio1){
						if (btnRadio.getSelection() == true){
							valoresRadioradio1 += btnRadio.getText();
							valoresRadioradio1 += " ";
						}
					}
					writer.write(radioradio1 + ": " + valoresRadioradio1 + "\n"); 
					writer.write(combocombo1 + ": " + combocombo1.getText() + "\n"); 
					String valoresCheckcheck1= "";
					for(Button btnCheck : checkcheck1){
						if (btnCheck.getSelection() == true){
							valoresCheckcheck1 += btnCheck.getText();
							valoresCheckcheck1 += " ";
						}
					}
					writer.write(checkcheck1 + ": " + valoresCheckcheck1 + "\n"); 
					writer.write("This\n is\n an\n example\n"); 
				} 
				catch (Exception e) 
				{ 
					System.err.println("Error al guardar el archivo"); 
				} 
				finally 
				{ 
					try 
					{ 
						writer.close();
					} catch (Exception e) {} 
				} 
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
		
		// show form
		shell.pack();
		shell.open();
		return shell;
		
	}
}
