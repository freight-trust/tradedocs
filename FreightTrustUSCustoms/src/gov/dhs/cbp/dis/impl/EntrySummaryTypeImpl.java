/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.EntrySummaryType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Summary Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.EntrySummaryTypeImpl#getEntryNumber <em>Entry Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.EntrySummaryTypeImpl#getFiler <em>Filer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.EntrySummaryTypeImpl#getEntryLineNumber <em>Entry Line Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.EntrySummaryTypeImpl#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntrySummaryTypeImpl extends MinimalEObjectImpl.Container implements EntrySummaryType {
	/**
	 * The default value of the '{@link #getEntryNumber() <em>Entry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryNumber() <em>Entry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryNumber()
	 * @generated
	 * @ordered
	 */
	protected String entryNumber = ENTRY_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiler() <em>Filer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiler()
	 * @generated
	 * @ordered
	 */
	protected static final String FILER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiler() <em>Filer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiler()
	 * @generated
	 * @ordered
	 */
	protected String filer = FILER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryLineNumber() <em>Entry Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryLineNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_LINE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryLineNumber() <em>Entry Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryLineNumber()
	 * @generated
	 * @ordered
	 */
	protected String entryLineNumber = ENTRY_LINE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNumber() <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected String referenceNumber = REFERENCE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntrySummaryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.ENTRY_SUMMARY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryNumber() {
		return entryNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryNumber(String newEntryNumber) {
		String oldEntryNumber = entryNumber;
		entryNumber = newEntryNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_NUMBER, oldEntryNumber, entryNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFiler() {
		return filer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiler(String newFiler) {
		String oldFiler = filer;
		filer = newFiler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.ENTRY_SUMMARY_TYPE__FILER, oldFiler, filer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryLineNumber() {
		return entryLineNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryLineNumber(String newEntryLineNumber) {
		String oldEntryLineNumber = entryLineNumber;
		entryLineNumber = newEntryLineNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_LINE_NUMBER, oldEntryLineNumber, entryLineNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceNumber() {
		return referenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceNumber(String newReferenceNumber) {
		String oldReferenceNumber = referenceNumber;
		referenceNumber = newReferenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.ENTRY_SUMMARY_TYPE__REFERENCE_NUMBER, oldReferenceNumber, referenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_NUMBER:
				return getEntryNumber();
			case DisPackage.ENTRY_SUMMARY_TYPE__FILER:
				return getFiler();
			case DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_LINE_NUMBER:
				return getEntryLineNumber();
			case DisPackage.ENTRY_SUMMARY_TYPE__REFERENCE_NUMBER:
				return getReferenceNumber();
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
			case DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_NUMBER:
				setEntryNumber((String)newValue);
				return;
			case DisPackage.ENTRY_SUMMARY_TYPE__FILER:
				setFiler((String)newValue);
				return;
			case DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_LINE_NUMBER:
				setEntryLineNumber((String)newValue);
				return;
			case DisPackage.ENTRY_SUMMARY_TYPE__REFERENCE_NUMBER:
				setReferenceNumber((String)newValue);
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
			case DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_NUMBER:
				setEntryNumber(ENTRY_NUMBER_EDEFAULT);
				return;
			case DisPackage.ENTRY_SUMMARY_TYPE__FILER:
				setFiler(FILER_EDEFAULT);
				return;
			case DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_LINE_NUMBER:
				setEntryLineNumber(ENTRY_LINE_NUMBER_EDEFAULT);
				return;
			case DisPackage.ENTRY_SUMMARY_TYPE__REFERENCE_NUMBER:
				setReferenceNumber(REFERENCE_NUMBER_EDEFAULT);
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
			case DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_NUMBER:
				return ENTRY_NUMBER_EDEFAULT == null ? entryNumber != null : !ENTRY_NUMBER_EDEFAULT.equals(entryNumber);
			case DisPackage.ENTRY_SUMMARY_TYPE__FILER:
				return FILER_EDEFAULT == null ? filer != null : !FILER_EDEFAULT.equals(filer);
			case DisPackage.ENTRY_SUMMARY_TYPE__ENTRY_LINE_NUMBER:
				return ENTRY_LINE_NUMBER_EDEFAULT == null ? entryLineNumber != null : !ENTRY_LINE_NUMBER_EDEFAULT.equals(entryLineNumber);
			case DisPackage.ENTRY_SUMMARY_TYPE__REFERENCE_NUMBER:
				return REFERENCE_NUMBER_EDEFAULT == null ? referenceNumber != null : !REFERENCE_NUMBER_EDEFAULT.equals(referenceNumber);
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
		result.append(" (entryNumber: ");
		result.append(entryNumber);
		result.append(", filer: ");
		result.append(filer);
		result.append(", entryLineNumber: ");
		result.append(entryLineNumber);
		result.append(", referenceNumber: ");
		result.append(referenceNumber);
		result.append(')');
		return result.toString();
	}

} //EntrySummaryTypeImpl
