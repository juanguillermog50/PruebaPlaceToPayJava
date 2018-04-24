package com.placetopay.prueba.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.placetopay.prueba.ws.Bank;

public interface BankController {

	public ResponseEntity<List<Bank>> getAllBanks();
}
