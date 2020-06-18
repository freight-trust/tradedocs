/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bond Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bond Specific Information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.BondData#getBondName <em>Bond Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BondData#getBondNumber <em>Bond Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BondData#getBondType <em>Bond Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BondData#getSuretyCode <em>Surety Code</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BondData#getAgentIDNbr <em>Agent ID Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BondData#getFiler <em>Filer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.BondData#getBondAmount <em>Bond Amount</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getBondData()
 * @model extendedMetaData="name='BondData' kind='elementOnly'"
 * @generated
 */
public interface BondData extends EObject {
	/**
	 * Returns the value of the '<em><b>Bond Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of Bond - Single TXN, ISF Bond etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bond Name</em>' attribute.
	 * @see #setBondName(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBondData_BondName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BondName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBondName();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BondData#getBondName <em>Bond Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bond Name</em>' attribute.
	 * @see #getBondName()
	 * @generated
	 */
	void setBondName(String value);

	/**
	 * Returns the value of the '<em><b>Bond Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bond Number (ID)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bond Number</em>' attribute.
	 * @see #setBondNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBondData_BondNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BondNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBondNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BondData#getBondNumber <em>Bond Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bond Number</em>' attribute.
	 * @see #getBondNumber()
	 * @generated
	 */
	void setBondNumber(String value);

	/**
	 * Returns the value of the '<em><b>Bond Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Bond
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bond Type</em>' attribute.
	 * @see #setBondType(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBondData_BondType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BondType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBondType();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BondData#getBondType <em>Bond Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bond Type</em>' attribute.
	 * @see #getBondType()
	 * @generated
	 */
	void setBondType(String value);

	/**
	 * Returns the value of the '<em><b>Surety Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SuretyCode
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surety Code</em>' attribute.
	 * @see #setSuretyCode(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBondData_SuretyCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SuretyCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSuretyCode();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BondData#getSuretyCode <em>Surety Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surety Code</em>' attribute.
	 * @see #getSuretyCode()
	 * @generated
	 */
	void setSuretyCode(String value);

	/**
	 * Returns the value of the '<em><b>Agent ID Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AgentIDNbr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent ID Nbr</em>' attribute.
	 * @see #setAgentIDNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBondData_AgentIDNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AgentIDNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAgentIDNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BondData#getAgentIDNbr <em>Agent ID Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent ID Nbr</em>' attribute.
	 * @see #getAgentIDNbr()
	 * @generated
	 */
	void setAgentIDNbr(String value);

	/**
	 * Returns the value of the '<em><b>Filer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filer</em>' attribute.
	 * @see #setFiler(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBondData_Filer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Filer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFiler();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BondData#getFiler <em>Filer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filer</em>' attribute.
	 * @see #getFiler()
	 * @generated
	 */
	void setFiler(String value);

	/**
	 * Returns the value of the '<em><b>Bond Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of the Bond in USD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bond Amount</em>' attribute.
	 * @see #setBondAmount(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getBondData_BondAmount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BondAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBondAmount();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.BondData#getBondAmount <em>Bond Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bond Amount</em>' attribute.
	 * @see #getBondAmount()
	 * @generated
	 */
	void setBondAmount(String value);

} // BondData
