/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.ContactInfoType#getPOCInfo <em>POC Info</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.ContactInfoType#getPOCPhoneNumber <em>POC Phone Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.ContactInfoType#getReturnEmailAddress <em>Return Email Address</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getContactInfoType()
 * @model extendedMetaData="name='ContactInfoType' kind='elementOnly'"
 * @generated
 */
public interface ContactInfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>POC Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POC Contact
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>POC Info</em>' attribute.
	 * @see #setPOCInfo(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getContactInfoType_POCInfo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='POC_Info' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPOCInfo();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ContactInfoType#getPOCInfo <em>POC Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>POC Info</em>' attribute.
	 * @see #getPOCInfo()
	 * @generated
	 */
	void setPOCInfo(String value);

	/**
	 * Returns the value of the '<em><b>POC Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * POC_PhoneNumber
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>POC Phone Number</em>' attribute.
	 * @see #setPOCPhoneNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getContactInfoType_POCPhoneNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='POC_PhoneNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPOCPhoneNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ContactInfoType#getPOCPhoneNumber <em>POC Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>POC Phone Number</em>' attribute.
	 * @see #getPOCPhoneNumber()
	 * @generated
	 */
	void setPOCPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Return Email Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Email address of return party
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Email Address</em>' attribute.
	 * @see #setReturnEmailAddress(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getContactInfoType_ReturnEmailAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ReturnEmailAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReturnEmailAddress();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ContactInfoType#getReturnEmailAddress <em>Return Email Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Email Address</em>' attribute.
	 * @see #getReturnEmailAddress()
	 * @generated
	 */
	void setReturnEmailAddress(String value);

} // ContactInfoType
