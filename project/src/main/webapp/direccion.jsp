<%@ include file="cabecera.jsp"%>
<div class="margen" >
<div>
	<input type="button" value="Editar" onclick="">
</div>

<div id="dir1">
	<form action="">
		<label for="curso">Curso:</label> <br> <select name="Causas" size="5">
			<option value="1A">1� A</option>
			<option value="1B">1� B</option>
			<option value="1C">1� C</option>
			<option value="2A">2� A</option>
			<option value="2B">2� B</option>
			<option value="2C">2� C</option>
			<option value="3A">3� A</option>
			<option value="3B">3� B</option>
			<option value="3C">3� C</option>
			</select>
	</form>
</div>

<div id="dir2">
	<form action="">
		<label for="alum">Alumno:</label> <select name="alum"
			size="5">
			<option value="1">G�mez, Aaron</option>
			<option value="2">Garc�a, Alberto</option>
			<option value="3">Rojas, Ana</option>
			<option value="4">Vega, Antonio</option>
		</select> <br> <input type="submit" value="Consultar">
	</form>
</div>
</div>
<%@ include file="pie.jsp"%>