<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Generi</title>
</head>
<body>
	<h1>Aggiungi il genere</h1>
	<form action="${pageContext.request.contextPath}/FormGenereServlet" method="POST">
	Nome:<input type="text" name="nome" placeholder="Inserisci nome"/>
	<input type="submit" value="aggiungi"/>
	</form>
</body>
</html>