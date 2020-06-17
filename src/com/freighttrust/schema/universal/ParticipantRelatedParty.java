
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipantRelatedParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantRelatedParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Party" type="{http://www.freighttrust.com/schema/universal/2020/06}OrganizationAddress"/&gt;
 *         &lt;element name="RelatedPartyType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Contact"/&gt;
 *               &lt;enumeration value="Organization"/&gt;
 *               &lt;enumeration value="Email"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSubscribed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.freighttrust.com/schema/universal/2020/06}UNLOCO" minOccurs="0"/&gt;
 *         &lt;element name="Relation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
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
@XmlType(name = "ParticipantRelatedParty", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class ParticipantRelatedParty {

    @XmlElement(name = "Party", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected OrganizationAddress party;
    @XmlElement(name = "RelatedPartyType", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String relatedPartyType;
    @XmlElement(name = "IsActive", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isActive;
    @XmlElement(name = "IsSubscribed", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isSubscribed;
    @XmlElement(name = "Location", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected UNLOCO location;
    @XmlElement(name = "Relation", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String relation;

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAddress }
     *     
     */
    public OrganizationAddress getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAddress }
     *     
     */
    public void setParty(OrganizationAddress value) {
        this.party = value;
    }

    /**
     * Gets the value of the relatedPartyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedPartyType() {
        return relatedPartyType;
    }

    /**
     * Sets the value of the relatedPartyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedPartyType(String value) {
        this.relatedPartyType = value;
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

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

}
