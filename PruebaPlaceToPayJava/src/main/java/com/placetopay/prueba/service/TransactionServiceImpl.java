package com.placetopay.prueba.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placetopay.prueba.Converter;
import com.placetopay.prueba.dao.TransactionDAO;
import com.placetopay.prueba.ws.Authentication;
import com.placetopay.prueba.ws.CreateTransactionResponse;
import com.placetopay.prueba.ws.GetTransactionInformationResponse;
import com.placetopay.prueba.ws.PSETransactionRequest;
import com.placetopay.prueba.ws.PSETransactionResponse;

//Servicio para las operaciones de las transacciones
@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionDAO transactionDAO;

	@Override
	public CreateTransactionResponse createTransaction(PSETransactionRequest transaction) {
		Authentication auth = new Authentication();
		auth.setLogin("6dd490faf9cb87a9862245da41170ff2");
		Date now = new Date();
		SimpleDateFormat isoDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		String seed = isoDate.format(now);
		String tranKey = "024h1IlD";
		String hashString;
		hashString = Converter.GetSHA1(seed + tranKey);
		auth.setTranKey(hashString);
		auth.setSeed(seed);
		auth.setAdditional(null);
		CreateTransactionResponse response = transactionDAO.createTransaction(auth, transaction);
		transactionDAO.saveTransaction(response.getCreateTransactionResult());
		return response;
	}

	@Override
	public GetTransactionInformationResponse getTransactionInformation(int id) {
		Authentication auth = new Authentication();
		auth.setLogin("6dd490faf9cb87a9862245da41170ff2");
		Date now = new Date();
		SimpleDateFormat isoDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		String seed = isoDate.format(now);
		String tranKey = "024h1IlD";
		String hashString;
		hashString = Converter.GetSHA1(seed + tranKey);
		auth.setTranKey(hashString);
		auth.setSeed(seed);
		auth.setAdditional(null);
		GetTransactionInformationResponse transactionInformationResponse = transactionDAO
				.getTransactionInformation(auth, id);
		return transactionInformationResponse;
	}

	@Override
	public List<PSETransactionResponse> getTransactions() {
		return transactionDAO.getTransactions();
	}

}
