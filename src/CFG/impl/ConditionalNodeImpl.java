/**
 */
package CFG.impl;

import CFG.CFGPackage;
import CFG.ConditionalNode;
import CFG.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CFG.impl.ConditionalNodeImpl#getTrueConditionNode <em>True Condition Node</em>}</li>
 *   <li>{@link CFG.impl.ConditionalNodeImpl#getFalseConditionNode <em>False Condition Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeImpl extends AbstractNodeImpl implements ConditionalNode {
	/**
	 * The cached value of the '{@link #getTrueConditionNode() <em>True Condition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueConditionNode()
	 * @generated
	 * @ordered
	 */
	protected Node trueConditionNode;

	/**
	 * The cached value of the '{@link #getFalseConditionNode() <em>False Condition Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseConditionNode()
	 * @generated
	 * @ordered
	 */
	protected Node falseConditionNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CFGPackage.Literals.CONDITIONAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTrueConditionNode() {
		return trueConditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueConditionNode(Node newTrueConditionNode, NotificationChain msgs) {
		Node oldTrueConditionNode = trueConditionNode;
		trueConditionNode = newTrueConditionNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE, oldTrueConditionNode, newTrueConditionNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueConditionNode(Node newTrueConditionNode) {
		if (newTrueConditionNode != trueConditionNode) {
			NotificationChain msgs = null;
			if (trueConditionNode != null)
				msgs = ((InternalEObject)trueConditionNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE, null, msgs);
			if (newTrueConditionNode != null)
				msgs = ((InternalEObject)newTrueConditionNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE, null, msgs);
			msgs = basicSetTrueConditionNode(newTrueConditionNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE, newTrueConditionNode, newTrueConditionNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFalseConditionNode() {
		return falseConditionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFalseConditionNode(Node newFalseConditionNode, NotificationChain msgs) {
		Node oldFalseConditionNode = falseConditionNode;
		falseConditionNode = newFalseConditionNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE, oldFalseConditionNode, newFalseConditionNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseConditionNode(Node newFalseConditionNode) {
		if (newFalseConditionNode != falseConditionNode) {
			NotificationChain msgs = null;
			if (falseConditionNode != null)
				msgs = ((InternalEObject)falseConditionNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE, null, msgs);
			if (newFalseConditionNode != null)
				msgs = ((InternalEObject)newFalseConditionNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE, null, msgs);
			msgs = basicSetFalseConditionNode(newFalseConditionNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE, newFalseConditionNode, newFalseConditionNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE:
				return basicSetTrueConditionNode(null, msgs);
			case CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE:
				return basicSetFalseConditionNode(null, msgs);
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
			case CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE:
				return getTrueConditionNode();
			case CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE:
				return getFalseConditionNode();
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
			case CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE:
				setTrueConditionNode((Node)newValue);
				return;
			case CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE:
				setFalseConditionNode((Node)newValue);
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
			case CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE:
				setTrueConditionNode((Node)null);
				return;
			case CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE:
				setFalseConditionNode((Node)null);
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
			case CFGPackage.CONDITIONAL_NODE__TRUE_CONDITION_NODE:
				return trueConditionNode != null;
			case CFGPackage.CONDITIONAL_NODE__FALSE_CONDITION_NODE:
				return falseConditionNode != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalNodeImpl
