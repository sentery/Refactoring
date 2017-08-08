package com.cs.tu.analysis.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;



import com.cs.tu.analysis.metrics.MMethod;
import com.cs.tu.analysis.metrics.MetricsPackage;
import com.cs.tu.analysis.metrics.Param;
import com.cs.tu.analysis.metrics.Var;
import com.cs.tu.analysis.metrics.impl.MClassImpl;
import com.cs.tu.analysis.model.MethodDetail;
import com.cs.tu.analysis.model.VarDetail;

public class Analyzer {

	public List<MClassImpl> convertXMItoModel(String filePath){
		List<MClassImpl> mClassImplList = null;
		try {

			ResourceSet resourceSet = new ResourceSetImpl();

			// register UML
			Map packageRegistry = resourceSet.getPackageRegistry();
			packageRegistry.put(MetricsPackage.eNS_URI, MetricsPackage.eINSTANCE);

			// Register XML resource as UMLResource.Factory.Instance
			Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE
					.getExtensionToFactoryMap();
			extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
			//
			File file = new File(filePath);
//			Resource resource = resourceSet.getResource(URI.createURI("Models/metrics.xmi"), true);
			Resource resource = resourceSet.getResource(URI.createURI(file.toURI().toString()), true);
			mClassImplList = new ArrayList<MClassImpl>();
			// try to load the file into resource
			for (EObject eObj : resource.getContents()) {
				if(eObj instanceof MClassImpl){
					
					MClassImpl mClassImpl = (MClassImpl) eObj;
					mClassImplList.add(mClassImpl);
//					System.out.println(mClassImpl.getName());
//					if(mClassImpl.getMethods() != null){
//						
//						for (MMethod mMethod : mClassImpl.getMethods()) {
//							System.out.println(mMethod.getName());
//							
//							if(mMethod.getParams() != null){
//								
//								for (Param param  : mMethod.getParams()) {
//									System.out.println(param.getName());
//								}
//							}
//							
//							if(mMethod.getVars() != null){
//								for (Var var : mMethod.getVars()) {
//									System.out.println(var.getName());
//								}
//							}
//						}
//					}
				}
				
				System.out.println("-----------------");
				
			}
			


		} catch (Exception e) {
			e.printStackTrace();
		}
		return mClassImplList;

	}


}
