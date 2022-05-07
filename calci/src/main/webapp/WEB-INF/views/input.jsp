<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple calci</title>
</head>
<body>
<h3>**Simple Calculator**</h3>
<form:form action="processing" modelAttribute="obj">
Enter First no:
<form:input path="txt1"/><br><br>
Enter Second no:
<form:input path="txt2"/><br><br>
Select Operation:
<form:select path="op">
	<form:option value="ADD" label="Addition"></form:option>
	<form:option value="SUB" label="Subtraction"></form:option>
	<form:option value="DIV" label="Division"></form:option>
   <form:option value="MULT" label="Multiplication"></form:option>
   </form:select><br><br>
   <input type="Submit" value="submit">      <input type="reset" value="Clear">

</form:form>

</body>
</html>