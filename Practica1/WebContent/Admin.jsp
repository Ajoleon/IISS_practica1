<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style> table, tr, td, th {border:1px solid brown;} </style>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Administraci�n</title>
	</head>
		<body>
		<h1>Pagina de administraci�n</h1>
		<table> 
			 <tr>
			  <th> ID </th>
			  <th> Cookie </th>
			  </tr>
			   <td><c:out value = "${user.ID}" /> <br></td>
			   <td><c:out value = "${user.cookie}" /> <br></td>
		</table>
	</body>
</html>