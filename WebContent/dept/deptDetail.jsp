<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${dept.department_name }부서 상세보기</h1>
<form action="deptDetail" method="post">
부서코드:${dept.department_id }<input type="hidden" name="department_id" value="${dept.department_id }"><br>
부서이름:<input type="text" name="department_name" value="${dept.department_name }"><br>
매니저이름:<input type="text" name="manager_id" value="${dept.manager_id }"><br>
지역코드<input type="text" name="location_id" value="${dept.location_id }"><br>
<input type="submit" value="수정하기">
<input type="reset" value="다시">
</form>
</body>
</html>