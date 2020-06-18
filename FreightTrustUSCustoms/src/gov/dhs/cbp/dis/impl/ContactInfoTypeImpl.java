/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.ContactInfoType;
import gov.dhs.cbp.dis.DisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.ContactInfoTypeImpl#getPOCInfo <em>POC Info</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.ContactInfoTypeImpl#getPOCPhoneNumber <em>POC Phone Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.ContactInfoTypeImpl#getReturnEmailAddress <em>Return Email Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactInfoTypeImpl extends MinimalEObjectImpl.Container implements ContactInfoType {
	/**
	 * The default value of the '{@link #getPOCInfo() <em>POC Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String POC_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOCInfo() <em>POC Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCInfo()
	 * @generated
	 * @ordered
	 */
	protected String pOCInfo = POC_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPOCPhoneNumber() <em>POC Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String POC_PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOCPhoneNumber() <em>POC Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOCPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String pOCPhoneNumber = POC_PHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnEmailAddress() <em>Return Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_EMAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnEmailAddress() <em>Return Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected String returnEmailAddress = RETURN_EMAIL_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.CONTACT_INFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPOCInfo() {
		return pOCInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOCInfo(String newPOCInfo) {
		String oldPOCInfo = pOCInfo;
		pOCInfo = newPOCInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CONTACT_INFO_TYPE__POC_INFO, oldPOCInfo, pOCInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPOCPhoneNumber() {
		return pOCPhoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPOCPhoneNumber(String newPOCPhoneNumber) {
		String oldPOCPhoneNumber = pOCPhoneNumber;
		pOCPhoneNumber = newPOCPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CONTACT_INFO_TYPE__POC_PHONE_NUMBER, oldPOCPhoneNumber, pOCPhoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnEmailAddress() {
		return returnEmailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnEmailAddress(String newReturnEmailAddress) {
		String oldReturnEmailAddress = returnEmailAddress;
		returnEmailAddress = newReturnEmailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CONTACT_INFO_TYPE__RETURN_EMAIL_ADDRESS, oldReturnEmailAddress, returnEmailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.CONTACT_INFO_TYPE__POC_INFO:
				return getPOCInfo();
			case DisPackage.CONTACT_INFO_TYPE__POC_PHONE_NUMBER:
				return getPOCPhoneNumber();
			case DisPackage.CONTACT_INFO_TYPE__RETURN_EMAIL_ADDRESS:
				return getReturnEmailAddress();
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
			case DisPackage.CONTACT_INFO_TYPE__POC_INFO:
				setPOCInfo((String)newValue);
				return;
			case DisPackage.CONTACT_INFO_TYPE__POC_PHONE_NUMBER:
				setPOCPhoneNumber((String)newValue);
				return;
			case DisPackage.CONTACT_INFO_TYPE__RETURN_EMAIL_ADDRESS:
				setReturnEmailAddress((String)newValue);
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
			case DisPackage.CONTACT_INFO_TYPE__POC_INFO:
				setPOCInfo(POC_INFO_EDEFAULT);
				return;
			case DisPackage.CONTACT_INFO_TYPE__POC_PHONE_NUMBER:
				setPOCPhoneNumber(POC_PHONE_NUMBER_EDEFAULT);
				return;
			case DisPackage.CONTACT_INFO_TYPE__RETURN_EMAIL_ADDRESS:
				setReturnEmailAddress(RETURN_EMAIL_ADDRESS_EDEFAULT);
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
			case DisPackage.CONTACT_INFO_TYPE__POC_INFO:
				return POC_INFO_EDEFAULT == null ? pOCInfo != null : !POC_INFO_EDEFAULT.equals(pOCInfo);
			case DisPackage.CONTACT_INFO_TYPE__POC_PHONE_NUMBER:
				return POC_PHONE_NUMBER_EDEFAULT == null ? pOCPhoneNumber != null : !POC_PHONE_NUMBER_EDEFAULT.equals(pOCPhoneNumber);
			case DisPackage.CONTACT_INFO_TYPE__RETURN_EMAIL_ADDRESS:
				return RETURN_EMAIL_ADDRESS_EDEFAULT == null ? returnEmailAddress != null : !RETURN_EMAIL_ADDRESS_EDEFAULT.equals(returnEmailAddress);
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
		result.append(" (pOCInfo: ");
		result.append(pOCInfo);
		result.append(", pOCPhoneNumber: ");
		result.append(pOCPhoneNumber);
		result.append(", returnEmailAddress: ");
		result.append(returnEmailAddress);
		result.append(')');
		return result.toString();
	}

} //ContactInfoTypeImpl
