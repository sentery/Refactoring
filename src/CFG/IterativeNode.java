/**
 */
package CFG;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterative Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CFG.IterativeNode#getTrueConditionNode <em>True Condition Node</em>}</li>
 *   <li>{@link CFG.IterativeNode#getFalseConditionNode <em>False Condition Node</em>}</li>
 *   <li>{@link CFG.IterativeNode#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see CFG.CFGPackage#getIterativeNode()
 * @model
 * @generated
 */
public interface IterativeNode extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>True Condition Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Condition Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Condition Node</em>' reference.
	 * @see #setTrueConditionNode(Node)
	 * @see CFG.CFGPackage#getIterativeNode_TrueConditionNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Node getTrueConditionNode();

	/**
	 * Sets the value of the '{@link CFG.IterativeNode#getTrueConditionNode <em>True Condition Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Condition Node</em>' reference.
	 * @see #getTrueConditionNode()
	 * @generated
	 */
	void setTrueConditionNode(Node value);

	/**
	 * Returns the value of the '<em><b>False Condition Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Condition Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Condition Node</em>' reference.
	 * @see #setFalseConditionNode(Node)
	 * @see CFG.CFGPackage#getIterativeNode_FalseConditionNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Node getFalseConditionNode();

	/**
	 * Sets the value of the '{@link CFG.IterativeNode#getFalseConditionNode <em>False Condition Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Condition Node</em>' reference.
	 * @see #getFalseConditionNode()
	 * @generated
	 */
	void setFalseConditionNode(Node value);

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
	 * @see CFG.CFGPackage#getIterativeNode_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractNode> getNodes();

} // IterativeNode
