/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trade Party Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyID <em>Trade Party ID</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyType <em>Trade Party Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyName <em>Trade Party Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyAddress <em>Trade Party Address</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getTradePartyInfo()
 * @model extendedMetaData="name='TradePartyInfo' kind='elementOnly'"
 * @generated
 */
public interface TradePartyInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Trade Party ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique ID of the Trade Party. ex. ImporterID, ShipperID, CarrierID etc. Send UNKNOWN if only Name and Address available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trade Party ID</em>' attribute.
	 * @see #setTradePartyID(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getTradePartyInfo_TradePartyID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TradePartyID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTradePartyID();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyID <em>Trade Party ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Party ID</em>' attribute.
	 * @see #getTradePartyID()
	 * @generated
	 */
	void setTradePartyID(String value);

	/**
	 * Returns the value of the '<em><b>Trade Party Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See Enum list in DIS Documentation Guide
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trade Party Type</em>' attribute.
	 * @see #setTradePartyType(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getTradePartyInfo_TradePartyType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TradePartyType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTradePartyType();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyType <em>Trade Party Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Party Type</em>' attribute.
	 * @see #getTradePartyType()
	 * @generated
	 */
	void setTradePartyType(String value);

	/**
	 * Returns the value of the '<em><b>Trade Party Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trade Party Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trade Party Name</em>' attribute.
	 * @see #setTradePartyName(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getTradePartyInfo_TradePartyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TradePartyName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTradePartyName();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyName <em>Trade Party Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Party Name</em>' attribute.
	 * @see #getTradePartyName()
	 * @generated
	 */
	void setTradePartyName(String value);

	/**
	 * Returns the value of the '<em><b>Trade Party Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trade Party Address 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trade Party Address</em>' attribute.
	 * @see #setTradePartyAddress(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getTradePartyInfo_TradePartyAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TradePartyAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTradePartyAddress();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.TradePartyInfo#getTradePartyAddress <em>Trade Party Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Party Address</em>' attribute.
	 * @see #getTradePartyAddress()
	 * @generated
	 */
	void setTradePartyAddress(String value);

} // TradePartyInfo
