<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>User Login</title>
</head>

<body>

	<div id="loginDiv">

		<form:form action="loginUser" modelAttribute="User">
			<table id="logintable">
				<tr>
					<td><form:label path="UserName">User Name : </form:label></td>
					<td><form:input path="UserName" /></td>
				</tr>
				<tr>
					<td><form:label path="pwd">Password</form:label></td>
					<td><form:input path="pwd" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
		</form:form>
	</div>

</body>

</html>