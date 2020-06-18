/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Document data such as Document ID, Label, Name, Version etc describing the submitted document
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.DocumentData#getDocumentHeader <em>Document Header</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentData#getGovtAgencyList <em>Govt Agency List</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentData#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentData#getOptionalData <em>Optional Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentData#getVesselData <em>Vessel Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentData#getContactInfo <em>Contact Info</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.DocumentData#getDocumentObject <em>Document Object</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getDocumentData()
 * @model extendedMetaData="name='DocumentData' kind='elementOnly'"
 * @generated
 */
public interface DocumentData extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key information needed to identify and locate a document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Header</em>' containment reference.
	 * @see #setDocumentHeader(DocumentHeader)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentData_DocumentHeader()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DocumentHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentHeader getDocumentHeader();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentData#getDocumentHeader <em>Document Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Header</em>' containment reference.
	 * @see #getDocumentHeader()
	 * @generated
	 */
	void setDocumentHeader(DocumentHeader value);

	/**
	 * Returns the value of the '<em><b>Govt Agency List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - List of Government Agencies that this document is being submitted to.
	 * 					    NOTE: Please see the DIS Implementation guide published on CBP.GOV for the current list of supported values for this field.  
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Govt Agency List</em>' containment reference.
	 * @see #setGovtAgencyList(GovtAgencyList)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentData_GovtAgencyList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GovtAgencyList' namespace='##targetNamespace'"
	 * @generated
	 */
	GovtAgencyList getGovtAgencyList();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentData#getGovtAgencyList <em>Govt Agency List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Govt Agency List</em>' containment reference.
	 * @see #getGovtAgencyList()
	 * @generated
	 */
	void setGovtAgencyList(GovtAgencyList value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional - Any Explanatory comment regarding the document or business transaction for this document
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentData_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentData#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Optional Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional Optional Data included in support of the document submission
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional Data</em>' containment reference.
	 * @see #setOptionalData(OptionalData)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentData_OptionalData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OptionalData' namespace='##targetNamespace'"
	 * @generated
	 */
	OptionalData getOptionalData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentData#getOptionalData <em>Optional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Data</em>' containment reference.
	 * @see #getOptionalData()
	 * @generated
	 */
	void setOptionalData(OptionalData value);

	/**
	 * Returns the value of the '<em><b>Vessel Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vessel Data</em>' containment reference.
	 * @see #setVesselData(VesselDataType)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentData_VesselData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VesselData' namespace='##targetNamespace'"
	 * @generated
	 */
	VesselDataType getVesselData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentData#getVesselData <em>Vessel Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vessel Data</em>' containment reference.
	 * @see #getVesselData()
	 * @generated
	 */
	void setVesselData(VesselDataType value);

	/**
	 * Returns the value of the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Info</em>' containment reference.
	 * @see #setContactInfo(ContactInfoType)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentData_ContactInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContactInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactInfoType getContactInfo();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentData#getContactInfo <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Info</em>' containment reference.
	 * @see #getContactInfo()
	 * @generated
	 */
	void setContactInfo(ContactInfoType value);

	/**
	 * Returns the value of the '<em><b>Document Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required - Actual document or image that is Base64Encoded to convert to a string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Object</em>' attribute.
	 * @see #setDocumentObject(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getDocumentData_DocumentObject()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DocumentObject' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentObject();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.DocumentData#getDocumentObject <em>Document Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Object</em>' attribute.
	 * @see #getDocumentObject()
	 * @generated
	 */
	void setDocumentObject(String value);

} // DocumentData
