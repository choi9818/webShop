<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>직원상세보기</h1>
	<br><br>
	<%@include file="logininfo.jsp" %>
	<br>
	<form action="empdetail" method="post" align="center">
	<table>
		<tr><td>employee_id</td><td><input type="text" name="employee_id" value="${emp.employee_id}"></td></tr>
		<tr><td>last_name</td><td><input type="text" name="last_name" value="${emp.last_name}"></td></tr>
		<tr><td>first_name</td><td><input type="text" name="first_name" value="${emp.first_name}"></td></tr>
		<tr><td>department_id</td><td><input type="text" name="department_id" value="${emp.department_id}"></td></tr>
		<tr><td>job_id</td><td><input type="text" name="job_id" value="${emp.job_id}"></td></tr>
		<tr><td>phone_number</td><td><input type="text" name="phone_number" value="${emp.phone_number}"></td></tr>
		<tr><td>email</td><td><input type="text" name="email" value="${emp.email}"></td></tr>
		<tr><td>manager_id</td><td><input type="text" name="manager_id" value="${emp.manager_id}"></td></tr>
		<tr><td>commission_pct</td><td><input type="text" name="commission_pct" value="${emp.commission_pct}"></td></tr>
		<tr><td>salary</td><td><input type="text" name="salary" value="${emp.salary}"></td></tr>
		<tr><td>hire_date</td><td><input type="text" name="hire_date" value="${emp.hire_date}"></td></tr>
		<tr>
			<td colspan="2"><input type="submit" value="수정하기"></td>
		</tr>
	</table>
	</form>
</body>
</html>