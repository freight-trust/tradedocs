
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NativeVessel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NativeVessel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LloydsNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RadioCallSign" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NetRegisterTon" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VesselType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CarrierCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="YearOfConstruction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MalaysiaVesselId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScreeningStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrgHeader" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Code" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="12"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RefCarrierConsortium" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CountryOfReg" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Code" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *                 &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *                 &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NativeVessel", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11", propOrder = {

})
public class NativeVessel {

    @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String pk;
    @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String code;
    @XmlElement(name = "LloydsNumber", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String lloydsNumber;
    @XmlElement(name = "RadioCallSign", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String radioCallSign;
    @XmlElement(name = "NetRegisterTon", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Integer netRegisterTon;
    @XmlElement(name = "VesselType", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String vesselType;
    @XmlElement(name = "CarrierCode", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String carrierCode;
    @XmlElement(name = "YearOfConstruction", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Integer yearOfConstruction;
    @XmlElement(name = "MalaysiaVesselId", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String malaysiaVesselId;
    @XmlElement(name = "IsActive", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected Boolean isActive;
    @XmlElement(name = "ScreeningStatus", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected String screeningStatus;
    @XmlElement(name = "OrgHeader", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeVessel.OrgHeader orgHeader;
    @XmlElement(name = "RefCarrierConsortium", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeVessel.RefCarrierConsortium refCarrierConsortium;
    @XmlElement(name = "CountryOfReg", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
    protected NativeVessel.CountryOfReg countryOfReg;
    @XmlAttribute(name = "Action")
    protected Action action;

    /**
     * Gets the value of the pk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPK() {
        return pk;
    }

    /**
     * Sets the value of the pk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPK(String value) {
        this.pk = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the lloydsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLloydsNumber() {
        return lloydsNumber;
    }

    /**
     * Sets the value of the lloydsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLloydsNumber(String value) {
        this.lloydsNumber = value;
    }

    /**
     * Gets the value of the radioCallSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioCallSign() {
        return radioCallSign;
    }

    /**
     * Sets the value of the radioCallSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioCallSign(String value) {
        this.radioCallSign = value;
    }

    /**
     * Gets the value of the netRegisterTon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNetRegisterTon() {
        return netRegisterTon;
    }

    /**
     * Sets the value of the netRegisterTon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNetRegisterTon(Integer value) {
        this.netRegisterTon = value;
    }

    /**
     * Gets the value of the vesselType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselType() {
        return vesselType;
    }

    /**
     * Sets the value of the vesselType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselType(String value) {
        this.vesselType = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the yearOfConstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    /**
     * Sets the value of the yearOfConstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYearOfConstruction(Integer value) {
        this.yearOfConstruction = value;
    }

    /**
     * Gets the value of the malaysiaVesselId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMalaysiaVesselId() {
        return malaysiaVesselId;
    }

    /**
     * Sets the value of the malaysiaVesselId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMalaysiaVesselId(String value) {
        this.malaysiaVesselId = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the screeningStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreeningStatus() {
        return screeningStatus;
    }

    /**
     * Sets the value of the screeningStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreeningStatus(String value) {
        this.screeningStatus = value;
    }

    /**
     * Gets the value of the orgHeader property.
     * 
     * @return
     *     possible object is
     *     {@link NativeVessel.OrgHeader }
     *     
     */
    public NativeVessel.OrgHeader getOrgHeader() {
        return orgHeader;
    }

    /**
     * Sets the value of the orgHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeVessel.OrgHeader }
     *     
     */
    public void setOrgHeader(NativeVessel.OrgHeader value) {
        this.orgHeader = value;
    }

    /**
     * Gets the value of the refCarrierConsortium property.
     * 
     * @return
     *     possible object is
     *     {@link NativeVessel.RefCarrierConsortium }
     *     
     */
    public NativeVessel.RefCarrierConsortium getRefCarrierConsortium() {
        return refCarrierConsortium;
    }

    /**
     * Sets the value of the refCarrierConsortium property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeVessel.RefCarrierConsortium }
     *     
     */
    public void setRefCarrierConsortium(NativeVessel.RefCarrierConsortium value) {
        this.refCarrierConsortium = value;
    }

    /**
     * Gets the value of the countryOfReg property.
     * 
     * @return
     *     possible object is
     *     {@link NativeVessel.CountryOfReg }
     *     
     */
    public NativeVessel.CountryOfReg getCountryOfReg() {
        return countryOfReg;
    }

    /**
     * Sets the value of the countryOfReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeVessel.CountryOfReg }
     *     
     */
    public void setCountryOfReg(NativeVessel.CountryOfReg value) {
        this.countryOfReg = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAction(Action value) {
        this.action = value;
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
     *       &lt;all&gt;
     *         &lt;element name="Code" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *       &lt;attribute name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CountryOfReg {

        @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String code;
        @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String pk;
        @XmlAttribute(name = "Action")
        protected Action action;
        @XmlAttribute(name = "TableName")
        protected String tableName;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the pk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPK() {
            return pk;
        }

        /**
         * Sets the value of the pk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPK(String value) {
            this.pk = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Action }
         *     
         */
        public Action getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Action }
         *     
         */
        public void setAction(Action value) {
            this.action = value;
        }

        /**
         * Gets the value of the tableName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTableName() {
            return tableName;
        }

        /**
         * Sets the value of the tableName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTableName(String value) {
            this.tableName = value;
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
     *       &lt;all&gt;
     *         &lt;element name="Code" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="12"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class OrgHeader {

        @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String code;
        @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String pk;
        @XmlAttribute(name = "Action")
        protected Action action;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the pk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPK() {
            return pk;
        }

        /**
         * Sets the value of the pk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPK(String value) {
            this.pk = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Action }
         *     
         */
        public Action getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Action }
         *     
         */
        public void setAction(Action value) {
            this.action = value;
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
     *       &lt;all&gt;
     *         &lt;element name="PK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *       &lt;attribute name="Action" type="{http://www.freighttrust.com/Schemas/Native/2011/11}Action" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class RefCarrierConsortium {

        @XmlElement(name = "PK", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11")
        protected String pk;
        @XmlAttribute(name = "Action")
        protected Action action;

        /**
         * Gets the value of the pk property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPK() {
            return pk;
        }

        /**
         * Sets the value of the pk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPK(String value) {
            this.pk = value;
        }

        /**
         * Gets the value of the action property.
         * 
         * @return
         *     possible object is
         *     {@link Action }
         *     
         */
        public Action getAction() {
            return action;
        }

        /**
         * Sets the value of the action property.
         * 
         * @param value
         *     allowed object is
         *     {@link Action }
         *     
         */
        public void setAction(Action value) {
            this.action = value;
        }

    }

}
