
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Context complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Context"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Type" type="{http://www.freighttrust.com/schema/universal/2020/06}ContextType"/&gt;
 *         &lt;element name="Value"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2147483647"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubContextCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SubContext" type="{http://www.freighttrust.com/schema/universal/2020/06}Context" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Context", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class Context {

    @XmlElement(name = "Type", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected ContextType type;
    @XmlElement(name = "Value", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String value;
    @XmlElement(name = "SubContextCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Context.SubContextCollection subContextCollection;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ContextType }
     *     
     */
    public ContextType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextType }
     *     
     */
    public void setType(ContextType value) {
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

    /**
     * Gets the value of the subContextCollection property.
     * 
     * @return
     *     possible object is
     *     {@link Context.SubContextCollection }
     *     
     */
    public Context.SubContextCollection getSubContextCollection() {
        return subContextCollection;
    }

    /**
     * Sets the value of the subContextCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context.SubContextCollection }
     *     
     */
    public void setSubContextCollection(Context.SubContextCollection value) {
        this.subContextCollection = value;
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
     *         &lt;element name="SubContext" type="{http://www.freighttrust.com/schema/universal/2020/06}Context" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "subContext"
    })
    public static class SubContextCollection {

        @XmlElement(name = "SubContext", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<Context> subContext;

        /**
         * Gets the value of the subContext property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subContext property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubContext().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Context }
         * 
         * 
         */
        public List<Context> getSubContext() {
            if (subContext == null) {
                subContext = new ArrayList<Context>();
            }
            return this.subContext;
        }

    }

}
