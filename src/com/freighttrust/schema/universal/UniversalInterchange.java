
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


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
 *         &lt;element name="Header"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Acknowledgement" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Required"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="OnAll"/&gt;
 *                                   &lt;enumeration value="OnError"/&gt;
 *                                   &lt;enumeration value="OnSuccess"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Channel"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="eHub"/&gt;
 *                                   &lt;enumeration value="eAdaptor"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ContextCollection" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Context" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DeliveryMetadata" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ValueCollection" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Value" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="Type"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;enumeration value="String"/&gt;
 *                                                       &lt;enumeration value="DateTime"/&gt;
 *                                                       &lt;enumeration value="Integer"/&gt;
 *                                                       &lt;enumeration value="Decimal"/&gt;
 *                                                       &lt;enumeration value="Byte"/&gt;
 *                                                       &lt;enumeration value="Boolean"/&gt;
 *                                                       &lt;enumeration value="Short"/&gt;
 *                                                       &lt;enumeration value="DateTimeOffset"/&gt;
 *                                                       &lt;enumeration value="Geography"/&gt;
 *                                                       &lt;enumeration value="Base64Binary"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Body"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "body"
})
@XmlRootElement(name = "UniversalInterchange", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
public class UniversalInterchange {

    @XmlElement(name = "Header", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected UniversalInterchange.Header header;
    @XmlElement(name = "Body", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected UniversalInterchange.Body body;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalInterchange.Header }
     *     
     */
    public UniversalInterchange.Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalInterchange.Header }
     *     
     */
    public void setHeader(UniversalInterchange.Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalInterchange.Body }
     *     
     */
    public UniversalInterchange.Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalInterchange.Body }
     *     
     */
    public void setBody(UniversalInterchange.Body value) {
        this.body = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "any"
    })
    public static class Body {

        @XmlAnyElement
        protected List<Element> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
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
     *         &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Acknowledgement" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Required"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="OnAll"/&gt;
     *                         &lt;enumeration value="OnError"/&gt;
     *                         &lt;enumeration value="OnSuccess"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Channel"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="eHub"/&gt;
     *                         &lt;enumeration value="eAdaptor"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ContextCollection" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Context" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DeliveryMetadata" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ValueCollection" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Value" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="Type"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;enumeration value="String"/&gt;
     *                                             &lt;enumeration value="DateTime"/&gt;
     *                                             &lt;enumeration value="Integer"/&gt;
     *                                             &lt;enumeration value="Decimal"/&gt;
     *                                             &lt;enumeration value="Byte"/&gt;
     *                                             &lt;enumeration value="Boolean"/&gt;
     *                                             &lt;enumeration value="Short"/&gt;
     *                                             &lt;enumeration value="DateTimeOffset"/&gt;
     *                                             &lt;enumeration value="Geography"/&gt;
     *                                             &lt;enumeration value="Base64Binary"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "senderID",
        "recipientID",
        "acknowledgement",
        "deliveryMetadata"
    })
    public static class Header {

        @XmlElement(name = "SenderID", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
        protected String senderID;
        @XmlElement(name = "RecipientID", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
        protected String recipientID;
        @XmlElement(name = "Acknowledgement", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected UniversalInterchange.Header.Acknowledgement acknowledgement;
        @XmlElement(name = "DeliveryMetadata", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected UniversalInterchange.Header.DeliveryMetadata deliveryMetadata;

        /**
         * Gets the value of the senderID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSenderID() {
            return senderID;
        }

        /**
         * Sets the value of the senderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSenderID(String value) {
            this.senderID = value;
        }

        /**
         * Gets the value of the recipientID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecipientID() {
            return recipientID;
        }

        /**
         * Sets the value of the recipientID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecipientID(String value) {
            this.recipientID = value;
        }

        /**
         * Gets the value of the acknowledgement property.
         * 
         * @return
         *     possible object is
         *     {@link UniversalInterchange.Header.Acknowledgement }
         *     
         */
        public UniversalInterchange.Header.Acknowledgement getAcknowledgement() {
            return acknowledgement;
        }

        /**
         * Sets the value of the acknowledgement property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniversalInterchange.Header.Acknowledgement }
         *     
         */
        public void setAcknowledgement(UniversalInterchange.Header.Acknowledgement value) {
            this.acknowledgement = value;
        }

        /**
         * Gets the value of the deliveryMetadata property.
         * 
         * @return
         *     possible object is
         *     {@link UniversalInterchange.Header.DeliveryMetadata }
         *     
         */
        public UniversalInterchange.Header.DeliveryMetadata getDeliveryMetadata() {
            return deliveryMetadata;
        }

        /**
         * Sets the value of the deliveryMetadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link UniversalInterchange.Header.DeliveryMetadata }
         *     
         */
        public void setDeliveryMetadata(UniversalInterchange.Header.DeliveryMetadata value) {
            this.deliveryMetadata = value;
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
         *         &lt;element name="Required"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="OnAll"/&gt;
         *               &lt;enumeration value="OnError"/&gt;
         *               &lt;enumeration value="OnSuccess"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Channel"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="eHub"/&gt;
         *               &lt;enumeration value="eAdaptor"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RecipientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ContextCollection" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Context" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "required",
            "channel",
            "recipientID",
            "contextCollection"
        })
        public static class Acknowledgement {

            @XmlElement(name = "Required", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
            protected String required;
            @XmlElement(name = "Channel", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
            protected String channel;
            @XmlElement(name = "RecipientID", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
            protected String recipientID;
            @XmlElement(name = "ContextCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
            protected UniversalInterchange.Header.Acknowledgement.ContextCollection contextCollection;

            /**
             * Gets the value of the required property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequired() {
                return required;
            }

            /**
             * Sets the value of the required property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequired(String value) {
                this.required = value;
            }

            /**
             * Gets the value of the channel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChannel() {
                return channel;
            }

            /**
             * Sets the value of the channel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChannel(String value) {
                this.channel = value;
            }

            /**
             * Gets the value of the recipientID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecipientID() {
                return recipientID;
            }

            /**
             * Sets the value of the recipientID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecipientID(String value) {
                this.recipientID = value;
            }

            /**
             * Gets the value of the contextCollection property.
             * 
             * @return
             *     possible object is
             *     {@link UniversalInterchange.Header.Acknowledgement.ContextCollection }
             *     
             */
            public UniversalInterchange.Header.Acknowledgement.ContextCollection getContextCollection() {
                return contextCollection;
            }

            /**
             * Sets the value of the contextCollection property.
             * 
             * @param value
             *     allowed object is
             *     {@link UniversalInterchange.Header.Acknowledgement.ContextCollection }
             *     
             */
            public void setContextCollection(UniversalInterchange.Header.Acknowledgement.ContextCollection value) {
                this.contextCollection = value;
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
             *         &lt;element name="Context" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "context"
            })
            public static class ContextCollection {

                @XmlElement(name = "Context", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
                protected List<UniversalInterchange.Header.Acknowledgement.ContextCollection.Context> context;

                /**
                 * Gets the value of the context property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the context property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContext().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UniversalInterchange.Header.Acknowledgement.ContextCollection.Context }
                 * 
                 * 
                 */
                public List<UniversalInterchange.Header.Acknowledgement.ContextCollection.Context> getContext() {
                    if (context == null) {
                        context = new ArrayList<UniversalInterchange.Header.Acknowledgement.ContextCollection.Context>();
                    }
                    return this.context;
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
                 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "type",
                    "value"
                })
                public static class Context {

                    @XmlElement(name = "Type", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
                    protected String type;
                    @XmlElement(name = "Value", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
                    protected String value;

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
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
         *         &lt;element name="ValueCollection" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Value" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="Type"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;enumeration value="String"/&gt;
         *                                   &lt;enumeration value="DateTime"/&gt;
         *                                   &lt;enumeration value="Integer"/&gt;
         *                                   &lt;enumeration value="Decimal"/&gt;
         *                                   &lt;enumeration value="Byte"/&gt;
         *                                   &lt;enumeration value="Boolean"/&gt;
         *                                   &lt;enumeration value="Short"/&gt;
         *                                   &lt;enumeration value="DateTimeOffset"/&gt;
         *                                   &lt;enumeration value="Geography"/&gt;
         *                                   &lt;enumeration value="Base64Binary"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
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
            "valueCollection"
        })
        public static class DeliveryMetadata {

            @XmlElement(name = "ValueCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
            protected UniversalInterchange.Header.DeliveryMetadata.ValueCollection valueCollection;

            /**
             * Gets the value of the valueCollection property.
             * 
             * @return
             *     possible object is
             *     {@link UniversalInterchange.Header.DeliveryMetadata.ValueCollection }
             *     
             */
            public UniversalInterchange.Header.DeliveryMetadata.ValueCollection getValueCollection() {
                return valueCollection;
            }

            /**
             * Sets the value of the valueCollection property.
             * 
             * @param value
             *     allowed object is
             *     {@link UniversalInterchange.Header.DeliveryMetadata.ValueCollection }
             *     
             */
            public void setValueCollection(UniversalInterchange.Header.DeliveryMetadata.ValueCollection value) {
                this.valueCollection = value;
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
             *         &lt;element name="Value" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="Type"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;enumeration value="String"/&gt;
             *                         &lt;enumeration value="DateTime"/&gt;
             *                         &lt;enumeration value="Integer"/&gt;
             *                         &lt;enumeration value="Decimal"/&gt;
             *                         &lt;enumeration value="Byte"/&gt;
             *                         &lt;enumeration value="Boolean"/&gt;
             *                         &lt;enumeration value="Short"/&gt;
             *                         &lt;enumeration value="DateTimeOffset"/&gt;
             *                         &lt;enumeration value="Geography"/&gt;
             *                         &lt;enumeration value="Base64Binary"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
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
                "value"
            })
            public static class ValueCollection {

                @XmlElement(name = "Value", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
                protected List<UniversalInterchange.Header.DeliveryMetadata.ValueCollection.Value> value;

                /**
                 * Gets the value of the value property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the value property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getValue().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UniversalInterchange.Header.DeliveryMetadata.ValueCollection.Value }
                 * 
                 * 
                 */
                public List<UniversalInterchange.Header.DeliveryMetadata.ValueCollection.Value> getValue() {
                    if (value == null) {
                        value = new ArrayList<UniversalInterchange.Header.DeliveryMetadata.ValueCollection.Value>();
                    }
                    return this.value;
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
                 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="Type"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;enumeration value="String"/&gt;
                 *               &lt;enumeration value="DateTime"/&gt;
                 *               &lt;enumeration value="Integer"/&gt;
                 *               &lt;enumeration value="Decimal"/&gt;
                 *               &lt;enumeration value="Byte"/&gt;
                 *               &lt;enumeration value="Boolean"/&gt;
                 *               &lt;enumeration value="Short"/&gt;
                 *               &lt;enumeration value="DateTimeOffset"/&gt;
                 *               &lt;enumeration value="Geography"/&gt;
                 *               &lt;enumeration value="Base64Binary"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "name",
                    "type",
                    "data"
                })
                public static class Value {

                    @XmlElement(name = "Name", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
                    protected String name;
                    @XmlElement(name = "Type", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
                    protected String type;
                    @XmlElement(name = "Data", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
                    protected String data;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the data property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getData() {
                        return data;
                    }

                    /**
                     * Sets the value of the data property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setData(String value) {
                        this.data = value;
                    }

                }

            }

        }

    }

}
