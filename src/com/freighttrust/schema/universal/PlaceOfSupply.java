
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceOfSupply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceOfSupply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Location" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair5Char" minOccurs="0"/&gt;
 *         &lt;element name="LocationType" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOfSupply", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class PlaceOfSupply {

    @XmlElement(name = "Location", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair5Char location;
    @XmlElement(name = "LocationType", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair locationType;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair5Char }
     *     
     */
    public CodeDescriptionPair5Char getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair5Char }
     *     
     */
    public void setLocation(CodeDescriptionPair5Char value) {
        this.location = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setLocationType(CodeDescriptionPair value) {
        this.locationType = value;
    }

}
