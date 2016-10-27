package com.cs.tu.analysis.views;


import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

import com.cs.tu.analysis.core.Analyzer;
import com.cs.tu.analysis.model.MethodDetail;
import com.cs.tu.analysis.model.ModelProvider;
import com.cs.tu.analysis.model.Person;
import com.cs.tu.analysis.model.VarDetail;


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

	private TableViewer viewer;
	private ComboViewer comboMethod ;
	
//	   private static final Image CHECKED = Activator.getImageDescriptor(
//               "icons/checked.gif").createImage();
//	   private static final Image UNCHECKED = Activator.getImageDescriptor(
//               "icons/unchecked.gif").createImage();

	public AnalysisView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */


	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
		
	}
	
	 private void createViewer(Composite parent) {
		 
         viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
                         | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
         createColumns(parent, viewer);
         final Table table = viewer.getTable();
         table.setHeaderVisible(true);
         table.setLinesVisible(true);

         viewer.setContentProvider(new ArrayContentProvider());
         // get the content for the viewer, setInput will call getElements in the
         // contentProvider
//         viewer.setInput(ModelProvider.INSTANCE.getPersons());
         // make the selection available to other views
         getSite().setSelectionProvider(viewer);
         // set the sorter for the table

         // define layout for the viewer
         GridData gridData = new GridData();
         gridData.verticalAlignment = GridData.FILL;
         gridData.horizontalSpan = 2;
         gridData.grabExcessHorizontalSpace = true;
         gridData.grabExcessVerticalSpace = true;
         gridData.horizontalAlignment = GridData.FILL;
         viewer.getControl().setLayoutData(gridData);
 }
	 
	 
	 
		public void createPartControl(Composite parent) {
			
			 GridLayout layout = new GridLayout(2, false);
	         parent.setLayout(layout);
	         Label searchLabel = new Label(parent, SWT.NONE);
	         searchLabel.setText("Method: ");
//	         final Text searchText = new Text(parent, SWT.BORDER | SWT.SEARCH);
//	         searchText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
//	                         | GridData.HORIZONTAL_ALIGN_FILL));
	         
	         
	         comboMethod = new ComboViewer(parent, SWT.READ_ONLY);
	         comboMethod.getControl().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                     | GridData.HORIZONTAL_ALIGN_FILL));
	         comboMethod.setContentProvider(ArrayContentProvider.getInstance());
	     
	         comboMethod.setLabelProvider(new LabelProvider() {
	                 @Override
	                 public String getText(Object element) {
	                         if (element instanceof MethodDetail) {
	                        	 MethodDetail methodDetail = (MethodDetail) element;
	                                 return methodDetail.getMethodName();
	                         }
	                         return super.getText(element);
	                 }
	         });
	         comboMethod.addSelectionChangedListener(new ISelectionChangedListener() {
	             @Override
	             public void selectionChanged(SelectionChangedEvent event) {
	                     IStructuredSelection selection = (IStructuredSelection) event.getSelection();
	                     if (selection.size() > 0){
	                             MethodDetail methodDetail = (MethodDetail) selection.getFirstElement();
	                             viewer.setInput(methodDetail.getVarDetails());
	                     }
	             }
	     });

	         createViewer(parent);
			    
		}

 public TableViewer getViewer() {
         return viewer;
 }
 // create the columns for the table
 private void createColumns(final Composite parent, final TableViewer viewer) {
         String[] titles = { "Element", "Refactoring", "Rule", "Method" };
         int[] bounds = { 100, 100, 100, 100 };

         // first column is for the first name
         TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
         col.setLabelProvider(new ColumnLabelProvider() {
                 @Override
                 public String getText(Object element) {
                	 VarDetail v = (VarDetail) element;
                         return v.getVarName();
                 }
         });

//         // second column is for the last name
//         col = createTableViewerColumn(titles[1], bounds[1], 1);
//         col.setLabelProvider(new ColumnLabelProvider() {
//                 @Override
//                 public String getText(Object element) {
//                         Person p = (Person) element;
//                         return p.getLastName();
//                 }
//         });
//
//         // now the gender
//         col = createTableViewerColumn(titles[2], bounds[2], 2);
//         col.setLabelProvider(new ColumnLabelProvider() {
//                 @Override
//                 public String getText(Object element) {
//                         Person p = (Person) element;
//                         return p.getGender();
//                 }
//         });
//
//         // now the status married
//         col = createTableViewerColumn(titles[3], bounds[3], 3);
//         col.setLabelProvider(new ColumnLabelProvider() {
//                 @Override
//                 public String getText(Object element) {
//                         return null;
//                 }
//
//
//         });

 }

 private TableViewerColumn createTableViewerColumn(String title, int bound, final int colNumber) {
         final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
                         SWT.NONE);
         final TableColumn column = viewerColumn.getColumn();
         column.setText(title);
         column.setWidth(bound);
         column.setResizable(true);
         column.setMoveable(true);
         return viewerColumn;
 }


	public void runAnalysis(String filePath) {
		Analyzer analyzer = new Analyzer();
		List<MethodDetail>  methodDetailLest = analyzer.convertXMItoModel(filePath);
		if(methodDetailLest != null){
			comboMethod.setInput(methodDetailLest);
		}
	}

	
}