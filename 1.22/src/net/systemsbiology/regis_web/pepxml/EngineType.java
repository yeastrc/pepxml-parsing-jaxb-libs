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
 * <p>Java class for engineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="engineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEQUEST"/>
 *     &lt;enumeration value="MASCOT"/>
 *     &lt;enumeration value="Comet"/>
 *     &lt;enumeration value="SpectraST"/>
 *     &lt;enumeration value="Calibr"/>
 *     &lt;enumeration value="PROBID"/>
 *     &lt;enumeration value="OMSSA"/>
 *     &lt;enumeration value="YABSE"/>
 *     &lt;enumeration value="MS-GFDB"/>
 *     &lt;enumeration value="MS-GF+"/>
 *     &lt;enumeration value="MyriMatch"/>
 *     &lt;enumeration value="X! Tandem (k-score)"/>
 *     &lt;enumeration value="X! Tandem"/>
 *     &lt;enumeration value="InsPecT"/>
 *     &lt;enumeration value="ProteinPilot"/>
 *     &lt;enumeration value="ProteinLynx"/>
 *     &lt;enumeration value="Spectrum Mill"/>
 *     &lt;enumeration value="greylag"/>
 *     &lt;enumeration value="Phenyx"/>
 *     &lt;enumeration value="Proteios"/>
 *     &lt;enumeration value="Crux"/>
 *     &lt;enumeration value="Tide"/>
 *     &lt;enumeration value="Novor"/>
 *     &lt;enumeration value="Kojak"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "engineType")
@XmlEnum
public enum EngineType {

    SEQUEST("SEQUEST"),
    MASCOT("MASCOT"),
    @XmlEnumValue("Comet")
    COMET("Comet"),
    @XmlEnumValue("SpectraST")
    SPECTRA_ST("SpectraST"),
    @XmlEnumValue("Calibr")
    CALIBR("Calibr"),
    PROBID("PROBID"),
    OMSSA("OMSSA"),
    YABSE("YABSE"),
    @XmlEnumValue("MS-GFDB")
    MS_GFDB("MS-GFDB"),
    @XmlEnumValue("MS-GF+")
    MS_GF("MS-GF+"),
    @XmlEnumValue("MyriMatch")
    MYRI_MATCH("MyriMatch"),
    @XmlEnumValue("X! Tandem (k-score)")
    X_TANDEM_K_SCORE("X! Tandem (k-score)"),
    @XmlEnumValue("X! Tandem")
    X_TANDEM("X! Tandem"),
    @XmlEnumValue("InsPecT")
    INS_PEC_T("InsPecT"),
    @XmlEnumValue("ProteinPilot")
    PROTEIN_PILOT("ProteinPilot"),
    @XmlEnumValue("ProteinLynx")
    PROTEIN_LYNX("ProteinLynx"),
    @XmlEnumValue("Spectrum Mill")
    SPECTRUM_MILL("Spectrum Mill"),
    @XmlEnumValue("greylag")
    GREYLAG("greylag"),
    @XmlEnumValue("Phenyx")
    PHENYX("Phenyx"),
    @XmlEnumValue("Proteios")
    PROTEIOS("Proteios"),
    @XmlEnumValue("Crux")
    CRUX("Crux"),
    @XmlEnumValue("Tide")
    TIDE("Tide"),
    @XmlEnumValue("Novor")
    NOVOR("Novor"),
    @XmlEnumValue("Kojak")
    KOJAK("Kojak"),
    @XmlEnumValue("Magnum")
    MAGNUM("Magnum");
    private final String value;

    EngineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EngineType fromValue(String v) {
        for (EngineType c: EngineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
