
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="AddressType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalAddressInformation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Address2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AddressShortCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="City" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompanyName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Contact" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Country" type="{http://www.freighttrust.com/schema/universal/2020/06}Country" minOccurs="0"/&gt;
 *         &lt;element name="Email" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="254"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GovRegNum" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="254"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GovRegNumType" type="{http://www.freighttrust.com/schema/universal/2020/06}RegistrationNumberType" minOccurs="0"/&gt;
 *         &lt;element name="IsResidential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrganizationCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Phone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Port" type="{http://www.freighttrust.com/schema/universal/2020/06}UNLOCO" minOccurs="0"/&gt;
 *         &lt;element name="Postcode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ScreeningStatus" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="State" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SuppressAddressValidationError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UniversalNettingCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="254"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UniversalOfficeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="254"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LocalAddressCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LocalAddress" type="{http://www.freighttrust.com/schema/universal/2020/06}OrganizationLocalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RegistrationNumberCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RegistrationNumber" type="{http://www.freighttrust.com/schema/universal/2020/06}RegistrationNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationAddress", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class OrganizationAddress {

    @XmlElement(name = "AddressType", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String addressType;
    @XmlElement(name = "AdditionalAddressInformation", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String additionalAddressInformation;
    @XmlElement(name = "Address1", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String address1;
    @XmlElement(name = "Address2", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String address2;
    @XmlElement(name = "AddressOverride", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean addressOverride;
    @XmlElement(name = "AddressShortCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String addressShortCode;
    @XmlElement(name = "City", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String city;
    @XmlElement(name = "CompanyName", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String companyName;
    @XmlElement(name = "Contact", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String contact;
    @XmlElement(name = "Country", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Country country;
    @XmlElement(name = "Email", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String email;
    @XmlElement(name = "Fax", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String fax;
    @XmlElement(name = "GovRegNum", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String govRegNum;
    @XmlElement(name = "GovRegNumType", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected RegistrationNumberType govRegNumType;
    @XmlElement(name = "IsResidential", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isResidential;
    @XmlElement(name = "Mobile", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String mobile;
    @XmlElement(name = "OrganizationCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String organizationCode;
    @XmlElement(name = "Phone", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String phone;
    @XmlElement(name = "Port", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected UNLOCO port;
    @XmlElement(name = "Postcode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String postcode;
    @XmlElement(name = "ScreeningStatus", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair screeningStatus;
    @XmlElement(name = "State", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String state;
    @XmlElement(name = "SuppressAddressValidationError", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean suppressAddressValidationError;
    @XmlElement(name = "UniversalNettingCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String universalNettingCode;
    @XmlElement(name = "UniversalOfficeCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String universalOfficeCode;
    @XmlElement(name = "LocalAddressCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected OrganizationAddress.LocalAddressCollection localAddressCollection;
    @XmlElement(name = "RegistrationNumberCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected OrganizationAddress.RegistrationNumberCollection registrationNumberCollection;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the additionalAddressInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAddressInformation() {
        return additionalAddressInformation;
    }

    /**
     * Sets the value of the additionalAddressInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAddressInformation(String value) {
        this.additionalAddressInformation = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the addressOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressOverride() {
        return addressOverride;
    }

    /**
     * Sets the value of the addressOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressOverride(Boolean value) {
        this.addressOverride = value;
    }

    /**
     * Gets the value of the addressShortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressShortCode() {
        return addressShortCode;
    }

    /**
     * Sets the value of the addressShortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressShortCode(String value) {
        this.addressShortCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the govRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovRegNum() {
        return govRegNum;
    }

    /**
     * Sets the value of the govRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovRegNum(String value) {
        this.govRegNum = value;
    }

    /**
     * Gets the value of the govRegNumType property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNumberType }
     *     
     */
    public RegistrationNumberType getGovRegNumType() {
        return govRegNumType;
    }

    /**
     * Sets the value of the govRegNumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNumberType }
     *     
     */
    public void setGovRegNumType(RegistrationNumberType value) {
        this.govRegNumType = value;
    }

    /**
     * Gets the value of the isResidential property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsResidential() {
        return isResidential;
    }

    /**
     * Sets the value of the isResidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsResidential(Boolean value) {
        this.isResidential = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the organizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the value of the organizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link UNLOCO }
     *     
     */
    public UNLOCO getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNLOCO }
     *     
     */
    public void setPort(UNLOCO value) {
        this.port = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the screeningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getScreeningStatus() {
        return screeningStatus;
    }

    /**
     * Sets the value of the screeningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setScreeningStatus(CodeDescriptionPair value) {
        this.screeningStatus = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the suppressAddressValidationError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressAddressValidationError() {
        return suppressAddressValidationError;
    }

    /**
     * Sets the value of the suppressAddressValidationError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressAddressValidationError(Boolean value) {
        this.suppressAddressValidationError = value;
    }

    /**
     * Gets the value of the universalNettingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalNettingCode() {
        return universalNettingCode;
    }

    /**
     * Sets the value of the universalNettingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalNettingCode(String value) {
        this.universalNettingCode = value;
    }

    /**
     * Gets the value of the universalOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalOfficeCode() {
        return universalOfficeCode;
    }

    /**
     * Sets the value of the universalOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalOfficeCode(String value) {
        this.universalOfficeCode = value;
    }

    /**
     * Gets the value of the localAddressCollection property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAddress.LocalAddressCollection }
     *     
     */
    public OrganizationAddress.LocalAddressCollection getLocalAddressCollection() {
        return localAddressCollection;
    }

    /**
     * Sets the value of the localAddressCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAddress.LocalAddressCollection }
     *     
     */
    public void setLocalAddressCollection(OrganizationAddress.LocalAddressCollection value) {
        this.localAddressCollection = value;
    }

    /**
     * Gets the value of the registrationNumberCollection property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAddress.RegistrationNumberCollection }
     *     
     */
    public OrganizationAddress.RegistrationNumberCollection getRegistrationNumberCollection() {
        return registrationNumberCollection;
    }

    /**
     * Sets the value of the registrationNumberCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAddress.RegistrationNumberCollection }
     *     
     */
    public void setRegistrationNumberCollection(OrganizationAddress.RegistrationNumberCollection value) {
        this.registrationNumberCollection = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LocalAddress" type="{http://www.freighttrust.com/schema/universal/2020/06}OrganizationLocalAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "localAddress"
    })
    public static class LocalAddressCollection {

        @XmlElement(name = "LocalAddress", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<OrganizationLocalAddress> localAddress;

        /**
         * Gets the value of the localAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the localAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocalAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationLocalAddress }
         * 
         * 
         */
        public List<OrganizationLocalAddress> getLocalAddress() {
            if (localAddress == null) {
                localAddress = new ArrayList<OrganizationLocalAddress>();
            }
            return this.localAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="RegistrationNumber" type="{http://www.freighttrust.com/schema/universal/2020/06}RegistrationNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "registrationNumber"
    })
    public static class RegistrationNumberCollection {

        @XmlElement(name = "RegistrationNumber", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<RegistrationNumber> registrationNumber;

        /**
         * Gets the value of the registrationNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the registrationNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegistrationNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RegistrationNumber }
         * 
         * 
         */
        public List<RegistrationNumber> getRegistrationNumber() {
            if (registrationNumber == null) {
                registrationNumber = new ArrayList<RegistrationNumber>();
            }
            return this.registrationNumber;
        }

    }

}
