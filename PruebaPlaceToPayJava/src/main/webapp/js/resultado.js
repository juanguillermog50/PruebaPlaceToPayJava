//Script para consumir el método getTransactionInformation, invocándolo para cada una de las transacciones registradas en obtenidas de getTransactionList. 
var ws = "http://localhost:8080/PSEPrueba";
$(document)
		.ready(
				function() {
					$
							.ajax({
								url : ws + "/getTransactionList",
								type : "GET",
								success : function(data) {
									for (i = 0; i < data.length; i++) {
										$
												.ajax({
													url : ws
															+ "/getTransactionInformation/"
															+ data[i].transactionID,
													type : "GET",
													success : function(
															transactions) {
														var result = transactions.getTransactionInformationResult;
														$("#tabla")
																.append(
																		'<tr>'
																				+ '<td>'
																				+ result.transactionID
																				+ '</td>'
																				+ '<td>'
																				+ result.transactionState
																				+ '</td>'
																				+ '<td>'
																				+ result.reference
																				+ '</td>'
																				+ '<td>'
																				+ result.requestDate
																				+ '</td>'
																				+ '<td>'
																				+ result.bankProcessDate
																				+ '</td>'
																				+ '<td>'
																				+ result.responseReasonText
																				+ '</td>'
																				+ '</tr>');
														console
																.log(transactions);
													},
													error : function(
															transactions) {
														console
																.log("resultados:"
																		+ transactions);
													},
												});
									}
									;
								},
								error : function(data) {
									console.log("transactions: " + data);
								},
							});
				});