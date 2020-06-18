/**
 */
package gov.dhs.cbp.dis;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permit Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information typically on Permits
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.PermitData#getPermitNumber <em>Permit Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PermitData#getPermitType <em>Permit Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PermitData#getApprovalNumber <em>Approval Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PermitData#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PermitData#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PermitData#getEndDate <em>End Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PermitData#getImporterOfRecord <em>Importer Of Record</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getPermitData()
 * @model extendedMetaData="name='PermitData' kind='elementOnly'"
 * @generated
 */
public interface PermitData extends EObject {
	/**
	 * Returns the value of the '<em><b>Permit Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * permit Number (ID) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permit Number</em>' attribute.
	 * @see #setPermitNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPermitData_PermitNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PermitNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPermitNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PermitData#getPermitNumber <em>Permit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit Number</em>' attribute.
	 * @see #getPermitNumber()
	 * @generated
	 */
	void setPermitNumber(String value);

	/**
	 * Returns the value of the '<em><b>Permit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Permit Type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Permit Type</em>' attribute.
	 * @see #setPermitType(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPermitData_PermitType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PermitType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPermitType();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PermitData#getPermitType <em>Permit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit Type</em>' attribute.
	 * @see #getPermitType()
	 * @generated
	 */
	void setPermitType(String value);

	/**
	 * Returns the value of the '<em><b>Approval Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Approval Number 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approval Number</em>' attribute.
	 * @see #setApprovalNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPermitData_ApprovalNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ApprovalNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApprovalNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PermitData#getApprovalNumber <em>Approval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Number</em>' attribute.
	 * @see #getApprovalNumber()
	 * @generated
	 */
	void setApprovalNumber(String value);

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Statement on Permit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPermitData_Statement()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Statement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PermitData#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start Date the Permit is valid from EST Format 2010-05-25T00:34:47.0Z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(XMLGregorianCalendar)
	 * @see gov.dhs.cbp.dis.DisPackage#getPermitData_StartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='StartDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStartDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PermitData#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End Date the Permit is valid till. EST Format 2010-05-25T00:34:47.0Z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(XMLGregorianCalendar)
	 * @see gov.dhs.cbp.dis.DisPackage#getPermitData_EndDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='EndDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEndDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PermitData#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Importer Of Record</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Importer Of Record
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importer Of Record</em>' attribute.
	 * @see #setImporterOfRecord(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPermitData_ImporterOfRecord()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImporterOfRecord' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImporterOfRecord();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PermitData#getImporterOfRecord <em>Importer Of Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer Of Record</em>' attribute.
	 * @see #getImporterOfRecord()
	 * @generated
	 */
	void setImporterOfRecord(String value);

} // PermitData
