package com.placetopay.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.placetopay.prueba.service.TransactionService;
import com.placetopay.prueba.ws.CreateTransactionResponse;
import com.placetopay.prueba.ws.GetTransactionInformationResponse;
import com.placetopay.prueba.ws.PSETransactionRequest;
import com.placetopay.prueba.ws.PSETransactionResponse;

//Controlador para las transacciones
@RequestMapping("PSEPrueba")
@Controller
public class TransactionControllerImpl implements TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@Override
	@PostMapping("createTransaction")
	public ResponseEntity<CreateTransactionResponse> createTransaction(@RequestBody PSETransactionRequest transaction, UriComponentsBuilder builder) {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setLocation(builder.path("/transaction/{reference}").buildAndExpand(transaction.getReference()).toUri());
			return new ResponseEntity<CreateTransactionResponse>(transactionService.createTransaction(transaction),headers, HttpStatus.CREATED);
		} catch (Exception e) {
			System.out.println("------------------------------------Controller: "+e.getMessage());
			return null;
		}
	}

	@Override
	@GetMapping("getTransactionInformation/{id}")
	public ResponseEntity<GetTransactionInformationResponse> getTransactionInformation(@PathVariable("id") int id) {
		try {
			return new ResponseEntity<GetTransactionInformationResponse>(transactionService.getTransactionInformation(id), HttpStatus.OK);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	@GetMapping("getTransactionList")
	public ResponseEntity<List<PSETransactionResponse>> getTransactionList() {
		return new ResponseEntity<List<PSETransactionResponse>>(transactionService.getTransactions(), HttpStatus.OK);
	}

}
