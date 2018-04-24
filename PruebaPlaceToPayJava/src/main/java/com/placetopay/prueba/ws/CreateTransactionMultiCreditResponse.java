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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createTransactionMultiCreditResult" type="{https://placetopay.com/soap/pse}PSETransactionResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createTransactionMultiCreditResult"
})
@XmlRootElement(name = "createTransactionMultiCreditResponse")
public class CreateTransactionMultiCreditResponse {

    @XmlElement(required = true)
    protected PSETransactionResponse createTransactionMultiCreditResult;

    /**
     * Obtiene el valor de la propiedad createTransactionMultiCreditResult.
     * 
     * @return
     *     possible object is
     *     {@link PSETransactionResponse }
     *     
     */
    public PSETransactionResponse getCreateTransactionMultiCreditResult() {
        return createTransactionMultiCreditResult;
    }

    /**
     * Define el valor de la propiedad createTransactionMultiCreditResult.
     * 
     * @param value
     *     allowed object is
     *     {@link PSETransactionResponse }
     *     
     */
    public void setCreateTransactionMultiCreditResult(PSETransactionResponse value) {
        this.createTransactionMultiCreditResult = value;
    }

}
