
package com.freighttrust.schemas._native._2011._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProductData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="OrgSupplierPart" type="{http://www.freighttrust.com/Schemas/Native/2011/11}NativeProduct"/&gt;
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
@XmlType(name = "ProductData", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11", propOrder = {

})
public class ProductData {

    @XmlElement(name = "OrgSupplierPart", namespace = "http://www.freighttrust.com/Schemas/Native/2011/11", required = true)
    protected NativeProduct orgSupplierPart;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

    /**
     * Gets the value of the orgSupplierPart property.
     * 
     * @return
     *     possible object is
     *     {@link NativeProduct }
     *     
     */
    public NativeProduct getOrgSupplierPart() {
        return orgSupplierPart;
    }

    /**
     * Sets the value of the orgSupplierPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeProduct }
     *     
     */
    public void setOrgSupplierPart(NativeProduct value) {
        this.orgSupplierPart = value;
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
