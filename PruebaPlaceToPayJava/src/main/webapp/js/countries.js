//Script para obtener la lista de países con su respectivo código del servicio proporcionado por https://restcountries.eu
$(document).ready(
		function() {
			$.getJSON('https://restcountries.eu/rest/v2/all', function(data) {
				for (i = 0; i < data.length; i++) {
					$("#selCountry").append(
							'<option value=' + data[i].alpha2Code + '>'
									+ data[i].name + '</option>');
				}
			});
		});