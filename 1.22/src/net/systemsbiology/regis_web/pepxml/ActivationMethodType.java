//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.28 at 02:58:18 PM PDT 
//


package net.systemsbiology.regis_web.pepxml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activationMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="activationMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ETD"/>
 *     &lt;enumeration value="ECD"/>
 *     &lt;enumeration value="CID"/>
 *     &lt;enumeration value="ETD/CID"/>
 *     &lt;enumeration value="HCD"/>
 *     &lt;enumeration value="PQD"/>
 *     &lt;enumeration value="IRMPD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "activationMethodType")
@XmlEnum
public enum ActivationMethodType {

    ETD("ETD"),
    ECD("ECD"),
    CID("CID"),
    @XmlEnumValue("ETD/CID")
    ETD_CID("ETD/CID"),
    HCD("HCD"),
    PQD("PQD"),
    IRMPD("IRMPD");
    private final String value;

    ActivationMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActivationMethodType fromValue(String v) {
        for (ActivationMethodType c: ActivationMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
