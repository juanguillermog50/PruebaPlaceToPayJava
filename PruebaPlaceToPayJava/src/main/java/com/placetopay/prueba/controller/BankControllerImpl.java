package com.placetopay.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.placetopay.prueba.service.BankService;
import com.placetopay.prueba.ws.Bank;

//Controlador para los bancos
@Controller
@RequestMapping("PSEPrueba")
public class BankControllerImpl implements BankController {
	
	@Autowired
	BankService bankService;

	@Override
	@GetMapping("getAllBanks")
	public ResponseEntity<List<Bank>> getAllBanks() {
		List<Bank> listBanks = bankService.getAllBanks();
		return new ResponseEntity<List<Bank>>(listBanks, HttpStatus.OK);
	}

}
