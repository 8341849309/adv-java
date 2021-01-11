<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,java.util.ArrayList,com.nt.bo.Item"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="resources/css/styles.css" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu of Items</title>
</head>
<body>

	<div class="items">
		<h1>Home Restaurant Items Menu</h1>

		<table>
			<tr>
				<th>Item No</th>
				<th>Item Name</th>
				<th>Base Price Price</th>
				<th>Item MRP</th>
				<th>Description</th>
			</tr>

			<c:forEach items="${items}" var="item">
				<tr>
					<td><c:out value="${item.itemNo}" /></td>
					<td><c:out value="${item.itemName}" /></td>
					<td><c:out value="${item.basePrice}" /></td>
					<td><c:out value="${item.MRP}" /></td>
					<td><c:out value="${item.description}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>