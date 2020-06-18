/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ITN Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.ITNType#getITN <em>ITN</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.ITNType#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getITNType()
 * @model extendedMetaData="name='ITN_._type' kind='elementOnly'"
 * @generated
 */
public interface ITNType extends EObject {
	/**
	 * Returns the value of the '<em><b>ITN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ITN</em>' attribute.
	 * @see #setITN(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getITNType_ITN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ITN' namespace='##targetNamespace'"
	 * @generated
	 */
	String getITN();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ITNType#getITN <em>ITN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ITN</em>' attribute.
	 * @see #getITN()
	 * @generated
	 */
	void setITN(String value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getITNType_ReferenceNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ReferenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ITNType#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

} // ITNType
