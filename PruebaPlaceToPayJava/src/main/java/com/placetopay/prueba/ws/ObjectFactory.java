//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.15 a las 09:23:15 PM COT 
//


package com.placetopay.prueba.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.placetopay.prueba.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.placetopay.prueba.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankList }
     * 
     */
    public GetBankList createGetBankList() {
        return new GetBankList();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link GetBankListResponse }
     * 
     */
    public GetBankListResponse createGetBankListResponse() {
        return new GetBankListResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBank }
     * 
     */
    public ArrayOfBank createArrayOfBank() {
        return new ArrayOfBank();
    }

    /**
     * Create an instance of {@link CreateTransaction }
     * 
     */
    public CreateTransaction createCreateTransaction() {
        return new CreateTransaction();
    }

    /**
     * Create an instance of {@link PSETransactionRequest }
     * 
     */
    public PSETransactionRequest createPSETransactionRequest() {
        return new PSETransactionRequest();
    }

    /**
     * Create an instance of {@link CreateTransactionResponse }
     * 
     */
    public CreateTransactionResponse createCreateTransactionResponse() {
        return new CreateTransactionResponse();
    }

    /**
     * Create an instance of {@link PSETransactionResponse }
     * 
     */
    public PSETransactionResponse createPSETransactionResponse() {
        return new PSETransactionResponse();
    }

    /**
     * Create an instance of {@link CreateTransactionMultiCredit }
     * 
     */
    public CreateTransactionMultiCredit createCreateTransactionMultiCredit() {
        return new CreateTransactionMultiCredit();
    }

    /**
     * Create an instance of {@link PSETransactionMultiCreditRequest }
     * 
     */
    public PSETransactionMultiCreditRequest createPSETransactionMultiCreditRequest() {
        return new PSETransactionMultiCreditRequest();
    }

    /**
     * Create an instance of {@link CreateTransactionMultiCreditResponse }
     * 
     */
    public CreateTransactionMultiCreditResponse createCreateTransactionMultiCreditResponse() {
        return new CreateTransactionMultiCreditResponse();
    }

    /**
     * Create an instance of {@link GetTransactionInformation }
     * 
     */
    public GetTransactionInformation createGetTransactionInformation() {
        return new GetTransactionInformation();
    }

    /**
     * Create an instance of {@link GetTransactionInformationResponse }
     * 
     */
    public GetTransactionInformationResponse createGetTransactionInformationResponse() {
        return new GetTransactionInformationResponse();
    }

    /**
     * Create an instance of {@link TransactionInformation }
     * 
     */
    public TransactionInformation createTransactionInformation() {
        return new TransactionInformation();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link ArrayOfAttribute }
     * 
     */
    public ArrayOfAttribute createArrayOfAttribute() {
        return new ArrayOfAttribute();
    }

    /**
     * Create an instance of {@link Bank }
     * 
     */
    public Bank createBank() {
        return new Bank();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link CreditConcept }
     * 
     */
    public CreditConcept createCreditConcept() {
        return new CreditConcept();
    }

    /**
     * Create an instance of {@link ArrayOfCreditconcept }
     * 
     */
    public ArrayOfCreditconcept createArrayOfCreditconcept() {
        return new ArrayOfCreditconcept();
    }

}
