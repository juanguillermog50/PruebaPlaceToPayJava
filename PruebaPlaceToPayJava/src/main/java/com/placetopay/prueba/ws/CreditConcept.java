//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 09:23:15 PM COT 
//


package com.placetopay.prueba.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CreditConcept complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CreditConcept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="entityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amountValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditConcept", propOrder = {

})
public class CreditConcept {

    @XmlElement(required = true, nillable = true)
    protected String entityCode;
    @XmlElement(required = true, nillable = true)
    protected String serviceCode;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double amountValue;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double taxValue;
    @XmlElement(required = true, nillable = true)
    protected String description;

    /**
     * Obtiene el valor de la propiedad entityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityCode() {
        return entityCode;
    }

    /**
     * Define el valor de la propiedad entityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityCode(String value) {
        this.entityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Define el valor de la propiedad serviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad amountValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountValue() {
        return amountValue;
    }

    /**
     * Define el valor de la propiedad amountValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountValue(Double value) {
        this.amountValue = value;
    }

    /**
     * Obtiene el valor de la propiedad taxValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxValue() {
        return taxValue;
    }

    /**
     * Define el valor de la propiedad taxValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxValue(Double value) {
        this.taxValue = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
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
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
