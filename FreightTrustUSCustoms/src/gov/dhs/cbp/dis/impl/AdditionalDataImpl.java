/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.AdditionalData;
import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.NameValuePair;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.AdditionalDataImpl#getNameValuePair <em>Name Value Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalDataImpl extends MinimalEObjectImpl.Container implements AdditionalData {
	/**
	 * The cached value of the '{@link #getNameValuePair() <em>Name Value Pair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameValuePair()
	 * @generated
	 * @ordered
	 */
	protected EList<NameValuePair> nameValuePair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.ADDITIONAL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NameValuePair> getNameValuePair() {
		if (nameValuePair == null) {
			nameValuePair = new EObjectContainmentEList<NameValuePair>(NameValuePair.class, this, DisPackage.ADDITIONAL_DATA__NAME_VALUE_PAIR);
		}
		return nameValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.ADDITIONAL_DATA__NAME_VALUE_PAIR:
				return ((InternalEList<?>)getNameValuePair()).basicRemove(otherEnd, msgs);
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
			case DisPackage.ADDITIONAL_DATA__NAME_VALUE_PAIR:
				return getNameValuePair();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DisPackage.ADDITIONAL_DATA__NAME_VALUE_PAIR:
				getNameValuePair().clear();
				getNameValuePair().addAll((Collection<? extends NameValuePair>)newValue);
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
			case DisPackage.ADDITIONAL_DATA__NAME_VALUE_PAIR:
				getNameValuePair().clear();
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
			case DisPackage.ADDITIONAL_DATA__NAME_VALUE_PAIR:
				return nameValuePair != null && !nameValuePair.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdditionalDataImpl
