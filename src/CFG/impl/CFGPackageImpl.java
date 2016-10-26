/**
 */
package CFG.impl;

import CFG.AbstractNode;
import CFG.CFGFactory;
import CFG.CFGPackage;
import CFG.ConditionalNode;
import CFG.IterativeNode;
import CFG.MControlFlowGraph;
import CFG.Node;
import CFG.Param;
import CFG.Var;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CFGPackageImpl extends EPackageImpl implements CFGPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mControlFlowGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iterativeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CFG.CFGPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CFGPackageImpl() {
		super(eNS_URI, CFGFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CFGPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CFGPackage init() {
		if (isInited) return (CFGPackage)EPackage.Registry.INSTANCE.getEPackage(CFGPackage.eNS_URI);

		// Obtain or create and register package
		CFGPackageImpl theCFGPackage = (CFGPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CFGPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CFGPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCFGPackage.createPackageContents();

		// Initialize created meta-data
		theCFGPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCFGPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CFGPackage.eNS_URI, theCFGPackage);
		return theCFGPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMControlFlowGraph() {
		return mControlFlowGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMControlFlowGraph_Nodes() {
		return (EReference)mControlFlowGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMControlFlowGraph_Name() {
		return (EAttribute)mControlFlowGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMControlFlowGraph_LocalVar() {
		return (EReference)mControlFlowGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_FromNode() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_ToNode() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Name() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_Var() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_DataFlow() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_DUse() {
		return (EAttribute)abstractNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNode_Params() {
		return (EReference)abstractNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalNode() {
		return conditionalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_TrueConditionNode() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_FalseConditionNode() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIterativeNode() {
		return iterativeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterativeNode_TrueConditionNode() {
		return (EReference)iterativeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterativeNode_FalseConditionNode() {
		return (EReference)iterativeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIterativeNode_Nodes() {
		return (EReference)iterativeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVar() {
		return varEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVar_Name() {
		return (EAttribute)varEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVar_Method() {
		return (EReference)varEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVar_Nodes() {
		return (EReference)varEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParam() {
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFGFactory getCFGFactory() {
		return (CFGFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mControlFlowGraphEClass = createEClass(MCONTROL_FLOW_GRAPH);
		createEReference(mControlFlowGraphEClass, MCONTROL_FLOW_GRAPH__NODES);
		createEAttribute(mControlFlowGraphEClass, MCONTROL_FLOW_GRAPH__NAME);
		createEReference(mControlFlowGraphEClass, MCONTROL_FLOW_GRAPH__LOCAL_VAR);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__FROM_NODE);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__TO_NODE);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__NAME);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__VAR);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__DATA_FLOW);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__DUSE);
		createEReference(abstractNodeEClass, ABSTRACT_NODE__PARAMS);

		nodeEClass = createEClass(NODE);

		conditionalNodeEClass = createEClass(CONDITIONAL_NODE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__TRUE_CONDITION_NODE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__FALSE_CONDITION_NODE);

		iterativeNodeEClass = createEClass(ITERATIVE_NODE);
		createEReference(iterativeNodeEClass, ITERATIVE_NODE__TRUE_CONDITION_NODE);
		createEReference(iterativeNodeEClass, ITERATIVE_NODE__FALSE_CONDITION_NODE);
		createEReference(iterativeNodeEClass, ITERATIVE_NODE__NODES);

		varEClass = createEClass(VAR);
		createEAttribute(varEClass, VAR__NAME);
		createEReference(varEClass, VAR__METHOD);
		createEReference(varEClass, VAR__NODES);

		paramEClass = createEClass(PARAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(this.getAbstractNode());
		conditionalNodeEClass.getESuperTypes().add(this.getAbstractNode());
		iterativeNodeEClass.getESuperTypes().add(this.getAbstractNode());
		paramEClass.getESuperTypes().add(this.getVar());

		// Initialize classes and features; add operations and parameters
		initEClass(mControlFlowGraphEClass, MControlFlowGraph.class, "MControlFlowGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMControlFlowGraph_Nodes(), this.getAbstractNode(), null, "nodes", null, 0, -1, MControlFlowGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMControlFlowGraph_Name(), ecorePackage.getEString(), "name", null, 1, 1, MControlFlowGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMControlFlowGraph_LocalVar(), this.getVar(), this.getVar_Method(), "localVar", null, 0, -1, MControlFlowGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNode_FromNode(), this.getAbstractNode(), this.getAbstractNode_ToNode(), "fromNode", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractNode_ToNode(), this.getAbstractNode(), this.getAbstractNode_FromNode(), "toNode", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAbstractNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractNode_Var(), this.getVar(), this.getVar_Nodes(), "var", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_DataFlow(), this.getAbstractNode(), null, "dataFlow", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_DUse(), ecorePackage.getEString(), "dUse", null, 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractNode_Params(), this.getNode(), null, "params", null, 0, -1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalNodeEClass, ConditionalNode.class, "ConditionalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalNode_TrueConditionNode(), this.getNode(), null, "trueConditionNode", null, 1, 1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionalNode_FalseConditionNode(), this.getNode(), null, "falseConditionNode", null, 1, 1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iterativeNodeEClass, IterativeNode.class, "IterativeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIterativeNode_TrueConditionNode(), this.getNode(), null, "trueConditionNode", null, 1, 1, IterativeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIterativeNode_FalseConditionNode(), this.getNode(), null, "falseConditionNode", null, 1, 1, IterativeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIterativeNode_Nodes(), this.getAbstractNode(), null, "nodes", null, 0, -1, IterativeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varEClass, Var.class, "Var", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVar_Method(), this.getMControlFlowGraph(), this.getMControlFlowGraph_LocalVar(), "method", null, 0, 1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVar_Nodes(), this.getAbstractNode(), this.getAbstractNode_Var(), "nodes", null, 0, -1, Var.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CFGPackageImpl
