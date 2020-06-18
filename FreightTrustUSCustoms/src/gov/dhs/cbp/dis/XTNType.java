/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XTN Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.XTNType#getXTN <em>XTN</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.XTNType#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getXTNType()
 * @model extendedMetaData="name='XTN_._type' kind='elementOnly'"
 * @generated
 */
public interface XTNType extends EObject {
	/**
	 * Returns the value of the '<em><b>XTN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XTN</em>' attribute.
	 * @see #setXTN(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getXTNType_XTN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='XTN' namespace='##targetNamespace'"
	 * @generated
	 */
	String getXTN();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.XTNType#getXTN <em>XTN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XTN</em>' attribute.
	 * @see #getXTN()
	 * @generated
	 */
	void setXTN(String value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getXTNType_ReferenceNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ReferenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.XTNType#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

} // XTNType
