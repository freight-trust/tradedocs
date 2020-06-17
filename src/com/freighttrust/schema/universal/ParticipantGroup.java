
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipantGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Group" type="{http://www.freighttrust.com/schema/universal/2020/06}Group"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSubscribed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.freighttrust.com/schema/universal/2020/06}UNLOCO" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantGroup", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class ParticipantGroup {

    @XmlElement(name = "Group", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected Group group;
    @XmlElement(name = "IsActive", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isActive;
    @XmlElement(name = "IsSubscribed", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isSubscribed;
    @XmlElement(name = "Location", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected UNLOCO location;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setGroup(Group value) {
        this.group = value;
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
     * Gets the value of the isSubscribed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSubscribed() {
        return isSubscribed;
    }

    /**
     * Sets the value of the isSubscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSubscribed(Boolean value) {
        this.isSubscribed = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link UNLOCO }
     *     
     */
    public UNLOCO getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNLOCO }
     *     
     */
    public void setLocation(UNLOCO value) {
        this.location = value;
    }

}
