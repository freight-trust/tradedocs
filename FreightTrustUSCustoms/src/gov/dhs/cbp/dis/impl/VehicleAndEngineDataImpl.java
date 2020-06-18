/**
 */
package gov.dhs.cbp.dis.impl;

import gov.dhs.cbp.dis.DisPackage;
import gov.dhs.cbp.dis.VehicleAndEngineData;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle And Engine Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getVIN <em>VIN</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getVehicleManufacturer <em>Vehicle Manufacturer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getVehicleModel <em>Vehicle Model</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getVehicleSerialNumber <em>Vehicle Serial Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getVehicleManufactureDate <em>Vehicle Manufacture Date</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getEngineManufacturer <em>Engine Manufacturer</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getEngineModel <em>Engine Model</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getEngineSerialNumber <em>Engine Serial Number</em>}</li>
 *   <li>{@link gov.dhs.cbp.dis.impl.VehicleAndEngineDataImpl#getEngineManufactureDate <em>Engine Manufacture Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleAndEngineDataImpl extends MinimalEObjectImpl.Container implements VehicleAndEngineData {
	/**
	 * The default value of the '{@link #getVIN() <em>VIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIN()
	 * @generated
	 * @ordered
	 */
	protected static final String VIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVIN() <em>VIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVIN()
	 * @generated
	 * @ordered
	 */
	protected String vIN = VIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleManufacturer() <em>Vehicle Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleManufacturer() <em>Vehicle Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String vehicleManufacturer = VEHICLE_MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleModel() <em>Vehicle Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleModel()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleModel() <em>Vehicle Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleModel()
	 * @generated
	 * @ordered
	 */
	protected String vehicleModel = VEHICLE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleSerialNumber() <em>Vehicle Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleSerialNumber() <em>Vehicle Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String vehicleSerialNumber = VEHICLE_SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleManufactureDate() <em>Vehicle Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VEHICLE_MANUFACTURE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleManufactureDate() <em>Vehicle Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar vehicleManufactureDate = VEHICLE_MANUFACTURE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineManufacturer() <em>Engine Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineManufacturer() <em>Engine Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String engineManufacturer = ENGINE_MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineModel() <em>Engine Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineModel()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineModel() <em>Engine Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineModel()
	 * @generated
	 * @ordered
	 */
	protected String engineModel = ENGINE_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineSerialNumber() <em>Engine Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineSerialNumber() <em>Engine Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String engineSerialNumber = ENGINE_SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEngineManufactureDate() <em>Engine Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ENGINE_MANUFACTURE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEngineManufactureDate() <em>Engine Manufacture Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar engineManufactureDate = ENGINE_MANUFACTURE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleAndEngineDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DisPackage.Literals.VEHICLE_AND_ENGINE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVIN() {
		return vIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVIN(String newVIN) {
		String oldVIN = vIN;
		vIN = newVIN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__VIN, oldVIN, vIN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleManufacturer() {
		return vehicleManufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleManufacturer(String newVehicleManufacturer) {
		String oldVehicleManufacturer = vehicleManufacturer;
		vehicleManufacturer = newVehicleManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURER, oldVehicleManufacturer, vehicleManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleModel() {
		return vehicleModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleModel(String newVehicleModel) {
		String oldVehicleModel = vehicleModel;
		vehicleModel = newVehicleModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MODEL, oldVehicleModel, vehicleModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleSerialNumber() {
		return vehicleSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleSerialNumber(String newVehicleSerialNumber) {
		String oldVehicleSerialNumber = vehicleSerialNumber;
		vehicleSerialNumber = newVehicleSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_SERIAL_NUMBER, oldVehicleSerialNumber, vehicleSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getVehicleManufactureDate() {
		return vehicleManufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleManufactureDate(XMLGregorianCalendar newVehicleManufactureDate) {
		XMLGregorianCalendar oldVehicleManufactureDate = vehicleManufactureDate;
		vehicleManufactureDate = newVehicleManufactureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURE_DATE, oldVehicleManufactureDate, vehicleManufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineManufacturer() {
		return engineManufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineManufacturer(String newEngineManufacturer) {
		String oldEngineManufacturer = engineManufacturer;
		engineManufacturer = newEngineManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURER, oldEngineManufacturer, engineManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineModel() {
		return engineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineModel(String newEngineModel) {
		String oldEngineModel = engineModel;
		engineModel = newEngineModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MODEL, oldEngineModel, engineModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEngineSerialNumber() {
		return engineSerialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineSerialNumber(String newEngineSerialNumber) {
		String oldEngineSerialNumber = engineSerialNumber;
		engineSerialNumber = newEngineSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_SERIAL_NUMBER, oldEngineSerialNumber, engineSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getEngineManufactureDate() {
		return engineManufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngineManufactureDate(XMLGregorianCalendar newEngineManufactureDate) {
		XMLGregorianCalendar oldEngineManufactureDate = engineManufactureDate;
		engineManufactureDate = newEngineManufactureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURE_DATE, oldEngineManufactureDate, engineManufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VIN:
				return getVIN();
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURER:
				return getVehicleManufacturer();
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MODEL:
				return getVehicleModel();
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_SERIAL_NUMBER:
				return getVehicleSerialNumber();
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURE_DATE:
				return getVehicleManufactureDate();
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURER:
				return getEngineManufacturer();
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MODEL:
				return getEngineModel();
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_SERIAL_NUMBER:
				return getEngineSerialNumber();
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURE_DATE:
				return getEngineManufactureDate();
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
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VIN:
				setVIN((String)newValue);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURER:
				setVehicleManufacturer((String)newValue);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MODEL:
				setVehicleModel((String)newValue);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_SERIAL_NUMBER:
				setVehicleSerialNumber((String)newValue);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURE_DATE:
				setVehicleManufactureDate((XMLGregorianCalendar)newValue);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURER:
				setEngineManufacturer((String)newValue);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MODEL:
				setEngineModel((String)newValue);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_SERIAL_NUMBER:
				setEngineSerialNumber((String)newValue);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURE_DATE:
				setEngineManufactureDate((XMLGregorianCalendar)newValue);
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
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VIN:
				setVIN(VIN_EDEFAULT);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURER:
				setVehicleManufacturer(VEHICLE_MANUFACTURER_EDEFAULT);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MODEL:
				setVehicleModel(VEHICLE_MODEL_EDEFAULT);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_SERIAL_NUMBER:
				setVehicleSerialNumber(VEHICLE_SERIAL_NUMBER_EDEFAULT);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURE_DATE:
				setVehicleManufactureDate(VEHICLE_MANUFACTURE_DATE_EDEFAULT);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURER:
				setEngineManufacturer(ENGINE_MANUFACTURER_EDEFAULT);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MODEL:
				setEngineModel(ENGINE_MODEL_EDEFAULT);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_SERIAL_NUMBER:
				setEngineSerialNumber(ENGINE_SERIAL_NUMBER_EDEFAULT);
				return;
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURE_DATE:
				setEngineManufactureDate(ENGINE_MANUFACTURE_DATE_EDEFAULT);
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
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VIN:
				return VIN_EDEFAULT == null ? vIN != null : !VIN_EDEFAULT.equals(vIN);
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURER:
				return VEHICLE_MANUFACTURER_EDEFAULT == null ? vehicleManufacturer != null : !VEHICLE_MANUFACTURER_EDEFAULT.equals(vehicleManufacturer);
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MODEL:
				return VEHICLE_MODEL_EDEFAULT == null ? vehicleModel != null : !VEHICLE_MODEL_EDEFAULT.equals(vehicleModel);
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_SERIAL_NUMBER:
				return VEHICLE_SERIAL_NUMBER_EDEFAULT == null ? vehicleSerialNumber != null : !VEHICLE_SERIAL_NUMBER_EDEFAULT.equals(vehicleSerialNumber);
			case DisPackage.VEHICLE_AND_ENGINE_DATA__VEHICLE_MANUFACTURE_DATE:
				return VEHICLE_MANUFACTURE_DATE_EDEFAULT == null ? vehicleManufactureDate != null : !VEHICLE_MANUFACTURE_DATE_EDEFAULT.equals(vehicleManufactureDate);
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURER:
				return ENGINE_MANUFACTURER_EDEFAULT == null ? engineManufacturer != null : !ENGINE_MANUFACTURER_EDEFAULT.equals(engineManufacturer);
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MODEL:
				return ENGINE_MODEL_EDEFAULT == null ? engineModel != null : !ENGINE_MODEL_EDEFAULT.equals(engineModel);
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_SERIAL_NUMBER:
				return ENGINE_SERIAL_NUMBER_EDEFAULT == null ? engineSerialNumber != null : !ENGINE_SERIAL_NUMBER_EDEFAULT.equals(engineSerialNumber);
			case DisPackage.VEHICLE_AND_ENGINE_DATA__ENGINE_MANUFACTURE_DATE:
				return ENGINE_MANUFACTURE_DATE_EDEFAULT == null ? engineManufactureDate != null : !ENGINE_MANUFACTURE_DATE_EDEFAULT.equals(engineManufactureDate);
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
		result.append(" (vIN: ");
		result.append(vIN);
		result.append(", vehicleManufacturer: ");
		result.append(vehicleManufacturer);
		result.append(", vehicleModel: ");
		result.append(vehicleModel);
		result.append(", vehicleSerialNumber: ");
		result.append(vehicleSerialNumber);
		result.append(", vehicleManufactureDate: ");
		result.append(vehicleManufactureDate);
		result.append(", engineManufacturer: ");
		result.append(engineManufacturer);
		result.append(", engineModel: ");
		result.append(engineModel);
		result.append(", engineSerialNumber: ");
		result.append(engineSerialNumber);
		result.append(", engineManufactureDate: ");
		result.append(engineManufactureDate);
		result.append(')');
		return result.toString();
	}

} //VehicleAndEngineDataImpl
