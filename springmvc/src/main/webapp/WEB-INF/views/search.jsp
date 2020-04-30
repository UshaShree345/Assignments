<%@page import="com.capgemini.springmvc.bean.EmployeePrimaryInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html> 
<%EmployeePrimaryInfo info = (EmployeePrimaryInfo)request.getAttribute("bean"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>

	<% if (info!=null){ %>
	<div align="center">
		<table border="1" style="width: 70%">
			<tr style="background: navy; color: white;">
				<th>Employee Id</th>
				<th>Name</th>
				<th>OfficalEmail</th>
				<th>MobileNo</th>
				<th>Designation</th>
				<th>BloodGroup</th>
				<th>Salary</th>
				<th>ManagerID</th>
				<th>DepartmentId</th>

			</tr>

			<tr>
				<td><%=info.getEmpId() %></td>
				<td><%=info.getName() %></td>
				<td><%=info.getOfficalEmail() %></td>
				<td><%=info.getMobileNo() %></td>
				<td><%=info.getDesignation() %></td>
				<td><%=info.getBloodGroup() %></td>
				<td><%=info.getSalary() %></td>
				<td><%=info.getManagerID() %></td>
				<td><%=info.getDepartmentId() %></td>

			</tr>

		</table>


	</div>
<%} %>

</body>
</html>