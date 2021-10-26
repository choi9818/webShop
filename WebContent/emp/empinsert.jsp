<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원신규등록</title>
</head>
<body>
<h1>직원신규등록</h1>
<br><br>
	<%@include file="logininfo.jsp" %>
	<br>
<form action="empinsert" method="post" align="center">
	<table>
		<tr><td>employee_id</td><td><input type="number" name="employee_id"></td></tr>
		<tr><td>last_name</td><td><input type="text" name="last_name"></td></tr>
		<tr><td>first_name</td><td><input type="text" name="first_name"></td></tr>
		<tr>
		<td>department_id</td>
			<td>
				<select name="department_id">
					<c:forEach items="${deptlist }" var="dept">
						<option value="${dept.department_id }">${dept.department_name }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
		<td>job_id</td>
		<td>
			<select name="job_id">
				<c:forEach items="${joblist }" var="job">
					<option value="${job.job_id}">${job.job_title }</option>
				</c:forEach>
			</select>
		</td>
		</tr>
		
		<tr><td>phone_number</td><td><input type="text" name="phone_number"></td></tr>
		<tr><td>email</td><td><input type="text" name="email"></td></tr>
		<tr>
		<td>manager_id</td>
		<td>
			<select name="manager_id">
				<c:forEach items="${managerlist }" var="manager">
					<option value="${manager.employee_id }">${manager.first_name }</option>
				</c:forEach>
			</select>
		</td>
		</tr>
		<tr><td>commission_pct</td><td><input type="text" name="commission_pct" value="0.2"></td></tr>
		<tr><td>salary</td><td><input type="number" name="salary"></td></tr>
		<tr><td>hire_date</td><td><input type="date" name="hire_date"></td></tr>
		<tr>
			<td colspan="2"><input type="submit" value="입력하기"></td>
		</tr>
	</table>
	</form>
</body>
</html>