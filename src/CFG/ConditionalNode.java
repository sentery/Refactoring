/**
 */
package CFG;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CFG.ConditionalNode#getTrueConditionNode <em>True Condition Node</em>}</li>
 *   <li>{@link CFG.ConditionalNode#getFalseConditionNode <em>False Condition Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see CFG.CFGPackage#getConditionalNode()
 * @model
 * @generated
 */
public interface ConditionalNode extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>True Condition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Condition Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Condition Node</em>' containment reference.
	 * @see #setTrueConditionNode(Node)
	 * @see CFG.CFGPackage#getConditionalNode_TrueConditionNode()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Node getTrueConditionNode();

	/**
	 * Sets the value of the '{@link CFG.ConditionalNode#getTrueConditionNode <em>True Condition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Condition Node</em>' containment reference.
	 * @see #getTrueConditionNode()
	 * @generated
	 */
	void setTrueConditionNode(Node value);

	/**
	 * Returns the value of the '<em><b>False Condition Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Condition Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Condition Node</em>' containment reference.
	 * @see #setFalseConditionNode(Node)
	 * @see CFG.CFGPackage#getConditionalNode_FalseConditionNode()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Node getFalseConditionNode();

	/**
	 * Sets the value of the '{@link CFG.ConditionalNode#getFalseConditionNode <em>False Condition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Condition Node</em>' containment reference.
	 * @see #getFalseConditionNode()
	 * @generated
	 */
	void setFalseConditionNode(Node value);

} // ConditionalNode
