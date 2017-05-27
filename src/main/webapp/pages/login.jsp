<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<center>
		<h2 style="font-family:Century Gothic;">LOG-IN  
		<br/><br/>
		${message }
		<form  action="LoginServlet" method="get">
		<!-- <form action="${pageContext.request.contextPath}/login/loginAccount" method="post">-->
			<input type="text" name="idnumber" placeholder="ID Number"></input>
			<br />
			<input type="password" name="password" placeholder="Password"></input>
			<br /><br/>
			<button type="submit" name="loginbtn">Log in</button>
		</form>
	</center>
	<!--  <script>
		$(document).ready(function() {
			bindUserFormEvents();
		});
	</script> -->



</body>
</html>