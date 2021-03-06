/**
 * generated by Xtext
 */
package formulario.scoping;

import Formularios_DASOFT.AccionPulsacion;
import Formularios_DASOFT.AccionSeleccion;
import Formularios_DASOFT.AccionValor;
import Formularios_DASOFT.Formulario;
import Formularios_DASOFT.Input;
import Formularios_DASOFT.InputBoton;
import Formularios_DASOFT.InputMultiple;
import Formularios_DASOFT.InputTexto;
import Formularios_DASOFT.Layout;
import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class FormularioScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_AccionSeleccion_elemento(final AccionSeleccion accion, final EReference ref) {
    IScope _xblockexpression = null;
    {
      boolean _equals = Objects.equal(accion, null);
      if (_equals) {
        return null;
      }
      EObject _eContainer = accion.eContainer();
      boolean _equals_1 = Objects.equal(_eContainer, null);
      if (_equals_1) {
        return null;
      }
      EObject _eContainer_1 = accion.eContainer();
      EObject _eContainer_2 = _eContainer_1.eContainer();
      Formulario form = ((Formulario) _eContainer_2);
      Layout inputs = form.getLayout();
      ArrayList<InputMultiple> scope = new ArrayList<InputMultiple>();
      EList<Input> _entradas = inputs.getEntradas();
      for (final Input input : _entradas) {
        if ((input instanceof InputMultiple)) {
          scope.add(((InputMultiple)input));
        }
      }
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_AccionPulsacion_elemento(final AccionPulsacion accion, final EReference ref) {
    IScope _xblockexpression = null;
    {
      boolean _equals = Objects.equal(accion, null);
      if (_equals) {
        return null;
      }
      EObject _eContainer = accion.eContainer();
      boolean _equals_1 = Objects.equal(_eContainer, null);
      if (_equals_1) {
        return null;
      }
      EObject _eContainer_1 = accion.eContainer();
      EObject _eContainer_2 = _eContainer_1.eContainer();
      Formulario form = ((Formulario) _eContainer_2);
      Layout inputs = form.getLayout();
      ArrayList<InputBoton> scope = new ArrayList<InputBoton>();
      EList<Input> _entradas = inputs.getEntradas();
      for (final Input input : _entradas) {
        if ((input instanceof InputBoton)) {
          scope.add(((InputBoton)input));
        }
      }
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
  
  public IScope scope_AccionValor_elemento(final AccionValor accion, final EReference ref) {
    IScope _xblockexpression = null;
    {
      boolean _equals = Objects.equal(accion, null);
      if (_equals) {
        return null;
      }
      EObject _eContainer = accion.eContainer();
      boolean _equals_1 = Objects.equal(_eContainer, null);
      if (_equals_1) {
        return null;
      }
      EObject _eContainer_1 = accion.eContainer();
      EObject _eContainer_2 = _eContainer_1.eContainer();
      Formulario form = ((Formulario) _eContainer_2);
      Layout inputs = form.getLayout();
      ArrayList<InputTexto> scope = new ArrayList<InputTexto>();
      EList<Input> _entradas = inputs.getEntradas();
      for (final Input input : _entradas) {
        if ((input instanceof InputTexto)) {
          scope.add(((InputTexto)input));
        }
      }
      _xblockexpression = Scopes.scopeFor(scope);
    }
    return _xblockexpression;
  }
}
