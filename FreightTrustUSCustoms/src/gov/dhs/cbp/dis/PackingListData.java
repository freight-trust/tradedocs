/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packing List Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Packing List Specific Information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.PackingListData#getPackingListNbr <em>Packing List Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PackingListData#getInvoiceNumber <em>Invoice Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PackingListData#getPurchaseOrderNbr <em>Purchase Order Nbr</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getPackingListData()
 * @model extendedMetaData="name='PackingListData' kind='elementOnly'"
 * @generated
 */
public interface PackingListData extends EObject {
	/**
	 * Returns the value of the '<em><b>Packing List Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice Nbr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packing List Nbr</em>' attribute.
	 * @see #setPackingListNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPackingListData_PackingListNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PackingListNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPackingListNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PackingListData#getPackingListNbr <em>Packing List Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packing List Nbr</em>' attribute.
	 * @see #getPackingListNbr()
	 * @generated
	 */
	void setPackingListNbr(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice Number. Add any details in InvoiceData Element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Number</em>' attribute.
	 * @see #setInvoiceNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPackingListData_InvoiceNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='InvoiceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PackingListData#getInvoiceNumber <em>Invoice Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Number</em>' attribute.
	 * @see #getInvoiceNumber()
	 * @generated
	 */
	void setInvoiceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Purchase Order Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Purchase Order Nbr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purchase Order Nbr</em>' attribute.
	 * @see #setPurchaseOrderNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPackingListData_PurchaseOrderNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PurchaseOrderNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPurchaseOrderNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PackingListData#getPurchaseOrderNbr <em>Purchase Order Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purchase Order Nbr</em>' attribute.
	 * @see #getPurchaseOrderNbr()
	 * @generated
	 */
	void setPurchaseOrderNbr(String value);

} // PackingListData
