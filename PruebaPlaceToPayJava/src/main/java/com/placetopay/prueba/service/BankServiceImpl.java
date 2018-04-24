package com.placetopay.prueba.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placetopay.prueba.Converter;
import com.placetopay.prueba.dao.BankDao;
import com.placetopay.prueba.ws.Authentication;
import com.placetopay.prueba.ws.Bank;

//Servicio para las operaciones de los bancos
@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankDao bankDao;

	@Override
	public List<Bank> getAllBanks() {
		Authentication auth = new Authentication();
		auth.setLogin("6dd490faf9cb87a9862245da41170ff2");
		Date now = new Date();
		SimpleDateFormat isoDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		String seed = isoDate.format(now);
		System.out.println(seed);
		String tranKey = "024h1IlD";
		String hashString;
		hashString = Converter.GetSHA1(seed + tranKey);
		System.out.println(hashString);
		auth.setTranKey(hashString);
		auth.setSeed(seed);
		auth.setAdditional(null);
		return bankDao.getAllBanks(auth);
	}

}
