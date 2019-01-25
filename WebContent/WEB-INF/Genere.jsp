<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista Generi</h1>
	<ul>
		<c:forEach items="${genere}" var="genere">
		<li><a href="${pageContext.request.contextPath}/DettaglioGenereServlet?id=${id}${genere.getId()}">
			${genere.getNome()}</a>
			</li>
		</c:forEach>
	</ul>
	
	
	<a href="${pageContext.request.contextPath}/FormGenereServlet">Aggiungi genere</a>
	
</body>
</html>