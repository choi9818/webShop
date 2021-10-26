<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
p{background-color: pink;}
</style>
</head>
<body>
<h1>로그인 결과보기</h1>
<p>아이디:${param.user_id }</p>
<p>주소:${param.user_address }</p>
<p>${major}</p>
<p>${phone}</p>
</body>
</html>