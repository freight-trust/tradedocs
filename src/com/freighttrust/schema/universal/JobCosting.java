
package com.freighttrust.schema.universal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JobCosting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobCosting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="AccrualNotRecognized" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AccrualRecognized" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AgentRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Branch" type="{http://www.freighttrust.com/schema/universal/2020/06}Branch" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.freighttrust.com/schema/universal/2020/06}Currency" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.freighttrust.com/schema/universal/2020/06}Department" minOccurs="0"/&gt;
 *         &lt;element name="HomeBranch" type="{http://www.freighttrust.com/schema/universal/2020/06}Branch" minOccurs="0"/&gt;
 *         &lt;element name="LocalClientRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OperationsStaff" type="{http://www.freighttrust.com/schema/universal/2020/06}Staff" minOccurs="0"/&gt;
 *         &lt;element name="OtherDebtorRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SalesStaff" type="{http://www.freighttrust.com/schema/universal/2020/06}Staff" minOccurs="0"/&gt;
 *         &lt;element name="TotalAccrual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalJobProfit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalWIP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WIPNotRecognized" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="WIPRecognized" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ChargeLineCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ChargeLine" type="{http://www.freighttrust.com/schema/universal/2020/06}ChargeLine" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "JobCosting", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class JobCosting {

    @XmlElement(name = "AccrualNotRecognized", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal accrualNotRecognized;
    @XmlElement(name = "AccrualRecognized", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal accrualRecognized;
    @XmlElement(name = "AgentRevenue", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal agentRevenue;
    @XmlElement(name = "Branch", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Branch branch;
    @XmlElement(name = "Currency", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Currency currency;
    @XmlElement(name = "Department", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Department department;
    @XmlElement(name = "HomeBranch", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Branch homeBranch;
    @XmlElement(name = "LocalClientRevenue", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal localClientRevenue;
    @XmlElement(name = "OperationsStaff", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Staff operationsStaff;
    @XmlElement(name = "OtherDebtorRevenue", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal otherDebtorRevenue;
    @XmlElement(name = "SalesStaff", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Staff salesStaff;
    @XmlElement(name = "TotalAccrual", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal totalAccrual;
    @XmlElement(name = "TotalCost", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal totalCost;
    @XmlElement(name = "TotalJobProfit", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal totalJobProfit;
    @XmlElement(name = "TotalRevenue", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal totalRevenue;
    @XmlElement(name = "TotalWIP", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal totalWIP;
    @XmlElement(name = "WIPNotRecognized", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal wipNotRecognized;
    @XmlElement(name = "WIPRecognized", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal wipRecognized;
    @XmlElement(name = "ChargeLineCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected JobCosting.ChargeLineCollection chargeLineCollection;

    /**
     * Gets the value of the accrualNotRecognized property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccrualNotRecognized() {
        return accrualNotRecognized;
    }

    /**
     * Sets the value of the accrualNotRecognized property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccrualNotRecognized(BigDecimal value) {
        this.accrualNotRecognized = value;
    }

    /**
     * Gets the value of the accrualRecognized property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccrualRecognized() {
        return accrualRecognized;
    }

    /**
     * Sets the value of the accrualRecognized property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccrualRecognized(BigDecimal value) {
        this.accrualRecognized = value;
    }

    /**
     * Gets the value of the agentRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAgentRevenue() {
        return agentRevenue;
    }

    /**
     * Sets the value of the agentRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAgentRevenue(BigDecimal value) {
        this.agentRevenue = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setBranch(Branch value) {
        this.branch = value;
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
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setDepartment(Department value) {
        this.department = value;
    }

    /**
     * Gets the value of the homeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getHomeBranch() {
        return homeBranch;
    }

    /**
     * Sets the value of the homeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setHomeBranch(Branch value) {
        this.homeBranch = value;
    }

    /**
     * Gets the value of the localClientRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLocalClientRevenue() {
        return localClientRevenue;
    }

    /**
     * Sets the value of the localClientRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLocalClientRevenue(BigDecimal value) {
        this.localClientRevenue = value;
    }

    /**
     * Gets the value of the operationsStaff property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    public Staff getOperationsStaff() {
        return operationsStaff;
    }

    /**
     * Sets the value of the operationsStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setOperationsStaff(Staff value) {
        this.operationsStaff = value;
    }

    /**
     * Gets the value of the otherDebtorRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtherDebtorRevenue() {
        return otherDebtorRevenue;
    }

    /**
     * Sets the value of the otherDebtorRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtherDebtorRevenue(BigDecimal value) {
        this.otherDebtorRevenue = value;
    }

    /**
     * Gets the value of the salesStaff property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    public Staff getSalesStaff() {
        return salesStaff;
    }

    /**
     * Sets the value of the salesStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setSalesStaff(Staff value) {
        this.salesStaff = value;
    }

    /**
     * Gets the value of the totalAccrual property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAccrual() {
        return totalAccrual;
    }

    /**
     * Sets the value of the totalAccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAccrual(BigDecimal value) {
        this.totalAccrual = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCost(BigDecimal value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the totalJobProfit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalJobProfit() {
        return totalJobProfit;
    }

    /**
     * Sets the value of the totalJobProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalJobProfit(BigDecimal value) {
        this.totalJobProfit = value;
    }

    /**
     * Gets the value of the totalRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * Sets the value of the totalRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRevenue(BigDecimal value) {
        this.totalRevenue = value;
    }

    /**
     * Gets the value of the totalWIP property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWIP() {
        return totalWIP;
    }

    /**
     * Sets the value of the totalWIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalWIP(BigDecimal value) {
        this.totalWIP = value;
    }

    /**
     * Gets the value of the wipNotRecognized property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWIPNotRecognized() {
        return wipNotRecognized;
    }

    /**
     * Sets the value of the wipNotRecognized property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWIPNotRecognized(BigDecimal value) {
        this.wipNotRecognized = value;
    }

    /**
     * Gets the value of the wipRecognized property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWIPRecognized() {
        return wipRecognized;
    }

    /**
     * Sets the value of the wipRecognized property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWIPRecognized(BigDecimal value) {
        this.wipRecognized = value;
    }

    /**
     * Gets the value of the chargeLineCollection property.
     * 
     * @return
     *     possible object is
     *     {@link JobCosting.ChargeLineCollection }
     *     
     */
    public JobCosting.ChargeLineCollection getChargeLineCollection() {
        return chargeLineCollection;
    }

    /**
     * Sets the value of the chargeLineCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobCosting.ChargeLineCollection }
     *     
     */
    public void setChargeLineCollection(JobCosting.ChargeLineCollection value) {
        this.chargeLineCollection = value;
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
     *         &lt;element name="ChargeLine" type="{http://www.freighttrust.com/schema/universal/2020/06}ChargeLine" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "chargeLine"
    })
    public static class ChargeLineCollection {

        @XmlElement(name = "ChargeLine", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<ChargeLine> chargeLine;

        /**
         * Gets the value of the chargeLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the chargeLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChargeLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChargeLine }
         * 
         * 
         */
        public List<ChargeLine> getChargeLine() {
            if (chargeLine == null) {
                chargeLine = new ArrayList<ChargeLine>();
            }
            return this.chargeLine;
        }

    }

}
