package com.placetopay.prueba.dao;

import java.util.List;

import com.placetopay.prueba.ws.Authentication;
import com.placetopay.prueba.ws.CreateTransactionResponse;
import com.placetopay.prueba.ws.GetTransactionInformationResponse;
import com.placetopay.prueba.ws.PSETransactionRequest;
import com.placetopay.prueba.ws.PSETransactionResponse;

public interface TransactionDAO {
	
	public CreateTransactionResponse createTransaction(Authentication auth, PSETransactionRequest transaction);
	
	public GetTransactionInformationResponse getTransactionInformation(Authentication auth, int id);
	
	public String saveTransaction(PSETransactionResponse transaction);
	
	public List<PSETransactionResponse> getTransactions();
	
}
