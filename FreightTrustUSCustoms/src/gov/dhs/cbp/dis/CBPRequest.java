/**
 */
package gov.dhs.cbp.dis;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CBP Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestID <em>CBP Request ID</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestType <em>CBP Request Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestDate <em>CBP Request Date</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getCBPRequest()
 * @model extendedMetaData="name='CBPRequest' kind='elementOnly'"
 * @generated
 */
public interface CBPRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>CBP Request ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CBP request in response to which this Document is being Sent. Ex. ACE Action Number. Specify 'UNSOLICITED'; 'UNKNOWN' if not known/applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CBP Request ID</em>' attribute.
	 * @see #setCBPRequestID(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCBPRequest_CBPRequestID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CBPRequestID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCBPRequestID();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestID <em>CBP Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CBP Request ID</em>' attribute.
	 * @see #getCBPRequestID()
	 * @generated
	 */
	void setCBPRequestID(String value);

	/**
	 * Returns the value of the '<em><b>CBP Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CBP request in response to which this Document is being Sent. Could be same as ACE Action Number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CBP Request Type</em>' attribute.
	 * @see #setCBPRequestType(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCBPRequest_CBPRequestType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CBPRequestType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCBPRequestType();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestType <em>CBP Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CBP Request Type</em>' attribute.
	 * @see #getCBPRequestType()
	 * @generated
	 */
	void setCBPRequestType(String value);

	/**
	 * Returns the value of the '<em><b>CBP Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date Time of CBP request in response to which this Document is being Sent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CBP Request Date</em>' attribute.
	 * @see #setCBPRequestDate(XMLGregorianCalendar)
	 * @see gov.dhs.cbp.dis.DisPackage#getCBPRequest_CBPRequestDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CBPRequestDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCBPRequestDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CBPRequest#getCBPRequestDate <em>CBP Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CBP Request Date</em>' attribute.
	 * @see #getCBPRequestDate()
	 * @generated
	 */
	void setCBPRequestDate(XMLGregorianCalendar value);

} // CBPRequest
