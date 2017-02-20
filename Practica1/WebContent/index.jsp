<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inicio</title>
</head>
<body>

<h1>Registrese</h1>
<p>Por favor, introduzca a continuación sus datos:</p> 
			<form action="http:localhost:8081/Practica1/Registro" method="post">
			Email:<br> <input type="email" name="email" required><br>
			 Nombre:<br> <input type="text" name="nombre" required><br>
			Apellidos:<br> <input type="text" name="apellidos" required><br>
				<input type="submit" value=Confirmar > 
		</form>
	</body> 
</html>