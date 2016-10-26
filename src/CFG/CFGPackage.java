/**
 */
package CFG;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CFG.CFGFactory
 * @model kind="package"
 * @generated
 */
public interface CFGPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CFG";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com/cs/tu/findrefactor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.cs.tu.findrefactor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CFGPackage eINSTANCE = CFG.impl.CFGPackageImpl.init();

	/**
	 * The meta object id for the '{@link CFG.impl.MControlFlowGraphImpl <em>MControl Flow Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CFG.impl.MControlFlowGraphImpl
	 * @see CFG.impl.CFGPackageImpl#getMControlFlowGraph()
	 * @generated
	 */
	int MCONTROL_FLOW_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FLOW_GRAPH__NODES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FLOW_GRAPH__NAME = 1;

	/**
	 * The feature id for the '<em><b>Local Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FLOW_GRAPH__LOCAL_VAR = 2;

	/**
	 * The number of structural features of the '<em>MControl Flow Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONTROL_FLOW_GRAPH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link CFG.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CFG.impl.AbstractNodeImpl
	 * @see CFG.impl.CFGPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 1;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__FROM_NODE = 0;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__TO_NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__VAR = 3;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__DATA_FLOW = 4;

	/**
	 * The feature id for the '<em><b>DUse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__DUSE = 5;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__PARAMS = 6;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link CFG.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CFG.impl.NodeImpl
	 * @see CFG.impl.CFGPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FROM_NODE = ABSTRACT_NODE__FROM_NODE;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TO_NODE = ABSTRACT_NODE__TO_NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VAR = ABSTRACT_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DATA_FLOW = ABSTRACT_NODE__DATA_FLOW;

	/**
	 * The feature id for the '<em><b>DUse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DUSE = ABSTRACT_NODE__DUSE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARAMS = ABSTRACT_NODE__PARAMS;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link CFG.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CFG.impl.ConditionalNodeImpl
	 * @see CFG.impl.CFGPackageImpl#getConditionalNode()
	 * @generated
	 */
	int CONDITIONAL_NODE = 3;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__FROM_NODE = ABSTRACT_NODE__FROM_NODE;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__TO_NODE = ABSTRACT_NODE__TO_NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__VAR = ABSTRACT_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__DATA_FLOW = ABSTRACT_NODE__DATA_FLOW;

	/**
	 * The feature id for the '<em><b>DUse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__DUSE = ABSTRACT_NODE__DUSE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__PARAMS = ABSTRACT_NODE__PARAMS;

	/**
	 * The feature id for the '<em><b>True Condition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__TRUE_CONDITION_NODE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Condition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE__FALSE_CONDITION_NODE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link CFG.impl.IterativeNodeImpl <em>Iterative Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CFG.impl.IterativeNodeImpl
	 * @see CFG.impl.CFGPackageImpl#getIterativeNode()
	 * @generated
	 */
	int ITERATIVE_NODE = 4;

	/**
	 * The feature id for the '<em><b>From Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__FROM_NODE = ABSTRACT_NODE__FROM_NODE;

	/**
	 * The feature id for the '<em><b>To Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__TO_NODE = ABSTRACT_NODE__TO_NODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__NAME = ABSTRACT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__VAR = ABSTRACT_NODE__VAR;

	/**
	 * The feature id for the '<em><b>Data Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__DATA_FLOW = ABSTRACT_NODE__DATA_FLOW;

	/**
	 * The feature id for the '<em><b>DUse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__DUSE = ABSTRACT_NODE__DUSE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__PARAMS = ABSTRACT_NODE__PARAMS;

	/**
	 * The feature id for the '<em><b>True Condition Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__TRUE_CONDITION_NODE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Condition Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__FALSE_CONDITION_NODE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE__NODES = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Iterative Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATIVE_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link CFG.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CFG.impl.VarImpl
	 * @see CFG.impl.CFGPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' container reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__NODES = 2;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link CFG.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CFG.impl.ParamImpl
	 * @see CFG.impl.CFGPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = VAR__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__METHOD = VAR__METHOD;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' container reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NODES = VAR__NODES;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = VAR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CFG.MControlFlowGraph <em>MControl Flow Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MControl Flow Graph</em>'.
	 * @see CFG.MControlFlowGraph
	 * @generated
	 */
	EClass getMControlFlowGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link CFG.MControlFlowGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see CFG.MControlFlowGraph#getNodes()
	 * @see #getMControlFlowGraph()
	 * @generated
	 */
	EReference getMControlFlowGraph_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link CFG.MControlFlowGraph#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CFG.MControlFlowGraph#getName()
	 * @see #getMControlFlowGraph()
	 * @generated
	 */
	EAttribute getMControlFlowGraph_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link CFG.MControlFlowGraph#getLocalVar <em>Local Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Var</em>'.
	 * @see CFG.MControlFlowGraph#getLocalVar()
	 * @see #getMControlFlowGraph()
	 * @generated
	 */
	EReference getMControlFlowGraph_LocalVar();

	/**
	 * Returns the meta object for class '{@link CFG.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see CFG.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the reference list '{@link CFG.AbstractNode#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Node</em>'.
	 * @see CFG.AbstractNode#getFromNode()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_FromNode();

	/**
	 * Returns the meta object for the reference '{@link CFG.AbstractNode#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Node</em>'.
	 * @see CFG.AbstractNode#getToNode()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_ToNode();

	/**
	 * Returns the meta object for the attribute '{@link CFG.AbstractNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CFG.AbstractNode#getName()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link CFG.AbstractNode#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see CFG.AbstractNode#getVar()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_Var();

	/**
	 * Returns the meta object for the reference list '{@link CFG.AbstractNode#getDataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Flow</em>'.
	 * @see CFG.AbstractNode#getDataFlow()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_DataFlow();

	/**
	 * Returns the meta object for the attribute '{@link CFG.AbstractNode#getDUse <em>DUse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DUse</em>'.
	 * @see CFG.AbstractNode#getDUse()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_DUse();

	/**
	 * Returns the meta object for the containment reference list '{@link CFG.AbstractNode#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see CFG.AbstractNode#getParams()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EReference getAbstractNode_Params();

	/**
	 * Returns the meta object for class '{@link CFG.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see CFG.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link CFG.ConditionalNode <em>Conditional Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Node</em>'.
	 * @see CFG.ConditionalNode
	 * @generated
	 */
	EClass getConditionalNode();

	/**
	 * Returns the meta object for the containment reference '{@link CFG.ConditionalNode#getTrueConditionNode <em>True Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>True Condition Node</em>'.
	 * @see CFG.ConditionalNode#getTrueConditionNode()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_TrueConditionNode();

	/**
	 * Returns the meta object for the containment reference '{@link CFG.ConditionalNode#getFalseConditionNode <em>False Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>False Condition Node</em>'.
	 * @see CFG.ConditionalNode#getFalseConditionNode()
	 * @see #getConditionalNode()
	 * @generated
	 */
	EReference getConditionalNode_FalseConditionNode();

	/**
	 * Returns the meta object for class '{@link CFG.IterativeNode <em>Iterative Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterative Node</em>'.
	 * @see CFG.IterativeNode
	 * @generated
	 */
	EClass getIterativeNode();

	/**
	 * Returns the meta object for the reference '{@link CFG.IterativeNode#getTrueConditionNode <em>True Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>True Condition Node</em>'.
	 * @see CFG.IterativeNode#getTrueConditionNode()
	 * @see #getIterativeNode()
	 * @generated
	 */
	EReference getIterativeNode_TrueConditionNode();

	/**
	 * Returns the meta object for the reference '{@link CFG.IterativeNode#getFalseConditionNode <em>False Condition Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>False Condition Node</em>'.
	 * @see CFG.IterativeNode#getFalseConditionNode()
	 * @see #getIterativeNode()
	 * @generated
	 */
	EReference getIterativeNode_FalseConditionNode();

	/**
	 * Returns the meta object for the containment reference list '{@link CFG.IterativeNode#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see CFG.IterativeNode#getNodes()
	 * @see #getIterativeNode()
	 * @generated
	 */
	EReference getIterativeNode_Nodes();

	/**
	 * Returns the meta object for class '{@link CFG.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see CFG.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link CFG.Var#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CFG.Var#getName()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Name();

	/**
	 * Returns the meta object for the container reference '{@link CFG.Var#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Method</em>'.
	 * @see CFG.Var#getMethod()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Method();

	/**
	 * Returns the meta object for the container reference list '{@link CFG.Var#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference list '<em>Nodes</em>'.
	 * @see CFG.Var#getNodes()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Nodes();

	/**
	 * Returns the meta object for class '{@link CFG.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see CFG.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CFGFactory getCFGFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CFG.impl.MControlFlowGraphImpl <em>MControl Flow Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CFG.impl.MControlFlowGraphImpl
		 * @see CFG.impl.CFGPackageImpl#getMControlFlowGraph()
		 * @generated
		 */
		EClass MCONTROL_FLOW_GRAPH = eINSTANCE.getMControlFlowGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONTROL_FLOW_GRAPH__NODES = eINSTANCE.getMControlFlowGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCONTROL_FLOW_GRAPH__NAME = eINSTANCE.getMControlFlowGraph_Name();

		/**
		 * The meta object literal for the '<em><b>Local Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONTROL_FLOW_GRAPH__LOCAL_VAR = eINSTANCE.getMControlFlowGraph_LocalVar();

		/**
		 * The meta object literal for the '{@link CFG.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CFG.impl.AbstractNodeImpl
		 * @see CFG.impl.CFGPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>From Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__FROM_NODE = eINSTANCE.getAbstractNode_FromNode();

		/**
		 * The meta object literal for the '<em><b>To Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__TO_NODE = eINSTANCE.getAbstractNode_ToNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__NAME = eINSTANCE.getAbstractNode_Name();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__VAR = eINSTANCE.getAbstractNode_Var();

		/**
		 * The meta object literal for the '<em><b>Data Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__DATA_FLOW = eINSTANCE.getAbstractNode_DataFlow();

		/**
		 * The meta object literal for the '<em><b>DUse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__DUSE = eINSTANCE.getAbstractNode_DUse();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_NODE__PARAMS = eINSTANCE.getAbstractNode_Params();

		/**
		 * The meta object literal for the '{@link CFG.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CFG.impl.NodeImpl
		 * @see CFG.impl.CFGPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link CFG.impl.ConditionalNodeImpl <em>Conditional Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CFG.impl.ConditionalNodeImpl
		 * @see CFG.impl.CFGPackageImpl#getConditionalNode()
		 * @generated
		 */
		EClass CONDITIONAL_NODE = eINSTANCE.getConditionalNode();

		/**
		 * The meta object literal for the '<em><b>True Condition Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__TRUE_CONDITION_NODE = eINSTANCE.getConditionalNode_TrueConditionNode();

		/**
		 * The meta object literal for the '<em><b>False Condition Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_NODE__FALSE_CONDITION_NODE = eINSTANCE.getConditionalNode_FalseConditionNode();

		/**
		 * The meta object literal for the '{@link CFG.impl.IterativeNodeImpl <em>Iterative Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CFG.impl.IterativeNodeImpl
		 * @see CFG.impl.CFGPackageImpl#getIterativeNode()
		 * @generated
		 */
		EClass ITERATIVE_NODE = eINSTANCE.getIterativeNode();

		/**
		 * The meta object literal for the '<em><b>True Condition Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATIVE_NODE__TRUE_CONDITION_NODE = eINSTANCE.getIterativeNode_TrueConditionNode();

		/**
		 * The meta object literal for the '<em><b>False Condition Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATIVE_NODE__FALSE_CONDITION_NODE = eINSTANCE.getIterativeNode_FalseConditionNode();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATIVE_NODE__NODES = eINSTANCE.getIterativeNode_Nodes();

		/**
		 * The meta object literal for the '{@link CFG.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CFG.impl.VarImpl
		 * @see CFG.impl.CFGPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__NAME = eINSTANCE.getVar_Name();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__METHOD = eINSTANCE.getVar_Method();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' container reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__NODES = eINSTANCE.getVar_Nodes();

		/**
		 * The meta object literal for the '{@link CFG.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CFG.impl.ParamImpl
		 * @see CFG.impl.CFGPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

	}

} //CFGPackage
