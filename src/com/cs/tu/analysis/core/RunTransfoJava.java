package com.cs.tu.analysis.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;


public class RunTransfoJava {

	
	public static void main(String[] args) {
		try {
			/*
			 * Initializations
			 */
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();
			

			
			/*
			 * Load metamodels
			 */
			IReferenceModel gastMetamodel = modelFactory.newReferenceModel();
			injector.inject(gastMetamodel, "Metamodels/gastm.ecore");
			IReferenceModel cfgMetamodel = modelFactory.newReferenceModel();
			injector.inject(cfgMetamodel, "Metamodels/CFG.ecore");
			
			/*
			 * Run "Cut" transformation
			 */
			IModel gastModel = modelFactory.newModel(gastMetamodel);
			injector.inject(gastMetamodel,"Models/getprice.xmi");
			
//			transformationLauncher.initialize(new HashMap<String,Object>());
//			transformationLauncher.addInOutModel(gastMetamodel, "IN", "GAST");
//			IReferenceModel refiningTraceMetamodel = modelFactory.getBuiltInResource("RefiningTrace.ecore");
//			IModel refiningTraceModel = modelFactory.newModel(refiningTraceMetamodel);
//			transformationLauncher.addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace");
//			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),
//				new FileInputStream("Transformations/Cut.asm"));
			
//			IModel gastModel_Cut = gastMetamodel;
//			extractor.extract(gastModel_Cut, "Models/Java/gast_Cut.xmi");
			
			/*
			 * Run "ComputeTotal" transformation
			 */
			IModel cfgModel = modelFactory.newModel(cfgMetamodel);
			
			transformationLauncher.initialize(new HashMap<String,Object>());
			transformationLauncher.addInModel(gastModel, "IN", "GAST");
			transformationLauncher.addOutModel(cfgModel, "OUT", "CFG");
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),
				new FileInputStream("Transformations/GAST2CFG.asm"));
			
			extractor.extract(cfgModel, "Models/cfg.xmi");
			
			/*
			 * Unload all models and metamodels (EMF-specific)
			 */
			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) gastModel);
			emfModelFactory.unload((EMFModel) cfgModel);
			emfModelFactory.unload((EMFReferenceModel) gastMetamodel);
			emfModelFactory.unload((EMFReferenceModel) cfgMetamodel);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
