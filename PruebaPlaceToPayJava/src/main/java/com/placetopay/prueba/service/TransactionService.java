package com.placetopay.prueba.service;

import java.util.List;

import com.placetopay.prueba.ws.CreateTransactionResponse;
import com.placetopay.prueba.ws.GetTransactionInformationResponse;
import com.placetopay.prueba.ws.PSETransactionRequest;
import com.placetopay.prueba.ws.PSETransactionResponse;

public interface TransactionService {

	public CreateTransactionResponse createTransaction(PSETransactionRequest transaction);
	
	public GetTransactionInformationResponse getTransactionInformation(int id);
	
	public List<PSETransactionResponse> getTransactions();
}
