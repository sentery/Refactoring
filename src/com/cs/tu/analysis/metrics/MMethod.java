/**
 */
package com.cs.tu.analysis.metrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.cs.tu.analysis.metrics.MMethod#getName <em>Name</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MMethod#getMclass <em>Mclass</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MMethod#getVG <em>VG</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MMethod#getPAR <em>PAR</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MMethod#getNBD <em>NBD</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MMethod#getMLOC <em>MLOC</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MMethod#getVars <em>Vars</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.MMethod#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod()
 * @model
 * @generated
 */
public interface MMethod extends EObject {
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
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MMethod#getName <em>Name</em>}' attribute.
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
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod_Mclass()
	 * @model required="true"
	 * @generated
	 */
	MClass getMclass();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MMethod#getMclass <em>Mclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mclass</em>' reference.
	 * @see #getMclass()
	 * @generated
	 */
	void setMclass(MClass value);

	/**
	 * Returns the value of the '<em><b>VG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VG</em>' attribute.
	 * @see #setVG(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod_VG()
	 * @model
	 * @generated
	 */
	String getVG();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MMethod#getVG <em>VG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VG</em>' attribute.
	 * @see #getVG()
	 * @generated
	 */
	void setVG(String value);

	/**
	 * Returns the value of the '<em><b>PAR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PAR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PAR</em>' attribute.
	 * @see #setPAR(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod_PAR()
	 * @model
	 * @generated
	 */
	String getPAR();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MMethod#getPAR <em>PAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PAR</em>' attribute.
	 * @see #getPAR()
	 * @generated
	 */
	void setPAR(String value);

	/**
	 * Returns the value of the '<em><b>NBD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NBD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NBD</em>' attribute.
	 * @see #setNBD(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod_NBD()
	 * @model
	 * @generated
	 */
	String getNBD();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MMethod#getNBD <em>NBD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NBD</em>' attribute.
	 * @see #getNBD()
	 * @generated
	 */
	void setNBD(String value);

	/**
	 * Returns the value of the '<em><b>MLOC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MLOC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLOC</em>' attribute.
	 * @see #setMLOC(String)
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod_MLOC()
	 * @model
	 * @generated
	 */
	String getMLOC();

	/**
	 * Sets the value of the '{@link com.cs.tu.analysis.metrics.MMethod#getMLOC <em>MLOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLOC</em>' attribute.
	 * @see #getMLOC()
	 * @generated
	 */
	void setMLOC(String value);

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link com.cs.tu.analysis.metrics.Var}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod_Vars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Var> getVars();

	/**
	 * Returns the value of the '<em><b>Params</b></em>' reference list.
	 * The list contents are of type {@link com.cs.tu.analysis.metrics.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' reference list.
	 * @see com.cs.tu.analysis.metrics.MetricsPackage#getMMethod_Params()
	 * @model
	 * @generated
	 */
	EList<Param> getParams();

} // MMethod
