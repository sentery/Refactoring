/**
 */
package com.cs.tu.analysis.metrics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cs.tu.analysis.metrics.Var#getName <em>Name</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.Var#getMclass <em>Mclass</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.Var#isIsRTQW <em>Is RTQW</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.Var#getKind <em>Kind</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.Var#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.cs.tu.analysis.metrics.MetricsPackage#getVar()
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
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getVar_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.Var#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mclass</em>' reference.
	 * @see #setMclass(MClass)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getVar_Mclass()
	 * @model
	 * @generated
	 */
	MClass getMclass();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.Var#getMclass <em>Mclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mclass</em>' reference.
	 * @see #getMclass()
	 * @generated
	 */
	void setMclass(MClass value);

	/**
	 * Returns the value of the '<em><b>Is RTQW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is RTQW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is RTQW</em>' attribute.
	 * @see #setIsRTQW(boolean)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getVar_IsRTQW()
	 * @model
	 * @generated
	 */
	boolean isIsRTQW();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.Var#isIsRTQW <em>Is RTQW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is RTQW</em>' attribute.
	 * @see #isIsRTQW()
	 * @generated
	 */
	void setIsRTQW(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getVar_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.Var#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getVar_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.Var#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Var
