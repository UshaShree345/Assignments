<%@page import="com.capgemini.springmvc.bean.EmployeePrimaryInfo" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html> 
<% List<EmployeePrimaryInfo> info1 =(List<EmployeePrimaryInfo>) request.getAttribute("list");%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if (info1!=null){ %>
	<div align="center">
		<table border="1" style="width: 70%">
			<tr style="background: navy; color: white;">
				<th>EmployeeId</th>
				<th>Name</th>
				<th>OfficialMailId</th>
				<th>MobileNO</th>
				<th>Designation</th>
				<th>BloodGroup</th>
				<th>Salary</th>
				<th>DapartmentId</th>
				<th>ManagerId</th>

			</tr>

			<%for(EmployeePrimaryInfo employeeInfoBean:info1){ %>
			<tr>
<td><%= employeeInfoBean.getEmpId() %></td>
<td><%= employeeInfoBean.getName() %></td>
<td><%= employeeInfoBean.getOfficalEmail() %></td>
<td><%= employeeInfoBean.getMobileNo() %></td>
<td><%= employeeInfoBean.getDesignation() %></td>
<td><%= employeeInfoBean.getBloodGroup() %></td>
<td><%= employeeInfoBean.getSalary() %></td>

<td><%= employeeInfoBean.getDepartmentId() %></td>
<td><%= employeeInfoBean.getManagerID() %></td>
</tr>
				
<%} %>

		</table>


	</div>
<%} %>
</body>
</html>