/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commodity List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.CommodityList#getCommodityData <em>Commodity Data</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getCommodityList()
 * @model extendedMetaData="name='CommodityList' kind='elementOnly'"
 * @generated
 */
public interface CommodityList extends EObject {
	/**
	 * Returns the value of the '<em><b>Commodity Data</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.CommodityData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commodity Data</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityList_CommodityData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CommodityData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CommodityData> getCommodityData();

} // CommodityList
