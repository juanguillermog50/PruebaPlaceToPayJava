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
 * <p>Clase Java para Authentication complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Authentication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tranKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="seed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="additional" type="{https://placetopay.com/soap/pse}ArrayOfAttribute"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authentication", propOrder = {

})
public class Authentication {

    @XmlElement(required = true, nillable = true)
    protected String login;
    @XmlElement(required = true, nillable = true)
    protected String tranKey;
    @XmlElement(required = true, nillable = true)
    protected String seed;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAttribute additional;

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad tranKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranKey() {
        return tranKey;
    }

    /**
     * Define el valor de la propiedad tranKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranKey(String value) {
        this.tranKey = value;
    }

    /**
     * Obtiene el valor de la propiedad seed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeed() {
        return seed;
    }

    /**
     * Define el valor de la propiedad seed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeed(String value) {
        this.seed = value;
    }

    /**
     * Obtiene el valor de la propiedad additional.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public ArrayOfAttribute getAdditional() {
        return additional;
    }

    /**
     * Define el valor de la propiedad additional.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public void setAdditional(ArrayOfAttribute value) {
        this.additional = value;
    }

}
