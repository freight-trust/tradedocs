/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vessel Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getCarrierSCAC <em>Carrier SCAC</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getLicensePermitNumber <em>License Permit Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getCertificateNumber <em>Certificate Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getGrossTonnage <em>Gross Tonnage</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getNetTonnage <em>Net Tonnage</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getVesselVoyageNumber <em>Vessel Voyage Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getVesselVoyageSegmentNbr <em>Vessel Voyage Segment Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VesselDataType#getVesselInspectionID <em>Vessel Inspection ID</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType()
 * @model extendedMetaData="name='VesselDataType' kind='elementOnly'"
 * @generated
 */
public interface VesselDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Carrier SCAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SCAC Code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier SCAC</em>' attribute.
	 * @see #setCarrierSCAC(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_CarrierSCAC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CarrierSCAC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCarrierSCAC();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getCarrierSCAC <em>Carrier SCAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier SCAC</em>' attribute.
	 * @see #getCarrierSCAC()
	 * @generated
	 */
	void setCarrierSCAC(String value);

	/**
	 * Returns the value of the '<em><b>License Permit Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * License permit number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>License Permit Number</em>' attribute.
	 * @see #setLicensePermitNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_LicensePermitNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='License_PermitNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLicensePermitNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getLicensePermitNumber <em>License Permit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Permit Number</em>' attribute.
	 * @see #getLicensePermitNumber()
	 * @generated
	 */
	void setLicensePermitNumber(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificate Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Number</em>' attribute.
	 * @see #setCertificateNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_CertificateNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CertificateNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCertificateNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getCertificateNumber <em>Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Number</em>' attribute.
	 * @see #getCertificateNumber()
	 * @generated
	 */
	void setCertificateNumber(String value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * License issue date
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute.
	 * @see #setIssueDate(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_IssueDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='IssueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIssueDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getIssueDate <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * License expiration date 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_ExpirationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExpirationDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(String value);

	/**
	 * Returns the value of the '<em><b>Gross Tonnage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gross tonnage (weight) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gross Tonnage</em>' attribute.
	 * @see #setGrossTonnage(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_GrossTonnage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='GrossTonnage' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGrossTonnage();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getGrossTonnage <em>Gross Tonnage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gross Tonnage</em>' attribute.
	 * @see #getGrossTonnage()
	 * @generated
	 */
	void setGrossTonnage(String value);

	/**
	 * Returns the value of the '<em><b>Net Tonnage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Net Tonnage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net Tonnage</em>' attribute.
	 * @see #setNetTonnage(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_NetTonnage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='NetTonnage' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNetTonnage();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getNetTonnage <em>Net Tonnage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net Tonnage</em>' attribute.
	 * @see #getNetTonnage()
	 * @generated
	 */
	void setNetTonnage(String value);

	/**
	 * Returns the value of the '<em><b>Vessel Voyage Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vessel Voyage Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Voyage Number</em>' attribute.
	 * @see #setVesselVoyageNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_VesselVoyageNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VesselVoyageNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVesselVoyageNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getVesselVoyageNumber <em>Vessel Voyage Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vessel Voyage Number</em>' attribute.
	 * @see #getVesselVoyageNumber()
	 * @generated
	 */
	void setVesselVoyageNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vessel Voyage Segment Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vessel Voyage Segment Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Voyage Segment Nbr</em>' attribute.
	 * @see #setVesselVoyageSegmentNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_VesselVoyageSegmentNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VesselVoyageSegmentNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVesselVoyageSegmentNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getVesselVoyageSegmentNbr <em>Vessel Voyage Segment Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vessel Voyage Segment Nbr</em>' attribute.
	 * @see #getVesselVoyageSegmentNbr()
	 * @generated
	 */
	void setVesselVoyageSegmentNbr(String value);

	/**
	 * Returns the value of the '<em><b>Vessel Inspection ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vessel Inspection ID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vessel Inspection ID</em>' attribute.
	 * @see #setVesselInspectionID(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVesselDataType_VesselInspectionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VesselInspectionID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVesselInspectionID();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VesselDataType#getVesselInspectionID <em>Vessel Inspection ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vessel Inspection ID</em>' attribute.
	 * @see #getVesselInspectionID()
	 * @generated
	 */
	void setVesselInspectionID(String value);

} // VesselDataType
