/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.CertificateData;
import gov.dhs.cbp.dis.DisPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.CertificateDataImpl#getCertificateNumber <em>Certificate Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CertificateDataImpl#getCertificateType <em>Certificate Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CertificateDataImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CertificateDataImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CertificateDataImpl#getImporterOfRecord <em>Importer Of Record</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CertificateDataImpl#getInspectionLocation <em>Inspection Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificateDataImpl extends MinimalEObjectImpl.Container implements CertificateData {
	/**
	 * The default value of the '{@link #getCertificateNumber() <em>Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateNumber() <em>Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateNumber()
	 * @generated
	 * @ordered
	 */
	protected String certificateNumber = CERTIFICATE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificateType() <em>Certificate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateType()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateType() <em>Certificate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateType()
	 * @generated
	 * @ordered
	 */
	protected String certificateType = CERTIFICATE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImporterOfRecord() <em>Importer Of Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterOfRecord()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTER_OF_RECORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImporterOfRecord() <em>Importer Of Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterOfRecord()
	 * @generated
	 * @ordered
	 */
	protected String importerOfRecord = IMPORTER_OF_RECORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInspectionLocation() <em>Inspection Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String INSPECTION_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInspectionLocation() <em>Inspection Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectionLocation()
	 * @generated
	 * @ordered
	 */
	protected String inspectionLocation = INSPECTION_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificateDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.CERTIFICATE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificateNumber() {
		return certificateNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateNumber(String newCertificateNumber) {
		String oldCertificateNumber = certificateNumber;
		certificateNumber = newCertificateNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CERTIFICATE_DATA__CERTIFICATE_NUMBER, oldCertificateNumber, certificateNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificateType() {
		return certificateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateType(String newCertificateType) {
		String oldCertificateType = certificateType;
		certificateType = newCertificateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CERTIFICATE_DATA__CERTIFICATE_TYPE, oldCertificateType, certificateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CERTIFICATE_DATA__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(XMLGregorianCalendar newExpirationDate) {
		XMLGregorianCalendar oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CERTIFICATE_DATA__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImporterOfRecord() {
		return importerOfRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImporterOfRecord(String newImporterOfRecord) {
		String oldImporterOfRecord = importerOfRecord;
		importerOfRecord = newImporterOfRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CERTIFICATE_DATA__IMPORTER_OF_RECORD, oldImporterOfRecord, importerOfRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInspectionLocation() {
		return inspectionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInspectionLocation(String newInspectionLocation) {
		String oldInspectionLocation = inspectionLocation;
		inspectionLocation = newInspectionLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.CERTIFICATE_DATA__INSPECTION_LOCATION, oldInspectionLocation, inspectionLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.CERTIFICATE_DATA__CERTIFICATE_NUMBER:
				return getCertificateNumber();
			case DisPackage.CERTIFICATE_DATA__CERTIFICATE_TYPE:
				return getCertificateType();
			case DisPackage.CERTIFICATE_DATA__STATEMENT:
				return getStatement();
			case DisPackage.CERTIFICATE_DATA__EXPIRATION_DATE:
				return getExpirationDate();
			case DisPackage.CERTIFICATE_DATA__IMPORTER_OF_RECORD:
				return getImporterOfRecord();
			case DisPackage.CERTIFICATE_DATA__INSPECTION_LOCATION:
				return getInspectionLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DisPackage.CERTIFICATE_DATA__CERTIFICATE_NUMBER:
				setCertificateNumber((String)newValue);
				return;
			case DisPackage.CERTIFICATE_DATA__CERTIFICATE_TYPE:
				setCertificateType((String)newValue);
				return;
			case DisPackage.CERTIFICATE_DATA__STATEMENT:
				setStatement((String)newValue);
				return;
			case DisPackage.CERTIFICATE_DATA__EXPIRATION_DATE:
				setExpirationDate((XMLGregorianCalendar)newValue);
				return;
			case DisPackage.CERTIFICATE_DATA__IMPORTER_OF_RECORD:
				setImporterOfRecord((String)newValue);
				return;
			case DisPackage.CERTIFICATE_DATA__INSPECTION_LOCATION:
				setInspectionLocation((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DisPackage.CERTIFICATE_DATA__CERTIFICATE_NUMBER:
				setCertificateNumber(CERTIFICATE_NUMBER_EDEFAULT);
				return;
			case DisPackage.CERTIFICATE_DATA__CERTIFICATE_TYPE:
				setCertificateType(CERTIFICATE_TYPE_EDEFAULT);
				return;
			case DisPackage.CERTIFICATE_DATA__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case DisPackage.CERTIFICATE_DATA__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case DisPackage.CERTIFICATE_DATA__IMPORTER_OF_RECORD:
				setImporterOfRecord(IMPORTER_OF_RECORD_EDEFAULT);
				return;
			case DisPackage.CERTIFICATE_DATA__INSPECTION_LOCATION:
				setInspectionLocation(INSPECTION_LOCATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DisPackage.CERTIFICATE_DATA__CERTIFICATE_NUMBER:
				return CERTIFICATE_NUMBER_EDEFAULT == null ? certificateNumber != null : !CERTIFICATE_NUMBER_EDEFAULT.equals(certificateNumber);
			case DisPackage.CERTIFICATE_DATA__CERTIFICATE_TYPE:
				return CERTIFICATE_TYPE_EDEFAULT == null ? certificateType != null : !CERTIFICATE_TYPE_EDEFAULT.equals(certificateType);
			case DisPackage.CERTIFICATE_DATA__STATEMENT:
				return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
			case DisPackage.CERTIFICATE_DATA__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case DisPackage.CERTIFICATE_DATA__IMPORTER_OF_RECORD:
				return IMPORTER_OF_RECORD_EDEFAULT == null ? importerOfRecord != null : !IMPORTER_OF_RECORD_EDEFAULT.equals(importerOfRecord);
			case DisPackage.CERTIFICATE_DATA__INSPECTION_LOCATION:
				return INSPECTION_LOCATION_EDEFAULT == null ? inspectionLocation != null : !INSPECTION_LOCATION_EDEFAULT.equals(inspectionLocation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (certificateNumber: ");
		result.append(certificateNumber);
		result.append(", certificateType: ");
		result.append(certificateType);
		result.append(", statement: ");
		result.append(statement);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(", importerOfRecord: ");
		result.append(importerOfRecord);
		result.append(", inspectionLocation: ");
		result.append(inspectionLocation);
		result.append(')');
		return result.toString();
	}

} //CertificateDataImpl
