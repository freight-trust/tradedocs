/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Summary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.EntrySummaryType#getEntryNumber <em>Entry Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.EntrySummaryType#getFiler <em>Filer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.EntrySummaryType#getEntryLineNumber <em>Entry Line Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.EntrySummaryType#getReferenceNumber <em>Reference Number</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getEntrySummaryType()
 * @model extendedMetaData="name='EntrySummary_._type' kind='elementOnly'"
 * @generated
 */
public interface EntrySummaryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Number</em>' attribute.
	 * @see #setEntryNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getEntrySummaryType_EntryNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='EntryNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEntryNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.EntrySummaryType#getEntryNumber <em>Entry Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Number</em>' attribute.
	 * @see #getEntryNumber()
	 * @generated
	 */
	void setEntryNumber(String value);

	/**
	 * Returns the value of the '<em><b>Filer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filer</em>' attribute.
	 * @see #setFiler(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getEntrySummaryType_Filer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Filer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFiler();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.EntrySummaryType#getFiler <em>Filer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filer</em>' attribute.
	 * @see #getFiler()
	 * @generated
	 */
	void setFiler(String value);

	/**
	 * Returns the value of the '<em><b>Entry Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Line Number</em>' attribute.
	 * @see #setEntryLineNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getEntrySummaryType_EntryLineNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EntryLineNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEntryLineNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.EntrySummaryType#getEntryLineNumber <em>Entry Line Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Line Number</em>' attribute.
	 * @see #getEntryLineNumber()
	 * @generated
	 */
	void setEntryLineNumber(String value);

	/**
	 * Returns the value of the '<em><b>Reference Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Number</em>' attribute.
	 * @see #setReferenceNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getEntrySummaryType_ReferenceNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ReferenceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReferenceNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.EntrySummaryType#getReferenceNumber <em>Reference Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Number</em>' attribute.
	 * @see #getReferenceNumber()
	 * @generated
	 */
	void setReferenceNumber(String value);

} // EntrySummaryType
