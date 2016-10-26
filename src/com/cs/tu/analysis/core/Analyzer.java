package com.cs.tu.analysis.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import CFG.AbstractNode;
import CFG.CFGPackage;
import CFG.Var;
import CFG.impl.ConditionalNodeImpl;
import CFG.impl.IterativeNodeImpl;
import CFG.impl.MControlFlowGraphImpl;
import CFG.impl.NodeImpl;

import com.cs.tu.analysis.model.VarDetail;
import com.cs.tu.analysis.model.VarPath;
import com.cs.tu.analysis.views.AnalysisView;

public class Analyzer {

	public void convertXMItoModel(String filePath){

		try {

			ResourceSet resourceSet = new ResourceSetImpl();

			// register UML
			Map packageRegistry = resourceSet.getPackageRegistry();
			packageRegistry.put(CFGPackage.eNS_URI, CFGPackage.eINSTANCE);

			// Register XML resource as UMLResource.Factory.Instance
			Map extensionFactoryMap = Resource.Factory.Registry.INSTANCE
					.getExtensionToFactoryMap();
			extensionFactoryMap.put("xmi", new XMIResourceFactoryImpl());
			//
			
			System.out.println(filePath);
			Resource resource = resourceSet.getResource(
					URI.createURI(filePath), true);

			// try to load the file into resource
			List<AbstractNode> nodeList = null;
			List<VarDetail> varDetailList = null;
			for (EObject eObj : resource.getContents()) {
				
				MControlFlowGraphImpl mControlFlowGraphImpl = (MControlFlowGraphImpl) eObj;

				EList<Var> localVars = mControlFlowGraphImpl.getLocalVar();
				if (localVars != null && localVars.size() > 0) {
					varDetailList = new ArrayList<VarDetail>();
					for (Var var : localVars) {
						nodeList = new ArrayList<AbstractNode>();

						if (mControlFlowGraphImpl.getNodes() != null) {
							for (AbstractNode aNode : mControlFlowGraphImpl.getNodes()) {

								if (aNode instanceof NodeImpl) {
									NodeImpl node = (NodeImpl) aNode;
									if (node.getVar() != null) {
										for (Var v : node.getVar()) {
											if (v.getName().equals(var.getName())) {
											
												nodeList.add(aNode);
												break;
											}

										}

									}
								}

								if (aNode instanceof ConditionalNodeImpl) {
									ConditionalNodeImpl conNode = (ConditionalNodeImpl) aNode;
									if (conNode.getVar() != null) {
										for (Var v : conNode.getVar()) {
											if (v.getName().equals(var.getName())) {
												
												nodeList.add(conNode);
												break;
											}

										}
									}

										if (conNode.getTrueConditionNode() != null) {
											EList<Var> vList = conNode.getTrueConditionNode().getVar();
											if (vList != null) {
												for (Var v : vList) {
													if (v.getName().equals(var.getName())) {
														nodeList.add(conNode.getTrueConditionNode());
														break;
													}
												}
											}
										}

										if (conNode.getFalseConditionNode() != null) {
											EList<Var> vList = conNode.getFalseConditionNode().getVar();
											if (vList != null) {
												for (Var v : vList) {
													if (v.getName().equals(var.getName())) {
														nodeList.add(conNode.getFalseConditionNode());
														break;
													}
												}
											}
										}
								

								}

								if (aNode instanceof IterativeNodeImpl) {
									IterativeNodeImpl iNode = (IterativeNodeImpl) aNode;
									if (iNode.getVar() != null) {
										for (Var v : iNode.getVar()) {
											if (v.getName().equals(
													var.getName())) {
												nodeList.add(iNode);
												break;
											}

										}

									}

								}
							}
							
							
							
							
							VarDetail varDetail = new VarDetail();
							if(nodeList != null && nodeList.size() > 0){
								
								VarPath varPath = null;
								Set<AbstractNode> visitNode = new HashSet<AbstractNode>();
								
								AbstractNode rootNode = nodeList.get(0);
								visitNode.add(rootNode);
								for (AbstractNode aNode : nodeList) {
									
									if(!visitNode.contains(aNode)){
										varPath = new VarPath();
										varPath.getNodePathList().add(rootNode);
										varPath.getNodePathList().add(aNode);
										visitNode.add(aNode);
										
										
										if(aNode.getDataFlow() != null && aNode.getDataFlow().size() > 0){
											for (AbstractNode dfNode : aNode.getDataFlow()) {
												
												if(!visitNode.contains(dfNode)){
													varPath.getNodePathList().add(dfNode);
												}
												
//												}
											}
										}
										varDetail.getPathList().add(varPath);
									}
									
									

									
								}
							
							}
							varDetailList.add(varDetail);
						}
						
						
						 
//						AnalysisView analysisView =	(AnalysisView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(AnalysisView.ID);
//						analysisView.setVarDetails(varDetailList);
						
						
						
					}
					 BundleContext ctx = FrameworkUtil.getBundle(AnalysisView.class).getBundleContext();
				        ServiceReference<EventAdmin> ref = ctx.getServiceReference(EventAdmin.class);
				        EventAdmin eventAdmin = ctx.getService(ref);
				        Map<String,Object> properties = new HashMap<String, Object>();
				        properties.put("varsParam", varDetailList);
				     
				        Event event = new Event("viewcommunication/syncEvent", properties);
				        eventAdmin.sendEvent(event);
				                 
				        event = new Event("viewcommunication/asyncEvent", properties);
				        eventAdmin.postEvent(event);
					
				}

			}
			


		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}