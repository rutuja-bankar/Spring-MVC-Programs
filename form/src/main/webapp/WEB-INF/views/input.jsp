<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<form:form action="processing " modelAttribute="obj">
<h3>**Registration Form**</h3><br><br>
Enter username:
<form:input path="username"/><br><br>

Enter Password:
<form:password path="password"  required="required"/><br><br>

Enter birthdatae:
<form:input type="date" path="birthdate"/><br><br>

Enter email:
<form:input path="email"/><br><br>

Enter Gender:
Female:<form:radiobutton path="gender" value="Female"/>
Male:<form:radiobutton path="gender" value="male"/><br><br>

Select Hobbies:<br>
Cricket:<form:checkbox path="hobbies" value="Cricket"/><br>
reading:<form:checkbox path="hobbies" value="reading"/><br>
dancing:<form:checkbox path="hobbies" value="dancing"/><br>
swiming:<form:checkbox path="hobbies" value="swiming"/><br><br>

select courses:
<form:select path="courses">
	<form:option value="java">java</form:option>
	<form:option value="c">C</form:option>
	<form:option value="spring">Spring</form:option>
	<form:option value="php">PHP</form:option><br>
</form:select><br><br>

<input type="submit" value="Submit">
<input type="reset" value="Reset">

</form:form>

</body>
</html>