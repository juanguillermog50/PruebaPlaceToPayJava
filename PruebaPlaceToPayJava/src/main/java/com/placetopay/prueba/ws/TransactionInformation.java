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
 * <p>Clase Java para TransactionInformation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bankProcessDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="onTest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="returnCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trazabilityCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transactionCycle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="transactionState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="responseReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="responseReasonText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformation", propOrder = {

})
public class TransactionInformation {

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer transactionID;
    @XmlElement(required = true, nillable = true)
    protected String sessionID;
    @XmlElement(required = true, nillable = true)
    protected String reference;
    @XmlElement(required = true, nillable = true)
    protected String requestDate;
    @XmlElement(required = true, nillable = true)
    protected String bankProcessDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean onTest;
    @XmlElement(required = true, nillable = true)
    protected String returnCode;
    @XmlElement(required = true, nillable = true)
    protected String trazabilityCode;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer transactionCycle;
    @XmlElement(required = true, nillable = true)
    protected String transactionState;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer responseCode;
    @XmlElement(required = true, nillable = true)
    protected String responseReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String responseReasonText;

    /**
     * Obtiene el valor de la propiedad transactionID.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionID() {
        return transactionID;
    }

    /**
     * Define el valor de la propiedad transactionID.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionID(Integer value) {
        this.transactionID = value;
    }

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
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
     * Obtiene el valor de la propiedad requestDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDate() {
        return requestDate;
    }

    /**
     * Define el valor de la propiedad requestDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDate(String value) {
        this.requestDate = value;
    }

    /**
     * Obtiene el valor de la propiedad bankProcessDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankProcessDate() {
        return bankProcessDate;
    }

    /**
     * Define el valor de la propiedad bankProcessDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankProcessDate(String value) {
        this.bankProcessDate = value;
    }

    /**
     * Obtiene el valor de la propiedad onTest.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnTest() {
        return onTest;
    }

    /**
     * Define el valor de la propiedad onTest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnTest(Boolean value) {
        this.onTest = value;
    }

    /**
     * Obtiene el valor de la propiedad returnCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCode() {
        return returnCode;
    }

    /**
     * Define el valor de la propiedad returnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCode(String value) {
        this.returnCode = value;
    }

    /**
     * Obtiene el valor de la propiedad trazabilityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrazabilityCode() {
        return trazabilityCode;
    }

    /**
     * Define el valor de la propiedad trazabilityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrazabilityCode(String value) {
        this.trazabilityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionCycle.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransactionCycle() {
        return transactionCycle;
    }

    /**
     * Define el valor de la propiedad transactionCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransactionCycle(Integer value) {
        this.transactionCycle = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionState() {
        return transactionState;
    }

    /**
     * Define el valor de la propiedad transactionState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionState(String value) {
        this.transactionState = value;
    }

    /**
     * Obtiene el valor de la propiedad responseCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * Define el valor de la propiedad responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseCode(Integer value) {
        this.responseCode = value;
    }

    /**
     * Obtiene el valor de la propiedad responseReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseReasonCode() {
        return responseReasonCode;
    }

    /**
     * Define el valor de la propiedad responseReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseReasonCode(String value) {
        this.responseReasonCode = value;
    }

    /**
     * Obtiene el valor de la propiedad responseReasonText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseReasonText() {
        return responseReasonText;
    }

    /**
     * Define el valor de la propiedad responseReasonText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseReasonText(String value) {
        this.responseReasonText = value;
    }

}
