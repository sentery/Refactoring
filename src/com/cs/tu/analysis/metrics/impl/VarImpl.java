/**
 */
package com.cs.tu.analysis.metrics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.cs.tu.analysis.metrics.MClass;
import com.cs.tu.analysis.metrics.MetricsPackage;
import com.cs.tu.analysis.metrics.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.VarImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.VarImpl#getMclass <em>Mclass</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.VarImpl#isIsRTQW <em>Is RTQW</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.VarImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.VarImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarImpl extends MinimalEObjectImpl.Container implements Var {
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
	 * The cached value of the '{@link #getMclass() <em>Mclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMclass()
	 * @generated
	 * @ordered
	 */
	protected MClass mclass;

	/**
	 * The default value of the '{@link #isIsRTQW() <em>Is RTQW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRTQW()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RTQW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRTQW() <em>Is RTQW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRTQW()
	 * @generated
	 * @ordered
	 */
	protected boolean isRTQW = IS_RTQW_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.VAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.VAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass getMclass() {
		if (mclass != null && mclass.eIsProxy()) {
			InternalEObject oldMclass = (InternalEObject)mclass;
			mclass = (MClass)eResolveProxy(oldMclass);
			if (mclass != oldMclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetricsPackage.VAR__MCLASS, oldMclass, mclass));
			}
		}
		return mclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClass basicGetMclass() {
		return mclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMclass(MClass newMclass) {
		MClass oldMclass = mclass;
		mclass = newMclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.VAR__MCLASS, oldMclass, mclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRTQW() {
		return isRTQW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRTQW(boolean newIsRTQW) {
		boolean oldIsRTQW = isRTQW;
		isRTQW = newIsRTQW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.VAR__IS_RTQW, oldIsRTQW, isRTQW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.VAR__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.VAR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.VAR__NAME:
				return getName();
			case MetricsPackage.VAR__MCLASS:
				if (resolve) return getMclass();
				return basicGetMclass();
			case MetricsPackage.VAR__IS_RTQW:
				return isIsRTQW();
			case MetricsPackage.VAR__KIND:
				return getKind();
			case MetricsPackage.VAR__TYPE:
				return getType();
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
			case MetricsPackage.VAR__NAME:
				setName((String)newValue);
				return;
			case MetricsPackage.VAR__MCLASS:
				setMclass((MClass)newValue);
				return;
			case MetricsPackage.VAR__IS_RTQW:
				setIsRTQW((Boolean)newValue);
				return;
			case MetricsPackage.VAR__KIND:
				setKind((String)newValue);
				return;
			case MetricsPackage.VAR__TYPE:
				setType((String)newValue);
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
			case MetricsPackage.VAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetricsPackage.VAR__MCLASS:
				setMclass((MClass)null);
				return;
			case MetricsPackage.VAR__IS_RTQW:
				setIsRTQW(IS_RTQW_EDEFAULT);
				return;
			case MetricsPackage.VAR__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case MetricsPackage.VAR__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MetricsPackage.VAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetricsPackage.VAR__MCLASS:
				return mclass != null;
			case MetricsPackage.VAR__IS_RTQW:
				return isRTQW != IS_RTQW_EDEFAULT;
			case MetricsPackage.VAR__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case MetricsPackage.VAR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(", isRTQW: ");
		result.append(isRTQW);
		result.append(", kind: ");
		result.append(kind);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VarImpl
