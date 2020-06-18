/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisFactoryImpl extends EFactoryImpl implements DisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DisFactory init() {
		try {
			DisFactory theDisFactory = (DisFactory)EPackage.Registry.INSTANCE.getEFactory(DisPackage.eNS_URI);
			if (theDisFactory != null) {
				return theDisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DisPackage.ADDITIONAL_DATA: return createAdditionalData();
			case DisPackage.BILL_TYPE: return createBillType();
			case DisPackage.BOND_DATA: return createBondData();
			case DisPackage.CBP_REQUEST: return createCBPRequest();
			case DisPackage.CERTIFICATE_DATA: return createCertificateData();
			case DisPackage.COMMODITY_DATA: return createCommodityData();
			case DisPackage.COMMODITY_LIST: return createCommodityList();
			case DisPackage.CONTACT_INFO_TYPE: return createContactInfoType();
			case DisPackage.DOCUMENT_DATA: return createDocumentData();
			case DisPackage.DOCUMENT_HEADER: return createDocumentHeader();
			case DisPackage.ENTRY_SUMMARY_TYPE: return createEntrySummaryType();
			case DisPackage.ENTRY_TYPE: return createEntryType();
			case DisPackage.GOVT_AGENCY_LIST: return createGovtAgencyList();
			case DisPackage.INVOICE_DATA: return createInvoiceData();
			case DisPackage.INVOICE_LINE_ITEM_DATA: return createInvoiceLineItemData();
			case DisPackage.INVOICE_LINE_ITEM_LIST: return createInvoiceLineItemList();
			case DisPackage.ISF_NUMBER_TYPE: return createISFNumberType();
			case DisPackage.ITN_TYPE: return createITNType();
			case DisPackage.NAME_VALUE_PAIR: return createNameValuePair();
			case DisPackage.OPTIONAL_DATA: return createOptionalData();
			case DisPackage.OTHER_TRANSACTION_TYPE: return createOtherTransactionType();
			case DisPackage.PACKAGE_IDENTIFIER_TYPE: return createPackageIdentifierType();
			case DisPackage.PACKING_LIST_DATA: return createPackingListData();
			case DisPackage.PERMIT_DATA: return createPermitData();
			case DisPackage.TOXIC_SUBSTANCES_DATA: return createToxicSubstancesData();
			case DisPackage.TRADE_PARTIES: return createTradeParties();
			case DisPackage.TRADE_PARTY_INFO: return createTradePartyInfo();
			case DisPackage.TRADE_TRANSACTION: return createTradeTransaction();
			case DisPackage.VEHICLE_AND_ENGINE_DATA: return createVehicleAndEngineData();
			case DisPackage.VESSEL_DATA_TYPE: return createVesselDataType();
			case DisPackage.XTN_TYPE: return createXTNType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DisPackage.SUBMITTED_TO_PORT_CODE:
				return createSubmittedToPortCodeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DisPackage.SUBMITTED_TO_PORT_CODE:
				return convertSubmittedToPortCodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalData createAdditionalData() {
		AdditionalDataImpl additionalData = new AdditionalDataImpl();
		return additionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillType createBillType() {
		BillTypeImpl billType = new BillTypeImpl();
		return billType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BondData createBondData() {
		BondDataImpl bondData = new BondDataImpl();
		return bondData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CBPRequest createCBPRequest() {
		CBPRequestImpl cbpRequest = new CBPRequestImpl();
		return cbpRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificateData createCertificateData() {
		CertificateDataImpl certificateData = new CertificateDataImpl();
		return certificateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommodityData createCommodityData() {
		CommodityDataImpl commodityData = new CommodityDataImpl();
		return commodityData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommodityList createCommodityList() {
		CommodityListImpl commodityList = new CommodityListImpl();
		return commodityList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInfoType createContactInfoType() {
		ContactInfoTypeImpl contactInfoType = new ContactInfoTypeImpl();
		return contactInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentData createDocumentData() {
		DocumentDataImpl documentData = new DocumentDataImpl();
		return documentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentHeader createDocumentHeader() {
		DocumentHeaderImpl documentHeader = new DocumentHeaderImpl();
		return documentHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntrySummaryType createEntrySummaryType() {
		EntrySummaryTypeImpl entrySummaryType = new EntrySummaryTypeImpl();
		return entrySummaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GovtAgencyList createGovtAgencyList() {
		GovtAgencyListImpl govtAgencyList = new GovtAgencyListImpl();
		return govtAgencyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceData createInvoiceData() {
		InvoiceDataImpl invoiceData = new InvoiceDataImpl();
		return invoiceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceLineItemData createInvoiceLineItemData() {
		InvoiceLineItemDataImpl invoiceLineItemData = new InvoiceLineItemDataImpl();
		return invoiceLineItemData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceLineItemList createInvoiceLineItemList() {
		InvoiceLineItemListImpl invoiceLineItemList = new InvoiceLineItemListImpl();
		return invoiceLineItemList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISFNumberType createISFNumberType() {
		ISFNumberTypeImpl isfNumberType = new ISFNumberTypeImpl();
		return isfNumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITNType createITNType() {
		ITNTypeImpl itnType = new ITNTypeImpl();
		return itnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameValuePair createNameValuePair() {
		NameValuePairImpl nameValuePair = new NameValuePairImpl();
		return nameValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalData createOptionalData() {
		OptionalDataImpl optionalData = new OptionalDataImpl();
		return optionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherTransactionType createOtherTransactionType() {
		OtherTransactionTypeImpl otherTransactionType = new OtherTransactionTypeImpl();
		return otherTransactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageIdentifierType createPackageIdentifierType() {
		PackageIdentifierTypeImpl packageIdentifierType = new PackageIdentifierTypeImpl();
		return packageIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackingListData createPackingListData() {
		PackingListDataImpl packingListData = new PackingListDataImpl();
		return packingListData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermitData createPermitData() {
		PermitDataImpl permitData = new PermitDataImpl();
		return permitData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToxicSubstancesData createToxicSubstancesData() {
		ToxicSubstancesDataImpl toxicSubstancesData = new ToxicSubstancesDataImpl();
		return toxicSubstancesData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradeParties createTradeParties() {
		TradePartiesImpl tradeParties = new TradePartiesImpl();
		return tradeParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradePartyInfo createTradePartyInfo() {
		TradePartyInfoImpl tradePartyInfo = new TradePartyInfoImpl();
		return tradePartyInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradeTransaction createTradeTransaction() {
		TradeTransactionImpl tradeTransaction = new TradeTransactionImpl();
		return tradeTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleAndEngineData createVehicleAndEngineData() {
		VehicleAndEngineDataImpl vehicleAndEngineData = new VehicleAndEngineDataImpl();
		return vehicleAndEngineData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VesselDataType createVesselDataType() {
		VesselDataTypeImpl vesselDataType = new VesselDataTypeImpl();
		return vesselDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTNType createXTNType() {
		XTNTypeImpl xtnType = new XTNTypeImpl();
		return xtnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSubmittedToPortCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubmittedToPortCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisPackage getDisPackage() {
		return (DisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DisPackage getPackage() {
		return DisPackage.eINSTANCE;
	}

} //DisFactoryImpl
