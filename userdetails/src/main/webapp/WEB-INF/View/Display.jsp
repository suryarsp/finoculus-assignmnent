<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<style type="text/css">
body {
 
    background-color: #fff;
}

</style>
</head>
<body  >
<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<h1 class="jumbotron">Credentilas</h1>

    <h2 class="navbar">List of Datas</h2>
    
	<c:if test="${!empty listuser}">
		<table class="table table-hover table-inverse" style="align:center" border="2" cellpadding="1" cellspacing="1">
			<tr class="success">
				<th>UserName</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Location</th>
				<th>Address</th>
				<th>Nationality</th>
				<th>Email</th>
				<th>MobileNO </th>
				<th>FileName</th>
			</tr>
			<c:forEach items="${userlist}" var="l">
				<tr>
					<td >${l.username}</td>
					<td>${l.firstname}</td>
					<td>${l.lastname}</td>
					<td>${l.age}</td>
					<td>${l.location}</td>
					<td>${l.address}</td>
					<td>${l.nationality}</td>
		            <td>${l.email}</td>
		            <td>${l.mobileno}</td>
		            <td>${l.fileModel.name}</td>	
				</tr>
				
			</c:forEach>
		</table>
	</c:if>
	</body>
</html>