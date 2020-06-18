/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.PermitData;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permit Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.PermitDataImpl#getPermitNumber <em>Permit Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PermitDataImpl#getPermitType <em>Permit Type</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PermitDataImpl#getApprovalNumber <em>Approval Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PermitDataImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PermitDataImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PermitDataImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PermitDataImpl#getImporterOfRecord <em>Importer Of Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermitDataImpl extends MinimalEObjectImpl.Container implements PermitData {
	/**
	 * The default value of the '{@link #getPermitNumber() <em>Permit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMIT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermitNumber() <em>Permit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitNumber()
	 * @generated
	 * @ordered
	 */
	protected String permitNumber = PERMIT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermitType() <em>Permit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitType()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMIT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermitType() <em>Permit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermitType()
	 * @generated
	 * @ordered
	 */
	protected String permitType = PERMIT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getApprovalNumber() <em>Approval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalNumber() <em>Approval Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalNumber()
	 * @generated
	 * @ordered
	 */
	protected String approvalNumber = APPROVAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImporterOfRecord() <em>Importer Of Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterOfRecord()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTER_OF_RECORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImporterOfRecord() <em>Importer Of Record</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterOfRecord()
	 * @generated
	 * @ordered
	 */
	protected String importerOfRecord = IMPORTER_OF_RECORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermitDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.PERMIT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermitNumber() {
		return permitNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermitNumber(String newPermitNumber) {
		String oldPermitNumber = permitNumber;
		permitNumber = newPermitNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PERMIT_DATA__PERMIT_NUMBER, oldPermitNumber, permitNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermitType() {
		return permitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermitType(String newPermitType) {
		String oldPermitType = permitType;
		permitType = newPermitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PERMIT_DATA__PERMIT_TYPE, oldPermitType, permitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalNumber() {
		return approvalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalNumber(String newApprovalNumber) {
		String oldApprovalNumber = approvalNumber;
		approvalNumber = newApprovalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PERMIT_DATA__APPROVAL_NUMBER, oldApprovalNumber, approvalNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PERMIT_DATA__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(XMLGregorianCalendar newStartDate) {
		XMLGregorianCalendar oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PERMIT_DATA__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(XMLGregorianCalendar newEndDate) {
		XMLGregorianCalendar oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PERMIT_DATA__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImporterOfRecord() {
		return importerOfRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImporterOfRecord(String newImporterOfRecord) {
		String oldImporterOfRecord = importerOfRecord;
		importerOfRecord = newImporterOfRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PERMIT_DATA__IMPORTER_OF_RECORD, oldImporterOfRecord, importerOfRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.PERMIT_DATA__PERMIT_NUMBER:
				return getPermitNumber();
			case DisPackage.PERMIT_DATA__PERMIT_TYPE:
				return getPermitType();
			case DisPackage.PERMIT_DATA__APPROVAL_NUMBER:
				return getApprovalNumber();
			case DisPackage.PERMIT_DATA__STATEMENT:
				return getStatement();
			case DisPackage.PERMIT_DATA__START_DATE:
				return getStartDate();
			case DisPackage.PERMIT_DATA__END_DATE:
				return getEndDate();
			case DisPackage.PERMIT_DATA__IMPORTER_OF_RECORD:
				return getImporterOfRecord();
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
			case DisPackage.PERMIT_DATA__PERMIT_NUMBER:
				setPermitNumber((String)newValue);
				return;
			case DisPackage.PERMIT_DATA__PERMIT_TYPE:
				setPermitType((String)newValue);
				return;
			case DisPackage.PERMIT_DATA__APPROVAL_NUMBER:
				setApprovalNumber((String)newValue);
				return;
			case DisPackage.PERMIT_DATA__STATEMENT:
				setStatement((String)newValue);
				return;
			case DisPackage.PERMIT_DATA__START_DATE:
				setStartDate((XMLGregorianCalendar)newValue);
				return;
			case DisPackage.PERMIT_DATA__END_DATE:
				setEndDate((XMLGregorianCalendar)newValue);
				return;
			case DisPackage.PERMIT_DATA__IMPORTER_OF_RECORD:
				setImporterOfRecord((String)newValue);
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
			case DisPackage.PERMIT_DATA__PERMIT_NUMBER:
				setPermitNumber(PERMIT_NUMBER_EDEFAULT);
				return;
			case DisPackage.PERMIT_DATA__PERMIT_TYPE:
				setPermitType(PERMIT_TYPE_EDEFAULT);
				return;
			case DisPackage.PERMIT_DATA__APPROVAL_NUMBER:
				setApprovalNumber(APPROVAL_NUMBER_EDEFAULT);
				return;
			case DisPackage.PERMIT_DATA__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case DisPackage.PERMIT_DATA__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case DisPackage.PERMIT_DATA__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case DisPackage.PERMIT_DATA__IMPORTER_OF_RECORD:
				setImporterOfRecord(IMPORTER_OF_RECORD_EDEFAULT);
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
			case DisPackage.PERMIT_DATA__PERMIT_NUMBER:
				return PERMIT_NUMBER_EDEFAULT == null ? permitNumber != null : !PERMIT_NUMBER_EDEFAULT.equals(permitNumber);
			case DisPackage.PERMIT_DATA__PERMIT_TYPE:
				return PERMIT_TYPE_EDEFAULT == null ? permitType != null : !PERMIT_TYPE_EDEFAULT.equals(permitType);
			case DisPackage.PERMIT_DATA__APPROVAL_NUMBER:
				return APPROVAL_NUMBER_EDEFAULT == null ? approvalNumber != null : !APPROVAL_NUMBER_EDEFAULT.equals(approvalNumber);
			case DisPackage.PERMIT_DATA__STATEMENT:
				return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
			case DisPackage.PERMIT_DATA__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case DisPackage.PERMIT_DATA__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case DisPackage.PERMIT_DATA__IMPORTER_OF_RECORD:
				return IMPORTER_OF_RECORD_EDEFAULT == null ? importerOfRecord != null : !IMPORTER_OF_RECORD_EDEFAULT.equals(importerOfRecord);
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
		result.append(" (permitNumber: ");
		result.append(permitNumber);
		result.append(", permitType: ");
		result.append(permitType);
		result.append(", approvalNumber: ");
		result.append(approvalNumber);
		result.append(", statement: ");
		result.append(statement);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", importerOfRecord: ");
		result.append(importerOfRecord);
		result.append(')');
		return result.toString();
	}

} //PermitDataImpl
