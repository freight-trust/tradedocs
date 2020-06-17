
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="OriginalTransactionComplianceSubType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginalTransactionDate" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginalTransactionJobInvoiceNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="38"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginalTransactionNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="38"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginalTransactionReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "OriginalReference", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class OriginalReference {

    @XmlElement(name = "OriginalTransactionComplianceSubType", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String originalTransactionComplianceSubType;
    @XmlElement(name = "OriginalTransactionDate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String originalTransactionDate;
    @XmlElement(name = "OriginalTransactionJobInvoiceNumber", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String originalTransactionJobInvoiceNumber;
    @XmlElement(name = "OriginalTransactionNumber", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String originalTransactionNumber;
    @XmlElement(name = "OriginalTransactionReference", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String originalTransactionReference;

    /**
     * Gets the value of the originalTransactionComplianceSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionComplianceSubType() {
        return originalTransactionComplianceSubType;
    }

    /**
     * Sets the value of the originalTransactionComplianceSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionComplianceSubType(String value) {
        this.originalTransactionComplianceSubType = value;
    }

    /**
     * Gets the value of the originalTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionDate() {
        return originalTransactionDate;
    }

    /**
     * Sets the value of the originalTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionDate(String value) {
        this.originalTransactionDate = value;
    }

    /**
     * Gets the value of the originalTransactionJobInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionJobInvoiceNumber() {
        return originalTransactionJobInvoiceNumber;
    }

    /**
     * Sets the value of the originalTransactionJobInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionJobInvoiceNumber(String value) {
        this.originalTransactionJobInvoiceNumber = value;
    }

    /**
     * Gets the value of the originalTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionNumber() {
        return originalTransactionNumber;
    }

    /**
     * Sets the value of the originalTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionNumber(String value) {
        this.originalTransactionNumber = value;
    }

    /**
     * Gets the value of the originalTransactionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionReference() {
        return originalTransactionReference;
    }

    /**
     * Sets the value of the originalTransactionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionReference(String value) {
        this.originalTransactionReference = value;
    }

}
