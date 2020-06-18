/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.CommodityData;
import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.TradeParties;
import gov.dhs.cbp.dis.VehicleAndEngineData;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commodity Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getEntryLineNumber <em>Entry Line Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getHTSNumber <em>HTS Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getCommodityDescription <em>Commodity Description</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getCountryOfOrigin <em>Country Of Origin</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getContainerNbr <em>Container Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getPortOfLading <em>Port Of Lading</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getPortOfUnlading <em>Port Of Unlading</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getPortOfEntry <em>Port Of Entry</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getPPQSignature <em>PPQ Signature</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getSealNumbers <em>Seal Numbers</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getTradeParties <em>Trade Parties</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getFilerReferenceNumber <em>Filer Reference Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityDataImpl#getVehicleAndEngineData <em>Vehicle And Engine Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommodityDataImpl extends MinimalEObjectImpl.Container implements CommodityData {
	/**
	 * The default value of the '{@link #getEntryLineNumber() <em>Entry Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ENTRY_LINE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEntryLineNumber() <em>Entry Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryLineNumber()
	 * @generated
	 * @ordered
	 */
	protected int entryLineNumber = ENTRY_LINE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Entry Line Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean entryLineNumberESet;

	/**
	 * The default value of the '{@link #getHTSNumber() <em>HTS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTSNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String HTS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHTSNumber() <em>HTS Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTSNumber()
	 * @generated
	 * @ordered
	 */
	protected String hTSNumber = HTS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommodityDescription() <em>Commodity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMODITY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommodityDescription() <em>Commodity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityDescription()
	 * @generated
	 * @ordered
	 */
	protected String commodityDescription = COMMODITY_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountryOfOrigin() <em>Country Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryOfOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_OF_ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryOfOrigin() <em>Country Of Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryOfOrigin()
	 * @generated
	 * @ordered
	 */
	protected String countryOfOrigin = COUNTRY_OF_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerNbr() <em>Container Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerNbr() <em>Container Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerNbr()
	 * @generated
	 * @ordered
	 */
	protected String containerNbr = CONTAINER_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ARRIVAL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar arrivalDate = ARRIVAL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortOfLading() <em>Port Of Lading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfLading()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_OF_LADING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortOfLading() <em>Port Of Lading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfLading()
	 * @generated
	 * @ordered
	 */
	protected String portOfLading = PORT_OF_LADING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortOfUnlading() <em>Port Of Unlading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfUnlading()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_OF_UNLADING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortOfUnlading() <em>Port Of Unlading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfUnlading()
	 * @generated
	 * @ordered
	 */
	protected String portOfUnlading = PORT_OF_UNLADING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortOfEntry() <em>Port Of Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfEntry()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_OF_ENTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortOfEntry() <em>Port Of Entry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortOfEntry()
	 * @generated
	 * @ordered
	 */
	protected String portOfEntry = PORT_OF_ENTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPPQSignature() <em>PPQ Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPQSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String PPQ_SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPPQSignature() <em>PPQ Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPPQSignature()
	 * @generated
	 * @ordered
	 */
	protected String pPQSignature = PPQ_SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSealNumbers() <em>Seal Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final String SEAL_NUMBERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSealNumbers() <em>Seal Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSealNumbers()
	 * @generated
	 * @ordered
	 */
	protected String sealNumbers = SEAL_NUMBERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTradeParties() <em>Trade Parties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradeParties()
	 * @generated
	 * @ordered
	 */
	protected TradeParties tradeParties;

	/**
	 * The default value of the '{@link #getFilerReferenceNumber() <em>Filer Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilerReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FILER_REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilerReferenceNumber() <em>Filer Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilerReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String filerReferenceNumber = FILER_REFERENCE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVehicleAndEngineData() <em>Vehicle And Engine Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleAndEngineData()
	 * @generated
	 * @ordered
	 */
	protected VehicleAndEngineData vehicleAndEngineData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommodityDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.COMMODITY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEntryLineNumber() {
		return entryLineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryLineNumber(int newEntryLineNumber) {
		int oldEntryLineNumber = entryLineNumber;
		entryLineNumber = newEntryLineNumber;
		boolean oldEntryLineNumberESet = entryLineNumberESet;
		entryLineNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__ENTRY_LINE_NUMBER, oldEntryLineNumber, entryLineNumber, !oldEntryLineNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEntryLineNumber() {
		int oldEntryLineNumber = entryLineNumber;
		boolean oldEntryLineNumberESet = entryLineNumberESet;
		entryLineNumber = ENTRY_LINE_NUMBER_EDEFAULT;
		entryLineNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DisPackage.COMMODITY_DATA__ENTRY_LINE_NUMBER, oldEntryLineNumber, ENTRY_LINE_NUMBER_EDEFAULT, oldEntryLineNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEntryLineNumber() {
		return entryLineNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHTSNumber() {
		return hTSNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTSNumber(String newHTSNumber) {
		String oldHTSNumber = hTSNumber;
		hTSNumber = newHTSNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__HTS_NUMBER, oldHTSNumber, hTSNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommodityDescription() {
		return commodityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommodityDescription(String newCommodityDescription) {
		String oldCommodityDescription = commodityDescription;
		commodityDescription = newCommodityDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__COMMODITY_DESCRIPTION, oldCommodityDescription, commodityDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryOfOrigin(String newCountryOfOrigin) {
		String oldCountryOfOrigin = countryOfOrigin;
		countryOfOrigin = newCountryOfOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__COUNTRY_OF_ORIGIN, oldCountryOfOrigin, countryOfOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerNbr() {
		return containerNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerNbr(String newContainerNbr) {
		String oldContainerNbr = containerNbr;
		containerNbr = newContainerNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__CONTAINER_NBR, oldContainerNbr, containerNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalDate(XMLGregorianCalendar newArrivalDate) {
		XMLGregorianCalendar oldArrivalDate = arrivalDate;
		arrivalDate = newArrivalDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__ARRIVAL_DATE, oldArrivalDate, arrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortOfLading() {
		return portOfLading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortOfLading(String newPortOfLading) {
		String oldPortOfLading = portOfLading;
		portOfLading = newPortOfLading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__PORT_OF_LADING, oldPortOfLading, portOfLading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortOfUnlading() {
		return portOfUnlading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortOfUnlading(String newPortOfUnlading) {
		String oldPortOfUnlading = portOfUnlading;
		portOfUnlading = newPortOfUnlading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__PORT_OF_UNLADING, oldPortOfUnlading, portOfUnlading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortOfEntry() {
		return portOfEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortOfEntry(String newPortOfEntry) {
		String oldPortOfEntry = portOfEntry;
		portOfEntry = newPortOfEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__PORT_OF_ENTRY, oldPortOfEntry, portOfEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPPQSignature() {
		return pPQSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPPQSignature(String newPPQSignature) {
		String oldPPQSignature = pPQSignature;
		pPQSignature = newPPQSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__PPQ_SIGNATURE, oldPPQSignature, pPQSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSealNumbers() {
		return sealNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSealNumbers(String newSealNumbers) {
		String oldSealNumbers = sealNumbers;
		sealNumbers = newSealNumbers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__SEAL_NUMBERS, oldSealNumbers, sealNumbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradeParties getTradeParties() {
		return tradeParties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTradeParties(TradeParties newTradeParties, NotificationChain msgs) {
		TradeParties oldTradeParties = tradeParties;
		tradeParties = newTradeParties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__TRADE_PARTIES, oldTradeParties, newTradeParties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTradeParties(TradeParties newTradeParties) {
		if (newTradeParties != tradeParties) {
			NotificationChain msgs = null;
			if (tradeParties != null)
				msgs = ((InternalEObject)tradeParties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.COMMODITY_DATA__TRADE_PARTIES, null, msgs);
			if (newTradeParties != null)
				msgs = ((InternalEObject)newTradeParties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.COMMODITY_DATA__TRADE_PARTIES, null, msgs);
			msgs = basicSetTradeParties(newTradeParties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__TRADE_PARTIES, newTradeParties, newTradeParties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilerReferenceNumber() {
		return filerReferenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilerReferenceNumber(String newFilerReferenceNumber) {
		String oldFilerReferenceNumber = filerReferenceNumber;
		filerReferenceNumber = newFilerReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__FILER_REFERENCE_NUMBER, oldFilerReferenceNumber, filerReferenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleAndEngineData getVehicleAndEngineData() {
		return vehicleAndEngineData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicleAndEngineData(VehicleAndEngineData newVehicleAndEngineData, NotificationChain msgs) {
		VehicleAndEngineData oldVehicleAndEngineData = vehicleAndEngineData;
		vehicleAndEngineData = newVehicleAndEngineData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA, oldVehicleAndEngineData, newVehicleAndEngineData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleAndEngineData(VehicleAndEngineData newVehicleAndEngineData) {
		if (newVehicleAndEngineData != vehicleAndEngineData) {
			NotificationChain msgs = null;
			if (vehicleAndEngineData != null)
				msgs = ((InternalEObject)vehicleAndEngineData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA, null, msgs);
			if (newVehicleAndEngineData != null)
				msgs = ((InternalEObject)newVehicleAndEngineData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA, null, msgs);
			msgs = basicSetVehicleAndEngineData(newVehicleAndEngineData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA, newVehicleAndEngineData, newVehicleAndEngineData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.COMMODITY_DATA__TRADE_PARTIES:
				return basicSetTradeParties(null, msgs);
			case DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA:
				return basicSetVehicleAndEngineData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.COMMODITY_DATA__ENTRY_LINE_NUMBER:
				return getEntryLineNumber();
			case DisPackage.COMMODITY_DATA__HTS_NUMBER:
				return getHTSNumber();
			case DisPackage.COMMODITY_DATA__COMMODITY_DESCRIPTION:
				return getCommodityDescription();
			case DisPackage.COMMODITY_DATA__COUNTRY_OF_ORIGIN:
				return getCountryOfOrigin();
			case DisPackage.COMMODITY_DATA__CONTAINER_NBR:
				return getContainerNbr();
			case DisPackage.COMMODITY_DATA__ARRIVAL_DATE:
				return getArrivalDate();
			case DisPackage.COMMODITY_DATA__PORT_OF_LADING:
				return getPortOfLading();
			case DisPackage.COMMODITY_DATA__PORT_OF_UNLADING:
				return getPortOfUnlading();
			case DisPackage.COMMODITY_DATA__PORT_OF_ENTRY:
				return getPortOfEntry();
			case DisPackage.COMMODITY_DATA__PPQ_SIGNATURE:
				return getPPQSignature();
			case DisPackage.COMMODITY_DATA__SEAL_NUMBERS:
				return getSealNumbers();
			case DisPackage.COMMODITY_DATA__TRADE_PARTIES:
				return getTradeParties();
			case DisPackage.COMMODITY_DATA__FILER_REFERENCE_NUMBER:
				return getFilerReferenceNumber();
			case DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA:
				return getVehicleAndEngineData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DisPackage.COMMODITY_DATA__ENTRY_LINE_NUMBER:
				setEntryLineNumber((Integer)newValue);
				return;
			case DisPackage.COMMODITY_DATA__HTS_NUMBER:
				setHTSNumber((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__COMMODITY_DESCRIPTION:
				setCommodityDescription((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__COUNTRY_OF_ORIGIN:
				setCountryOfOrigin((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__CONTAINER_NBR:
				setContainerNbr((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__ARRIVAL_DATE:
				setArrivalDate((XMLGregorianCalendar)newValue);
				return;
			case DisPackage.COMMODITY_DATA__PORT_OF_LADING:
				setPortOfLading((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__PORT_OF_UNLADING:
				setPortOfUnlading((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__PORT_OF_ENTRY:
				setPortOfEntry((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__PPQ_SIGNATURE:
				setPPQSignature((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__SEAL_NUMBERS:
				setSealNumbers((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__TRADE_PARTIES:
				setTradeParties((TradeParties)newValue);
				return;
			case DisPackage.COMMODITY_DATA__FILER_REFERENCE_NUMBER:
				setFilerReferenceNumber((String)newValue);
				return;
			case DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA:
				setVehicleAndEngineData((VehicleAndEngineData)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DisPackage.COMMODITY_DATA__ENTRY_LINE_NUMBER:
				unsetEntryLineNumber();
				return;
			case DisPackage.COMMODITY_DATA__HTS_NUMBER:
				setHTSNumber(HTS_NUMBER_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__COMMODITY_DESCRIPTION:
				setCommodityDescription(COMMODITY_DESCRIPTION_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__COUNTRY_OF_ORIGIN:
				setCountryOfOrigin(COUNTRY_OF_ORIGIN_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__CONTAINER_NBR:
				setContainerNbr(CONTAINER_NBR_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__ARRIVAL_DATE:
				setArrivalDate(ARRIVAL_DATE_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__PORT_OF_LADING:
				setPortOfLading(PORT_OF_LADING_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__PORT_OF_UNLADING:
				setPortOfUnlading(PORT_OF_UNLADING_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__PORT_OF_ENTRY:
				setPortOfEntry(PORT_OF_ENTRY_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__PPQ_SIGNATURE:
				setPPQSignature(PPQ_SIGNATURE_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__SEAL_NUMBERS:
				setSealNumbers(SEAL_NUMBERS_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__TRADE_PARTIES:
				setTradeParties((TradeParties)null);
				return;
			case DisPackage.COMMODITY_DATA__FILER_REFERENCE_NUMBER:
				setFilerReferenceNumber(FILER_REFERENCE_NUMBER_EDEFAULT);
				return;
			case DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA:
				setVehicleAndEngineData((VehicleAndEngineData)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DisPackage.COMMODITY_DATA__ENTRY_LINE_NUMBER:
				return isSetEntryLineNumber();
			case DisPackage.COMMODITY_DATA__HTS_NUMBER:
				return HTS_NUMBER_EDEFAULT == null ? hTSNumber != null : !HTS_NUMBER_EDEFAULT.equals(hTSNumber);
			case DisPackage.COMMODITY_DATA__COMMODITY_DESCRIPTION:
				return COMMODITY_DESCRIPTION_EDEFAULT == null ? commodityDescription != null : !COMMODITY_DESCRIPTION_EDEFAULT.equals(commodityDescription);
			case DisPackage.COMMODITY_DATA__COUNTRY_OF_ORIGIN:
				return COUNTRY_OF_ORIGIN_EDEFAULT == null ? countryOfOrigin != null : !COUNTRY_OF_ORIGIN_EDEFAULT.equals(countryOfOrigin);
			case DisPackage.COMMODITY_DATA__CONTAINER_NBR:
				return CONTAINER_NBR_EDEFAULT == null ? containerNbr != null : !CONTAINER_NBR_EDEFAULT.equals(containerNbr);
			case DisPackage.COMMODITY_DATA__ARRIVAL_DATE:
				return ARRIVAL_DATE_EDEFAULT == null ? arrivalDate != null : !ARRIVAL_DATE_EDEFAULT.equals(arrivalDate);
			case DisPackage.COMMODITY_DATA__PORT_OF_LADING:
				return PORT_OF_LADING_EDEFAULT == null ? portOfLading != null : !PORT_OF_LADING_EDEFAULT.equals(portOfLading);
			case DisPackage.COMMODITY_DATA__PORT_OF_UNLADING:
				return PORT_OF_UNLADING_EDEFAULT == null ? portOfUnlading != null : !PORT_OF_UNLADING_EDEFAULT.equals(portOfUnlading);
			case DisPackage.COMMODITY_DATA__PORT_OF_ENTRY:
				return PORT_OF_ENTRY_EDEFAULT == null ? portOfEntry != null : !PORT_OF_ENTRY_EDEFAULT.equals(portOfEntry);
			case DisPackage.COMMODITY_DATA__PPQ_SIGNATURE:
				return PPQ_SIGNATURE_EDEFAULT == null ? pPQSignature != null : !PPQ_SIGNATURE_EDEFAULT.equals(pPQSignature);
			case DisPackage.COMMODITY_DATA__SEAL_NUMBERS:
				return SEAL_NUMBERS_EDEFAULT == null ? sealNumbers != null : !SEAL_NUMBERS_EDEFAULT.equals(sealNumbers);
			case DisPackage.COMMODITY_DATA__TRADE_PARTIES:
				return tradeParties != null;
			case DisPackage.COMMODITY_DATA__FILER_REFERENCE_NUMBER:
				return FILER_REFERENCE_NUMBER_EDEFAULT == null ? filerReferenceNumber != null : !FILER_REFERENCE_NUMBER_EDEFAULT.equals(filerReferenceNumber);
			case DisPackage.COMMODITY_DATA__VEHICLE_AND_ENGINE_DATA:
				return vehicleAndEngineData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (entryLineNumber: ");
		if (entryLineNumberESet) result.append(entryLineNumber); else result.append("<unset>");
		result.append(", hTSNumber: ");
		result.append(hTSNumber);
		result.append(", commodityDescription: ");
		result.append(commodityDescription);
		result.append(", countryOfOrigin: ");
		result.append(countryOfOrigin);
		result.append(", containerNbr: ");
		result.append(containerNbr);
		result.append(", arrivalDate: ");
		result.append(arrivalDate);
		result.append(", portOfLading: ");
		result.append(portOfLading);
		result.append(", portOfUnlading: ");
		result.append(portOfUnlading);
		result.append(", portOfEntry: ");
		result.append(portOfEntry);
		result.append(", pPQSignature: ");
		result.append(pPQSignature);
		result.append(", sealNumbers: ");
		result.append(sealNumbers);
		result.append(", filerReferenceNumber: ");
		result.append(filerReferenceNumber);
		result.append(')');
		return result.toString();
	}

} //CommodityDataImpl
