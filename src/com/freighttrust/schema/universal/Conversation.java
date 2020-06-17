
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conversation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conversation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ConversationMessageCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ConversationMessage" type="{http://www.freighttrust.com/schema/universal/2020/06}ConversationMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ParticipantGroupCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ParticipantGroup" type="{http://www.freighttrust.com/schema/universal/2020/06}ParticipantGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ParticipantRelatedPartyCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ParticipantRelatedParty" type="{http://www.freighttrust.com/schema/universal/2020/06}ParticipantRelatedParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ParticipantStaffCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ParticipantStaff" type="{http://www.freighttrust.com/schema/universal/2020/06}ParticipantStaff" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Conversation", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class Conversation {

    @XmlElement(name = "ConversationMessageCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Conversation.ConversationMessageCollection conversationMessageCollection;
    @XmlElement(name = "ParticipantGroupCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Conversation.ParticipantGroupCollection participantGroupCollection;
    @XmlElement(name = "ParticipantRelatedPartyCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Conversation.ParticipantRelatedPartyCollection participantRelatedPartyCollection;
    @XmlElement(name = "ParticipantStaffCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Conversation.ParticipantStaffCollection participantStaffCollection;

    /**
     * Gets the value of the conversationMessageCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Conversation.ConversationMessageCollection }
     *     
     */
    public Conversation.ConversationMessageCollection getConversationMessageCollection() {
        return conversationMessageCollection;
    }

    /**
     * Sets the value of the conversationMessageCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversation.ConversationMessageCollection }
     *     
     */
    public void setConversationMessageCollection(Conversation.ConversationMessageCollection value) {
        this.conversationMessageCollection = value;
    }

    /**
     * Gets the value of the participantGroupCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Conversation.ParticipantGroupCollection }
     *     
     */
    public Conversation.ParticipantGroupCollection getParticipantGroupCollection() {
        return participantGroupCollection;
    }

    /**
     * Sets the value of the participantGroupCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversation.ParticipantGroupCollection }
     *     
     */
    public void setParticipantGroupCollection(Conversation.ParticipantGroupCollection value) {
        this.participantGroupCollection = value;
    }

    /**
     * Gets the value of the participantRelatedPartyCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Conversation.ParticipantRelatedPartyCollection }
     *     
     */
    public Conversation.ParticipantRelatedPartyCollection getParticipantRelatedPartyCollection() {
        return participantRelatedPartyCollection;
    }

    /**
     * Sets the value of the participantRelatedPartyCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversation.ParticipantRelatedPartyCollection }
     *     
     */
    public void setParticipantRelatedPartyCollection(Conversation.ParticipantRelatedPartyCollection value) {
        this.participantRelatedPartyCollection = value;
    }

    /**
     * Gets the value of the participantStaffCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Conversation.ParticipantStaffCollection }
     *     
     */
    public Conversation.ParticipantStaffCollection getParticipantStaffCollection() {
        return participantStaffCollection;
    }

    /**
     * Sets the value of the participantStaffCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Conversation.ParticipantStaffCollection }
     *     
     */
    public void setParticipantStaffCollection(Conversation.ParticipantStaffCollection value) {
        this.participantStaffCollection = value;
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
     *         &lt;element name="ConversationMessage" type="{http://www.freighttrust.com/schema/universal/2020/06}ConversationMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "conversationMessage"
    })
    public static class ConversationMessageCollection {

        @XmlElement(name = "ConversationMessage", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<ConversationMessage> conversationMessage;

        /**
         * Gets the value of the conversationMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conversationMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConversationMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConversationMessage }
         * 
         * 
         */
        public List<ConversationMessage> getConversationMessage() {
            if (conversationMessage == null) {
                conversationMessage = new ArrayList<ConversationMessage>();
            }
            return this.conversationMessage;
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
     *         &lt;element name="ParticipantGroup" type="{http://www.freighttrust.com/schema/universal/2020/06}ParticipantGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "participantGroup"
    })
    public static class ParticipantGroupCollection {

        @XmlElement(name = "ParticipantGroup", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<ParticipantGroup> participantGroup;

        /**
         * Gets the value of the participantGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the participantGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticipantGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParticipantGroup }
         * 
         * 
         */
        public List<ParticipantGroup> getParticipantGroup() {
            if (participantGroup == null) {
                participantGroup = new ArrayList<ParticipantGroup>();
            }
            return this.participantGroup;
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
     *         &lt;element name="ParticipantRelatedParty" type="{http://www.freighttrust.com/schema/universal/2020/06}ParticipantRelatedParty" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "participantRelatedParty"
    })
    public static class ParticipantRelatedPartyCollection {

        @XmlElement(name = "ParticipantRelatedParty", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<ParticipantRelatedParty> participantRelatedParty;

        /**
         * Gets the value of the participantRelatedParty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the participantRelatedParty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticipantRelatedParty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParticipantRelatedParty }
         * 
         * 
         */
        public List<ParticipantRelatedParty> getParticipantRelatedParty() {
            if (participantRelatedParty == null) {
                participantRelatedParty = new ArrayList<ParticipantRelatedParty>();
            }
            return this.participantRelatedParty;
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
     *         &lt;element name="ParticipantStaff" type="{http://www.freighttrust.com/schema/universal/2020/06}ParticipantStaff" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "participantStaff"
    })
    public static class ParticipantStaffCollection {

        @XmlElement(name = "ParticipantStaff", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<ParticipantStaff> participantStaff;

        /**
         * Gets the value of the participantStaff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the participantStaff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticipantStaff().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParticipantStaff }
         * 
         * 
         */
        public List<ParticipantStaff> getParticipantStaff() {
            if (participantStaff == null) {
                participantStaff = new ArrayList<ParticipantStaff>();
            }
            return this.participantStaff;
        }

    }

}
