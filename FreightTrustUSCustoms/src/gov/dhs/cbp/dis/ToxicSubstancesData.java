/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toxic Substances Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Toxic Substances Data
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.ToxicSubstancesData#getCASNbr <em>CAS Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.ToxicSubstancesData#getEPARegistrationNbr <em>EPA Registration Nbr</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.ToxicSubstancesData#getEPAProducerEstNbr <em>EPA Producer Est Nbr</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getToxicSubstancesData()
 * @model extendedMetaData="name='ToxicSubstancesData' kind='elementOnly'"
 * @generated
 */
public interface ToxicSubstancesData extends EObject {
	/**
	 * Returns the value of the '<em><b>CAS Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CAS Nbr. Use comma separated list for Many CAS Nbrs Ex. A, B, C
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CAS Nbr</em>' attribute.
	 * @see #setCASNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getToxicSubstancesData_CASNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CASNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCASNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ToxicSubstancesData#getCASNbr <em>CAS Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAS Nbr</em>' attribute.
	 * @see #getCASNbr()
	 * @generated
	 */
	void setCASNbr(String value);

	/**
	 * Returns the value of the '<em><b>EPA Registration Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EPA Registration Nbr</em>' attribute.
	 * @see #setEPARegistrationNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getToxicSubstancesData_EPARegistrationNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EPARegistrationNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEPARegistrationNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ToxicSubstancesData#getEPARegistrationNbr <em>EPA Registration Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPA Registration Nbr</em>' attribute.
	 * @see #getEPARegistrationNbr()
	 * @generated
	 */
	void setEPARegistrationNbr(String value);

	/**
	 * Returns the value of the '<em><b>EPA Producer Est Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EPAProducerEstNbr
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EPA Producer Est Nbr</em>' attribute.
	 * @see #setEPAProducerEstNbr(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getToxicSubstancesData_EPAProducerEstNbr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EPAProducerEstNbr' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEPAProducerEstNbr();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ToxicSubstancesData#getEPAProducerEstNbr <em>EPA Producer Est Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPA Producer Est Nbr</em>' attribute.
	 * @see #getEPAProducerEstNbr()
	 * @generated
	 */
	void setEPAProducerEstNbr(String value);

} // ToxicSubstancesData
