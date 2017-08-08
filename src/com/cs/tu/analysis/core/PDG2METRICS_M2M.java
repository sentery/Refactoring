package com.cs.tu.analysis.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.osgi.framework.Bundle;

public class PDG2METRICS_M2M {
	private Properties properties; 

	/**
	* The IN model. 
	* @generated 
	*/ 
	protected IModel inModel;  

	/**
	* The OUT model. 
	* @generated 
	*/ 
	protected IModel outModel;  
	 
	/**
	* The main method. 
	*  
	* @param args 
	*            are the arguments 
	 * @throws CoreException 
	* @generated 
	*/ 
	
	
	public String  transfrom2Metrics(String pdgPath) throws CoreException{
		
		FileInputStream fi = null;
		String filePath = null;;
		try { 
			
			File file = new File(pdgPath);
			fi = new FileInputStream(file);
			PDG2METRICS_M2M runner = new PDG2METRICS_M2M(); 
		    runner.loadModels(fi); 
		    runner.doGAST2PDG_M2M(new NullProgressMonitor()); 
		 
		  
		    filePath = file.getPath();
//		    filePath = file.getLocation().toPortableString();
		    filePath = filePath.substring(0, filePath.lastIndexOf("\\"));
		    System.out.println(filePath);
//		    filePath = "file:///"+file.getPath()+"/metrics.xmi";
		    filePath = filePath+"\\metrics.xmi";
		    runner.saveModels(filePath); 
		    
		  } catch (ATLCoreException e) { 
		   e.printStackTrace(); 
		  } catch (IOException e) { 
		   e.printStackTrace(); 
		  } catch (ATLExecutionException e) { 
		   e.printStackTrace(); 
		  }
		return filePath; 
		 
	}
	

		 /**
		  * Constructor. 
		  * 
		  * @generated 
		  */ 
		 public PDG2METRICS_M2M() throws IOException { 
//		  properties = new Properties(); 
//		  properties.load(getFileURL("StateToArmy_M2M.properties").openStream()); 
//		  Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl()); 
		 } 
		  
