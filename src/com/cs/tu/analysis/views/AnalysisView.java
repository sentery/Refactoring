package com.cs.tu.analysis.views;


import java.util.List;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

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
	private List<VarDetail> varDetails;


	public AnalysisView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		
		GridLayout layout = new GridLayout(2, false);
		// parent is a Composite
		parent.setLayout(layout);
		Label lblPleaseEnterA = new Label(parent, SWT.NONE);
		lblPleaseEnterA.setText("Method:");
		
		 final Combo c1 = new Combo(parent, SWT.READ_ONLY);
		    c1.setBounds(50, 50, 150, 65);
		    final Combo c2 = new Combo(parent, SWT.READ_ONLY);
		    c2.setBounds(50, 85, 150, 65);
		    c2.setEnabled(false);
		    String items[] = { "Item One", "Item Two", "Item Three", "Item Four",
		        "Item Five" };
		    c1.setItems(items);
		    c1.addSelectionListener(new SelectionAdapter() {
		      public void widgetSelected(SelectionEvent e) {
		        if (c1.getText().equals("Item One")) {
		          String newItems[] = { "Item One A", "Item One B",
		              "Item One C" };
		          c2.setItems(newItems);
		          c2.setEnabled(true);
		        } else if (c1.getText().equals("Item Two")) {
		          String newItems[] = { "Item Two A", "Item Two B",
		              "Item Two C" };
		          c2.setItems(newItems);
		          c2.setEnabled(true);
		        } else {
		          c2.add("Not Applicable");
		          c2.setText("Not Applicable");
		        }

		      }
		    });
		    
		    
		    BundleContext ctx = FrameworkUtil.getBundle(AnalysisView.class).getBundleContext();
		    EventHandler handler = new EventHandler() {
		      public void handleEvent(final Event event) {
		    	  List<VarDetail> varDetailList =  (List<VarDetail>) event.getProperty("varsParam");
		    	  if(varDetailList != null){
		    		  for (VarDetail varDetail : varDetailList) {
						System.out.println(varDetail.getVarName());
					}
		    	  }
		      }
		    };
		  
		    
//		Text text = new Text(parent, SWT.BORDER);
//		GridData gd_text = new GridData(SWT.FILL, SWT.CENTER, true, false);
//		gd_text.horizontalIndent = 8;
//		text.setLayoutData(gd_text);
//		GridData data = new GridData(SWT.FILL, SWT.TOP, true, false);
//
//		// create the decoration for the text component
//		final ControlDecoration deco = new ControlDecoration(text, SWT.TOP
//		        | SWT.LEFT);
//
//		// use an existing image
//		Image image = FieldDecorationRegistry.getDefault()
//		        .getFieldDecoration(FieldDecorationRegistry.DEC_INFORMATION)
//		        .getImage();
//
//		// set description and image
//		deco.setDescriptionText("Use CTRL + SPACE to see possible values");
//		deco.setImage(image);
//
//		// always show decoration
//		deco.setShowOnlyOnFocus(false);
//
//		// hide the decoration if the text component has content
//		text.addModifyListener(new ModifyListener() {
//		        @Override
//		        public void modifyText(ModifyEvent e) {
//		                Text text = (Text) e.getSource();
//		                if (!text.getText().isEmpty()) {
//		                         deco.hide();
//		                } else {
//		                         deco.show();
//		                }
//		                        }
//		});

		
		
		
		
		
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

	public List<VarDetail> getVarDetails() {
		return varDetails;
	}

	public void setVarDetails(List<VarDetail> varDetails) {
		
		  
	    	for (VarDetail varDetail : varDetails) {
				System.out.println(">>>"+varDetail.getVarName());
	    }
		this.varDetails = varDetails;
	}

	
}