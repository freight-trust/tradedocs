/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.OtherTransactionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.OtherTransactionTypeImpl#getTransactionName <em>Transaction Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.OtherTransactionTypeImpl#getTransactionNumber <em>Transaction Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherTransactionTypeImpl extends MinimalEObjectImpl.Container implements OtherTransactionType {
	/**
	 * The default value of the '{@link #getTransactionName() <em>Transaction Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionName() <em>Transaction Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionName()
	 * @generated
	 * @ordered
	 */
	protected String transactionName = TRANSACTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionNumber() <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionNumber() <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionNumber()
	 * @generated
	 * @ordered
	 */
	protected String transactionNumber = TRANSACTION_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherTransactionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.OTHER_TRANSACTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionName() {
		return transactionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionName(String newTransactionName) {
		String oldTransactionName = transactionName;
		transactionName = newTransactionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NAME, oldTransactionName, transactionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionNumber() {
		return transactionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionNumber(String newTransactionNumber) {
		String oldTransactionNumber = transactionNumber;
		transactionNumber = newTransactionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NUMBER, oldTransactionNumber, transactionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NAME:
				return getTransactionName();
			case DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NUMBER:
				return getTransactionNumber();
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
			case DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NAME:
				setTransactionName((String)newValue);
				return;
			case DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NUMBER:
				setTransactionNumber((String)newValue);
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
			case DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NAME:
				setTransactionName(TRANSACTION_NAME_EDEFAULT);
				return;
			case DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NUMBER:
				setTransactionNumber(TRANSACTION_NUMBER_EDEFAULT);
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
			case DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NAME:
				return TRANSACTION_NAME_EDEFAULT == null ? transactionName != null : !TRANSACTION_NAME_EDEFAULT.equals(transactionName);
			case DisPackage.OTHER_TRANSACTION_TYPE__TRANSACTION_NUMBER:
				return TRANSACTION_NUMBER_EDEFAULT == null ? transactionNumber != null : !TRANSACTION_NUMBER_EDEFAULT.equals(transactionNumber);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (transactionName: ");
		result.append(transactionName);
		result.append(", transactionNumber: ");
		result.append(transactionNumber);
		result.append(')');
		return result.toString();
	}

} //OtherTransactionTypeImpl
