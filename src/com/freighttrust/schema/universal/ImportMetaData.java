
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportMetaData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Instruction"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Insert"/&gt;
 *               &lt;enumeration value="Update"/&gt;
 *               &lt;enumeration value="UpdateAndInsertIfNotFound"/&gt;
 *               &lt;enumeration value="Delete"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostingInstruction" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="PostCost"/&gt;
 *               &lt;enumeration value="PostRevenue"/&gt;
 *               &lt;enumeration value="PostRevenueAndCost"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MatchingCriteriaCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MatchingCriteria" type="{http://www.freighttrust.com/schema/universal/2020/06}MatchingCriteria" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ImportMetaData", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class ImportMetaData {

    @XmlElement(name = "Instruction", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String instruction;
    @XmlElement(name = "PostingInstruction", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String postingInstruction;
    @XmlElement(name = "MatchingCriteriaCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected ImportMetaData.MatchingCriteriaCollection matchingCriteriaCollection;

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstruction(String value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the postingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingInstruction() {
        return postingInstruction;
    }

    /**
     * Sets the value of the postingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingInstruction(String value) {
        this.postingInstruction = value;
    }

    /**
     * Gets the value of the matchingCriteriaCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ImportMetaData.MatchingCriteriaCollection }
     *     
     */
    public ImportMetaData.MatchingCriteriaCollection getMatchingCriteriaCollection() {
        return matchingCriteriaCollection;
    }

    /**
     * Sets the value of the matchingCriteriaCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportMetaData.MatchingCriteriaCollection }
     *     
     */
    public void setMatchingCriteriaCollection(ImportMetaData.MatchingCriteriaCollection value) {
        this.matchingCriteriaCollection = value;
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
     *         &lt;element name="MatchingCriteria" type="{http://www.freighttrust.com/schema/universal/2020/06}MatchingCriteria" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "matchingCriteria"
    })
    public static class MatchingCriteriaCollection {

        @XmlElement(name = "MatchingCriteria", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<MatchingCriteria> matchingCriteria;

        /**
         * Gets the value of the matchingCriteria property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the matchingCriteria property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMatchingCriteria().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MatchingCriteria }
         * 
         * 
         */
        public List<MatchingCriteria> getMatchingCriteria() {
            if (matchingCriteria == null) {
                matchingCriteria = new ArrayList<MatchingCriteria>();
            }
            return this.matchingCriteria;
        }

    }

}
