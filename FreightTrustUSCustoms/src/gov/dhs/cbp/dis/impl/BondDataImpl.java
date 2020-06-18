/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.BondData;
import gov.dhs.cbp.dis.DisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bond Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.BondDataImpl#getBondName <em>Bond Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BondDataImpl#getBondNumber <em>Bond Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BondDataImpl#getBondType <em>Bond Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BondDataImpl#getSuretyCode <em>Surety Code</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BondDataImpl#getAgentIDNbr <em>Agent ID Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BondDataImpl#getFiler <em>Filer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.BondDataImpl#getBondAmount <em>Bond Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BondDataImpl extends MinimalEObjectImpl.Container implements BondData {
	/**
	 * The default value of the '{@link #getBondName() <em>Bond Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondName()
	 * @generated
	 * @ordered
	 */
	protected static final String BOND_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBondName() <em>Bond Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondName()
	 * @generated
	 * @ordered
	 */
	protected String bondName = BOND_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBondNumber() <em>Bond Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BOND_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBondNumber() <em>Bond Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondNumber()
	 * @generated
	 * @ordered
	 */
	protected String bondNumber = BOND_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBondType() <em>Bond Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondType()
	 * @generated
	 * @ordered
	 */
	protected static final String BOND_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBondType() <em>Bond Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondType()
	 * @generated
	 * @ordered
	 */
	protected String bondType = BOND_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuretyCode() <em>Surety Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuretyCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SURETY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuretyCode() <em>Surety Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuretyCode()
	 * @generated
	 * @ordered
	 */
	protected String suretyCode = SURETY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentIDNbr() <em>Agent ID Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentIDNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_ID_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentIDNbr() <em>Agent ID Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentIDNbr()
	 * @generated
	 * @ordered
	 */
	protected String agentIDNbr = AGENT_ID_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiler() <em>Filer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiler()
	 * @generated
	 * @ordered
	 */
	protected static final String FILER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiler() <em>Filer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiler()
	 * @generated
	 * @ordered
	 */
	protected String filer = FILER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBondAmount() <em>Bond Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondAmount()
	 * @generated
	 * @ordered
	 */
	protected static final String BOND_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBondAmount() <em>Bond Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondAmount()
	 * @generated
	 * @ordered
	 */
	protected String bondAmount = BOND_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BondDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.BOND_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBondName() {
		return bondName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBondName(String newBondName) {
		String oldBondName = bondName;
		bondName = newBondName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BOND_DATA__BOND_NAME, oldBondName, bondName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBondNumber() {
		return bondNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBondNumber(String newBondNumber) {
		String oldBondNumber = bondNumber;
		bondNumber = newBondNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BOND_DATA__BOND_NUMBER, oldBondNumber, bondNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBondType() {
		return bondType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBondType(String newBondType) {
		String oldBondType = bondType;
		bondType = newBondType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BOND_DATA__BOND_TYPE, oldBondType, bondType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuretyCode() {
		return suretyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuretyCode(String newSuretyCode) {
		String oldSuretyCode = suretyCode;
		suretyCode = newSuretyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BOND_DATA__SURETY_CODE, oldSuretyCode, suretyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentIDNbr() {
		return agentIDNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentIDNbr(String newAgentIDNbr) {
		String oldAgentIDNbr = agentIDNbr;
		agentIDNbr = newAgentIDNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BOND_DATA__AGENT_ID_NBR, oldAgentIDNbr, agentIDNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiler() {
		return filer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiler(String newFiler) {
		String oldFiler = filer;
		filer = newFiler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BOND_DATA__FILER, oldFiler, filer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBondAmount() {
		return bondAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBondAmount(String newBondAmount) {
		String oldBondAmount = bondAmount;
		bondAmount = newBondAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.BOND_DATA__BOND_AMOUNT, oldBondAmount, bondAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.BOND_DATA__BOND_NAME:
				return getBondName();
			case DisPackage.BOND_DATA__BOND_NUMBER:
				return getBondNumber();
			case DisPackage.BOND_DATA__BOND_TYPE:
				return getBondType();
			case DisPackage.BOND_DATA__SURETY_CODE:
				return getSuretyCode();
			case DisPackage.BOND_DATA__AGENT_ID_NBR:
				return getAgentIDNbr();
			case DisPackage.BOND_DATA__FILER:
				return getFiler();
			case DisPackage.BOND_DATA__BOND_AMOUNT:
				return getBondAmount();
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
			case DisPackage.BOND_DATA__BOND_NAME:
				setBondName((String)newValue);
				return;
			case DisPackage.BOND_DATA__BOND_NUMBER:
				setBondNumber((String)newValue);
				return;
			case DisPackage.BOND_DATA__BOND_TYPE:
				setBondType((String)newValue);
				return;
			case DisPackage.BOND_DATA__SURETY_CODE:
				setSuretyCode((String)newValue);
				return;
			case DisPackage.BOND_DATA__AGENT_ID_NBR:
				setAgentIDNbr((String)newValue);
				return;
			case DisPackage.BOND_DATA__FILER:
				setFiler((String)newValue);
				return;
			case DisPackage.BOND_DATA__BOND_AMOUNT:
				setBondAmount((String)newValue);
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
			case DisPackage.BOND_DATA__BOND_NAME:
				setBondName(BOND_NAME_EDEFAULT);
				return;
			case DisPackage.BOND_DATA__BOND_NUMBER:
				setBondNumber(BOND_NUMBER_EDEFAULT);
				return;
			case DisPackage.BOND_DATA__BOND_TYPE:
				setBondType(BOND_TYPE_EDEFAULT);
				return;
			case DisPackage.BOND_DATA__SURETY_CODE:
				setSuretyCode(SURETY_CODE_EDEFAULT);
				return;
			case DisPackage.BOND_DATA__AGENT_ID_NBR:
				setAgentIDNbr(AGENT_ID_NBR_EDEFAULT);
				return;
			case DisPackage.BOND_DATA__FILER:
				setFiler(FILER_EDEFAULT);
				return;
			case DisPackage.BOND_DATA__BOND_AMOUNT:
				setBondAmount(BOND_AMOUNT_EDEFAULT);
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
			case DisPackage.BOND_DATA__BOND_NAME:
				return BOND_NAME_EDEFAULT == null ? bondName != null : !BOND_NAME_EDEFAULT.equals(bondName);
			case DisPackage.BOND_DATA__BOND_NUMBER:
				return BOND_NUMBER_EDEFAULT == null ? bondNumber != null : !BOND_NUMBER_EDEFAULT.equals(bondNumber);
			case DisPackage.BOND_DATA__BOND_TYPE:
				return BOND_TYPE_EDEFAULT == null ? bondType != null : !BOND_TYPE_EDEFAULT.equals(bondType);
			case DisPackage.BOND_DATA__SURETY_CODE:
				return SURETY_CODE_EDEFAULT == null ? suretyCode != null : !SURETY_CODE_EDEFAULT.equals(suretyCode);
			case DisPackage.BOND_DATA__AGENT_ID_NBR:
				return AGENT_ID_NBR_EDEFAULT == null ? agentIDNbr != null : !AGENT_ID_NBR_EDEFAULT.equals(agentIDNbr);
			case DisPackage.BOND_DATA__FILER:
				return FILER_EDEFAULT == null ? filer != null : !FILER_EDEFAULT.equals(filer);
			case DisPackage.BOND_DATA__BOND_AMOUNT:
				return BOND_AMOUNT_EDEFAULT == null ? bondAmount != null : !BOND_AMOUNT_EDEFAULT.equals(bondAmount);
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
		result.append(" (bondName: ");
		result.append(bondName);
		result.append(", bondNumber: ");
		result.append(bondNumber);
		result.append(", bondType: ");
		result.append(bondType);
		result.append(", suretyCode: ");
		result.append(suretyCode);
		result.append(", agentIDNbr: ");
		result.append(agentIDNbr);
		result.append(", filer: ");
		result.append(filer);
		result.append(", bondAmount: ");
		result.append(bondAmount);
		result.append(')');
		return result.toString();
	}

} //BondDataImpl
