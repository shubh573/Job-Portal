<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type ="text/css">
	body {
		width: 80%;
		border: 20px solid #bdc3c7;
		font-family: 'Source Sans Pro', sans-serif;
		padding: 20px;
		margin: 20px auto;
		max-width: 700px;
	}
	
	h2 {
		font-size: 2.0rem;
		font-weight: bold;
		color: #2c3e50;
	}
</style>
</head>
<body>

<div>
<h2>New User Registration</h2>
</div>

<div id="regusr">
<form action="saveUser">
		<label for="uname">User Name</label>
		<input type="text" name="uname" required><br>
		
		<label for="uaddress">Address</label>
		<input type="text" name="uaddress" required><br>
		
		<label for="ucontact">Contact</label>
		<input type="text" name="ucontact" required><br>
		
		<label for="qualification">Qualification</label>
		<input type="text" name="qualification" required><br>
		
		<label for="experience">Experience</label>
		<input type="text" name="experience" required><br>
		
		<label for="experience">Password</label>
		<input type="password" name="upswd" required><br>
			 
		<input type="submit" value="Register"><br>
	</form>
</div>
</body>
</html>