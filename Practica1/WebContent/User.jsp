<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuario</title>
</head>
<body>

<h1>Unos pasos mas...</h1>
<p>Por favor, introduzca a continuación unos datos extra:</p> 
			<form action="/Practica1/Registro" method="post">
				Telefono:<br> <input type="text" name="tlf" required><br>
				E-mail:<br> <input type="email" name="email" required><br>
				Direccion Postal:<br> <input type="text" name="dir" required><br>
				<input type="submit" value=Confirmar > 
		</form>
	</body>
</html>