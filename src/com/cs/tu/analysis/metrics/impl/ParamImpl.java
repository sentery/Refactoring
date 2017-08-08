/**
 */
package com.cs.tu.analysis.metrics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.cs.tu.analysis.metrics.MetricsPackage;
import com.cs.tu.analysis.metrics.Param;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.ParamImpl#isIsIPO <em>Is IPO</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamImpl extends VarImpl implements Param {
	/**
	 * The default value of the '{@link #isIsIPO() <em>Is IPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIPO()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IPO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIPO() <em>Is IPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIPO()
	 * @generated
	 * @ordered
	 */
	protected boolean isIPO = IS_IPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIPO() {
		return isIPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIPO(boolean newIsIPO) {
		boolean oldIsIPO = isIPO;
		isIPO = newIsIPO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.PARAM__IS_IPO, oldIsIPO, isIPO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.PARAM__IS_IPO:
				return isIsIPO();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricsPackage.PARAM__IS_IPO:
				setIsIPO((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetricsPackage.PARAM__IS_IPO:
				setIsIPO(IS_IPO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetricsPackage.PARAM__IS_IPO:
				return isIPO != IS_IPO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isIPO: ");
		result.append(isIPO);
		result.append(')');
		return result.toString();
	}

} //ParamImpl
