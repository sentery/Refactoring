/**
 */
package com.cs.tu.analysis.metrics;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.cs.tu.analysis.metrics.MetricsFactory
 * @model kind="package"
 * @generated
 */
public interface MetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metrics/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metrics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsPackage eINSTANCE = com.cs.tu.analysis.metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.cs.tu.analysis.metrics.impl.MClassImpl <em>MClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.analysis.metrics.impl.MClassImpl
	 * @see com.cs.tu.analysis.metrics.impl.MetricsPackageImpl#getMClass()
	 * @generated
	 */
	int MCLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>LCOM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__LCOM = 1;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__METHODS = 2;

	/**
	 * The feature id for the '<em><b>DAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__DAM = 3;

	/**
	 * The feature id for the '<em><b>APARM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS__APARM = 4;

	/**
	 * The number of structural features of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>MClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cs.tu.analysis.metrics.impl.MMethodImpl <em>MMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.analysis.metrics.impl.MMethodImpl
	 * @see com.cs.tu.analysis.metrics.impl.MetricsPackageImpl#getMMethod()
	 * @generated
	 */
	int MMETHOD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD__MCLASS = 1;

	/**
	 * The feature id for the '<em><b>VG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD__VG = 2;

	/**
	 * The feature id for the '<em><b>PAR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD__PAR = 3;

	/**
	 * The feature id for the '<em><b>NBD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD__NBD = 4;

	/**
	 * The feature id for the '<em><b>MLOC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD__MLOC = 5;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD__VARS = 6;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD__PARAMS = 7;

	/**
	 * The number of structural features of the '<em>MMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>MMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MMETHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cs.tu.analysis.metrics.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.analysis.metrics.impl.VarImpl
	 * @see com.cs.tu.analysis.metrics.impl.MetricsPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__MCLASS = 1;

	/**
	 * The feature id for the '<em><b>Is RTQW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__IS_RTQW = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__KIND = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.cs.tu.analysis.metrics.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.cs.tu.analysis.metrics.impl.ParamImpl
	 * @see com.cs.tu.analysis.metrics.impl.MetricsPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = VAR__NAME;

	/**
	 * The feature id for the '<em><b>Mclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__MCLASS = VAR__MCLASS;

	/**
	 * The feature id for the '<em><b>Is RTQW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__IS_RTQW = VAR__IS_RTQW;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__KIND = VAR__KIND;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__TYPE = VAR__TYPE;

	/**
	 * The feature id for the '<em><b>Is IPO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__IS_IPO = VAR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = VAR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_OPERATION_COUNT = VAR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.cs.tu.analysis.metrics.MClass <em>MClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MClass</em>'.
	 * @see com.cs.tu.analysis.metrics.MClass
	 * @generated
	 */
	EClass getMClass();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cs.tu.analysis.metrics.MClass#getName()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MClass#getLCOM <em>LCOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LCOM</em>'.
	 * @see com.cs.tu.analysis.metrics.MClass#getLCOM()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_LCOM();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cs.tu.analysis.metrics.MClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see com.cs.tu.analysis.metrics.MClass#getMethods()
	 * @see #getMClass()
	 * @generated
	 */
	EReference getMClass_Methods();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MClass#getDAM <em>DAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DAM</em>'.
	 * @see com.cs.tu.analysis.metrics.MClass#getDAM()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_DAM();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MClass#getAPARM <em>APARM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>APARM</em>'.
	 * @see com.cs.tu.analysis.metrics.MClass#getAPARM()
	 * @see #getMClass()
	 * @generated
	 */
	EAttribute getMClass_APARM();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.analysis.metrics.MMethod <em>MMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MMethod</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod
	 * @generated
	 */
	EClass getMMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod#getName()
	 * @see #getMMethod()
	 * @generated
	 */
	EAttribute getMMethod_Name();

	/**
	 * Returns the meta object for the reference '{@link com.cs.tu.analysis.metrics.MMethod#getMclass <em>Mclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mclass</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod#getMclass()
	 * @see #getMMethod()
	 * @generated
	 */
	EReference getMMethod_Mclass();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MMethod#getVG <em>VG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VG</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod#getVG()
	 * @see #getMMethod()
	 * @generated
	 */
	EAttribute getMMethod_VG();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MMethod#getPAR <em>PAR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PAR</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod#getPAR()
	 * @see #getMMethod()
	 * @generated
	 */
	EAttribute getMMethod_PAR();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MMethod#getNBD <em>NBD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBD</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod#getNBD()
	 * @see #getMMethod()
	 * @generated
	 */
	EAttribute getMMethod_NBD();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.MMethod#getMLOC <em>MLOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MLOC</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod#getMLOC()
	 * @see #getMMethod()
	 * @generated
	 */
	EAttribute getMMethod_MLOC();

	/**
	 * Returns the meta object for the containment reference list '{@link com.cs.tu.analysis.metrics.MMethod#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod#getVars()
	 * @see #getMMethod()
	 * @generated
	 */
	EReference getMMethod_Vars();

	/**
	 * Returns the meta object for the reference list '{@link com.cs.tu.analysis.metrics.MMethod#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see com.cs.tu.analysis.metrics.MMethod#getParams()
	 * @see #getMMethod()
	 * @generated
	 */
	EReference getMMethod_Params();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.analysis.metrics.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see com.cs.tu.analysis.metrics.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.Param#isIsIPO <em>Is IPO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is IPO</em>'.
	 * @see com.cs.tu.analysis.metrics.Param#isIsIPO()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_IsIPO();

	/**
	 * Returns the meta object for class '{@link com.cs.tu.analysis.metrics.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see com.cs.tu.analysis.metrics.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.Var#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.cs.tu.analysis.metrics.Var#getName()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Name();

	/**
	 * Returns the meta object for the reference '{@link com.cs.tu.analysis.metrics.Var#getMclass <em>Mclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mclass</em>'.
	 * @see com.cs.tu.analysis.metrics.Var#getMclass()
	 * @see #getVar()
	 * @generated
	 */
	EReference getVar_Mclass();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.Var#isIsRTQW <em>Is RTQW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is RTQW</em>'.
	 * @see com.cs.tu.analysis.metrics.Var#isIsRTQW()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_IsRTQW();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.Var#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.cs.tu.analysis.metrics.Var#getKind()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.cs.tu.analysis.metrics.Var#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.cs.tu.analysis.metrics.Var#getType()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricsFactory getMetricsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.cs.tu.analysis.metrics.impl.MClassImpl <em>MClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.analysis.metrics.impl.MClassImpl
		 * @see com.cs.tu.analysis.metrics.impl.MetricsPackageImpl#getMClass()
		 * @generated
		 */
		EClass MCLASS = eINSTANCE.getMClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__NAME = eINSTANCE.getMClass_Name();

		/**
		 * The meta object literal for the '<em><b>LCOM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__LCOM = eINSTANCE.getMClass_LCOM();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCLASS__METHODS = eINSTANCE.getMClass_Methods();

		/**
		 * The meta object literal for the '<em><b>DAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__DAM = eINSTANCE.getMClass_DAM();

		/**
		 * The meta object literal for the '<em><b>APARM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCLASS__APARM = eINSTANCE.getMClass_APARM();

		/**
		 * The meta object literal for the '{@link com.cs.tu.analysis.metrics.impl.MMethodImpl <em>MMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.analysis.metrics.impl.MMethodImpl
		 * @see com.cs.tu.analysis.metrics.impl.MetricsPackageImpl#getMMethod()
		 * @generated
		 */
		EClass MMETHOD = eINSTANCE.getMMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMETHOD__NAME = eINSTANCE.getMMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Mclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD__MCLASS = eINSTANCE.getMMethod_Mclass();

		/**
		 * The meta object literal for the '<em><b>VG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMETHOD__VG = eINSTANCE.getMMethod_VG();

		/**
		 * The meta object literal for the '<em><b>PAR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMETHOD__PAR = eINSTANCE.getMMethod_PAR();

		/**
		 * The meta object literal for the '<em><b>NBD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMETHOD__NBD = eINSTANCE.getMMethod_NBD();

		/**
		 * The meta object literal for the '<em><b>MLOC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MMETHOD__MLOC = eINSTANCE.getMMethod_MLOC();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD__VARS = eINSTANCE.getMMethod_Vars();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MMETHOD__PARAMS = eINSTANCE.getMMethod_Params();

		/**
		 * The meta object literal for the '{@link com.cs.tu.analysis.metrics.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.analysis.metrics.impl.ParamImpl
		 * @see com.cs.tu.analysis.metrics.impl.MetricsPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Is IPO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__IS_IPO = eINSTANCE.getParam_IsIPO();

		/**
		 * The meta object literal for the '{@link com.cs.tu.analysis.metrics.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.cs.tu.analysis.metrics.impl.VarImpl
		 * @see com.cs.tu.analysis.metrics.impl.MetricsPackageImpl#getVar()
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
		 * The meta object literal for the '<em><b>Mclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR__MCLASS = eINSTANCE.getVar_Mclass();

		/**
		 * The meta object literal for the '<em><b>Is RTQW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__IS_RTQW = eINSTANCE.getVar_IsRTQW();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__KIND = eINSTANCE.getVar_Kind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__TYPE = eINSTANCE.getVar_Type();

	}

} //MetricsPackage
