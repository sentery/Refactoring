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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.cs.tu.analysis.metrics.MClass;
import com.cs.tu.analysis.metrics.MMethod;
import com.cs.tu.analysis.metrics.MetricsPackage;
import com.cs.tu.analysis.metrics.Param;
import com.cs.tu.analysis.metrics.Var;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MMethodImpl#getMclass <em>Mclass</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MMethodImpl#getVG <em>VG</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MMethodImpl#getPAR <em>PAR</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MMethodImpl#getNBD <em>NBD</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MMethodImpl#getMLOC <em>MLOC</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MMethodImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link com.cs.tu.analysis.metrics.impl.MMethodImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MMethodImpl extends MinimalEObjectImpl.Container implements MMethod {
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
	 * The default value of the '{@link #getVG() <em>VG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVG()
	 * @generated
	 * @ordered
	 */
	protected static final String VG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVG() <em>VG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVG()
	 * @generated
	 * @ordered
	 */
	protected String vg = VG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPAR() <em>PAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPAR()
	 * @generated
	 * @ordered
	 */
	protected static final String PAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPAR() <em>PAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPAR()
	 * @generated
	 * @ordered
	 */
	protected String par = PAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNBD() <em>NBD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBD()
	 * @generated
	 * @ordered
	 */
	protected static final String NBD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNBD() <em>NBD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBD()
	 * @generated
	 * @ordered
	 */
	protected String nbd = NBD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMLOC() <em>MLOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLOC()
	 * @generated
	 * @ordered
	 */
	protected static final String MLOC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMLOC() <em>MLOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMLOC()
	 * @generated
	 * @ordered
	 */
	protected String mloc = MLOC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVars()
	 * @generated
	 * @ordered
	 */
	protected EList<Var> vars;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Param> params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.MMETHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MMETHOD__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetricsPackage.MMETHOD__MCLASS, oldMclass, mclass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MMETHOD__MCLASS, oldMclass, mclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVG() {
		return vg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVG(String newVG) {
		String oldVG = vg;
		vg = newVG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MMETHOD__VG, oldVG, vg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPAR() {
		return par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPAR(String newPAR) {
		String oldPAR = par;
		par = newPAR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MMETHOD__PAR, oldPAR, par));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNBD() {
		return nbd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNBD(String newNBD) {
		String oldNBD = nbd;
		nbd = newNBD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MMETHOD__NBD, oldNBD, nbd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMLOC() {
		return mloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMLOC(String newMLOC) {
		String oldMLOC = mloc;
		mloc = newMLOC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.MMETHOD__MLOC, oldMLOC, mloc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Var> getVars() {
		if (vars == null) {
			vars = new EObjectContainmentEList<Var>(Var.class, this, MetricsPackage.MMETHOD__VARS);
		}
		return vars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Param> getParams() {
		if (params == null) {
			params = new EObjectResolvingEList<Param>(Param.class, this, MetricsPackage.MMETHOD__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.MMETHOD__VARS:
				return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
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
			case MetricsPackage.MMETHOD__NAME:
				return getName();
			case MetricsPackage.MMETHOD__MCLASS:
				if (resolve) return getMclass();
				return basicGetMclass();
			case MetricsPackage.MMETHOD__VG:
				return getVG();
			case MetricsPackage.MMETHOD__PAR:
				return getPAR();
			case MetricsPackage.MMETHOD__NBD:
				return getNBD();
			case MetricsPackage.MMETHOD__MLOC:
				return getMLOC();
			case MetricsPackage.MMETHOD__VARS:
				return getVars();
			case MetricsPackage.MMETHOD__PARAMS:
				return getParams();
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
			case MetricsPackage.MMETHOD__NAME:
				setName((String)newValue);
				return;
			case MetricsPackage.MMETHOD__MCLASS:
				setMclass((MClass)newValue);
				return;
			case MetricsPackage.MMETHOD__VG:
				setVG((String)newValue);
				return;
			case MetricsPackage.MMETHOD__PAR:
				setPAR((String)newValue);
				return;
			case MetricsPackage.MMETHOD__NBD:
				setNBD((String)newValue);
				return;
			case MetricsPackage.MMETHOD__MLOC:
				setMLOC((String)newValue);
				return;
			case MetricsPackage.MMETHOD__VARS:
				getVars().clear();
				getVars().addAll((Collection<? extends Var>)newValue);
				return;
			case MetricsPackage.MMETHOD__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Param>)newValue);
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
			case MetricsPackage.MMETHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetricsPackage.MMETHOD__MCLASS:
				setMclass((MClass)null);
				return;
			case MetricsPackage.MMETHOD__VG:
				setVG(VG_EDEFAULT);
				return;
			case MetricsPackage.MMETHOD__PAR:
				setPAR(PAR_EDEFAULT);
				return;
			case MetricsPackage.MMETHOD__NBD:
				setNBD(NBD_EDEFAULT);
				return;
			case MetricsPackage.MMETHOD__MLOC:
				setMLOC(MLOC_EDEFAULT);
				return;
			case MetricsPackage.MMETHOD__VARS:
				getVars().clear();
				return;
			case MetricsPackage.MMETHOD__PARAMS:
				getParams().clear();
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
			case MetricsPackage.MMETHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetricsPackage.MMETHOD__MCLASS:
				return mclass != null;
			case MetricsPackage.MMETHOD__VG:
				return VG_EDEFAULT == null ? vg != null : !VG_EDEFAULT.equals(vg);
			case MetricsPackage.MMETHOD__PAR:
				return PAR_EDEFAULT == null ? par != null : !PAR_EDEFAULT.equals(par);
			case MetricsPackage.MMETHOD__NBD:
				return NBD_EDEFAULT == null ? nbd != null : !NBD_EDEFAULT.equals(nbd);
			case MetricsPackage.MMETHOD__MLOC:
				return MLOC_EDEFAULT == null ? mloc != null : !MLOC_EDEFAULT.equals(mloc);
			case MetricsPackage.MMETHOD__VARS:
				return vars != null && !vars.isEmpty();
			case MetricsPackage.MMETHOD__PARAMS:
				return params != null && !params.isEmpty();
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
		result.append(", VG: ");
		result.append(vg);
		result.append(", PAR: ");
		result.append(par);
		result.append(", NBD: ");
		result.append(nbd);
		result.append(", MLOC: ");
		result.append(mloc);
		result.append(')');
		return result.toString();
	}

} //MMethodImpl
