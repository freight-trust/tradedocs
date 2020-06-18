/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.VesselDataType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vessel Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getCarrierSCAC <em>Carrier SCAC</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getLicensePermitNumber <em>License Permit Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getCertificateNumber <em>Certificate Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getGrossTonnage <em>Gross Tonnage</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getNetTonnage <em>Net Tonnage</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getVesselVoyageNumber <em>Vessel Voyage Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getVesselVoyageSegmentNbr <em>Vessel Voyage Segment Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VesselDataTypeImpl#getVesselInspectionID <em>Vessel Inspection ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VesselDataTypeImpl extends MinimalEObjectImpl.Container implements VesselDataType {
	/**
	 * The default value of the '{@link #getCarrierSCAC() <em>Carrier SCAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierSCAC()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_SCAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierSCAC() <em>Carrier SCAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierSCAC()
	 * @generated
	 * @ordered
	 */
	protected String carrierSCAC = CARRIER_SCAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicensePermitNumber() <em>License Permit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensePermitNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_PERMIT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicensePermitNumber() <em>License Permit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicensePermitNumber()
	 * @generated
	 * @ordered
	 */
	protected String licensePermitNumber = LICENSE_PERMIT_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected String issueDate = ISSUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected String expirationDate = EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrossTonnage() <em>Gross Tonnage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossTonnage()
	 * @generated
	 * @ordered
	 */
	protected static final String GROSS_TONNAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrossTonnage() <em>Gross Tonnage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossTonnage()
	 * @generated
	 * @ordered
	 */
	protected String grossTonnage = GROSS_TONNAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetTonnage() <em>Net Tonnage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetTonnage()
	 * @generated
	 * @ordered
	 */
	protected static final String NET_TONNAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetTonnage() <em>Net Tonnage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetTonnage()
	 * @generated
	 * @ordered
	 */
	protected String netTonnage = NET_TONNAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVesselVoyageNumber() <em>Vessel Voyage Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselVoyageNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String VESSEL_VOYAGE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVesselVoyageNumber() <em>Vessel Voyage Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselVoyageNumber()
	 * @generated
	 * @ordered
	 */
	protected String vesselVoyageNumber = VESSEL_VOYAGE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVesselVoyageSegmentNbr() <em>Vessel Voyage Segment Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselVoyageSegmentNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String VESSEL_VOYAGE_SEGMENT_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVesselVoyageSegmentNbr() <em>Vessel Voyage Segment Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselVoyageSegmentNbr()
	 * @generated
	 * @ordered
	 */
	protected String vesselVoyageSegmentNbr = VESSEL_VOYAGE_SEGMENT_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVesselInspectionID() <em>Vessel Inspection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselInspectionID()
	 * @generated
	 * @ordered
	 */
	protected static final String VESSEL_INSPECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVesselInspectionID() <em>Vessel Inspection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselInspectionID()
	 * @generated
	 * @ordered
	 */
	protected String vesselInspectionID = VESSEL_INSPECTION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VesselDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.VESSEL_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCarrierSCAC() {
		return carrierSCAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierSCAC(String newCarrierSCAC) {
		String oldCarrierSCAC = carrierSCAC;
		carrierSCAC = newCarrierSCAC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__CARRIER_SCAC, oldCarrierSCAC, carrierSCAC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicensePermitNumber() {
		return licensePermitNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicensePermitNumber(String newLicensePermitNumber) {
		String oldLicensePermitNumber = licensePermitNumber;
		licensePermitNumber = newLicensePermitNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__LICENSE_PERMIT_NUMBER, oldLicensePermitNumber, licensePermitNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__CERTIFICATE_NUMBER, oldCertificateNumber, certificateNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDate(String newIssueDate) {
		String oldIssueDate = issueDate;
		issueDate = newIssueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__ISSUE_DATE, oldIssueDate, issueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(String newExpirationDate) {
		String oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__EXPIRATION_DATE, oldExpirationDate, expirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrossTonnage() {
		return grossTonnage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrossTonnage(String newGrossTonnage) {
		String oldGrossTonnage = grossTonnage;
		grossTonnage = newGrossTonnage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__GROSS_TONNAGE, oldGrossTonnage, grossTonnage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNetTonnage() {
		return netTonnage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetTonnage(String newNetTonnage) {
		String oldNetTonnage = netTonnage;
		netTonnage = newNetTonnage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__NET_TONNAGE, oldNetTonnage, netTonnage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVesselVoyageNumber() {
		return vesselVoyageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVesselVoyageNumber(String newVesselVoyageNumber) {
		String oldVesselVoyageNumber = vesselVoyageNumber;
		vesselVoyageNumber = newVesselVoyageNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_NUMBER, oldVesselVoyageNumber, vesselVoyageNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVesselVoyageSegmentNbr() {
		return vesselVoyageSegmentNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVesselVoyageSegmentNbr(String newVesselVoyageSegmentNbr) {
		String oldVesselVoyageSegmentNbr = vesselVoyageSegmentNbr;
		vesselVoyageSegmentNbr = newVesselVoyageSegmentNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_SEGMENT_NBR, oldVesselVoyageSegmentNbr, vesselVoyageSegmentNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVesselInspectionID() {
		return vesselInspectionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVesselInspectionID(String newVesselInspectionID) {
		String oldVesselInspectionID = vesselInspectionID;
		vesselInspectionID = newVesselInspectionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VESSEL_DATA_TYPE__VESSEL_INSPECTION_ID, oldVesselInspectionID, vesselInspectionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.VESSEL_DATA_TYPE__CARRIER_SCAC:
				return getCarrierSCAC();
			case DisPackage.VESSEL_DATA_TYPE__LICENSE_PERMIT_NUMBER:
				return getLicensePermitNumber();
			case DisPackage.VESSEL_DATA_TYPE__CERTIFICATE_NUMBER:
				return getCertificateNumber();
			case DisPackage.VESSEL_DATA_TYPE__ISSUE_DATE:
				return getIssueDate();
			case DisPackage.VESSEL_DATA_TYPE__EXPIRATION_DATE:
				return getExpirationDate();
			case DisPackage.VESSEL_DATA_TYPE__GROSS_TONNAGE:
				return getGrossTonnage();
			case DisPackage.VESSEL_DATA_TYPE__NET_TONNAGE:
				return getNetTonnage();
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_NUMBER:
				return getVesselVoyageNumber();
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_SEGMENT_NBR:
				return getVesselVoyageSegmentNbr();
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_INSPECTION_ID:
				return getVesselInspectionID();
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
			case DisPackage.VESSEL_DATA_TYPE__CARRIER_SCAC:
				setCarrierSCAC((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__LICENSE_PERMIT_NUMBER:
				setLicensePermitNumber((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__CERTIFICATE_NUMBER:
				setCertificateNumber((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__ISSUE_DATE:
				setIssueDate((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__EXPIRATION_DATE:
				setExpirationDate((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__GROSS_TONNAGE:
				setGrossTonnage((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__NET_TONNAGE:
				setNetTonnage((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_NUMBER:
				setVesselVoyageNumber((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_SEGMENT_NBR:
				setVesselVoyageSegmentNbr((String)newValue);
				return;
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_INSPECTION_ID:
				setVesselInspectionID((String)newValue);
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
			case DisPackage.VESSEL_DATA_TYPE__CARRIER_SCAC:
				setCarrierSCAC(CARRIER_SCAC_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__LICENSE_PERMIT_NUMBER:
				setLicensePermitNumber(LICENSE_PERMIT_NUMBER_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__CERTIFICATE_NUMBER:
				setCertificateNumber(CERTIFICATE_NUMBER_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__ISSUE_DATE:
				setIssueDate(ISSUE_DATE_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__EXPIRATION_DATE:
				setExpirationDate(EXPIRATION_DATE_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__GROSS_TONNAGE:
				setGrossTonnage(GROSS_TONNAGE_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__NET_TONNAGE:
				setNetTonnage(NET_TONNAGE_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_NUMBER:
				setVesselVoyageNumber(VESSEL_VOYAGE_NUMBER_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_SEGMENT_NBR:
				setVesselVoyageSegmentNbr(VESSEL_VOYAGE_SEGMENT_NBR_EDEFAULT);
				return;
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_INSPECTION_ID:
				setVesselInspectionID(VESSEL_INSPECTION_ID_EDEFAULT);
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
			case DisPackage.VESSEL_DATA_TYPE__CARRIER_SCAC:
				return CARRIER_SCAC_EDEFAULT == null ? carrierSCAC != null : !CARRIER_SCAC_EDEFAULT.equals(carrierSCAC);
			case DisPackage.VESSEL_DATA_TYPE__LICENSE_PERMIT_NUMBER:
				return LICENSE_PERMIT_NUMBER_EDEFAULT == null ? licensePermitNumber != null : !LICENSE_PERMIT_NUMBER_EDEFAULT.equals(licensePermitNumber);
			case DisPackage.VESSEL_DATA_TYPE__CERTIFICATE_NUMBER:
				return CERTIFICATE_NUMBER_EDEFAULT == null ? certificateNumber != null : !CERTIFICATE_NUMBER_EDEFAULT.equals(certificateNumber);
			case DisPackage.VESSEL_DATA_TYPE__ISSUE_DATE:
				return ISSUE_DATE_EDEFAULT == null ? issueDate != null : !ISSUE_DATE_EDEFAULT.equals(issueDate);
			case DisPackage.VESSEL_DATA_TYPE__EXPIRATION_DATE:
				return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
			case DisPackage.VESSEL_DATA_TYPE__GROSS_TONNAGE:
				return GROSS_TONNAGE_EDEFAULT == null ? grossTonnage != null : !GROSS_TONNAGE_EDEFAULT.equals(grossTonnage);
			case DisPackage.VESSEL_DATA_TYPE__NET_TONNAGE:
				return NET_TONNAGE_EDEFAULT == null ? netTonnage != null : !NET_TONNAGE_EDEFAULT.equals(netTonnage);
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_NUMBER:
				return VESSEL_VOYAGE_NUMBER_EDEFAULT == null ? vesselVoyageNumber != null : !VESSEL_VOYAGE_NUMBER_EDEFAULT.equals(vesselVoyageNumber);
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_VOYAGE_SEGMENT_NBR:
				return VESSEL_VOYAGE_SEGMENT_NBR_EDEFAULT == null ? vesselVoyageSegmentNbr != null : !VESSEL_VOYAGE_SEGMENT_NBR_EDEFAULT.equals(vesselVoyageSegmentNbr);
			case DisPackage.VESSEL_DATA_TYPE__VESSEL_INSPECTION_ID:
				return VESSEL_INSPECTION_ID_EDEFAULT == null ? vesselInspectionID != null : !VESSEL_INSPECTION_ID_EDEFAULT.equals(vesselInspectionID);
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
		result.append(" (carrierSCAC: ");
		result.append(carrierSCAC);
		result.append(", licensePermitNumber: ");
		result.append(licensePermitNumber);
		result.append(", certificateNumber: ");
		result.append(certificateNumber);
		result.append(", issueDate: ");
		result.append(issueDate);
		result.append(", expirationDate: ");
		result.append(expirationDate);
		result.append(", grossTonnage: ");
		result.append(grossTonnage);
		result.append(", netTonnage: ");
		result.append(netTonnage);
		result.append(", vesselVoyageNumber: ");
		result.append(vesselVoyageNumber);
		result.append(", vesselVoyageSegmentNbr: ");
		result.append(vesselVoyageSegmentNbr);
		result.append(", vesselInspectionID: ");
		result.append(vesselInspectionID);
		result.append(')');
		return result.toString();
	}

} //VesselDataTypeImpl
