/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.OptionalData#getInvoiceData <em>Invoice Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.OptionalData#getBondData <em>Bond Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.OptionalData#getPackingListData <em>Packing List Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.OptionalData#getCertificateData <em>Certificate Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.OptionalData#getPermitData <em>Permit Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.OptionalData#getToxicSubstancesData <em>Toxic Substances Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.OptionalData#getCommodityList <em>Commodity List</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.OptionalData#getAdditionalData <em>Additional Data</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData()
 * @model extendedMetaData="name='OptionalData' kind='elementOnly'"
 * @generated
 */
public interface OptionalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoice Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice or Invoice Worksheet Specific Information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invoice Data</em>' containment reference.
	 * @see #setInvoiceData(InvoiceData)
	 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData_InvoiceData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InvoiceData' namespace='##targetNamespace'"
	 * @generated
	 */
	InvoiceData getInvoiceData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OptionalData#getInvoiceData <em>Invoice Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Data</em>' containment reference.
	 * @see #getInvoiceData()
	 * @generated
	 */
	void setInvoiceData(InvoiceData value);

	/**
	 * Returns the value of the '<em><b>Bond Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bond Specific Information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bond Data</em>' containment reference.
	 * @see #setBondData(BondData)
	 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData_BondData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BondData' namespace='##targetNamespace'"
	 * @generated
	 */
	BondData getBondData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OptionalData#getBondData <em>Bond Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bond Data</em>' containment reference.
	 * @see #getBondData()
	 * @generated
	 */
	void setBondData(BondData value);

	/**
	 * Returns the value of the '<em><b>Packing List Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Packing List Specific Information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packing List Data</em>' containment reference.
	 * @see #setPackingListData(PackingListData)
	 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData_PackingListData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PackingListData' namespace='##targetNamespace'"
	 * @generated
	 */
	PackingListData getPackingListData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OptionalData#getPackingListData <em>Packing List Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packing List Data</em>' containment reference.
	 * @see #getPackingListData()
	 * @generated
	 */
	void setPackingListData(PackingListData value);

	/**
	 * Returns the value of the '<em><b>Certificate Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificate Info. ex. NOAA Certifcate of Origin
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Data</em>' containment reference.
	 * @see #setCertificateData(CertificateData)
	 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData_CertificateData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CertificateData' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificateData getCertificateData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OptionalData#getCertificateData <em>Certificate Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Data</em>' containment reference.
	 * @see #getCertificateData()
	 * @generated
	 */
	void setCertificateData(CertificateData value);

	/**
	 * Returns the value of the '<em><b>Permit Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permit Info. ex.Import Permit USDA Regulations
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permit Data</em>' containment reference.
	 * @see #setPermitData(PermitData)
	 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData_PermitData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PermitData' namespace='##targetNamespace'"
	 * @generated
	 */
	PermitData getPermitData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OptionalData#getPermitData <em>Permit Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit Data</em>' containment reference.
	 * @see #getPermitData()
	 * @generated
	 */
	void setPermitData(PermitData value);

	/**
	 * Returns the value of the '<em><b>Toxic Substances Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Toxic Substance Info. Ex. EPA Data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Toxic Substances Data</em>' containment reference.
	 * @see #setToxicSubstancesData(ToxicSubstancesData)
	 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData_ToxicSubstancesData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ToxicSubstancesData' namespace='##targetNamespace'"
	 * @generated
	 */
	ToxicSubstancesData getToxicSubstancesData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OptionalData#getToxicSubstancesData <em>Toxic Substances Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toxic Substances Data</em>' containment reference.
	 * @see #getToxicSubstancesData()
	 * @generated
	 */
	void setToxicSubstancesData(ToxicSubstancesData value);

	/**
	 * Returns the value of the '<em><b>Commodity List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - Commodity Information if not specified elsewhere in submitted XML.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commodity List</em>' containment reference.
	 * @see #setCommodityList(CommodityList)
	 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData_CommodityList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommodityList' namespace='##targetNamespace'"
	 * @generated
	 */
	CommodityList getCommodityList();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OptionalData#getCommodityList <em>Commodity List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity List</em>' containment reference.
	 * @see #getCommodityList()
	 * @generated
	 */
	void setCommodityList(CommodityList value);

	/**
	 * Returns the value of the '<em><b>Additional Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - Additional data in the form of Name-Value Pairs in case sender wishes to transmit data not accomodated in this schema. ex. INVOICE_AMT = $640,000
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Data</em>' containment reference.
	 * @see #setAdditionalData(AdditionalData)
	 * @see gov.dhs.cbp.dis.DisPackage#getOptionalData_AdditionalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalData' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalData getAdditionalData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OptionalData#getAdditionalData <em>Additional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Data</em>' containment reference.
	 * @see #getAdditionalData()
	 * @generated
	 */
	void setAdditionalData(AdditionalData value);

} // OptionalData
