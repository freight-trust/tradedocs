
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTracking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentTracking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DocumentPeriod" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair"/&gt;
 *         &lt;element name="DocumentUsage" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair"/&gt;
 *         &lt;element name="Category" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.freighttrust.com/schema/universal/2020/06}Country" minOccurs="0"/&gt;
 *         &lt;element name="DocumentNote" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DocumentNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DocumentOwner" type="{http://www.freighttrust.com/schema/universal/2020/06}OrganizationAddress" minOccurs="0"/&gt;
 *         &lt;element name="IsDocumentCreditControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOriginalDocumentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedDate" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedFromCustomsBroker" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ReturnToShipper" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SentToCustomsBroker" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ValidToDate" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DocumentTrackingAttributeCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DocumentTrackingAttribute" type="{http://www.freighttrust.com/schema/universal/2020/06}DocumentTrackingAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DocumentTracking", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class DocumentTracking {

    @XmlElement(name = "DocumentPeriod", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected CodeDescriptionPair documentPeriod;
    @XmlElement(name = "DocumentType", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected CodeDescriptionPair documentType;
    @XmlElement(name = "DocumentUsage", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected CodeDescriptionPair documentUsage;
    @XmlElement(name = "Category", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair category;
    @XmlElement(name = "Country", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Country country;
    @XmlElement(name = "DocumentNote", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String documentNote;
    @XmlElement(name = "DocumentNumber", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String documentNumber;
    @XmlElement(name = "DocumentOwner", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected OrganizationAddress documentOwner;
    @XmlElement(name = "IsDocumentCreditControl", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isDocumentCreditControl;
    @XmlElement(name = "IsOriginalDocumentRequired", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isOriginalDocumentRequired;
    @XmlElement(name = "ReceivedDate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String receivedDate;
    @XmlElement(name = "ReceivedFromCustomsBroker", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String receivedFromCustomsBroker;
    @XmlElement(name = "ReturnToShipper", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String returnToShipper;
    @XmlElement(name = "SentToCustomsBroker", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String sentToCustomsBroker;
    @XmlElement(name = "ValidToDate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String validToDate;
    @XmlElement(name = "DocumentTrackingAttributeCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected DocumentTracking.DocumentTrackingAttributeCollection documentTrackingAttributeCollection;

    /**
     * Gets the value of the documentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getDocumentPeriod() {
        return documentPeriod;
    }

    /**
     * Sets the value of the documentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setDocumentPeriod(CodeDescriptionPair value) {
        this.documentPeriod = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setDocumentType(CodeDescriptionPair value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the documentUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getDocumentUsage() {
        return documentUsage;
    }

    /**
     * Sets the value of the documentUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setDocumentUsage(CodeDescriptionPair value) {
        this.documentUsage = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setCategory(CodeDescriptionPair value) {
        this.category = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the documentNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNote() {
        return documentNote;
    }

    /**
     * Sets the value of the documentNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNote(String value) {
        this.documentNote = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentOwner property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAddress }
     *     
     */
    public OrganizationAddress getDocumentOwner() {
        return documentOwner;
    }

    /**
     * Sets the value of the documentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAddress }
     *     
     */
    public void setDocumentOwner(OrganizationAddress value) {
        this.documentOwner = value;
    }

    /**
     * Gets the value of the isDocumentCreditControl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDocumentCreditControl() {
        return isDocumentCreditControl;
    }

    /**
     * Sets the value of the isDocumentCreditControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDocumentCreditControl(Boolean value) {
        this.isDocumentCreditControl = value;
    }

    /**
     * Gets the value of the isOriginalDocumentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOriginalDocumentRequired() {
        return isOriginalDocumentRequired;
    }

    /**
     * Sets the value of the isOriginalDocumentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOriginalDocumentRequired(Boolean value) {
        this.isOriginalDocumentRequired = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedDate(String value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the receivedFromCustomsBroker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedFromCustomsBroker() {
        return receivedFromCustomsBroker;
    }

    /**
     * Sets the value of the receivedFromCustomsBroker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedFromCustomsBroker(String value) {
        this.receivedFromCustomsBroker = value;
    }

    /**
     * Gets the value of the returnToShipper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnToShipper() {
        return returnToShipper;
    }

    /**
     * Sets the value of the returnToShipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnToShipper(String value) {
        this.returnToShipper = value;
    }

    /**
     * Gets the value of the sentToCustomsBroker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentToCustomsBroker() {
        return sentToCustomsBroker;
    }

    /**
     * Sets the value of the sentToCustomsBroker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentToCustomsBroker(String value) {
        this.sentToCustomsBroker = value;
    }

    /**
     * Gets the value of the validToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidToDate() {
        return validToDate;
    }

    /**
     * Sets the value of the validToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidToDate(String value) {
        this.validToDate = value;
    }

    /**
     * Gets the value of the documentTrackingAttributeCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTracking.DocumentTrackingAttributeCollection }
     *     
     */
    public DocumentTracking.DocumentTrackingAttributeCollection getDocumentTrackingAttributeCollection() {
        return documentTrackingAttributeCollection;
    }

    /**
     * Sets the value of the documentTrackingAttributeCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTracking.DocumentTrackingAttributeCollection }
     *     
     */
    public void setDocumentTrackingAttributeCollection(DocumentTracking.DocumentTrackingAttributeCollection value) {
        this.documentTrackingAttributeCollection = value;
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
     *         &lt;element name="DocumentTrackingAttribute" type="{http://www.freighttrust.com/schema/universal/2020/06}DocumentTrackingAttribute" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "documentTrackingAttribute"
    })
    public static class DocumentTrackingAttributeCollection {

        @XmlElement(name = "DocumentTrackingAttribute", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<DocumentTrackingAttribute> documentTrackingAttribute;

        /**
         * Gets the value of the documentTrackingAttribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the documentTrackingAttribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocumentTrackingAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentTrackingAttribute }
         * 
         * 
         */
        public List<DocumentTrackingAttribute> getDocumentTrackingAttribute() {
            if (documentTrackingAttribute == null) {
                documentTrackingAttribute = new ArrayList<DocumentTrackingAttribute>();
            }
            return this.documentTrackingAttribute;
        }

    }

}
