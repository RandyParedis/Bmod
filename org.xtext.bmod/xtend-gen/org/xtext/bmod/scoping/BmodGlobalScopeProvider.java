package org.xtext.bmod.scoping;

import com.google.common.base.Splitter;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.bmod.BmodResourceDescriptionStrategy;
import org.xtext.bmod.bmod.BmodPackage;

@SuppressWarnings("all")
public class BmodGlobalScopeProvider extends ImportUriGlobalScopeProvider {
  private static final Splitter SPLITTER = Splitter.on(",");
  
  @Inject
  private IResourceDescription.Manager descriptionManager;
  
  @Inject
  private IResourceScopeCache cache;
  
  @Override
  protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
    abstract class __BmodGlobalScopeProvider_1 implements Provider<LinkedHashSet<URI>> {
      final __BmodGlobalScopeProvider_1 _this__BmodGlobalScopeProvider_1 = this;
      
      public abstract LinkedHashSet<URI> collectImportUris(final Resource resource, final LinkedHashSet<URI> uniqueImportURIs);
    }
    
    String _simpleName = BmodGlobalScopeProvider.class.getSimpleName();
    __BmodGlobalScopeProvider_1 ___BmodGlobalScopeProvider_1 = new __BmodGlobalScopeProvider_1() {
      @Override
      public LinkedHashSet<URI> get() {
        LinkedHashSet<URI> _linkedHashSet = new LinkedHashSet<URI>(5);
        final LinkedHashSet<URI> uniqueImportURIs = this.collectImportUris(resource, _linkedHashSet);
        final Iterator<URI> uriIter = uniqueImportURIs.iterator();
        while (uriIter.hasNext()) {
          boolean _isValidUri = EcoreUtil2.isValidUri(resource, uriIter.next());
          boolean _not = (!_isValidUri);
          if (_not) {
            uriIter.remove();
          }
        }
        return uniqueImportURIs;
      }
      
      public LinkedHashSet<URI> collectImportUris(final Resource resource, final LinkedHashSet<URI> uniqueImportURIs) {
        final IResourceDescription resourceDescription = BmodGlobalScopeProvider.this.descriptionManager.getResourceDescription(resource);
        final Iterable<IEObjectDescription> models = resourceDescription.getExportedObjectsByType(BmodPackage.Literals.FLOORPLAN);
        InputOutput.<Iterable<IEObjectDescription>>println(models);
        final Consumer<IEObjectDescription> _function = (IEObjectDescription it) -> {
          final String userData = it.getUserData(BmodResourceDescriptionStrategy.INCLUDES);
          if ((userData != null)) {
            final Consumer<String> _function_1 = (String uri) -> {
              URI includedUri = URI.createURI(uri);
              includedUri = includedUri.resolve(resource.getURI());
              boolean _add = uniqueImportURIs.add(includedUri);
              if (_add) {
                this.collectImportUris(resource.getResourceSet().getResource(includedUri, true), uniqueImportURIs);
              }
            };
            BmodGlobalScopeProvider.SPLITTER.split(userData).forEach(_function_1);
          }
        };
        models.forEach(_function);
        return uniqueImportURIs;
      }
    };
    return this.cache.<LinkedHashSet<URI>>get(_simpleName, resource, ___BmodGlobalScopeProvider_1);
  }
}
