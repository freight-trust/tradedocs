/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Line Item Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Invoice Line Item Level Information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.InvoiceLineItemData#getInvoiceLineNbr <em>Invoice Line Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.InvoiceLineItemData#getCommodityData <em>Commodity Data</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceLineItemData()
 * @model extendedMetaData="name='InvoiceLineItemData' kind='elementOnly'"
 * @generated
 */
public interface InvoiceLineItemData extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoice Line Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * name-value pairs of information to accomodate additional information for flexibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Line Nbr</em>' attribute.
	 * @see #setInvoiceLineNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceLineItemData_InvoiceLineNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='InvoiceLineNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvoiceLineNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.InvoiceLineItemData#getInvoiceLineNbr <em>Invoice Line Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Line Nbr</em>' attribute.
	 * @see #getInvoiceLineNbr()
	 * @generated
	 */
	void setInvoiceLineNbr(String value);

	/**
	 * Returns the value of the '<em><b>Commodity Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commodity Information at each line item level 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commodity Data</em>' containment reference.
	 * @see #setCommodityData(CommodityData)
	 * @see gov.dhs.cbp.dis.DisPackage#getInvoiceLineItemData_CommodityData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CommodityData' namespace='##targetNamespace'"
	 * @generated
	 */
	CommodityData getCommodityData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.InvoiceLineItemData#getCommodityData <em>Commodity Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity Data</em>' containment reference.
	 * @see #getCommodityData()
	 * @generated
	 */
	void setCommodityData(CommodityData value);

} // InvoiceLineItemData
