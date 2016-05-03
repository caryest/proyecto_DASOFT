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
	
	// Añadimos los elementos de la interfaz
	Label labeltexto1;
	Text  textotexto1;
	Button[] radioradio1;
	Combo combocombo1;
	Button[] checkcheck1;
	private Button botonvalidar;
	private Button botoncancelar;
	private Button botonguardar;
			
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
		shell.setLayout(new GridLayout(2, false));
		
		// Añadimos los elementos de la interfaz
		
		// CASO TEXTO
		Composite contentTexttexto1 = new Composite(shell, SWT.BORDER);
		contentTexttexto1.setLayout(new GridLayout(2, true));
		labeltexto1 = new Label(contentTexttexto1, SWT.NONE);
		textotexto1  = new Text(contentTexttexto1, SWT.BORDER);
		labeltexto1.setText("texto1");
				
		// CASO RADIO
		Composite contentRadioradio1 = new Composite(shell, SWT.BORDER);
		contentRadioradio1.setLayout(new GridLayout(1, true));
		radioradio1 = new Button[3];

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
		combocombo1 = new Combo(shell, SWT.SIMPLE);
		combocombo1.setText("combo1");
		combocombo1.add("val1");
		combocombo1.add("val2");
		
		// CASO CHECKBOX
		Composite contentCheckcheck1 = new Composite(shell, SWT.BORDER);
		contentCheckcheck1.setLayout(new GridLayout(1, true));
		checkcheck1 = new Button[2];
		
		checkcheck1[0] = new Button(contentCheckcheck1, SWT.CHECK);
		checkcheck1[0].setText("val1");
		checkcheck1[0].setEnabled(false);
		checkcheck1[1] = new Button(contentCheckcheck1, SWT.CHECK);
		checkcheck1[1].setText("val2");
		checkcheck1[1].setEnabled(false);
				
		// CASO BOTON
		botonvalidar = new Button(shell, SWT.BUTTON1);
		botonvalidar.setText("validar");
		botonvalidar.setEnabled(false);
		botonvalidar.setVisible(false);
				
		// CASO BOTON
		botoncancelar = new Button(shell, SWT.BUTTON1);
		botoncancelar.setText("cancelar");
		botoncancelar.setEnabled(false);
		botoncancelar.setVisible(false);
				
		// CASO BOTON
		botonguardar = new Button(shell, SWT.BUTTON1);
		botonguardar.setText("guardar");
		botonguardar.setEnabled(false);
		botonguardar.setVisible(false);
				
		// Funciones Reaccion
				// CASO RADIO
		radioradio1[0].addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				textotexto1.setEnabled( !radioradio1[0].getSelection() );
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {}
		});
				// CASO CHECKBOX
		checkcheck1[0].addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				textotexto1.setVisible( !checkcheck1[0].getSelection() );
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
				textotexto1.setVisible(true);
				textotexto1.setEnabled(true);
				radioradio1[0].setSelection(false);
				radioradio1[0].setVisible(true);
				radioradio1[0].setEnabled(true);
				radioradio1[1].setSelection(false);
				radioradio1[1].setVisible(true);
				radioradio1[1].setEnabled(true);
				radioradio1[2].setSelection(false);
				radioradio1[2].setVisible(true);
				radioradio1[2].setEnabled(true);
				combocombo1.deselect(0);
				combocombo1.setVisible(true);
				combocombo1.setEnabled(true);
				checkcheck1[0].setSelection(false);
				checkcheck1[0].setVisible(true);
				checkcheck1[0].setEnabled(true);
				checkcheck1[1].setSelection(false);
				checkcheck1[1].setVisible(true);
				checkcheck1[1].setEnabled(true);
				
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
			    dialog.setFilterExtensions(new String[] { "*.formulario", "*.*" });
			    dialog.setFileName("formulario.txt");
			    String filename = dialog.open(); 
			    
			    FileWriter writer = null; 
				try 
				{ 
					writer = new FileWriter(filename); 
					writer.write("textotexto1: " + textotexto1.getText() + "\n"); 
					String valoresRadioradio1 = "";
					for(Button btnRadio : radioradio1){
						if (btnRadio.getSelection() == true){
							valoresRadioradio1 += btnRadio.getText();
							valoresRadioradio1 += " ";
						}
					}
					writer.write("radioradio1: " + valoresRadioradio1 + "\n"); 
					writer.write("combocombo1: " + combocombo1.getText() + "\n"); 
					String valoresCheckcheck1= "";
					for(Button btnCheck : checkcheck1){
						if (btnCheck.getSelection() == true){
							valoresCheckcheck1 += btnCheck.getText();
							valoresCheckcheck1 += " ";
						}
					}
					writer.write("checkcheck1: " + valoresCheckcheck1 + "\n"); 
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
