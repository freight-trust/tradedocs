/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.AdditionalData;
import gov.dhs.cbp.dis.BillType;
import gov.dhs.cbp.dis.BondData;
import gov.dhs.cbp.dis.CBPRequest;
import gov.dhs.cbp.dis.CertificateData;
import gov.dhs.cbp.dis.CommodityData;
import gov.dhs.cbp.dis.CommodityList;
import gov.dhs.cbp.dis.ContactInfoType;
import gov.dhs.cbp.dis.DisFactory;
import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.DocumentData;
import gov.dhs.cbp.dis.DocumentHeader;
import gov.dhs.cbp.dis.EntrySummaryType;
import gov.dhs.cbp.dis.EntryType;
import gov.dhs.cbp.dis.GovtAgencyList;
import gov.dhs.cbp.dis.ISFNumberType;
import gov.dhs.cbp.dis.ITNType;
import gov.dhs.cbp.dis.InvoiceData;
import gov.dhs.cbp.dis.InvoiceLineItemData;
import gov.dhs.cbp.dis.InvoiceLineItemList;
import gov.dhs.cbp.dis.NameValuePair;
import gov.dhs.cbp.dis.OptionalData;
import gov.dhs.cbp.dis.OtherTransactionType;
import gov.dhs.cbp.dis.PackageIdentifierType;
import gov.dhs.cbp.dis.PackingListData;
import gov.dhs.cbp.dis.PermitData;
import gov.dhs.cbp.dis.ToxicSubstancesData;
import gov.dhs.cbp.dis.TradeParties;
import gov.dhs.cbp.dis.TradePartyInfo;
import gov.dhs.cbp.dis.TradeTransaction;
import gov.dhs.cbp.dis.VehicleAndEngineData;
import gov.dhs.cbp.dis.VesselDataType;
import gov.dhs.cbp.dis.XTNType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisPackageImpl extends EPackageImpl implements DisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bondDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cbpRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificateDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commodityDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commodityListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactInfoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entrySummaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass govtAgencyListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceLineItemDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceLineItemListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isfNumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameValuePairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherTransactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packingListDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permitDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toxicSubstancesDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradePartiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradePartyInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradeTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleAndEngineDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vesselDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType submittedToPortCodeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gov.dhs.cbp.dis.DisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DisPackageImpl() {
		super(eNS_URI, DisFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DisPackage init() {
		if (isInited) return (DisPackage)EPackage.Registry.INSTANCE.getEPackage(DisPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDisPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DisPackageImpl theDisPackage = registeredDisPackage instanceof DisPackageImpl ? (DisPackageImpl)registeredDisPackage : new DisPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDisPackage.createPackageContents();

		// Initialize created meta-data
		theDisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DisPackage.eNS_URI, theDisPackage);
		return theDisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalData() {
		return additionalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalData_NameValuePair() {
		return (EReference)additionalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillType() {
		return billTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillType_SCAC() {
		return (EAttribute)billTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillType_BillNumber() {
		return (EAttribute)billTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillType_HouseBillNumber() {
		return (EAttribute)billTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillType_ReferenceNumber() {
		return (EAttribute)billTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBondData() {
		return bondDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBondData_BondName() {
		return (EAttribute)bondDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBondData_BondNumber() {
		return (EAttribute)bondDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBondData_BondType() {
		return (EAttribute)bondDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBondData_SuretyCode() {
		return (EAttribute)bondDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBondData_AgentIDNbr() {
		return (EAttribute)bondDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBondData_Filer() {
		return (EAttribute)bondDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBondData_BondAmount() {
		return (EAttribute)bondDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCBPRequest() {
		return cbpRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCBPRequest_CBPRequestID() {
		return (EAttribute)cbpRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCBPRequest_CBPRequestType() {
		return (EAttribute)cbpRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCBPRequest_CBPRequestDate() {
		return (EAttribute)cbpRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificateData() {
		return certificateDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateData_CertificateNumber() {
		return (EAttribute)certificateDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateData_CertificateType() {
		return (EAttribute)certificateDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateData_Statement() {
		return (EAttribute)certificateDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateData_ExpirationDate() {
		return (EAttribute)certificateDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateData_ImporterOfRecord() {
		return (EAttribute)certificateDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificateData_InspectionLocation() {
		return (EAttribute)certificateDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommodityData() {
		return commodityDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_EntryLineNumber() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_HTSNumber() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_CommodityDescription() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_CountryOfOrigin() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_ContainerNbr() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_ArrivalDate() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_PortOfLading() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_PortOfUnlading() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_PortOfEntry() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_PPQSignature() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_SealNumbers() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommodityData_TradeParties() {
		return (EReference)commodityDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommodityData_FilerReferenceNumber() {
		return (EAttribute)commodityDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommodityData_VehicleAndEngineData() {
		return (EReference)commodityDataEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommodityList() {
		return commodityListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommodityList_CommodityData() {
		return (EReference)commodityListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactInfoType() {
		return contactInfoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInfoType_POCInfo() {
		return (EAttribute)contactInfoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInfoType_POCPhoneNumber() {
		return (EAttribute)contactInfoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInfoType_ReturnEmailAddress() {
		return (EAttribute)contactInfoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentData() {
		return documentDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentData_DocumentHeader() {
		return (EReference)documentDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentData_GovtAgencyList() {
		return (EReference)documentDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentData_Comment() {
		return (EAttribute)documentDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentData_OptionalData() {
		return (EReference)documentDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentData_VesselData() {
		return (EReference)documentDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentData_ContactInfo() {
		return (EReference)documentDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentData_DocumentObject() {
		return (EAttribute)documentDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentHeader() {
		return documentHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentHeader_DocumentID() {
		return (EAttribute)documentHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentHeader_DocumentLabel() {
		return (EAttribute)documentHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentHeader_CompleteFileName() {
		return (EAttribute)documentHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentHeader_FileExtensionType() {
		return (EAttribute)documentHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentHeader_DocumentDescription() {
		return (EAttribute)documentHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentHeader_DocumentSentDate() {
		return (EAttribute)documentHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentHeader_DocPreviouslySubmitted() {
		return (EAttribute)documentHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntrySummaryType() {
		return entrySummaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntrySummaryType_EntryNumber() {
		return (EAttribute)entrySummaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntrySummaryType_Filer() {
		return (EAttribute)entrySummaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntrySummaryType_EntryLineNumber() {
		return (EAttribute)entrySummaryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntrySummaryType_ReferenceNumber() {
		return (EAttribute)entrySummaryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryType() {
		return entryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_EntryNumber() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Filer() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_EntryLineNumber() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_ReferenceNumber() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGovtAgencyList() {
		return govtAgencyListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGovtAgencyList_GovtAgency() {
		return (EAttribute)govtAgencyListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoiceData() {
		return invoiceDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceData_InvoiceNbr() {
		return (EAttribute)invoiceDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceData_InvoiceType() {
		return (EAttribute)invoiceDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceData_InvoiceLineItemData() {
		return (EReference)invoiceDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoiceLineItemData() {
		return invoiceLineItemDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoiceLineItemData_InvoiceLineNbr() {
		return (EAttribute)invoiceLineItemDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceLineItemData_CommodityData() {
		return (EReference)invoiceLineItemDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoiceLineItemList() {
		return invoiceLineItemListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoiceLineItemList_InvoiceLineItemData() {
		return (EReference)invoiceLineItemListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISFNumberType() {
		return isfNumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISFNumberType_Filer() {
		return (EAttribute)isfNumberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISFNumberType_ISFNumber() {
		return (EAttribute)isfNumberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITNType() {
		return itnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITNType_ITN() {
		return (EAttribute)itnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITNType_ReferenceNumber() {
		return (EAttribute)itnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameValuePair() {
		return nameValuePairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameValuePair_Name() {
		return (EAttribute)nameValuePairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameValuePair_Value() {
		return (EAttribute)nameValuePairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionalData() {
		return optionalDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalData_InvoiceData() {
		return (EReference)optionalDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalData_BondData() {
		return (EReference)optionalDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalData_PackingListData() {
		return (EReference)optionalDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalData_CertificateData() {
		return (EReference)optionalDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalData_PermitData() {
		return (EReference)optionalDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalData_ToxicSubstancesData() {
		return (EReference)optionalDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalData_CommodityList() {
		return (EReference)optionalDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionalData_AdditionalData() {
		return (EReference)optionalDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherTransactionType() {
		return otherTransactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherTransactionType_TransactionName() {
		return (EAttribute)otherTransactionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherTransactionType_TransactionNumber() {
		return (EAttribute)otherTransactionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageIdentifierType() {
		return packageIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageIdentifierType_PackageCategory() {
		return (EAttribute)packageIdentifierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageIdentifierType_PackageName() {
		return (EReference)packageIdentifierTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageIdentifierType_ImporterOfRecordNbr() {
		return (EAttribute)packageIdentifierTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackingListData() {
		return packingListDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackingListData_PackingListNbr() {
		return (EAttribute)packingListDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackingListData_InvoiceNumber() {
		return (EAttribute)packingListDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackingListData_PurchaseOrderNbr() {
		return (EAttribute)packingListDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermitData() {
		return permitDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermitData_PermitNumber() {
		return (EAttribute)permitDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermitData_PermitType() {
		return (EAttribute)permitDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermitData_ApprovalNumber() {
		return (EAttribute)permitDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermitData_Statement() {
		return (EAttribute)permitDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermitData_StartDate() {
		return (EAttribute)permitDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermitData_EndDate() {
		return (EAttribute)permitDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermitData_ImporterOfRecord() {
		return (EAttribute)permitDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToxicSubstancesData() {
		return toxicSubstancesDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToxicSubstancesData_CASNbr() {
		return (EAttribute)toxicSubstancesDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToxicSubstancesData_EPARegistrationNbr() {
		return (EAttribute)toxicSubstancesDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToxicSubstancesData_EPAProducerEstNbr() {
		return (EAttribute)toxicSubstancesDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTradeParties() {
		return tradePartiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeParties_TradeParty() {
		return (EReference)tradePartiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTradePartyInfo() {
		return tradePartyInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradePartyInfo_TradePartyID() {
		return (EAttribute)tradePartyInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradePartyInfo_TradePartyType() {
		return (EAttribute)tradePartyInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradePartyInfo_TradePartyName() {
		return (EAttribute)tradePartyInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradePartyInfo_TradePartyAddress() {
		return (EAttribute)tradePartyInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTradeTransaction() {
		return tradeTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradeTransaction_TransactionCategory() {
		return (EAttribute)tradeTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeTransaction_Entry() {
		return (EReference)tradeTransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeTransaction_EntrySummary() {
		return (EReference)tradeTransactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeTransaction_Bill() {
		return (EReference)tradeTransactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeTransaction_ISFNumber() {
		return (EReference)tradeTransactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeTransaction_ITN() {
		return (EReference)tradeTransactionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeTransaction_XTN() {
		return (EReference)tradeTransactionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradeTransaction_FTZAdmissionNbr() {
		return (EAttribute)tradeTransactionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTradeTransaction_ImporterOfRecordNbr() {
		return (EAttribute)tradeTransactionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTradeTransaction_OtherTransaction() {
		return (EReference)tradeTransactionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleAndEngineData() {
		return vehicleAndEngineDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_VIN() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_VehicleManufacturer() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_VehicleModel() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_VehicleSerialNumber() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_VehicleManufactureDate() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_EngineManufacturer() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_EngineModel() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_EngineSerialNumber() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleAndEngineData_EngineManufactureDate() {
		return (EAttribute)vehicleAndEngineDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVesselDataType() {
		return vesselDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_CarrierSCAC() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_LicensePermitNumber() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_CertificateNumber() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_IssueDate() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_ExpirationDate() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_GrossTonnage() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_NetTonnage() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_VesselVoyageNumber() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_VesselVoyageSegmentNbr() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVesselDataType_VesselInspectionID() {
		return (EAttribute)vesselDataTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTNType() {
		return xtnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTNType_XTN() {
		return (EAttribute)xtnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTNType_ReferenceNumber() {
		return (EAttribute)xtnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubmittedToPortCode() {
		return submittedToPortCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisFactory getDisFactory() {
		return (DisFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		additionalDataEClass = createEClass(ADDITIONAL_DATA);
		createEReference(additionalDataEClass, ADDITIONAL_DATA__NAME_VALUE_PAIR);

		billTypeEClass = createEClass(BILL_TYPE);
		createEAttribute(billTypeEClass, BILL_TYPE__SCAC);
		createEAttribute(billTypeEClass, BILL_TYPE__BILL_NUMBER);
		createEAttribute(billTypeEClass, BILL_TYPE__HOUSE_BILL_NUMBER);
		createEAttribute(billTypeEClass, BILL_TYPE__REFERENCE_NUMBER);

		bondDataEClass = createEClass(BOND_DATA);
		createEAttribute(bondDataEClass, BOND_DATA__BOND_NAME);
		createEAttribute(bondDataEClass, BOND_DATA__BOND_NUMBER);
		createEAttribute(bondDataEClass, BOND_DATA__BOND_TYPE);
		createEAttribute(bondDataEClass, BOND_DATA__SURETY_CODE);
		createEAttribute(bondDataEClass, BOND_DATA__AGENT_ID_NBR);
		createEAttribute(bondDataEClass, BOND_DATA__FILER);
		createEAttribute(bondDataEClass, BOND_DATA__BOND_AMOUNT);

		cbpRequestEClass = createEClass(CBP_REQUEST);
		createEAttribute(cbpRequestEClass, CBP_REQUEST__CBP_REQUEST_ID);
		createEAttribute(cbpRequestEClass, CBP_REQUEST__CBP_REQUEST_TYPE);
		createEAttribute(cbpRequestEClass, CBP_REQUEST__CBP_REQUEST_DATE);

		certificateDataEClass = createEClass(CERTIFICATE_DATA);
		createEAttribute(certificateDataEClass, CERTIFICATE_DATA__CERTIFICATE_NUMBER);
		createEAttribute(certificateDataEClass, CERTIFICATE_DATA__CERTIFICATE_TYPE);
		createEAttribute(certificateDataEClass, CERTIFICATE_DATA__STATEMENT);
		createEAttribute(certificateDataEClass, CERTIFICATE_DATA__EXPIRATION_DATE);
		createEAttribute(certificateDataEClass, CERTIFICATE_DATA__IMPORTER_OF_RECORD);
		createEAttribute(certificateDataEClass, CERTIFICATE_DATA__INSPECTION_LOCATION);

		commodityDataEClass = createEClass(COMMODITY_DATA);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__ENTRY_LINE_NUMBER);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__HTS_NUMBER);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__COMMODITY_DESCRIPTION);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__COUNTRY_OF_ORIGIN);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__CONTAINER_NBR);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__ARRIVAL_DATE);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__PORT_OF_LADING);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__PORT_OF_UNLADING);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__PORT_OF_ENTRY);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__PPQ_SIGNATURE);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__SEAL_NUMBERS);
		createEReference(commodityDataEClass, COMMODITY_DATA__TRADE_PARTIES);
		createEAttribute(commodityDataEClass, COMMODITY_DATA__FILER_REFERENCE_NUMBER);
		createEReference(commodityDataEClass, COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA);

		commodityListEClass = createEClass(COMMODITY_LIST);
		createEReference(commodityListEClass, COMMODITY_LIST__COMMODITY_DATA);

		contactInfoTypeEClass = createEClass(CONTACT_INFO_TYPE);
		createEAttribute(contactInfoTypeEClass, CONTACT_INFO_TYPE__POC_INFO);
		createEAttribute(contactInfoTypeEClass, CONTACT_INFO_TYPE__POC_PHONE_NUMBER);
		createEAttribute(contactInfoTypeEClass, CONTACT_INFO_TYPE__RETURN_EMAIL_ADDRESS);

		documentDataEClass = createEClass(DOCUMENT_DATA);
		createEReference(documentDataEClass, DOCUMENT_DATA__DOCUMENT_HEADER);
		createEReference(documentDataEClass, DOCUMENT_DATA__GOVT_AGENCY_LIST);
		createEAttribute(documentDataEClass, DOCUMENT_DATA__COMMENT);
		createEReference(documentDataEClass, DOCUMENT_DATA__OPTIONAL_DATA);
		createEReference(documentDataEClass, DOCUMENT_DATA__VESSEL_DATA);
		createEReference(documentDataEClass, DOCUMENT_DATA__CONTACT_INFO);
		createEAttribute(documentDataEClass, DOCUMENT_DATA__DOCUMENT_OBJECT);

		documentHeaderEClass = createEClass(DOCUMENT_HEADER);
		createEAttribute(documentHeaderEClass, DOCUMENT_HEADER__DOCUMENT_ID);
		createEAttribute(documentHeaderEClass, DOCUMENT_HEADER__DOCUMENT_LABEL);
		createEAttribute(documentHeaderEClass, DOCUMENT_HEADER__COMPLETE_FILE_NAME);
		createEAttribute(documentHeaderEClass, DOCUMENT_HEADER__FILE_EXTENSION_TYPE);
		createEAttribute(documentHeaderEClass, DOCUMENT_HEADER__DOCUMENT_DESCRIPTION);
		createEAttribute(documentHeaderEClass, DOCUMENT_HEADER__DOCUMENT_SENT_DATE);
		createEAttribute(documentHeaderEClass, DOCUMENT_HEADER__DOC_PREVIOUSLY_SUBMITTED);

		entrySummaryTypeEClass = createEClass(ENTRY_SUMMARY_TYPE);
		createEAttribute(entrySummaryTypeEClass, ENTRY_SUMMARY_TYPE__ENTRY_NUMBER);
		createEAttribute(entrySummaryTypeEClass, ENTRY_SUMMARY_TYPE__FILER);
		createEAttribute(entrySummaryTypeEClass, ENTRY_SUMMARY_TYPE__ENTRY_LINE_NUMBER);
		createEAttribute(entrySummaryTypeEClass, ENTRY_SUMMARY_TYPE__REFERENCE_NUMBER);

		entryTypeEClass = createEClass(ENTRY_TYPE);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__ENTRY_NUMBER);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__FILER);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__ENTRY_LINE_NUMBER);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__REFERENCE_NUMBER);

		govtAgencyListEClass = createEClass(GOVT_AGENCY_LIST);
		createEAttribute(govtAgencyListEClass, GOVT_AGENCY_LIST__GOVT_AGENCY);

		invoiceDataEClass = createEClass(INVOICE_DATA);
		createEAttribute(invoiceDataEClass, INVOICE_DATA__INVOICE_NBR);
		createEAttribute(invoiceDataEClass, INVOICE_DATA__INVOICE_TYPE);
		createEReference(invoiceDataEClass, INVOICE_DATA__INVOICE_LINE_ITEM_DATA);

		invoiceLineItemDataEClass = createEClass(INVOICE_LINE_ITEM_DATA);
		createEAttribute(invoiceLineItemDataEClass, INVOICE_LINE_ITEM_DATA__INVOICE_LINE_NBR);
		createEReference(invoiceLineItemDataEClass, INVOICE_LINE_ITEM_DATA__COMMODITY_DATA);

		invoiceLineItemListEClass = createEClass(INVOICE_LINE_ITEM_LIST);
		createEReference(invoiceLineItemListEClass, INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA);

		isfNumberTypeEClass = createEClass(ISF_NUMBER_TYPE);
		createEAttribute(isfNumberTypeEClass, ISF_NUMBER_TYPE__FILER);
		createEAttribute(isfNumberTypeEClass, ISF_NUMBER_TYPE__ISF_NUMBER);

		itnTypeEClass = createEClass(ITN_TYPE);
		createEAttribute(itnTypeEClass, ITN_TYPE__ITN);
		createEAttribute(itnTypeEClass, ITN_TYPE__REFERENCE_NUMBER);

		nameValuePairEClass = createEClass(NAME_VALUE_PAIR);
		createEAttribute(nameValuePairEClass, NAME_VALUE_PAIR__NAME);
		createEAttribute(nameValuePairEClass, NAME_VALUE_PAIR__VALUE);

		optionalDataEClass = createEClass(OPTIONAL_DATA);
		createEReference(optionalDataEClass, OPTIONAL_DATA__INVOICE_DATA);
		createEReference(optionalDataEClass, OPTIONAL_DATA__BOND_DATA);
		createEReference(optionalDataEClass, OPTIONAL_DATA__PACKING_LIST_DATA);
		createEReference(optionalDataEClass, OPTIONAL_DATA__CERTIFICATE_DATA);
		createEReference(optionalDataEClass, OPTIONAL_DATA__PERMIT_DATA);
		createEReference(optionalDataEClass, OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA);
		createEReference(optionalDataEClass, OPTIONAL_DATA__COMMODITY_LIST);
		createEReference(optionalDataEClass, OPTIONAL_DATA__ADDITIONAL_DATA);

		otherTransactionTypeEClass = createEClass(OTHER_TRANSACTION_TYPE);
		createEAttribute(otherTransactionTypeEClass, OTHER_TRANSACTION_TYPE__TRANSACTION_NAME);
		createEAttribute(otherTransactionTypeEClass, OTHER_TRANSACTION_TYPE__TRANSACTION_NUMBER);

		packageIdentifierTypeEClass = createEClass(PACKAGE_IDENTIFIER_TYPE);
		createEAttribute(packageIdentifierTypeEClass, PACKAGE_IDENTIFIER_TYPE__PACKAGE_CATEGORY);
		createEReference(packageIdentifierTypeEClass, PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME);
		createEAttribute(packageIdentifierTypeEClass, PACKAGE_IDENTIFIER_TYPE__IMPORTER_OF_RECORD_NBR);

		packingListDataEClass = createEClass(PACKING_LIST_DATA);
		createEAttribute(packingListDataEClass, PACKING_LIST_DATA__PACKING_LIST_NBR);
		createEAttribute(packingListDataEClass, PACKING_LIST_DATA__INVOICE_NUMBER);
		createEAttribute(packingListDataEClass, PACKING_LIST_DATA__PURCHASE_ORDER_NBR);

		permitDataEClass = createEClass(PERMIT_DATA);
		createEAttribute(permitDataEClass, PERMIT_DATA__PERMIT_NUMBER);
		createEAttribute(permitDataEClass, PERMIT_DATA__PERMIT_TYPE);
		createEAttribute(permitDataEClass, PERMIT_DATA__APPROVAL_NUMBER);
		createEAttribute(permitDataEClass, PERMIT_DATA__STATEMENT);
		createEAttribute(permitDataEClass, PERMIT_DATA__START_DATE);
		createEAttribute(permitDataEClass, PERMIT_DATA__END_DATE);
		createEAttribute(permitDataEClass, PERMIT_DATA__IMPORTER_OF_RECORD);

		toxicSubstancesDataEClass = createEClass(TOXIC_SUBSTANCES_DATA);
		createEAttribute(toxicSubstancesDataEClass, TOXIC_SUBSTANCES_DATA__CAS_NBR);
		createEAttribute(toxicSubstancesDataEClass, TOXIC_SUBSTANCES_DATA__EPA_REGISTRATION_NBR);
		createEAttribute(toxicSubstancesDataEClass, TOXIC_SUBSTANCES_DATA__EPA_PRODUCER_EST_NBR);

		tradePartiesEClass = createEClass(TRADE_PARTIES);
		createEReference(tradePartiesEClass, TRADE_PARTIES__TRADE_PARTY);

		tradePartyInfoEClass = createEClass(TRADE_PARTY_INFO);
		createEAttribute(tradePartyInfoEClass, TRADE_PARTY_INFO__TRADE_PARTY_ID);
		createEAttribute(tradePartyInfoEClass, TRADE_PARTY_INFO__TRADE_PARTY_TYPE);
		createEAttribute(tradePartyInfoEClass, TRADE_PARTY_INFO__TRADE_PARTY_NAME);
		createEAttribute(tradePartyInfoEClass, TRADE_PARTY_INFO__TRADE_PARTY_ADDRESS);

		tradeTransactionEClass = createEClass(TRADE_TRANSACTION);
		createEAttribute(tradeTransactionEClass, TRADE_TRANSACTION__TRANSACTION_CATEGORY);
		createEReference(tradeTransactionEClass, TRADE_TRANSACTION__ENTRY);
		createEReference(tradeTransactionEClass, TRADE_TRANSACTION__ENTRY_SUMMARY);
		createEReference(tradeTransactionEClass, TRADE_TRANSACTION__BILL);
		createEReference(tradeTransactionEClass, TRADE_TRANSACTION__ISF_NUMBER);
		createEReference(tradeTransactionEClass, TRADE_TRANSACTION__ITN);
		createEReference(tradeTransactionEClass, TRADE_TRANSACTION__XTN);
		createEAttribute(tradeTransactionEClass, TRADE_TRANSACTION__FTZ_ADMISSION_NBR);
		createEAttribute(tradeTransactionEClass, TRADE_TRANSACTION__IMPORTER_OF_RECORD_NBR);
		createEReference(tradeTransactionEClass, TRADE_TRANSACTION__OTHER_TRANSACTION);

		vehicleAndEngineDataEClass = createEClass(VEHICLE_AND_ENGINE_DATA);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__VIN);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURER);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__VEHICLE_MODEL);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__VEHICLE_SERIAL_NUMBER);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURE_DATE);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURER);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__ENGINE_MODEL);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__ENGINE_SERIAL_NUMBER);
		createEAttribute(vehicleAndEngineDataEClass, VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURE_DATE);

		vesselDataTypeEClass = createEClass(VESSEL_DATA_TYPE);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__CARRIER_SCAC);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__LICENSE_PERMIT_NUMBER);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__CERTIFICATE_NUMBER);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__ISSUE_DATE);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__EXPIRATION_DATE);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__GROSS_TONNAGE);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__NET_TONNAGE);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__VESSEL_VOYAGE_NUMBER);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__VESSEL_VOYAGE_SEGMENT_NBR);
		createEAttribute(vesselDataTypeEClass, VESSEL_DATA_TYPE__VESSEL_INSPECTION_ID);

		xtnTypeEClass = createEClass(XTN_TYPE);
		createEAttribute(xtnTypeEClass, XTN_TYPE__XTN);
		createEAttribute(xtnTypeEClass, XTN_TYPE__REFERENCE_NUMBER);

		// Create data types
		submittedToPortCodeEDataType = createEDataType(SUBMITTED_TO_PORT_CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(additionalDataEClass, AdditionalData.class, "AdditionalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditionalData_NameValuePair(), this.getNameValuePair(), null, "nameValuePair", null, 1, -1, AdditionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(billTypeEClass, BillType.class, "BillType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBillType_SCAC(), theXMLTypePackage.getString(), "sCAC", null, 1, 1, BillType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillType_BillNumber(), theXMLTypePackage.getString(), "billNumber", null, 1, 1, BillType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillType_HouseBillNumber(), theXMLTypePackage.getString(), "houseBillNumber", null, 0, 1, BillType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillType_ReferenceNumber(), theXMLTypePackage.getString(), "referenceNumber", null, 0, 1, BillType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bondDataEClass, BondData.class, "BondData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBondData_BondName(), theXMLTypePackage.getString(), "bondName", null, 0, 1, BondData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBondData_BondNumber(), theXMLTypePackage.getString(), "bondNumber", null, 0, 1, BondData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBondData_BondType(), theXMLTypePackage.getString(), "bondType", null, 0, 1, BondData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBondData_SuretyCode(), theXMLTypePackage.getString(), "suretyCode", null, 0, 1, BondData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBondData_AgentIDNbr(), theXMLTypePackage.getString(), "agentIDNbr", null, 0, 1, BondData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBondData_Filer(), theXMLTypePackage.getString(), "filer", null, 0, 1, BondData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBondData_BondAmount(), theXMLTypePackage.getString(), "bondAmount", null, 0, 1, BondData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cbpRequestEClass, CBPRequest.class, "CBPRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCBPRequest_CBPRequestID(), theXMLTypePackage.getString(), "cBPRequestID", null, 1, 1, CBPRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCBPRequest_CBPRequestType(), theXMLTypePackage.getString(), "cBPRequestType", null, 0, 1, CBPRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCBPRequest_CBPRequestDate(), theXMLTypePackage.getDateTime(), "cBPRequestDate", null, 0, 1, CBPRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificateDataEClass, CertificateData.class, "CertificateData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificateData_CertificateNumber(), theXMLTypePackage.getString(), "certificateNumber", null, 0, 1, CertificateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateData_CertificateType(), theXMLTypePackage.getString(), "certificateType", null, 0, 1, CertificateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateData_Statement(), theXMLTypePackage.getString(), "statement", null, 0, 1, CertificateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateData_ExpirationDate(), theXMLTypePackage.getDateTime(), "expirationDate", null, 0, 1, CertificateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateData_ImporterOfRecord(), theXMLTypePackage.getString(), "importerOfRecord", null, 0, 1, CertificateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificateData_InspectionLocation(), theXMLTypePackage.getString(), "inspectionLocation", null, 0, 1, CertificateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commodityDataEClass, CommodityData.class, "CommodityData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommodityData_EntryLineNumber(), theXMLTypePackage.getInt(), "entryLineNumber", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_HTSNumber(), theXMLTypePackage.getString(), "hTSNumber", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_CommodityDescription(), theXMLTypePackage.getString(), "commodityDescription", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_CountryOfOrigin(), theXMLTypePackage.getString(), "countryOfOrigin", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_ContainerNbr(), theXMLTypePackage.getString(), "containerNbr", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_ArrivalDate(), theXMLTypePackage.getDateTime(), "arrivalDate", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_PortOfLading(), theXMLTypePackage.getString(), "portOfLading", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_PortOfUnlading(), theXMLTypePackage.getString(), "portOfUnlading", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_PortOfEntry(), theXMLTypePackage.getString(), "portOfEntry", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_PPQSignature(), theXMLTypePackage.getString(), "pPQSignature", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_SealNumbers(), theXMLTypePackage.getString(), "sealNumbers", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommodityData_TradeParties(), this.getTradeParties(), null, "tradeParties", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommodityData_FilerReferenceNumber(), theXMLTypePackage.getString(), "filerReferenceNumber", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommodityData_VehicleAndEngineData(), this.getVehicleAndEngineData(), null, "vehicleAndEngineData", null, 0, 1, CommodityData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commodityListEClass, CommodityList.class, "CommodityList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommodityList_CommodityData(), this.getCommodityData(), null, "commodityData", null, 1, -1, CommodityList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactInfoTypeEClass, ContactInfoType.class, "ContactInfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactInfoType_POCInfo(), theXMLTypePackage.getString(), "pOCInfo", null, 0, 1, ContactInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInfoType_POCPhoneNumber(), theXMLTypePackage.getString(), "pOCPhoneNumber", null, 0, 1, ContactInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInfoType_ReturnEmailAddress(), theXMLTypePackage.getString(), "returnEmailAddress", null, 0, 1, ContactInfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentDataEClass, DocumentData.class, "DocumentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentData_DocumentHeader(), this.getDocumentHeader(), null, "documentHeader", null, 1, 1, DocumentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentData_GovtAgencyList(), this.getGovtAgencyList(), null, "govtAgencyList", null, 0, 1, DocumentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentData_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, DocumentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentData_OptionalData(), this.getOptionalData(), null, "optionalData", null, 0, 1, DocumentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentData_VesselData(), this.getVesselDataType(), null, "vesselData", null, 0, 1, DocumentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentData_ContactInfo(), this.getContactInfoType(), null, "contactInfo", null, 0, 1, DocumentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentData_DocumentObject(), theXMLTypePackage.getString(), "documentObject", null, 1, 1, DocumentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentHeaderEClass, DocumentHeader.class, "DocumentHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentHeader_DocumentID(), theXMLTypePackage.getString(), "documentID", null, 1, 1, DocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentHeader_DocumentLabel(), theXMLTypePackage.getString(), "documentLabel", null, 1, 1, DocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentHeader_CompleteFileName(), theXMLTypePackage.getString(), "completeFileName", null, 1, 1, DocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentHeader_FileExtensionType(), theXMLTypePackage.getString(), "fileExtensionType", null, 1, 1, DocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentHeader_DocumentDescription(), theXMLTypePackage.getString(), "documentDescription", null, 0, 1, DocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentHeader_DocumentSentDate(), theXMLTypePackage.getDateTime(), "documentSentDate", null, 0, 1, DocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentHeader_DocPreviouslySubmitted(), theXMLTypePackage.getString(), "docPreviouslySubmitted", null, 0, 1, DocumentHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entrySummaryTypeEClass, EntrySummaryType.class, "EntrySummaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntrySummaryType_EntryNumber(), theXMLTypePackage.getString(), "entryNumber", null, 1, 1, EntrySummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntrySummaryType_Filer(), theXMLTypePackage.getString(), "filer", null, 1, 1, EntrySummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntrySummaryType_EntryLineNumber(), theXMLTypePackage.getString(), "entryLineNumber", null, 0, 1, EntrySummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntrySummaryType_ReferenceNumber(), theXMLTypePackage.getString(), "referenceNumber", null, 0, 1, EntrySummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntryType_EntryNumber(), theXMLTypePackage.getString(), "entryNumber", null, 1, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Filer(), theXMLTypePackage.getString(), "filer", null, 1, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_EntryLineNumber(), theXMLTypePackage.getString(), "entryLineNumber", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_ReferenceNumber(), theXMLTypePackage.getString(), "referenceNumber", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(govtAgencyListEClass, GovtAgencyList.class, "GovtAgencyList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGovtAgencyList_GovtAgency(), theXMLTypePackage.getString(), "govtAgency", null, 1, 50, GovtAgencyList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invoiceDataEClass, InvoiceData.class, "InvoiceData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoiceData_InvoiceNbr(), theXMLTypePackage.getString(), "invoiceNbr", null, 1, 1, InvoiceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoiceData_InvoiceType(), theXMLTypePackage.getString(), "invoiceType", null, 1, 1, InvoiceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoiceData_InvoiceLineItemData(), this.getInvoiceLineItemData(), null, "invoiceLineItemData", null, 0, -1, InvoiceData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invoiceLineItemDataEClass, InvoiceLineItemData.class, "InvoiceLineItemData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoiceLineItemData_InvoiceLineNbr(), theXMLTypePackage.getString(), "invoiceLineNbr", null, 1, 1, InvoiceLineItemData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoiceLineItemData_CommodityData(), this.getCommodityData(), null, "commodityData", null, 1, 1, InvoiceLineItemData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invoiceLineItemListEClass, InvoiceLineItemList.class, "InvoiceLineItemList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvoiceLineItemList_InvoiceLineItemData(), this.getInvoiceLineItemData(), null, "invoiceLineItemData", null, 1, -1, InvoiceLineItemList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isfNumberTypeEClass, ISFNumberType.class, "ISFNumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISFNumberType_Filer(), theXMLTypePackage.getString(), "filer", null, 1, 1, ISFNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISFNumberType_ISFNumber(), theXMLTypePackage.getString(), "iSFNumber", null, 1, 1, ISFNumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itnTypeEClass, ITNType.class, "ITNType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getITNType_ITN(), theXMLTypePackage.getString(), "iTN", null, 1, 1, ITNType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getITNType_ReferenceNumber(), theXMLTypePackage.getString(), "referenceNumber", null, 0, 1, ITNType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameValuePairEClass, NameValuePair.class, "NameValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameValuePair_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, NameValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameValuePair_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, NameValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionalDataEClass, OptionalData.class, "OptionalData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionalData_InvoiceData(), this.getInvoiceData(), null, "invoiceData", null, 0, 1, OptionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionalData_BondData(), this.getBondData(), null, "bondData", null, 0, 1, OptionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionalData_PackingListData(), this.getPackingListData(), null, "packingListData", null, 0, 1, OptionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionalData_CertificateData(), this.getCertificateData(), null, "certificateData", null, 0, 1, OptionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionalData_PermitData(), this.getPermitData(), null, "permitData", null, 0, 1, OptionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionalData_ToxicSubstancesData(), this.getToxicSubstancesData(), null, "toxicSubstancesData", null, 0, 1, OptionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionalData_CommodityList(), this.getCommodityList(), null, "commodityList", null, 0, 1, OptionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionalData_AdditionalData(), this.getAdditionalData(), null, "additionalData", null, 0, 1, OptionalData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherTransactionTypeEClass, OtherTransactionType.class, "OtherTransactionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOtherTransactionType_TransactionName(), theXMLTypePackage.getString(), "transactionName", null, 1, 1, OtherTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOtherTransactionType_TransactionNumber(), theXMLTypePackage.getString(), "transactionNumber", null, 1, 1, OtherTransactionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageIdentifierTypeEClass, PackageIdentifierType.class, "PackageIdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackageIdentifierType_PackageCategory(), theXMLTypePackage.getString(), "packageCategory", null, 0, 1, PackageIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageIdentifierType_PackageName(), ecorePackage.getEObject(), null, "packageName", null, 0, 1, PackageIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageIdentifierType_ImporterOfRecordNbr(), theXMLTypePackage.getString(), "importerOfRecordNbr", null, 1, 1, PackageIdentifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packingListDataEClass, PackingListData.class, "PackingListData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackingListData_PackingListNbr(), theXMLTypePackage.getString(), "packingListNbr", null, 0, 1, PackingListData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackingListData_InvoiceNumber(), theXMLTypePackage.getString(), "invoiceNumber", null, 0, 1, PackingListData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackingListData_PurchaseOrderNbr(), theXMLTypePackage.getString(), "purchaseOrderNbr", null, 0, 1, PackingListData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permitDataEClass, PermitData.class, "PermitData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermitData_PermitNumber(), theXMLTypePackage.getString(), "permitNumber", null, 0, 1, PermitData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermitData_PermitType(), theXMLTypePackage.getString(), "permitType", null, 0, 1, PermitData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermitData_ApprovalNumber(), theXMLTypePackage.getString(), "approvalNumber", null, 0, 1, PermitData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermitData_Statement(), theXMLTypePackage.getString(), "statement", null, 0, 1, PermitData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermitData_StartDate(), theXMLTypePackage.getDateTime(), "startDate", null, 0, 1, PermitData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermitData_EndDate(), theXMLTypePackage.getDateTime(), "endDate", null, 0, 1, PermitData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermitData_ImporterOfRecord(), theXMLTypePackage.getString(), "importerOfRecord", null, 0, 1, PermitData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toxicSubstancesDataEClass, ToxicSubstancesData.class, "ToxicSubstancesData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToxicSubstancesData_CASNbr(), theXMLTypePackage.getString(), "cASNbr", null, 0, 1, ToxicSubstancesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToxicSubstancesData_EPARegistrationNbr(), theXMLTypePackage.getString(), "ePARegistrationNbr", null, 0, 1, ToxicSubstancesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToxicSubstancesData_EPAProducerEstNbr(), theXMLTypePackage.getString(), "ePAProducerEstNbr", null, 0, 1, ToxicSubstancesData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradePartiesEClass, TradeParties.class, "TradeParties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTradeParties_TradeParty(), this.getTradePartyInfo(), null, "tradeParty", null, 0, -1, TradeParties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradePartyInfoEClass, TradePartyInfo.class, "TradePartyInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTradePartyInfo_TradePartyID(), theXMLTypePackage.getString(), "tradePartyID", null, 1, 1, TradePartyInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradePartyInfo_TradePartyType(), theXMLTypePackage.getString(), "tradePartyType", null, 1, 1, TradePartyInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradePartyInfo_TradePartyName(), theXMLTypePackage.getString(), "tradePartyName", null, 0, 1, TradePartyInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradePartyInfo_TradePartyAddress(), theXMLTypePackage.getString(), "tradePartyAddress", null, 0, 1, TradePartyInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradeTransactionEClass, TradeTransaction.class, "TradeTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTradeTransaction_TransactionCategory(), theXMLTypePackage.getString(), "transactionCategory", null, 1, 1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradeTransaction_Entry(), this.getEntryType(), null, "entry", null, 0, -1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradeTransaction_EntrySummary(), this.getEntrySummaryType(), null, "entrySummary", null, 0, -1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradeTransaction_Bill(), this.getBillType(), null, "bill", null, 0, -1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradeTransaction_ISFNumber(), this.getISFNumberType(), null, "iSFNumber", null, 0, -1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradeTransaction_ITN(), this.getITNType(), null, "iTN", null, 0, -1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradeTransaction_XTN(), this.getXTNType(), null, "xTN", null, 0, -1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradeTransaction_FTZAdmissionNbr(), theXMLTypePackage.getString(), "fTZAdmissionNbr", null, 0, 1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradeTransaction_ImporterOfRecordNbr(), theXMLTypePackage.getString(), "importerOfRecordNbr", null, 0, 1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradeTransaction_OtherTransaction(), this.getOtherTransactionType(), null, "otherTransaction", null, 0, -1, TradeTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleAndEngineDataEClass, VehicleAndEngineData.class, "VehicleAndEngineData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicleAndEngineData_VIN(), theXMLTypePackage.getString(), "vIN", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleAndEngineData_VehicleManufacturer(), theXMLTypePackage.getString(), "vehicleManufacturer", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleAndEngineData_VehicleModel(), theXMLTypePackage.getString(), "vehicleModel", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleAndEngineData_VehicleSerialNumber(), theXMLTypePackage.getString(), "vehicleSerialNumber", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleAndEngineData_VehicleManufactureDate(), theXMLTypePackage.getDateTime(), "vehicleManufactureDate", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleAndEngineData_EngineManufacturer(), theXMLTypePackage.getString(), "engineManufacturer", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleAndEngineData_EngineModel(), theXMLTypePackage.getString(), "engineModel", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleAndEngineData_EngineSerialNumber(), theXMLTypePackage.getString(), "engineSerialNumber", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleAndEngineData_EngineManufactureDate(), theXMLTypePackage.getDateTime(), "engineManufactureDate", null, 0, 1, VehicleAndEngineData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vesselDataTypeEClass, VesselDataType.class, "VesselDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVesselDataType_CarrierSCAC(), theXMLTypePackage.getString(), "carrierSCAC", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_LicensePermitNumber(), theXMLTypePackage.getString(), "licensePermitNumber", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_CertificateNumber(), theXMLTypePackage.getString(), "certificateNumber", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_IssueDate(), theXMLTypePackage.getString(), "issueDate", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_ExpirationDate(), theXMLTypePackage.getString(), "expirationDate", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_GrossTonnage(), theXMLTypePackage.getString(), "grossTonnage", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_NetTonnage(), theXMLTypePackage.getString(), "netTonnage", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_VesselVoyageNumber(), theXMLTypePackage.getString(), "vesselVoyageNumber", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_VesselVoyageSegmentNbr(), theXMLTypePackage.getString(), "vesselVoyageSegmentNbr", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVesselDataType_VesselInspectionID(), theXMLTypePackage.getString(), "vesselInspectionID", null, 0, 1, VesselDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xtnTypeEClass, XTNType.class, "XTNType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXTNType_XTN(), theXMLTypePackage.getString(), "xTN", null, 1, 1, XTNType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXTNType_ReferenceNumber(), theXMLTypePackage.getString(), "referenceNumber", null, 0, 1, XTNType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(submittedToPortCodeEDataType, String.class, "SubmittedToPortCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (additionalDataEClass,
		   source,
		   new String[] {
			   "name", "AdditionalData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAdditionalData_NameValuePair(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NameValuePair",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (billTypeEClass,
		   source,
		   new String[] {
			   "name", "Bill_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBillType_SCAC(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SCAC",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBillType_BillNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BillNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBillType_HouseBillNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HouseBillNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBillType_ReferenceNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferenceNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (bondDataEClass,
		   source,
		   new String[] {
			   "name", "BondData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBondData_BondName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BondName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBondData_BondNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BondNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBondData_BondType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BondType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBondData_SuretyCode(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SuretyCode",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBondData_AgentIDNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AgentIDNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBondData_Filer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getBondData_BondAmount(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BondAmount",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cbpRequestEClass,
		   source,
		   new String[] {
			   "name", "CBPRequest",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCBPRequest_CBPRequestID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CBPRequestID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCBPRequest_CBPRequestType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CBPRequestType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCBPRequest_CBPRequestDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CBPRequestDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (certificateDataEClass,
		   source,
		   new String[] {
			   "name", "CertificateData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCertificateData_CertificateNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CertificateNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCertificateData_CertificateType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CertificateType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCertificateData_Statement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Statement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCertificateData_ExpirationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExpirationDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCertificateData_ImporterOfRecord(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImporterOfRecord",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCertificateData_InspectionLocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InspectionLocation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (commodityDataEClass,
		   source,
		   new String[] {
			   "name", "CommodityData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCommodityData_EntryLineNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EntryLineNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_HTSNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "HTSNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_CommodityDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommodityDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_CountryOfOrigin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CountryOfOrigin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_ContainerNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContainerNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_ArrivalDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ArrivalDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_PortOfLading(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PortOfLading",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_PortOfUnlading(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PortOfUnlading",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_PortOfEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PortOfEntry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_PPQSignature(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PPQSignature",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_SealNumbers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SealNumbers",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_TradeParties(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TradeParties",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_FilerReferenceNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FilerReferenceNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommodityData_VehicleAndEngineData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleAndEngineData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (commodityListEClass,
		   source,
		   new String[] {
			   "name", "CommodityList",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCommodityList_CommodityData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommodityData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (contactInfoTypeEClass,
		   source,
		   new String[] {
			   "name", "ContactInfoType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getContactInfoType_POCInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "POC_Info",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactInfoType_POCPhoneNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "POC_PhoneNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getContactInfoType_ReturnEmailAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReturnEmailAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentDataEClass,
		   source,
		   new String[] {
			   "name", "DocumentData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDocumentData_DocumentHeader(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DocumentHeader",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentData_GovtAgencyList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GovtAgencyList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentData_Comment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Comment",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentData_OptionalData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OptionalData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentData_VesselData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VesselData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentData_ContactInfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ContactInfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentData_DocumentObject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DocumentObject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentHeaderEClass,
		   source,
		   new String[] {
			   "name", "DocumentHeader",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDocumentHeader_DocumentID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DocumentID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentHeader_DocumentLabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DocumentLabel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentHeader_CompleteFileName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CompleteFileName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentHeader_FileExtensionType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FileExtensionType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentHeader_DocumentDescription(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DocumentDescription",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentHeader_DocumentSentDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DocumentSentDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentHeader_DocPreviouslySubmitted(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DocPreviouslySubmitted",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (entrySummaryTypeEClass,
		   source,
		   new String[] {
			   "name", "EntrySummary_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntrySummaryType_EntryNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EntryNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntrySummaryType_Filer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntrySummaryType_EntryLineNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EntryLineNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntrySummaryType_ReferenceNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferenceNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (entryTypeEClass,
		   source,
		   new String[] {
			   "name", "Entry_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntryType_EntryNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EntryNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntryType_Filer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntryType_EntryLineNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EntryLineNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getEntryType_ReferenceNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferenceNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (govtAgencyListEClass,
		   source,
		   new String[] {
			   "name", "GovtAgencyList",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGovtAgencyList_GovtAgency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GovtAgency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (invoiceDataEClass,
		   source,
		   new String[] {
			   "name", "InvoiceData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInvoiceData_InvoiceNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvoiceNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvoiceData_InvoiceType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvoiceType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvoiceData_InvoiceLineItemData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvoiceLineItemData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (invoiceLineItemDataEClass,
		   source,
		   new String[] {
			   "name", "InvoiceLineItemData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInvoiceLineItemData_InvoiceLineNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvoiceLineNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInvoiceLineItemData_CommodityData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommodityData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (invoiceLineItemListEClass,
		   source,
		   new String[] {
			   "name", "InvoiceLineItemList",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInvoiceLineItemList_InvoiceLineItemData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvoiceLineItemData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (isfNumberTypeEClass,
		   source,
		   new String[] {
			   "name", "ISFNumber_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getISFNumberType_Filer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Filer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getISFNumberType_ISFNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ISFNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (itnTypeEClass,
		   source,
		   new String[] {
			   "name", "ITN_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getITNType_ITN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ITN",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getITNType_ReferenceNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferenceNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (nameValuePairEClass,
		   source,
		   new String[] {
			   "name", "NameValuePair",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNameValuePair_Name(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getNameValuePair_Value(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Value",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (optionalDataEClass,
		   source,
		   new String[] {
			   "name", "OptionalData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOptionalData_InvoiceData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvoiceData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOptionalData_BondData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BondData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOptionalData_PackingListData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PackingListData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOptionalData_CertificateData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CertificateData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOptionalData_PermitData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PermitData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOptionalData_ToxicSubstancesData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ToxicSubstancesData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOptionalData_CommodityList(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommodityList",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOptionalData_AdditionalData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AdditionalData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (otherTransactionTypeEClass,
		   source,
		   new String[] {
			   "name", "OtherTransaction_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOtherTransactionType_TransactionName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransactionName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getOtherTransactionType_TransactionNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransactionNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (packageIdentifierTypeEClass,
		   source,
		   new String[] {
			   "name", "PackageIdentifierType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPackageIdentifierType_PackageCategory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PackageCategory",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPackageIdentifierType_PackageName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PackageName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPackageIdentifierType_ImporterOfRecordNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImporterOfRecordNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (packingListDataEClass,
		   source,
		   new String[] {
			   "name", "PackingListData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPackingListData_PackingListNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PackingListNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPackingListData_InvoiceNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InvoiceNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPackingListData_PurchaseOrderNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PurchaseOrderNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (permitDataEClass,
		   source,
		   new String[] {
			   "name", "PermitData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPermitData_PermitNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PermitNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPermitData_PermitType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PermitType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPermitData_ApprovalNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ApprovalNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPermitData_Statement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Statement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPermitData_StartDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "StartDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPermitData_EndDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EndDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPermitData_ImporterOfRecord(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImporterOfRecord",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (submittedToPortCodeEDataType,
		   source,
		   new String[] {
			   "name", "SubmittedToPortCode",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (toxicSubstancesDataEClass,
		   source,
		   new String[] {
			   "name", "ToxicSubstancesData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getToxicSubstancesData_CASNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CASNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getToxicSubstancesData_EPARegistrationNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EPARegistrationNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getToxicSubstancesData_EPAProducerEstNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EPAProducerEstNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tradePartiesEClass,
		   source,
		   new String[] {
			   "name", "TradeParties",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTradeParties_TradeParty(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TradeParty",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tradePartyInfoEClass,
		   source,
		   new String[] {
			   "name", "TradePartyInfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTradePartyInfo_TradePartyID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TradePartyID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradePartyInfo_TradePartyType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TradePartyType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradePartyInfo_TradePartyName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TradePartyName",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradePartyInfo_TradePartyAddress(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TradePartyAddress",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tradeTransactionEClass,
		   source,
		   new String[] {
			   "name", "TradeTransaction",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTradeTransaction_TransactionCategory(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "TransactionCategory",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_Entry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Entry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_EntrySummary(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EntrySummary",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_Bill(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bill",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_ISFNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ISFNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_ITN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ITN",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_XTN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "XTN",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_FTZAdmissionNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FTZAdmissionNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_ImporterOfRecordNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ImporterOfRecordNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTradeTransaction_OtherTransaction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "OtherTransaction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (vehicleAndEngineDataEClass,
		   source,
		   new String[] {
			   "name", "VehicleAndEngineData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVehicleAndEngineData_VIN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VIN",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleAndEngineData_VehicleManufacturer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleManufacturer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleAndEngineData_VehicleModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleAndEngineData_VehicleSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleAndEngineData_VehicleManufactureDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VehicleManufactureDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleAndEngineData_EngineManufacturer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EngineManufacturer",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleAndEngineData_EngineModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EngineModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleAndEngineData_EngineSerialNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EngineSerialNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVehicleAndEngineData_EngineManufactureDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EngineManufactureDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (vesselDataTypeEClass,
		   source,
		   new String[] {
			   "name", "VesselDataType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVesselDataType_CarrierSCAC(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CarrierSCAC",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_LicensePermitNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "License_PermitNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_CertificateNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CertificateNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_IssueDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "IssueDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_ExpirationDate(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExpirationDate",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_GrossTonnage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GrossTonnage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_NetTonnage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NetTonnage",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_VesselVoyageNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VesselVoyageNumber",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_VesselVoyageSegmentNbr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VesselVoyageSegmentNbr",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVesselDataType_VesselInspectionID(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "VesselInspectionID",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (xtnTypeEClass,
		   source,
		   new String[] {
			   "name", "XTN_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getXTNType_XTN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "XTN",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getXTNType_ReferenceNumber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReferenceNumber",
			   "namespace", "##targetNamespace"
		   });
	}

} //DisPackageImpl
