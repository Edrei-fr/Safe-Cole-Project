<%@ include file="cabecera.jsp"%>
<main id="mainfam">

<div>
	<input type="button" value="Editar" id="bt" onclick="">
</div>

<div id="fam1">
	<form action="">
		<label for="motivo">Motivo:</label> <br> <select class="selectsize" name="motivo" size="5">
			<option value="ale">Alergia</option>
			<option value="int">Intolerancia</option>
			<option value="rel">Motivos religiosos</option>
			<option value="med">Motivos médicos</option>
			<option value="otros">Otros</option>
		</select> <br> <input class="inpfam" type="submit" value="Adjuntar justificante">
	</form>
</div>

<div id="fam2">
	<form action="">
		<label for="alim">Alimentos:</label> <br> <select class="selectsize" multiple name="alim"
			size="5">
			<option value="">Crustáceos</option>
			<option value="">Pescado</option>
			<option value="">Frutos secos</option>
			<option value="">Trigo</option>
			<option value="">Leche</option>
			<option value="">Melocotón</option>
			<option value="">Pimiento</option>
			<option value="">Tomate</option>
		</select> <br> <input class="inpfam" type="submit" value="Añadir">
	</form>
</div>

<div id="fam3">
	<form action="">
		<label for="menu">Menú:</label> <br> <select class="selectsize" name="menu" size="5">
			<!--<option value=""></option>-->
			<option value="die">Dieta</option>
			<option value="dietbland">Dieta blanda</option>
			<option value="hal">Halal</option>
			<option value="vega">Vegano</option>
			<option value="veg">Vegetariano</option>
		</select> <br> <input class="inpfam" type="submit" value="Elegir">
	</form>
	<a id="fammen" href="#">Consultar menú semanal</a>
</div>

	<a id="fama" href="conquientrabajamos.jsp">¿Quieres saber más sobre la comida que servimos?</a>


</main>
<%@ include file="pie.jsp"%>