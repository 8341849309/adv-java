<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");// HTTP 1.1
		response.setHeader("Pragma", "no-cache");// Http 1.0
		response.setHeader("Expires", "0");// Proxies
		if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	%>

	<h1>Videos</h1>
	<br>
	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/ZYB90i0v1y0" frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>

	<a href="welcome.jsp">Welcome</a>

</body>
</html>