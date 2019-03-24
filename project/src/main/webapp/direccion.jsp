<%@ include file="cabecera.jsp"%>
<div class="margen" >
<div>
	<input type="button" value="Editar" onclick="">
</div>

<div id="dir1">
	<form action="">
		<label for="curso">Curso:</label> <br> <select name="Causas" size="5">
			<option value="1A">1º A</option>
			<option value="1B">1º B</option>
			<option value="1C">1º C</option>
			<option value="2A">2º A</option>
			<option value="2B">2º B</option>
			<option value="2C">2º C</option>
			<option value="3A">3º A</option>
			<option value="3B">3º B</option>
			<option value="3C">3º C</option>
			</select>
	</form>
</div>

<div id="dir2">
	<form action="">
		<label for="alum">Alumno:</label> <select name="alum"
			size="5">
			<option value="1">Gómez, Aaron</option>
			<option value="2">García, Alberto</option>
			<option value="3">Rojas, Ana</option>
			<option value="4">Vega, Antonio</option>
		</select> <br> <input type="submit" value="Consultar">
	</form>
</div>
</div>
<%@ include file="pie.jsp"%>