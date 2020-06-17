
package com.freighttrust.schema.universal;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RatingBasis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatingBasis"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="OriginType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Currency" type="{http://www.freighttrust.com/schema/universal/2020/06}Currency" minOccurs="0"/&gt;
 *         &lt;element name="FlatRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IsPercentageRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaximumRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MinimumRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OriginAdditionalReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginKey" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OriginQuantityUnit" type="{http://www.freighttrust.com/schema/universal/2020/06}RatingUnit" minOccurs="0"/&gt;
 *         &lt;element name="PerUnitRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RateUnit" type="{http://www.freighttrust.com/schema/universal/2020/06}RatingUnit" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingBasis", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class RatingBasis {

    @XmlElement(name = "OriginType", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String originType;
    @XmlElement(name = "Currency", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Currency currency;
    @XmlElement(name = "FlatRate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal flatRate;
    @XmlElement(name = "IsPercentageRate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isPercentageRate;
    @XmlElement(name = "MaximumRate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal maximumRate;
    @XmlElement(name = "MinimumRate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal minimumRate;
    @XmlElement(name = "OriginAdditionalReference", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String originAdditionalReference;
    @XmlElement(name = "OriginKey", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String originKey;
    @XmlElement(name = "OriginQuantity", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal originQuantity;
    @XmlElement(name = "OriginQuantityUnit", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected RatingUnit originQuantityUnit;
    @XmlElement(name = "PerUnitRate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal perUnitRate;
    @XmlElement(name = "RateUnit", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected RatingUnit rateUnit;

    /**
     * Gets the value of the originType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginType() {
        return originType;
    }

    /**
     * Sets the value of the originType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginType(String value) {
        this.originType = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the flatRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlatRate() {
        return flatRate;
    }

    /**
     * Sets the value of the flatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlatRate(BigDecimal value) {
        this.flatRate = value;
    }

    /**
     * Gets the value of the isPercentageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPercentageRate() {
        return isPercentageRate;
    }

    /**
     * Sets the value of the isPercentageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPercentageRate(Boolean value) {
        this.isPercentageRate = value;
    }

    /**
     * Gets the value of the maximumRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumRate() {
        return maximumRate;
    }

    /**
     * Sets the value of the maximumRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumRate(BigDecimal value) {
        this.maximumRate = value;
    }

    /**
     * Gets the value of the minimumRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumRate() {
        return minimumRate;
    }

    /**
     * Sets the value of the minimumRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumRate(BigDecimal value) {
        this.minimumRate = value;
    }

    /**
     * Gets the value of the originAdditionalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginAdditionalReference() {
        return originAdditionalReference;
    }

    /**
     * Sets the value of the originAdditionalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginAdditionalReference(String value) {
        this.originAdditionalReference = value;
    }

    /**
     * Gets the value of the originKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginKey() {
        return originKey;
    }

    /**
     * Sets the value of the originKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginKey(String value) {
        this.originKey = value;
    }

    /**
     * Gets the value of the originQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginQuantity() {
        return originQuantity;
    }

    /**
     * Sets the value of the originQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginQuantity(BigDecimal value) {
        this.originQuantity = value;
    }

    /**
     * Gets the value of the originQuantityUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RatingUnit }
     *     
     */
    public RatingUnit getOriginQuantityUnit() {
        return originQuantityUnit;
    }

    /**
     * Sets the value of the originQuantityUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingUnit }
     *     
     */
    public void setOriginQuantityUnit(RatingUnit value) {
        this.originQuantityUnit = value;
    }

    /**
     * Gets the value of the perUnitRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerUnitRate() {
        return perUnitRate;
    }

    /**
     * Sets the value of the perUnitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerUnitRate(BigDecimal value) {
        this.perUnitRate = value;
    }

    /**
     * Gets the value of the rateUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RatingUnit }
     *     
     */
    public RatingUnit getRateUnit() {
        return rateUnit;
    }

    /**
     * Sets the value of the rateUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatingUnit }
     *     
     */
    public void setRateUnit(RatingUnit value) {
        this.rateUnit = value;
    }

}
