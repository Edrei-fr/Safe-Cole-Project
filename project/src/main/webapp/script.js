/**
 * 
 */
function login () {
	user = document.getElementById("user").value;
	account = document.getElementById("account").value;
	if (account=="fam" || account =="dir" || account =="cat") {
		patron = /^[a-zA-Z0-9]{5,20}$/;
		if (patron.test(user)) {
			// OK 
		}
		else {
			document.getElementById("errorUsuario").innerHTML = "Caracter incorrecto, por favor introduzca un usuario correcto";
			
		}
	}
}

