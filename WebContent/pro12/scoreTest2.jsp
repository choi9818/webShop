<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
  request.setCharacterEncoding("utf-8");
  int score=Integer.parseInt(request.getParameter("score"));
%> 

<!DOCTYPE html>
<html>
<head>
<title>점수 출력창</title>
<meta charset="UTF-8">
</head>
<body>
<h1>시험점수  <%=request.getParameter("score") %>점</h1><br>
<h1>시험점수  ${param.score }점</h1><br>
<h1>메시지:${message }</h1>
<br>
<a href="scoreTest.html">시험점수입력</a>
</body>
</html>
