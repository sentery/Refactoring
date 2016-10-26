package com.cs.tu.analysis.handlers;

import java.security.acl.LastOwnerException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.cs.tu.analysis.core.Gast2Cfg_M2M;

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
				
				Gast2Cfg_M2M Gast2Cfg_M2M = new Gast2Cfg_M2M();
				Gast2Cfg_M2M.transfrom2CFG(file);
//				System.out.println(path.toPortableString());
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
