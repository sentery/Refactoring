/**
 */
package com.cs.tu.analysis.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cs.tu.analysis.metrics.MClass#getName <em>Name</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MClass#getLCOM <em>LCOM</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MClass#getDAM <em>DAM</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MClass#getAPARM <em>APARM</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMClass()
 * @model
 * @generated
 */
public interface MClass extends EObject {
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
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>LCOM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCOM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCOM</em>' attribute.
	 * @see #setLCOM(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMClass_LCOM()
	 * @model
	 * @generated
	 */
	String getLCOM();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MClass#getLCOM <em>LCOM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LCOM</em>' attribute.
	 * @see #getLCOM()
	 * @generated
	 */
	void setLCOM(String value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
	 * The list contents are of type {@link com.cs.tu.analysis.metrics.MMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' containment reference list.
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMClass_Methods()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>DAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DAM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DAM</em>' attribute.
	 * @see #setDAM(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMClass_DAM()
	 * @model
	 * @generated
	 */
	String getDAM();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MClass#getDAM <em>DAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DAM</em>' attribute.
	 * @see #getDAM()
	 * @generated
	 */
	void setDAM(String value);

	/**
	 * Returns the value of the '<em><b>APARM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APARM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APARM</em>' attribute.
	 * @see #setAPARM(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMClass_APARM()
	 * @model
	 * @generated
	 */
	String getAPARM();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MClass#getAPARM <em>APARM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APARM</em>' attribute.
	 * @see #getAPARM()
	 * @generated
	 */
	void setAPARM(String value);

} // MClass
