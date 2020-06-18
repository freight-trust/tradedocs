/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.CommodityData;
import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.InvoiceLineItemData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Line Item Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.InvoiceLineItemDataImpl#getInvoiceLineNbr <em>Invoice Line Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.InvoiceLineItemDataImpl#getCommodityData <em>Commodity Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceLineItemDataImpl extends MinimalEObjectImpl.Container implements InvoiceLineItemData {
	/**
	 * The default value of the '{@link #getInvoiceLineNbr() <em>Invoice Line Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceLineNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_LINE_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceLineNbr() <em>Invoice Line Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceLineNbr()
	 * @generated
	 * @ordered
	 */
	protected String invoiceLineNbr = INVOICE_LINE_NBR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommodityData() <em>Commodity Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityData()
	 * @generated
	 * @ordered
	 */
	protected CommodityData commodityData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceLineItemDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.INVOICE_LINE_ITEM_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvoiceLineNbr() {
		return invoiceLineNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceLineNbr(String newInvoiceLineNbr) {
		String oldInvoiceLineNbr = invoiceLineNbr;
		invoiceLineNbr = newInvoiceLineNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.INVOICE_LINE_ITEM_DATA__INVOICE_LINE_NBR, oldInvoiceLineNbr, invoiceLineNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommodityData getCommodityData() {
		return commodityData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommodityData(CommodityData newCommodityData, NotificationChain msgs) {
		CommodityData oldCommodityData = commodityData;
		commodityData = newCommodityData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA, oldCommodityData, newCommodityData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommodityData(CommodityData newCommodityData) {
		if (newCommodityData != commodityData) {
			NotificationChain msgs = null;
			if (commodityData != null)
				msgs = ((InternalEObject)commodityData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA, null, msgs);
			if (newCommodityData != null)
				msgs = ((InternalEObject)newCommodityData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA, null, msgs);
			msgs = basicSetCommodityData(newCommodityData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA, newCommodityData, newCommodityData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA:
				return basicSetCommodityData(null, msgs);
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
			case DisPackage.INVOICE_LINE_ITEM_DATA__INVOICE_LINE_NBR:
				return getInvoiceLineNbr();
			case DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA:
				return getCommodityData();
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
			case DisPackage.INVOICE_LINE_ITEM_DATA__INVOICE_LINE_NBR:
				setInvoiceLineNbr((String)newValue);
				return;
			case DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA:
				setCommodityData((CommodityData)newValue);
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
			case DisPackage.INVOICE_LINE_ITEM_DATA__INVOICE_LINE_NBR:
				setInvoiceLineNbr(INVOICE_LINE_NBR_EDEFAULT);
				return;
			case DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA:
				setCommodityData((CommodityData)null);
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
			case DisPackage.INVOICE_LINE_ITEM_DATA__INVOICE_LINE_NBR:
				return INVOICE_LINE_NBR_EDEFAULT == null ? invoiceLineNbr != null : !INVOICE_LINE_NBR_EDEFAULT.equals(invoiceLineNbr);
			case DisPackage.INVOICE_LINE_ITEM_DATA__COMMODITY_DATA:
				return commodityData != null;
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
		result.append(" (invoiceLineNbr: ");
		result.append(invoiceLineNbr);
		result.append(')');
		return result.toString();
	}

} //InvoiceLineItemDataImpl
