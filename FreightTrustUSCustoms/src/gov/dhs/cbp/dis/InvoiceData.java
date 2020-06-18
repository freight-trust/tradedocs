/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Invoice Specific Information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.InvoiceData#getInvoiceNbr <em>Invoice Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.InvoiceData#getInvoiceType <em>Invoice Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.InvoiceData#getInvoiceLineItemData <em>Invoice Line Item Data</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceData()
 * @model extendedMetaData="name='InvoiceData' kind='elementOnly'"
 * @generated
 */
public interface InvoiceData extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoice Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice Nbr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Nbr</em>' attribute.
	 * @see #setInvoiceNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceData_InvoiceNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.InvoiceData#getInvoiceNbr <em>Invoice Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Nbr</em>' attribute.
	 * @see #getInvoiceNbr()
	 * @generated
	 */
	void setInvoiceNbr(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice Type. Ex. Commercial Invoice etc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Type</em>' attribute.
	 * @see #setInvoiceType(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceData_InvoiceType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceType();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.InvoiceData#getInvoiceType <em>Invoice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Type</em>' attribute.
	 * @see #getInvoiceType()
	 * @generated
	 */
	void setInvoiceType(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Line Item Data</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.InvoiceLineItemData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice Line Nbr level information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Line Item Data</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceData_InvoiceLineItemData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InvoiceLineItemData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InvoiceLineItemData> getInvoiceLineItemData();

} // InvoiceData
