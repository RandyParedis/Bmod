package org.xtext.bmod;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.bmod.bmod.Floorplan;
import org.xtext.bmod.bmod.Import;

@SuppressWarnings("all")
public class BmodResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  public static final String INCLUDES = "includes";
  
  @Inject
  private ImportUriResolver uriResolver;
  
  @Override
  public boolean createEObjectDescriptions(final EObject eObject, final IAcceptor<IEObjectDescription> acceptor) {
    boolean _xifexpression = false;
    if ((eObject instanceof Floorplan)) {
      this.createEObjectDescriptionForBReact(((Floorplan)eObject), acceptor);
      return true;
    } else {
      _xifexpression = super.createEObjectDescriptions(eObject, acceptor);
    }
    return _xifexpression;
  }
  
  public void createEObjectDescriptionForBReact(final Floorplan floor, final IAcceptor<IEObjectDescription> acceptor) {
    final ArrayList<Object> uris = CollectionLiterals.<Object>newArrayList();
    final Consumer<Import> _function = (Import it) -> {
      uris.add(this.uriResolver.apply(it));
    };
    floor.getImports().forEach(_function);
    final HashMap<String, String> userData = new HashMap<String, String>();
    userData.put(BmodResourceDescriptionStrategy.INCLUDES, IterableExtensions.join(uris, ","));
    acceptor.accept(EObjectDescription.create(QualifiedName.create(floor.eResource().getURI().toString()), floor, userData));
  }
}
