/**
 */
package CFG;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MControl Flow Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CFG.MControlFlowGraph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link CFG.MControlFlowGraph#getName <em>Name</em>}</li>
 *   <li>{@link CFG.MControlFlowGraph#getLocalVar <em>Local Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see CFG.CFGPackage#getMControlFlowGraph()
 * @model
 * @generated
 */
public interface MControlFlowGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link CFG.AbstractNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see CFG.CFGPackage#getMControlFlowGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CFG.CFGPackage#getMControlFlowGraph_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CFG.MControlFlowGraph#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Local Var</b></em>' containment reference list.
	 * The list contents are of type {@link CFG.Var}.
	 * It is bidirectional and its opposite is '{@link CFG.Var#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Var</em>' containment reference list.
	 * @see CFG.CFGPackage#getMControlFlowGraph_LocalVar()
	 * @see CFG.Var#getMethod
	 * @model opposite="method" containment="true"
	 * @generated
	 */
	EList<Var> getLocalVar();

} // MControlFlowGraph
