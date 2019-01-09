//package org.xtext.bmod.generator;
//
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.xtext.generator.IFileSystemAccess;
//import org.eclipse.xtext.generator.IGenerator;
//import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
//
//import com.google.inject.Inject;
//
//
//public class IGeneratorRoot implements IGenerator {
//	
//	@Inject JvmModelGenerator jvmModelGenerator;
//	@Inject BmodGenerator bmodGenerator;
//
//	@Override
//	public void doGenerate(Resource input, IFileSystemAccess fsa) {
//		jvmModelGenerator.doGenerate(input, fsa);
//		bmodGenerator.doGenerate(input, fsa);
//	}
//
//}
