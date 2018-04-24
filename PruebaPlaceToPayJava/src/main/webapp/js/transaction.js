//Script para guardar las transacciones.
var language = window.navigator.language;//Se obtiene el lenguaje del navegador.
var agent = navigator.userAgent;//Se obtiene el agente de usuario
var ip = "";
$(document).ready(//Funcion para obtener la IP del cliente.
		function() {
			$.getJSON('http://freegeoip.net/json/?callback=?', function(data) {
				ip = data.ip;
			});
		});
//Funcion para crear la transacción consumiendo el método createTransaction 
function guardar() {
	//Los datos del vendedor podrían obtenerse de muchas formas distintas, por lo que en este caso se simulan como conocidos
	var shipping = {
			"document" : "123456789",
			"documentType" : "CC",
			"firstName" : "Jose Luis",
			"lastName" : "Castrillon Herrera",
			"company" : "Enviexpress",
			"emailAddress" : "123@mail.com",
			"address" : "Calle 1 #12-25",
			"city" : "Medellin",
			"province" : "Antioquia",
			"country" : "CO",
			"phone" : "1234567",
			"mobile" : "1234567890"
		};
	//Se asumió que el comprador y el pagador son la misma persona.
	var payer = {
		"document" : $('#txtDocument').val(),
		"documentType" : $('#selDocumentType').val(),
		"firstName" : $('#txtFirstName').val(),
		"lastName" : $('#txtLastName').val(),
		"company" : $('#txtCompany').val(),
		"emailAddress" : $('#txtEmailAddress').val(),
		"address" : $('#txtAddress').val(),
		"city" : $('#txtCity').val(),
		"province" : $('#txtProvince').val(),
		"country" : $('#selCountry').val(),
		"phone" : $('#txtPhone').val(),
		"mobile" : $('#txtMobile').val()
	};
	var transaction = {
		"bankCode" : $('#selBancos').val(),
		"bankInterface" : $('#selBankInterface').val(),
		"returnURL" : "http://localhost:8080/resultado.html",
		"reference" : $('#txtReference').val(),
		"description" : $('#txtDescription').val(),
		"language" : language.toUpperCase(),
		"currency" : "COP",
		"totalAmount" : $('#txtTotalAmount').val(),
		"taxAmount" : $('#txtTaxAmount').val(),
		"devolutionBase" : $('#txtDevolutionBase').val(),
		"tipAmount" : $('#txtTipAmount').val(),
		"payer" : payer,
		"buyer" : payer,
		"shipping" : shipping,
		"ipAddress" : ip,
		"userAgent" : agent,
		"additionalData" : payer
	};
	$.ajax({
		headers : {
			'Accept' : 'application/json',
			'Content-Type' : 'application/json'
		},
		type : "POST",
		data : JSON.stringify(transaction),
		url : ws + "/createTransaction",
		success : function(data) {
			if(data.createTransactionResult.bankURL!=""){
				window.location.href = data.createTransactionResult.bankURL;
			}else{
				alert(data.createTransactionResult.responseReasonText);
			}
			
		},
		error : function(data) {
			alert("Error: No se ha logrado crear la transacción.");
			console.log(data);
		},
	});
};
