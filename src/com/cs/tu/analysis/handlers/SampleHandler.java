package com.cs.tu.analysis.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.cs.tu.analysis.core.GAST2PDG_M2M;
import com.cs.tu.analysis.core.PDG2METRICS_M2M;
import com.cs.tu.analysis.views.AnalysisView;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public SampleHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			// get workbench window
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			// set selection service
			ISelectionService service = window.getSelectionService();
			// set structured selection
			IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		 
			//check if it is an IFile
			if (structured.getFirstElement() instanceof IFile) {
				// get the selected file
				IFile file = (IFile) structured.getFirstElement();
			
				// get the path
				IPath path = file.getLocation();
				
				GAST2PDG_M2M gast2Cfg_M2M = new GAST2PDG_M2M();
				String filePath = gast2Cfg_M2M.transfrom2PDG(file);
				if(filePath != null){
					
				PDG2METRICS_M2M pdg2Metrics_M2M = new PDG2METRICS_M2M();
				String metricsPath = pdg2Metrics_M2M.transfrom2Metrics(filePath);
				if( metricsPath != null) {
					AnalysisView analysisView =	(AnalysisView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(AnalysisView.ID);
					analysisView.runAnalysis(metricsPath);
				}
					
				}

			}else{
				MessageDialog.openInformation(
						window.getShell(),
						"FindRefactor",
						"Hello, Eclipse world");
			}
		 
			//check if it is an ICompilationUnit
//			if (structured.getFirstElement() instanceof ICompilationUnit) {
//				ICompilationUnit cu = (ICompilationUnit) structured.getFirstElement();
//				System.out.println(cu.getElementName());
//			}
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void main(String[] args){
		String xx = "C:/Documents and Settings/true/workspace_model/CaseStudy/output.gast";
		xx = xx.substring(0, xx.lastIndexOf("/"));
		System.out.println(xx);
	}
}
