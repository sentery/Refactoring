package com.cs.tu.analysis.views;


import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.part.ViewPart;

import com.cs.tu.analysis.core.Analyzer;
import com.cs.tu.analysis.metrics.Var;
import com.cs.tu.analysis.metrics.impl.MClassImpl;
//import com.cs.tu.analysis.model.ModelProvider;
//import com.cs.tu.analysis.model.Person;
import com.cs.tu.analysis.metrics.impl.MMethodImpl;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class AnalysisView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.cs.tu.analysis.views.AnalysisView";
	private Table tableMetrics;
	private Table tableRefactoring;
	private static ComboViewer comboClass ;
	private static ComboViewer comboMethod ;
	private MClassImpl mClassImpl = null;

	public AnalysisView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */


	@Override
	public void setFocus() {
		
	}
	
	
	 
	 
	 
		public void createPartControl(Composite parent) {
			Group swtGroup = new Group(parent, SWT.NULL);
			swtGroup.setLayout(new GridLayout(1, false));
			Group groupClass = new Group(swtGroup, SWT.NULL);
			GridData gd_groupClass = new GridData(SWT.LEFT, SWT.CENTER, false, false, 800, 1);
			gd_groupClass.widthHint = 549;
			groupClass.setLayoutData(gd_groupClass);
			groupClass.setLayout(new GridLayout(2, false));
			
			Group groupTable = new Group(swtGroup, SWT.NULL);
			groupTable.setLayout(new GridLayout(2, false));
			
			parent.setLayout(new GridLayout(2, false));
			
//			new Label(parent, SWT.NONE);
//			new Label(parent, SWT.NONE);
			
			Label label = new Label(groupClass, SWT.NONE);
			label.setText("Class :");
		    
		    comboClass = new ComboViewer(groupClass, SWT.READ_ONLY);
		    Combo combo = comboClass.getCombo();
		    GridData gd_combo =new GridData(600);
		    gd_combo.minimumWidth = 500;
		    gd_combo.horizontalAlignment = SWT.LEFT;
		    gd_combo.widthHint = 400;
		    combo.setLayoutData(gd_combo);
		    comboClass.getControl().setLayoutData(new GridData(500));
		    comboClass.setContentProvider(ArrayContentProvider.getInstance());
		    
		        comboClass.setLabelProvider(new LabelProvider() {
		                @Override
		                public String getText(Object element) {
		               	 
		                        if (element instanceof MClassImpl) {
		                       	  mClassImpl = (MClassImpl) element;
		                                return mClassImpl.getName();
		                        }
		                        return super.getText(element);
		                }
		        });
		        comboClass.addSelectionChangedListener(new ISelectionChangedListener() {
		            @Override
		            public void selectionChanged(SelectionChangedEvent event) {
		                    IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		                    if (selection.size() > 0){
		                            mClassImpl = (MClassImpl) selection.getFirstElement();
		                            comboMethod.setInput(mClassImpl.getMethods());
		                    }
		            }
	     });

			
			
			
			Label lblMethods = new Label(groupClass, SWT.NONE);
			lblMethods.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			lblMethods.setText("Methods :");
			
//			comboMethod = new ComboViewer(parent, SWT.NONE);
//			Combo combo_1 = comboMethod.getCombo();
//			combo_1.setLayoutData(new GridData(SWT.F19, SWT.LEFT, true, false, 1, 1));
//			new Label(parent, SWT.NONE);
//			new Label(parent, SWT.NONE);
			 comboMethod = new ComboViewer(groupClass, SWT.READ_ONLY);
			 Combo combo_1 = comboMethod.getCombo();
			 GridData gd_combo_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
			 gd_combo_1.widthHint = 400;
			 combo_1.setLayoutData(gd_combo_1);
	         comboMethod.getControl().setLayoutData(new GridData(500));
	         comboMethod.setContentProvider(ArrayContentProvider.getInstance());
	     
	         comboMethod.setLabelProvider(new LabelProvider() {
	                 @Override
	                 public String getText(Object element) {
	                	 
	                         if (element instanceof MMethodImpl) {
	                        	 MMethodImpl mMethodImpl = (MMethodImpl) element;
	                                 return mMethodImpl.getName();
	                         }
	                         return super.getText(element);
	                 }
	         });
	         new Label(parent, SWT.NONE);
			new Label(parent, SWT.NONE);
			
			TabFolder tabFolder = new TabFolder(groupTable, SWT.NONE);
			GridData gd_tabFolder = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
			gd_tabFolder.heightHint = 159;
			gd_tabFolder.widthHint = 549;
			tabFolder.setLayoutData(gd_tabFolder);
			
			TabItem tbtmRefactoring = new TabItem(tabFolder, SWT.NONE);
			tbtmRefactoring.setText("Refactoring");		
			createRefactoringTable(tabFolder);
			tbtmRefactoring.setControl(tableRefactoring);   
			
			TabItem tbtmMetrics = new TabItem(tabFolder, SWT.NONE);
			tbtmMetrics.setText("Metrics");
			createMetricsTable(tabFolder);
			tbtmMetrics.setControl(tableMetrics);
			new Label(parent, SWT.NONE);
	         
	         
	         
			    
		}
		
		private  void createRefactoringTable(Composite parent){
			
			tableRefactoring = new Table(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
			tableRefactoring.setHeaderVisible(true);
			    final TableColumn tc0 = new TableColumn(tableRefactoring, SWT.LEFT);
			    final TableColumn tc1 = new TableColumn(tableRefactoring, SWT.CENTER);
			    final TableColumn tc2 = new TableColumn(tableRefactoring, SWT.CENTER);
			    tc0.setText("No.");
			    tc1.setText("Variable");
			    tc2.setText("Refactoring Type");
			    tc0.setWidth(50);
			    tc1.setWidth(150);
			    tc2.setWidth(500);
			    
			    
			    
			    comboMethod.addSelectionChangedListener(new ISelectionChangedListener(){

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						tableRefactoring.removeAll();
						  IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		                    if (selection.size() > 0){
		                    	
		                    	MMethodImpl mMethodImpl = (MMethodImpl) selection.getFirstElement();
		                    	if(mMethodImpl.getVars() != null){
		                    		
		                    		int count = 1;
		                    		TableItem itemVar  = null;
		                    		for (Var var : mMethodImpl.getVars()) {
		                    			itemVar = new TableItem(tableRefactoring, SWT.NONE);
		                    			itemVar.setText(0,count+"");
		                    			itemVar.setText(1, var.getName());
		                    			itemVar.setText(2, var.isIsRTQW() ? "Replace Temp With Query" : "-");
		                    			count++;
									}
		                    	}
		                    
		                    }
						
					}
			    	
			    });
			    
		}

		private  void createMetricsTable(Composite parent){
				tableMetrics = new Table(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);

			    tableMetrics.setHeaderVisible(true);
			    final TableColumn tc1 = new TableColumn(tableMetrics, SWT.LEFT);
			    final TableColumn tc2 = new TableColumn(tableMetrics, SWT.CENTER);
			    tc1.setText("Metric Name");
			    tc2.setText("Metric Value");
			    tc1.setWidth(70);
			    tc2.setWidth(500);
			    
				final TableItem tMLOC = new TableItem(tableMetrics, SWT.NONE);
            	tMLOC.setText(0,"MLOC");
            	
            	final TableItem tVG = new TableItem(tableMetrics, SWT.NONE);
            	tVG.setText(0,"VG");
            	
            	
            	final TableItem tPAR = new TableItem(tableMetrics, SWT.NONE);
            	tPAR.setText(0,"PAR");
            	
            	
            	final TableItem tNBD = new TableItem(tableMetrics, SWT.NONE);
            	tNBD.setText(0,"NBD");
            	
            	
            	
            	final TableItem tLCOM = new TableItem(tableMetrics, SWT.NONE);
            	tLCOM.setText(0,"LCOM");
			    comboMethod.addSelectionChangedListener(new ISelectionChangedListener(){

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
//						tableMetrics.removeAll();
						  IStructuredSelection selection = (IStructuredSelection) event.getSelection();
		                    if (selection.size() > 0){
		                    	MMethodImpl mMethodImpl = (MMethodImpl) selection.getFirstElement();
		                    
		               
		                    
		                    	tMLOC.setText(1,mMethodImpl.getMLOC() != null ? mMethodImpl.getMLOC()+"" : "0");
		                    	tVG.setText(1,mMethodImpl.getVG() != null ? mMethodImpl.getVG()+"" :"");
		                    	tPAR.setText(1,mMethodImpl.getPAR() != null ? mMethodImpl.getPAR()+"" : "0");
		                    	tNBD.setText(1,mMethodImpl.getNBD() != null ? mMethodImpl.getNBD()+"" : "0");
		                    	tLCOM.setText(1,mClassImpl != null ? mClassImpl.getLCOM()+ "" : "0");
		                    }
						
					}
			    	
			    });

		}


	public void runAnalysis(String filePath) {
		Analyzer analyzer = new Analyzer();
		List<MClassImpl>  mClassImplList = analyzer.convertXMItoModel(filePath);
		if(mClassImplList != null){
			comboClass.setInput(mClassImplList);
		}
	}

	
}