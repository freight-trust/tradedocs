/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gov.dhs.cbp.dis.DisFactory
 * @model kind="package"
 * @generated
 */
public interface DisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cbp.dhs.gov/DIS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dis";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DisPackage eINSTANCE = gov.dhs.cbp.dis.impl.DisPackageImpl.init();

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.AdditionalDataImpl <em>Additional Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.AdditionalDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getAdditionalData()
	 * @generated
	 */
	int ADDITIONAL_DATA = 0;

	/**
	 * The feature id for the '<em><b>Name Value Pair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DATA__NAME_VALUE_PAIR = 0;

	/**
	 * The number of structural features of the '<em>Additional Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Additional Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.BillTypeImpl <em>Bill Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.BillTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getBillType()
	 * @generated
	 */
	int BILL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>SCAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_TYPE__SCAC = 0;

	/**
	 * The feature id for the '<em><b>Bill Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_TYPE__BILL_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>House Bill Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_TYPE__HOUSE_BILL_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_TYPE__REFERENCE_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Bill Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bill Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.BondDataImpl <em>Bond Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.BondDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getBondData()
	 * @generated
	 */
	int BOND_DATA = 2;

	/**
	 * The feature id for the '<em><b>Bond Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA__BOND_NAME = 0;

	/**
	 * The feature id for the '<em><b>Bond Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA__BOND_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Bond Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA__BOND_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Surety Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA__SURETY_CODE = 3;

	/**
	 * The feature id for the '<em><b>Agent ID Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA__AGENT_ID_NBR = 4;

	/**
	 * The feature id for the '<em><b>Filer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA__FILER = 5;

	/**
	 * The feature id for the '<em><b>Bond Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA__BOND_AMOUNT = 6;

	/**
	 * The number of structural features of the '<em>Bond Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Bond Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOND_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.CBPRequestImpl <em>CBP Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.CBPRequestImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getCBPRequest()
	 * @generated
	 */
	int CBP_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>CBP Request ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBP_REQUEST__CBP_REQUEST_ID = 0;

	/**
	 * The feature id for the '<em><b>CBP Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBP_REQUEST__CBP_REQUEST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>CBP Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBP_REQUEST__CBP_REQUEST_DATE = 2;

	/**
	 * The number of structural features of the '<em>CBP Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBP_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>CBP Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CBP_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.CertificateDataImpl <em>Certificate Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.CertificateDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getCertificateData()
	 * @generated
	 */
	int CERTIFICATE_DATA = 4;

	/**
	 * The feature id for the '<em><b>Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_DATA__CERTIFICATE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Certificate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_DATA__CERTIFICATE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_DATA__STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_DATA__EXPIRATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Importer Of Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_DATA__IMPORTER_OF_RECORD = 4;

	/**
	 * The feature id for the '<em><b>Inspection Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_DATA__INSPECTION_LOCATION = 5;

	/**
	 * The number of structural features of the '<em>Certificate Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_DATA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Certificate Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.CommodityDataImpl <em>Commodity Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.CommodityDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getCommodityData()
	 * @generated
	 */
	int COMMODITY_DATA = 5;

	/**
	 * The feature id for the '<em><b>Entry Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__ENTRY_LINE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>HTS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__HTS_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Commodity Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__COMMODITY_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Country Of Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__COUNTRY_OF_ORIGIN = 3;

	/**
	 * The feature id for the '<em><b>Container Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__CONTAINER_NBR = 4;

	/**
	 * The feature id for the '<em><b>Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__ARRIVAL_DATE = 5;

	/**
	 * The feature id for the '<em><b>Port Of Lading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__PORT_OF_LADING = 6;

	/**
	 * The feature id for the '<em><b>Port Of Unlading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__PORT_OF_UNLADING = 7;

	/**
	 * The feature id for the '<em><b>Port Of Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__PORT_OF_ENTRY = 8;

	/**
	 * The feature id for the '<em><b>PPQ Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__PPQ_SIGNATURE = 9;

	/**
	 * The feature id for the '<em><b>Seal Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__SEAL_NUMBERS = 10;

	/**
	 * The feature id for the '<em><b>Trade Parties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__TRADE_PARTIES = 11;

	/**
	 * The feature id for the '<em><b>Filer Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__FILER_REFERENCE_NUMBER = 12;

	/**
	 * The feature id for the '<em><b>Vehicle And Engine Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA = 13;

	/**
	 * The number of structural features of the '<em>Commodity Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Commodity Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.CommodityListImpl <em>Commodity List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.CommodityListImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getCommodityList()
	 * @generated
	 */
	int COMMODITY_LIST = 6;

	/**
	 * The feature id for the '<em><b>Commodity Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_LIST__COMMODITY_DATA = 0;

	/**
	 * The number of structural features of the '<em>Commodity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Commodity List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMODITY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.ContactInfoTypeImpl <em>Contact Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.ContactInfoTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getContactInfoType()
	 * @generated
	 */
	int CONTACT_INFO_TYPE = 7;

	/**
	 * The feature id for the '<em><b>POC Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFO_TYPE__POC_INFO = 0;

	/**
	 * The feature id for the '<em><b>POC Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFO_TYPE__POC_PHONE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Return Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFO_TYPE__RETURN_EMAIL_ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Contact Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contact Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.DocumentDataImpl <em>Document Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.DocumentDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getDocumentData()
	 * @generated
	 */
	int DOCUMENT_DATA = 8;

	/**
	 * The feature id for the '<em><b>Document Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA__DOCUMENT_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Govt Agency List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA__GOVT_AGENCY_LIST = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Optional Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA__OPTIONAL_DATA = 3;

	/**
	 * The feature id for the '<em><b>Vessel Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA__VESSEL_DATA = 4;

	/**
	 * The feature id for the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA__CONTACT_INFO = 5;

	/**
	 * The feature id for the '<em><b>Document Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA__DOCUMENT_OBJECT = 6;

	/**
	 * The number of structural features of the '<em>Document Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl <em>Document Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.DocumentHeaderImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getDocumentHeader()
	 * @generated
	 */
	int DOCUMENT_HEADER = 9;

	/**
	 * The feature id for the '<em><b>Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER__DOCUMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Document Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER__DOCUMENT_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Complete File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER__COMPLETE_FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>File Extension Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER__FILE_EXTENSION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Document Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER__DOCUMENT_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Document Sent Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER__DOCUMENT_SENT_DATE = 5;

	/**
	 * The feature id for the '<em><b>Doc Previously Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER__DOC_PREVIOUSLY_SUBMITTED = 6;

	/**
	 * The number of structural features of the '<em>Document Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.EntrySummaryTypeImpl <em>Entry Summary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.EntrySummaryTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getEntrySummaryType()
	 * @generated
	 */
	int ENTRY_SUMMARY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Entry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SUMMARY_TYPE__ENTRY_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Filer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SUMMARY_TYPE__FILER = 1;

	/**
	 * The feature id for the '<em><b>Entry Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SUMMARY_TYPE__ENTRY_LINE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SUMMARY_TYPE__REFERENCE_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Entry Summary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SUMMARY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entry Summary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SUMMARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.EntryTypeImpl <em>Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.EntryTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Entry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ENTRY_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Filer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__FILER = 1;

	/**
	 * The feature id for the '<em><b>Entry Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ENTRY_LINE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__REFERENCE_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.GovtAgencyListImpl <em>Govt Agency List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.GovtAgencyListImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getGovtAgencyList()
	 * @generated
	 */
	int GOVT_AGENCY_LIST = 12;

	/**
	 * The feature id for the '<em><b>Govt Agency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVT_AGENCY_LIST__GOVT_AGENCY = 0;

	/**
	 * The number of structural features of the '<em>Govt Agency List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVT_AGENCY_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Govt Agency List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOVT_AGENCY_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.InvoiceDataImpl <em>Invoice Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.InvoiceDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getInvoiceData()
	 * @generated
	 */
	int INVOICE_DATA = 13;

	/**
	 * The feature id for the '<em><b>Invoice Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_DATA__INVOICE_NBR = 0;

	/**
	 * The feature id for the '<em><b>Invoice Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_DATA__INVOICE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Invoice Line Item Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_DATA__INVOICE_LINE_ITEM_DATA = 2;

	/**
	 * The number of structural features of the '<em>Invoice Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Invoice Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.InvoiceLineItemDataImpl <em>Invoice Line Item Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.InvoiceLineItemDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getInvoiceLineItemData()
	 * @generated
	 */
	int INVOICE_LINE_ITEM_DATA = 14;

	/**
	 * The feature id for the '<em><b>Invoice Line Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_LINE_ITEM_DATA__INVOICE_LINE_NBR = 0;

	/**
	 * The feature id for the '<em><b>Commodity Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_LINE_ITEM_DATA__COMMODITY_DATA = 1;

	/**
	 * The number of structural features of the '<em>Invoice Line Item Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_LINE_ITEM_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Invoice Line Item Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_LINE_ITEM_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.InvoiceLineItemListImpl <em>Invoice Line Item List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.InvoiceLineItemListImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getInvoiceLineItemList()
	 * @generated
	 */
	int INVOICE_LINE_ITEM_LIST = 15;

	/**
	 * The feature id for the '<em><b>Invoice Line Item Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA = 0;

	/**
	 * The number of structural features of the '<em>Invoice Line Item List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_LINE_ITEM_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Invoice Line Item List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_LINE_ITEM_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.ISFNumberTypeImpl <em>ISF Number Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.ISFNumberTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getISFNumberType()
	 * @generated
	 */
	int ISF_NUMBER_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Filer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISF_NUMBER_TYPE__FILER = 0;

	/**
	 * The feature id for the '<em><b>ISF Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISF_NUMBER_TYPE__ISF_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>ISF Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISF_NUMBER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ISF Number Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISF_NUMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.ITNTypeImpl <em>ITN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.ITNTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getITNType()
	 * @generated
	 */
	int ITN_TYPE = 17;

	/**
	 * The feature id for the '<em><b>ITN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITN_TYPE__ITN = 0;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITN_TYPE__REFERENCE_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>ITN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ITN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.NameValuePairImpl <em>Name Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.NameValuePairImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getNameValuePair()
	 * @generated
	 */
	int NAME_VALUE_PAIR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_PAIR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Name Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Name Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.OptionalDataImpl <em>Optional Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.OptionalDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getOptionalData()
	 * @generated
	 */
	int OPTIONAL_DATA = 19;

	/**
	 * The feature id for the '<em><b>Invoice Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA__INVOICE_DATA = 0;

	/**
	 * The feature id for the '<em><b>Bond Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA__BOND_DATA = 1;

	/**
	 * The feature id for the '<em><b>Packing List Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA__PACKING_LIST_DATA = 2;

	/**
	 * The feature id for the '<em><b>Certificate Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA__CERTIFICATE_DATA = 3;

	/**
	 * The feature id for the '<em><b>Permit Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA__PERMIT_DATA = 4;

	/**
	 * The feature id for the '<em><b>Toxic Substances Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA = 5;

	/**
	 * The feature id for the '<em><b>Commodity List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA__COMMODITY_LIST = 6;

	/**
	 * The feature id for the '<em><b>Additional Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA__ADDITIONAL_DATA = 7;

	/**
	 * The number of structural features of the '<em>Optional Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Optional Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.OtherTransactionTypeImpl <em>Other Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.OtherTransactionTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getOtherTransactionType()
	 * @generated
	 */
	int OTHER_TRANSACTION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Transaction Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_TRANSACTION_TYPE__TRANSACTION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Transaction Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_TRANSACTION_TYPE__TRANSACTION_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Other Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_TRANSACTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Other Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_TRANSACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.PackageIdentifierTypeImpl <em>Package Identifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.PackageIdentifierTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getPackageIdentifierType()
	 * @generated
	 */
	int PACKAGE_IDENTIFIER_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Package Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IDENTIFIER_TYPE__PACKAGE_CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Importer Of Record Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IDENTIFIER_TYPE__IMPORTER_OF_RECORD_NBR = 2;

	/**
	 * The number of structural features of the '<em>Package Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IDENTIFIER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Package Identifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IDENTIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.PackingListDataImpl <em>Packing List Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.PackingListDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getPackingListData()
	 * @generated
	 */
	int PACKING_LIST_DATA = 22;

	/**
	 * The feature id for the '<em><b>Packing List Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKING_LIST_DATA__PACKING_LIST_NBR = 0;

	/**
	 * The feature id for the '<em><b>Invoice Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKING_LIST_DATA__INVOICE_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Purchase Order Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKING_LIST_DATA__PURCHASE_ORDER_NBR = 2;

	/**
	 * The number of structural features of the '<em>Packing List Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKING_LIST_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Packing List Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKING_LIST_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.PermitDataImpl <em>Permit Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.PermitDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getPermitData()
	 * @generated
	 */
	int PERMIT_DATA = 23;

	/**
	 * The feature id for the '<em><b>Permit Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA__PERMIT_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Permit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA__PERMIT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Approval Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA__APPROVAL_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA__STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA__START_DATE = 4;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA__END_DATE = 5;

	/**
	 * The feature id for the '<em><b>Importer Of Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA__IMPORTER_OF_RECORD = 6;

	/**
	 * The number of structural features of the '<em>Permit Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Permit Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMIT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.ToxicSubstancesDataImpl <em>Toxic Substances Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.ToxicSubstancesDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getToxicSubstancesData()
	 * @generated
	 */
	int TOXIC_SUBSTANCES_DATA = 24;

	/**
	 * The feature id for the '<em><b>CAS Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOXIC_SUBSTANCES_DATA__CAS_NBR = 0;

	/**
	 * The feature id for the '<em><b>EPA Registration Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOXIC_SUBSTANCES_DATA__EPA_REGISTRATION_NBR = 1;

	/**
	 * The feature id for the '<em><b>EPA Producer Est Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOXIC_SUBSTANCES_DATA__EPA_PRODUCER_EST_NBR = 2;

	/**
	 * The number of structural features of the '<em>Toxic Substances Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOXIC_SUBSTANCES_DATA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Toxic Substances Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOXIC_SUBSTANCES_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.TradePartiesImpl <em>Trade Parties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.TradePartiesImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getTradeParties()
	 * @generated
	 */
	int TRADE_PARTIES = 25;

	/**
	 * The feature id for the '<em><b>Trade Party</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTIES__TRADE_PARTY = 0;

	/**
	 * The number of structural features of the '<em>Trade Parties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trade Parties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.TradePartyInfoImpl <em>Trade Party Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.TradePartyInfoImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getTradePartyInfo()
	 * @generated
	 */
	int TRADE_PARTY_INFO = 26;

	/**
	 * The feature id for the '<em><b>Trade Party ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTY_INFO__TRADE_PARTY_ID = 0;

	/**
	 * The feature id for the '<em><b>Trade Party Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTY_INFO__TRADE_PARTY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Trade Party Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTY_INFO__TRADE_PARTY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Trade Party Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTY_INFO__TRADE_PARTY_ADDRESS = 3;

	/**
	 * The number of structural features of the '<em>Trade Party Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTY_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trade Party Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_PARTY_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl <em>Trade Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.TradeTransactionImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getTradeTransaction()
	 * @generated
	 */
	int TRADE_TRANSACTION = 27;

	/**
	 * The feature id for the '<em><b>Transaction Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__TRANSACTION_CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Entry Summary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__ENTRY_SUMMARY = 2;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__BILL = 3;

	/**
	 * The feature id for the '<em><b>ISF Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__ISF_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>ITN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__ITN = 5;

	/**
	 * The feature id for the '<em><b>XTN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__XTN = 6;

	/**
	 * The feature id for the '<em><b>FTZ Admission Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__FTZ_ADMISSION_NBR = 7;

	/**
	 * The feature id for the '<em><b>Importer Of Record Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__IMPORTER_OF_RECORD_NBR = 8;

	/**
	 * The feature id for the '<em><b>Other Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION__OTHER_TRANSACTION = 9;

	/**
	 * The number of structural features of the '<em>Trade Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Trade Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl <em>Vehicle And Engine Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getVehicleAndEngineData()
	 * @generated
	 */
	int VEHICLE_AND_ENGINE_DATA = 28;

	/**
	 * The feature id for the '<em><b>VIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__VIN = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURER = 1;

	/**
	 * The feature id for the '<em><b>Vehicle Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__VEHICLE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Vehicle Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__VEHICLE_SERIAL_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Vehicle Manufacture Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Engine Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURER = 5;

	/**
	 * The feature id for the '<em><b>Engine Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__ENGINE_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Engine Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__ENGINE_SERIAL_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Engine Manufacture Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURE_DATE = 8;

	/**
	 * The number of structural features of the '<em>Vehicle And Engine Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Vehicle And Engine Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_AND_ENGINE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl <em>Vessel Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.VesselDataTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getVesselDataType()
	 * @generated
	 */
	int VESSEL_DATA_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Carrier SCAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__CARRIER_SCAC = 0;

	/**
	 * The feature id for the '<em><b>License Permit Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__LICENSE_PERMIT_NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__CERTIFICATE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__ISSUE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__EXPIRATION_DATE = 4;

	/**
	 * The feature id for the '<em><b>Gross Tonnage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__GROSS_TONNAGE = 5;

	/**
	 * The feature id for the '<em><b>Net Tonnage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__NET_TONNAGE = 6;

	/**
	 * The feature id for the '<em><b>Vessel Voyage Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__VESSEL_VOYAGE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Vessel Voyage Segment Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__VESSEL_VOYAGE_SEGMENT_NBR = 8;

	/**
	 * The feature id for the '<em><b>Vessel Inspection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE__VESSEL_INSPECTION_ID = 9;

	/**
	 * The number of structural features of the '<em>Vessel Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Vessel Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VESSEL_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gov.dhs.cbp.dis.impl.XTNTypeImpl <em>XTN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gov.dhs.cbp.dis.impl.XTNTypeImpl
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getXTNType()
	 * @generated
	 */
	int XTN_TYPE = 30;

	/**
	 * The feature id for the '<em><b>XTN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTN_TYPE__XTN = 0;

	/**
	 * The feature id for the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTN_TYPE__REFERENCE_NUMBER = 1;

	/**
	 * The number of structural features of the '<em>XTN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>XTN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Submitted To Port Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getSubmittedToPortCode()
	 * @generated
	 */
	int SUBMITTED_TO_PORT_CODE = 31;


	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.AdditionalData <em>Additional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Data</em>'.
	 * @see gov.dhs.cbp.dis.AdditionalData
	 * @generated
	 */
	EClass getAdditionalData();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.AdditionalData#getNameValuePair <em>Name Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Name Value Pair</em>'.
	 * @see gov.dhs.cbp.dis.AdditionalData#getNameValuePair()
	 * @see #getAdditionalData()
	 * @generated
	 */
	EReference getAdditionalData_NameValuePair();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.BillType <em>Bill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Type</em>'.
	 * @see gov.dhs.cbp.dis.BillType
	 * @generated
	 */
	EClass getBillType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BillType#getSCAC <em>SCAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCAC</em>'.
	 * @see gov.dhs.cbp.dis.BillType#getSCAC()
	 * @see #getBillType()
	 * @generated
	 */
	EAttribute getBillType_SCAC();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BillType#getBillNumber <em>Bill Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Number</em>'.
	 * @see gov.dhs.cbp.dis.BillType#getBillNumber()
	 * @see #getBillType()
	 * @generated
	 */
	EAttribute getBillType_BillNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BillType#getHouseBillNumber <em>House Bill Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>House Bill Number</em>'.
	 * @see gov.dhs.cbp.dis.BillType#getHouseBillNumber()
	 * @see #getBillType()
	 * @generated
	 */
	EAttribute getBillType_HouseBillNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BillType#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see gov.dhs.cbp.dis.BillType#getReferenceNumber()
	 * @see #getBillType()
	 * @generated
	 */
	EAttribute getBillType_ReferenceNumber();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.BondData <em>Bond Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bond Data</em>'.
	 * @see gov.dhs.cbp.dis.BondData
	 * @generated
	 */
	EClass getBondData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BondData#getBondName <em>Bond Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bond Name</em>'.
	 * @see gov.dhs.cbp.dis.BondData#getBondName()
	 * @see #getBondData()
	 * @generated
	 */
	EAttribute getBondData_BondName();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BondData#getBondNumber <em>Bond Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bond Number</em>'.
	 * @see gov.dhs.cbp.dis.BondData#getBondNumber()
	 * @see #getBondData()
	 * @generated
	 */
	EAttribute getBondData_BondNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BondData#getBondType <em>Bond Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bond Type</em>'.
	 * @see gov.dhs.cbp.dis.BondData#getBondType()
	 * @see #getBondData()
	 * @generated
	 */
	EAttribute getBondData_BondType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BondData#getSuretyCode <em>Surety Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surety Code</em>'.
	 * @see gov.dhs.cbp.dis.BondData#getSuretyCode()
	 * @see #getBondData()
	 * @generated
	 */
	EAttribute getBondData_SuretyCode();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BondData#getAgentIDNbr <em>Agent ID Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent ID Nbr</em>'.
	 * @see gov.dhs.cbp.dis.BondData#getAgentIDNbr()
	 * @see #getBondData()
	 * @generated
	 */
	EAttribute getBondData_AgentIDNbr();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BondData#getFiler <em>Filer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filer</em>'.
	 * @see gov.dhs.cbp.dis.BondData#getFiler()
	 * @see #getBondData()
	 * @generated
	 */
	EAttribute getBondData_Filer();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.BondData#getBondAmount <em>Bond Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bond Amount</em>'.
	 * @see gov.dhs.cbp.dis.BondData#getBondAmount()
	 * @see #getBondData()
	 * @generated
	 */
	EAttribute getBondData_BondAmount();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.CBPRequest <em>CBP Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CBP Request</em>'.
	 * @see gov.dhs.cbp.dis.CBPRequest
	 * @generated
	 */
	EClass getCBPRequest();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestID <em>CBP Request ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CBP Request ID</em>'.
	 * @see gov.dhs.cbp.dis.CBPRequest#getCBPRequestID()
	 * @see #getCBPRequest()
	 * @generated
	 */
	EAttribute getCBPRequest_CBPRequestID();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestType <em>CBP Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CBP Request Type</em>'.
	 * @see gov.dhs.cbp.dis.CBPRequest#getCBPRequestType()
	 * @see #getCBPRequest()
	 * @generated
	 */
	EAttribute getCBPRequest_CBPRequestType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestDate <em>CBP Request Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CBP Request Date</em>'.
	 * @see gov.dhs.cbp.dis.CBPRequest#getCBPRequestDate()
	 * @see #getCBPRequest()
	 * @generated
	 */
	EAttribute getCBPRequest_CBPRequestDate();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.CertificateData <em>Certificate Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate Data</em>'.
	 * @see gov.dhs.cbp.dis.CertificateData
	 * @generated
	 */
	EClass getCertificateData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CertificateData#getCertificateNumber <em>Certificate Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Number</em>'.
	 * @see gov.dhs.cbp.dis.CertificateData#getCertificateNumber()
	 * @see #getCertificateData()
	 * @generated
	 */
	EAttribute getCertificateData_CertificateNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CertificateData#getCertificateType <em>Certificate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Type</em>'.
	 * @see gov.dhs.cbp.dis.CertificateData#getCertificateType()
	 * @see #getCertificateData()
	 * @generated
	 */
	EAttribute getCertificateData_CertificateType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CertificateData#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see gov.dhs.cbp.dis.CertificateData#getStatement()
	 * @see #getCertificateData()
	 * @generated
	 */
	EAttribute getCertificateData_Statement();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CertificateData#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see gov.dhs.cbp.dis.CertificateData#getExpirationDate()
	 * @see #getCertificateData()
	 * @generated
	 */
	EAttribute getCertificateData_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CertificateData#getImporterOfRecord <em>Importer Of Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importer Of Record</em>'.
	 * @see gov.dhs.cbp.dis.CertificateData#getImporterOfRecord()
	 * @see #getCertificateData()
	 * @generated
	 */
	EAttribute getCertificateData_ImporterOfRecord();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CertificateData#getInspectionLocation <em>Inspection Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inspection Location</em>'.
	 * @see gov.dhs.cbp.dis.CertificateData#getInspectionLocation()
	 * @see #getCertificateData()
	 * @generated
	 */
	EAttribute getCertificateData_InspectionLocation();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.CommodityData <em>Commodity Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commodity Data</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData
	 * @generated
	 */
	EClass getCommodityData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getEntryLineNumber <em>Entry Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Line Number</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getEntryLineNumber()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_EntryLineNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getHTSNumber <em>HTS Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HTS Number</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getHTSNumber()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_HTSNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getCommodityDescription <em>Commodity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commodity Description</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getCommodityDescription()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_CommodityDescription();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getCountryOfOrigin <em>Country Of Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Of Origin</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getCountryOfOrigin()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_CountryOfOrigin();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getContainerNbr <em>Container Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Nbr</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getContainerNbr()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_ContainerNbr();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getArrivalDate <em>Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Date</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getArrivalDate()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_ArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getPortOfLading <em>Port Of Lading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Of Lading</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getPortOfLading()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_PortOfLading();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getPortOfUnlading <em>Port Of Unlading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Of Unlading</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getPortOfUnlading()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_PortOfUnlading();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getPortOfEntry <em>Port Of Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Of Entry</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getPortOfEntry()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_PortOfEntry();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getPPQSignature <em>PPQ Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PPQ Signature</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getPPQSignature()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_PPQSignature();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getSealNumbers <em>Seal Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seal Numbers</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getSealNumbers()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_SealNumbers();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.CommodityData#getTradeParties <em>Trade Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trade Parties</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getTradeParties()
	 * @see #getCommodityData()
	 * @generated
	 */
	EReference getCommodityData_TradeParties();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.CommodityData#getFilerReferenceNumber <em>Filer Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filer Reference Number</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getFilerReferenceNumber()
	 * @see #getCommodityData()
	 * @generated
	 */
	EAttribute getCommodityData_FilerReferenceNumber();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.CommodityData#getVehicleAndEngineData <em>Vehicle And Engine Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vehicle And Engine Data</em>'.
	 * @see gov.dhs.cbp.dis.CommodityData#getVehicleAndEngineData()
	 * @see #getCommodityData()
	 * @generated
	 */
	EReference getCommodityData_VehicleAndEngineData();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.CommodityList <em>Commodity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commodity List</em>'.
	 * @see gov.dhs.cbp.dis.CommodityList
	 * @generated
	 */
	EClass getCommodityList();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.CommodityList#getCommodityData <em>Commodity Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commodity Data</em>'.
	 * @see gov.dhs.cbp.dis.CommodityList#getCommodityData()
	 * @see #getCommodityList()
	 * @generated
	 */
	EReference getCommodityList_CommodityData();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.ContactInfoType <em>Contact Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Info Type</em>'.
	 * @see gov.dhs.cbp.dis.ContactInfoType
	 * @generated
	 */
	EClass getContactInfoType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ContactInfoType#getPOCInfo <em>POC Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POC Info</em>'.
	 * @see gov.dhs.cbp.dis.ContactInfoType#getPOCInfo()
	 * @see #getContactInfoType()
	 * @generated
	 */
	EAttribute getContactInfoType_POCInfo();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ContactInfoType#getPOCPhoneNumber <em>POC Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>POC Phone Number</em>'.
	 * @see gov.dhs.cbp.dis.ContactInfoType#getPOCPhoneNumber()
	 * @see #getContactInfoType()
	 * @generated
	 */
	EAttribute getContactInfoType_POCPhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ContactInfoType#getReturnEmailAddress <em>Return Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Email Address</em>'.
	 * @see gov.dhs.cbp.dis.ContactInfoType#getReturnEmailAddress()
	 * @see #getContactInfoType()
	 * @generated
	 */
	EAttribute getContactInfoType_ReturnEmailAddress();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.DocumentData <em>Document Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Data</em>'.
	 * @see gov.dhs.cbp.dis.DocumentData
	 * @generated
	 */
	EClass getDocumentData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.DocumentData#getDocumentHeader <em>Document Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Header</em>'.
	 * @see gov.dhs.cbp.dis.DocumentData#getDocumentHeader()
	 * @see #getDocumentData()
	 * @generated
	 */
	EReference getDocumentData_DocumentHeader();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.DocumentData#getGovtAgencyList <em>Govt Agency List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Govt Agency List</em>'.
	 * @see gov.dhs.cbp.dis.DocumentData#getGovtAgencyList()
	 * @see #getDocumentData()
	 * @generated
	 */
	EReference getDocumentData_GovtAgencyList();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentData#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see gov.dhs.cbp.dis.DocumentData#getComment()
	 * @see #getDocumentData()
	 * @generated
	 */
	EAttribute getDocumentData_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.DocumentData#getOptionalData <em>Optional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optional Data</em>'.
	 * @see gov.dhs.cbp.dis.DocumentData#getOptionalData()
	 * @see #getDocumentData()
	 * @generated
	 */
	EReference getDocumentData_OptionalData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.DocumentData#getVesselData <em>Vessel Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vessel Data</em>'.
	 * @see gov.dhs.cbp.dis.DocumentData#getVesselData()
	 * @see #getDocumentData()
	 * @generated
	 */
	EReference getDocumentData_VesselData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.DocumentData#getContactInfo <em>Contact Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact Info</em>'.
	 * @see gov.dhs.cbp.dis.DocumentData#getContactInfo()
	 * @see #getDocumentData()
	 * @generated
	 */
	EReference getDocumentData_ContactInfo();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentData#getDocumentObject <em>Document Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Object</em>'.
	 * @see gov.dhs.cbp.dis.DocumentData#getDocumentObject()
	 * @see #getDocumentData()
	 * @generated
	 */
	EAttribute getDocumentData_DocumentObject();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.DocumentHeader <em>Document Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Header</em>'.
	 * @see gov.dhs.cbp.dis.DocumentHeader
	 * @generated
	 */
	EClass getDocumentHeader();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentID <em>Document ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document ID</em>'.
	 * @see gov.dhs.cbp.dis.DocumentHeader#getDocumentID()
	 * @see #getDocumentHeader()
	 * @generated
	 */
	EAttribute getDocumentHeader_DocumentID();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentLabel <em>Document Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Label</em>'.
	 * @see gov.dhs.cbp.dis.DocumentHeader#getDocumentLabel()
	 * @see #getDocumentHeader()
	 * @generated
	 */
	EAttribute getDocumentHeader_DocumentLabel();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentHeader#getCompleteFileName <em>Complete File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete File Name</em>'.
	 * @see gov.dhs.cbp.dis.DocumentHeader#getCompleteFileName()
	 * @see #getDocumentHeader()
	 * @generated
	 */
	EAttribute getDocumentHeader_CompleteFileName();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentHeader#getFileExtensionType <em>File Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension Type</em>'.
	 * @see gov.dhs.cbp.dis.DocumentHeader#getFileExtensionType()
	 * @see #getDocumentHeader()
	 * @generated
	 */
	EAttribute getDocumentHeader_FileExtensionType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentDescription <em>Document Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Description</em>'.
	 * @see gov.dhs.cbp.dis.DocumentHeader#getDocumentDescription()
	 * @see #getDocumentHeader()
	 * @generated
	 */
	EAttribute getDocumentHeader_DocumentDescription();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentHeader#getDocumentSentDate <em>Document Sent Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Sent Date</em>'.
	 * @see gov.dhs.cbp.dis.DocumentHeader#getDocumentSentDate()
	 * @see #getDocumentHeader()
	 * @generated
	 */
	EAttribute getDocumentHeader_DocumentSentDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.DocumentHeader#getDocPreviouslySubmitted <em>Doc Previously Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doc Previously Submitted</em>'.
	 * @see gov.dhs.cbp.dis.DocumentHeader#getDocPreviouslySubmitted()
	 * @see #getDocumentHeader()
	 * @generated
	 */
	EAttribute getDocumentHeader_DocPreviouslySubmitted();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.EntrySummaryType <em>Entry Summary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Summary Type</em>'.
	 * @see gov.dhs.cbp.dis.EntrySummaryType
	 * @generated
	 */
	EClass getEntrySummaryType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.EntrySummaryType#getEntryNumber <em>Entry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Number</em>'.
	 * @see gov.dhs.cbp.dis.EntrySummaryType#getEntryNumber()
	 * @see #getEntrySummaryType()
	 * @generated
	 */
	EAttribute getEntrySummaryType_EntryNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.EntrySummaryType#getFiler <em>Filer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filer</em>'.
	 * @see gov.dhs.cbp.dis.EntrySummaryType#getFiler()
	 * @see #getEntrySummaryType()
	 * @generated
	 */
	EAttribute getEntrySummaryType_Filer();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.EntrySummaryType#getEntryLineNumber <em>Entry Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Line Number</em>'.
	 * @see gov.dhs.cbp.dis.EntrySummaryType#getEntryLineNumber()
	 * @see #getEntrySummaryType()
	 * @generated
	 */
	EAttribute getEntrySummaryType_EntryLineNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.EntrySummaryType#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see gov.dhs.cbp.dis.EntrySummaryType#getReferenceNumber()
	 * @see #getEntrySummaryType()
	 * @generated
	 */
	EAttribute getEntrySummaryType_ReferenceNumber();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type</em>'.
	 * @see gov.dhs.cbp.dis.EntryType
	 * @generated
	 */
	EClass getEntryType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.EntryType#getEntryNumber <em>Entry Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Number</em>'.
	 * @see gov.dhs.cbp.dis.EntryType#getEntryNumber()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_EntryNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.EntryType#getFiler <em>Filer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filer</em>'.
	 * @see gov.dhs.cbp.dis.EntryType#getFiler()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Filer();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.EntryType#getEntryLineNumber <em>Entry Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Line Number</em>'.
	 * @see gov.dhs.cbp.dis.EntryType#getEntryLineNumber()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_EntryLineNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.EntryType#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see gov.dhs.cbp.dis.EntryType#getReferenceNumber()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_ReferenceNumber();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.GovtAgencyList <em>Govt Agency List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Govt Agency List</em>'.
	 * @see gov.dhs.cbp.dis.GovtAgencyList
	 * @generated
	 */
	EClass getGovtAgencyList();

	/**
	 * Returns the meta object for the attribute list '{@link gov.dhs.cbp.dis.GovtAgencyList#getGovtAgency <em>Govt Agency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Govt Agency</em>'.
	 * @see gov.dhs.cbp.dis.GovtAgencyList#getGovtAgency()
	 * @see #getGovtAgencyList()
	 * @generated
	 */
	EAttribute getGovtAgencyList_GovtAgency();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.InvoiceData <em>Invoice Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice Data</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceData
	 * @generated
	 */
	EClass getInvoiceData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.InvoiceData#getInvoiceNbr <em>Invoice Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Nbr</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceData#getInvoiceNbr()
	 * @see #getInvoiceData()
	 * @generated
	 */
	EAttribute getInvoiceData_InvoiceNbr();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.InvoiceData#getInvoiceType <em>Invoice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Type</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceData#getInvoiceType()
	 * @see #getInvoiceData()
	 * @generated
	 */
	EAttribute getInvoiceData_InvoiceType();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.InvoiceData#getInvoiceLineItemData <em>Invoice Line Item Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoice Line Item Data</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceData#getInvoiceLineItemData()
	 * @see #getInvoiceData()
	 * @generated
	 */
	EReference getInvoiceData_InvoiceLineItemData();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.InvoiceLineItemData <em>Invoice Line Item Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice Line Item Data</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceLineItemData
	 * @generated
	 */
	EClass getInvoiceLineItemData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.InvoiceLineItemData#getInvoiceLineNbr <em>Invoice Line Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Line Nbr</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceLineItemData#getInvoiceLineNbr()
	 * @see #getInvoiceLineItemData()
	 * @generated
	 */
	EAttribute getInvoiceLineItemData_InvoiceLineNbr();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.InvoiceLineItemData#getCommodityData <em>Commodity Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Commodity Data</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceLineItemData#getCommodityData()
	 * @see #getInvoiceLineItemData()
	 * @generated
	 */
	EReference getInvoiceLineItemData_CommodityData();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.InvoiceLineItemList <em>Invoice Line Item List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice Line Item List</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceLineItemList
	 * @generated
	 */
	EClass getInvoiceLineItemList();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.InvoiceLineItemList#getInvoiceLineItemData <em>Invoice Line Item Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invoice Line Item Data</em>'.
	 * @see gov.dhs.cbp.dis.InvoiceLineItemList#getInvoiceLineItemData()
	 * @see #getInvoiceLineItemList()
	 * @generated
	 */
	EReference getInvoiceLineItemList_InvoiceLineItemData();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.ISFNumberType <em>ISF Number Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISF Number Type</em>'.
	 * @see gov.dhs.cbp.dis.ISFNumberType
	 * @generated
	 */
	EClass getISFNumberType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ISFNumberType#getFiler <em>Filer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filer</em>'.
	 * @see gov.dhs.cbp.dis.ISFNumberType#getFiler()
	 * @see #getISFNumberType()
	 * @generated
	 */
	EAttribute getISFNumberType_Filer();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ISFNumberType#getISFNumber <em>ISF Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ISF Number</em>'.
	 * @see gov.dhs.cbp.dis.ISFNumberType#getISFNumber()
	 * @see #getISFNumberType()
	 * @generated
	 */
	EAttribute getISFNumberType_ISFNumber();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.ITNType <em>ITN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITN Type</em>'.
	 * @see gov.dhs.cbp.dis.ITNType
	 * @generated
	 */
	EClass getITNType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ITNType#getITN <em>ITN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ITN</em>'.
	 * @see gov.dhs.cbp.dis.ITNType#getITN()
	 * @see #getITNType()
	 * @generated
	 */
	EAttribute getITNType_ITN();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ITNType#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see gov.dhs.cbp.dis.ITNType#getReferenceNumber()
	 * @see #getITNType()
	 * @generated
	 */
	EAttribute getITNType_ReferenceNumber();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.NameValuePair <em>Name Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Value Pair</em>'.
	 * @see gov.dhs.cbp.dis.NameValuePair
	 * @generated
	 */
	EClass getNameValuePair();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.NameValuePair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gov.dhs.cbp.dis.NameValuePair#getName()
	 * @see #getNameValuePair()
	 * @generated
	 */
	EAttribute getNameValuePair_Name();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.NameValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gov.dhs.cbp.dis.NameValuePair#getValue()
	 * @see #getNameValuePair()
	 * @generated
	 */
	EAttribute getNameValuePair_Value();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.OptionalData <em>Optional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Data</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData
	 * @generated
	 */
	EClass getOptionalData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.OptionalData#getInvoiceData <em>Invoice Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoice Data</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData#getInvoiceData()
	 * @see #getOptionalData()
	 * @generated
	 */
	EReference getOptionalData_InvoiceData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.OptionalData#getBondData <em>Bond Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bond Data</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData#getBondData()
	 * @see #getOptionalData()
	 * @generated
	 */
	EReference getOptionalData_BondData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.OptionalData#getPackingListData <em>Packing List Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packing List Data</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData#getPackingListData()
	 * @see #getOptionalData()
	 * @generated
	 */
	EReference getOptionalData_PackingListData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.OptionalData#getCertificateData <em>Certificate Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Certificate Data</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData#getCertificateData()
	 * @see #getOptionalData()
	 * @generated
	 */
	EReference getOptionalData_CertificateData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.OptionalData#getPermitData <em>Permit Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permit Data</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData#getPermitData()
	 * @see #getOptionalData()
	 * @generated
	 */
	EReference getOptionalData_PermitData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.OptionalData#getToxicSubstancesData <em>Toxic Substances Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Toxic Substances Data</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData#getToxicSubstancesData()
	 * @see #getOptionalData()
	 * @generated
	 */
	EReference getOptionalData_ToxicSubstancesData();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.OptionalData#getCommodityList <em>Commodity List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Commodity List</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData#getCommodityList()
	 * @see #getOptionalData()
	 * @generated
	 */
	EReference getOptionalData_CommodityList();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.OptionalData#getAdditionalData <em>Additional Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Data</em>'.
	 * @see gov.dhs.cbp.dis.OptionalData#getAdditionalData()
	 * @see #getOptionalData()
	 * @generated
	 */
	EReference getOptionalData_AdditionalData();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.OtherTransactionType <em>Other Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Transaction Type</em>'.
	 * @see gov.dhs.cbp.dis.OtherTransactionType
	 * @generated
	 */
	EClass getOtherTransactionType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.OtherTransactionType#getTransactionName <em>Transaction Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Name</em>'.
	 * @see gov.dhs.cbp.dis.OtherTransactionType#getTransactionName()
	 * @see #getOtherTransactionType()
	 * @generated
	 */
	EAttribute getOtherTransactionType_TransactionName();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.OtherTransactionType#getTransactionNumber <em>Transaction Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Number</em>'.
	 * @see gov.dhs.cbp.dis.OtherTransactionType#getTransactionNumber()
	 * @see #getOtherTransactionType()
	 * @generated
	 */
	EAttribute getOtherTransactionType_TransactionNumber();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.PackageIdentifierType <em>Package Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Identifier Type</em>'.
	 * @see gov.dhs.cbp.dis.PackageIdentifierType
	 * @generated
	 */
	EClass getPackageIdentifierType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PackageIdentifierType#getPackageCategory <em>Package Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Category</em>'.
	 * @see gov.dhs.cbp.dis.PackageIdentifierType#getPackageCategory()
	 * @see #getPackageIdentifierType()
	 * @generated
	 */
	EAttribute getPackageIdentifierType_PackageCategory();

	/**
	 * Returns the meta object for the containment reference '{@link gov.dhs.cbp.dis.PackageIdentifierType#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Name</em>'.
	 * @see gov.dhs.cbp.dis.PackageIdentifierType#getPackageName()
	 * @see #getPackageIdentifierType()
	 * @generated
	 */
	EReference getPackageIdentifierType_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PackageIdentifierType#getImporterOfRecordNbr <em>Importer Of Record Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importer Of Record Nbr</em>'.
	 * @see gov.dhs.cbp.dis.PackageIdentifierType#getImporterOfRecordNbr()
	 * @see #getPackageIdentifierType()
	 * @generated
	 */
	EAttribute getPackageIdentifierType_ImporterOfRecordNbr();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.PackingListData <em>Packing List Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packing List Data</em>'.
	 * @see gov.dhs.cbp.dis.PackingListData
	 * @generated
	 */
	EClass getPackingListData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PackingListData#getPackingListNbr <em>Packing List Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packing List Nbr</em>'.
	 * @see gov.dhs.cbp.dis.PackingListData#getPackingListNbr()
	 * @see #getPackingListData()
	 * @generated
	 */
	EAttribute getPackingListData_PackingListNbr();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PackingListData#getInvoiceNumber <em>Invoice Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Number</em>'.
	 * @see gov.dhs.cbp.dis.PackingListData#getInvoiceNumber()
	 * @see #getPackingListData()
	 * @generated
	 */
	EAttribute getPackingListData_InvoiceNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PackingListData#getPurchaseOrderNbr <em>Purchase Order Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Order Nbr</em>'.
	 * @see gov.dhs.cbp.dis.PackingListData#getPurchaseOrderNbr()
	 * @see #getPackingListData()
	 * @generated
	 */
	EAttribute getPackingListData_PurchaseOrderNbr();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.PermitData <em>Permit Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permit Data</em>'.
	 * @see gov.dhs.cbp.dis.PermitData
	 * @generated
	 */
	EClass getPermitData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PermitData#getPermitNumber <em>Permit Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permit Number</em>'.
	 * @see gov.dhs.cbp.dis.PermitData#getPermitNumber()
	 * @see #getPermitData()
	 * @generated
	 */
	EAttribute getPermitData_PermitNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PermitData#getPermitType <em>Permit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permit Type</em>'.
	 * @see gov.dhs.cbp.dis.PermitData#getPermitType()
	 * @see #getPermitData()
	 * @generated
	 */
	EAttribute getPermitData_PermitType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PermitData#getApprovalNumber <em>Approval Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Number</em>'.
	 * @see gov.dhs.cbp.dis.PermitData#getApprovalNumber()
	 * @see #getPermitData()
	 * @generated
	 */
	EAttribute getPermitData_ApprovalNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PermitData#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see gov.dhs.cbp.dis.PermitData#getStatement()
	 * @see #getPermitData()
	 * @generated
	 */
	EAttribute getPermitData_Statement();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PermitData#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see gov.dhs.cbp.dis.PermitData#getStartDate()
	 * @see #getPermitData()
	 * @generated
	 */
	EAttribute getPermitData_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PermitData#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see gov.dhs.cbp.dis.PermitData#getEndDate()
	 * @see #getPermitData()
	 * @generated
	 */
	EAttribute getPermitData_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.PermitData#getImporterOfRecord <em>Importer Of Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importer Of Record</em>'.
	 * @see gov.dhs.cbp.dis.PermitData#getImporterOfRecord()
	 * @see #getPermitData()
	 * @generated
	 */
	EAttribute getPermitData_ImporterOfRecord();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.ToxicSubstancesData <em>Toxic Substances Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toxic Substances Data</em>'.
	 * @see gov.dhs.cbp.dis.ToxicSubstancesData
	 * @generated
	 */
	EClass getToxicSubstancesData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ToxicSubstancesData#getCASNbr <em>CAS Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CAS Nbr</em>'.
	 * @see gov.dhs.cbp.dis.ToxicSubstancesData#getCASNbr()
	 * @see #getToxicSubstancesData()
	 * @generated
	 */
	EAttribute getToxicSubstancesData_CASNbr();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ToxicSubstancesData#getEPARegistrationNbr <em>EPA Registration Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EPA Registration Nbr</em>'.
	 * @see gov.dhs.cbp.dis.ToxicSubstancesData#getEPARegistrationNbr()
	 * @see #getToxicSubstancesData()
	 * @generated
	 */
	EAttribute getToxicSubstancesData_EPARegistrationNbr();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.ToxicSubstancesData#getEPAProducerEstNbr <em>EPA Producer Est Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EPA Producer Est Nbr</em>'.
	 * @see gov.dhs.cbp.dis.ToxicSubstancesData#getEPAProducerEstNbr()
	 * @see #getToxicSubstancesData()
	 * @generated
	 */
	EAttribute getToxicSubstancesData_EPAProducerEstNbr();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.TradeParties <em>Trade Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade Parties</em>'.
	 * @see gov.dhs.cbp.dis.TradeParties
	 * @generated
	 */
	EClass getTradeParties();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.TradeParties#getTradeParty <em>Trade Party</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trade Party</em>'.
	 * @see gov.dhs.cbp.dis.TradeParties#getTradeParty()
	 * @see #getTradeParties()
	 * @generated
	 */
	EReference getTradeParties_TradeParty();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.TradePartyInfo <em>Trade Party Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade Party Info</em>'.
	 * @see gov.dhs.cbp.dis.TradePartyInfo
	 * @generated
	 */
	EClass getTradePartyInfo();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyID <em>Trade Party ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Party ID</em>'.
	 * @see gov.dhs.cbp.dis.TradePartyInfo#getTradePartyID()
	 * @see #getTradePartyInfo()
	 * @generated
	 */
	EAttribute getTradePartyInfo_TradePartyID();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyType <em>Trade Party Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Party Type</em>'.
	 * @see gov.dhs.cbp.dis.TradePartyInfo#getTradePartyType()
	 * @see #getTradePartyInfo()
	 * @generated
	 */
	EAttribute getTradePartyInfo_TradePartyType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyName <em>Trade Party Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Party Name</em>'.
	 * @see gov.dhs.cbp.dis.TradePartyInfo#getTradePartyName()
	 * @see #getTradePartyInfo()
	 * @generated
	 */
	EAttribute getTradePartyInfo_TradePartyName();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyAddress <em>Trade Party Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trade Party Address</em>'.
	 * @see gov.dhs.cbp.dis.TradePartyInfo#getTradePartyAddress()
	 * @see #getTradePartyInfo()
	 * @generated
	 */
	EAttribute getTradePartyInfo_TradePartyAddress();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.TradeTransaction <em>Trade Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade Transaction</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction
	 * @generated
	 */
	EClass getTradeTransaction();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.TradeTransaction#getTransactionCategory <em>Transaction Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Category</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getTransactionCategory()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EAttribute getTradeTransaction_TransactionCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.TradeTransaction#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getEntry()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EReference getTradeTransaction_Entry();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.TradeTransaction#getEntrySummary <em>Entry Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Summary</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getEntrySummary()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EReference getTradeTransaction_EntrySummary();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.TradeTransaction#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bill</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getBill()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EReference getTradeTransaction_Bill();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.TradeTransaction#getISFNumber <em>ISF Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ISF Number</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getISFNumber()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EReference getTradeTransaction_ISFNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.TradeTransaction#getITN <em>ITN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ITN</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getITN()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EReference getTradeTransaction_ITN();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.TradeTransaction#getXTN <em>XTN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>XTN</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getXTN()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EReference getTradeTransaction_XTN();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.TradeTransaction#getFTZAdmissionNbr <em>FTZ Admission Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FTZ Admission Nbr</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getFTZAdmissionNbr()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EAttribute getTradeTransaction_FTZAdmissionNbr();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.TradeTransaction#getImporterOfRecordNbr <em>Importer Of Record Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importer Of Record Nbr</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getImporterOfRecordNbr()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EAttribute getTradeTransaction_ImporterOfRecordNbr();

	/**
	 * Returns the meta object for the containment reference list '{@link gov.dhs.cbp.dis.TradeTransaction#getOtherTransaction <em>Other Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Transaction</em>'.
	 * @see gov.dhs.cbp.dis.TradeTransaction#getOtherTransaction()
	 * @see #getTradeTransaction()
	 * @generated
	 */
	EReference getTradeTransaction_OtherTransaction();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.VehicleAndEngineData <em>Vehicle And Engine Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle And Engine Data</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData
	 * @generated
	 */
	EClass getVehicleAndEngineData();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVIN <em>VIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VIN</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getVIN()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_VIN();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleManufacturer <em>Vehicle Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Manufacturer</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleManufacturer()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_VehicleManufacturer();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleModel <em>Vehicle Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Model</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleModel()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_VehicleModel();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleSerialNumber <em>Vehicle Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Serial Number</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleSerialNumber()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_VehicleSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleManufactureDate <em>Vehicle Manufacture Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Manufacture Date</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleManufactureDate()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_VehicleManufactureDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineManufacturer <em>Engine Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Manufacturer</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getEngineManufacturer()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_EngineManufacturer();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineModel <em>Engine Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Model</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getEngineModel()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_EngineModel();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineSerialNumber <em>Engine Serial Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Serial Number</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getEngineSerialNumber()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_EngineSerialNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineManufactureDate <em>Engine Manufacture Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Engine Manufacture Date</em>'.
	 * @see gov.dhs.cbp.dis.VehicleAndEngineData#getEngineManufactureDate()
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	EAttribute getVehicleAndEngineData_EngineManufactureDate();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.VesselDataType <em>Vessel Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vessel Data Type</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType
	 * @generated
	 */
	EClass getVesselDataType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getCarrierSCAC <em>Carrier SCAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier SCAC</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getCarrierSCAC()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_CarrierSCAC();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getLicensePermitNumber <em>License Permit Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Permit Number</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getLicensePermitNumber()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_LicensePermitNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getCertificateNumber <em>Certificate Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Number</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getCertificateNumber()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_CertificateNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getIssueDate()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_IssueDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getExpirationDate()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_ExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getGrossTonnage <em>Gross Tonnage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gross Tonnage</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getGrossTonnage()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_GrossTonnage();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getNetTonnage <em>Net Tonnage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net Tonnage</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getNetTonnage()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_NetTonnage();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getVesselVoyageNumber <em>Vessel Voyage Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vessel Voyage Number</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getVesselVoyageNumber()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_VesselVoyageNumber();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getVesselVoyageSegmentNbr <em>Vessel Voyage Segment Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vessel Voyage Segment Nbr</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getVesselVoyageSegmentNbr()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_VesselVoyageSegmentNbr();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.VesselDataType#getVesselInspectionID <em>Vessel Inspection ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vessel Inspection ID</em>'.
	 * @see gov.dhs.cbp.dis.VesselDataType#getVesselInspectionID()
	 * @see #getVesselDataType()
	 * @generated
	 */
	EAttribute getVesselDataType_VesselInspectionID();

	/**
	 * Returns the meta object for class '{@link gov.dhs.cbp.dis.XTNType <em>XTN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTN Type</em>'.
	 * @see gov.dhs.cbp.dis.XTNType
	 * @generated
	 */
	EClass getXTNType();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.XTNType#getXTN <em>XTN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XTN</em>'.
	 * @see gov.dhs.cbp.dis.XTNType#getXTN()
	 * @see #getXTNType()
	 * @generated
	 */
	EAttribute getXTNType_XTN();

	/**
	 * Returns the meta object for the attribute '{@link gov.dhs.cbp.dis.XTNType#getReferenceNumber <em>Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Number</em>'.
	 * @see gov.dhs.cbp.dis.XTNType#getReferenceNumber()
	 * @see #getXTNType()
	 * @generated
	 */
	EAttribute getXTNType_ReferenceNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Submitted To Port Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Schedule D (Domestic) code for the U.S Port to which this document is being submitted
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Submitted To Port Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SubmittedToPortCode' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getSubmittedToPortCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DisFactory getDisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.AdditionalDataImpl <em>Additional Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.AdditionalDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getAdditionalData()
		 * @generated
		 */
		EClass ADDITIONAL_DATA = eINSTANCE.getAdditionalData();

		/**
		 * The meta object literal for the '<em><b>Name Value Pair</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DATA__NAME_VALUE_PAIR = eINSTANCE.getAdditionalData_NameValuePair();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.BillTypeImpl <em>Bill Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.BillTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getBillType()
		 * @generated
		 */
		EClass BILL_TYPE = eINSTANCE.getBillType();

		/**
		 * The meta object literal for the '<em><b>SCAC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_TYPE__SCAC = eINSTANCE.getBillType_SCAC();

		/**
		 * The meta object literal for the '<em><b>Bill Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_TYPE__BILL_NUMBER = eINSTANCE.getBillType_BillNumber();

		/**
		 * The meta object literal for the '<em><b>House Bill Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_TYPE__HOUSE_BILL_NUMBER = eINSTANCE.getBillType_HouseBillNumber();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL_TYPE__REFERENCE_NUMBER = eINSTANCE.getBillType_ReferenceNumber();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.BondDataImpl <em>Bond Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.BondDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getBondData()
		 * @generated
		 */
		EClass BOND_DATA = eINSTANCE.getBondData();

		/**
		 * The meta object literal for the '<em><b>Bond Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND_DATA__BOND_NAME = eINSTANCE.getBondData_BondName();

		/**
		 * The meta object literal for the '<em><b>Bond Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND_DATA__BOND_NUMBER = eINSTANCE.getBondData_BondNumber();

		/**
		 * The meta object literal for the '<em><b>Bond Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND_DATA__BOND_TYPE = eINSTANCE.getBondData_BondType();

		/**
		 * The meta object literal for the '<em><b>Surety Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND_DATA__SURETY_CODE = eINSTANCE.getBondData_SuretyCode();

		/**
		 * The meta object literal for the '<em><b>Agent ID Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND_DATA__AGENT_ID_NBR = eINSTANCE.getBondData_AgentIDNbr();

		/**
		 * The meta object literal for the '<em><b>Filer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND_DATA__FILER = eINSTANCE.getBondData_Filer();

		/**
		 * The meta object literal for the '<em><b>Bond Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOND_DATA__BOND_AMOUNT = eINSTANCE.getBondData_BondAmount();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.CBPRequestImpl <em>CBP Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.CBPRequestImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getCBPRequest()
		 * @generated
		 */
		EClass CBP_REQUEST = eINSTANCE.getCBPRequest();

		/**
		 * The meta object literal for the '<em><b>CBP Request ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CBP_REQUEST__CBP_REQUEST_ID = eINSTANCE.getCBPRequest_CBPRequestID();

		/**
		 * The meta object literal for the '<em><b>CBP Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CBP_REQUEST__CBP_REQUEST_TYPE = eINSTANCE.getCBPRequest_CBPRequestType();

		/**
		 * The meta object literal for the '<em><b>CBP Request Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CBP_REQUEST__CBP_REQUEST_DATE = eINSTANCE.getCBPRequest_CBPRequestDate();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.CertificateDataImpl <em>Certificate Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.CertificateDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getCertificateData()
		 * @generated
		 */
		EClass CERTIFICATE_DATA = eINSTANCE.getCertificateData();

		/**
		 * The meta object literal for the '<em><b>Certificate Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_DATA__CERTIFICATE_NUMBER = eINSTANCE.getCertificateData_CertificateNumber();

		/**
		 * The meta object literal for the '<em><b>Certificate Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_DATA__CERTIFICATE_TYPE = eINSTANCE.getCertificateData_CertificateType();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_DATA__STATEMENT = eINSTANCE.getCertificateData_Statement();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_DATA__EXPIRATION_DATE = eINSTANCE.getCertificateData_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Importer Of Record</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_DATA__IMPORTER_OF_RECORD = eINSTANCE.getCertificateData_ImporterOfRecord();

		/**
		 * The meta object literal for the '<em><b>Inspection Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE_DATA__INSPECTION_LOCATION = eINSTANCE.getCertificateData_InspectionLocation();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.CommodityDataImpl <em>Commodity Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.CommodityDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getCommodityData()
		 * @generated
		 */
		EClass COMMODITY_DATA = eINSTANCE.getCommodityData();

		/**
		 * The meta object literal for the '<em><b>Entry Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__ENTRY_LINE_NUMBER = eINSTANCE.getCommodityData_EntryLineNumber();

		/**
		 * The meta object literal for the '<em><b>HTS Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__HTS_NUMBER = eINSTANCE.getCommodityData_HTSNumber();

		/**
		 * The meta object literal for the '<em><b>Commodity Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__COMMODITY_DESCRIPTION = eINSTANCE.getCommodityData_CommodityDescription();

		/**
		 * The meta object literal for the '<em><b>Country Of Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__COUNTRY_OF_ORIGIN = eINSTANCE.getCommodityData_CountryOfOrigin();

		/**
		 * The meta object literal for the '<em><b>Container Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__CONTAINER_NBR = eINSTANCE.getCommodityData_ContainerNbr();

		/**
		 * The meta object literal for the '<em><b>Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__ARRIVAL_DATE = eINSTANCE.getCommodityData_ArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Port Of Lading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__PORT_OF_LADING = eINSTANCE.getCommodityData_PortOfLading();

		/**
		 * The meta object literal for the '<em><b>Port Of Unlading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__PORT_OF_UNLADING = eINSTANCE.getCommodityData_PortOfUnlading();

		/**
		 * The meta object literal for the '<em><b>Port Of Entry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__PORT_OF_ENTRY = eINSTANCE.getCommodityData_PortOfEntry();

		/**
		 * The meta object literal for the '<em><b>PPQ Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__PPQ_SIGNATURE = eINSTANCE.getCommodityData_PPQSignature();

		/**
		 * The meta object literal for the '<em><b>Seal Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__SEAL_NUMBERS = eINSTANCE.getCommodityData_SealNumbers();

		/**
		 * The meta object literal for the '<em><b>Trade Parties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMODITY_DATA__TRADE_PARTIES = eINSTANCE.getCommodityData_TradeParties();

		/**
		 * The meta object literal for the '<em><b>Filer Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMODITY_DATA__FILER_REFERENCE_NUMBER = eINSTANCE.getCommodityData_FilerReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Vehicle And Engine Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA = eINSTANCE.getCommodityData_VehicleAndEngineData();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.CommodityListImpl <em>Commodity List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.CommodityListImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getCommodityList()
		 * @generated
		 */
		EClass COMMODITY_LIST = eINSTANCE.getCommodityList();

		/**
		 * The meta object literal for the '<em><b>Commodity Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMODITY_LIST__COMMODITY_DATA = eINSTANCE.getCommodityList_CommodityData();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.ContactInfoTypeImpl <em>Contact Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.ContactInfoTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getContactInfoType()
		 * @generated
		 */
		EClass CONTACT_INFO_TYPE = eINSTANCE.getContactInfoType();

		/**
		 * The meta object literal for the '<em><b>POC Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFO_TYPE__POC_INFO = eINSTANCE.getContactInfoType_POCInfo();

		/**
		 * The meta object literal for the '<em><b>POC Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFO_TYPE__POC_PHONE_NUMBER = eINSTANCE.getContactInfoType_POCPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Return Email Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFO_TYPE__RETURN_EMAIL_ADDRESS = eINSTANCE.getContactInfoType_ReturnEmailAddress();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.DocumentDataImpl <em>Document Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.DocumentDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getDocumentData()
		 * @generated
		 */
		EClass DOCUMENT_DATA = eINSTANCE.getDocumentData();

		/**
		 * The meta object literal for the '<em><b>Document Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DATA__DOCUMENT_HEADER = eINSTANCE.getDocumentData_DocumentHeader();

		/**
		 * The meta object literal for the '<em><b>Govt Agency List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DATA__GOVT_AGENCY_LIST = eINSTANCE.getDocumentData_GovtAgencyList();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_DATA__COMMENT = eINSTANCE.getDocumentData_Comment();

		/**
		 * The meta object literal for the '<em><b>Optional Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DATA__OPTIONAL_DATA = eINSTANCE.getDocumentData_OptionalData();

		/**
		 * The meta object literal for the '<em><b>Vessel Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DATA__VESSEL_DATA = eINSTANCE.getDocumentData_VesselData();

		/**
		 * The meta object literal for the '<em><b>Contact Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_DATA__CONTACT_INFO = eINSTANCE.getDocumentData_ContactInfo();

		/**
		 * The meta object literal for the '<em><b>Document Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_DATA__DOCUMENT_OBJECT = eINSTANCE.getDocumentData_DocumentObject();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl <em>Document Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.DocumentHeaderImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getDocumentHeader()
		 * @generated
		 */
		EClass DOCUMENT_HEADER = eINSTANCE.getDocumentHeader();

		/**
		 * The meta object literal for the '<em><b>Document ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_HEADER__DOCUMENT_ID = eINSTANCE.getDocumentHeader_DocumentID();

		/**
		 * The meta object literal for the '<em><b>Document Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_HEADER__DOCUMENT_LABEL = eINSTANCE.getDocumentHeader_DocumentLabel();

		/**
		 * The meta object literal for the '<em><b>Complete File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_HEADER__COMPLETE_FILE_NAME = eINSTANCE.getDocumentHeader_CompleteFileName();

		/**
		 * The meta object literal for the '<em><b>File Extension Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_HEADER__FILE_EXTENSION_TYPE = eINSTANCE.getDocumentHeader_FileExtensionType();

		/**
		 * The meta object literal for the '<em><b>Document Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_HEADER__DOCUMENT_DESCRIPTION = eINSTANCE.getDocumentHeader_DocumentDescription();

		/**
		 * The meta object literal for the '<em><b>Document Sent Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_HEADER__DOCUMENT_SENT_DATE = eINSTANCE.getDocumentHeader_DocumentSentDate();

		/**
		 * The meta object literal for the '<em><b>Doc Previously Submitted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_HEADER__DOC_PREVIOUSLY_SUBMITTED = eINSTANCE.getDocumentHeader_DocPreviouslySubmitted();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.EntrySummaryTypeImpl <em>Entry Summary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.EntrySummaryTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getEntrySummaryType()
		 * @generated
		 */
		EClass ENTRY_SUMMARY_TYPE = eINSTANCE.getEntrySummaryType();

		/**
		 * The meta object literal for the '<em><b>Entry Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_SUMMARY_TYPE__ENTRY_NUMBER = eINSTANCE.getEntrySummaryType_EntryNumber();

		/**
		 * The meta object literal for the '<em><b>Filer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_SUMMARY_TYPE__FILER = eINSTANCE.getEntrySummaryType_Filer();

		/**
		 * The meta object literal for the '<em><b>Entry Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_SUMMARY_TYPE__ENTRY_LINE_NUMBER = eINSTANCE.getEntrySummaryType_EntryLineNumber();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_SUMMARY_TYPE__REFERENCE_NUMBER = eINSTANCE.getEntrySummaryType_ReferenceNumber();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.EntryTypeImpl <em>Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.EntryTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getEntryType()
		 * @generated
		 */
		EClass ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '<em><b>Entry Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__ENTRY_NUMBER = eINSTANCE.getEntryType_EntryNumber();

		/**
		 * The meta object literal for the '<em><b>Filer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__FILER = eINSTANCE.getEntryType_Filer();

		/**
		 * The meta object literal for the '<em><b>Entry Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__ENTRY_LINE_NUMBER = eINSTANCE.getEntryType_EntryLineNumber();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__REFERENCE_NUMBER = eINSTANCE.getEntryType_ReferenceNumber();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.GovtAgencyListImpl <em>Govt Agency List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.GovtAgencyListImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getGovtAgencyList()
		 * @generated
		 */
		EClass GOVT_AGENCY_LIST = eINSTANCE.getGovtAgencyList();

		/**
		 * The meta object literal for the '<em><b>Govt Agency</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOVT_AGENCY_LIST__GOVT_AGENCY = eINSTANCE.getGovtAgencyList_GovtAgency();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.InvoiceDataImpl <em>Invoice Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.InvoiceDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getInvoiceData()
		 * @generated
		 */
		EClass INVOICE_DATA = eINSTANCE.getInvoiceData();

		/**
		 * The meta object literal for the '<em><b>Invoice Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_DATA__INVOICE_NBR = eINSTANCE.getInvoiceData_InvoiceNbr();

		/**
		 * The meta object literal for the '<em><b>Invoice Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_DATA__INVOICE_TYPE = eINSTANCE.getInvoiceData_InvoiceType();

		/**
		 * The meta object literal for the '<em><b>Invoice Line Item Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_DATA__INVOICE_LINE_ITEM_DATA = eINSTANCE.getInvoiceData_InvoiceLineItemData();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.InvoiceLineItemDataImpl <em>Invoice Line Item Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.InvoiceLineItemDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getInvoiceLineItemData()
		 * @generated
		 */
		EClass INVOICE_LINE_ITEM_DATA = eINSTANCE.getInvoiceLineItemData();

		/**
		 * The meta object literal for the '<em><b>Invoice Line Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE_LINE_ITEM_DATA__INVOICE_LINE_NBR = eINSTANCE.getInvoiceLineItemData_InvoiceLineNbr();

		/**
		 * The meta object literal for the '<em><b>Commodity Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_LINE_ITEM_DATA__COMMODITY_DATA = eINSTANCE.getInvoiceLineItemData_CommodityData();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.InvoiceLineItemListImpl <em>Invoice Line Item List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.InvoiceLineItemListImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getInvoiceLineItemList()
		 * @generated
		 */
		EClass INVOICE_LINE_ITEM_LIST = eINSTANCE.getInvoiceLineItemList();

		/**
		 * The meta object literal for the '<em><b>Invoice Line Item Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOICE_LINE_ITEM_LIST__INVOICE_LINE_ITEM_DATA = eINSTANCE.getInvoiceLineItemList_InvoiceLineItemData();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.ISFNumberTypeImpl <em>ISF Number Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.ISFNumberTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getISFNumberType()
		 * @generated
		 */
		EClass ISF_NUMBER_TYPE = eINSTANCE.getISFNumberType();

		/**
		 * The meta object literal for the '<em><b>Filer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISF_NUMBER_TYPE__FILER = eINSTANCE.getISFNumberType_Filer();

		/**
		 * The meta object literal for the '<em><b>ISF Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISF_NUMBER_TYPE__ISF_NUMBER = eINSTANCE.getISFNumberType_ISFNumber();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.ITNTypeImpl <em>ITN Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.ITNTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getITNType()
		 * @generated
		 */
		EClass ITN_TYPE = eINSTANCE.getITNType();

		/**
		 * The meta object literal for the '<em><b>ITN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITN_TYPE__ITN = eINSTANCE.getITNType_ITN();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITN_TYPE__REFERENCE_NUMBER = eINSTANCE.getITNType_ReferenceNumber();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.NameValuePairImpl <em>Name Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.NameValuePairImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getNameValuePair()
		 * @generated
		 */
		EClass NAME_VALUE_PAIR = eINSTANCE.getNameValuePair();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_VALUE_PAIR__NAME = eINSTANCE.getNameValuePair_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_VALUE_PAIR__VALUE = eINSTANCE.getNameValuePair_Value();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.OptionalDataImpl <em>Optional Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.OptionalDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getOptionalData()
		 * @generated
		 */
		EClass OPTIONAL_DATA = eINSTANCE.getOptionalData();

		/**
		 * The meta object literal for the '<em><b>Invoice Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_DATA__INVOICE_DATA = eINSTANCE.getOptionalData_InvoiceData();

		/**
		 * The meta object literal for the '<em><b>Bond Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_DATA__BOND_DATA = eINSTANCE.getOptionalData_BondData();

		/**
		 * The meta object literal for the '<em><b>Packing List Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_DATA__PACKING_LIST_DATA = eINSTANCE.getOptionalData_PackingListData();

		/**
		 * The meta object literal for the '<em><b>Certificate Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_DATA__CERTIFICATE_DATA = eINSTANCE.getOptionalData_CertificateData();

		/**
		 * The meta object literal for the '<em><b>Permit Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_DATA__PERMIT_DATA = eINSTANCE.getOptionalData_PermitData();

		/**
		 * The meta object literal for the '<em><b>Toxic Substances Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_DATA__TOXIC_SUBSTANCES_DATA = eINSTANCE.getOptionalData_ToxicSubstancesData();

		/**
		 * The meta object literal for the '<em><b>Commodity List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_DATA__COMMODITY_LIST = eINSTANCE.getOptionalData_CommodityList();

		/**
		 * The meta object literal for the '<em><b>Additional Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_DATA__ADDITIONAL_DATA = eINSTANCE.getOptionalData_AdditionalData();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.OtherTransactionTypeImpl <em>Other Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.OtherTransactionTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getOtherTransactionType()
		 * @generated
		 */
		EClass OTHER_TRANSACTION_TYPE = eINSTANCE.getOtherTransactionType();

		/**
		 * The meta object literal for the '<em><b>Transaction Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_TRANSACTION_TYPE__TRANSACTION_NAME = eINSTANCE.getOtherTransactionType_TransactionName();

		/**
		 * The meta object literal for the '<em><b>Transaction Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_TRANSACTION_TYPE__TRANSACTION_NUMBER = eINSTANCE.getOtherTransactionType_TransactionNumber();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.PackageIdentifierTypeImpl <em>Package Identifier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.PackageIdentifierTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getPackageIdentifierType()
		 * @generated
		 */
		EClass PACKAGE_IDENTIFIER_TYPE = eINSTANCE.getPackageIdentifierType();

		/**
		 * The meta object literal for the '<em><b>Package Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_IDENTIFIER_TYPE__PACKAGE_CATEGORY = eINSTANCE.getPackageIdentifierType_PackageCategory();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME = eINSTANCE.getPackageIdentifierType_PackageName();

		/**
		 * The meta object literal for the '<em><b>Importer Of Record Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_IDENTIFIER_TYPE__IMPORTER_OF_RECORD_NBR = eINSTANCE.getPackageIdentifierType_ImporterOfRecordNbr();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.PackingListDataImpl <em>Packing List Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.PackingListDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getPackingListData()
		 * @generated
		 */
		EClass PACKING_LIST_DATA = eINSTANCE.getPackingListData();

		/**
		 * The meta object literal for the '<em><b>Packing List Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKING_LIST_DATA__PACKING_LIST_NBR = eINSTANCE.getPackingListData_PackingListNbr();

		/**
		 * The meta object literal for the '<em><b>Invoice Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKING_LIST_DATA__INVOICE_NUMBER = eINSTANCE.getPackingListData_InvoiceNumber();

		/**
		 * The meta object literal for the '<em><b>Purchase Order Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKING_LIST_DATA__PURCHASE_ORDER_NBR = eINSTANCE.getPackingListData_PurchaseOrderNbr();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.PermitDataImpl <em>Permit Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.PermitDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getPermitData()
		 * @generated
		 */
		EClass PERMIT_DATA = eINSTANCE.getPermitData();

		/**
		 * The meta object literal for the '<em><b>Permit Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_DATA__PERMIT_NUMBER = eINSTANCE.getPermitData_PermitNumber();

		/**
		 * The meta object literal for the '<em><b>Permit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_DATA__PERMIT_TYPE = eINSTANCE.getPermitData_PermitType();

		/**
		 * The meta object literal for the '<em><b>Approval Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_DATA__APPROVAL_NUMBER = eINSTANCE.getPermitData_ApprovalNumber();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_DATA__STATEMENT = eINSTANCE.getPermitData_Statement();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_DATA__START_DATE = eINSTANCE.getPermitData_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_DATA__END_DATE = eINSTANCE.getPermitData_EndDate();

		/**
		 * The meta object literal for the '<em><b>Importer Of Record</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMIT_DATA__IMPORTER_OF_RECORD = eINSTANCE.getPermitData_ImporterOfRecord();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.ToxicSubstancesDataImpl <em>Toxic Substances Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.ToxicSubstancesDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getToxicSubstancesData()
		 * @generated
		 */
		EClass TOXIC_SUBSTANCES_DATA = eINSTANCE.getToxicSubstancesData();

		/**
		 * The meta object literal for the '<em><b>CAS Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOXIC_SUBSTANCES_DATA__CAS_NBR = eINSTANCE.getToxicSubstancesData_CASNbr();

		/**
		 * The meta object literal for the '<em><b>EPA Registration Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOXIC_SUBSTANCES_DATA__EPA_REGISTRATION_NBR = eINSTANCE.getToxicSubstancesData_EPARegistrationNbr();

		/**
		 * The meta object literal for the '<em><b>EPA Producer Est Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOXIC_SUBSTANCES_DATA__EPA_PRODUCER_EST_NBR = eINSTANCE.getToxicSubstancesData_EPAProducerEstNbr();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.TradePartiesImpl <em>Trade Parties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.TradePartiesImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getTradeParties()
		 * @generated
		 */
		EClass TRADE_PARTIES = eINSTANCE.getTradeParties();

		/**
		 * The meta object literal for the '<em><b>Trade Party</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_PARTIES__TRADE_PARTY = eINSTANCE.getTradeParties_TradeParty();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.TradePartyInfoImpl <em>Trade Party Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.TradePartyInfoImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getTradePartyInfo()
		 * @generated
		 */
		EClass TRADE_PARTY_INFO = eINSTANCE.getTradePartyInfo();

		/**
		 * The meta object literal for the '<em><b>Trade Party ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_PARTY_INFO__TRADE_PARTY_ID = eINSTANCE.getTradePartyInfo_TradePartyID();

		/**
		 * The meta object literal for the '<em><b>Trade Party Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_PARTY_INFO__TRADE_PARTY_TYPE = eINSTANCE.getTradePartyInfo_TradePartyType();

		/**
		 * The meta object literal for the '<em><b>Trade Party Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_PARTY_INFO__TRADE_PARTY_NAME = eINSTANCE.getTradePartyInfo_TradePartyName();

		/**
		 * The meta object literal for the '<em><b>Trade Party Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_PARTY_INFO__TRADE_PARTY_ADDRESS = eINSTANCE.getTradePartyInfo_TradePartyAddress();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.TradeTransactionImpl <em>Trade Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.TradeTransactionImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getTradeTransaction()
		 * @generated
		 */
		EClass TRADE_TRANSACTION = eINSTANCE.getTradeTransaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_TRANSACTION__TRANSACTION_CATEGORY = eINSTANCE.getTradeTransaction_TransactionCategory();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_TRANSACTION__ENTRY = eINSTANCE.getTradeTransaction_Entry();

		/**
		 * The meta object literal for the '<em><b>Entry Summary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_TRANSACTION__ENTRY_SUMMARY = eINSTANCE.getTradeTransaction_EntrySummary();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_TRANSACTION__BILL = eINSTANCE.getTradeTransaction_Bill();

		/**
		 * The meta object literal for the '<em><b>ISF Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_TRANSACTION__ISF_NUMBER = eINSTANCE.getTradeTransaction_ISFNumber();

		/**
		 * The meta object literal for the '<em><b>ITN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_TRANSACTION__ITN = eINSTANCE.getTradeTransaction_ITN();

		/**
		 * The meta object literal for the '<em><b>XTN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_TRANSACTION__XTN = eINSTANCE.getTradeTransaction_XTN();

		/**
		 * The meta object literal for the '<em><b>FTZ Admission Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_TRANSACTION__FTZ_ADMISSION_NBR = eINSTANCE.getTradeTransaction_FTZAdmissionNbr();

		/**
		 * The meta object literal for the '<em><b>Importer Of Record Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADE_TRANSACTION__IMPORTER_OF_RECORD_NBR = eINSTANCE.getTradeTransaction_ImporterOfRecordNbr();

		/**
		 * The meta object literal for the '<em><b>Other Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADE_TRANSACTION__OTHER_TRANSACTION = eINSTANCE.getTradeTransaction_OtherTransaction();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl <em>Vehicle And Engine Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getVehicleAndEngineData()
		 * @generated
		 */
		EClass VEHICLE_AND_ENGINE_DATA = eINSTANCE.getVehicleAndEngineData();

		/**
		 * The meta object literal for the '<em><b>VIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__VIN = eINSTANCE.getVehicleAndEngineData_VIN();

		/**
		 * The meta object literal for the '<em><b>Vehicle Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURER = eINSTANCE.getVehicleAndEngineData_VehicleManufacturer();

		/**
		 * The meta object literal for the '<em><b>Vehicle Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__VEHICLE_MODEL = eINSTANCE.getVehicleAndEngineData_VehicleModel();

		/**
		 * The meta object literal for the '<em><b>Vehicle Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__VEHICLE_SERIAL_NUMBER = eINSTANCE.getVehicleAndEngineData_VehicleSerialNumber();

		/**
		 * The meta object literal for the '<em><b>Vehicle Manufacture Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURE_DATE = eINSTANCE.getVehicleAndEngineData_VehicleManufactureDate();

		/**
		 * The meta object literal for the '<em><b>Engine Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURER = eINSTANCE.getVehicleAndEngineData_EngineManufacturer();

		/**
		 * The meta object literal for the '<em><b>Engine Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__ENGINE_MODEL = eINSTANCE.getVehicleAndEngineData_EngineModel();

		/**
		 * The meta object literal for the '<em><b>Engine Serial Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__ENGINE_SERIAL_NUMBER = eINSTANCE.getVehicleAndEngineData_EngineSerialNumber();

		/**
		 * The meta object literal for the '<em><b>Engine Manufacture Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURE_DATE = eINSTANCE.getVehicleAndEngineData_EngineManufactureDate();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl <em>Vessel Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.VesselDataTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getVesselDataType()
		 * @generated
		 */
		EClass VESSEL_DATA_TYPE = eINSTANCE.getVesselDataType();

		/**
		 * The meta object literal for the '<em><b>Carrier SCAC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__CARRIER_SCAC = eINSTANCE.getVesselDataType_CarrierSCAC();

		/**
		 * The meta object literal for the '<em><b>License Permit Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__LICENSE_PERMIT_NUMBER = eINSTANCE.getVesselDataType_LicensePermitNumber();

		/**
		 * The meta object literal for the '<em><b>Certificate Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__CERTIFICATE_NUMBER = eINSTANCE.getVesselDataType_CertificateNumber();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__ISSUE_DATE = eINSTANCE.getVesselDataType_IssueDate();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__EXPIRATION_DATE = eINSTANCE.getVesselDataType_ExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Gross Tonnage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__GROSS_TONNAGE = eINSTANCE.getVesselDataType_GrossTonnage();

		/**
		 * The meta object literal for the '<em><b>Net Tonnage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__NET_TONNAGE = eINSTANCE.getVesselDataType_NetTonnage();

		/**
		 * The meta object literal for the '<em><b>Vessel Voyage Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__VESSEL_VOYAGE_NUMBER = eINSTANCE.getVesselDataType_VesselVoyageNumber();

		/**
		 * The meta object literal for the '<em><b>Vessel Voyage Segment Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__VESSEL_VOYAGE_SEGMENT_NBR = eINSTANCE.getVesselDataType_VesselVoyageSegmentNbr();

		/**
		 * The meta object literal for the '<em><b>Vessel Inspection ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VESSEL_DATA_TYPE__VESSEL_INSPECTION_ID = eINSTANCE.getVesselDataType_VesselInspectionID();

		/**
		 * The meta object literal for the '{@link gov.dhs.cbp.dis.impl.XTNTypeImpl <em>XTN Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gov.dhs.cbp.dis.impl.XTNTypeImpl
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getXTNType()
		 * @generated
		 */
		EClass XTN_TYPE = eINSTANCE.getXTNType();

		/**
		 * The meta object literal for the '<em><b>XTN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTN_TYPE__XTN = eINSTANCE.getXTNType_XTN();

		/**
		 * The meta object literal for the '<em><b>Reference Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTN_TYPE__REFERENCE_NUMBER = eINSTANCE.getXTNType_ReferenceNumber();

		/**
		 * The meta object literal for the '<em>Submitted To Port Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gov.dhs.cbp.dis.impl.DisPackageImpl#getSubmittedToPortCode()
		 * @generated
		 */
		EDataType SUBMITTED_TO_PORT_CODE = eINSTANCE.getSubmittedToPortCode();

	}

} //DisPackage
