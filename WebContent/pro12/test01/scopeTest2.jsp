<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>default:${major }</h2>
<h2>pageContext(현재페이지):${pageScope.major }</h2>
<h2>request:${requestScope.major }</h2>
<h2>session:${sessionScope.major }</h2>
<h2>application(ServletContext):${applicationScope.major }</h2>
</body>
</html>