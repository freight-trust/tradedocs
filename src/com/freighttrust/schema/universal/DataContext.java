
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataContext complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataContext"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="DataSourceCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DataSource" type="{http://www.freighttrust.com/schema/universal/2020/06}DataSource" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ActionPurpose" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="CodesMappedToTarget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.freighttrust.com/schema/universal/2020/06}Company" minOccurs="0"/&gt;
 *         &lt;element name="DataProvider" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DocumentaryOverride" type="{http://www.freighttrust.com/schema/universal/2020/06}DocumentaryOverride" minOccurs="0"/&gt;
 *         &lt;element name="EnterpriseID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EventBranch" type="{http://www.freighttrust.com/schema/universal/2020/06}Branch" minOccurs="0"/&gt;
 *         &lt;element name="EventDepartment" type="{http://www.freighttrust.com/schema/universal/2020/06}Department" minOccurs="0"/&gt;
 *         &lt;element name="EventReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EventType" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="EventUser" type="{http://www.freighttrust.com/schema/universal/2020/06}Staff" minOccurs="0"/&gt;
 *         &lt;element name="ServerID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TriggerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TriggerDate" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TriggerDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TriggerReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TriggerType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Trigger"/&gt;
 *               &lt;enumeration value="Milestone"/&gt;
 *               &lt;enumeration value="Exception"/&gt;
 *               &lt;enumeration value="Manual"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DataTargetCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DataTarget" type="{http://www.freighttrust.com/schema/universal/2020/06}DataTarget" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RecipientRoleCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RecipientRole" type="{http://www.freighttrust.com/schema/universal/2020/06}RecipientRole" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DataContext", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class DataContext {

    @XmlElement(name = "DataSourceCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected DataContext.DataSourceCollection dataSourceCollection;
    @XmlElement(name = "ActionPurpose", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair actionPurpose;
    @XmlElement(name = "CodesMappedToTarget", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean codesMappedToTarget;
    @XmlElement(name = "Company", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Company company;
    @XmlElement(name = "DataProvider", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String dataProvider;
    @XmlElement(name = "DocumentaryOverride", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected DocumentaryOverride documentaryOverride;
    @XmlElement(name = "EnterpriseID", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String enterpriseID;
    @XmlElement(name = "EventBranch", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Branch eventBranch;
    @XmlElement(name = "EventDepartment", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Department eventDepartment;
    @XmlElement(name = "EventReference", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String eventReference;
    @XmlElement(name = "EventType", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair eventType;
    @XmlElement(name = "EventUser", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Staff eventUser;
    @XmlElement(name = "ServerID", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String serverID;
    @XmlElement(name = "TriggerCount", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Integer triggerCount;
    @XmlElement(name = "TriggerDate", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String triggerDate;
    @XmlElement(name = "TriggerDescription", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String triggerDescription;
    @XmlElement(name = "TriggerReference", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String triggerReference;
    @XmlElement(name = "TriggerType", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String triggerType;
    @XmlElement(name = "DataTargetCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected DataContext.DataTargetCollection dataTargetCollection;
    @XmlElement(name = "RecipientRoleCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected DataContext.RecipientRoleCollection recipientRoleCollection;

    /**
     * Gets the value of the dataSourceCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DataContext.DataSourceCollection }
     *     
     */
    public DataContext.DataSourceCollection getDataSourceCollection() {
        return dataSourceCollection;
    }

    /**
     * Sets the value of the dataSourceCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataContext.DataSourceCollection }
     *     
     */
    public void setDataSourceCollection(DataContext.DataSourceCollection value) {
        this.dataSourceCollection = value;
    }

    /**
     * Gets the value of the actionPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getActionPurpose() {
        return actionPurpose;
    }

    /**
     * Sets the value of the actionPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setActionPurpose(CodeDescriptionPair value) {
        this.actionPurpose = value;
    }

    /**
     * Gets the value of the codesMappedToTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCodesMappedToTarget() {
        return codesMappedToTarget;
    }

    /**
     * Sets the value of the codesMappedToTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCodesMappedToTarget(Boolean value) {
        this.codesMappedToTarget = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

    /**
     * Gets the value of the dataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataProvider(String value) {
        this.dataProvider = value;
    }

    /**
     * Gets the value of the documentaryOverride property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentaryOverride }
     *     
     */
    public DocumentaryOverride getDocumentaryOverride() {
        return documentaryOverride;
    }

    /**
     * Sets the value of the documentaryOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentaryOverride }
     *     
     */
    public void setDocumentaryOverride(DocumentaryOverride value) {
        this.documentaryOverride = value;
    }

    /**
     * Gets the value of the enterpriseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseID() {
        return enterpriseID;
    }

    /**
     * Sets the value of the enterpriseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseID(String value) {
        this.enterpriseID = value;
    }

    /**
     * Gets the value of the eventBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Branch }
     *     
     */
    public Branch getEventBranch() {
        return eventBranch;
    }

    /**
     * Sets the value of the eventBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Branch }
     *     
     */
    public void setEventBranch(Branch value) {
        this.eventBranch = value;
    }

    /**
     * Gets the value of the eventDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link Department }
     *     
     */
    public Department getEventDepartment() {
        return eventDepartment;
    }

    /**
     * Sets the value of the eventDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Department }
     *     
     */
    public void setEventDepartment(Department value) {
        this.eventDepartment = value;
    }

    /**
     * Gets the value of the eventReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventReference() {
        return eventReference;
    }

    /**
     * Sets the value of the eventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventReference(String value) {
        this.eventReference = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setEventType(CodeDescriptionPair value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventUser property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    public Staff getEventUser() {
        return eventUser;
    }

    /**
     * Sets the value of the eventUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setEventUser(Staff value) {
        this.eventUser = value;
    }

    /**
     * Gets the value of the serverID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerID() {
        return serverID;
    }

    /**
     * Sets the value of the serverID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerID(String value) {
        this.serverID = value;
    }

    /**
     * Gets the value of the triggerCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTriggerCount() {
        return triggerCount;
    }

    /**
     * Sets the value of the triggerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTriggerCount(Integer value) {
        this.triggerCount = value;
    }

    /**
     * Gets the value of the triggerDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerDate() {
        return triggerDate;
    }

    /**
     * Sets the value of the triggerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerDate(String value) {
        this.triggerDate = value;
    }

    /**
     * Gets the value of the triggerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerDescription() {
        return triggerDescription;
    }

    /**
     * Sets the value of the triggerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerDescription(String value) {
        this.triggerDescription = value;
    }

    /**
     * Gets the value of the triggerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerReference() {
        return triggerReference;
    }

    /**
     * Sets the value of the triggerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerReference(String value) {
        this.triggerReference = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTriggerType(String value) {
        this.triggerType = value;
    }

    /**
     * Gets the value of the dataTargetCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DataContext.DataTargetCollection }
     *     
     */
    public DataContext.DataTargetCollection getDataTargetCollection() {
        return dataTargetCollection;
    }

    /**
     * Sets the value of the dataTargetCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataContext.DataTargetCollection }
     *     
     */
    public void setDataTargetCollection(DataContext.DataTargetCollection value) {
        this.dataTargetCollection = value;
    }

    /**
     * Gets the value of the recipientRoleCollection property.
     * 
     * @return
     *     possible object is
     *     {@link DataContext.RecipientRoleCollection }
     *     
     */
    public DataContext.RecipientRoleCollection getRecipientRoleCollection() {
        return recipientRoleCollection;
    }

    /**
     * Sets the value of the recipientRoleCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataContext.RecipientRoleCollection }
     *     
     */
    public void setRecipientRoleCollection(DataContext.RecipientRoleCollection value) {
        this.recipientRoleCollection = value;
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
     *         &lt;element name="DataSource" type="{http://www.freighttrust.com/schema/universal/2020/06}DataSource" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "dataSource"
    })
    public static class DataSourceCollection {

        @XmlElement(name = "DataSource", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<DataSource> dataSource;

        /**
         * Gets the value of the dataSource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataSource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataSource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataSource }
         * 
         * 
         */
        public List<DataSource> getDataSource() {
            if (dataSource == null) {
                dataSource = new ArrayList<DataSource>();
            }
            return this.dataSource;
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
     *         &lt;element name="DataTarget" type="{http://www.freighttrust.com/schema/universal/2020/06}DataTarget" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "dataTarget"
    })
    public static class DataTargetCollection {

        @XmlElement(name = "DataTarget", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<DataTarget> dataTarget;

        /**
         * Gets the value of the dataTarget property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataTarget property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataTarget().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataTarget }
         * 
         * 
         */
        public List<DataTarget> getDataTarget() {
            if (dataTarget == null) {
                dataTarget = new ArrayList<DataTarget>();
            }
            return this.dataTarget;
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
     *         &lt;element name="RecipientRole" type="{http://www.freighttrust.com/schema/universal/2020/06}RecipientRole" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "recipientRole"
    })
    public static class RecipientRoleCollection {

        @XmlElement(name = "RecipientRole", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<RecipientRole> recipientRole;

        /**
         * Gets the value of the recipientRole property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recipientRole property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecipientRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecipientRole }
         * 
         * 
         */
        public List<RecipientRole> getRecipientRole() {
            if (recipientRole == null) {
                recipientRole = new ArrayList<RecipientRole>();
            }
            return this.recipientRole;
        }

    }

}
