package com.placetopay.prueba.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.placetopay.prueba.ws.PSETransactionResponse;

//Clase para manejar el archivo que almacena las transacciones realizadas.
public class TransactionFile {

	private File file;

	public TransactionFile() {
		file = new File("src\\transaction.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public List<PSETransactionResponse> readTransactions() {
		List<PSETransactionResponse> transactions = new ArrayList<PSETransactionResponse>();
		String line = "";
		try {
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			while ((line = bf.readLine()) != null) {
				if (!line.equals("")) {
					String data[] = line.split("#");
					Date now = new Date();
					SimpleDateFormat isoDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
					Date register = isoDate.parse(data[11]);
					int code = Integer.parseInt(data[5]);
					if (now.getTime() - register.getTime() > 42000) {
						PSETransactionResponse transaction = new PSETransactionResponse();
						transaction.setTransactionID(Integer.parseInt(data[0]));
						transaction.setTransactionCycle(Integer.parseInt(data[1]));
						transaction.setSessionID(data[2]);
						transaction.setTrazabilityCode(data[3]);
						transaction.setReturnCode(data[4]);
						transaction.setResponseCode(code);
						transaction.setResponseReasonCode(data[6]);
						transaction.setResponseReasonText(data[7]);
						transaction.setBankCurrency(data[8]);
						transaction.setBankFactor(Float.parseFloat(data[9]));
						transaction.setBankURL(data[10]);
						transactions.add(transaction);
					}
				}
			}
			bf.close();
		} catch (NumberFormatException | IOException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return transactions;
	}

	public String writeTransaction(PSETransactionResponse transaction) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			if (file.exists()) {
				Date now = new Date();
				SimpleDateFormat isoDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
				fw = new FileWriter(file);
				pw = new PrintWriter(fw);
				pw.println(transaction.getTransactionID() + "#" + transaction.getTransactionCycle() + "#"
						+ transaction.getSessionID() + "#" + transaction.getTrazabilityCode() + "#"
						+ transaction.getReturnCode() + "#" + transaction.getResponseCode() + "#"
						+ transaction.getResponseReasonCode() + "#" + transaction.getResponseReasonText() + "#"
						+ transaction.getBankCurrency() + "#" + transaction.getBankFactor() + "#"
						+ transaction.getBankURL() + "#" + isoDate.format(now));
				fw.close();
				return "La transacción se ha guardado correctamente.";
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					return e.getMessage();
				}
			}
		}
		return "No se pudo guardar la transacción.";
	}
}
