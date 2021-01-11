<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>

	<%
		response.setHeader("Cache-Control", "n0-cache, no-store, must-revalidate");
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
	%>
	
	<h1>Welcome ${username} </h1><br>
	
	<a href="videos.jsp">Videos</a>
	
	<form action="LogOut">
		<input type="submit" value="LogOut">
	</form>
	
</body>
</html>