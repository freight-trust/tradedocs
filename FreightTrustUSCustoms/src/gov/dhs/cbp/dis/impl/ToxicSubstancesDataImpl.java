/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.ToxicSubstancesData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toxic Substances Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.ToxicSubstancesDataImpl#getCASNbr <em>CAS Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.ToxicSubstancesDataImpl#getEPARegistrationNbr <em>EPA Registration Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.ToxicSubstancesDataImpl#getEPAProducerEstNbr <em>EPA Producer Est Nbr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToxicSubstancesDataImpl extends MinimalEObjectImpl.Container implements ToxicSubstancesData {
	/**
	 * The default value of the '{@link #getCASNbr() <em>CAS Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String CAS_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCASNbr() <em>CAS Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASNbr()
	 * @generated
	 * @ordered
	 */
	protected String cASNbr = CAS_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEPARegistrationNbr() <em>EPA Registration Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPARegistrationNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String EPA_REGISTRATION_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEPARegistrationNbr() <em>EPA Registration Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPARegistrationNbr()
	 * @generated
	 * @ordered
	 */
	protected String ePARegistrationNbr = EPA_REGISTRATION_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEPAProducerEstNbr() <em>EPA Producer Est Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPAProducerEstNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String EPA_PRODUCER_EST_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEPAProducerEstNbr() <em>EPA Producer Est Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEPAProducerEstNbr()
	 * @generated
	 * @ordered
	 */
	protected String ePAProducerEstNbr = EPA_PRODUCER_EST_NBR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToxicSubstancesDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.TOXIC_SUBSTANCES_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCASNbr() {
		return cASNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCASNbr(String newCASNbr) {
		String oldCASNbr = cASNbr;
		cASNbr = newCASNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TOXIC_SUBSTANCES_DATA__CAS_NBR, oldCASNbr, cASNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEPARegistrationNbr() {
		return ePARegistrationNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPARegistrationNbr(String newEPARegistrationNbr) {
		String oldEPARegistrationNbr = ePARegistrationNbr;
		ePARegistrationNbr = newEPARegistrationNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TOXIC_SUBSTANCES_DATA__EPA_REGISTRATION_NBR, oldEPARegistrationNbr, ePARegistrationNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEPAProducerEstNbr() {
		return ePAProducerEstNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEPAProducerEstNbr(String newEPAProducerEstNbr) {
		String oldEPAProducerEstNbr = ePAProducerEstNbr;
		ePAProducerEstNbr = newEPAProducerEstNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.TOXIC_SUBSTANCES_DATA__EPA_PRODUCER_EST_NBR, oldEPAProducerEstNbr, ePAProducerEstNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.TOXIC_SUBSTANCES_DATA__CAS_NBR:
				return getCASNbr();
			case DisPackage.TOXIC_SUBSTANCES_DATA__EPA_REGISTRATION_NBR:
				return getEPARegistrationNbr();
			case DisPackage.TOXIC_SUBSTANCES_DATA__EPA_PRODUCER_EST_NBR:
				return getEPAProducerEstNbr();
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
			case DisPackage.TOXIC_SUBSTANCES_DATA__CAS_NBR:
				setCASNbr((String)newValue);
				return;
			case DisPackage.TOXIC_SUBSTANCES_DATA__EPA_REGISTRATION_NBR:
				setEPARegistrationNbr((String)newValue);
				return;
			case DisPackage.TOXIC_SUBSTANCES_DATA__EPA_PRODUCER_EST_NBR:
				setEPAProducerEstNbr((String)newValue);
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
			case DisPackage.TOXIC_SUBSTANCES_DATA__CAS_NBR:
				setCASNbr(CAS_NBR_EDEFAULT);
				return;
			case DisPackage.TOXIC_SUBSTANCES_DATA__EPA_REGISTRATION_NBR:
				setEPARegistrationNbr(EPA_REGISTRATION_NBR_EDEFAULT);
				return;
			case DisPackage.TOXIC_SUBSTANCES_DATA__EPA_PRODUCER_EST_NBR:
				setEPAProducerEstNbr(EPA_PRODUCER_EST_NBR_EDEFAULT);
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
			case DisPackage.TOXIC_SUBSTANCES_DATA__CAS_NBR:
				return CAS_NBR_EDEFAULT == null ? cASNbr != null : !CAS_NBR_EDEFAULT.equals(cASNbr);
			case DisPackage.TOXIC_SUBSTANCES_DATA__EPA_REGISTRATION_NBR:
				return EPA_REGISTRATION_NBR_EDEFAULT == null ? ePARegistrationNbr != null : !EPA_REGISTRATION_NBR_EDEFAULT.equals(ePARegistrationNbr);
			case DisPackage.TOXIC_SUBSTANCES_DATA__EPA_PRODUCER_EST_NBR:
				return EPA_PRODUCER_EST_NBR_EDEFAULT == null ? ePAProducerEstNbr != null : !EPA_PRODUCER_EST_NBR_EDEFAULT.equals(ePAProducerEstNbr);
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
		result.append(" (cASNbr: ");
		result.append(cASNbr);
		result.append(", ePARegistrationNbr: ");
		result.append(ePARegistrationNbr);
		result.append(", ePAProducerEstNbr: ");
		result.append(ePAProducerEstNbr);
		result.append(')');
		return result.toString();
	}

} //ToxicSubstancesDataImpl
