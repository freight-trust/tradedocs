
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Note complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Note"&gt;
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
 *         &lt;element name="IsCustomDescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="NoteText"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2147483647"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NoteContext" type="{http://www.freighttrust.com/schema/universal/2020/06}NoteContext" minOccurs="0"/&gt;
 *         &lt;element name="Visibility" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *         &lt;element name="VisibleCompany" type="{http://www.freighttrust.com/schema/universal/2020/06}CodeDescriptionPair" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note", namespace = "http://www.freighttrust.com/schema/universal/2020/06", propOrder = {

})
public class Note {

    @XmlElement(name = "Description", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String description;
    @XmlElement(name = "IsCustomDescription", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected boolean isCustomDescription;
    @XmlElement(name = "NoteText", namespace = "http://www.freighttrust.com/schema/universal/2020/06", required = true)
    protected String noteText;
    @XmlElement(name = "NoteContext", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected NoteContext noteContext;
    @XmlElement(name = "Visibility", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair visibility;
    @XmlElement(name = "VisibleCompany", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
    protected CodeDescriptionPair visibleCompany;

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
     * Gets the value of the isCustomDescription property.
     * 
     */
    public boolean isIsCustomDescription() {
        return isCustomDescription;
    }

    /**
     * Sets the value of the isCustomDescription property.
     * 
     */
    public void setIsCustomDescription(boolean value) {
        this.isCustomDescription = value;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the noteContext property.
     * 
     * @return
     *     possible object is
     *     {@link NoteContext }
     *     
     */
    public NoteContext getNoteContext() {
        return noteContext;
    }

    /**
     * Sets the value of the noteContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteContext }
     *     
     */
    public void setNoteContext(NoteContext value) {
        this.noteContext = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setVisibility(CodeDescriptionPair value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the visibleCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public CodeDescriptionPair getVisibleCompany() {
        return visibleCompany;
    }

    /**
     * Sets the value of the visibleCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionPair }
     *     
     */
    public void setVisibleCompany(CodeDescriptionPair value) {
        this.visibleCompany = value;
    }

}
