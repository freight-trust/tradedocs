/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.InvoiceLineItemData;
import gov.dhs.cbp.dis.InvoiceLineItemList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice Line Item List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.InvoiceLineItemListImpl#getInvoiceLineItemData <em>Invoice Line Item Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceLineItemListImpl extends MinimalEObjectImpl.Container implements InvoiceLineItemList {
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
	protected InvoiceLineItemListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.INVOICE_LINE_ITEM_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvoiceLineItemData> getInvoiceLineItemData() {
		if (invoiceLineItemData == null) {
			invoiceLineItemData = new EObjectContainmentEList<InvoiceLineItemData>(InvoiceLineItemData.class, this, DisPackage.INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA);
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
			case DisPackage.INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA:
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
			case DisPackage.INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA:
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
			case DisPackage.INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA:
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
			case DisPackage.INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA:
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
			case DisPackage.INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA:
				return invoiceLineItemData != null && !invoiceLineItemData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvoiceLineItemListImpl
