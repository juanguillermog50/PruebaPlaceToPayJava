package com.placetopay.prueba.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.placetopay.prueba.clientesoap.SOAPConnector;
import com.placetopay.prueba.ws.Authentication;
import com.placetopay.prueba.ws.CreateTransaction;
import com.placetopay.prueba.ws.CreateTransactionResponse;
import com.placetopay.prueba.ws.GetTransactionInformation;
import com.placetopay.prueba.ws.GetTransactionInformationResponse;
import com.placetopay.prueba.ws.PSETransactionRequest;
import com.placetopay.prueba.ws.PSETransactionResponse;
import com.placetopay.prueba.ws.TransactionInformation;

//Acceso a datos para las operaciones de las transacciones
@Repository
public class TransactionDAOImpl implements TransactionDAO {
	@Autowired
	SOAPConnector soapConnector;

	@Override
	public CreateTransactionResponse createTransaction(Authentication auth, PSETransactionRequest transaction) {
		CreateTransactionResponse response;
		try {
			CreateTransaction request=new CreateTransaction();
			request.setAuth(auth);
			request.setTransaction(transaction);
			response=(CreateTransactionResponse) soapConnector.callWebService("https://test.placetopay.com/soap/pse/?wsdl", request);
		}catch(Exception e) {
			response=new CreateTransactionResponse();
			response.setCreateTransactionResult(new PSETransactionResponse());
			response.getCreateTransactionResult().setResponseReasonText(e.getMessage());
		}
		return response;
	}

	@Override
	public GetTransactionInformationResponse getTransactionInformation(Authentication auth, int id) {
		GetTransactionInformationResponse response;
		try {
		GetTransactionInformation request=new GetTransactionInformation();
		request.setAuth(auth);
		request.setTransactionID(id);
		response=(GetTransactionInformationResponse) soapConnector.callWebService("https://test.placetopay.com/soap/pse/?wsdl", request);
		}catch(Exception e) {
			response=new GetTransactionInformationResponse();
			response.setGetTransactionInformationResult(new TransactionInformation());
			response.getGetTransactionInformationResult().setResponseReasonText(e.getMessage());
		}
		return response;
	}

	@Override
	public String saveTransaction(PSETransactionResponse transaction) {
		TransactionFile file=new TransactionFile();
		return file.writeTransaction(transaction);
	}

	@Override
	public List<PSETransactionResponse> getTransactions() {
		TransactionFile file=new TransactionFile();
			return file.readTransactions();
	}	

}
