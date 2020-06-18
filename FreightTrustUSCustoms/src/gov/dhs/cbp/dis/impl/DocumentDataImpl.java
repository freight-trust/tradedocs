/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.ContactInfoType;
import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.DocumentData;
import gov.dhs.cbp.dis.DocumentHeader;
import gov.dhs.cbp.dis.GovtAgencyList;
import gov.dhs.cbp.dis.OptionalData;
import gov.dhs.cbp.dis.VesselDataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentDataImpl#getDocumentHeader <em>Document Header</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentDataImpl#getGovtAgencyList <em>Govt Agency List</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentDataImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentDataImpl#getOptionalData <em>Optional Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentDataImpl#getVesselData <em>Vessel Data</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentDataImpl#getContactInfo <em>Contact Info</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentDataImpl#getDocumentObject <em>Document Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentDataImpl extends MinimalEObjectImpl.Container implements DocumentData {
	/**
	 * The cached value of the '{@link #getDocumentHeader() <em>Document Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentHeader()
	 * @generated
	 * @ordered
	 */
	protected DocumentHeader documentHeader;

	/**
	 * The cached value of the '{@link #getGovtAgencyList() <em>Govt Agency List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovtAgencyList()
	 * @generated
	 * @ordered
	 */
	protected GovtAgencyList govtAgencyList;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptionalData() <em>Optional Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalData()
	 * @generated
	 * @ordered
	 */
	protected OptionalData optionalData;

	/**
	 * The cached value of the '{@link #getVesselData() <em>Vessel Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselData()
	 * @generated
	 * @ordered
	 */
	protected VesselDataType vesselData;

	/**
	 * The cached value of the '{@link #getContactInfo() <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInfo()
	 * @generated
	 * @ordered
	 */
	protected ContactInfoType contactInfo;

	/**
	 * The default value of the '{@link #getDocumentObject() <em>Document Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentObject()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentObject() <em>Document Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentObject()
	 * @generated
	 * @ordered
	 */
	protected String documentObject = DOCUMENT_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.DOCUMENT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentHeader getDocumentHeader() {
		return documentHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentHeader(DocumentHeader newDocumentHeader, NotificationChain msgs) {
		DocumentHeader oldDocumentHeader = documentHeader;
		documentHeader = newDocumentHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER, oldDocumentHeader, newDocumentHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentHeader(DocumentHeader newDocumentHeader) {
		if (newDocumentHeader != documentHeader) {
			NotificationChain msgs = null;
			if (documentHeader != null)
				msgs = ((InternalEObject)documentHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER, null, msgs);
			if (newDocumentHeader != null)
				msgs = ((InternalEObject)newDocumentHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER, null, msgs);
			msgs = basicSetDocumentHeader(newDocumentHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER, newDocumentHeader, newDocumentHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GovtAgencyList getGovtAgencyList() {
		return govtAgencyList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGovtAgencyList(GovtAgencyList newGovtAgencyList, NotificationChain msgs) {
		GovtAgencyList oldGovtAgencyList = govtAgencyList;
		govtAgencyList = newGovtAgencyList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST, oldGovtAgencyList, newGovtAgencyList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGovtAgencyList(GovtAgencyList newGovtAgencyList) {
		if (newGovtAgencyList != govtAgencyList) {
			NotificationChain msgs = null;
			if (govtAgencyList != null)
				msgs = ((InternalEObject)govtAgencyList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST, null, msgs);
			if (newGovtAgencyList != null)
				msgs = ((InternalEObject)newGovtAgencyList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST, null, msgs);
			msgs = basicSetGovtAgencyList(newGovtAgencyList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST, newGovtAgencyList, newGovtAgencyList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalData getOptionalData() {
		return optionalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionalData(OptionalData newOptionalData, NotificationChain msgs) {
		OptionalData oldOptionalData = optionalData;
		optionalData = newOptionalData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__OPTIONAL_DATA, oldOptionalData, newOptionalData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalData(OptionalData newOptionalData) {
		if (newOptionalData != optionalData) {
			NotificationChain msgs = null;
			if (optionalData != null)
				msgs = ((InternalEObject)optionalData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__OPTIONAL_DATA, null, msgs);
			if (newOptionalData != null)
				msgs = ((InternalEObject)newOptionalData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__OPTIONAL_DATA, null, msgs);
			msgs = basicSetOptionalData(newOptionalData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__OPTIONAL_DATA, newOptionalData, newOptionalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VesselDataType getVesselData() {
		return vesselData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVesselData(VesselDataType newVesselData, NotificationChain msgs) {
		VesselDataType oldVesselData = vesselData;
		vesselData = newVesselData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__VESSEL_DATA, oldVesselData, newVesselData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVesselData(VesselDataType newVesselData) {
		if (newVesselData != vesselData) {
			NotificationChain msgs = null;
			if (vesselData != null)
				msgs = ((InternalEObject)vesselData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__VESSEL_DATA, null, msgs);
			if (newVesselData != null)
				msgs = ((InternalEObject)newVesselData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__VESSEL_DATA, null, msgs);
			msgs = basicSetVesselData(newVesselData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__VESSEL_DATA, newVesselData, newVesselData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInfoType getContactInfo() {
		return contactInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactInfo(ContactInfoType newContactInfo, NotificationChain msgs) {
		ContactInfoType oldContactInfo = contactInfo;
		contactInfo = newContactInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__CONTACT_INFO, oldContactInfo, newContactInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactInfo(ContactInfoType newContactInfo) {
		if (newContactInfo != contactInfo) {
			NotificationChain msgs = null;
			if (contactInfo != null)
				msgs = ((InternalEObject)contactInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__CONTACT_INFO, null, msgs);
			if (newContactInfo != null)
				msgs = ((InternalEObject)newContactInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.DOCUMENT_DATA__CONTACT_INFO, null, msgs);
			msgs = basicSetContactInfo(newContactInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__CONTACT_INFO, newContactInfo, newContactInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentObject() {
		return documentObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentObject(String newDocumentObject) {
		String oldDocumentObject = documentObject;
		documentObject = newDocumentObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_DATA__DOCUMENT_OBJECT, oldDocumentObject, documentObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER:
				return basicSetDocumentHeader(null, msgs);
			case DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST:
				return basicSetGovtAgencyList(null, msgs);
			case DisPackage.DOCUMENT_DATA__OPTIONAL_DATA:
				return basicSetOptionalData(null, msgs);
			case DisPackage.DOCUMENT_DATA__VESSEL_DATA:
				return basicSetVesselData(null, msgs);
			case DisPackage.DOCUMENT_DATA__CONTACT_INFO:
				return basicSetContactInfo(null, msgs);
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
			case DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER:
				return getDocumentHeader();
			case DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST:
				return getGovtAgencyList();
			case DisPackage.DOCUMENT_DATA__COMMENT:
				return getComment();
			case DisPackage.DOCUMENT_DATA__OPTIONAL_DATA:
				return getOptionalData();
			case DisPackage.DOCUMENT_DATA__VESSEL_DATA:
				return getVesselData();
			case DisPackage.DOCUMENT_DATA__CONTACT_INFO:
				return getContactInfo();
			case DisPackage.DOCUMENT_DATA__DOCUMENT_OBJECT:
				return getDocumentObject();
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
			case DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER:
				setDocumentHeader((DocumentHeader)newValue);
				return;
			case DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST:
				setGovtAgencyList((GovtAgencyList)newValue);
				return;
			case DisPackage.DOCUMENT_DATA__COMMENT:
				setComment((String)newValue);
				return;
			case DisPackage.DOCUMENT_DATA__OPTIONAL_DATA:
				setOptionalData((OptionalData)newValue);
				return;
			case DisPackage.DOCUMENT_DATA__VESSEL_DATA:
				setVesselData((VesselDataType)newValue);
				return;
			case DisPackage.DOCUMENT_DATA__CONTACT_INFO:
				setContactInfo((ContactInfoType)newValue);
				return;
			case DisPackage.DOCUMENT_DATA__DOCUMENT_OBJECT:
				setDocumentObject((String)newValue);
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
			case DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER:
				setDocumentHeader((DocumentHeader)null);
				return;
			case DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST:
				setGovtAgencyList((GovtAgencyList)null);
				return;
			case DisPackage.DOCUMENT_DATA__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case DisPackage.DOCUMENT_DATA__OPTIONAL_DATA:
				setOptionalData((OptionalData)null);
				return;
			case DisPackage.DOCUMENT_DATA__VESSEL_DATA:
				setVesselData((VesselDataType)null);
				return;
			case DisPackage.DOCUMENT_DATA__CONTACT_INFO:
				setContactInfo((ContactInfoType)null);
				return;
			case DisPackage.DOCUMENT_DATA__DOCUMENT_OBJECT:
				setDocumentObject(DOCUMENT_OBJECT_EDEFAULT);
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
			case DisPackage.DOCUMENT_DATA__DOCUMENT_HEADER:
				return documentHeader != null;
			case DisPackage.DOCUMENT_DATA__GOVT_AGENCY_LIST:
				return govtAgencyList != null;
			case DisPackage.DOCUMENT_DATA__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case DisPackage.DOCUMENT_DATA__OPTIONAL_DATA:
				return optionalData != null;
			case DisPackage.DOCUMENT_DATA__VESSEL_DATA:
				return vesselData != null;
			case DisPackage.DOCUMENT_DATA__CONTACT_INFO:
				return contactInfo != null;
			case DisPackage.DOCUMENT_DATA__DOCUMENT_OBJECT:
				return DOCUMENT_OBJECT_EDEFAULT == null ? documentObject != null : !DOCUMENT_OBJECT_EDEFAULT.equals(documentObject);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", documentObject: ");
		result.append(documentObject);
		result.append(')');
		return result.toString();
	}

} //DocumentDataImpl
