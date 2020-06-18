/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.AdditionalData;
import gov.dhs.cbp.dis.BondData;
import gov.dhs.cbp.dis.CertificateData;
import gov.dhs.cbp.dis.CommodityList;
import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.InvoiceData;
import gov.dhs.cbp.dis.OptionalData;
import gov.dhs.cbp.dis.PackingListData;
import gov.dhs.cbp.dis.PermitData;
import gov.dhs.cbp.dis.ToxicSubstancesData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.OptionalDataImpl#getInvoiceData <em>Invoice Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.OptionalDataImpl#getBondData <em>Bond Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.OptionalDataImpl#getPackingListData <em>Packing List Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.OptionalDataImpl#getCertificateData <em>Certificate Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.OptionalDataImpl#getPermitData <em>Permit Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.OptionalDataImpl#getToxicSubstancesData <em>Toxic Substances Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.OptionalDataImpl#getCommodityList <em>Commodity List</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.OptionalDataImpl#getAdditionalData <em>Additional Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionalDataImpl extends MinimalEObjectImpl.Container implements OptionalData {
	/**
	 * The cached value of the '{@link #getInvoiceData() <em>Invoice Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceData()
	 * @generated
	 * @ordered
	 */
	protected InvoiceData invoiceData;

	/**
	 * The cached value of the '{@link #getBondData() <em>Bond Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBondData()
	 * @generated
	 * @ordered
	 */
	protected BondData bondData;

	/**
	 * The cached value of the '{@link #getPackingListData() <em>Packing List Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackingListData()
	 * @generated
	 * @ordered
	 */
	protected PackingListData packingListData;

	/**
	 * The cached value of the '{@link #getCertificateData() <em>Certificate Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateData()
	 * @generated
	 * @ordered
	 */
	protected CertificateData certificateData;

	/**
	 * The cached value of the '{@link #getPermitData() <em>Permit Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitData()
	 * @generated
	 * @ordered
	 */
	protected PermitData permitData;

	/**
	 * The cached value of the '{@link #getToxicSubstancesData() <em>Toxic Substances Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToxicSubstancesData()
	 * @generated
	 * @ordered
	 */
	protected ToxicSubstancesData toxicSubstancesData;

	/**
	 * The cached value of the '{@link #getCommodityList() <em>Commodity List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityList()
	 * @generated
	 * @ordered
	 */
	protected CommodityList commodityList;

	/**
	 * The cached value of the '{@link #getAdditionalData() <em>Additional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalData()
	 * @generated
	 * @ordered
	 */
	protected AdditionalData additionalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.OPTIONAL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceData getInvoiceData() {
		return invoiceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoiceData(InvoiceData newInvoiceData, NotificationChain msgs) {
		InvoiceData oldInvoiceData = invoiceData;
		invoiceData = newInvoiceData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__INVOICE_DATA, oldInvoiceData, newInvoiceData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceData(InvoiceData newInvoiceData) {
		if (newInvoiceData != invoiceData) {
			NotificationChain msgs = null;
			if (invoiceData != null)
				msgs = ((InternalEObject)invoiceData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__INVOICE_DATA, null, msgs);
			if (newInvoiceData != null)
				msgs = ((InternalEObject)newInvoiceData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__INVOICE_DATA, null, msgs);
			msgs = basicSetInvoiceData(newInvoiceData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__INVOICE_DATA, newInvoiceData, newInvoiceData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BondData getBondData() {
		return bondData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBondData(BondData newBondData, NotificationChain msgs) {
		BondData oldBondData = bondData;
		bondData = newBondData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__BOND_DATA, oldBondData, newBondData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBondData(BondData newBondData) {
		if (newBondData != bondData) {
			NotificationChain msgs = null;
			if (bondData != null)
				msgs = ((InternalEObject)bondData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__BOND_DATA, null, msgs);
			if (newBondData != null)
				msgs = ((InternalEObject)newBondData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__BOND_DATA, null, msgs);
			msgs = basicSetBondData(newBondData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__BOND_DATA, newBondData, newBondData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackingListData getPackingListData() {
		return packingListData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackingListData(PackingListData newPackingListData, NotificationChain msgs) {
		PackingListData oldPackingListData = packingListData;
		packingListData = newPackingListData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA, oldPackingListData, newPackingListData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackingListData(PackingListData newPackingListData) {
		if (newPackingListData != packingListData) {
			NotificationChain msgs = null;
			if (packingListData != null)
				msgs = ((InternalEObject)packingListData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA, null, msgs);
			if (newPackingListData != null)
				msgs = ((InternalEObject)newPackingListData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA, null, msgs);
			msgs = basicSetPackingListData(newPackingListData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA, newPackingListData, newPackingListData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateData getCertificateData() {
		return certificateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificateData(CertificateData newCertificateData, NotificationChain msgs) {
		CertificateData oldCertificateData = certificateData;
		certificateData = newCertificateData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA, oldCertificateData, newCertificateData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateData(CertificateData newCertificateData) {
		if (newCertificateData != certificateData) {
			NotificationChain msgs = null;
			if (certificateData != null)
				msgs = ((InternalEObject)certificateData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA, null, msgs);
			if (newCertificateData != null)
				msgs = ((InternalEObject)newCertificateData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA, null, msgs);
			msgs = basicSetCertificateData(newCertificateData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA, newCertificateData, newCertificateData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermitData getPermitData() {
		return permitData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermitData(PermitData newPermitData, NotificationChain msgs) {
		PermitData oldPermitData = permitData;
		permitData = newPermitData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__PERMIT_DATA, oldPermitData, newPermitData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermitData(PermitData newPermitData) {
		if (newPermitData != permitData) {
			NotificationChain msgs = null;
			if (permitData != null)
				msgs = ((InternalEObject)permitData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__PERMIT_DATA, null, msgs);
			if (newPermitData != null)
				msgs = ((InternalEObject)newPermitData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__PERMIT_DATA, null, msgs);
			msgs = basicSetPermitData(newPermitData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__PERMIT_DATA, newPermitData, newPermitData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToxicSubstancesData getToxicSubstancesData() {
		return toxicSubstancesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToxicSubstancesData(ToxicSubstancesData newToxicSubstancesData, NotificationChain msgs) {
		ToxicSubstancesData oldToxicSubstancesData = toxicSubstancesData;
		toxicSubstancesData = newToxicSubstancesData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA, oldToxicSubstancesData, newToxicSubstancesData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToxicSubstancesData(ToxicSubstancesData newToxicSubstancesData) {
		if (newToxicSubstancesData != toxicSubstancesData) {
			NotificationChain msgs = null;
			if (toxicSubstancesData != null)
				msgs = ((InternalEObject)toxicSubstancesData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA, null, msgs);
			if (newToxicSubstancesData != null)
				msgs = ((InternalEObject)newToxicSubstancesData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA, null, msgs);
			msgs = basicSetToxicSubstancesData(newToxicSubstancesData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA, newToxicSubstancesData, newToxicSubstancesData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommodityList getCommodityList() {
		return commodityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommodityList(CommodityList newCommodityList, NotificationChain msgs) {
		CommodityList oldCommodityList = commodityList;
		commodityList = newCommodityList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__COMMODITY_LIST, oldCommodityList, newCommodityList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommodityList(CommodityList newCommodityList) {
		if (newCommodityList != commodityList) {
			NotificationChain msgs = null;
			if (commodityList != null)
				msgs = ((InternalEObject)commodityList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__COMMODITY_LIST, null, msgs);
			if (newCommodityList != null)
				msgs = ((InternalEObject)newCommodityList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__COMMODITY_LIST, null, msgs);
			msgs = basicSetCommodityList(newCommodityList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__COMMODITY_LIST, newCommodityList, newCommodityList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalData getAdditionalData() {
		return additionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalData(AdditionalData newAdditionalData, NotificationChain msgs) {
		AdditionalData oldAdditionalData = additionalData;
		additionalData = newAdditionalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA, oldAdditionalData, newAdditionalData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalData(AdditionalData newAdditionalData) {
		if (newAdditionalData != additionalData) {
			NotificationChain msgs = null;
			if (additionalData != null)
				msgs = ((InternalEObject)additionalData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA, null, msgs);
			if (newAdditionalData != null)
				msgs = ((InternalEObject)newAdditionalData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA, null, msgs);
			msgs = basicSetAdditionalData(newAdditionalData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA, newAdditionalData, newAdditionalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.OPTIONAL_DATA__INVOICE_DATA:
				return basicSetInvoiceData(null, msgs);
			case DisPackage.OPTIONAL_DATA__BOND_DATA:
				return basicSetBondData(null, msgs);
			case DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA:
				return basicSetPackingListData(null, msgs);
			case DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA:
				return basicSetCertificateData(null, msgs);
			case DisPackage.OPTIONAL_DATA__PERMIT_DATA:
				return basicSetPermitData(null, msgs);
			case DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA:
				return basicSetToxicSubstancesData(null, msgs);
			case DisPackage.OPTIONAL_DATA__COMMODITY_LIST:
				return basicSetCommodityList(null, msgs);
			case DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA:
				return basicSetAdditionalData(null, msgs);
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
			case DisPackage.OPTIONAL_DATA__INVOICE_DATA:
				return getInvoiceData();
			case DisPackage.OPTIONAL_DATA__BOND_DATA:
				return getBondData();
			case DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA:
				return getPackingListData();
			case DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA:
				return getCertificateData();
			case DisPackage.OPTIONAL_DATA__PERMIT_DATA:
				return getPermitData();
			case DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA:
				return getToxicSubstancesData();
			case DisPackage.OPTIONAL_DATA__COMMODITY_LIST:
				return getCommodityList();
			case DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA:
				return getAdditionalData();
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
			case DisPackage.OPTIONAL_DATA__INVOICE_DATA:
				setInvoiceData((InvoiceData)newValue);
				return;
			case DisPackage.OPTIONAL_DATA__BOND_DATA:
				setBondData((BondData)newValue);
				return;
			case DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA:
				setPackingListData((PackingListData)newValue);
				return;
			case DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA:
				setCertificateData((CertificateData)newValue);
				return;
			case DisPackage.OPTIONAL_DATA__PERMIT_DATA:
				setPermitData((PermitData)newValue);
				return;
			case DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA:
				setToxicSubstancesData((ToxicSubstancesData)newValue);
				return;
			case DisPackage.OPTIONAL_DATA__COMMODITY_LIST:
				setCommodityList((CommodityList)newValue);
				return;
			case DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA:
				setAdditionalData((AdditionalData)newValue);
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
			case DisPackage.OPTIONAL_DATA__INVOICE_DATA:
				setInvoiceData((InvoiceData)null);
				return;
			case DisPackage.OPTIONAL_DATA__BOND_DATA:
				setBondData((BondData)null);
				return;
			case DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA:
				setPackingListData((PackingListData)null);
				return;
			case DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA:
				setCertificateData((CertificateData)null);
				return;
			case DisPackage.OPTIONAL_DATA__PERMIT_DATA:
				setPermitData((PermitData)null);
				return;
			case DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA:
				setToxicSubstancesData((ToxicSubstancesData)null);
				return;
			case DisPackage.OPTIONAL_DATA__COMMODITY_LIST:
				setCommodityList((CommodityList)null);
				return;
			case DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA:
				setAdditionalData((AdditionalData)null);
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
			case DisPackage.OPTIONAL_DATA__INVOICE_DATA:
				return invoiceData != null;
			case DisPackage.OPTIONAL_DATA__BOND_DATA:
				return bondData != null;
			case DisPackage.OPTIONAL_DATA__PACKING_LIST_DATA:
				return packingListData != null;
			case DisPackage.OPTIONAL_DATA__CERTIFICATE_DATA:
				return certificateData != null;
			case DisPackage.OPTIONAL_DATA__PERMIT_DATA:
				return permitData != null;
			case DisPackage.OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA:
				return toxicSubstancesData != null;
			case DisPackage.OPTIONAL_DATA__COMMODITY_LIST:
				return commodityList != null;
			case DisPackage.OPTIONAL_DATA__ADDITIONAL_DATA:
				return additionalData != null;
		}
		return super.eIsSet(featureID);
	}

} //OptionalDataImpl
