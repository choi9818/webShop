<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  request.setAttribute("age2",100);

  request.setAttribute("name","이순신request");
  session.setAttribute("name","이순신session");
  application.setAttribute("name","이순신application");
  
  application.setAttribute("address","서울시 성동구");
%>    

<!DOCTYPE html>     
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 스코프 테스트1</title>
</head>
<body>
<h1>이름과 주소를 저장합니다.</h1>
<a href=appTest2.jsp>두번째 웹페이지로 이동</a>
</body>
</html>
