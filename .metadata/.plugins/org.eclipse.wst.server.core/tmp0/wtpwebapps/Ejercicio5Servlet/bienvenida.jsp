<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/maincss.css" />
<title>Pagina de bienvenida</title>
</head>
<body>
	
	<%
		String nombre = request.getParameter("usuario");
	%>
	
	<h1>Bienvenidx <%=nombre %></h1>
	
	<p class="titulo2">Ejercicio 2:</p>
	<p>Este ejercicio consiste en realizar 
	una web con HTML que incluya la mayoria de los componente HTML vistos.</p>
	<p>Mi ejercicio consiste en la realización de un portfolio web. Tiene como objetivo
	 darse a conocer como persona desarrolladora, mostrando diferentes apartados, los cuales son: 
	 un inicio, un sobre mi, mis proyectos y un formulario de contacto.</p>
	<a href="ejercicio2.html">Enlace al ejercicio 2</a>
	<p class="titulo2">Ejercicio 3:</p>
	<p>Hacer el CV en HTML y CSS aplicando lo visto en clase y subirlo al repositorio github.</p>
	<a href="ejercicio3.html">Enlace al ejercicio 3</a>
	
</body>
</html>