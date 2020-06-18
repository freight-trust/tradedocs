/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.TradePartyInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trade Party Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradePartyInfoImpl#getTradePartyID <em>Trade Party ID</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradePartyInfoImpl#getTradePartyType <em>Trade Party Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradePartyInfoImpl#getTradePartyName <em>Trade Party Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradePartyInfoImpl#getTradePartyAddress <em>Trade Party Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TradePartyInfoImpl extends MinimalEObjectImpl.Container implements TradePartyInfo {
	/**
	 * The default value of the '{@link #getTradePartyID() <em>Trade Party ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradePartyID()
	 * @generated
	 * @ordered
	 */
	protected static final String TRADE_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTradePartyID() <em>Trade Party ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradePartyID()
	 * @generated
	 * @ordered
	 */
	protected String tradePartyID = TRADE_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTradePartyType() <em>Trade Party Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradePartyType()
	 * @generated
	 * @ordered
	 */
	protected static final String TRADE_PARTY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTradePartyType() <em>Trade Party Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradePartyType()
	 * @generated
	 * @ordered
	 */
	protected String tradePartyType = TRADE_PARTY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTradePartyName() <em>Trade Party Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradePartyName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRADE_PARTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTradePartyName() <em>Trade Party Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradePartyName()
	 * @generated
	 * @ordered
	 */
	protected String tradePartyName = TRADE_PARTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTradePartyAddress() <em>Trade Party Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradePartyAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String TRADE_PARTY_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTradePartyAddress() <em>Trade Party Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradePartyAddress()
	 * @generated
	 * @ordered
	 */
	protected String tradePartyAddress = TRADE_PARTY_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradePartyInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.TRADE_PARTY_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTradePartyID() {
		return tradePartyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradePartyID(String newTradePartyID) {
		String oldTradePartyID = tradePartyID;
		tradePartyID = newTradePartyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ID, oldTradePartyID, tradePartyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTradePartyType() {
		return tradePartyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradePartyType(String newTradePartyType) {
		String oldTradePartyType = tradePartyType;
		tradePartyType = newTradePartyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_TYPE, oldTradePartyType, tradePartyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTradePartyName() {
		return tradePartyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradePartyName(String newTradePartyName) {
		String oldTradePartyName = tradePartyName;
		tradePartyName = newTradePartyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_NAME, oldTradePartyName, tradePartyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTradePartyAddress() {
		return tradePartyAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradePartyAddress(String newTradePartyAddress) {
		String oldTradePartyAddress = tradePartyAddress;
		tradePartyAddress = newTradePartyAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ADDRESS, oldTradePartyAddress, tradePartyAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ID:
				return getTradePartyID();
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_TYPE:
				return getTradePartyType();
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_NAME:
				return getTradePartyName();
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ADDRESS:
				return getTradePartyAddress();
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
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ID:
				setTradePartyID((String)newValue);
				return;
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_TYPE:
				setTradePartyType((String)newValue);
				return;
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_NAME:
				setTradePartyName((String)newValue);
				return;
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ADDRESS:
				setTradePartyAddress((String)newValue);
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
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ID:
				setTradePartyID(TRADE_PARTY_ID_EDEFAULT);
				return;
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_TYPE:
				setTradePartyType(TRADE_PARTY_TYPE_EDEFAULT);
				return;
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_NAME:
				setTradePartyName(TRADE_PARTY_NAME_EDEFAULT);
				return;
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ADDRESS:
				setTradePartyAddress(TRADE_PARTY_ADDRESS_EDEFAULT);
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
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ID:
				return TRADE_PARTY_ID_EDEFAULT == null ? tradePartyID != null : !TRADE_PARTY_ID_EDEFAULT.equals(tradePartyID);
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_TYPE:
				return TRADE_PARTY_TYPE_EDEFAULT == null ? tradePartyType != null : !TRADE_PARTY_TYPE_EDEFAULT.equals(tradePartyType);
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_NAME:
				return TRADE_PARTY_NAME_EDEFAULT == null ? tradePartyName != null : !TRADE_PARTY_NAME_EDEFAULT.equals(tradePartyName);
			case DisPackage.TRADE_PARTY_INFO__TRADE_PARTY_ADDRESS:
				return TRADE_PARTY_ADDRESS_EDEFAULT == null ? tradePartyAddress != null : !TRADE_PARTY_ADDRESS_EDEFAULT.equals(tradePartyAddress);
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
		result.append(" (tradePartyID: ");
		result.append(tradePartyID);
		result.append(", tradePartyType: ");
		result.append(tradePartyType);
		result.append(", tradePartyName: ");
		result.append(tradePartyName);
		result.append(", tradePartyAddress: ");
		result.append(tradePartyAddress);
		result.append(')');
		return result.toString();
	}

} //TradePartyInfoImpl
