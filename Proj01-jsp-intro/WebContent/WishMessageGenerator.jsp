<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.Date" %> <!-- Directives -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<!-- Declaration -->
	<%! 
		Date date = new Date();
		int hour;
		String wish,name;
	%>
	
		<!-- Scriptlet -->
	<%
		hour = date.getHours();
		name = request.getParameter("name");	
		
		if(hour<12)
			wish="Good Morning";
		else if(hour>=12 && hour<16)
			wish="Good AfterNoon";
		else if(hour>=16 && hour<19)
			wish="Good Evening";
		else
			wish="Good Night";
	%>
	
		<form action="WishMessageGenerator.jsp">
			<br>
			Enter Your Name : <input type="text" name="name" placeholder="Please enter your name" /> <br><br>
			<input type="submit" value="Submit">
			<br><br>
				<!-- Expression -->
			<%=
				"<p>"+wish+"::"+name+"</p>"
			%>
		</form>
	
	
	
	
</body>
</html>