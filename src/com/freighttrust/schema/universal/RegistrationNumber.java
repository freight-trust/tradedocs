
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistrationNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Type" type="{http://www.freighttrust.com/schema/universal/2020/06}RegistrationNumberType"/&gt;
 *         &lt;element name="CountryOfIssue" type="{http://www.freighttrust.com/schema/universal/2020/06}Country" minOccurs="0"/&gt;
 *         &lt;element name="Value"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="254"/&gt;
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
@XmlType(name = "RegistrationNumber", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class RegistrationNumber {

    @XmlElement(name = "Type", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected RegistrationNumberType type;
    @XmlElement(name = "CountryOfIssue", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Country countryOfIssue;
    @XmlElement(name = "Value", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String value;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationNumberType }
     *     
     */
    public RegistrationNumberType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationNumberType }
     *     
     */
    public void setType(RegistrationNumberType value) {
        this.type = value;
    }

    /**
     * Gets the value of the countryOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountryOfIssue() {
        return countryOfIssue;
    }

    /**
     * Sets the value of the countryOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountryOfIssue(Country value) {
        this.countryOfIssue = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
