
package com.freighttrust.schema.universal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Description"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2147483647"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Type" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair"/&gt;
 *         &lt;element name="AgreedDeliveryDateUTC" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrentStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2147483647"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DateAcceptability" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="EarliestStartDateUTC" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Notes" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2147483647"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReleaseGroup" type="{http://www.freighttrust.com/schema/universal/2020/06}Group" minOccurs="0"/&gt;
 *         &lt;element name="TaskSetStatus" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="TaskCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Task" type="{http://www.freighttrust.com/schema/universal/2020/06}Task" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TaskSetCollection" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TaskSet" type="{http://www.freighttrust.com/schema/universal/2020/06}TaskSet" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TaskSet", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class TaskSet {

    @XmlElement(name = "Description", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String description;
    @XmlElement(name = "Type", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected CodeDescriptionPair type;
    @XmlElement(name = "AgreedDeliveryDateUTC", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String agreedDeliveryDateUTC;
    @XmlElement(name = "CurrentStatus", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String currentStatus;
    @XmlElement(name = "DateAcceptability", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair dateAcceptability;
    @XmlElement(name = "EarliestStartDateUTC", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String earliestStartDateUTC;
    @XmlElement(name = "IsActive", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Boolean isActive;
    @XmlElement(name = "Notes", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String notes;
    @XmlElement(name = "ReleaseGroup", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Group releaseGroup;
    @XmlElement(name = "TaskSetStatus", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair taskSetStatus;
    @XmlElement(name = "TaskCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected TaskSet.TaskCollection taskCollection;
    @XmlElement(name = "TaskSetCollection", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected TaskSet.TaskSetCollection taskSetCollection;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setType(CodeDescriptionPair value) {
        this.type = value;
    }

    /**
     * Gets the value of the agreedDeliveryDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreedDeliveryDateUTC() {
        return agreedDeliveryDateUTC;
    }

    /**
     * Sets the value of the agreedDeliveryDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreedDeliveryDateUTC(String value) {
        this.agreedDeliveryDateUTC = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    /**
     * Gets the value of the dateAcceptability property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getDateAcceptability() {
        return dateAcceptability;
    }

    /**
     * Sets the value of the dateAcceptability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setDateAcceptability(CodeDescriptionPair value) {
        this.dateAcceptability = value;
    }

    /**
     * Gets the value of the earliestStartDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestStartDateUTC() {
        return earliestStartDateUTC;
    }

    /**
     * Sets the value of the earliestStartDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestStartDateUTC(String value) {
        this.earliestStartDateUTC = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the releaseGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getReleaseGroup() {
        return releaseGroup;
    }

    /**
     * Sets the value of the releaseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setReleaseGroup(Group value) {
        this.releaseGroup = value;
    }

    /**
     * Gets the value of the taskSetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getTaskSetStatus() {
        return taskSetStatus;
    }

    /**
     * Sets the value of the taskSetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setTaskSetStatus(CodeDescriptionPair value) {
        this.taskSetStatus = value;
    }

    /**
     * Gets the value of the taskCollection property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSet.TaskCollection }
     *     
     */
    public TaskSet.TaskCollection getTaskCollection() {
        return taskCollection;
    }

    /**
     * Sets the value of the taskCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSet.TaskCollection }
     *     
     */
    public void setTaskCollection(TaskSet.TaskCollection value) {
        this.taskCollection = value;
    }

    /**
     * Gets the value of the taskSetCollection property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSet.TaskSetCollection }
     *     
     */
    public TaskSet.TaskSetCollection getTaskSetCollection() {
        return taskSetCollection;
    }

    /**
     * Sets the value of the taskSetCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSet.TaskSetCollection }
     *     
     */
    public void setTaskSetCollection(TaskSet.TaskSetCollection value) {
        this.taskSetCollection = value;
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
     *         &lt;element name="Task" type="{http://www.freighttrust.com/schema/universal/2020/06}Task" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "task"
    })
    public static class TaskCollection {

        @XmlElement(name = "Task", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<Task> task;

        /**
         * Gets the value of the task property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the task property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTask().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Task }
         * 
         * 
         */
        public List<Task> getTask() {
            if (task == null) {
                task = new ArrayList<Task>();
            }
            return this.task;
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
     *         &lt;element name="TaskSet" type="{http://www.freighttrust.com/schema/universal/2020/06}TaskSet" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "taskSet"
    })
    public static class TaskSetCollection {

        @XmlElement(name = "TaskSet", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
        protected List<TaskSet> taskSet;

        /**
         * Gets the value of the taskSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taskSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaskSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaskSet }
         * 
         * 
         */
        public List<TaskSet> getTaskSet() {
            if (taskSet == null) {
                taskSet = new ArrayList<TaskSet>();
            }
            return this.taskSet;
        }

    }

}
