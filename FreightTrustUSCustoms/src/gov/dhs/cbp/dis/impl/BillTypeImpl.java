/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.BillType;
import gov.dhs.cbp.dis.DisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.BillTypeImpl#getSCAC <em>SCAC</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BillTypeImpl#getBillNumber <em>Bill Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BillTypeImpl#getHouseBillNumber <em>House Bill Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BillTypeImpl#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillTypeImpl extends MinimalEObjectImpl.Container implements BillType {
	/**
	 * The default value of the '{@link #getSCAC() <em>SCAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCAC()
	 * @generated
	 * @ordered
	 */
	protected static final String SCAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCAC() <em>SCAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCAC()
	 * @generated
	 * @ordered
	 */
	protected String sCAC = SCAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillNumber() <em>Bill Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillNumber() <em>Bill Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillNumber()
	 * @generated
	 * @ordered
	 */
	protected String billNumber = BILL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHouseBillNumber() <em>House Bill Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseBillNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_BILL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseBillNumber() <em>House Bill Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseBillNumber()
	 * @generated
	 * @ordered
	 */
	protected String houseBillNumber = HOUSE_BILL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.BILL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSCAC() {
		return sCAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCAC(String newSCAC) {
		String oldSCAC = sCAC;
		sCAC = newSCAC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BILL_TYPE__SCAC, oldSCAC, sCAC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillNumber() {
		return billNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillNumber(String newBillNumber) {
		String oldBillNumber = billNumber;
		billNumber = newBillNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BILL_TYPE__BILL_NUMBER, oldBillNumber, billNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseBillNumber() {
		return houseBillNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseBillNumber(String newHouseBillNumber) {
		String oldHouseBillNumber = houseBillNumber;
		houseBillNumber = newHouseBillNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BILL_TYPE__HOUSE_BILL_NUMBER, oldHouseBillNumber, houseBillNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BILL_TYPE__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.BILL_TYPE__SCAC:
				return getSCAC();
			case DisPackage.BILL_TYPE__BILL_NUMBER:
				return getBillNumber();
			case DisPackage.BILL_TYPE__HOUSE_BILL_NUMBER:
				return getHouseBillNumber();
			case DisPackage.BILL_TYPE__REFERENCE_NUMBER:
				return getReferenceNumber();
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
			case DisPackage.BILL_TYPE__SCAC:
				setSCAC((String)newValue);
				return;
			case DisPackage.BILL_TYPE__BILL_NUMBER:
				setBillNumber((String)newValue);
				return;
			case DisPackage.BILL_TYPE__HOUSE_BILL_NUMBER:
				setHouseBillNumber((String)newValue);
				return;
			case DisPackage.BILL_TYPE__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
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
			case DisPackage.BILL_TYPE__SCAC:
				setSCAC(SCAC_EDEFAULT);
				return;
			case DisPackage.BILL_TYPE__BILL_NUMBER:
				setBillNumber(BILL_NUMBER_EDEFAULT);
				return;
			case DisPackage.BILL_TYPE__HOUSE_BILL_NUMBER:
				setHouseBillNumber(HOUSE_BILL_NUMBER_EDEFAULT);
				return;
			case DisPackage.BILL_TYPE__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
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
			case DisPackage.BILL_TYPE__SCAC:
				return SCAC_EDEFAULT == null ? sCAC != null : !SCAC_EDEFAULT.equals(sCAC);
			case DisPackage.BILL_TYPE__BILL_NUMBER:
				return BILL_NUMBER_EDEFAULT == null ? billNumber != null : !BILL_NUMBER_EDEFAULT.equals(billNumber);
			case DisPackage.BILL_TYPE__HOUSE_BILL_NUMBER:
				return HOUSE_BILL_NUMBER_EDEFAULT == null ? houseBillNumber != null : !HOUSE_BILL_NUMBER_EDEFAULT.equals(houseBillNumber);
			case DisPackage.BILL_TYPE__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
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
		result.append(" (sCAC: ");
		result.append(sCAC);
		result.append(", billNumber: ");
		result.append(billNumber);
		result.append(", houseBillNumber: ");
		result.append(houseBillNumber);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(')');
		return result.toString();
	}

} //BillTypeImpl
