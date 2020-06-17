
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachedDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachedDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="FileName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="277"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImageData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="Type" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair"/&gt;
 *         &lt;element name="IsPublished" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SaveDateUTC" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SavedBy" type="{http://www.freighttrust.com/schema/universal/2020/06}Staff" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="VisibleBranchCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VisibleCompanyCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VisibleDepartmentCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContextCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Context" type="{http://www.freighttrust.com/schema/universal/2020/06}Context" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AttachedDocument", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class AttachedDocument {

    @XmlElement(name = "FileName", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String fileName;
    @XmlElement(name = "ImageData", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected byte[] imageData;
    @XmlElement(name = "Type", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected CodeDescriptionPair type;
    @XmlElement(name = "IsPublished", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isPublished;
    @XmlElement(name = "SaveDateUTC", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String saveDateUTC;
    @XmlElement(name = "SavedBy", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Staff savedBy;
    @XmlElement(name = "Source", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair source;
    @XmlElement(name = "VisibleBranchCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String visibleBranchCode;
    @XmlElement(name = "VisibleCompanyCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String visibleCompanyCode;
    @XmlElement(name = "VisibleDepartmentCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String visibleDepartmentCode;
    @XmlElement(name = "ContextCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected AttachedDocument.ContextCollection contextCollection;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the imageData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageData() {
        return imageData;
    }

    /**
     * Sets the value of the imageData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageData(byte[] value) {
        this.imageData = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setType(CodeDescriptionPair value) {
        this.type = value;
    }

    /**
     * Gets the value of the isPublished property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPublished(Boolean value) {
        this.isPublished = value;
    }

    /**
     * Gets the value of the saveDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveDateUTC() {
        return saveDateUTC;
    }

    /**
     * Sets the value of the saveDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveDateUTC(String value) {
        this.saveDateUTC = value;
    }

    /**
     * Gets the value of the savedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    public Staff getSavedBy() {
        return savedBy;
    }

    /**
     * Sets the value of the savedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setSavedBy(Staff value) {
        this.savedBy = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setSource(CodeDescriptionPair value) {
        this.source = value;
    }

    /**
     * Gets the value of the visibleBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleBranchCode() {
        return visibleBranchCode;
    }

    /**
     * Sets the value of the visibleBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleBranchCode(String value) {
        this.visibleBranchCode = value;
    }

    /**
     * Gets the value of the visibleCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleCompanyCode() {
        return visibleCompanyCode;
    }

    /**
     * Sets the value of the visibleCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleCompanyCode(String value) {
        this.visibleCompanyCode = value;
    }

    /**
     * Gets the value of the visibleDepartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleDepartmentCode() {
        return visibleDepartmentCode;
    }

    /**
     * Sets the value of the visibleDepartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleDepartmentCode(String value) {
        this.visibleDepartmentCode = value;
    }

    /**
     * Gets the value of the contextCollection property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedDocument.ContextCollection }
     *     
     */
    public AttachedDocument.ContextCollection getContextCollection() {
        return contextCollection;
    }

    /**
     * Sets the value of the contextCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedDocument.ContextCollection }
     *     
     */
    public void setContextCollection(AttachedDocument.ContextCollection value) {
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
     *         &lt;element name="Context" type="{http://www.freighttrust.com/schema/universal/2020/06}Context" maxOccurs="unbounded" minOccurs="0"/&gt;
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

        @XmlElement(name = "Context", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<Context> context;

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
         * {@link Context }
         * 
         * 
         */
        public List<Context> getContext() {
            if (context == null) {
                context = new ArrayList<Context>();
            }
            return this.context;
        }

    }

}
