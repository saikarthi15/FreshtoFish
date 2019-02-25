<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<div id="signUpDiv">

		<form:form action="CreateUser" modelAttribute="User">
			<table id="userCreationtable">
				<tr>
					<td><form:label path="UserName">User Name : </form:label></td>
					<td><form:input path="UserName" /></td>
				</tr>

				<tr>
					<td><form:label path="displayName">Display Name : </form:label></td>
					<td><form:input path="displayName" /></td>
				</tr>

				<tr>
					<td><form:label path="pwd">Password</form:label></td>
					<td><form:input path="pwd" /></td>
				</tr>

				<tr>
					<td><form:label path="mobileNo">Mobile No:</form:label></td>
					<td><form:input path="mobileNo" /></td>
				</tr>

				<tr>
					<td><form:label path="emailId">Email Id</form:label></td>
					<td><form:input path="emailId" /></td>
				</tr>

				<tr>
					<td><form:label path="Address">Address :</form:label></td>
					<td><form:input path="Address" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />

		</form:form>
	</div>

</body>

</html>