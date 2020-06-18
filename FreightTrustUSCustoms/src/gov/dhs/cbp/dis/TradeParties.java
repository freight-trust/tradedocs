/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trade Parties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.TradeParties#getTradeParty <em>Trade Party</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getTradeParties()
 * @model extendedMetaData="name='TradeParties' kind='elementOnly'"
 * @generated
 */
public interface TradeParties extends EObject {
	/**
	 * Returns the value of the '<em><b>Trade Party</b></em>' containment reference list.
	 * The list contents are of type {@link gov.dhs.cbp.dis.TradePartyInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trade Party</em>' containment reference list.
	 * @see gov.dhs.cbp.dis.DisPackage#getTradeParties_TradeParty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TradeParty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TradePartyInfo> getTradeParty();

} // TradeParties
