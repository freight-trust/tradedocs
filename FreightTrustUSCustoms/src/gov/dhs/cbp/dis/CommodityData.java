/**
 */
package gov.dhs.cbp.dis;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commodity Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Commodity Information. Provide what is available
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getEntryLineNumber <em>Entry Line Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getHTSNumber <em>HTS Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getCommodityDescription <em>Commodity Description</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getCountryOfOrigin <em>Country Of Origin</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getContainerNbr <em>Container Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getPortOfLading <em>Port Of Lading</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getPortOfUnlading <em>Port Of Unlading</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getPortOfEntry <em>Port Of Entry</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getPPQSignature <em>PPQ Signature</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getSealNumbers <em>Seal Numbers</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getTradeParties <em>Trade Parties</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getFilerReferenceNumber <em>Filer Reference Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.CommodityData#getVehicleAndEngineData <em>Vehicle And Engine Data</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData()
 * @model extendedMetaData="name='CommodityData' kind='elementOnly'"
 * @generated
 */
public interface CommodityData extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entry Line Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Line Number</em>' attribute.
	 * @see #isSetEntryLineNumber()
	 * @see #unsetEntryLineNumber()
	 * @see #setEntryLineNumber(int)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_EntryLineNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='EntryLineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	int getEntryLineNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getEntryLineNumber <em>Entry Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Line Number</em>' attribute.
	 * @see #isSetEntryLineNumber()
	 * @see #unsetEntryLineNumber()
	 * @see #getEntryLineNumber()
	 * @generated
	 */
	void setEntryLineNumber(int value);

	/**
	 * Unsets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getEntryLineNumber <em>Entry Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEntryLineNumber()
	 * @see #getEntryLineNumber()
	 * @see #setEntryLineNumber(int)
	 * @generated
	 */
	void unsetEntryLineNumber();

	/**
	 * Returns whether the value of the '{@link gov.dhs.cbp.dis.CommodityData#getEntryLineNumber <em>Entry Line Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Entry Line Number</em>' attribute is set.
	 * @see #unsetEntryLineNumber()
	 * @see #getEntryLineNumber()
	 * @see #setEntryLineNumber(int)
	 * @generated
	 */
	boolean isSetEntryLineNumber();

	/**
	 * Returns the value of the '<em><b>HTS Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTS Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HTS Number</em>' attribute.
	 * @see #setHTSNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_HTSNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='HTSNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHTSNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getHTSNumber <em>HTS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTS Number</em>' attribute.
	 * @see #getHTSNumber()
	 * @generated
	 */
	void setHTSNumber(String value);

	/**
	 * Returns the value of the '<em><b>Commodity Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commodity Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commodity Description</em>' attribute.
	 * @see #setCommodityDescription(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_CommodityDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CommodityDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCommodityDescription();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getCommodityDescription <em>Commodity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity Description</em>' attribute.
	 * @see #getCommodityDescription()
	 * @generated
	 */
	void setCommodityDescription(String value);

	/**
	 * Returns the value of the '<em><b>Country Of Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Country Of Origin - UNLOC
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Of Origin</em>' attribute.
	 * @see #setCountryOfOrigin(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_CountryOfOrigin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CountryOfOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountryOfOrigin();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getCountryOfOrigin <em>Country Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Of Origin</em>' attribute.
	 * @see #getCountryOfOrigin()
	 * @generated
	 */
	void setCountryOfOrigin(String value);

	/**
	 * Returns the value of the '<em><b>Container Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container Nbr</em>' attribute.
	 * @see #setContainerNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_ContainerNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ContainerNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContainerNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getContainerNbr <em>Container Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Nbr</em>' attribute.
	 * @see #getContainerNbr()
	 * @generated
	 */
	void setContainerNbr(String value);

	/**
	 * Returns the value of the '<em><b>Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date the goods are expected. EST Format 2010-05-25T00:34:47.0Z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arrival Date</em>' attribute.
	 * @see #setArrivalDate(XMLGregorianCalendar)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_ArrivalDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='ArrivalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getArrivalDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getArrivalDate <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Date</em>' attribute.
	 * @see #getArrivalDate()
	 * @generated
	 */
	void setArrivalDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Port Of Lading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port of Lading - Schedule D
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Of Lading</em>' attribute.
	 * @see #setPortOfLading(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_PortOfLading()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PortOfLading' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPortOfLading();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getPortOfLading <em>Port Of Lading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Of Lading</em>' attribute.
	 * @see #getPortOfLading()
	 * @generated
	 */
	void setPortOfLading(String value);

	/**
	 * Returns the value of the '<em><b>Port Of Unlading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port of Unlading - Schedule K
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Of Unlading</em>' attribute.
	 * @see #setPortOfUnlading(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_PortOfUnlading()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PortOfUnlading' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPortOfUnlading();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getPortOfUnlading <em>Port Of Unlading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Of Unlading</em>' attribute.
	 * @see #getPortOfUnlading()
	 * @generated
	 */
	void setPortOfUnlading(String value);

	/**
	 * Returns the value of the '<em><b>Port Of Entry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Port of Entry - Schedule K
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Of Entry</em>' attribute.
	 * @see #setPortOfEntry(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_PortOfEntry()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PortOfEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPortOfEntry();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getPortOfEntry <em>Port Of Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Of Entry</em>' attribute.
	 * @see #getPortOfEntry()
	 * @generated
	 */
	void setPortOfEntry(String value);

	/**
	 * Returns the value of the '<em><b>PPQ Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PPQSignature
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PPQ Signature</em>' attribute.
	 * @see #setPPQSignature(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_PPQSignature()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PPQSignature' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPPQSignature();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getPPQSignature <em>PPQ Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PPQ Signature</em>' attribute.
	 * @see #getPPQSignature()
	 * @generated
	 */
	void setPPQSignature(String value);

	/**
	 * Returns the value of the '<em><b>Seal Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple Seal Numbers supplied as a comma separated string ex. ABC123, DEF123, GHI123
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seal Numbers</em>' attribute.
	 * @see #setSealNumbers(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_SealNumbers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SealNumbers' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSealNumbers();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getSealNumbers <em>Seal Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seal Numbers</em>' attribute.
	 * @see #getSealNumbers()
	 * @generated
	 */
	void setSealNumbers(String value);

	/**
	 * Returns the value of the '<em><b>Trade Parties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commodity Manufacturer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trade Parties</em>' containment reference.
	 * @see #setTradeParties(TradeParties)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_TradeParties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TradeParties' namespace='##targetNamespace'"
	 * @generated
	 */
	TradeParties getTradeParties();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getTradeParties <em>Trade Parties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Parties</em>' containment reference.
	 * @see #getTradeParties()
	 * @generated
	 */
	void setTradeParties(TradeParties value);

	/**
	 * Returns the value of the '<em><b>Filer Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FilerReferenceNumber
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filer Reference Number</em>' attribute.
	 * @see #setFilerReferenceNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_FilerReferenceNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FilerReferenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFilerReferenceNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getFilerReferenceNumber <em>Filer Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filer Reference Number</em>' attribute.
	 * @see #getFilerReferenceNumber()
	 * @generated
	 */
	void setFilerReferenceNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle And Engine Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VehicleAndEngineData
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle And Engine Data</em>' containment reference.
	 * @see #setVehicleAndEngineData(VehicleAndEngineData)
	 * @see gov.dhs.cbp.dis.DisPackage#getCommodityData_VehicleAndEngineData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VehicleAndEngineData' namespace='##targetNamespace'"
	 * @generated
	 */
	VehicleAndEngineData getVehicleAndEngineData();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.CommodityData#getVehicleAndEngineData <em>Vehicle And Engine Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle And Engine Data</em>' containment reference.
	 * @see #getVehicleAndEngineData()
	 * @generated
	 */
	void setVehicleAndEngineData(VehicleAndEngineData value);

} // CommodityData
