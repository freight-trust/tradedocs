
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Code"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="AAD"/&gt;
 *               &lt;enumeration value="ACF"/&gt;
 *               &lt;enumeration value="ACR"/&gt;
 *               &lt;enumeration value="ACT"/&gt;
 *               &lt;enumeration value="ACY"/&gt;
 *               &lt;enumeration value="AFR"/&gt;
 *               &lt;enumeration value="ARP"/&gt;
 *               &lt;enumeration value="ASY"/&gt;
 *               &lt;enumeration value="BCO"/&gt;
 *               &lt;enumeration value="BKP"/&gt;
 *               &lt;enumeration value="BRO"/&gt;
 *               &lt;enumeration value="BRI"/&gt;
 *               &lt;enumeration value="BRE"/&gt;
 *               &lt;enumeration value="BTP"/&gt;
 *               &lt;enumeration value="CAP"/&gt;
 *               &lt;enumeration value="CAR"/&gt;
 *               &lt;enumeration value="CBA"/&gt;
 *               &lt;enumeration value="CCA"/&gt;
 *               &lt;enumeration value="CD4"/&gt;
 *               &lt;enumeration value="CLI"/&gt;
 *               &lt;enumeration value="CNE"/&gt;
 *               &lt;enumeration value="CNR"/&gt;
 *               &lt;enumeration value="COA"/&gt;
 *               &lt;enumeration value="CTA"/&gt;
 *               &lt;enumeration value="CTG"/&gt;
 *               &lt;enumeration value="CTO"/&gt;
 *               &lt;enumeration value="CTP"/&gt;
 *               &lt;enumeration value="CYD"/&gt;
 *               &lt;enumeration value="DAG"/&gt;
 *               &lt;enumeration value="DCA"/&gt;
 *               &lt;enumeration value="DCF"/&gt;
 *               &lt;enumeration value="DCR"/&gt;
 *               &lt;enumeration value="DCT"/&gt;
 *               &lt;enumeration value="DCY"/&gt;
 *               &lt;enumeration value="DTP"/&gt;
 *               &lt;enumeration value="FOR"/&gt;
 *               &lt;enumeration value="GRP"/&gt;
 *               &lt;enumeration value="HCA"/&gt;
 *               &lt;enumeration value="HSA"/&gt;
 *               &lt;enumeration value="ICE"/&gt;
 *               &lt;enumeration value="IDB"/&gt;
 *               &lt;enumeration value="JWG"/&gt;
 *               &lt;enumeration value="LCT"/&gt;
 *               &lt;enumeration value="NFP"/&gt;
 *               &lt;enumeration value="NGP"/&gt;
 *               &lt;enumeration value="ORP"/&gt;
 *               &lt;enumeration value="PAG"/&gt;
 *               &lt;enumeration value="PCA"/&gt;
 *               &lt;enumeration value="PEM"/&gt;
 *               &lt;enumeration value="PER"/&gt;
 *               &lt;enumeration value="PIM"/&gt;
 *               &lt;enumeration value="PIR"/&gt;
 *               &lt;enumeration value="PRC"/&gt;
 *               &lt;enumeration value="PUP"/&gt;
 *               &lt;enumeration value="RAG"/&gt;
 *               &lt;enumeration value="SAG"/&gt;
 *               &lt;enumeration value="SGA"/&gt;
 *               &lt;enumeration value="SPM"/&gt;
 *               &lt;enumeration value="SRP"/&gt;
 *               &lt;enumeration value="STF"/&gt;
 *               &lt;enumeration value="TPC"/&gt;
 *               &lt;enumeration value="DTW"/&gt;
 *               &lt;enumeration value="ATW"/&gt;
 *               &lt;enumeration value="UAM"/&gt;
 *               &lt;enumeration value="WAR"/&gt;
 *               &lt;enumeration value="WIN"/&gt;
 *               &lt;enumeration value="BWI"/&gt;
 *               &lt;enumeration value="BWR"/&gt;
 *               &lt;enumeration value="WHS"/&gt;
 *               &lt;enumeration value="WNS"/&gt;
 *               &lt;enumeration value="YER"/&gt;
 *               &lt;enumeration value="YIA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="AMD"/&gt;
 *               &lt;enumeration value="BRQ"/&gt;
 *               &lt;enumeration value="HLD"/&gt;
 *               &lt;enumeration value="SIN"/&gt;
 *               &lt;enumeration value="TWD"/&gt;
 *               &lt;enumeration value="TWR"/&gt;
 *               &lt;enumeration value="VGM"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "RecipientRole", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class RecipientRole {

    @XmlElement(name = "Code", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String code;
    @XmlElement(name = "Description", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String description;
    @XmlElement(name = "ServiceCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String serviceCode;
    @XmlElement(name = "ServiceDescription", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String serviceDescription;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Sets the value of the serviceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
    }

}
