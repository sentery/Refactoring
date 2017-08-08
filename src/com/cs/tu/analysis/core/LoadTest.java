package com.cs.tu.analysis.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
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
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import com.cs.tu.analysis.metrics.MMethod;
import com.cs.tu.analysis.metrics.MetricsPackage;
import com.cs.tu.analysis.metrics.Param;
import com.cs.tu.analysis.metrics.Var;
import com.cs.tu.analysis.metrics.impl.MClassImpl;
import com.cs.tu.analysis.metrics.impl.MMethodImpl;

public class LoadTest {
	
	private TableViewer viewer;
	private static ComboViewer comboClass ;
	private ComboViewer comboMethod ;
	private Display displayVar;
	private Label lblLCOM;
	private Label lblVG;
	private Label lblPAR;
	private Label lblNBD;
	private Label lblMLOC;
	

	
	  public LoadTest(Display display) {

	        initUI(display);
	    }
	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		try {

				Display display = new Display();
				LoadTest ex = new LoadTest(display);
		        display.dispose();
		       

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	 private void initUI(Display display) {
	        
		  Shell shell = new Shell(display, SWT.SHELL_TRIM | SWT.CENTER);

	      createPartControl(shell);
	        

	        shell.setText("Grid");
	        shell.pack();
	        shell.open();
	        
	        while (!shell.isDisposed()) {
	            if (!display.readAndDispatch())
	                display.sleep(); 
	        }
	    }


	
	

	 
	 
		public void createPartControl(Composite parent) {
			
	         Label classLabel = new Label(parent, SWT.NONE);
	         classLabel.setText("Class: ");
//	         final Text searchText = new Text(parent, SWT.BORDER | SWT.SEARCH);
//	         searchText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
//	                         | GridData.HORIZONTAL_ALIGN_FILL));
//			 GridLayout layout = new GridLayout(2, false);
	         GridLayout layout = new GridLayout(1, false);
	         parent.setLayout(layout);
	         
	         comboClass = new ComboViewer(parent, SWT.READ_ONLY);
	         comboClass.getControl().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                     | GridData.HORIZONTAL_ALIGN_FILL));
	         comboClass.setContentProvider(ArrayContentProvider.getInstance());
	     
	         comboClass.setInput(this.runAnalysis());
	         comboClass.setLabelProvider(new LabelProvider() {
	                 @Override
	                 public String getText(Object element) {
	                	 
	                         if (element instanceof MClassImpl) {
	                        	 MClassImpl mClassImpl = (MClassImpl) element;
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
	                             MClassImpl mClassImpl = (MClassImpl) selection.getFirstElement();
	                             comboMethod.setInput(mClassImpl.getMethods());
	                     }
	             }
	     });

	         
	         
	         Label methodLabel = new Label(parent, SWT.NONE);
	         methodLabel.setText("Method: ");
	         comboMethod = new ComboViewer(parent, SWT.READ_ONLY);
	         comboMethod.getControl().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                     | GridData.HORIZONTAL_ALIGN_FILL));
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
	         
	         
	         
	         
	         createViewer(parent);
			    
		}
		
		 private void createViewer(Composite parent) {
			 
			 Group outerGroup = new Group(parent, SWT.NONE);

			    // Tell the group to stretch in all directions
			    outerGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			    outerGroup.setLayout(new GridLayout(2, true));
			    outerGroup.setText("Group");
			    Button left = new Button(outerGroup, SWT.PUSH);
			    left.setText("Left");

			    // Tell the button to stretch in all directions
			    left.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

			    Button right = new Button(outerGroup, SWT.PUSH);
			    right.setText("Right");

			    // Tell the button to stretch in all directions
			    right.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			 
//			 
//	         viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
//	                         | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
//	         createColumns(parent, viewer);
//	         final Table table = viewer.getTable();
//	         table.setHeaderVisible(true);
//	         table.setLinesVisible(true);
//
//	         viewer.setContentProvider(new ArrayContentProvider());
//	         // get the content for the viewer, setInput will call getElements in the
//	         // contentProvider
////	         viewer.setInput(ModelProvider.INSTANCE.getPersons());
//	         // make the selection available to other views
////	         getSite().setSelectionProvider(viewer);
//	         // set the sorter for the table
//
//	         // define layout for the viewer
//	         GridData gridData = new GridData();
//	         gridData.verticalAlignment = GridData.FILL;
//	         gridData.horizontalSpan = 2;
//	         gridData.grabExcessHorizontalSpace = true;
//	         gridData.grabExcessVerticalSpace = true;
//	         gridData.horizontalAlignment = GridData.FILL;
//	         viewer.getControl().setLayoutData(gridData);
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
                	 MClassImpl mClassImpl = (MClassImpl) element;
                         return mClassImpl.getName();
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


	public static List<MClassImpl> runAnalysis() {
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
			Resource resource = resourceSet.getResource(URI.createURI("Models/metrics.xmi"), true);

			// try to load the file into resource
			mClassImplList = new ArrayList<MClassImpl>();
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
				
				
			}
		       

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mClassImplList;
	}

}
