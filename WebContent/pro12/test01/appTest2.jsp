<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String name=(String)session.getAttribute("name");
    String address=(String )application.getAttribute("address");
%>    

<!DOCTYPE html>     
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 스코프 테스트2</title>
</head>
<body>
<h1>이름은 <%=name %>입니다.</h1>
<h1>주소는 <%=address %>입니다.</h1>
<hr>
<p>${age2}</p>
<p>생략시(request->session->application):${name}</p>
<p>request:${requestScope.name}</p>
<p>session:${sessionScope.name}</p>
<p>application:${applicationScope.name}</p>
<p>${address}</p>
</body>
</html>
