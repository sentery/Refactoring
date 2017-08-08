/**
 */
package com.cs.tu.analysis.metrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.cs.tu.analysis.metrics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsFactoryImpl extends EFactoryImpl implements MetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricsFactory init() {
		try {
			MetricsFactory theMetricsFactory = (MetricsFactory)EPackage.Registry.INSTANCE.getEFactory(MetricsPackage.eNS_URI);
			if (theMetricsFactory != null) {
				return theMetricsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactoryImpl() {
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
			case MetricsPackage.MCLASS: return createMClass();
			case MetricsPackage.MMETHOD: return createMMethod();
			case MetricsPackage.PARAM: return createParam();
			case MetricsPackage.VAR: return createVar();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass createMClass() {
		MClassImpl mClass = new MClassImpl();
		return mClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMethod createMMethod() {
		MMethodImpl mMethod = new MMethodImpl();
		return mMethod;
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
	public Var createVar() {
		VarImpl var = new VarImpl();
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsPackage getMetricsPackage() {
		return (MetricsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetricsPackage getPackage() {
		return MetricsPackage.eINSTANCE;
	}

} //MetricsFactoryImpl
