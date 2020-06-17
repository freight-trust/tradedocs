
package com.freighttrust.schema.universal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionContent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionContent"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Partial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectionContent", namespace = "http://www.freighttrust.com/schema/universal/2020/06")
@XmlEnum
public enum CollectionContent {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial");
    private final String value;

    CollectionContent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollectionContent fromValue(String v) {
        for (CollectionContent c: CollectionContent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
