/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.BillType#getSCAC <em>SCAC</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BillType#getBillNumber <em>Bill Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BillType#getHouseBillNumber <em>House Bill Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BillType#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getBillType()
 * @model extendedMetaData="name='Bill_._type' kind='elementOnly'"
 * @generated
 */
public interface BillType extends EObject {
	/**
	 * Returns the value of the '<em><b>SCAC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCAC</em>' attribute.
	 * @see #setSCAC(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBillType_SCAC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SCAC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSCAC();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BillType#getSCAC <em>SCAC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCAC</em>' attribute.
	 * @see #getSCAC()
	 * @generated
	 */
	void setSCAC(String value);

	/**
	 * Returns the value of the '<em><b>Bill Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Number</em>' attribute.
	 * @see #setBillNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBillType_BillNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='BillNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBillNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BillType#getBillNumber <em>Bill Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Number</em>' attribute.
	 * @see #getBillNumber()
	 * @generated
	 */
	void setBillNumber(String value);

	/**
	 * Returns the value of the '<em><b>House Bill Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Bill Number</em>' attribute.
	 * @see #setHouseBillNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBillType_HouseBillNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='HouseBillNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHouseBillNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BillType#getHouseBillNumber <em>House Bill Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House Bill Number</em>' attribute.
	 * @see #getHouseBillNumber()
	 * @generated
	 */
	void setHouseBillNumber(String value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBillType_ReferenceNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ReferenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BillType#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

} // BillType
