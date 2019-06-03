//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.28 at 02:58:18 PM PDT 
//


package net.systemsbiology.regis_web.pepxml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mod_terminal_probability" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="probability" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mod_aminoacid_probability" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="probability" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="prior" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ptm" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ptm_peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modTerminalProbability",
    "modAminoacidProbability"
})
@XmlRootElement(name = "ptmprophet_result")
public class PtmprophetResult {

    @XmlElement(name = "mod_terminal_probability")
    protected List<PtmprophetResult.ModTerminalProbability> modTerminalProbability;
    @XmlElement(name = "mod_aminoacid_probability")
    protected List<PtmprophetResult.ModAminoacidProbability> modAminoacidProbability;
    @XmlAttribute(name = "prior", required = true)
    protected BigDecimal prior;
    @XmlAttribute(name = "ptm", required = true)
    protected String ptm;
    @XmlAttribute(name = "ptm_peptide", required = true)
    protected String ptmPeptide;

    /**
     * Gets the value of the modTerminalProbability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modTerminalProbability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModTerminalProbability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtmprophetResult.ModTerminalProbability }
     * 
     * 
     */
    public List<PtmprophetResult.ModTerminalProbability> getModTerminalProbability() {
        if (modTerminalProbability == null) {
            modTerminalProbability = new ArrayList<PtmprophetResult.ModTerminalProbability>();
        }
        return this.modTerminalProbability;
    }

    /**
     * Gets the value of the modAminoacidProbability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modAminoacidProbability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModAminoacidProbability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtmprophetResult.ModAminoacidProbability }
     * 
     * 
     */
    public List<PtmprophetResult.ModAminoacidProbability> getModAminoacidProbability() {
        if (modAminoacidProbability == null) {
            modAminoacidProbability = new ArrayList<PtmprophetResult.ModAminoacidProbability>();
        }
        return this.modAminoacidProbability;
    }

    /**
     * Gets the value of the prior property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrior() {
        return prior;
    }

    /**
     * Sets the value of the prior property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrior(BigDecimal value) {
        this.prior = value;
    }

    /**
     * Gets the value of the ptm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtm() {
        return ptm;
    }

    /**
     * Sets the value of the ptm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtm(String value) {
        this.ptm = value;
    }

    /**
     * Gets the value of the ptmPeptide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtmPeptide() {
        return ptmPeptide;
    }

    /**
     * Sets the value of the ptmPeptide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtmPeptide(String value) {
        this.ptmPeptide = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="probability" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ModAminoacidProbability {

        @XmlAttribute(name = "position", required = true)
        protected BigInteger position;
        @XmlAttribute(name = "probability", required = true)
        protected BigDecimal probability;

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPosition(BigInteger value) {
            this.position = value;
        }

        /**
         * Gets the value of the probability property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getProbability() {
            return probability;
        }

        /**
         * Sets the value of the probability property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setProbability(BigDecimal value) {
            this.probability = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="probability" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ModTerminalProbability {

        @XmlAttribute(name = "terminus", required = true)
        protected String terminus;
        @XmlAttribute(name = "probability", required = true)
        protected BigDecimal probability;

        /**
         * Gets the value of the terminus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminus() {
            return terminus;
        }

        /**
         * Sets the value of the terminus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminus(String value) {
            this.terminus = value;
        }

        /**
         * Gets the value of the probability property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getProbability() {
            return probability;
        }

        /**
         * Sets the value of the probability property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setProbability(BigDecimal value) {
            this.probability = value;
        }

    }

}
