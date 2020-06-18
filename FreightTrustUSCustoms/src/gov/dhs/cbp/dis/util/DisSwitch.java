/**
 */
package gov.dhs.cbp.dis.util;

import gov.dhs.cbp.dis.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gov.dhs.cbp.dis.DisPackage
 * @generated
 */
public class DisSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DisPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisSwitch() {
		if (modelPackage == null) {
			modelPackage = DisPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DisPackage.ADDITIONAL_DATA: {
				AdditionalData additionalData = (AdditionalData)theEObject;
				T result = caseAdditionalData(additionalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.BILL_TYPE: {
				BillType billType = (BillType)theEObject;
				T result = caseBillType(billType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.BOND_DATA: {
				BondData bondData = (BondData)theEObject;
				T result = caseBondData(bondData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.CBP_REQUEST: {
				CBPRequest cbpRequest = (CBPRequest)theEObject;
				T result = caseCBPRequest(cbpRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.CERTIFICATE_DATA: {
				CertificateData certificateData = (CertificateData)theEObject;
				T result = caseCertificateData(certificateData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.COMMODITY_DATA: {
				CommodityData commodityData = (CommodityData)theEObject;
				T result = caseCommodityData(commodityData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.COMMODITY_LIST: {
				CommodityList commodityList = (CommodityList)theEObject;
				T result = caseCommodityList(commodityList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.CONTACT_INFO_TYPE: {
				ContactInfoType contactInfoType = (ContactInfoType)theEObject;
				T result = caseContactInfoType(contactInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.DOCUMENT_DATA: {
				DocumentData documentData = (DocumentData)theEObject;
				T result = caseDocumentData(documentData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.DOCUMENT_HEADER: {
				DocumentHeader documentHeader = (DocumentHeader)theEObject;
				T result = caseDocumentHeader(documentHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.ENTRY_SUMMARY_TYPE: {
				EntrySummaryType entrySummaryType = (EntrySummaryType)theEObject;
				T result = caseEntrySummaryType(entrySummaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.ENTRY_TYPE: {
				EntryType entryType = (EntryType)theEObject;
				T result = caseEntryType(entryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.GOVT_AGENCY_LIST: {
				GovtAgencyList govtAgencyList = (GovtAgencyList)theEObject;
				T result = caseGovtAgencyList(govtAgencyList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.INVOICE_DATA: {
				InvoiceData invoiceData = (InvoiceData)theEObject;
				T result = caseInvoiceData(invoiceData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.INVOICE_LINE_ITEM_DATA: {
				InvoiceLineItemData invoiceLineItemData = (InvoiceLineItemData)theEObject;
				T result = caseInvoiceLineItemData(invoiceLineItemData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.INVOICE_LINE_ITEM_LIST: {
				InvoiceLineItemList invoiceLineItemList = (InvoiceLineItemList)theEObject;
				T result = caseInvoiceLineItemList(invoiceLineItemList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.ISF_NUMBER_TYPE: {
				ISFNumberType isfNumberType = (ISFNumberType)theEObject;
				T result = caseISFNumberType(isfNumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.ITN_TYPE: {
				ITNType itnType = (ITNType)theEObject;
				T result = caseITNType(itnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.NAME_VALUE_PAIR: {
				NameValuePair nameValuePair = (NameValuePair)theEObject;
				T result = caseNameValuePair(nameValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.OPTIONAL_DATA: {
				OptionalData optionalData = (OptionalData)theEObject;
				T result = caseOptionalData(optionalData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.OTHER_TRANSACTION_TYPE: {
				OtherTransactionType otherTransactionType = (OtherTransactionType)theEObject;
				T result = caseOtherTransactionType(otherTransactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.PACKAGE_IDENTIFIER_TYPE: {
				PackageIdentifierType packageIdentifierType = (PackageIdentifierType)theEObject;
				T result = casePackageIdentifierType(packageIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.PACKING_LIST_DATA: {
				PackingListData packingListData = (PackingListData)theEObject;
				T result = casePackingListData(packingListData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.PERMIT_DATA: {
				PermitData permitData = (PermitData)theEObject;
				T result = casePermitData(permitData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.TOXIC_SUBSTANCES_DATA: {
				ToxicSubstancesData toxicSubstancesData = (ToxicSubstancesData)theEObject;
				T result = caseToxicSubstancesData(toxicSubstancesData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.TRADE_PARTIES: {
				TradeParties tradeParties = (TradeParties)theEObject;
				T result = caseTradeParties(tradeParties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.TRADE_PARTY_INFO: {
				TradePartyInfo tradePartyInfo = (TradePartyInfo)theEObject;
				T result = caseTradePartyInfo(tradePartyInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.TRADE_TRANSACTION: {
				TradeTransaction tradeTransaction = (TradeTransaction)theEObject;
				T result = caseTradeTransaction(tradeTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.VEHICLE_AND_ENGINE_DATA: {
				VehicleAndEngineData vehicleAndEngineData = (VehicleAndEngineData)theEObject;
				T result = caseVehicleAndEngineData(vehicleAndEngineData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.VESSEL_DATA_TYPE: {
				VesselDataType vesselDataType = (VesselDataType)theEObject;
				T result = caseVesselDataType(vesselDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DisPackage.XTN_TYPE: {
				XTNType xtnType = (XTNType)theEObject;
				T result = caseXTNType(xtnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalData(AdditionalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillType(BillType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bond Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bond Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBondData(BondData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CBP Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CBP Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCBPRequest(CBPRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificateData(CertificateData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commodity Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commodity Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommodityData(CommodityData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commodity List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commodity List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommodityList(CommodityList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactInfoType(ContactInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentData(DocumentData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentHeader(DocumentHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Summary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Summary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntrySummaryType(EntrySummaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType(EntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Govt Agency List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Govt Agency List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGovtAgencyList(GovtAgencyList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceData(InvoiceData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Line Item Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Line Item Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceLineItemData(InvoiceLineItemData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoice Line Item List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoice Line Item List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoiceLineItemList(InvoiceLineItemList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISF Number Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISF Number Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISFNumberType(ISFNumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ITN Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ITN Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseITNType(ITNType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameValuePair(NameValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalData(OptionalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherTransactionType(OtherTransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageIdentifierType(PackageIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packing List Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packing List Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackingListData(PackingListData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permit Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permit Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermitData(PermitData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toxic Substances Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toxic Substances Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToxicSubstancesData(ToxicSubstancesData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trade Parties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trade Parties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTradeParties(TradeParties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trade Party Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trade Party Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTradePartyInfo(TradePartyInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trade Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trade Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTradeTransaction(TradeTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle And Engine Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle And Engine Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleAndEngineData(VehicleAndEngineData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vessel Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vessel Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVesselDataType(VesselDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTN Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTN Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTNType(XTNType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DisSwitch
