//Script para obtener la lista de bancos. En caso de no poder acceder a ella, se muestra un mensaje en su lugar. 
var ws = "http://localhost:8080/PSEPrueba";
$(document)
		.ready(
				function() {
					$
							.ajax({
								url : ws + "/getAllBanks",
								type : "GET",
								success : function(data) {
									for (i = 0; i < data.length; i++) {
										$("#selBancos").append(
												'<option value='
														+ data[i].bankCode
														+ '>'
														+ data[i].bankName
														+ '</option>');
									}
									;
									setCookie("bancos", data, 1);
								},
								error : function(data) {
									$("#selBancos")
											.append(
													'<option value='
															+ -1
															+ '>No se pudo obtener la lista de Entidades Financieras, por favor intente más tarde</option>');
									console.log(data);
								},
							});
				});