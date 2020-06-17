
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxMessageID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxMessageID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TaxMessageCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EnglishTaxMessage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaxGroupCode" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="VATGSTExemptionDocumentType" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxMessageID", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class TaxMessageID {

    @XmlElement(name = "TaxMessageCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String taxMessageCode;
    @XmlElement(name = "Description", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String description;
    @XmlElement(name = "EnglishTaxMessage", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String englishTaxMessage;
    @XmlElement(name = "TaxGroupCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair taxGroupCode;
    @XmlElement(name = "VATGSTExemptionDocumentType", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair vatgstExemptionDocumentType;

    /**
     * Gets the value of the taxMessageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMessageCode() {
        return taxMessageCode;
    }

    /**
     * Sets the value of the taxMessageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMessageCode(String value) {
        this.taxMessageCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the englishTaxMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishTaxMessage() {
        return englishTaxMessage;
    }

    /**
     * Sets the value of the englishTaxMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishTaxMessage(String value) {
        this.englishTaxMessage = value;
    }

    /**
     * Gets the value of the taxGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getTaxGroupCode() {
        return taxGroupCode;
    }

    /**
     * Sets the value of the taxGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setTaxGroupCode(CodeDescriptionPair value) {
        this.taxGroupCode = value;
    }

    /**
     * Gets the value of the vatgstExemptionDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getVATGSTExemptionDocumentType() {
        return vatgstExemptionDocumentType;
    }

    /**
     * Sets the value of the vatgstExemptionDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setVATGSTExemptionDocumentType(CodeDescriptionPair value) {
        this.vatgstExemptionDocumentType = value;
    }

}
