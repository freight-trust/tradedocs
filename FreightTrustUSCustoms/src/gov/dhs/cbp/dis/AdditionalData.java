/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any additional information that a sender wishes to provide in the form of name-value pairs. This data is for information only
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.AdditionalData#getNameValuePair <em>Name Value Pair</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getAdditionalData()
 * @model extendedMetaData="name='AdditionalData' kind='elementOnly'"
 * @generated
 */
public interface AdditionalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Value Pair</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.NameValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * name-value pairs of information to accomodate additional information for flexibility.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Value Pair</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getAdditionalData_NameValuePair()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NameValuePair' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameValuePair> getNameValuePair();

} // AdditionalData
