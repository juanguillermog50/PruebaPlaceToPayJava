package com.placetopay.prueba.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.placetopay.prueba.clientesoap.SOAPConnector;
import com.placetopay.prueba.ws.Authentication;
import com.placetopay.prueba.ws.Bank;
import com.placetopay.prueba.ws.GetBankList;
import com.placetopay.prueba.ws.GetBankListResponse;

//Acceso a datos para las operaciones de los bancos.
@Repository
public class BankDaoImpl implements BankDao {
	@Autowired
	SOAPConnector soapConnector;

	@Override
	public List<Bank> getAllBanks(Authentication auth) {
		try {
			GetBankList request = new GetBankList();
			request.setAuth(auth);
			GetBankListResponse response = (GetBankListResponse) soapConnector
					.callWebService("https://test.placetopay.com/soap/pse/?wsdl", request);
			return response.getGetBankListResult().getItem();
		} catch (Exception e) {
			return null;
		}
	}

}
