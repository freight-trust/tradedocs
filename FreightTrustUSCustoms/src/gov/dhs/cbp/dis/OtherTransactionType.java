/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.OtherTransactionType#getTransactionName <em>Transaction Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.OtherTransactionType#getTransactionNumber <em>Transaction Number</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getOtherTransactionType()
 * @model extendedMetaData="name='OtherTransaction_._type' kind='elementOnly'"
 * @generated
 */
public interface OtherTransactionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Name</em>' attribute.
	 * @see #setTransactionName(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getOtherTransactionType_TransactionName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TransactionName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionName();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OtherTransactionType#getTransactionName <em>Transaction Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Name</em>' attribute.
	 * @see #getTransactionName()
	 * @generated
	 */
	void setTransactionName(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Number</em>' attribute.
	 * @see #setTransactionNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getOtherTransactionType_TransactionNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TransactionNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTransactionNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.OtherTransactionType#getTransactionNumber <em>Transaction Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Number</em>' attribute.
	 * @see #getTransactionNumber()
	 * @generated
	 */
	void setTransactionNumber(String value);

} // OtherTransactionType
