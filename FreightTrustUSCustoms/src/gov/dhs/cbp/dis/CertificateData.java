/**
 */
package gov.dhs.cbp.dis;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information typically on Certificates
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.CertificateData#getCertificateNumber <em>Certificate Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CertificateData#getCertificateType <em>Certificate Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CertificateData#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CertificateData#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CertificateData#getImporterOfRecord <em>Importer Of Record</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CertificateData#getInspectionLocation <em>Inspection Location</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getCertificateData()
 * @model extendedMetaData="name='CertificateData' kind='elementOnly'"
 * @generated
 */
public interface CertificateData extends EObject {
	/**
	 * Returns the value of the '<em><b>Certificate Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificate Number (ID) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Number</em>' attribute.
	 * @see #setCertificateNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCertificateData_CertificateNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CertificateNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCertificateNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CertificateData#getCertificateNumber <em>Certificate Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Number</em>' attribute.
	 * @see #getCertificateNumber()
	 * @generated
	 */
	void setCertificateNumber(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ICertificate Type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Type</em>' attribute.
	 * @see #setCertificateType(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCertificateData_CertificateType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CertificateType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCertificateType();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CertificateData#getCertificateType <em>Certificate Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Type</em>' attribute.
	 * @see #getCertificateType()
	 * @generated
	 */
	void setCertificateType(String value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement on Certificate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCertificateData_Statement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Statement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CertificateData#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date the certificate is valid till. EST Format 2010-05-25T00:34:47.0Z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(XMLGregorianCalendar)
	 * @see gov.dhs.cbp.dis.DisPackage#getCertificateData_ExpirationDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ExpirationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpirationDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CertificateData#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Importer Of Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Importer Of Record
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importer Of Record</em>' attribute.
	 * @see #setImporterOfRecord(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCertificateData_ImporterOfRecord()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImporterOfRecord' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImporterOfRecord();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CertificateData#getImporterOfRecord <em>Importer Of Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer Of Record</em>' attribute.
	 * @see #getImporterOfRecord()
	 * @generated
	 */
	void setImporterOfRecord(String value);

	/**
	 * Returns the value of the '<em><b>Inspection Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inspection Location
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inspection Location</em>' attribute.
	 * @see #setInspectionLocation(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCertificateData_InspectionLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='InspectionLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInspectionLocation();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CertificateData#getInspectionLocation <em>Inspection Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inspection Location</em>' attribute.
	 * @see #getInspectionLocation()
	 * @generated
	 */
	void setInspectionLocation(String value);

} // CertificateData
