/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.InvoiceData;
import gov.dhs.cbp.dis.InvoiceLineItemData;

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
 * An implementation of the model object '<em><b>Invoice Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.InvoiceDataImpl#getInvoiceNbr <em>Invoice Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.InvoiceDataImpl#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.InvoiceDataImpl#getInvoiceLineItemData <em>Invoice Line Item Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceDataImpl extends MinimalEObjectImpl.Container implements InvoiceData {
	/**
	 * The default value of the '{@link #getInvoiceNbr() <em>Invoice Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceNbr() <em>Invoice Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceNbr()
	 * @generated
	 * @ordered
	 */
	protected String invoiceNbr = INVOICE_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceType() <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceType() <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceType()
	 * @generated
	 * @ordered
	 */
	protected String invoiceType = INVOICE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvoiceLineItemData() <em>Invoice Line Item Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceLineItemData()
	 * @generated
	 * @ordered
	 */
	protected EList<InvoiceLineItemData> invoiceLineItemData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.INVOICE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvoiceNbr() {
		return invoiceNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceNbr(String newInvoiceNbr) {
		String oldInvoiceNbr = invoiceNbr;
		invoiceNbr = newInvoiceNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.INVOICE_DATA__INVOICE_NBR, oldInvoiceNbr, invoiceNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvoiceType() {
		return invoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceType(String newInvoiceType) {
		String oldInvoiceType = invoiceType;
		invoiceType = newInvoiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.INVOICE_DATA__INVOICE_TYPE, oldInvoiceType, invoiceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvoiceLineItemData> getInvoiceLineItemData() {
		if (invoiceLineItemData == null) {
			invoiceLineItemData = new EObjectContainmentEList<InvoiceLineItemData>(InvoiceLineItemData.class, this, DisPackage.INVOICE_DATA__INVOICE_LINE_ITEM_DATA);
		}
		return invoiceLineItemData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.INVOICE_DATA__INVOICE_LINE_ITEM_DATA:
				return ((InternalEList<?>)getInvoiceLineItemData()).basicRemove(otherEnd, msgs);
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
			case DisPackage.INVOICE_DATA__INVOICE_NBR:
				return getInvoiceNbr();
			case DisPackage.INVOICE_DATA__INVOICE_TYPE:
				return getInvoiceType();
			case DisPackage.INVOICE_DATA__INVOICE_LINE_ITEM_DATA:
				return getInvoiceLineItemData();
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
			case DisPackage.INVOICE_DATA__INVOICE_NBR:
				setInvoiceNbr((String)newValue);
				return;
			case DisPackage.INVOICE_DATA__INVOICE_TYPE:
				setInvoiceType((String)newValue);
				return;
			case DisPackage.INVOICE_DATA__INVOICE_LINE_ITEM_DATA:
				getInvoiceLineItemData().clear();
				getInvoiceLineItemData().addAll((Collection<? extends InvoiceLineItemData>)newValue);
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
			case DisPackage.INVOICE_DATA__INVOICE_NBR:
				setInvoiceNbr(INVOICE_NBR_EDEFAULT);
				return;
			case DisPackage.INVOICE_DATA__INVOICE_TYPE:
				setInvoiceType(INVOICE_TYPE_EDEFAULT);
				return;
			case DisPackage.INVOICE_DATA__INVOICE_LINE_ITEM_DATA:
				getInvoiceLineItemData().clear();
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
			case DisPackage.INVOICE_DATA__INVOICE_NBR:
				return INVOICE_NBR_EDEFAULT == null ? invoiceNbr != null : !INVOICE_NBR_EDEFAULT.equals(invoiceNbr);
			case DisPackage.INVOICE_DATA__INVOICE_TYPE:
				return INVOICE_TYPE_EDEFAULT == null ? invoiceType != null : !INVOICE_TYPE_EDEFAULT.equals(invoiceType);
			case DisPackage.INVOICE_DATA__INVOICE_LINE_ITEM_DATA:
				return invoiceLineItemData != null && !invoiceLineItemData.isEmpty();
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
		result.append(" (invoiceNbr: ");
		result.append(invoiceNbr);
		result.append(", invoiceType: ");
		result.append(invoiceType);
		result.append(')');
		return result.toString();
	}

} //InvoiceDataImpl
