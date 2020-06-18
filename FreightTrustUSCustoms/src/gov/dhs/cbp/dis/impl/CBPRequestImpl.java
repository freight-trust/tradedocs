/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.CBPRequest;
import gov.dhs.cbp.dis.DisPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CBP Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.CBPRequestImpl#getCBPRequestID <em>CBP Request ID</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CBPRequestImpl#getCBPRequestType <em>CBP Request Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CBPRequestImpl#getCBPRequestDate <em>CBP Request Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CBPRequestImpl extends MinimalEObjectImpl.Container implements CBPRequest {
	/**
	 * The default value of the '{@link #getCBPRequestID() <em>CBP Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBPRequestID()
	 * @generated
	 * @ordered
	 */
	protected static final String CBP_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCBPRequestID() <em>CBP Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBPRequestID()
	 * @generated
	 * @ordered
	 */
	protected String cBPRequestID = CBP_REQUEST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCBPRequestType() <em>CBP Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBPRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final String CBP_REQUEST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCBPRequestType() <em>CBP Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBPRequestType()
	 * @generated
	 * @ordered
	 */
	protected String cBPRequestType = CBP_REQUEST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCBPRequestDate() <em>CBP Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBPRequestDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CBP_REQUEST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCBPRequestDate() <em>CBP Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCBPRequestDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar cBPRequestDate = CBP_REQUEST_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CBPRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.CBP_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCBPRequestID() {
		return cBPRequestID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCBPRequestID(String newCBPRequestID) {
		String oldCBPRequestID = cBPRequestID;
		cBPRequestID = newCBPRequestID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CBP_REQUEST__CBP_REQUEST_ID, oldCBPRequestID, cBPRequestID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCBPRequestType() {
		return cBPRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCBPRequestType(String newCBPRequestType) {
		String oldCBPRequestType = cBPRequestType;
		cBPRequestType = newCBPRequestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CBP_REQUEST__CBP_REQUEST_TYPE, oldCBPRequestType, cBPRequestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCBPRequestDate() {
		return cBPRequestDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCBPRequestDate(XMLGregorianCalendar newCBPRequestDate) {
		XMLGregorianCalendar oldCBPRequestDate = cBPRequestDate;
		cBPRequestDate = newCBPRequestDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CBP_REQUEST__CBP_REQUEST_DATE, oldCBPRequestDate, cBPRequestDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.CBP_REQUEST__CBP_REQUEST_ID:
				return getCBPRequestID();
			case DisPackage.CBP_REQUEST__CBP_REQUEST_TYPE:
				return getCBPRequestType();
			case DisPackage.CBP_REQUEST__CBP_REQUEST_DATE:
				return getCBPRequestDate();
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
			case DisPackage.CBP_REQUEST__CBP_REQUEST_ID:
				setCBPRequestID((String)newValue);
				return;
			case DisPackage.CBP_REQUEST__CBP_REQUEST_TYPE:
				setCBPRequestType((String)newValue);
				return;
			case DisPackage.CBP_REQUEST__CBP_REQUEST_DATE:
				setCBPRequestDate((XMLGregorianCalendar)newValue);
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
			case DisPackage.CBP_REQUEST__CBP_REQUEST_ID:
				setCBPRequestID(CBP_REQUEST_ID_EDEFAULT);
				return;
			case DisPackage.CBP_REQUEST__CBP_REQUEST_TYPE:
				setCBPRequestType(CBP_REQUEST_TYPE_EDEFAULT);
				return;
			case DisPackage.CBP_REQUEST__CBP_REQUEST_DATE:
				setCBPRequestDate(CBP_REQUEST_DATE_EDEFAULT);
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
			case DisPackage.CBP_REQUEST__CBP_REQUEST_ID:
				return CBP_REQUEST_ID_EDEFAULT == null ? cBPRequestID != null : !CBP_REQUEST_ID_EDEFAULT.equals(cBPRequestID);
			case DisPackage.CBP_REQUEST__CBP_REQUEST_TYPE:
				return CBP_REQUEST_TYPE_EDEFAULT == null ? cBPRequestType != null : !CBP_REQUEST_TYPE_EDEFAULT.equals(cBPRequestType);
			case DisPackage.CBP_REQUEST__CBP_REQUEST_DATE:
				return CBP_REQUEST_DATE_EDEFAULT == null ? cBPRequestDate != null : !CBP_REQUEST_DATE_EDEFAULT.equals(cBPRequestDate);
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
		result.append(" (cBPRequestID: ");
		result.append(cBPRequestID);
		result.append(", cBPRequestType: ");
		result.append(cBPRequestType);
		result.append(", cBPRequestDate: ");
		result.append(cBPRequestDate);
		result.append(')');
		return result.toString();
	}

} //CBPRequestImpl
