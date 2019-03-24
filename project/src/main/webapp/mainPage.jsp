<%@ include file="cabecera.jsp"%>
<div id="maindiv">
<form id="formlogin" method="post" action="user-page">
	<select name="cuenta" id="account">
		<option value="fam">Familiar</option>
		<option value="dir">Dirección</option>
		<option value="cat">Catering</option>
	</select>
	<br>
	<label for="usuario">Usuario: &nbsp; &nbsp; &nbsp;</label>
	<input class="impmain" type="text" name="usuario" id="user" maxlength="20" placeholder="Nombre de usuario" required>
	<br>
	<div id="errorUsuario"></div>
	<br>
	<label for="pass">Contraseña:</label>
	<input class="inpmain" type="password" name="pass" required>
	<br>
	<input type="submit" class="inpfam" value="Log In" >
</form>
</div>
<%@ include file="pie.jsp"%>