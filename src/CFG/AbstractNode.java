/**
 */
package CFG;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CFG.AbstractNode#getFromNode <em>From Node</em>}</li>
 *   <li>{@link CFG.AbstractNode#getToNode <em>To Node</em>}</li>
 *   <li>{@link CFG.AbstractNode#getName <em>Name</em>}</li>
 *   <li>{@link CFG.AbstractNode#getVar <em>Var</em>}</li>
 *   <li>{@link CFG.AbstractNode#getDataFlow <em>Data Flow</em>}</li>
 *   <li>{@link CFG.AbstractNode#getDUse <em>DUse</em>}</li>
 *   <li>{@link CFG.AbstractNode#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see CFG.CFGPackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends EObject {
	/**
	 * Returns the value of the '<em><b>From Node</b></em>' reference list.
	 * The list contents are of type {@link CFG.AbstractNode}.
	 * It is bidirectional and its opposite is '{@link CFG.AbstractNode#getToNode <em>To Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Node</em>' reference list.
	 * @see CFG.CFGPackage#getAbstractNode_FromNode()
	 * @see CFG.AbstractNode#getToNode
	 * @model opposite="toNode" ordered="false"
	 * @generated
	 */
	EList<AbstractNode> getFromNode();

	/**
	 * Returns the value of the '<em><b>To Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link CFG.AbstractNode#getFromNode <em>From Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Node</em>' reference.
	 * @see #setToNode(AbstractNode)
	 * @see CFG.CFGPackage#getAbstractNode_ToNode()
	 * @see CFG.AbstractNode#getFromNode
	 * @model opposite="fromNode" ordered="false"
	 * @generated
	 */
	AbstractNode getToNode();

	/**
	 * Sets the value of the '{@link CFG.AbstractNode#getToNode <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Node</em>' reference.
	 * @see #getToNode()
	 * @generated
	 */
	void setToNode(AbstractNode value);

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
	 * @see CFG.CFGPackage#getAbstractNode_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CFG.AbstractNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link CFG.Var}.
	 * It is bidirectional and its opposite is '{@link CFG.Var#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see CFG.CFGPackage#getAbstractNode_Var()
	 * @see CFG.Var#getNodes
	 * @model opposite="nodes" containment="true"
	 * @generated
	 */
	EList<Var> getVar();

	/**
	 * Returns the value of the '<em><b>Data Flow</b></em>' reference list.
	 * The list contents are of type {@link CFG.AbstractNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flow</em>' reference list.
	 * @see CFG.CFGPackage#getAbstractNode_DataFlow()
	 * @model
	 * @generated
	 */
	EList<AbstractNode> getDataFlow();

	/**
	 * Returns the value of the '<em><b>DUse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DUse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DUse</em>' attribute.
	 * @see #setDUse(String)
	 * @see CFG.CFGPackage#getAbstractNode_DUse()
	 * @model
	 * @generated
	 */
	String getDUse();

	/**
	 * Sets the value of the '{@link CFG.AbstractNode#getDUse <em>DUse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DUse</em>' attribute.
	 * @see #getDUse()
	 * @generated
	 */
	void setDUse(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link CFG.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see CFG.CFGPackage#getAbstractNode_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getParams();

} // AbstractNode
