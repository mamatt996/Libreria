<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/FormGenereServlet">Il genere ${genere.getNome()} è stato aggiunto
	</a>
	<br>
	<a href="${pageContext.request.contextPath}/GenereServlet">Torna alla lista
	</a>
</body>
</html>
