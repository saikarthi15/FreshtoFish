<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>List of Users</title>
</head>

<body>
	<table id="userCreationtable" border="1">
		<tr>
			<th > User Details</th>
		</tr>
		<tr bordercolor="bule">
			<td><label id="UserName">User Name : </label></td>
			<td>${User.userName }</td>
		</tr>

		<tr>
			<td><label id="displayName">Display Name :</label></td>
			<td>${User.displayName}</td>
		</tr>

		<tr>
			<td><label id="pwd">Password : </label></td>
			<td>${User.pwd}</td>
		</tr>

		<tr>
			<td><label id="mobileNo">Mobile No: </label></td>
			<td>${User.mobileNo}</td>
		</tr>

		<tr>
			<td><label id="emailId">Email Id : </label></td>
			<td>${User.emailId}</td>
		</tr>

		<tr>
			<td><label id="Address">Address : </label></td>
			<td>${User.address}</td>
		</tr>
	</table>
<a href="/springmvc/LoginPage" > Login Page </a>

</body>
</html>