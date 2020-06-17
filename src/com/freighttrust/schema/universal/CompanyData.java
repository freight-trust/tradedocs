
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CompanyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="GlbCompany" type="{http://www.freighttrust.com/Schemas/Native/2011/11}NativeCompany"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyData", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11", propOrder = {

})
public class CompanyData {

    @XmlElement(name = "GlbCompany", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11", required = true)
    protected NativeCompany glbCompany;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

    /**
     * Gets the value of the glbCompany property.
     * 
     * @return
     *     possible object is
     *     {@link NativeCompany }
     *     
     */
    public NativeCompany getGlbCompany() {
        return glbCompany;
    }

    /**
     * Sets the value of the glbCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeCompany }
     *     
     */
    public void setGlbCompany(NativeCompany value) {
        this.glbCompany = value;
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

}
