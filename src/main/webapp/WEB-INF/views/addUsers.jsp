<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="./insertuser" modelAttribute="userBean">
		<table>
			<tr>
				<td>User NAme</td>
				<td><form:input path="uName" /></td>
			</tr>

			<tr>
				<td>User age</td>
				<td><form:input path="uAge" /></td>
			</tr>
			<tr>

				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>

	</form:form>


</body>
</html>