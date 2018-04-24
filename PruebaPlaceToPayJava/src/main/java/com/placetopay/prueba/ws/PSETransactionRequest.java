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
 * <p>Clase Java para PSETransactionRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PSETransactionRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="bankCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankInterface" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="returnURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="devolutionBase" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tipAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="payer" type="{https://placetopay.com/soap/pse}Person"/&gt;
 *         &lt;element name="buyer" type="{https://placetopay.com/soap/pse}Person"/&gt;
 *         &lt;element name="shipping" type="{https://placetopay.com/soap/pse}Person"/&gt;
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userAgent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="additionalData" type="{https://placetopay.com/soap/pse}ArrayOfAttribute"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSETransactionRequest", propOrder = {

})
public class PSETransactionRequest {

    @XmlElement(required = true, nillable = true)
    protected String bankCode;
    @XmlElement(required = true, nillable = true)
    protected String bankInterface;
    @XmlElement(required = true, nillable = true)
    protected String returnURL;
    @XmlElement(required = true, nillable = true)
    protected String reference;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, nillable = true)
    protected String language;
    @XmlElement(required = true, nillable = true)
    protected String currency;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double totalAmount;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double taxAmount;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double devolutionBase;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double tipAmount;
    @XmlElement(required = true, nillable = true)
    protected Person payer;
    @XmlElement(required = true, nillable = true)
    protected Person buyer;
    @XmlElement(required = true, nillable = true)
    protected Person shipping;
    @XmlElement(required = true, nillable = true)
    protected String ipAddress;
    @XmlElement(required = true, nillable = true)
    protected String userAgent;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfAttribute additionalData;

    /**
     * Obtiene el valor de la propiedad bankCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Define el valor de la propiedad bankCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad bankInterface.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankInterface() {
        return bankInterface;
    }

    /**
     * Define el valor de la propiedad bankInterface.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankInterface(String value) {
        this.bankInterface = value;
    }

    /**
     * Obtiene el valor de la propiedad returnURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Define el valor de la propiedad returnURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
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

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxAmount(Double value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad devolutionBase.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDevolutionBase() {
        return devolutionBase;
    }

    /**
     * Define el valor de la propiedad devolutionBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDevolutionBase(Double value) {
        this.devolutionBase = value;
    }

    /**
     * Obtiene el valor de la propiedad tipAmount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTipAmount() {
        return tipAmount;
    }

    /**
     * Define el valor de la propiedad tipAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTipAmount(Double value) {
        this.tipAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad payer.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPayer() {
        return payer;
    }

    /**
     * Define el valor de la propiedad payer.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPayer(Person value) {
        this.payer = value;
    }

    /**
     * Obtiene el valor de la propiedad buyer.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getBuyer() {
        return buyer;
    }

    /**
     * Define el valor de la propiedad buyer.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setBuyer(Person value) {
        this.buyer = value;
    }

    /**
     * Obtiene el valor de la propiedad shipping.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getShipping() {
        return shipping;
    }

    /**
     * Define el valor de la propiedad shipping.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setShipping(Person value) {
        this.shipping = value;
    }

    /**
     * Obtiene el valor de la propiedad ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Define el valor de la propiedad ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad userAgent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Define el valor de la propiedad userAgent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalData.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public ArrayOfAttribute getAdditionalData() {
        return additionalData;
    }

    /**
     * Define el valor de la propiedad additionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAttribute }
     *     
     */
    public void setAdditionalData(ArrayOfAttribute value) {
        this.additionalData = value;
    }

}
