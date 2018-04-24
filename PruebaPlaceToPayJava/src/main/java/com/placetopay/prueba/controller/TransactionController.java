package com.placetopay.prueba.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import com.placetopay.prueba.ws.CreateTransactionResponse;
import com.placetopay.prueba.ws.GetTransactionInformationResponse;
import com.placetopay.prueba.ws.PSETransactionRequest;
import com.placetopay.prueba.ws.PSETransactionResponse;

public interface TransactionController {
	
	public ResponseEntity<CreateTransactionResponse> createTransaction(PSETransactionRequest transaction, UriComponentsBuilder builder);
	
	public ResponseEntity<GetTransactionInformationResponse> getTransactionInformation(int id);
	
	public ResponseEntity<List<PSETransactionResponse>> getTransactionList() ;
}
