<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String heading=(String)request.getAttribute("heading");
String id=(String)request.getAttribute("id");
%>
<h1>Dynamic parameter passing using ModelAndView</h1>
<h2>Heading:<%=heading %><br></h2>
 <h2>ID:<%=id %></h2>
</body>
</html>