<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql"  prefix="sql" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<!-- If any Exception occurred it will go to error.jsp page -->
	
	<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver"
	     url="jdbc:oracle:thin:@localhost:1521:xe" user="root" password="root" />
	     
	<sql:query var="rs" dataSource="${db}" sql="SELECT * FROM PRODUCT"></sql:query>
	
	
	<c:forEach items="${rs.rows}" var="row" >
		<br>
		<c:out value="${row.pid}" ></c:out>
		<c:out value="${row.pname}"></c:out>
		<c:out value="${row.quantity}"></c:out>
		<c:out value="${row.base_price}"></c:out>
		<c:out value="${row.mrp}"></c:out>
		<c:out value="${status}"></c:out>
		<c:out value="${type}"></c:out>
		<br>
	</c:forEach>
	
</body>
</html>