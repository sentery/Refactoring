/**
 */
package CFG.impl;

import CFG.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CFGFactoryImpl extends EFactoryImpl implements CFGFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CFGFactory init() {
		try {
			CFGFactory theCFGFactory = (CFGFactory)EPackage.Registry.INSTANCE.getEFactory("http://com/cs/tu/findrefactor"); 
			if (theCFGFactory != null) {
				return theCFGFactory;
			}
		}
		catch (Exception exception) {
//			EcorePlugin.INSTANCE.log(exception);
			exception.printStackTrace();
		}
		return new CFGFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFGFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CFGPackage.MCONTROL_FLOW_GRAPH: return createMControlFlowGraph();
			case CFGPackage.NODE: return createNode();
			case CFGPackage.CONDITIONAL_NODE: return createConditionalNode();
			case CFGPackage.ITERATIVE_NODE: return createIterativeNode();
			case CFGPackage.VAR: return createVar();
			case CFGPackage.PARAM: return createParam();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MControlFlowGraph createMControlFlowGraph() {
		MControlFlowGraphImpl mControlFlowGraph = new MControlFlowGraphImpl();
		return mControlFlowGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalNode createConditionalNode() {
		ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
		return conditionalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterativeNode createIterativeNode() {
		IterativeNodeImpl iterativeNode = new IterativeNodeImpl();
		return iterativeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var createVar() {
		VarImpl var = new VarImpl();
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Param createParam() {
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFGPackage getCFGPackage() {
		return (CFGPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CFGPackage getPackage() {
		return CFGPackage.eINSTANCE;
	}

} //CFGFactoryImpl
