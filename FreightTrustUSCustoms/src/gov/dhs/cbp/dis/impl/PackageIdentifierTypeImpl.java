/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.PackageIdentifierType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.PackageIdentifierTypeImpl#getPackageCategory <em>Package Category</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PackageIdentifierTypeImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.PackageIdentifierTypeImpl#getImporterOfRecordNbr <em>Importer Of Record Nbr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageIdentifierTypeImpl extends MinimalEObjectImpl.Container implements PackageIdentifierType {
	/**
	 * The default value of the '{@link #getPackageCategory() <em>Package Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageCategory() <em>Package Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageCategory()
	 * @generated
	 * @ordered
	 */
	protected String packageCategory = PACKAGE_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected EObject packageName;

	/**
	 * The default value of the '{@link #getImporterOfRecordNbr() <em>Importer Of Record Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterOfRecordNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTER_OF_RECORD_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImporterOfRecordNbr() <em>Importer Of Record Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImporterOfRecordNbr()
	 * @generated
	 * @ordered
	 */
	protected String importerOfRecordNbr = IMPORTER_OF_RECORD_NBR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageIdentifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.PACKAGE_IDENTIFIER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageCategory() {
		return packageCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageCategory(String newPackageCategory) {
		String oldPackageCategory = packageCategory;
		packageCategory = newPackageCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_CATEGORY, oldPackageCategory, packageCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageName(EObject newPackageName, NotificationChain msgs) {
		EObject oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME, oldPackageName, newPackageName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageName(EObject newPackageName) {
		if (newPackageName != packageName) {
			NotificationChain msgs = null;
			if (packageName != null)
				msgs = ((InternalEObject)packageName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME, null, msgs);
			if (newPackageName != null)
				msgs = ((InternalEObject)newPackageName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME, null, msgs);
			msgs = basicSetPackageName(newPackageName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME, newPackageName, newPackageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImporterOfRecordNbr() {
		return importerOfRecordNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImporterOfRecordNbr(String newImporterOfRecordNbr) {
		String oldImporterOfRecordNbr = importerOfRecordNbr;
		importerOfRecordNbr = newImporterOfRecordNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.PACKAGE_IDENTIFIER_TYPE__IMPORTER_OF_RECORD_NBR, oldImporterOfRecordNbr, importerOfRecordNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME:
				return basicSetPackageName(null, msgs);
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
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_CATEGORY:
				return getPackageCategory();
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME:
				return getPackageName();
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__IMPORTER_OF_RECORD_NBR:
				return getImporterOfRecordNbr();
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
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_CATEGORY:
				setPackageCategory((String)newValue);
				return;
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME:
				setPackageName((EObject)newValue);
				return;
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__IMPORTER_OF_RECORD_NBR:
				setImporterOfRecordNbr((String)newValue);
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
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_CATEGORY:
				setPackageCategory(PACKAGE_CATEGORY_EDEFAULT);
				return;
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME:
				setPackageName((EObject)null);
				return;
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__IMPORTER_OF_RECORD_NBR:
				setImporterOfRecordNbr(IMPORTER_OF_RECORD_NBR_EDEFAULT);
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
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_CATEGORY:
				return PACKAGE_CATEGORY_EDEFAULT == null ? packageCategory != null : !PACKAGE_CATEGORY_EDEFAULT.equals(packageCategory);
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__PACKAGE_NAME:
				return packageName != null;
			case DisPackage.PACKAGE_IDENTIFIER_TYPE__IMPORTER_OF_RECORD_NBR:
				return IMPORTER_OF_RECORD_NBR_EDEFAULT == null ? importerOfRecordNbr != null : !IMPORTER_OF_RECORD_NBR_EDEFAULT.equals(importerOfRecordNbr);
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
		result.append(" (packageCategory: ");
		result.append(packageCategory);
		result.append(", importerOfRecordNbr: ");
		result.append(importerOfRecordNbr);
		result.append(')');
		return result.toString();
	}

} //PackageIdentifierTypeImpl
