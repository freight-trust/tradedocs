/**
 */
package gov.dhs.cbp.dis.util;

import gov.dhs.cbp.dis.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gov.dhs.cbp.dis.DisPackage
 * @generated
 */
public class DisAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DisPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DisPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisSwitch<Adapter> modelSwitch =
		new DisSwitch<Adapter>() {
			@Override
			public Adapter caseAdditionalData(AdditionalData object) {
				return createAdditionalDataAdapter();
			}
			@Override
			public Adapter caseBillType(BillType object) {
				return createBillTypeAdapter();
			}
			@Override
			public Adapter caseBondData(BondData object) {
				return createBondDataAdapter();
			}
			@Override
			public Adapter caseCBPRequest(CBPRequest object) {
				return createCBPRequestAdapter();
			}
			@Override
			public Adapter caseCertificateData(CertificateData object) {
				return createCertificateDataAdapter();
			}
			@Override
			public Adapter caseCommodityData(CommodityData object) {
				return createCommodityDataAdapter();
			}
			@Override
			public Adapter caseCommodityList(CommodityList object) {
				return createCommodityListAdapter();
			}
			@Override
			public Adapter caseContactInfoType(ContactInfoType object) {
				return createContactInfoTypeAdapter();
			}
			@Override
			public Adapter caseDocumentData(DocumentData object) {
				return createDocumentDataAdapter();
			}
			@Override
			public Adapter caseDocumentHeader(DocumentHeader object) {
				return createDocumentHeaderAdapter();
			}
			@Override
			public Adapter caseEntrySummaryType(EntrySummaryType object) {
				return createEntrySummaryTypeAdapter();
			}
			@Override
			public Adapter caseEntryType(EntryType object) {
				return createEntryTypeAdapter();
			}
			@Override
			public Adapter caseGovtAgencyList(GovtAgencyList object) {
				return createGovtAgencyListAdapter();
			}
			@Override
			public Adapter caseInvoiceData(InvoiceData object) {
				return createInvoiceDataAdapter();
			}
			@Override
			public Adapter caseInvoiceLineItemData(InvoiceLineItemData object) {
				return createInvoiceLineItemDataAdapter();
			}
			@Override
			public Adapter caseInvoiceLineItemList(InvoiceLineItemList object) {
				return createInvoiceLineItemListAdapter();
			}
			@Override
			public Adapter caseISFNumberType(ISFNumberType object) {
				return createISFNumberTypeAdapter();
			}
			@Override
			public Adapter caseITNType(ITNType object) {
				return createITNTypeAdapter();
			}
			@Override
			public Adapter caseNameValuePair(NameValuePair object) {
				return createNameValuePairAdapter();
			}
			@Override
			public Adapter caseOptionalData(OptionalData object) {
				return createOptionalDataAdapter();
			}
			@Override
			public Adapter caseOtherTransactionType(OtherTransactionType object) {
				return createOtherTransactionTypeAdapter();
			}
			@Override
			public Adapter casePackageIdentifierType(PackageIdentifierType object) {
				return createPackageIdentifierTypeAdapter();
			}
			@Override
			public Adapter casePackingListData(PackingListData object) {
				return createPackingListDataAdapter();
			}
			@Override
			public Adapter casePermitData(PermitData object) {
				return createPermitDataAdapter();
			}
			@Override
			public Adapter caseToxicSubstancesData(ToxicSubstancesData object) {
				return createToxicSubstancesDataAdapter();
			}
			@Override
			public Adapter caseTradeParties(TradeParties object) {
				return createTradePartiesAdapter();
			}
			@Override
			public Adapter caseTradePartyInfo(TradePartyInfo object) {
				return createTradePartyInfoAdapter();
			}
			@Override
			public Adapter caseTradeTransaction(TradeTransaction object) {
				return createTradeTransactionAdapter();
			}
			@Override
			public Adapter caseVehicleAndEngineData(VehicleAndEngineData object) {
				return createVehicleAndEngineDataAdapter();
			}
			@Override
			public Adapter caseVesselDataType(VesselDataType object) {
				return createVesselDataTypeAdapter();
			}
			@Override
			public Adapter caseXTNType(XTNType object) {
				return createXTNTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.AdditionalData <em>Additional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.AdditionalData
	 * @generated
	 */
	public Adapter createAdditionalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.BillType <em>Bill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.BillType
	 * @generated
	 */
	public Adapter createBillTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.BondData <em>Bond Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.BondData
	 * @generated
	 */
	public Adapter createBondDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.CBPRequest <em>CBP Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.CBPRequest
	 * @generated
	 */
	public Adapter createCBPRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.CertificateData <em>Certificate Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.CertificateData
	 * @generated
	 */
	public Adapter createCertificateDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.CommodityData <em>Commodity Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.CommodityData
	 * @generated
	 */
	public Adapter createCommodityDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.CommodityList <em>Commodity List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.CommodityList
	 * @generated
	 */
	public Adapter createCommodityListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.ContactInfoType <em>Contact Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.ContactInfoType
	 * @generated
	 */
	public Adapter createContactInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.DocumentData <em>Document Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.DocumentData
	 * @generated
	 */
	public Adapter createDocumentDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.DocumentHeader <em>Document Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.DocumentHeader
	 * @generated
	 */
	public Adapter createDocumentHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.EntrySummaryType <em>Entry Summary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.EntrySummaryType
	 * @generated
	 */
	public Adapter createEntrySummaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.EntryType
	 * @generated
	 */
	public Adapter createEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.GovtAgencyList <em>Govt Agency List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.GovtAgencyList
	 * @generated
	 */
	public Adapter createGovtAgencyListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.InvoiceData <em>Invoice Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.InvoiceData
	 * @generated
	 */
	public Adapter createInvoiceDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.InvoiceLineItemData <em>Invoice Line Item Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.InvoiceLineItemData
	 * @generated
	 */
	public Adapter createInvoiceLineItemDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.InvoiceLineItemList <em>Invoice Line Item List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.InvoiceLineItemList
	 * @generated
	 */
	public Adapter createInvoiceLineItemListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.ISFNumberType <em>ISF Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.ISFNumberType
	 * @generated
	 */
	public Adapter createISFNumberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.ITNType <em>ITN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.ITNType
	 * @generated
	 */
	public Adapter createITNTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.NameValuePair <em>Name Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.NameValuePair
	 * @generated
	 */
	public Adapter createNameValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.OptionalData <em>Optional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.OptionalData
	 * @generated
	 */
	public Adapter createOptionalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.OtherTransactionType <em>Other Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.OtherTransactionType
	 * @generated
	 */
	public Adapter createOtherTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.PackageIdentifierType <em>Package Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.PackageIdentifierType
	 * @generated
	 */
	public Adapter createPackageIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.PackingListData <em>Packing List Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.PackingListData
	 * @generated
	 */
	public Adapter createPackingListDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.PermitData <em>Permit Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.PermitData
	 * @generated
	 */
	public Adapter createPermitDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.ToxicSubstancesData <em>Toxic Substances Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.ToxicSubstancesData
	 * @generated
	 */
	public Adapter createToxicSubstancesDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.TradeParties <em>Trade Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.TradeParties
	 * @generated
	 */
	public Adapter createTradePartiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.TradePartyInfo <em>Trade Party Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.TradePartyInfo
	 * @generated
	 */
	public Adapter createTradePartyInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.TradeTransaction <em>Trade Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.TradeTransaction
	 * @generated
	 */
	public Adapter createTradeTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.VehicleAndEngineData <em>Vehicle And Engine Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData
	 * @generated
	 */
	public Adapter createVehicleAndEngineDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.VesselDataType <em>Vessel Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.VesselDataType
	 * @generated
	 */
	public Adapter createVesselDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gov.dhs.cbp.dis.XTNType <em>XTN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gov.dhs.cbp.dis.XTNType
	 * @generated
	 */
	public Adapter createXTNTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DisAdapterFactory
