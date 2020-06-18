/**
 */
package gov.dhs.cbp.dis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISF Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.ISFNumberType#getFiler <em>Filer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.ISFNumberType#getISFNumber <em>ISF Number</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getISFNumberType()
 * @model extendedMetaData="name='ISFNumber_._type' kind='elementOnly'"
 * @generated
 */
public interface ISFNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Filer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filer</em>' attribute.
	 * @see #setFiler(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getISFNumberType_Filer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Filer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFiler();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ISFNumberType#getFiler <em>Filer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filer</em>' attribute.
	 * @see #getFiler()
	 * @generated
	 */
	void setFiler(String value);

	/**
	 * Returns the value of the '<em><b>ISF Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISF Number</em>' attribute.
	 * @see #setISFNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getISFNumberType_ISFNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ISFNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getISFNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.ISFNumberType#getISFNumber <em>ISF Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISF Number</em>' attribute.
	 * @see #getISFNumber()
	 * @generated
	 */
	void setISFNumber(String value);

} // ISFNumberType
