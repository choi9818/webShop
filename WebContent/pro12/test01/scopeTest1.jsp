<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    pageContext.setAttribute("major", "jsp....pageContext");
    request.setAttribute("major", "jsp....request");
    session.setAttribute("major", "jsp....session");
    application.setAttribute("major", "jsp....application");
    %>
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
<%-- request가 전달된다.--%>
<%-- <jsp:forward page="scopeTest2.jps"></jsp:forward> --%>

<%-- 갔다가 다시 온다:include--%>
<jsp:include page="scopeTest2.jsp"></jsp:include>
</body>
</html>