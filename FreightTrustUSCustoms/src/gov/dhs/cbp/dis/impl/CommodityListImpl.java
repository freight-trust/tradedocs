/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.CommodityData;
import gov.dhs.cbp.dis.CommodityList;
import gov.dhs.cbp.dis.DisPackage;

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
 * An implementation of the model object '<em><b>Commodity List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.CommodityListImpl#getCommodityData <em>Commodity Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommodityListImpl extends MinimalEObjectImpl.Container implements CommodityList {
	/**
	 * The cached value of the '{@link #getCommodityData() <em>Commodity Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommodityData()
	 * @generated
	 * @ordered
	 */
	protected EList<CommodityData> commodityData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommodityListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.COMMODITY_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommodityData> getCommodityData() {
		if (commodityData == null) {
			commodityData = new EObjectContainmentEList<CommodityData>(CommodityData.class, this, DisPackage.COMMODITY_LIST__COMMODITY_DATA);
		}
		return commodityData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.COMMODITY_LIST__COMMODITY_DATA:
				return ((InternalEList<?>)getCommodityData()).basicRemove(otherEnd, msgs);
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
			case DisPackage.COMMODITY_LIST__COMMODITY_DATA:
				return getCommodityData();
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
			case DisPackage.COMMODITY_LIST__COMMODITY_DATA:
				getCommodityData().clear();
				getCommodityData().addAll((Collection<? extends CommodityData>)newValue);
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
			case DisPackage.COMMODITY_LIST__COMMODITY_DATA:
				getCommodityData().clear();
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
			case DisPackage.COMMODITY_LIST__COMMODITY_DATA:
				return commodityData != null && !commodityData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommodityListImpl
