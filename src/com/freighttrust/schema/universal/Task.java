
package com.freighttrust.schema.universal;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for Task complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Task"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Description"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Status" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair"/&gt;
 *         &lt;element name="TaskID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Type" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair"/&gt;
 *         &lt;element name="ActualDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="ActualStartTimeUTC" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="AssignedCapability" type="{http://www.freighttrust.com/schema/universal/2020/06}Capability" minOccurs="0"/&gt;
 *         &lt;element name="AssignedGroup" type="{http://www.freighttrust.com/schema/universal/2020/06}Group" minOccurs="0"/&gt;
 *         &lt;element name="AssignedStaff" type="{http://www.freighttrust.com/schema/universal/2020/06}Staff" minOccurs="0"/&gt;
 *         &lt;element name="CardNote" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CompletedTimeUTC" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedStartTimeUTC" type="{http://www.freighttrust.com/schema/universal/2020/06}emptiable_dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EstimateVariationFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TaskNotes" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2147483647"/&gt;
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
@XmlType(name = "Task", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class Task {

    @XmlElement(name = "Description", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String description;
    @XmlElement(name = "Sequence", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected int sequence;
    @XmlElement(name = "Status", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected CodeDescriptionPair status;
    @XmlElement(name = "TaskID", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String taskID;
    @XmlElement(name = "Type", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected CodeDescriptionPair type;
    @XmlElement(name = "ActualDuration", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Duration actualDuration;
    @XmlElement(name = "ActualStartTimeUTC", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String actualStartTimeUTC;
    @XmlElement(name = "AssignedCapability", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Capability assignedCapability;
    @XmlElement(name = "AssignedGroup", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Group assignedGroup;
    @XmlElement(name = "AssignedStaff", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Staff assignedStaff;
    @XmlElement(name = "CardNote", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String cardNote;
    @XmlElement(name = "CompletedTimeUTC", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String completedTimeUTC;
    @XmlElement(name = "EstimatedDuration", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected Duration estimatedDuration;
    @XmlElement(name = "EstimatedStartTimeUTC", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String estimatedStartTimeUTC;
    @XmlElement(name = "EstimateVariationFactor", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected BigDecimal estimateVariationFactor;
    @XmlElement(name = "TaskNotes", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected String taskNotes;

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
     * Gets the value of the sequence property.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setStatus(CodeDescriptionPair value) {
        this.status = value;
    }

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskID(String value) {
        this.taskID = value;
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
     * Gets the value of the actualDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActualDuration() {
        return actualDuration;
    }

    /**
     * Sets the value of the actualDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActualDuration(Duration value) {
        this.actualDuration = value;
    }

    /**
     * Gets the value of the actualStartTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualStartTimeUTC() {
        return actualStartTimeUTC;
    }

    /**
     * Sets the value of the actualStartTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualStartTimeUTC(String value) {
        this.actualStartTimeUTC = value;
    }

    /**
     * Gets the value of the assignedCapability property.
     * 
     * @return
     *     possible object is
     *     {@link Capability }
     *     
     */
    public Capability getAssignedCapability() {
        return assignedCapability;
    }

    /**
     * Sets the value of the assignedCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capability }
     *     
     */
    public void setAssignedCapability(Capability value) {
        this.assignedCapability = value;
    }

    /**
     * Gets the value of the assignedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    public Group getAssignedGroup() {
        return assignedGroup;
    }

    /**
     * Sets the value of the assignedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    public void setAssignedGroup(Group value) {
        this.assignedGroup = value;
    }

    /**
     * Gets the value of the assignedStaff property.
     * 
     * @return
     *     possible object is
     *     {@link Staff }
     *     
     */
    public Staff getAssignedStaff() {
        return assignedStaff;
    }

    /**
     * Sets the value of the assignedStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Staff }
     *     
     */
    public void setAssignedStaff(Staff value) {
        this.assignedStaff = value;
    }

    /**
     * Gets the value of the cardNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNote() {
        return cardNote;
    }

    /**
     * Sets the value of the cardNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNote(String value) {
        this.cardNote = value;
    }

    /**
     * Gets the value of the completedTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedTimeUTC() {
        return completedTimeUTC;
    }

    /**
     * Sets the value of the completedTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedTimeUTC(String value) {
        this.completedTimeUTC = value;
    }

    /**
     * Gets the value of the estimatedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * Sets the value of the estimatedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEstimatedDuration(Duration value) {
        this.estimatedDuration = value;
    }

    /**
     * Gets the value of the estimatedStartTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstimatedStartTimeUTC() {
        return estimatedStartTimeUTC;
    }

    /**
     * Sets the value of the estimatedStartTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedStartTimeUTC(String value) {
        this.estimatedStartTimeUTC = value;
    }

    /**
     * Gets the value of the estimateVariationFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimateVariationFactor() {
        return estimateVariationFactor;
    }

    /**
     * Sets the value of the estimateVariationFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimateVariationFactor(BigDecimal value) {
        this.estimateVariationFactor = value;
    }

    /**
     * Gets the value of the taskNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskNotes() {
        return taskNotes;
    }

    /**
     * Sets the value of the taskNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskNotes(String value) {
        this.taskNotes = value;
    }

}
