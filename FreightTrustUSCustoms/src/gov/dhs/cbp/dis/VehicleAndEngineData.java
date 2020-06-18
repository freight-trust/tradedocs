/**
 */
package gov.dhs.cbp.dis;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle And Engine Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VehicleAndEngineData
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVIN <em>VIN</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleManufacturer <em>Vehicle Manufacturer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleModel <em>Vehicle Model</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleSerialNumber <em>Vehicle Serial Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleManufactureDate <em>Vehicle Manufacture Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineManufacturer <em>Engine Manufacturer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineModel <em>Engine Model</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineSerialNumber <em>Engine Serial Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineManufactureDate <em>Engine Manufacture Date</em>}</li>
 * </ul>
 *
 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData()
 * @model extendedMetaData="name='VehicleAndEngineData' kind='elementOnly'"
 * @generated
 */
public interface VehicleAndEngineData extends EObject {
	/**
	 * Returns the value of the '<em><b>VIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vehicle Identification Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VIN</em>' attribute.
	 * @see #setVIN(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_VIN()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VIN' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVIN();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVIN <em>VIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VIN</em>' attribute.
	 * @see #getVIN()
	 * @generated
	 */
	void setVIN(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VehicleMake
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Manufacturer</em>' attribute.
	 * @see #setVehicleManufacturer(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_VehicleManufacturer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VehicleManufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVehicleManufacturer();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleManufacturer <em>Vehicle Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Manufacturer</em>' attribute.
	 * @see #getVehicleManufacturer()
	 * @generated
	 */
	void setVehicleManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VehicleModel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Model</em>' attribute.
	 * @see #setVehicleModel(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_VehicleModel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VehicleModel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVehicleModel();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleModel <em>Vehicle Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Model</em>' attribute.
	 * @see #getVehicleModel()
	 * @generated
	 */
	void setVehicleModel(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VehicleSerialNumber
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Serial Number</em>' attribute.
	 * @see #setVehicleSerialNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_VehicleSerialNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VehicleSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVehicleSerialNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleSerialNumber <em>Vehicle Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Serial Number</em>' attribute.
	 * @see #getVehicleSerialNumber()
	 * @generated
	 */
	void setVehicleSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Vehicle Manufacture Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VehicleSerialNumber
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vehicle Manufacture Date</em>' attribute.
	 * @see #setVehicleManufactureDate(XMLGregorianCalendar)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_VehicleManufactureDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='VehicleManufactureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getVehicleManufactureDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getVehicleManufactureDate <em>Vehicle Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Manufacture Date</em>' attribute.
	 * @see #getVehicleManufactureDate()
	 * @generated
	 */
	void setVehicleManufactureDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Engine Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EngineManufacturer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Manufacturer</em>' attribute.
	 * @see #setEngineManufacturer(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_EngineManufacturer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EngineManufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEngineManufacturer();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineManufacturer <em>Engine Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Manufacturer</em>' attribute.
	 * @see #getEngineManufacturer()
	 * @generated
	 */
	void setEngineManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Engine Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EngineModel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Model</em>' attribute.
	 * @see #setEngineModel(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_EngineModel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EngineModel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEngineModel();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineModel <em>Engine Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Model</em>' attribute.
	 * @see #getEngineModel()
	 * @generated
	 */
	void setEngineModel(String value);

	/**
	 * Returns the value of the '<em><b>Engine Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EngineSerialNumber
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Serial Number</em>' attribute.
	 * @see #setEngineSerialNumber(String)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_EngineSerialNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='EngineSerialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEngineSerialNumber();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineSerialNumber <em>Engine Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Serial Number</em>' attribute.
	 * @see #getEngineSerialNumber()
	 * @generated
	 */
	void setEngineSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Engine Manufacture Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EngineManufactureDate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine Manufacture Date</em>' attribute.
	 * @see #setEngineManufactureDate(XMLGregorianCalendar)
	 * @see gov.dhs.cbp.dis.DisPackage#getVehicleAndEngineData_EngineManufactureDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='EngineManufactureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEngineManufactureDate();

	/**
	 * Sets the value of the '{@link gov.dhs.cbp.dis.VehicleAndEngineData#getEngineManufactureDate <em>Engine Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Manufacture Date</em>' attribute.
	 * @see #getEngineManufactureDate()
	 * @generated
	 */
	void setEngineManufactureDate(XMLGregorianCalendar value);

} // VehicleAndEngineData
