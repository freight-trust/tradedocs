
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="AuthorizationExpiryDate" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AuthorizationReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Method" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementMethod", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class SettlementMethod {

    @XmlElement(name = "AuthorizationExpiryDate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String authorizationExpiryDate;
    @XmlElement(name = "AuthorizationReference", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String authorizationReference;
    @XmlElement(name = "Method", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair method;

    /**
     * Gets the value of the authorizationExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationExpiryDate() {
        return authorizationExpiryDate;
    }

    /**
     * Sets the value of the authorizationExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationExpiryDate(String value) {
        this.authorizationExpiryDate = value;
    }

    /**
     * Gets the value of the authorizationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationReference() {
        return authorizationReference;
    }

    /**
     * Sets the value of the authorizationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationReference(String value) {
        this.authorizationReference = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setMethod(CodeDescriptionPair value) {
        this.method = value;
    }

}
