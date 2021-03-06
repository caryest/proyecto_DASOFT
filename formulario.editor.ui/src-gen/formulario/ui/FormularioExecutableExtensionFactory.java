/*
 * generated by Xtext
 */
package formulario.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import formulario.ui.internal.FormularioActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FormularioExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FormularioActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return FormularioActivator.getInstance().getInjector(FormularioActivator.FORMULARIO_FORMULARIO);
	}
	
}
