<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Job_id로 조회한 결과</h1>
<table border="1">
	<tr>
		<td>직원번호</td>
		<td>성</td>
		<td>이름</td>
		<td>부서</td>
		<td>직책</td>
		<td>전화번호</td>
		<td>이메일</td>
		<td>매니저</td>
		<td>커미션</td>
		<td>급여</td>
		<td>입사일</td>
		<td>삭제</td>
	</tr>
	<%
		//EL문법==>${emplist}
		//ScriptLet문법==>(List<EmployeeVO>)request.getAttrubute("emplist") 
	%>
	<c:forEach items="${emplist }" var="emp">
	<tr>
		
		<td>${emp.last_name}</td>
		<td>${emp.first_name}</td>
		<td>${emp.department_id}</td>
		<td>${emp.job_id}</td>
		<td>${emp.phone_number}</td>
		<td>${emp.email}</td>
		<td>${emp.manager_id}</td>
		<td>${emp.commission_pct}</td>
		<td>${emp.salary}</td>
		<td>${emp.hire_date}</td>	
		
	</tr>	
	</c:forEach>
</table>
</body>
</html>