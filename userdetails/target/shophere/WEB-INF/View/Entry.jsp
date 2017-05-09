<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
	<html>
	<head>
	<style type="text/css">
	
input[type=email],[type=text]{
    background-color: lightyellow;
    border: none;
    color: whitesmoke;
    size:12px;
    padding: 14px 14px;
    text-decoration : none;
    margin: 7px -14px;
    color:black;
    cursor: pointer;
    width:50%;
}

input[type=submit]{
    
    border:none;
    color:black;
    padding: 16px 32px;
    text-decoration:initial ;
    margin: 4px 2px;
    cursor: pointer;
    border-color: red;
    border-radius: 2px;
}
	.div{
	width:100%;
}
}
	
	</style>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Entry Page</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body>
	
		<div class="container" align="center">
	
			<h1 class="jumbotron jumbotron-fluid">Please Enter Details</h1>
		
		<form action="log" method="post" enctype="multipart/form-data">
			
	<input type="text" name="username"	placeholder="Enter username" required="required"/><br/><br/>
			
			<input type="text"	 placeholder="First name" name="firstname" required="required"></input>
			
			<br>
		
			<input type="text" name="lastname"	placeholder="Enter Last name" required="required"/><br/>
			
			<input type="text" name="mobileno"	placeholder="Enter mobile number" required="required" maxlength="10" pattern="[-+]?[0-9]*+"/><br/><br/>
			
			<input type="email" name="email"	placeholder="Valid Email id Ex:sr12@gmail.com" required="required" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" /><br/><br/>
			
			<input type="text" name="location"	placeholder="Enter location" required="required"/><br/><br/>
			
			<input type="text" name="address"	placeholder="Enter Address" required="required"/><br/><br/>
			
			<input type="text" name="age"	placeholder="Enter Age" required="required" maxlength="3"  /><br/><br/>
			
			<input type="text" name="gender"	placeholder="Enter Gender" required="required" /><br/><br/>
			
			<input type="text" name="nationality"	placeholder="Enter Nationality" required="required" /><br/><br/>
			
<%--  <form action="log" method="post" enctype="multipart/form-data" > --%>
	
<input type="file" name="filedata"/>


<!-- <button  type="submit">Add file</button> -->

	       <input type="submit" value="Submit"></input>	 

         
            </form>
            </div>
            </body>
            </html>
		 -	