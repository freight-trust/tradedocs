/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gov.dhs.cbp.dis.DisPackage
 * @generated
 */
public interface DisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DisFactory eINSTANCE = gov.dhs.cbp.dis.impl.DisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Additional Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Data</em>'.
	 * @generated
	 */
	AdditionalData createAdditionalData();

	/**
	 * Returns a new object of class '<em>Bill Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill Type</em>'.
	 * @generated
	 */
	BillType createBillType();

	/**
	 * Returns a new object of class '<em>Bond Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bond Data</em>'.
	 * @generated
	 */
	BondData createBondData();

	/**
	 * Returns a new object of class '<em>CBP Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CBP Request</em>'.
	 * @generated
	 */
	CBPRequest createCBPRequest();

	/**
	 * Returns a new object of class '<em>Certificate Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificate Data</em>'.
	 * @generated
	 */
	CertificateData createCertificateData();

	/**
	 * Returns a new object of class '<em>Commodity Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commodity Data</em>'.
	 * @generated
	 */
	CommodityData createCommodityData();

	/**
	 * Returns a new object of class '<em>Commodity List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commodity List</em>'.
	 * @generated
	 */
	CommodityList createCommodityList();

	/**
	 * Returns a new object of class '<em>Contact Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Info Type</em>'.
	 * @generated
	 */
	ContactInfoType createContactInfoType();

	/**
	 * Returns a new object of class '<em>Document Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Data</em>'.
	 * @generated
	 */
	DocumentData createDocumentData();

	/**
	 * Returns a new object of class '<em>Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Header</em>'.
	 * @generated
	 */
	DocumentHeader createDocumentHeader();

	/**
	 * Returns a new object of class '<em>Entry Summary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Summary Type</em>'.
	 * @generated
	 */
	EntrySummaryType createEntrySummaryType();

	/**
	 * Returns a new object of class '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Type</em>'.
	 * @generated
	 */
	EntryType createEntryType();

	/**
	 * Returns a new object of class '<em>Govt Agency List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Govt Agency List</em>'.
	 * @generated
	 */
	GovtAgencyList createGovtAgencyList();

	/**
	 * Returns a new object of class '<em>Invoice Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice Data</em>'.
	 * @generated
	 */
	InvoiceData createInvoiceData();

	/**
	 * Returns a new object of class '<em>Invoice Line Item Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice Line Item Data</em>'.
	 * @generated
	 */
	InvoiceLineItemData createInvoiceLineItemData();

	/**
	 * Returns a new object of class '<em>Invoice Line Item List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invoice Line Item List</em>'.
	 * @generated
	 */
	InvoiceLineItemList createInvoiceLineItemList();

	/**
	 * Returns a new object of class '<em>ISF Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISF Number Type</em>'.
	 * @generated
	 */
	ISFNumberType createISFNumberType();

	/**
	 * Returns a new object of class '<em>ITN Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ITN Type</em>'.
	 * @generated
	 */
	ITNType createITNType();

	/**
	 * Returns a new object of class '<em>Name Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Value Pair</em>'.
	 * @generated
	 */
	NameValuePair createNameValuePair();

	/**
	 * Returns a new object of class '<em>Optional Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Data</em>'.
	 * @generated
	 */
	OptionalData createOptionalData();

	/**
	 * Returns a new object of class '<em>Other Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Transaction Type</em>'.
	 * @generated
	 */
	OtherTransactionType createOtherTransactionType();

	/**
	 * Returns a new object of class '<em>Package Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Identifier Type</em>'.
	 * @generated
	 */
	PackageIdentifierType createPackageIdentifierType();

	/**
	 * Returns a new object of class '<em>Packing List Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packing List Data</em>'.
	 * @generated
	 */
	PackingListData createPackingListData();

	/**
	 * Returns a new object of class '<em>Permit Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permit Data</em>'.
	 * @generated
	 */
	PermitData createPermitData();

	/**
	 * Returns a new object of class '<em>Toxic Substances Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toxic Substances Data</em>'.
	 * @generated
	 */
	ToxicSubstancesData createToxicSubstancesData();

	/**
	 * Returns a new object of class '<em>Trade Parties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trade Parties</em>'.
	 * @generated
	 */
	TradeParties createTradeParties();

	/**
	 * Returns a new object of class '<em>Trade Party Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trade Party Info</em>'.
	 * @generated
	 */
	TradePartyInfo createTradePartyInfo();

	/**
	 * Returns a new object of class '<em>Trade Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trade Transaction</em>'.
	 * @generated
	 */
	TradeTransaction createTradeTransaction();

	/**
	 * Returns a new object of class '<em>Vehicle And Engine Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle And Engine Data</em>'.
	 * @generated
	 */
	VehicleAndEngineData createVehicleAndEngineData();

	/**
	 * Returns a new object of class '<em>Vessel Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vessel Data Type</em>'.
	 * @generated
	 */
	VesselDataType createVesselDataType();

	/**
	 * Returns a new object of class '<em>XTN Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XTN Type</em>'.
	 * @generated
	 */
	XTNType createXTNType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DisPackage getDisPackage();

} //DisFactory
