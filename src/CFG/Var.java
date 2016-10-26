/**
 */
package CFG;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CFG.Var#getName <em>Name</em>}</li>
 *   <li>{@link CFG.Var#getMethod <em>Method</em>}</li>
 *   <li>{@link CFG.Var#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see CFG.CFGPackage#getVar()
 * @model
 * @generated
 */
public interface Var extends EObject {
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
	 * @see CFG.CFGPackage#getVar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CFG.Var#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link CFG.MControlFlowGraph#getLocalVar <em>Local Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' container reference.
	 * @see #setMethod(MControlFlowGraph)
	 * @see CFG.CFGPackage#getVar_Method()
	 * @see CFG.MControlFlowGraph#getLocalVar
	 * @model opposite="localVar" transient="false"
	 * @generated
	 */
	MControlFlowGraph getMethod();

	/**
	 * Sets the value of the '{@link CFG.Var#getMethod <em>Method</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' container reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MControlFlowGraph value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' container reference list.
	 * The list contents are of type {@link CFG.AbstractNode}.
	 * It is bidirectional and its opposite is '{@link CFG.AbstractNode#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' container reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' container reference list.
	 * @see CFG.CFGPackage#getVar_Nodes()
	 * @see CFG.AbstractNode#getVar
	 * @model opposite="var" transient="false"
	 * @generated
	 */
	EList<AbstractNode> getNodes();

} // Var
