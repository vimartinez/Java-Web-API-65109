<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JWA Ej01</title>
</head>
<body>
<h2>Java Web API</h2>

<% out.print("<h3>Ejercicio 01 - P�gina JSP</h3>"); %>

<%

String sesionActiva = (String) session.getAttribute("sesionActiva");

if (sesionActiva == null){
	response.sendRedirect("formulario.jsp");
	
}
else {
	String userName = (String) session.getAttribute("usuario");
	String nombre = (String) session.getAttribute("nombre");
	out.print("<h2> "+ userName +  " - " + nombre + " </h2>" );
}

%>

<a href="Logout">Salir</a>
</body>
</html>