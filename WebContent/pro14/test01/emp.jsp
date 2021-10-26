<%@page import="com.kosta.model.EmployeeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>1.${emp }</h1>
<h1>2.${emp.employee_id }</h1>
<h1>3.${emp.first_name }</h1>
<h1>4.비추<%=((EmployeeVO)request.getAttribute("emp")).getFirst_name() %></h1>
</body>
</html>