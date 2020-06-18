/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Govt Agency List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.GovtAgencyList#getGovtAgency <em>Govt Agency</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getGovtAgencyList()
 * @model extendedMetaData="name='GovtAgencyList' kind='elementOnly'"
 * @generated
 */
public interface GovtAgencyList extends EObject {
	/**
	 * Returns the value of the '<em><b>Govt Agency</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Government Agency (one or more) that this document is intended for. The Document will be made available to only the specified agency or per current govt policy if this policy changes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Govt Agency</em>' attribute list.
	 * @see gov.dhs.cbp.dis.DisPackage#getGovtAgencyList_GovtAgency()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true" upper="50"
	 *        extendedMetaData="kind='element' name='GovtAgency' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getGovtAgency();

} // GovtAgencyList
