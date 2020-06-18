/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Line Item List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.InvoiceLineItemList#getInvoiceLineItemData <em>Invoice Line Item Data</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceLineItemList()
 * @model extendedMetaData="name='InvoiceLineItemList' kind='elementOnly'"
 * @generated
 */
public interface InvoiceLineItemList extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoice Line Item Data</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.InvoiceLineItemData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Line Item Data</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceLineItemList_InvoiceLineItemData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceLineItemData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InvoiceLineItemData> getInvoiceLineItemData();

} // InvoiceLineItemList
