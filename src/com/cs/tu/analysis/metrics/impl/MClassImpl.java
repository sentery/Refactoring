/**
 */
package com.cs.tu.analysis.metrics.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.cs.tu.analysis.metrics.MClass;
import com.cs.tu.analysis.metrics.MMethod;
import com.cs.tu.analysis.metrics.MetricsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MClassImpl#getLCOM <em>LCOM</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MClassImpl#getDAM <em>DAM</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MClassImpl#getAPARM <em>APARM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MClassImpl extends MinimalEObjectImpl.Container implements MClass {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLCOM() <em>LCOM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCOM()
	 * @generated
	 * @ordered
	 */
	protected static final String LCOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLCOM() <em>LCOM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCOM()
	 * @generated
	 * @ordered
	 */
	protected String lcom = LCOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<MMethod> methods;

	/**
	 * The default value of the '{@link #getDAM() <em>DAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAM()
	 * @generated
	 * @ordered
	 */
	protected static final String DAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDAM() <em>DAM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAM()
	 * @generated
	 * @ordered
	 */
	protected String dam = DAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAPARM() <em>APARM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPARM()
	 * @generated
	 * @ordered
	 */
	protected static final String APARM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPARM() <em>APARM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPARM()
	 * @generated
	 * @ordered
	 */
	protected String aparm = APARM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.MCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MCLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLCOM() {
		return lcom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCOM(String newLCOM) {
		String oldLCOM = lcom;
		lcom = newLCOM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MCLASS__LCOM, oldLCOM, lcom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<MMethod>(MMethod.class, this, MetricsPackage.MCLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDAM() {
		return dam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDAM(String newDAM) {
		String oldDAM = dam;
		dam = newDAM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MCLASS__DAM, oldDAM, dam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAPARM() {
		return aparm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPARM(String newAPARM) {
		String oldAPARM = aparm;
		aparm = newAPARM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MCLASS__APARM, oldAPARM, aparm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.MCLASS__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.MCLASS__NAME:
				return getName();
			case MetricsPackage.MCLASS__LCOM:
				return getLCOM();
			case MetricsPackage.MCLASS__METHODS:
				return getMethods();
			case MetricsPackage.MCLASS__DAM:
				return getDAM();
			case MetricsPackage.MCLASS__APARM:
				return getAPARM();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetricsPackage.MCLASS__NAME:
				setName((String)newValue);
				return;
			case MetricsPackage.MCLASS__LCOM:
				setLCOM((String)newValue);
				return;
			case MetricsPackage.MCLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends MMethod>)newValue);
				return;
			case MetricsPackage.MCLASS__DAM:
				setDAM((String)newValue);
				return;
			case MetricsPackage.MCLASS__APARM:
				setAPARM((String)newValue);
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
			case MetricsPackage.MCLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetricsPackage.MCLASS__LCOM:
				setLCOM(LCOM_EDEFAULT);
				return;
			case MetricsPackage.MCLASS__METHODS:
				getMethods().clear();
				return;
			case MetricsPackage.MCLASS__DAM:
				setDAM(DAM_EDEFAULT);
				return;
			case MetricsPackage.MCLASS__APARM:
				setAPARM(APARM_EDEFAULT);
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
			case MetricsPackage.MCLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetricsPackage.MCLASS__LCOM:
				return LCOM_EDEFAULT == null ? lcom != null : !LCOM_EDEFAULT.equals(lcom);
			case MetricsPackage.MCLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case MetricsPackage.MCLASS__DAM:
				return DAM_EDEFAULT == null ? dam != null : !DAM_EDEFAULT.equals(dam);
			case MetricsPackage.MCLASS__APARM:
				return APARM_EDEFAULT == null ? aparm != null : !APARM_EDEFAULT.equals(aparm);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", LCOM: ");
		result.append(lcom);
		result.append(", DAM: ");
		result.append(dam);
		result.append(", APARM: ");
		result.append(aparm);
		result.append(')');
		return result.toString();
	}

} //MClassImpl
