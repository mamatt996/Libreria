<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Genere  ${genere.getNome()} gia esistente!</h1>
  
  	<div><a href="${pageContext.request.contextPath}/GenereServlet">Torna Alla Lista</a></div>
  
 	<div><a href="${pageContext.request.contextPath}/FormGenereServlet">Inserisci un nuovo genere</a></div>

</body>
</html>