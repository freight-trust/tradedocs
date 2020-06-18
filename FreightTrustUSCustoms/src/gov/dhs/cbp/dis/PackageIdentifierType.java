/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Can be used to provide CBMA IOR Number
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.PackageIdentifierType#getPackageCategory <em>Package Category</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PackageIdentifierType#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.PackageIdentifierType#getImporterOfRecordNbr <em>Importer Of Record Nbr</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getPackageIdentifierType()
 * @model extendedMetaData="name='PackageIdentifierType' kind='elementOnly'"
 * @generated
 */
public interface PackageIdentifierType extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Package Category
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Category</em>' attribute.
	 * @see #setPackageCategory(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPackageIdentifierType_PackageCategory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='PackageCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPackageCategory();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PackageIdentifierType#getPackageCategory <em>Package Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Category</em>' attribute.
	 * @see #getPackageCategory()
	 * @generated
	 */
	void setPackageCategory(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Package Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package Name</em>' containment reference.
	 * @see #setPackageName(EObject)
	 * @see gov.dhs.cbp.dis.DisPackage#getPackageIdentifierType_PackageName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PackageName' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getPackageName();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PackageIdentifierType#getPackageName <em>Package Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' containment reference.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(EObject value);

	/**
	 * Returns the value of the '<em><b>Importer Of Record Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Importer Of Record Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Importer Of Record Nbr</em>' attribute.
	 * @see #setImporterOfRecordNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getPackageIdentifierType_ImporterOfRecordNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ImporterOfRecordNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImporterOfRecordNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.PackageIdentifierType#getImporterOfRecordNbr <em>Importer Of Record Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importer Of Record Nbr</em>' attribute.
	 * @see #getImporterOfRecordNbr()
	 * @generated
	 */
	void setImporterOfRecordNbr(String value);

} // PackageIdentifierType