		 /**
		  * Load the input and input/output models, initialize output models. 
		  *  
		  * @param inModelPath 
		  *            the IN model path 
		  * @throws ATLCoreException 
		  *             if a problem occurs while loading models 
		  * 
		  * @generated 
		  */ 
		 public void loadModels(InputStream inModelPath) throws ATLCoreException { 
			
			 try {
				 Bundle bundle = Platform.getBundle("com.cs.tu.analysis");
				 InputStream isPDG = bundle.getEntry("Metamodels/CFG.ecore").openStream();
				 ModelFactory factory = new EMFModelFactory(); 
				 IInjector injector = new EMFInjector(); 
				 IReferenceModel pdgMetamodel = factory.newReferenceModel(); 
				 injector.inject(pdgMetamodel, isPDG, null);
				 
				  IReferenceModel metricsMetamodel = factory.newReferenceModel(); 
				  InputStream isMTRX = bundle.getEntry("Metamodels/metrics.ecore").openStream();
				  injector.inject(metricsMetamodel, isMTRX,null); 
				  this.inModel = factory.newModel(pdgMetamodel); 
				  injector.inject(inModel, inModelPath, null); 
				  this.outModel = factory.newModel(metricsMetamodel); 
				
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 } 
		  
		 /**
		  * Save the output and input/output models. 
		  *  
		  * @param outModelPath 
		  *            the OUT model path 
		  * @throws ATLCoreException 
		  *             if a problem occurs while saving models 
		  * 
		  * @generated 
		  */ 
		 public  void saveModels(String outModelPath) throws ATLCoreException { 
		  IExtractor extractor = new EMFExtractor(); 
		  extractor.extract(outModel, outModelPath); 
		 
			
			
		 } 
		 
		 /**
		  * Transform the models. 
		  *  
		  * @param monitor 
		  *            the progress monitor 
		  * @throws ATLCoreException 
		  *             if an error occurs during models handling 
		  * @throws IOException 
		  *             if a module cannot be read 
		  * @throws ATLExecutionException 
		  *             if an error occurs during the execution 
		  * 
		  * @generated 
		  */ 
		 public Object doGAST2PDG_M2M(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException { 
		  ILauncher launcher = new EMFVMLauncher(); 
		  Map<String, Object> launcherOptions = new HashMap<String,Object>(); 
		  launcher.initialize(launcherOptions); 
		  launcher.addInModel(inModel, "IN", "PDG"); 
		  launcher.addOutModel(outModel, "OUT", "MTRIX"); 
		  return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList()); 
		 } 
		  
		 /**
		  * Returns an Array of the module input streams, parameterized by the 
		  * property file. 
		  *  
		  * @return an Array of the module input streams 
		  * @throws IOException 
		  *             if a module cannot be read 
		  * 
		  * @generated 
		  */ 
		 protected InputStream[] getModulesList() throws IOException { 
		  InputStream[]  modules = new InputStream[1]; 
//		  String modulesList = properties.getProperty("StateToArmy_M2M.modules"); 
//		  if (modulesList != null) { 
//		   String[] moduleNames = modulesList.split(","); 
		  
//		   for (int i = 0; i < moduleNames.length; i++) { 
//		    String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString(); 
		  	Bundle bundle = Platform.getBundle("com.cs.tu.analysis");
			InputStream is = bundle.getEntry("Transformations/PDG2METRICS.asm").openStream();
		    modules[0] = is;
//		   } 
//		  } 
		  return modules; 
		 } 
		  
		 /**
		  * Returns the URI of the given metamodel, parameterized from the property file. 
		  *  
		  * @param metamodelName 
		  *            the metamodel name 
		  * @return the metamodel URI 
		  * 
		  * @generated 
		  */ 
//		 protected String getMetamodelUri(String metamodelName) { 
//		  return properties.getProperty("StateToArmy_M2M.metamodels." + metamodelName); 
//		 } 
		  
		 /**
		  * Returns the file name of the given library, parameterized from the property file. 
		  *  
		  * @param libraryName 
		  *            the library name 
		  * @return the library file name 
		  * 
		  * @generated 
		  */ 
//		 protected InputStream getLibraryAsStream(String libraryName) throws IOException { 
//		  return getFileURL(properties.getProperty("StateToArmy_M2M.libraries." + libraryName)).openStream(); 
//		 } 
//		  
		 /**
		  * Returns the options map, parameterized from the property file. 
		  *  
		  * @return the options map 
		  * 
		  * @generated 
		  */ 
//		 protected Map<String, Object> getOptions() { 
//		  Map<String, Object> options = new HashMap<String, Object>(); 
//		  for (Entry<Object, Object> entry : properties.entrySet()) { 
//		   if (entry.getKey().toString().startsWith("StateToArmy_M2M.options.")) { 
//		    options.put(entry.getKey().toString().replaceFirst("StateToArmy_M2M.options.", ""),  
//		    entry.getValue().toString()); 
//		   } 
//		  } 
//		  return options; 
//		 } 
		  
		 /**
		  * Finds the file in the plug-in. Returns the file URL. 
		  *  
		  * @param fileName 
		  *            the file name 
		  * @return the file URL 
		  * @throws IOException 
		  *             if the file doesn't exist 
		  *  
		  * @generated 
		  */ 
//		 protected static URL getFileURL(String fileName) throws IOException { 
//		  final URL fileURL; 
//		  if (isEclipseRunning()) { 
//		   URL resourceURL = Gast2Cfg_M2M.class.getResource(fileName); 
//		   if (resourceURL != null) { 
//		    fileURL = FileLocator.toFileURL(resourceURL); 
//		   } else { 
//		    fileURL = null; 
//		   } 
//		  } else { 
//		   fileURL = Gast2Cfg_M2M.class.getResource(fileName); 
//		  } 
//		  if (fileURL == null) { 
//		   throw new IOException("'" + fileName + "' not found"); 
//		  } else { 
//		   return fileURL; 
//		  } 
//		 } 
		 
		 /**
		  * Tests if eclipse is running. 
		  *  
		  * @return <code>true</code> if eclipse is running 
		  * 
		  * @generated 
		  */ 
		 public static boolean isEclipseRunning() { 
		  try { 
		   return Platform.isRunning(); 
		  } catch (Throwable exception) { 
		   // Assume that we aren't running. 
		  } 
		  return false; 
		 } 
}
