<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="securePages.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Admin DashBoard</title>
		<link rel="stylesheet" href="resources/admin.css">
	</head>
	<body>
		<div class="dashboard">
			<h2>Admin</h2>
			<a href="index.html" >LogOut</a>
		</div>
		
		<div class="search">
			<form action="EmployeeController">
				<input type="search" name="empId" placeholder="Employee Id"/>
				<input type="submit" value="Search">
			</form>
		</div>
		
		<div class="content" style="background-color: #f6f7f1">
			
			<h2>All Employees</h2>
				<table>
				
				<c:if test="${emp.empId!=null}">
				
				  <tr>
					    <th>Employee Id</th>
					    <th>Name</th>
					    <th>Phone Number</th>
					    <th>Salary</th>
				  </tr>
				  <tr>
						<td><c:out value="${emp.empId}"></c:out></td>
						<td><c:out value="${emp.empName }"></c:out></td>
						<td><c:out value="${emp.phone}"></c:out></td>
						<td><c:out value="${emp.salary}"></c:out></td>
				 </tr>
				 
				 </c:if>
				 <c:if test="${emp.empId==null}">
				 	<tr>
				 		<th><h1 style="font: bold; color: red;">Employee Not Found</h1></th>
				 	</tr>
				 </c:if>
				 
				 <c:forEach items="${employees}" var="emp">
				 	<tr>
						<td><c:out value="${emp.empId}"></c:out></td>
						<td><c:out value="${emp.empName }"></c:out></td>
						<td><c:out value="${emp.phone}"></c:out></td>
						<td><c:out value="${emp.salary}"></c:out></td>
				    </tr>
				 </c:forEach>
				 
			  </table>
				
			
		</div>
		
	</body>
</html>