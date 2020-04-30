<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./added" method="post">
		<table>
			<tr>
				<td>empId</td>
				<legend>Add Employee</legend>
				<td><input type="text" name="empId"></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			 <tr>
					<td>Password</td>
					<td><input type="password" name ="password" > </td>
			</tr>
 			<tr>
					<td>MobileNo</td>
					<td><input type="number" name ="mobileNo" > </td>
			</tr>
 
			<tr>
				<td>Salary</td>
				<td><input type="number" name="salary"></td>
			</tr>

			<tr>
				<td>DepartmentId</td>
				<td><input type="number" name="departmentId"></td>
			</tr>
			<tr>
				<td>OfficalEmail</td>
				<td><input type="text" name="officalEmail"></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><input type="number" name="designation"></td>
			</tr>
			<tr>
				<td>BloodGroup</td>
				<td><input type="text" name="bloodGroup"></td>
			</tr>

			<tr>
				<td>Manager Id</td>
				<td><input type="text" name="managerID"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>




		</table>



	</form>



</body>
</html>