/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.BillType;
import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.EntrySummaryType;
import gov.dhs.cbp.dis.EntryType;
import gov.dhs.cbp.dis.ISFNumberType;
import gov.dhs.cbp.dis.ITNType;
import gov.dhs.cbp.dis.OtherTransactionType;
import gov.dhs.cbp.dis.TradeTransaction;
import gov.dhs.cbp.dis.XTNType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trade Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getTransactionCategory <em>Transaction Category</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getEntrySummary <em>Entry Summary</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getBill <em>Bill</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getISFNumber <em>ISF Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getITN <em>ITN</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getXTN <em>XTN</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getFTZAdmissionNbr <em>FTZ Admission Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getImporterOfRecordNbr <em>Importer Of Record Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl#getOtherTransaction <em>Other Transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TradeTransactionImpl extends MinimalEObjectImpl.Container implements TradeTransaction {
	/**
	 * The default value of the '{@link #getTransactionCategory() <em>Transaction Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransactionCategory() <em>Transaction Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCategory()
	 * @generated
	 * @ordered
	 */
	protected String transactionCategory = TRANSACTION_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryType> entry;

	/**
	 * The cached value of the '{@link #getEntrySummary() <em>Entry Summary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrySummary()
	 * @generated
	 * @ordered
	 */
	protected EList<EntrySummaryType> entrySummary;

	/**
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected EList<BillType> bill;

	/**
	 * The cached value of the '{@link #getISFNumber() <em>ISF Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISFNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<ISFNumberType> iSFNumber;

	/**
	 * The cached value of the '{@link #getITN() <em>ITN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getITN()
	 * @generated
	 * @ordered
	 */
	protected EList<ITNType> iTN;

	/**
	 * The cached value of the '{@link #getXTN() <em>XTN</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN()
	 * @generated
	 * @ordered
	 */
	protected EList<XTNType> xTN;

	/**
	 * The default value of the '{@link #getFTZAdmissionNbr() <em>FTZ Admission Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTZAdmissionNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String FTZ_ADMISSION_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFTZAdmissionNbr() <em>FTZ Admission Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTZAdmissionNbr()
	 * @generated
	 * @ordered
	 */
	protected String fTZAdmissionNbr = FTZ_ADMISSION_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getImporterOfRecordNbr() <em>Importer Of Record Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterOfRecordNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTER_OF_RECORD_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImporterOfRecordNbr() <em>Importer Of Record Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterOfRecordNbr()
	 * @generated
	 * @ordered
	 */
	protected String importerOfRecordNbr = IMPORTER_OF_RECORD_NBR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherTransaction() <em>Other Transaction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherTransactionType> otherTransaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradeTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.TRADE_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransactionCategory() {
		return transactionCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionCategory(String newTransactionCategory) {
		String oldTransactionCategory = transactionCategory;
		transactionCategory = newTransactionCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TRADE_TRANSACTION__TRANSACTION_CATEGORY, oldTransactionCategory, transactionCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryType> getEntry() {
		if (entry == null) {
			entry = new EObjectContainmentEList<EntryType>(EntryType.class, this, DisPackage.TRADE_TRANSACTION__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntrySummaryType> getEntrySummary() {
		if (entrySummary == null) {
			entrySummary = new EObjectContainmentEList<EntrySummaryType>(EntrySummaryType.class, this, DisPackage.TRADE_TRANSACTION__ENTRY_SUMMARY);
		}
		return entrySummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BillType> getBill() {
		if (bill == null) {
			bill = new EObjectContainmentEList<BillType>(BillType.class, this, DisPackage.TRADE_TRANSACTION__BILL);
		}
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISFNumberType> getISFNumber() {
		if (iSFNumber == null) {
			iSFNumber = new EObjectContainmentEList<ISFNumberType>(ISFNumberType.class, this, DisPackage.TRADE_TRANSACTION__ISF_NUMBER);
		}
		return iSFNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ITNType> getITN() {
		if (iTN == null) {
			iTN = new EObjectContainmentEList<ITNType>(ITNType.class, this, DisPackage.TRADE_TRANSACTION__ITN);
		}
		return iTN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XTNType> getXTN() {
		if (xTN == null) {
			xTN = new EObjectContainmentEList<XTNType>(XTNType.class, this, DisPackage.TRADE_TRANSACTION__XTN);
		}
		return xTN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFTZAdmissionNbr() {
		return fTZAdmissionNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFTZAdmissionNbr(String newFTZAdmissionNbr) {
		String oldFTZAdmissionNbr = fTZAdmissionNbr;
		fTZAdmissionNbr = newFTZAdmissionNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TRADE_TRANSACTION__FTZ_ADMISSION_NBR, oldFTZAdmissionNbr, fTZAdmissionNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImporterOfRecordNbr() {
		return importerOfRecordNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImporterOfRecordNbr(String newImporterOfRecordNbr) {
		String oldImporterOfRecordNbr = importerOfRecordNbr;
		importerOfRecordNbr = newImporterOfRecordNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TRADE_TRANSACTION__IMPORTER_OF_RECORD_NBR, oldImporterOfRecordNbr, importerOfRecordNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherTransactionType> getOtherTransaction() {
		if (otherTransaction == null) {
			otherTransaction = new EObjectContainmentEList<OtherTransactionType>(OtherTransactionType.class, this, DisPackage.TRADE_TRANSACTION__OTHER_TRANSACTION);
		}
		return otherTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.TRADE_TRANSACTION__ENTRY:
				return ((InternalEList<?>)getEntry()).basicRemove(otherEnd, msgs);
			case DisPackage.TRADE_TRANSACTION__ENTRY_SUMMARY:
				return ((InternalEList<?>)getEntrySummary()).basicRemove(otherEnd, msgs);
			case DisPackage.TRADE_TRANSACTION__BILL:
				return ((InternalEList<?>)getBill()).basicRemove(otherEnd, msgs);
			case DisPackage.TRADE_TRANSACTION__ISF_NUMBER:
				return ((InternalEList<?>)getISFNumber()).basicRemove(otherEnd, msgs);
			case DisPackage.TRADE_TRANSACTION__ITN:
				return ((InternalEList<?>)getITN()).basicRemove(otherEnd, msgs);
			case DisPackage.TRADE_TRANSACTION__XTN:
				return ((InternalEList<?>)getXTN()).basicRemove(otherEnd, msgs);
			case DisPackage.TRADE_TRANSACTION__OTHER_TRANSACTION:
				return ((InternalEList<?>)getOtherTransaction()).basicRemove(otherEnd, msgs);
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
			case DisPackage.TRADE_TRANSACTION__TRANSACTION_CATEGORY:
				return getTransactionCategory();
			case DisPackage.TRADE_TRANSACTION__ENTRY:
				return getEntry();
			case DisPackage.TRADE_TRANSACTION__ENTRY_SUMMARY:
				return getEntrySummary();
			case DisPackage.TRADE_TRANSACTION__BILL:
				return getBill();
			case DisPackage.TRADE_TRANSACTION__ISF_NUMBER:
				return getISFNumber();
			case DisPackage.TRADE_TRANSACTION__ITN:
				return getITN();
			case DisPackage.TRADE_TRANSACTION__XTN:
				return getXTN();
			case DisPackage.TRADE_TRANSACTION__FTZ_ADMISSION_NBR:
				return getFTZAdmissionNbr();
			case DisPackage.TRADE_TRANSACTION__IMPORTER_OF_RECORD_NBR:
				return getImporterOfRecordNbr();
			case DisPackage.TRADE_TRANSACTION__OTHER_TRANSACTION:
				return getOtherTransaction();
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
			case DisPackage.TRADE_TRANSACTION__TRANSACTION_CATEGORY:
				setTransactionCategory((String)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends EntryType>)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__ENTRY_SUMMARY:
				getEntrySummary().clear();
				getEntrySummary().addAll((Collection<? extends EntrySummaryType>)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__BILL:
				getBill().clear();
				getBill().addAll((Collection<? extends BillType>)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__ISF_NUMBER:
				getISFNumber().clear();
				getISFNumber().addAll((Collection<? extends ISFNumberType>)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__ITN:
				getITN().clear();
				getITN().addAll((Collection<? extends ITNType>)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__XTN:
				getXTN().clear();
				getXTN().addAll((Collection<? extends XTNType>)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__FTZ_ADMISSION_NBR:
				setFTZAdmissionNbr((String)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__IMPORTER_OF_RECORD_NBR:
				setImporterOfRecordNbr((String)newValue);
				return;
			case DisPackage.TRADE_TRANSACTION__OTHER_TRANSACTION:
				getOtherTransaction().clear();
				getOtherTransaction().addAll((Collection<? extends OtherTransactionType>)newValue);
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
			case DisPackage.TRADE_TRANSACTION__TRANSACTION_CATEGORY:
				setTransactionCategory(TRANSACTION_CATEGORY_EDEFAULT);
				return;
			case DisPackage.TRADE_TRANSACTION__ENTRY:
				getEntry().clear();
				return;
			case DisPackage.TRADE_TRANSACTION__ENTRY_SUMMARY:
				getEntrySummary().clear();
				return;
			case DisPackage.TRADE_TRANSACTION__BILL:
				getBill().clear();
				return;
			case DisPackage.TRADE_TRANSACTION__ISF_NUMBER:
				getISFNumber().clear();
				return;
			case DisPackage.TRADE_TRANSACTION__ITN:
				getITN().clear();
				return;
			case DisPackage.TRADE_TRANSACTION__XTN:
				getXTN().clear();
				return;
			case DisPackage.TRADE_TRANSACTION__FTZ_ADMISSION_NBR:
				setFTZAdmissionNbr(FTZ_ADMISSION_NBR_EDEFAULT);
				return;
			case DisPackage.TRADE_TRANSACTION__IMPORTER_OF_RECORD_NBR:
				setImporterOfRecordNbr(IMPORTER_OF_RECORD_NBR_EDEFAULT);
				return;
			case DisPackage.TRADE_TRANSACTION__OTHER_TRANSACTION:
				getOtherTransaction().clear();
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
			case DisPackage.TRADE_TRANSACTION__TRANSACTION_CATEGORY:
				return TRANSACTION_CATEGORY_EDEFAULT == null ? transactionCategory != null : !TRANSACTION_CATEGORY_EDEFAULT.equals(transactionCategory);
			case DisPackage.TRADE_TRANSACTION__ENTRY:
				return entry != null && !entry.isEmpty();
			case DisPackage.TRADE_TRANSACTION__ENTRY_SUMMARY:
				return entrySummary != null && !entrySummary.isEmpty();
			case DisPackage.TRADE_TRANSACTION__BILL:
				return bill != null && !bill.isEmpty();
			case DisPackage.TRADE_TRANSACTION__ISF_NUMBER:
				return iSFNumber != null && !iSFNumber.isEmpty();
			case DisPackage.TRADE_TRANSACTION__ITN:
				return iTN != null && !iTN.isEmpty();
			case DisPackage.TRADE_TRANSACTION__XTN:
				return xTN != null && !xTN.isEmpty();
			case DisPackage.TRADE_TRANSACTION__FTZ_ADMISSION_NBR:
				return FTZ_ADMISSION_NBR_EDEFAULT == null ? fTZAdmissionNbr != null : !FTZ_ADMISSION_NBR_EDEFAULT.equals(fTZAdmissionNbr);
			case DisPackage.TRADE_TRANSACTION__IMPORTER_OF_RECORD_NBR:
				return IMPORTER_OF_RECORD_NBR_EDEFAULT == null ? importerOfRecordNbr != null : !IMPORTER_OF_RECORD_NBR_EDEFAULT.equals(importerOfRecordNbr);
			case DisPackage.TRADE_TRANSACTION__OTHER_TRANSACTION:
				return otherTransaction != null && !otherTransaction.isEmpty();
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
		result.append(" (transactionCategory: ");
		result.append(transactionCategory);
		result.append(", fTZAdmissionNbr: ");
		result.append(fTZAdmissionNbr);
		result.append(", importerOfRecordNbr: ");
		result.append(importerOfRecordNbr);
		result.append(')');
		return result.toString();
	}

} //TradeTransactionImpl
