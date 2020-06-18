/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.PackingListData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packing List Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.PackingListDataImpl#getPackingListNbr <em>Packing List Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PackingListDataImpl#getInvoiceNumber <em>Invoice Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PackingListDataImpl#getPurchaseOrderNbr <em>Purchase Order Nbr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackingListDataImpl extends MinimalEObjectImpl.Container implements PackingListData {
	/**
	 * The default value of the '{@link #getPackingListNbr() <em>Packing List Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackingListNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKING_LIST_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackingListNbr() <em>Packing List Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackingListNbr()
	 * @generated
	 * @ordered
	 */
	protected String packingListNbr = PACKING_LIST_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceNumber() <em>Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceNumber() <em>Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNumber()
	 * @generated
	 * @ordered
	 */
	protected String invoiceNumber = INVOICE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchaseOrderNbr() <em>Purchase Order Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCHASE_ORDER_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseOrderNbr() <em>Purchase Order Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseOrderNbr()
	 * @generated
	 * @ordered
	 */
	protected String purchaseOrderNbr = PURCHASE_ORDER_NBR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackingListDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.PACKING_LIST_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackingListNbr() {
		return packingListNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackingListNbr(String newPackingListNbr) {
		String oldPackingListNbr = packingListNbr;
		packingListNbr = newPackingListNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PACKING_LIST_DATA__PACKING_LIST_NBR, oldPackingListNbr, packingListNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceNumber(String newInvoiceNumber) {
		String oldInvoiceNumber = invoiceNumber;
		invoiceNumber = newInvoiceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PACKING_LIST_DATA__INVOICE_NUMBER, oldInvoiceNumber, invoiceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurchaseOrderNbr() {
		return purchaseOrderNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchaseOrderNbr(String newPurchaseOrderNbr) {
		String oldPurchaseOrderNbr = purchaseOrderNbr;
		purchaseOrderNbr = newPurchaseOrderNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PACKING_LIST_DATA__PURCHASE_ORDER_NBR, oldPurchaseOrderNbr, purchaseOrderNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.PACKING_LIST_DATA__PACKING_LIST_NBR:
				return getPackingListNbr();
			case DisPackage.PACKING_LIST_DATA__INVOICE_NUMBER:
				return getInvoiceNumber();
			case DisPackage.PACKING_LIST_DATA__PURCHASE_ORDER_NBR:
				return getPurchaseOrderNbr();
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
			case DisPackage.PACKING_LIST_DATA__PACKING_LIST_NBR:
				setPackingListNbr((String)newValue);
				return;
			case DisPackage.PACKING_LIST_DATA__INVOICE_NUMBER:
				setInvoiceNumber((String)newValue);
				return;
			case DisPackage.PACKING_LIST_DATA__PURCHASE_ORDER_NBR:
				setPurchaseOrderNbr((String)newValue);
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
			case DisPackage.PACKING_LIST_DATA__PACKING_LIST_NBR:
				setPackingListNbr(PACKING_LIST_NBR_EDEFAULT);
				return;
			case DisPackage.PACKING_LIST_DATA__INVOICE_NUMBER:
				setInvoiceNumber(INVOICE_NUMBER_EDEFAULT);
				return;
			case DisPackage.PACKING_LIST_DATA__PURCHASE_ORDER_NBR:
				setPurchaseOrderNbr(PURCHASE_ORDER_NBR_EDEFAULT);
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
			case DisPackage.PACKING_LIST_DATA__PACKING_LIST_NBR:
				return PACKING_LIST_NBR_EDEFAULT == null ? packingListNbr != null : !PACKING_LIST_NBR_EDEFAULT.equals(packingListNbr);
			case DisPackage.PACKING_LIST_DATA__INVOICE_NUMBER:
				return INVOICE_NUMBER_EDEFAULT == null ? invoiceNumber != null : !INVOICE_NUMBER_EDEFAULT.equals(invoiceNumber);
			case DisPackage.PACKING_LIST_DATA__PURCHASE_ORDER_NBR:
				return PURCHASE_ORDER_NBR_EDEFAULT == null ? purchaseOrderNbr != null : !PURCHASE_ORDER_NBR_EDEFAULT.equals(purchaseOrderNbr);
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
		result.append(" (packingListNbr: ");
		result.append(packingListNbr);
		result.append(", invoiceNumber: ");
		result.append(invoiceNumber);
		result.append(", purchaseOrderNbr: ");
		result.append(purchaseOrderNbr);
		result.append(')');
		return result.toString();
	}

} //PackingListDataImpl
