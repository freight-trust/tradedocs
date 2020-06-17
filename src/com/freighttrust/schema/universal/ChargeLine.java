
package com.freighttrust.schema.universal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Branch" type="{http://www.freighttrust.com/schema/universal/2020/06}Branch" minOccurs="0"/&gt;
 *         &lt;element name="ChargeCode" type="{http://www.freighttrust.com/schema/universal/2020/06}ChargeCode" minOccurs="0"/&gt;
 *         &lt;element name="ChargeCodeGroup" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="CostAPInvoiceNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="38"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CostApportionmentConsolNumber" type="{http://www.freighttrust.com/schema/universal/2020/06}EntityReference" minOccurs="0"/&gt;
 *         &lt;element name="CostDueDate" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CostExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CostGSTVATID" type="{http://www.freighttrust.com/schema/universal/2020/06}TaxID" minOccurs="0"/&gt;
 *         &lt;element name="CostInvoiceDate" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CostIsPosted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CostLocalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CostOSAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CostOSCurrency" type="{http://www.freighttrust.com/schema/universal/2020/06}Currency" minOccurs="0"/&gt;
 *         &lt;element name="CostOSGSTVATAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CostPlaceOfSupply" type="{http://www.freighttrust.com/schema/universal/2020/06}PlaceOfSupply" minOccurs="0"/&gt;
 *         &lt;element name="Creditor" type="{http://www.freighttrust.com/schema/universal/2020/06}OrganizationReference" minOccurs="0"/&gt;
 *         &lt;element name="Debtor" type="{http://www.freighttrust.com/schema/universal/2020/06}OrganizationReference" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.freighttrust.com/schema/universal/2020/06}Department" minOccurs="0"/&gt;
 *         &lt;element name="Description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1024"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ExternalCreditorCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExternalDebtorCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GovernmentReportingCostChargeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GovernmentReportingSellChargeCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImportMetaData" type="{http://www.freighttrust.com/schema/universal/2020/06}ImportMetaData" minOccurs="0"/&gt;
 *         &lt;element name="SellExchangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SellGSTVATID" type="{http://www.freighttrust.com/schema/universal/2020/06}TaxID" minOccurs="0"/&gt;
 *         &lt;element name="SellInvoiceType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellIsPosted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SellLocalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SellOSAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SellOSCurrency" type="{http://www.freighttrust.com/schema/universal/2020/06}Currency" minOccurs="0"/&gt;
 *         &lt;element name="SellOSGSTVATAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SellPlaceOfSupply" type="{http://www.freighttrust.com/schema/universal/2020/06}PlaceOfSupply" minOccurs="0"/&gt;
 *         &lt;element name="SellPostedTransactionNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="38"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellPostedTransactionType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SupplierReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="38"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CostRatingBasisCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CostRatingBasis" type="{http://www.freighttrust.com/schema/universal/2020/06}RatingBasis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellRatingBasisCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SellRatingBasis" type="{http://www.freighttrust.com/schema/universal/2020/06}RatingBasis" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ChargeLine", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class ChargeLine {

    @XmlElement(name = "Branch", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Branch branch;
    @XmlElement(name = "ChargeCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected ChargeCode chargeCode;
    @XmlElement(name = "ChargeCodeGroup", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair chargeCodeGroup;
    @XmlElement(name = "CostAPInvoiceNumber", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String costAPInvoiceNumber;
    @XmlElement(name = "CostApportionmentConsolNumber", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected EntityReference costApportionmentConsolNumber;
    @XmlElement(name = "CostDueDate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String costDueDate;
    @XmlElement(name = "CostExchangeRate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal costExchangeRate;
    @XmlElement(name = "CostGSTVATID", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected TaxID costGSTVATID;
    @XmlElement(name = "CostInvoiceDate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String costInvoiceDate;
    @XmlElement(name = "CostIsPosted", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean costIsPosted;
    @XmlElement(name = "CostLocalAmount", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal costLocalAmount;
    @XmlElement(name = "CostOSAmount", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal costOSAmount;
    @XmlElement(name = "CostOSCurrency", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Currency costOSCurrency;
    @XmlElement(name = "CostOSGSTVATAmount", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal costOSGSTVATAmount;
    @XmlElement(name = "CostPlaceOfSupply", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected PlaceOfSupply costPlaceOfSupply;
    @XmlElement(name = "Creditor", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected OrganizationReference creditor;
    @XmlElement(name = "Debtor", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected OrganizationReference debtor;
    @XmlElement(name = "Department", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Department department;
    @XmlElement(name = "Description", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String description;
    @XmlElement(name = "DisplaySequence", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Short displaySequence;
    @XmlElement(name = "ExternalCreditorCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String externalCreditorCode;
    @XmlElement(name = "ExternalDebtorCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String externalDebtorCode;
    @XmlElement(name = "GovernmentReportingCostChargeCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String governmentReportingCostChargeCode;
    @XmlElement(name = "GovernmentReportingSellChargeCode", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String governmentReportingSellChargeCode;
    @XmlElement(name = "ImportMetaData", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected ImportMetaData importMetaData;
    @XmlElement(name = "SellExchangeRate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal sellExchangeRate;
    @XmlElement(name = "SellGSTVATID", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected TaxID sellGSTVATID;
    @XmlElement(name = "SellInvoiceType", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String sellInvoiceType;
    @XmlElement(name = "SellIsPosted", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean sellIsPosted;
    @XmlElement(name = "SellLocalAmount", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal sellLocalAmount;
    @XmlElement(name = "SellOSAmount", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal sellOSAmount;
    @XmlElement(name = "SellOSCurrency", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Currency sellOSCurrency;
    @XmlElement(name = "SellOSGSTVATAmount", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal sellOSGSTVATAmount;
    @XmlElement(name = "SellPlaceOfSupply", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected PlaceOfSupply sellPlaceOfSupply;
    @XmlElement(name = "SellPostedTransactionNumber", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String sellPostedTransactionNumber;
    @XmlElement(name = "SellPostedTransactionType", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String sellPostedTransactionType;
    @XmlElement(name = "SellReference", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String sellReference;
    @XmlElement(name = "SupplierReference", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String supplierReference;
    @XmlElement(name = "CostRatingBasisCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected ChargeLine.CostRatingBasisCollection costRatingBasisCollection;
    @XmlElement(name = "SellRatingBasisCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected ChargeLine.SellRatingBasisCollection sellRatingBasisCollection;

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
     * Gets the value of the chargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeCode }
     *     
     */
    public ChargeCode getChargeCode() {
        return chargeCode;
    }

    /**
     * Sets the value of the chargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeCode }
     *     
     */
    public void setChargeCode(ChargeCode value) {
        this.chargeCode = value;
    }

    /**
     * Gets the value of the chargeCodeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getChargeCodeGroup() {
        return chargeCodeGroup;
    }

    /**
     * Sets the value of the chargeCodeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setChargeCodeGroup(CodeDescriptionPair value) {
        this.chargeCodeGroup = value;
    }

    /**
     * Gets the value of the costAPInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostAPInvoiceNumber() {
        return costAPInvoiceNumber;
    }

    /**
     * Sets the value of the costAPInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostAPInvoiceNumber(String value) {
        this.costAPInvoiceNumber = value;
    }

    /**
     * Gets the value of the costApportionmentConsolNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityReference }
     *     
     */
    public EntityReference getCostApportionmentConsolNumber() {
        return costApportionmentConsolNumber;
    }

    /**
     * Sets the value of the costApportionmentConsolNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityReference }
     *     
     */
    public void setCostApportionmentConsolNumber(EntityReference value) {
        this.costApportionmentConsolNumber = value;
    }

    /**
     * Gets the value of the costDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostDueDate() {
        return costDueDate;
    }

    /**
     * Sets the value of the costDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostDueDate(String value) {
        this.costDueDate = value;
    }

    /**
     * Gets the value of the costExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostExchangeRate() {
        return costExchangeRate;
    }

    /**
     * Sets the value of the costExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostExchangeRate(BigDecimal value) {
        this.costExchangeRate = value;
    }

    /**
     * Gets the value of the costGSTVATID property.
     * 
     * @return
     *     possible object is
     *     {@link TaxID }
     *     
     */
    public TaxID getCostGSTVATID() {
        return costGSTVATID;
    }

    /**
     * Sets the value of the costGSTVATID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxID }
     *     
     */
    public void setCostGSTVATID(TaxID value) {
        this.costGSTVATID = value;
    }

    /**
     * Gets the value of the costInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostInvoiceDate() {
        return costInvoiceDate;
    }

    /**
     * Sets the value of the costInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostInvoiceDate(String value) {
        this.costInvoiceDate = value;
    }

    /**
     * Gets the value of the costIsPosted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCostIsPosted() {
        return costIsPosted;
    }

    /**
     * Sets the value of the costIsPosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCostIsPosted(Boolean value) {
        this.costIsPosted = value;
    }

    /**
     * Gets the value of the costLocalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostLocalAmount() {
        return costLocalAmount;
    }

    /**
     * Sets the value of the costLocalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostLocalAmount(BigDecimal value) {
        this.costLocalAmount = value;
    }

    /**
     * Gets the value of the costOSAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostOSAmount() {
        return costOSAmount;
    }

    /**
     * Sets the value of the costOSAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostOSAmount(BigDecimal value) {
        this.costOSAmount = value;
    }

    /**
     * Gets the value of the costOSCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCostOSCurrency() {
        return costOSCurrency;
    }

    /**
     * Sets the value of the costOSCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCostOSCurrency(Currency value) {
        this.costOSCurrency = value;
    }

    /**
     * Gets the value of the costOSGSTVATAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostOSGSTVATAmount() {
        return costOSGSTVATAmount;
    }

    /**
     * Sets the value of the costOSGSTVATAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostOSGSTVATAmount(BigDecimal value) {
        this.costOSGSTVATAmount = value;
    }

    /**
     * Gets the value of the costPlaceOfSupply property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfSupply }
     *     
     */
    public PlaceOfSupply getCostPlaceOfSupply() {
        return costPlaceOfSupply;
    }

    /**
     * Sets the value of the costPlaceOfSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfSupply }
     *     
     */
    public void setCostPlaceOfSupply(PlaceOfSupply value) {
        this.costPlaceOfSupply = value;
    }

    /**
     * Gets the value of the creditor property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReference }
     *     
     */
    public OrganizationReference getCreditor() {
        return creditor;
    }

    /**
     * Sets the value of the creditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReference }
     *     
     */
    public void setCreditor(OrganizationReference value) {
        this.creditor = value;
    }

    /**
     * Gets the value of the debtor property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationReference }
     *     
     */
    public OrganizationReference getDebtor() {
        return debtor;
    }

    /**
     * Sets the value of the debtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationReference }
     *     
     */
    public void setDebtor(OrganizationReference value) {
        this.debtor = value;
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
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDisplaySequence(Short value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the externalCreditorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCreditorCode() {
        return externalCreditorCode;
    }

    /**
     * Sets the value of the externalCreditorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCreditorCode(String value) {
        this.externalCreditorCode = value;
    }

    /**
     * Gets the value of the externalDebtorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalDebtorCode() {
        return externalDebtorCode;
    }

    /**
     * Sets the value of the externalDebtorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalDebtorCode(String value) {
        this.externalDebtorCode = value;
    }

    /**
     * Gets the value of the governmentReportingCostChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentReportingCostChargeCode() {
        return governmentReportingCostChargeCode;
    }

    /**
     * Sets the value of the governmentReportingCostChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentReportingCostChargeCode(String value) {
        this.governmentReportingCostChargeCode = value;
    }

    /**
     * Gets the value of the governmentReportingSellChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentReportingSellChargeCode() {
        return governmentReportingSellChargeCode;
    }

    /**
     * Sets the value of the governmentReportingSellChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentReportingSellChargeCode(String value) {
        this.governmentReportingSellChargeCode = value;
    }

    /**
     * Gets the value of the importMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ImportMetaData }
     *     
     */
    public ImportMetaData getImportMetaData() {
        return importMetaData;
    }

    /**
     * Sets the value of the importMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportMetaData }
     *     
     */
    public void setImportMetaData(ImportMetaData value) {
        this.importMetaData = value;
    }

    /**
     * Gets the value of the sellExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellExchangeRate() {
        return sellExchangeRate;
    }

    /**
     * Sets the value of the sellExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellExchangeRate(BigDecimal value) {
        this.sellExchangeRate = value;
    }

    /**
     * Gets the value of the sellGSTVATID property.
     * 
     * @return
     *     possible object is
     *     {@link TaxID }
     *     
     */
    public TaxID getSellGSTVATID() {
        return sellGSTVATID;
    }

    /**
     * Sets the value of the sellGSTVATID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxID }
     *     
     */
    public void setSellGSTVATID(TaxID value) {
        this.sellGSTVATID = value;
    }

    /**
     * Gets the value of the sellInvoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellInvoiceType() {
        return sellInvoiceType;
    }

    /**
     * Sets the value of the sellInvoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellInvoiceType(String value) {
        this.sellInvoiceType = value;
    }

    /**
     * Gets the value of the sellIsPosted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSellIsPosted() {
        return sellIsPosted;
    }

    /**
     * Sets the value of the sellIsPosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSellIsPosted(Boolean value) {
        this.sellIsPosted = value;
    }

    /**
     * Gets the value of the sellLocalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellLocalAmount() {
        return sellLocalAmount;
    }

    /**
     * Sets the value of the sellLocalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellLocalAmount(BigDecimal value) {
        this.sellLocalAmount = value;
    }

    /**
     * Gets the value of the sellOSAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellOSAmount() {
        return sellOSAmount;
    }

    /**
     * Sets the value of the sellOSAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellOSAmount(BigDecimal value) {
        this.sellOSAmount = value;
    }

    /**
     * Gets the value of the sellOSCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getSellOSCurrency() {
        return sellOSCurrency;
    }

    /**
     * Sets the value of the sellOSCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setSellOSCurrency(Currency value) {
        this.sellOSCurrency = value;
    }

    /**
     * Gets the value of the sellOSGSTVATAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellOSGSTVATAmount() {
        return sellOSGSTVATAmount;
    }

    /**
     * Sets the value of the sellOSGSTVATAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellOSGSTVATAmount(BigDecimal value) {
        this.sellOSGSTVATAmount = value;
    }

    /**
     * Gets the value of the sellPlaceOfSupply property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfSupply }
     *     
     */
    public PlaceOfSupply getSellPlaceOfSupply() {
        return sellPlaceOfSupply;
    }

    /**
     * Sets the value of the sellPlaceOfSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfSupply }
     *     
     */
    public void setSellPlaceOfSupply(PlaceOfSupply value) {
        this.sellPlaceOfSupply = value;
    }

    /**
     * Gets the value of the sellPostedTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellPostedTransactionNumber() {
        return sellPostedTransactionNumber;
    }

    /**
     * Sets the value of the sellPostedTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellPostedTransactionNumber(String value) {
        this.sellPostedTransactionNumber = value;
    }

    /**
     * Gets the value of the sellPostedTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellPostedTransactionType() {
        return sellPostedTransactionType;
    }

    /**
     * Sets the value of the sellPostedTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellPostedTransactionType(String value) {
        this.sellPostedTransactionType = value;
    }

    /**
     * Gets the value of the sellReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellReference() {
        return sellReference;
    }

    /**
     * Sets the value of the sellReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellReference(String value) {
        this.sellReference = value;
    }

    /**
     * Gets the value of the supplierReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierReference() {
        return supplierReference;
    }

    /**
     * Sets the value of the supplierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierReference(String value) {
        this.supplierReference = value;
    }

    /**
     * Gets the value of the costRatingBasisCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeLine.CostRatingBasisCollection }
     *     
     */
    public ChargeLine.CostRatingBasisCollection getCostRatingBasisCollection() {
        return costRatingBasisCollection;
    }

    /**
     * Sets the value of the costRatingBasisCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeLine.CostRatingBasisCollection }
     *     
     */
    public void setCostRatingBasisCollection(ChargeLine.CostRatingBasisCollection value) {
        this.costRatingBasisCollection = value;
    }

    /**
     * Gets the value of the sellRatingBasisCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeLine.SellRatingBasisCollection }
     *     
     */
    public ChargeLine.SellRatingBasisCollection getSellRatingBasisCollection() {
        return sellRatingBasisCollection;
    }

    /**
     * Sets the value of the sellRatingBasisCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeLine.SellRatingBasisCollection }
     *     
     */
    public void setSellRatingBasisCollection(ChargeLine.SellRatingBasisCollection value) {
        this.sellRatingBasisCollection = value;
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
     *         &lt;element name="CostRatingBasis" type="{http://www.freighttrust.com/schema/universal/2020/06}RatingBasis" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "costRatingBasis"
    })
    public static class CostRatingBasisCollection {

        @XmlElement(name = "CostRatingBasis", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<RatingBasis> costRatingBasis;

        /**
         * Gets the value of the costRatingBasis property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the costRatingBasis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCostRatingBasis().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatingBasis }
         * 
         * 
         */
        public List<RatingBasis> getCostRatingBasis() {
            if (costRatingBasis == null) {
                costRatingBasis = new ArrayList<RatingBasis>();
            }
            return this.costRatingBasis;
        }

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
     *         &lt;element name="SellRatingBasis" type="{http://www.freighttrust.com/schema/universal/2020/06}RatingBasis" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "sellRatingBasis"
    })
    public static class SellRatingBasisCollection {

        @XmlElement(name = "SellRatingBasis", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<RatingBasis> sellRatingBasis;

        /**
         * Gets the value of the sellRatingBasis property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sellRatingBasis property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSellRatingBasis().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RatingBasis }
         * 
         * 
         */
        public List<RatingBasis> getSellRatingBasis() {
            if (sellRatingBasis == null) {
                sellRatingBasis = new ArrayList<RatingBasis>();
            }
            return this.sellRatingBasis;
        }

    }

}
