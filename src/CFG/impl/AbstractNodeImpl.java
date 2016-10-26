/**
 */
package CFG.impl;

import CFG.AbstractNode;
import CFG.CFGPackage;
import CFG.Node;
import CFG.Var;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CFG.impl.AbstractNodeImpl#getFromNode <em>From Node</em>}</li>
 *   <li>{@link CFG.impl.AbstractNodeImpl#getToNode <em>To Node</em>}</li>
 *   <li>{@link CFG.impl.AbstractNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link CFG.impl.AbstractNodeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link CFG.impl.AbstractNodeImpl#getDataFlow <em>Data Flow</em>}</li>
 *   <li>{@link CFG.impl.AbstractNodeImpl#getDUse <em>DUse</em>}</li>
 *   <li>{@link CFG.impl.AbstractNodeImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractNodeImpl extends EObjectImpl implements AbstractNode {
	/**
	 * The cached value of the '{@link #getFromNode() <em>From Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNode()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> fromNode;

	/**
	 * The cached value of the '{@link #getToNode() <em>To Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNode()
	 * @generated
	 * @ordered
	 */
	protected AbstractNode toNode;

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
	 * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected EList<Var> var;

	/**
	 * The cached value of the '{@link #getDataFlow() <em>Data Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> dataFlow;

	/**
	 * The default value of the '{@link #getDUse() <em>DUse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDUse()
	 * @generated
	 * @ordered
	 */
	protected static final String DUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDUse() <em>DUse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDUse()
	 * @generated
	 * @ordered
	 */
	protected String dUse = DUSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CFGPackage.Literals.ABSTRACT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNode> getFromNode() {
		if (fromNode == null) {
			fromNode = new EObjectWithInverseResolvingEList<AbstractNode>(AbstractNode.class, this, CFGPackage.ABSTRACT_NODE__FROM_NODE, CFGPackage.ABSTRACT_NODE__TO_NODE);
		}
		return fromNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode getToNode() {
		if (toNode != null && toNode.eIsProxy()) {
			InternalEObject oldToNode = (InternalEObject)toNode;
			toNode = (AbstractNode)eResolveProxy(oldToNode);
			if (toNode != oldToNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CFGPackage.ABSTRACT_NODE__TO_NODE, oldToNode, toNode));
			}
		}
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractNode basicGetToNode() {
		return toNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToNode(AbstractNode newToNode, NotificationChain msgs) {
		AbstractNode oldToNode = toNode;
		toNode = newToNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CFGPackage.ABSTRACT_NODE__TO_NODE, oldToNode, newToNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToNode(AbstractNode newToNode) {
		if (newToNode != toNode) {
			NotificationChain msgs = null;
			if (toNode != null)
				msgs = ((InternalEObject)toNode).eInverseRemove(this, CFGPackage.ABSTRACT_NODE__FROM_NODE, AbstractNode.class, msgs);
			if (newToNode != null)
				msgs = ((InternalEObject)newToNode).eInverseAdd(this, CFGPackage.ABSTRACT_NODE__FROM_NODE, AbstractNode.class, msgs);
			msgs = basicSetToNode(newToNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CFGPackage.ABSTRACT_NODE__TO_NODE, newToNode, newToNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CFGPackage.ABSTRACT_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Var> getVar() {
		if (var == null) {
			var = new EObjectContainmentWithInverseEList<Var>(Var.class, this, CFGPackage.ABSTRACT_NODE__VAR, CFGPackage.VAR__NODES);
		}
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNode> getDataFlow() {
		if (dataFlow == null) {
			dataFlow = new EObjectResolvingEList<AbstractNode>(AbstractNode.class, this, CFGPackage.ABSTRACT_NODE__DATA_FLOW);
		}
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDUse() {
		return dUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDUse(String newDUse) {
		String oldDUse = dUse;
		dUse = newDUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CFGPackage.ABSTRACT_NODE__DUSE, oldDUse, dUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Node>(Node.class, this, CFGPackage.ABSTRACT_NODE__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CFGPackage.ABSTRACT_NODE__FROM_NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromNode()).basicAdd(otherEnd, msgs);
			case CFGPackage.ABSTRACT_NODE__TO_NODE:
				if (toNode != null)
					msgs = ((InternalEObject)toNode).eInverseRemove(this, CFGPackage.ABSTRACT_NODE__FROM_NODE, AbstractNode.class, msgs);
				return basicSetToNode((AbstractNode)otherEnd, msgs);
			case CFGPackage.ABSTRACT_NODE__VAR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVar()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CFGPackage.ABSTRACT_NODE__FROM_NODE:
				return ((InternalEList<?>)getFromNode()).basicRemove(otherEnd, msgs);
			case CFGPackage.ABSTRACT_NODE__TO_NODE:
				return basicSetToNode(null, msgs);
			case CFGPackage.ABSTRACT_NODE__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case CFGPackage.ABSTRACT_NODE__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
			case CFGPackage.ABSTRACT_NODE__FROM_NODE:
				return getFromNode();
			case CFGPackage.ABSTRACT_NODE__TO_NODE:
				if (resolve) return getToNode();
				return basicGetToNode();
			case CFGPackage.ABSTRACT_NODE__NAME:
				return getName();
			case CFGPackage.ABSTRACT_NODE__VAR:
				return getVar();
			case CFGPackage.ABSTRACT_NODE__DATA_FLOW:
				return getDataFlow();
			case CFGPackage.ABSTRACT_NODE__DUSE:
				return getDUse();
			case CFGPackage.ABSTRACT_NODE__PARAMS:
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
			case CFGPackage.ABSTRACT_NODE__FROM_NODE:
				getFromNode().clear();
				getFromNode().addAll((Collection<? extends AbstractNode>)newValue);
				return;
			case CFGPackage.ABSTRACT_NODE__TO_NODE:
				setToNode((AbstractNode)newValue);
				return;
			case CFGPackage.ABSTRACT_NODE__NAME:
				setName((String)newValue);
				return;
			case CFGPackage.ABSTRACT_NODE__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends Var>)newValue);
				return;
			case CFGPackage.ABSTRACT_NODE__DATA_FLOW:
				getDataFlow().clear();
				getDataFlow().addAll((Collection<? extends AbstractNode>)newValue);
				return;
			case CFGPackage.ABSTRACT_NODE__DUSE:
				setDUse((String)newValue);
				return;
			case CFGPackage.ABSTRACT_NODE__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Node>)newValue);
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
			case CFGPackage.ABSTRACT_NODE__FROM_NODE:
				getFromNode().clear();
				return;
			case CFGPackage.ABSTRACT_NODE__TO_NODE:
				setToNode((AbstractNode)null);
				return;
			case CFGPackage.ABSTRACT_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CFGPackage.ABSTRACT_NODE__VAR:
				getVar().clear();
				return;
			case CFGPackage.ABSTRACT_NODE__DATA_FLOW:
				getDataFlow().clear();
				return;
			case CFGPackage.ABSTRACT_NODE__DUSE:
				setDUse(DUSE_EDEFAULT);
				return;
			case CFGPackage.ABSTRACT_NODE__PARAMS:
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
			case CFGPackage.ABSTRACT_NODE__FROM_NODE:
				return fromNode != null && !fromNode.isEmpty();
			case CFGPackage.ABSTRACT_NODE__TO_NODE:
				return toNode != null;
			case CFGPackage.ABSTRACT_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CFGPackage.ABSTRACT_NODE__VAR:
				return var != null && !var.isEmpty();
			case CFGPackage.ABSTRACT_NODE__DATA_FLOW:
				return dataFlow != null && !dataFlow.isEmpty();
			case CFGPackage.ABSTRACT_NODE__DUSE:
				return DUSE_EDEFAULT == null ? dUse != null : !DUSE_EDEFAULT.equals(dUse);
			case CFGPackage.ABSTRACT_NODE__PARAMS:
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
		result.append(", dUse: ");
		result.append(dUse);
		result.append(')');
		return result.toString();
	}

} //AbstractNodeImpl
