/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.ISFNumberType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISF Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.ISFNumberTypeImpl#getFiler <em>Filer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.ISFNumberTypeImpl#getISFNumber <em>ISF Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISFNumberTypeImpl extends MinimalEObjectImpl.Container implements ISFNumberType {
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
	 * The default value of the '{@link #getISFNumber() <em>ISF Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISFNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ISF_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getISFNumber() <em>ISF Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISFNumber()
	 * @generated
	 * @ordered
	 */
	protected String iSFNumber = ISF_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISFNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.ISF_NUMBER_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.ISF_NUMBER_TYPE__FILER, oldFiler, filer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getISFNumber() {
		return iSFNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISFNumber(String newISFNumber) {
		String oldISFNumber = iSFNumber;
		iSFNumber = newISFNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.ISF_NUMBER_TYPE__ISF_NUMBER, oldISFNumber, iSFNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.ISF_NUMBER_TYPE__FILER:
				return getFiler();
			case DisPackage.ISF_NUMBER_TYPE__ISF_NUMBER:
				return getISFNumber();
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
			case DisPackage.ISF_NUMBER_TYPE__FILER:
				setFiler((String)newValue);
				return;
			case DisPackage.ISF_NUMBER_TYPE__ISF_NUMBER:
				setISFNumber((String)newValue);
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
			case DisPackage.ISF_NUMBER_TYPE__FILER:
				setFiler(FILER_EDEFAULT);
				return;
			case DisPackage.ISF_NUMBER_TYPE__ISF_NUMBER:
				setISFNumber(ISF_NUMBER_EDEFAULT);
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
			case DisPackage.ISF_NUMBER_TYPE__FILER:
				return FILER_EDEFAULT == null ? filer != null : !FILER_EDEFAULT.equals(filer);
			case DisPackage.ISF_NUMBER_TYPE__ISF_NUMBER:
				return ISF_NUMBER_EDEFAULT == null ? iSFNumber != null : !ISF_NUMBER_EDEFAULT.equals(iSFNumber);
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
		result.append(" (filer: ");
		result.append(filer);
		result.append(", iSFNumber: ");
		result.append(iSFNumber);
		result.append(')');
		return result.toString();
	}

} //ISFNumberTypeImpl
