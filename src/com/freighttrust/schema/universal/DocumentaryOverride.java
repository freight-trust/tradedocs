
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentaryOverride complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentaryOverride"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DataVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DocumentName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsSystemDefined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentaryOverride", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class DocumentaryOverride {

    @XmlElement(name = "DataVersion", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Integer dataVersion;
    @XmlElement(name = "DocumentName", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String documentName;
    @XmlElement(name = "IsSystemDefined", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isSystemDefined;
    @XmlElement(name = "Purpose", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair purpose;
    @XmlElement(name = "SubmissionVersion", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Integer submissionVersion;

    /**
     * Gets the value of the dataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataVersion() {
        return dataVersion;
    }

    /**
     * Sets the value of the dataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataVersion(Integer value) {
        this.dataVersion = value;
    }

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the isSystemDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSystemDefined() {
        return isSystemDefined;
    }

    /**
     * Sets the value of the isSystemDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSystemDefined(Boolean value) {
        this.isSystemDefined = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setPurpose(CodeDescriptionPair value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the submissionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubmissionVersion() {
        return submissionVersion;
    }

    /**
     * Sets the value of the submissionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubmissionVersion(Integer value) {
        this.submissionVersion = value;
    }

}
