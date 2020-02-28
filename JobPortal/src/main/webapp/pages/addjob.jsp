<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Post available Job-

<form action="addJob">
		Job ID : 			 <input type="text" name="jid"><br>
		Job Title :			 <input type="text" name="jtitle"><br>
		Company :			 <input type="text" name="compname"><br>
		Required Experience :<input type="text" name="reqexp"><br>
		Required Skill :	 <input type="text" name="skill"><br>
							 <input type="submit"><br>
	</form>
	
	<br>
	<br>
	
Search Job by ID :	
	<form action="getJob">
		Job ID :  <input type="text" name="jid"><br>
				  <input type="submit"><br>
	</form>
	
</body>
</html>