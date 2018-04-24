package com.placetopay.prueba.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.placetopay.prueba.ws.Authentication;
import com.placetopay.prueba.ws.Bank;

@Repository
public interface BankDao {

	public List<Bank> getAllBanks(Authentication auth);
}
