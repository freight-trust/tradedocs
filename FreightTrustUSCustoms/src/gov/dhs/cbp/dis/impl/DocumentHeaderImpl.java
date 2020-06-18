/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.DocumentHeader;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl#getDocumentID <em>Document ID</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl#getDocumentLabel <em>Document Label</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl#getCompleteFileName <em>Complete File Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl#getFileExtensionType <em>File Extension Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl#getDocumentDescription <em>Document Description</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl#getDocumentSentDate <em>Document Sent Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.DocumentHeaderImpl#getDocPreviouslySubmitted <em>Doc Previously Submitted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentHeaderImpl extends MinimalEObjectImpl.Container implements DocumentHeader {
	/**
	 * The default value of the '{@link #getDocumentID() <em>Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentID()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentID() <em>Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentID()
	 * @generated
	 * @ordered
	 */
	protected String documentID = DOCUMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentLabel() <em>Document Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentLabel() <em>Document Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentLabel()
	 * @generated
	 * @ordered
	 */
	protected String documentLabel = DOCUMENT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteFileName() <em>Complete File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompleteFileName() <em>Complete File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteFileName()
	 * @generated
	 * @ordered
	 */
	protected String completeFileName = COMPLETE_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileExtensionType() <em>File Extension Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtensionType()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EXTENSION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileExtensionType() <em>File Extension Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtensionType()
	 * @generated
	 * @ordered
	 */
	protected String fileExtensionType = FILE_EXTENSION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentDescription() <em>Document Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentDescription() <em>Document Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentDescription()
	 * @generated
	 * @ordered
	 */
	protected String documentDescription = DOCUMENT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentSentDate() <em>Document Sent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSentDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DOCUMENT_SENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentSentDate() <em>Document Sent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentSentDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar documentSentDate = DOCUMENT_SENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocPreviouslySubmitted() <em>Doc Previously Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocPreviouslySubmitted()
	 * @generated
	 * @ordered
	 */
	protected static final String DOC_PREVIOUSLY_SUBMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocPreviouslySubmitted() <em>Doc Previously Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocPreviouslySubmitted()
	 * @generated
	 * @ordered
	 */
	protected String docPreviouslySubmitted = DOC_PREVIOUSLY_SUBMITTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.DOCUMENT_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentID() {
		return documentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentID(String newDocumentID) {
		String oldDocumentID = documentID;
		documentID = newDocumentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_HEADER__DOCUMENT_ID, oldDocumentID, documentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentLabel() {
		return documentLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentLabel(String newDocumentLabel) {
		String oldDocumentLabel = documentLabel;
		documentLabel = newDocumentLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_HEADER__DOCUMENT_LABEL, oldDocumentLabel, documentLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompleteFileName() {
		return completeFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteFileName(String newCompleteFileName) {
		String oldCompleteFileName = completeFileName;
		completeFileName = newCompleteFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_HEADER__COMPLETE_FILE_NAME, oldCompleteFileName, completeFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileExtensionType() {
		return fileExtensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileExtensionType(String newFileExtensionType) {
		String oldFileExtensionType = fileExtensionType;
		fileExtensionType = newFileExtensionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_HEADER__FILE_EXTENSION_TYPE, oldFileExtensionType, fileExtensionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentDescription() {
		return documentDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentDescription(String newDocumentDescription) {
		String oldDocumentDescription = documentDescription;
		documentDescription = newDocumentDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_HEADER__DOCUMENT_DESCRIPTION, oldDocumentDescription, documentDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDocumentSentDate() {
		return documentSentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentSentDate(XMLGregorianCalendar newDocumentSentDate) {
		XMLGregorianCalendar oldDocumentSentDate = documentSentDate;
		documentSentDate = newDocumentSentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_HEADER__DOCUMENT_SENT_DATE, oldDocumentSentDate, documentSentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocPreviouslySubmitted() {
		return docPreviouslySubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocPreviouslySubmitted(String newDocPreviouslySubmitted) {
		String oldDocPreviouslySubmitted = docPreviouslySubmitted;
		docPreviouslySubmitted = newDocPreviouslySubmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.DOCUMENT_HEADER__DOC_PREVIOUSLY_SUBMITTED, oldDocPreviouslySubmitted, docPreviouslySubmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_ID:
				return getDocumentID();
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_LABEL:
				return getDocumentLabel();
			case DisPackage.DOCUMENT_HEADER__COMPLETE_FILE_NAME:
				return getCompleteFileName();
			case DisPackage.DOCUMENT_HEADER__FILE_EXTENSION_TYPE:
				return getFileExtensionType();
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_DESCRIPTION:
				return getDocumentDescription();
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_SENT_DATE:
				return getDocumentSentDate();
			case DisPackage.DOCUMENT_HEADER__DOC_PREVIOUSLY_SUBMITTED:
				return getDocPreviouslySubmitted();
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
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_ID:
				setDocumentID((String)newValue);
				return;
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_LABEL:
				setDocumentLabel((String)newValue);
				return;
			case DisPackage.DOCUMENT_HEADER__COMPLETE_FILE_NAME:
				setCompleteFileName((String)newValue);
				return;
			case DisPackage.DOCUMENT_HEADER__FILE_EXTENSION_TYPE:
				setFileExtensionType((String)newValue);
				return;
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_DESCRIPTION:
				setDocumentDescription((String)newValue);
				return;
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_SENT_DATE:
				setDocumentSentDate((XMLGregorianCalendar)newValue);
				return;
			case DisPackage.DOCUMENT_HEADER__DOC_PREVIOUSLY_SUBMITTED:
				setDocPreviouslySubmitted((String)newValue);
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
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_ID:
				setDocumentID(DOCUMENT_ID_EDEFAULT);
				return;
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_LABEL:
				setDocumentLabel(DOCUMENT_LABEL_EDEFAULT);
				return;
			case DisPackage.DOCUMENT_HEADER__COMPLETE_FILE_NAME:
				setCompleteFileName(COMPLETE_FILE_NAME_EDEFAULT);
				return;
			case DisPackage.DOCUMENT_HEADER__FILE_EXTENSION_TYPE:
				setFileExtensionType(FILE_EXTENSION_TYPE_EDEFAULT);
				return;
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_DESCRIPTION:
				setDocumentDescription(DOCUMENT_DESCRIPTION_EDEFAULT);
				return;
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_SENT_DATE:
				setDocumentSentDate(DOCUMENT_SENT_DATE_EDEFAULT);
				return;
			case DisPackage.DOCUMENT_HEADER__DOC_PREVIOUSLY_SUBMITTED:
				setDocPreviouslySubmitted(DOC_PREVIOUSLY_SUBMITTED_EDEFAULT);
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
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_ID:
				return DOCUMENT_ID_EDEFAULT == null ? documentID != null : !DOCUMENT_ID_EDEFAULT.equals(documentID);
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_LABEL:
				return DOCUMENT_LABEL_EDEFAULT == null ? documentLabel != null : !DOCUMENT_LABEL_EDEFAULT.equals(documentLabel);
			case DisPackage.DOCUMENT_HEADER__COMPLETE_FILE_NAME:
				return COMPLETE_FILE_NAME_EDEFAULT == null ? completeFileName != null : !COMPLETE_FILE_NAME_EDEFAULT.equals(completeFileName);
			case DisPackage.DOCUMENT_HEADER__FILE_EXTENSION_TYPE:
				return FILE_EXTENSION_TYPE_EDEFAULT == null ? fileExtensionType != null : !FILE_EXTENSION_TYPE_EDEFAULT.equals(fileExtensionType);
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_DESCRIPTION:
				return DOCUMENT_DESCRIPTION_EDEFAULT == null ? documentDescription != null : !DOCUMENT_DESCRIPTION_EDEFAULT.equals(documentDescription);
			case DisPackage.DOCUMENT_HEADER__DOCUMENT_SENT_DATE:
				return DOCUMENT_SENT_DATE_EDEFAULT == null ? documentSentDate != null : !DOCUMENT_SENT_DATE_EDEFAULT.equals(documentSentDate);
			case DisPackage.DOCUMENT_HEADER__DOC_PREVIOUSLY_SUBMITTED:
				return DOC_PREVIOUSLY_SUBMITTED_EDEFAULT == null ? docPreviouslySubmitted != null : !DOC_PREVIOUSLY_SUBMITTED_EDEFAULT.equals(docPreviouslySubmitted);
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
		result.append(" (documentID: ");
		result.append(documentID);
		result.append(", documentLabel: ");
		result.append(documentLabel);
		result.append(", completeFileName: ");
		result.append(completeFileName);
		result.append(", fileExtensionType: ");
		result.append(fileExtensionType);
		result.append(", documentDescription: ");
		result.append(documentDescription);
		result.append(", documentSentDate: ");
		result.append(documentSentDate);
		result.append(", docPreviouslySubmitted: ");
		result.append(docPreviouslySubmitted);
		result.append(')');
		return result.toString();
	}

} //DocumentHeaderImpl
